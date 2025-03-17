package a9;

import a9.C6864k2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.u5  reason: case insensitive filesystem */
public final class C6946u5 {

    /* renamed from: a  reason: collision with root package name */
    public final C6864k2.b f42887a;

    /* renamed from: b  reason: collision with root package name */
    public final O2 f42888b;

    /* renamed from: c  reason: collision with root package name */
    public final List<WeakReference<O6>> f42889c;

    public C6946u5() {
        C6864k2.b bVar = new C6864k2.b();
        O2 o22 = new O2(bVar);
        ArrayList arrayList = new ArrayList();
        C17542s.j(bVar, "staticProvider");
        C17542s.j(o22, "decorViewTreeObserver");
        C17542s.j(arrayList, "listeners");
        this.f42887a = bVar;
        this.f42888b = o22;
        this.f42889c = arrayList;
    }

    public final void a(O6 o62) {
        C17542s.j(o62, "onTouchListener");
        Iterator<WeakReference<O6>> it = this.f42889c.iterator();
        while (it.hasNext()) {
            if (C17542s.e(o62, it.next().get())) {
                it.remove();
            }
        }
    }
}
