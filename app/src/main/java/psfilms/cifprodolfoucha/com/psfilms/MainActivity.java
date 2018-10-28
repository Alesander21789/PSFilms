package psfilms.cifprodolfoucha.com.psfilms;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.widget.Toast;

public class MainActivity extends Activity {
Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ConnectivityManager cm =
                (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        boolean isConnected = activeNetwork.isConnectedOrConnecting();


        if (isConnected) {


            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(MainActivity.this, inicio.class);
                    startActivity(intent);
                    finish();
                }
            }, 4000);

        }else {

            Toast toast =
                    Toast.makeText(getApplicationContext(),
                            "Toast con gravity", Toast.LENGTH_SHORT);

            toast.setGravity(Gravity.CENTER|Gravity.LEFT,0,0);

            toast.show();


        }
    }
}
