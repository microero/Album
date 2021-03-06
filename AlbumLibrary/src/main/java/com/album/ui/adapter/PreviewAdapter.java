package com.album.ui.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.album.Album;
import com.album.AlbumConstant;
import com.album.model.AlbumModel;
import com.album.ui.widget.TouchImageView;

import java.util.ArrayList;

/**
 * by y on 15/08/2017.
 */

public class PreviewAdapter extends PagerAdapter {

    private ArrayList<AlbumModel> list = null;

    public PreviewAdapter(ArrayList<AlbumModel> list) {
        this.list = list;
    }

    @Override
    public int getCount() {
        return list == null ? 0 : list.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {
        FrameLayout frameLayout = new FrameLayout(container.getContext());
        ImageView imageView;
        if (Album.getInstance().getConfig().isFrescoImageLoader()) {
            imageView = Album.getInstance().getAlbumImageLoader().frescoView(frameLayout.getContext(), AlbumConstant.TYPE_FRESCO_ALBUM);
        } else {
            imageView = new TouchImageView(frameLayout.getContext());
        }
        frameLayout.addView(imageView);
        Album.getInstance().getAlbumImageLoader().displayPreview(imageView, list.get(position));
        container.addView(frameLayout);
        return frameLayout;
    }

    public String getAlbumPath(int position) {
        return list.get(position).getPath();
    }


    public AlbumModel getAlbumModel(int position) {
        return list.get(position);
    }
}
