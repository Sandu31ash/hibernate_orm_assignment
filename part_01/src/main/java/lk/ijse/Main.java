package lk.ijse;

import lk.ijse.entity.Book;
import lk.ijse.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book();
        book1.setbId("B1");
        book1.setTitle("Black Beauty");
        book1.setIsbn("9780582401662");
//
//        Book book2 = new Book();
//        book2.setbId("B2");
//        book2.setTitle("Diary of a Wimpy Kid");
//        book2.setIsbn("9783");

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        ////////////////////Save new books to the database////////////////////////

        session.persist(book1);
        //session.persist(book2);

        /////////////////////////Retrieve a book by id////////////////////////////

        //Book book = (Book) session.get("B2", Book.class);

        //Book book = (Book) session.load(Book.class, "B2");

//        System.out.println("ID: " + book.getbId());
//        System.out.println("Title: " + book.getTitle());
//        System.out.println("ISBN: " + book.getIsbn());

        /////////////////////////////Update a book////////////////////////////////

        //Book book = session.load(Book.class, "B2");

        //book.setIsbn("9783732508686");

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