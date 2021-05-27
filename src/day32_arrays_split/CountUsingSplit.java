package day32_arrays_split;

public class CountUsingSplit {
    public static void main(String[] args) {
//             index         0          1          2        3        4
        String catTypes = "bengal cat tabby cat persian cat no cat here"; // use split: cat word will be remove that word
        String[] catsArray = catTypes.split("cat");
        System.out.println("Number of cat: " + (catsArray.length-1));
//        if cat is in the last position of the sentence this might not work 100%

//   or
        for(String type : catsArray){
            System.out.println(type);
        }

//     or

        int count = 0;
        for (int i = 0; i < catTypes.length()-2; i++){
            if(catTypes.substring(i,i+3).equals("cat")){
                count++;
            }
        }
        System.out.println(count);
    }
}
