package com.example.iliendo.geoguessswipe;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Controls the Recyclerview
 * Created by iliendo on 4/14/19.
 */

public class GeoObjectAdapter extends RecyclerView.Adapter<GeoObjectViewHolder>{
    private Context context;
    private List<GeoObject> listGeoObject;

    public GeoObjectAdapter(Context context, List<GeoObject> listGeoObject) {
        this.context = context;
        this.listGeoObject = listGeoObject;
    }


    /**
     * Display the row items in the recycler view
     * @param parent
     * @param viewType
     * @return
     */
    @Override
    public GeoObjectViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_cell, parent, false);
        return new GeoObjectViewHolder(view);
    }

    /**
     * Bind the images and the name of the image to the view holders
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(GeoObjectViewHolder holder, int position) {
        // Gets a single item in the list from its position
        final GeoObject geoObject = listGeoObject.get(position);

        // The holder argument is used to reference the views inside the viewHolder
        // Populate the views with the data from the list
        holder.geoImage.setImageResource(geoObject.getmGeoImageName());
    }

    @Override
    public int getItemCount() {
        return listGeoObject.size();
    }
}
