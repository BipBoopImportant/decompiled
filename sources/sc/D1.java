package SC;

import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.ui.d;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import t1.C5942c;
import wK.C18264a6;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lt1/c;", "painter", "", "contentDescription", "Landroidx/compose/ui/d;", "modifier", "LSC/E1;", "size", "LXH/N;", "b", "(Lt1/c;Ljava/lang/String;Landroidx/compose/ui/d;LSC/E1;LU0/m;II)V", "skapa_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class D1 {
    public static final void b(C5942c cVar, String str, d dVar, E1 e12, C4889m mVar, int i10, int i11) {
        int i12;
        C17542s.j(cVar, PlaceTypes.PAINTER);
        C4889m k10 = mVar.k(-505516246);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (k10.F(cVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= k10.V(str) ? 32 : 16;
        }
        int i13 = i11 & 4;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= k10.V(dVar) ? 256 : 128;
        }
        int i14 = i11 & 8;
        if (i14 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= k10.V(e12) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 1171) != 1170 || !k10.l()) {
            if (i13 != 0) {
                dVar = d.f18749a;
            }
            if (i14 != 0) {
                e12 = E1.Small;
            }
            if (C4895p.J()) {
                C4895p.S(-505516246, i12, -1, "com.ingka.ikea.ui.skapa.SkapaPaymentLogo (SkapaPaymentLogo.kt:22)");
            }
            C18264a6.b(cVar, str, dVar, e12.b(), k10, i12 & 1022, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        d dVar2 = dVar;
        E1 e13 = e12;
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C1(cVar, str, dVar2, e13, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(C5942c cVar, String str, d dVar, E1 e12, int i10, int i11, C4889m mVar, int i12) {
        b(cVar, str, dVar, e12, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
