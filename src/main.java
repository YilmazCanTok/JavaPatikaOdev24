
import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        System.out.println("****************************************************************");
        Scanner scanner = new Scanner(System.in);
        int[] array = {15, 12, 788, 1, -1, -778, 2, 0};
        System.out.print("Lütfen Bir değer Giriniz : ");
        int value = scanner.nextInt();
        System.out.println("----------------------------------------------------------------");
        int lenght = array.length;
        int index = 0;
        int j = 0;
        int[] newarray = new int[lenght+1];
        for (int i = 0; i < newarray.length; i++) {
            if (i == index) {
                newarray[0] = value;
            }
            else{
                newarray[i] = array[j];
                j++;
            }
        }
        Arrays.sort(newarray);
        System.out.println("Yeni Arrayiniz : "+Arrays.toString(newarray));
        for (int i = 0; i < 9; i++) {
            if (newarray[i]==value) {
                System.out.println("Sayınızdan küçük en büçük değer : " + newarray[i - 1]);
                System.out.println("Sayınızdan büyük en küçük değer : " + newarray[i + 1]);
            }
            
        }
        System.out.println("----------------------------------------------------------------");

        System.out.println("****************************************************************");
    }

}
