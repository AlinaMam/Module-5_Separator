import java.util.Arrays;

public class Separator {
    int[] array;

    public Separator(int[] array) {
        this.array = array;
    }

    public static void main(String[] args) {
        Separator separator = new Separator(new int[]{2, 6, 8, 9, 1, 5, 4});
        separator.even();
        System.out.println();
        separator.odd();
    }

    public int[] even() {

        int countElements = 0;
        for (int elements1 : array) {
            if (elements1 % 2 == 0)
                countElements++;
        }

        int[] newArray1 = new int[countElements];
        int newElements1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                newArray1[newElements1] = array[i];
                System.out.print(newArray1[newElements1] + " ");
                newElements1++;
            }
        }
        return newArray1;
    }


    public int[] odd() {
        int unCountElements = 0;
        for (int elements1 : array) {
            if (elements1 % 2 != 0)
                unCountElements++;
        }

        int[] newArray2 = new int[unCountElements];
        int newElements2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                newArray2[newElements2] = array[i];
                System.out.print(newArray2[newElements2] + " ");
                newElements2++;
            }
        }
        return newArray2;
    }
}






