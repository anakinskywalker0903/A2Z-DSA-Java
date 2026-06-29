# Two Sum

## Problem

* Problem statement: Given an integer array `nums` and an integer `target`, return the indices of the two numbers such that they add up to `target`.
* You may assume that each input has exactly one solution, and you may not use the same element twice.
* Examples:

```text
Input:
nums = [2,7,11,15]
target = 9

Output:
[0,1]
```

## Progress Score

**90/100**

I correctly identified the HashMap approach and understood the overall algorithm. Most of my difficulties came from Java syntax for returning arrays and storing values in the map rather than the algorithm itself.

## What I Got Right

* I correctly chose a `HashMap<Integer, Integer>` to store previously seen values.
* I correctly calculated the required complement.

```java
int need = target - num;
```

* I correctly checked whether the complement had already been seen.

```java
map.containsKey(need)
```

* I understood that the map should store:

```text
Number → Index
```

instead of storing frequencies.

## Where I Got Stuck

### Logic Mistakes

* None. The overall HashMap strategy was correct.

### Syntax/API Mistakes

* Returned:

```java
return map.get(need);
```

even though the method returns an `int[]`.

* Learned that Java arrays are returned using:

```java
return new int[]{map.get(need), i};
```

* Wrote:

```java
num = need[i];
```

instead of storing the current number and its index inside the map.

* Learned to use:

```java
map.put(num, i);
```

### Edge-Case Mistakes

* Forgot that every execution path in a method returning an array must return an array.

* Added:

```java
return new int[]{};
```

at the end of the method.

### Conceptual Misunderstandings

* Initially focused on retrieving values from the map without fully connecting what the map represented.

The key realization was:

```text
Key   → Number
Value → Index
```

## Hint (Without Spoiling)

Whenever a problem asks for **two values that combine to reach a target**, ask yourself:

1. What number do I need to complete the target?
2. Have I already seen that number?
3. If yes, where did I see it?

Those three questions naturally lead to the hashing solution.

## Pattern Learned

* Pattern: **HashMap Complement Search ⭐**
* Why it matters: Instead of searching every pair, store previously seen numbers so each lookup takes constant time.

Template:

```java
HashMap<Integer, Integer> map = new HashMap<>();

for (int i = 0; i < nums.length; i++) {

    int need = target - nums[i];

    if (map.containsKey(need)) {
        return new int[]{map.get(need), i};
    }

    map.put(nums[i], i);
}
```

This pattern appears in:

* Two Sum ✅
* Two Sum II (variation)
* Target Sum Variants
* Pair Sum Problems
* Difference Problems

## Final Solution

### Java

```java
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];
            int need = target - num;

            if (map.containsKey(need)) {
                return new int[]{map.get(need), i};
            }

            map.put(num, i);
        }

        return new int[]{};
    }
}
```

### Python

```python
class Solution:
    def twoSum(self, nums, target):

        seen = {}

        for i, num in enumerate(nums):

            need = target - num

            if need in seen:
                return [seen[need], i]

            seen[num] = i

        return []
```

## Time Complexity

* Time: **O(N)**
* Explanation: Each element is processed once, and HashMap lookups and insertions take **O(1)** on average.

## Space Complexity

* Space: **O(N)**
* Explanation: In the worst case, every element is stored in the HashMap.

## Coach's Note

This problem is a major milestone because it introduces a new way of using hashing.

In previous hashing problems:

* **Contains Duplicate** asked:

```text
Have I seen this value before?
```

* **Valid Anagram** and **Majority Element** asked:

```text
How many times has each value appeared?
```

Two Sum asks a different question:

```text
What value do I need,
and have I already seen it?
```

That's a different mindset from simple frequency counting.

The biggest lesson wasn't the algorithm—you understood that fairly quickly. The challenge was expressing that algorithm in Java, especially returning an array and storing indices correctly. Those are implementation details that become easier with practice.

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
✅ HashMap Frequency Analysis
✅ **HashMap Complement Search ⭐**

This problem completes your introduction to the three most common beginner HashMap patterns:

1. **Existence Checking** (Contains Duplicate)
2. **Frequency Counting** (Anagram, Majority Element)
3. **Complement Lookup** (Two Sum)

Recognizing which of these three patterns a problem requires will make many future array and hashing questions much easier to approach.

---

**Learning Journal Entry:** This problem strengthened my understanding through practice, reflection, and correction of mistakes.
