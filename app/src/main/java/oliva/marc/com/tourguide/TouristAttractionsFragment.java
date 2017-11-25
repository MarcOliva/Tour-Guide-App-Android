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
public class TouristAttractionsFragment extends Fragment {


    public TouristAttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.info_list, container, false);
        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction("Plaza Mayor", getString(R.string.plaza_mayor), R.mipmap.plaza_mayor));
        attractions.add(new Attraction("Palacio de Gobierno", getString(R.string.palacio_gobierno), R.mipmap.palacio_de_gobierno));
        attractions.add(new Attraction("Circuito Magico del Agua", getString(R.string.circuito_magico), R.mipmap.circuito_magico_del_agua));
        attractions.add(new Attraction("Museo de la Nacion", getString(R.string.museo_nacion), R.mipmap.museo_de_la_nacion));
        attractions.add(new Attraction("La Catedral", getString(R.string.catedral), R.mipmap.la_catedral));
        attractions.add(new Attraction("Iglesia del Convento de San Francisco", getString(R.string.iglesia_san_francisco), R.mipmap.iglesia_convento_san_francisco));
        attractions.add(new Attraction("Museo Nacional de Arqueologia,Antropologia e Historia", getString(R.string.museo_arqueologia_antropologia), R.mipmap.museo_nacional_de_arqueologia_antropologia_historia));
        attractions.add(new Attraction("Museo Arqueologico Rafael Larco Herrera", getString(R.string.museo_larco_herrera), R.mipmap.museo_arqueologico_rafael_larco_herrera));
        attractions.add(new Attraction("Iglesia del Convento de Santo Domingo", getString(R.string.iglesia_santo_domingo), R.mipmap.igleasia_convento_santo_domingo));
        attractions.add(new Attraction("Larcomar", getString(R.string.larcomar), R.mipmap.larcomar));
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
