import java.util.Random;
public class diceRolling {
    public static void main(String[] args){
        System.out.println("Roll the dice");
        Random roll_1 = new Random();
        Random roll_2 = new Random();
        int number1 = roll_1.nextInt(6)+1;
        int number2 = roll_2.nextInt(6)+1;
        for (int i=1;i<=1;i++){
          System.out.println(" First Dice = "+ number1);
          
        }for (int j=1;j<=1;j++){
          System.out.println("Second Dice = "+ number2);
          
        }
        int sum = number1+number2;
          System.out.println("the sum is = "+ sum);
        
        
        
    }
    
}
