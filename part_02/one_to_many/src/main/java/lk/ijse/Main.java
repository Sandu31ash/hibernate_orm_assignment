package lk.ijse;

import lk.ijse.entity.Author;
import lk.ijse.entity.Book;
import lk.ijse.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Author author1 = new Author();
        author1.setAId("A1");
        author1.setName("Enid Blyton");
        author1.setNationality("English");

        Author author2 = new Author();
        author2.setAId("A2");
        author2.setName("Anna Sewell");
        author2.setNationality("English");

        Book book1 = new Book();
        book1.setbId("B1");
        book1.setTitle("Black Beauty");
        book1.setIsbn("9780582401662");

        Book book2 = new Book();
        book2.setbId("B2");
        book2.setTitle("Caravan Children");
        book2.setIsbn("9781860330971");

        Book book3 = new Book();
        book3.setbId("B3");
        book3.setTitle("Saucy Jane Family");
        book3.setIsbn("9780099277101");

        List<Book> bookList = new ArrayList<>();
        bookList.add(book2);
        bookList.add(book3);

        author1.setBooks(bookList);
        book1.setAuthor(author2);
        book2.setAuthor(author1);
        book3.setAuthor(author1);



        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        ////////////////////Save new books to the database////////////////////////

        session.persist(book1);
        session.persist(book2);
        session.persist(book3);

        session.persist(author1);
        session.persist(author2);

        /////////////////////////Retrieve a book by id////////////////////////////

        //Book book = (Book) session.get("B2", Book.class);

        //Book book = (Book) session.load(Book.class, "B2");

//        System.out.println("ID: " + book.getbId());
//        System.out.println("Title: " + book.getTitle());
//        System.out.println("ISBN: " + book.getIsbn());

        /////////////////////////////Update a book////////////////////////////////

        //Book book = session.load(Book.class, "B2");

        //book.setIsbn("97860330971");

        //session.update(book);


        /////////////////////////////Delete a book////////////////////////////////

        //Book book = session.load(Book.class, "B2");

        /*session.delete(book);*/
        //session.remove(book);


        /*persist() is also used for update*/
        /*sout - for select queries*/
        //session.remove(customer);
        transaction.commit();
        session.close();

    }
}

//get - eager fetching
//load - lazy fetching --> load ekedi primary key eka thiyeddi eka database ekata gihin check karanne nah, wenama