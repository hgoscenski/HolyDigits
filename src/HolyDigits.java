/**
 * Firstly      -loop through numbers 1000-9999
 * Secondly     -make a function to run on the looped numbers
 * Thirdly      -split the number into 11's,10's,100's,1000's
 * Fourthyl     -test for the criteria
 * Fifthly      -return any values that satisfy the criteria
 *
 * Created by hgoscenski on 9/13/16.
 */
public class HolyDigits {
    public static void main(String[] args){
        for(int i=1000; i<9999; i++) {
            if (criteria(i)) {
                System.out.println("Holy Numbers Batman! The address is " + i + " Pennsylvania Ave.");
            }
        }
    }
    private static boolean criteria(int number){
        int thousands = number / 1000;
        int hundreds = number % 1000 /100;
        int tens = number % 100 / 10;
        int ones = number % 10;
//        System.out.println(thousands + "\n" + hundreds + "\n" + tens + "\n" + ones);
        boolean a = thousands != hundreds, b = thousands != ones, c = hundreds != tens, d = tens != ones;
        boolean e = hundreds != ones, f = tens != 0;
        if(a && b && c && d && e && f
                ){
            //System.out.println("its good!");
            if(thousands / tens == 3){
                //System.out.println("its still good");
                if(ones % 2 != 0){
                    //System.out.println("Progress");
                    if(thousands + hundreds + tens + ones == 27){
                        //System.out.print("This is it!");
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
