# Pattern-5: Reverse Right-Angled Triangle Pattern

## Problem

* Problem statement: Given an integer `n`, print the following pattern.

For `n = 5`:

```text
*****
****
***
**
*
```

* Problem link: Striver's A2Z DSA Course – Pattern Problems

## Progress Score

**99/100**

I independently figured out almost the entire solution. The only issue was a small typo in the outer loop condition.

## What I Got Right

* I realized the pattern starts with `n` stars.

* I correctly initialized the outer loop from `n`.

* I understood that the outer loop should decrease:

  ```java
  i--
  ```

* I correctly used the inner loop:

  ```java
  j < i
  ```

* I placed the newline in the correct position.

## Where I Got Stuck

### Logic Mistakes

* None.

### Syntax/API Mistakes

* None.

### Edge-Case Mistakes

* None.

### Conceptual Misunderstandings

* I wrote:

  ```java
  for (int i = n; i <= n - 1; i--)
  ```

* Since the condition was false immediately, the loop never executed.

* I learned that when a variable decreases, the comparison operator must reflect that direction.

## Hint (Without Spoiling)

Think about this sequence:

```text
n
n-1
n-2
...
1
```

Ask yourself:

> "When should the loop stop?"

The condition should remain true while there is at least one star left to print.

## Pattern Learned

* Pattern: **Reverse Incremental Triangle**
* Why it matters: This pattern is the mirror image of Pattern-2. Understanding both strengthens my ability to manipulate loop directions confidently.

## Final Solution

### Java

```java
class Solution {
    public void pattern5(int n) {

        for (int i = n; i >= 1; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
```

### Python

```python
class Solution:
    def pattern5(self, n):

        for i in range(n, 0, -1):

            for j in range(i):
                print("*", end="")

            print()
```

## Time Complexity

* Time: **O(N²)**
* Explanation: Total stars printed are:

  ```
  N + (N-1) + ... + 1
  ```

  which simplifies to O(N²).

## Space Complexity

* Space: **O(1)**
* Explanation: Only constant extra space is used.

## Coach's Note

I noticed real growth here. In the previous triangle pattern, I needed hints to understand why the inner loop depended on the row number. In this pattern, I independently figured out:

* Start from `n`
* Decrease the outer loop
* Keep the inner loop dependent on `i`

The only issue left was a comparison typo. That's no longer a pattern-recognition problem—it's just polishing syntax.

That's a strong sign that my problem-solving instincts are improving.

---

**Learning Journal Entry:** This problem strengthened my understanding through practice, reflection, and correction of mistakes.
