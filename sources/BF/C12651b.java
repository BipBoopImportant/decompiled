package BF;

import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import wK.I4;
import wK.J4;
import wK.X4;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LU0/A1;", "", "showLoading", "LXH/N;", "b", "(LU0/A1;LU0/m;I)V", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: BF.b  reason: case insensitive filesystem */
public final class C12651b {
    public static final void b(A1<Boolean> a12, C4889m mVar, int i10) {
        int i11;
        C17542s.j(a12, "showLoading");
        C4889m k10 = mVar.k(-483744973);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(a12) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-483744973, i11, -1, "com.sugarcube.app.base.ui.gallery.entry.GalleryEntryScreen (GalleryEntryScreen.kt:14)");
            }
            if (C17542s.e(a12.getValue(), Boolean.TRUE)) {
                X4.q((d) null, (J4) null, I4.Large, k10, 384, 3);
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C12650a(a12, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(A1 a12, int i10, C4889m mVar, int i11) {
        b(a12, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
