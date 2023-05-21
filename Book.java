/**
 * @author Heidi Brynn
 * @date 2/10/23
 * @course CSC 331-002
 * @purpose This class makes a book object that stores the books title,
 * author, cover, page number, copyright, and readtime
 */



public class Book {
    // attributes of book class
    private String title;
    private String author;
    private String cover;
    private int pages;
    private int copyright;
    private double readtime;

    // book constructor
    Book(String title, String author, String cover, int pages, int copyright, double readtime) {
        this.title = title;
        this.author = author;
        this.cover = cover;
        this.pages = pages;
        this.copyright = copyright;
        this.readtime = readtime;
    }
    // getters(accessors) methods
    public String getTitle() { return this.title; }
    public String getAuthor() { return this.author; }
    public String getCover() { return this.cover; }
    public int getPages() { return this.pages; }
    public int getCopyright() { return this.copyright; }
    public double getReadtime() { return this.readtime; }


    // setters(mutators) methods
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setCover(String cover) { this.cover = cover; }
    public void setPages(int pages) { this.pages = pages; }
    public void setCopyright(int copyright) { this.copyright = copyright; }
    public void setReadtime(double readtime) { this.readtime = readtime; }


    // calculate readtime method
    public double calculate_readtime(int ppm) {
        double readtime = ppm / this.pages;
        return readtime;
    }

    // display book
    public void show_book() {
        System.out.printf("%s%4s%s%n", this.title, "by ", this.author);
        System.out.printf("%s%s%n%s%4d%n",  "Cover: ",  this.cover, "Copyright: ", this.copyright);
        System.out.printf("%s%d%n%s%.2f%n%n", "Pages: ", this.pages, "read time: ", this.readtime);
    }
}
