
{---------- Gerador de Logs ----------}

-- Falta parametrizar o gerador de logs !!!
-- Exemplo: genLogs 100 ---> Produz 20 logs de cada tipo, por exemplo.
-- Observação: Se calhar obrigar a que o input seja múltiplo de 5.


{-                   
genLogs :: (Show a) => Gen a -> IO ()
genLogs nLogs = do logs_Proprietario <- vectorOf n $ genProprietario
                   logs_Cliente      <- vectorOf n $ genCliente
                   logs_Carro        <- vectorOf n $ genCarro
                   logs_Aluguer      <- vectorOf n $ genAluguer
                   logs_Classificar  <- vectorOf n $ genClassificar
                   ...
                
                where n = div nLogs 5
-}
module Gerador_Logs where

import Test.QuickCheck
type Coordenadas = [Float]

genCoordenadas :: Gen Coordenadas
genCoordenadas = vectorOf 2 $ choose(-100, 100)

logcoor :: Int -> IO ()
logcoor n   = if (n>0) then do
                          s <-generate genCoordenadas
                          putStrLn $ show s
                          logcoor (n-1)   
                      else
                           putStrLn "> 12222.\n"


genLogsIO :: IO () 
genLogsIO = do putStr "\nBem-vindo ao gerador de logs.\n> Indique o número de logs que pretende gerar: "
               str <- getLine
               let nLogs = (read str :: Int)

               putStrLn "\nOutput:"
               if (mod nLogs 5 == 0)
                   then 
                    do
                        logcoor nLogs 
                        putStrLn "> Ficheiro de logs gravado com sucesso.\n"
               else
                   putStrLn "> Erro: Por favor indique um número que seja múltiplo de 5.\n"
{-
    Função a ser utilizada: writeFile "log.bak" str
        --> onde "str" corresponde ao conjunto de todos os logs produzidos.
-}