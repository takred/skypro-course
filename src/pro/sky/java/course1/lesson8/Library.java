package pro.sky.java.course1.lesson8;

public class Library {
    private Book[] books;

    public Library(int length) {
        this.books = new Book[length];
    }

    public void putTheBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == (null)) {
                books[i] = book;
                System.out.println("Вы успешно занесли книгу в библиотеку.");
                return;
            } else if(i == books.length - 1){
                System.out.println("Не удалось положить книгу - в библиотеке больше нет места.");
                return;
            }
        }
    }

    public String[] viewAllBooks(){
        String[] booksSort = new String[books.length];

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }

        for (int i = 0; i < books.length; i++) {
            System.out.println(i);
            if (books[i] != null) {
                Book currentBook = books[i];
                String fullNameAuthor = currentBook.getAuthor().getFirstName() + " " + currentBook.getAuthor().getSecondName();
                String bookName = currentBook.getName();
                String yearOfPublication = String.valueOf(currentBook.getYearOfPublication());
                booksSort[i] = fullNameAuthor + ": " + bookName + ": " + yearOfPublication;
            } else {
                break;
            }
        }
        return booksSort;
    }

    public String getBookInfo(String name) {
        Book book = getBook(name);

        return book.getName() + " by " + book.getAuthor().getFirstName() + " " + book.getAuthor().getSecondName() + " was published in " + book.getYearOfPublication();
    }

    public void setYearOfPublicationByName(String name, int yearOfPublication) {
        Book book = getBook(name);
        if (book != null) {
            book.setYearOfPublication(yearOfPublication);

            for (int i = 0; i < books.length; i++) {
                if (books[i] != null
                        && books[i].getName().equals(name)) {

                    books[i] = book;
                    break;
                }
            }
        }
    }

    private Book getBook(String name) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] != null
                    && this.books[i].getName().equals(name)) {
                return this.books[i];
            }
        }
        return null;
    }
}
