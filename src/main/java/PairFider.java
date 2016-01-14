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

        int[] arr = {0,1,1,3,2};
        summer(arr,3);
    }
}
