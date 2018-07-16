package sg.edu.rp.c346.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvList;

    ArrayList<TODOItem> alTODO;

    CustomAdapter caTODO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvList = findViewById(R.id.listViewTODO);

        alTODO = new ArrayList<>();
        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();

        date1.set(2018,02,02);
        date2.set(2018,07,12);

        TODOItem item1 = new TODOItem("MSA", date1);
        TODOItem item2 = new TODOItem("Go for haircut", date2);

        alTODO.add(item1);
        alTODO.add(item2);

        caTODO = new CustomAdapter(this,R.layout.todo_item,alTODO);

        lvList.setAdapter(caTODO);
    }
}
