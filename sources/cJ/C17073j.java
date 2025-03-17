package cJ;

import XH.C16796C;
import XH.v;
import YH.C16877v;
import YH.X;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C17542s;
import tI.C17978n;

/* renamed from: cJ.j  reason: case insensitive filesystem */
public final class C17073j {
    /* access modifiers changed from: private */
    public static final C17065b k(String str) {
        C17066c b10 = C17072i.f141319a.b();
        C17069f v10 = C17069f.v(str);
        C17542s.i(v10, "identifier(...)");
        return new C17065b(b10, v10);
    }

    /* access modifiers changed from: private */
    public static final C17065b l(String str) {
        C17066c f10 = C17072i.f141319a.f();
        C17069f v10 = C17069f.v(str);
        C17542s.i(v10, "identifier(...)");
        return new C17065b(f10, v10);
    }

    /* access modifiers changed from: private */
    public static final C17065b m(String str) {
        C17066c c10 = C17072i.f141319a.c();
        C17069f v10 = C17069f.v(str);
        C17542s.i(v10, "identifier(...)");
        return new C17065b(c10, v10);
    }

    /* access modifiers changed from: private */
    public static final C17065b n(String str) {
        C17066c d10 = C17072i.f141319a.d();
        C17069f v10 = C17069f.v(str);
        C17542s.i(v10, "identifier(...)");
        return new C17065b(d10, v10);
    }

    /* access modifiers changed from: private */
    public static final C17065b o(String str) {
        C17066c e10 = C17072i.f141319a.e();
        C17069f v10 = C17069f.v(str);
        C17542s.i(v10, "identifier(...)");
        return new C17065b(e10, v10);
    }

    /* access modifiers changed from: private */
    public static final <K, V> Map<V, K> p(Map<K, ? extends V> map) {
        Iterable<Map.Entry> entrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C17978n.e(X.e(C16877v.y(entrySet, 10)), 16));
        for (Map.Entry entry : entrySet) {
            v a10 = C16796C.a(entry.getValue(), entry.getKey());
            linkedHashMap.put(a10.c(), a10.d());
        }
        return linkedHashMap;
    }

    /* access modifiers changed from: private */
    public static final C17065b q(C17069f fVar) {
        C17072i iVar = C17072i.f141319a;
        C17066c f10 = iVar.a().f();
        C17069f v10 = C17069f.v(fVar.m() + iVar.a().h().m());
        C17542s.i(v10, "identifier(...)");
        return new C17065b(f10, v10);
    }

    /* access modifiers changed from: private */
    public static final C17065b r(String str) {
        C17066c g10 = C17072i.f141319a.g();
        C17069f v10 = C17069f.v(str);
        C17542s.i(v10, "identifier(...)");
        return new C17065b(g10, v10);
    }

    /* access modifiers changed from: private */
    public static final C17065b s(String str) {
        C17066c h10 = C17072i.f141319a.h();
        C17069f v10 = C17069f.v(str);
        C17542s.i(v10, "identifier(...)");
        return new C17065b(h10, v10);
    }

    /* access modifiers changed from: private */
    public static final C17065b t(C17065b bVar) {
        C17066c f10 = C17072i.f141319a.f();
        C17069f v10 = C17069f.v('U' + bVar.h().m());
        C17542s.i(v10, "identifier(...)");
        return new C17065b(f10, v10);
    }
}
