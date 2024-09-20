Soulutions for Sebastian Rudolph, MatrNr. 7215190
All done and run in VSCode with Java jdk-16.0.1

Code output can be found at the end of the code as comment

## Problem1: 
The Task was to calculate the volume of both the sun and earth as perfect spheres using the 
java.lang.Math class. 
Diameters for both spheres where given in miles. 
With the fomula for the volume of a sphere beeing $V = (4/3) * pi * r^3$

## Problem 2:
A given code (givibng all prime numbers up to 50) was to be changed so that it
(a) uses labled continues insted of breaks
(b) does not require a boolean flag
(c) is optimized in its search for primes by only dividing by integers up to the sqrt of the number beeing tested

(a) insert label "first:" before the outer loop, replace the "break" statement with "continue first"

(b) delete "isPrime" flag and the associated if statement, it was unnneccesary in the first place

(c) limit the inner loop to values smaller or similar of the current outer loops counter.

## Problem 3: 
In a string, vovels, spaces and consonants had to be counted.
The number of spaces was calculated by comparing the strings length to the strings length without spaces (using replaceAll(" ",""))
the nunmber of vovels was counted in a loop with an if statement looking for the specific chars
The numebr of consonants was calaculated by substracting the number of vowels from the complete number of letters (without sopaces)

## Problem 4:
The previous given string was to be split in words in a list and this list had to be sorted alphabetically.
String was split using the regex "\\W+", wich means ‘one or more word characters’. A word character in regex is any letter, numeric digit, or the underscore character.

This array of strings was sorted in a nested loop, using the compareToIgnoreCase() function to sort them alphabetically