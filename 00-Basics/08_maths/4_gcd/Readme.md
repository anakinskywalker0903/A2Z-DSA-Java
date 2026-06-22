# Greatest Common Divisor (GCD)

## Problem

* Problem statement: Given two integers `n1` and `n2`, return their Greatest Common Divisor (GCD).
* The GCD of two numbers is the largest positive integer that divides both numbers without leaving a remainder.
* Example:

```text
n1 = 18
n2 = 12

Output = 6
```

## Progress Score

**100/100**

I successfully understood and implemented both the Brute Force and Euclidean Algorithm approaches. By the end of the problem, I was able to write the optimal solution independently and understand why it works.

## What I Got Right

* I understood that a common divisor must divide both numbers.

  ```java
  n1 % i == 0 && n2 % i == 0
  ```

* I recognized that searching from larger divisors toward smaller ones allows us to find the GCD quickly in the brute-force approach.

* I understood the divisibility concept clearly.

* I independently started noticing the Euclidean pattern:

  ```text
  18,12
  ↓
  12,6
  ↓
  6,0
  ```

* I correctly implemented the final Euclidean Algorithm solution.

## Where I Got Stuck

### Logic Mistakes

* Initially mixed brute-force thinking with remainder-based thinking.
* At one point, returned too early inside the search process.

### Syntax/API Mistakes

* Had issues with loop initialization.
* Used incorrect loop direction (`i++` instead of searching downward).
* Forgot the final return statement during one attempt.

### Edge-Case Mistakes

* Initially considered searching from the larger number instead of the smaller one.

### Conceptual Misunderstandings

* During the Euclidean Algorithm implementation, I overwrote the wrong variable:

  ```java
  n1 = n2;
  n1 = remainder;
  ```

  instead of updating both variables correctly.

* Used:

  ```java
  while(n2 == 0)
  ```

  instead of:

  ```java
  while(n2 != 0)
  ```

## Hint (Without Spoiling)

* Ask yourself:

  > What happens to the GCD if I replace the larger number with the remainder obtained after division?

* Try manually reducing:

  ```text
  18,12
  12,6
  6,0
  ```

* Notice what stays unchanged throughout the process.

## Pattern Learned

### Pattern 1: Divisibility Search

```java
for (...) {
    if (condition) {
        return answer;
    }
}
```

* Why it matters: Useful for brute-force divisor problems.

### Pattern 2: Euclidean Algorithm ⭐

```java
while (b != 0) {
    int r = a % b;
    a = b;
    b = r;
}

return a;
```

* Why it matters: One of the most important mathematical algorithms in DSA and frequently appears in coding interviews.

## Final Solution

### Brute Force (Java)

```java
class Solution {
    public int GCD(int n1, int n2) {

        for (int i = Math.min(n1, n2); i >= 1; i--) {

            if (n1 % i == 0 && n2 % i == 0) {
                return i;
            }
        }

        return 1;
    }
}
```

### Brute Force (Python)

```python
class Solution:
    def GCD(self, n1, n2):

        for i in range(min(n1, n2), 0, -1):

            if n1 % i == 0 and n2 % i == 0:
                return i

        return 1
```

### Optimal Euclidean Algorithm (Java)

```java
class Solution {
    public int GCD(int n1, int n2) {

        int remainder = 0;

        while (n2 != 0) {
            remainder = n1 % n2;
            n1 = n2;
            n2 = remainder;
        }

        return n1;
    }
}
```

### Optimal Euclidean Algorithm (Python)

```python
class Solution:
    def GCD(self, n1, n2):

        while n2 != 0:
            remainder = n1 % n2
            n1 = n2
            n2 = remainder

        return n1
```

## Time Complexity

### Brute Force

* Time: **O(min(n1, n2))**
* Explanation: In the worst case, every number from `min(n1, n2)` down to `1` may be checked.

### Euclidean Algorithm

* Time: **O(log(min(n1, n2)))**
* Explanation: Each iteration significantly reduces the problem size using remainders.

## Space Complexity

### Brute Force

* Space: **O(1)**
* Explanation: Only a few variables are used.

### Euclidean Algorithm

* Space: **O(1)**
* Explanation: No additional data structures are required.

## Coach's Note

This was one of the most valuable math-based problems so far because it introduced an algorithm that is both elegant and highly efficient.

The biggest takeaway wasn't the brute-force solution—it was understanding why:

```text
GCD(a, b)
=
GCD(b, a % b)
```

works.

What stood out most was that I started recognizing the sequence:

```text
18,12
→ 12,6
→ 6,0
```

before formally learning the Euclidean Algorithm. That shows growing pattern-recognition ability rather than simple memorization.

My DSA foundation now includes:

1. If-Else Logic → ✅
2. Switch Case → ✅
3. Loops (For & While) → ✅
4. Functions → ✅
5. Time & Space Complexity → ✅
6. Pattern Printing → ✅
7. Digit Manipulation → ✅
8. Reverse Number → ✅
9. Palindrome Number → ✅
10. Divisibility Concepts → ✅
11. Euclidean Algorithm → ✅

---

**Learning Journal Entry:** This problem strengthened my understanding through practice, reflection, and correction of mistakes.
