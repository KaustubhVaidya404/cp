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
	for(int i=0; i<size; i++){
		hBar();
	}
	System.out.println();
	for(int i=0; i<size; i++){
		voidSpace();
		vBar();
	}
	for(int i=0; i<size; i++){
		hBar();
	}
	System.out.println();
	for(int i=0; i<size; i++){
		voidSpace();
		vBar();
	}
	for(int i=0; i<size; i++){
		hBar();
	}
	System.out.println();

  }

  static void fourPrint(int size){
	for(int i=0; i<size; i++){
		System.out.print("|");
		voidSpace();
		vBar();
	}
	for(int i=0; i<size; i++){
		hBar();
	}
	System.out.println();
	for(int i=0; i<size; i++){
		voidSpace();
		vBar();
	}
  }

  static void fivePrint(int size){
	for(int i=0; i<size; i++){
		hBar();
	}
	System.out.println();
	for(int i=0; i<size; i++){
		vBar();
	}
	for(int i=0; i<size; i++){
		hBar();
	}
	System.out.println();
	for(int i=0; i<size; i++){
		voidSpace();
		vBar();
	}
	for(int i=0; i<size; i++){
		hBar();
	}
	System.out.println();
  }

  public static void main(String[] args) {
    
   String choice = "y"; 

    do{

      //Taking input for size of digits
    System.out.println("Enter the size of digits to print");
    Scanner sc = new Scanner(System.in);
    int digitsize = sc.nextInt();
    
    //Taking input for digit
    System.out.println("Enter the digit to print");
    int digitToPrint = sc.nextInt();
   
    

    switch (digitToPrint) {
      case 1:
        onePrint(digitsize);
        System.out.println("Do you want to continue? (y/n)");
        choice = sc.next();
        break;
      
      case 2:
        twoPrint(digitsize);
        System.out.println("Do you want to continue? (y/n)");
        choice = sc.next();
        break;
      
      case 3:
        threePrint(digitsize);
        System.out.println("Do you want to continue? (y/n)");
        choice = sc.next();
        break;

      case 4:
        fourPrint(digitsize);
        System.out.println("Do you want to continue? (y/n)");
        choice = sc.next();
        break;

      case 5:
        fivePrint(digitsize);
        System.out.println("Do you want to continue? (y/n)");
        choice = sc.next();
        break;

      default:
        break;
      }
    }while(choice.equals("y"));
  }
}



