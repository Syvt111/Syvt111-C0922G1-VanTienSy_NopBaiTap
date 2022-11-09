package bai_tap;
import java.util.Scanner;
public class bai_2_ung_dung_doc_so_thanh_chu {
    public static void main(String[] args) {
        String[] digit = {"zero","one","two","three","four","five", "six", "seven", "eight", "nine" };
        String[] twoDigits = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen","sixteen","seventeen","seventeen","eighteen","nineteen"};
        String[] twoDigits2 = {"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety","one hundred"};
        System.out.println("Enter a number :");
        Scanner scanner = new Scanner(System.in);
        short number = scanner.nextShort();
        switch(number){
            case 0 :
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
            case 6 :
            case 7 :
            case 8 :
            case 9 :
                System.out.println("The number is " + digit[number]);
                break;
            case 10 :
            case 11 :
            case 12 :
            case 13 :
            case 14 :
            case 15 :
            case 16 :
            case 17 :
            case 18 :
            case 19 :
                System.out.println("The number is " + twoDigits[number-9]);
                break;
            case 20 :
            case 30 :
            case 40 :
            case 50 :
            case 60 :
            case 70 :
            case 80 :
            case 90 :
            case 100 :
                System.out.println("The number is " + twoDigits2[number/10-2]);
                break;
        }
        if (number > 20&&number<30){
            System.out.println("The number is twenty-"+digit[number-20] );
        }
        else if (number > 30&&number<40){
            System.out.println("The number is thirty-"+digit[number-30] );
        }
        else if (number > 40&&number<50){
            System.out.println("The number is forty-"+digit[number-40] );
        }
        else if (number > 50&&number<60){
            System.out.println("The number is fifty-"+digit[number-50] );
        }
        else if (number > 60&&number<70){
            System.out.println("The number is sixty-"+digit[number-60] );
        }
        else if (number > 70&&number<80){
            System.out.println("The number is seventy-"+digit[number-70] );
        }
        else if (number > 80&&number<90){
            System.out.println("The number is eighty-"+digit[number-80] );
        }
        else if (number > 90&&number<100){
            System.out.println("The number is ninety-"+digit[number-90] );
        }
        else if (number>100&&number<1000){
            int number2 = (number - number/100*100) ;
            switch(number2){
                case 0 :
                case 1 :
                case 2 :
                case 3 :
                case 4 :
                case 5 :
                case 6 :
                case 7 :
                case 8 :
                case 9 :
                    System.out.println("The number is " + digit[number/100]+"hundred and "+ digit[number2]);
                    break;
                case 10 :
                case 11 :
                case 12 :
                case 13 :
                case 14 :
                case 15 :
                case 16 :
                case 17 :
                case 18 :
                case 19 :
                    System.out.println("The number is " + digit[number/100]+"hundred and "+ twoDigits[number2-10]);
                    break;
                case 20 :
                case 30 :
                case 40 :
                case 50 :
                case 60 :
                case 70 :
                case 80 :
                case 90 :
                case 100 :
                    System.out.println("The number is " + digit[number/100]+"hundred and "+ twoDigits2[(number2%10)-2]);
                    break;
            }
            if (number2 > 20&&number2<30){
                System.out.println("The number is " + digit[number/100]+"hundred and "+ "twenty-"+digit[number2-20] );
            }
            else if (number2 > 30&&number2<40){
                System.out.println ("The number is" + digit[number/100]+"hundred and "+ "thirty-"+digit[number2-30] );
            }
            else if (number2 > 40&&number2<50){
                System.out.println ("The number is "+ digit[number/100]+"hundred and "+"forty-"+digit[number2-40] );
            }
            else if (number2 > 50&&number2<60){
                System.out.println ("The number is"+ digit[number/100]+"hundred and "+" fifty-"+digit[number2-50] );
            }
            else if (number2 > 60&&number2<70){
                System.out.println("The number is"+ digit[number/100]+"hundred and "+" sixty-"+digit[number2-60] );
            }
            else if (number2 > 70&&number2<80){
                System.out.println("The number is"+ digit[number/100]+"hundred and "+" seventy-"+digit[number2-70] );
            }
            else if (number2 > 80&&number2<90){
                System.out.println ("The number is"+ digit[number/100]+"hundred and "+" eighty-"+digit[number2-80] );
            }
            else if (number2 > 90&&number2<100){
                System.out.println("The number is"+ digit[number/100]+"hundred and "+" ninety-"+digit[number2-90] );
            }
        }
    }
}
