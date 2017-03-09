package com.loonggg.coordinatorlayoutdemo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class BlankFragment extends Fragment {

    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_blank, null);

        final ListView listView = (ListView) view.findViewById(R.id.listView1);
        String[] ls = getResources().getStringArray(R.array.anim_type);
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < ls.length; i++) {
            list.add(ls[i]);
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1, list);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent intent = new Intent(getActivity(), SecondActivity.class);
                startActivity(intent);
                switch (position) {
                    case 0:
                        getActivity().overridePendingTransition(R.anim.fade, R.anim.hold);
                        break;
                    case 1:
                        getActivity().overridePendingTransition(R.anim.my_scale_action,
                                R.anim.my_alpha_action);
                        break;
                    case 2:
                        getActivity().overridePendingTransition(R.anim.scale_rotate,
                                R.anim.my_alpha_action);
                        break;
                    case 3:
                        getActivity().overridePendingTransition(R.anim.scale_translate_rotate,
                                R.anim.my_alpha_action);
                        break;
                    case 4:
                        getActivity().overridePendingTransition(R.anim.scale_translate,
                                R.anim.my_alpha_action);
                        break;
                    case 5:
                        getActivity().overridePendingTransition(R.anim.hyperspace_in,
                                R.anim.hyperspace_out);
                        break;
                    case 6:
                        getActivity().overridePendingTransition(R.anim.push_left_in,
                                R.anim.push_left_out);
                        break;
                    case 7:
                        getActivity().overridePendingTransition(R.anim.push_up_in,
                                R.anim.push_up_out);
                        break;
                    case 8:
                        getActivity().overridePendingTransition(R.anim.slide_left,
                                R.anim.slide_right);
                        break;
                    case 9:
                        getActivity().overridePendingTransition(R.anim.wave_scale,
                                R.anim.my_alpha_action);
                        break;
                    case 10:
                        getActivity().overridePendingTransition(R.anim.zoom_enter,
                                R.anim.zoom_exit);
                        break;
                    case 11:
                        getActivity().overridePendingTransition(R.anim.slide_up_in,
                                R.anim.slide_down_out);
                        break;

                    default:
                        break;
                }

            }
        });

        return view;
    }


}
