package kF;

import A1.K;
import E1.C4478k;
import E1.I;
import G1.C4504g;
import J1.j;
import OE.n;
import QJ.Q;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U5.e;
import U5.s;
import XH.C16807N;
import XH.y;
import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import dI.C17164e;
import eI.C17187b;
import i1.C5437c;
import java.util.List;
import k6.C8441h;
import k6.C8442i;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import nI.r;
import o1.C5667g;
import p0.G;
import p0.w;
import p1.C5749w0;
import p1.i1;
import rF.C15002a;
import s0.C5861g;
import s0.C5862h;
import x0.C6230C;
import x0.v;
import z1.C6271a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "", "Landroid/net/Uri;", "images", "Lkotlin/Function1;", "", "LXH/N;", "isInteracting", "c", "(Landroidx/compose/ui/d;Ljava/util/List;LnI/l;LU0/m;II)V", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: kF.x  reason: case insensitive filesystem */
public final class C14728x {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.compose.common.ImageCarouselKt$ImageCarousel$1$1", f = "ImageCarousel.kt", l = {57}, m = "invokeSuspend")
    /* renamed from: kF.x$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f128863c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C6230C f128864d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C6230C c10, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f128864d = c10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f128864d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f128863c;
            if (i10 == 0) {
                y.b(obj);
                C6230C c10 = this.f128864d;
                this.f128863c = 1;
                if (C6230C.c0(c10, 0, 0.0f, this, 2, (Object) null) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LA1/K;", "LXH/N;", "<anonymous>", "(LA1/K;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.compose.common.ImageCarouselKt$ImageCarousel$2$1$1", f = "ImageCarousel.kt", l = {68}, m = "invokeSuspend")
    /* renamed from: kF.x$b */
    static final class b extends l implements p<K, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f128865c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f128866d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<Boolean, C16807N> f128867e;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp0/w;", "Lo1/g;", "it", "LXH/N;", "<anonymous>", "(Lp0/w;Lo1/g;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.sugarcube.app.base.ui.compose.common.ImageCarouselKt$ImageCarousel$2$1$1$1", f = "ImageCarousel.kt", l = {71}, m = "invokeSuspend")
        /* renamed from: kF.x$b$a */
        static final class a extends l implements q<w, C5667g, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            Object f128868c;

            /* renamed from: d  reason: collision with root package name */
            int f128869d;

            /* renamed from: e  reason: collision with root package name */
            private /* synthetic */ Object f128870e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C17642l<Boolean, C16807N> f128871f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C17642l<? super Boolean, C16807N> lVar, C17164e<? super a> eVar) {
                super(3, eVar);
                this.f128871f = lVar;
            }

            public final Object i(w wVar, long j10, C17164e<? super C16807N> eVar) {
                a aVar = new a(this.f128871f, eVar);
                aVar.f128870e = wVar;
                return aVar.invokeSuspend(C16807N.f139792a);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return i((w) obj, ((C5667g) obj2).v(), (C17164e) obj3);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f128869d;
                if (i10 == 0) {
                    y.b(obj);
                    w wVar = (w) this.f128870e;
                    C17642l<Boolean, C16807N> lVar = this.f128871f;
                    if (lVar != null) {
                        lVar.invoke(kotlin.coroutines.jvm.internal.b.a(true));
                    }
                    this.f128870e = wVar;
                    this.f128868c = lVar;
                    this.f128869d = 1;
                    if (wVar.U0(this) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    C17642l lVar2 = (C17642l) this.f128868c;
                    w wVar2 = (w) this.f128870e;
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C17642l<Boolean, C16807N> lVar3 = this.f128871f;
                if (lVar3 != null) {
                    lVar3.invoke(kotlin.coroutines.jvm.internal.b.a(false));
                }
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C17642l<? super Boolean, C16807N> lVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f128867e = lVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f128867e, eVar);
            bVar.f128866d = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(K k10, C17164e<? super C16807N> eVar) {
            return ((b) create(k10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f128865c;
            if (i10 == 0) {
                y.b(obj);
                K k10 = (K) this.f128866d;
                a aVar = new a(this.f128867e, (C17164e<? super a>) null);
                this.f128866d = k10;
                this.f128865c = 1;
                if (G.j(k10, (C17642l) null, (C17642l) null, aVar, (C17642l) null, this, 11, (Object) null) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                K k11 = (K) this.f128866d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"kF/x$c", "Lz1/a;", "Lc2/y;", "consumed", "available", "g0", "(JJLdI/e;)Ljava/lang/Object;", "Lo1/g;", "Lz1/e;", "source", "N0", "(JJI)J", "C1", "(JI)J", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kF.x$c */
    public static final class c implements C6271a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<Boolean, C16807N> f128872a;

        c(C17642l<? super Boolean, C16807N> lVar) {
            this.f128872a = lVar;
        }

        public long C1(long j10, int i10) {
            C17642l<Boolean, C16807N> lVar = this.f128872a;
            if (lVar != null) {
                lVar.invoke(Boolean.TRUE);
            }
            return super.C1(j10, i10);
        }

        public long N0(long j10, long j11, int i10) {
            C17642l<Boolean, C16807N> lVar = this.f128872a;
            if (lVar != null) {
                lVar.invoke(Boolean.FALSE);
            }
            return super.N0(j10, j11, i10);
        }

        public Object g0(long j10, long j11, C17164e<? super c2.y> eVar) {
            C17642l<Boolean, C16807N> lVar = this.f128872a;
            if (lVar != null) {
                lVar.invoke(kotlin.coroutines.jvm.internal.b.a(false));
            }
            return super.g0(j10, j11, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kF.x$d */
    static final class d implements r<v, Integer, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f128873a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List<Uri> f128874b;

        d(Context context, List<? extends Uri> list) {
            this.f128873a = context;
            this.f128874b = list;
        }

        public final void a(v vVar, int i10, C4889m mVar, int i11) {
            C4889m mVar2 = mVar;
            C17542s.j(vVar, "$this$HorizontalPager");
            if (C4895p.J()) {
                C4895p.S(-1285476641, i11, -1, "com.sugarcube.app.base.ui.compose.common.ImageCarousel.<anonymous>.<anonymous> (ImageCarousel.kt:105)");
            }
            d.a aVar = androidx.compose.ui.d.f18749a;
            androidx.compose.ui.d h10 = J.h(aVar, 0.0f, 1, (Object) null);
            Context context = this.f128873a;
            List<Uri> list = this.f128874b;
            C5073d.m g10 = C5073d.f18068a.g();
            C5437c.a aVar2 = C5437c.f24302a;
            I a10 = C5080k.a(g10, aVar2.k(), mVar2, 0);
            int a11 = C4883j.a(mVar2, 0);
            C4912y s10 = mVar.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar2, h10);
            C4504g.a aVar3 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar3.a();
            if (mVar.m() == null) {
                C4883j.c();
            }
            mVar.I();
            if (mVar.i()) {
                mVar2.p(a12);
            } else {
                mVar.t();
            }
            C4889m a13 = F1.a(mVar);
            F1.c(a13, a10, aVar3.c());
            F1.c(a13, s10, aVar3.e());
            p<C4504g, Integer, C16807N> b10 = aVar3.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar3.d());
            C5862h hVar = C5862h.f28810a;
            androidx.compose.ui.d c10 = C5861g.c(hVar, hVar.b(androidx.compose.foundation.b.d(J.d(aVar, 0.0f, 1, (Object) null), C15002a.a(mVar2, 0).p(), (i1) null, 2, (Object) null), aVar2.g()), 1.0f, false, 2, (Object) null);
            s.a(C8442i.a(new C8441h.a(context).e(list.get(i10)), true).c(), j.b(n.f113194E2, mVar2, 0), c10, (C17642l<? super e.c, ? extends e.c>) null, (C17642l<? super e.c, C16807N>) null, (C5437c) null, C4478k.f5915a.e(), 0.0f, (C5749w0) null, 0, false, mVar, 1572864, 0, 1976);
            mVar.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            a((v) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(androidx.compose.ui.d r29, java.util.List<? extends android.net.Uri> r30, nI.C17642l<? super java.lang.Boolean, XH.C16807N> r31, U0.C4889m r32, int r33, int r34) {
        /*
            r2 = r30
            r4 = r33
            java.lang.String r0 = "images"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            r0 = 1186261447(0x46b4e9c7, float:23156.889)
            r1 = r32
            U0.m r1 = r1.k(r0)
            r3 = r34 & 1
            if (r3 == 0) goto L_0x001c
            r5 = r4 | 6
            r6 = r5
            r5 = r29
            goto L_0x0030
        L_0x001c:
            r5 = r4 & 6
            if (r5 != 0) goto L_0x002d
            r5 = r29
            boolean r6 = r1.V(r5)
            if (r6 == 0) goto L_0x002a
            r6 = 4
            goto L_0x002b
        L_0x002a:
            r6 = 2
        L_0x002b:
            r6 = r6 | r4
            goto L_0x0030
        L_0x002d:
            r5 = r29
            r6 = r4
        L_0x0030:
            r7 = r34 & 2
            if (r7 == 0) goto L_0x0037
            r6 = r6 | 48
            goto L_0x0047
        L_0x0037:
            r7 = r4 & 48
            if (r7 != 0) goto L_0x0047
            boolean r7 = r1.F(r2)
            if (r7 == 0) goto L_0x0044
            r7 = 32
            goto L_0x0046
        L_0x0044:
            r7 = 16
        L_0x0046:
            r6 = r6 | r7
        L_0x0047:
            r7 = r34 & 4
            r11 = 256(0x100, float:3.59E-43)
            if (r7 == 0) goto L_0x0053
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x004f:
            r8 = r31
        L_0x0051:
            r12 = r6
            goto L_0x0065
        L_0x0053:
            r8 = r4 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x004f
            r8 = r31
            boolean r9 = r1.F(r8)
            if (r9 == 0) goto L_0x0061
            r9 = r11
            goto L_0x0063
        L_0x0061:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r6 = r6 | r9
            goto L_0x0051
        L_0x0065:
            r6 = r12 & 147(0x93, float:2.06E-43)
            r9 = 146(0x92, float:2.05E-43)
            if (r6 != r9) goto L_0x007a
            boolean r6 = r1.l()
            if (r6 != 0) goto L_0x0072
            goto L_0x007a
        L_0x0072:
            r1.L()
            r3 = r5
            r28 = r8
            goto L_0x0315
        L_0x007a:
            if (r3 == 0) goto L_0x007f
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            goto L_0x0080
        L_0x007f:
            r3 = r5
        L_0x0080:
            r14 = 0
            if (r7 == 0) goto L_0x0085
            r13 = r14
            goto L_0x0086
        L_0x0085:
            r13 = r8
        L_0x0086:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0092
            r5 = -1
            java.lang.String r6 = "com.sugarcube.app.base.ui.compose.common.ImageCarousel (ImageCarousel.kt:50)"
            U0.C4895p.S(r0, r12, r5, r6)
        L_0x0092:
            U0.I0 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r0 = r1.Q(r0)
            android.content.Context r0 = (android.content.Context) r0
            int r10 = r30.size()
            r5 = -1114173477(0xffffffffbd970fdb, float:-0.07376071)
            r1.W(r5)
            boolean r5 = r1.d(r10)
            java.lang.Object r6 = r1.D()
            if (r5 != 0) goto L_0x00b8
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x00c0
        L_0x00b8:
            kF.v r6 = new kF.v
            r6.<init>(r10)
            r1.u(r6)
        L_0x00c0:
            r7 = r6
            nI.a r7 = (nI.C17631a) r7
            r1.P()
            r9 = 0
            r16 = 3
            r5 = 0
            r6 = 0
            r8 = r1
            r23 = r10
            r10 = r16
            x0.C r5 = x0.C6231D.k(r5, r6, r7, r8, r9, r10)
            r6 = -1114172104(0xffffffffbd971538, float:-0.07377094)
            r1.W(r6)
            boolean r6 = r1.V(r5)
            java.lang.Object r7 = r1.D()
            if (r6 != 0) goto L_0x00ec
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r7 != r6) goto L_0x00f4
        L_0x00ec:
            kF.x$a r7 = new kF.x$a
            r7.<init>(r5, r14)
            r1.u(r7)
        L_0x00f4:
            nI.p r7 = (nI.p) r7
            r1.P()
            int r6 = r12 >> 3
            r6 = r6 & 14
            U0.P.g(r2, r7, r1, r6)
            androidx.compose.foundation.layout.d r24 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r6 = r24.g()
            i1.c$a r25 = i1.C5437c.f24302a
            i1.c$b r7 = r25.k()
            r10 = 0
            E1.I r6 = androidx.compose.foundation.layout.C5080k.a(r6, r7, r1, r10)
            int r7 = U0.C4883j.a(r1, r10)
            U0.y r8 = r1.s()
            androidx.compose.ui.d r9 = androidx.compose.ui.c.e(r1, r3)
            G1.g$a r26 = G1.C4504g.f6515W
            nI.a r10 = r26.a()
            U0.f r16 = r1.m()
            if (r16 != 0) goto L_0x012c
            U0.C4883j.c()
        L_0x012c:
            r1.I()
            boolean r16 = r1.i()
            if (r16 == 0) goto L_0x0139
            r1.p(r10)
            goto L_0x013c
        L_0x0139:
            r1.t()
        L_0x013c:
            U0.m r10 = U0.F1.a(r1)
            nI.p r15 = r26.c()
            U0.F1.c(r10, r6, r15)
            nI.p r6 = r26.e()
            U0.F1.c(r10, r8, r6)
            nI.p r6 = r26.b()
            boolean r8 = r10.i()
            if (r8 != 0) goto L_0x0166
            java.lang.Object r8 = r10.D()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r15)
            if (r8 != 0) goto L_0x0174
        L_0x0166:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r10.u(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10.w(r7, r6)
        L_0x0174:
            nI.p r6 = r26.d()
            U0.F1.c(r10, r9, r6)
            s0.h r15 = s0.C5862h.f28810a
            androidx.compose.ui.d$a r10 = androidx.compose.ui.d.f18749a
            r9 = 0
            r8 = 1
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.J.d(r10, r9, r8, r14)
            r19 = 2
            r20 = 0
            r17 = 1065353216(0x3f800000, float:1.0)
            r18 = 0
            androidx.compose.ui.d r6 = s0.C5861g.c(r15, r16, r17, r18, r19, r20)
            XH.N r7 = XH.C16807N.f139792a
            r15 = 210264603(0xc88621b, float:2.1013163E-31)
            r1.W(r15)
            r12 = r12 & 896(0x380, float:1.256E-42)
            if (r12 != r11) goto L_0x019f
            r11 = r8
            goto L_0x01a0
        L_0x019f:
            r11 = 0
        L_0x01a0:
            java.lang.Object r12 = r1.D()
            if (r11 != 0) goto L_0x01ae
            U0.m$a r11 = U0.C4889m.f14007a
            java.lang.Object r11 = r11.a()
            if (r12 != r11) goto L_0x01b6
        L_0x01ae:
            kF.x$b r12 = new kF.x$b
            r12.<init>(r13, r14)
            r1.u(r12)
        L_0x01b6:
            nI.p r12 = (nI.p) r12
            r1.P()
            androidx.compose.ui.d r6 = A1.U.d(r6, r7, r12)
            kF.x$c r7 = new kF.x$c
            r7.<init>(r13)
            r15 = 2
            androidx.compose.ui.d r6 = androidx.compose.ui.input.nestedscroll.a.b(r6, r7, r14, r15, r14)
            kF.x$d r7 = new kF.x$d
            r7.<init>(r0, r2)
            r0 = 54
            r11 = -1285476641(0xffffffffb3612edf, float:-5.2429524E-8)
            c1.a r18 = c1.c.e(r11, r8, r7, r1, r0)
            r21 = 3072(0xc00, float:4.305E-42)
            r22 = 8188(0x1ffc, float:1.1474E-41)
            r7 = 0
            r0 = 0
            r12 = r8
            r8 = r0
            r0 = 0
            r11 = r9
            r9 = r0
            r0 = 0
            r27 = r10
            r10 = r0
            r0 = 0
            r11 = r0
            r12 = r0
            r0 = 0
            r28 = r13
            r13 = r0
            r14 = r0
            r0 = 0
            r15 = r0
            r16 = 0
            r17 = 0
            r20 = 0
            r0 = r5
            r19 = r1
            x0.m.a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r6 = r27
            r5 = 0
            r7 = 0
            r8 = 1
            androidx.compose.ui.d r9 = androidx.compose.foundation.layout.J.h(r6, r7, r8, r5)
            r5 = 0
            rF.b r6 = rF.C15002a.a(r1, r5)
            long r10 = r6.p()
            r13 = 2
            r14 = 0
            r12 = 0
            androidx.compose.ui.d r6 = androidx.compose.foundation.b.d(r9, r10, r12, r13, r14)
            r7 = 24
            float r7 = (float) r7
            float r7 = c2.h.B(r7)
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.i(r6, r7)
            i1.c$c r7 = r25.i()
            androidx.compose.foundation.layout.d$e r9 = r24.f()
            r10 = 48
            E1.I r7 = androidx.compose.foundation.layout.G.b(r9, r7, r1, r10)
            int r9 = U0.C4883j.a(r1, r5)
            U0.y r10 = r1.s()
            androidx.compose.ui.d r6 = androidx.compose.ui.c.e(r1, r6)
            nI.a r11 = r26.a()
            U0.f r12 = r1.m()
            if (r12 != 0) goto L_0x0247
            U0.C4883j.c()
        L_0x0247:
            r1.I()
            boolean r12 = r1.i()
            if (r12 == 0) goto L_0x0254
            r1.p(r11)
            goto L_0x0257
        L_0x0254:
            r1.t()
        L_0x0257:
            U0.m r11 = U0.F1.a(r1)
            nI.p r12 = r26.c()
            U0.F1.c(r11, r7, r12)
            nI.p r7 = r26.e()
            U0.F1.c(r11, r10, r7)
            nI.p r7 = r26.b()
            boolean r10 = r11.i()
            if (r10 != 0) goto L_0x0281
            java.lang.Object r10 = r11.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            boolean r10 = kotlin.jvm.internal.C17542s.e(r10, r12)
            if (r10 != 0) goto L_0x028f
        L_0x0281:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r11.u(r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r11.w(r9, r7)
        L_0x028f:
            nI.p r7 = r26.d()
            U0.F1.c(r11, r6, r7)
            s0.N r6 = s0.C5843N.f28726a
            r7 = -1818473365(0xffffffff939c4c6b, float:-3.945529E-27)
            r1.W(r7)
            r10 = r5
            r7 = r23
        L_0x02a1:
            if (r10 >= r7) goto L_0x0303
            int r9 = r0.v()
            if (r9 != r10) goto L_0x02bc
            r9 = -1008691248(0xffffffffc3e097d0, float:-449.18604)
            r1.W(r9)
            rF.b r9 = rF.C15002a.a(r1, r5)
            long r11 = r9.m()
            r1.P()
        L_0x02ba:
            r14 = r11
            goto L_0x02ce
        L_0x02bc:
            r9 = -1008614802(0xffffffffc3e1c26e, float:-451.51898)
            r1.W(r9)
            rF.b r9 = rF.C15002a.a(r1, r5)
            long r11 = r9.n()
            r1.P()
            goto L_0x02ba
        L_0x02ce:
            androidx.compose.ui.d$a r9 = androidx.compose.ui.d.f18749a
            float r11 = (float) r8
            float r11 = c2.h.B(r11)
            A0.f r11 = A0.g.e(r11)
            androidx.compose.ui.d r13 = m1.e.a(r9, r11)
            r17 = 2
            r18 = 0
            r16 = 0
            androidx.compose.ui.d r13 = androidx.compose.foundation.b.d(r13, r14, r16, r17, r18)
            r16 = 2
            r17 = 0
            r14 = 1065353216(0x3f800000, float:1.0)
            r15 = 0
            r12 = r6
            androidx.compose.ui.d r9 = s0.C5842M.e(r12, r13, r14, r15, r16, r17)
            r11 = 2
            float r12 = (float) r11
            float r12 = c2.h.B(r12)
            androidx.compose.ui.d r9 = androidx.compose.foundation.layout.J.i(r9, r12)
            androidx.compose.foundation.layout.C5077h.a(r9, r1, r5)
            int r10 = r10 + 1
            goto L_0x02a1
        L_0x0303:
            r1.P()
            r1.x()
            r1.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0315
            U0.C4895p.R()
        L_0x0315:
            U0.Y0 r6 = r1.n()
            if (r6 == 0) goto L_0x032d
            kF.w r7 = new kF.w
            r0 = r7
            r1 = r3
            r2 = r30
            r3 = r28
            r4 = r33
            r5 = r34
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x032d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kF.C14728x.c(androidx.compose.ui.d, java.util.List, nI.l, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final int d(int i10) {
        return i10;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(androidx.compose.ui.d dVar, List list, C17642l lVar, int i10, int i11, C4889m mVar, int i12) {
        c(dVar, list, lVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
