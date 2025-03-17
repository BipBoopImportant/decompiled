package x4;

import C4.h;
import C4.j;
import androidx.lifecycle.U;
import com.google.android.libraries.places.api.model.PlaceTypes;
import fK.z;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import uI.C18055d;
import uI.C18068q;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0005H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "T", "Landroidx/lifecycle/U;", "LuI/d;", "route", "", "LuI/q;", "Lx4/F;", "typeMap", "a", "(Landroidx/lifecycle/U;LuI/d;Ljava/util/Map;)Ljava/lang/Object;", "navigation-common_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class O {
    public static final <T> T a(U u10, C18055d<T> dVar, Map<C18068q, ? extends F<?>> map) {
        C17542s.j(u10, "<this>");
        C17542s.j(dVar, PlaceTypes.ROUTE);
        C17542s.j(map, "typeMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        KSerializer<T> e10 = z.e(dVar);
        for (C8942f fVar : j.h(e10, map)) {
            linkedHashMap.put(fVar.d(), fVar.c().a());
        }
        return h.b(e10, u10, linkedHashMap);
    }
}
