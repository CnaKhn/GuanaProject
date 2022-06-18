package god.cna.guana;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.Timer;
import java.util.TimerTask;

public class ProductActivity extends AppCompatActivity {
    RelativeLayout layoutToolbar;
    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            this.getSupportActionBar().hide();

        } catch (NullPointerException e) {
        }
        setContentView(R.layout.activity_product);
        layoutToolbar = findViewById(R.id.layout_toolbar);

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                UserManager userManager = new UserManager(ProductActivity.this);
                Snackbar.make(layoutToolbar, "Hello " + userManager.getEmail(), Snackbar.LENGTH_SHORT).show();
            }
        }, 500);


        ViewPager2 viewPager2 = findViewById(R.id.view_pager_slide);
        SlideAdapter adapter = new SlideAdapter(this);
        viewPager2.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.tab_layout_product);
        tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#A8A74343"));
        TabLayoutMediator mediator = new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position) {
                    case 0:
                        tab.setText("All");
                        break;
                    case 1:
                        tab.setText("Apparel");
                        break;
                    case 2:
                        tab.setText("Dress");
                        break;
                    case 3:
                        tab.setText("T-Shirt");
                        break;
                    case 4:
                        tab.setText("Bag");
                        break;
                    default:
                        break;
                }
            }
        });
        mediator.attach();

    }
}