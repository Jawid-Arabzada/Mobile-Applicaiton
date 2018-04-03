package myfragments.mad.kict.iium.edu.my.multiplescreen;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by JAWID ARABZADA on 4/4/2018.
 */

public class Fragment2 extends Fragment {

    public Fragment2() {
    }



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment2,container,false);

    }
}
