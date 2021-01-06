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

  public static String pigLatin(String s){
    String[] digraphs = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};

    for (int i = 0; i < digraphs.length; i++){
      if (s.substring(0, 2).equals(digraphs[i])){
        return s.substring(2) + digraphs[i] + "ay";
      }
    }
    return pigLatinSimple(s);
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
