package wK;

import U0.C4889m;
import U0.C4895p;
import XH.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.C5834E;
import yK.C18744a;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"LwK/r3;", "", "<init>", "()V", "LwK/s3;", "size", "LwK/t3;", "b", "(LwK/s3;LU0/m;I)LwK/t3;", "Lc2/h;", "F", "a", "()F", "IconSize", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.r3  reason: case insensitive filesystem */
final class C18465r3 {

    /* renamed from: a  reason: collision with root package name */
    public static final C18465r3 f151490a = new C18465r3();

    /* renamed from: b  reason: collision with root package name */
    private static final float f151491b = C18744a.f();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.r3$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f151492a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                wK.s3[] r0 = wK.C18477s3.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                wK.s3 r1 = wK.C18477s3.Medium     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                wK.s3 r1 = wK.C18477s3.Small     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f151492a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wK.C18465r3.a.<clinit>():void");
        }
    }

    private C18465r3() {
    }

    public final float a() {
        return f151491b;
    }

    public final C18489t3 b(C18477s3 s3Var, C4889m mVar, int i10) {
        float a10;
        C17542s.j(s3Var, "size");
        mVar.W(946885214);
        if (C4895p.J()) {
            C4895p.S(946885214, i10, -1, "net.ikea.skapa.ui.components.IconPillProps.style (IconPill.kt:138)");
        }
        int i11 = a.f151492a[s3Var.ordinal()];
        if (i11 == 1) {
            a10 = C18744a.a();
        } else if (i11 == 2) {
            a10 = C18744a.b();
        } else {
            throw new t();
        }
        float f10 = a10;
        C18489t3 t3Var = new C18489t3(C18468r6.f151506a.a(mVar, 6), new R1(f10, f10, (C5834E) null, 0, 0, 28, (DefaultConstructorMarker) null));
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return t3Var;
    }
}
