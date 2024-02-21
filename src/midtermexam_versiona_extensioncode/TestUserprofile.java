package midtermexam_versiona_extensioncode;

import java.util.Scanner;

public class TestUserprofile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your name to create a new user profile:");
        String userName = scanner.nextLine();
        
        System.out.println("Choose your favourite Genre from the following list:");
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }
        
        System.out.println("Enter the number corresponding to your favourite genre:");
        int genreChoice = scanner.nextInt();
        while (genreChoice < 1 || genreChoice > genres.length) {
            System.out.println("Invalid choice. Please enter a number between 1 and " + genres.length + ":");
            genreChoice = scanner.nextInt();
        }
        String favouriteGenre = genres[genreChoice - 1];
        
        UserProfile newUserProfile = new UserProfile(userName, favouriteGenre);
        
        System.out.println("UserProfile created successfully!");
        System.out.println("User Name: " + newUserProfile.getUserID());
        System.out.println("Favourite Genre: " + newUserProfile.getGenre());
    }
}
