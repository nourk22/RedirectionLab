import java.util.*;

public class MakeStars{
  public static String Word(String word){
    String stars = "";
    for (int i=0; i<word.length(); i++){
      stars+="*";
    }
    stars+=" ";
    return stars;
  }

  public static void main(String[] args){

    Scanner n = new Scanner(System.in);
    while (n.hasNextLine()){
      String curr_line = n.nextLine();
      Scanner test = new Scanner(curr_line);


      while (test.hasNext()){
        String word = test.next();
        System.out.print(Word(word));
      }
      System.out.println();
    }
  }
}
