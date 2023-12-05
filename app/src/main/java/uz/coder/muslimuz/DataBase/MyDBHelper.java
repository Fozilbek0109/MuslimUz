package uz.coder.muslimuz.DataBase;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.List;

import uz.coder.muslimuz.model.DuolarModel;

public class MyDBHelper extends SQLiteOpenHelper implements DBServise{
        private static final String DB_NAME="Muslim";
        private static final int DB_VETSION=1;
        private static final String TAB_NAME="duolar";
        private static final String ID="id";
        private static final String NAME="name";
        private static final String MESSEGE="message";
        private static final String AR_NAME="ar_name";


    public MyDBHelper(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VETSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "create table " + TAB_NAME + "(" +
                ID + " integer not null primary key autoincrement " +
                NAME + " text not null " +
                MESSEGE + " text not null " +
                AR_NAME + " text not null " +
                ")";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    @Override
    public void add(DuolarModel duolarModel) {
        SQLiteDatabase writableDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(NAME,duolarModel.getName());
        contentValues.put(MESSEGE,duolarModel.getMessege());
        contentValues.put(AR_NAME,duolarModel.getArabName());
        writableDatabase.insert(TAB_NAME,null,contentValues);
    }

    @Override
    public void deleteStudent(DuolarModel model) {

    }

    @Override
    public List<DuolarModel> getAllStudent() {
        return null;
    }

    @Override
    public int getStudentCount() {
        return 0;
    }

    @Override
    public void editStudent() {

    }

    @Override
    public DuolarModel getStudentById(int id) {
        return null;
    }
}
