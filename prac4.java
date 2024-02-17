import java.util.Scanner;

class Display {
  
  //Prining vertival bars
  static void vBar(){
      System.out.println("|"); 
  }
  
  //Prining horizontal bars
  static void hBar(){
      System.out.print("-");
  }

  //Printing blackspace
  static void voidSpace(){
      System.out.print("   ");
  }
  
  static void onePrint(int size){
    for(int i=0; i<size; i++){
      voidSpace();
      vBar();
    }
  }

  static void twoPrint(int size){
    for(int i=0; i<size; i++){
      hBar();
    }
    System.out.println();
    for (int i = 0; i < size; i++) {
      voidSpace();
      vBar();
    }
    for (int i = 0; i < size; i++) {
      hBar();
    }
    System.out.println();
    for (int i = 0; i < size; i++) {
      vBar();
    }
    for (int i = 0; i < size; i++) {
      hBar();
    }
    System.out.println();
  }

  static void threePrint(int size){

  }

  static void fourPrint(int size){

  }

  static void fivePrint(int size){

  }

  public static void main(String[] args) {
    
    //Taking input for size of digits
    System.out.println("Enter the size of digits to print");
    Scanner sc1 = new Scanner(System.in);
    int digitsize = sc1.nextInt();
    
    //Taking input for digit
    System.out.println("Enter the digit to print");
    Scanner sc2 = new Scanner(System.in);
    int digitToPrint = sc2.nextInt();
    
    switch (digitToPrint) {
      case 1:
        onePrint(digitsize);
        break;
      
      case 2:
        twoPrint(digitsize);
        break;
      
      case 3:
        threePrint(digitsize);
        break;

      case 4:
        fourPrint(digitsize);
        break;

      case 5:
        fivePrint(digitsize);
        break;

      default:
        break;
    }

  }
}



