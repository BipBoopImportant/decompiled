package androidx.compose.animation;

import E1.H;
import E1.J;
import E1.K;
import E1.a0;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.L;
import U0.M;
import U0.M0;
import U0.P;
import XH.C16807N;
import c2.C5267b;
import g1.C5353v;
import i1.C5437c;
import j0.N;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.C5507b;
import l0.i;
import l0.k;
import l0.v;
import m0.C5525D;
import m0.C5548j;
import m0.C5559o0;
import m0.P0;
import m0.v0;
import nI.C17642l;
import nI.p;
import nI.q;
import nI.r;

@Metadata(d1 = {"\u0000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0001\u0010\u0012\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00042\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a9\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u0015\u001a\u00020\u00142 \b\u0002\u0010\u0018\u001a\u001a\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00170\u000e¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001c\u0010\u001f\u001a\u00020\u0006*\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001dH\u0004¢\u0006\u0004\b\u001f\u0010 \u001a\u0001\u0010\"\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000!2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00042\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u000eH\u0007¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"S", "targetState", "Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function1;", "Landroidx/compose/animation/d;", "Ll0/i;", "transitionSpec", "Li1/c;", "contentAlignment", "", "label", "", "contentKey", "Lkotlin/Function2;", "Ll0/b;", "LXH/N;", "content", "a", "(Ljava/lang/Object;Landroidx/compose/ui/d;LnI/l;Li1/c;Ljava/lang/String;LnI/l;LnI/r;LU0/m;II)V", "", "clip", "Lc2/r;", "Lm0/N;", "sizeAnimationSpec", "Ll0/v;", "c", "(ZLnI/p;)Ll0/v;", "Landroidx/compose/animation/i;", "Landroidx/compose/animation/k;", "exit", "e", "(Landroidx/compose/animation/i;Landroidx/compose/animation/k;)Ll0/i;", "Lm0/v0;", "b", "(Lm0/v0;Landroidx/compose/ui/d;LnI/l;Li1/c;LnI/l;LnI/r;LU0/m;II)V", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.animation.a$a  reason: collision with other inner class name */
    static final class C0234a extends C17544u implements C17642l<d<S>, i> {

        /* renamed from: c  reason: collision with root package name */
        public static final C0234a f17283c = new C0234a();

        C0234a() {
            super(1);
        }

        /* renamed from: a */
        public final i invoke(d<S> dVar) {
            return a.e(g.o(C5548j.j(220, 90, (C5525D) null, 4, (Object) null), 0.0f, 2, (Object) null).c(g.s(C5548j.j(220, 90, (C5525D) null, 4, (Object) null), 0.92f, 0, 4, (Object) null)), g.q(C5548j.j(90, 0, (C5525D) null, 6, (Object) null), 0.0f, 2, (Object) null));
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends C17544u implements C17642l<S, S> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f17284c = new b();

        b() {
            super(1);
        }

        public final S invoke(S s10) {
            return s10;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ S f17285c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f17286d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<d<S>, i> f17287e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C5437c f17288f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f17289g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17642l<S, Object> f17290h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ r<C5507b, S, C4889m, Integer, C16807N> f17291i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f17292j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f17293k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(S s10, androidx.compose.ui.d dVar, C17642l<? super d<S>, i> lVar, C5437c cVar, String str, C17642l<? super S, ? extends Object> lVar2, r<? super C5507b, ? super S, ? super C4889m, ? super Integer, C16807N> rVar, int i10, int i11) {
            super(2);
            this.f17285c = s10;
            this.f17286d = dVar;
            this.f17287e = lVar;
            this.f17288f = cVar;
            this.f17289g = str;
            this.f17290h = lVar2;
            this.f17291i = rVar;
            this.f17292j = i10;
            this.f17293k = i11;
        }

        public final void a(C4889m mVar, int i10) {
            a.a(this.f17285c, this.f17286d, this.f17287e, this.f17288f, this.f17289g, this.f17290h, this.f17291i, mVar, M0.a(this.f17292j | 1), this.f17293k);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends C17544u implements C17642l<d<S>, i> {

        /* renamed from: c  reason: collision with root package name */
        public static final d f17294c = new d();

        d() {
            super(1);
        }

        /* renamed from: a */
        public final i invoke(d<S> dVar) {
            return a.e(g.o(C5548j.j(220, 90, (C5525D) null, 4, (Object) null), 0.0f, 2, (Object) null).c(g.s(C5548j.j(220, 90, (C5525D) null, 4, (Object) null), 0.92f, 0, 4, (Object) null)), g.q(C5548j.j(90, 0, (C5525D) null, 6, (Object) null), 0.0f, 2, (Object) null));
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends C17544u implements C17642l<S, S> {

        /* renamed from: c  reason: collision with root package name */
        public static final e f17295c = new e();

        e() {
            super(1);
        }

        public final S invoke(S s10) {
            return s10;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"S", "LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ v0<S> f17296c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ S f17297d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<d<S>, i> f17298e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e<S> f17299f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C5353v<S> f17300g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ r<C5507b, S, C4889m, Integer, C16807N> f17301h;

        @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"S", "LE1/K;", "LE1/H;", "measurable", "Lc2/b;", "constraints", "LE1/J;", "a", "(LE1/K;LE1/H;J)LE1/J;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.animation.a$f$a  reason: collision with other inner class name */
        static final class C0235a extends C17544u implements q<K, H, C5267b, J> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ i f17302c;

            @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.animation.a$f$a$a  reason: collision with other inner class name */
            static final class C0236a extends C17544u implements C17642l<a0.a, C16807N> {

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ a0 f17303c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ i f17304d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0236a(a0 a0Var, i iVar) {
                    super(1);
                    this.f17303c = a0Var;
                    this.f17304d = iVar;
                }

                public final void a(a0.a aVar) {
                    aVar.h(this.f17303c, 0, 0, this.f17304d.d());
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((a0.a) obj);
                    return C16807N.f139792a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0235a(i iVar) {
                super(3);
                this.f17302c = iVar;
            }

            public final J a(K k10, H h10, long j10) {
                a0 i02 = h10.i0(j10);
                return K.v0(k10, i02.E0(), i02.z0(), (Map) null, new C0236a(i02, this.f17302c), 4, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return a((K) obj, (H) obj2, ((C5267b) obj3).r());
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        static final class b extends C17544u implements C17642l<S, Boolean> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ S f17305c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(S s10) {
                super(1);
                this.f17305c = s10;
            }

            /* renamed from: a */
            public final Boolean invoke(S s10) {
                return Boolean.valueOf(C17542s.e(s10, this.f17305c));
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"S", "Ll0/k;", "currentState", "targetState", "", "a", "(Ll0/k;Ll0/k;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        static final class c extends C17544u implements p<k, k, Boolean> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ k f17306c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(k kVar) {
                super(2);
                this.f17306c = kVar;
            }

            /* renamed from: a */
            public final Boolean invoke(k kVar, k kVar2) {
                k kVar3 = k.PostExit;
                return Boolean.valueOf(kVar == kVar3 && kVar2 == kVar3 && !this.f17306c.b().d());
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "Ll0/e;", "LXH/N;", "a", "(Ll0/e;LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
        static final class d extends C17544u implements q<l0.e, C4889m, Integer, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C5353v<S> f17307c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ S f17308d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ e<S> f17309e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ r<C5507b, S, C4889m, Integer, C16807N> f17310f;

            @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "LU0/M;", "LU0/L;", "a", "(LU0/M;)LU0/L;"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.animation.a$f$d$a  reason: collision with other inner class name */
            static final class C0237a extends C17544u implements C17642l<M, L> {

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ C5353v<S> f17311c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ S f17312d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ e<S> f17313e;

                @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/animation/a$f$d$a$a", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                /* renamed from: androidx.compose.animation.a$f$d$a$a  reason: collision with other inner class name */
                public static final class C0238a implements L {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ C5353v f17314a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ Object f17315b;

                    /* renamed from: c  reason: collision with root package name */
                    final /* synthetic */ e f17316c;

                    public C0238a(C5353v vVar, Object obj, e eVar) {
                        this.f17314a = vVar;
                        this.f17315b = obj;
                        this.f17316c = eVar;
                    }

                    public void b() {
                        this.f17314a.remove(this.f17315b);
                        this.f17316c.r().p(this.f17315b);
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0237a(C5353v<S> vVar, S s10, e<S> eVar) {
                    super(1);
                    this.f17311c = vVar;
                    this.f17312d = s10;
                    this.f17313e = eVar;
                }

                /* renamed from: a */
                public final L invoke(M m10) {
                    return new C0238a(this.f17311c, this.f17312d, this.f17313e);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(C5353v<S> vVar, S s10, e<S> eVar, r<? super C5507b, ? super S, ? super C4889m, ? super Integer, C16807N> rVar) {
                super(3);
                this.f17307c = vVar;
                this.f17308d = s10;
                this.f17309e = eVar;
                this.f17310f = rVar;
            }

            public final void a(l0.e eVar, C4889m mVar, int i10) {
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? mVar.V(eVar) : mVar.F(eVar) ? 4 : 2;
                }
                if ((i10 & 19) != 18 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-616195562, i10, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:793)");
                    }
                    boolean V10 = mVar.V(this.f17307c) | mVar.F(this.f17308d) | mVar.F(this.f17309e);
                    C5353v<S> vVar = this.f17307c;
                    S s10 = this.f17308d;
                    e<S> eVar2 = this.f17309e;
                    Object D10 = mVar.D();
                    if (V10 || D10 == C4889m.f14007a.a()) {
                        D10 = new C0237a(vVar, s10, eVar2);
                        mVar.u(D10);
                    }
                    P.c(eVar, (C17642l) D10, mVar, i10 & 14);
                    N<S, A1<c2.r>> r10 = this.f17309e.r();
                    S s11 = this.f17308d;
                    C17542s.h(eVar, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                    r10.s(s11, ((l0.f) eVar).a());
                    Object D11 = mVar.D();
                    if (D11 == C4889m.f14007a.a()) {
                        D11 = new c(eVar);
                        mVar.u(D11);
                    }
                    this.f17310f.l((c) D11, this.f17308d, mVar, 0);
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                mVar.L();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a((l0.e) obj, (C4889m) obj2, ((Number) obj3).intValue());
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(v0<S> v0Var, S s10, C17642l<? super d<S>, i> lVar, e<S> eVar, C5353v<S> vVar, r<? super C5507b, ? super S, ? super C4889m, ? super Integer, C16807N> rVar) {
            super(2);
            this.f17296c = v0Var;
            this.f17297d = s10;
            this.f17298e = lVar;
            this.f17299f = eVar;
            this.f17300g = vVar;
            this.f17301h = rVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: nI.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: nI.p} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(U0.C4889m r13, int r14) {
            /*
                r12 = this;
                r1 = r14 & 3
                r2 = 2
                if (r1 != r2) goto L_0x0011
                boolean r1 = r13.l()
                if (r1 != 0) goto L_0x000c
                goto L_0x0011
            L_0x000c:
                r13.L()
                goto L_0x0149
            L_0x0011:
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x0020
                r1 = -1
                java.lang.String r2 = "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:757)"
                r3 = 885640742(0x34c9ce26, float:3.758916E-7)
                U0.C4895p.S(r3, r14, r1, r2)
            L_0x0020:
                nI.l<androidx.compose.animation.d<S>, l0.i> r0 = r12.f17298e
                androidx.compose.animation.e<S> r1 = r12.f17299f
                java.lang.Object r2 = r13.D()
                U0.m$a r3 = U0.C4889m.f14007a
                java.lang.Object r4 = r3.a()
                if (r2 != r4) goto L_0x003a
                java.lang.Object r0 = r0.invoke(r1)
                r2 = r0
                l0.i r2 = (l0.i) r2
                r13.u(r2)
            L_0x003a:
                l0.i r2 = (l0.i) r2
                m0.v0<S> r0 = r12.f17296c
                m0.v0$b r0 = r0.n()
                java.lang.Object r0 = r0.a()
                S r1 = r12.f17297d
                boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r1)
                boolean r0 = r13.b(r0)
                m0.v0<S> r1 = r12.f17296c
                S r4 = r12.f17297d
                nI.l<androidx.compose.animation.d<S>, l0.i> r5 = r12.f17298e
                androidx.compose.animation.e<S> r6 = r12.f17299f
                java.lang.Object r7 = r13.D()
                if (r0 != 0) goto L_0x0064
                java.lang.Object r0 = r3.a()
                if (r7 != r0) goto L_0x0088
            L_0x0064:
                m0.v0$b r0 = r1.n()
                java.lang.Object r0 = r0.a()
                boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r4)
                if (r0 == 0) goto L_0x007a
                androidx.compose.animation.k$a r0 = androidx.compose.animation.k.f17452a
                androidx.compose.animation.k r0 = r0.a()
            L_0x0078:
                r7 = r0
                goto L_0x0085
            L_0x007a:
                java.lang.Object r0 = r5.invoke(r6)
                l0.i r0 = (l0.i) r0
                androidx.compose.animation.k r0 = r0.a()
                goto L_0x0078
            L_0x0085:
                r13.u(r7)
            L_0x0088:
                r4 = r7
                androidx.compose.animation.k r4 = (androidx.compose.animation.k) r4
                S r0 = r12.f17297d
                m0.v0<S> r1 = r12.f17296c
                java.lang.Object r5 = r13.D()
                java.lang.Object r6 = r3.a()
                if (r5 != r6) goto L_0x00a9
                androidx.compose.animation.e$a r5 = new androidx.compose.animation.e$a
                java.lang.Object r1 = r1.p()
                boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r1)
                r5.<init>(r0)
                r13.u(r5)
            L_0x00a9:
                androidx.compose.animation.e$a r5 = (androidx.compose.animation.e.a) r5
                androidx.compose.animation.i r6 = r2.c()
                androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
                boolean r1 = r13.F(r2)
                java.lang.Object r7 = r13.D()
                if (r1 != 0) goto L_0x00c1
                java.lang.Object r1 = r3.a()
                if (r7 != r1) goto L_0x00c9
            L_0x00c1:
                androidx.compose.animation.a$f$a r7 = new androidx.compose.animation.a$f$a
                r7.<init>(r2)
                r13.u(r7)
            L_0x00c9:
                nI.q r7 = (nI.q) r7
                androidx.compose.ui.d r0 = androidx.compose.ui.layout.b.a(r0, r7)
                S r1 = r12.f17297d
                m0.v0<S> r2 = r12.f17296c
                java.lang.Object r2 = r2.p()
                boolean r1 = kotlin.jvm.internal.C17542s.e(r1, r2)
                r5.b(r1)
                androidx.compose.ui.d r2 = r0.s(r5)
                m0.v0<S> r0 = r12.f17296c
                S r1 = r12.f17297d
                boolean r1 = r13.F(r1)
                S r5 = r12.f17297d
                java.lang.Object r7 = r13.D()
                if (r1 != 0) goto L_0x00f8
                java.lang.Object r1 = r3.a()
                if (r7 != r1) goto L_0x0100
            L_0x00f8:
                androidx.compose.animation.a$f$b r7 = new androidx.compose.animation.a$f$b
                r7.<init>(r5)
                r13.u(r7)
            L_0x0100:
                r1 = r7
                nI.l r1 = (nI.C17642l) r1
                boolean r5 = r13.V(r4)
                java.lang.Object r7 = r13.D()
                if (r5 != 0) goto L_0x0113
                java.lang.Object r3 = r3.a()
                if (r7 != r3) goto L_0x011b
            L_0x0113:
                androidx.compose.animation.a$f$c r7 = new androidx.compose.animation.a$f$c
                r7.<init>(r4)
                r13.u(r7)
            L_0x011b:
                r5 = r7
                nI.p r5 = (nI.p) r5
                androidx.compose.animation.a$f$d r3 = new androidx.compose.animation.a$f$d
                g1.v<S> r7 = r12.f17300g
                S r9 = r12.f17297d
                androidx.compose.animation.e<S> r10 = r12.f17299f
                nI.r<l0.b, S, U0.m, java.lang.Integer, XH.N> r11 = r12.f17301h
                r3.<init>(r7, r9, r10, r11)
                r7 = 54
                r9 = -616195562(0xffffffffdb459a16, float:-5.561999E16)
                r10 = 1
                c1.a r7 = c1.c.e(r9, r10, r3, r13, r7)
                r9 = 12582912(0xc00000, float:1.7632415E-38)
                r10 = 64
                r11 = 0
                r3 = r6
                r6 = r11
                r8 = r13
                l0.d.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x0149
                U0.C4895p.R()
            L_0x0149:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.a.f.a(U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ v0<S> f17317c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f17318d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<d<S>, i> f17319e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C5437c f17320f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17642l<S, Object> f17321g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ r<C5507b, S, C4889m, Integer, C16807N> f17322h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f17323i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f17324j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(v0<S> v0Var, androidx.compose.ui.d dVar, C17642l<? super d<S>, i> lVar, C5437c cVar, C17642l<? super S, ? extends Object> lVar2, r<? super C5507b, ? super S, ? super C4889m, ? super Integer, C16807N> rVar, int i10, int i11) {
            super(2);
            this.f17317c = v0Var;
            this.f17318d = dVar;
            this.f17319e = lVar;
            this.f17320f = cVar;
            this.f17321g = lVar2;
            this.f17322h = rVar;
            this.f17323i = i10;
            this.f17324j = i11;
        }

        public final void a(C4889m mVar, int i10) {
            a.b(this.f17317c, this.f17318d, this.f17319e, this.f17320f, this.f17321g, this.f17322h, mVar, M0.a(this.f17323i | 1), this.f17324j);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc2/r;", "<anonymous parameter 0>", "<anonymous parameter 1>", "Lm0/o0;", "a", "(JJ)Lm0/o0;"}, k = 3, mv = {1, 8, 0})
    static final class h extends C17544u implements p<c2.r, c2.r, C5559o0<c2.r>> {

        /* renamed from: c  reason: collision with root package name */
        public static final h f17325c = new h();

        h() {
            super(2);
        }

        public final C5559o0<c2.r> a(long j10, long j11) {
            return C5548j.h(0.0f, 400.0f, c2.r.b(P0.d(c2.r.f23053b)), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((c2.r) obj).k(), ((c2.r) obj2).k());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S> void a(S r18, androidx.compose.ui.d r19, nI.C17642l<? super androidx.compose.animation.d<S>, l0.i> r20, i1.C5437c r21, java.lang.String r22, nI.C17642l<? super S, ? extends java.lang.Object> r23, nI.r<? super l0.C5507b, ? super S, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r24, U0.C4889m r25, int r26, int r27) {
        /*
            r1 = r18
            r8 = r26
            r0 = 2132720749(0x7f1ebc6d, float:2.1099639E38)
            r2 = r25
            U0.m r2 = r2.k(r0)
            r3 = r27 & 1
            if (r3 == 0) goto L_0x0014
            r3 = r8 | 6
            goto L_0x002d
        L_0x0014:
            r3 = r8 & 6
            if (r3 != 0) goto L_0x002c
            r3 = r8 & 8
            if (r3 != 0) goto L_0x0021
            boolean r3 = r2.V(r1)
            goto L_0x0025
        L_0x0021:
            boolean r3 = r2.F(r1)
        L_0x0025:
            if (r3 == 0) goto L_0x0029
            r3 = 4
            goto L_0x002a
        L_0x0029:
            r3 = 2
        L_0x002a:
            r3 = r3 | r8
            goto L_0x002d
        L_0x002c:
            r3 = r8
        L_0x002d:
            r4 = r27 & 2
            if (r4 == 0) goto L_0x0036
            r3 = r3 | 48
        L_0x0033:
            r5 = r19
            goto L_0x0048
        L_0x0036:
            r5 = r8 & 48
            if (r5 != 0) goto L_0x0033
            r5 = r19
            boolean r6 = r2.V(r5)
            if (r6 == 0) goto L_0x0045
            r6 = 32
            goto L_0x0047
        L_0x0045:
            r6 = 16
        L_0x0047:
            r3 = r3 | r6
        L_0x0048:
            r6 = r27 & 4
            if (r6 == 0) goto L_0x0051
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004e:
            r7 = r20
            goto L_0x0063
        L_0x0051:
            r7 = r8 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x004e
            r7 = r20
            boolean r9 = r2.F(r7)
            if (r9 == 0) goto L_0x0060
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r3 = r3 | r9
        L_0x0063:
            r9 = r27 & 8
            if (r9 == 0) goto L_0x006c
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0069:
            r10 = r21
            goto L_0x007e
        L_0x006c:
            r10 = r8 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0069
            r10 = r21
            boolean r11 = r2.V(r10)
            if (r11 == 0) goto L_0x007b
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r3 = r3 | r11
        L_0x007e:
            r11 = r27 & 16
            if (r11 == 0) goto L_0x0087
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0084:
            r12 = r22
            goto L_0x0099
        L_0x0087:
            r12 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0084
            r12 = r22
            boolean r13 = r2.V(r12)
            if (r13 == 0) goto L_0x0096
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0098
        L_0x0096:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0098:
            r3 = r3 | r13
        L_0x0099:
            r13 = r27 & 32
            r14 = 196608(0x30000, float:2.75506E-40)
            if (r13 == 0) goto L_0x00a3
            r3 = r3 | r14
        L_0x00a0:
            r14 = r23
            goto L_0x00b4
        L_0x00a3:
            r14 = r14 & r8
            if (r14 != 0) goto L_0x00a0
            r14 = r23
            boolean r15 = r2.F(r14)
            if (r15 == 0) goto L_0x00b1
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b3
        L_0x00b1:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00b3:
            r3 = r3 | r15
        L_0x00b4:
            r15 = r27 & 64
            r16 = 1572864(0x180000, float:2.204052E-39)
            if (r15 == 0) goto L_0x00bf
            r3 = r3 | r16
        L_0x00bc:
            r15 = r24
            goto L_0x00d2
        L_0x00bf:
            r15 = r8 & r16
            if (r15 != 0) goto L_0x00bc
            r15 = r24
            boolean r16 = r2.F(r15)
            if (r16 == 0) goto L_0x00ce
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d0
        L_0x00ce:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d0:
            r3 = r3 | r16
        L_0x00d2:
            r16 = 599187(0x92493, float:8.3964E-40)
            r0 = r3 & r16
            r5 = 599186(0x92492, float:8.39638E-40)
            if (r0 != r5) goto L_0x00ed
            boolean r0 = r2.l()
            if (r0 != 0) goto L_0x00e3
            goto L_0x00ed
        L_0x00e3:
            r2.L()
            r3 = r19
            r4 = r10
            r5 = r12
            r6 = r14
            goto L_0x014e
        L_0x00ed:
            if (r4 == 0) goto L_0x00f2
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x00f4
        L_0x00f2:
            r0 = r19
        L_0x00f4:
            if (r6 == 0) goto L_0x00f9
            androidx.compose.animation.a$a r4 = androidx.compose.animation.a.C0234a.f17283c
            r7 = r4
        L_0x00f9:
            if (r9 == 0) goto L_0x0102
            i1.c$a r4 = i1.C5437c.f24302a
            i1.c r4 = r4.o()
            goto L_0x0103
        L_0x0102:
            r4 = r10
        L_0x0103:
            if (r11 == 0) goto L_0x0108
            java.lang.String r5 = "AnimatedContent"
            goto L_0x0109
        L_0x0108:
            r5 = r12
        L_0x0109:
            if (r13 == 0) goto L_0x010e
            androidx.compose.animation.a$b r6 = androidx.compose.animation.a.b.f17284c
            goto L_0x010f
        L_0x010e:
            r6 = r14
        L_0x010f:
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x011e
            r9 = -1
            java.lang.String r10 = "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)"
            r11 = 2132720749(0x7f1ebc6d, float:2.1099639E38)
            U0.C4895p.S(r11, r3, r9, r10)
        L_0x011e:
            r9 = r3 & 14
            int r10 = r3 >> 9
            r10 = r10 & 112(0x70, float:1.57E-43)
            r9 = r9 | r10
            r10 = 0
            m0.v0 r9 = m0.w0.g(r1, r5, r2, r9, r10)
            r10 = r3 & 8176(0x1ff0, float:1.1457E-41)
            int r3 = r3 >> 3
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r3
            r10 = r10 | r11
            r11 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r11
            r16 = r10 | r3
            r17 = 0
            r10 = r0
            r11 = r7
            r12 = r4
            r13 = r6
            r14 = r24
            r15 = r2
            b(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x014d
            U0.C4895p.R()
        L_0x014d:
            r3 = r0
        L_0x014e:
            U0.Y0 r10 = r2.n()
            if (r10 == 0) goto L_0x0167
            androidx.compose.animation.a$c r11 = new androidx.compose.animation.a$c
            r0 = r11
            r1 = r18
            r2 = r3
            r3 = r7
            r7 = r24
            r8 = r26
            r9 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x0167:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.a.a(java.lang.Object, androidx.compose.ui.d, nI.l, i1.c, java.lang.String, nI.l, nI.r, U0.m, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: androidx.compose.animation.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: androidx.compose.animation.a$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: androidx.compose.animation.a$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S> void b(m0.v0<S> r20, androidx.compose.ui.d r21, nI.C17642l<? super androidx.compose.animation.d<S>, l0.i> r22, i1.C5437c r23, nI.C17642l<? super S, ? extends java.lang.Object> r24, nI.r<? super l0.C5507b, ? super S, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r25, U0.C4889m r26, int r27, int r28) {
        /*
            r7 = r20
            r8 = r27
            r0 = -114689412(0xfffffffff929fa7c, float:-5.516116E34)
            r1 = r26
            U0.m r9 = r1.k(r0)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r28 & r1
            if (r1 == 0) goto L_0x0016
            r1 = r8 | 6
            goto L_0x0026
        L_0x0016:
            r1 = r8 & 6
            if (r1 != 0) goto L_0x0025
            boolean r1 = r9.V(r7)
            if (r1 == 0) goto L_0x0022
            r1 = 4
            goto L_0x0023
        L_0x0022:
            r1 = 2
        L_0x0023:
            r1 = r1 | r8
            goto L_0x0026
        L_0x0025:
            r1 = r8
        L_0x0026:
            r3 = r28 & 1
            if (r3 == 0) goto L_0x002f
            r1 = r1 | 48
        L_0x002c:
            r4 = r21
            goto L_0x0041
        L_0x002f:
            r4 = r8 & 48
            if (r4 != 0) goto L_0x002c
            r4 = r21
            boolean r5 = r9.V(r4)
            if (r5 == 0) goto L_0x003e
            r5 = 32
            goto L_0x0040
        L_0x003e:
            r5 = 16
        L_0x0040:
            r1 = r1 | r5
        L_0x0041:
            r5 = r28 & 2
            if (r5 == 0) goto L_0x004a
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0047:
            r6 = r22
            goto L_0x005c
        L_0x004a:
            r6 = r8 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0047
            r6 = r22
            boolean r10 = r9.F(r6)
            if (r10 == 0) goto L_0x0059
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0059:
            r10 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r1 = r1 | r10
        L_0x005c:
            r10 = r28 & 4
            if (r10 == 0) goto L_0x0065
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0062:
            r11 = r23
            goto L_0x0077
        L_0x0065:
            r11 = r8 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x0062
            r11 = r23
            boolean r12 = r9.V(r11)
            if (r12 == 0) goto L_0x0074
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0076
        L_0x0074:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0076:
            r1 = r1 | r12
        L_0x0077:
            r12 = r28 & 8
            if (r12 == 0) goto L_0x0080
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x007d:
            r13 = r24
            goto L_0x0092
        L_0x0080:
            r13 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x007d
            r13 = r24
            boolean r14 = r9.F(r13)
            if (r14 == 0) goto L_0x008f
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0091
        L_0x008f:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0091:
            r1 = r1 | r14
        L_0x0092:
            r14 = r28 & 16
            r15 = 196608(0x30000, float:2.75506E-40)
            if (r14 == 0) goto L_0x009c
            r1 = r1 | r15
        L_0x0099:
            r14 = r25
            goto L_0x00ae
        L_0x009c:
            r14 = r8 & r15
            if (r14 != 0) goto L_0x0099
            r14 = r25
            boolean r15 = r9.F(r14)
            if (r15 == 0) goto L_0x00ab
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ad
        L_0x00ab:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00ad:
            r1 = r1 | r15
        L_0x00ae:
            r15 = 74899(0x12493, float:1.04956E-40)
            r15 = r15 & r1
            r2 = 74898(0x12492, float:1.04954E-40)
            if (r15 != r2) goto L_0x00c7
            boolean r2 = r9.l()
            if (r2 != 0) goto L_0x00be
            goto L_0x00c7
        L_0x00be:
            r9.L()
            r2 = r4
            r3 = r6
            r4 = r11
            r5 = r13
            goto L_0x0396
        L_0x00c7:
            if (r3 == 0) goto L_0x00cd
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r15 = r2
            goto L_0x00ce
        L_0x00cd:
            r15 = r4
        L_0x00ce:
            if (r5 == 0) goto L_0x00d3
            androidx.compose.animation.a$d r2 = androidx.compose.animation.a.d.f17294c
            r6 = r2
        L_0x00d3:
            if (r10 == 0) goto L_0x00dc
            i1.c$a r2 = i1.C5437c.f24302a
            i1.c r2 = r2.o()
            r11 = r2
        L_0x00dc:
            if (r12 == 0) goto L_0x00e1
            androidx.compose.animation.a$e r2 = androidx.compose.animation.a.e.f17295c
            r13 = r2
        L_0x00e1:
            boolean r2 = U0.C4895p.J()
            r3 = -1
            if (r2 == 0) goto L_0x00ed
            java.lang.String r2 = "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:713)"
            U0.C4895p.S(r0, r1, r3, r2)
        L_0x00ed:
            U0.I0 r0 = androidx.compose.ui.platform.C5100f0.k()
            java.lang.Object r0 = r9.Q(r0)
            c2.t r0 = (c2.t) r0
            r1 = r1 & 14
            r10 = 0
            r12 = 1
            r2 = 4
            if (r1 != r2) goto L_0x0100
            r2 = r12
            goto L_0x0101
        L_0x0100:
            r2 = r10
        L_0x0101:
            java.lang.Object r4 = r9.D()
            if (r2 != 0) goto L_0x010f
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r4 != r2) goto L_0x0117
        L_0x010f:
            androidx.compose.animation.e r4 = new androidx.compose.animation.e
            r4.<init>(r7, r11, r0)
            r9.u(r4)
        L_0x0117:
            r5 = r4
            androidx.compose.animation.e r5 = (androidx.compose.animation.e) r5
            r2 = 4
            if (r1 != r2) goto L_0x011f
            r2 = r12
            goto L_0x0120
        L_0x011f:
            r2 = r10
        L_0x0120:
            java.lang.Object r4 = r9.D()
            if (r2 != 0) goto L_0x012e
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r4 != r2) goto L_0x013d
        L_0x012e:
            java.lang.Object r2 = r20.i()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            g1.v r4 = U0.p1.g(r2)
            r9.u(r4)
        L_0x013d:
            g1.v r4 = (g1.C5353v) r4
            r2 = 4
            if (r1 != r2) goto L_0x0144
            r1 = r12
            goto L_0x0145
        L_0x0144:
            r1 = r10
        L_0x0145:
            java.lang.Object r2 = r9.D()
            if (r1 != 0) goto L_0x0153
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r1 = r1.a()
            if (r2 != r1) goto L_0x015a
        L_0x0153:
            j0.N r2 = j0.Y.d()
            r9.u(r2)
        L_0x015a:
            j0.N r2 = (j0.N) r2
            java.lang.Object r1 = r20.i()
            boolean r1 = r4.contains(r1)
            if (r1 != 0) goto L_0x0170
            r4.clear()
            java.lang.Object r1 = r20.i()
            r4.add(r1)
        L_0x0170:
            java.lang.Object r1 = r20.i()
            java.lang.Object r3 = r20.p()
            boolean r1 = kotlin.jvm.internal.C17542s.e(r1, r3)
            if (r1 == 0) goto L_0x01b5
            int r1 = r4.size()
            if (r1 != r12) goto L_0x0192
            java.lang.Object r1 = r4.get(r10)
            java.lang.Object r3 = r20.i()
            boolean r1 = kotlin.jvm.internal.C17542s.e(r1, r3)
            if (r1 != 0) goto L_0x019c
        L_0x0192:
            r4.clear()
            java.lang.Object r1 = r20.i()
            r4.add(r1)
        L_0x019c:
            int r1 = r2.e()
            if (r1 != r12) goto L_0x01ac
            java.lang.Object r1 = r20.i()
            boolean r1 = r2.b(r1)
            if (r1 == 0) goto L_0x01af
        L_0x01ac:
            r2.i()
        L_0x01af:
            r5.w(r11)
            r5.x(r0)
        L_0x01b5:
            java.lang.Object r0 = r20.i()
            java.lang.Object r1 = r20.p()
            boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r1)
            if (r0 != 0) goto L_0x0207
            java.lang.Object r0 = r20.p()
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L_0x0207
            java.util.Iterator r0 = r4.iterator()
            r1 = r10
        L_0x01d2:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x01f4
            java.lang.Object r3 = r0.next()
            java.lang.Object r3 = r13.invoke(r3)
            java.lang.Object r10 = r20.p()
            java.lang.Object r10 = r13.invoke(r10)
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r10)
            if (r3 == 0) goto L_0x01f0
            r0 = -1
            goto L_0x01f6
        L_0x01f0:
            int r1 = r1 + 1
            r10 = 0
            goto L_0x01d2
        L_0x01f4:
            r0 = -1
            r1 = -1
        L_0x01f6:
            if (r1 != r0) goto L_0x0200
            java.lang.Object r0 = r20.p()
            r4.add(r0)
            goto L_0x0207
        L_0x0200:
            java.lang.Object r0 = r20.p()
            r4.set(r1, r0)
        L_0x0207:
            java.lang.Object r0 = r20.p()
            boolean r0 = r2.b(r0)
            if (r0 == 0) goto L_0x022c
            java.lang.Object r0 = r20.i()
            boolean r0 = r2.b(r0)
            if (r0 != 0) goto L_0x021c
            goto L_0x022c
        L_0x021c:
            r0 = 915535767(0x3691f797, float:4.35016E-6)
            r9.W(r0)
            r9.P()
            r24 = r4
            r18 = r5
            r19 = r6
            goto L_0x0281
        L_0x022c:
            r0 = 912931457(0x366a3a81, float:3.490277E-6)
            r9.W(r0)
            r2.i()
            int r10 = r4.size()
            r3 = 0
        L_0x023a:
            if (r3 >= r10) goto L_0x0278
            java.lang.Object r1 = r4.get(r3)
            androidx.compose.animation.a$f r0 = new androidx.compose.animation.a$f
            r21 = r0
            r23 = r1
            r1 = r20
            r16 = r2
            r2 = r23
            r17 = r3
            r3 = r6
            r24 = r4
            r4 = r5
            r18 = r5
            r5 = r24
            r19 = r6
            r6 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = 54
            r1 = 885640742(0x34c9ce26, float:3.758916E-7)
            r2 = r21
            c1.a r0 = c1.c.e(r1, r12, r2, r9, r0)
            r1 = r23
            r2 = r16
            r2.s(r1, r0)
            int r3 = r17 + 1
            r4 = r24
            r5 = r18
            r6 = r19
            goto L_0x023a
        L_0x0278:
            r24 = r4
            r18 = r5
            r19 = r6
            r9.P()
        L_0x0281:
            m0.v0$b r0 = r20.n()
            r4 = r18
            boolean r1 = r9.V(r4)
            boolean r0 = r9.V(r0)
            r0 = r0 | r1
            java.lang.Object r1 = r9.D()
            if (r0 != 0) goto L_0x029e
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x02a1
        L_0x029e:
            r6 = r19
            goto L_0x02a4
        L_0x02a1:
            r6 = r19
            goto L_0x02ae
        L_0x02a4:
            java.lang.Object r0 = r6.invoke(r4)
            r1 = r0
            l0.i r1 = (l0.i) r1
            r9.u(r1)
        L_0x02ae:
            l0.i r1 = (l0.i) r1
            r0 = 0
            androidx.compose.ui.d r1 = r4.l(r1, r9, r0)
            androidx.compose.ui.d r0 = r15.s(r1)
            java.lang.Object r1 = r9.D()
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r1 != r3) goto L_0x02cd
            androidx.compose.animation.b r1 = new androidx.compose.animation.b
            r1.<init>(r4)
            r9.u(r1)
        L_0x02cd:
            androidx.compose.animation.b r1 = (androidx.compose.animation.b) r1
            r3 = 0
            int r4 = U0.C4883j.a(r9, r3)
            U0.y r3 = r9.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r9, r0)
            G1.g$a r5 = G1.C4504g.f6515W
            nI.a r10 = r5.a()
            U0.f r12 = r9.m()
            if (r12 != 0) goto L_0x02eb
            U0.C4883j.c()
        L_0x02eb:
            r9.I()
            boolean r12 = r9.i()
            if (r12 == 0) goto L_0x02f8
            r9.p(r10)
            goto L_0x02fb
        L_0x02f8:
            r9.t()
        L_0x02fb:
            U0.m r10 = U0.F1.a(r9)
            nI.p r12 = r5.c()
            U0.F1.c(r10, r1, r12)
            nI.p r1 = r5.e()
            U0.F1.c(r10, r3, r1)
            nI.p r1 = r5.b()
            boolean r3 = r10.i()
            if (r3 != 0) goto L_0x0325
            java.lang.Object r3 = r10.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r12)
            if (r3 != 0) goto L_0x0333
        L_0x0325:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r10.u(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r10.w(r3, r1)
        L_0x0333:
            nI.p r1 = r5.d()
            U0.F1.c(r10, r0, r1)
            r0 = -1491001814(0xffffffffa7211e2a, float:-2.235959E-15)
            r9.W(r0)
            int r0 = r24.size()
            r1 = 0
        L_0x0345:
            if (r1 >= r0) goto L_0x0383
            r4 = r24
            java.lang.Object r3 = r4.get(r1)
            r5 = 1908315325(0x71be94bd, float:1.8874229E30)
            java.lang.Object r10 = r13.invoke(r3)
            r9.H(r5, r10)
            java.lang.Object r3 = r2.c(r3)
            nI.p r3 = (nI.p) r3
            if (r3 != 0) goto L_0x036a
            r3 = -971711888(0xffffffffc614da70, float:-9526.609)
            r9.W(r3)
            r9.P()
            r5 = 0
            goto L_0x037b
        L_0x036a:
            r5 = 1908317105(0x71be9bb1, float:1.8876919E30)
            r9.W(r5)
            r5 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            r3.invoke(r9, r10)
            r9.P()
        L_0x037b:
            r9.T()
            int r1 = r1 + 1
            r24 = r4
            goto L_0x0345
        L_0x0383:
            r9.P()
            r9.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0392
            U0.C4895p.R()
        L_0x0392:
            r3 = r6
            r4 = r11
            r5 = r13
            r2 = r15
        L_0x0396:
            U0.Y0 r9 = r9.n()
            if (r9 == 0) goto L_0x03ad
            androidx.compose.animation.a$g r10 = new androidx.compose.animation.a$g
            r0 = r10
            r1 = r20
            r6 = r25
            r7 = r27
            r8 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x03ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.a.b(m0.v0, androidx.compose.ui.d, nI.l, i1.c, nI.l, nI.r, U0.m, int, int):void");
    }

    public static final v c(boolean z10, p<? super c2.r, ? super c2.r, ? extends m0.N<c2.r>> pVar) {
        return new n(z10, pVar);
    }

    public static /* synthetic */ v d(boolean z10, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            pVar = h.f17325c;
        }
        return c(z10, pVar);
    }

    public static final i e(i iVar, k kVar) {
        return new i(iVar, kVar, 0.0f, (v) null, 12, (DefaultConstructorMarker) null);
    }
}
