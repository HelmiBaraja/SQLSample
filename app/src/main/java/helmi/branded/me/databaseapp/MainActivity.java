package helmi.branded.me.databaseapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.orm.SugarRecord;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Book> books = new ArrayList<>();
        books.add(new Book("isbn123", "Title here", "2nd edition"));
        books.add(new Book("isbn456", "Title here 2", "3nd edition"));
        books.add(new Book("isbn789", "Title here 3", "4nd edition"));
        SugarRecord.saveInTx(books);

        LoadDB();
    }

    private void LoadDB()
    {
        List<Book> books = Book.listAll(Book.class);

        for (Book book: books)
        {
            Log.d("book", "book="+book.title);

        }
    }
}
