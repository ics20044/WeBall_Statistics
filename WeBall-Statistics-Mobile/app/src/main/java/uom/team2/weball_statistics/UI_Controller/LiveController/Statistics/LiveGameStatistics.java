package uom.team2.weball_statistics.UI_Controller.LiveController.Statistics;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import uom.team2.weball_statistics.databinding.FragmentLiveGameStatisticsBinding;


public class LiveGameStatistics extends Fragment {

    private FragmentLiveGameStatisticsBinding binding;

    public LiveGameStatistics() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentLiveGameStatisticsBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}