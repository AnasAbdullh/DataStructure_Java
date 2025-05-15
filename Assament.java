import java.util.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {  
    public static void main(String[] args) 
    {  
        int[] Students = new int[] {85, 90, 78, 92, 88} ;
        
        System.out.println("Average Score " + Arrays.stream(Students).average().orElse(0));
        System.out.println("Highest Score " + Arrays.stream(Students).max().getAsInt());
        
    }
}


/*import  java.util.*;

public class Main {
public static void main(String[] args)
{
int[] Students = {85, 90, 78, 92, 88};
int Sum = 0;
int HighestScore = Students[0];

for(int scores : Students)  
    {  
      Sum+= scores;  
      if(HighestScore < scores)  
      {  
        HighestScore = scores;  
      }  
    }  
      
    System.out.println("Average Score " +  (double)Sum / Students.length);  
    System.out.println("Highest Score " + HighestScore);  
}

}*/



