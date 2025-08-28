import java.util.*;

public class Main {
    public static void main(String[] args) {
        PostManager manager = new PostManager();

        System.out.println("═══ Social Media Post Manager ═══");
        String postTitle = "Java Programming Tips";
        int engagement = manager.calculateEngagement(150, 75, 25);
        String category = manager.getCategoryRating(engagement);

        manager.displayPostStats(postTitle, engagement);
        manager.displayPostStats(postTitle, engagement, category);

        String[] hashtags = {"#java", "#coding", "#programming", "#java", "#tips"};
        ArrayList<String> uniqueHashtags = manager.manageHashtags(hashtags);
        System.out.println("Unique Hashtags: " + uniqueHashtags);

        ArrayList<String> posts = new ArrayList<>(Arrays.asList("Advanced Java Tutorial", "Spring Boot Guide", "C Basics"));
        HashMap<String, Integer> postEngagement = new HashMap<>();
        postEngagement.put("Advanced Java Tutorial", 1200);
        postEngagement.put("Spring Boot Guide", 700);
        postEngagement.put("C Basics", 80);

        LinkedList<String> trending = manager.findTrendingPosts(posts, postEngagement);
        System.out.println("Trending Posts: " + trending);

        HashSet<String> authors = manager.getUniqueAuthors("Alice", "Bob", "Alice", "Charlie", "Bob");
        System.out.println("Unique Authors: " + authors);


    }
}
