package bigmarbz.overwatch;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class templeofanubis extends AppCompatActivity implements View.OnClickListener {
    Button maptips;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_templeofanubis);
        maptips = (Button) findViewById(R.id.maptips);
        maptips.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.maptips){
            Uri uri5 = Uri.parse("https://www.youtube.com/watch?v=iwwV_np3pHQ");
            Intent intent5 = new Intent(Intent.ACTION_VIEW, uri5);
            startActivity(intent5);
        }
    }
}


