package pro.sky.java.course1.lesson8;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Fedor", "Dostoevsky");
        Author author2 = new Author("Vladimir", "Mayakovsky");
        Book book1 = new Book("Crime and Punishment", author1, 1866);
        Book book2 = new Book("In a loud voice", author2, 1929);
        book2.setPublicationYear(1930);
        System.out.println(book1.getName() + "; " + author1.getFirstName() + " " + author1.getLastName() + "; " + book1.getPublicationYear());
        System.out.println(book2.getName() + "; " + author2.getFirstName() + " " + author2.getLastName() + "; " + book2.getPublicationYear());


    }
}
