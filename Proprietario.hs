import Test.QuickCheck
import Data.Time.Calendar

data Proprietario = NovoProp Nome Nif Email Morada 
instance Show Proprietario where
	show = showProp

showProp :: Proprietario -> [Char]
showProp (NovoProp nm ni em mr) = ("NovoProp:" ++ nm ++","++ ni++","++em++","++mr)


data Cliente = NovoCliente Nome Mnome Sobrenome Nif Email Morada Coordenadas
instance Show Cliente where
	show = showCli

showCli :: Cliente -> [Char]
showCli (NovoCliente nm  mm sn ni em mr cd) = ("NovoCliente:" ++ nm ++" " ++ ( mm !! 0) ++" " ++( mm !! 1)++ " "++sn++","++ni++","++em++","++mr ++","++ show( cd !! 0) ++"," ++show( cd !! 1)) 


data Classificar = Classificar Id Classificacao
instance Show Classificar where
	show = showCla

showCla :: Classificar -> [Char]
showCla (Classificar id cl) = ("Classificar:" ++ id ++ "," ++show cl)


--NovoCarro:Electrico,Triumph,QR-50-15,293855884,107,1.654906,0.52433467,259,-18.114914,49.664246


data Carro = NovoCarro Tipo Marca Matricula Nif Velomedia PKm CPKM Autonomia Coordenadas
instance Show Carro where
	show = showCar

showCar :: Carro -> [Char]
showCar (NovoCarro t m mt nf vm pkm cpkm at cd ) = ("NovoCarro:" ++ show t ++ "," ++ m ++  "," ++ mt ++"," ++ nf ++ "," ++ show vm ++ "," ++ show pkm ++","++show cpkm++","++show at++","++ show( cd !! 0) ++"," ++show( cd !! 1)) 



data Tipo = Combustão
	| Eletrico
	| Hibrido
	deriving Show

type Velomedia = Float
type Marca = String
type PKm = Float
type CPKM = Float
type Autonomia = Int
type Id = String
type Matricula = String
type Email = String
type Nome = String
type Mnome = [String]
type Sobrenome = String
type Nif = String
type Password = String
type Morada = String
type Coordenadas = [Float]
type Classificacao = Integer
type Alugers = Integer


--Proprietario -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
genEmail :: String -> Gen Email
genEmail nm = do
				[w,e,r,t] <- vectorOf 4 $ elements (['0'..'9']++['A'..'Z'])
				suf <- elements["gmail.com","hotmail.com","outlook.com"] 
				return (nm ++ [w] ++[e] ++[r] ++[t] ++ "@" ++ suf)

genNome :: Gen Nome
genNome = frequency[(4434, return "Rui"),(6192, return "Nuno"),(5216, return "Joao"),(4075, return "Antonio"),(4084, return "Carlos"),(6869, return "Jose"),(5683,return "Pedro"),(4299, return "Luis"),(11248, return "Maria"),(10,return "Joana"),(6456, return "Sandra"),(8586, return "Ana"),(5476, return "Carla"),(4811, return "Sonia"),(3830, return "Susana"),(2624, return "Paula")]
--https://www.jn.pt/nacional/galerias/os-nomes-mais-usados-em-portugal-ao-longo-dos-anos-9029408.html


genMnome :: Gen Mnome
genMnome = vectorOf 2 $ elements ["Amorim","Vilela", "Oliveira" ,"Araújo" ,"Martins","Graça" ,"Vila","Queiros","Aniceto","Sousa","Barbosa","Fontes ","Delgado","Borba","Teixeira","Ramos"]

genSobrenome :: Gen Sobrenome
genSobrenome = frequency[(944, return "Silva"),(596, return "Santos"),(525, return "Ferreira"),(488, return "Pereira"),(371,return "Oliveira"),(368, return "Costa"),(357, return "Rodrigues"),(323,return "Martins"),(299, return "Jesus"),(295, return "Sousa"),(282, return "Fernandes"),(276, return "Gonçalves"),(257, return "Gomes"),(252, return "Lopes"),(251, return "Marques"),(237, return "Alves"),(227, return "Almeida")]
--https://pt.wikipedia.org/wiki/Lista_dos_cem_apelidos_mais_frequentes_em_Portugal


genNif :: Gen Nif
genNif = vectorOf 9 $ elements ['0'..'9']



genMorada :: Gen Morada
genMorada = elements ["Vendas Novas","Crato","Almodôvar","Coimbra","Viana do Castelo","Santa Marta de Penaguião","Batalha","Mértola","Pombal","Viseu","Elvas","Avis","Monchique","Anadia","Tomar","Benavente","Murtosa","Faro","Barcelos","Tomar","Penalva do Castelo","Vouzela","Oliveira de Frades","Ansião","Sernancelhe","Penamacor","Oliveira do Hospital","Vila de Rei","Ribeira de Pena", "Sobral de Monte Agraço","Pacos de Ferreira","Portel","Cadaval","Grandola","Alcotim","Sines","Miranda do Douro", "Cuba","Cascais","Fundão","Castelo de Vide","Borba","Chamusca","Matosinhos","Sabrosa"]


genCoordenadas :: Gen Coordenadas
genCoordenadas = vectorOf 2 $ choose(-100,100) 

genTipo:: Gen Tipo
genTipo = frequency [(553266,return Combustão),(7771,return Eletrico),(11006,return Hibrido)]
-- frequencia de carros eletricos ---> https://eco.sapo.pt/2019/01/23/numero-de-carros-eletricos-em-portugal-duplica-num-ano/
-- frequencia de carros combustao ---> https://www.dn.pt/dinheiro/ha-mais-carros-em-portugal-mas-estao-cada-vez-mais-velhos-8716402.html
-- frequencia de carros hibridos ---> https://automais.autosport.pt/noticias/2017-2018-vendas-de-carros-eletricos-e-hibridos-com-aumento-significativo-em-portugal/

genPKm:: Gen PKm
genPKm = choose (0.11,0.36) --https://www.economias.pt/ajudas-de-custo/

genAutonomia:: Gen Autonomia
genAutonomia =  elements [260..600] --https://evline.pt/2019/10/29/10-carros-com-maior-autonomia-em-2019/

genMarca:: Gen Marca
genMarca = frequency [(10,return "Renault"), (20,return "Ford"),(40,return "BMW"),(30,return "Volkswagen")]

genVelomedia :: Gen Velomedia
genVelomedia = choose  (100 ,180)

genCPKM :: Gen CPKM
genCPKM = choose (0.0444,0.0503) --https://www.razaoautomovel.com/2019/04/guia-de-compra-campeoes-dos-consumos

genMatricula:: Gen Matricula
genMatricula = do
	[a1,a2] <-vectorOf 2 $ elements ['A'..'Z']
	[n1,n2,n3,n4] <-vectorOf 4 $  elements ['0'..'9']
	return [a1,a2,'-', n1,n2,'-',n3,n4]




genClassificacao :: Gen Classificacao
genClassificacao = choose (0,100)

genProprietario :: Gen Proprietario 
genProprietario = do 
	nm <- genNome
	em <- genEmail nm
	ni <- genNif
	mr <- genMorada
 	return (NovoProp nm ni em mr)

genCliente :: Gen Cliente 
genCliente = do 
	nm <- genNome
	mm <- genMnome
	sn <- genSobrenome
	em <- genEmail nm
	ni <- genNif
	mr <- genMorada
	cd <- genCoordenadas
 	return (NovoCliente nm mm sn ni em mr cd )


genClassificar :: Gen Classificar
genClassificar = do
		id <- oneof [genMatricula,genNif]
		cl <- genClassificacao
		return (Classificar id cl)

genCarro :: Gen Carro
genCarro  = do
	nif <- genNif
	tipo <- genTipo
	cpkm <- genCPKM
	autonomia <- genAutonomia
	marca <- genMarca
	matricula <- genMatricula
	vm <- genVelomedia
	pkm <- genPKm
	cd <- genCoordenadas
	return (NovoCarro tipo marca matricula nif vm pkm cpkm autonomia cd)

