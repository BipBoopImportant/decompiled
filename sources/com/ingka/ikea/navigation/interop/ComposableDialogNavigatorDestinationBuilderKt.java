package com.ingka.ikea.navigation.interop;

import androidx.annotation.Keep;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import sw.d;
import sw.e;
import sw.f;
import uI.C18068q;
import x4.C8942f;
import x4.F;
import x4.q;
import x4.y;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\\\u0010\f\u001a\u00020\u000b\"\n\b\u0000\u0010\u000f\u0018\u0001*\u00020\u000e*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0018\b\u0002\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\u00102\b\b\u0002\u0010\n\u001a\u00020\tH\b¢\u0006\u0004\b\f\u0010\u0014¨\u0006\u0015"}, d2 = {"Lx4/y;", "", "route", "fullyQualifiedName", "", "Lx4/f;", "arguments", "Lx4/q;", "deepLinks", "Lsw/f;", "composableDialogProperties", "LXH/N;", "dialogComposable", "(Lx4/y;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lsw/f;)V", "", "T", "", "LuI/q;", "Lx4/F;", "typeMap", "(Lx4/y;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Lsw/f;)V", "navigation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ComposableDialogNavigatorDestinationBuilderKt {
    @Keep
    public static final void dialogComposable(y yVar, String str, String str2, List<C8942f> list, List<q> list2, f fVar) {
        C17542s.j(yVar, "<this>");
        C17542s.j(str, PlaceTypes.ROUTE);
        C17542s.j(str2, "fullyQualifiedName");
        C17542s.j(list, "arguments");
        C17542s.j(list2, "deepLinks");
        C17542s.j(fVar, "composableDialogProperties");
        e eVar = new e((d) yVar.l().d(d.class), str, str2, fVar);
        for (C8942f fVar2 : list) {
            eVar.b(fVar2.a(), fVar2.b());
        }
        for (q g10 : list2) {
            eVar.g(g10);
        }
        yVar.k(eVar);
    }

    @Keep
    public static final /* synthetic */ <T> void dialogComposable(y yVar, String str, List<q> list, Map<C18068q, F<?>> map, f fVar) {
        C17542s.j(yVar, "<this>");
        C17542s.j(str, "fullyQualifiedName");
        C17542s.j(list, "deepLinks");
        C17542s.j(map, "typeMap");
        C17542s.j(fVar, "composableDialogProperties");
        C17542s.o(4, "T");
        e eVar = new e((d) yVar.l().d(d.class), P.b(Object.class), map, str, fVar);
        for (q g10 : list) {
            eVar.g(g10);
        }
        yVar.k(eVar);
    }
}
