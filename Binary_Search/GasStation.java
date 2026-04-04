import java.util.PriorityQueue;

class Pair {
    double distance;
    int index;
    
    Pair(double distance, int index){
        this.distance=distance;
        this.index=index;
    }
}
public class GasStation {
    public double minimiseMaxDistance(int[] arr, int k) {
        int n=arr.length-1;
        int []howMany= new int[n-1];
        PriorityQueue<Pair> pq= new PriorityQueue<>(
            (a,b)->Double.compare(b.distance,a.distance)
        );
        for(int i=0;i<n-1;i++){
            pq.add(new Pair(arr[i+1]-arr[i], i));
        }
        for(int gasSt=1;gasSt<=k;gasSt++){
            Pair top=pq.poll();
            int index=top.index;
            howMany[index]++;
            double totalDist = arr[index+1] - arr[index];
            double newDist= totalDist/(howMany[index] + 1);
            pq.add(new Pair(newDist,index));
        }
        return pq.peek().distance;
    }
}

//Question
/*
Minimize Max Distance to Gas Station

Given a sorted array arr of size n, containing integer positions of n gas stations on the X-axis, and an integer k, place k new gas stations on the X-axis.
The new gas stations can be placed anywhere on the non-negative side of the X-axis, including non-integer positions.
Let dist be the maximum distance between adjacent gas stations after adding the k new gas stations.

Find the minimum value of dist.
Your answer will be accepted if it is within 1e-6 of the true value.

Example 1
Input: n = 10, arr = [1, 2, 3, 4, 5, 6 ,7, 8, 9, 10], k = 10
Output: 0.50000

Explanation:
One of the possible ways to place 10 gas stations is [1, 1.5, 2, 2.5, 3, 3.5, 4, 4.5, 5, 5.5, 6, 6.5, 7, 7.5, 8, 8.5, 9, 9.5, 10].
Thus the maximum difference between adjacent gas stations is 0.5.
Hence, the value of dist is 0.5.
It can be shown that there is no possible way to add 10 gas stations in such a way that the value of dist is lower than this.
*/