import java.util.*;

public class Pascals
{
    public Pascals()
    {
        System.out.println("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("[" + number + "]");
        System.out.println("[" + number + ", " + number + "]");
        int[] prevLine = {number, number};
        for(int i = 3; i < 7; i++){
            int[] currLine = new int[i];
            for(int b = 1; b < i - 1; b++){
                currLine[0] = number;
                currLine[currLine.length - 1] = number;
                currLine[b] = prevLine[b] * prevLine[b-1];
            }
            prevLine = currLine;
            System.out.println(Arrays.toString(currLine));
        }
    }
}



