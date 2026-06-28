# Majority Element

## Problem

* Problem statement: Given an integer array `nums`, return the element that appears more than `⌊n/2⌋` times.
* It is guaranteed that a majority element exists.
* Examples:

```text
Input: [3,2,3]
Output: 3
```

```text
Input: [2,2,1,1,1,2,2]
Output: 2
```

## Progress Score

**100/100**

I successfully solved this problem using a `HashMap` to count frequencies. I independently applied the frequency-counting pattern learned in the previous hashing problem, and the only issue was a small variable-name typo.

## What I Got Right

* I correctly chose a `HashMap<Integer, Integer>` to store frequencies.
* I correctly counted occurrences using:

```java
map.put(num, map.getOrDefault(num, 0) + 1);
```

* I correctly iterated through all map entries using:

```java
for (Map.Entry<Integer, Integer> entry : map.entrySet())
```

* I correctly compared each frequency against:

```java
nums.length / 2
```

* I correctly returned the corresponding key once the majority element was found.

## Where I Got Stuck

### Logic Mistakes

* None.

### Syntax/API Mistakes

* Accidentally wrote:

```java
entr.getValue()
```

instead of:

```java
entry.getValue()
```

This was simply a variable-name typo.

### Edge-Case Mistakes

* None.

### Conceptual Misunderstandings

* None. The hashing and frequency-counting logic was correct throughout the solution.

## Hint (Without Spoiling)

Whenever a problem asks:

> "Which element appears the most?"

or

> "Which element appears more than a certain number of times?"

consider these steps:

1. Count every occurrence.
2. Examine the frequencies.
3. Return the element that satisfies the required condition.

## Pattern Learned

* Pattern: **HashMap Frequency Analysis ⭐**
* Why it matters: After building frequencies, many problems require analyzing those frequencies instead of simply checking for duplicates.

### Step 1: Count Frequencies

```java
for (int num : nums) {
    map.put(num, map.getOrDefault(num, 0) + 1);
}
```

### Step 2: Analyze Frequencies

```java
for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

    if (entry.getValue() > limit) {
        return entry.getKey();
    }
}
```

This pattern appears in:

* Majority Element ✅
* Top K Frequent Elements
* Frequency Sort
* Most Common Word
* Character Frequency Analysis

## Final Solution

### Java

```java
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() > nums.length / 2) {
                return entry.getKey();
            }
        }

        return -1;
    }
}
```

### Python

```python
class Solution:
    def majorityElement(self, nums):

        freq = {}

        for num in nums:
            freq[num] = freq.get(num, 0) + 1

        limit = len(nums) // 2

        for key, value in freq.items():
            if value > limit:
                return key

        return -1
```

## Time Complexity

* Time: **O(N)**
* Explanation: One pass counts the frequencies, and another pass iterates through the distinct elements in the hash map. Overall complexity remains linear.

## Space Complexity

* Space: **O(N)**
* Explanation: In the worst case, every element is distinct and stored in the hash map.

## Coach's Note

This problem is less about finding the majority element and more about reinforcing your understanding of **frequency maps**.

A few problems ago, you were still becoming familiar with methods like:

```java
put()
containsKey()
getOrDefault()
```

Now you've comfortably used:

* `HashMap<Integer, Integer>`
* `getOrDefault()`
* `entrySet()`
* `entry.getKey()`
* `entry.getValue()`

to solve the problem with almost no guidance. The only correction needed was a simple typo in the variable name.

This also introduces an important distinction between two hashing patterns:

### Pattern 1 — Seen Before

```java
Have I seen this element already?
```

Used in:

* Contains Duplicate

### Pattern 2 — Frequency Counting

```java
How many times has this element appeared?
```

Used in:

* Valid Anagram
* Majority Element

As you continue, you'll start recognizing which hashing pattern a problem is asking for before writing any code.

### DSA Pattern Toolbox

✅ Pattern Printing
✅ Digit Extraction & Processing
✅ Euclidean Algorithm
✅ Early Exit Search
✅ Recursive Patterns (Build-Up, Return Formula, Branching)
✅ Two Pointers
✅ Two Pointers with Character Filtering
✅ Hashing – Seen Before Pattern
✅ HashMap Frequency Counting
✅ **HashMap Frequency Analysis ⭐**

You're now transitioning from learning individual Java APIs to selecting the right data structure and pattern for a problem. That's a major step toward interview-level problem solving.

---

**Learning Journal Entry:** This problem strengthened my understanding through practice, reflection, and correction of mistakes.
