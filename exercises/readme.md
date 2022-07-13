# Exercises

## Table of Contents (ToC)

- [Beginner exercises](#beginner)

    - [Operators](#operators)
	
- [Iteration](#iteration)

## Beginner

### Operators

#### Calculator

In the `exercises.beginner.operators` package, implement the following in the `Calculator` class:
   1. A method which adds two numbers and returns their sum.
   2. A method which subtracts two numbers and returns their difference.
   3. A method which multiplies two numbers and returns their product.
   4. A method which divides two numbers and returns their quotient.

#### Results

In the `exercises.beginner.operators` package, a `Results` class exists for you to do this exercise.

A person takes 3 exams in college, Physics, Chemistry, and Biology, each exam has a maximum of 150 marks. When all the exam marks have been added together, we can find the overall percentage that the person has got by multiplying their score by 100 and then dividing by 450.

The `Results` class has been created for you with 5 instance variables already populated. You must implement the following methods:

- `displayResults()`: displays the results that the person got for each exam and then the total mark.

- `displayPercentage()`: which finds and displays the percentage that the person received for the exams overall.

For `displayResults()`, the output to the console must contain the following fragments, they may be in any order:

**Header**

```
###############
# EXAM SCORES #
###############
```

**Body**

```
PHYSICS: 104
CHEMISTRY: 134
BIOLOGY: 97
```

**Footer**

```
TOTAL SCORE: 335/450
PERCENTAGE: 74%
```

For `displayPercentage()`, the output to the console must contain the following:

```
PERCENTAGE: 74%
```

The exam scores and percentages will differ according to the values you use, everything else about the header, body and footer fragments must remain the same.

### Conditionals

#### Add together

Given a two digit number from 10 up to 100, the sum of both digits will be returned, i.e., 11 would be 2, 22 would be 4, 57 would be 12, etc...

See file: `exercises.beginner.conditionals.AddTogether`

#### Blackjack

Given 2 integer values greater than 0, return whichever is closest to 21 without going over 21. If they both go over 21 then return 0.

```
play (10, 21) -> 21
play (20, 18) -> 20
play (1, 22) -> 1
play (22, 23) -> 0
```

See file: `exercises.beginner.conditionals.AddTogether`

#### CalculatorRevisited

Edit the division method in the `exercises.beginner.conditionals.CalculatorRevisited` class, the sum should only execute if the second parameter is not zero, otherwise it prints out a message saying that the division cannot be performed, the message must be the String `Cannot divide by zero`.

#### FizzBuzz

Implement the `play` method in `exercises.beginner.conditionals.FizzBuzz` where the method returns a String according to the following constraints:]

- returns 'Fizz' for multiples of 3
- returns 'Buzz' for multiples of 5
- returns 'FizzBuzz' for multiples of both 3 and 5
- returns the input number for numbers that are neither

#### ResultsRevisited

Using `exercises.beginner.conditionals.ResultsRevisited`, expand your original `exercises.beginner.operators.Results`:

1. Expand the Results class so that there is now a pass mark of 60%; if the person receives under 60% they get a fail message.

2. Expand the previous example so that even if the person gets higher than 60% overall, if they fail 1 or more of the exams (pass grade of 60% for each exam) they still fail overall.

eg. if a student's scores were: Biology: 150, Chemistry: 150, Physics: 84

they would have an overall grade of 85.3% (Pass)

but in this case the student would fail because their physics grade is 54% (Fail)

3. Expand the above so that the message that is displayed varies depending on the number of subjects that they have failed.

For `displayResults()`, the output to the console must contain the following fragments, they may be in any order:

**Header**

```
###############
# EXAM SCORES #
###############
```

**Body**

```
PHYSICS: 104/150
CHEMISTRY: 134/150
BIOLOGY: 97/150
```

**Footer**

```
TOTAL SCORE: 335/450
PERCENTAGE: 74%
```

**Failure message examples**:

When a failure occurs, it must be printed to the console. The possible fragments are as follows:

- `FAILED CHEMISTRY: 20%`

- `FAILED PHYSICS: 14%`

- `FAILED BIOLOGY: 39%`

- `FAILED: 41%`

Scores and percentages will differ dependent on the values used for chemistry, physics and biology scores.

#### Taxes

Using `exercises.beginner.conditionals.Taxes`, do the following tasks:

1. `calculateTaxRate` - which takes a salary and works out the percentage by which the salary will be taxed.

2. `calculateTax` - which works out the exact amount that the user will be taxed using a similar process to that in the first method. That amount should be returned and output to the console.

The salaries are taxed as below:

```
0 - 14,999 : 0% tax
15,000 - 19,999 : 10% tax
20,000 - 29,999 : 15% tax
30,000 - 44,999 : 20% tax
45,000+ : 25% tax
```

#### UniqueSum

Using `exercises.beginner.conditionals.UniqueSum`, do the following tasks:

Given 3 integer values, return their sum. If one value is the same as another value, they do not count towards the sum. In other words, only return the sum of unique numbers given.

```
play(1, 2, 3) -> 6
play(3, 3, 3) -> 0
play(1, 1, 2) -> 2
```

### Iteration

#### Shapes

For the following questions, you must use one or more iterative statements under the following constraint:

> Only `System.out.print('\n')`, `System.out.print('#')` and `System.out.print(' ')` may be used to output to the console.

Using `exercises.beginner.iteration.Shapes`, do the following tasks:

1. Print a right-angled triangle to the console, the desired output is as follows:

```
#
##
###
####
#####
```

3. Print an inverted right-angled triangle to the console, the desired output is as follows:

```
#####
####
###
##
#
```

2. Print a left-angled triangle to the console, the desired output is as follows:

```
    #
   ##
  ###
 ####
#####
```

4. Print an inverted left-angled triangle to the console, the desired output is as follows:

```
#####
 ####
  ###
   ##
    #
```

5. Print an acute triangle to the console, the desired output is as follows:

```
   #
  ###
 #####
#######
```

6. Print the following zig-zagged line to the console:

```
#
 #
# 
 #
#
 #
```

7. Print a circle to the console, the desired output is as follows:

```
 ##
#  #
#  #
 ##
```

### Repeat the number

For the following questions, you must use one or more iterative statements under the following constraint:

> Only `System.out.print('\n')` and `System.out.print(i)`, where `i` is the number to print, may be used to output data to the console.

Using `exercises.beginner.iteration.RepeatTheNumber`, do the following tasks:

1) Create a method that will print out the numbers 1 through 10, 10 times each on the same line. Desired output is as follows:

```
1111111111
2222222222
3333333333
4444444444
5555555555
6666666666
7777777777
8888888888
9999999999
10101010101010101010
```

2) Create a method that will print the numbers 1 through 10 as many times as the value of that number. Desired output is as follows:

```
1
22
333
4444
55555
666666
7777777
88888888
999999999
10101010101010101010
```


## Intermediate

## Advanced