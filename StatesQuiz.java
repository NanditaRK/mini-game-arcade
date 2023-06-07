import java.util.Scanner;

class StatesQuiz{
  public void SQ(){
    Main restartObject = new Main();
    Scanner bro = new Scanner(System.in);
 System.out.println ("Welcome To The Annual States Quiz!");
 System.out.println("Here is your first question!");
 System.out.println ("What Is The Capital Of North Dakota?");
 String useranswer;
Main mainObject = new Main();
useranswer = bro.nextLine();


 if (useranswer.toLowerCase().equals("bismarck")){
   System.out.println("Answer is correct. Next Question");
System.out.println("Here is your second question.");
 System.out.println("What is the capital of California? ");}
 else if (useranswer.toLowerCase() != ("bismarck")){
   System.out.println("Your answer is wrong. Restart Game.");
   System.exit(0);
 }
 useranswer = bro.nextLine();
 if (useranswer.toLowerCase().equals("sacramento")){
   System.out.println("Good Job You got it right.");
   System.out.println("What is the biggest state?");}
else if (useranswer.toLowerCase() != ("sacramento")){
   System.out.println("Your answer is wrong. Restart Game.");
      System.exit(0);
 }
   useranswer = bro.nextLine();
   if (useranswer.toLowerCase().equals("alaska")){
     System.out.println("Correct answer! Next Question.");
     System.out.println("How many states are in the United States Of America?");}
     else if (useranswer.toLowerCase() != ("alaska")){
   System.out.println("Your answer is wrong. Restart Game.");
      System.exit(0);
 }
     useranswer = bro.nextLine();
     if (useranswer.toLowerCase().equals("50")){
       System.out.println("Good job You got it right. Last Question.");
       System.out.println("What is the smallest state in the United States Of America?");}
       else if (useranswer.toLowerCase() != ("50")){
   System.out.println("Your answer is wrong. Restart Game.");
      System.exit(0);

 }
       useranswer = bro.nextLine();
       if (useranswer.toLowerCase().equals("rhode island")){
         System.out.println("Good Job You got all of the questions correct.");
       }
       else if (useranswer.toLowerCase() != ("rhode island")){
   System.out.println("Your answer is wrong. Restart Game.");
      System.exit(0);
 }
 System.out.println("To restart press R");
if (bro.nextLine().toUpperCase().equals("R")){
restartObject.restart();
}
else{
  System.exit(0);
}
     }
   }
 

  

