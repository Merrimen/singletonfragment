package mohammad.singletonfragment;

import android.content.Context;
import android.widget.Toast;

public class PublicMethods {
    public static void toast(Context mContex, String msg){
        Toast.makeText(mContex, msg, Toast.LENGTH_LONG).show();
    }
}
