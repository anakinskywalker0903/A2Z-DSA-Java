# Valid Anagram

## Problem

* Problem statement: Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, otherwise return `false`.
* An anagram contains exactly the same characters with the same frequencies.
* Examples:

```text id="8n1qxo"
Input:
s = "anagram"
t = "nagaram"

Output:
true
```

```text id="62xy2v"
Input:
s = "rat"
t = "car"

Output:
false
```

## Progress Score

**100/100**

I successfully solved this problem using a `HashMap` for character frequency counting. I correctly built, updated, and validated the frequency map, demonstrating a solid understanding of hashing concepts.

## What I Got Right

* I correctly handled the simplest edge case by checking string lengths first.

```java id="d9yz9j"
if(s.length() != t.length()){
    return false;
}
```

* I created the appropriate `HashMap` to store character frequencies.

```java id="k5kwxs"
HashMap<Character, Integer> map = new HashMap<>();
```

* I correctly iterated through the first string using `charAt()`.

* I correctly increased character frequencies using:

```java id="v4oqpd"
map.getOrDefault(ch, 0) + 1
```

* I correctly decreased frequencies while processing the second string.

* I correctly verified that every frequency became zero before returning `true`.

## Where I Got Stuck

### Logic Mistakes

* Initially forgot the final validation step that checks whether all frequencies return to zero.

### Syntax/API Mistakes

* Initially struggled with:

  * Iterating through a `String`
  * `Integer` type syntax
  * `containsKey()` usage

* Learned how to use:

  * `charAt()`
  * `getOrDefault()`
  * `map.values()`

correctly.

### Edge-Case Mistakes

* None in the final solution.

### Conceptual Misunderstandings

* None. Once the frequency-counting pattern clicked, the overall solution became straightforward.

## Hint (Without Spoiling)

Whenever two collections must contain the **same elements with the same frequencies**, ask yourself:

1. Can I count occurrences from the first collection?
2. Can I remove those counts while processing the second?
3. If every count becomes zero, what does that tell me?

That thought process solves many hashing problems.

## Pattern Learned

* Pattern: **HashMap Frequency Counting ⭐**
* Why it matters: Frequency counting is one of the most common hashing techniques in coding interviews.

### Step 1: Build Frequencies

```java id="pj5cyg"
for(each character){
    map.put(ch, map.getOrDefault(ch, 0) + 1);
}
```

### Step 2: Reduce Frequencies

```java id="uddc5o"
for(each character){
    map.put(ch, map.getOrDefault(ch, 0) - 1);
}
```

### Step 3: Validate

```java id="z7v9zr"
for(Integer value : map.values()){

    if(value != 0){
        return false;
    }
}

return true;
```

This same pattern appears in:

* Valid Anagram ✅
* Ransom Note
* Find All Anagrams in a String
* Group Anagrams
* Character Frequency Problems

## Final Solution

### Java

```java id="6psd4w"
import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) - 1);
        }

        for (Integer value : map.values()) {
            if (value != 0) {
                return false;
            }
        }

        return true;
    }
}
```

### Python

```python id="im4lg0"
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:

        if len(s) != len(t):
            return False

        freq = {}

        for ch in s:
            freq[ch] = freq.get(ch, 0) + 1

        for ch in t:
            freq[ch] = freq.get(ch, 0) - 1

        for value in freq.values():
            if value != 0:
                return False

        return True
```

## Time Complexity

* Time: **O(N)**
* Explanation: Each string is traversed once, and the frequency map is checked once. All `HashMap` operations are **O(1)** on average.

## Space Complexity

* Space: **O(K)**
* Explanation: The hash map stores at most one entry for each unique character, where `K` is the number of distinct characters. In the worst case, this is **O(N)**.

## Coach's Note

This problem is an important milestone because it introduces your **second major hashing pattern**.

In **Contains Duplicate**, the question was simply:

> "Have I seen this element before?"

Now the question has evolved into:

> "How many times have I seen each element?"

That shift—from checking existence to tracking frequencies—is one of the biggest steps in learning hashing.

What impressed me most is how much your Java fluency has improved. Earlier, you were still learning methods like:

```java id="y1k8jw"
containsKey()
put()
```

In this problem, you comfortably used:

* `HashMap<Character, Integer>`
* `charAt()`
* `getOrDefault()`
* `map.values()`

to build a complete solution with very little guidance.

One thing to remember for future interviews: because this problem specifies **only lowercase English letters**, an `int[26]` frequency array would be even more efficient than a `HashMap`. Learning the `HashMap` solution first, however, builds a stronger foundation that will transfer to problems involving arbitrary characters and other data types.

### DSA Pattern Toolbox

✅ Pattern Printing
✅ Digit Extraction & Processing
✅ Euclidean Algorithm
✅ Early Exit Search
✅ Recursive Patterns (Build-Up, Return Formula, Branching)
✅ Two Pointers
✅ Two Pointers with Character Filtering
✅ Hashing – Seen Before Pattern
✅ **HashMap Frequency Counting ⭐**

You're no longer just learning Java APIs—you've started recognizing when a problem is asking for a specific DSA pattern. That's exactly the transition from learning syntax to solving interview problems.

---

**Learning Journal Entry:** This problem strengthened my understanding through practice, reflection, and correction of mistakes.
