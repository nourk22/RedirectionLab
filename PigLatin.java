import java.util.*;

public class PigLatin{
  public static String pigLatinSimple(String s){
    String lower = s.toLowerCase();

    String ans = "";
    if (lower.charAt(0)=='a' || lower.charAt(0)=='e' || lower.charAt(0)=='i' || lower.charAt(0)=='o' || lower.charAt(0)=='u'){
      ans = lower + "hay";
    }else{
      ans = lower.substring(1) + lower.charAt(0) + "ay";
    }
    return ans;
  }

  public static String pigLatin(String s){
    String lower = s.toLowerCase();

    String[] digraphs = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};

    for (int i = 0; i < digraphs.length; i++){
      if (lower.substring(0, 2).equals(digraphs[i])){
        return lower.substring(2) + digraphs[i] + "ay";
      }
    }
    return pigLatinSimple(lower);
  }

  public static String pigLatinBest(String s){
    String lower = s.toLowerCase();

    if (lower.charAt(0)<'a' || lower.charAt(0)>'z'){
      return lower;
    }
    if (lower.charAt(lower.length()-1) < 'a' || lower.charAt(lower.length()-1) > 'z'){
      return pigLatin(lower.substring(0, lower.length()-1)) + lower.charAt(lower.length()-1);
    }
    return pigLatin(lower);
  }

  public static void main(String[] args){

    Scanner n = new Scanner(System.in);
    while (n.hasNextLine()){
      String curr_line = n.nextLine();
      Scanner line = new Scanner(curr_line);


      while (line.hasNext()){
        String word = line.next();
        System.out.print(pigLatin(word));
        if (line.hasNext()){
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
