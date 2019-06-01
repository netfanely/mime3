package com.netfanely.mime3;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProductosFragment extends Fragment {
    TextView mtvNombre;
    String idcategoria;
    public ProductosFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_productos, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mtvNombre = view.findViewById(R.id.tvNombre);
        Bundle bundle = getArguments();
        idcategoria = bundle.getString("idcategoria");
        String nombre = bundle.getString("nombre");
        String descripcion = bundle.getString("descripcion");
        mtvNombre.setText(nombre);
        getActivity().setTitle(descripcion);
        leerDatos();
    }
    private void leerDatos() {
        RequestQueue queue = Volley.newRequestQueue(getActivity());
        String url ="https://pix.pe/servicioandroid/servicioproductos.php";

        StringRequest stringRequest = new StringRequest(Request.Method.POST, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.i("PRODUCTOS:",response);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.i("ERRORVOLLEY",error.getMessage());
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                HashMap<String,String> map = new HashMap<>();
                map.put("caty",idcategoria);
                return map;
            }
        };
        queue.add(stringRequest);
    }
}
