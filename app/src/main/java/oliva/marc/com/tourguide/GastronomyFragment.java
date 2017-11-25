package oliva.marc.com.tourguide;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class GastronomyFragment extends Fragment {


    public GastronomyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.info_list, container, false);
        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction("Ceviche", getString(R.string.ceviche), R.mipmap.cebiche));
        attractions.add(new Attraction("Aji de Gallina", getString(R.string.aji_gallina), R.mipmap.aji_de_gallina));
        attractions.add(new Attraction("Causa Limeña", getString(R.string.causa_rellena), R.mipmap.causa_limena));
        attractions.add(new Attraction("Lomo Saltado", getString(R.string.lomo_saltado), R.mipmap.lomo_saltado));
        attractions.add(new Attraction("Pollo a la brasa", getString(R.string.pollo_brasa), R.mipmap.pollo_a_la_brasa));
        attractions.add(new Attraction("Tacu-Tacu", getString(R.string.tacutacu), R.mipmap.tacutacu));
        attractions.add(new Attraction("Papa Rellena", getString(R.string.papa_rellena), R.mipmap.papa_rellena));
        attractions.add(new Attraction("Escabeche", getString(R.string.escabeche), R.mipmap.escabeche));
        attractions.add(new Attraction("Anticuchos", getString(R.string.anticuchos), R.mipmap.anticuchos));
        attractions.add(new Attraction("Arroz con Pollo", getString(R.string.arroz_con_pollo), R.mipmap.arroz_con_pollo));

        AttractionAdapter itemsAdapter = new AttractionAdapter(getActivity(), attractions);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Attraction attraction = attractions.get(position);
                Intent intent = new Intent(getContext(), DetailAttractionActivity.class);
                intent.putExtra("idImage", attraction.getmImageResourceId());
                intent.putExtra("title", attraction.getmTitle());
                intent.putExtra("description", attraction.getmDescription());
                startActivity(intent);
            }
        });

        return rootView;
    }

}
