# Design patterns

A design pattern is a re-usable solution to a common problem, this solution is at an abstracted level and thus will require some form of implementation.

## Types of design pattern

In object-oriented programming, there are three main categories of design pattern:

- Creational design patterns: Solutions to instantiating a class, i.e., creating objects

- Structural design patterns: Concerns the structure of code by means of inheritance and composition patterns.

- Behavioural design patterns: About how instances of different classes communicate with other objects

This repository explores at least one pattern from each category of design pattern.

### Creational

#### Builder pattern

#### Factory method pattern

The factory method pattern is used for the creation of objects, this pattern works by providing an interface for creating objects of a superclass, subclasses may alter the type of object created.

> TLDR: We are replacing `new SomeClass()` calls with a *factory method*, i.e., `SomeClassFactory.of()`. The `of` factory method would then be responsible for calling `new SomeClass()` based on inputs we pass to it.

### Structural

#### Adapter

### Behavioural

#### Strategy pattern

The strategy pattern is used to enable dynamic behaviour at runtime by allowing the selection of a specific algorithm to be executed:

![Strategy pattern generic image](../static/strategy_pattern.png)

#### Command pattern