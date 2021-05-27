package day22_string_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {
        String technologies = "java, html, css, selenium, testing, maven, cucumber";
// .charAt(put number here)
// .indexOf("put letter here")
//        to find first comma.
        System.out.println(technologies.indexOf(","));  //4
//        to find the last comma.
        System.out.println(technologies.lastIndexOf(","));  //40
//        for find middle one, we need to loop
        int indexOfJava = technologies.indexOf("java");
        System.out.println("indexOfJava = " + indexOfJava); //0 cause first number
        
        int indexOfCss = technologies.indexOf("css");
        System.out.println("indexOfCss = " + indexOfCss);  //12
        
        int indexOfCucumber = technologies.indexOf("cucumber");
        System.out.println("indexOfCucumber = " + indexOfCucumber);  //43

        int indexOfSql = technologies.indexOf("sql");
        System.out.println("indexOfSql = " + indexOfSql);//-1 cause not find it not show ERROR
//        but if .charAt() if the number inside can not find it will show ERROR

//        - when you use .contains it will use the same ways as .indexOf
//        Contains gives a boolean and index of gives the position, or index.
//        If you add additional logic how to use it yes

//            technologies contains "maven"
        if (technologies.contains("maven")) {
            System.out.println("maven is present");
        } else {
            System.out.println("maven is not present");
        }
// base on people who wrote java they said > -1
        if(technologies.indexOf("maven") > -1)
//            if maven give you -1 mean maven can not found
        {
            System.out.println("maven is present");
        } else {
            System.out.println("maven is not present");
        }
    }
}
