package RF;

import android.net.Uri;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.app.base.data.database.CachedCatalogPage;
import com.sugarcube.core.network.models.CatalogItem;
import com.sugarcube.core.network.models.CatalogItemMetadata;
import com.sugarcube.core.network.models.ProductBuyingOption;
import com.sugarcube.core.network.models.Stackables;
import java.io.File;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0017\u0010\u0007\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0017\u0010\n\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/sugarcube/core/network/models/CatalogItem;", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "a", "(Lcom/sugarcube/core/network/models/CatalogItem;)Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "getExampleItem1", "()Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "exampleItem1", "b", "getExampleItem2", "exampleItem2", "shared_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class q {

    /* renamed from: a  reason: collision with root package name */
    private static final CachedCatalogItem f115594a = new CachedCatalogItem((File) null, (File) null, false, (CachedCatalogPage) null, (Map) null, new CatalogItem(1, (String) null, "BERGMUND", "Chair with long cover, oak effect/Inseros white. Lorem ipsum dolor sit amet, consectetur adipiscing elit. ", (String) null, "135.00", (Uri) null, (Uri) null, (List) null, (Uri) null, (Instant) null, (Instant) null, (String) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Integer) null, (Boolean) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (String) null, (List) null, (String) null, (List) null, (Double) null, (Double) null, (Stackables) null, (Boolean) null, (CatalogItemMetadata) null, (Boolean) null, (Boolean) null, (Boolean) null, (ProductBuyingOption) null, (Boolean) null, (Boolean) null, -46, 131071, (DefaultConstructorMarker) null), 31, (DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private static final CachedCatalogItem f115595b = new CachedCatalogItem((File) null, (File) null, false, (CachedCatalogPage) null, (Map) null, new CatalogItem(1, (String) null, "BERGMUND", "Chair with long cover, oak effect/Inseros white. ", (String) null, "135.00", (Uri) null, (Uri) null, (List) null, (Uri) null, (Instant) null, (Instant) null, (String) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Integer) null, (Boolean) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (String) null, (List) null, (String) null, (List) null, (Double) null, (Double) null, (Stackables) null, (Boolean) null, (CatalogItemMetadata) null, (Boolean) null, (Boolean) null, (Boolean) null, (ProductBuyingOption) null, (Boolean) null, (Boolean) null, -46, 131071, (DefaultConstructorMarker) null), 31, (DefaultConstructorMarker) null);

    public static final CachedCatalogItem a(CatalogItem catalogItem) {
        C17542s.j(catalogItem, "<this>");
        List<String> features = catalogItem.getFeatures();
        return new CachedCatalogItem((File) null, (File) null, features != null && features.contains("draco"), (CachedCatalogPage) null, (Map) null, catalogItem, 27, (DefaultConstructorMarker) null);
    }
}
