package com.farukydnn.weatherplus.core.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.farukydnn.weatherplus.SendRequest;
import com.farukydnn.weatherplus.core.network.interfaces.OnResponse;
import com.farukydnn.weatherplus.core.network.response.BaseResponse;

/******************************
 * Created by Gökhan ÖZTÜRK   |
 * 23.09.2017                 |
 * GokhanOzturk@AndroidEdu.IO |
 *****************************/
public class BaseFragment extends Fragment {

    protected SendRequest sendRequestInstance = null;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        sendRequestInstance = new SendRequest();

        return super.onCreateView(inflater, container, savedInstanceState);
    }

    public void sendRequest(String url, OnResponse onResponse, Class<? extends BaseResponse> responseClass) {

        if (isAdded() && getActivity() instanceof BaseActivity) {
            ((BaseActivity) getActivity()).sendRequest(url, onResponse, responseClass);
        }
    }
}
