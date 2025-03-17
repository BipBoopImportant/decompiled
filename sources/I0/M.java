package I0;

import U0.C4889m;
import U0.C4895p;
import U0.C4910x;
import U0.I0;
import U0.o1;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import p1.C5747v0;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\"\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\r\u0010\u000b\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"Lp1/v0;", "backgroundColor", "Lc2/h;", "elevation", "b", "(JFLU0/m;I)J", "LU0/I0;", "LI0/L;", "a", "LU0/I0;", "d", "()LU0/I0;", "LocalElevationOverlay", "c", "LocalAbsoluteElevation", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class M {

    /* renamed from: a  reason: collision with root package name */
    private static final I0<L> f7385a = C4910x.f(b.f7388c);

    /* renamed from: b  reason: collision with root package name */
    private static final I0<h> f7386b = C4910x.d((o1) null, a.f7387c, 1, (Object) null);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lc2/h;", "b", "()F"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17631a<h> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f7387c = new a();

        a() {
            super(0);
        }

        public final float b() {
            return h.B((float) 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return h.m(b());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LI0/L;", "b", "()LI0/L;"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17631a<L> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f7388c = new b();

        b() {
            super(0);
        }

        /* renamed from: b */
        public final L invoke() {
            return C4587v.f8383a;
        }
    }

    /* access modifiers changed from: private */
    public static final long b(long j10, float f10, C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(1613340891, i10, -1, "androidx.compose.material.calculateForegroundColor (ElevationOverlay.kt:86)");
        }
        long o10 = C5747v0.o(C4570m.b(j10, mVar, i10 & 14), ((((float) Math.log((double) (f10 + ((float) 1)))) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        if (C4895p.J()) {
            C4895p.R();
        }
        return o10;
    }

    public static final I0<h> c() {
        return f7386b;
    }

    public static final I0<L> d() {
        return f7385a;
    }
}
