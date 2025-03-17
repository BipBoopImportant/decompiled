package wK;

import A0.g;
import U0.C4889m;
import U0.C4895p;
import XH.t;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n0.C5601g;
import n0.C5602h;
import tK.C18013d;
import tK.C18014e;
import tK.C18030v;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"LwK/c6;", "", "<init>", "()V", "LwK/d6;", "size", "LwK/e6;", "a", "(LwK/d6;LU0/m;I)LwK/e6;", "Lc2/h;", "b", "F", "BorderWidth", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.c6  reason: case insensitive filesystem */
final class C18288c6 {

    /* renamed from: a  reason: collision with root package name */
    public static final C18288c6 f150671a = new C18288c6();

    /* renamed from: b  reason: collision with root package name */
    private static final float f150672b = C18014e.f147445a.b();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.c6$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f150673a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                wK.d6[] r0 = wK.C18300d6.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                wK.d6 r1 = wK.C18300d6.Small     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                wK.d6 r1 = wK.C18300d6.Medium     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f150673a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wK.C18288c6.a.<clinit>():void");
        }
    }

    private C18288c6() {
    }

    public final C18312e6 a(C18300d6 d6Var, C4889m mVar, int i10) {
        C18312e6 e6Var;
        C4889m mVar2 = mVar;
        C17542s.j(d6Var, "size");
        mVar2.W(765036270);
        if (C4895p.J()) {
            C4895p.S(765036270, i10, -1, "net.ikea.skapa.ui.components.PaymentLogoProps.style (PaymentLogo.kt:182)");
        }
        float f10 = f150672b;
        C18030v vVar = C18030v.f147664a;
        int i11 = C18030v.f147665b;
        C5601g a10 = C5602h.a(f10, vVar.a(mVar2, i11).m0());
        int i12 = a.f150673a[d6Var.ordinal()];
        if (i12 == 1) {
            mVar2.W(1189587527);
            e6Var = new C18312e6(h.B((float) 34), h.B((float) 24), a10, g.e(h.B((float) 2)), g.e(h.B((float) 3)), vVar.a(mVar2, i11).F0(), (DefaultConstructorMarker) null);
            mVar.P();
        } else if (i12 == 2) {
            mVar2.W(1189598672);
            e6Var = new C18312e6(h.B((float) 56), h.B((float) 40), a10, C18013d.f147437a.e(), g.e(h.B((float) 5)), vVar.a(mVar2, i11).F0(), (DefaultConstructorMarker) null);
            mVar.P();
        } else {
            mVar2.W(1189586313);
            mVar.P();
            throw new t();
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return e6Var;
    }
}
