import java.util.Scanner;
public class Yat {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter string: ");
      String str = sc.nextLine();
      System.out.println("Input: " + str);
      String compressed = "";
      char ch=0;
      int count=1;
      for (int x = 0; x < str.length(); x++)
      { 
         if (ch == str.charAt(x))
         {
            count = count + 1;
         } else
         {
            compressed = compressed + ch;
            if(count != 1)
            {
               compressed = compressed + count;
            }
            ch = str.charAt(x);
            count = 1;
         }
      }
      compressed = compressed + ch;
      if(count != 1){
         compressed = compressed + count;
      }
      System.out.println("Compressed: " + compressed); 
   }
}
