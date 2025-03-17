package wK;

import U0.C4889m;
import U0.C4895p;
import XH.t;
import Y1.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tK.C18017h;
import tK.C18030v;
import zK.C18762g;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LwK/e3;", "", "<init>", "()V", "LwK/a3;", "colors", "LwK/S1;", "a", "(LwK/a3;LU0/m;I)LwK/S1;", "color", "LwK/f3;", "b", "(LwK/a3;LU0/m;I)LwK/f3;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.e3  reason: case insensitive filesystem */
final class C18309e3 {

    /* renamed from: a  reason: collision with root package name */
    public static final C18309e3 f150765a = new C18309e3();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.e3$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f150766a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                wK.a3[] r0 = wK.C18261a3.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                wK.a3 r1 = wK.C18261a3.Default     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                wK.a3 r1 = wK.C18261a3.Dark     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                wK.a3 r1 = wK.C18261a3.Grey     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                wK.a3 r1 = wK.C18261a3.White     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f150766a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wK.C18309e3.a.<clinit>():void");
        }
    }

    private C18309e3() {
    }

    private final S1 a(C18261a3 a3Var, C4889m mVar, int i10) {
        S1 s12;
        C4889m mVar2 = mVar;
        mVar2.W(70030619);
        if (C4895p.J()) {
            C4895p.S(70030619, i10, -1, "net.ikea.skapa.ui.components.HyperlinkProps.componentStateColor (Hyperlink.kt:111)");
        }
        C18017h a10 = C18030v.f147664a.a(mVar2, C18030v.f147665b);
        int i11 = a.f150766a[a3Var.ordinal()];
        if (i11 == 1) {
            s12 = new S1(a10.L0(), a10.H0(), 0, 0.0f, a10.L0(), a10.H0(), 0, 0.0f, 0, a10.G0(), 0, 0.0f, 0, (C18762g) null, 0, a10.G0(), 0, 0.0f, 228812, (DefaultConstructorMarker) null);
        } else if (i11 == 2) {
            s12 = new S1(a10.L0(), a10.G0(), 0, 0.0f, a10.L0(), a10.G0(), 0, 0.0f, 0, a10.H0(), 0, 0.0f, 0, (C18762g) null, 0, a10.H0(), 0, 0.0f, 228812, (DefaultConstructorMarker) null);
        } else if (i11 == 3) {
            s12 = new S1(a10.L0(), a10.I0(), 0, 0.0f, a10.L0(), a10.I0(), 0, 0.0f, 0, a10.G0(), 0, 0.0f, 0, (C18762g) null, 0, a10.G0(), 0, 0.0f, 228812, (DefaultConstructorMarker) null);
        } else if (i11 == 4) {
            s12 = new S1(a10.L0(), a10.K0(), 0, 0.0f, a10.L0(), a10.K0(), 0, 0.0f, 0, a10.m0(), 0, 0.0f, 0, (C18762g) null, 0, a10.m0(), 0, 0.0f, 228812, (DefaultConstructorMarker) null);
        } else {
            throw new t();
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return s12;
    }

    public final C18321f3 b(C18261a3 a3Var, C4889m mVar, int i10) {
        C17542s.j(a3Var, "color");
        mVar.W(-814977597);
        if (C4895p.J()) {
            C4895p.S(-814977597, i10, -1, "net.ikea.skapa.ui.components.HyperlinkProps.componentStyle (Hyperlink.kt:98)");
        }
        int i11 = i10 & 126;
        C18321f3 f3Var = new C18321f3(a(a3Var, mVar, i11), k.f14792b.d(), a(a3Var, mVar, i11).d(), (DefaultConstructorMarker) null);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return f3Var;
    }
}
