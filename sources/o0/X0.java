package O0;

import E1.H;
import E1.J;
import E1.K;
import E1.a0;
import E1.k0;
import E1.m0;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.foundation.o;
import androidx.recyclerview.widget.RecyclerView;
import bI.C17035a;
import c2.C5267b;
import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C5546i;
import m0.C5548j;
import m0.M;
import n0.C5601g;
import nI.C17642l;
import nI.p;
import nI.q;
import p1.i1;
import z0.C6270a;

@Metadata(d1 = {"\u0000J\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u001ar\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u00072\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a|\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u00072\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a`\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0018\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0003ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0001\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0018\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001c\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001b\"\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001f\"\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001f\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"", "selectedTabIndex", "Landroidx/compose/ui/d;", "modifier", "Lp1/v0;", "containerColor", "contentColor", "Lkotlin/Function1;", "", "LO0/V0;", "LXH/N;", "indicator", "Lkotlin/Function0;", "divider", "tabs", "c", "(ILandroidx/compose/ui/d;JJLnI/q;LnI/p;LnI/p;LU0/m;II)V", "Lc2/h;", "edgePadding", "a", "(ILandroidx/compose/ui/d;JJFLnI/q;LnI/p;LnI/p;LU0/m;II)V", "d", "(Landroidx/compose/ui/d;JJLnI/q;LnI/p;LnI/p;LU0/m;I)V", "Landroidx/compose/foundation/o;", "scrollState", "b", "(ILnI/q;Landroidx/compose/ui/d;JJFLnI/p;LnI/p;Landroidx/compose/foundation/o;LU0/m;II)V", "F", "ScrollableTabRowMinimumTabWidth", "Lm0/i;", "", "Lm0/i;", "ScrollableTabRowScrollSpec", "TabRowIndicatorSpec", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class X0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final float f10103a = c2.h.B((float) 90);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final C5546i<Float> f10104b = C5548j.j(250, 0, M.d(), 2, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final C5546i<c2.h> f10105c = C5548j.j(250, 0, M.d(), 2, (Object) null);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends C17544u implements q<List<? extends V0>, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f10106c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(int i10) {
            super(3);
            this.f10106c = i10;
        }

        public final void a(List<V0> list, C4889m mVar, int i10) {
            if (C4895p.J()) {
                C4895p.S(-913748678, i10, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous> (TabRow.kt:500)");
            }
            W0 w02 = W0.f10090a;
            w02.a(w02.e(androidx.compose.ui.d.f18749a, list.get(this.f10106c)), 0.0f, 0, mVar, 3072, 6);
            if (C4895p.J()) {
                C4895p.R();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((List) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f10107c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f10108d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f10109e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f10110f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ float f10111g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ q<List<V0>, C4889m, Integer, C16807N> f10112h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10113i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10114j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f10115k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f10116l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(int i10, androidx.compose.ui.d dVar, long j10, long j11, float f10, q<? super List<V0>, ? super C4889m, ? super Integer, C16807N> qVar, p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, int i11, int i12) {
            super(2);
            this.f10107c = i10;
            this.f10108d = dVar;
            this.f10109e = j10;
            this.f10110f = j11;
            this.f10111g = f10;
            this.f10112h = qVar;
            this.f10113i = pVar;
            this.f10114j = pVar2;
            this.f10115k = i11;
            this.f10116l = i12;
        }

        public final void a(C4889m mVar, int i10) {
            X0.a(this.f10107c, this.f10108d, this.f10109e, this.f10110f, this.f10111g, this.f10112h, this.f10113i, this.f10114j, mVar, M0.a(this.f10115k | 1), this.f10116l);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ o f10117c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f10118d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10119e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10120f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ q<List<V0>, C4889m, Integer, C16807N> f10121g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f10122h;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LE1/m0;", "Lc2/b;", "constraints", "LE1/J;", "a", "(LE1/m0;J)LE1/J;"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements p<m0, C5267b, J> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ float f10123c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ p<C4889m, Integer, C16807N> f10124d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ p<C4889m, Integer, C16807N> f10125e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C4766z0 f10126f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ int f10127g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ q<List<V0>, C4889m, Integer, C16807N> f10128h;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: O0.X0$c$a$a  reason: collision with other inner class name */
            static final class C0149a extends C17544u implements C17642l<a0.a, C16807N> {

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ int f10129c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ List<a0> f10130d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ m0 f10131e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ p<C4889m, Integer, C16807N> f10132f;

                /* renamed from: g  reason: collision with root package name */
                final /* synthetic */ C4766z0 f10133g;

                /* renamed from: h  reason: collision with root package name */
                final /* synthetic */ int f10134h;

                /* renamed from: i  reason: collision with root package name */
                final /* synthetic */ List<c2.h> f10135i;

                /* renamed from: j  reason: collision with root package name */
                final /* synthetic */ long f10136j;

                /* renamed from: k  reason: collision with root package name */
                final /* synthetic */ int f10137k;

                /* renamed from: l  reason: collision with root package name */
                final /* synthetic */ int f10138l;

                /* renamed from: m  reason: collision with root package name */
                final /* synthetic */ q<List<V0>, C4889m, Integer, C16807N> f10139m;

                @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
                /* renamed from: O0.X0$c$a$a$a  reason: collision with other inner class name */
                static final class C0150a extends C17544u implements p<C4889m, Integer, C16807N> {

                    /* renamed from: c  reason: collision with root package name */
                    final /* synthetic */ q<List<V0>, C4889m, Integer, C16807N> f10140c;

                    /* renamed from: d  reason: collision with root package name */
                    final /* synthetic */ List<V0> f10141d;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C0150a(q<? super List<V0>, ? super C4889m, ? super Integer, C16807N> qVar, List<V0> list) {
                        super(2);
                        this.f10140c = qVar;
                        this.f10141d = list;
                    }

                    public final void a(C4889m mVar, int i10) {
                        if ((i10 & 3) != 2 || !mVar.l()) {
                            if (C4895p.J()) {
                                C4895p.S(1734082948, i10, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:1094)");
                            }
                            this.f10140c.invoke(this.f10141d, mVar, 0);
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
                C0149a(int i10, List<a0> list, m0 m0Var, p<? super C4889m, ? super Integer, C16807N> pVar, C4766z0 z0Var, int i11, List<c2.h> list2, long j10, int i12, int i13, q<? super List<V0>, ? super C4889m, ? super Integer, C16807N> qVar) {
                    super(1);
                    this.f10129c = i10;
                    this.f10130d = list;
                    this.f10131e = m0Var;
                    this.f10132f = pVar;
                    this.f10133g = z0Var;
                    this.f10134h = i11;
                    this.f10135i = list2;
                    this.f10136j = j10;
                    this.f10137k = i12;
                    this.f10138l = i13;
                    this.f10139m = qVar;
                }

                public final void a(a0.a aVar) {
                    ArrayList arrayList = new ArrayList();
                    int i10 = this.f10129c;
                    List<a0> list = this.f10130d;
                    m0 m0Var = this.f10131e;
                    List<c2.h> list2 = this.f10135i;
                    int size = list.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        a0 a0Var = list.get(i11);
                        a0.a.m(aVar, a0Var, i10, 0, 0.0f, 4, (Object) null);
                        arrayList.add(new V0(m0Var.H(i10), m0Var.H(a0Var.E0()), list2.get(i11).G(), (DefaultConstructorMarker) null));
                        i10 += a0Var.E0();
                    }
                    List<H> S02 = this.f10131e.S0(Y0.Divider, this.f10132f);
                    long j10 = this.f10136j;
                    int i12 = this.f10137k;
                    int i13 = this.f10138l;
                    int i14 = 0;
                    for (int size2 = S02.size(); i14 < size2; size2 = size2) {
                        a0 i02 = S02.get(i14).i0(C5267b.d(j10, i12, i12, 0, 0, 8, (Object) null));
                        a0.a.m(aVar, i02, 0, i13 - i02.z0(), 0.0f, 4, (Object) null);
                        i14++;
                    }
                    List<H> S03 = this.f10131e.S0(Y0.Indicator, c1.c.c(1734082948, true, new C0150a(this.f10139m, arrayList)));
                    int i15 = this.f10137k;
                    int i16 = this.f10138l;
                    int size3 = S03.size();
                    for (int i17 = 0; i17 < size3; i17++) {
                        a0.a.m(aVar, S03.get(i17).i0(C5267b.f23024b.c(i15, i16)), 0, 0, 0.0f, 4, (Object) null);
                    }
                    this.f10133g.c(this.f10131e, this.f10129c, arrayList, this.f10134h);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((a0.a) obj);
                    return C16807N.f139792a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(float f10, p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, C4766z0 z0Var, int i10, q<? super List<V0>, ? super C4889m, ? super Integer, C16807N> qVar) {
                super(2);
                this.f10123c = f10;
                this.f10124d = pVar;
                this.f10125e = pVar2;
                this.f10126f = z0Var;
                this.f10127g = i10;
                this.f10128h = qVar;
            }

            public final J a(m0 m0Var, long j10) {
                m0 m0Var2 = m0Var;
                int K02 = m0Var2.K0(X0.f10103a);
                int K03 = m0Var2.K0(this.f10123c);
                List<H> S02 = m0Var2.S0(Y0.Tabs, this.f10124d);
                Integer num = 0;
                int size = S02.size();
                for (int i10 = 0; i10 < size; i10++) {
                    num = Integer.valueOf(Math.max(num.intValue(), S02.get(i10).x(Integer.MAX_VALUE)));
                }
                int intValue = num.intValue();
                long d10 = C5267b.d(j10, K02, 0, intValue, intValue, 2, (Object) null);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int size2 = S02.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    H h10 = S02.get(i11);
                    a0 i02 = h10.i0(d10);
                    float B10 = c2.h.B(m0Var2.H(Math.min(h10.h0(i02.z0()), i02.E0())) - c2.h.B(U0.m() * ((float) 2)));
                    arrayList.add(i02);
                    arrayList2.add(c2.h.m(B10));
                }
                Integer valueOf = Integer.valueOf(K03 * 2);
                int size3 = arrayList.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    valueOf = Integer.valueOf(valueOf.intValue() + ((a0) arrayList.get(i12)).E0());
                }
                int intValue2 = valueOf.intValue();
                return K.v0(m0Var, intValue2, intValue, (Map) null, new C0149a(K03, arrayList, m0Var, this.f10125e, this.f10126f, this.f10127g, arrayList2, j10, intValue2, intValue, this.f10128h), 4, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return a((m0) obj, ((C5267b) obj2).r());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(o oVar, float f10, p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, q<? super List<V0>, ? super C4889m, ? super Integer, C16807N> qVar, int i10) {
            super(2);
            this.f10117c = oVar;
            this.f10118d = f10;
            this.f10119e = pVar;
            this.f10120f = pVar2;
            this.f10121g = qVar;
            this.f10122h = i10;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: O0.z0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: O0.X0$c$a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: O0.X0$c$a} */
        /* JADX WARNING: type inference failed for: r5v17 */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x00d1, code lost:
            if (r5 == r3.a()) goto L_0x00d3;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(U0.C4889m r21, int r22) {
            /*
                r20 = this;
                r0 = r20
                r1 = r21
                r2 = r22
                r3 = r2 & 3
                r4 = 2
                if (r3 != r4) goto L_0x0017
                boolean r3 = r21.l()
                if (r3 != 0) goto L_0x0012
                goto L_0x0017
            L_0x0012:
                r21.L()
                goto L_0x00ea
            L_0x0017:
                boolean r3 = U0.C4895p.J()
                if (r3 == 0) goto L_0x0026
                r3 = -1
                java.lang.String r5 = "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl.<anonymous> (TabRow.kt:1016)"
                r6 = -1572959552(0xffffffffa23e8ac0, float:-2.5823255E-18)
                U0.C4895p.S(r6, r2, r3, r5)
            L_0x0026:
                java.lang.Object r2 = r21.D()
                U0.m$a r3 = U0.C4889m.f14007a
                java.lang.Object r5 = r3.a()
                if (r2 != r5) goto L_0x0041
                dI.j r2 = dI.C17169j.f142968a
                QJ.Q r2 = U0.P.k(r2, r1)
                U0.B r5 = new U0.B
                r5.<init>(r2)
                r1.u(r5)
                r2 = r5
            L_0x0041:
                U0.B r2 = (U0.B) r2
                QJ.Q r2 = r2.a()
                androidx.compose.foundation.o r5 = r0.f10117c
                boolean r5 = r1.V(r5)
                boolean r6 = r1.V(r2)
                r5 = r5 | r6
                androidx.compose.foundation.o r6 = r0.f10117c
                java.lang.Object r7 = r21.D()
                if (r5 != 0) goto L_0x0060
                java.lang.Object r5 = r3.a()
                if (r7 != r5) goto L_0x0068
            L_0x0060:
                O0.z0 r7 = new O0.z0
                r7.<init>(r6, r2)
                r1.u(r7)
            L_0x0068:
                r12 = r7
                O0.z0 r12 = (O0.C4766z0) r12
                androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
                r5 = 0
                r6 = 1
                r7 = 0
                androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.h(r2, r5, r6, r7)
                i1.c$a r5 = i1.C5437c.f24302a
                i1.c r5 = r5.h()
                r6 = 0
                androidx.compose.ui.d r13 = androidx.compose.foundation.layout.J.E(r2, r5, r6, r4, r7)
                androidx.compose.foundation.o r14 = r0.f10117c
                r18 = 14
                r19 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                androidx.compose.ui.d r2 = androidx.compose.foundation.m.b(r13, r14, r15, r16, r17, r18, r19)
                androidx.compose.ui.d r2 = z0.C6270a.a(r2)
                androidx.compose.ui.d r2 = m1.e.b(r2)
                float r4 = r0.f10118d
                boolean r4 = r1.c(r4)
                nI.p<U0.m, java.lang.Integer, XH.N> r5 = r0.f10119e
                boolean r5 = r1.V(r5)
                r4 = r4 | r5
                nI.p<U0.m, java.lang.Integer, XH.N> r5 = r0.f10120f
                boolean r5 = r1.V(r5)
                r4 = r4 | r5
                nI.q<java.util.List<O0.V0>, U0.m, java.lang.Integer, XH.N> r5 = r0.f10121g
                boolean r5 = r1.V(r5)
                r4 = r4 | r5
                boolean r5 = r1.F(r12)
                r4 = r4 | r5
                int r5 = r0.f10122h
                boolean r5 = r1.d(r5)
                r4 = r4 | r5
                float r9 = r0.f10118d
                nI.p<U0.m, java.lang.Integer, XH.N> r10 = r0.f10119e
                nI.p<U0.m, java.lang.Integer, XH.N> r11 = r0.f10120f
                int r13 = r0.f10122h
                nI.q<java.util.List<O0.V0>, U0.m, java.lang.Integer, XH.N> r14 = r0.f10121g
                java.lang.Object r5 = r21.D()
                if (r4 != 0) goto L_0x00d3
                java.lang.Object r3 = r3.a()
                if (r5 != r3) goto L_0x00dc
            L_0x00d3:
                O0.X0$c$a r5 = new O0.X0$c$a
                r8 = r5
                r8.<init>(r9, r10, r11, r12, r13, r14)
                r1.u(r5)
            L_0x00dc:
                nI.p r5 = (nI.p) r5
                E1.k0.b(r2, r5, r1, r6, r6)
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x00ea
                U0.C4895p.R()
            L_0x00ea:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: O0.X0.c.a(U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f10142c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ q<List<V0>, C4889m, Integer, C16807N> f10143d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f10144e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f10145f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f10146g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ float f10147h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10148i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10149j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ o f10150k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f10151l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f10152m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(int i10, q<? super List<V0>, ? super C4889m, ? super Integer, C16807N> qVar, androidx.compose.ui.d dVar, long j10, long j11, float f10, p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, o oVar, int i11, int i12) {
            super(2);
            this.f10142c = i10;
            this.f10143d = qVar;
            this.f10144e = dVar;
            this.f10145f = j10;
            this.f10146g = j11;
            this.f10147h = f10;
            this.f10148i = pVar;
            this.f10149j = pVar2;
            this.f10150k = oVar;
            this.f10151l = i11;
            this.f10152m = i12;
        }

        public final void a(C4889m mVar, int i10) {
            X0.b(this.f10142c, this.f10143d, this.f10144e, this.f10145f, this.f10146g, this.f10147h, this.f10148i, this.f10149j, this.f10150k, mVar, M0.a(this.f10151l | 1), this.f10152m);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends C17544u implements q<List<? extends V0>, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f10153c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(int i10) {
            super(3);
            this.f10153c = i10;
        }

        public final void a(List<V0> list, C4889m mVar, int i10) {
            if (C4895p.J()) {
                C4895p.S(-2052073983, i10, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:306)");
            }
            if (this.f10153c < list.size()) {
                W0 w02 = W0.f10090a;
                w02.a(w02.e(androidx.compose.ui.d.f18749a, list.get(this.f10153c)), 0.0f, 0, mVar, 3072, 6);
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((List) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class f extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f10154c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f10155d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f10156e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f10157f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ q<List<V0>, C4889m, Integer, C16807N> f10158g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10159h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10160i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f10161j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f10162k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(int i10, androidx.compose.ui.d dVar, long j10, long j11, q<? super List<V0>, ? super C4889m, ? super Integer, C16807N> qVar, p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, int i11, int i12) {
            super(2);
            this.f10154c = i10;
            this.f10155d = dVar;
            this.f10156e = j10;
            this.f10157f = j11;
            this.f10158g = qVar;
            this.f10159h = pVar;
            this.f10160i = pVar2;
            this.f10161j = i11;
            this.f10162k = i12;
        }

        public final void a(C4889m mVar, int i10) {
            X0.c(this.f10154c, this.f10155d, this.f10156e, this.f10157f, this.f10158g, this.f10159h, this.f10160i, mVar, M0.a(this.f10161j | 1), this.f10162k);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10163c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10164d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ q<List<V0>, C4889m, Integer, C16807N> f10165e;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LE1/m0;", "Lc2/b;", "constraints", "LE1/J;", "a", "(LE1/m0;J)LE1/J;"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements p<m0, C5267b, J> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ p<C4889m, Integer, C16807N> f10166c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ p<C4889m, Integer, C16807N> f10167d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ q<List<V0>, C4889m, Integer, C16807N> f10168e;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: O0.X0$g$a$a  reason: collision with other inner class name */
            static final class C0151a extends C17544u implements C17642l<a0.a, C16807N> {

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ List<a0> f10169c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ m0 f10170d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ p<C4889m, Integer, C16807N> f10171e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ kotlin.jvm.internal.M f10172f;

                /* renamed from: g  reason: collision with root package name */
                final /* synthetic */ long f10173g;

                /* renamed from: h  reason: collision with root package name */
                final /* synthetic */ int f10174h;

                /* renamed from: i  reason: collision with root package name */
                final /* synthetic */ q<List<V0>, C4889m, Integer, C16807N> f10175i;

                /* renamed from: j  reason: collision with root package name */
                final /* synthetic */ List<V0> f10176j;

                /* renamed from: k  reason: collision with root package name */
                final /* synthetic */ int f10177k;

                @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
                /* renamed from: O0.X0$g$a$a$a  reason: collision with other inner class name */
                static final class C0152a extends C17544u implements p<C4889m, Integer, C16807N> {

                    /* renamed from: c  reason: collision with root package name */
                    final /* synthetic */ q<List<V0>, C4889m, Integer, C16807N> f10178c;

                    /* renamed from: d  reason: collision with root package name */
                    final /* synthetic */ List<V0> f10179d;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C0152a(q<? super List<V0>, ? super C4889m, ? super Integer, C16807N> qVar, List<V0> list) {
                        super(2);
                        this.f10178c = qVar;
                        this.f10179d = list;
                    }

                    public final void a(C4889m mVar, int i10) {
                        if ((i10 & 3) != 2 || !mVar.l()) {
                            if (C4895p.J()) {
                                C4895p.S(1621992604, i10, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:994)");
                            }
                            this.f10178c.invoke(this.f10179d, mVar, 0);
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
                C0151a(List<? extends a0> list, m0 m0Var, p<? super C4889m, ? super Integer, C16807N> pVar, kotlin.jvm.internal.M m10, long j10, int i10, q<? super List<V0>, ? super C4889m, ? super Integer, C16807N> qVar, List<V0> list2, int i11) {
                    super(1);
                    this.f10169c = list;
                    this.f10170d = m0Var;
                    this.f10171e = pVar;
                    this.f10172f = m10;
                    this.f10173g = j10;
                    this.f10174h = i10;
                    this.f10175i = qVar;
                    this.f10176j = list2;
                    this.f10177k = i11;
                }

                public final void a(a0.a aVar) {
                    List<a0> list = this.f10169c;
                    kotlin.jvm.internal.M m10 = this.f10172f;
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        a0.a.m(aVar, list.get(i10), i10 * m10.f144346a, 0, 0.0f, 4, (Object) null);
                    }
                    List<H> S02 = this.f10170d.S0(Y0.Divider, this.f10171e);
                    long j10 = this.f10173g;
                    int i11 = this.f10174h;
                    int size2 = S02.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        a0 i02 = S02.get(i12).i0(C5267b.d(j10, 0, 0, 0, 0, 11, (Object) null));
                        a0.a.m(aVar, i02, 0, i11 - i02.z0(), 0.0f, 4, (Object) null);
                    }
                    List<H> S03 = this.f10170d.S0(Y0.Indicator, c1.c.c(1621992604, true, new C0152a(this.f10175i, this.f10176j)));
                    int i13 = this.f10177k;
                    int i14 = this.f10174h;
                    int size3 = S03.size();
                    for (int i15 = 0; i15 < size3; i15++) {
                        a0.a.m(aVar, S03.get(i15).i0(C5267b.f23024b.c(i13, i14)), 0, 0, 0.0f, 4, (Object) null);
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((a0.a) obj);
                    return C16807N.f139792a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, q<? super List<V0>, ? super C4889m, ? super Integer, C16807N> qVar) {
                super(2);
                this.f10166c = pVar;
                this.f10167d = pVar2;
                this.f10168e = qVar;
            }

            public final J a(m0 m0Var, long j10) {
                m0 m0Var2 = m0Var;
                int l10 = C5267b.l(j10);
                List<H> S02 = m0Var2.S0(Y0.Tabs, this.f10166c);
                int size = S02.size();
                kotlin.jvm.internal.M m10 = new kotlin.jvm.internal.M();
                if (size > 0) {
                    m10.f144346a = l10 / size;
                }
                Integer num = 0;
                int size2 = S02.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    num = Integer.valueOf(Math.max(S02.get(i10).x(m10.f144346a), num.intValue()));
                }
                int intValue = num.intValue();
                ArrayList arrayList = new ArrayList(S02.size());
                int size3 = S02.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    int i12 = m10.f144346a;
                    arrayList.add(S02.get(i11).i0(C5267b.c(j10, i12, i12, intValue, intValue)));
                }
                ArrayList arrayList2 = new ArrayList(size);
                for (int i13 = 0; i13 < size; i13++) {
                    arrayList2.add(new V0(c2.h.B(m0Var2.H(m10.f144346a) * ((float) i13)), m0Var2.H(m10.f144346a), ((c2.h) C17035a.k(c2.h.m(c2.h.B(m0Var2.H(Math.min(S02.get(i13).h0(intValue), m10.f144346a)) - c2.h.B(U0.m() * ((float) 2)))), c2.h.m(c2.h.B((float) 24)))).G(), (DefaultConstructorMarker) null));
                }
                return K.v0(m0Var, l10, intValue, (Map) null, new C0151a(arrayList, m0Var, this.f10167d, m10, j10, intValue, this.f10168e, arrayList2, l10), 4, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return a((m0) obj, ((C5267b) obj2).r());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, q<? super List<V0>, ? super C4889m, ? super Integer, C16807N> qVar) {
            super(2);
            this.f10163c = pVar;
            this.f10164d = pVar2;
            this.f10165e = qVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1617702432, i10, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl.<anonymous> (TabRow.kt:948)");
                }
                androidx.compose.ui.d h10 = androidx.compose.foundation.layout.J.h(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null);
                boolean V10 = mVar.V(this.f10163c) | mVar.V(this.f10164d) | mVar.V(this.f10165e);
                p<C4889m, Integer, C16807N> pVar = this.f10163c;
                p<C4889m, Integer, C16807N> pVar2 = this.f10164d;
                q<List<V0>, C4889m, Integer, C16807N> qVar = this.f10165e;
                Object D10 = mVar.D();
                if (V10 || D10 == C4889m.f14007a.a()) {
                    D10 = new a(pVar, pVar2, qVar);
                    mVar.u(D10);
                }
                k0.b(h10, (p) D10, mVar, 6, 0);
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
    static final class h extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f10180c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f10181d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f10182e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ q<List<V0>, C4889m, Integer, C16807N> f10183f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10184g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10185h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f10186i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(androidx.compose.ui.d dVar, long j10, long j11, q<? super List<V0>, ? super C4889m, ? super Integer, C16807N> qVar, p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, int i10) {
            super(2);
            this.f10180c = dVar;
            this.f10181d = j10;
            this.f10182e = j11;
            this.f10183f = qVar;
            this.f10184g = pVar;
            this.f10185h = pVar2;
            this.f10186i = i10;
        }

        public final void a(C4889m mVar, int i10) {
            X0.d(this.f10180c, this.f10181d, this.f10182e, this.f10183f, this.f10184g, this.f10185h, mVar, M0.a(this.f10186i | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:129:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x010a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(int r27, androidx.compose.ui.d r28, long r29, long r31, float r33, nI.q<? super java.util.List<O0.V0>, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r34, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r35, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r36, U0.C4889m r37, int r38, int r39) {
        /*
            r14 = r27
            r15 = r38
            r13 = r39
            r0 = -497821003(0xffffffffe253dab5, float:-9.770056E20)
            r1 = r37
            U0.m r12 = r1.k(r0)
            r1 = r13 & 1
            if (r1 == 0) goto L_0x0016
            r1 = r15 | 6
            goto L_0x0026
        L_0x0016:
            r1 = r15 & 6
            if (r1 != 0) goto L_0x0025
            boolean r1 = r12.d(r14)
            if (r1 == 0) goto L_0x0022
            r1 = 4
            goto L_0x0023
        L_0x0022:
            r1 = 2
        L_0x0023:
            r1 = r1 | r15
            goto L_0x0026
        L_0x0025:
            r1 = r15
        L_0x0026:
            r2 = r13 & 2
            if (r2 == 0) goto L_0x002f
            r1 = r1 | 48
        L_0x002c:
            r3 = r28
            goto L_0x0041
        L_0x002f:
            r3 = r15 & 48
            if (r3 != 0) goto L_0x002c
            r3 = r28
            boolean r4 = r12.V(r3)
            if (r4 == 0) goto L_0x003e
            r4 = 32
            goto L_0x0040
        L_0x003e:
            r4 = 16
        L_0x0040:
            r1 = r1 | r4
        L_0x0041:
            r4 = r15 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x005a
            r4 = r13 & 4
            if (r4 != 0) goto L_0x0054
            r4 = r29
            boolean r6 = r12.e(r4)
            if (r6 == 0) goto L_0x0056
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0058
        L_0x0054:
            r4 = r29
        L_0x0056:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0058:
            r1 = r1 | r6
            goto L_0x005c
        L_0x005a:
            r4 = r29
        L_0x005c:
            r6 = r15 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x0075
            r6 = r13 & 8
            if (r6 != 0) goto L_0x006f
            r6 = r31
            boolean r8 = r12.e(r6)
            if (r8 == 0) goto L_0x0071
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0073
        L_0x006f:
            r6 = r31
        L_0x0071:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0073:
            r1 = r1 | r8
            goto L_0x0077
        L_0x0075:
            r6 = r31
        L_0x0077:
            r8 = r13 & 16
            if (r8 == 0) goto L_0x0080
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x007d:
            r9 = r33
            goto L_0x0092
        L_0x0080:
            r9 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x007d
            r9 = r33
            boolean r10 = r12.c(r9)
            if (r10 == 0) goto L_0x008f
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0091
        L_0x008f:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x0091:
            r1 = r1 | r10
        L_0x0092:
            r10 = r13 & 32
            r11 = 196608(0x30000, float:2.75506E-40)
            if (r10 == 0) goto L_0x009c
            r1 = r1 | r11
        L_0x0099:
            r11 = r34
            goto L_0x00ae
        L_0x009c:
            r11 = r11 & r15
            if (r11 != 0) goto L_0x0099
            r11 = r34
            boolean r16 = r12.F(r11)
            if (r16 == 0) goto L_0x00aa
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ac
        L_0x00aa:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00ac:
            r1 = r1 | r16
        L_0x00ae:
            r16 = r13 & 64
            r17 = 1572864(0x180000, float:2.204052E-39)
            if (r16 == 0) goto L_0x00b9
            r1 = r1 | r17
            r0 = r35
            goto L_0x00cc
        L_0x00b9:
            r17 = r15 & r17
            r0 = r35
            if (r17 != 0) goto L_0x00cc
            boolean r18 = r12.F(r0)
            if (r18 == 0) goto L_0x00c8
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ca
        L_0x00c8:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00ca:
            r1 = r1 | r18
        L_0x00cc:
            r0 = r13 & 128(0x80, float:1.794E-43)
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00d7
            r1 = r1 | r18
        L_0x00d4:
            r0 = r36
            goto L_0x00ea
        L_0x00d7:
            r0 = r15 & r18
            if (r0 != 0) goto L_0x00d4
            r0 = r36
            boolean r18 = r12.F(r0)
            if (r18 == 0) goto L_0x00e6
            r18 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e8
        L_0x00e6:
            r18 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e8:
            r1 = r1 | r18
        L_0x00ea:
            r18 = 4793491(0x492493, float:6.717112E-39)
            r0 = r1 & r18
            r3 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r3) goto L_0x010a
            boolean r0 = r12.l()
            if (r0 != 0) goto L_0x00fb
            goto L_0x010a
        L_0x00fb:
            r12.L()
            r2 = r28
            r3 = r4
            r5 = r6
            r7 = r9
            r8 = r11
            r26 = r12
            r9 = r35
            goto L_0x01ec
        L_0x010a:
            r12.G()
            r0 = r15 & 1
            if (r0 == 0) goto L_0x0134
            boolean r0 = r12.O()
            if (r0 == 0) goto L_0x0118
            goto L_0x0134
        L_0x0118:
            r12.L()
            r0 = r13 & 4
            if (r0 == 0) goto L_0x0121
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0121:
            r0 = r13 & 8
            if (r0 == 0) goto L_0x0127
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0127:
            r16 = r28
            r24 = r35
        L_0x012b:
            r18 = r4
            r20 = r6
            r22 = r9
            r23 = r11
            goto L_0x0182
        L_0x0134:
            if (r2 == 0) goto L_0x0139
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x013b
        L_0x0139:
            r0 = r28
        L_0x013b:
            r2 = r13 & 4
            r3 = 6
            if (r2 == 0) goto L_0x0148
            O0.W0 r2 = O0.W0.f10090a
            long r4 = r2.b(r12, r3)
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0148:
            r2 = r13 & 8
            if (r2 == 0) goto L_0x0155
            O0.W0 r2 = O0.W0.f10090a
            long r2 = r2.c(r12, r3)
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
            r6 = r2
        L_0x0155:
            if (r8 == 0) goto L_0x015e
            O0.W0 r2 = O0.W0.f10090a
            float r2 = r2.d()
            r9 = r2
        L_0x015e:
            if (r10 == 0) goto L_0x0170
            O0.X0$a r2 = new O0.X0$a
            r2.<init>(r14)
            r3 = 54
            r8 = -913748678(0xffffffffc9894d3a, float:-1124775.2)
            r10 = 1
            c1.a r2 = c1.c.e(r8, r10, r2, r12, r3)
            r11 = r2
        L_0x0170:
            if (r16 == 0) goto L_0x017d
            O0.D r2 = O0.D.f9702a
            nI.p r2 = r2.b()
            r16 = r0
            r24 = r2
            goto L_0x012b
        L_0x017d:
            r24 = r35
            r16 = r0
            goto L_0x012b
        L_0x0182:
            r12.y()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0194
            r0 = -1
            java.lang.String r2 = "androidx.compose.material3.ScrollableTabRow (TabRow.kt:506)"
            r3 = -497821003(0xffffffffe253dab5, float:-9.770056E20)
            U0.C4895p.S(r3, r1, r0, r2)
        L_0x0194:
            r0 = 0
            r2 = 1
            androidx.compose.foundation.o r10 = androidx.compose.foundation.m.c(r0, r12, r0, r2)
            r0 = r1 & 14
            int r2 = r1 >> 12
            r2 = r2 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            int r2 = r1 << 3
            r3 = r2 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            r3 = r2 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r2
            r0 = r0 | r3
            r3 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r3
            r0 = r0 | r2
            r2 = 3670016(0x380000, float:5.142788E-39)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 29360128(0x1c00000, float:7.052966E-38)
            r1 = r1 & r2
            r17 = r0 | r1
            r25 = 0
            r0 = r27
            r1 = r23
            r2 = r16
            r3 = r18
            r5 = r20
            r7 = r22
            r8 = r24
            r9 = r36
            r11 = r12
            r26 = r12
            r12 = r17
            r13 = r25
            b(r0, r1, r2, r3, r5, r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01e0
            U0.C4895p.R()
        L_0x01e0:
            r2 = r16
            r3 = r18
            r5 = r20
            r7 = r22
            r8 = r23
            r9 = r24
        L_0x01ec:
            U0.Y0 r13 = r26.n()
            if (r13 == 0) goto L_0x0204
            O0.X0$b r12 = new O0.X0$b
            r0 = r12
            r1 = r27
            r10 = r36
            r11 = r38
            r14 = r12
            r12 = r39
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
            r13.a(r14)
        L_0x0204:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.X0.a(int, androidx.compose.ui.d, long, long, float, nI.q, nI.p, nI.p, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x00f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(int r27, nI.q<? super java.util.List<O0.V0>, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r28, androidx.compose.ui.d r29, long r30, long r32, float r34, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r35, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r36, androidx.compose.foundation.o r37, U0.C4889m r38, int r39, int r40) {
        /*
            r12 = r39
            r13 = r40
            r0 = -955409947(0xffffffffc70d99e5, float:-36249.895)
            r1 = r38
            U0.m r1 = r1.k(r0)
            r2 = r13 & 1
            if (r2 == 0) goto L_0x0017
            r2 = r12 | 6
            r3 = r2
            r2 = r27
            goto L_0x002b
        L_0x0017:
            r2 = r12 & 6
            if (r2 != 0) goto L_0x0028
            r2 = r27
            boolean r3 = r1.d(r2)
            if (r3 == 0) goto L_0x0025
            r3 = 4
            goto L_0x0026
        L_0x0025:
            r3 = 2
        L_0x0026:
            r3 = r3 | r12
            goto L_0x002b
        L_0x0028:
            r2 = r27
            r3 = r12
        L_0x002b:
            r4 = r13 & 2
            if (r4 == 0) goto L_0x0034
            r3 = r3 | 48
        L_0x0031:
            r4 = r28
            goto L_0x0046
        L_0x0034:
            r4 = r12 & 48
            if (r4 != 0) goto L_0x0031
            r4 = r28
            boolean r5 = r1.F(r4)
            if (r5 == 0) goto L_0x0043
            r5 = 32
            goto L_0x0045
        L_0x0043:
            r5 = 16
        L_0x0045:
            r3 = r3 | r5
        L_0x0046:
            r5 = r13 & 4
            if (r5 == 0) goto L_0x004f
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r6 = r29
            goto L_0x0061
        L_0x004f:
            r6 = r12 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x004c
            r6 = r29
            boolean r7 = r1.V(r6)
            if (r7 == 0) goto L_0x005e
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r3 = r3 | r7
        L_0x0061:
            r7 = r12 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x007a
            r7 = r13 & 8
            if (r7 != 0) goto L_0x0074
            r7 = r30
            boolean r9 = r1.e(r7)
            if (r9 == 0) goto L_0x0076
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0078
        L_0x0074:
            r7 = r30
        L_0x0076:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0078:
            r3 = r3 | r9
            goto L_0x007c
        L_0x007a:
            r7 = r30
        L_0x007c:
            r9 = r12 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x0095
            r9 = r13 & 16
            if (r9 != 0) goto L_0x008f
            r9 = r32
            boolean r11 = r1.e(r9)
            if (r11 == 0) goto L_0x0091
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0093
        L_0x008f:
            r9 = r32
        L_0x0091:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x0093:
            r3 = r3 | r11
            goto L_0x0097
        L_0x0095:
            r9 = r32
        L_0x0097:
            r11 = r13 & 32
            r14 = 196608(0x30000, float:2.75506E-40)
            if (r11 == 0) goto L_0x00a1
            r3 = r3 | r14
        L_0x009e:
            r14 = r34
            goto L_0x00b2
        L_0x00a1:
            r14 = r14 & r12
            if (r14 != 0) goto L_0x009e
            r14 = r34
            boolean r15 = r1.c(r14)
            if (r15 == 0) goto L_0x00af
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b1
        L_0x00af:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00b1:
            r3 = r3 | r15
        L_0x00b2:
            r15 = r13 & 64
            r16 = 1572864(0x180000, float:2.204052E-39)
            if (r15 == 0) goto L_0x00bd
            r3 = r3 | r16
            r0 = r35
            goto L_0x00d0
        L_0x00bd:
            r16 = r12 & r16
            r0 = r35
            if (r16 != 0) goto L_0x00d0
            boolean r17 = r1.F(r0)
            if (r17 == 0) goto L_0x00cc
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ce
        L_0x00cc:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00ce:
            r3 = r3 | r17
        L_0x00d0:
            r0 = r13 & 128(0x80, float:1.794E-43)
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00db
            r3 = r3 | r17
        L_0x00d8:
            r0 = r36
            goto L_0x00ee
        L_0x00db:
            r0 = r12 & r17
            if (r0 != 0) goto L_0x00d8
            r0 = r36
            boolean r18 = r1.F(r0)
            if (r18 == 0) goto L_0x00ea
            r18 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ec
        L_0x00ea:
            r18 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ec:
            r3 = r3 | r18
        L_0x00ee:
            r0 = r13 & 256(0x100, float:3.59E-43)
            r18 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 == 0) goto L_0x00f9
            r3 = r3 | r18
        L_0x00f6:
            r0 = r37
            goto L_0x010c
        L_0x00f9:
            r0 = r12 & r18
            if (r0 != 0) goto L_0x00f6
            r0 = r37
            boolean r18 = r1.V(r0)
            if (r18 == 0) goto L_0x0108
            r18 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010a
        L_0x0108:
            r18 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010a:
            r3 = r3 | r18
        L_0x010c:
            r18 = 38347923(0x2492493, float:1.4777644E-37)
            r0 = r3 & r18
            r2 = 38347922(0x2492492, float:1.4777643E-37)
            if (r0 != r2) goto L_0x0125
            boolean r0 = r1.l()
            if (r0 != 0) goto L_0x011d
            goto L_0x0125
        L_0x011d:
            r1.L()
            r11 = r35
        L_0x0122:
            r3 = r6
            goto L_0x01d8
        L_0x0125:
            r1.G()
            r0 = r12 & 1
            r2 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x0148
            boolean r0 = r1.O()
            if (r0 == 0) goto L_0x0136
            goto L_0x0148
        L_0x0136:
            r1.L()
            r0 = r13 & 8
            if (r0 == 0) goto L_0x013f
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x013f:
            r0 = r13 & 16
            if (r0 == 0) goto L_0x0144
            r3 = r3 & r2
        L_0x0144:
            r2 = r35
        L_0x0146:
            r0 = r14
            goto L_0x017a
        L_0x0148:
            if (r5 == 0) goto L_0x014d
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r6 = r0
        L_0x014d:
            r0 = r13 & 8
            r5 = 6
            if (r0 == 0) goto L_0x015a
            O0.W0 r0 = O0.W0.f10090a
            long r7 = r0.b(r1, r5)
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x015a:
            r0 = r13 & 16
            if (r0 == 0) goto L_0x0167
            O0.W0 r0 = O0.W0.f10090a
            long r9 = r0.c(r1, r5)
            r0 = r3 & r2
            r3 = r0
        L_0x0167:
            if (r11 == 0) goto L_0x0170
            O0.W0 r0 = O0.W0.f10090a
            float r0 = r0.d()
            r14 = r0
        L_0x0170:
            if (r15 == 0) goto L_0x0144
            O0.D r0 = O0.D.f9702a
            nI.p r0 = r0.c()
            r2 = r0
            goto L_0x0146
        L_0x017a:
            r1.y()
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x018c
            r5 = -1
            java.lang.String r11 = "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl (TabRow.kt:1014)"
            r14 = -955409947(0xffffffffc70d99e5, float:-36249.895)
            U0.C4895p.S(r14, r3, r5, r11)
        L_0x018c:
            O0.X0$c r5 = new O0.X0$c
            r29 = r5
            r30 = r37
            r31 = r0
            r32 = r36
            r33 = r2
            r34 = r28
            r35 = r27
            r29.<init>(r30, r31, r32, r33, r34, r35)
            r11 = 54
            r14 = -1572959552(0xffffffffa23e8ac0, float:-2.5823255E-18)
            r15 = 1
            c1.a r23 = c1.c.e(r14, r15, r5, r1, r11)
            int r5 = r3 >> 6
            r5 = r5 & 14
            r5 = r5 | r17
            int r3 = r3 >> 3
            r11 = r3 & 896(0x380, float:1.256E-42)
            r5 = r5 | r11
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r25 = r5 | r3
            r26 = 114(0x72, float:1.6E-43)
            r15 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r14 = r6
            r16 = r7
            r18 = r9
            r24 = r1
            O0.P0.a(r14, r15, r16, r18, r20, r21, r22, r23, r24, r25, r26)
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x01d4
            U0.C4895p.R()
        L_0x01d4:
            r14 = r0
            r11 = r2
            goto L_0x0122
        L_0x01d8:
            U0.Y0 r15 = r1.n()
            if (r15 == 0) goto L_0x01fa
            O0.X0$d r6 = new O0.X0$d
            r0 = r6
            r1 = r27
            r2 = r28
            r4 = r7
            r8 = r6
            r6 = r9
            r10 = r8
            r8 = r14
            r9 = r11
            r14 = r10
            r10 = r36
            r11 = r37
            r12 = r39
            r13 = r40
            r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10, r11, r12, r13)
            r15.a(r14)
        L_0x01fa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.X0.b(int, nI.q, androidx.compose.ui.d, long, long, float, nI.p, nI.p, androidx.compose.foundation.o, U0.m, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(int r21, androidx.compose.ui.d r22, long r23, long r25, nI.q<? super java.util.List<O0.V0>, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r27, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r28, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r29, U0.C4889m r30, int r31, int r32) {
        /*
            r1 = r21
            r10 = r31
            r0 = -1199178586(0xffffffffb885fca6, float:-6.388994E-5)
            r2 = r30
            U0.m r2 = r2.k(r0)
            r3 = r32 & 1
            if (r3 == 0) goto L_0x0014
            r3 = r10 | 6
            goto L_0x0024
        L_0x0014:
            r3 = r10 & 6
            if (r3 != 0) goto L_0x0023
            boolean r3 = r2.d(r1)
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
            r4 = r32 & 2
            if (r4 == 0) goto L_0x002d
            r3 = r3 | 48
        L_0x002a:
            r5 = r22
            goto L_0x003f
        L_0x002d:
            r5 = r10 & 48
            if (r5 != 0) goto L_0x002a
            r5 = r22
            boolean r6 = r2.V(r5)
            if (r6 == 0) goto L_0x003c
            r6 = 32
            goto L_0x003e
        L_0x003c:
            r6 = 16
        L_0x003e:
            r3 = r3 | r6
        L_0x003f:
            r6 = r10 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0058
            r6 = r32 & 4
            if (r6 != 0) goto L_0x0052
            r6 = r23
            boolean r8 = r2.e(r6)
            if (r8 == 0) goto L_0x0054
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0056
        L_0x0052:
            r6 = r23
        L_0x0054:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0056:
            r3 = r3 | r8
            goto L_0x005a
        L_0x0058:
            r6 = r23
        L_0x005a:
            r8 = r10 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0073
            r8 = r32 & 8
            if (r8 != 0) goto L_0x006d
            r8 = r25
            boolean r11 = r2.e(r8)
            if (r11 == 0) goto L_0x006f
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0071
        L_0x006d:
            r8 = r25
        L_0x006f:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0071:
            r3 = r3 | r11
            goto L_0x0075
        L_0x0073:
            r8 = r25
        L_0x0075:
            r11 = r32 & 16
            if (r11 == 0) goto L_0x007e
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x007b:
            r12 = r27
            goto L_0x0090
        L_0x007e:
            r12 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x007b
            r12 = r27
            boolean r13 = r2.F(r12)
            if (r13 == 0) goto L_0x008d
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008f
        L_0x008d:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x008f:
            r3 = r3 | r13
        L_0x0090:
            r13 = r32 & 32
            r14 = 196608(0x30000, float:2.75506E-40)
            if (r13 == 0) goto L_0x009a
            r3 = r3 | r14
        L_0x0097:
            r14 = r28
            goto L_0x00ab
        L_0x009a:
            r14 = r14 & r10
            if (r14 != 0) goto L_0x0097
            r14 = r28
            boolean r15 = r2.F(r14)
            if (r15 == 0) goto L_0x00a8
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00aa
        L_0x00a8:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00aa:
            r3 = r3 | r15
        L_0x00ab:
            r15 = r32 & 64
            r16 = 1572864(0x180000, float:2.204052E-39)
            if (r15 == 0) goto L_0x00b6
            r3 = r3 | r16
        L_0x00b3:
            r15 = r29
            goto L_0x00c9
        L_0x00b6:
            r15 = r10 & r16
            if (r15 != 0) goto L_0x00b3
            r15 = r29
            boolean r16 = r2.F(r15)
            if (r16 == 0) goto L_0x00c5
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c7
        L_0x00c5:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00c7:
            r3 = r3 | r16
        L_0x00c9:
            r16 = 599187(0x92493, float:8.3964E-40)
            r0 = r3 & r16
            r5 = 599186(0x92492, float:8.39638E-40)
            if (r0 != r5) goto L_0x00e1
            boolean r0 = r2.l()
            if (r0 != 0) goto L_0x00da
            goto L_0x00e1
        L_0x00da:
            r2.L()
            r3 = r22
            goto L_0x0175
        L_0x00e1:
            r2.G()
            r0 = r10 & 1
            if (r0 == 0) goto L_0x0104
            boolean r0 = r2.O()
            if (r0 == 0) goto L_0x00ef
            goto L_0x0104
        L_0x00ef:
            r2.L()
            r0 = r32 & 4
            if (r0 == 0) goto L_0x00f8
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00f8:
            r0 = r32 & 8
            if (r0 == 0) goto L_0x00fe
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00fe:
            r0 = r22
            r4 = r8
            r8 = r12
        L_0x0102:
            r9 = r14
            goto L_0x0141
        L_0x0104:
            if (r4 == 0) goto L_0x0109
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x010b
        L_0x0109:
            r0 = r22
        L_0x010b:
            r4 = r32 & 4
            r5 = 6
            if (r4 == 0) goto L_0x0118
            O0.W0 r4 = O0.W0.f10090a
            long r6 = r4.b(r2, r5)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0118:
            r4 = r32 & 8
            if (r4 == 0) goto L_0x0125
            O0.W0 r4 = O0.W0.f10090a
            long r4 = r4.c(r2, r5)
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x0126
        L_0x0125:
            r4 = r8
        L_0x0126:
            if (r11 == 0) goto L_0x0138
            O0.X0$e r8 = new O0.X0$e
            r8.<init>(r1)
            r9 = 54
            r11 = -2052073983(0xffffffff85afd601, float:-1.6535534E-35)
            r12 = 1
            c1.a r8 = c1.c.e(r11, r12, r8, r2, r9)
            goto L_0x0139
        L_0x0138:
            r8 = r12
        L_0x0139:
            if (r13 == 0) goto L_0x0102
            O0.D r9 = O0.D.f9702a
            nI.p r9 = r9.a()
        L_0x0141:
            r2.y()
            boolean r11 = U0.C4895p.J()
            if (r11 == 0) goto L_0x0153
            r11 = -1
            java.lang.String r12 = "androidx.compose.material3.TabRow (TabRow.kt:314)"
            r13 = -1199178586(0xffffffffb885fca6, float:-6.388994E-5)
            U0.C4895p.S(r13, r3, r11, r12)
        L_0x0153:
            int r3 = r3 >> 3
            r11 = 524286(0x7fffe, float:7.34681E-40)
            r20 = r3 & r11
            r11 = r0
            r12 = r6
            r14 = r4
            r16 = r8
            r17 = r9
            r18 = r29
            r19 = r2
            d(r11, r12, r14, r16, r17, r18, r19, r20)
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0171
            U0.C4895p.R()
        L_0x0171:
            r3 = r0
            r12 = r8
            r14 = r9
            r8 = r4
        L_0x0175:
            U0.Y0 r13 = r2.n()
            if (r13 == 0) goto L_0x0191
            O0.X0$f r15 = new O0.X0$f
            r0 = r15
            r1 = r21
            r2 = r3
            r3 = r6
            r5 = r8
            r7 = r12
            r8 = r14
            r9 = r29
            r10 = r31
            r11 = r32
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11)
            r13.a(r15)
        L_0x0191:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.X0.c(int, androidx.compose.ui.d, long, long, nI.q, nI.p, nI.p, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final void d(androidx.compose.ui.d dVar, long j10, long j11, q<? super List<V0>, ? super C4889m, ? super Integer, C16807N> qVar, p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, C4889m mVar, int i10) {
        int i11;
        q<? super List<V0>, ? super C4889m, ? super Integer, C16807N> qVar2 = qVar;
        p<? super C4889m, ? super Integer, C16807N> pVar3 = pVar;
        p<? super C4889m, ? super Integer, C16807N> pVar4 = pVar2;
        int i12 = i10;
        C4889m k10 = mVar.k(-160898917);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(dVar) ? 4 : 2) | i12;
        } else {
            androidx.compose.ui.d dVar2 = dVar;
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.e(j10) ? 32 : 16;
        } else {
            long j12 = j10;
        }
        long j13 = j11;
        if ((i12 & 384) == 0) {
            i11 |= k10.e(j13) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(qVar2) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 24576) == 0) {
            i11 |= k10.F(pVar3) ? 16384 : 8192;
        }
        if ((196608 & i12) == 0) {
            i11 |= k10.F(pVar4) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((74899 & i11) != 74898 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-160898917, i11, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl (TabRow.kt:942)");
            }
            int i13 = i11 << 3;
            P0.a(C6270a.a(dVar), (i1) null, j10, j11, 0.0f, 0.0f, (C5601g) null, c1.c.e(-1617702432, true, new g(pVar4, pVar3, qVar2), k10, 54), k10, (i13 & 896) | 12582912 | (i13 & 7168), 114);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new h(dVar, j10, j11, qVar, pVar, pVar2, i10));
        }
    }
}
