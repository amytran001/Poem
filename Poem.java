public class Poem {
    private String title;
    private int numberOfLines;

    // Constructor
    public Poem(String title, int numberOfLines){
        this.title = title;
        this.numberOfLines = numberOfLines;
    }
    // Getter methods
    public String getTitle(){
        return title;
    }
    public int getNumberOfLines(){
        return numberOfLines;
    }
}
