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
public class TouristCalendarFragment extends Fragment {


    public TouristCalendarFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.info_list, container, false);
        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction("18 de Enero: Aniversario de la Fundación Española de Lima", getString(R.string.enero)));
        attractions.add(new Attraction("Febrero (fecha movible): Carnavales en Lima.", getString(R.string.febrero)));
        attractions.add(new Attraction("Abril (fecha movible):", getString(R.string.abril)));
        attractions.add(new Attraction("03 de Mayo:", getString(R.string.mayo)));
        attractions.add(new Attraction("29 de Junio:", getString(R.string.junio)));
        attractions.add(new Attraction("28 y 29 Julio: Fiestas Patrias.", getString(R.string.julio)));
        attractions.add(new Attraction("30 de Agosto: Fiesta en honor a Santa Rosa de Lima.", getString(R.string.agosto)));
        attractions.add(new Attraction("Octubre, Todo el Mes: Señor de los Milagros.", getString(R.string.octubre)));
        attractions.add(new Attraction("08 de Diciembre:", getString(R.string.ocho_diciembre)));
        attractions.add(new Attraction("25 de Diciembre:", getString(R.string.diciembre)));

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
