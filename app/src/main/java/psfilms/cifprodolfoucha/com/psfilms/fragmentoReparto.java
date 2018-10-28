package psfilms.cifprodolfoucha.com.psfilms;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link fragmentoReparto.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class fragmentoReparto extends Fragment {
    private RecyclerView rvMusicas;
    private GridLayoutManager glm;
    private MusicaAdapter adapter;
    private OnFragmentInteractionListener mListener;
    private Activity activity;

    public fragmentoReparto() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_fragmento_reparto, container, false);


        rvMusicas = (RecyclerView) view.findViewById(R.id.recyclerReparto);

        glm = new GridLayoutManager(activity, 2);
        rvMusicas.setLayoutManager(glm);
        adapter = new MusicaAdapter(dataSet());
        rvMusicas.setAdapter(adapter);



        return view;
    }

    private ArrayList<Musica> dataSet() {
        ArrayList<Musica> data = new ArrayList<>();
        data.add(new Musica("Tom Hardy", "Imagine Dragons", R.drawable.venon));
        data.add(new Musica("Radioactive", "Imagine Dragons", R.drawable.venon));
        data.add(new Musica("Radioactive", "Imagine Dragons", R.drawable.venon));
        data.add(new Musica("Radioactive", "Imagine Dragons", R.drawable.venon));
        data.add(new Musica("Radioactive", "Imagine Dragons", R.drawable.venon));
        data.add(new Musica("Radioactive", "Imagine Dragons", R.drawable.venon));
        return data;
    }


    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
