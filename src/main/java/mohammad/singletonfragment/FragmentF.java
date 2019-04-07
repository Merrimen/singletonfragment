package mohammad.singletonfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import mohammad.singletonfragment.PublicMethods;

public class FragmentF extends Fragment {

    static FragmentF fragment ;
    public static FragmentF getInstance(){
        if (fragment == null)
            fragment = new FragmentF();
        return fragment;
    }

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_f,container,false);
        TextView txt = v.findViewById(R.id.txt);
        txt.setOnClickListener(V->{
            PublicMethods.toast(getActivity(),"Master Jaayeri");
        });

        txt.setText("hi there");
        return v;
    }
}


