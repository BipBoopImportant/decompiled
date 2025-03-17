package a9;

import G8.t;
import S8.a;
import XH.C16796C;
import YH.X;
import a9.L6;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C17542s;

public final class K6 {

    /* renamed from: a  reason: collision with root package name */
    public final t f42106a;

    /* renamed from: b  reason: collision with root package name */
    public final C6 f42107b;

    /* renamed from: c  reason: collision with root package name */
    public final L6 f42108c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f42109d = new LinkedHashMap();

    public K6(t tVar, C6 c62, L6 l62) {
        C17542s.j(tVar, "systemInstantiable");
        C17542s.j(c62, "animationStateChecker");
        C17542s.j(l62, "animationTelemetrySender");
        this.f42106a = tVar;
        this.f42107b = c62;
        this.f42108c = l62;
    }

    public final void a() {
        LinkedHashMap linkedHashMap = this.f42109d;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((WeakReference) entry.getValue()).get() == null) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry key : linkedHashMap2.entrySet()) {
            this.f42109d.remove(key.getKey());
        }
    }

    public final boolean b(View view) {
        boolean z10;
        C17542s.j(view, "root");
        Collection values = this.f42109d.values();
        if (!(values instanceof Collection) || !values.isEmpty()) {
            Iterator it = values.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                View view2 = (View) ((WeakReference) it.next()).get();
                if (view2 != null) {
                    C6 c62 = this.f42107b;
                    C17542s.i(view2, "it");
                    c62.getClass();
                    if (C6.a(view2) && C17542s.e(view2.getRootView(), view)) {
                        z10 = true;
                        break;
                    }
                }
            }
        }
        z10 = false;
        L6 l62 = this.f42108c;
        if (z10 && l62.f42133c == null) {
            l62.f42133c = new L6.a(l62.f42132b.a());
        } else if (!z10) {
            l62.f42133c = null;
        }
        L6.a aVar = l62.f42133c;
        if (aVar != null && l62.f42132b.a() - aVar.f42134a > 1000 && !aVar.f42135b) {
            a.f39924a.e("Session Replay detected long animation", X.f(C16796C.a("srLink", l62.f42131a.a())));
            L6.a aVar2 = l62.f42133c;
            if (aVar2 != null) {
                aVar2.f42135b = true;
            }
        }
        return z10;
    }
}
