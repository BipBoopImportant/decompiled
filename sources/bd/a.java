package Bd;

import GK.C15777E;
import com.ikea.kompassmap.model.product.Product;
import com.ikea.kompassmap.model.store.Store;
import dI.C17164e;
import java.util.Map;
import kotlin.Metadata;
import org.maplibre.geojson.FeatureCollection;
import yd.C10444O;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\\\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\nH¦@¢\u0006\u0004\b\r\u0010\u000eJT\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\nH¦@¢\u0006\u0004\b\u0011\u0010\u0012J8\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H¦@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LBd/a;", "", "", "userAgent", "token", "storeNo", "ruCode", "languageCode", "supportedStatus", "supportedPlatform", "", "extraParameters", "Lcom/ikea/kompassmap/model/store/Store;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;LdI/e;)Ljava/lang/Object;", "productId", "Lcom/ikea/kompassmap/model/product/Product;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;LdI/e;)Ljava/lang/Object;", "Lyd/O;", "type", "Lorg/maplibre/geojson/FeatureCollection;", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyd/O;LdI/e;)Ljava/lang/Object;", "url", "LGK/E;", "b", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface a {
    Object a(String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map, C17164e<? super Product> eVar);

    Object b(String str, C17164e<? super C15777E> eVar);

    Object c(String str, String str2, String str3, String str4, String str5, String str6, String str7, Map<String, String> map, C17164e<? super Store> eVar);

    Object d(String str, String str2, String str3, String str4, C10444O o10, C17164e<? super FeatureCollection> eVar);
}
