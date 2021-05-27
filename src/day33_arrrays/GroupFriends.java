package day33_arrrays;

public class GroupFriends {
    public static void main(String[] args) {
        String[] friend = {"Aleks", "Ahmad", "Edgarc", "Emrah", "Nasim", "tameem", "teymur", "umid", "dilya", "jamilya", "murtiza"};

        for(int i = 0; i < friend.length; i++){
            System.out.println("Happy Holiday : " + friend[i]);
        }
        for (String eachFriend : friend){
            System.out.println("Happy Holiday : " + eachFriend + "!");
        }
    }
}
