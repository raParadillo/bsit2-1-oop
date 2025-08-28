import java.util.*;

public class PostManager {

    public int calculateEngagement(int...interactions){
        int total = 0;
        if (interactions == null || interactions.length == 0) {
            return 0;
        }
        for (int interaction : interactions) {
            total += interaction;
        }
        return total;
    }

    public String getCategoryRating(int engagementScore) {
        if (engagementScore >= 1000) return "Viral";
        else if (engagementScore >= 500) return "Popular";
        else if (engagementScore >= 100) return "Good";
        else if (engagementScore >= 50) return "Low";
        return "Poor";
    }
    public void displayPostStats(String postTitle, int engagementScore) {
        System.out.println("Post: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore+"\n");
    }
    public void displayPostStats(String postTitle, int engagementScore, String category) {
        System.out.println("Post: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore);
        System.out.println("Category: " + category+ "\n");
    }
    public ArrayList<String> manageHashtags(String[] hashtags) {
        if (hashtags == null) return new ArrayList<>();

        HashSet<String> uniqueSet = new LinkedHashSet<>();

        for (int i = 0; i < hashtags.length && i < 5; i++) {
            uniqueSet.add(hashtags[i]);
        }

        return new ArrayList<>(uniqueSet);
    }
    public LinkedList<String> findTrendingPosts(ArrayList<String> posts, HashMap<String, Integer> postEngagement) {
        LinkedList<String> trending = new LinkedList<>();
        if (posts == null || postEngagement == null) return trending;

        for (String post : posts) {
            Integer score = postEngagement.get(post);
            if (score != null && score > 500) {
                trending.add(post);
            }
        }
        return trending;
    }
    public HashSet<String> getUniqueAuthors(String... authors) {
        if (authors == null) return new HashSet<>();

        return new LinkedHashSet<>(Arrays.asList(authors));
    }

}
