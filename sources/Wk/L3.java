package wK;

import U0.C4889m;
import U0.C4895p;
import XH.t;
import androidx.compose.foundation.layout.D;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.C5747v0;
import s0.C5834E;
import sK.C17950a;
import tK.C18029u;
import tK.C18030v;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0013\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u0018"}, d2 = {"LwK/L3;", "", "<init>", "()V", "LwK/N3;", "variant", "LwK/M3;", "style", "", "hasActions", "LwK/L3$a;", "e", "(LwK/N3;LwK/M3;ZLU0/m;I)LwK/L3$a;", "Lc2/h;", "b", "F", "()F", "IconSize", "c", "ShadowRadius", "d", "a", "DefaultHeight", "subtleDismissButtonVerticalOffset", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class L3 {

    /* renamed from: a  reason: collision with root package name */
    public static final L3 f149763a = new L3();

    /* renamed from: b  reason: collision with root package name */
    private static final float f149764b = h.B((float) 24);

    /* renamed from: c  reason: collision with root package name */
    private static final float f149765c = h.B((float) 16);

    /* renamed from: d  reason: collision with root package name */
    private static final float f149766d = h.B((float) 74);

    /* renamed from: e  reason: collision with root package name */
    private static final float f149767e = h.B((float) -8);

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"LwK/L3$a;", "", "Lp1/v0;", "color", "", "icon", "Ls0/E;", "paddingValues", "<init>", "(JILs0/E;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "I", "c", "Ls0/E;", "()Ls0/E;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final long f149768a;

        /* renamed from: b  reason: collision with root package name */
        private final int f149769b;

        /* renamed from: c  reason: collision with root package name */
        private final C5834E f149770c;

        public /* synthetic */ a(long j10, int i10, C5834E e10, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10, i10, e10);
        }

        public final long a() {
            return this.f149768a;
        }

        public final int b() {
            return this.f149769b;
        }

        public final C5834E c() {
            return this.f149770c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C5747v0.q(this.f149768a, aVar.f149768a) && this.f149769b == aVar.f149769b && C17542s.e(this.f149770c, aVar.f149770c);
        }

        public int hashCode() {
            return (((C5747v0.w(this.f149768a) * 31) + Integer.hashCode(this.f149769b)) * 31) + this.f149770c.hashCode();
        }

        public String toString() {
            String x10 = C5747v0.x(this.f149768a);
            int i10 = this.f149769b;
            C5834E e10 = this.f149770c;
            return "InlineMessageProps(color=" + x10 + ", icon=" + i10 + ", paddingValues=" + e10 + ")";
        }

        private a(long j10, int i10, C5834E e10) {
            C17542s.j(e10, "paddingValues");
            this.f149768a = j10;
            this.f149769b = i10;
            this.f149770c = e10;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f149771a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                wK.N3[] r0 = wK.N3.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                wK.N3 r1 = wK.N3.Informative     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                wK.N3 r1 = wK.N3.Positive     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                wK.N3 r1 = wK.N3.Cautionary     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                wK.N3 r1 = wK.N3.Negative     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f149771a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wK.L3.b.<clinit>():void");
        }
    }

    private L3() {
    }

    public final float a() {
        return f149766d;
    }

    public final float b() {
        return f149764b;
    }

    public final float c() {
        return f149765c;
    }

    public final float d() {
        return f149767e;
    }

    public final a e(N3 n32, M3 m32, boolean z10, C4889m mVar, int i10) {
        C5834E d10;
        long j10;
        int i11;
        C17542s.j(n32, "variant");
        C17542s.j(m32, "style");
        mVar.W(1182399471);
        if (C4895p.J()) {
            C4895p.S(1182399471, i10, -1, "net.ikea.skapa.ui.components.InlineMessageProps.props (InlineMessage.kt:357)");
        }
        if (m32 == M3.Subtle) {
            float f10 = (float) 0;
            float B10 = h.B(f10);
            C18029u uVar = C18029u.f147649a;
            d10 = D.d(B10, h.B(f10), uVar.d(), z10 ? uVar.l() : h.B(f10));
        } else {
            C18029u uVar2 = C18029u.f147649a;
            d10 = D.d(uVar2.a(), uVar2.a(), uVar2.e(), z10 ? uVar2.l() : uVar2.a());
        }
        C5834E e10 = d10;
        int[] iArr = b.f149771a;
        int i12 = iArr[n32.ordinal()];
        if (i12 == 1) {
            mVar.W(-1598978840);
            j10 = C18030v.f147664a.a(mVar, C18030v.f147665b).u0();
            mVar.P();
        } else if (i12 == 2) {
            mVar.W(-1598976059);
            j10 = C18030v.f147664a.a(mVar, C18030v.f147665b).w0();
            mVar.P();
        } else if (i12 == 3) {
            mVar.W(-1598973308);
            j10 = C18030v.f147664a.a(mVar, C18030v.f147665b).s0();
            mVar.P();
        } else if (i12 == 4) {
            mVar.W(-1598970651);
            j10 = C18030v.f147664a.a(mVar, C18030v.f147665b).v0();
            mVar.P();
        } else {
            mVar.W(-1598981270);
            mVar.P();
            throw new t();
        }
        int i13 = iArr[n32.ordinal()];
        if (i13 == 1) {
            i11 = C17950a.f147166o;
        } else if (i13 == 2) {
            i11 = C17950a.f147168q;
        } else if (i13 == 3) {
            i11 = C17950a.f147165n;
        } else if (i13 == 4) {
            i11 = C17950a.f147167p;
        } else {
            throw new t();
        }
        a aVar = new a(j10, i11, e10, (DefaultConstructorMarker) null);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return aVar;
    }
}
