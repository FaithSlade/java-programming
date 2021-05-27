package day21_string_manipulation;

public class ReplacePractice {
    public static void main(String[] args) {
        String word = "github";
        System.out.println(word.toUpperCase());
//        change to -> gitLab
//      if it not find it, it still print without change, no error
        System.out.println(word.replace("hub", "Lab"));
// down below word still github when print
        System.out.println("word = " + word); // github
// if you want to change it permanent -> gitLab
        word = word.replace("hub", "Lab");
        System.out.println("word = " + word); //gitLab

//        gitLab
//        i -> o  a-i  -> gotlib
//        if have character you can use char
        System.out.println(word.replace('i', 'o').replace('a', 'i'));

        String sentence = "java is fun";
        String withNoSpaces = sentence.replace(" ", "");
        System.out.println("withNoSpaces = " + withNoSpaces);  //javaisfun

//        Chaining: 
//        "java" -> "selenium" , "fun" -> "a lot of fun" -> assign back to sentence
        System.out.println(sentence.replace("java", "Selenium").replace("fun", "a lot of fun"));  //print
        sentence = sentence.replace("java", "Selenium").replace("fun", "a lot of fun");
        System.out.println("sentence = " + sentence); //Selenium is a lot of fun

        String result = "1-48 of over 4,000 results for \"java book";
        result = result.replace("1-48 of over", "")
                .replace(",", "")
                .replace("results for \"java book", "");
        System.out.println("result = " + result);

        int count = Integer.parseInt(result);
        count++;
        if (count > 0) {
            System.out.println("Search success");
        }
    }
}