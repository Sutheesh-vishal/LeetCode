package Array;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> arr = new ArrayList<>();

        if(numRows==0) return arr;

        List<Integer> first = new ArrayList<>();
        first.add(1);
        arr.add(first);

        for(int i=1;i<numRows;i++){
            List<Integer> Previous = arr.get(i-1);
            List<Integer> result = new ArrayList<>();

            result.add(1);
            for(int j = 1;j<i;j++){
                result.add(Previous.get(j-1)+Previous.get(j));
            }
            result.add(1);
            arr.add(result);

            
        }
        return arr;
        
    }
    public static void main(String[] args) {
        PascalsTriangle Coffee = new PascalsTriangle();
        System.out.println(Coffee.generate(5));
    }
}
