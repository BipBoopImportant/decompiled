package Q0;

import N1.Y;
import O0.E;
import O0.d1;
import U0.C4889m;
import U0.C4895p;
import U0.C4910x;
import U0.J0;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.p;
import p1.C5747v0;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\t"}, d2 = {"Lp1/v0;", "contentColor", "LN1/Y;", "textStyle", "Lkotlin/Function0;", "LXH/N;", "content", "a", "(JLN1/Y;LnI/p;LU0/m;I)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class s {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f12042c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Y f12043d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f12044e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f12045f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(long j10, Y y10, p<? super C4889m, ? super Integer, C16807N> pVar, int i10) {
            super(2);
            this.f12042c = j10;
            this.f12043d = y10;
            this.f12044e = pVar;
            this.f12045f = i10;
        }

        public final void a(C4889m mVar, int i10) {
            s.a(this.f12042c, this.f12043d, this.f12044e, mVar, M0.a(this.f12045f | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    public static final void a(long j10, Y y10, p<? super C4889m, ? super Integer, C16807N> pVar, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(-716124955);
        if ((i10 & 6) == 0) {
            i11 = (k10.e(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.V(y10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.F(pVar) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-716124955, i11, -1, "androidx.compose.material3.internal.ProvideContentColorTextStyle (ProvideContentColorTextStyle.kt:38)");
            }
            C4910x.b(new J0[]{E.a().d(C5747v0.k(j10)), d1.d().d(((Y) k10.Q(d1.d())).J(y10))}, pVar, k10, ((i11 >> 3) & 112) | J0.f13770i);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new a(j10, y10, pVar, i10));
        }
    }
}
