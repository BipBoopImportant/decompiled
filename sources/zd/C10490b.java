package zd;

import GK.C15777E;
import VL.C16704f;
import VL.C16707i;
import VL.s;
import VL.t;
import VL.u;
import VL.y;
import com.ikea.kompassmap.model.product.Product;
import com.ikea.kompassmap.model.store.Store;
import dI.C17164e;
import java.util.Map;
import kotlin.Metadata;
import org.maplibre.geojson.FeatureCollection;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001Jl\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u00022\u0014\b\u0001\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000eJb\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00022\u0014\b\u0001\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\nH§@¢\u0006\u0004\b\u0011\u0010\u0012JB\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u0017\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lzd/b;", "", "", "userAgent", "token", "storeNo", "ruCode", "languageCode", "supportedStatus", "supportedPlatform", "", "extraParameters", "Lcom/ikea/kompassmap/model/store/Store;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;LdI/e;)Ljava/lang/Object;", "productId", "Lcom/ikea/kompassmap/model/product/Product;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;LdI/e;)Ljava/lang/Object;", "type", "Lorg/maplibre/geojson/FeatureCollection;", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "url", "LGK/E;", "b", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: zd.b  reason: case insensitive filesystem */
public interface C10490b {
    @C16704f("api/new/v2/store-maps/{storeNo}/products/{productId}")
    Object a(@C16707i("User-Agent") String str, @C16707i("x-access-token") String str2, @s("storeNo") String str3, @s("productId") String str4, @t("ruCode") String str5, @t("languageCode") String str6, @u Map<String, String> map, C17164e<? super Product> eVar);

    @C16704f
    Object b(@y String str, C17164e<? super C15777E> eVar);

    @C16704f("api/new/v2/store-maps/{storeNo}/map")
    Object c(@C16707i("User-Agent") String str, @C16707i("x-access-token") String str2, @s("storeNo") String str3, @t("ruCode") String str4, @t("languageCode") String str5, @t("supportedStatus") String str6, @t("supportedPlatform") String str7, @u Map<String, String> map, C17164e<? super Store> eVar);

    @C16704f("resources/maps/{ruCode}/{storeNo}/{storeNo}_{type}.geojson")
    Object d(@C16707i("User-Agent") String str, @C16707i("x-access-token") String str2, @s("ruCode") String str3, @s("storeNo") String str4, @s("type") String str5, C17164e<? super FeatureCollection> eVar);
}
