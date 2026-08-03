
📘 Java + DSA Journey
Day 1 Notes

Topics Covered:

How Java Works
Variables
Data Types
Literals
Type Conversion & Type Casting
Arithmetic Operators
1. What did we learn today?

Today,  I learned the absolute basics of Java. Everything I write in Java—from simple programs to advanced DSA—will use these concepts.

Think of today's topics as the alphabet of the Java language.

2. How Java Works
What problem does it solve?

Different computers have different operating systems (Windows, Linux, macOS). Normally, a program written for one OS may not work on another.

Java solves this by compiling code into Bytecode, which can run on any system that has a JVM (Java Virtual Machine).

Write Once, Run Anywhere (WORA)

Workflow
Java Source Code (.java)

        ↓

Java Compiler (javac)

        ↓

Bytecode (.class)

        ↓

        JVM

        ↓

Machine Code

        ↓

Program Runs

Components:

1. JDK (Java Development Kit)

Used by developers.

Contains:

JRE
Compiler (javac)
Debugger
Development tools

Used to write and compile Java programs.

2. JRE (Java Runtime Environment)

Used to run Java programs.

Contains:

JVM
Libraries
3. JVM (Java Virtual Machine)

Responsible for

Loading bytecode
Verifying bytecode
Converting bytecode to machine code
Executing the program
Managing memory (Garbage Collection)

Memory Trick:

JDK = Develop

JRE = Run

JVM = Execute

⭐ Important Points:

Java code is compiled and interpreted.
.java → Source Code
.class → Bytecode
JVM is OS-specific, but Bytecode is platform-independent.
JDK includes JRE.
JRE includes JVM.

3. Variables:

What is a Variable?

A variable is a named container that stores data.

Example: int age = 21;

Here,

Variable Name = age

Value = 21

Datatype = int

Syntax:- datatype variableName = value;

Example:

int marks = 90;

Variable Naming Rules

✅ Can contain

Letters
Digits
_
$

❌ Cannot

Start with a digit
Use spaces
Use Java keywords

Example:

int studentAge;

Good

int age2;

Good

int 2age;

Wrong

⭐ Important Points:

Variable names should be meaningful.
Java is case-sensitive.
age
Age
AGE

All are different.

4. Data Types:

What is a Data Type?

A datatype tells Java

What kind of value will be stored.

Primitive Data Types:

Data Type	Size	Example
byte	    1 byte	    10
short	    2 bytes	    200
int	        4 bytes	    5000
long	    8 bytes	    999999L
float	    4 bytes	    5.5f
double	    8 bytes	    5.55
char	    2 bytes	    'A'
boolean	JVM-dependent	true

Memory Trick:

Whole Numbers

    byte

    ↓

    short

    ↓

    int

    ↓

    long

Decimals:

    float

    ↓

    double

⭐ Important Points:

double is more precise than float.
char uses single quotes.
String is not a primitive datatype.
boolean stores only true or false.

5. Literals:

What is a Literal?

A literal is the actual value assigned to a variable.

Example

int age = 21;

Here,

21 is the literal.

Types of Literals:

- Integer Literal
10
25
100
- Floating Literal
10.5
15.67
- Character Literal
'A'
'Z'
- String Literal
"Hello"
- Boolean Literal
true
false

⭐ Important Points

Characters → 'A'
Strings → "A"
They are not the same.

6. Type Conversion & Type Casting
Why is it needed?

Sometimes you need to store one datatype inside another.

Java checks whether it's safe.

Type Conversion (Widening)

Automatic conversion from a smaller datatype to a larger datatype.

Example

int a = 10;

double b = a;

Output

10.0

No data loss.

Flow:

byte

↓

short

↓

int

↓

long

↓

float

↓

double

Automatic.

Type Casting (Narrowing):-

Manual conversion from a larger datatype to a smaller datatype.

Example

double a = 10.75;

int b = (int)a;

Output

10

Decimal part is lost.

⭐ Important Points
Widening → Automatic.
Narrowing → Manual.
Narrowing may lose data.

7. Arithmetic Operators:-

These operators perform mathematical calculations.

Operator	Meaning
+	Addition
-	Subtraction
*	Multiplication
/	Division
%	Modulus
++	Increment
--	Decrement
Example
int a = 10;
int b = 3;

System.out.println(a + b);
System.out.println(a - b);
System.out.println(a * b);
System.out.println(a / b);
System.out.println(a % b);

Output

13

7

30

3

1
Integer Division
5 / 2

Output

2

Not

2.5

because both operands are integers.

Decimal Division
5.0 / 2

Output

2.5

⭐ Important Points

% gives the remainder.
Integer ÷ Integer = Integer.
If one operand is double or float, the result is decimal.

8. One-Minute Revision

Topic   	Remember
JDK	        Develop Java programs
JRE	        Run Java programs
JVM	        Executes bytecode
Variable	Stores data
Datatype	Type of data stored
Literal	    Actual value assigned
Widening	Automatic conversion
Narrowing	Manual conversion
%	        Remainder
/	        Integer division if both operands are integers

9. Interview Nuggets :

Why is Java platform-independent?
Difference between JDK, JRE, and JVM.
Difference between float and double.
Difference between char and String.
Difference between type conversion and type casting.
Why does 5 / 2 produce 2 instead of 2.5?