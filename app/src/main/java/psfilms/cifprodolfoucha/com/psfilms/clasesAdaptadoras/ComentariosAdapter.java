package psfilms.cifprodolfoucha.com.psfilms.clasesAdaptadoras;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import psfilms.cifprodolfoucha.com.psfilms.R;
import psfilms.cifprodolfoucha.com.psfilms.clases.Comentario;

public class ComentariosAdapter extends RecyclerView.Adapter<ComentariosAdapter.ComentariosViewHolder>{
    private ArrayList<Comentario> data;


    public ComentariosAdapter(ArrayList<Comentario> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ComentariosViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {


        return new ComentariosViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.comentarioslista, viewGroup,false));
    // return new ComentariosViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.comentarioslista, viewGroup, false));


    }

    @Override
    public void onBindViewHolder(@NonNull ComentariosViewHolder holder, int i) {
Comentario comentario= data.get(i);

holder.comentario.setText(comentario.getComentario());
holder.nombre.setText(comentario.getPerosna());
    }



    @Override
    public int getItemCount() {
        return data.size();
    }


    class ComentariosViewHolder extends RecyclerView.ViewHolder{
    TextView comentario;
    TextView nombre;



        public ComentariosViewHolder( View itemView) {
            super(itemView);


    comentario =(TextView)itemView.findViewById(R.id.comentarios);
    nombre = (TextView)itemView.findViewById(R.id.autor);



        }


    }
}
