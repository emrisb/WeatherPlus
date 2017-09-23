package com.farukydnn.weatherplus.ui.dashboard;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.farukydnn.weatherplus.R;
import com.farukydnn.weatherplus.core.network.interfaces.OnResponse;
import com.farukydnn.weatherplus.core.network.response.BaseResponse;
import com.farukydnn.weatherplus.core.network.response.CityList;
import com.farukydnn.weatherplus.core.network.response.SingleCity;
import com.farukydnn.weatherplus.core.ui.BaseActivity;
import com.farukydnn.weatherplus.core.ui.BaseFragment;
import com.farukydnn.weatherplus.enums.CityName;


public class CityListFragment extends BaseFragment implements OnResponse, View.OnClickListener {

    private final static String TAG = CityListFragment.class.getSimpleName();
    private View view;
    private RecyclerView cityList;
    public CityListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        super.onCreateView(inflater, container, savedInstanceState);

        Log.d(TAG, "onCreateView");
        view = inflater.inflate(R.layout.fragment_city_list, container, false);

        init();

        return view;
    }

    private void init() {
        Log.d(TAG, "init");

        cityList = view.findViewById(R.id.cityList);

        FloatingActionButton fab = view.findViewById(R.id.fab_AddLocation);
        fab.setOnClickListener(this);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        Log.d(TAG, "onActivityCreated");
        super.onActivityCreated(savedInstanceState);

//        testRequest();
    }

//    private void testRequest() {
//        String cityID1 = "2643743";
//        String cityID2 = "745044";
//
//        String url = "http://api.openweathermap.org/data/2.5/" +
//                "group?id=" + cityID1 + "," + cityID2 +
//                "&units=metric&lang=tr&APPID=3b17492d0ec2d9ff74a940f6f6c30d10";
//
//        GsonGetRequest<CityList> myReq = new GsonGetRequest<>
//                (url, CityList.class, null, multiSuccessListener(), createErrorListener());
//
//        AppController.getInstance().addToRequestQueue(myReq, "tag");
//    }

    private Response.Listener<SingleCity> singleSuccessListener() {

        return new Response.Listener<SingleCity>() {
            @Override
            public void onResponse(SingleCity response) {

                String cityName = response.getName();

                Toast.makeText(getActivity(), "SINGLE: " + cityName, Toast.LENGTH_LONG).show();

            }
        };

    }

    private Response.Listener<CityList> multiSuccessListener() {

        return new Response.Listener<CityList>() {
            @Override
            public void onResponse(CityList response) {

                for (SingleCity city : response.getCityList()) {
                    String cityName = city.getName();

                    Toast.makeText(getActivity(), "MULTI: " + cityName, Toast.LENGTH_SHORT).show();
                }

            }
        };

    }

    private Response.ErrorListener createErrorListener() {

        return new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.i(TAG, "Error : " + error.getLocalizedMessage());
            }
        };

    }

    @Override
    public void onClick(View view) {

        sendRequestInstance.sendAddCityToList((BaseActivity) getActivity(), CityName.Izmir.toString(), CityListFragment.this);
    }

    @Override
    public void onSuccessResponse(BaseResponse baseResponse) {

        if (baseResponse instanceof SingleCity) {

            SingleCity singleCity = (SingleCity) baseResponse;

            Toast.makeText(getActivity(), singleCity.getName(), Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onErrorResponse(VolleyError error, Class<? extends BaseResponse> responseClass) {

    }
}