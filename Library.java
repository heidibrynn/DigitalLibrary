/**
 * @author Heidi Brynn
 * @date 2/10/23
 * @course CSC 331-002
 * @purpose This driver file creates instances of the book object
 * and stores them in an array library as well as displays them
 */



import java.util.Scanner;
public class Library {
    // method to display the library
    public static void show_library(Book[] library) {
        for (Book book: library) {
            book.show_book();
        }
    }
    // main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // get the total number of books
        System.out.println("How many books do you want in your library?");
        int library_total = input.nextInt();
        // create an array of Book objects called library that is as long as the total entered
        Book[] library = new Book[library_total];
        // start loop to get information for each book
        for (int count = 0; count < library_total; count++) {
            input.nextLine();
            System.out.println("Enter the books title: ");
            String title = input.nextLine();
            System.out.println("Enter the books author: ");
            String author = input.nextLine();
            System.out.println("Enter the books cover: ");
            String cover = input.nextLine();
            System.out.println("Enter the number of pages: ");
            int pages = input.nextInt();
            System.out.println("Enter the copyright: ");
            int copyright = input.nextInt();
            System.out.println("Enter the readtime: ");
            double readtime = input.nextDouble();
            // put the new book in the library array
            library[count] = new Book(title, author, cover, pages, copyright, readtime);
        }
        // call the show_library method
        show_library(library);
    }

}
