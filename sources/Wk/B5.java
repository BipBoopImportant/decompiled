package wK;

import U0.C4889m;
import U0.C4895p;
import XH.t;
import XH.v;
import androidx.compose.foundation.layout.D;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.m1;
import s0.C5834E;
import sK.C17950a;
import tK.C18017h;
import tK.C18029u;
import tK.C18030v;
import wK.C18335g5;
import wK.C18405m3;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LwK/B5;", "", "<init>", "()V", "LwK/A5;", "program", "LwK/f5;", "a", "(LwK/A5;LU0/m;I)LwK/f5;", "LwK/z5;", "orientation", "LwK/c5;", "actionParams", "LwK/e5;", "codeType", "LwK/C5;", "c", "(LwK/z5;LwK/c5;LwK/e5;)LwK/C5;", "LwK/D5;", "d", "(LwK/A5;LwK/z5;LwK/c5;LwK/e5;LU0/m;I)LwK/D5;", "LwK/n;", "icon", "", "b", "(LwK/n;LU0/m;I)I", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class B5 {

    /* renamed from: a  reason: collision with root package name */
    public static final B5 f149271a = new B5();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f149272a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f149273b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f149274c;

        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|(2:17|18)|19|21|22|23|24|25|27) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0054 */
        static {
            /*
                wK.n[] r0 = wK.C18413n.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                wK.n r2 = wK.C18413n.FullScreen     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                wK.n r3 = wK.C18413n.CrossSmall     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                wK.n r4 = wK.C18413n.Ellipsis     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f149272a = r0
                wK.A5[] r0 = wK.A5.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                wK.A5 r4 = wK.A5.Family     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                wK.A5 r4 = wK.A5.Business     // Catch:{ NoSuchFieldError -> 0x003b }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r0[r4] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                wK.A5 r4 = wK.A5.BusinessNetwork     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                f149273b = r0
                wK.z5[] r0 = wK.C18561z5.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                wK.z5 r3 = wK.C18561z5.Horizontal     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                wK.z5 r1 = wK.C18561z5.Vertical     // Catch:{ NoSuchFieldError -> 0x005c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005c }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005c }
            L_0x005c:
                f149274c = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wK.B5.a.<clinit>():void");
        }
    }

    private B5() {
    }

    private final C18323f5 a(A5 a52, C4889m mVar, int i10) {
        C18323f5 f5Var;
        C4889m mVar2 = mVar;
        mVar2.W(393284937);
        if (C4895p.J()) {
            C4895p.S(393284937, i10, -1, "net.ikea.skapa.ui.components.MemberCardProps.memberCardColors (MemberCard.kt:599)");
        }
        C18017h a10 = C18030v.f147664a.a(mVar2, C18030v.f147665b);
        int i11 = a.f149273b[a52.ordinal()];
        if (i11 == 1) {
            f5Var = new C18323f5(a10.D0(), (Integer) null, (m1) null, a10.F0(), a10.B0(), a10.F0(), a10.y0(), C18405m3.g.b.f151255b, 4, (DefaultConstructorMarker) null);
        } else if (i11 == 2) {
            f5Var = new C18323f5(a10.s0(), Integer.valueOf(C17950a.f147150L), (m1) null, a10.x0(), a10.E0(), a10.F0(), a10.y0(), C18405m3.g.f151252b, 4, (DefaultConstructorMarker) null);
        } else if (i11 == 3) {
            f5Var = new C18323f5(a10.y0(), Integer.valueOf(C17950a.f147149K), m1.e(m1.f27333b.d()), a10.x0(), a10.E0(), a10.F0(), a10.y0(), C18405m3.g.f151252b, (DefaultConstructorMarker) null);
        } else {
            throw new t();
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return f5Var;
    }

    private final C5 c(C18561z5 z5Var, C18287c5 c5Var, C18311e5 e5Var) {
        C18311e5 e5Var2 = e5Var;
        int i10 = a.f149274c[z5Var.ordinal()];
        if (i10 == 1) {
            C18335g5.a aVar = C18335g5.a.f150875a;
            float g10 = aVar.g();
            float d10 = aVar.d();
            float c10 = aVar.c();
            v vVar = new v(h.m(aVar.f()), h.m(aVar.e()));
            v vVar2 = new v(h.m(aVar.b()), h.m(aVar.a()));
            C18029u uVar = C18029u.f147649a;
            return new C5(g10, d10, c10, vVar, vVar2, uVar.j(), D.c(0.0f, 0.0f, 3, (Object) null), D.e(uVar.a(), uVar.l(), c5Var != null ? uVar.h() : uVar.a(), 0.0f, 8, (Object) null), D.e(uVar.a(), 0.0f, uVar.l(), uVar.l(), 2, (Object) null), D.d(uVar.a(), uVar.a(), uVar.a(), uVar.j()), uVar.f(), (DefaultConstructorMarker) null);
        } else if (i10 == 2) {
            C18311e5 e5Var3 = C18311e5.QR;
            float h10 = e5Var2 == e5Var3 ? C18335g5.b.f150883a.h() : C18335g5.b.f150883a.b();
            C18335g5.b bVar = C18335g5.b.f150883a;
            float i11 = bVar.i();
            float g11 = e5Var2 == e5Var3 ? bVar.g() : bVar.a();
            v vVar3 = new v(h.m(bVar.k()), h.m(bVar.j()));
            v vVar4 = new v(h.m(bVar.f()), h.m(bVar.e()));
            C18029u uVar2 = C18029u.f147649a;
            return new C5(h10, i11, g11, vVar3, vVar4, uVar2.j(), (C5834E) null, D.e(uVar2.d(), uVar2.d(), c5Var != null ? uVar2.h() : uVar2.d(), 0.0f, 8, (Object) null), D.e(0.0f, uVar2.g(), 0.0f, 0.0f, 13, (Object) null), D.e(0.0f, uVar2.d(), 0.0f, 0.0f, 13, (Object) null), uVar2.d(), 64, (DefaultConstructorMarker) null);
        } else {
            throw new t();
        }
    }

    public final int b(C18413n nVar, C4889m mVar, int i10) {
        int i11;
        C17542s.j(nVar, "icon");
        mVar.W(825439916);
        if (C4895p.J()) {
            C4895p.S(825439916, i10, -1, "net.ikea.skapa.ui.components.MemberCardProps.memberCardIcon (MemberCard.kt:589)");
        }
        int i12 = a.f149272a[nVar.ordinal()];
        if (i12 == 1) {
            i11 = C17950a.f147177z;
        } else if (i12 == 2) {
            i11 = C17950a.f147175x;
        } else if (i12 == 3) {
            i11 = C17950a.f147176y;
        } else {
            throw new t();
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return i11;
    }

    public final D5 d(A5 a52, C18561z5 z5Var, C18287c5 c5Var, C18311e5 e5Var, C4889m mVar, int i10) {
        C17542s.j(a52, "program");
        C17542s.j(z5Var, "orientation");
        C17542s.j(e5Var, "codeType");
        mVar.W(1036988622);
        if (C4895p.J()) {
            C4895p.S(1036988622, i10, -1, "net.ikea.skapa.ui.components.MemberCardProps.memberCardStyle (MemberCard.kt:581)");
        }
        D5 d52 = new D5(a(a52, mVar, ((i10 >> 9) & 112) | (i10 & 14)), c(z5Var, c5Var, e5Var));
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return d52;
    }
}
