package androidx.compose.animation;

import E1.H;
import E1.J;
import E1.K;
import E1.X;
import E1.a0;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.o1;
import U0.p1;
import XH.C16807N;
import androidx.compose.animation.d;
import c2.n;
import c2.r;
import c2.s;
import c2.t;
import i1.C5437c;
import j0.N;
import j0.Y;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import l0.v;
import m0.B0;
import m0.C5548j;
import m0.C5556n;
import m0.v0;
import m0.w0;
import nI.C17642l;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002(,B'\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0014\u001a\u00020\u0011*\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J<\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00182\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ<\u0010\"\u001a\u00020!2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00182\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020\u0011H\u0001¢\u0006\u0004\b&\u0010'R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0000X\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\"\u0010\u0006\u001a\u00020\u00058\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010\b\u001a\u00020\u00078\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0014\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R1\u0010>\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u000b8@@@X\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R,\u0010D\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0@0?8\u0000X\u0004¢\u0006\f\n\u0004\b\"\u0010A\u001a\u0004\bB\u0010CR*\u0010J\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010@8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0018\u0010N\u001a\u00020K*\u00020\u00168BX\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0018\u0010P\u001a\u00020K*\u00020\u00168BX\u0004¢\u0006\u0006\u001a\u0004\bO\u0010MR\u001a\u0010\r\u001a\u00020\u000b8BX\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bQ\u0010;R\u0014\u0010T\u001a\u00028\u00008VX\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0014\u0010U\u001a\u00028\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010S\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006W²\u0006\u0014\u0010V\u001a\u00020K\"\u0004\b\u0000\u0010\u00018\n@\nX\u0002"}, d2 = {"Landroidx/compose/animation/e;", "S", "Landroidx/compose/animation/d;", "Lm0/v0;", "transition", "Li1/c;", "contentAlignment", "Lc2/t;", "layoutDirection", "<init>", "(Lm0/v0;Li1/c;Lc2/t;)V", "Lc2/r;", "fullSize", "currentSize", "Lc2/n;", "k", "(JJ)J", "Ll0/i;", "Ll0/v;", "sizeTransform", "c", "(Ll0/i;Ll0/v;)Ll0/i;", "Landroidx/compose/animation/d$a;", "towards", "Lm0/N;", "animationSpec", "Lkotlin/Function1;", "", "initialOffset", "Landroidx/compose/animation/i;", "f", "(ILm0/N;LnI/l;)Landroidx/compose/animation/i;", "targetOffset", "Landroidx/compose/animation/k;", "e", "(ILm0/N;LnI/l;)Landroidx/compose/animation/k;", "contentTransform", "Landroidx/compose/ui/d;", "l", "(Ll0/i;LU0/m;I)Landroidx/compose/ui/d;", "a", "Lm0/v0;", "s", "()Lm0/v0;", "b", "Li1/c;", "o", "()Li1/c;", "w", "(Li1/c;)V", "Lc2/t;", "getLayoutDirection$animation_release", "()Lc2/t;", "x", "(Lc2/t;)V", "<set-?>", "d", "LU0/r0;", "q", "()J", "y", "(J)V", "measuredSize", "Lj0/N;", "LU0/A1;", "Lj0/N;", "r", "()Lj0/N;", "targetSizeMap", "LU0/A1;", "getAnimatedSize$animation_release", "()LU0/A1;", "v", "(LU0/A1;)V", "animatedSize", "", "t", "(I)Z", "isLeft", "u", "isRight", "p", "g", "()Ljava/lang/Object;", "initialState", "targetState", "shouldAnimateSize", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e<S> implements d<S> {

    /* renamed from: a  reason: collision with root package name */
    private final v0<S> f17341a;

    /* renamed from: b  reason: collision with root package name */
    private C5437c f17342b;

    /* renamed from: c  reason: collision with root package name */
    private t f17343c;

    /* renamed from: d  reason: collision with root package name */
    private final C4899r0 f17344d = u1.e(r.b(r.f23053b.a()), (o1) null, 2, (Object) null);

    /* renamed from: e  reason: collision with root package name */
    private final N<S, A1<r>> f17345e = Y.d();

    /* renamed from: f  reason: collision with root package name */
    private A1<r> f17346f;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u0007*\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR+\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00028F@FX\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0005¨\u0006\u0011"}, d2 = {"Landroidx/compose/animation/e$a;", "LE1/X;", "", "isTarget", "<init>", "(Z)V", "Lc2/d;", "", "parentData", "K", "(Lc2/d;Ljava/lang/Object;)Ljava/lang/Object;", "<set-?>", "d", "LU0/r0;", "a", "()Z", "b", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements X {

        /* renamed from: d  reason: collision with root package name */
        private final C4899r0 f17347d;

        public a(boolean z10) {
            this.f17347d = u1.e(Boolean.valueOf(z10), (o1) null, 2, (Object) null);
        }

        public Object K(c2.d dVar, Object obj) {
            return this;
        }

        public final boolean a() {
            return ((Boolean) this.f17347d.getValue()).booleanValue();
        }

        public final void b(boolean z10) {
            this.f17347d.setValue(Boolean.valueOf(z10));
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0004\u0018\u00002\u00020\u0001B5\u0012\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002R\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0012\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R-\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002R\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"Landroidx/compose/animation/e$b;", "Ll0/r;", "Lm0/v0$a;", "Lc2/r;", "Lm0/n;", "Lm0/v0;", "sizeAnimation", "LU0/A1;", "Ll0/v;", "sizeTransform", "<init>", "(Landroidx/compose/animation/e;Lm0/v0$a;LU0/A1;)V", "LE1/K;", "LE1/H;", "measurable", "Lc2/b;", "constraints", "LE1/J;", "h", "(LE1/K;LE1/H;J)LE1/J;", "d", "Lm0/v0$a;", "getSizeAnimation", "()Lm0/v0$a;", "e", "LU0/A1;", "a", "()LU0/A1;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class b extends l0.r {

        /* renamed from: d  reason: collision with root package name */
        private final v0<S>.defpackage.a<r, C5556n> f17348d;

        /* renamed from: e  reason: collision with root package name */
        private final A1<v> f17349e;

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements C17642l<a0.a, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ e<S> f17351c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ a0 f17352d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ long f17353e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(e<S> eVar, a0 a0Var, long j10) {
                super(1);
                this.f17351c = eVar;
                this.f17352d = a0Var;
                this.f17353e = j10;
            }

            public final void a(a0.a aVar) {
                a0.a aVar2 = aVar;
                a0.a.k(aVar2, this.f17352d, this.f17351c.o().a(s.a(this.f17352d.E0(), this.f17352d.z0()), this.f17353e, t.Ltr), 0.0f, 2, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((a0.a) obj);
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"S", "Lm0/v0$b;", "Lm0/N;", "Lc2/r;", "a", "(Lm0/v0$b;)Lm0/N;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.animation.e$b$b  reason: collision with other inner class name */
        static final class C0240b extends C17544u implements C17642l<v0.b<S>, m0.N<r>> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ e<S> f17354c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ e<S>.defpackage.b f17355d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0240b(e<S> eVar, e<S>.defpackage.b bVar) {
                super(1);
                this.f17354c = eVar;
                this.f17355d = bVar;
            }

            /* renamed from: a */
            public final m0.N<r> invoke(v0.b<S> bVar) {
                m0.N<r> b10;
                A1 c10 = this.f17354c.r().c(bVar.g());
                long k10 = c10 != null ? ((r) c10.getValue()).k() : r.f23053b.a();
                A1 c11 = this.f17354c.r().c(bVar.a());
                long k11 = c11 != null ? ((r) c11.getValue()).k() : r.f23053b.a();
                v value = this.f17355d.a().getValue();
                return (value == null || (b10 = value.b(k10, k11)) == null) ? C5548j.h(0.0f, 0.0f, (Object) null, 7, (Object) null) : b10;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "it", "Lc2/r;", "a", "(Ljava/lang/Object;)J"}, k = 3, mv = {1, 8, 0})
        static final class c extends C17544u implements C17642l<S, r> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ e<S> f17356c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(e<S> eVar) {
                super(1);
                this.f17356c = eVar;
            }

            public final long a(S s10) {
                A1 c10 = this.f17356c.r().c(s10);
                return c10 != null ? ((r) c10.getValue()).k() : r.f23053b.a();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return r.b(a(obj));
            }
        }

        public b(v0<S>.defpackage.a<r, C5556n> aVar, A1<? extends v> a12) {
            this.f17348d = aVar;
            this.f17349e = a12;
        }

        public final A1<v> a() {
            return this.f17349e;
        }

        public J h(K k10, H h10, long j10) {
            a0 i02 = h10.i0(j10);
            A1<r> a10 = this.f17348d.a(new C0240b(e.this, this), new c(e.this));
            e.this.v(a10);
            long a11 = k10.A0() ? s.a(i02.E0(), i02.z0()) : a10.getValue().k();
            return K.v0(k10, r.h(a11), r.g(a11), (Map) null, new a(e.this, i02, a11), 4, (Object) null);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17642l<Integer, Integer> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<Integer, Integer> f17357c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e<S> f17358d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C17642l<? super Integer, Integer> lVar, e<S> eVar) {
            super(1);
            this.f17357c = lVar;
            this.f17358d = eVar;
        }

        public final Integer a(int i10) {
            return this.f17357c.invoke(Integer.valueOf(r.h(this.f17358d.p()) - n.h(this.f17358d.k(s.a(i10, i10), this.f17358d.p()))));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class d extends C17544u implements C17642l<Integer, Integer> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<Integer, Integer> f17359c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e<S> f17360d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C17642l<? super Integer, Integer> lVar, e<S> eVar) {
            super(1);
            this.f17359c = lVar;
            this.f17360d = eVar;
        }

        public final Integer a(int i10) {
            return this.f17359c.invoke(Integer.valueOf((-n.h(this.f17360d.k(s.a(i10, i10), this.f17360d.p()))) - i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.animation.e$e  reason: collision with other inner class name */
    static final class C0241e extends C17544u implements C17642l<Integer, Integer> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<Integer, Integer> f17361c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e<S> f17362d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0241e(C17642l<? super Integer, Integer> lVar, e<S> eVar) {
            super(1);
            this.f17361c = lVar;
            this.f17362d = eVar;
        }

        public final Integer a(int i10) {
            return this.f17361c.invoke(Integer.valueOf(r.g(this.f17362d.p()) - n.i(this.f17362d.k(s.a(i10, i10), this.f17362d.p()))));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class f extends C17544u implements C17642l<Integer, Integer> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<Integer, Integer> f17363c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e<S> f17364d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C17642l<? super Integer, Integer> lVar, e<S> eVar) {
            super(1);
            this.f17363c = lVar;
            this.f17364d = eVar;
        }

        public final Integer a(int i10) {
            return this.f17363c.invoke(Integer.valueOf((-n.i(this.f17364d.k(s.a(i10, i10), this.f17364d.p()))) - i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class g extends C17544u implements C17642l<Integer, Integer> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e<S> f17365c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<Integer, Integer> f17366d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(e<S> eVar, C17642l<? super Integer, Integer> lVar) {
            super(1);
            this.f17365c = eVar;
            this.f17366d = lVar;
        }

        public final Integer a(int i10) {
            A1 c10 = this.f17365c.r().c(this.f17365c.s().p());
            return this.f17366d.invoke(Integer.valueOf((-n.h(this.f17365c.k(s.a(i10, i10), c10 != null ? ((r) c10.getValue()).k() : r.f23053b.a()))) - i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class h extends C17544u implements C17642l<Integer, Integer> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e<S> f17367c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<Integer, Integer> f17368d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(e<S> eVar, C17642l<? super Integer, Integer> lVar) {
            super(1);
            this.f17367c = eVar;
            this.f17368d = lVar;
        }

        public final Integer a(int i10) {
            A1 c10 = this.f17367c.r().c(this.f17367c.s().p());
            long k10 = c10 != null ? ((r) c10.getValue()).k() : r.f23053b.a();
            return this.f17368d.invoke(Integer.valueOf((-n.h(this.f17367c.k(s.a(i10, i10), k10))) + r.h(k10)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class i extends C17544u implements C17642l<Integer, Integer> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e<S> f17369c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<Integer, Integer> f17370d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(e<S> eVar, C17642l<? super Integer, Integer> lVar) {
            super(1);
            this.f17369c = eVar;
            this.f17370d = lVar;
        }

        public final Integer a(int i10) {
            A1 c10 = this.f17369c.r().c(this.f17369c.s().p());
            return this.f17370d.invoke(Integer.valueOf((-n.i(this.f17369c.k(s.a(i10, i10), c10 != null ? ((r) c10.getValue()).k() : r.f23053b.a()))) - i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class j extends C17544u implements C17642l<Integer, Integer> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e<S> f17371c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<Integer, Integer> f17372d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(e<S> eVar, C17642l<? super Integer, Integer> lVar) {
            super(1);
            this.f17371c = eVar;
            this.f17372d = lVar;
        }

        public final Integer a(int i10) {
            A1 c10 = this.f17371c.r().c(this.f17371c.s().p());
            long k10 = c10 != null ? ((r) c10.getValue()).k() : r.f23053b.a();
            return this.f17372d.invoke(Integer.valueOf((-n.i(this.f17371c.k(s.a(i10, i10), k10))) + r.g(k10)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public e(v0<S> v0Var, C5437c cVar, t tVar) {
        this.f17341a = v0Var;
        this.f17342b = cVar;
        this.f17343c = tVar;
    }

    /* access modifiers changed from: private */
    public final long k(long j10, long j11) {
        return o().a(j10, j11, t.Ltr);
    }

    private static final boolean m(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    private static final void n(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public final long p() {
        A1<r> a12 = this.f17346f;
        return a12 != null ? a12.getValue().k() : q();
    }

    private final boolean t(int i10) {
        d.a.C0239a aVar = d.a.f17332a;
        return d.a.h(i10, aVar.c()) || (d.a.h(i10, aVar.e()) && this.f17343c == t.Ltr) || (d.a.h(i10, aVar.b()) && this.f17343c == t.Rtl);
    }

    private final boolean u(int i10) {
        d.a.C0239a aVar = d.a.f17332a;
        return d.a.h(i10, aVar.d()) || (d.a.h(i10, aVar.e()) && this.f17343c == t.Rtl) || (d.a.h(i10, aVar.b()) && this.f17343c == t.Ltr);
    }

    public S a() {
        return this.f17341a.n().a();
    }

    public l0.i c(l0.i iVar, v vVar) {
        iVar.e(vVar);
        return iVar;
    }

    public k e(int i10, m0.N<n> n10, C17642l<? super Integer, Integer> lVar) {
        if (t(i10)) {
            return g.H(n10, new g(this, lVar));
        }
        if (u(i10)) {
            return g.H(n10, new h(this, lVar));
        }
        d.a.C0239a aVar = d.a.f17332a;
        return d.a.h(i10, aVar.f()) ? g.J(n10, new i(this, lVar)) : d.a.h(i10, aVar.a()) ? g.J(n10, new j(this, lVar)) : k.f17452a.a();
    }

    public i f(int i10, m0.N<n> n10, C17642l<? super Integer, Integer> lVar) {
        if (t(i10)) {
            return g.C(n10, new c(lVar, this));
        }
        if (u(i10)) {
            return g.C(n10, new d(lVar, this));
        }
        d.a.C0239a aVar = d.a.f17332a;
        return d.a.h(i10, aVar.f()) ? g.E(n10, new C0241e(lVar, this)) : d.a.h(i10, aVar.a()) ? g.E(n10, new f(lVar, this)) : i.f17449a.a();
    }

    public S g() {
        return this.f17341a.n().g();
    }

    public final androidx.compose.ui.d l(l0.i iVar, C4889m mVar, int i10) {
        androidx.compose.ui.d dVar;
        if (C4895p.J()) {
            C4895p.S(93755870, i10, -1, "androidx.compose.animation.AnimatedContentTransitionScopeImpl.createSizeAnimationModifier (AnimatedContent.kt:573)");
        }
        boolean V10 = mVar.V(this);
        Object D10 = mVar.D();
        if (V10 || D10 == C4889m.f14007a.a()) {
            D10 = u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
            mVar.u(D10);
        }
        C4899r0 r0Var = (C4899r0) D10;
        A1 q10 = p1.q(iVar.b(), mVar, 0);
        if (C17542s.e(this.f17341a.i(), this.f17341a.p())) {
            n(r0Var, false);
        } else if (q10.getValue() != null) {
            n(r0Var, true);
        }
        if (m(r0Var)) {
            mVar.W(249037309);
            v0.a<r, C5556n> c10 = w0.c(this.f17341a, B0.e(r.f23053b), (String) null, mVar, 0, 2);
            boolean V11 = mVar.V(c10);
            Object D11 = mVar.D();
            if (V11 || D11 == C4889m.f14007a.a()) {
                v vVar = (v) q10.getValue();
                D11 = ((vVar == null || vVar.a()) ? m1.e.b(androidx.compose.ui.d.f18749a) : androidx.compose.ui.d.f18749a).s(new b(c10, q10));
                mVar.u(D11);
            }
            dVar = (androidx.compose.ui.d) D11;
            mVar.P();
        } else {
            mVar.W(249353726);
            mVar.P();
            this.f17346f = null;
            dVar = androidx.compose.ui.d.f18749a;
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        return dVar;
    }

    public C5437c o() {
        return this.f17342b;
    }

    public final long q() {
        return ((r) this.f17344d.getValue()).k();
    }

    public final N<S, A1<r>> r() {
        return this.f17345e;
    }

    public final v0<S> s() {
        return this.f17341a;
    }

    public final void v(A1<r> a12) {
        this.f17346f = a12;
    }

    public void w(C5437c cVar) {
        this.f17342b = cVar;
    }

    public final void x(t tVar) {
        this.f17343c = tVar;
    }

    public final void y(long j10) {
        this.f17344d.setValue(r.b(j10));
    }
}
