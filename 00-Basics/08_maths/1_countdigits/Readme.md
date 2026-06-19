# Count All Digits of a Number

## Problem

* Problem statement: Given an integer `n`, return the number of digits present in the number.
* Special case:

  * `0` contains **1 digit**.
* Example:

  * Input: `14`
  * Output: `2`

## Progress Score

**100/100**

I successfully understood the digit-removal approach and eventually arrived at the correct solution. Most of my difficulties were related to Java implementation details rather than the underlying algorithm.

## What I Got Right

* I recognized that repeatedly dividing by 10 removes digits.

* I understood the transformation:

  ```text
  234 → 23 → 2 → 0
  ```

* I identified that each digit removal should increase a counter.

* I correctly used a `while` loop to process the number digit by digit.

* I eventually handled the important edge case where `n = 0`.

## Where I Got Stuck

### Logic Mistakes

* Initially mixed up:

  * `n % 10` (extract last digit)
  * `n / 10` (remove last digit)

* For counting digits, only digit removal was required.

### Syntax/API Mistakes

* Initialized the counter incorrectly.
* Declared the counter inside the loop at one stage.
* Returned the wrong variable.
* Placed a return statement inside the loop during an earlier attempt.

### Edge-Case Mistakes

* Initially assumed:

  ```text
  0 has 0 digits
  ```

* Later corrected it to:

  ```text
  0 has 1 digit
  ```

### Conceptual Misunderstandings

* At one point, I updated a temporary variable instead of updating `n`, preventing the loop from progressing correctly.

## Hint (Without Spoiling)

* Ask yourself:

  * How can I remove the last digit of a number?
  * How many times can I repeat that process before the number becomes zero?
* The answer to the second question is exactly what the problem is asking for.

## Pattern Learned

* Pattern: **Digit Extraction & Digit Removal**
* Why it matters: This is one of the most important number-based patterns in DSA.

Core operations:

```java
n % 10   // Extract last digit
n / 10   // Remove last digit
```

This pattern will reappear in:

* Reverse Number
* Palindrome Number
* Armstrong Number
* Sum of Digits
* Product of Digits
* Digit Frequency Problems

## Final Solution

### Java

```java
class Solution {
    public int countDigit(int n) {

        if (n == 0) {
            return 1;
        }

        int count = 0;

        while (n > 0) {
            count++;
            n = n / 10;
        }

        return count;
    }
}
```

### Python

```python
class Solution:
    def countDigit(self, n):

        if n == 0:
            return 1

        count = 0

        while n > 0:
            count += 1
            n = n // 10

        return count
```

## Time Complexity

* Time: **O(d)**
* Explanation: The loop runs once for every digit in the number, where `d` is the number of digits.

## Space Complexity

* Space: **O(1)**
* Explanation: Only a few variables are used regardless of input size.

## Coach's Note

This was your first real digit-manipulation problem, and that's why it matters. The key achievement wasn't writing the final code—it was recognizing the pattern:

```text
Number → Remove Digit → Remove Digit → Remove Digit → 0
```

Once you see numbers this way, a whole category of DSA problems becomes much easier. Most of the mistakes here were implementation-related, which is normal when learning Java. The algorithmic thinking was already heading in the right direction.

---

**Learning Journal Entry:** This problem strengthened my understanding through practice, reflection, and correction of mistakes.
