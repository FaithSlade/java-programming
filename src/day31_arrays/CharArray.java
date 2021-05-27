package day31_arrays;

public class CharArray {
    public static void main(String[] args) {

        char[] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n'};

//        print each letter using a loop
        for(char eachLetter:letters){  //for each
            System.out.print(eachLetter + " ");
// output: j a v a   i s   f u n
        }
//   covert char array into String:
        String sentence = new String(letters); // called constructor
        System.out.println("\nsentence = " + sentence); // output: sentence = java is fun

//   covert String into char array:
        String item = "wooden spoon";
        char[] itemArray = item.toCharArray(); // 'w','o','o','d','e',......,'n'
        System.out.println(itemArray.length);  //Array  12
        System.out.println(item.length());  //String 12

//        "bananas" , "apples", "kiwi", "mango", "papaya", "strawberry"
//                             0            1         2       3       4         5
        String[] fruits = {"bananas" , "apples", "kiwi", "mango", "papaya", "strawberry"};
        String fruitStr = "";

        for(String newFruits : fruits){  //we call Enhanced for loop or for each loop
            System.out.print(newFruits + "-");
            fruitStr += newFruits + "-";
        }
        System.out.println("\n"+ fruitStr);

//  String with delimiter|String.join("",): when you want something in the middle
        String[] language ={"java", "python", "c++", "sql", "ruby", "javascript"};
        System.out.println(String.join("|",language));
        System.out.println(String.join("##",language));  //put in the middle only
        String joinedLanguages = String.join(" <> ", language);
        System.out.println("joinedLanguages = " + joinedLanguages);
    }
}
