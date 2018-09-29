# 技巧总结
---
### 常用结论

1. 有序数组中位数
    ```
    /* 
     *有序数组长度为length (length > 0)
     * length为奇数时，数组中位数为索引 (length >> 1 + 1)数组值, 
     * length为偶数时，数组中位数为索引 length >> 1 与 length >> 1 + 1 数组值的中位数
     */
    if (array.length / 2 == 0) {
        return (array[array.length / 2] + array[array.length / 2 + 1]) / 2;
    } else{
        return array[array.length / 2];
    }
    ```
 
2. 整数位值获取
    ```
    /*
     * 整数除以10取余，余数即为最小位数值
     */
    while (x > 0) {
        remainder = x % 10;
        x = x / 10;
    }
    ```


### 数据结构
1. 数组
	数组是一种特殊的Map结构，下标索引为key，数组值为Value

2. HashMap
	HashMap提供常量时间复杂度判断键与值
    如：
    ```
    easy.TwoSum
    ```

3. 栈Stack
    栈具有先进后出的性质，可用来作为元素的匹配
    如：
    ```
    easy.ValidParentheses
    ```

### 处理方式
1. 指针遍历
	指针遍历线性结构，特别是双指针一前一后或首尾相向遍历
    如:
    ```
    medium.LongestSubstring
    medium.LongestPalSubString
    medium.ContainerWithMostWater
    medium.ThreeNumClosest
    ```
2. 数组合并
	借助归并排序算法关于两个数组比较大小然后置于一数组的思想
    如：
    ```
    medium.AddTwoNumbers
    hard.MedianTwoSortedArrays
    ```
3. 寻找规律
    基于示例及类推寻找规律
    如：
    ```
    medium.ZigZagConversion
    ```
4. 值域越界
    值不断叠加出现越界情况，使用比需求值域大的类型存放该值，
    每次叠加过程中，判断值是否越过界
    如：
    ```
    medium.StringConverInteger
    ```    
5. 使用递归实现排列（排列组合中概念）
    对于归属于多个集合的元素进行排列，类似于二位数组花式遍历拼凑值
    可使用递归方式，递归内嵌套循环，每次循环获取下一个集合的下一个元素，与原有元素合并，最终即获得结果。
    如：
    ```
    medium.LetterCombinPhoneNum
    ```
### 算法

1. 分治法
	对复杂问题先拆分成小问题，对小问题处理后将结果合理合并，解决最初问题。

2. 递归
    递归原本指函数调用自身，借助传参及函数内的返回条件，实现调用的出口。
    递归是回溯法、分治法等多种算法实现的一种方式