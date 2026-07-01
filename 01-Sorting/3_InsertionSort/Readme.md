# Insertion Sort

## Problem

* Problem statement: Given an integer array, sort it in ascending order using the **Insertion Sort** algorithm.
* Example:

```text id="rg0l4m"
Input:
[12, 11, 13, 5, 6]

Output:
[5, 6, 11, 12, 13]
```

## Progress Score

**100/100**

I successfully implemented Insertion Sort and understood the key idea behind it: instead of repeatedly swapping elements, I shift larger elements to create space for the current element and then insert it into its correct position.

## What I Got Right

* I correctly started the outer loop from the second element.

```java id="n2yc4l"
for(int i = 1; i < n; i++)
```

* I correctly stored the current element as the key.

```java id="pn8f0j"
int key = nums[i];
```

* I correctly initialized the comparison pointer.

```java id="zswdd2"
int j = i - 1;
```

* I correctly shifted larger elements to the right.

```java id="yzt0kw"
nums[j + 1] = nums[j];
```

* I correctly moved left while searching for the insertion position.

```java id="jlwmti"
j--;
```

* I correctly inserted the key after all necessary shifts.

```java id="18jlwm"
nums[j + 1] = key;
```

* I returned the sorted array correctly.

## Where I Got Stuck

### Logic Mistakes

* None in the final solution.

### Syntax/API Mistakes

* None.

### Edge-Case Mistakes

* None.

### Conceptual Misunderstandings

* Initially, the idea of **shifting** instead of immediately swapping elements was unfamiliar.

Once I understood that the goal was to create space for the key, the implementation became much more intuitive.

## Hint (Without Spoiling)

Think of sorting a hand of playing cards.

When you pick up a new card:

1. Hold it separately.
2. Move all larger cards one position to the right.
3. Place the held card into the empty position.

That's exactly how Insertion Sort works.

## Pattern Learned

* Pattern: **Insertion Sort ⭐**
* Why it matters: Instead of repeatedly finding the smallest element or swapping adjacent elements, Insertion Sort grows a sorted portion by inserting each new element into its proper position.

Template:

```java id="dmbkxd"
for(each unsorted element){

    save current element

    move left

    shift larger elements

    insert saved element
}
```

Core idea:

```text id="zyxy5n"
Sorted | Unsorted

Take first element from Unsorted

↓

Shift larger elements

↓

Insert into Sorted part

↓

Repeat
```

This pattern introduces:

* Maintaining a sorted prefix
* Element shifting
* Insertion into the correct position

## Final Solution

### Java

```java id="0gmk1r"
class Solution {
    public int[] insertionSort(int[] nums) {

        int n = nums.length;

        for(int i = 1; i < n; i++) {

            int key = nums[i];
            int j = i - 1;

            while(j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }

            nums[j + 1] = key;
        }

        return nums;
    }
}
```

### Python

```python id="4ngamq"
class Solution:
    def insertionSort(self, nums):

        n = len(nums)

        for i in range(1, n):

            key = nums[i]
            j = i - 1

            while j >= 0 and nums[j] > key:
                nums[j + 1] = nums[j]
                j -= 1

            nums[j + 1] = key

        return nums
```

## Time Complexity

* Time:

  * **Worst Case:** **O(N²)**
  * **Average Case:** **O(N²)**
  * **Best Case:** **O(N)**
* Explanation:

  * In the worst case (reverse sorted array), every element is shifted through the sorted portion.
  * In the best case (already sorted array), each element requires only one comparison.

## Space Complexity

* Space: **O(1)**
* Explanation: The algorithm sorts the array in place using only a few extra variables.

## Coach's Note

This problem completes my introduction to the three fundamental comparison-based sorting algorithms.

Unlike Selection Sort, which repeatedly searches for the minimum, or Bubble Sort, which repeatedly swaps adjacent elements, Insertion Sort takes a different approach:

> **Treat the left side as already sorted, then insert the next element into its correct position.**

The biggest conceptual breakthrough for me was understanding that elements are **shifted**, not immediately swapped. Once that idea clicked, every line of the implementation made sense:

```text id="ycafzz"
Pick the key
↓

Look left
↓

Shift larger elements
↓

Insert the key
```

Another encouraging sign is that the implementation itself no longer felt mysterious. Earlier in my DSA journey, I often struggled with loop boundaries and variable updates. Now, I'm beginning to understand the reasoning behind each step instead of simply memorizing code.

### Sorting Algorithms Learned

#### ✅ Selection Sort

**Idea**

> Find the smallest element and place it at the beginning.

* Time: **O(N²)**
* Space: **O(1)**

---

#### ✅ Bubble Sort

**Idea**

> Swap adjacent elements that are out of order.

* Worst Time: **O(N²)**
* Best Time: **O(N)** (optimized version)
* Space: **O(1)**

---

#### ✅ Insertion Sort ⭐

**Idea**

> Shift larger elements and insert the current element into its correct position.

* Worst Time: **O(N²)**
* Best Time: **O(N)**
* Space: **O(1)**

### DSA Pattern Toolbox

✅ Pattern Printing
✅ Digit Extraction & Processing
✅ Euclidean Algorithm
✅ Early Exit Search
✅ Recursive Patterns (Build-Up, Return Formula, Branching)
✅ Two Pointers
✅ Two Pointers with Character Filtering
✅ Hashing Patterns (Seen Before, Frequency Counting, Frequency Analysis, Complement Search)
✅ Selection Sort
✅ Bubble Sort
✅ **Insertion Sort ⭐**

With the three basic sorting algorithms complete, I'm ready to move on to **Merge Sort**, where sorting and recursion come together. That will build directly on both my recursion foundation and my understanding of sorting algorithms.

---

**Learning Journal Entry:** This problem strengthened my understanding through practice, reflection, and correction of mistakes.
