package god.cna.guana;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ViewProductFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_view_product, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ImageView btnBack = view.findViewById(R.id.btn_product_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().onBackPressed();
            }
        });

        ImageView btnLike = view.findViewById(R.id.btn_add_like);
        btnLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnLike.setImageResource(R.drawable.ic_heart_on);
            }
        });

        TextView txtSizeXS, txtSizeS, txtSizeM, txtSizeL, txtSizeXL;
        txtSizeXS = view.findViewById(R.id.txt_size_xs);
        txtSizeXS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtSizeXS.setBackgroundResource(R.drawable.bg_rounded);
                txtSizeXS.setTextColor(Color.BLACK);
                txtSizeXS.setTextSize(18);
                txtSizeXS.setGravity(View.TEXT_ALIGNMENT_CENTER);
                txtSizeXS.setPadding(4, 4, 4, 4);
            }
        });
        txtSizeS = view.findViewById(R.id.txt_size_s);
        txtSizeS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtSizeS.setBackgroundResource(R.drawable.bg_rounded);
                txtSizeS.setTextColor(Color.BLACK);
                txtSizeS.setTextSize(18);
                txtSizeS.setGravity(View.TEXT_ALIGNMENT_CENTER);
                txtSizeS.setPadding(4, 4, 4, 4);
            }
        });
        txtSizeM = view.findViewById(R.id.txt_size_M);
        txtSizeM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtSizeM.setBackgroundResource(R.drawable.bg_rounded);
                txtSizeM.setTextColor(Color.BLACK);
                txtSizeM.setTextSize(18);
                txtSizeM.setGravity(View.TEXT_ALIGNMENT_CENTER);
                txtSizeM.setPadding(4, 4, 4, 4);
            }
        });
        txtSizeL = view.findViewById(R.id.txt_size_L);
        txtSizeL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtSizeL.setBackgroundResource(R.drawable.bg_rounded);
                txtSizeL.setTextColor(Color.BLACK);
                txtSizeL.setTextSize(18);
                txtSizeL.setGravity(View.TEXT_ALIGNMENT_CENTER);
                txtSizeL.setPadding(4, 4, 4, 4);
            }
        });
        txtSizeXL = view.findViewById(R.id.txt_size_XL);
        txtSizeXL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtSizeXL.setBackgroundResource(R.drawable.bg_rounded);
                txtSizeXL.setTextColor(Color.BLACK);
                txtSizeXL.setTextSize(18);
                txtSizeXL.setGravity(View.TEXT_ALIGNMENT_CENTER);
                txtSizeXL.setPadding(4, 4, 4, 4);
            }
        });
    }
}
