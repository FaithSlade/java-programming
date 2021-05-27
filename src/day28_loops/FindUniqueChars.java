package day28_loops;

public class FindUniqueChars {
    public static void main(String[] args) {
        String word ="jaavva";  // we interest only unique one > j,a,v
        String unique = "";

        for (int i = 0; i < word.length(); i++){
//           if (word.charAt(i) is not contains in unique
//            add to unique
//   normally contains and charAt can't do it together so we put +"" concat with empty space
//            to make charAt() become string cause contains methods read a String
          if (!unique.contains(word.charAt(i)+"")) {
                unique += word.charAt(i);
/**One at a time it checks if your String has the character or not. If the character is not in the String it will add the char to the String because its the first time it is seen. Then if the char was checked already it will be in the String which means in the future the statement will be false because it does contain the letter.*/
            }
        }
        System.out.println("unique = " + unique);
    }
}
