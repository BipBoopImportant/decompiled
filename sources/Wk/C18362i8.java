package wK;

import U0.C4889m;
import U0.C4895p;
import XH.t;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tK.C18017h;
import tK.C18030v;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\rR\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u0017\u0010\u0015\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\n\u0010\r¨\u0006\u0016"}, d2 = {"LwK/i8;", "", "<init>", "()V", "LwK/k8;", "variant", "LwK/j8;", "f", "(LwK/k8;LU0/m;I)LwK/j8;", "Lc2/h;", "b", "F", "c", "()F", "RadioButtonSize", "a", "RadioButtonDotSize", "d", "e", "RadioStrokeWidth", "RadioRadius", "RadioButtonRippleRadius", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.i8  reason: case insensitive filesystem */
final class C18362i8 {

    /* renamed from: a  reason: collision with root package name */
    public static final C18362i8 f151040a = new C18362i8();

    /* renamed from: b  reason: collision with root package name */
    private static final float f151041b;

    /* renamed from: c  reason: collision with root package name */
    private static final float f151042c = h.B((float) 16);

    /* renamed from: d  reason: collision with root package name */
    private static final float f151043d = h.B((float) 1);

    /* renamed from: e  reason: collision with root package name */
    private static final float f151044e;

    /* renamed from: f  reason: collision with root package name */
    private static final float f151045f;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.i8$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f151046a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                wK.k8[] r0 = wK.C18386k8.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                wK.k8 r1 = wK.C18386k8.Emphasised     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                wK.k8 r1 = wK.C18386k8.Subtle     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f151046a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wK.C18362i8.a.<clinit>():void");
        }
    }

    static {
        float f10 = (float) 24;
        float B10 = h.B(f10);
        f151041b = B10;
        f151044e = h.B(B10 / ((float) 2));
        f151045f = h.B(f10);
    }

    private C18362i8() {
    }

    public final float a() {
        return f151042c;
    }

    public final float b() {
        return f151045f;
    }

    public final float c() {
        return f151041b;
    }

    public final float d() {
        return f151044e;
    }

    public final float e() {
        return f151043d;
    }

    public final C18374j8 f(C18386k8 k8Var, C4889m mVar, int i10) {
        C18374j8 j8Var;
        C4889m mVar2 = mVar;
        C17542s.j(k8Var, "variant");
        mVar2.W(236234882);
        if (C4895p.J()) {
            C4895p.S(236234882, i10, -1, "net.ikea.skapa.ui.components.RadioButtonProps.style (RadioButton.kt:483)");
        }
        C18017h a10 = C18030v.f147664a.a(mVar2, C18030v.f147665b);
        int i11 = a.f151046a[k8Var.ordinal()];
        if (i11 == 1) {
            j8Var = new C18374j8(a10.g0(), a10.N(), a10.K(), a10.H0(), a10.K(), a10.k0(), a10.h0(), a10.m0(), a10.P(), a10.P(), (DefaultConstructorMarker) null);
        } else if (i11 == 2) {
            j8Var = new C18374j8(a10.g0(), a10.R(), a10.K(), a10.H0(), a10.K(), a10.k0(), a10.h0(), a10.m0(), a10.T(), a10.T(), (DefaultConstructorMarker) null);
        } else {
            throw new t();
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return j8Var;
    }
}
