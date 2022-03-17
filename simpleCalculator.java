public class Assignment2 
{

    public static void main(String[] args) 
    {
         System.out.println("Welcome to simple calculator!");

         // Scanner object to read input
         Scanner keyboard = new Scanner (System.in);

         // Declare variables and input values
         double result;

         double firstNum;
         System.out.print("Enter the first number: ");
         firstNum = Double.parseDouble(keyboard.nextLine());

         double secondNum;
         System.out.print("Enter the second number: ");
         secondNum = Double.parseDouble(keyboard.nextLine());

         char mathOp;
         System.out.print("Enter the math operator (+, -, *, /): ");
         mathOp = keyboard.next().charAt(0);  // Reads line and gets first char


         // Input validation on math operator
         while(mathOp != '+' && mathOp != '-' && mathOp != '*' && mathOp != '/')
         {
             System.err.println("Invalid math operator");
             System.out.print("Enter the math operator (+, -, *, /): ");
             mathOp = keyboard.next().charAt(0);      
         }

         // Switch statement and formats answer to 2 decimal places
         switch (mathOp)
         {
             case '+':
             {
                 result = firstNum + secondNum;
                 System.out.printf("The answer is: %.2f\n", result);
                 break;
             }
             case '-':
             {
                 result = firstNum - secondNum;
                 System.out.printf("The answer is: %.2f\n", result);
                 break;
             }
             case '*':
             {
                 result = firstNum * secondNum;
                 System.out.printf("The answer is: %.2f\n", result);
                 break;
             }
             case '/':
             {
                 result = firstNum / secondNum;
                 System.out.printf("The answer is: %.2f\n", result);
                 break;
             }
         }


    }

}
