# kotlin-beginner (Functional Programing:)
## Kotline Introduction 
Kotlin is Programing langauge developed by JetBrains. It runs on Java Vartual Machine.

### Why Kotlin?
 #### Statically Typed :
  This means that the type of every variable and expression is known at compile time.it doesn’t require you to explicitly specify the type  of every variable you declare
 #### Concise
It drastically reduces the amount of boilerplate code that you have been writing all the time in other OOP languages like Java.,Using Kotlin allows you to cut off the lines of code by approximately 40% (compared to Java).
 #### Open Source
Kotlin is distributed under Apache License, Version 2.0. The Kompiler (Kotlin compiler), IntelliJ IDEA plugin, enhancements to basic Java libraries and build tools all are open source
 #### Safe
Kotlin is safe. It avoids the most dangers of null references from the code  and annoying NullPointerExceptions by supporting nullability as part of its type system.
 #### Functional and Object Oriented Capabilities
 - Functional Programing (FP) is style of structuring your program where the focus is to transforming data with expression which should not have side affect.
- FP is a style of building the structure and elements of programs—that treats computation as the evaluation of mathematical functions and avoids changing-state and mutable data
- Kotlin is perfect blend of Object-Orianted and functional programing paradigms. It brings both worlds closer together
---------------------------
## Kotlin Basic
### Kotlin Variables and Data Types
#### Var
- The var is a mutable variable, which is, a variable that can be changed to another value by reassigning it.initialized later:
```
val name = "kotlin"
name = "Kotlin1.3"

```       
- In addition, the var can be 
```
 var name: String
 name = "kotlin"
```
#### Val
 - The keyword val is used to declare a read-only variable. This is equivalent to declaring a final variable in Java.
 - A val must be initialized when it is created
 ```
        val name = "kotlin"
        val anotherName : String // Compile error as val must be initialized when it is created
 ```
 
#### Type inference (Statically Typed)
Did you notice in the above section that the type of the variable was not included when it was initialized? This is different to Java where the type of the variable must always accompany its declaration

-----------
#### Basic types
##### Numbers
The built-in number types are as follows:
Type   Width
Long    64
Int     32
Short   16
Byte    8
Double  64
Float   32
##### Booleans
There are usual negation, conjunction, and disjunction operations.
##### Chars
Chars represent a single character. Character literals use single quotes
##### Strings
Just as in Java, strings are immutable, String literals can be created using double quotes
##### Arrays
- In Kotlin, we can create an array by using the library function arrayOf():
```` val array = arrayOf(1, 2, 3) ````
- Alternatively, we can create an Array from an initial size and a function
```        val perfectSquares = Array(10, { k -> k * k }) ```
##### String templates
- String templates are a simple and effective way of embedding values, variables, or even expressions inside a string without the need for pattern replacement or string concatenation
val name = "Developer"
val str = "hello $name"
- Arbitrary expressions can be embedded by prefixing with a dollar ($) and wrapping in braces {}:
```
val name = "Sam"
val str = "hello $name. Your name has ${name.length} characters"
```
- Some example of String templates are [here](src/test/kotlin/com/stringtemplate/StringTemplateDemoTest.kt)

##### Ranges
- A range is defined as an interval that has a start value and an end value. Any types which are comparable can be used to create a range, which is done using the .. operator:
```
       val aToZ = "a".."z"
       val oneToNine = 1..9
```
- Once a range is created, the in operator can be used to test whether a given value is included in the range
- Kotlin Ranges could be found in below  forms.
  1. m..n
  2. n downTo m
  3. m until n
  4. 1 rangeTo n
- Some example of Kotlin range are [here](https://github.com/AnerayeVijay/kotlin-beginner/blob/master/src/test/kotlin/com/range/RangeDemoTest.kt)
------------------
### Visibility modifiers
Usually not all functions or classes are designed to be part of your public API. Therefore, it is desirable to mark some parts of your code as internal and not accessible outside of the class or package
#### public
This means they are fully visible to any code that wishes to use them.If no modifier is given, then the default is used, which is public

#### Private
Inside a class, interface, or object, any private function or property is only visible to other members of the same class, interface, or object:
```
class Person {
         private fun age(): Int = 21
}
```
Here, the function age() would only be invokable by other functions in the Person class.
#### Protected
Any functions or properties declared as protected inside a class or interface are visible only to members of that class or interface, as well as subclasses.
#### Internal
Any code that is marked as internal is visible from other classes and functions inside the same module
A module is defined as a Maven or Gradle module or an IntelliJ module
Effectively, internal acts as public to a module, rather than public to the universe:

-----------------

## Java vs Kotlin

------------------
 

## Developers: Getting Started

```sh
# Install Homebrew (see https://brew.sh).
/usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"

# Install Java 8.
brew tap caskroom/versions
brew cask install java8

# Checkout the monorepo:
git clone https://github.com/AnerayeVijay/kotlin-beginner.git
```
### Running the Applications

- Go inside `kotlin-beginner`
- Open the project in IntelliJ IDEA
  1. Tell it to overwrite `.idea`, then revert all changes IntelliJ made to that directory
  2. You can run the test cases through IntelliJ or
   run ```gradle build``` from terminal or commandprompt 

