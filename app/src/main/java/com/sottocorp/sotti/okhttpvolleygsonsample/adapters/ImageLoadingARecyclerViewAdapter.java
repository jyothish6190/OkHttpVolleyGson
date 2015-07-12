package com.sottocorp.sotti.okhttpvolleygsonsample.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sottocorp.sotti.okhttpvolleygsonsample.R;
import com.sottocorp.sotti.okhttpvolleygsonsample.viewHolders.ViewHolderImage;

import java.util.List;

/**
 * Adapter for the image loading recycler view
 *
 * @author @author https://plus.google.com/+PabloCostaTirado/about
 */
public class ImageLoadingARecyclerViewAdapter extends RecyclerView.Adapter
{
    private final List<String> mImages;

    public ImageLoadingARecyclerViewAdapter(List<String> images)
    {
        mImages = images;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        final View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.view_holder_image, parent, false);

        return new ViewHolderImage(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position)
    {
        final ViewHolderImage viewHolderImage =
                (ViewHolderImage) holder;

        viewHolderImage.setData(mImages.get(position));
    }

    @Override
    public int getItemCount()
    {
        return mImages.size();
    }
}