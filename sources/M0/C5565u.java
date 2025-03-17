package m0;

import YH.C16870n;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0002\u000e\u0010B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u000fR \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00060\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002XD¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015¨\u0006\u0018"}, d2 = {"Lm0/u;", "", "", "arcModes", "", "timePoints", "", "y", "<init>", "([I[F[[F)V", "", "time", "v", "LXH/N;", "a", "(F[F)V", "b", "Lm0/u$a;", "[[Lm0/u$a;", "arcs", "", "Z", "isExtrapolate", "c", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: m0.u  reason: case insensitive filesystem */
public final class C5565u {

    /* renamed from: c  reason: collision with root package name */
    public static final b f25909c = new b((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f25910d = 8;

    /* renamed from: a  reason: collision with root package name */
    private final a[][] f25911a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f25912b = true;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u0000 82\u00020\u0001:\u0001\u001fBA\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u0017J\r\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u0017J\u0015\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u000fJ\u0015\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u000fJ\r\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u0017J\r\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010 R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010 R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010 R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010 R\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010 R\u0016\u0010%\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010 R\u0016\u0010&\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010 R\u0014\u0010)\u001a\u00020'8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010(R\u0014\u0010*\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010 R\u0014\u0010+\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010,\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010 R\u0014\u0010.\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010 R\u0014\u0010/\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010 R\u0014\u00100\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u0014\u00104\u001a\u0002018\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0017\u00107\u001a\u0002018\u0006¢\u0006\f\n\u0004\b5\u00103\u001a\u0004\b-\u00106¨\u00069"}, d2 = {"Lm0/u$a;", "", "", "mode", "", "time1", "time2", "x1", "y1", "x2", "y2", "<init>", "(IFFFFFF)V", "v", "o", "(F)F", "LXH/N;", "c", "(FFFF)V", "time", "p", "(F)V", "f", "()F", "g", "d", "e", "j", "k", "h", "i", "a", "F", "l", "b", "m", "arcDistance", "tmpSinAngle", "tmpCosAngle", "", "[F", "lut", "oneOverDeltaTime", "ellipseA", "ellipseB", "n", "ellipseCenterX", "ellipseCenterY", "arcVelocity", "", "q", "Z", "isVertical", "r", "()Z", "isLinear", "s", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: m0.u$a */
    public static final class a {

        /* renamed from: s  reason: collision with root package name */
        public static final C0413a f25913s = new C0413a((DefaultConstructorMarker) null);

        /* renamed from: t  reason: collision with root package name */
        public static final int f25914t = 8;
        /* access modifiers changed from: private */

        /* renamed from: u  reason: collision with root package name */
        public static float[] f25915u;

        /* renamed from: a  reason: collision with root package name */
        private final float f25916a;

        /* renamed from: b  reason: collision with root package name */
        private final float f25917b;

        /* renamed from: c  reason: collision with root package name */
        private final float f25918c;

        /* renamed from: d  reason: collision with root package name */
        private final float f25919d;

        /* renamed from: e  reason: collision with root package name */
        private final float f25920e;

        /* renamed from: f  reason: collision with root package name */
        private final float f25921f;

        /* renamed from: g  reason: collision with root package name */
        private float f25922g;

        /* renamed from: h  reason: collision with root package name */
        private float f25923h;

        /* renamed from: i  reason: collision with root package name */
        private float f25924i;

        /* renamed from: j  reason: collision with root package name */
        private final float[] f25925j;

        /* renamed from: k  reason: collision with root package name */
        private final float f25926k;

        /* renamed from: l  reason: collision with root package name */
        private final float f25927l;

        /* renamed from: m  reason: collision with root package name */
        private final float f25928m;

        /* renamed from: n  reason: collision with root package name */
        private final float f25929n;

        /* renamed from: o  reason: collision with root package name */
        private final float f25930o;

        /* renamed from: p  reason: collision with root package name */
        private final float f25931p;

        /* renamed from: q  reason: collision with root package name */
        private final boolean f25932q;

        /* renamed from: r  reason: collision with root package name */
        private final boolean f25933r;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lm0/u$a$a;", "", "<init>", "()V", "", "b", "()[F", "ourPercent", "", "Epsilon", "F", "_ourPercent", "[F", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: m0.u$a$a  reason: collision with other inner class name */
        public static final class C0413a {
            public /* synthetic */ C0413a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* access modifiers changed from: private */
            public final float[] b() {
                if (a.f25915u != null) {
                    float[] a10 = a.f25915u;
                    C17542s.g(a10);
                    return a10;
                }
                a.f25915u = new float[91];
                float[] a11 = a.f25915u;
                C17542s.g(a11);
                return a11;
            }

            private C0413a() {
            }
        }

        public a(int i10, float f10, float f11, float f12, float f13, float f14, float f15) {
            this.f25916a = f10;
            this.f25917b = f11;
            this.f25918c = f12;
            this.f25919d = f13;
            this.f25920e = f14;
            this.f25921f = f15;
            float f16 = f14 - f12;
            float f17 = f15 - f13;
            boolean z10 = false;
            boolean z11 = true;
            boolean z12 = i10 == 1 || (i10 == 4 ? f17 > 0.0f : !(i10 != 5 || f17 >= 0.0f));
            this.f25932q = z12;
            float f18 = ((float) 1) / (f11 - f10);
            this.f25926k = f18;
            z10 = 3 == i10 ? true : z10;
            if (z10 || Math.abs(f16) < 0.001f || Math.abs(f17) < 0.001f) {
                float hypot = (float) Math.hypot((double) f17, (double) f16);
                this.f25922g = hypot;
                this.f25931p = hypot * f18;
                this.f25929n = f16 / (f11 - f10);
                this.f25930o = f17 / (f11 - f10);
                this.f25925j = new float[CheckoutActivity.RESULT_CANCELED];
                this.f25927l = Float.NaN;
                this.f25928m = Float.NaN;
            } else {
                this.f25925j = new float[CheckoutActivity.RESULT_CANCELED];
                this.f25927l = f16 * ((float) (z12 ? -1 : 1));
                this.f25928m = f17 * (!z12 ? true : z11 ? 1.0f : 0.0f);
                this.f25929n = z12 ? f14 : f12;
                this.f25930o = z12 ? f13 : f15;
                c(f12, f13, f14, f15);
                this.f25931p = this.f25922g * f18;
                z11 = z10;
            }
            this.f25933r = z11;
        }

        private final void c(float f10, float f11, float f12, float f13) {
            float f14 = f12 - f10;
            float f15 = f11 - f13;
            int length = f25913s.b().length;
            float f16 = 0.0f;
            float f17 = 0.0f;
            float f18 = 0.0f;
            int i10 = 0;
            while (i10 < length) {
                C0413a aVar = f25913s;
                double radians = (double) ((float) Math.toRadians((((double) i10) * 90.0d) / ((double) (aVar.b().length - 1))));
                float sin = ((float) Math.sin(radians)) * f14;
                float cos = ((float) Math.cos(radians)) * f15;
                if (i10 > 0) {
                    f16 += (float) Math.hypot((double) (sin - f17), (double) (cos - f18));
                    aVar.b()[i10] = f16;
                }
                i10++;
                f18 = cos;
                f17 = sin;
            }
            this.f25922g = f16;
            int length2 = f25913s.b().length;
            for (int i11 = 0; i11 < length2; i11++) {
                float[] a10 = f25913s.b();
                a10[i11] = a10[i11] / f16;
            }
            int length3 = this.f25925j.length;
            for (int i12 = 0; i12 < length3; i12++) {
                float length4 = ((float) i12) / ((float) (this.f25925j.length - 1));
                C0413a aVar2 = f25913s;
                int h10 = C16870n.h(aVar2.b(), length4, 0, 0, 6, (Object) null);
                if (h10 >= 0) {
                    this.f25925j[i12] = ((float) h10) / ((float) (aVar2.b().length - 1));
                } else if (h10 == -1) {
                    this.f25925j[i12] = 0.0f;
                } else {
                    int i13 = -h10;
                    int i14 = i13 - 2;
                    this.f25925j[i12] = (((float) i14) + ((length4 - aVar2.b()[i14]) / (aVar2.b()[i13 - 1] - aVar2.b()[i14]))) / ((float) (aVar2.b().length - 1));
                }
            }
        }

        private final float o(float f10) {
            if (f10 <= 0.0f) {
                return 0.0f;
            }
            if (f10 >= 1.0f) {
                return 1.0f;
            }
            float[] fArr = this.f25925j;
            float length = f10 * ((float) (fArr.length - 1));
            int i10 = (int) length;
            float f11 = length - ((float) i10);
            float f12 = fArr[i10];
            return f12 + (f11 * (fArr[i10 + 1] - f12));
        }

        public final float d() {
            float f10 = this.f25927l * this.f25924i;
            float hypot = this.f25931p / ((float) Math.hypot((double) f10, (double) ((-this.f25928m) * this.f25923h)));
            if (this.f25932q) {
                f10 = -f10;
            }
            return f10 * hypot;
        }

        public final float e() {
            float f10 = this.f25927l * this.f25924i;
            float f11 = (-this.f25928m) * this.f25923h;
            float hypot = this.f25931p / ((float) Math.hypot((double) f10, (double) f11));
            return this.f25932q ? (-f11) * hypot : f11 * hypot;
        }

        public final float f() {
            return this.f25929n + (this.f25927l * this.f25923h);
        }

        public final float g() {
            return this.f25930o + (this.f25928m * this.f25924i);
        }

        public final float h() {
            return this.f25929n;
        }

        public final float i() {
            return this.f25930o;
        }

        public final float j(float f10) {
            float f11 = (f10 - this.f25916a) * this.f25926k;
            float f12 = this.f25918c;
            return f12 + (f11 * (this.f25920e - f12));
        }

        public final float k(float f10) {
            float f11 = (f10 - this.f25916a) * this.f25926k;
            float f12 = this.f25919d;
            return f12 + (f11 * (this.f25921f - f12));
        }

        public final float l() {
            return this.f25916a;
        }

        public final float m() {
            return this.f25917b;
        }

        public final boolean n() {
            return this.f25933r;
        }

        public final void p(float f10) {
            double o10 = (double) (o((this.f25932q ? this.f25917b - f10 : f10 - this.f25916a) * this.f25926k) * 1.5707964f);
            this.f25923h = (float) Math.sin(o10);
            this.f25924i = (float) Math.cos(o10);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, d2 = {"Lm0/u$b;", "", "<init>", "()V", "", "ArcAbove", "I", "ArcBelow", "ArcStartFlip", "ArcStartHorizontal", "ArcStartLinear", "ArcStartVertical", "DownArc", "StartHorizontal", "StartLinear", "StartVertical", "UpArc", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: m0.u$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r9 != 5) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (r7 == 1) goto L_0x002e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e A[LOOP:1: B:17:0x003c->B:18:0x003e, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5565u(int[] r24, float[] r25, float[][] r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            r23.<init>()
            r2 = 1
            r0.f25912b = r2
            int r3 = r1.length
            int r3 = r3 - r2
            m0.u$a[][] r4 = new m0.C5565u.a[r3][]
            r5 = 0
            r7 = r2
            r8 = r7
            r6 = r5
        L_0x0012:
            if (r6 >= r3) goto L_0x006e
            r9 = r24[r6]
            r10 = 3
            r11 = 2
            if (r9 == 0) goto L_0x0027
            if (r9 == r2) goto L_0x0030
            if (r9 == r11) goto L_0x002e
            if (r9 == r10) goto L_0x0029
            r10 = 4
            if (r9 == r10) goto L_0x0027
            r10 = 5
            if (r9 == r10) goto L_0x0027
            goto L_0x0032
        L_0x0027:
            r8 = r10
            goto L_0x0032
        L_0x0029:
            if (r7 != r2) goto L_0x0030
            goto L_0x002e
        L_0x002c:
            r8 = r7
            goto L_0x0032
        L_0x002e:
            r7 = r11
            goto L_0x002c
        L_0x0030:
            r7 = r2
            goto L_0x002c
        L_0x0032:
            r9 = r26[r6]
            int r10 = r9.length
            int r10 = r10 / r11
            int r9 = r9.length
            int r9 = r9 % r11
            int r10 = r10 + r9
            m0.u$a[] r9 = new m0.C5565u.a[r10]
            r11 = r5
        L_0x003c:
            if (r11 >= r10) goto L_0x0069
            int r12 = r11 * 2
            m0.u$a r20 = new m0.u$a
            r14 = r1[r6]
            int r13 = r6 + 1
            r15 = r1[r13]
            r16 = r26[r6]
            r17 = r16[r12]
            int r18 = r12 + 1
            r19 = r16[r18]
            r13 = r26[r13]
            r21 = r13[r12]
            r22 = r13[r18]
            r12 = r20
            r13 = r8
            r16 = r17
            r17 = r19
            r18 = r21
            r19 = r22
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r9[r11] = r20
            int r11 = r11 + 1
            goto L_0x003c
        L_0x0069:
            r4[r6] = r9
            int r6 = r6 + 1
            goto L_0x0012
        L_0x006e:
            r0.f25911a = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.C5565u.<init>(int[], float[], float[][]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0022, code lost:
        if (r9 > r0[r0.length - 1][0].m()) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(float r9, float[] r10) {
        /*
            r8 = this;
            boolean r0 = r8.f25912b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x00d4
            m0.u$a[][] r0 = r8.f25911a
            r0 = r0[r2]
            r0 = r0[r2]
            float r0 = r0.l()
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0024
            m0.u$a[][] r0 = r8.f25911a
            int r3 = r0.length
            int r3 = r3 - r1
            r0 = r0[r3]
            r0 = r0[r2]
            float r0 = r0.m()
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0108
        L_0x0024:
            m0.u$a[][] r0 = r8.f25911a
            int r3 = r0.length
            int r3 = r3 - r1
            r0 = r0[r3]
            r0 = r0[r2]
            float r0 = r0.m()
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0043
            m0.u$a[][] r0 = r8.f25911a
            int r3 = r0.length
            int r3 = r3 - r1
            int r4 = r0.length
            int r4 = r4 - r1
            r0 = r0[r4]
            r0 = r0[r2]
            float r0 = r0.m()
            goto L_0x004e
        L_0x0043:
            m0.u$a[][] r0 = r8.f25911a
            r0 = r0[r2]
            r0 = r0[r2]
            float r0 = r0.l()
            r3 = r2
        L_0x004e:
            float r9 = r9 - r0
            r1 = r2
        L_0x0050:
            int r4 = r10.length
            if (r2 >= r4) goto L_0x00d3
            m0.u$a[][] r4 = r8.f25911a
            r4 = r4[r3]
            r4 = r4[r1]
            boolean r4 = r4.n()
            if (r4 == 0) goto L_0x0092
            m0.u$a[][] r4 = r8.f25911a
            r4 = r4[r3]
            r4 = r4[r1]
            float r4 = r4.j(r0)
            m0.u$a[][] r5 = r8.f25911a
            r5 = r5[r3]
            r5 = r5[r1]
            float r5 = r5.h()
            float r5 = r5 * r9
            float r4 = r4 + r5
            r10[r2] = r4
            int r4 = r2 + 1
            m0.u$a[][] r5 = r8.f25911a
            r5 = r5[r3]
            r5 = r5[r1]
            float r5 = r5.k(r0)
            m0.u$a[][] r6 = r8.f25911a
            r6 = r6[r3]
            r6 = r6[r1]
            float r6 = r6.i()
            float r6 = r6 * r9
            float r5 = r5 + r6
            r10[r4] = r5
            goto L_0x00cd
        L_0x0092:
            m0.u$a[][] r4 = r8.f25911a
            r4 = r4[r3]
            r4 = r4[r1]
            r4.p(r0)
            m0.u$a[][] r4 = r8.f25911a
            r4 = r4[r3]
            r4 = r4[r1]
            float r4 = r4.f()
            m0.u$a[][] r5 = r8.f25911a
            r5 = r5[r3]
            r5 = r5[r1]
            float r5 = r5.d()
            float r5 = r5 * r9
            float r4 = r4 + r5
            r10[r2] = r4
            int r4 = r2 + 1
            m0.u$a[][] r5 = r8.f25911a
            r5 = r5[r3]
            r5 = r5[r1]
            float r5 = r5.g()
            m0.u$a[][] r6 = r8.f25911a
            r6 = r6[r3]
            r6 = r6[r1]
            float r6 = r6.e()
            float r6 = r6 * r9
            float r5 = r5 + r6
            r10[r4] = r5
        L_0x00cd:
            int r2 = r2 + 2
            int r1 = r1 + 1
            goto L_0x0050
        L_0x00d3:
            return
        L_0x00d4:
            m0.u$a[][] r0 = r8.f25911a
            r0 = r0[r2]
            r0 = r0[r2]
            float r0 = r0.l()
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ec
            m0.u$a[][] r9 = r8.f25911a
            r9 = r9[r2]
            r9 = r9[r2]
            float r9 = r9.l()
        L_0x00ec:
            m0.u$a[][] r0 = r8.f25911a
            int r3 = r0.length
            int r3 = r3 - r1
            r0 = r0[r3]
            r0 = r0[r2]
            float r0 = r0.m()
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0108
            m0.u$a[][] r9 = r8.f25911a
            int r0 = r9.length
            int r0 = r0 - r1
            r9 = r9[r0]
            r9 = r9[r2]
            float r9 = r9.m()
        L_0x0108:
            m0.u$a[][] r0 = r8.f25911a
            int r0 = r0.length
            r3 = r2
            r4 = r3
        L_0x010d:
            if (r3 >= r0) goto L_0x0179
            r5 = r2
            r6 = r5
        L_0x0111:
            int r7 = r10.length
            if (r5 >= r7) goto L_0x0173
            m0.u$a[][] r7 = r8.f25911a
            r7 = r7[r3]
            r7 = r7[r6]
            float r7 = r7.m()
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r7 > 0) goto L_0x016e
            m0.u$a[][] r4 = r8.f25911a
            r4 = r4[r3]
            r4 = r4[r6]
            boolean r4 = r4.n()
            if (r4 == 0) goto L_0x014a
            m0.u$a[][] r4 = r8.f25911a
            r4 = r4[r3]
            r4 = r4[r6]
            float r4 = r4.j(r9)
            r10[r5] = r4
            int r4 = r5 + 1
            m0.u$a[][] r7 = r8.f25911a
            r7 = r7[r3]
            r7 = r7[r6]
            float r7 = r7.k(r9)
            r10[r4] = r7
        L_0x0148:
            r4 = r1
            goto L_0x016e
        L_0x014a:
            m0.u$a[][] r4 = r8.f25911a
            r4 = r4[r3]
            r4 = r4[r6]
            r4.p(r9)
            m0.u$a[][] r4 = r8.f25911a
            r4 = r4[r3]
            r4 = r4[r6]
            float r4 = r4.f()
            r10[r5] = r4
            int r4 = r5 + 1
            m0.u$a[][] r7 = r8.f25911a
            r7 = r7[r3]
            r7 = r7[r6]
            float r7 = r7.g()
            r10[r4] = r7
            goto L_0x0148
        L_0x016e:
            int r5 = r5 + 2
            int r6 = r6 + 1
            goto L_0x0111
        L_0x0173:
            if (r4 == 0) goto L_0x0176
            return
        L_0x0176:
            int r3 = r3 + 1
            goto L_0x010d
        L_0x0179:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.C5565u.a(float, float[]):void");
    }

    public final void b(float f10, float[] fArr) {
        if (f10 < this.f25911a[0][0].l()) {
            f10 = this.f25911a[0][0].l();
        } else {
            a[][] aVarArr = this.f25911a;
            if (f10 > aVarArr[aVarArr.length - 1][0].m()) {
                a[][] aVarArr2 = this.f25911a;
                f10 = aVarArr2[aVarArr2.length - 1][0].m();
            }
        }
        int length = this.f25911a.length;
        int i10 = 0;
        boolean z10 = false;
        while (i10 < length) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < fArr.length) {
                if (f10 <= this.f25911a[i10][i12].m()) {
                    if (this.f25911a[i10][i12].n()) {
                        fArr[i11] = this.f25911a[i10][i12].h();
                        fArr[i11 + 1] = this.f25911a[i10][i12].i();
                    } else {
                        this.f25911a[i10][i12].p(f10);
                        fArr[i11] = this.f25911a[i10][i12].d();
                        fArr[i11 + 1] = this.f25911a[i10][i12].e();
                    }
                    z10 = true;
                }
                i11 += 2;
                i12++;
            }
            if (!z10) {
                i10++;
            } else {
                return;
            }
        }
    }
}
