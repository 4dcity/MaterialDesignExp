package com.will.materialdesignexp.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.will.materialdesignexp.R;

import java.util.List;

/**
 * Created by Will on 15/11/12.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    Context mContext;
    List<String> dataList;

    public RecyclerAdapter(Context context , List<String> dataList) {
        super();
        mContext = context;
        this.dataList = dataList;
    }

    public RecyclerAdapter(Context context ) {
        super();
        mContext = context;
    }

    @Override
    public RecyclerAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.recycler_item, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.MyViewHolder holder, int position) {
        holder.tv1.setText("Title  "+position);
        holder.tv2.setText("Content  "+dataList.get(position));
    }

    @Override
    public int getItemCount() {
        if(dataList == null)
            return 0;
        return dataList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv1;
        TextView tv2;

        public MyViewHolder(View itemView) {
            super(itemView);
            tv1 = (TextView)itemView.findViewById(R.id.tv1);
            tv2 = (TextView)itemView.findViewById(R.id.tv2);
        }
    }

    public void setDataList(List<String> dataList){
        this.dataList = dataList;
    }
}
