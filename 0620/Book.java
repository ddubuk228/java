public class Book {
    private String title;
    private String author;
    private String isBn;

    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setIsbn(String isBn) {
        this.isBn = isBn;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getIsbn() {
        return isBn;
    }
    public void displayInfo() {
        System.out.println("Title: " + title +", Author: " + author +", Isbn: " + isBn );
    }
}
