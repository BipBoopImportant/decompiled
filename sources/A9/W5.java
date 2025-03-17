package a9;

import D8.c;
import YH.C16877v;
import com.google.protobuf.C9575h;
import d9.C7761g;
import d9.C7770p;
import d9.F;
import d9.M;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import y8.C8993b;

public final class W5 extends C6921r4 {

    /* renamed from: b  reason: collision with root package name */
    public final C8993b f42367b;

    /* renamed from: c  reason: collision with root package name */
    public final c f42368c = new c((String) null, 1, (DefaultConstructorMarker) null);

    public static final class a extends C17544u implements C17642l<Map.Entry<? extends String, ? extends String>, CharSequence> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f42369c = new a();

        public a() {
            super(1);
        }

        public final Object invoke(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            C17542s.j(entry, "it");
            return ((String) entry.getKey()) + ": " + ((String) entry.getValue());
        }
    }

    public W5(C8993b bVar) {
        C17542s.j(bVar, "event");
        this.f42367b = bVar;
        b(bVar.D());
    }

    public static void d(String str, StringBuilder sb2, byte[] bArr, Map map) {
        Set entrySet;
        Set entrySet2;
        if (bArr != null || (map != null && !map.isEmpty())) {
            sb2.append(str.concat(": ["));
            if (!(map == null || (entrySet2 = map.entrySet()) == null)) {
                StringBuilder sb3 = (StringBuilder) C16877v.E0(entrySet2, sb2, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, a.f42369c, 60, (Object) null);
            }
            if (bArr != null) {
                if (!(map == null || (entrySet = map.entrySet()) == null || !(!entrySet.isEmpty()))) {
                    sb2.append(", ");
                }
                sb2.append("(encrypted)");
            }
            sb2.append("]");
        }
    }

    public final F c() {
        C7761g a10 = C6810d4.a("newBuilder()", C7761g.f50784b);
        C7770p.a aVar = C7770p.f50813b;
        M.a e02 = M.e0();
        C17542s.i(e02, "newBuilder()");
        C7770p a11 = aVar.a(e02);
        a11.C(this.f42367b.D());
        a11.r(this.f42367b.h());
        a11.D(this.f42367b.E());
        a11.B(this.f42367b.C());
        a11.z(this.f42367b.y());
        a11.w(this.f42367b.t());
        a11.A(this.f42367b.z());
        byte[] o10 = this.f42367b.o();
        if (o10 != null) {
            C9575h m10 = C9575h.m(o10);
            C17542s.i(m10, "copyFrom(it)");
            a11.t(m10);
        }
        byte[] i10 = this.f42367b.i();
        if (i10 != null) {
            C9575h m11 = C9575h.m(i10);
            C17542s.i(m11, "copyFrom(it)");
            a11.s(m11);
        }
        byte[] p10 = this.f42367b.p();
        if (p10 != null) {
            C9575h m12 = C9575h.m(p10);
            C17542s.i(m12, "copyFrom(it)");
            a11.u(m12);
        }
        byte[] u10 = this.f42367b.u();
        if (u10 != null) {
            C9575h m13 = C9575h.m(u10);
            C17542s.i(m13, "copyFrom(it)");
            a11.x(m13);
        }
        byte[] f10 = this.f42367b.f();
        if (f10 != null) {
            C9575h m14 = C9575h.m(f10);
            C17542s.i(m14, "copyFrom(it)");
            a11.p(m14);
        }
        Long g10 = this.f42367b.g();
        if (g10 != null) {
            a11.q(g10.longValue());
        }
        C8993b bVar = this.f42367b;
        Map<String, String> m15 = bVar.m();
        if (m15 != null) {
            a11.j(a11.d(), m15);
        }
        Map<String, String> n10 = bVar.n();
        if (n10 != null) {
            a11.k(a11.e(), n10);
        }
        byte[] q10 = bVar.q();
        if (q10 != null) {
            C9575h m16 = C9575h.m(q10);
            C17542s.i(m16, "copyFrom(it)");
            a11.v(m16);
        }
        byte[] v10 = bVar.v();
        if (v10 != null) {
            C9575h m17 = C9575h.m(v10);
            C17542s.i(m17, "copyFrom(it)");
            a11.y(m17);
        }
        C8993b bVar2 = this.f42367b;
        Map<String, String> A10 = bVar2.A();
        if (A10 != null) {
            a11.l(a11.f(), A10);
        }
        Map<String, String> B10 = bVar2.B();
        if (B10 != null) {
            a11.m(a11.g(), B10);
        }
        byte[] d10 = bVar2.d();
        if (d10 != null) {
            C9575h m18 = C9575h.m(d10);
            C17542s.i(m18, "copyFrom(it)");
            a11.n(m18);
        }
        byte[] e10 = bVar2.e();
        if (e10 != null) {
            C9575h m19 = C9575h.m(e10);
            C17542s.i(m19, "copyFrom(it)");
            a11.o(m19);
        }
        Map<String, String> k10 = bVar2.k();
        if (k10 != null) {
            a11.h(a11.b(), k10);
        }
        Map<String, String> l10 = bVar2.l();
        if (l10 != null) {
            a11.i(a11.c(), l10);
        }
        a10.j(a11.a());
        return a10.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof W5) && C17542s.e(this.f42367b, ((W5) obj).f42367b);
    }

    public final int hashCode() {
        return this.f42367b.hashCode();
    }

    public final String toString() {
        return "NetworkSrEvent(event=" + this.f42367b + ')';
    }
}
