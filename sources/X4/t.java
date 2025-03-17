package x4;

import XH.C16807N;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import uI.C18055d;
import uI.C18068q;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a[\u0010\u0011\u001a\u00020\u0004\"\b\b\u0000\u0010\b*\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\r2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lkotlin/Function1;", "Lx4/s;", "LXH/N;", "deepLinkBuilder", "Lx4/q;", "b", "(LnI/l;)Lx4/q;", "", "T", "", "basePath", "LuI/d;", "route", "", "LuI/q;", "Lx4/F;", "typeMap", "a", "(Ljava/lang/String;LuI/d;Ljava/util/Map;LnI/l;)Lx4/q;", "navigation-common_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class t {
    public static final <T> q a(String str, C18055d<T> dVar, Map<C18068q, F<?>> map, C17642l<? super s, C16807N> lVar) {
        C17542s.j(str, "basePath");
        C17542s.j(dVar, PlaceTypes.ROUTE);
        C17542s.j(map, "typeMap");
        C17542s.j(lVar, "deepLinkBuilder");
        s sVar = new s(str, dVar, map);
        lVar.invoke(sVar);
        return sVar.a();
    }

    public static final q b(C17642l<? super s, C16807N> lVar) {
        C17542s.j(lVar, "deepLinkBuilder");
        s sVar = new s();
        lVar.invoke(sVar);
        return sVar.a();
    }
}
