package pro.sky.java.course1.lesson8;

public class Book {
    private final String name;
    private int publicationYear;
   private final Author author;

    public Book(String name, Author author, int publicationYear) {
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;

    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
//        if (publicationYear < 1950 || publicationYear > 2050) {
//            System.out.println("Invalid publishing year parameter: " + publicationYear);
//            return;
//        }
        this.publicationYear = publicationYear;
    }
}
