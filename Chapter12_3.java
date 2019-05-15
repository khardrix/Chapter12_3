/********************************************************************************************************************
 ********************************************************************************************************************
 *****                                        Chapter 12: Problem 3                                             *****
 *****__________________________________________________________________________________________________________*****
 *****                3.  Write a program (main method only) to generate 100 random numbers,                    *****
 *****                           writing each number to the text file numbers.txt.                              *****
 *****                                            Use a PrintWriter.                                            *****
 *****                          For handling the IOException, use a try-catch block.                            *****
 *****                         You will need to import java.io.* and java.util.Random.                          *****
 ********************************************************************************************************************
 ********************************************************************************************************************/

// IMPORTS of needed tools and plug-ins
import java.util.Random;
import java.io.*;

public class Chapter12_3 {

    public static void main(String[] args) {
        Random dice = new Random();
        String fileName = "numbers.txt";
        PrintWriter printWriter = null;
        int[] intArray = new int[100];

        try{
            printWriter = new PrintWriter(fileName);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }

        for(int i = 0; i < 100; i++){
            intArray[i] = 1 + dice.nextInt(100);
            printWriter.println("Random #:" + i + " = " + intArray[i]);
        }

    }
}
