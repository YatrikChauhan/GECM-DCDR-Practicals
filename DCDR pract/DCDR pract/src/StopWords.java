import java.util.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class StopWords{
   
    public void stopClass1(){
        String[] stopWrds={"i", "a", "about","an","are","as","at","be","by","com","for","from","how","in", "is","it",
                "of","on","or","that","the","this","to","was","what","when","where","who","will","with"};
       
       
       
        try{
          Scanner fip1=new Scanner(new File("Sample.txt"));
          FileOutputStream out=new FileOutputStream("StopWords.txt");
       
        while(fip1.hasNext())
        {
            int flag=1;
            String s1=fip1.next();
            s1=s1.toLowerCase();
            for(int i=0;i<stopWrds.length;i++){
                if(s1.equals(stopWrds[i])){
                    flag=0;
                    }
            }
            if(flag!=0)
            {
                System.out.println(s1);
                PrintStream p=new PrintStream(out);
                p.println(s1);   
            }
               
                               
        }
                   
        }
        catch(Exception e){
            System.err.println("cannot read file");
        }
    }



   
    public static void main(String[] args) 
    {
        StopWords obj=new StopWords();
        obj.stopClass1();
       
    }
}
       



