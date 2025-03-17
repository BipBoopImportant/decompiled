package com.sugarcube.app.base.data.source;

import XH.C16807N;
import android.net.Uri;
import com.sugarcube.core.network.models.CatalogItem;
import dI.C17164e;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H¦@¢\u0006\u0004\b\f\u0010\rJ,\u0010\u0011\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000e\u0018\u00010\u000eH¦@¢\u0006\u0004\b\u0011\u0010\u0012J2\u0010\u0014\u001a\u00020\u000b2 \u0010\u0013\u001a\u001c\u0012\u0004\u0012\u00020\u000f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000e0\u000eH¦@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/sugarcube/app/base/data/source/CatalogRepositoryLocalDataSource;", "Lcom/sugarcube/app/base/data/source/CatalogRepositoryDataSource;", "", "itemId", "Landroid/net/Uri;", "assetUrl", "Ljava/io/File;", "getItemAsset", "(ILandroid/net/Uri;LdI/e;)Ljava/lang/Object;", "assetFile", "assetFileLocation", "LXH/N;", "cacheItemAsset", "(Ljava/io/File;Ljava/io/File;LdI/e;)Ljava/lang/Object;", "", "", "Lcom/sugarcube/core/network/models/CatalogItem;", "getSalesDressedBedData", "(LdI/e;)Ljava/lang/Object;", "data", "cacheSalesDressedBedData", "(Ljava/util/Map;LdI/e;)Ljava/lang/Object;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface CatalogRepositoryLocalDataSource extends CatalogRepositoryDataSource {
    Object cacheItemAsset(File file, File file2, C17164e<? super C16807N> eVar);

    Object cacheSalesDressedBedData(Map<String, ? extends Map<String, CatalogItem>> map, C17164e<? super C16807N> eVar);

    Object getItemAsset(int i10, Uri uri, C17164e<? super File> eVar);

    Object getSalesDressedBedData(C17164e<? super Map<String, ? extends Map<String, CatalogItem>>> eVar);
}
