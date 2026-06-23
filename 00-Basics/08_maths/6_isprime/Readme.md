# Prime Number Check

## Problem

* Problem statement: Given an integer `n`, determine whether it is a prime number.
* A prime number has exactly two factors:

  * `1`
  * The number itself
* Examples:

```text
n = 2
Output: true
```

```text
n = 7
Output: true
```

```text
n = 12
Output: false
```

```text
n = 1
Output: false
```

## Progress Score

**98/100**

I correctly identified the core prime-checking logic and implemented the validation pattern successfully. The only issue remaining was handling the special case where `n <= 1`.

## What I Got Right

* I correctly chose to test divisibility using a loop.
* I used the correct divisibility check:

```java
n % i == 0
```

* I correctly returned `false` immediately when a divisor was found.
* I correctly returned `true` after checking all possible divisors.
* I recognized that a prime-checking problem is essentially a validation/search problem.

## Where I Got Stuck

### Logic Mistakes

* None in the final approach.

### Syntax/API Mistakes

* None in the final approach.

### Edge-Case Mistakes

* Initially forgot:

```java
n <= 1
```

* This caused:

```text
n = 1
```

to incorrectly return `true`.

* Similarly:

```text
n = 0
```

would also incorrectly return `true`.

### Conceptual Misunderstandings

* Earlier attempts included:

  * Starting from `i = 1`
  * Using incorrect loop conditions
  * Using the wrong loop direction

* These were corrected during the problem-solving process.

## Hint (Without Spoiling)

Whenever checking whether something satisfies a property:

1. Search for evidence that proves it is invalid.
2. The moment you find such evidence, stop immediately.
3. If the search completes successfully, the property is valid.

This mindset appears frequently in DSA.

## Pattern Learned

* Pattern: **Early Exit Search (Validation Pattern)**
* Why it matters: Many problems only require finding one counterexample.

Template:

```java
for (...) {
    if (conditionFails) {
        return false;
    }
}

return true;
```

This pattern will appear later in:

* Prime Number Check ✅
* Sorted Array Verification
* Valid Parentheses
* Constraint Checking Problems
* Search & Validation Tasks

## Final Solution

### Java

```java
class Solution {
    public boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
```

### Python

```python
class Solution:
    def isPrime(self, n):

        if n <= 1:
            return False

        for i in range(2, n):

            if n % i == 0:
                return False

        return True
```

## Time Complexity

* Time: **O(n)**
* Explanation: In the worst case (when `n` is prime), every number from `2` to `n-1` is checked.

## Space Complexity

* Space: **O(1)**
* Explanation: Only a constant number of variables are used.

## Coach's Note

This problem shows a noticeable improvement compared to some earlier exercises.

Earlier, many mistakes involved:

* Choosing the wrong loop variable
* Updating the wrong variable
* Incorrect loop directions

Here, the main algorithm was correct almost immediately:

```java
for (...) {
    if (divisor found) {
        return false;
    }
}
return true;
```

That's an important milestone because it means you're focusing more on the problem logic and less on figuring out the basic structure.

The only remaining issue was an edge case:

```java
n <= 1
```

and edge cases are often the last thing programmers learn to consistently check.

My DSA foundation now includes:

1. If-Else Logic → ✅
2. Switch Case → ✅
3. Loops → ✅
4. Functions → ✅
5. Time & Space Complexity → ✅
6. Pattern Printing → ✅
7. Count Digits → ✅
8. Reverse Integer → ✅
9. Palindrome Number → ✅
10. GCD (Brute Force) → ✅
11. GCD (Euclidean Algorithm) → ✅
12. Armstrong Number → ✅
13. Prime Number Check → ✅
14. Early Exit Search Pattern → ✅

---

**Learning Journal Entry:** This problem strengthened my understanding through practice, reflection, and correction of mistakes.
