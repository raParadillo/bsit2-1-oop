public class Book {
    String title ;
    String author ;
    int pages ;
    boolean isAvailable;

    public Book(String Title, String Author, int Pages){
        title = Title;
        author = Author;
        pages = Pages;
        isAvailable = true;
        System.out.println("A new book '"+Title+"' by "+Author+" has been added to the library");


    }

    public void displayInfo(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Pages: "+title);
        System.out.println("Available: "+(isAvailable ? "Yes" : "No"));

    }
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("'" + title + "' has been borrowed.");
        } else {
            System.out.println("'" + title + "' is currently not available.");
        }
    }
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("'" + title + "' has been returned.");
        } else {
            System.out.println("'" + title + "' was not borrowed.");
        }
    }
}
