import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner test = new Scanner(System.in);
    RockPaperScissors RpsObject = new RockPaperScissors();
    GuessMyNumber GmnObject = new GuessMyNumber();
    StatesQuiz SqObject = new StatesQuiz();
    Main restartObject = new Main();
    restartObject.restart();
  }
  public void restart(){
     RockPaperScissors RpsObject = new RockPaperScissors();
    GuessMyNumber GmnObject = new GuessMyNumber();
    StatesQuiz SqObject = new StatesQuiz();
    Main restartObject = new Main();
    Scanner test = new Scanner(System.in);
   System.out.println("Welcome To The Arcade!");
    System.out.println("If you want to play Rock Paper Scissors press 1");
    System.out.println("If you want to play Guess My Number press 2");
    System.out.println("If you want to play The States Quiz press 3");
    int useranswer = test.nextInt();
    switch (useranswer) {
    case 1:
      RpsObject.RPS();
      break;
    case 2:
      GmnObject.GMN();
      break;
    case 3:
      SqObject.SQ();
      break;
    default:
      System.out.println("Oops Please enter a number between 1-3.");
    } 
  }
    
  }

