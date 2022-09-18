public class Main {
    public static void main(String[] args) {
        int intOperandA = 6;
        int intOperandB = 3;
        int intSum = 0;
        int intProduct = 7;
        int intDifference = 9;
        int intQuotient = 11;
        int intModulo = 13;

        double doubleOperandA = 1.99;
        double doubleOperandB = 3.99;
        double doubleSum = 5.99;
        double doubleProduct = 7.99;
        double doubleDifference = 9.99;
        double doubleQuotient = 11.99;

        intSum = intOperandA + intOperandB;
        intDifference=intOperandA - intOperandB;
        intProduct= intOperandA * intOperandB;
        intQuotient= intOperandA/ intOperandB;
        intModulo=intOperandA%intOperandB;

        System.out.println("The sum using ints of " + intOperandA + " and " + intOperandB + " is " + intSum);
        System.out.println("The difference of the two numbers is: "+intDifference);
        System.out.println("The product of the two numbers is: "+intProduct);
        System.out.println("The quotient of the two numbers is "+intQuotient);
        System.out.println("The modulo of the two numbers is: "+intModulo);


        doubleSum=doubleOperandA+doubleOperandB;
        doubleDifference=doubleOperandA-doubleOperandB;
        doubleProduct=doubleOperandA*doubleOperandB;
        doubleQuotient=doubleOperandA/doubleOperandB;

        System.out.println("The sum using ints of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);
        System.out.println("The difference of the two numbers is: "+doubleDifference);
        System.out.println("The product of the two numbers is: "+doubleProduct);
        System.out.println("The quotient of the two numbers is "+doubleQuotient);
    }
}

