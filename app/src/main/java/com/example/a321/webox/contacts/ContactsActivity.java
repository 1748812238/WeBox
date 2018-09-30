package com.example.a321.webox.contacts;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.a321.webox.R;

import java.util.ArrayList;
import java.util.List;

public class ContactsActivity extends Fragment {

    private View view;
    private ListView lv;
    private List<ContactsBean> data;
    private ContactsAdapter contactsAdapter;
    private View viewHead;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_contacts,container,false);
        lv = view.findViewById(R.id.lv_contacts_activity);

        data = new ArrayList<>();
        for(int i = 0;i < 20;i++){
            ContactsBean contactsBean = new ContactsBean();
            contactsBean.setContactsImage(R.drawable.msg);
            contactsBean.setContactsId("用户ID" + i);
            data.add(contactsBean);
        }

        contactsAdapter = new ContactsAdapter(view.getContext(),data);
        viewHead = View.inflate(view.getContext(),R.layout.head_contacts_listview,null);
        lv.addHeaderView(viewHead);
        lv.setAdapter(contactsAdapter);

        return view;
    }
}
