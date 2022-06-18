package god.cna.guana;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class SlideAdapter extends FragmentStateAdapter {
    public SlideAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        String data;
        switch (position) {
            case 0:
                data = "";
                break;
            case 1:
                data = "";
                break;
            case 2:
                data = "";
                break;
            case 3:
                data = "";
                break;
            case 4:
                data = "";
                break;
            default:
                data = "";
                break;
        }
        return SlideFragment.newInstance(data);
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
