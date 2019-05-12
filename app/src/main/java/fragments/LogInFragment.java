package fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.auctionsystemapplication.AdminDashboardActivity;
import com.example.auctionsystemapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LogInFragment extends Fragment implements View.OnClickListener{
private AppCompatButton btnlogin;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_log_in, container, false);
        btnlogin = view.findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getActivity(), AdminDashboardActivity.class);
        startActivity(intent);
    }
}
