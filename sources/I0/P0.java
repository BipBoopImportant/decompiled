package I0;

import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import U0.A1;
import U0.C4892n0;
import U0.C4899r0;
import U0.D0;
import U0.o1;
import U0.p1;
import XH.C16796C;
import XH.C16807N;
import XH.C16814e;
import XH.v;
import XH.y;
import YH.X;
import dI.C17164e;
import eI.C17187b;
import f1.C5309k;
import f1.C5310l;
import f1.m;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.L;
import m0.C5530a;
import m0.C5532b;
import m0.C5546i;
import m0.C5554m;
import n0.C5589L;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import p0.n;
import p0.q;
import p0.r;
import tI.C17978n;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u0000 b*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001 B5\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0005H@¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H@¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0015\u001a\u00020\r2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J8\u0010\u0018\u001a\u00020\r2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0013H@¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00028\u00002\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0005H@¢\u0006\u0004\b\u001f\u0010\u000fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00078\u0000X\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R+\u0010/\u001a\u00028\u00002\u0006\u0010(\u001a\u00028\u00008F@BX\u0002¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R+\u00105\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b8F@BX\u0002¢\u0006\u0012\n\u0004\b0\u0010*\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0014\u00109\u001a\u0002068\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010;\u001a\u0002068\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u00108R\u0014\u0010=\u001a\u0002068\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u00108R\u001c\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050>8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010*RC\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00132\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00138@@@X\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010*\u001a\u0004\b@\u0010A\"\u0004\bB\u0010\u0016R&\u0010G\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00130D8\u0002X\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\"\u0010M\u001a\u00020\u00058\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010P\u001a\u00020\u00058\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b@\u0010H\u001a\u0004\bN\u0010J\"\u0004\bO\u0010LRO\u0010U\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050Q2\u0018\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050Q8@@@X\u0002¢\u0006\u0012\n\u0004\b\"\u0010*\u001a\u0004\bR\u0010S\"\u0004\bH\u0010TR+\u0010X\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00058@@@X\u0002¢\u0006\u0012\n\u0004\b&\u00108\u001a\u0004\bV\u0010J\"\u0004\bW\u0010LR/\u0010^\u001a\u0004\u0018\u00010Y2\b\u0010(\u001a\u0004\u0018\u00010Y8@@@X\u0002¢\u0006\u0012\n\u0004\b+\u0010*\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u001a\u0010d\u001a\u00020_8\u0000X\u0004¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u0017\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00050e8F¢\u0006\u0006\u001a\u0004\bf\u0010gR \u0010n\u001a\b\u0012\u0004\u0012\u00028\u00000i8FX\u0004¢\u0006\f\u0012\u0004\bl\u0010m\u001a\u0004\bj\u0010kR\u001a\u0010p\u001a\u00020\u00058FX\u0004¢\u0006\f\u0012\u0004\bo\u0010m\u001a\u0004\b`\u0010J¨\u0006q"}, d2 = {"LI0/P0;", "T", "", "initialValue", "Lm0/i;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmStateChange", "<init>", "(Ljava/lang/Object;Lm0/i;LnI/l;)V", "target", "LXH/N;", "H", "(FLdI/e;)Ljava/lang/Object;", "spec", "h", "(FLm0/i;LdI/e;)Ljava/lang/Object;", "", "newAnchors", "k", "(Ljava/util/Map;)V", "oldAnchors", "A", "(Ljava/util/Map;Ljava/util/Map;LdI/e;)Ljava/lang/Object;", "targetValue", "anim", "i", "(Ljava/lang/Object;Lm0/i;LdI/e;)Ljava/lang/Object;", "velocity", "z", "a", "Lm0/i;", "m", "()Lm0/i;", "b", "LnI/l;", "n", "()LnI/l;", "<set-?>", "c", "LU0/r0;", "o", "()Ljava/lang/Object;", "D", "(Ljava/lang/Object;)V", "currentValue", "d", "y", "()Z", "C", "(Z)V", "isAnimationRunning", "LU0/n0;", "e", "LU0/n0;", "offsetState", "f", "overflowState", "g", "absoluteOffset", "LU0/r0;", "animationTarget", "l", "()Ljava/util/Map;", "B", "anchors", "LTJ/g;", "j", "LTJ/g;", "latestNonEmptyAnchorsFlow", "F", "s", "()F", "setMinBound$material_release", "(F)V", "minBound", "r", "setMaxBound$material_release", "maxBound", "Lkotlin/Function2;", "w", "()LnI/p;", "(LnI/p;)V", "thresholds", "x", "G", "velocityThreshold", "LI0/s0;", "v", "()LI0/s0;", "E", "(LI0/s0;)V", "resistance", "Lp0/r;", "p", "Lp0/r;", "q", "()Lp0/r;", "draggableState", "LU0/A1;", "t", "()LU0/A1;", "offset", "LI0/M0;", "u", "()LI0/M0;", "getProgress$annotations", "()V", "progress", "getDirection$annotations", "direction", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C16814e
public class P0<T> {

    /* renamed from: q  reason: collision with root package name */
    public static final a f7445q = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C5546i<Float> f7446a;

    /* renamed from: b  reason: collision with root package name */
    private final C17642l<T, Boolean> f7447b;

    /* renamed from: c  reason: collision with root package name */
    private final C4899r0 f7448c;

    /* renamed from: d  reason: collision with root package name */
    private final C4899r0 f7449d = u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final C4892n0 f7450e = D0.a(0.0f);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final C4892n0 f7451f = D0.a(0.0f);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final C4892n0 f7452g = D0.a(0.0f);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final C4899r0<Float> f7453h = u1.e((Object) null, (o1) null, 2, (Object) null);

    /* renamed from: i  reason: collision with root package name */
    private final C4899r0 f7454i = u1.e(X.j(), (o1) null, 2, (Object) null);

    /* renamed from: j  reason: collision with root package name */
    private final C16532g<Map<Float, T>> f7455j = C16534i.e0(new i(p1.r(new e(this))), 1);

    /* renamed from: k  reason: collision with root package name */
    private float f7456k = Float.NEGATIVE_INFINITY;

    /* renamed from: l  reason: collision with root package name */
    private float f7457l = Float.POSITIVE_INFINITY;

    /* renamed from: m  reason: collision with root package name */
    private final C4899r0 f7458m = u1.e(j.f7499c, (o1) null, 2, (Object) null);

    /* renamed from: n  reason: collision with root package name */
    private final C4892n0 f7459n = D0.a(0.0f);

    /* renamed from: o  reason: collision with root package name */
    private final C4899r0 f7460o = u1.e((Object) null, (o1) null, 2, (Object) null);

    /* renamed from: p  reason: collision with root package name */
    private final r f7461p = q.a(new d(this));

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0004\u0012\u00028\u00010\u000b\"\b\b\u0001\u0010\u0004*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LI0/P0$a;", "", "<init>", "()V", "T", "Lm0/i;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmStateChange", "Lf1/k;", "LI0/P0;", "a", "(Lm0/i;LnI/l;)Lf1/k;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00018\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "Lf1/m;", "LI0/P0;", "it", "a", "(Lf1/m;LI0/P0;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: I0.P0$a$a  reason: collision with other inner class name */
        static final class C0097a extends C17544u implements p<m, P0<T>, T> {

            /* renamed from: c  reason: collision with root package name */
            public static final C0097a f7462c = new C0097a();

            C0097a() {
                super(2);
            }

            /* renamed from: a */
            public final T invoke(m mVar, P0<T> p02) {
                return p02.o();
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "it", "LI0/P0;", "a", "(Ljava/lang/Object;)LI0/P0;"}, k = 3, mv = {1, 8, 0})
        static final class b extends C17544u implements C17642l<T, P0<T>> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C5546i<Float> f7463c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C17642l<T, Boolean> f7464d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(C5546i<Float> iVar, C17642l<? super T, Boolean> lVar) {
                super(1);
                this.f7463c = iVar;
                this.f7464d = lVar;
            }

            /* renamed from: a */
            public final P0<T> invoke(T t10) {
                return new P0<>(t10, this.f7463c, this.f7464d);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T> C5309k<P0<T>, T> a(C5546i<Float> iVar, C17642l<? super T, Boolean> lVar) {
            return C5310l.a(C0097a.f7462c, new b(iVar, lVar));
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lp0/n;", "LXH/N;", "<anonymous>", "(Lp0/n;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SwipeableState$animateInternalToOffset$2", f = "Swipeable.kt", l = {229}, m = "invokeSuspend")
    static final class b extends l implements p<n, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f7465c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f7466d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ P0<T> f7467e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ float f7468f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C5546i<Float> f7469g;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lm0/a;", "", "Lm0/m;", "LXH/N;", "a", "(Lm0/a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements C17642l<C5530a<Float, C5554m>, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ n f7470c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ L f7471d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(n nVar, L l10) {
                super(1);
                this.f7470c = nVar;
                this.f7471d = l10;
            }

            public final void a(C5530a<Float, C5554m> aVar) {
                this.f7470c.a(aVar.m().floatValue() - this.f7471d.f144345a);
                this.f7471d.f144345a = aVar.m().floatValue();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C5530a) obj);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(P0<T> p02, float f10, C5546i<Float> iVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f7467e = p02;
            this.f7468f = f10;
            this.f7469g = iVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f7467e, this.f7468f, this.f7469g, eVar);
            bVar.f7466d = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(n nVar, C17164e<? super C16807N> eVar) {
            return ((b) create(nVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f7465c;
            if (i10 == 0) {
                y.b(obj);
                n nVar = (n) this.f7466d;
                L l10 = new L();
                l10.f144345a = this.f7467e.f7452g.a();
                this.f7467e.f7453h.setValue(kotlin.coroutines.jvm.internal.b.d(this.f7468f));
                this.f7467e.C(true);
                C5530a b10 = C5532b.b(l10.f144345a, 0.0f, 2, (Object) null);
                Float d10 = kotlin.coroutines.jvm.internal.b.d(this.f7468f);
                C5546i<Float> iVar = this.f7469g;
                a aVar = new a(nVar, l10);
                this.f7465c = 1;
                if (C5530a.f(b10, d10, iVar, (Object) null, aVar, this, 4, (Object) null) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                try {
                    y.b(obj);
                } catch (Throwable th2) {
                    this.f7467e.f7453h.setValue(null);
                    this.f7467e.C(false);
                    throw th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f7467e.f7453h.setValue(null);
            this.f7467e.C(false);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "", "anchors", "LXH/N;", "c", "(Ljava/util/Map;LdI/e;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class c<T> implements C16533h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ T f7472a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ P0<T> f7473b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5546i<Float> f7474c;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SwipeableState$animateTo$2", f = "Swipeable.kt", l = {341}, m = "emit")
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: c  reason: collision with root package name */
            Object f7475c;

            /* renamed from: d  reason: collision with root package name */
            Object f7476d;

            /* renamed from: e  reason: collision with root package name */
            /* synthetic */ Object f7477e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ c<T> f7478f;

            /* renamed from: g  reason: collision with root package name */
            int f7479g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(c<? super T> cVar, C17164e<? super a> eVar) {
                super(eVar);
                this.f7478f = cVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f7477e = obj;
                this.f7479g |= Integer.MIN_VALUE;
                return this.f7478f.emit((Map) null, this);
            }
        }

        c(T t10, P0<T> p02, C5546i<Float> iVar) {
            this.f7472a = t10;
            this.f7473b = p02;
            this.f7474c = iVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x003e  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x007c  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00ad  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object emit(java.util.Map<java.lang.Float, ? extends T> r7, dI.C17164e<? super XH.C16807N> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof I0.P0.c.a
                if (r0 == 0) goto L_0x0013
                r0 = r8
                I0.P0$c$a r0 = (I0.P0.c.a) r0
                int r1 = r0.f7479g
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f7479g = r1
                goto L_0x0018
            L_0x0013:
                I0.P0$c$a r0 = new I0.P0$c$a
                r0.<init>(r6, r8)
            L_0x0018:
                java.lang.Object r8 = r0.f7477e
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f7479g
                r3 = 1056964608(0x3f000000, float:0.5)
                r4 = 1
                if (r2 == 0) goto L_0x003e
                if (r2 != r4) goto L_0x0036
                java.lang.Object r7 = r0.f7476d
                java.util.Map r7 = (java.util.Map) r7
                java.lang.Object r0 = r0.f7475c
                I0.P0$c r0 = (I0.P0.c) r0
                XH.y.b(r8)     // Catch:{ all -> 0x0033 }
                goto L_0x005f
            L_0x0033:
                r8 = move-exception
                goto L_0x00c6
            L_0x0036:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x003e:
                XH.y.b(r8)
                T r8 = r6.f7472a     // Catch:{ all -> 0x00bb }
                java.lang.Float r8 = I0.O0.f(r7, r8)     // Catch:{ all -> 0x00bb }
                if (r8 == 0) goto L_0x00be
                I0.P0<T> r2 = r6.f7473b     // Catch:{ all -> 0x00bb }
                float r8 = r8.floatValue()     // Catch:{ all -> 0x00bb }
                m0.i<java.lang.Float> r5 = r6.f7474c     // Catch:{ all -> 0x00bb }
                r0.f7475c = r6     // Catch:{ all -> 0x00bb }
                r0.f7476d = r7     // Catch:{ all -> 0x00bb }
                r0.f7479g = r4     // Catch:{ all -> 0x00bb }
                java.lang.Object r8 = r2.h(r8, r5, r0)     // Catch:{ all -> 0x00bb }
                if (r8 != r1) goto L_0x005e
                return r1
            L_0x005e:
                r0 = r6
            L_0x005f:
                I0.P0<T> r8 = r0.f7473b
                U0.n0 r8 = r8.f7452g
                float r8 = r8.a()
                java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
                r1.<init>()
                java.util.Set r7 = r7.entrySet()
                java.util.Iterator r7 = r7.iterator()
            L_0x0076:
                boolean r2 = r7.hasNext()
                if (r2 == 0) goto L_0x00a1
                java.lang.Object r2 = r7.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.lang.Object r4 = r2.getKey()
                java.lang.Number r4 = (java.lang.Number) r4
                float r4 = r4.floatValue()
                float r4 = r4 - r8
                float r4 = java.lang.Math.abs(r4)
                int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r4 >= 0) goto L_0x0076
                java.lang.Object r4 = r2.getKey()
                java.lang.Object r2 = r2.getValue()
                r1.put(r4, r2)
                goto L_0x0076
            L_0x00a1:
                java.util.Collection r7 = r1.values()
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.lang.Object r7 = YH.C16877v.x0(r7)
                if (r7 != 0) goto L_0x00b3
                I0.P0<T> r7 = r0.f7473b
                java.lang.Object r7 = r7.o()
            L_0x00b3:
                I0.P0<T> r8 = r0.f7473b
                r8.D(r7)
                XH.N r7 = XH.C16807N.f139792a
                return r7
            L_0x00bb:
                r8 = move-exception
                r0 = r6
                goto L_0x00c6
            L_0x00be:
                java.lang.String r8 = "The target value must have an associated anchor."
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00bb }
                r0.<init>(r8)     // Catch:{ all -> 0x00bb }
                throw r0     // Catch:{ all -> 0x00bb }
            L_0x00c6:
                I0.P0<T> r1 = r0.f7473b
                U0.n0 r1 = r1.f7452g
                float r1 = r1.a()
                java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
                r2.<init>()
                java.util.Set r7 = r7.entrySet()
                java.util.Iterator r7 = r7.iterator()
            L_0x00dd:
                boolean r4 = r7.hasNext()
                if (r4 == 0) goto L_0x0108
                java.lang.Object r4 = r7.next()
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r5 = r4.getKey()
                java.lang.Number r5 = (java.lang.Number) r5
                float r5 = r5.floatValue()
                float r5 = r5 - r1
                float r5 = java.lang.Math.abs(r5)
                int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r5 >= 0) goto L_0x00dd
                java.lang.Object r5 = r4.getKey()
                java.lang.Object r4 = r4.getValue()
                r2.put(r5, r4)
                goto L_0x00dd
            L_0x0108:
                java.util.Collection r7 = r2.values()
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.lang.Object r7 = YH.C16877v.x0(r7)
                if (r7 != 0) goto L_0x011a
                I0.P0<T> r7 = r0.f7473b
                java.lang.Object r7 = r7.o()
            L_0x011a:
                I0.P0<T> r0 = r0.f7473b
                r0.D(r7)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: I0.P0.c.emit(java.util.Map, dI.e):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "LXH/N;", "a", "(F)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends C17544u implements C17642l<Float, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ P0<T> f7480c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(P0<T> p02) {
            super(1);
            this.f7480c = p02;
        }

        public final void a(float f10) {
            float a10 = this.f7480c.f7452g.a() + f10;
            float l10 = C17978n.l(a10, this.f7480c.s(), this.f7480c.r());
            float f11 = a10 - l10;
            C4582s0 v10 = this.f7480c.v();
            this.f7480c.f7450e.n(l10 + (v10 != null ? v10.a(f11) : 0.0f));
            this.f7480c.f7451f.n(f11);
            this.f7480c.f7452g.n(a10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).floatValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "", "", "b", "()Ljava/util/Map;"}, k = 3, mv = {1, 8, 0})
    static final class e extends C17544u implements C17631a<Map<Float, ? extends T>> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ P0<T> f7481c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(P0<T> p02) {
            super(0);
            this.f7481c = p02;
        }

        /* renamed from: b */
        public final Map<Float, T> invoke() {
            return this.f7481c.l();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "", "anchors", "LXH/N;", "c", "(Ljava/util/Map;LdI/e;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class f<T> implements C16533h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ P0<T> f7482a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f7483b;

        f(P0<T> p02, float f10) {
            this.f7482a = p02;
            this.f7483b = f10;
        }

        /* renamed from: c */
        public final Object emit(Map<Float, ? extends T> map, C17164e<? super C16807N> eVar) {
            Float c10 = O0.f(map, this.f7482a.o());
            C17542s.g(c10);
            float floatValue = c10.floatValue();
            Object obj = map.get(kotlin.coroutines.jvm.internal.b.d(O0.d(this.f7482a.t().getValue().floatValue(), floatValue, map.keySet(), this.f7482a.w(), this.f7483b, this.f7482a.x())));
            if (obj == null || !this.f7482a.n().invoke(obj).booleanValue()) {
                P0<T> p02 = this.f7482a;
                Object a10 = p02.h(floatValue, p02.m(), eVar);
                return a10 == C17187b.f() ? a10 : C16807N.f139792a;
            }
            Object j10 = P0.j(this.f7482a, obj, (C5546i) null, eVar, 2, (Object) null);
            return j10 == C17187b.f() ? j10 : C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SwipeableState", f = "Swipeable.kt", l = {165, 189, 192}, m = "processNewAnchors$material_release")
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f7484c;

        /* renamed from: d  reason: collision with root package name */
        Object f7485d;

        /* renamed from: e  reason: collision with root package name */
        float f7486e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f7487f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ P0<T> f7488g;

        /* renamed from: h  reason: collision with root package name */
        int f7489h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(P0<T> p02, C17164e<? super g> eVar) {
            super(eVar);
            this.f7488g = p02;
        }

        public final Object invokeSuspend(Object obj) {
            this.f7487f = obj;
            this.f7489h |= Integer.MIN_VALUE;
            return this.f7488g.A((Map) null, (Map) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lp0/n;", "LXH/N;", "<anonymous>", "(Lp0/n;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SwipeableState$snapInternalToOffset$2", f = "Swipeable.kt", l = {}, m = "invokeSuspend")
    static final class h extends l implements p<n, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f7490c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f7491d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f7492e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ P0<T> f7493f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(float f10, P0<T> p02, C17164e<? super h> eVar) {
            super(2, eVar);
            this.f7492e = f10;
            this.f7493f = p02;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            h hVar = new h(this.f7492e, this.f7493f, eVar);
            hVar.f7491d = obj;
            return hVar;
        }

        /* renamed from: i */
        public final Object invoke(n nVar, C17164e<? super C16807N> eVar) {
            return ((h) create(nVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f7490c == 0) {
                y.b(obj);
                ((n) this.f7491d).a(this.f7492e - this.f7493f.f7452g.a());
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class i implements C16532g<Map<Float, ? extends T>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f7494a;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "LXH/N;", "emit", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f7495a;

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SwipeableState$special$$inlined$filter$1$2", f = "Swipeable.kt", l = {223}, m = "emit")
            /* renamed from: I0.P0$i$a$a  reason: collision with other inner class name */
            public static final class C0098a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f7496c;

                /* renamed from: d  reason: collision with root package name */
                int f7497d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f7498e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0098a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f7498e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f7496c = obj;
                    this.f7497d |= Integer.MIN_VALUE;
                    return this.f7498e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f7495a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof I0.P0.i.a.C0098a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    I0.P0$i$a$a r0 = (I0.P0.i.a.C0098a) r0
                    int r1 = r0.f7497d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f7497d = r1
                    goto L_0x0018
                L_0x0013:
                    I0.P0$i$a$a r0 = new I0.P0$i$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f7496c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f7497d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0048
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f7495a
                    r2 = r5
                    java.util.Map r2 = (java.util.Map) r2
                    boolean r2 = r2.isEmpty()
                    if (r2 != 0) goto L_0x0048
                    r0.f7497d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0048
                    return r1
                L_0x0048:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: I0.P0.i.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public i(C16532g gVar) {
            this.f7494a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f7494a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "<anonymous parameter 0>", "<anonymous parameter 1>", "a", "(FF)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class j extends C17544u implements p<Float, Float, Float> {

        /* renamed from: c  reason: collision with root package name */
        public static final j f7499c = new j();

        j() {
            super(2);
        }

        public final Float a(float f10, float f11) {
            return Float.valueOf(0.0f);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
        }
    }

    public P0(T t10, C5546i<Float> iVar, C17642l<? super T, Boolean> lVar) {
        this.f7446a = iVar;
        this.f7447b = lVar;
        this.f7448c = u1.e(t10, (o1) null, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void C(boolean z10) {
        this.f7449d.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public final void D(T t10) {
        this.f7448c.setValue(t10);
    }

    private final Object H(float f10, C17164e<? super C16807N> eVar) {
        Object a10 = r.a(this.f7461p, (C5589L) null, new h(f10, this, (C17164e<? super h>) null), eVar, 1, (Object) null);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final Object h(float f10, C5546i<Float> iVar, C17164e<? super C16807N> eVar) {
        Object a10 = r.a(this.f7461p, (C5589L) null, new b(this, f10, iVar, (C17164e<? super b>) null), eVar, 1, (Object) null);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    public static /* synthetic */ Object j(P0 p02, Object obj, C5546i<Float> iVar, C17164e eVar, int i10, Object obj2) {
        if (obj2 == null) {
            if ((i10 & 2) != 0) {
                iVar = p02.f7446a;
            }
            return p02.i(obj, iVar, eVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateTo");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:17|18|19|79|80|(1:82)(4:83|84|87|88)) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        r12 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x0208 */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0216 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A(java.util.Map<java.lang.Float, ? extends T> r10, java.util.Map<java.lang.Float, ? extends T> r11, dI.C17164e<? super XH.C16807N> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof I0.P0.g
            if (r0 == 0) goto L_0x0013
            r0 = r12
            I0.P0$g r0 = (I0.P0.g) r0
            int r1 = r0.f7489h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f7489h = r1
            goto L_0x0018
        L_0x0013:
            I0.P0$g r0 = new I0.P0$g
            r0.<init>(r9, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f7487f
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f7489h
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x005c
            if (r2 == r5) goto L_0x0058
            if (r2 == r4) goto L_0x0045
            if (r2 != r3) goto L_0x003d
            float r10 = r0.f7486e
            java.lang.Object r11 = r0.f7485d
            java.util.Map r11 = (java.util.Map) r11
            java.lang.Object r0 = r0.f7484c
            I0.P0 r0 = (I0.P0) r0
            XH.y.b(r12)     // Catch:{ all -> 0x003a }
            goto L_0x0218
        L_0x003a:
            r12 = move-exception
            goto L_0x024a
        L_0x003d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0045:
            float r10 = r0.f7486e
            java.lang.Object r11 = r0.f7485d
            java.util.Map r11 = (java.util.Map) r11
            java.lang.Object r2 = r0.f7484c
            I0.P0 r2 = (I0.P0) r2
            XH.y.b(r12)     // Catch:{ CancellationException -> 0x0208 }
            goto L_0x01d1
        L_0x0054:
            r12 = move-exception
            r0 = r2
            goto L_0x024a
        L_0x0058:
            XH.y.b(r12)
            goto L_0x00a2
        L_0x005c:
            XH.y.b(r12)
            boolean r12 = r10.isEmpty()
            if (r12 == 0) goto L_0x00ad
            java.util.Set r10 = r11.keySet()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Float r10 = YH.C16877v.Q0(r10)
            kotlin.jvm.internal.C17542s.g(r10)
            float r10 = r10.floatValue()
            r9.f7456k = r10
            java.util.Set r10 = r11.keySet()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Float r10 = YH.C16877v.N0(r10)
            kotlin.jvm.internal.C17542s.g(r10)
            float r10 = r10.floatValue()
            r9.f7457l = r10
            java.lang.Object r10 = r9.o()
            java.lang.Float r10 = I0.O0.f(r11, r10)
            if (r10 == 0) goto L_0x00a5
            float r10 = r10.floatValue()
            r0.f7489h = r5
            java.lang.Object r10 = r9.H(r10, r0)
            if (r10 != r1) goto L_0x00a2
            return r1
        L_0x00a2:
            XH.N r10 = XH.C16807N.f139792a
            return r10
        L_0x00a5:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "The initial value must have an associated anchor."
            r10.<init>(r11)
            throw r10
        L_0x00ad:
            boolean r12 = kotlin.jvm.internal.C17542s.e(r11, r10)
            if (r12 != 0) goto L_0x027c
            r12 = -8388608(0xffffffffff800000, float:-Infinity)
            r9.f7456k = r12
            r12 = 2139095040(0x7f800000, float:Infinity)
            r9.f7457l = r12
            U0.r0<java.lang.Float> r12 = r9.f7453h
            java.lang.Object r12 = r12.getValue()
            java.lang.Float r12 = (java.lang.Float) r12
            r2 = 0
            if (r12 == 0) goto L_0x012f
            java.lang.Object r10 = r10.get(r12)
            java.lang.Float r10 = I0.O0.f(r11, r10)
            if (r10 == 0) goto L_0x00d6
            float r10 = r10.floatValue()
            goto L_0x01bf
        L_0x00d6:
            java.util.Set r10 = r11.keySet()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r5 = r10.iterator()
            boolean r10 = r5.hasNext()
            if (r10 != 0) goto L_0x00e7
            goto L_0x0124
        L_0x00e7:
            java.lang.Object r2 = r5.next()
            boolean r10 = r5.hasNext()
            if (r10 != 0) goto L_0x00f2
            goto L_0x0124
        L_0x00f2:
            r10 = r2
            java.lang.Number r10 = (java.lang.Number) r10
            float r10 = r10.floatValue()
            float r6 = r12.floatValue()
            float r10 = r10 - r6
            float r10 = java.lang.Math.abs(r10)
        L_0x0102:
            java.lang.Object r6 = r5.next()
            r7 = r6
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            float r8 = r12.floatValue()
            float r7 = r7 - r8
            float r7 = java.lang.Math.abs(r7)
            int r8 = java.lang.Float.compare(r10, r7)
            if (r8 <= 0) goto L_0x011e
            r2 = r6
            r10 = r7
        L_0x011e:
            boolean r6 = r5.hasNext()
            if (r6 != 0) goto L_0x0102
        L_0x0124:
            kotlin.jvm.internal.C17542s.g(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            float r10 = r2.floatValue()
            goto L_0x01bf
        L_0x012f:
            U0.A1 r12 = r9.t()
            java.lang.Object r12 = r12.getValue()
            java.lang.Object r10 = r10.get(r12)
            java.lang.Object r12 = r9.o()
            boolean r12 = kotlin.jvm.internal.C17542s.e(r10, r12)
            if (r12 == 0) goto L_0x0149
            java.lang.Object r10 = r9.o()
        L_0x0149:
            java.lang.Float r10 = I0.O0.f(r11, r10)
            if (r10 == 0) goto L_0x0154
            float r10 = r10.floatValue()
            goto L_0x01bf
        L_0x0154:
            java.util.Set r10 = r11.keySet()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
            boolean r12 = r10.hasNext()
            if (r12 != 0) goto L_0x0165
            goto L_0x01b6
        L_0x0165:
            java.lang.Object r2 = r10.next()
            boolean r12 = r10.hasNext()
            if (r12 != 0) goto L_0x0170
            goto L_0x01b6
        L_0x0170:
            r12 = r2
            java.lang.Number r12 = (java.lang.Number) r12
            float r12 = r12.floatValue()
            U0.A1 r5 = r9.t()
            java.lang.Object r5 = r5.getValue()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            float r12 = r12 - r5
            float r12 = java.lang.Math.abs(r12)
        L_0x018a:
            java.lang.Object r5 = r10.next()
            r6 = r5
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            U0.A1 r7 = r9.t()
            java.lang.Object r7 = r7.getValue()
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            float r6 = r6 - r7
            float r6 = java.lang.Math.abs(r6)
            int r7 = java.lang.Float.compare(r12, r6)
            if (r7 <= 0) goto L_0x01b0
            r2 = r5
            r12 = r6
        L_0x01b0:
            boolean r5 = r10.hasNext()
            if (r5 != 0) goto L_0x018a
        L_0x01b6:
            kotlin.jvm.internal.C17542s.g(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            float r10 = r2.floatValue()
        L_0x01bf:
            m0.i<java.lang.Float> r12 = r9.f7446a     // Catch:{ CancellationException -> 0x0207, all -> 0x0204 }
            r0.f7484c = r9     // Catch:{ CancellationException -> 0x0207, all -> 0x0204 }
            r0.f7485d = r11     // Catch:{ CancellationException -> 0x0207, all -> 0x0204 }
            r0.f7486e = r10     // Catch:{ CancellationException -> 0x0207, all -> 0x0204 }
            r0.f7489h = r4     // Catch:{ CancellationException -> 0x0207, all -> 0x0204 }
            java.lang.Object r12 = r9.h(r10, r12, r0)     // Catch:{ CancellationException -> 0x0207, all -> 0x0204 }
            if (r12 != r1) goto L_0x01d0
            return r1
        L_0x01d0:
            r2 = r9
        L_0x01d1:
            java.lang.Float r10 = kotlin.coroutines.jvm.internal.b.d(r10)
            java.lang.Object r10 = YH.X.k(r11, r10)
            r2.D(r10)
            java.util.Set r10 = r11.keySet()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Float r10 = YH.C16877v.Q0(r10)
            kotlin.jvm.internal.C17542s.g(r10)
            float r10 = r10.floatValue()
            r2.f7456k = r10
            java.util.Set r10 = r11.keySet()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Float r10 = YH.C16877v.N0(r10)
            kotlin.jvm.internal.C17542s.g(r10)
            float r10 = r10.floatValue()
            r2.f7457l = r10
            goto L_0x027c
        L_0x0204:
            r12 = move-exception
            r0 = r9
            goto L_0x024a
        L_0x0207:
            r2 = r9
        L_0x0208:
            r0.f7484c = r2     // Catch:{ all -> 0x0054 }
            r0.f7485d = r11     // Catch:{ all -> 0x0054 }
            r0.f7486e = r10     // Catch:{ all -> 0x0054 }
            r0.f7489h = r3     // Catch:{ all -> 0x0054 }
            java.lang.Object r12 = r2.H(r10, r0)     // Catch:{ all -> 0x0054 }
            if (r12 != r1) goto L_0x0217
            return r1
        L_0x0217:
            r0 = r2
        L_0x0218:
            java.lang.Float r10 = kotlin.coroutines.jvm.internal.b.d(r10)
            java.lang.Object r10 = YH.X.k(r11, r10)
            r0.D(r10)
            java.util.Set r10 = r11.keySet()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Float r10 = YH.C16877v.Q0(r10)
            kotlin.jvm.internal.C17542s.g(r10)
            float r10 = r10.floatValue()
            r0.f7456k = r10
            java.util.Set r10 = r11.keySet()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Float r10 = YH.C16877v.N0(r10)
            kotlin.jvm.internal.C17542s.g(r10)
            float r10 = r10.floatValue()
            r0.f7457l = r10
            goto L_0x027c
        L_0x024a:
            java.lang.Float r10 = kotlin.coroutines.jvm.internal.b.d(r10)
            java.lang.Object r10 = YH.X.k(r11, r10)
            r0.D(r10)
            java.util.Set r10 = r11.keySet()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Float r10 = YH.C16877v.Q0(r10)
            kotlin.jvm.internal.C17542s.g(r10)
            float r10 = r10.floatValue()
            r0.f7456k = r10
            java.util.Set r10 = r11.keySet()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Float r10 = YH.C16877v.N0(r10)
            kotlin.jvm.internal.C17542s.g(r10)
            float r10 = r10.floatValue()
            r0.f7457l = r10
            throw r12
        L_0x027c:
            XH.N r10 = XH.C16807N.f139792a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.P0.A(java.util.Map, java.util.Map, dI.e):java.lang.Object");
    }

    public final void B(Map<Float, ? extends T> map) {
        this.f7454i.setValue(map);
    }

    public final void E(C4582s0 s0Var) {
        this.f7460o.setValue(s0Var);
    }

    public final void F(p<? super Float, ? super Float, Float> pVar) {
        this.f7458m.setValue(pVar);
    }

    public final void G(float f10) {
        this.f7459n.n(f10);
    }

    public final Object i(T t10, C5546i<Float> iVar, C17164e<? super C16807N> eVar) {
        Object collect = this.f7455j.collect(new c(t10, this, iVar), eVar);
        return collect == C17187b.f() ? collect : C16807N.f139792a;
    }

    public final void k(Map<Float, ? extends T> map) {
        if (l().isEmpty()) {
            Float c10 = O0.f(map, o());
            if (c10 != null) {
                this.f7450e.n(c10.floatValue());
                this.f7452g.n(c10.floatValue());
                return;
            }
            throw new IllegalArgumentException("The initial value must have an associated anchor.");
        }
    }

    public final Map<Float, T> l() {
        return (Map) this.f7454i.getValue();
    }

    public final C5546i<Float> m() {
        return this.f7446a;
    }

    public final C17642l<T, Boolean> n() {
        return this.f7447b;
    }

    public final T o() {
        return this.f7448c.getValue();
    }

    public final float p() {
        Float c10 = O0.f(l(), o());
        if (c10 == null) {
            return 0.0f;
        }
        return Math.signum(t().getValue().floatValue() - c10.floatValue());
    }

    public final r q() {
        return this.f7461p;
    }

    public final float r() {
        return this.f7457l;
    }

    public final float s() {
        return this.f7456k;
    }

    public final A1<Float> t() {
        return this.f7450e;
    }

    public final M0<T> u() {
        Object obj;
        Object obj2;
        float f10;
        List b10 = O0.e(t().getValue().floatValue(), l().keySet());
        int size = b10.size();
        if (size == 0) {
            Object o10 = o();
            obj = o();
            obj2 = o10;
            f10 = 1.0f;
        } else if (size != 1) {
            v a10 = p() > 0.0f ? C16796C.a(b10.get(0), b10.get(1)) : C16796C.a(b10.get(1), b10.get(0));
            float floatValue = ((Number) a10.a()).floatValue();
            float floatValue2 = ((Number) a10.b()).floatValue();
            obj2 = X.k(l(), Float.valueOf(floatValue));
            obj = X.k(l(), Float.valueOf(floatValue2));
            f10 = (t().getValue().floatValue() - floatValue) / (floatValue2 - floatValue);
        } else {
            Object k10 = X.k(l(), b10.get(0));
            obj = X.k(l(), b10.get(0));
            f10 = 1.0f;
            obj2 = k10;
        }
        return new M0<>(obj2, obj, f10);
    }

    public final C4582s0 v() {
        return (C4582s0) this.f7460o.getValue();
    }

    public final p<Float, Float, Float> w() {
        return (p) this.f7458m.getValue();
    }

    public final float x() {
        return this.f7459n.a();
    }

    public final boolean y() {
        return ((Boolean) this.f7449d.getValue()).booleanValue();
    }

    public final Object z(float f10, C17164e<? super C16807N> eVar) {
        Object collect = this.f7455j.collect(new f(this, f10), eVar);
        return collect == C17187b.f() ? collect : C16807N.f139792a;
    }
}
