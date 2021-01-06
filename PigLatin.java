import java.util.*;

public class PigLatin{
  public static String pigLatinSimple(String s){
    String ans = "";
    if (s.charAt(0)=='a' || s.charAt(0)=='e' || s.charAt(0)=='i' || s.charAt(0)=='o' || s.charAt(0)=='u'){
      ans = s + "hay";
    }else{
      ans = s.substring(1) + s.charAt(0) + "ay";
    }
    return ans;
  }

  public static void main(String[] args){

    Scanner n = new Scanner(System.in);
    while (n.hasNextLine()){
      String curr_line = n.nextLine();
      Scanner line = new Scanner(curr_line);


      while (line.hasNext()){
        String word = line.next();
        System.out.print(pigLatinSimple(word));
        if (line.hasNext()){
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
