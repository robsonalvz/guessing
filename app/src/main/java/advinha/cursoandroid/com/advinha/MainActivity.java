package advinha.cursoandroid.com.advinha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button botaoJogar;
    private TextView textResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        botaoJogar= findViewById(R.id.button_play);
        textResultado = findViewById(R.id.result_id);
        botaoJogar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                textResultado.setText("Texto alterado");
            }
        });


    }
}
