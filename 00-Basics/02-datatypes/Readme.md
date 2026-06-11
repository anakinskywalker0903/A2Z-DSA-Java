# Data Types in Java

Java is statically typed, but unlike C++, it runs on the JVM (Java Virtual Machine) and offers automatic memory management through garbage collection. Data types in Java are divided into two broad categories:

## Primitive Types

These have fixed sizes and store values directly in memory.

* **byte** – 8-bit integer
  Example:

  ```java
  byte age = 20;
  ```

* **short** – 16-bit integer
  Example:

  ```java
  short year = 2026;
  ```

* **int** – 32-bit integer (most commonly used)
  Example:

  ```java
  int marks = 95;
  ```

* **long** – 64-bit integer
  Example:

  ```java
  long population = 1400000000L;
  ```

* **float** – 32-bit floating-point number
  Example:

  ```java
  float price = 99.99f;
  ```

* **double** – 64-bit floating-point number (default for decimals)
  Example:

  ```java
  double pi = 3.14159;
  ```

* **char** – Stores a single Unicode character
  Example:

  ```java
  char grade = 'A';
  ```

* **boolean** – Stores either `true` or `false`
  Example:

  ```java
  boolean isPassed = true;
  ```

## Non-Primitive (Reference) Types

These include objects such as `String`, arrays, user-defined classes, and interfaces. A reference variable stores the memory address of the actual object located in the heap.

Examples:

```java
String name = "Rohit";

int[] numbers = {1, 2, 3, 4};

Student s = new Student();
```

One key difference from C++ is that Java's `boolean` type can only hold `true` or `false`; it cannot be treated as an integer value.

# Data Types in Python

Python is dynamically typed, meaning you do not need to declare data types explicitly. The interpreter determines the type at runtime. This makes development faster but requires careful coding to avoid subtle bugs.

## Numeric Types

* **int** – Integers of unlimited size
  Example:

  ```python
  age = 20
  ```

* **float** – Decimal numbers (double precision)
  Example:

  ```python
  pi = 3.14
  ```

* **complex** – Complex numbers
  Example:

  ```python
  z = 3 + 5j
  ```

## Sequence Types

* **list** – Mutable ordered collection
  Example:

  ```python
  fruits = ["apple", "banana", "mango"]
  ```

* **tuple** – Immutable ordered collection
  Example:

  ```python
  coordinates = (10, 20)
  ```

* **range** – Sequence of numbers
  Example:

  ```python
  numbers = range(1, 6)
  ```

## Text Type

* **str** – Strings
  Example:

  ```python
  name = "Rohit"
  ```

## Mapping Type

* **dict** – Key-value pairs
  Example:

  ```python
  student = {"name": "Rohit", "marks": 95}
  ```

## Set Types

* **set** – Mutable collection of unique elements
  Example:

  ```python
  colors = {"red", "blue", "green"}
  ```

* **frozenset** – Immutable set
  Example:

  ```python
  fixed_colors = frozenset({"red", "blue"})
  ```

## Boolean Type

* **bool** – Logical values
  Example:

  ```python
  is_passed = True
  ```

Unlike Java, Python allows booleans to behave like integers because `True` is treated as `1` and `False` as `0`.

Examples:

```python
print(True + 1)    # Output: 2
print(False + 5)   # Output: 5
```
