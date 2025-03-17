package com.sugarcube.app.base.data.asset;

import TJ.C16532g;
import XH.C16807N;
import android.net.Uri;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/sugarcube/app/base/data/asset/VideoAssetRepository;", "", "Lcom/sugarcube/app/base/data/asset/VideoAsset;", "asset", "Landroid/net/Uri;", "get", "(Lcom/sugarcube/app/base/data/asset/VideoAsset;)Landroid/net/Uri;", "LTJ/g;", "getFlow", "(Lcom/sugarcube/app/base/data/asset/VideoAsset;)LTJ/g;", "LXH/N;", "startAssetSync", "(LdI/e;)Ljava/lang/Object;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface VideoAssetRepository {
    Uri get(VideoAsset videoAsset);

    C16532g<Uri> getFlow(VideoAsset videoAsset);

    Object startAssetSync(C17164e<? super C16807N> eVar);
}
