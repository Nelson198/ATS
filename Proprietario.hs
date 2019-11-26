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


--NovoProp:Laurindo,558192493,611843917@gmail.com,Miranda do Douro


--Proprietario -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
genEmail :: String -> Gen Email
genEmail nm = do
				[w,e,r,t] <- vectorOf 4 $ elements (['0'..'9']++['A'..'Z'])
				suf <- elements["gmail.com","hotmail.com","outlook.com"] 
				return (nm ++ [w] ++[e] ++[r] ++[t] ++ "@" ++ suf)

genNome :: Gen Nome
genNome = frequency[(15, return "Joao"),(10, return "Antonio"),(10, return "Miguel"),(5, return "Jose"),(5,return "Pedro"),(15, return "Luis"),(10, return "Maria"),(10,return "Joana"),(10, return "Ana"),(10, return "Francisca")]

genMnome :: Gen Mnome
genMnome = vectorOf 2 $ frequency[(15, return "Joao"),(10, return "Antonio"),(10, return "Miguel"),(5, return "Jose"),(5,return "Pedro"),(15, return "Luis"),(10, return "Maria"),(10,return "Joana"),(10, return "Ana"),(10, return "Francisca")]

genSobrenome :: Gen Sobrenome
genSobrenome = frequency[(15, return "Joao"),(10, return "Antonio"),(10, return "Miguel"),(5, return "Jose"),(5,return "Pedro"),(15, return "Luis"),(10, return "Maria"),(10,return "Joana"),(10, return "Ana"),(10, return "Francisca")]

genNif :: Gen Nif
genNif = vectorOf 9 $ elements ['0'..'9']



genMorada :: Gen Morada
genMorada = elements ["Vendas Novas","Crato","Almodôvar","Coimbra","Viana do Castelo","Santa Marta de Penaguião","Batalha","Mértola","Pombal","Viseu","Elvas","Avis","Monchique","Anadia","Tomar","Benavente","Murtosa","Faro","Barcelos","Tomar","Penalva do Castelo","Vouzela","Oliveira de Frades","Ansião","Sernancelhe","Penamacor","Oliveira do Hospital","Vila de Rei","Ribeira de Pena", "Sobral de Monte Agraço","Pacos de Ferreira","Portel","Cadaval","Grandola","Alcotim","Sines","Miranda do Douro", "Cuba","Cascais","Fundão","Castelo de Vide","Borba","Chamusca","Matosinhos","Sabrosa"]


genCoordenadas :: Gen Coordenadas
genCoordenadas = vectorOf 2 $ choose(-100,100) 




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