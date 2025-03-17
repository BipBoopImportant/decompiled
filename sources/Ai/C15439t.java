package AI;

import DI.C15544O;
import DI.C15561h;
import DI.C15566m;
import XH.C16796C;
import YH.C16877v;
import YH.X;
import cJ.C17065b;
import cJ.C17069f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C17542s;
import uJ.C18096U;
import uJ.M0;

/* renamed from: AI.t  reason: case insensitive filesystem */
public final class C15439t {

    /* renamed from: a  reason: collision with root package name */
    public static final C15439t f133143a = new C15439t();

    /* renamed from: b  reason: collision with root package name */
    private static final Set<C17069f> f133144b;

    /* renamed from: c  reason: collision with root package name */
    private static final Set<C17069f> f133145c;

    /* renamed from: d  reason: collision with root package name */
    private static final HashMap<C17065b, C17065b> f133146d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private static final HashMap<C17065b, C17065b> f133147e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private static final HashMap<C15437r, C17069f> f133148f = X.l(C16796C.a(C15437r.UBYTEARRAY, C17069f.v("ubyteArrayOf")), C16796C.a(C15437r.USHORTARRAY, C17069f.v("ushortArrayOf")), C16796C.a(C15437r.UINTARRAY, C17069f.v("uintArrayOf")), C16796C.a(C15437r.ULONGARRAY, C17069f.v("ulongArrayOf")));

    /* renamed from: g  reason: collision with root package name */
    private static final Set<C17069f> f133149g;

    static {
        C15438s[] values = C15438s.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (C15438s m10 : values) {
            arrayList.add(m10.m());
        }
        f133144b = C16877v.y1(arrayList);
        C15437r[] values2 = C15437r.values();
        ArrayList arrayList2 = new ArrayList(values2.length);
        for (C15437r b10 : values2) {
            arrayList2.add(b10.b());
        }
        f133145c = C16877v.y1(arrayList2);
        C15438s[] values3 = C15438s.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C15438s b11 : values3) {
            linkedHashSet.add(b11.b().h());
        }
        f133149g = linkedHashSet;
        for (C15438s sVar : C15438s.values()) {
            f133146d.put(sVar.b(), sVar.j());
            f133147e.put(sVar.j(), sVar.b());
        }
    }

    private C15439t() {
    }

    public static final boolean d(C18096U u10) {
        C15561h e10;
        C17542s.j(u10, "type");
        if (!M0.w(u10) && (e10 = u10.N0().e()) != null) {
            return f133143a.c(e10);
        }
        return false;
    }

    public final C17065b a(C17065b bVar) {
        C17542s.j(bVar, "arrayClassId");
        return f133146d.get(bVar);
    }

    public final boolean b(C17069f fVar) {
        C17542s.j(fVar, "name");
        return f133149g.contains(fVar);
    }

    public final boolean c(C15566m mVar) {
        C17542s.j(mVar, "descriptor");
        C15566m b10 = mVar.b();
        return (b10 instanceof C15544O) && C17542s.e(((C15544O) b10).f(), C15435p.f133015A) && f133144b.contains(mVar.getName());
    }
}
