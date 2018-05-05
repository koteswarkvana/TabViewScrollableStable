package com.koti.apple.tabviewscrollablestable;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * ThirdFragment added to the home activity.
 */
public class ThirdFragment extends Fragment {

    private static final String TAG = "ThirdFragment";
    HomeActivity activity;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        activity = (HomeActivity) context;
        setHasOptionsMenu(true);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        activity = null;
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.third_fragment, container, false);

        // To send data from fragment to activity.
               /* Intent mIntent = new Intent(activity, SomeOtherActivity.class);
                mIntent.putExtra("Cursor", cursor.toString());
//                mIntent.putExtra(Constants.REASON_OR_ACTION_TYPE, Constants.REASON_REQUEST_CODE);
                mIntent.putExtra("KEY_PH_NO", "Number");
                startActivity(mIntent);*/

        return view;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        activity = null;
    }
}
