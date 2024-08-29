# Sorting Algorithms

## Bubble Sort

### Algorithm
- Compares adjacent items and swaps them if they are in the wrong order.
- Continues to pass through the list until no swaps are needed.

### Complexity
- **Time Complexity**: O(n^2) in the worst and average cases.
- **Space Complexity**: O(1).

### Features
- Simple and easy to implement.
- Not suitable for large datasets due to inefficiency.

## Merge Sort

### Algorithm
- Divide and conquer approach.
- Divides the list into two halves, recursively sorts each half, and then merges the sorted halves.

### Complexity
- **Time Complexity**: O(n log n) in all cases (worst, average, and best).
- **Space Complexity**: O(n) due to the additional space required for the merge process.

### Features
- Stable sort (preserves the relative order of equal elements).
- Well-suited for large datasets and linked lists.
- Efficient with consistent performance.

## Insertion Sort

### Algorithm
- Builds the final sorted array one item at a time.
- Picks each item from the input data and inserts it into its correct position in the already-sorted part of the array.

### Complexity
- **Time Complexity**: O(n^2) in the worst and average cases, O(n) in the best case (when the list is already sorted).
- **Space Complexity**: O(1).

### Features
- Simple and efficient for small datasets or nearly sorted data.
- Adaptive and stable sort.

## Selection Sort

### Algorithm
- Repeatedly selects the minimum (or maximum) element from the unsorted portion of the list and moves it to the end of the sorted portion.

### Complexity
- **Time Complexity**: O(n^2) in all cases.
- **Space Complexity**: O(1).

### Features
- Simple to implement but inefficient on large lists.
- Not adaptive and generally not stable.

## Quick Sort

### Algorithm
- Divide and conquer approach.
- Picks an element as a pivot and partitions the array around the pivot.
- Recursively sorts the sub-arrays formed by partitioning.

### Complexity
- **Time Complexity**: O(n^2) in the worst case (rare with good implementations), O(n log n) on average.
- **Space Complexity**: O(log n) on average due to recursion stack space.

### Features
- Typically faster in practice than other O(n log n) algorithms.
- Not stable.
- Performance can degrade if a poor pivot is chosen consistently.
