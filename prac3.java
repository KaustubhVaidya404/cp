
import java.util.Scanner;

class Trip{

  public static void main(String[] args) {

    System.out.println("Please enter number of paying persons ->");
    
    //Here we are taking inpurt of numeber of people paying 
    Scanner sc1 = new Scanner(System.in);
    int payingNum = sc1.nextInt();
    int[] amountList = new int[payingNum];
    
    //Loop for maintaining each input
    for(int i=0; i<payingNum; i++){
      System.out.println("Enter amount ->");
      Scanner sc2 = new Scanner(System.in);
      int amountAppend = sc2.nextInt();  
      amountList[i] = amountAppend;
    }
    int totalAmount = 0;
    
    //Loop for sum of total amount
    for(int i=0; i < amountList.length; i++){
      totalAmount = totalAmount + amountList[i];
    }
    
    //Calculating average 
    int average = totalAmount / payingNum;
    System.out.println("Averge contribution -> "+average);
    
    //Calculating per share
    int[] returnAmount = new int[payingNum];
    for(int i=0; i<amountList.length; i++){
      returnAmount[i] = amountList[i]-average;
    }

    //Prining output
    for (int i=0; i < returnAmount.length; i++) {
      System.out.println("Amount share => "+returnAmount[i]);
    }
  }

}


