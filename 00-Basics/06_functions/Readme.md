# Functions – Maximum of Four Numbers

## Problem

* Problem statement: Write a function `max_of_four(int a, int b, int c, int d)` that returns the greatest among the four integers passed as arguments.
* Example:

  * Input:

    ```
    3
    4
    6
    5
    ```
  * Output:

    ```
    6
    ```
* Problem link: Not provided

## Progress Score

**100/100**

This exercise reinforced my understanding of functions, parameters, return values, and basic comparison logic. The focus was not on discovering a new algorithm but on becoming comfortable with writing reusable pieces of code.

## What I Got Right

* I understood that a function groups related statements into a reusable unit.
* I recognized that this problem required a function with a non-void return type.
* I understood how parameters allow data to be passed into a function.
* I identified that the function should return the maximum value among four inputs.
* I reinforced the idea that I/O handling was already taken care of by the platform.

## Where I Got Stuck

### Logic Mistakes

* None reported.

### Syntax/API Mistakes

* None reported.

### Edge-Case Mistakes

* None reported. The comparison logic naturally handles equal values as well.

### Conceptual Misunderstandings

* None. This problem primarily served as practice with function structure and return values.

## Hint (Without Spoiling)

* Break the problem into two steps:

  1. Keep track of the largest value seen so far.
  2. Compare it with the next number and update it if necessary.
* Remember that a function with a return type must return a value of that type.

## Pattern Learned

* Pattern: **Reinforcement of Fundamentals**
* Why it matters: Functions improve code readability, modularity, and reusability. Nearly every DSA problem involves writing helper functions to simplify complex logic.

## Final Solution

### Java

```java
int max_of_four(int a, int b, int c, int d) {
    int max = a;

    if (b > max) {
        max = b;
    }

    if (c > max) {
        max = c;
    }

    if (d > max) {
        max = d;
    }

    return max;
}
```

### Python

```python
def max_of_four(a, b, c, d):
    maximum = a

    if b > maximum:
        maximum = b

    if c > maximum:
        maximum = c

    if d > maximum:
        maximum = d

    return maximum
```

## Time Complexity

* Time: **O(1)**
* Explanation: The function performs a fixed number of comparisons regardless of the input values.

## Space Complexity

* Space: **O(1)**
* Explanation: Only a constant amount of extra memory is used.

## Coach's Note

This problem may seem simple, but it introduces an essential programming habit: breaking logic into reusable functions. As DSA problems become more complex, helper functions will allow me to organize my thoughts, avoid repetition, and write cleaner code. Mastering functions early makes recursion, divide-and-conquer, tree traversals, and modular problem-solving much easier later in my journey.

My fundamentals so far:

1. Printing and input handling → ✅
2. If-Else decision making → ✅
3. Switch-case branching → ✅
4. For loops → ✅
5. While loops → ✅
6. Functions and return values → ✅

Each of these concepts forms a building block for the DSA patterns I'll encounter next.

---

**Learning Journal Entry:** This problem strengthened my understanding through practice, reflection, and correction of mistakes.
