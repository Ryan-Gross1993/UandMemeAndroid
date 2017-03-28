package kmccann.rgross.io.uandmeme;

/**
 * Created by kevinmccann on 3/28/17.
 */

public class Meme {

    String title;
    String imagePath;
    String date;

    public Meme(String title, String imagePath, String date) {
        this.title = title;
        this.imagePath = imagePath;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
