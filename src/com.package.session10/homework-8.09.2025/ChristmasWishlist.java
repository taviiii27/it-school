import java.util.ArrayList;

public class ChristmasWishlist {
    public static void main(String[] args) {
        ArrayList<String> wishlist = new ArrayList<>();
        wishlist.add("Laptop");
        wishlist.add("Headphones");
        wishlist.add("Book");
        wishlist.add("Perfume");

        System.out.println("Christmas Wishlist:");
        for (String item : wishlist) {
            System.out.println(item);
        }
    }
}
