package psfilms.cifprodolfoucha.com.psfilms;



import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;

import psfilms.cifprodolfoucha.com.psfilms.clases.Comentario;
import psfilms.cifprodolfoucha.com.psfilms.clasesAdaptadoras.ComentariosAdapter;
import psfilms.cifprodolfoucha.com.psfilms.fragments.FragmentoOtras;
import psfilms.cifprodolfoucha.com.psfilms.fragments.fragmentComentarios;
import psfilms.cifprodolfoucha.com.psfilms.fragments.fragmentoReparto;
import psfilms.cifprodolfoucha.com.psfilms.fragments.fragmentoResumen;
import psfilms.cifprodolfoucha.com.psfilms.fragments.fragmentoTrailer;


public class informacion extends AppCompatActivity implements fragmentoResumen.OnFragmentInteractionListener, fragmentoReparto.OnFragmentInteractionListener ,fragmentoTrailer.OnFragmentInteractionListener,FragmentoOtras.OnFragmentInteractionListener,fragmentComentarios.OnFragmentInteractionListener, View.OnClickListener {


    ImageView  iv_trigger;
    CoordinatorLayout layout;
    private RecyclerView comentarios;
    private GridLayoutManager glm;
    private Activity activity;
    private ComentariosAdapter adapter;
    private Button btnExpBottomSheet;
    private LinearLayout bottomSheet;
    private Fragment fragmento=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);

        Toolbar toolbar =(Toolbar)findViewById(R.id.toolbar);
         setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");

        layout=(CoordinatorLayout) findViewById(R.id.coordinator);


        // Persistent BottomSheet
        init_persistent_bottomsheet();
        glm = new GridLayoutManager(activity, 1);
        comentarios=(RecyclerView)findViewById(R.id.recyclerComentarios);
        comentarios.setLayoutManager(glm);

        adapter= new ComentariosAdapter(dataSet());
        comentarios.setAdapter(adapter);






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




    private ArrayList<Comentario> dataSet() {
        ArrayList<Comentario> data = new ArrayList<>();
        data.add(new Comentario("Comentario 1", "Persona 1"));
        data.add(new Comentario("Comentario 2", "Persona 2"));
        data.add(new Comentario("Comentario 3", "Persona 3"));
        data.add(new Comentario("Comentario 4", "Persona 4"));
        data.add(new Comentario("Comentario 5", "Persona 5"));
        data.add(new Comentario("Comentario 6", "Persona 6"));
        return data;
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
                fragmento=fragment;
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
                fragmento= fragment2;
                transaccion2.add(R.id.informacion,fragment2);
                //confirmo la transaccion
                transaccion2.replace(R.id.informacion,fragment2);
                transaccion2.addToBackStack(null);
                transaccion2.commit();

                // lo ultimo es que implemento

                return true;



            case R.id.trailers:

                Intent intent = new Intent(this, reproductorVideo.class);
                //EditText editText = (EditText) findViewById(R.id.editText);
                //String message = editText.getText().toString();
                // intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);

                return true;


            case R.id.añadir_comentarios:
                //Obtener la instancia del administrador de fragmentos
                FragmentManager fragmentmanager4 =getSupportFragmentManager();
                //obtener una nueva transaccion
                FragmentTransaction transaccion4 = fragmentmanager4.beginTransaction();
                //crear un nuevo fragmento y añadirlo
                fragmentComentarios fragment4 = new fragmentComentarios();
                fragmento= fragment4;
                transaccion4.add(R.id.informacion,fragment4);
                //confirmo la transaccion
                transaccion4.replace(R.id.informacion,fragment4);
                transaccion4.addToBackStack(null);
                transaccion4.commit();

                // lo ultimo es que implemento

                return true;


            case R.id.otras:
                //Obtener la instancia del administrador de fragmentos
                FragmentManager fragmentmanager5 =getSupportFragmentManager();
                //obtener una nueva transaccion
                FragmentTransaction transaccion5 = fragmentmanager5.beginTransaction();
                //crear un nuevo fragmento y añadirlo
                FragmentoOtras fragment5 = new FragmentoOtras();
                fragmento= fragment5;
                transaccion5.add(R.id.informacion,fragment5);
                //confirmo la transaccion
                transaccion5.replace(R.id.informacion,fragment5);
                transaccion5.addToBackStack(null);
                transaccion5.commit();

                // lo ultimo es que implemento

                return true;






            default:
                return super.onOptionsItemSelected(item);

        }

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void onClick(View v) {





    }


    public void init_persistent_bottomsheet() {
        View persistentbottomSheet = layout.findViewById(R.id.bottomsheet);
        iv_trigger = (ImageView) persistentbottomSheet.findViewById(R.id.iv_fab);
        final BottomSheetBehavior behavior = BottomSheetBehavior.from(persistentbottomSheet);


        iv_trigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (behavior.getState() == BottomSheetBehavior.STATE_COLLAPSED) {
                    behavior.setState(BottomSheetBehavior.STATE_EXPANDED);
                } else {
                    behavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
                }
            }
        });

        if (behavior != null)
            behavior.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
                @Override
                public void onStateChanged(@NonNull View bottomSheet, int newState) {
                    //showing the different states
                    switch (newState) {
                        case BottomSheetBehavior.STATE_HIDDEN:
                            break;
                        case BottomSheetBehavior.STATE_EXPANDED:
                            if (fragmento==null) return;

                            FragmentManager fragmentmanager =getSupportFragmentManager();
                            //obtener una nueva transaccion
                            FragmentTransaction transaccion = fragmentmanager.beginTransaction();
                            //crear un nuevo fragmento y añadirlo
                            transaccion.remove(fragmento).commit();

                            break;
                        case BottomSheetBehavior.STATE_COLLAPSED:
                            break;
                        case BottomSheetBehavior.STATE_DRAGGING:
                            break;
                        case BottomSheetBehavior.STATE_SETTLING:
                            break;
                    }
                }

                @Override
                public void onSlide(@NonNull View bottomSheet, float slideOffset) {
                    // React to dragging events

                }
            });
}}
