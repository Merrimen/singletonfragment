package mohammad.singletonfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import mohammad.singletonfragment.PublicMethods;

public class FragmentA extends Fragment {

    static FragmentA fragment ;
    public static FragmentA getInstance(){
        if (fragment == null)
            fragment = new FragmentA();
        return fragment;
    }

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_a,container,false);
        TextView txt = v.findViewById(R.id.txt);
        txt.setOnClickListener(V->{
            PublicMethods.toast(getActivity(),"Master Jaayeri");
        });

        txt.setText("hi there");

        String myName ="";
        if (getActivity() instanceof ViewPagerActivity)
         myName = ((ViewPagerActivity)getActivity()).getMyName();
        return v;
    }
}


