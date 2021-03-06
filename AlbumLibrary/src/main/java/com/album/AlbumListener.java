package com.album;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.album.model.AlbumModel;
import com.album.ui.annotation.PermissionsType;

import java.io.File;
import java.util.List;

/**
 * by y on 18/08/2017.
 */

public interface AlbumListener {
    void onAlbumActivityFinish();

    void onAlbumPermissionsDenied(@PermissionsType int type);

    void onAlbumFragmentNull();

    void onAlbumPreviewFileNull();

    void onAlbumFinderNull();

    void onAlbumBottomPreviewNull();

    void onAlbumBottomSelectNull();

    void onAlbumFragmentFileNull();

    void onAlbumPreviewSelectNull();

    void onAlbumCheckBoxFileNull();

    void onAlbumFragmentCropCanceled();

    void onAlbumFragmentCameraCanceled();

    void onAlbumFragmentUCropError(@Nullable Throwable data);

    void onAlbumResources(@NonNull List<AlbumModel> list);

    void onAlbumUCropResources(@Nullable File scannerFile);

    void onAlbumMaxCount();

    void onAlbumActivityBackPressed();

    void onAlbumOpenCameraError();

    void onAlbumEmpty();

    void onAlbumNoMore();

    void onAlbumResultCameraError();

    void onVideoPlayError();
}
