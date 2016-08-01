package com.eschool.app.school;

import com.eschool.app.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/*
 * 菜单：通知
 */
public class FragmentCoversation extends Fragment {
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		/*
		if (savedInstanceState != null
                && savedInstanceState.getBoolean("isConflict", false))
            return;
        errorItem = (RelativeLayout) getView().findViewById(R.id.rl_error_item);
        errorText = (TextView) errorItem.findViewById(R.id.tv_connect_errormsg);
		 */
        /*
        topMap = MYApplication.getInstance().getTopUserList();
        normal_list.addAll(loadConversationsWithRecentChat());
        listView = (ListView) getView().findViewById(R.id.list);
        adapter = new ConversationAdapter(getActivity(), normal_list, top_list,topMap);
        // 设置adapter
        listView.setAdapter(adapter);
		*/
	}

	@Override
	public void onHiddenChanged(boolean hidden) {
		// TODO Auto-generated method stub
		super.onHiddenChanged(hidden);
	}

	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		// TODO Auto-generated method stub
		super.onSaveInstanceState(outState);
	}
	
	
}
