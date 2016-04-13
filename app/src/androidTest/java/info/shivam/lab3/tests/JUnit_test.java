package info.shivam.lab3.tests;

/**
 * Created by Shivam on 4/13/2016.
 */

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import info.shivam.lab3.MainActivity;
import info.shivam.lab3.R;

public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity mainActivity;
    public JUnit_test(){
        super(MainActivity.class);
    }
    public void test_first(){
        mainActivity = getActivity();
        TextView textView = (TextView) mainActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();
        assertEquals("Bye World", tester);
    }
}
