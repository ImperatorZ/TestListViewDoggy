package sky.alien.testlistviewdoggy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int resId[] = {R.drawable.german_shepherd,
                R.drawable.labrador_retriever, R.drawable.blue_dog, R.drawable.beagle
                , R.drawable.boxer, R.drawable.golden_retriever,
                R.drawable.poodle, R.drawable.pug, R.drawable.siberian_husky,
                R.drawable.great_dane};

        String breed[] = {"German shepherd", "Labrador retriever",
                "Bull dog", "Beagle",
                "Boxer", "Golden retriever", "Poodle", "Pug",
                "Siberian husky",
                "Great dane"};

        String description[] = {getString(R.string.german_shepherd_des), getString(R.string.labrador_retriever_des), getString(R.string.blue_dog_des), getString(R.string.beagle_des)
                , getString(R.string.boxer_des), getString(R.string.golden_des), getString(R.string.poodle_des), getString(R.string.pug_des), getString(R.string.siberian_des)
                , getString(R.string.greatdane_des)};


    }
}
