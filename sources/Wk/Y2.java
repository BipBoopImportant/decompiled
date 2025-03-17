package wK;

import U0.C4889m;
import U0.C4895p;
import XH.t;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import tK.C18029u;
import tK.C18030v;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0010\u0010\fR\u0017\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0012\u0010\f¨\u0006\u0014"}, d2 = {"LwK/Y2;", "", "<init>", "()V", "LwK/Z2;", "state", "Lp1/v0;", "a", "(LwK/Z2;LU0/m;I)J", "Lc2/h;", "b", "F", "()F", "Height", "c", "IconSize", "d", "IconSpacing", "e", "IconTopPadding", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Y2 {

    /* renamed from: a  reason: collision with root package name */
    public static final Y2 f150442a = new Y2();

    /* renamed from: b  reason: collision with root package name */
    private static final float f150443b;

    /* renamed from: c  reason: collision with root package name */
    private static final float f150444c;

    /* renamed from: d  reason: collision with root package name */
    private static final float f150445d = C18029u.f147649a.f();

    /* renamed from: e  reason: collision with root package name */
    private static final float f150446e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f150447a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                wK.Z2[] r0 = wK.Z2.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                wK.Z2 r1 = wK.Z2.Regular     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                wK.Z2 r1 = wK.Z2.Error     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                wK.Z2 r1 = wK.Z2.Success     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                wK.Z2 r1 = wK.Z2.Warning     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f150447a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wK.Y2.a.<clinit>():void");
        }
    }

    static {
        float B10 = h.B((float) 18);
        f150443b = B10;
        float B11 = h.B((float) 16);
        f150444c = B11;
        f150446e = h.B(h.B(B10 - B11) / ((float) 2));
    }

    private Y2() {
    }

    public final long a(Z2 z22, C4889m mVar, int i10) {
        long j10;
        C17542s.j(z22, "state");
        mVar.W(953320958);
        if (C4895p.J()) {
            C4895p.S(953320958, i10, -1, "net.ikea.skapa.ui.components.HelperTextProps.contentColor (HelperText.kt:125)");
        }
        int i11 = a.f150447a[z22.ordinal()];
        if (i11 == 1) {
            mVar.W(-1616582816);
            j10 = C18030v.f147664a.a(mVar, C18030v.f147665b).I0();
            mVar.P();
        } else if (i11 == 2) {
            mVar.W(-1616580636);
            j10 = C18030v.f147664a.a(mVar, C18030v.f147665b).v0();
            mVar.P();
        } else if (i11 == 3) {
            mVar.W(-1616578268);
            j10 = C18030v.f147664a.a(mVar, C18030v.f147665b).w0();
            mVar.P();
        } else if (i11 == 4) {
            mVar.W(-1616575897);
            j10 = C18030v.f147664a.a(mVar, C18030v.f147665b).t0();
            mVar.P();
        } else {
            mVar.W(-1616584815);
            mVar.P();
            throw new t();
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return j10;
    }

    public final float b() {
        return f150443b;
    }

    public final float c() {
        return f150444c;
    }

    public final float d() {
        return f150445d;
    }

    public final float e() {
        return f150446e;
    }
}
