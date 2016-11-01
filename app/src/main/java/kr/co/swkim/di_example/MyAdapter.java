package kr.co.swkim.di_example;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by swkim on 2016-11-01.
 */

public class MyAdapter extends BaseAdapter {
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
//
//    @Override
//    public View getView(int position, View view, ViewGroup parent) {
//        ViewHolder holder;
//        if (view != null) {
//            holder = (ViewHolder) view.getTag();
//        } else {
//            view = inflater.inflate(R.layout.whatever, parent, false);
//            holder = new ViewHolder(view);
//            view.setTag(holder);
//        }
//        holder.name.setText("John Doe");
//        // etc...
//        return view;
//    }
//
//    static class ViewHolder {
//        @BindView(R.id.title)
//        TextView name;
//        @BindView(R.id.job_title)
//        TextView jobTitle;
//
//        public ViewHolder(View view) {
//            ButterKnife.bind(this, view);
//        }
//    }
}