# Armstrong Number

## Problem

* Problem statement: Given a 3-digit integer `n`, determine whether it is an Armstrong Number.
* A 3-digit Armstrong Number is a number equal to the sum of the cubes of its digits.
* Examples:

```text
153 = 1³ + 5³ + 3³
    = 1 + 125 + 27
    = 153
```

Output:

```text
true
```

```text
123 = 1³ + 2³ + 3³
    = 1 + 8 + 27
    = 36
```

Output:

```text
false
```

## Progress Score

**100/100**

I correctly solved the problem and independently applied the digit extraction pattern that I had already learned from previous number-based problems. Most of the corrections involved Java syntax rather than algorithmic thinking.

## What I Got Right

* I immediately recognized this as a digit-manipulation problem.
* I correctly preserved the original number.

```java
int og = n;
```

* I correctly extracted digits using:

```java
digit = n % 10;
```

* I correctly removed digits using:

```java
n = n / 10;
```

* I maintained a running sum of the cubes of the digits.
* I correctly compared the final sum with the original number.

## Where I Got Stuck

### Logic Mistakes

* Initially considered using a loop variable instead of directly processing the number itself.

### Syntax/API Mistakes

* Wrote:

```java
sum =+ value;
```

instead of:

```java
sum += value;
```

* Tried Python exponent syntax:

```java
digit ** 3
```

which Java does not support.

* Tried:

```java
digit.Math.pow(3)
```

which is invalid Java syntax.

* Used:

```java
if(og = sum)
```

instead of:

```java
if(og == sum)
```

### Edge-Case Mistakes

* None.

### Conceptual Misunderstandings

* None. The underlying Armstrong Number logic was understood correctly.

## Hint (Without Spoiling)

Whenever a problem asks you to process every digit individually:

1. Extract the last digit.
2. Perform the required operation on that digit.
3. Add the result to an accumulator.
4. Remove the processed digit.
5. Repeat until no digits remain.

The only thing that changes between digit problems is what you do with the extracted digit.

## Pattern Learned

* Pattern: **Digit Extraction & Processing (Reinforcement)**
* Why it matters: This pattern appears repeatedly in number-based DSA problems.

Core template:

```java
while(n > 0){
    int digit = n % 10;
    n = n / 10;

    // Process digit
}
```

Previously used in:

* Count Digits ✅
* Reverse Integer ✅
* Palindrome Number ✅
* Armstrong Number ✅

The loop remains the same. Only the processing step changes.

## Final Solution

### Java

```java
class Solution {
    static boolean armstrongNumber(int n) {

        int digit = 0;
        int sum = 0;
        int og = n;

        while (n > 0) {
            digit = n % 10;
            n = n / 10;
            sum += digit * digit * digit;
        }

        if (og == sum) {
            return true;
        } else {
            return false;
        }
    }
}
```

### Python

```python
class Solution:
    @staticmethod
    def armstrongNumber(n):

        digit = 0
        total = 0
        original = n

        while n > 0:
            digit = n % 10
            n = n // 10
            total += digit * digit * digit

        return original == total
```

## Time Complexity

* Time: **O(d)**
* Explanation: The loop runs once for each digit in the number, where `d` is the number of digits.

## Space Complexity

* Space: **O(1)**
* Explanation: Only a fixed number of variables are used regardless of input size.

## Coach's Note

This problem shows clear progress compared to your earlier digit-manipulation problems.

Earlier, much of the effort went into figuring out:

* Which loop to use
* Which variable to update
* How `% 10` and `/ 10` work

In this problem, you immediately knew:

```java
digit = n % 10;
n = n / 10;
```

and focused on what should happen with the digit after extraction.

That's an important shift because it means the digit-extraction pattern is starting to become automatic.

The strongest sign of progress is that most corrections were syntax-related rather than algorithm-related. The DSA logic was already in place.

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
10. GCD (Euclidean Algorithm) → ✅
11. Armstrong Number → ✅

---

**Learning Journal Entry:** This problem strengthened my understanding through practice, reflection, and correction of mistakes.
