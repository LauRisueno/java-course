package cp1basico;

/**
 *
 * @author Laura Veronica Risueño Arancibia<lauri.lro4@gmail.com>
 */
public class Main {

    public static void main(String[] args) {
        /*String[] args - Arguments*/
        //Single Line Comment
        /*Multi
        Line
        Comment*/

        System.out.println(sum(2, 3));

        //Identifiers and variables
        int number;  //loweCamelCase

        //Integer Data Types
        byte oneByte;
        short oneShort;
        int oneInt;
        long oneLong;

        //Floating Point Data Types
        float oneFloat = 2.0f;//We need to specified that is a float number
        float secondFloat = (float) 4.5;
        double oneDouble;

        //Boolean Data Type
        boolean oneBool; //true or false

        //Char Data Type
        char oneChar = 'a';

        //String Data Type
        String oneString = "Hi world";

        //Enum
        TrafficLight oneTrafficLight = TrafficLight.GREEN;
        
        //Basic Operations
        int a = 4;
        int b = 3;
        int sum = a+b;
        int subtraction = a- b;
        int multiplication = a*b;
        double quotient = a/b;
        int secondQuotient = a/b;
        int residues = a%b;

    }

    /**
     * Documentation of Sum Method - Documentation Comment
     *
     * @param firstNumber tipo entero
     * @param secondNumber tipo entero
     * @return tipo entero sum de firstNumber y secondNumber
     */
    public static int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
