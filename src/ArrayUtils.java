import java.util.Arrays;

public class ArrayUtils {
    private int[] array;

    public ArrayUtils(int count) {
        array = new int[count];
        fill(1);
    }

    public void fill(int value) {
        Arrays.fill(array, value);
    }

    public void print() {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public void sum(OnCalculationListener calculationListener) {
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        if (calculationListener != null) {
            calculationListener.getResult(sum);
        }
    }

    public void findMax(HandlerFinder handlerFinder){
        int max=array[0];
        for (int i: array) {
            if(i>max){
                max=i;
            }
        }
        handlerFinder.iFined(max);
    }

    interface OnCalculationListener {
        void getResult(int sum);
    }
}

