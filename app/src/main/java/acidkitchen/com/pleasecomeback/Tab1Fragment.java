package acidkitchen.com.pleasecomeback;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by maxim.rossiytsev on 12/26/2017.
 */

public class Tab1Fragment extends Fragment{
    private static final String TAG = "Tab1Fragment";
    private Button payButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view = layoutInflater.inflate(R.layout.tab1_fragment, container, false);
        payButton = view.findViewById(R.id.payButton1);

        payButton.setOnClickListener((v) -> {
            Toast.makeText(getActivity(), "TEST PAYMENT CLICK 1", Toast.LENGTH_SHORT).show();
        });
        return view;
    }
}
