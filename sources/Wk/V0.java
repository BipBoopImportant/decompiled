package wK;

import N1.E;
import N1.Y;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import S1.C4831y;
import U0.C4889m;
import U0.C4895p;
import U1.e;
import XH.t;
import XH.v;
import Y1.k;
import Y1.o;
import Y1.q;
import Y1.s;
import YH.C16877v;
import androidx.compose.foundation.layout.D;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import p1.C5747v0;
import p1.g1;
import r1.g;
import s0.C5834E;
import tK.C18029u;
import tK.C18030v;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u000f\u0010\u0012¨\u0006\u0015"}, d2 = {"LwK/V0;", "", "<init>", "()V", "LwK/W0;", "cardV2Variant", "Ls0/E;", "a", "(LwK/W0;LU0/m;I)Ls0/E;", "LwK/H0;", "cardTheme", "LwK/F0;", "d", "(LwK/W0;LwK/H0;LU0/m;II)LwK/F0;", "Lc2/h;", "b", "F", "c", "()F", "minContentWidth", "maxContentWidth", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class V0 {

    /* renamed from: a  reason: collision with root package name */
    public static final V0 f150267a = new V0();

    /* renamed from: b  reason: collision with root package name */
    private static final float f150268b = h.B((float) 327);

    /* renamed from: c  reason: collision with root package name */
    private static final float f150269c = h.B((float) 480);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f150270a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                wK.W0[] r0 = wK.W0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                wK.W0 r1 = wK.W0.Regular     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                wK.W0 r1 = wK.W0.Simple     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f150270a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wK.V0.a.<clinit>():void");
        }
    }

    private V0() {
    }

    public final C5834E a(W0 w02, C4889m mVar, int i10) {
        C5834E e10;
        C17542s.j(w02, "cardV2Variant");
        mVar.W(1197106911);
        if (C4895p.J()) {
            C4895p.S(1197106911, i10, -1, "net.ikea.skapa.ui.components.CardV2Props.footerPadding (CardV2.kt:673)");
        }
        int i11 = a.f150270a[w02.ordinal()];
        if (i11 == 1) {
            C18029u uVar = C18029u.f147649a;
            e10 = D.d(uVar.e(), uVar.d(), uVar.e(), uVar.e());
        } else if (i11 == 2) {
            C18029u uVar2 = C18029u.f147649a;
            e10 = D.e(0.0f, uVar2.d(), uVar2.a(), 0.0f, 9, (Object) null);
        } else {
            throw new t();
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return e10;
    }

    public final float b() {
        return f150269c;
    }

    public final float c() {
        return f150268b;
    }

    public final F0 d(W0 w02, H0 h02, C4889m mVar, int i10, int i11) {
        v vVar;
        F0 f02;
        W0 w03 = w02;
        C4889m mVar2 = mVar;
        C17542s.j(w03, "cardV2Variant");
        mVar2.W(600626422);
        H0 h03 = (i11 & 2) != 0 ? H0.Default : h02;
        if (C4895p.J()) {
            C4895p.S(600626422, i10, -1, "net.ikea.skapa.ui.components.CardV2Props.style (CardV2.kt:688)");
        }
        if (h03 == H0.Default) {
            mVar2.W(-898806904);
            C18030v vVar2 = C18030v.f147664a;
            int i12 = C18030v.f147665b;
            vVar = new v(C5747v0.k(vVar2.a(mVar2, i12).G0()), C5747v0.k(vVar2.a(mVar2, i12).H0()));
            mVar.P();
        } else if (h03 == H0.Wayfinding) {
            mVar2.W(-898802120);
            C18030v vVar3 = C18030v.f147664a;
            int i13 = C18030v.f147665b;
            vVar = new v(C5747v0.k(vVar3.a(mVar2, i13).F0()), C5747v0.k(vVar3.a(mVar2, i13).F0()));
            mVar.P();
        } else if (h03 == H0.LowestPrice || h03 == H0.IkeaBusinessNetwork) {
            mVar2.W(-898797416);
            C18030v vVar4 = C18030v.f147664a;
            int i14 = C18030v.f147665b;
            vVar = new v(C5747v0.k(vVar4.a(mVar2, i14).x0()), C5747v0.k(vVar4.a(mVar2, i14).x0()));
            mVar.P();
        } else if (h03 == H0.New || h03 == H0.NewLowerPrice || h03 == H0.IkeaFamily) {
            mVar2.W(-898792070);
            C18030v vVar5 = C18030v.f147664a;
            int i15 = C18030v.f147665b;
            vVar = new v(C5747v0.k(vVar5.a(mVar2, i15).K0()), C5747v0.k(vVar5.a(mVar2, i15).K0()));
            mVar.P();
        } else if (h03 == H0.ImportantMessage || h03 == H0.Sustainability) {
            mVar2.W(-898787302);
            C18030v vVar6 = C18030v.f147664a;
            int i16 = C18030v.f147665b;
            vVar = new v(C5747v0.k(vVar6.a(mVar2, i16).K0()), C5747v0.k(vVar6.a(mVar2, i16).K0()));
            mVar.P();
        } else if (h03 == H0.Inverse) {
            mVar2.W(-898784038);
            C18030v vVar7 = C18030v.f147664a;
            int i17 = C18030v.f147665b;
            vVar = new v(C5747v0.k(vVar7.a(mVar2, i17).G0()), C5747v0.k(vVar7.a(mVar2, i17).H0()));
            mVar.P();
        } else if (C16877v.l0(C16877v.q(H0.ExtendedPalette01, H0.ExtendedPalette02, H0.ExtendedPalette03, H0.ExtendedPalette04, H0.ExtendedPalette06, H0.ExtendedPalette08, H0.ExtendedPalette09, H0.ExtendedPalette10, H0.ExtendedPalette11, H0.ExtendedPalette12, H0.ExtendedPalette13, H0.ExtendedPalette14, H0.ExtendedPalette15, H0.ExtendedPalette17, H0.ExtendedPalette18, H0.ExtendedPalette20, H0.ExtendedPalette21), h03)) {
            mVar2.W(-898756104);
            C18030v vVar8 = C18030v.f147664a;
            int i18 = C18030v.f147665b;
            vVar = new v(C5747v0.k(vVar8.a(mVar2, i18).x0()), C5747v0.k(vVar8.a(mVar2, i18).x0()));
            mVar.P();
        } else if (C16877v.l0(C16877v.q(H0.ExtendedPalette05, H0.ExtendedPalette07, H0.ExtendedPalette16, H0.ExtendedPalette19), h03)) {
            mVar2.W(-898746952);
            C18030v vVar9 = C18030v.f147664a;
            int i19 = C18030v.f147665b;
            vVar = new v(C5747v0.k(vVar9.a(mVar2, i19).F0()), C5747v0.k(vVar9.a(mVar2, i19).F0()));
            mVar.P();
        } else {
            mVar2.W(-898744134);
            C18030v vVar10 = C18030v.f147664a;
            int i20 = C18030v.f147665b;
            vVar = new v(C5747v0.k(vVar10.a(mVar2, i20).H0()), C5747v0.k(vVar10.a(mVar2, i20).H0()));
            mVar.P();
        }
        long y10 = ((C5747v0) vVar.a()).y();
        long j10 = y10;
        long y11 = ((C5747v0) vVar.b()).y();
        C18030v vVar11 = C18030v.f147664a;
        int i21 = C18030v.f147665b;
        Y c10 = Y.c(vVar11.b(mVar2, i21).a().b(), y10, 0, (C) null, (C4830x) null, (C4831y) null, (C4820m) null, (String) null, 0, (Y1.a) null, (o) null, (e) null, 0, (k) null, (g1) null, (g) null, 0, 0, 0, (q) null, (E) null, (Y1.h) null, 0, 0, (s) null, 16777214, (Object) null);
        Y c11 = Y.c(vVar11.b(mVar2, i21).c().a(), y10, 0, (C) null, (C4830x) null, (C4831y) null, (C4820m) null, (String) null, 0, (Y1.a) null, (o) null, (e) null, 0, (k) null, (g1) null, (g) null, 0, 0, 0, (q) null, (E) null, (Y1.h) null, 0, 0, (s) null, 16777214, (Object) null);
        Y c12 = Y.c(vVar11.b(mVar2, i21).a().b(), y11, 0, (C) null, (C4830x) null, (C4831y) null, (C4820m) null, (String) null, 0, (Y1.a) null, (o) null, (e) null, 0, (k) null, (g1) null, (g) null, 0, 0, 0, (q) null, (E) null, (Y1.h) null, 0, 0, (s) null, 16777214, (Object) null);
        Y c13 = Y.c(vVar11.b(mVar2, i21).c().e(), j10, 0, (C) null, (C4830x) null, (C4831y) null, (C4820m) null, (String) null, 0, (Y1.a) null, (o) null, (e) null, 0, (k) null, (g1) null, (g) null, 0, 0, 0, (q) null, (E) null, (Y1.h) null, 0, 0, (s) null, 16777214, (Object) null);
        if (w03 == W0.Regular) {
            C18029u uVar = C18029u.f147649a;
            f02 = new F0(c11, c10, c13, c12, D.e(uVar.e(), uVar.e(), uVar.e(), 0.0f, 8, (Object) null));
        } else if (w03 == W0.Simple) {
            Y c14 = Y.c(c11, vVar11.a(mVar2, i21).G0(), 0, (C) null, (C4830x) null, (C4831y) null, (C4820m) null, (String) null, 0, (Y1.a) null, (o) null, (e) null, 0, (k) null, (g1) null, (g) null, 0, 0, 0, (q) null, (E) null, (Y1.h) null, 0, 0, (s) null, 16777214, (Object) null);
            Y c15 = Y.c(c10, vVar11.a(mVar2, i21).G0(), 0, (C) null, (C4830x) null, (C4831y) null, (C4820m) null, (String) null, 0, (Y1.a) null, (o) null, (e) null, 0, (k) null, (g1) null, (g) null, 0, 0, 0, (q) null, (E) null, (Y1.h) null, 0, 0, (s) null, 16777214, (Object) null);
            C18029u uVar2 = C18029u.f147649a;
            C5834E e10 = D.e(0.0f, uVar2.a(), uVar2.a(), 0.0f, 9, (Object) null);
            f02 = new F0(c14, c15, Y.c(c13, vVar11.a(mVar2, i21).G0(), 0, (C) null, (C4830x) null, (C4831y) null, (C4820m) null, (String) null, 0, (Y1.a) null, (o) null, (e) null, 0, (k) null, (g1) null, (g) null, 0, 0, 0, (q) null, (E) null, (Y1.h) null, 0, 0, (s) null, 16777214, (Object) null), Y.c(c12, vVar11.a(mVar2, i21).H0(), 0, (C) null, (C4830x) null, (C4831y) null, (C4820m) null, (String) null, 0, (Y1.a) null, (o) null, (e) null, 0, (k) null, (g1) null, (g) null, 0, 0, 0, (q) null, (E) null, (Y1.h) null, 0, 0, (s) null, 16777214, (Object) null), e10);
        } else {
            throw new t();
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return f02;
    }
}
