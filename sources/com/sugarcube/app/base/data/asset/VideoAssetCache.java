package com.sugarcube.app.base.data.asset;

import android.net.Uri;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/sugarcube/app/base/data/asset/VideoAssetCache;", "", "Lcom/sugarcube/app/base/data/asset/VideoAsset;", "asset", "Landroid/net/Uri;", "findInCache", "(Lcom/sugarcube/app/base/data/asset/VideoAsset;)Landroid/net/Uri;", "cacheAsset", "(Lcom/sugarcube/app/base/data/asset/VideoAsset;LdI/e;)Ljava/lang/Object;", "getDownloadUri", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface VideoAssetCache {
    Object cacheAsset(VideoAsset videoAsset, C17164e<? super Uri> eVar);

    Uri findInCache(VideoAsset videoAsset);

    Uri getDownloadUri(VideoAsset videoAsset);
}
