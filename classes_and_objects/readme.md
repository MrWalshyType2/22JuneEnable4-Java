# Classes and objects

- A **class** is a blueprint on what state (fields) and behaviours (methods) belong to an object, we can use this blueprint to create new objects that each have
their own unique pieces of state.

## Simple class

We use the `class` keyword to define a class:

```java
public class Animal {

}
```

- `PascalCase` is used for class names

## Creating an instance of a class

We can create new objects from a class, each object is unique:

```java
Animal a1 = new Animal(); // a1 holds a reference (@jr9849) to where the new animal object is stored in memory
Animal a2 = new Animal();
Animal copyOfA1 = a1; // copyOfA1 is a1, they hold the same reference, i.e., they point to the same object in memory
boolean isEqual = (a1 == a2); // false
isEqual = (a1 == copyOfA1); // true

// primitives store the value directly
int x = 1;
int y = 1;
isEqual = (x == y); // true
```

- When `==` is used, it compares the references rather than the objects themselves. This tells us that each object is unique and stored in a different place in memory.

## Instance members

### Fields on a class

We can add **fields** which represent unique pieces of data for each object, these are *instance members* of the class - as in, each field is re-created for every new object, each instance has a different value.

```java
public class Animal {

	public String type;
}
```

We can then create multiple objects, each will have its own unique `type` value:

```java
Animal a1 = new Animal();
a1.type = "Zebra";
Animal a2 = new Animal();
a2.type = "Eagle";

boolean isEqual = (a1 == a2); // false

String animalOnesType = a1.type; // "Zebra"
String animalTwosType = a2.type; // "Eagle"
```

- The fields inside an object are accessed using *dot notation*

### Methods on a class

A **method** is a re-usable block of code, it may have inputs and it may or may not have a output.

- Only one value can be returned from a method, although that one value could be a list of many values for example

#### Method structure

Methods have three parts:

- The *method header* which consists of the access modifier, the return type, the method name and its parameters (inputs)

- The *method signature* is a part of the method header, it consists of the methods name and its parameters

- The *method body* contains the code the method will execute when it is invoked

To have **invoked** a method means you have called/executed that method.

**Method structure**:

```java
accessModifier ReturnType methodName(inputs...) {

}
```

- each input is a local variable, it can only be accessed inside the method

- `void` means the method returns nothing

**Method header**:

```java
public void doSomething(String input)
```

**Method signature**:

```java
doSomething(String input)
```

**Method body**:

```java
{
	System.out.println(input);
}
```

As a whole, this looks like:

```java
public void doSomething(String input) {
	System.out.println(input);
}
```

#### Implementing a method

The following `printInfo()` method will print the animals information to the console, it has no inputs and no output.

```java
public class Animal {

	public String type;
	
	public void printInfo() {
		System.out.println(type);
	}
}
```

Using this method on unique instances looks as follows:

```java
Animal a1 = new Animal();
a1.type = "Zebra";
Animal a2 = new Animal();
a2.type = "Eagle";
Animal a3 = a1;

a1.printInfo(); // "Zebra"
a2.printInfo(); // "Eagle"
a3.printInfo(); // "Zebra"

boolean typesAreEqual = (a1.type.equals(a3.type)); // true
```

#### Implementing a method with inputs

An input to a method is known as a **formal parameter** when it is specified in the methods signature, although this is often just referred to as a **parameter**. The actual value passed to the parameter is known as the **actual parameter**, or more commonly it is known as the **argument** to the formal parameter of the method.

We can specify multiple inputs, these are local variable declarations so we must specify their type and a name.

**Example structure**:

```java
public void someMethod(ParameterType parameterName1, ParameterType parameterName2, etc...) {

}
```

- the input types can be different, the variable names must be unique within the same method

**Implementing a mutator**:

A **mutator** is a method which changes the value of a field, these are also commonly referred to as *setters*:

```java
public class Animal {

	public String type;
	
	public void printInfo() {
		System.out.println(type);
	}
	
	public void setType(String type) {
		this.type = type;
	}
}
```

- `this` refers to the object that the method is being called on, we use `this` to access fields and methods in the same class.

Using this method on unique instances looks as follows:

```java
Animal a1 = new Animal();
a1.setType("Zebra");
Animal a2 = new Animal();
a2.setType("Eagle");
Animal a3 = a1;

a1.printInfo(); // "Zebra"
a2.printInfo(); // "Eagle"
a3.printInfo(); // "Zebra"

boolean typesAreEqual = (a1.type.equals(a3.type)); // true
```

#### Returning a value from a method

**Implementing an accessor method**:

**Accessor** methods are used for accessing data on an object, these are commonly referred to as *getters*:

```java
public class Animal {

	public String type;
	
	public void printInfo() {
		System.out.println(type);
	}
	
	public void setType(String type) {
		this.type = type; 
		// we have to use `this` here as the method parameter `type` is shadowing/hiding the field called `type`
		// - the field `type` has a class scope, whereas the parameter `type` has a local scope (it is scoped to the method rather than the object)
	}
	
	public String getType() {
		return type; 
		// we don't need to use `this.type` as there is no method parameter with the same name
		// - in this instance, `type` implicitly refers to `this.type`
	}
}
```

- the `return` keyword is used to return a value from a method

Using this method on unique instances looks as follows:

```java
Animal a1 = new Animal();
a1.setType("Zebra");
Animal a2 = new Animal();
a2.setType("Eagle");
Animal a3 = a1;

String a1Type = a1.getType(); // "Zebra"
String a2Type = a2.getType(); // "Eagle"
String a3Type = a3.getType(); // "Zebra"

boolean typesAreEqual = (a1.type.equals(a3.type)); // true
```

## Applying encapsulation to a class

The following class does not fully follow the principles of **encapsulation**, an object-oriented programming technique where:

1. Direct access to data is restricted
2. Data and methods that act upon that data are bundled into one cohesive unit

```java
public class Animal {

	public String type;
	
	public void printInfo() {
		System.out.println(type);
	}
	
	public void setType(String type) {
		this.type = type; 
		// we have to use `this` here as the method parameter `type` is shadowing/hiding the field called `type`
		// - the field `type` has a class scope, whereas the parameter `type` has a local scope (it is scoped to the method rather than the object)
	}
	
	public String getType() {
		return type; 
		// we don't need to use `this.type` as there is no method parameter with the same name
		// - in this instance, `type` implicitly refers to `this.type`
	}
}
```

The encapsulated version looks like:

```java
public class Animal {

	private String type;
	
	public void printInfo() {
		System.out.println(type);
	}
	
	public void setType(String type) {
		this.type = type; 
		// we have to use `this` here as the method parameter `type` is shadowing/hiding the field called `type`
		// - the field `type` has a class scope, whereas the parameter `type` has a local scope (it is scoped to the method rather than the object)
	}
	
	public String getType() {
		return type; 
		// we don't need to use `this.type` as there is no method parameter with the same name
		// - in this instance, `type` implicitly refers to `this.type`
	}
}
```

The only change is that we have now made the field `type` use the `private` access modifier. This means we can no longer directly access the field `type` using dot notation on an `Animal` object that is outside of the `Animal` class:

```java
Animal a1 = new Animal();
a1.type = "Zebra"; // error, type is not visible
```

## Method overloading

**Method overloading** in Java is a form of polymorphism known as *ad-hoc polymorphism* that occurs at compile time, when our source code is turned into class files. Method overloading allow us to have multiple methods with the same name but different input types.

- A method is overloaded when its signature has the same name but different inputs

- The compile time part of it means when we compile the program, the Java compiler will check that we have used the correct types for the method called. If you haven't used the correct type, the program will not compile and so you will not be able to run it.

Polymorphism has a few different appearances in Java:

- Method overloading: Ad-hoc polymorphism

- Method overriding: Dynamic-method dispatch

- Storing a subtype in a parent types variable: Subtype polymorphism

- Generic typing: Parametric polymorphism

> Polymorphism just means one thing has many different forms.

```java
public class Animal {

	private String type;
	
	public void printInfo() {
		System.out.println(type);
	}
	
	public void setType(String type) {
		this.type = type; 
		// we have to use `this` here as the method parameter `type` is shadowing/hiding the field called `type`
		// - the field `type` has a class scope, whereas the parameter `type` has a local scope (it is scoped to the method rather than the object)
	}
	
	public String getType() {
		return type; 
		// we don't need to use `this.type` as there is no method parameter with the same name
		// - in this instance, `type` implicitly refers to `this.type`
	}
	
	// Method overloading:
	// - two eat() methods, different inputs
	public void eat() {
		System.out.println("Searching for some food");
	}
	
	// overloaded methods can have different return types
	// - the return type does not matter
	// - it is the signature that matters, the name and inputs
	public int eat(String food) {
		System.out.println("Nom nom nom... " + food);
		return 0;
	}
}
```

## Constructors

We use a constructor to initialise an object, specifically the data on that object.

A constructor is shaped similarly to a method except that:

1. There is no return type

2. If we specify a constructor, it must have the same name as the class 

3. If we don't specify a constructor, Java provides an empty **default constructor** that takes no inputs

Constructors can have parameters, inputs. Constructors can be overloaded just like methods. The constructors signature is its name and its input parameters.

Structure of a constructor:

```java
public class SomeClass {
  
    AccessModifier SomeClass(ParameterType param1, ParameterType param2, ...) {
        // initialise fields in here
    }
}
```

A constructor implementation looks as follows:

```java
public class Animal {

	private String type;
	
	public Animal(String type) {
		this.type = type;
	}
	
	// getters, setters, etc...
}
```

Using the constructor looks like:

```java
Animal a1 = new Animal("Zebra");
```

### Overloading a constructor

Constructors can be overloaded:

```java
public class Animal {

	private String type;
	
	public Animal(String type) {
		this.type = type;
	}
	
	public Animal(int type) {
		System.out.println(type);
	}
	
	// getters, setters, etc...
}
```

Using the overloaded constructors:

```java
Animal a1 = new Animal("Zebra");
Animal a2 = new Animal("Eagle");
new Animal(2);
a1.printInfo(); // Zebra
a2.printInfo(); // Eagle
```

### Constructor chaining

We can also make constructors call other constructors, the `this` keyword is used for that:

```java
public class Animal {

	private String type;
	
	public Animal(String type) {
		this(type.length()); // this calls the Animal(int type) constructor
		this.type = type;
	}
	
	public Animal(int type) {
		System.out.println(type);
	}
	
	// getters, setters, etc...
}
```

- you can only use `this()` to call one other constructor in each constructor

- `this()` must also be the first line in the constructor