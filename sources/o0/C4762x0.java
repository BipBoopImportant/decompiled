package O0;

import E1.H;
import E1.J;
import E1.K;
import E1.a0;
import E1.m0;
import O0.O;
import Q0.p;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import XH.C16807N;
import YH.C16877v;
import androidx.compose.foundation.layout.D;
import c2.C5267b;
import c2.h;
import c2.t;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import nI.q;
import s0.C5834E;
import s0.C5848T;
import s0.C5850V;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0001\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001an\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001a\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function0;", "LXH/N;", "topBar", "bottomBar", "snackbarHost", "floatingActionButton", "LO0/O;", "floatingActionButtonPosition", "Lp1/v0;", "containerColor", "contentColor", "Ls0/T;", "contentWindowInsets", "Lkotlin/Function1;", "Ls0/E;", "content", "a", "(Landroidx/compose/ui/d;LnI/p;LnI/p;LnI/p;LnI/p;IJJLs0/T;LnI/q;LU0/m;II)V", "fabPosition", "snackbar", "fab", "b", "(ILnI/p;LnI/q;LnI/p;LnI/p;Ls0/T;LnI/p;LU0/m;I)V", "Lc2/h;", "F", "FabSpacing", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: O0.x0  reason: case insensitive filesystem */
public final class C4762x0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final float f11599a = h.B((float) 16);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ls0/T;", "consumedWindowInsets", "LXH/N;", "a", "(Ls0/T;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.x0$a */
    static final class a extends C17544u implements C17642l<C5848T, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p f11600c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5848T f11601d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(p pVar, C5848T t10) {
            super(1);
            this.f11600c = pVar;
            this.f11601d = t10;
        }

        public final void a(C5848T t10) {
            this.f11600c.f(C5850V.h(this.f11601d, t10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5848T) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.x0$b */
    static final class b extends C17544u implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f11602c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ nI.p<C4889m, Integer, C16807N> f11603d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ q<C5834E, C4889m, Integer, C16807N> f11604e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ nI.p<C4889m, Integer, C16807N> f11605f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ nI.p<C4889m, Integer, C16807N> f11606g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ p f11607h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ nI.p<C4889m, Integer, C16807N> f11608i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(int i10, nI.p<? super C4889m, ? super Integer, C16807N> pVar, q<? super C5834E, ? super C4889m, ? super Integer, C16807N> qVar, nI.p<? super C4889m, ? super Integer, C16807N> pVar2, nI.p<? super C4889m, ? super Integer, C16807N> pVar3, p pVar4, nI.p<? super C4889m, ? super Integer, C16807N> pVar5) {
            super(2);
            this.f11602c = i10;
            this.f11603d = pVar;
            this.f11604e = qVar;
            this.f11605f = pVar2;
            this.f11606g = pVar3;
            this.f11607h = pVar4;
            this.f11608i = pVar5;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1979205334, i10, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:105)");
                }
                C4762x0.b(this.f11602c, this.f11603d, this.f11604e, this.f11605f, this.f11606g, this.f11607h, this.f11608i, mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O0.x0$c */
    static final class c extends C17544u implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f11609c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ nI.p<C4889m, Integer, C16807N> f11610d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ nI.p<C4889m, Integer, C16807N> f11611e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ nI.p<C4889m, Integer, C16807N> f11612f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ nI.p<C4889m, Integer, C16807N> f11613g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f11614h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ long f11615i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ long f11616j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C5848T f11617k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ q<C5834E, C4889m, Integer, C16807N> f11618l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f11619m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ int f11620n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(androidx.compose.ui.d dVar, nI.p<? super C4889m, ? super Integer, C16807N> pVar, nI.p<? super C4889m, ? super Integer, C16807N> pVar2, nI.p<? super C4889m, ? super Integer, C16807N> pVar3, nI.p<? super C4889m, ? super Integer, C16807N> pVar4, int i10, long j10, long j11, C5848T t10, q<? super C5834E, ? super C4889m, ? super Integer, C16807N> qVar, int i11, int i12) {
            super(2);
            this.f11609c = dVar;
            this.f11610d = pVar;
            this.f11611e = pVar2;
            this.f11612f = pVar3;
            this.f11613g = pVar4;
            this.f11614h = i10;
            this.f11615i = j10;
            this.f11616j = j11;
            this.f11617k = t10;
            this.f11618l = qVar;
            this.f11619m = i11;
            this.f11620n = i12;
        }

        public final void a(C4889m mVar, int i10) {
            C4762x0.a(this.f11609c, this.f11610d, this.f11611e, this.f11612f, this.f11613g, this.f11614h, this.f11615i, this.f11616j, this.f11617k, this.f11618l, mVar, M0.a(this.f11619m | 1), this.f11620n);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LE1/m0;", "Lc2/b;", "constraints", "LE1/J;", "a", "(LE1/m0;J)LE1/J;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.x0$d */
    static final class d extends C17544u implements nI.p<m0, C5267b, J> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ nI.p<C4889m, Integer, C16807N> f11621c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ nI.p<C4889m, Integer, C16807N> f11622d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ nI.p<C4889m, Integer, C16807N> f11623e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f11624f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C5848T f11625g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ nI.p<C4889m, Integer, C16807N> f11626h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ q<C5834E, C4889m, Integer, C16807N> f11627i;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: O0.x0$d$a */
        static final class a extends C17544u implements C17642l<a0.a, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ List<a0> f11628c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ List<a0> f11629d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ List<a0> f11630e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ List<a0> f11631f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ N f11632g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ int f11633h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ int f11634i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ C5848T f11635j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ m0 f11636k;

            /* renamed from: l  reason: collision with root package name */
            final /* synthetic */ int f11637l;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ int f11638m;

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ Integer f11639n;

            /* renamed from: o  reason: collision with root package name */
            final /* synthetic */ List<a0> f11640o;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ Integer f11641p;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(List<? extends a0> list, List<? extends a0> list2, List<? extends a0> list3, List<? extends a0> list4, N n10, int i10, int i11, C5848T t10, m0 m0Var, int i12, int i13, Integer num, List<? extends a0> list5, Integer num2) {
                super(1);
                this.f11628c = list;
                this.f11629d = list2;
                this.f11630e = list3;
                this.f11631f = list4;
                this.f11632g = n10;
                this.f11633h = i10;
                this.f11634i = i11;
                this.f11635j = t10;
                this.f11636k = m0Var;
                this.f11637l = i12;
                this.f11638m = i13;
                this.f11639n = num;
                this.f11640o = list5;
                this.f11641p = num2;
            }

            public final void a(a0.a aVar) {
                List<a0> list = this.f11628c;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    a0.a.i(aVar, list.get(i10), 0, 0, 0.0f, 4, (Object) null);
                }
                List<a0> list2 = this.f11629d;
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    a0.a.i(aVar, list2.get(i11), 0, 0, 0.0f, 4, (Object) null);
                }
                List<a0> list3 = this.f11630e;
                int i12 = this.f11633h;
                int i13 = this.f11634i;
                C5848T t10 = this.f11635j;
                m0 m0Var = this.f11636k;
                int i14 = this.f11637l;
                int i15 = this.f11638m;
                int size3 = list3.size();
                for (int i16 = 0; i16 < size3; i16++) {
                    a0.a.i(aVar, list3.get(i16), ((i12 - i13) / 2) + t10.c(m0Var, m0Var.getLayoutDirection()), i14 - i15, 0.0f, 4, (Object) null);
                }
                List<a0> list4 = this.f11631f;
                int i17 = this.f11637l;
                Integer num = this.f11639n;
                int size4 = list4.size();
                for (int i18 = 0; i18 < size4; i18++) {
                    a0.a.i(aVar, list4.get(i18), 0, i17 - (num != null ? num.intValue() : 0), 0.0f, 4, (Object) null);
                }
                N n10 = this.f11632g;
                if (n10 != null) {
                    List<a0> list5 = this.f11640o;
                    int i19 = this.f11637l;
                    Integer num2 = this.f11641p;
                    int size5 = list5.size();
                    for (int i20 = 0; i20 < size5; i20++) {
                        int b10 = n10.b();
                        C17542s.g(num2);
                        a0.a.i(aVar, list5.get(i20), b10, i19 - num2.intValue(), 0.0f, 4, (Object) null);
                    }
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((a0.a) obj);
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: O0.x0$d$b */
        static final class b extends C17544u implements nI.p<C4889m, Integer, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C5848T f11642c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ m0 f11643d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ List<a0> f11644e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ int f11645f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ List<a0> f11646g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ Integer f11647h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ q<C5834E, C4889m, Integer, C16807N> f11648i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(C5848T t10, m0 m0Var, List<? extends a0> list, int i10, List<? extends a0> list2, Integer num, q<? super C5834E, ? super C4889m, ? super Integer, C16807N> qVar) {
                super(2);
                this.f11642c = t10;
                this.f11643d = m0Var;
                this.f11644e = list;
                this.f11645f = i10;
                this.f11646g = list2;
                this.f11647h = num;
                this.f11648i = qVar;
            }

            public final void a(C4889m mVar, int i10) {
                Integer num;
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-1213360416, i10, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:238)");
                    }
                    C5834E g10 = C5850V.g(this.f11642c, this.f11643d);
                    this.f11648i.invoke(D.d(D.g(g10, this.f11643d.getLayoutDirection()), this.f11644e.isEmpty() ? g10.d() : this.f11643d.H(this.f11645f), D.f(g10, this.f11643d.getLayoutDirection()), (this.f11646g.isEmpty() || (num = this.f11647h) == null) ? g10.a() : this.f11643d.H(num.intValue())), mVar, 0);
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                mVar.L();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((C4889m) obj, ((Number) obj2).intValue());
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: O0.x0$d$c */
        static final class c extends C17544u implements nI.p<C4889m, Integer, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ nI.p<C4889m, Integer, C16807N> f11649c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(nI.p<? super C4889m, ? super Integer, C16807N> pVar) {
                super(2);
                this.f11649c = pVar;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-2146438447, i10, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:209)");
                    }
                    this.f11649c.invoke(mVar, 0);
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                mVar.L();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((C4889m) obj, ((Number) obj2).intValue());
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(nI.p<? super C4889m, ? super Integer, C16807N> pVar, nI.p<? super C4889m, ? super Integer, C16807N> pVar2, nI.p<? super C4889m, ? super Integer, C16807N> pVar3, int i10, C5848T t10, nI.p<? super C4889m, ? super Integer, C16807N> pVar4, q<? super C5834E, ? super C4889m, ? super Integer, C16807N> qVar) {
            super(2);
            this.f11621c = pVar;
            this.f11622d = pVar2;
            this.f11623e = pVar3;
            this.f11624f = i10;
            this.f11625g = t10;
            this.f11626h = pVar4;
            this.f11627i = qVar;
        }

        public final J a(m0 m0Var, long j10) {
            Object obj;
            Object obj2;
            Object obj3;
            N n10;
            Object obj4;
            Integer num;
            int i10;
            int a10;
            int b10;
            Object obj5;
            Object obj6;
            int i11;
            int K02;
            m0 m0Var2 = m0Var;
            int l10 = C5267b.l(j10);
            int k10 = C5267b.k(j10);
            long d10 = C5267b.d(j10, 0, 0, 0, 0, 10, (Object) null);
            List<H> S02 = m0Var2.S0(C4764y0.TopBar, this.f11621c);
            ArrayList arrayList = new ArrayList(S02.size());
            int size = S02.size();
            for (int i12 = 0; i12 < size; i12++) {
                arrayList.add(S02.get(i12).i0(d10));
            }
            if (arrayList.isEmpty()) {
                obj = null;
            } else {
                obj = arrayList.get(0);
                int z02 = ((a0) obj).z0();
                int p10 = C16877v.p(arrayList);
                if (1 <= p10) {
                    int i13 = 1;
                    while (true) {
                        Object obj7 = arrayList.get(i13);
                        int z03 = ((a0) obj7).z0();
                        if (z02 < z03) {
                            obj = obj7;
                            z02 = z03;
                        }
                        if (i13 == p10) {
                            break;
                        }
                        i13++;
                    }
                }
            }
            a0 a0Var = (a0) obj;
            int z04 = a0Var != null ? a0Var.z0() : 0;
            List<H> S03 = m0Var2.S0(C4764y0.Snackbar, this.f11622d);
            C5848T t10 = this.f11625g;
            ArrayList arrayList2 = new ArrayList(S03.size());
            int size2 = S03.size();
            for (int i14 = 0; i14 < size2; i14++) {
                arrayList2.add(S03.get(i14).i0(c2.c.o(d10, (-t10.c(m0Var2, m0Var.getLayoutDirection())) - t10.d(m0Var2, m0Var.getLayoutDirection()), -t10.b(m0Var2))));
            }
            if (arrayList2.isEmpty()) {
                obj2 = null;
            } else {
                obj2 = arrayList2.get(0);
                int z05 = ((a0) obj2).z0();
                int p11 = C16877v.p(arrayList2);
                if (1 <= p11) {
                    Object obj8 = obj2;
                    int i15 = z05;
                    int i16 = 1;
                    while (true) {
                        Object obj9 = arrayList2.get(i16);
                        int z06 = ((a0) obj9).z0();
                        if (i15 < z06) {
                            obj8 = obj9;
                            i15 = z06;
                        }
                        if (i16 == p11) {
                            break;
                        }
                        i16++;
                    }
                    obj2 = obj8;
                }
            }
            a0 a0Var2 = (a0) obj2;
            int z07 = a0Var2 != null ? a0Var2.z0() : 0;
            if (arrayList2.isEmpty()) {
                obj3 = null;
            } else {
                obj3 = arrayList2.get(0);
                int E02 = ((a0) obj3).E0();
                int p12 = C16877v.p(arrayList2);
                if (1 <= p12) {
                    Object obj10 = obj3;
                    int i17 = E02;
                    int i18 = 1;
                    while (true) {
                        Object obj11 = arrayList2.get(i18);
                        int E03 = ((a0) obj11).E0();
                        if (i17 < E03) {
                            obj10 = obj11;
                            i17 = E03;
                        }
                        if (i18 == p12) {
                            break;
                        }
                        i18++;
                    }
                    obj3 = obj10;
                }
            }
            a0 a0Var3 = (a0) obj3;
            int E04 = a0Var3 != null ? a0Var3.E0() : 0;
            List<H> S04 = m0Var2.S0(C4764y0.Fab, this.f11623e);
            C5848T t11 = this.f11625g;
            ArrayList arrayList3 = new ArrayList(S04.size());
            int size3 = S04.size();
            int i19 = 0;
            while (i19 < size3) {
                List<H> list = S04;
                int i20 = size3;
                C5848T t12 = t11;
                a0 i02 = S04.get(i19).i0(c2.c.o(d10, (-t11.c(m0Var2, m0Var.getLayoutDirection())) - t11.d(m0Var2, m0Var.getLayoutDirection()), -t11.b(m0Var2)));
                if (i02.z0() == 0 || i02.E0() == 0) {
                    i02 = null;
                }
                if (i02 != null) {
                    arrayList3.add(i02);
                }
                i19++;
                t11 = t12;
                S04 = list;
                size3 = i20;
            }
            if (!arrayList3.isEmpty()) {
                if (arrayList3.isEmpty()) {
                    obj5 = null;
                } else {
                    obj5 = arrayList3.get(0);
                    int E05 = ((a0) obj5).E0();
                    int p13 = C16877v.p(arrayList3);
                    if (1 <= p13) {
                        Object obj12 = obj5;
                        int i21 = E05;
                        int i22 = 1;
                        while (true) {
                            Object obj13 = arrayList3.get(i22);
                            int E06 = ((a0) obj13).E0();
                            if (i21 < E06) {
                                obj12 = obj13;
                                i21 = E06;
                            }
                            if (i22 == p13) {
                                break;
                            }
                            i22++;
                        }
                        obj5 = obj12;
                    }
                }
                C17542s.g(obj5);
                int E07 = ((a0) obj5).E0();
                if (arrayList3.isEmpty()) {
                    obj6 = null;
                } else {
                    obj6 = arrayList3.get(0);
                    int z08 = ((a0) obj6).z0();
                    int p14 = C16877v.p(arrayList3);
                    if (1 <= p14) {
                        Object obj14 = obj6;
                        int i23 = z08;
                        int i24 = 1;
                        while (true) {
                            Object obj15 = arrayList3.get(i24);
                            Object obj16 = obj14;
                            int z09 = ((a0) obj15).z0();
                            if (i23 < z09) {
                                i23 = z09;
                                obj14 = obj15;
                            } else {
                                obj14 = obj16;
                            }
                            if (i24 == p14) {
                                break;
                            }
                            i24++;
                        }
                        obj6 = obj14;
                    }
                }
                C17542s.g(obj6);
                int z010 = ((a0) obj6).z0();
                int i25 = this.f11624f;
                O.a aVar = O.f9935a;
                if (!O.f(i25, aVar.d())) {
                    if (!(O.f(i25, aVar.b()) ? true : O.f(i25, aVar.c()))) {
                        i11 = (l10 - E07) / 2;
                    } else if (m0Var.getLayoutDirection() == t.Ltr) {
                        K02 = m0Var2.K0(C4762x0.f11599a);
                    } else {
                        i11 = m0Var2.K0(C4762x0.f11599a);
                    }
                    n10 = new N(i11, E07, z010);
                } else if (m0Var.getLayoutDirection() == t.Ltr) {
                    i11 = m0Var2.K0(C4762x0.f11599a);
                    n10 = new N(i11, E07, z010);
                } else {
                    K02 = m0Var2.K0(C4762x0.f11599a);
                }
                i11 = (l10 - K02) - E07;
                n10 = new N(i11, E07, z010);
            } else {
                n10 = null;
            }
            List<H> S05 = m0Var2.S0(C4764y0.BottomBar, c1.c.c(-2146438447, true, new c(this.f11626h)));
            ArrayList arrayList4 = new ArrayList(S05.size());
            int size4 = S05.size();
            for (int i26 = 0; i26 < size4; i26++) {
                arrayList4.add(S05.get(i26).i0(d10));
            }
            if (arrayList4.isEmpty()) {
                obj4 = null;
            } else {
                obj4 = arrayList4.get(0);
                int z011 = ((a0) obj4).z0();
                int p15 = C16877v.p(arrayList4);
                if (1 <= p15) {
                    int i27 = 1;
                    while (true) {
                        Object obj17 = arrayList4.get(i27);
                        int z012 = ((a0) obj17).z0();
                        if (z011 < z012) {
                            z011 = z012;
                            obj4 = obj17;
                        }
                        if (i27 == p15) {
                            break;
                        }
                        i27++;
                    }
                }
            }
            a0 a0Var4 = (a0) obj4;
            Integer valueOf = a0Var4 != null ? Integer.valueOf(a0Var4.z0()) : null;
            if (n10 != null) {
                int i28 = this.f11624f;
                C5848T t13 = this.f11625g;
                if (valueOf == null || O.f(i28, O.f9935a.c())) {
                    a10 = n10.a() + m0Var2.K0(C4762x0.f11599a);
                    b10 = t13.b(m0Var2);
                } else {
                    a10 = valueOf.intValue() + n10.a();
                    b10 = m0Var2.K0(C4762x0.f11599a);
                }
                num = Integer.valueOf(a10 + b10);
            } else {
                num = null;
            }
            if (z07 != 0) {
                i10 = z07 + (num != null ? num.intValue() : valueOf != null ? valueOf.intValue() : this.f11625g.b(m0Var2));
            } else {
                i10 = 0;
            }
            C4764y0 y0Var = C4764y0.MainContent;
            ArrayList arrayList5 = arrayList3;
            b bVar = r1;
            int i29 = E04;
            ArrayList arrayList6 = arrayList4;
            b bVar2 = new b(this.f11625g, m0Var, arrayList, z04, arrayList4, valueOf, this.f11627i);
            List<H> S06 = m0Var2.S0(y0Var, c1.c.c(-1213360416, true, bVar));
            ArrayList arrayList7 = new ArrayList(S06.size());
            int size5 = S06.size();
            for (int i30 = 0; i30 < size5; i30++) {
                arrayList7.add(S06.get(i30).i0(d10));
            }
            return K.v0(m0Var, l10, k10, (Map) null, new a(arrayList7, arrayList, arrayList2, arrayList6, n10, l10, i29, this.f11625g, m0Var, k10, i10, valueOf, arrayList5, num), 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((m0) obj, ((C5267b) obj2).r());
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O0.x0$e */
    static final class e extends C17544u implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f11650c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ nI.p<C4889m, Integer, C16807N> f11651d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ q<C5834E, C4889m, Integer, C16807N> f11652e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ nI.p<C4889m, Integer, C16807N> f11653f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ nI.p<C4889m, Integer, C16807N> f11654g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C5848T f11655h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ nI.p<C4889m, Integer, C16807N> f11656i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f11657j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(int i10, nI.p<? super C4889m, ? super Integer, C16807N> pVar, q<? super C5834E, ? super C4889m, ? super Integer, C16807N> qVar, nI.p<? super C4889m, ? super Integer, C16807N> pVar2, nI.p<? super C4889m, ? super Integer, C16807N> pVar3, C5848T t10, nI.p<? super C4889m, ? super Integer, C16807N> pVar4, int i11) {
            super(2);
            this.f11650c = i10;
            this.f11651d = pVar;
            this.f11652e = qVar;
            this.f11653f = pVar2;
            this.f11654g = pVar3;
            this.f11655h = t10;
            this.f11656i = pVar4;
            this.f11657j = i11;
        }

        public final void a(C4889m mVar, int i10) {
            C4762x0.b(this.f11650c, this.f11651d, this.f11652e, this.f11653f, this.f11654g, this.f11655h, this.f11656i, mVar, M0.a(this.f11657j | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: nI.p<? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: nI.p<? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: nI.p<? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: nI.p<? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: nI.p<? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: Q0.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: nI.p<? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: nI.p<? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: nI.p<? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: nI.p<? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: nI.p<? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: nI.p<? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: nI.p<? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: nI.p<? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0114  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.ui.d r29, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r30, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r31, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r32, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r33, int r34, long r35, long r37, s0.C5848T r39, nI.q<? super s0.C5834E, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r40, U0.C4889m r41, int r42, int r43) {
        /*
            r13 = r42
            r14 = r43
            r0 = -1219521777(0xffffffffb74f930f, float:-1.2372401E-5)
            r1 = r41
            U0.m r1 = r1.k(r0)
            r2 = r14 & 1
            if (r2 == 0) goto L_0x0017
            r3 = r13 | 6
            r4 = r3
            r3 = r29
            goto L_0x002b
        L_0x0017:
            r3 = r13 & 6
            if (r3 != 0) goto L_0x0028
            r3 = r29
            boolean r4 = r1.V(r3)
            if (r4 == 0) goto L_0x0025
            r4 = 4
            goto L_0x0026
        L_0x0025:
            r4 = 2
        L_0x0026:
            r4 = r4 | r13
            goto L_0x002b
        L_0x0028:
            r3 = r29
            r4 = r13
        L_0x002b:
            r5 = r14 & 2
            if (r5 == 0) goto L_0x0034
            r4 = r4 | 48
        L_0x0031:
            r6 = r30
            goto L_0x0046
        L_0x0034:
            r6 = r13 & 48
            if (r6 != 0) goto L_0x0031
            r6 = r30
            boolean r7 = r1.F(r6)
            if (r7 == 0) goto L_0x0043
            r7 = 32
            goto L_0x0045
        L_0x0043:
            r7 = 16
        L_0x0045:
            r4 = r4 | r7
        L_0x0046:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x004f
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r8 = r31
            goto L_0x0061
        L_0x004f:
            r8 = r13 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x004c
            r8 = r31
            boolean r9 = r1.F(r8)
            if (r9 == 0) goto L_0x005e
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r4 = r4 | r9
        L_0x0061:
            r9 = r14 & 8
            if (r9 == 0) goto L_0x006a
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r10 = r32
            goto L_0x007c
        L_0x006a:
            r10 = r13 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0067
            r10 = r32
            boolean r11 = r1.F(r10)
            if (r11 == 0) goto L_0x0079
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r4 = r4 | r11
        L_0x007c:
            r11 = r14 & 16
            if (r11 == 0) goto L_0x0085
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r12 = r33
            goto L_0x0097
        L_0x0085:
            r12 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0082
            r12 = r33
            boolean r15 = r1.F(r12)
            if (r15 == 0) goto L_0x0094
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r4 = r4 | r15
        L_0x0097:
            r15 = r14 & 32
            r16 = 196608(0x30000, float:2.75506E-40)
            if (r15 == 0) goto L_0x00a2
            r4 = r4 | r16
            r0 = r34
            goto L_0x00b5
        L_0x00a2:
            r16 = r13 & r16
            r0 = r34
            if (r16 != 0) goto L_0x00b5
            boolean r17 = r1.d(r0)
            if (r17 == 0) goto L_0x00b1
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b3
        L_0x00b1:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00b3:
            r4 = r4 | r17
        L_0x00b5:
            r17 = 1572864(0x180000, float:2.204052E-39)
            r17 = r13 & r17
            if (r17 != 0) goto L_0x00d1
            r17 = r14 & 64
            r41 = r11
            r10 = r35
            if (r17 != 0) goto L_0x00cc
            boolean r17 = r1.e(r10)
            if (r17 == 0) goto L_0x00cc
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ce
        L_0x00cc:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00ce:
            r4 = r4 | r17
            goto L_0x00d5
        L_0x00d1:
            r41 = r11
            r10 = r35
        L_0x00d5:
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            r18 = r13 & r17
            if (r18 != 0) goto L_0x00ee
            r0 = r14 & 128(0x80, float:1.794E-43)
            r10 = r37
            if (r0 != 0) goto L_0x00ea
            boolean r0 = r1.e(r10)
            if (r0 == 0) goto L_0x00ea
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ec
        L_0x00ea:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ec:
            r4 = r4 | r0
            goto L_0x00f0
        L_0x00ee:
            r10 = r37
        L_0x00f0:
            r0 = 100663296(0x6000000, float:2.4074124E-35)
            r18 = r13 & r0
            if (r18 != 0) goto L_0x010c
            r0 = r14 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L_0x0105
            r0 = r39
            boolean r20 = r1.V(r0)
            if (r20 == 0) goto L_0x0107
            r20 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0109
        L_0x0105:
            r0 = r39
        L_0x0107:
            r20 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0109:
            r4 = r4 | r20
            goto L_0x010e
        L_0x010c:
            r0 = r39
        L_0x010e:
            r0 = r14 & 512(0x200, float:7.175E-43)
            r20 = 805306368(0x30000000, float:4.656613E-10)
            if (r0 == 0) goto L_0x0119
            r4 = r4 | r20
        L_0x0116:
            r0 = r40
            goto L_0x012c
        L_0x0119:
            r0 = r13 & r20
            if (r0 != 0) goto L_0x0116
            r0 = r40
            boolean r20 = r1.F(r0)
            if (r20 == 0) goto L_0x0128
            r20 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x012a
        L_0x0128:
            r20 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x012a:
            r4 = r4 | r20
        L_0x012c:
            r20 = 306783379(0x12492493, float:6.34695E-28)
            r0 = r4 & r20
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r3) goto L_0x014f
            boolean r0 = r1.l()
            if (r0 != 0) goto L_0x013d
            goto L_0x014f
        L_0x013d:
            r1.L()
            r2 = r29
            r4 = r32
            r13 = r39
            r3 = r8
            r5 = r12
            r8 = r34
            r11 = r10
            r9 = r35
            goto L_0x02c2
        L_0x014f:
            r1.G()
            r0 = r13 & 1
            r3 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r20 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r21 = -3670017(0xffffffffffc7ffff, float:NaN)
            if (r0 == 0) goto L_0x018a
            boolean r0 = r1.O()
            if (r0 == 0) goto L_0x0166
            goto L_0x018a
        L_0x0166:
            r1.L()
            r0 = r14 & 64
            if (r0 == 0) goto L_0x016f
            r4 = r4 & r21
        L_0x016f:
            r0 = r14 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0175
            r4 = r4 & r20
        L_0x0175:
            r0 = r14 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x017a
            r4 = r4 & r3
        L_0x017a:
            r0 = r29
            r9 = r4
            r2 = r6
            r5 = r8
            r7 = r12
            r6 = r32
            r8 = r34
            r3 = r35
        L_0x0186:
            r12 = r39
            goto L_0x01f9
        L_0x018a:
            if (r2 == 0) goto L_0x018f
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x0191
        L_0x018f:
            r0 = r29
        L_0x0191:
            if (r5 == 0) goto L_0x019a
            O0.A r2 = O0.A.f9676a
            nI.p r2 = r2.a()
            goto L_0x019b
        L_0x019a:
            r2 = r6
        L_0x019b:
            if (r7 == 0) goto L_0x01a4
            O0.A r5 = O0.A.f9676a
            nI.p r5 = r5.b()
            goto L_0x01a5
        L_0x01a4:
            r5 = r8
        L_0x01a5:
            if (r9 == 0) goto L_0x01ae
            O0.A r6 = O0.A.f9676a
            nI.p r6 = r6.c()
            goto L_0x01b0
        L_0x01ae:
            r6 = r32
        L_0x01b0:
            if (r41 == 0) goto L_0x01b9
            O0.A r7 = O0.A.f9676a
            nI.p r7 = r7.d()
            goto L_0x01ba
        L_0x01b9:
            r7 = r12
        L_0x01ba:
            if (r15 == 0) goto L_0x01c3
            O0.O$a r8 = O0.O.f9935a
            int r8 = r8.b()
            goto L_0x01c5
        L_0x01c3:
            r8 = r34
        L_0x01c5:
            r9 = r14 & 64
            r12 = 6
            if (r9 == 0) goto L_0x01da
            O0.X r9 = O0.X.f10101a
            O0.t r9 = r9.a(r1, r12)
            long r22 = r9.a()
            r4 = r4 & r21
            r9 = r4
            r3 = r22
            goto L_0x01dd
        L_0x01da:
            r9 = r4
            r3 = r35
        L_0x01dd:
            r15 = r14 & 128(0x80, float:1.794E-43)
            if (r15 == 0) goto L_0x01eb
            int r10 = r9 >> 18
            r10 = r10 & 14
            long r10 = O0.C4755u.c(r3, r1, r10)
            r9 = r9 & r20
        L_0x01eb:
            r15 = r14 & 256(0x100, float:3.59E-43)
            if (r15 == 0) goto L_0x0186
            O0.w0 r15 = O0.C4760w0.f11590a
            s0.T r12 = r15.a(r1, r12)
            r15 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r9 = r9 & r15
        L_0x01f9:
            r1.y()
            boolean r15 = U0.C4895p.J()
            if (r15 == 0) goto L_0x020b
            r15 = -1
            java.lang.String r13 = "androidx.compose.material3.Scaffold (Scaffold.kt:94)"
            r14 = -1219521777(0xffffffffb74f930f, float:-1.2372401E-5)
            U0.C4895p.S(r14, r9, r15, r13)
        L_0x020b:
            r13 = 234881024(0xe000000, float:1.5777218E-30)
            r13 = r13 & r9
            r14 = 100663296(0x6000000, float:2.4074124E-35)
            r13 = r13 ^ r14
            r15 = 67108864(0x4000000, float:1.5046328E-36)
            if (r13 <= r15) goto L_0x021b
            boolean r16 = r1.V(r12)
            if (r16 != 0) goto L_0x021e
        L_0x021b:
            r38 = r10
            goto L_0x0221
        L_0x021e:
            r38 = r10
            goto L_0x0225
        L_0x0221:
            r10 = r9 & r14
            if (r10 != r15) goto L_0x0227
        L_0x0225:
            r10 = 1
            goto L_0x0228
        L_0x0227:
            r10 = 0
        L_0x0228:
            java.lang.Object r11 = r1.D()
            if (r10 != 0) goto L_0x0236
            U0.m$a r10 = U0.C4889m.f14007a
            java.lang.Object r10 = r10.a()
            if (r11 != r10) goto L_0x023e
        L_0x0236:
            Q0.p r11 = new Q0.p
            r11.<init>(r12)
            r1.u(r11)
        L_0x023e:
            r10 = r11
            Q0.p r10 = (Q0.p) r10
            boolean r11 = r1.V(r10)
            r14 = 67108864(0x4000000, float:1.5046328E-36)
            if (r13 <= r14) goto L_0x024f
            boolean r13 = r1.V(r12)
            if (r13 != 0) goto L_0x0254
        L_0x024f:
            r13 = 100663296(0x6000000, float:2.4074124E-35)
            r13 = r13 & r9
            if (r13 != r14) goto L_0x0256
        L_0x0254:
            r13 = 1
            goto L_0x0257
        L_0x0256:
            r13 = 0
        L_0x0257:
            r11 = r11 | r13
            java.lang.Object r13 = r1.D()
            if (r11 != 0) goto L_0x0266
            U0.m$a r11 = U0.C4889m.f14007a
            java.lang.Object r11 = r11.a()
            if (r13 != r11) goto L_0x026e
        L_0x0266:
            O0.x0$a r13 = new O0.x0$a
            r13.<init>(r10, r12)
            r1.u(r13)
        L_0x026e:
            nI.l r13 = (nI.C17642l) r13
            androidx.compose.ui.d r15 = s0.C5851W.c(r0, r13)
            O0.x0$b r11 = new O0.x0$b
            r29 = r11
            r30 = r8
            r31 = r2
            r32 = r40
            r33 = r6
            r34 = r7
            r35 = r10
            r36 = r5
            r29.<init>(r30, r31, r32, r33, r34, r35, r36)
            r10 = 54
            r13 = -1979205334(0xffffffff8a07b92a, float:-6.534839E-33)
            r14 = 1
            c1.a r24 = c1.c.e(r13, r14, r11, r1, r10)
            int r9 = r9 >> 12
            r10 = r9 & 896(0x380, float:1.256E-42)
            r10 = r10 | r17
            r9 = r9 & 7168(0x1c00, float:1.0045E-41)
            r26 = r10 | r9
            r27 = 114(0x72, float:1.6E-43)
            r16 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r17 = r3
            r19 = r38
            r25 = r1
            O0.P0.a(r15, r16, r17, r19, r21, r22, r23, r24, r25, r26, r27)
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x02b9
            U0.C4895p.R()
        L_0x02b9:
            r9 = r3
            r3 = r5
            r4 = r6
            r5 = r7
            r13 = r12
            r11 = r38
            r6 = r2
            r2 = r0
        L_0x02c2:
            U0.Y0 r15 = r1.n()
            if (r15 == 0) goto L_0x02e1
            O0.x0$c r14 = new O0.x0$c
            r0 = r14
            r1 = r2
            r2 = r6
            r6 = r8
            r7 = r9
            r9 = r11
            r11 = r13
            r12 = r40
            r13 = r42
            r28 = r14
            r14 = r43
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r11, r12, r13, r14)
            r0 = r28
            r15.a(r0)
        L_0x02e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.C4762x0.a(androidx.compose.ui.d, nI.p, nI.p, nI.p, nI.p, int, long, long, s0.T, nI.q, U0.m, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: O0.x0$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: O0.x0$d} */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(int r18, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r19, nI.q<? super s0.C5834E, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r20, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r21, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r22, s0.C5848T r23, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r24, U0.C4889m r25, int r26) {
        /*
            r8 = r26
            r0 = -975511942(0xffffffffc5dade7a, float:-7003.8096)
            r1 = r25
            U0.m r1 = r1.k(r0)
            r2 = r8 & 6
            if (r2 != 0) goto L_0x001c
            r2 = r18
            boolean r4 = r1.d(r2)
            if (r4 == 0) goto L_0x0019
            r4 = 4
            goto L_0x001a
        L_0x0019:
            r4 = 2
        L_0x001a:
            r4 = r4 | r8
            goto L_0x001f
        L_0x001c:
            r2 = r18
            r4 = r8
        L_0x001f:
            r5 = r8 & 48
            r6 = 32
            if (r5 != 0) goto L_0x0033
            r5 = r19
            boolean r7 = r1.F(r5)
            if (r7 == 0) goto L_0x002f
            r7 = r6
            goto L_0x0031
        L_0x002f:
            r7 = 16
        L_0x0031:
            r4 = r4 | r7
            goto L_0x0035
        L_0x0033:
            r5 = r19
        L_0x0035:
            r7 = r8 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0048
            r7 = r20
            boolean r10 = r1.F(r7)
            if (r10 == 0) goto L_0x0044
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0046
        L_0x0044:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0046:
            r4 = r4 | r10
            goto L_0x004a
        L_0x0048:
            r7 = r20
        L_0x004a:
            r10 = r8 & 3072(0xc00, float:4.305E-42)
            r11 = 2048(0x800, float:2.87E-42)
            r15 = r21
            if (r10 != 0) goto L_0x005d
            boolean r10 = r1.F(r15)
            if (r10 == 0) goto L_0x005a
            r10 = r11
            goto L_0x005c
        L_0x005a:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x005c:
            r4 = r4 | r10
        L_0x005d:
            r10 = r8 & 24576(0x6000, float:3.4438E-41)
            r14 = r22
            if (r10 != 0) goto L_0x006f
            boolean r10 = r1.F(r14)
            if (r10 == 0) goto L_0x006c
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x006e
        L_0x006c:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x006e:
            r4 = r4 | r10
        L_0x006f:
            r10 = 196608(0x30000, float:2.75506E-40)
            r10 = r10 & r8
            r13 = 131072(0x20000, float:1.83671E-40)
            if (r10 != 0) goto L_0x0086
            r10 = r23
            boolean r16 = r1.V(r10)
            if (r16 == 0) goto L_0x0081
            r16 = r13
            goto L_0x0083
        L_0x0081:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x0083:
            r4 = r4 | r16
            goto L_0x0088
        L_0x0086:
            r10 = r23
        L_0x0088:
            r16 = 1572864(0x180000, float:2.204052E-39)
            r16 = r8 & r16
            r9 = r24
            if (r16 != 0) goto L_0x009d
            boolean r17 = r1.F(r9)
            if (r17 == 0) goto L_0x0099
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x009b
        L_0x0099:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x009b:
            r4 = r4 | r17
        L_0x009d:
            r17 = 599187(0x92493, float:8.3964E-40)
            r3 = r4 & r17
            r12 = 599186(0x92492, float:8.39638E-40)
            if (r3 != r12) goto L_0x00b3
            boolean r3 = r1.l()
            if (r3 != 0) goto L_0x00ae
            goto L_0x00b3
        L_0x00ae:
            r1.L()
            goto L_0x013b
        L_0x00b3:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x00bf
            r3 = -1
            java.lang.String r12 = "androidx.compose.material3.ScaffoldLayout (Scaffold.kt:138)"
            U0.C4895p.S(r0, r4, r3, r12)
        L_0x00bf:
            r0 = r4 & 112(0x70, float:1.57E-43)
            r3 = 0
            r12 = 1
            if (r0 != r6) goto L_0x00c7
            r0 = r12
            goto L_0x00c8
        L_0x00c7:
            r0 = r3
        L_0x00c8:
            r6 = r4 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != r11) goto L_0x00ce
            r6 = r12
            goto L_0x00cf
        L_0x00ce:
            r6 = r3
        L_0x00cf:
            r0 = r0 | r6
            r6 = 458752(0x70000, float:6.42848E-40)
            r6 = r6 & r4
            if (r6 != r13) goto L_0x00d7
            r6 = r12
            goto L_0x00d8
        L_0x00d7:
            r6 = r3
        L_0x00d8:
            r0 = r0 | r6
            r6 = 57344(0xe000, float:8.0356E-41)
            r6 = r6 & r4
            r11 = 16384(0x4000, float:2.2959E-41)
            if (r6 != r11) goto L_0x00e3
            r6 = r12
            goto L_0x00e4
        L_0x00e3:
            r6 = r3
        L_0x00e4:
            r0 = r0 | r6
            r6 = r4 & 14
            r11 = 4
            if (r6 != r11) goto L_0x00ec
            r6 = r12
            goto L_0x00ed
        L_0x00ec:
            r6 = r3
        L_0x00ed:
            r0 = r0 | r6
            r6 = 3670016(0x380000, float:5.142788E-39)
            r6 = r6 & r4
            r11 = 1048576(0x100000, float:1.469368E-39)
            if (r6 != r11) goto L_0x00f7
            r6 = r12
            goto L_0x00f8
        L_0x00f7:
            r6 = r3
        L_0x00f8:
            r0 = r0 | r6
            r4 = r4 & 896(0x380, float:1.256E-42)
            r6 = 256(0x100, float:3.59E-43)
            if (r4 != r6) goto L_0x0101
            r4 = r12
            goto L_0x0102
        L_0x0101:
            r4 = r3
        L_0x0102:
            r0 = r0 | r4
            java.lang.Object r4 = r1.D()
            if (r0 != 0) goto L_0x0114
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r4 != r0) goto L_0x0112
            goto L_0x0114
        L_0x0112:
            r0 = r12
            goto L_0x012c
        L_0x0114:
            O0.x0$d r4 = new O0.x0$d
            r9 = r4
            r10 = r19
            r11 = r21
            r0 = r12
            r12 = r22
            r13 = r18
            r14 = r23
            r15 = r24
            r16 = r20
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r1.u(r4)
        L_0x012c:
            nI.p r4 = (nI.p) r4
            r6 = 0
            E1.k0.b(r6, r4, r1, r3, r0)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x013b
            U0.C4895p.R()
        L_0x013b:
            U0.Y0 r9 = r1.n()
            if (r9 == 0) goto L_0x015a
            O0.x0$e r10 = new O0.x0$e
            r0 = r10
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x015a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.C4762x0.b(int, nI.p, nI.q, nI.p, nI.p, s0.T, nI.p, U0.m, int):void");
    }
}
