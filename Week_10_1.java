
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 6student107
 */
public class Week_10_1 {
    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        String numstr = Integer.toString(num); 
        String Alpha = "";
        for(char n : numstr.toCharArray()){
            if(n=='1'){
                Alpha+=" ONE";
            }
            else if(n=='2'){
                Alpha+=" TWO";
            }
            else if(n=='3'){
                Alpha+=" THREE";
            }
            else if(n=='4'){
                Alpha+=" FOUR";
            }
            else if(n=='5'){
                Alpha+=" FIVE";
            }
            else if(n=='6'){
                Alpha+=" SIX";
            }
            else if(n=='7'){
                Alpha+=" SEVEN";
            }
            else if(n=='8'){
                Alpha+=" EIGHT";
            }
            else if(n=='9'){
                Alpha+=" NINE";
            }
            else if(n=='0'){
                Alpha+=" ZERO";
            }         
        }
        System.out.println(Alpha);
        
    }
}
