# Exercises

## Table of Contents (ToC)

- [Beginner exercises](#beginner)

	- [Operators](#operators)

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

#### Taxes

#### UniqueSum



## Intermediate

## Advanced