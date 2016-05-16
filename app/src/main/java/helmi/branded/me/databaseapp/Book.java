package helmi.branded.me.databaseapp;

import com.orm.SugarRecord;
import com.orm.dsl.Unique;

/**
 * Created by HelmiHasan on 16/05/2016.
 */
public class Book extends SugarRecord {
    @Unique
    String isbn;
    String title;
    String edition;

    // Default constructor is necessary for SugarRecord
    public Book() {

    }

    public Book(String isbn, String title, String edition) {
        this.isbn = isbn;
        this.title = title;
        this.edition = edition;
    }
}