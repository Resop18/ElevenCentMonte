package paradoxgames.resopproductions.elevencentmonte;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ElevenCentMonte extends AppCompatActivity {

    Button howto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleven_cent_monte);

        howto = (Button)findViewById(R.id.HowTo);
        howto.setOnClickListener(new HowToListener());

    }

    public class HowToListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            startActivity(new Intent(ElevenCentMonte.this, HowToPlay.class));
        }
    }
}
