package DF;

import com.sugarcube.core.network.models.ClientFeatures;
import com.sugarcube.core.network.models.Composition;
import com.sugarcube.core.network.models.CompositionSavedProperties;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sugarcube/core/network/models/Composition;", "", "a", "(Lcom/sugarcube/core/network/models/Composition;)Z", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: DF.e  reason: case insensitive filesystem */
public final class C12788e {
    public static final boolean a(Composition composition) {
        Map<String, Integer> featuresUsed;
        T t10;
        C17542s.j(composition, "<this>");
        CompositionSavedProperties savedProperties = composition.getSavedProperties();
        LinkedHashMap linkedHashMap = null;
        if (!(savedProperties == null || (featuresUsed = savedProperties.getFeaturesUsed()) == null)) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry next : featuresUsed.entrySet()) {
                Iterator<T> it = ClientFeatures.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t10 = null;
                        break;
                    }
                    t10 = it.next();
                    if (C17542s.e(((ClientFeatures) t10).getFeature(), next.getKey())) {
                        break;
                    }
                }
                ClientFeatures clientFeatures = (ClientFeatures) t10;
                if (clientFeatures == null) {
                    clientFeatures = ClientFeatures.UNSUPPORTED;
                }
                if (clientFeatures.getVersion() < ((Number) next.getValue()).intValue()) {
                    linkedHashMap2.put(next.getKey(), next.getValue());
                }
            }
            linkedHashMap = linkedHashMap2;
        }
        return true ^ (linkedHashMap == null || linkedHashMap.isEmpty());
    }
}
