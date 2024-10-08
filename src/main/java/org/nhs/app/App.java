public class App {
    public static void main(String args[]) {
//Problem 1
        for (int num = 1; num <= 5; num++){
            for(int counter = 1; counter <= num; counter++){
                System.out.print(num);
            }
            System.out.println();
            }
//Problem2
        for(int dot = 1; dot <= 5; dot++) {
            for(int counter2 = 5; counter2 > dot; counter2--){
                System.out.print(".");
            }
            for(int counter2 = 1; counter2 <= dot; counter2++){
                System.out.print(dot);        
            }
            System.out.println();
        }
//Problem3
        for(int line = 1; line <= 5; line++){
            for(int dot1 = 1; dot1 <= (5 - line); dot1++){
                System.out.print(".");
            }
            for(int num1 = 1; num1 ==  1; num1++) {
                System.out.print(line);
            }
            for(int dot2 = 1; dot2 <= (line - 1); dot2++){
                System.out.print(".");
            }
            System.out.println();
        }
    }
}