package mohammad.singletonfragment;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ogaclejapan.smarttablayout.SmartTabLayout;

public class ViewPagerActivity extends AppCompatActivity {

    ViewPager pager;
    SmartTabLayout tabs ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        pager = findViewById(R.id.pager);
        tabs = findViewById(R.id.tabs);


        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager());
        pager.setAdapter(adapter);

        tabs.setViewPager(pager);
    }

    public String getMyName(){
        return "Jazayeri";
    }

}
