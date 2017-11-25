package oliva.marc.com.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailAttractionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_attraction);
        int idImage = getIntent().getIntExtra("idImage", 0);
        String title = getIntent().getStringExtra("title");
        String description = getIntent().getStringExtra("description");

        setTitle(title + " Details");

        ImageView imageView = findViewById(R.id.detail_image);
        if (idImage != -1) {
            imageView.setImageResource(idImage);
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        TextView titleTexView = findViewById(R.id.detail_title);
        titleTexView.setText(title);
        TextView descriptionTextView = findViewById(R.id.detail_description);
        descriptionTextView.setText(description);

    }
}
