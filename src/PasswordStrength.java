

import java.util.Scanner;

public class PasswordStrength {
    public static String passwordStrength(String pass){
        boolean chars = false;
        boolean nums = false;
        boolean alphabets = false;
        String strength = "";
        //weaker password
        if (pass.length() < 8){
            //System.out.println("Weak."); 
            strength = "weak";
        }
        else if (pass.length() >= 8){
            //Iterating to check what it contains
            for (int i= 0; i < pass.length(); i++){
                //Checking for alphabets
                if (((pass.charAt(i)>= 65)&&(pass.charAt(i) <= 90))||((pass.charAt(i)>= 97)&&(pass.charAt(i) <= 122))){
                    //System.out.println("");
                    //System.out.println(pass.charAt(i));
                    alphabets = true;
                }
                //Checking for Numbers
                if ((pass.charAt(i)>= 48)&&(pass.charAt(i) <= 57)){
                //    System.out.println(pass.charAt(i));
                    nums = true;
                }
                //Checking for special chars
                if ((pass.charAt(i)>= 32)&&(pass.charAt(i) <= 47)){
                    //Contains
                //    System.out.println(pass.charAt(i));
                    chars = true;
                }
                else if ((pass.charAt(i)>= 58)&&(pass.charAt(i) <= 64)){
                    //Contains
                    chars = true;
                //    System.out.println(pass.charAt(i));
                }else if ((pass.charAt(i)>= 91)&&(pass.charAt(i) <= 91)){
                    //Contains
                    chars = true;
                //    System.out.println(pass.charAt(i));
                }else if ((pass.charAt(i)>= 123)&&(pass.charAt(i) <= 126)){
                    //Contains
                    chars = true;
                //    System.out.println(pass.charAt(i));
                }
                
            }
        /*......Conditions for strength........*/
            //weak 
                //--> if only alphabets
                if ((alphabets == true)&&(nums == false)&&(chars == false)){
                    strength = "weak";
                }
                //--> weak if only numbers
                else if ((alphabets == false)&&(nums == true)&&(chars == false)){
                    strength = "weak";
                }
                //--> weak if only special chars
                else if ((alphabets == false)&&(nums == false)&&(chars == true)){
                    strength = "weak";
                }                
            //medium 
                //--> Numbers+alphabets
                if ((alphabets == true)&&(nums == true)&&(chars == false)){
                    strength = "medium";
                }
                //-->Numbeers + chars
                else if ((alphabets == false)&&(nums == true)&&(chars == true)){
                    strength = "medium";
                }
                //--> alphabets + chars
                else if ((alphabets == true)&&(nums == false)&&(chars == true)){
                    strength = "medium";
                }
            //Stronger
                //--> Alphabets + Numbers + Chars
                if ((alphabets == true)&&(nums == true)&&(chars == true)){
                    strength = "Strong";
                }
        }
        return strength;
    }
    public static void main(String[] args) {
        System.out.println("Enter your password: ");
        Scanner input = new Scanner(System.in);
        String pass = input.next();
        //String status = passwordStrength(pass);
        //System.out.println("Your password strength is: "+status);
    }
}
