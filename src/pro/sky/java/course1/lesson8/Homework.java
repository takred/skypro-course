package pro.sky.java.course1.lesson8;

public class Homework {

    static void putTheBook(Book[] bookshelf, Book book) {
        for (int i = 0; i < bookshelf.length; i++) {
            if (bookshelf[i] == (null)) {
                bookshelf[i] = book;
                System.out.println("Вы успешно положили книгу на полку.");
                return;
            } else if(i == bookshelf.length - 1){
                System.out.println("Не удалось положить книгу - на полке больше нет места.");
                return;
            }
        }
    }

    static String[] viewAllBooks(Book[] books){
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

    public static void main(String[] args) {
        Author shpagin = new Author("Евгений", "Шпагин");
        Author morozov = new Author("Александр", "Морозов");
        Author tolkin = new Author("Джон", "Толкин");
        Author rouling = new Author("Джоан", "Роулинг");
        Author luis= new Author("Клайв", "Льюис");

        Book book1 = new Book("Нарды, бабки, два мушкета", shpagin, 2022);
        Book book2 = new Book("Зимний хутор", morozov, 1871);
        Book book3 = new Book("Властелин колец", tolkin, 1954);
        Book book4 = new Book("Гарри Поттери и философский камень", rouling, 1997);
        Book book5 = new Book("Лев, Колдунья и Платяной шкаф", luis, 1944);

        book1.setYearOfPublication(1922);

        Book[] books = new Book[10];

        books[0] = book1;
        books[1] = book2;

        Book[] bookshelf = new Book[10];

        putTheBook(bookshelf, book1);
        putTheBook(bookshelf, book2);
        putTheBook(bookshelf, book3);
        putTheBook(bookshelf, book4);
        putTheBook(bookshelf, book5);

        String[] strings = viewAllBooks(bookshelf);
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null) {
                System.out.println(strings[i]);
            }
        }

        Library library = new Library(bookshelf.length);
        for (int i = 0; i < bookshelf.length; i++) {
            if (bookshelf[i] != null) {
                library.putTheBook(bookshelf[i]);
            }
        }

        System.out.println(library.getBookInfo("Лев, Колдунья и Платяной шкаф"));

        library.setYearOfPublicationByName("Лев, Колдунья и Платяной шкаф", 1950);
    }

}
