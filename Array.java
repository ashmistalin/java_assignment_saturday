public class Array {
    public static void main(String[] args) {
        int[] array1={1,2,3,4,5};
        int[] array2=new int[array1.length];
        for(int i=0;i< array1.length;i++) {
            array2[i] = array1[i];
        }
        System.out.println("Original array:");
        for(int i=0;i< array1.length;i++)
        {
            System.out.print(array1[i]+" ");
        }
        System.out.println("\n");
        System.out.println("Copied array:");
        for(int i=0;i< array2.length;i++) {
            System.out.print(array2[i]+" ");
        }
    }
}


######

OUTPUT:

C:\Users\Dell\.jdks\openjdk-19.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=12337:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\Dell\IdeaProjects\java java\out\production\java java" Array
Original array:
1 2 3 4 5 

Copied array:
1 2 3 4 5 
Process finished with exit code 0

    
######
