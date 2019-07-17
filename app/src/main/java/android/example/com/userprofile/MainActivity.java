package android.example.com.userprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView nameView = (TextView) findViewById(R.id.name);

        String name = "Cheryl";
        String birthday = "August";
        String country = "USA";

        nameView.setText(name);

        /** profile_picture1 is defined in XML
         * profile_picture2 is defined with setImageResource
         * profile_picture3 is defined with setDrawable
         */

        ImageView pic2 = (ImageView) findViewById(R.id.profile_picture2);
        pic2.setImageResource(R.drawable.profilepic);

        ImageView pic3 = (ImageView) findViewById(R.id.profile_picture3);
        Drawable drawable = getResources().getDrawable(R.drawable.profilepic);
        pic3.setImageDrawable(drawable);

    }
}
