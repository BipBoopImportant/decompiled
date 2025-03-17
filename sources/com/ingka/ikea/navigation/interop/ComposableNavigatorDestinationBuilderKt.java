package com.ingka.ikea.navigation.interop;

import B4.a;
import androidx.annotation.Keep;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import sw.g;
import uI.C18068q;
import x4.C8942f;
import x4.F;
import x4.q;
import x4.y;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\b\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001aR\u0010\n\u001a\u00020\t\"\n\b\u0000\u0010\r\u0018\u0001*\u00020\f*\u00020\u00002\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\b\u001a\u00020\u00012\u0018\b\u0002\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000eH\b¢\u0006\u0004\b\n\u0010\u0012¨\u0006\u0013"}, d2 = {"Lx4/y;", "", "route", "", "Lx4/f;", "arguments", "Lx4/q;", "deepLinks", "fullyQualifiedName", "LXH/N;", "composable", "(Lx4/y;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "", "T", "", "LuI/q;", "Lx4/F;", "typeMap", "(Lx4/y;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;)V", "navigation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ComposableNavigatorDestinationBuilderKt {
    @Keep
    public static final void composable(y yVar, String str, List<C8942f> list, List<q> list2, String str2) {
        C17542s.j(yVar, "<this>");
        C17542s.j(str, PlaceTypes.ROUTE);
        C17542s.j(list, "arguments");
        C17542s.j(list2, "deepLinks");
        C17542s.j(str2, "fullyQualifiedName");
        g gVar = new g((a) yVar.l().d(a.class), str, str2);
        for (C8942f fVar : list) {
            gVar.b(fVar.a(), fVar.b());
        }
        for (q g10 : list2) {
            gVar.g(g10);
        }
        yVar.k(gVar);
    }

    @Keep
    public static final /* synthetic */ <T> void composable(y yVar, List<q> list, String str, Map<C18068q, F<?>> map) {
        C17542s.j(yVar, "<this>");
        C17542s.j(list, "deepLinks");
        C17542s.j(str, "fullyQualifiedName");
        C17542s.j(map, "typeMap");
        C17542s.o(4, "T");
        g gVar = new g((a) yVar.l().d(a.class), P.b(Object.class), map, str);
        for (q g10 : list) {
            gVar.g(g10);
        }
        yVar.k(gVar);
    }
}
