package oliva.marc.com.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ThinkSoft on 22/11/2017.
 */

public class AttractionAdapter extends ArrayAdapter<Attraction> {
    public AttractionAdapter(@NonNull Context context, ArrayList<Attraction> attraction) {
        super(context, 0,attraction);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent);
        }
        Attraction currentAttraction = getItem(position);

        ImageView attractionImageView = listItemView.findViewById(R.id.attraction_image);
        if (currentAttraction.hasImage()){
            attractionImageView.setImageResource(currentAttraction.getmImageResourceId());
            attractionImageView.setVisibility(View.VISIBLE);
        }else{
            attractionImageView.setVisibility(View.GONE);
        }

        TextView attractionTitleTextView = listItemView.findViewById(R.id.attraction_title);
        attractionTitleTextView.setText(currentAttraction.getmTitle());

        TextView attractionDescriptionTextView = listItemView.findViewById(R.id.attraction_description);
        attractionDescriptionTextView.setText(currentAttraction.getmDescription());

        return listItemView;
    }
}
