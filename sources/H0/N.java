package H0;

import E1.H;
import E1.I;
import E1.J;
import E1.K;
import E1.a0;
import G1.C4504g;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function0;", "LXH/N;", "content", "a", "(Landroidx/compose/ui/d;LnI/p;LU0/m;II)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class N {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LE1/K;", "", "LE1/H;", "measurables", "Lc2/b;", "constraints", "LE1/J;", "i", "(LE1/K;Ljava/util/List;J)LE1/J;"}, k = 3, mv = {1, 8, 0})
    static final class a implements I {

        /* renamed from: a  reason: collision with root package name */
        public static final a f6805a = new a();

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: H0.N$a$a  reason: collision with other inner class name */
        static final class C0070a extends C17544u implements C17642l<a0.a, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ List<a0> f6806c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0070a(List<? extends a0> list) {
                super(1);
                this.f6806c = list;
            }

            public final void a(a0.a aVar) {
                List<a0> list = this.f6806c;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    a0.a.i(aVar, list.get(i10), 0, 0, 0.0f, 4, (Object) null);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((a0.a) obj);
                return C16807N.f139792a;
            }
        }

        a() {
        }

        public final J i(K k10, List<? extends H> list, long j10) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            Integer num = 0;
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(((H) list.get(i10)).i0(j10));
            }
            int size2 = arrayList.size();
            Integer num2 = num;
            for (int i11 = 0; i11 < size2; i11++) {
                num2 = Integer.valueOf(Math.max(num2.intValue(), ((a0) arrayList.get(i11)).E0()));
            }
            int intValue = num2.intValue();
            int size3 = arrayList.size();
            for (int i12 = 0; i12 < size3; i12++) {
                num = Integer.valueOf(Math.max(num.intValue(), ((a0) arrayList.get(i12)).z0()));
            }
            return K.v0(k10, intValue, num.intValue(), (Map) null, new C0070a(arrayList), 4, (Object) null);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f6807c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f6808d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f6809e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f6810f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar, p<? super C4889m, ? super Integer, C16807N> pVar, int i10, int i11) {
            super(2);
            this.f6807c = dVar;
            this.f6808d = pVar;
            this.f6809e = i10;
            this.f6810f = i11;
        }

        public final void a(C4889m mVar, int i10) {
            N.a(this.f6807c, this.f6808d, mVar, M0.a(this.f6809e | 1), this.f6810f);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    public static final void a(d dVar, p<? super C4889m, ? super Integer, C16807N> pVar, C4889m mVar, int i10, int i11) {
        int i12;
        C4889m k10 = mVar.k(-2105228848);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (k10.V(dVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= k10.F(pVar) ? 32 : 16;
        }
        if ((i12 & 19) != 18 || !k10.l()) {
            if (i13 != 0) {
                dVar = d.f18749a;
            }
            if (C4895p.J()) {
                C4895p.S(-2105228848, i12, -1, "androidx.compose.foundation.text.selection.SimpleLayout (SimpleLayout.kt:31)");
            }
            a aVar = a.f6805a;
            int i14 = ((i12 >> 3) & 14) | 384 | ((i12 << 3) & 112);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, dVar);
            C4504g.a aVar2 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar2.a();
            int i15 = ((i14 << 6) & 896) | 6;
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a11);
            } else {
                k10.t();
            }
            C4889m a12 = F1.a(k10);
            F1.c(a12, aVar, aVar2.c());
            F1.c(a12, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b10 = aVar2.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b10);
            }
            F1.c(a12, e10, aVar2.d());
            pVar.invoke(k10, Integer.valueOf((i15 >> 6) & 14));
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new b(dVar, pVar, i10, i11));
        }
    }
}
