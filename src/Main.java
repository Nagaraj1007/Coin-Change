import java.util.Arrays;

public class Main {

    public static int minimumNumberOfCoins(int[] array, int amount){
        int sum = 0, count = 0;
        for(int iterator = array.length - 1 ; iterator >= 0 ; iterator--){
            while (sum <= amount){
                if (sum + array[iterator] <= amount){
                    sum += array[iterator];
                    count++;
                }else {
                    break;
                }
            }
            if(sum == amount){
                return count;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(minimumNumberOfCoins(new int[]{1,2,5,10,20}, 515 ));
    }
}