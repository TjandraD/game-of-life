# Conway's Game of Life

## Problem Description
This program is meant as a homework from Generasi Gigih program. We need to write Game of Life with the most beautiful code that we can write, with the details as:
1. The problem statement can be found on Wikipedia (Keyword: Conway's Game of Life)
2. Use Java as the language
3. Write the most beautiful code as possible
4. The format of input and output is up to you
5. Infinite grid is possible, array out of bound exception is possible
6. Commit at most every 10 mins
7. You need to keep it only in your local Git

### Game of Life Rules

And the rules of Game of Life are:
1. Any live cell with fewer than two live neighbours dies, as if by underpopulation.
2. Any live cell with two or three live neighbours lives on to the next generation.
3. Any live cell with more than three live neighbours dies, as if by overpopulation.
4. Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.

These rules can be concluded as:
1. Any live cell with two or three live neighbours survives.
2. Any dead cell with three live neighbours becomes a live cell.
3. All other live cells die in the next generation. Similarly, all other dead cells stay dead.

## Pre-Requisite to Run The Program
- Have an IDE for Java installed (e.g. Netbeans, Intellij, Eclipse)
- JDK with min. version of 11.0
- JUnit 5.0 or higher installed (for running the tests)

## How to Run The Program
- Open a terminal
- Change the working directory into the current project directory
- Execute `javac src/main/Grid.java` in your terminal

Or in Intellij, you can simply click the run button on the left side of the file

## How to Run The Tests
- Open a terminal
- Change the working directory into the current project directory
- Execute `javac src/test/GridTest.java` in your terminal