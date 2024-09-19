import java.util.Scanner;

public class Practical_ass_3 {
    public static void main(String[] args) {
        System.out.println("Enter String : ");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] strarray= str.split(" ");
        String rev = "";
        for(int i = strarray.length-1;i>0;i--){
            rev +=" "+ strarray[i];
        }
        System.out.println(rev);
    }
}
