package psfilms.cifprodolfoucha.com.psfilms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class reproductorVideo extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {
YouTubePlayerView youtube;
String clave="AIzaSyDgMF7ZQ3OvUqBcwgIaClRU2GoxFLjBLxM";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reproductor_video);
        youtube=(YouTubePlayerView)findViewById(R.id.youtubePlayer);
        youtube.initialize(clave,this);

    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean restaurado) {

    if (!restaurado) {


   youTubePlayer.cueVideo("dzxFdtWmjto");

    }


    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {


        if (youTubeInitializationResult.isUserRecoverableError()) {

        youTubeInitializationResult.getErrorDialog(this,1).show();



        }else {



            String error="Error al inicializar youtube"+youTubeInitializationResult.toString();
            Toast.makeText(getApplication(),error,Toast.LENGTH_SHORT).show();
        }



    }



    protected void onActivityResult (int requestcode, int resultcode, Intent data) {


        if (resultcode==1) {

        getYoutubePlayerProvider().initialize(clave,this);


        }


    }



    protected YouTubePlayer.Provider getYoutubePlayerProvider () {



return  youtube;

    }
}
