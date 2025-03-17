package I0;

import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Function0;", "LXH/N;", "content", "a", "(LnI/p;LU0/m;I)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: I0.f0  reason: case insensitive filesystem */
public final class C4557f0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: I0.f0$a */
    static final class a extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f8072c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f8073d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(p<? super C4889m, ? super Integer, C16807N> pVar, int i10) {
            super(2);
            this.f8072c = pVar;
            this.f8073d = i10;
        }

        public final void a(C4889m mVar, int i10) {
            C4557f0.a(this.f8072c, mVar, M0.a(this.f8073d | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    public static final void a(p<? super C4889m, ? super Integer, C16807N> pVar, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(-1322912246);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(pVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1322912246, i11, -1, "androidx.compose.material.PlatformMaterialTheme (MaterialTheme.android.kt:21)");
            }
            pVar.invoke(k10, Integer.valueOf(i11 & 14));
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new a(pVar, i10));
        }
    }
}
