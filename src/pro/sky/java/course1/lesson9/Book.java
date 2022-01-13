package pro.sky.java.course1.lesson9;

public class Book {
    private String name;
    private Author author;
    private int yearOfPublication;

    public Book(String name, Author author, int yearOfPublication) {
        this.name = name;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public boolean equals(Object obj) {
        Book book = (Book) obj;

        if (author.equals(book.getAuthor()) &&
        name.equals(book.getName()) &&
        yearOfPublication == book.getYearOfPublication()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return name.hashCode() - author.hashCode() + yearOfPublication;
    }

    public String toString() {
        return "Book: " + name + " by " + author.toString();
    }
}
