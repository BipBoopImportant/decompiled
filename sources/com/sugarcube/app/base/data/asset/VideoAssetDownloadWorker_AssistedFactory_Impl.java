package com.sugarcube.app.base.data.asset;

import WH.C16729a;
import android.content.Context;
import androidx.work.WorkerParameters;
import nH.C17625d;
import nH.C17628g;

public final class VideoAssetDownloadWorker_AssistedFactory_Impl implements VideoAssetDownloadWorker_AssistedFactory {
    private final VideoAssetDownloadWorker_Factory delegateFactory;

    VideoAssetDownloadWorker_AssistedFactory_Impl(VideoAssetDownloadWorker_Factory videoAssetDownloadWorker_Factory) {
        this.delegateFactory = videoAssetDownloadWorker_Factory;
    }

    public static C17628g<VideoAssetDownloadWorker_AssistedFactory> createFactoryProvider(VideoAssetDownloadWorker_Factory videoAssetDownloadWorker_Factory) {
        return C17625d.a(new VideoAssetDownloadWorker_AssistedFactory_Impl(videoAssetDownloadWorker_Factory));
    }

    public VideoAssetDownloadWorker create(Context context, WorkerParameters workerParameters) {
        return this.delegateFactory.get(context, workerParameters);
    }

    public static C16729a<VideoAssetDownloadWorker_AssistedFactory> create(VideoAssetDownloadWorker_Factory videoAssetDownloadWorker_Factory) {
        return C17625d.a(new VideoAssetDownloadWorker_AssistedFactory_Impl(videoAssetDownloadWorker_Factory));
    }
}
