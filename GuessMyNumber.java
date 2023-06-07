import java.util.Scanner;
import java.util.Random;
class GuessMyNumber{
  public void GMN(){
    Main restartObject = new Main();

    int caps = 101;
    int stopper = 0;
    Scanner test = new Scanner(System.in);
    Random compnum = new Random();
    int numone = compnum.nextInt(caps) ;
    System.out.println("Guess My Number! My number is between 0-100");
    int userguess;
    userguess = test.nextInt();
    while (userguess != numone){
      
if (userguess > numone) {
System.out.println("Incorrect. Your number is greater than My Number. Guess Again!");
userguess = test.nextInt();
}
else if (userguess < numone){
  System.out.println("Incorrect. Your number is less than My Number. Guess Again!");
  userguess = test.nextInt();
}

while (userguess == numone && stopper < 1){
  System.out.println("You guessed my number.");
  System.out.println("Thanks for playing!");
stopper++;

}


    }

System.out.println("To restart press R");
test.nextLine();
if (test.nextLine().equals("R")){
restartObject.restart();
}
else{
  System.exit(0);
}
  }

  }
