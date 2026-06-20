# Palindrome Number

## Problem

* Problem statement: Given an integer `x`, return `true` if `x` is a palindrome and `false` otherwise.
* A palindrome number reads the same forward and backward.
* Examples:

  * `121 → true`
  * `123 → false`
  * `-121 → false`

## Progress Score

**98/100**

I understood the algorithm quickly because I recognized it as a variation of the Reverse Integer problem. Most of the corrections involved Java syntax, variable declarations, and loop control rather than the core DSA logic.

## What I Got Right

* I correctly saved the original number before modifying it.

  ```java
  int original = x;
  ```

* I correctly applied the reverse-number pattern:

  ```java
  digit = x % 10;
  x = x / 10;
  reverse = reverse * 10 + digit;
  ```

* I correctly compared the original number with the reversed number.

  ```java
  original == reverse
  ```

* I avoided unnecessary variables.

* I recognized that this problem is closely related to Reverse Integer.

## Where I Got Stuck

### Logic Mistakes

* Initially forgot to preserve the original value before modifying `x`.
* At one stage, used the wrong variable in the loop.

### Syntax/API Mistakes

* Wrote:

  ```java
  int reverse = 0; digit = 0;
  ```

  which is invalid because `digit` was not declared.

* Learned that Java requires either:

  ```java
  int reverse = 0, digit = 0;
  ```

  or separate declarations.

### Edge-Case Mistakes

* Negative numbers are not palindromes for this problem.
* Although the current implementation returns `false` for negative numbers because the loop never executes, it is important to consciously recognize the edge case.

### Conceptual Misunderstandings

* None. The palindrome logic itself was understood correctly.

## Hint (Without Spoiling)

Whenever a problem asks whether a number reads the same forward and backward, ask yourself:

1. Can I reverse the number?
2. Can I preserve the original value?
3. What happens if I compare both values afterward?

If you already know Reverse Integer, you're very close to the solution.

## Pattern Learned

* Pattern: **Reinforcement of Reverse Number**
* Why it matters: This problem is essentially:

```text
Reverse Integer
+
Compare with Original
```

Recognizing when a new problem is simply a variation of a previous one is an important DSA skill.

## Final Solution

### Java

```java
class Solution {
    public boolean isPalindrome(int x) {

        int reverse = 0;
        int digit = 0;
        int original = x;

        while (x > 0) {
            digit = x % 10;
            x = x / 10;
            reverse = reverse * 10 + digit;
        }

        return original == reverse;
    }
}
```

### Python

```python
class Solution:
    def isPalindrome(self, x: int) -> bool:

        reverse = 0
        original = x

        while x > 0:
            digit = x % 10
            x = x // 10
            reverse = reverse * 10 + digit

        return original == reverse
```

## Time Complexity

* Time: **O(d)**
* Explanation: The loop processes each digit exactly once, where `d` is the number of digits in the number.

## Space Complexity

* Space: **O(1)**
* Explanation: Only a few integer variables are used regardless of input size.

## Coach's Note

This problem shows an important milestone in DSA learning:

> I no longer approached the problem as something completely new.

Instead, I recognized it as a variation of Reverse Integer and reused an existing pattern. That's exactly how experienced problem solvers work. Rather than memorizing hundreds of solutions, they connect new problems to patterns they've already learned.

The biggest takeaway wasn't the palindrome check itself—it was realizing:

```text
Reverse Number Pattern
→ Compare With Original
→ Palindrome Check
```

That kind of pattern recognition will become increasingly valuable as I move into arrays, hashing, recursion, and more advanced DSA topics.

---

**Learning Journal Entry:** This problem strengthened my understanding through practice, reflection, and correction of mistakes.
