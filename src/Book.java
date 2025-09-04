import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private ArrayList<Integer> ratings;
    private static int totalBooks = 0;


    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.ratings = new ArrayList<>();
        totalBooks++;
    }


    public void addRating(int rating) throws IllegalArgumentException {
        if (rating < 1 || rating > 5) {
            throw new IllegalArgumentException("Invalid rating: must be 1-5 stars");
        }else{
            ratings.add(rating);
            System.out.println("Rating " + rating + " added successfully");
        }

    }

    public double getAverageRating() {
        if (ratings.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int rating : ratings) {
            sum += rating;
        }
        return (double) sum / ratings.size();
    }

    public String getPopularityLevel() {
        double avg = getAverageRating();
        if (avg == 0.0) {
            return "No ratings";
        }
        if (avg >= 4.5) return "Excellent";
        if (avg >= 3.5) return "Good";
        if (avg >= 2.5) return "Average";
        if (avg >= 1.5) return "Poor";
        return "Terrible";
    }



        public void addMultipleRatings(int... ratings) {
            System.out.print("Ratings added: ");
            for (int i = 0; i < ratings.length; i++) {
                try {
                    this.ratings.add(ratings[i]);
                    System.out.print(ratings[i] + (i < ratings.length - 1 ? ", " : ""));
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }
    public static int getTotalBooks() {
        return totalBooks;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }

    public String displayBook() {
        return "Book: " + title + " by " + author + ", Average Rating: " + getAverageRating() + ", Level: " + getPopularityLevel();
    }
}
