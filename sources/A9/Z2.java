package a9;

import com.contentsquare.android.sdk.B0;
import d9.C7761g;
import d9.C7762h;
import d9.C7763i;
import d9.C7764j;
import d9.C7765k;
import d9.C7766l;
import d9.F;
import d9.H;
import kotlin.jvm.internal.C17542s;
import z8.C9036b;

public final class Z2 extends C6921r4 {

    /* renamed from: b  reason: collision with root package name */
    public final B0 f42410b;

    /* renamed from: c  reason: collision with root package name */
    public C9036b f42411c;

    /* renamed from: d  reason: collision with root package name */
    public final int f42412d;

    /* renamed from: e  reason: collision with root package name */
    public final int f42413e;

    public Z2(long j10, B0 b02) {
        C17542s.j(b02, "result");
        this.f42410b = b02;
        this.f42412d = b02.f46912i;
        this.f42413e = b02.f46913j;
        b(j10);
    }

    public final F c() {
        long j10 = 0;
        switch (this.f42410b.f46905b) {
            case 6:
                C7761g a10 = C6810d4.a("newBuilder()", C7761g.f50784b);
                C7763i.a.C0830a aVar = C7763i.a.f50793b;
                H.a o10 = H.o();
                C17542s.i(o10, "newBuilder()");
                C7763i.a a11 = aVar.a(o10);
                C9036b bVar = this.f42411c;
                if (bVar != null) {
                    j10 = bVar.r();
                }
                a11.g(j10);
                a11.f(a());
                C7763i iVar = C7763i.f50792a;
                C7766l.a aVar2 = C7766l.f50805b;
                H.f.a k10 = H.f.k();
                C17542s.i(k10, "newBuilder()");
                C7766l a12 = aVar2.a(k10);
                a12.b(this.f42412d);
                a12.c(this.f42413e);
                a11.e(a12.a());
                a10.g(a11.a());
                return a10.a();
            case 8:
                C7761g a13 = C6810d4.a("newBuilder()", C7761g.f50784b);
                C7763i.a.C0830a aVar3 = C7763i.a.f50793b;
                H.a o11 = H.o();
                C17542s.i(o11, "newBuilder()");
                C7763i.a a14 = aVar3.a(o11);
                C9036b bVar2 = this.f42411c;
                if (bVar2 != null) {
                    j10 = bVar2.r();
                }
                a14.g(j10);
                a14.f(a());
                C7763i iVar2 = C7763i.f50792a;
                C7765k.a aVar4 = C7765k.f50801b;
                H.e.a i10 = H.e.i();
                C17542s.i(i10, "newBuilder()");
                a14.d(aVar4.a(i10).a());
                a13.g(a14.a());
                return a13.a();
            case 9:
                C7761g a15 = C6810d4.a("newBuilder()", C7761g.f50784b);
                C7763i.a.C0830a aVar5 = C7763i.a.f50793b;
                H.a o12 = H.o();
                C17542s.i(o12, "newBuilder()");
                C7763i.a a16 = aVar5.a(o12);
                a16.f(a());
                C9036b bVar3 = this.f42411c;
                if (bVar3 != null) {
                    j10 = bVar3.r();
                }
                a16.g(j10);
                C7763i iVar3 = C7763i.f50792a;
                C7762h.a aVar6 = C7762h.f50788b;
                H.c.a j11 = H.c.j();
                C17542s.i(j11, "newBuilder()");
                C7762h a17 = aVar6.a(j11);
                int i11 = this.f42410b.f46907d;
                a17.b(i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? H.b.UNRECOGNIZED : H.b.DIRECTION_RIGHT : H.b.DIRECTION_LEFT : H.b.DIRECTION_DOWN : H.b.DIRECTION_UP);
                a16.b(a17.a());
                a15.g(a16.a());
                return a15.a();
            case 10:
                C7761g a18 = C6810d4.a("newBuilder()", C7761g.f50784b);
                C7763i.a.C0830a aVar7 = C7763i.a.f50793b;
                H.a o13 = H.o();
                C17542s.i(o13, "newBuilder()");
                C7763i.a a19 = aVar7.a(o13);
                a19.f(a());
                C9036b bVar4 = this.f42411c;
                if (bVar4 != null) {
                    j10 = bVar4.r();
                }
                a19.g(j10);
                C7763i iVar4 = C7763i.f50792a;
                C7764j.a aVar8 = C7764j.f50797b;
                H.d.a j12 = H.d.j();
                C17542s.i(j12, "newBuilder()");
                C7764j a20 = aVar8.a(j12);
                int i12 = this.f42410b.f46907d;
                a20.b(i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? H.b.UNRECOGNIZED : H.b.DIRECTION_RIGHT : H.b.DIRECTION_LEFT : H.b.DIRECTION_DOWN : H.b.DIRECTION_UP);
                a19.c(a20.a());
                a18.g(a19.a());
                return a18.a();
            default:
                C7761g.a aVar9 = C7761g.f50784b;
                F.a A10 = F.A();
                C17542s.i(A10, "newBuilder()");
                return aVar9.a(A10).a();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Z2)) {
            return super.equals(obj);
        }
        String obj2 = c().toString();
        C17542s.i(obj2, "toProto().toString()");
        String obj3 = ((Z2) obj).c().toString();
        C17542s.i(obj3, "toProto().toString()");
        return C17542s.e(obj2, obj3);
    }

    public final int hashCode() {
        String obj = c().toString();
        C17542s.i(obj, "toProto().toString()");
        return obj.hashCode();
    }

    public final String toString() {
        String obj = c().toString();
        C17542s.i(obj, "toProto().toString()");
        return obj;
    }
}
