# 技巧总结
---

### 数据结构
1. 数组
	数组是一种特殊的Map结构，下标索引为key，数组值为Value

2. HashMap
	HashMap提供常量时间复杂度判断键与值
    如：
    ```
    easy.TwoSum
    ```

### 处理方式
1. 指针遍历
	指针遍历线性结构，特别是双指针一前一后或首尾相向遍历
    如:
    ```
    medium.LongestSubstring
    ```
2. 数组合并
	借助归并排序算法关于两个数组比较大小然后置于一数组的思想
    如：
    ```
    medium.AddTwoNumbers
    hard.MedianTwoSortedArrays
    ```

### 算法

1. 分治法
	对复杂问题先拆分成小问题，对小问题处理后将结果合理合并，解决最初问题。
