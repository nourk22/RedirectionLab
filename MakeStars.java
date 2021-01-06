import java.util.*;

public class MakeStars{
  public static String Word(String word){
    String stars = "";
    for (int i=0; i<word.length(); i++){
      stars+="*";
    }
    return stars;
  }

  public static void main(String[] args){

    Scanner n = new Scanner(System.in);
    while (n.hasNextLine()){
      String curr_line = n.nextLine();
      Scanner line = new Scanner(curr_line);


      while (line.hasNext()){
        String word = line.next();
        System.out.print(Word(word));
        if (line.hasNext()){
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
