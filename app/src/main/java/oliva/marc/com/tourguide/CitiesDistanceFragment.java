package oliva.marc.com.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class CitiesDistanceFragment extends Fragment {


    public CitiesDistanceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.info_list, container, false);
        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction("Lima --> Huaraz", "408 Kilómetros"));
        attractions.add(new Attraction("Lima --> Abancay", "907 Kilómetros"));
        attractions.add(new Attraction("Lima --> Arequipa", "1,009 Kilómetros"));
        attractions.add(new Attraction("Lima --> Ayacucho", "573 Kilómetros"));
        attractions.add(new Attraction("Cuzco. (Vía Lima - Arequipa - Cuzco)", "1,494 Kilómetros"));
        attractions.add(new Attraction("Lima --> Chachapoyas", "1,225 Kilómetros"));
        attractions.add(new Attraction("Lima --> Cajamarca", "850  Kilómetros"));
        attractions.add(new Attraction("Lima --> Chiclayo", "763  Kilómetros"));
        attractions.add(new Attraction("Lima --> Huancayo", "298  Kilómetros"));
        attractions.add(new Attraction("Lima --> Huanuco", "410  Kilómetros"));
        attractions.add(new Attraction("Lima --> Ica", "303  Kilómetros"));
        attractions.add(new Attraction("Lima --> Puno", "1,303  Kilómetros"));
        attractions.add(new Attraction("Lima --> Piura", "1,035  Kilómetros"));
        attractions.add(new Attraction("Lima --> Tacna", "1,293  Kilómetros"));
        attractions.add(new Attraction("Lima --> Tumbes", "1,270  Kilómetros"));
        attractions.add(new Attraction("Lima --> Trujillo", "557  Kilómetros"));

        AttractionAdapter itemsAdapter = new AttractionAdapter(getActivity(), attractions);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
