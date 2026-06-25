# Fibonacci Number Using Recursion

## Problem

* Problem statement: Given an integer `n`, return the `n`th Fibonacci number using recursion.
* The Fibonacci sequence is defined as:

```text
F(0) = 0
F(1) = 1

F(n) = F(n-1) + F(n-2), for n > 1
```

* Examples:

```text
Input: n = 4

Output: 3

Explanation:
0, 1, 1, 2, 3
```

```text
Input: n = 6

Output: 8
```

## Progress Score

**100/100**

I solved this problem correctly on my first attempt. I immediately recognized the recursive relationship and correctly identified that Fibonacci requires two base cases and two recursive calls.

## What I Got Right

* I correctly handled both base cases.

```java
if(n == 0){
    return 0;
}

if(n == 1){
    return 1;
}
```

* I correctly identified that Fibonacci depends on the two previous values.
* I wrote the correct recursive formula.

```java
return fib(n - 1) + fib(n - 2);
```

* I did not introduce unnecessary variables.
* I recognized this as a recursive return-value problem while adapting to a branching recursion structure.

## Where I Got Stuck

### Logic Mistakes

* None.

### Syntax/API Mistakes

* None.

### Edge-Case Mistakes

* None.

### Conceptual Misunderstandings

* None. The recursive relationship was understood correctly from the beginning.

## Hint (Without Spoiling)

Whenever a recursive problem depends on **more than one smaller subproblem**, ask yourself:

* Does the answer come from one previous state?
* Or does it combine multiple previous states?

If it combines multiple results, you're likely dealing with **branching recursion**.

## Pattern Learned

* Pattern: **Branching Recursion ⭐**
* Why it matters: Unlike previous recursion problems that made a single recursive call, Fibonacci branches into two recursive calls, forming a recursion tree.

Template:

```java
if(baseCase){
    return answer;
}

return recursiveCall(smallerProblem1)
     + recursiveCall(smallerProblem2);
```

This pattern appears in:

* Fibonacci Number ✅
* Binary Tree Traversals
* Backtracking
* Divide & Conquer Algorithms
* Dynamic Programming (before optimization)

## Final Solution

### Java

```java
class Solution {
    public int fib(int n) {

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }
}
```

### Python

```python
class Solution:
    def fib(self, n):

        if n == 0:
            return 0

        if n == 1:
            return 1

        return self.fib(n - 1) + self.fib(n - 2)
```

## Time Complexity

* Time: **O(2ⁿ)**
* Explanation: Each recursive call generates two more recursive calls, causing many subproblems to be recomputed. The recursion tree grows exponentially.

## Space Complexity

* Space: **O(n)**
* Explanation: The maximum depth of the recursion stack is `n`.

## Coach's Note

This problem introduces your **first branching recursion pattern**.

Until now, every recursive problem you've solved followed a single chain:

```text
Problem
   ↓
Smaller Problem
   ↓
Smaller Problem
```

Fibonacci is different:

```text
          fib(n)
         /      \
   fib(n-1)   fib(n-2)
      /   \      /   \
     ...  ...   ...  ...
```

Instead of reducing to one smaller problem, the solution combines **two recursive results**. This recursion tree is an important concept because you'll see it again in binary trees, backtracking, and eventually Dynamic Programming.

The biggest takeaway isn't just writing the code—it's recognizing that recursion can branch into multiple paths.

One important thing to remember is that this solution is **correct but not optimal**. Many Fibonacci values are computed repeatedly, making the algorithm inefficient. Later, when you study **Dynamic Programming**, you'll revisit this exact problem and optimize it dramatically using memoization and tabulation. For now, this recursive solution teaches the recursion pattern it was designed to teach.

### DSA Pattern Toolbox

✅ Pattern Printing
✅ Digit Extraction & Processing
✅ Euclidean Algorithm
✅ Early Exit Search
✅ Recursive Build-Up
✅ Work Before Recursion
✅ Recursive Return Formula
✅ **Branching Recursion ⭐**
✅ Two Pointers
✅ Two Pointers with Character Filtering

Your progression through recursion has been especially encouraging:

| Problem        | Attempts |
| -------------- | -------: |
| Print 1 → N    |       ~5 |
| Print N → 1    |        1 |
| Sum of First N |        2 |
| Factorial      |        1 |
| Fibonacci      |  **1** ✅ |

That trend shows you're no longer inventing recursion from scratch—you've started recognizing reusable recursion patterns.

---

**Learning Journal Entry:** This problem strengthened my understanding through practice, reflection, and correction of mistakes.
