import java.util.*;

public class MakeStars{
  public static String Stars(String word){
    String stars = "";
    for (int i=0; i<word.length(); i++){
      stars+="*";
    }
    return stars;
  }

  public static void main(String[] args){
      Scanner n = new Scanner(System.in);
      while (n.hasNext()){
        String curr = n.next();
        System.out.print(Stars(curr));
      }
  }
}
