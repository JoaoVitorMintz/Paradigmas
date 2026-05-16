-- Exercício 1

ehPar :: Int -> Bool
ehPar n
  | mod n 2 == 0 = True
  | otherwise = False

main = print ( ehPar 7 )

-- Exercício 2

ehPar :: Int -> Bool
ehPar n
  | mod n 2 == 0 = True
  | otherwise = False

ehImpar :: Int -> Bool
ehImpar n = not (ehPar n)

main = print (ehImpar 8)

--- Exercício 3

diferenca :: Int -> Int
diferenca n =
  if n > 21 then abs (n - 21) * 2
  else abs(n - 21)


main = print (diferenca 20)

-- Exercício 4

maior :: Int -> Int -> Int -> Int
maior x y z =
  if x >= y && x >= z then x
  else if z >= x && z >= y then z
  else y


main = print ( maior 10 5 10 )

-- Exercício 5

duracao :: Int -> Int -> Int -> Int -> Int
duracao hIn mIn hFi mFi = 
  if (hFi * 60 + mFi) - (hIn * 60 + mIn) > (24*60) || (hFi * 60 + mFi) - (hIn * 60 + mIn) < 1 then 0
  else (hFi * 60 + mFi) - (hIn * 60 + mIn)

escrita :: Int -> Int -> Int -> Int -> String
escrita hIn mIn hFi mFi = "O JOGO DUROU " ++ show (div (duracao hIn mIn hFi mFi) 60) ++ " HORA(S) E " ++ show (div (duracao hIn mIn hFi mFi) 60) ++ " MINUTO(S)"

main = print( escrita 8 20 9 50 )

-- Exercício 6

triangulo :: Int -> Int -> Int -> String
triangulo a b c =
  if a == b && a == c then "Equilatero"
  else if a == b || a == c || b == c then "Isoceles"
  else "Escaleno"

main = print( triangulo 3 4 3 )

-- Exercício 7

tripPitagoras :: Int -> Int -> Int -> String
tripPitagoras a b c =
  if (a^2) + (b^2) == (c^2) || (c^2) + (b^2) == (a^2) || (a^2) + (c^2) == (b^2) then show (a) ++ " " ++ show (b) ++ " " ++ show (c) ++ " " ++ "eh uma tripla de Pitagoras!"
  else show (a) ++ " " ++ show (b) ++ " " ++ show (c) ++ " " ++ "nao eh uma tripla de Pitagoras..."

main = print( tripPitagoras 2 4 3 )

-- Exercício 8 (TODO: VERIFICAR NOVAMENTE E TENTAR REFAZER)

selos :: Int -> (Int, Int)
selos x = 
  if x < 8 then (0,0)
  else busca (div x 5)
  where
    busca n5 =
      if n5 < 0 then (0, 0)
      else if mod resto 3 == 0 then (n3, n5)
      else busca (n5 - 1)
      where
        resto = x-5 * n5
        n3 = div resto 3

main = print( selos 10 )

-- Exercício 9

num :: Int -> Bool
num x =
  if (mod (x + 2) 10) == 0 || (mod (x-2) 10) == 0 then True
  else False

main = print ( num 18 )

-- Exercício 10

calc :: Int -> Int -> Int -> Int
calc a b c = sum [ x | x <- [a,b,c], apareceUmaVez x [a,b,c] ] -- Isso indica que é para gerar uma lista
  where
    apareceUmaVez x xs = length [ y | y <- xs, y == x] == 1
    
main = print( calc 10 2 7 )

-- Exercício 11

-- Escreva função no paradigma imperativo (Em C):
a) (\x y z-> if x>=y && x>=z then x else if y>=z then y else z)
b) (\x min max-> if x<min then min else if x>max then max else x)
c) funcao :: Int-> Int-> Int-> Bool
funcao a b c = if a*a + b*b == c*c then True else if a*a +
c*c == b*b then True else if b*b + c*c == a*a then True else
False
