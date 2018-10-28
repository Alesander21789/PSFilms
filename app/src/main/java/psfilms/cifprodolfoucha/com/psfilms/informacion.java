package psfilms.cifprodolfoucha.com.psfilms;



import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import android.view.MenuItem;



public class informacion extends AppCompatActivity implements fragmentoResumen.OnFragmentInteractionListener, fragmentoReparto.OnFragmentInteractionListener ,fragmentoTrailer.OnFragmentInteractionListener,FragmentoOtras.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);

        Toolbar toolbar =(Toolbar)findViewById(R.id.toolbar);
         setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");






/*
        Toolbar toolbar4 =(Toolbar)findViewById(R.id.toolbar4);
        setSupportActionBar(toolbar4);




        toolbar4.inflateMenu(R.menu.inicio_menu);

        toolbar4.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {

                switch (menuItem.getItemId()) {
                    case R.id.inicio_imagen_registro:


                        Intent intent = new Intent(informacion.this, inicio.class);
                        //EditText editText = (EditText) findViewById(R.id.editText);
                        //String message = editText.getText().toString();
                        // intent.putExtra(EXTRA_MESSAGE, message);
                        startActivity(intent);

                        // Toast toast1 = Toast.makeText(getApplicationContext(), "Prueba ASF", Toast.LENGTH_SHORT);


                        // toast1.show();

                        return true;


                }



                return false;
            }
        });

*/



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_informacion_toolbar, menu);

        return true;
    }









    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.



        switch (item.getItemId()) {

            case R.id.resumen:


                //Obtener la instancia del administrador de fragmentos
                FragmentManager fragmentmanager =getSupportFragmentManager();
                //obtener una nueva transaccion
                FragmentTransaction transaccion = fragmentmanager.beginTransaction();
                //crear un nuevo fragmento y añadirlo
                fragmentoResumen fragment = new fragmentoResumen();
                transaccion.add(R.id.informacion,fragment);
                transaccion.replace(R.id.informacion,fragment);
                //confirmo la transaccion
                transaccion.addToBackStack(null);
                transaccion.commit();

                // lo ultimo es que implemento

                return true;

            case R.id.reparto:
                //Obtener la instancia del administrador de fragmentos
                FragmentManager fragmentmanager2 =getSupportFragmentManager();
                //obtener una nueva transaccion
                FragmentTransaction transaccion2 = fragmentmanager2.beginTransaction();
                //crear un nuevo fragmento y añadirlo
                fragmentoReparto fragment2 = new fragmentoReparto();
                transaccion2.add(R.id.informacion,fragment2);
                //confirmo la transaccion
                transaccion2.replace(R.id.informacion,fragment2);
                transaccion2.addToBackStack(null);
                transaccion2.commit();

                // lo ultimo es que implemento

                return true;



            case R.id.trailers:
                //Obtener la instancia del administrador de fragmentos
                FragmentManager fragmentmanager3 =getSupportFragmentManager();
                //obtener una nueva transaccion
                FragmentTransaction transaccion3 = fragmentmanager3.beginTransaction();
                //crear un nuevo fragmento y añadirlo
                fragmentoTrailer fragment3 = new fragmentoTrailer();
                transaccion3.add(R.id.informacion,fragment3);
                //confirmo la transaccion
                transaccion3.replace(R.id.informacion,fragment3);
                transaccion3.addToBackStack(null);
                transaccion3.commit();

                // lo ultimo es que implemento

                return true;


            case R.id.otras:
                //Obtener la instancia del administrador de fragmentos
                FragmentManager fragmentmanager4 =getSupportFragmentManager();
                //obtener una nueva transaccion
                FragmentTransaction transaccion4 = fragmentmanager4.beginTransaction();
                //crear un nuevo fragmento y añadirlo
                FragmentoOtras fragment4 = new FragmentoOtras();
                transaccion4.add(R.id.informacion,fragment4);
                //confirmo la transaccion
                transaccion4.replace(R.id.informacion,fragment4);
                transaccion4.addToBackStack(null);
                transaccion4.commit();

                // lo ultimo es que implemento

                return true;

            default:
                return super.onOptionsItemSelected(item);

        }

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
