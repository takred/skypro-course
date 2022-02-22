package pro.sky.java.course1.lesson9;

public class Author {
    private String firstName;
    private String secondName;

    public Author(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getSecondName() {
        return this.secondName;
    }

    public boolean equals(Object obj) {
        Author author = (Author) obj;
        if (firstName.equals(author.getFirstName()) &&
                secondName.equals(author.getSecondName())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return firstName.hashCode() + secondName.hashCode();
    }

    public String toString() {
        return "Author: " + firstName + " " + secondName;
    }
}
