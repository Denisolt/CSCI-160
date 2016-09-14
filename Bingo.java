//GROUP PROJECT - NO BACON TEAM
//STUDENT 1 - DENISOLT SHAKHBULATOV
//STUDENT 2 - DEIVY ALVAREZ
//STUDENT 3 - ASIF IBRAHIM
//12.10.2015

import java.util.*;
import java.io.*;
import java.util.Random;
public class Bingo
{
    private Random rand = new Random();
    private int[][] card;       //Bingo card configuration
    private int[] stream;       //list of 75 integers
    private boolean[][] marks;  //simulates placing chips on a Bingo card

    public Bingo()
    {
        card   = new int[5][5];
        stream = new int[75];
        marks  = new boolean[5][5];
    }

    /**
     * This method writes a random Bingo card configuration and a stream of random
     * number between 1 and 75 to the output file.
     *
     * The first column in the table contains only integers between 1 and 15,
     * the second column numbers are all between 16 and 30, the third are 31 to 45,
     * the fourth 46-60, and the fifth 61-75.
     *
     * There are no duplicate numbers on a Bingo card.
     */
    public void write(String outputFile)  throws IOException
    {
        PrintWriter filesWrited = new PrintWriter("input1.txt");
        ArrayList<Integer> alreadyUsed = new ArrayList<Integer>();
        boolean valid = false;
        int tmp = 0;
        for(int index = 0; index <= card.length -1; index++)
        {
            for(int row = 0; row < card.length; row++)
            {
                while(!valid)
                {
                    tmp = (int)(Math.random() * 15) + 1 + 15 * index;
                    if(!alreadyUsed.contains(tmp))
                    {
                        valid = true;
                        alreadyUsed.add(tmp);
                    }
                }
                card[row][index] = tmp;
                valid = false;
            }
        }
        card[2][2] = 0;
        filesWrited.println();
        for(int row=0;row<card.length;row++)
        {
            for(int col=0;col<card[row].length;col++)
            {
                filesWrited.print(card[row][col]+ " \t");
            }
            filesWrited.println();
        }
        filesWrited.println();
        for (int index = 0; index < stream.length; index++ )
        {
            stream[index] = index+1;
        }
        Random rand = new Random();
        int value;
        for (int i = 0; i < stream.length; i++) 
        {
            int num = rand.nextInt(74);
            shuffle(stream,i,num);
        }
        for (int index = 0; index < stream.length; index++ )
        {
            filesWrited.print(stream[index] + ", ");
        }
        filesWrited.close();
    }

    private static void shuffle(int[] list, int i, int j) 
    {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

    /**
     * This method reads a given inputFile that contains a Bingo card configuration and
     * a stream of numbers between 1 and 75.
     * .
     * A Bingo card configuration is stored in the card array.
     * A list of 75 integers is stored in the stream array.
     */
    public void read(String inputFile) throws IOException
    {
        int sum = 0;
        int count = 0;
        File file = new File("test2.txt");
        Scanner inFile = new Scanner(file);
        for(int row = 0; inFile.hasNextLine() && row < 5; row++)
        {
            for(int i = 0; i < 5; i++)
            {
                card[row][i] = inFile.nextInt();
            }
        }

        for(int i=0; i<75;i++)
        {
            stream[i] = inFile.nextInt();
        }
        
        for(int row=0;row<5;row++)
        {
            for(int col=0;col<5;col++)
            {
                System.out.print(card[row][col]+ " \t");
            }
            System.out.println();
        }
        System.out.println();
        for (int index = 0; index < stream.length; index++ )
        {
            System.out.print(stream[index]+", ");
        }
        System.out.println();
        inFile.close();
    }

    /**
     * This method returns the first integer from the stream array that
     * gives you the earliest winning condition.
     *
     * - all the spots in a column are marked
     * - all the spots in a row are marked
     * - all the spots in either of the two diagonals are marked
     * - all four corner squares are marked
     */
    public int playGame()
    {
        for(int index=0;index<75;index++)
        {
            for(int row=0;row<5;row++)
            {
                for(int col=0;col<5;col++)
                {
                    if(stream[index]==card[row][col])
                    {
                        marks[row][col] = true;
                        marks[2][2] = true;                        
                        if((marks[row][0]==true)&&(marks[row][1]==true)&&(marks[row][2]==true)&&(marks[row][3]==true)&&(marks[row][4]==true))//colomn1
                        {
                            return stream[index];
                        }
                        if((marks[0][col]==true)&&(marks[1][col]==true)&&(marks[2][col]==true)&&(marks[3][col]==true)&&(marks[4][col]==true))//colomn1
                        {
                            return stream[index];
                        }
                        if((marks[0][0]==true)&&(marks[1][1]==true)&&(marks[3][3]==true)&&(marks[4][4]==true))//diag1
                        {
                            return stream[index];
                        }
                        if((marks[4][1]==true)&&(marks[3][2]==true)&&(marks[2][3]==true)&&(marks[1][4]==true))//diag2
                        {
                            return stream[index];
                        }
                        if((marks[0][0]==true)&&(marks[0][4]==true)&&(marks[4][0]==true)&&(marks[4][4]==true))//4points
                        {
                            return stream[index];
                        }
                    }
                }
            }
        }
        return 0;
    }
}