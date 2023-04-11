public class NewArray {
    public static void main(String[] args) {
        String[][] array = new String[7][10];
        char symbol = 'a';
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < 6; j++) {
                array[i][j] = symbol + "" + (j + 1);
                System.out.print(array[i][j] + " ");
            }
            symbol++;
            System.out.println();
        }
    }
}
