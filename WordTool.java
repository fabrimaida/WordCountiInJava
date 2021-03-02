import java.util.Scanner;


public class WordTool{



    WordTool() {};

    public int wordCount ( String str ) {

      int count = 0;

      if (!(str == null || str.isEmpty()) ) {

        // we use split
        String[] w = str.split("\\s+");
        count = w.length;
      }
      return count;
    }

    public int symbolCount ( String str , boolean withSpaces) {

      int count = 0;
      // if the string is empy we don't do nothing since the value is already 0

      if (!(str == null || str.isEmpty()) ) {
        if (withSpaces) {
          count = str.length();
        } else {
          //no whitespace so we eleminate whitespace and get the lenght on the fly
          count = str.replace(" " , "").length();
        }
      }
      return count;
    }

    public static void main(String[] args) {

      WordTool wt = new WordTool();
      // here is a lorem impsum
      // String text = "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
      // but we want an input from the user
      Scanner input  = new Scanner(System.in);
      System.out.println("\nPleae enter the text you need to analyze : ");
      String text = input.nextLine();

      System.out.println("Analyzing the text : \n " + text);
      System.out.println("Total words " + wt.wordCount(text) );
      System.out.println("Total symbols (w. spaces): " + wt.symbolCount(text,false) );



    }


}
