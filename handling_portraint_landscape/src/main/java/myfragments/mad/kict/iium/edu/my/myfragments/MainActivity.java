package myfragments.mad.kict.iium.edu.my.myfragments;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Configuration config = getResources().getConfiguration();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        LM_fragment lm_fragment = new LM_fragment();
        PM_fragment pm_fragment = new PM_fragment();
        if (config.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            if (getFragmentManager().findFragmentById(R.id.lorpmode) == null) {
                fragmentTransaction.add(R.id.lorpmode,new LM_fragment());
                fragmentTransaction.commit();
            } else {
                fragmentTransaction.replace(R.id.lorpmode, lm_fragment);
                fragmentTransaction.commit();
            }
        } else {
            if (getFragmentManager().findFragmentById(R.id.lorpmode) == null) {
                fragmentTransaction.add(R.id.lorpmode, pm_fragment);
                fragmentTransaction.commit();
            } else {
                fragmentTransaction.replace(R.id.lorpmode, pm_fragment);
                fragmentTransaction.commit();
            }
        }
    }
}