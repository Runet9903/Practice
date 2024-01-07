import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Rock(0), Paper(1), Scissors(2)");
        int a = scan.nextInt();
        //a에 int 입력받는것.

        if (a==0) {
            System.out.println("Player : Rock");
        }
        if (a==1) {
            System.out.println("Player : Paper");
        }
        if (a==2) {
            System.out.println("Player : Scissors");
        }

        int com=(int)(Math.random()*3);
        //(자료형)(Math.random() * 범위) => (int)(Math.random()*3) == int형의 0~2까지의 숫자를 하나 뽑는다.
        if(com==0){
            System.out.println("Com : Rock");
        }
        if(com==1){
            System.out.println("Com : Paper");
        }
        if(com==2){
            System.out.println("Com : Scissors");
        }

        //결과를 출력해야함
        if(com-a==-2 || com-a==1) {
            System.out.println("Com win");
        }
        if(com-a==-1 || com-a==2) {
            System.out.println("Player win");
        }
        if(com-a==0)
            System.out.println("draw");
    }
}