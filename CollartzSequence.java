
import java.util.Scanner;

public class CollartzSequence {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int num;
        int count = 0;
        
        System.out.print("Starting number: ");
        num = keyboard.nextInt();
        
        System.out.print(num + " ");
        while(count == 0){
        if(num==1){
        break;
                }
        else if(num%2==0){
        num = num/2;
        System.out.print(num + " ");
        continue;
                }
        else if(num%2!=0){
        num =3 * num+1;
        System.out.print(num + " ");
        continue;
        }
        }
    }
}
