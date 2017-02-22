//http://www.jianshu.com/p/ee08f75b407c
//https://www.tutorialspoint.com/android/android_sqlite_database.htm
package ca.lakeheadu.elise.testdatabase;


import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;


public class MainActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DBHelper db= new DBHelper(this);
       // SQLiteDatabase temp=db.getWritableDatabase();
        db.insertData();
        /*
        DBHelper db= new DBHelper(this);
        ArrayList<HashMap<String, String>> list=db.getList();
        if(list.size()!=0){
           // ListView lv=this.getListView();
        }*/
    }
}
