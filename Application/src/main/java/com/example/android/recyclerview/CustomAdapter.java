/*
* Copyright (C) 2014 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package com.example.android.recyclerview;

import com.example.android.SiteUPMC.Cours;
import com.example.android.common.logger.Log;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Provide views to RecyclerView with data from mDataSet.
 */
public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    private static final String TAG = "CustomAdapter";

    //private String[] mDataSet;

    public ArrayList<Cours> EDT = new ArrayList<Cours>();

    // BEGIN_INCLUDE(recyclerViewSampleViewHolder)
    /**
     * Provide a reference to the type of views that you are using (custom ViewHolder)
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        //private final TextView textView;
        private final TextView TitreCours;
        private final TextView nomSalle;
        private final TextView debut;
        private final TextView fin;







        public ViewHolder(View v) {
            super(v);
            // Define click listener for the ViewHolder's View.
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d(TAG, "Element " + getAdapterPosition() + " clicked.");
                }
            });
            //textView = (TextView) v.findViewById(R.id.textView);
            TitreCours = (TextView) v.findViewById(R.id.titreCours);
            nomSalle = (TextView) v.findViewById(R.id.nomSalle);
            debut = (TextView) v.findViewById(R.id.debut);
            fin = (TextView) v.findViewById(R.id.fin);

        }


        public TextView getTitreCours(){return TitreCours;}
        public TextView getNomSalle(){return nomSalle;}
        public TextView getDebut(){return debut;}
        public TextView getFin(){return fin;}
    }
    // END_INCLUDE(recyclerViewSampleViewHolder)



    public CustomAdapter(ArrayList<Cours> EDT){
        this.EDT = EDT;
        notifyDataSetChanged();
    }

    public void setEDT(ArrayList<Cours> EDT) {
        this.EDT.clear();
        this.EDT =EDT;
        notifyDataSetChanged();
    }

    // BEGIN_INCLUDE(recyclerViewOnCreateViewHolder)
    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view.
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.text_row_item, viewGroup, false);

        return new ViewHolder(v);
    }
    // END_INCLUDE(recyclerViewOnCreateViewHolder)

    // BEGIN_INCLUDE(recyclerViewOnBindViewHolder)
    // Replace the contents of a view (invoked by the layout manager)
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        Log.d(TAG, "Element " + position + " set.");

        // Get element from your dataset at this position and replace the contents of the view
        // with that element
        //viewHolder.getTextView().setText(mDataSet[position]);
        viewHolder.getTitreCours().setText(EDT.get(position).title);
        viewHolder.getNomSalle().setText(EDT.get(position).salle);
        viewHolder.getDebut().setText(EDT.get(position).getDebutHeure());
        viewHolder.getFin().setText(EDT.get(position).getFinHeure());

    }
    // END_INCLUDE(recyclerViewOnBindViewHolder)

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        //return mDataSet.length;
        return EDT.size();
    }
}
