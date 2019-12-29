-- ignorar erros de failure patter
{-# LANGUAGE NoMonadFailDesugaring #-}

module Gerador_Logs where

import Test.QuickCheck
import Data.Char (isDigit)
import Data.List (nub)

type Nome          = String
type NIF           = String
type Email         = String
type Morada        = String
type Marca         = String
type Matricula     = String
type Velocidade    = Int
type Autonomia     = Int
type Classificacao = Int
type PrecoKm       = Float
type ConsumoKm     = Float
type Coordenadas   = [Float]

data Tipo        = Electrico
                 | Hibrido
                 | Gasolina
                 deriving Show

data Preferencia = MaisBarato
                 | MaisPerto
                 deriving Show
                 
{--------- Proprietário ---------}

data Proprietario = NovoProp Nome NIF Email Morada

instance Show Proprietario where
    show = showProp

showProp :: Proprietario -> String
showProp (NovoProp nome nif email morada) = "NovoProp:" ++ nome ++ "," ++ nif ++ "," ++ email ++ "," ++ morada

genNomeHomem :: Gen Nome
genNomeHomem = frequency[(1679, return "João"),
                         (1603, return "Francisco"),
                         (1579, return "Santiago"),
                         (1390, return "Afonso"),
                         (1340, return "Duarte"),
                         (1315, return "Tomás"),
                         (1258, return "Martim"),
                         (1257, return "Rodrigo"),
                         (1246, return "Lourenço"),
                         (1218, return "Gabriel"),
                         (1204, return "Miguel"),
                         (980 , return "Lucas"),
                         (958 , return "Pedro"),
                         (940 , return "Vicente"),
                         (936 , return "Guilherme"),
                         (908 , return "Dinis"),
                         (904 , return "Salvador"),
                         (897 , return "Gonçalo"),
                         (825 , return "Rafael"),
                         (770 , return "Gustavo")]
    
genNomeMulher :: Gen Nome
genNomeMulher = frequency[(5608, return "Maria"),
                          (1609, return "Leonor"),
                          (1568, return "Matilde"),
                          (1169, return "Carolina"),
                          (1163, return "Beatriz"),
                          (928 , return "Sofia"),
                          (915 , return "Alice"),
                          (898 , return "Mariana"),
                          (850 , return "Ana"),
                          (827 , return "Benedita"),
                          (824 , return "Francisca"),
                          (802 , return "Margarida"),
                          (798 , return "Inês"),
                          (788 , return "Clara"),
                          (734 , return "Lara"),
                          (709 , return "Laura"),
                          (620 , return "Madalena"),
                          (602 , return "Diana"),
                          (483 , return "Joana"),
                          (471 , return "Eva")]

genNome :: Gen Nome
genNome = oneof [genNomeHomem, genNomeMulher]

genNIF :: Gen NIF
genNIF = do number <- elements ['1', '2', '5', '7']
            rest   <- vectorOf 8 $ elements ['0'..'9']
            return (number : rest)

-- Nota: Domínios de emails mais utilizados.
genEmail :: String -> Gen Email
genEmail nif = do suffix <- frequency[(30, return "@gmail.com"),
                                      (18, return "@yahoo.com"),
                                      (22, return "@outlook.com"), 
                                      (19, return "@hotmail.com"),
                                      (11, return "@live.com")]
                  return (nif ++ suffix)

-- Nota: Lista de 115 localidades portuguesas com maior população (em 2018).
genMorada :: Gen Morada
genMorada = frequency[(507220, return "Lisboa"),
                      (388434, return "Sintra"),
                      (299938, return "Vila Nova de Gaia"),
                      (215284, return "Porto"),
                      (212474, return "Cascais"),
                      (211359, return "Loures"),
                      (181919, return "Braga"),
                      (181724, return "Amadora"),
                      (176218, return "Oeiras"),
                      (174382, return "Matosinhos"),
                      (168987, return "Almada"),
                      (166835, return "Seixal"),
                      (165631, return "Gondomar"),
                      (159602, return "Odivelas"),
                      (152792, return "Guimarães"),
                      (141603, return "Vila Franca de Xira"),
                      (138525, return "Santa Maria da Feira"),
                      (137727, return "Maia"),
                      (133724, return "Coimbra"),
                      (131738, return "Vila Nova de Famalicão"),
                      (124857, return "Leiria"),
                      (116531, return "Barcelos"),
                      (115758, return "Setúbal"),
                      (104129, return "Funchal"),
                      (96991 , return "Viseu"),
                      (96570 , return "Valongo"),
                      (86072 , return "Paredes"),
                      (84636 , return "Viana de Castelo"),
                      (84008 , return "Mafra"),
                      (79579 , return "Vila do Conde"),
                      (78220 , return "Torres Vedras"),
                      (77916 , return "Aveiro"),
                      (75419 , return "Barreiro"),
                      (69922 , return "Penafiel"),
                      (68873 , return "Loulé"),
                      (68221 , return "Santo Tirso"),
                      (67864 , return "Ponta Delgada"),
                      (66113 , return "Oliveira de Azeméis"),
                      (64526 , return "Moita"),
                      (64214 , return "Palmela"),
                      (62510 , return "Póvoa de Varzim"),
                      (60974 , return "Faro"),
                      (58866 , return "Figueira da Foz"),
                      (57398 , return "Santarém"),
                      (56887 , return "Montijo"),
                      (56709 , return "Paços de Ferreira"),
                      (56576 , return "Felgueiras"),
                      (55416 , return "Portimão"),
                      (54120 , return "Ovar"), 
                      (53641 , return "Alcobaça"),
                      (53366 , return "Amarante"),
                      (52454 , return "Évora"),
                      (52192 , return "Castelo Branco"),
                      (51684 , return "Pombal"),
                      (51661 , return "Marco de Canaveses"),
                      (51559 , return "Sesimbra"),
                      (51540 , return "Caldas da Rainha"),
                      (49868 , return "Vila Real"),
                      (48271 , return "Fafe"),
                      (47127 , return "Covilhã"),
                      (46865 , return "Vila Verde"),
                      (46790 , return "Lousada"),
                      (45992 , return "Águeda"),
                      (44744 , return "Santa Cruz"),
                      (44607 , return "Olhão"),
                      (44068 , return "Ourém"),
                      (43596 , return "Alenquer"),
                      (41499 , return "Ponte de Lima"),
                      (41123 , return "Albufeira"),
                      (39345 , return "Chaves"),
                      (39103 , return "Guarda"),
                      (38405 , return "Ílhavo"),
                      (38404 , return "Marinha Grande"),
                      (38317 , return "Trofa"),
                      (36902 , return "Tomar"),
                      (36174 , return "Silves"),
                      (35377 , return "Abrantes"),
                      (35068 , return "Cantanhede"),
                      (34970 , return "Torres Novas"),
                      (34057 , return "Esposende"),
                      (33903 , return "Angra do Heroísmo"),
                      (33732 , return "Câmara de Lobos"),
                      (33586 , return "Bragança"),
                      (33550 , return "Beja"),
                      (32698 , return "Ribeira Grande"),
                      (30442 , return "Lagos"),
                      (30214 , return "Benavente"),
                      (29484 , return "Espinho"),
                      (28725 , return "Santiago de Cacém"),
                      (27298 , return "Anadia"),
                      (26719 , return "Fundão"),
                      (26548 , return "Tondela"),
                      (26487 , return "Peniche"),
                      (25965 , return "Estarreja"),
                      (25670 , return "Lourinhã"),
                      (25230 , return "Montemor-o-Velho"),
                      (24959 , return "Lamego"),
                      (24750 , return "Tavira"),
                      (24621 , return "Odemira"),
                      (24128 , return "Albergaria-a-Velha"),
                      (23840 , return "Vizela"),
                      (22748 , return "Lagoa"),
                      (22359 , return "Portalegre"),
                      (21808 , return "Mirandela"),
                      (21446 , return "Póvoa de Lanhoso"),
                      (21214 , return "Entroncamento"),
                      (20970 , return "Arcos de Valdevez"),
                      (20861 , return "Arouca"),
                      (18114 , return "Amares"),
                      (15873 , return "Caminha"),
                      (15699 , return "Cabeceiras de Basto"),
                      (15567 , return "Castelo de Paiva"),
                      (14180 , return "Nazaré"),
                      (13631 , return "Sines"),
                      (13283 , return "Valença"),
                      (11898 , return "Vieira do Minho")]

genProprietario :: [NIF] -> Int -> Gen [Proprietario]
genProprietario _    0    = return []
genProprietario nifs size = do nome   <- genNome
                               let nif = head nifs
                               email  <- genEmail nif
                               morada <- genMorada
                               proprietarios <- genProprietario (tail nifs) (size - 1)
                               return $ (NovoProp nome nif email morada) : proprietarios

{------------ Cliente -----------}

data Cliente = NovoCliente Nome NIF Email Morada Coordenadas

instance Show Cliente where
    show = showCliente

showCliente :: Cliente -> String
showCliente (NovoCliente nome nif email morada coordenadas) = "NovoCliente:" ++ nome ++ "," ++ nif ++ "," ++ email ++ "," ++ morada ++ "," ++ show(coordenadas !! 0) ++ "," ++ show(coordenadas !! 1)

-- Lista de apelidos portugueses mais frequentes.
genApelido :: Gen Nome
genApelido = frequency[(999, return "Silva"),
                       (628, return "Santos"),
                       (553, return "Ferreira"),
                       (514, return "Pereira"),
                       (391, return "Oliveira"),
                       (387, return "Costa"),
                       (376, return "Rodrigues"),
                       (340, return "Martins"),
                       (315, return "Jesus"),
                       (311, return "Sousa"),
                       (297, return "Fernandes"),
                       (291, return "Gonçalves"),
                       (271, return "Gomes"),
                       (265, return "Lopes"),
                       (265, return "Marques"),
                       (250, return "Alves"),
                       (239, return "Almeida"),
                       (239, return "Ribeiro"),
                       (220, return "Pinto"),
                       (208, return "Carvalho"),
                       (178, return "Teixeira"),
                       (162, return "Moreira"),
                       (161, return "Correia"),
                       (146, return "Mendes"),
                       (139, return "Nunes"),
                       (135, return "Soares"),
                       (127, return "Vieira"),
                       (117, return "Monteiro"),
                       (113, return "Cardoso"),
                       (110, return "Rocha"),
                       (106, return "Raposo"),
                       (103, return "Neves"),
                       (102, return "Coelho"),
                       (99 , return "Cruz"),
                       (98 , return "Cunha"),
                       (97 , return "Pires"),
                       (91 , return "Ramos"),
                       (90 , return "Reis"),
                       (90 , return "Simões"),
                       (86 , return "Antunes"),
                       (86 , return "Matos"),
                       (86 , return "Fonseca"),
                       (80 , return "Machado"),
                       (73 , return "Araújo"),
                       (72 , return "Barbosa"),
                       (71 , return "Tavares"),
                       (68 , return "Lourenço"),
                       (66 , return "Castro"),
                       (65 , return "Figueiredo"),
                       (64 , return "Azevedo"),
                       (63 , return "Freitas"),
                       (61 , return "Magalhães"),
                       (59 , return "Henriques"),
                       (57 , return "Lima"),
                       (54 , return "Guerreiro"),
                       (53 , return "Batista"),
                       (51 , return "Pinheiro"),
                       (50 , return "Faria"),
                       (50 , return "Miranda"),
                       (49 , return "Barros"),
                       (49 , return "Morais"),
                       (49 , return "Nogueira"),
                       (47 , return "Esteves"),
                       (45 , return "Anjos"),
                       (45 , return "Baptista"),
                       (45 , return "Campos"),
                       (45 , return "Mota"),
                       (43 , return "Andrade"),
                       (42 , return "Brito"),
                       (42 , return "Sá"),
                       (41 , return "Nascimento"),
                       (40 , return "Leite"),
                       (38 , return "Abreu"),
                       (38 , return "Borges"),
                       (36 , return "Melo"),
                       (36 , return "Vaz"),
                       (35 , return "Pinho"),
                       (35 , return "Vicente"),
                       (34 , return "Gaspar"),
                       (34 , return "Assunção"),
                       (34 , return "Maia"),
                       (34 , return "Moura"),
                       (34 , return "Valente"),
                       (33 , return "Domingues"),
                       (33 , return "Garcia"),
                       (33 , return "Carneiro"),
                       (32 , return "Loureiro"),
                       (32 , return "Neto"),
                       (31 , return "Amaral"),
                       (31 , return "Branco"),
                       (28 , return "Leal"),
                       (27 , return "Pacheco"),
                       (26 , return "Macedo"),
                       (26 , return "Paiva"),
                       (26 , return "Matias"),
                       (25 , return "Amorim"),
                       (25 , return "Torres")]

genCoordenadas :: Gen Coordenadas
genCoordenadas = vectorOf 2 $ choose(-100, 100)

-- auxiliares para os apelidos
allDifferent :: Eq a => [a] -> Bool
allDifferent = uncurry (==) . split id nub

split :: (a -> b) -> (a -> c) -> a -> (b, c)
split f g x = (f x, g x)

genCliente :: [NIF] -> Int -> Gen [Cliente]
genCliente _    0    = return []
genCliente nifs size = do pNome                          <- genNome
                          apelidos                       <- suchThat (vectorOf 3 $ genApelido) allDifferent
                          [apelido1, apelido2, apelido3] <- shuffle apelidos
                          let nome                        = pNome ++ " " ++ apelido1 ++ " " ++ apelido2 ++ " " ++ apelido3
                          let nif                         = head nifs
                          email                          <- genEmail nif
                          morada                         <- genMorada
                          coordenadas                    <- genCoordenadas
                          clientes <- genCliente (tail nifs) (size - 1)
                          return $ (NovoCliente nome nif email morada coordenadas) : clientes

{------------ Carro -------------}

data Carro = NovoCarro Tipo Marca Matricula NIF Velocidade PrecoKm ConsumoKm Autonomia Coordenadas 

instance Show Carro where
    show = showCarro

showCarro :: Carro -> String
showCarro (NovoCarro t m mt nf vm pkm cpkm at cd ) = "NovoCarro:" ++ (show t) ++ "," ++ m ++ "," ++ mt ++ "," ++ nf ++ "," ++ (show vm) ++ "," ++ (show pkm) ++ "," ++ (show cpkm) ++ "," ++ show at ++ "," ++ show(cd !! 0) ++ "," ++ show(cd !! 1)

-- frequencia de carros eletricos ---> https://eco.sapo.pt/2019/01/23/numero-de-carros-eletricos-em-portugal-duplica-num-ano/
-- frequencia de carros combustao ---> https://www.dn.pt/dinheiro/ha-mais-carros-em-portugal-mas-estao-cada-vez-mais-velhos-8716402.html
-- frequencia de carros hibridos  ---> https://automais.autosport.pt/noticias/2017-2018-vendas-de-carros-eletricos-e-hibridos-com-aumento-significativo-em-portugal/
genTipo :: Gen Tipo
genTipo = frequency [(553266, return Gasolina),
                     (7771  , return Electrico),
                     (11006 , return Hibrido)]

-- https://www.autoo.com.br/emplacamentos/marcas-mais-vendidas/2019/                     
genMarca :: Gen Marca
genMarca = frequency [(389991, return "Chevrolet"),
                      (336110, return "Volkswagen"),
                      (299673, return "Fiat"),
                      (194026, return "Renault"),
                      (180087, return "Ford"),
                      (176008, return "Toyota"),
                      (172343, return "Hyundai"),
                      (106975, return "Honda"),
                      (106436, return "Jeep"),
                      (78076 , return "Nissan"),
                      (22293 , return "Citroen"),
                      (18203 , return "Mitsubishi"),
                      (18090 , return "Peugeot"),
                      (10430 , return "BMW"),
                      (10278 , return "Mercedes-Benz"),
                      (7932  , return "Kia"),
                      (6916  , return "Audi"),
                      (6177  , return "Volvo"),
                      (4807  , return "Land Rover"),
                      (2999  , return "Suzuki"),
                      (1539  , return "Jaguar"),
                      (1441  , return "Porsche"),
                      (1318  , return "Mini"),
                      (947   , return "Lexus"),
                      (531   , return "Subaru"),
                      (370   , return "Dodge"),
                      (26    , return "Lamborghini"),
                      (23    , return "Ferrari"),
                      (21    , return "Maserati"),
                      (3     , return "Bentley"),
                      (2     , return "Rolls-Royce"),
                      (1     , return "McLaren")]

genMatricula:: Gen Matricula
genMatricula = do [l1, l2]         <- vectorOf 2 $ elements ['A'..'Z']
                  [n1, n2, n3, n4] <- vectorOf 4 $ elements ['0'..'9']
                  return [l1, l2, '-', n1, n2, '-', n3, n4]

-- Velocidade Média
genVelocidade :: Gen Velocidade
genVelocidade = choose (20, 200)

-- https://www.economias.pt/ajudas-de-custo/
genPrecoKm :: Gen PrecoKm
genPrecoKm = choose (0.11, 0.36)

genConsumoKm :: Gen ConsumoKm
genConsumoKm = choose (1, 3)

-- https://evline.pt/2019/10/29/10-carros-com-maior-autonomia-em-2019/
genAutonomia :: Gen Autonomia
genAutonomia =  elements [260..600]

genCarro :: Gen Carro
genCarro  = do tipo      <- genTipo
               marca     <- genMarca
               matricula <- genMatricula
               nif       <- genNIF
               vm        <- genVelocidade
               pkm       <- genPrecoKm
               cpkm      <- genConsumoKm
               autonomia <- genAutonomia
               cd        <- genCoordenadas
               return (NovoCarro tipo marca matricula nif vm pkm cpkm autonomia cd)

{------------ Aluguer -----------}

data Aluguer = Aluguer NIF Coordenadas Tipo Preferencia

instance Show Aluguer where
    show = showAluguer

showAluguer :: Aluguer -> String
showAluguer (Aluguer nif coordenadas tipo preferencia) = "Aluguer:" ++ nif ++ "," ++ (show (coordenadas !! 0)) ++ "," ++ (show (coordenadas !! 1)) ++ "," ++ (show tipo) ++ "," ++ (show preferencia)

genPreferencia :: Gen Preferencia
genPreferencia = elements [MaisBarato, MaisPerto]

genAluguer :: Gen Aluguer
genAluguer = do nif         <- genNIF
                coordenadas <- genCoordenadas
                tipo        <- genTipo
                preferencia <- genPreferencia
                return (Aluguer nif coordenadas tipo preferencia)

{---------- Classificar ---------}

data Classificar = Classificar String Classificacao

instance Show Classificar where
    show = showClassificar

showClassificar :: Classificar -> String
showClassificar (Classificar info classificacao) = "Classificar:" ++ info ++ "," ++ (show classificacao)

genClassificacao :: Gen Classificacao
genClassificacao = choose (0, 100)

genClassificar :: Gen Classificar
genClassificar = do info          <- oneof [genMatricula, genNIF]
                    classificacao <- genClassificacao
                    return (Classificar info classificacao)

{---------- Gerador de Logs ----------}

genNIFs :: Int -> Gen [NIF]
genNIFs i = do nifs <- suchThat (vectorOf i $ genNIF) allDifferent
               return nifs

genMatriculas :: Int -> Gen [Matricula]
genMatriculas i = do matriculas <- suchThat (vectorOf i $ genMatricula) allDifferent
                     return matriculas

fileName :: FilePath
fileName = "logs.bak"

genLogsIO :: IO ()
genLogsIO = do putStr "\nBem-vindo ao gerador de logs.\n> Indique o número de logs que pretende gerar: "
               str <- getLine
               
               putStrLn "\nOutput:"
               if (null str)
                   then putStrLn "> Erro: Não foi introduzido nenhum número.\n        Por favor indique um número positivo que seja múltiplo de 5.\n"
               else
                   if (not (all isDigit str))
                       then putStrLn "> Erro: Não foi introduzido um número válido.\n        Por favor indique um número positivo que seja múltiplo de 5.\n"
                   else
                       do let nLogs = (read str :: Int)
                          if (nLogs > 0 && mod nLogs 5 == 0)
                              then do let i = (div nLogs 5)
                                      
                                      {- Lista de nifs sem repetições -}
                                      nifs <- generate $ genNIFs (i * 2)
                                      let nifsProprietario = take i nifs
                                      let nifsClientes = drop i nifs

                                      {- Lista de matriculas sem repetições -}
                                      matriculas <- generate $ genMatriculas i

                                      writeFile fileName "Ficheiro de logs:\n\n"
                                    
                                      genLogs1 genProprietario nifsProprietario i
                                      genLogs1 genCliente nifsClientes i
                                      genLogs2 genCarro i
                                      genLogs2 genAluguer i
                                      genLogs2 genClassificar i

                                      putStrLn ("> Ficheiro de logs gravado com sucesso.\n> " ++ "\"" ++ fileName ++ "\"" ++ ": " ++ (show nLogs) ++ " logs adicionados.\n")
                          else
                              putStrLn "> Erro: Não foi introduzido um número válido.\n        Por favor indique um número positivo que seja múltiplo de 5.\n"

genLogs1 :: (Foldable t, Show a) => ([NIF] -> Int -> Gen (t a)) -> [NIF] -> Int -> IO ()
genLogs1 _   _    0    = return ()
genLogs1 gen nifs size = do list <- generate $ gen nifs size
                            mapM_ (\x -> appendFile fileName (show x ++ "\n")) list


genLogs2 :: (Show a) => Gen a -> Int -> IO ()
genLogs2 _   0 = return ()
genLogs2 gen n = do s <- generate gen
                    appendFile fileName (show s ++ "\n")
                    genLogs2 gen (n-1)