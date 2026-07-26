package Striver_Blind_75_LeetCode_Problems.Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class Find_Median_from_Data_Stream {

    // Leetcode template code

    static class MedianFinder {

        PriorityQueue<Integer> minheap;
        PriorityQueue<Integer> maxheap;
        public MedianFinder() {
            minheap=new PriorityQueue<>();
            maxheap=new PriorityQueue<>(Collections.reverseOrder());
        }

        public void addNum(int num) {
            maxheap.add(num);
            minheap.add(maxheap.poll());
            if(minheap.size()>maxheap.size()){
                maxheap.add(minheap.poll());
            }
        }

        public double findMedian() {
            if (maxheap.size() > minheap.size()) {
                return maxheap.peek();
            }

            return (maxheap.peek() + minheap.peek()) / 2.0;
        }
    }
}
