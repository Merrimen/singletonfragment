package mohammad.singletonfragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return FragmentA.getInstance();

            case 1:
                return FragmentB.getInstance();

            case 2:
                return FragmentC.getInstance();
            case 3:
                return FragmentD.getInstance();

            case 4:
            return FragmentE.getInstance();

            case 5:
                return FragmentF.getInstance();
        }
        return null;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "FragmentA";

            case 1:
                return "FragmentB";

            case 2:
                return "FragmentC";

            case 3:
                return "FragmentD";

            case 4:
                return "FragmentE";

            case 5:
                return "FragmentF";
        }

        return super.getPageTitle(position);
    }

    @Override
    public int getCount() {
        return 6;
    }
}
