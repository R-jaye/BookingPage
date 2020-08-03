package com.example.bookingpage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SeatAdapter extends RecyclerView .Adapter<SeatAdapter.SeatView> {

     private   List<String> titles;
     private  List<Integer> images;
     private   LayoutInflater inflater;

        public SeatAdapter (Context ctx, List<String> titles, List<Integer> images) {
            this.titles = titles;
            this.images = images;
            this.inflater = LayoutInflater.from(ctx);

        }

        @NonNull
        @Override
        public SeatView onCreateViewHolder (@NonNull ViewGroup parent,int viewType){

            View view = inflater.inflate(R.layout.grid_layout, parent, false);
            return new SeatView(view);
        }

        @Override
        public void onBindViewHolder (@NonNull SeatView holder, int position){
                 holder.title.setText(titles.get(position));
                 holder.gridIcon.setImageResource(images.get(position));
        }

        @Override
        public int getItemCount () {
            return titles.size();
        }

        public class SeatView extends RecyclerView.ViewHolder {
            TextView title;
            ImageView gridIcon;


            public SeatView(@NonNull View itemView) {
                super(itemView);
                title = itemView.findViewById(R.id.tvSeatno);
                gridIcon = itemView.findViewById(R.id.ivSeat);
            }

        }



}
