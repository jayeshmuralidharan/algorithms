import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by KZ4RJG on 1/13/2016.
 */
public class PairFider {

    private class Pair {
        int x;

        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int isSumValid() {

            return x + y;
        }
    }

    public static void summer(int[] arr, int value) {

        if (arr.length < 0) {
            System.out.println("No match");
        } else {

            for (int i = 0; i < arr.length - 1; i++) {
                //0,6,1,3,2
                if (arr[i] > value) {
                    i++;
                }

                for (int j = i+1; j < arr.length; j++) {

                   if(i+j==value){
                       System.out.println("Pair is "+ i+ ","  + j);
                   }
                }

            }

        }


    }

    public static void main(String[] args) {
        int value = 3;
        int[] arr = {0,1,1,3,2};
        int[] sortedArr = MergeSort.sort(arr);
        List<Integer> list = new ArrayList<>();
                Collections.addAll(list, Arrays.stream(sortedArr).boxed().toArray(Integer[]::new));
//                Arrays.stream(sortedArr).boxed().collect(Collectors.toList());
        HashSet<Integer> hashSet = new HashSet<Integer>(list);

        for(int i = 0; i <= sortedArr.length/2;i++ ){

            int findVal = value - sortedArr[i];
            if(hashSet.contains(findVal)){
                System.out.println(arr[i]+findVal);
            }
        }

        summer(arr, 3);
    }
}
