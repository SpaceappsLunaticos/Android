package bogota.spaceapps.lunaticos;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
/*import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
*/
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.botonpre).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainActivity2.class));
            }
        });
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Main3Activity.class));
            }
        });
        findViewById(R.id.butonfav).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Main4Activity.class));
            }
        });
        findViewById(R.id.botonmundo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Favoritos.class));
            }
        });

        // Button Botonluna = (Button) findViewById(R.id.Botonluna);

        //Botonluna.setOnClickListener(this)//
    }
}
//    public void Reaccionboton (View view){}//    }

  /*  @Override
    public void onClick(View v) {


    }
}
*/