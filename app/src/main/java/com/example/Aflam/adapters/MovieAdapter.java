package com.example.Aflam.adapters;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.Target;
import com.example.Aflam.DetailActivity;
import com.example.Aflam.R;
import com.example.Aflam.models.Movie;

import org.parceler.Parcels;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder>{

    // data we need to fill the overrides
    Context context;
    List<Movie> movies;

    public MovieAdapter(Context context, List<Movie> movies) {
        this.context = context;
        this.movies = movies;
    }


    // Usually involves inflating a layout from XML and returning the holder
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d("MovieAdapter", "onCreateViewHolder");
        View movieView = LayoutInflater.from(context).inflate(R.layout.item_movie, parent, false);
        return new ViewHolder(movieView);
    }
    // Populate data into the item through holder
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Log.d("MovieAdapter", "onBindViewHolder " + position);
        // get movie at position
        Movie movie = movies.get(position);
        // Bind movie data into the VH
        holder.bind(movie);
    }

    // Get the total count of items in the list
    @Override
    public int getItemCount() {
        return movies.size();
    }

    // First define inner viewholder class
    // viewholder represents the row of our movie
    public class ViewHolder extends RecyclerView.ViewHolder {

        // define member views for each member of viewholder

        RelativeLayout container;

        TextView tvTitle;
        TextView tvOverview;
        ImageView ivPoster;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvOverview = itemView.findViewById(R.id.tvOverview);
            ivPoster = itemView.findViewById(R.id.ivPoster);
            container = itemView.findViewById(R.id.container);
        }

        public void bind(final Movie movie) {
            // Use getter method on movie to populate each views
            tvTitle.setText(movie.getTitle());
            tvOverview.setText(movie.getOverview());
            Glide.with(context).load(movie.getPosterPath()).override(Target.SIZE_ORIGINAL).into(ivPoster);

            // 1. Register click Listener on the whole container. We need to find the container layout reference.

            container.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // 2. Navigate to a new activity on tap using Intents
                    Intent intent = new Intent(context, DetailActivity.class);
                    // Pass data into the next activity
                    intent.putExtra("title", movie.getTitle());
                    // putExtra can take in a Parcelable value, so we can make movie parcelable to be able to just pass it in we're going to use a library (Parceler)
                    intent.putExtra("movie", Parcels.wrap(movie));
                    context.startActivity(intent);
                    Toast.makeText(context, movie.getTitle(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
