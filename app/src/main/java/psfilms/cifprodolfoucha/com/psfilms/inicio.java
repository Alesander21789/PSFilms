package psfilms.cifprodolfoucha.com.psfilms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

public class inicio extends AppCompatActivity  {
TableLayout table;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);


        table=(TableLayout)findViewById(R.id.tableLayout);

        table.setStretchAllColumns(true);

        TableRow fila = new TableRow(this);
        //fila.setId();
        TextView vista = new TextView(this);
        vista.setOnClickListener(_OnClickListener);
        //vista.setId("");
        vista.setText("imagen 1");

        TextView vista2 = new TextView(this);
        vista2.setOnClickListener(_OnClickListener);
        //vista.setId("");
        vista2.setText("imagen 2");
        TextView vista3 = new TextView(this);
        vista3.setOnClickListener(_OnClickListener);
        //vista.setId("");
        vista3.setText("imagen 3");
        TableRow fila2 = new TableRow(this);
        //fila.setId();
        TextView vista10 = new TextView(this);
        vista10.setOnClickListener(_OnClickListener);
        //vista.setId("");
        vista10.setText("imagen 4");
        TextView vista11 = new TextView(this);
        vista11.setOnClickListener(_OnClickListener);
        //vista.setId("");
        vista11.setText("imagen 5");
        TextView vista13 = new TextView(this);
        vista13.setOnClickListener(_OnClickListener);
        //vista.setId("");
        vista13.setText("imagen 6");
        TableRow fila3 = new TableRow(this);
        //fila.setId();
        TextView vista20 = new TextView(this);
        vista20.setOnClickListener(_OnClickListener);
        //vista.setId("");
        vista20.setText("imagen 4");
        TextView vista21 = new TextView(this);
        vista21.setOnClickListener(_OnClickListener);
        //vista.setId("");
        vista21.setText("imagen 5");
        TextView vista23 = new TextView(this);
        vista23.setOnClickListener(_OnClickListener);
        //vista.setId("");
        vista23.setText("imagen 6");

        fila.addView(vista);
        fila.addView(vista2);
        fila.addView(vista3);
        fila2.addView(vista10);
        fila2.addView(vista11);
        fila2.addView(vista13);
        fila3.addView(vista20);
        fila3.addView(vista21);
        fila3.addView(vista23);
        table.addView(fila);
        table.addView(fila2);
        table.addView(fila3);






    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.inicio_menu, menu);
        return true;
    }





/*
    public void sendMessage(View inicio) {
        Intent intent = new Intent(this, Login.class);
        //EditText editText = (EditText) findViewById(R.id.editText);
        //String message = editText.getText().toString();
        // intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }
*/


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.



        switch (item.getItemId()) {
            case R.id.inicio_imagen_registro:


                Intent intent = new Intent(this, registro.class);
                //EditText editText = (EditText) findViewById(R.id.editText);
                //String message = editText.getText().toString();
                // intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);

               // Toast toast1 = Toast.makeText(getApplicationContext(), "Prueba ASF", Toast.LENGTH_SHORT);


               // toast1.show();

                return true;

            default:
                return super.onOptionsItemSelected(item);

        }
    }


    private View.OnClickListener _OnClickListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {

            Intent intent = new Intent(inicio.this, informacion.class);
            //EditText editText = (EditText) findViewById(R.id.editText);
            //String message = editText.getText().toString();
            // intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);

        }
    };
}
