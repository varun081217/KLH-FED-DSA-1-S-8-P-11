# ExamDesk – Duplicate Attendance

## Week 1: Duplicate Attendance Detection

### 1. Project Overview
ExamDesk is a Java-based project designed to solve practical examination and evaluation problems using Data Structures and Algorithms.

The first module, **Duplicate Attendance**, identifies roll numbers entered more than once and generates an attendance report.

### 2. Problem Statement
Given a list of student roll numbers, the program must:
- Count the number of distinct roll numbers.
- Count how many different roll numbers are repeated.
- Identify the first roll number that appears for the second time.

### 3. Technologies Used
- Programming Language: Java
- Data Structures: Array and HashMap
- IDE: Java-supported IDE

### 4. Algorithm
1. Read the number of students.
2. Store all roll numbers in an integer array.
3. Create a HashMap to maintain the frequency of each roll number.
4. Traverse the array and update each roll number's frequency.
5. If its frequency becomes 1, increment `distinct`.
6. If its frequency becomes 2, increment `repeats` and record the first repeated roll number.
7. Display the final attendance report.

### 5. Sample Input

```text
Enter number of students: 6
Enter roll number 1: 101
Enter roll number 2: 102
Enter roll number 3: 103
Enter roll number 4: 101
Enter roll number 5: 104
Enter roll number 6: 102
```

### 6. Expected Output

```text
===== ATTENDANCE REPORT =====
Distinct roll numbers: 4
Repeated roll numbers: 2
First repeated roll number: 101
```

### 7. Complexity Analysis

| Type | Complexity | Explanation |
|---|---|---|
| Time | O(n) | Two loops process n roll numbers; HashMap operations take expected O(1) time each. |
| Space | O(n) | Array and HashMap store up to n entries. |

Here, `n` represents the number of students.

### 8. Concepts Learned
- Java arrays and loops
- HashMap and frequency counting
- `getOrDefault()` and `put()`
- Conditional statements
- Dry runs and edge-case testing
- Time and space complexity
- Big-O notation

### 9. Conclusion
The Duplicate Attendance module successfully identifies repeated student roll numbers using a HashMap. The solution achieves expected O(n) time complexity and O(n) space complexity.