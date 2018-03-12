import database.DBMain;
import models.Author;
import models.Book;

import java.util.List;

public class Main {

    public static void main(String[] args) {

//        save data in the authors table
        Author author1 = new Author("Victoria", "Hislop", 59);
        DBMain.save(author1);

        Author author2 = new Author("Terry", "Pratchett", 66);
        DBMain.save(author2);

//        save data in the books table
        Book book1 = new Book("The Island", 2005, author1);
        DBMain.save(book1);

        Book book2 = new Book("The Carpet People", 1971, author2);
        DBMain.save(book2);

        Book book3 = new Book("The Return", 2008, author1);
        DBMain.save(book3);


//        update author
        author1.setAge(58);
        DBMain.update(author1);

////        delete an object by passing it in
//        DBMain.delete(book2);

//        delete an object by Id
        DBMain.deleteById(book2.getId(),"Book");

//        find an object by Id
//        DBMain.findById(author1.getId(),"Author");
        DBMain.findById(book1.getId(),"Book");

//        List books by author
        List<Book> bookByAuthor1 = DBMain.getBooks(author1.getId());

//        List all books
        List<Book> books = DBMain.getAll("Book");

//        delete all data from books
        DBMain.deleteAll("Book");
    }
}
