package com.sugarcube.decorate.v2.internal.manager.model;

import android.net.Uri;
import com.sugarcube.app.base.data.Result;
import com.sugarcube.core.network.models.CatalogItem;
import dI.C17164e;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J@\u0010\n\u001a*\u0012&\u0012$\u0012\u0004\u0012\u00020\u0006\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005j\u0002`\b0\u0005j\u0002`\t0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH¦@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/manager/model/ModelRepository;", "", "", "version", "Lcom/sugarcube/app/base/data/Result;", "", "", "Lcom/sugarcube/core/network/models/CatalogItem;", "Lcom/sugarcube/core/network/models/CombinableMap;", "Lcom/sugarcube/core/network/models/SalesDressedBedData;", "fetchCombinableData", "(ILdI/e;)Ljava/lang/Object;", "Landroid/net/Uri;", "uri", "Ljava/io/File;", "fetchAssetFile", "(Landroid/net/Uri;LdI/e;)Ljava/lang/Object;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ModelRepository {
    Object fetchAssetFile(Uri uri, C17164e<? super File> eVar);

    Object fetchCombinableData(int i10, C17164e<? super Result<? extends Map<String, ? extends Map<String, CatalogItem>>>> eVar);
}
