# Pattern-2: Right-Angled Triangle Pattern

## Problem

* Problem statement: Given an integer `n`, print the following pattern:

For `n = 5`:

```text
*
**
***
****
*****
```

* Problem link: Striver's A2Z DSA Course – Pattern Problems

## Progress Score

**98/100**

I successfully discovered the core pattern logic on my own. The only issue I encountered was a language-specific syntax mistake in Java. The algorithm itself was correct.

## What I Got Right

* I correctly used the outer loop to generate `n` rows.

```java
for (int i = 0; i < n; i++)
```

* I realized that the number of stars depends on the current row.
* I correctly changed the inner loop condition to:

```java
j < i + 1
```

* I maintained the newline after completing each row.
* I derived the pattern instead of memorizing the solution.

## Where I Got Stuck

### Logic Mistakes

* Initially, I considered using:

```java
j < i
```

but after reasoning through the iterations, I understood that it skips the first star and produces an incorrect first row.

### Syntax/API Mistakes

* I attempted to use:

```java
System.out.print("*" * n);
```

* I learned that Java cannot multiply strings using `*`, unlike Python.

### Edge-Case Mistakes

* None.
* The logic correctly handles all values of `n ≥ 1`.

### Conceptual Misunderstandings

* None.
* Once I recognized that row `i` should contain `i + 1` stars, the pattern became clear.

## Hint (Without Spoiling)

* Ask yourself:

> "How many elements should this particular row contain?"

* If the answer changes with the row number, the inner loop boundary should depend on the outer loop variable.

* Also remember:

> The loop itself determines repetition. You don't need extra multiplication to print multiple characters.

## Pattern Learned

* Pattern: **Incremental Triangle Pattern**
* Why it matters:

This is one of the first genuine pattern insights in DSA.

When using zero-based indexing:

> **Row `i` contains `i + 1` elements.**

This observation reappears in many future pattern-printing problems.

## Final Solution

### Java

```java
class Solution {
    public void pattern2(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i + 1; j++) {
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
    def pattern2(self, n):

        for i in range(n):

            for j in range(i + 1):
                print("*", end="")

            print()
```

## Time Complexity

* Time: **O(N²)**
* Explanation:

The inner loop runs:

```text
1 + 2 + 3 + ... + N
```

times.

This equals:

```text
N(N + 1) / 2
```

which simplifies to **O(N²)**.

## Space Complexity

* Space: **O(1)**
* Explanation:

Only loop variables are used. No extra memory proportional to `n` is required.

## Coach's Note

This problem marks an important shift in my DSA journey.

In the previous pattern, every row looked the same. Here, I had to identify what changes from row to row and express that change mathematically.

My progression looked like this:

* Attempt 1: Print `n` stars in every row.
* Attempt 2: Question whether `j < i` works.
* Attempt 3: Discover that the row number controls the number of stars.
* Attempt 4: Derive the formula `j < i + 1`.

The biggest takeaway is that I didn't simply copy the answer—I reasoned my way to the pattern. That's exactly how algorithmic thinking develops.

My foundation so far:

1. Printing and input handling → ✅
2. If-Else decision making → ✅
3. Switch-case branching → ✅
4. For loops → ✅
5. While loops → ✅
6. Functions and return values → ✅
7. Time & Space Complexity → ✅
8. Rectangular patterns → ✅
9. Incremental triangle patterns → ✅

---

**Learning Journal Entry:** This problem strengthened my understanding through practice, reflection, and correction of mistakes.
