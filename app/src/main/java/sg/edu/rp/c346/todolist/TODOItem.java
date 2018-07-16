package sg.edu.rp.c346.todolist;

import java.util.Calendar;

/**
 * Created by 16043921 on 16/7/2018.
 */

public class TODOItem {

    private String title;
    private Calendar date;

    public TODOItem(String title, Calendar date) {
        this.title = title;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Calendar getDate() {
        return date;
    }

    public String getDateString() {
        String str = date.get(Calendar.DAY_OF_MONTH)+"/"+date.get(Calendar.MONTH)+"/"+date.get(Calendar.YEAR);
        return str;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }



    @Override
    public String toString() {
        return "TODOItem{" +
                "title='" + title + '\'' +
                ", date=" + date +
                '}';
    }
}
