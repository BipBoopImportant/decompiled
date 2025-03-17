package bJ;

import XH.v;
import XI.C16830c;
import XI.C16831d;
import XI.i;
import XI.l;
import XI.n;
import XI.q;
import XI.u;
import YH.C16877v;
import ZI.C17005b;
import ZI.c;
import ZI.e;
import ZI.f;
import ZI.g;
import aJ.C17030a;
import bJ.C17045d;
import eJ.C17196g;
import eJ.C17198i;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

/* renamed from: bJ.i  reason: case insensitive filesystem */
public final class C17050i {

    /* renamed from: a  reason: collision with root package name */
    public static final C17050i f141191a = new C17050i();

    /* renamed from: b  reason: collision with root package name */
    private static final C17196g f141192b;

    static {
        C17196g d10 = C17196g.d();
        C17030a.a(d10);
        C17542s.i(d10, "apply(...)");
        f141192b = d10;
    }

    private C17050i() {
    }

    public static /* synthetic */ C17045d.a d(C17050i iVar, n nVar, c cVar, g gVar, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        return iVar.c(nVar, cVar, gVar, z10);
    }

    public static final boolean f(n nVar) {
        C17542s.j(nVar, "proto");
        C17005b.C3447b a10 = C17044c.f141169a.a();
        Object p10 = nVar.p(C17030a.f140991e);
        C17542s.i(p10, "getExtension(...)");
        Boolean f10 = a10.d(((Number) p10).intValue());
        C17542s.i(f10, "get(...)");
        return f10.booleanValue();
    }

    private final String g(q qVar, c cVar) {
        if (qVar.g0()) {
            return C17043b.b(cVar.b(qVar.R()));
        }
        return null;
    }

    public static final v<C17047f, C16830c> h(byte[] bArr, String[] strArr) {
        C17542s.j(bArr, "bytes");
        C17542s.j(strArr, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new v<>(f141191a.k(byteArrayInputStream, strArr), C16830c.s1(byteArrayInputStream, f141192b));
    }

    public static final v<C17047f, C16830c> i(String[] strArr, String[] strArr2) {
        C17542s.j(strArr, "data");
        C17542s.j(strArr2, "strings");
        byte[] e10 = C17042a.e(strArr);
        C17542s.i(e10, "decodeBytes(...)");
        return h(e10, strArr2);
    }

    public static final v<C17047f, i> j(String[] strArr, String[] strArr2) {
        C17542s.j(strArr, "data");
        C17542s.j(strArr2, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(C17042a.e(strArr));
        return new v<>(f141191a.k(byteArrayInputStream, strArr2), i.z0(byteArrayInputStream, f141192b));
    }

    private final C17047f k(InputStream inputStream, String[] strArr) {
        C17030a.e y10 = C17030a.e.y(inputStream, f141192b);
        C17542s.i(y10, "parseDelimitedFrom(...)");
        return new C17047f(y10, strArr);
    }

    public static final v<C17047f, l> l(byte[] bArr, String[] strArr) {
        C17542s.j(bArr, "bytes");
        C17542s.j(strArr, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new v<>(f141191a.k(byteArrayInputStream, strArr), l.Y(byteArrayInputStream, f141192b));
    }

    public static final v<C17047f, l> m(String[] strArr, String[] strArr2) {
        C17542s.j(strArr, "data");
        C17542s.j(strArr2, "strings");
        byte[] e10 = C17042a.e(strArr);
        C17542s.i(e10, "decodeBytes(...)");
        return l(e10, strArr2);
    }

    public final C17196g a() {
        return f141192b;
    }

    public final C17045d.b b(C16831d dVar, c cVar, g gVar) {
        String str;
        C17542s.j(dVar, "proto");
        C17542s.j(cVar, "nameResolver");
        C17542s.j(gVar, "typeTable");
        C17198i.f<C16831d, C17030a.c> fVar = C17030a.f140987a;
        C17542s.i(fVar, "constructorSignature");
        C17030a.c cVar2 = (C17030a.c) e.a(dVar, fVar);
        String string = (cVar2 == null || !cVar2.u()) ? "<init>" : cVar.getString(cVar2.s());
        if (cVar2 == null || !cVar2.t()) {
            List<u> H10 = dVar.H();
            C17542s.i(H10, "getValueParameterList(...)");
            Iterable<u> iterable = H10;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (u uVar : iterable) {
                C17050i iVar = f141191a;
                C17542s.g(uVar);
                String g10 = iVar.g(f.q(uVar, gVar), cVar);
                if (g10 == null) {
                    return null;
                }
                arrayList.add(g10);
            }
            str = C16877v.G0(arrayList, "", "(", ")V", 0, (CharSequence) null, (C17642l) null, 56, (Object) null);
        } else {
            str = cVar.getString(cVar2.r());
        }
        return new C17045d.b(string, str);
    }

    public final C17045d.a c(n nVar, c cVar, g gVar, boolean z10) {
        String str;
        C17542s.j(nVar, "proto");
        C17542s.j(cVar, "nameResolver");
        C17542s.j(gVar, "typeTable");
        C17198i.f<n, C17030a.d> fVar = C17030a.f140990d;
        C17542s.i(fVar, "propertySignature");
        C17030a.d dVar = (C17030a.d) e.a(nVar, fVar);
        if (dVar == null) {
            return null;
        }
        C17030a.b v10 = dVar.A() ? dVar.v() : null;
        if (v10 == null && z10) {
            return null;
        }
        int X10 = (v10 == null || !v10.u()) ? nVar.X() : v10.s();
        if (v10 == null || !v10.t()) {
            str = g(f.n(nVar, gVar), cVar);
            if (str == null) {
                return null;
            }
        } else {
            str = cVar.getString(v10.r());
        }
        return new C17045d.a(cVar.getString(X10), str);
    }

    public final C17045d.b e(i iVar, c cVar, g gVar) {
        String str;
        i iVar2 = iVar;
        c cVar2 = cVar;
        g gVar2 = gVar;
        C17542s.j(iVar2, "proto");
        C17542s.j(cVar2, "nameResolver");
        C17542s.j(gVar2, "typeTable");
        C17198i.f<i, C17030a.c> fVar = C17030a.f140988b;
        C17542s.i(fVar, "methodSignature");
        C17030a.c cVar3 = (C17030a.c) e.a(iVar2, fVar);
        int Y10 = (cVar3 == null || !cVar3.u()) ? iVar.Y() : cVar3.s();
        if (cVar3 == null || !cVar3.t()) {
            Collection r10 = C16877v.r(f.k(iVar2, gVar2));
            List<u> k02 = iVar.k0();
            C17542s.i(k02, "getValueParameterList(...)");
            Iterable<u> iterable = k02;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (u uVar : iterable) {
                C17542s.g(uVar);
                arrayList.add(f.q(uVar, gVar2));
            }
            Iterable<q> V02 = C16877v.V0(r10, arrayList);
            ArrayList arrayList2 = new ArrayList(C16877v.y(V02, 10));
            for (q g10 : V02) {
                String g11 = f141191a.g(g10, cVar2);
                if (g11 == null) {
                    return null;
                }
                arrayList2.add(g11);
            }
            String g12 = g(f.m(iVar2, gVar2), cVar2);
            if (g12 == null) {
                return null;
            }
            str = C16877v.G0(arrayList2, "", "(", ")", 0, (CharSequence) null, (C17642l) null, 56, (Object) null) + g12;
        } else {
            str = cVar2.getString(cVar3.r());
        }
        return new C17045d.b(cVar2.getString(Y10), str);
    }
}
