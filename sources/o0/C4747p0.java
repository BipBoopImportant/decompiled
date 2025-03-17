package O0;

import E1.H;
import E1.J;
import E1.K;
import E1.a0;
import L1.v;
import L1.x;
import S0.t;
import U0.A1;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.foundation.layout.D;
import c2.C5267b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C5531a0;
import m0.C5568x;
import nI.C17631a;
import nI.C17642l;
import o1.C5668h;
import o1.C5673m;
import o1.C5674n;
import p1.C5749w0;
import p1.V0;
import p1.k1;
import tI.C17970f;
import tI.C17978n;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\f\u001ah\u0010\u0010\u001a\u00020\u000e2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aD\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a>\u0010\u0017\u001a\u00020\u000e*\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001aD\u0010\u0019\u001a\u00020\u000e2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a6\u0010\u001f\u001a\u00020\u000e*\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001dH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a&\u0010!\u001a\u00020\u000e*\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001dH\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a>\u0010#\u001a\u00020\u000e*\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001dH\u0002ø\u0001\u0000¢\u0006\u0004\b#\u0010$\"\u0014\u0010&\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010%\"\u0014\u0010(\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010'\"\u001a\u0010+\u001a\u00020\n8\u0000X\u0004¢\u0006\f\n\u0004\b\u0012\u0010%\u001a\u0004\b)\u0010*\"\u001a\u0010.\u001a\u00020\n8\u0000X\u0004¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b-\u0010*\"\u001a\u00101\u001a\u00020\n8\u0000X\u0004¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\b0\u0010*\"\u0014\u00105\u001a\u0002028\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104\"\u0014\u00107\u001a\u0002028\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00104\"\u0014\u00109\u001a\u0002028\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00104\"\u0014\u0010;\u001a\u0002028\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u00104\"\u0014\u0010=\u001a\u0002028\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u00104\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006>"}, d2 = {"Lkotlin/Function0;", "", "progress", "Landroidx/compose/ui/d;", "modifier", "Lp1/v0;", "color", "trackColor", "Lp1/k1;", "strokeCap", "Lc2/h;", "gapSize", "Lkotlin/Function1;", "Lr1/f;", "LXH/N;", "drawStopIndicator", "b", "(LnI/a;Landroidx/compose/ui/d;JJIFLnI/l;LU0/m;II)V", "c", "(Landroidx/compose/ui/d;JJIFLU0/m;II)V", "startFraction", "endFraction", "strokeWidth", "p", "(Lr1/f;FFJFI)V", "a", "(Landroidx/compose/ui/d;JFJILU0/m;II)V", "startAngle", "sweep", "Lr1/k;", "stroke", "m", "(Lr1/f;FFJLr1/k;)V", "n", "(Lr1/f;JLr1/k;)V", "o", "(Lr1/f;FFFJLr1/k;)V", "F", "SemanticsBoundsPadding", "Landroidx/compose/ui/d;", "IncreaseSemanticsBounds", "getLinearIndicatorWidth", "()F", "LinearIndicatorWidth", "d", "getLinearIndicatorHeight", "LinearIndicatorHeight", "e", "getCircularIndicatorDiameter", "CircularIndicatorDiameter", "Lm0/x;", "f", "Lm0/x;", "FirstLineHeadEasing", "g", "FirstLineTailEasing", "h", "SecondLineHeadEasing", "i", "SecondLineTailEasing", "j", "CircularEasing", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: O0.p0  reason: case insensitive filesystem */
public final class C4747p0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final float f11372a;

    /* renamed from: b  reason: collision with root package name */
    private static final androidx.compose.ui.d f11373b;

    /* renamed from: c  reason: collision with root package name */
    private static final float f11374c = c2.h.B((float) 240);

    /* renamed from: d  reason: collision with root package name */
    private static final float f11375d;

    /* renamed from: e  reason: collision with root package name */
    private static final float f11376e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final C5568x f11377f = new C5568x(0.2f, 0.0f, 0.8f, 1.0f);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final C5568x f11378g = new C5568x(0.4f, 0.0f, 1.0f, 1.0f);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final C5568x f11379h = new C5568x(0.0f, 0.0f, 0.65f, 1.0f);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final C5568x f11380i = new C5568x(0.1f, 0.0f, 0.45f, 1.0f);
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final C5568x f11381j = new C5568x(0.4f, 0.0f, 0.2f, 1.0f);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/f;", "LXH/N;", "a", "(Lr1/f;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.p0$a */
    static final class a extends C17544u implements C17642l<r1.f, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f11382c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ r1.k f11383d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ A1<Integer> f11384e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ A1<Float> f11385f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ A1<Float> f11386g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ A1<Float> f11387h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ float f11388i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ long f11389j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(long j10, r1.k kVar, A1<Integer> a12, A1<Float> a13, A1<Float> a14, A1<Float> a15, float f10, long j11) {
            super(1);
            this.f11382c = j10;
            this.f11383d = kVar;
            this.f11384e = a12;
            this.f11385f = a13;
            this.f11386g = a14;
            this.f11387h = a15;
            this.f11388i = f10;
            this.f11389j = j11;
        }

        public final void a(r1.f fVar) {
            C4747p0.n(fVar, this.f11382c, this.f11383d);
            r1.f fVar2 = fVar;
            C4747p0.o(fVar2, this.f11386g.getValue().floatValue() + (((this.f11384e.getValue().floatValue() * 216.0f) % 360.0f) - 0.049804688f) + this.f11387h.getValue().floatValue(), this.f11388i, Math.abs(this.f11385f.getValue().floatValue() - this.f11386g.getValue().floatValue()), this.f11389j, this.f11383d);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((r1.f) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O0.p0$b */
    static final class b extends C17544u implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f11390c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f11391d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f11392e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f11393f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f11394g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f11395h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f11396i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.d dVar, long j10, float f10, long j11, int i10, int i11, int i12) {
            super(2);
            this.f11390c = dVar;
            this.f11391d = j10;
            this.f11392e = f10;
            this.f11393f = j11;
            this.f11394g = i10;
            this.f11395h = i11;
            this.f11396i = i12;
        }

        public final void a(C4889m mVar, int i10) {
            C4747p0.a(this.f11390c, this.f11391d, this.f11392e, this.f11393f, this.f11394g, mVar, M0.a(this.f11395h | 1), this.f11396i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm0/a0$b;", "", "LXH/N;", "a", "(Lm0/a0$b;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.p0$c */
    static final class c extends C17544u implements C17642l<C5531a0.b<Float>, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final c f11397c = new c();

        c() {
            super(1);
        }

        public final void a(C5531a0.b<Float> bVar) {
            bVar.e(1332);
            bVar.f(bVar.g(Float.valueOf(0.0f), 0), C4747p0.f11381j);
            bVar.g(Float.valueOf(290.0f), 666);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5531a0.b) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm0/a0$b;", "", "LXH/N;", "a", "(Lm0/a0$b;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.p0$d */
    static final class d extends C17544u implements C17642l<C5531a0.b<Float>, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final d f11398c = new d();

        d() {
            super(1);
        }

        public final void a(C5531a0.b<Float> bVar) {
            bVar.e(1332);
            bVar.f(bVar.g(Float.valueOf(0.0f), 666), C4747p0.f11381j);
            bVar.g(Float.valueOf(290.0f), bVar.b());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5531a0.b) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LE1/K;", "LE1/H;", "measurable", "Lc2/b;", "constraints", "LE1/J;", "a", "(LE1/K;LE1/H;J)LE1/J;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.p0$e */
    static final class e extends C17544u implements nI.q<K, H, C5267b, J> {

        /* renamed from: c  reason: collision with root package name */
        public static final e f11399c = new e();

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: O0.p0$e$a */
        static final class a extends C17544u implements C17642l<a0.a, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ a0 f11400c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f11401d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(a0 a0Var, int i10) {
                super(1);
                this.f11400c = a0Var;
                this.f11401d = i10;
            }

            public final void a(a0.a aVar) {
                a0.a.i(aVar, this.f11400c, 0, -this.f11401d, 0.0f, 4, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((a0.a) obj);
                return C16807N.f139792a;
            }
        }

        e() {
            super(3);
        }

        public final J a(K k10, H h10, long j10) {
            int K02 = k10.K0(C4747p0.f11372a);
            int i10 = K02 * 2;
            a0 i02 = h10.i0(c2.c.o(j10, 0, i10));
            return K.v0(k10, i02.E0(), i02.z0() - i10, (Map) null, new a(i02, K02), 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((K) obj, (H) obj2, ((C5267b) obj3).r());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LL1/x;", "LXH/N;", "a", "(LL1/x;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.p0$f */
    static final class f extends C17544u implements C17642l<x, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final f f11402c = new f();

        f() {
            super(1);
        }

        public final void a(x xVar) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((x) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O0.p0$g */
    static final class g extends C17544u implements C17642l<r1.f, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f11403c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f11404d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(long j10, int i10) {
            super(1);
            this.f11403c = j10;
            this.f11404d = i10;
        }

        public final void a(r1.f fVar) {
            C4745o0 o0Var = C4745o0.f11359a;
            o0Var.a(fVar, o0Var.j(), this.f11403c, this.f11404d);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((r1.f) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LL1/x;", "LXH/N;", "a", "(LL1/x;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.p0$h */
    static final class h extends C17544u implements C17642l<x, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<Float> f11405c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(C17631a<Float> aVar) {
            super(1);
            this.f11405c = aVar;
        }

        public final void a(x xVar) {
            v.k0(xVar, new L1.h(this.f11405c.invoke().floatValue(), C17978n.c(0.0f, 1.0f), 0, 4, (DefaultConstructorMarker) null));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((x) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/f;", "LXH/N;", "a", "(Lr1/f;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.p0$i */
    static final class i extends C17544u implements C17642l<r1.f, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f11406c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f11407d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17631a<Float> f11408e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f11409f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f11410g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17642l<r1.f, C16807N> f11411h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(int i10, float f10, C17631a<Float> aVar, long j10, long j11, C17642l<? super r1.f, C16807N> lVar) {
            super(1);
            this.f11406c = i10;
            this.f11407d = f10;
            this.f11408e = aVar;
            this.f11409f = j10;
            this.f11410g = j11;
            this.f11411h = lVar;
        }

        public final void a(r1.f fVar) {
            float i10 = C5673m.i(fVar.b());
            float B10 = ((k1.g(this.f11406c, k1.f27320b.a()) || C5673m.i(fVar.b()) > C5673m.l(fVar.b())) ? this.f11407d : c2.h.B(this.f11407d + fVar.x1(i10))) / fVar.x1(C5673m.l(fVar.b()));
            float floatValue = this.f11408e.invoke().floatValue();
            float min = floatValue + Math.min(floatValue, B10);
            if (min <= 1.0f) {
                C4747p0.p(fVar, min, 1.0f, this.f11409f, i10, this.f11406c);
            }
            C4747p0.p(fVar, 0.0f, floatValue, this.f11410g, i10, this.f11406c);
            this.f11411h.invoke(fVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((r1.f) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O0.p0$j */
    static final class j extends C17544u implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<Float> f11412c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f11413d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f11414e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f11415f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f11416g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ float f11417h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C17642l<r1.f, C16807N> f11418i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f11419j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f11420k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(C17631a<Float> aVar, androidx.compose.ui.d dVar, long j10, long j11, int i10, float f10, C17642l<? super r1.f, C16807N> lVar, int i11, int i12) {
            super(2);
            this.f11412c = aVar;
            this.f11413d = dVar;
            this.f11414e = j10;
            this.f11415f = j11;
            this.f11416g = i10;
            this.f11417h = f10;
            this.f11418i = lVar;
            this.f11419j = i11;
            this.f11420k = i12;
        }

        public final void a(C4889m mVar, int i10) {
            C4747p0.b(this.f11412c, this.f11413d, this.f11414e, this.f11415f, this.f11416g, this.f11417h, this.f11418i, mVar, M0.a(this.f11419j | 1), this.f11420k);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/f;", "LXH/N;", "a", "(Lr1/f;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.p0$k */
    static final class k extends C17544u implements C17642l<r1.f, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f11421c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f11422d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ A1<Float> f11423e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f11424f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ A1<Float> f11425g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ long f11426h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ A1<Float> f11427i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ A1<Float> f11428j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(int i10, float f10, A1<Float> a12, long j10, A1<Float> a13, long j11, A1<Float> a14, A1<Float> a15) {
            super(1);
            this.f11421c = i10;
            this.f11422d = f10;
            this.f11423e = a12;
            this.f11424f = j10;
            this.f11425g = a13;
            this.f11426h = j11;
            this.f11427i = a14;
            this.f11428j = a15;
        }

        public final void a(r1.f fVar) {
            float i10 = C5673m.i(fVar.b());
            float B10 = ((k1.g(this.f11421c, k1.f27320b.a()) || C5673m.i(fVar.b()) > C5673m.l(fVar.b())) ? this.f11422d : c2.h.B(this.f11422d + fVar.x1(i10))) / fVar.x1(C5673m.l(fVar.b()));
            if (this.f11423e.getValue().floatValue() < 1.0f - B10) {
                C4747p0.p(fVar, this.f11423e.getValue().floatValue() > 0.0f ? this.f11423e.getValue().floatValue() + B10 : 0.0f, 1.0f, this.f11424f, i10, this.f11421c);
            }
            if (this.f11423e.getValue().floatValue() - this.f11425g.getValue().floatValue() > 0.0f) {
                C4747p0.p(fVar, this.f11423e.getValue().floatValue(), this.f11425g.getValue().floatValue(), this.f11426h, i10, this.f11421c);
            }
            if (this.f11425g.getValue().floatValue() > B10) {
                C4747p0.p(fVar, this.f11427i.getValue().floatValue() > 0.0f ? this.f11427i.getValue().floatValue() + B10 : 0.0f, this.f11425g.getValue().floatValue() < 1.0f ? this.f11425g.getValue().floatValue() - B10 : 1.0f, this.f11424f, i10, this.f11421c);
            }
            if (this.f11427i.getValue().floatValue() - this.f11428j.getValue().floatValue() > 0.0f) {
                C4747p0.p(fVar, this.f11427i.getValue().floatValue(), this.f11428j.getValue().floatValue(), this.f11426h, i10, this.f11421c);
            }
            if (this.f11428j.getValue().floatValue() > B10) {
                C4747p0.p(fVar, 0.0f, this.f11428j.getValue().floatValue() < 1.0f ? this.f11428j.getValue().floatValue() - B10 : 1.0f, this.f11424f, i10, this.f11421c);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((r1.f) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O0.p0$l */
    static final class l extends C17544u implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f11429c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f11430d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f11431e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f11432f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ float f11433g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f11434h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f11435i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(androidx.compose.ui.d dVar, long j10, long j11, int i10, float f10, int i11, int i12) {
            super(2);
            this.f11429c = dVar;
            this.f11430d = j10;
            this.f11431e = j11;
            this.f11432f = i10;
            this.f11433g = f10;
            this.f11434h = i11;
            this.f11435i = i12;
        }

        public final void a(C4889m mVar, int i10) {
            C4747p0.c(this.f11429c, this.f11430d, this.f11431e, this.f11432f, this.f11433g, mVar, M0.a(this.f11434h | 1), this.f11435i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.p0$m */
    static final class m extends C17544u implements C17631a<Float> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<Float> f11436c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(C17631a<Float> aVar) {
            super(0);
            this.f11436c = aVar;
        }

        /* renamed from: b */
        public final Float invoke() {
            return Float.valueOf(C17978n.l(this.f11436c.invoke().floatValue(), 0.0f, 1.0f));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm0/a0$b;", "", "LXH/N;", "a", "(Lm0/a0$b;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.p0$n */
    static final class n extends C17544u implements C17642l<C5531a0.b<Float>, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final n f11437c = new n();

        n() {
            super(1);
        }

        public final void a(C5531a0.b<Float> bVar) {
            bVar.e(1800);
            bVar.f(bVar.g(Float.valueOf(0.0f), 0), C4747p0.f11377f);
            bVar.g(Float.valueOf(1.0f), 750);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5531a0.b) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm0/a0$b;", "", "LXH/N;", "a", "(Lm0/a0$b;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.p0$o */
    static final class o extends C17544u implements C17642l<C5531a0.b<Float>, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final o f11438c = new o();

        o() {
            super(1);
        }

        public final void a(C5531a0.b<Float> bVar) {
            bVar.e(1800);
            bVar.f(bVar.g(Float.valueOf(0.0f), 333), C4747p0.f11378g);
            bVar.g(Float.valueOf(1.0f), 1183);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5531a0.b) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm0/a0$b;", "", "LXH/N;", "a", "(Lm0/a0$b;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.p0$p */
    static final class p extends C17544u implements C17642l<C5531a0.b<Float>, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final p f11439c = new p();

        p() {
            super(1);
        }

        public final void a(C5531a0.b<Float> bVar) {
            bVar.e(1800);
            bVar.f(bVar.g(Float.valueOf(0.0f), 1000), C4747p0.f11379h);
            bVar.g(Float.valueOf(1.0f), 1567);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5531a0.b) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm0/a0$b;", "", "LXH/N;", "a", "(Lm0/a0$b;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.p0$q */
    static final class q extends C17544u implements C17642l<C5531a0.b<Float>, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final q f11440c = new q();

        q() {
            super(1);
        }

        public final void a(C5531a0.b<Float> bVar) {
            bVar.e(1800);
            bVar.f(bVar.g(Float.valueOf(0.0f), 1267), C4747p0.f11380i);
            bVar.g(Float.valueOf(1.0f), 1800);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5531a0.b) obj);
            return C16807N.f139792a;
        }
    }

    static {
        float B10 = c2.h.B((float) 10);
        f11372a = B10;
        f11373b = D.k(L1.o.c(androidx.compose.ui.layout.b.a(androidx.compose.ui.d.f18749a, e.f11399c), true, f.f11402c), 0.0f, B10, 1, (Object) null);
        t tVar = t.f13245a;
        f11375d = tVar.f();
        f11376e = c2.h.B(tVar.c() - c2.h.B(tVar.f() * ((float) 2)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v25, resolved type: O0.p0$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: O0.p0$a} */
    /* JADX WARNING: type inference failed for: r7v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02d2, code lost:
        if (r7 == U0.C4889m.f14007a.a()) goto L_0x02d4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0274  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.ui.d r36, long r37, float r39, long r40, int r42, U0.C4889m r43, int r44, int r45) {
        /*
            r8 = r44
            r0 = -115871647(0xfffffffff917f061, float:-4.930702E34)
            r1 = r43
            U0.m r1 = r1.k(r0)
            r2 = r45 & 1
            r3 = 2
            if (r2 == 0) goto L_0x0016
            r4 = r8 | 6
            r5 = r4
            r4 = r36
            goto L_0x002a
        L_0x0016:
            r4 = r8 & 6
            if (r4 != 0) goto L_0x0027
            r4 = r36
            boolean r5 = r1.V(r4)
            if (r5 == 0) goto L_0x0024
            r5 = 4
            goto L_0x0025
        L_0x0024:
            r5 = r3
        L_0x0025:
            r5 = r5 | r8
            goto L_0x002a
        L_0x0027:
            r4 = r36
            r5 = r8
        L_0x002a:
            r6 = r8 & 48
            if (r6 != 0) goto L_0x0041
            r6 = r45 & 2
            r9 = r37
            if (r6 != 0) goto L_0x003d
            boolean r6 = r1.e(r9)
            if (r6 == 0) goto L_0x003d
            r6 = 32
            goto L_0x003f
        L_0x003d:
            r6 = 16
        L_0x003f:
            r5 = r5 | r6
            goto L_0x0043
        L_0x0041:
            r9 = r37
        L_0x0043:
            r6 = r45 & 4
            if (r6 == 0) goto L_0x004c
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x0049:
            r11 = r39
            goto L_0x005e
        L_0x004c:
            r11 = r8 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x0049
            r11 = r39
            boolean r12 = r1.c(r11)
            if (r12 == 0) goto L_0x005b
            r12 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r12 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r5 = r5 | r12
        L_0x005e:
            r12 = r8 & 3072(0xc00, float:4.305E-42)
            if (r12 != 0) goto L_0x0078
            r12 = r45 & 8
            if (r12 != 0) goto L_0x0071
            r12 = r40
            boolean r16 = r1.e(r12)
            if (r16 == 0) goto L_0x0073
            r16 = 2048(0x800, float:2.87E-42)
            goto L_0x0075
        L_0x0071:
            r12 = r40
        L_0x0073:
            r16 = 1024(0x400, float:1.435E-42)
        L_0x0075:
            r5 = r5 | r16
            goto L_0x007a
        L_0x0078:
            r12 = r40
        L_0x007a:
            r16 = r45 & 16
            if (r16 == 0) goto L_0x0083
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
        L_0x0080:
            r14 = r42
            goto L_0x0096
        L_0x0083:
            r14 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r14 != 0) goto L_0x0080
            r14 = r42
            boolean r17 = r1.d(r14)
            if (r17 == 0) goto L_0x0092
            r17 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r17 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r5 = r5 | r17
        L_0x0096:
            r15 = r5 & 9363(0x2493, float:1.312E-41)
            r7 = 9362(0x2492, float:1.3119E-41)
            if (r15 != r7) goto L_0x00ab
            boolean r7 = r1.l()
            if (r7 != 0) goto L_0x00a3
            goto L_0x00ab
        L_0x00a3:
            r1.L()
            r2 = r9
            r6 = r11
            r7 = r14
            goto L_0x0302
        L_0x00ab:
            r1.G()
            r7 = r8 & 1
            if (r7 == 0) goto L_0x00cf
            boolean r7 = r1.O()
            if (r7 == 0) goto L_0x00b9
            goto L_0x00cf
        L_0x00b9:
            r1.L()
            r2 = r45 & 2
            if (r2 == 0) goto L_0x00c2
            r5 = r5 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00c2:
            r2 = r45 & 8
            if (r2 == 0) goto L_0x00c8
            r5 = r5 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00c8:
            r2 = r4
            r6 = r11
            r7 = r14
            r14 = r12
            r13 = r5
        L_0x00cd:
            r4 = r9
            goto L_0x010f
        L_0x00cf:
            if (r2 == 0) goto L_0x00d4
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            goto L_0x00d5
        L_0x00d4:
            r2 = r4
        L_0x00d5:
            r4 = r45 & 2
            r7 = 6
            if (r4 == 0) goto L_0x00e2
            O0.o0 r4 = O0.C4745o0.f11359a
            long r9 = r4.b(r1, r7)
            r5 = r5 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00e2:
            if (r6 == 0) goto L_0x00eb
            O0.o0 r4 = O0.C4745o0.f11359a
            float r4 = r4.e()
            r11 = r4
        L_0x00eb:
            r4 = r45 & 8
            if (r4 == 0) goto L_0x00f9
            O0.o0 r4 = O0.C4745o0.f11359a
            long r6 = r4.d(r1, r7)
            r4 = r5 & -7169(0xffffffffffffe3ff, float:NaN)
            r5 = r4
            goto L_0x00fa
        L_0x00f9:
            r6 = r12
        L_0x00fa:
            if (r16 == 0) goto L_0x0107
            O0.o0 r4 = O0.C4745o0.f11359a
            int r4 = r4.c()
            r13 = r5
            r14 = r6
            r6 = r11
            r7 = r4
            goto L_0x00cd
        L_0x0107:
            r13 = r5
            r4 = r9
            r34 = r6
            r6 = r11
            r7 = r14
            r14 = r34
        L_0x010f:
            r1.y()
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x011e
            r9 = -1
            java.lang.String r10 = "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:637)"
            U0.C4895p.S(r0, r13, r9, r10)
        L_0x011e:
            U0.I0 r0 = androidx.compose.ui.platform.C5100f0.e()
            java.lang.Object r0 = r1.Q(r0)
            c2.d r0 = (c2.d) r0
            r1.k r12 = new r1.k
            float r19 = r0.H1(r6)
            r24 = 26
            r25 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r18 = r12
            r21 = r7
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            r0 = 0
            r11 = 0
            r10 = 1
            m0.W r18 = m0.X.c(r0, r1, r11, r10)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r11)
            r9 = 5
            java.lang.Integer r19 = java.lang.Integer.valueOf(r9)
            kotlin.jvm.internal.r r9 = kotlin.jvm.internal.r.f144386a
            m0.z0 r20 = m0.B0.g(r9)
            r9 = 6660(0x1a04, float:9.333E-42)
            m0.D r10 = m0.M.e()
            m0.y0 r9 = m0.C5548j.j(r9, r11, r10, r3, r0)
            r10 = 6
            r21 = 0
            r22 = 0
            r23 = 0
            r37 = r9
            r38 = r22
            r39 = r23
            r41 = r10
            r42 = r21
            m0.V r21 = m0.C5548j.e(r37, r38, r39, r41, r42)
            int r10 = m0.W.f25632f
            r9 = r10 | 432(0x1b0, float:6.05E-43)
            int r22 = m0.V.f25628d
            int r23 = r22 << 12
            r23 = r9 | r23
            r24 = 16
            r9 = r18
            r29 = r10
            r26 = 1
            r10 = r16
            r11 = r19
            r30 = r12
            r12 = r20
            r31 = r13
            r13 = r21
            r32 = r14
            r15 = 2048(0x800, float:2.87E-42)
            r14 = r25
            r15 = r1
            r16 = r23
            r17 = r24
            U0.A1 r9 = m0.X.b(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r10 = 1332(0x534, float:1.867E-42)
            m0.D r11 = m0.M.e()
            r12 = 0
            m0.y0 r0 = m0.C5548j.j(r10, r12, r11, r3, r0)
            r3 = 6
            r10 = 0
            r11 = 0
            r13 = 0
            r36 = r0
            r37 = r11
            r38 = r13
            r40 = r3
            r41 = r10
            m0.V r0 = m0.C5548j.e(r36, r37, r38, r40, r41)
            r3 = r29
            r10 = r3 | 432(0x1b0, float:6.05E-43)
            int r11 = r22 << 9
            r10 = r10 | r11
            r11 = 8
            r13 = 0
            r14 = 1133445120(0x438f0000, float:286.0)
            r15 = 0
            r36 = r18
            r37 = r13
            r38 = r14
            r39 = r0
            r40 = r15
            r41 = r1
            r42 = r10
            r43 = r11
            U0.A1 r0 = m0.X.a(r36, r37, r38, r39, r40, r41, r42, r43)
            O0.p0$c r10 = O0.C4747p0.c.f11397c
            m0.a0 r10 = m0.C5548j.f(r10)
            r11 = 6
            r13 = 0
            r14 = 0
            r15 = 0
            r36 = r10
            r37 = r14
            r38 = r15
            r40 = r11
            r41 = r13
            m0.V r10 = m0.C5548j.e(r36, r37, r38, r40, r41)
            r11 = r3 | 432(0x1b0, float:6.05E-43)
            int r13 = r22 << 9
            r11 = r11 | r13
            r13 = 8
            r14 = 0
            r15 = 1133576192(0x43910000, float:290.0)
            r16 = 0
            r36 = r18
            r37 = r14
            r38 = r15
            r39 = r10
            r40 = r16
            r41 = r1
            r42 = r11
            r43 = r13
            U0.A1 r10 = m0.X.a(r36, r37, r38, r39, r40, r41, r42, r43)
            O0.p0$d r11 = O0.C4747p0.d.f11398c
            m0.a0 r11 = m0.C5548j.f(r11)
            r13 = 6
            r14 = 0
            r15 = 0
            r16 = 0
            r36 = r11
            r37 = r15
            r38 = r16
            r40 = r13
            r41 = r14
            m0.V r11 = m0.C5548j.e(r36, r37, r38, r40, r41)
            r3 = r3 | 432(0x1b0, float:6.05E-43)
            int r13 = r22 << 9
            r3 = r3 | r13
            r13 = 8
            r14 = 0
            r15 = 1133576192(0x43910000, float:290.0)
            r16 = 0
            r36 = r18
            r37 = r14
            r38 = r15
            r39 = r11
            r40 = r16
            r41 = r1
            r42 = r3
            r43 = r13
            U0.A1 r3 = m0.X.a(r36, r37, r38, r39, r40, r41, r42, r43)
            androidx.compose.ui.d r11 = n0.Z.a(r2)
            float r13 = f11376e
            androidx.compose.ui.d r11 = androidx.compose.foundation.layout.J.t(r11, r13)
            r13 = r31
            r14 = r13 & 7168(0x1c00, float:1.0045E-41)
            r14 = r14 ^ 3072(0xc00, float:4.305E-42)
            r15 = 2048(0x800, float:2.87E-42)
            r12 = r32
            if (r14 <= r15) goto L_0x0274
            boolean r14 = r1.e(r12)
            if (r14 != 0) goto L_0x026f
            goto L_0x0274
        L_0x026f:
            r36 = r2
            r14 = r31
            goto L_0x027c
        L_0x0274:
            r36 = r2
            r14 = r31
            r2 = r14 & 3072(0xc00, float:4.305E-42)
            if (r2 != r15) goto L_0x0281
        L_0x027c:
            r2 = r26
            r15 = r30
            goto L_0x0284
        L_0x0281:
            r15 = r30
            r2 = 0
        L_0x0284:
            boolean r16 = r1.F(r15)
            r2 = r2 | r16
            boolean r16 = r1.V(r9)
            r2 = r2 | r16
            boolean r16 = r1.V(r10)
            r2 = r2 | r16
            boolean r16 = r1.V(r3)
            r2 = r2 | r16
            boolean r16 = r1.V(r0)
            r2 = r2 | r16
            r37 = r7
            r7 = r14 & 896(0x380, float:1.256E-42)
            r8 = 256(0x100, float:3.59E-43)
            if (r7 != r8) goto L_0x02ad
            r7 = r26
            goto L_0x02ae
        L_0x02ad:
            r7 = 0
        L_0x02ae:
            r2 = r2 | r7
            r7 = r14 & 112(0x70, float:1.57E-43)
            r7 = r7 ^ 48
            r8 = 32
            if (r7 <= r8) goto L_0x02bd
            boolean r7 = r1.e(r4)
            if (r7 != 0) goto L_0x02c4
        L_0x02bd:
            r7 = r14 & 48
            if (r7 != r8) goto L_0x02c2
            goto L_0x02c4
        L_0x02c2:
            r26 = 0
        L_0x02c4:
            r2 = r2 | r26
            java.lang.Object r7 = r1.D()
            if (r2 != 0) goto L_0x02d4
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r7 != r2) goto L_0x02ee
        L_0x02d4:
            O0.p0$a r7 = new O0.p0$a
            r18 = r7
            r19 = r12
            r21 = r15
            r22 = r9
            r23 = r10
            r24 = r3
            r25 = r0
            r26 = r6
            r27 = r4
            r18.<init>(r19, r21, r22, r23, r24, r25, r26, r27)
            r1.u(r7)
        L_0x02ee:
            nI.l r7 = (nI.C17642l) r7
            r0 = 0
            n0.C5603i.a(r11, r7, r1, r0)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x02fd
            U0.C4895p.R()
        L_0x02fd:
            r7 = r37
            r2 = r4
            r4 = r36
        L_0x0302:
            U0.Y0 r10 = r1.n()
            if (r10 == 0) goto L_0x0318
            O0.p0$b r11 = new O0.p0$b
            r0 = r11
            r1 = r4
            r4 = r6
            r5 = r12
            r8 = r44
            r9 = r45
            r0.<init>(r1, r2, r4, r5, r7, r8, r9)
            r10.a(r11)
        L_0x0318:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.C4747p0.a(androidx.compose.ui.d, long, float, long, int, U0.m, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: nI.l<? super r1.f, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v47, resolved type: O0.p0$i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: O0.p0$i} */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x024a, code lost:
        if (r3 == U0.C4889m.f14007a.a()) goto L_0x024c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(nI.C17631a<java.lang.Float> r30, androidx.compose.ui.d r31, long r32, long r34, int r36, float r37, nI.C17642l<? super r1.f, XH.C16807N> r38, U0.C4889m r39, int r40, int r41) {
        /*
            r1 = r30
            r10 = r40
            r0 = -339970038(0xffffffffebbc780a, float:-4.5568985E26)
            r2 = r39
            U0.m r2 = r2.k(r0)
            r3 = r41 & 1
            if (r3 == 0) goto L_0x0014
            r3 = r10 | 6
            goto L_0x0024
        L_0x0014:
            r3 = r10 & 6
            if (r3 != 0) goto L_0x0023
            boolean r3 = r2.F(r1)
            if (r3 == 0) goto L_0x0020
            r3 = 4
            goto L_0x0021
        L_0x0020:
            r3 = 2
        L_0x0021:
            r3 = r3 | r10
            goto L_0x0024
        L_0x0023:
            r3 = r10
        L_0x0024:
            r5 = r41 & 2
            if (r5 == 0) goto L_0x002d
            r3 = r3 | 48
        L_0x002a:
            r6 = r31
            goto L_0x003f
        L_0x002d:
            r6 = r10 & 48
            if (r6 != 0) goto L_0x002a
            r6 = r31
            boolean r7 = r2.V(r6)
            if (r7 == 0) goto L_0x003c
            r7 = 32
            goto L_0x003e
        L_0x003c:
            r7 = 16
        L_0x003e:
            r3 = r3 | r7
        L_0x003f:
            r7 = r10 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0056
            r7 = r41 & 4
            r11 = r32
            if (r7 != 0) goto L_0x0052
            boolean r7 = r2.e(r11)
            if (r7 == 0) goto L_0x0052
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0054
        L_0x0052:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0054:
            r3 = r3 | r7
            goto L_0x0058
        L_0x0056:
            r11 = r32
        L_0x0058:
            r7 = r10 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x006f
            r7 = r41 & 8
            r13 = r34
            if (r7 != 0) goto L_0x006b
            boolean r7 = r2.e(r13)
            if (r7 == 0) goto L_0x006b
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x006d
        L_0x006b:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x006d:
            r3 = r3 | r7
            goto L_0x0071
        L_0x006f:
            r13 = r34
        L_0x0071:
            r7 = r41 & 16
            if (r7 == 0) goto L_0x007a
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0077:
            r9 = r36
            goto L_0x008d
        L_0x007a:
            r9 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x0077
            r9 = r36
            boolean r16 = r2.d(r9)
            if (r16 == 0) goto L_0x0089
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008b
        L_0x0089:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x008b:
            r3 = r3 | r16
        L_0x008d:
            r16 = r41 & 32
            r17 = 196608(0x30000, float:2.75506E-40)
            if (r16 == 0) goto L_0x0098
            r3 = r3 | r17
            r4 = r37
            goto L_0x00ab
        L_0x0098:
            r17 = r10 & r17
            r4 = r37
            if (r17 != 0) goto L_0x00ab
            boolean r18 = r2.c(r4)
            if (r18 == 0) goto L_0x00a7
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a9
        L_0x00a7:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x00a9:
            r3 = r3 | r18
        L_0x00ab:
            r18 = 1572864(0x180000, float:2.204052E-39)
            r19 = r10 & r18
            if (r19 != 0) goto L_0x00c5
            r19 = r41 & 64
            r0 = r38
            if (r19 != 0) goto L_0x00c0
            boolean r20 = r2.F(r0)
            if (r20 == 0) goto L_0x00c0
            r20 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c2
        L_0x00c0:
            r20 = 524288(0x80000, float:7.34684E-40)
        L_0x00c2:
            r3 = r3 | r20
            goto L_0x00c7
        L_0x00c5:
            r0 = r38
        L_0x00c7:
            r20 = 599187(0x92493, float:8.3964E-40)
            r15 = r3 & r20
            r8 = 599186(0x92492, float:8.39638E-40)
            if (r15 != r8) goto L_0x00e2
            boolean r8 = r2.l()
            if (r8 != 0) goto L_0x00d8
            goto L_0x00e2
        L_0x00d8:
            r2.L()
            r8 = r4
            r5 = r6
            r7 = r9
            r3 = r11
            r9 = r0
            goto L_0x0275
        L_0x00e2:
            r2.G()
            r8 = r10 & 1
            if (r8 == 0) goto L_0x010b
            boolean r8 = r2.O()
            if (r8 == 0) goto L_0x00f0
            goto L_0x010b
        L_0x00f0:
            r2.L()
            r5 = r41 & 4
            if (r5 == 0) goto L_0x00f9
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00f9:
            r5 = r41 & 8
            if (r5 == 0) goto L_0x00ff
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00ff:
            r5 = r41 & 64
            if (r5 == 0) goto L_0x0107
            r5 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r5
        L_0x0107:
            r5 = r6
            r6 = r9
            goto L_0x017e
        L_0x010b:
            if (r5 == 0) goto L_0x0110
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            goto L_0x0111
        L_0x0110:
            r5 = r6
        L_0x0111:
            r6 = r41 & 4
            r8 = 6
            if (r6 == 0) goto L_0x011e
            O0.o0 r6 = O0.C4745o0.f11359a
            long r11 = r6.f(r2, r8)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x011e:
            r6 = r41 & 8
            if (r6 == 0) goto L_0x012a
            O0.o0 r6 = O0.C4745o0.f11359a
            long r13 = r6.i(r2, r8)
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x012a:
            if (r7 == 0) goto L_0x0133
            O0.o0 r6 = O0.C4745o0.f11359a
            int r6 = r6.h()
            goto L_0x0134
        L_0x0133:
            r6 = r9
        L_0x0134:
            if (r16 == 0) goto L_0x013c
            O0.o0 r4 = O0.C4745o0.f11359a
            float r4 = r4.g()
        L_0x013c:
            r7 = r41 & 64
            if (r7 == 0) goto L_0x017e
            r0 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r7 = 256(0x100, float:3.59E-43)
            if (r0 <= r7) goto L_0x014e
            boolean r0 = r2.e(r11)
            if (r0 != 0) goto L_0x0152
        L_0x014e:
            r0 = r3 & 384(0x180, float:5.38E-43)
            if (r0 != r7) goto L_0x0154
        L_0x0152:
            r0 = 1
            goto L_0x0155
        L_0x0154:
            r0 = 0
        L_0x0155:
            r7 = 57344(0xe000, float:8.0356E-41)
            r7 = r7 & r3
            r8 = 16384(0x4000, float:2.2959E-41)
            if (r7 != r8) goto L_0x015f
            r7 = 1
            goto L_0x0160
        L_0x015f:
            r7 = 0
        L_0x0160:
            r0 = r0 | r7
            java.lang.Object r7 = r2.D()
            if (r0 != 0) goto L_0x016f
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r7 != r0) goto L_0x0177
        L_0x016f:
            O0.p0$g r7 = new O0.p0$g
            r7.<init>(r11, r6)
            r2.u(r7)
        L_0x0177:
            r0 = r7
            nI.l r0 = (nI.C17642l) r0
            r7 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r7
        L_0x017e:
            r2.y()
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x0190
            r7 = -1
            java.lang.String r8 = "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:152)"
            r9 = -339970038(0xffffffffebbc780a, float:-4.5568985E26)
            U0.C4895p.S(r9, r3, r7, r8)
        L_0x0190:
            r7 = r3 & 14
            r8 = 4
            if (r7 != r8) goto L_0x0197
            r7 = 1
            goto L_0x0198
        L_0x0197:
            r7 = 0
        L_0x0198:
            java.lang.Object r8 = r2.D()
            if (r7 != 0) goto L_0x01a6
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r7 = r7.a()
            if (r8 != r7) goto L_0x01ae
        L_0x01a6:
            O0.p0$m r8 = new O0.p0$m
            r8.<init>(r1)
            r2.u(r8)
        L_0x01ae:
            r7 = r8
            nI.a r7 = (nI.C17631a) r7
            androidx.compose.ui.d r8 = f11373b
            androidx.compose.ui.d r8 = r5.s(r8)
            boolean r9 = r2.V(r7)
            java.lang.Object r15 = r2.D()
            if (r9 != 0) goto L_0x01c9
            U0.m$a r9 = U0.C4889m.f14007a
            java.lang.Object r9 = r9.a()
            if (r15 != r9) goto L_0x01d1
        L_0x01c9:
            O0.p0$h r15 = new O0.p0$h
            r15.<init>(r7)
            r2.u(r15)
        L_0x01d1:
            nI.l r15 = (nI.C17642l) r15
            r9 = 1
            androidx.compose.ui.d r8 = L1.o.c(r8, r9, r15)
            float r15 = f11374c
            float r9 = f11375d
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.J.v(r8, r15, r9)
            r9 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r3
            r15 = 16384(0x4000, float:2.2959E-41)
            if (r9 != r15) goto L_0x01ea
            r9 = 1
            goto L_0x01eb
        L_0x01ea:
            r9 = 0
        L_0x01eb:
            r15 = 458752(0x70000, float:6.42848E-40)
            r15 = r15 & r3
            r1 = 131072(0x20000, float:1.83671E-40)
            if (r15 != r1) goto L_0x01f4
            r1 = 1
            goto L_0x01f5
        L_0x01f4:
            r1 = 0
        L_0x01f5:
            r1 = r1 | r9
            boolean r9 = r2.V(r7)
            r1 = r1 | r9
            r9 = r3 & 7168(0x1c00, float:1.0045E-41)
            r9 = r9 ^ 3072(0xc00, float:4.305E-42)
            r15 = 2048(0x800, float:2.87E-42)
            if (r9 <= r15) goto L_0x0209
            boolean r9 = r2.e(r13)
            if (r9 != 0) goto L_0x020d
        L_0x0209:
            r9 = r3 & 3072(0xc00, float:4.305E-42)
            if (r9 != r15) goto L_0x020f
        L_0x020d:
            r9 = 1
            goto L_0x0210
        L_0x020f:
            r9 = 0
        L_0x0210:
            r1 = r1 | r9
            r9 = r3 & 896(0x380, float:1.256E-42)
            r9 = r9 ^ 384(0x180, float:5.38E-43)
            r15 = 256(0x100, float:3.59E-43)
            if (r9 <= r15) goto L_0x021f
            boolean r9 = r2.e(r11)
            if (r9 != 0) goto L_0x0223
        L_0x021f:
            r9 = r3 & 384(0x180, float:5.38E-43)
            if (r9 != r15) goto L_0x0225
        L_0x0223:
            r9 = 1
            goto L_0x0226
        L_0x0225:
            r9 = 0
        L_0x0226:
            r1 = r1 | r9
            r9 = 3670016(0x380000, float:5.142788E-39)
            r9 = r9 & r3
            r9 = r9 ^ r18
            r15 = 1048576(0x100000, float:1.469368E-39)
            if (r9 <= r15) goto L_0x0236
            boolean r9 = r2.V(r0)
            if (r9 != 0) goto L_0x023a
        L_0x0236:
            r3 = r3 & r18
            if (r3 != r15) goto L_0x023c
        L_0x023a:
            r15 = 1
            goto L_0x023d
        L_0x023c:
            r15 = 0
        L_0x023d:
            r1 = r1 | r15
            java.lang.Object r3 = r2.D()
            if (r1 != 0) goto L_0x024c
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r1 = r1.a()
            if (r3 != r1) goto L_0x0262
        L_0x024c:
            O0.p0$i r3 = new O0.p0$i
            r21 = r3
            r22 = r6
            r23 = r4
            r24 = r7
            r25 = r13
            r27 = r11
            r29 = r0
            r21.<init>(r22, r23, r24, r25, r27, r29)
            r2.u(r3)
        L_0x0262:
            nI.l r3 = (nI.C17642l) r3
            r1 = 0
            n0.C5603i.a(r8, r3, r2, r1)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0271
            U0.C4895p.R()
        L_0x0271:
            r9 = r0
            r8 = r4
            r7 = r6
            r3 = r11
        L_0x0275:
            U0.Y0 r12 = r2.n()
            if (r12 == 0) goto L_0x028c
            O0.p0$j r15 = new O0.p0$j
            r0 = r15
            r1 = r30
            r2 = r5
            r5 = r13
            r10 = r40
            r11 = r41
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11)
            r12.a(r15)
        L_0x028c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.C4747p0.b(nI.a, androidx.compose.ui.d, long, long, int, float, nI.l, U0.m, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: O0.p0$k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: O0.p0$k} */
    /* JADX WARNING: type inference failed for: r8v10 */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x027d, code lost:
        if (r8 == U0.C4889m.f14007a.a()) goto L_0x027f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(androidx.compose.ui.d r28, long r29, long r31, int r33, float r34, U0.C4889m r35, int r36, int r37) {
        /*
            r8 = r36
            r0 = 567589233(0x21d4b971, float:1.4414765E-18)
            r1 = r35
            U0.m r1 = r1.k(r0)
            r2 = r37 & 1
            if (r2 == 0) goto L_0x0015
            r3 = r8 | 6
            r4 = r3
            r3 = r28
            goto L_0x0029
        L_0x0015:
            r3 = r8 & 6
            if (r3 != 0) goto L_0x0026
            r3 = r28
            boolean r4 = r1.V(r3)
            if (r4 == 0) goto L_0x0023
            r4 = 4
            goto L_0x0024
        L_0x0023:
            r4 = 2
        L_0x0024:
            r4 = r4 | r8
            goto L_0x0029
        L_0x0026:
            r3 = r28
            r4 = r8
        L_0x0029:
            r5 = r8 & 48
            if (r5 != 0) goto L_0x0040
            r5 = r37 & 2
            r9 = r29
            if (r5 != 0) goto L_0x003c
            boolean r5 = r1.e(r9)
            if (r5 == 0) goto L_0x003c
            r5 = 32
            goto L_0x003e
        L_0x003c:
            r5 = 16
        L_0x003e:
            r4 = r4 | r5
            goto L_0x0042
        L_0x0040:
            r9 = r29
        L_0x0042:
            r5 = r8 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0059
            r5 = r37 & 4
            r11 = r31
            if (r5 != 0) goto L_0x0055
            boolean r5 = r1.e(r11)
            if (r5 == 0) goto L_0x0055
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0057
        L_0x0055:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0057:
            r4 = r4 | r5
            goto L_0x005b
        L_0x0059:
            r11 = r31
        L_0x005b:
            r5 = r37 & 8
            if (r5 == 0) goto L_0x0064
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0061:
            r14 = r33
            goto L_0x0076
        L_0x0064:
            r14 = r8 & 3072(0xc00, float:4.305E-42)
            if (r14 != 0) goto L_0x0061
            r14 = r33
            boolean r15 = r1.d(r14)
            if (r15 == 0) goto L_0x0073
            r15 = 2048(0x800, float:2.87E-42)
            goto L_0x0075
        L_0x0073:
            r15 = 1024(0x400, float:1.435E-42)
        L_0x0075:
            r4 = r4 | r15
        L_0x0076:
            r15 = r37 & 16
            if (r15 == 0) goto L_0x007f
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x007c:
            r7 = r34
            goto L_0x0092
        L_0x007f:
            r7 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r7 != 0) goto L_0x007c
            r7 = r34
            boolean r16 = r1.c(r7)
            if (r16 == 0) goto L_0x008e
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0090
        L_0x008e:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x0090:
            r4 = r4 | r16
        L_0x0092:
            r6 = r4 & 9363(0x2493, float:1.312E-41)
            r13 = 9362(0x2492, float:1.3119E-41)
            if (r6 != r13) goto L_0x00a6
            boolean r6 = r1.l()
            if (r6 != 0) goto L_0x009f
            goto L_0x00a6
        L_0x009f:
            r1.L()
        L_0x00a2:
            r4 = r11
            r6 = r14
            goto L_0x02ac
        L_0x00a6:
            r1.G()
            r6 = r8 & 1
            if (r6 == 0) goto L_0x00c5
            boolean r6 = r1.O()
            if (r6 == 0) goto L_0x00b4
            goto L_0x00c5
        L_0x00b4:
            r1.L()
            r2 = r37 & 2
            if (r2 == 0) goto L_0x00bd
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00bd:
            r2 = r37 & 4
            if (r2 == 0) goto L_0x00c3
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00c3:
            r2 = r3
            goto L_0x00f7
        L_0x00c5:
            if (r2 == 0) goto L_0x00ca
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            goto L_0x00cb
        L_0x00ca:
            r2 = r3
        L_0x00cb:
            r3 = r37 & 2
            r6 = 6
            if (r3 == 0) goto L_0x00d8
            O0.o0 r3 = O0.C4745o0.f11359a
            long r9 = r3.f(r1, r6)
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00d8:
            r3 = r37 & 4
            if (r3 == 0) goto L_0x00e5
            O0.o0 r3 = O0.C4745o0.f11359a
            long r11 = r3.i(r1, r6)
            r3 = r4 & -897(0xfffffffffffffc7f, float:NaN)
            r4 = r3
        L_0x00e5:
            if (r5 == 0) goto L_0x00ee
            O0.o0 r3 = O0.C4745o0.f11359a
            int r3 = r3.h()
            r14 = r3
        L_0x00ee:
            if (r15 == 0) goto L_0x00f7
            O0.o0 r3 = O0.C4745o0.f11359a
            float r3 = r3.g()
            r7 = r3
        L_0x00f7:
            r1.y()
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0106
            r3 = -1
            java.lang.String r5 = "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:253)"
            U0.C4895p.S(r0, r4, r3, r5)
        L_0x0106:
            r0 = 0
            r3 = 0
            r5 = 1
            m0.W r0 = m0.X.c(r0, r1, r3, r5)
            O0.p0$n r6 = O0.C4747p0.n.f11437c
            m0.a0 r6 = m0.C5548j.f(r6)
            r13 = 6
            r15 = 0
            r17 = 0
            r18 = 0
            r28 = r6
            r29 = r17
            r30 = r18
            r32 = r13
            r33 = r15
            m0.V r6 = m0.C5548j.e(r28, r29, r30, r32, r33)
            int r13 = m0.W.f25632f
            r15 = r13 | 432(0x1b0, float:6.05E-43)
            int r17 = m0.V.f25628d
            int r18 = r17 << 9
            r15 = r15 | r18
            r18 = 8
            r19 = 0
            r20 = 1065353216(0x3f800000, float:1.0)
            r21 = 0
            r28 = r0
            r29 = r19
            r30 = r20
            r31 = r6
            r32 = r21
            r33 = r1
            r34 = r15
            r35 = r18
            U0.A1 r6 = m0.X.a(r28, r29, r30, r31, r32, r33, r34, r35)
            O0.p0$o r15 = O0.C4747p0.o.f11438c
            m0.a0 r15 = m0.C5548j.f(r15)
            r18 = 6
            r19 = 0
            r20 = 0
            r21 = 0
            r28 = r15
            r29 = r20
            r30 = r21
            r32 = r18
            r33 = r19
            m0.V r15 = m0.C5548j.e(r28, r29, r30, r32, r33)
            r5 = r13 | 432(0x1b0, float:6.05E-43)
            int r19 = r17 << 9
            r5 = r5 | r19
            r19 = 8
            r20 = 0
            r21 = 1065353216(0x3f800000, float:1.0)
            r22 = 0
            r28 = r0
            r29 = r20
            r30 = r21
            r31 = r15
            r32 = r22
            r33 = r1
            r34 = r5
            r35 = r19
            U0.A1 r5 = m0.X.a(r28, r29, r30, r31, r32, r33, r34, r35)
            O0.p0$p r15 = O0.C4747p0.p.f11439c
            m0.a0 r15 = m0.C5548j.f(r15)
            r19 = 6
            r20 = 0
            r21 = 0
            r22 = 0
            r28 = r15
            r29 = r21
            r30 = r22
            r32 = r19
            r33 = r20
            m0.V r15 = m0.C5548j.e(r28, r29, r30, r32, r33)
            r3 = r13 | 432(0x1b0, float:6.05E-43)
            int r19 = r17 << 9
            r3 = r3 | r19
            r19 = 8
            r20 = 0
            r21 = 1065353216(0x3f800000, float:1.0)
            r22 = 0
            r28 = r0
            r29 = r20
            r30 = r21
            r31 = r15
            r32 = r22
            r33 = r1
            r34 = r3
            r35 = r19
            U0.A1 r3 = m0.X.a(r28, r29, r30, r31, r32, r33, r34, r35)
            O0.p0$q r15 = O0.C4747p0.q.f11440c
            m0.a0 r15 = m0.C5548j.f(r15)
            r19 = 6
            r20 = 0
            r21 = 0
            r22 = 0
            r28 = r15
            r29 = r21
            r30 = r22
            r32 = r19
            r33 = r20
            m0.V r15 = m0.C5548j.e(r28, r29, r30, r32, r33)
            r13 = r13 | 432(0x1b0, float:6.05E-43)
            int r17 = r17 << 9
            r13 = r13 | r17
            r17 = 8
            r19 = 0
            r20 = 1065353216(0x3f800000, float:1.0)
            r28 = r0
            r29 = r19
            r30 = r20
            r31 = r15
            r32 = r21
            r33 = r1
            r34 = r13
            r35 = r17
            U0.A1 r0 = m0.X.a(r28, r29, r30, r31, r32, r33, r34, r35)
            androidx.compose.ui.d r13 = f11373b
            androidx.compose.ui.d r13 = r2.s(r13)
            androidx.compose.ui.d r13 = n0.Z.a(r13)
            float r15 = f11374c
            r28 = r2
            float r2 = f11375d
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.v(r13, r15, r2)
            r13 = r4 & 7168(0x1c00, float:1.0045E-41)
            r15 = 2048(0x800, float:2.87E-42)
            if (r13 != r15) goto L_0x0221
            r13 = 1
            goto L_0x0222
        L_0x0221:
            r13 = 0
        L_0x0222:
            r15 = 57344(0xe000, float:8.0356E-41)
            r15 = r15 & r4
            r8 = 16384(0x4000, float:2.2959E-41)
            if (r15 != r8) goto L_0x022c
            r8 = 1
            goto L_0x022d
        L_0x022c:
            r8 = 0
        L_0x022d:
            r8 = r8 | r13
            boolean r13 = r1.V(r6)
            r8 = r8 | r13
            r13 = r4 & 896(0x380, float:1.256E-42)
            r13 = r13 ^ 384(0x180, float:5.38E-43)
            r15 = 256(0x100, float:3.59E-43)
            if (r13 <= r15) goto L_0x0241
            boolean r13 = r1.e(r11)
            if (r13 != 0) goto L_0x0245
        L_0x0241:
            r13 = r4 & 384(0x180, float:5.38E-43)
            if (r13 != r15) goto L_0x0247
        L_0x0245:
            r13 = 1
            goto L_0x0248
        L_0x0247:
            r13 = 0
        L_0x0248:
            r8 = r8 | r13
            boolean r13 = r1.V(r5)
            r8 = r8 | r13
            r13 = r4 & 112(0x70, float:1.57E-43)
            r13 = r13 ^ 48
            r15 = 32
            if (r13 <= r15) goto L_0x025c
            boolean r13 = r1.e(r9)
            if (r13 != 0) goto L_0x0260
        L_0x025c:
            r4 = r4 & 48
            if (r4 != r15) goto L_0x0263
        L_0x0260:
            r18 = 1
            goto L_0x0265
        L_0x0263:
            r18 = 0
        L_0x0265:
            r4 = r8 | r18
            boolean r8 = r1.V(r3)
            r4 = r4 | r8
            boolean r8 = r1.V(r0)
            r4 = r4 | r8
            java.lang.Object r8 = r1.D()
            if (r4 != 0) goto L_0x027f
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r8 != r4) goto L_0x0299
        L_0x027f:
            O0.p0$k r8 = new O0.p0$k
            r17 = r8
            r18 = r14
            r19 = r7
            r20 = r6
            r21 = r11
            r23 = r5
            r24 = r9
            r26 = r3
            r27 = r0
            r17.<init>(r18, r19, r20, r21, r23, r24, r26, r27)
            r1.u(r8)
        L_0x0299:
            nI.l r8 = (nI.C17642l) r8
            r0 = 0
            n0.C5603i.a(r2, r8, r1, r0)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x02a8
            U0.C4895p.R()
        L_0x02a8:
            r3 = r28
            goto L_0x00a2
        L_0x02ac:
            U0.Y0 r11 = r1.n()
            if (r11 == 0) goto L_0x02c1
            O0.p0$l r12 = new O0.p0$l
            r0 = r12
            r1 = r3
            r2 = r9
            r8 = r36
            r9 = r37
            r0.<init>(r1, r2, r4, r6, r7, r8, r9)
            r11.a(r12)
        L_0x02c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.C4747p0.c(androidx.compose.ui.d, long, long, int, float, U0.m, int, int):void");
    }

    private static final void m(r1.f fVar, float f10, float f11, long j10, r1.k kVar) {
        float f12 = (float) 2;
        float f13 = kVar.f() / f12;
        float l10 = C5673m.l(fVar.b()) - (f12 * f13);
        r1.f.V0(fVar, j10, f10, f11, false, C5668h.a(f13, f13), C5674n.a(l10, l10), 0.0f, kVar, (C5749w0) null, 0, 832, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final void n(r1.f fVar, long j10, r1.k kVar) {
        m(fVar, 0.0f, 360.0f, j10, kVar);
    }

    /* access modifiers changed from: private */
    public static final void o(r1.f fVar, float f10, float f11, float f12, long j10, r1.k kVar) {
        m(fVar, f10 + (k1.g(kVar.b(), k1.f27320b.a()) ? 0.0f : ((f11 / c2.h.B(f11376e / ((float) 2))) * 57.29578f) / 2.0f), Math.max(f12, 0.1f), j10, kVar);
    }

    /* access modifiers changed from: private */
    public static final void p(r1.f fVar, float f10, float f11, long j10, float f12, int i10) {
        float l10 = C5673m.l(fVar.b());
        float i11 = C5673m.i(fVar.b());
        float f13 = (float) 2;
        float f14 = i11 / f13;
        boolean z10 = fVar.getLayoutDirection() == c2.t.Ltr;
        float f15 = (z10 ? f10 : 1.0f - f11) * l10;
        float f16 = (z10 ? f11 : 1.0f - f10) * l10;
        if (k1.g(i10, k1.f27320b.a()) || i11 > l10) {
            r1.f.u0(fVar, j10, C5668h.a(f15, f14), C5668h.a(f16, f14), f12, 0, (V0) null, 0.0f, (C5749w0) null, 0, 496, (Object) null);
            return;
        }
        float f17 = f12 / f13;
        C17970f c10 = C17978n.c(f17, l10 - f17);
        float floatValue = ((Number) C17978n.q(Float.valueOf(f15), c10)).floatValue();
        float floatValue2 = ((Number) C17978n.q(Float.valueOf(f16), c10)).floatValue();
        if (Math.abs(f11 - f10) > 0.0f) {
            r1.f.u0(fVar, j10, C5668h.a(floatValue, f14), C5668h.a(floatValue2, f14), f12, i10, (V0) null, 0.0f, (C5749w0) null, 0, 480, (Object) null);
        }
    }
}
