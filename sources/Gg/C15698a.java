package GG;

import J1.j;
import N1.P;
import O0.d1;
import OE.n;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import Y1.k;
import androidx.compose.ui.d;
import c1.c;
import com.google.ar.core.ImageMetadata;
import kotlin.Metadata;
import nI.C17642l;
import nI.p;
import tK.C18030v;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: GG.a  reason: case insensitive filesystem */
public final class C15698a {

    /* renamed from: a  reason: collision with root package name */
    public static final C15698a f134406a = new C15698a();

    /* renamed from: b  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f134407b = c.c(557177554, false, C3309a.f134408a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: GG.a$a  reason: collision with other inner class name */
    static final class C3309a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3309a f134408a = new C3309a();

        C3309a() {
        }

        public final void a(C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(557177554, i11, -1, "com.sugarcube.decorate.v2.internal.ui.catalog.ui.swap.ComposableSingletons$SwapDrawerKt.lambda-1.<anonymous> (SwapDrawer.kt:98)");
                }
                d1.b(j.b(n.f113469u5, mVar2, 0), (d) null, 0, 0, (C4830x) null, C.f13316b.a(), (C4820m) null, 0, (k) null, (Y1.j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, C18030v.f147664a.b(mVar2, C18030v.f147665b).c().b(), mVar, ImageMetadata.EDGE_MODE, 0, 65502);
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

    public final p<C4889m, Integer, C16807N> a() {
        return f134407b;
    }
}
