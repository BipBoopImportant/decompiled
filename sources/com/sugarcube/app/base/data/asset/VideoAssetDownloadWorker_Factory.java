package com.sugarcube.app.base.data.asset;

import WH.C16729a;
import android.content.Context;
import androidx.work.WorkerParameters;

public final class VideoAssetDownloadWorker_Factory {
    private final C16729a<VideoAssetRepositoryImpl> videoAssetRepositoryProvider;

    public VideoAssetDownloadWorker_Factory(C16729a<VideoAssetRepositoryImpl> aVar) {
        this.videoAssetRepositoryProvider = aVar;
    }

    public static VideoAssetDownloadWorker_Factory create(C16729a<VideoAssetRepositoryImpl> aVar) {
        return new VideoAssetDownloadWorker_Factory(aVar);
    }

    public static VideoAssetDownloadWorker newInstance(Context context, WorkerParameters workerParameters, VideoAssetRepositoryImpl videoAssetRepositoryImpl) {
        return new VideoAssetDownloadWorker(context, workerParameters, videoAssetRepositoryImpl);
    }

    public VideoAssetDownloadWorker get(Context context, WorkerParameters workerParameters) {
        return newInstance(context, workerParameters, this.videoAssetRepositoryProvider.get());
    }
}
