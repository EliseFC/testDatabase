//http://www.jianshu.com/p/ee08f75b407c
//https://www.tutorialspoint.com/android/android_sqlite_database.htm
package ca.lakeheadu.elise.testdatabase;


import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    private final String TAG ="DatabaseHandler";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"Inside onCreate()");
        DBHelper db= new DBHelper(this);
        db.open();
        db.insertData();

    }

    public void viewText(int time,String location, int evaluation){
        TextView vTime= (TextView)findViewById(R.id.time);
        vTime.setText("time:"+time);
        TextView vLocation= (TextView)findViewById(R.id.location);
        vLocation.setText("location:"+location);
        TextView vEvaluation= (TextView)findViewById(R.id.evaluation);
        vEvaluation.setText("evaluation:"+ evaluation);
    }
}
