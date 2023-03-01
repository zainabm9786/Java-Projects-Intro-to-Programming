import java.util.*;

public class Assignment7B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valid = false;
        String redo;

        do {
            System.out.println("Enter your message: ");
            String message = sc.nextLine();
            //message = message.toUpperCase();
            System.out.print("Enter the offset value: ");
            int offset = sc.nextInt();

            valid= offset(message,offset);
            if (!valid){
                System.out.println("Sorry, we can only process messages with letters and spaces, and the offset must be between 0 and 26.");
            }
            else {
                System.out.println("\nYour secret message is...");
                System.out.println(method2(message,offset));
            }
            System.out.print("Do you want to encrypt another message?: ");
            redo = sc.next();
            redo= redo.toLowerCase();
            sc.nextLine();
        } while (redo.equals("y"));
        System.out.println("\nClosing out...");

    }

    static boolean offset(String a, int b) {
        if(b >= 0 && b <= 26){
            for (int i = 0; i < a.length(); i++) {
                char c = a.charAt(i);

                if (Character.isLetter(c) || Character.isSpaceChar(c)) {
                    return true;
                }else{
                    return false;
                }
            }
        }else{
            return false;
        }
        return false;
    }

    static String method2(String a, int b) {
        a=a.toUpperCase();
        String encrypt = "";
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if ((a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') || a.charAt(i) == ' ') {
                if(Character.isLetter(c)){
                    c = (char)(c+b);//83
                    int x = (int)(c);
                    if(x < 90){
                        encrypt += c;
                    }else{
                        x=x-90;
                        x=x+64;
                        char y = (char)(x);
                        encrypt += y;
                        //c = (char)((((c - 'A') + b) % 26) + 'A');
                        // String encrypt= String.valueOf((char)x);
                    }
                }else{
                    encrypt += " ";
                }

            }
        }
        return encrypt;
    }

}
