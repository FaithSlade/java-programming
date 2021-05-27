package day14_multi_branch_if_statements;

public class ChooseLanguage {
    public static void main(String[] args) {
        int selection = 3;
        System.out.println("Choose your language");
        if (selection == 1) {
            System.out.println("Hello, thank for you call");
        } else if (selection == 2){
            System.out.println("Hola, gracias para llamar");
        } else if (selection == 3){
            System.out.println("สวัสดีค่ะ ขอบคุณสำหรับการโทร");
        } else if (selection == 4){
            System.out.println("Privet, spasibo za vash zvonok");
        } else if (selection == 5){
            System.out.println("Merci ,pour votre appel");
        } else {
            System.out.println("lets talk java and english, hello");
//            else need to be at the end for multiple if statement
//            If statement false: it will check all the condition above first(it not jump to else)
//            until it find else condition
        }
    }
}