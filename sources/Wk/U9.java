package wK;

import U0.C4889m;
import U0.C4895p;
import XH.t;
import c2.h;
import c2.w;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import tK.C18030v;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\n\u0010\u0013¨\u0006\u0015"}, d2 = {"LwK/U9;", "", "<init>", "()V", "LwK/W9;", "variant", "Lp1/v0;", "a", "(LwK/W9;LU0/m;I)J", "Lc2/h;", "b", "F", "d", "()F", "SmallSize", "c", "MinProportionalSize", "Lc2/v;", "J", "()J", "DefaultTextSize", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class U9 {

    /* renamed from: a  reason: collision with root package name */
    public static final U9 f150259a = new U9();

    /* renamed from: b  reason: collision with root package name */
    private static final float f150260b = h.B((float) 8);

    /* renamed from: c  reason: collision with root package name */
    private static final float f150261c = h.B((float) 12);

    /* renamed from: d  reason: collision with root package name */
    private static final long f150262d = w.i(14);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f150263a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                wK.W9[] r0 = wK.W9.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                wK.W9 r1 = wK.W9.Available     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                wK.W9 r1 = wK.W9.Low     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                wK.W9 r1 = wK.W9.Unavailable     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                wK.W9 r1 = wK.W9.Indeterminate     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f150263a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wK.U9.a.<clinit>():void");
        }
    }

    private U9() {
    }

    public final long a(W9 w92, C4889m mVar, int i10) {
        long j10;
        C17542s.j(w92, "variant");
        mVar.W(1524936650);
        if (C4895p.J()) {
            C4895p.S(1524936650, i10, -1, "net.ikea.skapa.ui.components.StatusProps.color (Status.kt:217)");
        }
        int i11 = a.f150263a[w92.ordinal()];
        if (i11 == 1) {
            mVar.W(-587957422);
            j10 = C18030v.f147664a.a(mVar, C18030v.f147665b).w0();
            mVar.P();
        } else if (i11 == 2) {
            mVar.W(-587955695);
            j10 = C18030v.f147664a.a(mVar, C18030v.f147665b).s0();
            mVar.P();
        } else if (i11 == 3) {
            mVar.W(-587953742);
            j10 = C18030v.f147664a.a(mVar, C18030v.f147665b).v0();
            mVar.P();
        } else if (i11 == 4) {
            mVar.W(-587951698);
            j10 = C18030v.f147664a.a(mVar, C18030v.f147665b).J0();
            mVar.P();
        } else {
            mVar.W(-587959097);
            mVar.P();
            throw new t();
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return j10;
    }

    public final long b() {
        return f150262d;
    }

    public final float c() {
        return f150261c;
    }

    public final float d() {
        return f150260b;
    }
}
