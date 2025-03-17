package SC;

import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.ui.d;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import wK.C18433o7;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "value", "Landroidx/compose/ui/d;", "modifier", "label", "LSC/V1;", "variant", "LXH/N;", "b", "(Ljava/lang/String;Landroidx/compose/ui/d;Ljava/lang/String;LSC/V1;LU0/m;II)V", "skapa_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class U1 {
    public static final void b(String str, d dVar, String str2, V1 v12, C4889m mVar, int i10, int i11) {
        int i12;
        C17542s.j(str, "value");
        C4889m k10 = mVar.k(-364931665);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (k10.V(str) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= k10.V(dVar) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= k10.V(str2) ? 256 : 128;
        }
        int i15 = i11 & 8;
        if (i15 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= k10.V(v12) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 1171) != 1170 || !k10.l()) {
            if (i13 != 0) {
                dVar = d.f18749a;
            }
            if (i14 != 0) {
                str2 = null;
            }
            if (i15 != 0) {
                v12 = V1.Emphasised;
            }
            if (C4895p.J()) {
                C4895p.S(-364931665, i12, -1, "com.ingka.ikea.ui.skapa.SkapaProductIdentifier (SkapaProductIdentifier.kt:23)");
            }
            C18433o7.d(str, dVar, str2, v12.b(), k10, i12 & 1022, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        d dVar2 = dVar;
        String str3 = str2;
        V1 v13 = v12;
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new T1(str, dVar2, str3, v13, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(String str, d dVar, String str2, V1 v12, int i10, int i11, C4889m mVar, int i12) {
        b(str, dVar, str2, v12, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
