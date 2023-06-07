import java.util.Scanner;

class RockPaperScissors{
  public void RPS(){
    Main restartObject = new Main();
  System.out.println ("What Is Your Move ?");
  System.out.println("1 = Rock");
  System.out.println("2 = Paper");
  System.out.println("3 = Scissors");
    Scanner test = new Scanner(System.in);
  int useranswer;
  int score;
  score = 0;
  int round;
  round = 0;
  while (round < 5) {
	    useranswer = test.nextInt();
	    int compMove = (int) (Math.random() * (3-1) + 1);
  
  if (useranswer == compMove){
    
    System.out.println("You both chose the same thing. Enter a number to play again.");
    round++;
    
  }
  //useranswer = scan.nextInt();
  else if (useranswer == 1 && compMove ==2){
    System.out.println("You lost. Enter a number to play again." );
    round++;
    score--;
  }
  //useranswer = scan.nextInt();
   else if (useranswer == 1 && compMove ==3){
    System.out.println("You won. Enter a number to play again.");
    round++;
    score++;
  }
  //useranswer = scan.nextInt();
   else if (useranswer == 2 && compMove ==1){
    System.out.println("You won. Enter a number to play again.");
    round++;
    score++;
  }
  //useranswer = scan.nextInt();
   else if (useranswer == 2 && compMove == 3){
    System.out.println("You lost. Enter a number to play again.");
    round++;
    score--;
  }
  //useranswer = scan.nextInt();
   else if (useranswer == 3 && compMove == 1){
    System.out.println("You lost. Enter a number to play again.");
    round++;
    score--;
  }
  //useranswer = scan.nextInt();
   else if (useranswer == 3 && compMove == 2){
    System.out.println("You won. Enter a number to play again.");
    round++;
    score++;
  }
   else {
	   System.out.println("error");
	   System.out.println("Some common troubleshooting errors are not entering a number between 1-3");
	   System.out.println(compMove);
   } 
}
  System.out.println("Your score after 5 rounds was: "+ score);

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
