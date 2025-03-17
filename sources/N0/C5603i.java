package n0;

import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.ui.d;
import androidx.compose.ui.draw.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import nI.p;
import r1.f;
import s0.C5844O;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function1;", "Lr1/f;", "LXH/N;", "onDraw", "a", "(Landroidx/compose/ui/d;LnI/l;LU0/m;I)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: n0.i  reason: case insensitive filesystem */
public final class C5603i {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: n0.i$a */
    static final class a extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f26459c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<f, C16807N> f26460d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f26461e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, C17642l<? super f, C16807N> lVar, int i10) {
            super(2);
            this.f26459c = dVar;
            this.f26460d = lVar;
            this.f26461e = i10;
        }

        public final void a(C4889m mVar, int i10) {
            C5603i.a(this.f26459c, this.f26460d, mVar, M0.a(this.f26461e | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    public static final void a(d dVar, C17642l<? super f, C16807N> lVar, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(-932836462);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(dVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(lVar) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-932836462, i11, -1, "androidx.compose.foundation.Canvas (Canvas.kt:42)");
            }
            C5844O.a(b.b(dVar, lVar), k10, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new a(dVar, lVar, i10));
        }
    }
}
