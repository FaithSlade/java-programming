package day05_primitives_concatanation;

public class Movie {
    public static void main(String[] args){
        String name = "Toy Story";
        String genre = "Animation";
        double duration = 2.30;
        String releaseDate = "November 22, 1995";
        String rating = "PG";
        boolean isASequelsOrNot = true;
        byte rottenTomatoesRating = 100;
        boolean isOnDvd = true;

        System.out.println("-----Welcome to the Cinema-----");
        System.out.println("Tonight we are streaming " +name+ " which was released on " + releaseDate + ".");
        System.out.println("This an " + genre + " movie got a " + rottenTomatoesRating + " rating on Rotten Tomatoes.");
        System.out.println("The rating is " + rating + " and it runs for " + duration + " hours.");
        System.out.println("This is a sequel " +isASequelsOrNot + " and is on dvd " + isOnDvd);
    }
}
