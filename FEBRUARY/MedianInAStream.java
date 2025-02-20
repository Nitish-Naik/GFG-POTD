package FEBRUARY;

import java.util.*;

public class MedianInAStream {
    
        public static ArrayList<Double> getMedian(int[] arr) {
          // code here
          int n = arr.length;
          
          ArrayList<Double>ans = new ArrayList<>();
          
          
          PriorityQueue<Integer> lpq = new PriorityQueue<>(Collections.reverseOrder());
          PriorityQueue<Integer> rpq = new PriorityQueue<>();
          //rpq = rightPQ default java Min PriorityQueue
          //lpq = leftPQ it is max PriorityQueue
          for(int i = 0; i<n; i++){
              if(lpq.size() == rpq.size()){
                  rpq.add(arr[i]);
                  int val = rpq.remove();
                  lpq.add(val);
                  double ele = lpq.peek();
                  ans.add(ele);
              }else{
                  lpq.add(arr[i]);
                  int val = lpq.remove();
                  rpq.add(val);
                  double ele = (lpq.peek()+rpq.peek());
                  ans.add(ele/2);
              }
          }
          return ans;
      }

    public static void main(String[] args) {
        int[] a = {5, 15, 1, 3, 2, 8};
        System.out.println(getMedian(a)); 
    }
}