

public class Abc
{
    public static void main(String[] args) {
        int marks[][] = new int[4][6];
        for (int i=0; i < marks.length; i++) {
            for (int j=0; j < 6; j++)
            {
                marks[i][j] = (int) (Math.random() * 10);
            }
        }
       for (int i=0; i < marks.length; i++) {
        for (int j=0; j < 6; j++)
        {
            System.out.print(marks[i][j] + " ");
        } System.out.println();
       }
    }
}