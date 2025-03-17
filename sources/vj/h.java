package vJ;

import DI.C15537H;
import YH.C16877v;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import uJ.C18096U;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final C15537H<t<C>> f149051a = new C15537H<>("KotlinTypeRefiner");

    public static final C15537H<t<C>> a() {
        return f149051a;
    }

    public static final List<C18096U> b(g gVar, Iterable<? extends C18096U> iterable) {
        C17542s.j(gVar, "<this>");
        C17542s.j(iterable, "types");
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (C18096U h10 : iterable) {
            arrayList.add(gVar.h(h10));
        }
        return arrayList;
    }
}
