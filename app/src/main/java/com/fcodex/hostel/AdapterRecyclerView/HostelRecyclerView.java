package com.fcodex.hostel.AdapterRecyclerView;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HostelRecyclerView extends RecyclerView.Adapter<hostel> {
    @NonNull
    @Override
    public hostel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull hostel holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
class hostel extends RecyclerView.ViewHolder {
    public hostel(@NonNull View itemView) {
        super(itemView);
    }
}