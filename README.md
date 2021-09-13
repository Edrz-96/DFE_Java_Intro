# DFE_Java_Intro

### Exercise 1 – HelloWorld
#### Overview:
First, we need to make sure that we have installed Java (cli > java -version). After which we should ensure we have an IDE installed (Eclipse). Then we can create a Java Project as tasked below. 
#### Create: 
*	Create new a new Java project called: HelloWorld 
#### Code a project that: 
*	Outputs “HelloWorld” to the console. 
#### Future steps:
*	Return “HelloWorld” as a String. 
*	Has a method that takes a String parameter and outputs this to the console. 
### Exercise 2 – Packages
#### Overview:
A package in Java is used to group related classes together.
Packages help us to write more maintainable code and can be divided into two categories;
*	Built in packages which come from the Java API.
*	User defined packages which are packages created by us.
The use of packages can also help provide controlled access to certain classes through the use of the protected and default access modifiers.
When naming packages there is a standard naming convention that we follow.
Firstly there should be no capital letters in the package name, the package should be entirely lower case. Secondly the package name should follow this format: 
“package domain.companyname.packagename”

#### Where: 
*	In your HelloWorld project
#### code a project that: 
*	Remove the default package and move your files into the correct package format. 
#### Future steps:
*	Study Java 9 modules for package permissions

### Exercise 3 – Data Types
#### Overview:
When we declare a variable in Java, we have to specify the type of the value that will be stored within that variable. We do this by giving the variable a type, a reference name, and eventually a value. 
Where the coloured text is the data type and black text is the variable name. Each variable could be declared to have one of eight primitive data types.

#### Create: 
*	Create new a new Java project called: DataTypes
#### Code a project that: 
*	Uses 5 different data types.
*	Have these printed to the console.
#### Future steps:
*	Return the type at console.
### Exercise 4 – Naming Convention 
#### Overview:
In the interests of keeping your code maintainable, either for yourself or for other developers, Java adheres to several naming conventions.
Although companies will differ in terms of how code should be organised, they usually tend to agree with each other on these conventions.
This is commonly known as good practice, and it is vital to modern software development.
#### Cases:
You may have seen references to several different types of cases when writing code. These form the basis of naming conventions in software engineering. The most common are:
*	PascalCase / UpperCamelCase - Where each new word has a capital letter to start.
*	camelCase / lowerCamelCase - The same as PascalCase except the first word is always all lower case.
*	snake_case - All lower case separated by underscores.
*	UPPERCASE All uppercase.
*	lowercase All lowercase.
#### General rules for all identifiers:
It probably comes as no surprise that Java has precise rules about identifiers (names for all the things you write yourself).
Luckily, the same general rules apply to anything you are free to name, including variables, classes, methods, and fields.
There are only three rules to remember for legal identifiers:
*	the name must begin with a standard alphabetical character (a-z/A-Z), a $, or _.
*	subsequent characters may be entirely alphanumeric (a-z/A-Z/0-9)
*	you cannot use the same name as a reserved word in Java (there are lots of these, so it'll probably happen to you by accident at some point!)


|     Type    	|     Description    	|     Example    	|
|---	|---	|---	|
|     Classes    	|     PascalCase – nouns    	|     public class MyClass {}    	|
|     Test Classes    	|     Class name with the word Test     	|     public class MyClassTest {}    	|
|     Interfaces    	|     PascalCase – adjectives    	|     public interface Useable {}, public class   MyClass implements Usable {}    	|
|     Methods    	|     camelCase    	|     public void methodName() {}    	|
|     Variables     	|     CamelCase, short and meaning full, a good   way to test this is if you come back to a variable and forget why it’s there,   then you’ve probably not used a great name!     	|     MyVar    	|
|     Temp Variables    	|     Typically single character     	| for (int i : items){  System.out.println(i); }          	|
|     Packages    	|     Packages   should be named in period.separated.lowercase format.     They should   begin with a top-level domain name, followed by the organisation name, before   adhering to whichever naming conventions are present within that   organisation:          	| Package com.qa.main 	|


Packages	Packages should be named in period.separated.lowercase format.
They should begin with a top-level domain name, followed by the organisation name, before adhering to whichever naming conventions are present within that organisation:
	Package com.qa.main
		
#### create: 
*	Create new a new Java project called: NamingConvention
#### Code a project that: 
*	Has Classses, Interfaces, methods and variables
* Ensure all conform to convention




### Exercise 5 – Flow of Control
#### Overview:
In Java, code execution will begin in the main method, this method can call other methods, create variables, etc. If you try to run your code and get the error "main method not found" it is because you have either not declared the main method, or not declared it correctly.
The main method should be declared like this:
public static void main(String[] args) {

}

Next, you’re going to want to understand the ‘Java Call Stack’, the call stack is what Java is going to use to keep track of method calls. ‘Stack Frames’ will be generated for each new method call Java receives; using a Last-In, First-Out (LIFO) fashion.



Java will also abide by scoping laws, therefore, understanding scope is very important if you’re to have any success with Java. We have the following: 

Method/Local Scope: Variables that are temporary and generally only used in the method that they are declared in. As soon as the method ends all variables declared inside that method are no longer referenced and cannot be accessed anymore.
```java
    public static void method1() {
        String message = "Hello World!";
        System.out.println(message);
    }
```


Loop Scope: Variables that are declared inside a loop declaration and are only accessible inside the loop and are lost once the loop has ended.
```java
for(int i = 0; i < 10; i++) {
            int number = 20;
            number += i;
            System.out.println(number);
        }
```
Class Level/Instance Scope Referenceable throughout the entire class, these variables are inside the class but outside of methods. Generally, these variables will be defined at the top of the class.
```java
public class HelloWorld {

    public static String message = "Hello World!";

    public static void method1() {
        System.out.println(message);
    }
```
Create: 
* Create new a new Java project called: FlowOfControl
Code a project that: 
* Uses the following code:

```java
public static void method1() {
    System.out.println("Hello");
}

public static void method2() {
    System.out.println("World");
}

public static String method3() {
    return "!";
}

public static void main(String[] args) {
    method1();
    method2();
    System.out.println(method3());
}
```
* Without running the application what is the expected output?
* Make observations and add comments at the correct intervals around the flow 

 
