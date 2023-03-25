import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int row,column;
        int row1,column1;
        int[][] sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows and colums of first matrix:");
        row=sc.nextInt();
        column=sc.nextInt();
        int[][] matrix1=new int[row][column];
        System.out.println("Elemnts of the first matrix:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                matrix1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the number of rows and colums of second matrix:");
        row1=sc.nextInt();
        column1=sc.nextInt();
        int[][] matrix2 = new int[row1][column1];
        System.out.println("Elemnts of the second matrix:");
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<column1;j++)
            {
                matrix2[i][j]=sc.nextInt();
            }
        }
        int[][] summatrix=new int[row][column];
        if((row==row1)&&(column==column1)) {
            System.out.println("Sum of the two matrices:");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    summatrix[i][j]=matrix1[i][j]+matrix2[i][j];
                    System.out.print(summatrix[i][j]+" ");
                }
                System.out.println("");
            }
        }
        else
        {
            System.out.println("These matrices cannot be added.");
        }
    }
}

#####

OUTPUT:
C:\Users\Dell\.jdks\openjdk-19.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=12246:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\Dell\IdeaProjects\java java\out\production\java java" Matrix
Enter the rows and colums of first matrix:
2
2
Elemnts of the first matrix:
1 2
3 4
Enter the number of rows and colums of second matrix:
2 
2
Elemnts of the second matrix:
9 0
56 1
Sum of the two matrices:
10 2 
59 5 

Process finished with exit code 0

    
    
#####



