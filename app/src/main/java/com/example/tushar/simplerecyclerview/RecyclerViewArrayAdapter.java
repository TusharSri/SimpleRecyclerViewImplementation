package com.example.tushar.simplerecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Array Adapter class to get the row layout of recyclerview and fill data which is provided by main class
 */
public class RecyclerViewArrayAdapter extends RecyclerView.Adapter<RecyclerViewArrayAdapter.ViewHolder> {

    private int listItemLayout;
    private ArrayList<String> itemList;

    public RecyclerViewArrayAdapter(int layoutId, ArrayList<String> itemList) {
        listItemLayout = layoutId;
        this.itemList = itemList;
    }

    @Override
    public int getItemCount() {
        if (itemList == null)
            return 0;
        else
            return itemList.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(listItemLayout, parent, false);
        ViewHolder recyclerviewHolder = new ViewHolder(view);
        return recyclerviewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int listPosition) {
        TextView item = holder.item;
        item.setText(itemList.get(listPosition));
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView item;

        public ViewHolder(View itemView) {
            super(itemView);
            item = (TextView) itemView.findViewById(R.id.textview_row);
        }
    }
}
