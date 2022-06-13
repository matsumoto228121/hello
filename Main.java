import java.util.Scanner;
import java.util.Random;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int answer = rand.nextInt(90)+10;
        System.out.println(answer);
        int user_answer=0;
        String tmp;

        int count;
        for(count=0; count<5;count++){
            System.out.println("残りの入力回数は"+ (5-count) + "回です。数を予測して入力してください(答えは二桁の正の整数)");

            tmp = scan.nextLine();
            user_answer = Integer.parseInt(tmp);

            if(user_answer == answer){
                System.out.println("当たり！");
                break;
            }

            if(user_answer - answer >= 20){
                System.out.println("入力値より答えは20以上小さいです");
            }
            else if(user_answer - answer <= -20){
                System.out.println("入力値より答えは20以上大きいです");
            }
            else{
                if(user_answer > answer){
                    System.out.println("入力値より答えは小さいです");
                }
                else{
                    System.out.println("入力値より答えは大きいです");
                }
            }
        }

        if(count == 5){
            System.out.println(("Game Over!"));
        }
    
        scan.close();
    }
}