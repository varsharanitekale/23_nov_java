//binary to decinmal....
import java.util.Scanner;
public class binarytoDecimal{
    
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a binary number: ");
            int binary = sc.nextInt(); 
            int decimal = 0;  
            int n = 0;  
            while(true){  
            if(binary == 0){ 
                break;  
            }else {  
                int temp = binary%10;  
                decimal += temp*Math.pow(2, n);  
                binary = binary/10;  
                n++;  
            }  
        }
        System.out.println("The conversion of binary to decimal  is : " +decimal); 
        sc.close();
    }  
    
    
}
