package V5;

import E1.C4478k;
import E1.H;
import E1.I;
import E1.J;
import E1.K;
import E1.a0;
import QJ.M;
import U0.C4889m;
import U0.C4895p;
import U5.e;
import U5.h;
import U5.r;
import XH.C16807N;
import XH.C16820k;
import XH.t;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C5135u0;
import c2.C5267b;
import c2.c;
import c2.s;
import dI.C17168i;
import java.util.List;
import java.util.Map;
import k6.C8438e;
import k6.C8441h;
import k6.C8448o;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import l6.C8529a;
import l6.C8530b;
import l6.f;
import l6.j;
import nI.C17642l;
import o1.C5673m;
import p1.J0;
import pI.C17752b;
import t1.C5942c;
import tI.C17978n;
import u1.C6006d;

@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\u0007\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a9\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a_\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00102\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00102\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00102\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0010H\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\u0005H\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0013\u0010\"\u001a\u00020!*\u00020 H\u0001¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010&\u001a\u00020%*\u00020$H\u0002¢\u0006\u0004\b&\u0010'\u001a\u001b\u0010*\u001a\u00020(*\u00020 2\u0006\u0010)\u001a\u00020(H\u0000¢\u0006\u0004\b*\u0010+\u001a\u001b\u0010-\u001a\u00020(*\u00020 2\u0006\u0010,\u001a\u00020(H\u0000¢\u0006\u0004\b-\u0010+\u001a\u0013\u00100\u001a\u00020/*\u00020.H\u0000¢\u0006\u0004\b0\u00101\u001a\u0011\u00103\u001a\u0004\u0018\u000102H\u0001¢\u0006\u0004\b3\u00104\u001a\u0017\u00106\u001a\u00020\u00152\u0006\u00105\u001a\u00020\u0002H\u0000¢\u0006\u0004\b6\u00107\u001a!\u0010<\u001a\u00020;2\u0006\u00109\u001a\u0002082\b\b\u0002\u0010:\u001a\u000208H\u0002¢\u0006\u0004\b<\u0010=\"\u001a\u0010C\u001a\u00020>8\u0000X\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u001a\u0010H\u001a\u00020 8\u0000X\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\" \u0010O\u001a\u0004\u0018\u00010J*\u00020I8@X\u0004¢\u0006\f\u0012\u0004\bM\u0010N\u001a\u0004\bK\u0010L¨\u0006P"}, d2 = {"", "model", "Lk6/h;", "l", "(Ljava/lang/Object;LU0/m;I)Lk6/h;", "LE1/k;", "contentScale", "m", "(Ljava/lang/Object;LE1/k;LU0/m;I)Lk6/h;", "Ll6/j;", "k", "(LE1/k;LU0/m;I)Ll6/j;", "Lt1/c;", "placeholder", "error", "fallback", "Lkotlin/Function1;", "LU5/e$c;", "r", "(Lt1/c;Lt1/c;Lt1/c;)LnI/l;", "LU5/e$c$c;", "LXH/N;", "onLoading", "LU5/e$c$d;", "onSuccess", "LU5/e$c$b;", "onError", "h", "(LnI/l;LnI/l;LnI/l;)LnI/l;", "Ll6/f;", "p", "(LE1/k;)Ll6/f;", "Lc2/b;", "Ll6/h;", "q", "(J)Ll6/h;", "", "Ll6/a;", "n", "(I)Ll6/a;", "", "width", "d", "(JF)F", "height", "c", "Lo1/m;", "Lc2/r;", "o", "(J)J", "LU5/h;", "j", "(LU0/m;I)LU5/h;", "request", "v", "(Lk6/h;)V", "", "name", "description", "", "t", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;", "LE1/I;", "a", "LE1/I;", "f", "()LE1/I;", "UseMinConstraintsMeasurePolicy", "b", "J", "g", "()J", "ZeroConstraints", "LdI/i;", "LQJ/M;", "e", "(LdI/i;)LQJ/M;", "getDispatcher$annotations", "(LdI/i;)V", "dispatcher", "coil-compose-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private static final I f40450a = a.f40452a;

    /* renamed from: b  reason: collision with root package name */
    private static final long f40451b = c.b(0, 0, 0, 0, 5, (Object) null);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements I {

        /* renamed from: a  reason: collision with root package name */
        public static final a f40452a = new a();

        a() {
        }

        /* access modifiers changed from: private */
        public static final C16807N c(a0.a aVar) {
            return C16807N.f139792a;
        }

        public final J i(K k10, List<? extends H> list, long j10) {
            return K.v0(k10, C5267b.n(j10), C5267b.m(j10), (Map) null, new k(), 4, (Object) null);
        }
    }

    public static final float c(long j10, float f10) {
        return C17978n.l(f10, (float) C5267b.m(j10), (float) C5267b.k(j10));
    }

    public static final float d(long j10, float f10) {
        return C17978n.l(f10, (float) C5267b.n(j10), (float) C5267b.l(j10));
    }

    public static final M e(C17168i iVar) {
        return (M) iVar.get(M.f137585a);
    }

    public static final I f() {
        return f40450a;
    }

    public static final long g() {
        return f40451b;
    }

    public static final C17642l<e.c, C16807N> h(C17642l<? super e.c.C0658c, C16807N> lVar, C17642l<? super e.c.d, C16807N> lVar2, C17642l<? super e.c.b, C16807N> lVar3) {
        if (lVar == null && lVar2 == null && lVar3 == null) {
            return null;
        }
        return new j(lVar, lVar2, lVar3);
    }

    /* access modifiers changed from: private */
    public static final C16807N i(C17642l lVar, C17642l lVar2, C17642l lVar3, e.c cVar) {
        if (cVar instanceof e.c.C0658c) {
            if (lVar != null) {
                lVar.invoke(cVar);
            }
        } else if (cVar instanceof e.c.d) {
            if (lVar2 != null) {
                lVar2.invoke(cVar);
            }
        } else if (cVar instanceof e.c.b) {
            if (lVar3 != null) {
                lVar3.invoke(cVar);
            }
        } else if (!(cVar instanceof e.c.a)) {
            throw new t();
        }
        return C16807N.f139792a;
    }

    public static final h j(C4889m mVar, int i10) {
        h hVar;
        if (C4895p.J()) {
            C4895p.S(-2074249623, i10, -1, "coil3.compose.internal.previewHandler (utils.kt:218)");
        }
        if (((Boolean) mVar.Q(C5135u0.a())).booleanValue()) {
            mVar.W(-1358303232);
            hVar = (h) mVar.Q(r.c());
            mVar.P();
        } else {
            mVar.W(-1358245727);
            mVar.P();
            hVar = null;
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        return hVar;
    }

    private static final j k(C4478k kVar, C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(-894086142, i10, -1, "coil3.compose.internal.rememberSizeResolver (utils.kt:86)");
        }
        boolean e10 = C17542s.e(kVar, C4478k.f5915a.g());
        boolean b10 = mVar.b(e10);
        Object D10 = mVar.D();
        if (b10 || D10 == C4889m.f14007a.a()) {
            D10 = e10 ? j.f54775c : new U5.j();
            mVar.u(D10);
        }
        j jVar = (j) D10;
        if (C4895p.J()) {
            C4895p.R();
        }
        return jVar;
    }

    public static final C8441h l(Object obj, C4889m mVar, int i10) {
        mVar.W(1319639034);
        if (C4895p.J()) {
            C4895p.S(1319639034, i10, -1, "coil3.compose.internal.requestOf (utils.kt:42)");
        }
        if (obj instanceof C8441h) {
            mVar.W(-72498261);
            C8441h hVar = (C8441h) obj;
            mVar.P();
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            return hVar;
        }
        mVar.W(-72459015);
        Context context = (Context) mVar.Q(AndroidCompositionLocals_androidKt.g());
        boolean V10 = mVar.V(context) | mVar.V(obj);
        Object D10 = mVar.D();
        if (V10 || D10 == C4889m.f14007a.a()) {
            D10 = new C8441h.a(context).e(obj).c();
            mVar.u(D10);
        }
        C8441h hVar2 = (C8441h) D10;
        mVar.P();
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return hVar2;
    }

    public static final C8441h m(Object obj, C4478k kVar, C4889m mVar, int i10) {
        mVar.W(-329318062);
        if (C4895p.J()) {
            C4895p.S(-329318062, i10, -1, "coil3.compose.internal.requestOfWithSizeResolver (utils.kt:61)");
        }
        if (obj instanceof C8441h) {
            mVar.W(-858608894);
            C8441h hVar = (C8441h) obj;
            if (hVar.h().m() != null) {
                mVar.W(-858568842);
                mVar.P();
                mVar.P();
                if (C4895p.J()) {
                    C4895p.R();
                }
                mVar.P();
                return hVar;
            }
            mVar.W(-858520668);
            j k10 = k(kVar, mVar, (i10 >> 3) & 14);
            boolean V10 = mVar.V(hVar) | mVar.V(k10);
            Object D10 = mVar.D();
            if (V10 || D10 == C4889m.f14007a.a()) {
                D10 = C8441h.A(hVar, (Context) null, 1, (Object) null).q(k10).c();
                mVar.u(D10);
            }
            C8441h hVar2 = (C8441h) D10;
            mVar.P();
            mVar.P();
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            return hVar2;
        }
        mVar.W(-858262500);
        Context context = (Context) mVar.Q(AndroidCompositionLocals_androidKt.g());
        j k11 = k(kVar, mVar, (i10 >> 3) & 14);
        boolean V11 = mVar.V(context) | mVar.V(obj) | mVar.V(k11);
        Object D11 = mVar.D();
        if (V11 || D11 == C4889m.f14007a.a()) {
            D11 = new C8441h.a(context).e(obj).q(k11).c();
            mVar.u(D11);
        }
        C8441h hVar3 = (C8441h) D11;
        mVar.P();
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return hVar3;
    }

    private static final C8529a n(int i10) {
        return i10 != Integer.MAX_VALUE ? C8529a.C0868a.a(C8530b.a(i10)) : C8529a.b.f54761a;
    }

    public static final long o(long j10) {
        return s.a(C17752b.e(C5673m.l(j10)), C17752b.e(C5673m.i(j10)));
    }

    public static final f p(C4478k kVar) {
        C4478k.a aVar = C4478k.f5915a;
        return (C17542s.e(kVar, aVar.e()) || C17542s.e(kVar, aVar.f())) ? f.FIT : f.FILL;
    }

    public static final l6.h q(long j10) {
        return new l6.h(n(C5267b.l(j10)), n(C5267b.k(j10)));
    }

    public static final C17642l<e.c, e.c> r(C5942c cVar, C5942c cVar2, C5942c cVar3) {
        return (cVar == null && cVar2 == null && cVar3 == null) ? e.f40189y.a() : new i(cVar, cVar3, cVar2);
    }

    /* access modifiers changed from: private */
    public static final e.c s(C5942c cVar, C5942c cVar2, C5942c cVar3, e.c cVar4) {
        e.c c10;
        if (cVar4 instanceof e.c.C0658c) {
            e.c.C0658c cVar5 = (e.c.C0658c) cVar4;
            if (cVar == null) {
                return cVar5;
            }
            c10 = cVar5.b(cVar);
        } else if (!(cVar4 instanceof e.c.b)) {
            return cVar4;
        } else {
            e.c.b bVar = (e.c.b) cVar4;
            if (bVar.d().a() instanceof C8448o) {
                if (cVar2 == null) {
                    return bVar;
                }
                c10 = e.c.b.c(bVar, cVar2, (C8438e) null, 2, (Object) null);
            } else if (cVar3 == null) {
                return bVar;
            } else {
                c10 = e.c.b.c(bVar, cVar3, (C8438e) null, 2, (Object) null);
            }
        }
        return c10;
    }

    private static final Void t(String str, String str2) {
        throw new IllegalArgumentException("Unsupported type: " + str + ". " + str2);
    }

    static /* synthetic */ Void u(String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = "If you wish to display this " + str + ", use androidx.compose.foundation.Image.";
        }
        return t(str, str2);
    }

    public static final void v(C8441h hVar) {
        Object d10 = hVar.d();
        if (d10 instanceof C8441h.a) {
            t("ImageRequest.Builder", "Did you forget to call ImageRequest.Builder.build()?");
            throw new C16820k();
        } else if (d10 instanceof J0) {
            u("ImageBitmap", (String) null, 2, (Object) null);
            throw new C16820k();
        } else if (d10 instanceof C6006d) {
            u("ImageVector", (String) null, 2, (Object) null);
            throw new C16820k();
        } else if (!(d10 instanceof C5942c)) {
            m.a(hVar);
        } else {
            u("Painter", (String) null, 2, (Object) null);
            throw new C16820k();
        }
    }
}
