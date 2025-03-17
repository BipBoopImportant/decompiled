package Ed;

import E1.C4478k;
import J1.e;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.h;
import i1.C5437c;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import n0.C5583F;
import p1.C5749w0;
import p1.O;
import yd.C10442M;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroid/content/Context;", "context", "", "fileName", "Landroid/graphics/Bitmap;", "d", "(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;", "LXH/N;", "b", "(Ljava/lang/String;LU0/m;I)V", "KompassMap_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class b {
    public static final void b(String str, C4889m mVar, int i10) {
        int i11;
        C17542s.j(str, "fileName");
        C4889m k10 = mVar.k(1521218400);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1521218400, i11, -1, "com.ikea.kompassmap.ui.components.bottomSheet.AssetImage (AssetImage.kt:28)");
            }
            Bitmap d10 = d((Context) k10.Q(AndroidCompositionLocals_androidKt.g()), str);
            if (d10 != null) {
                k10.W(1049418774);
                C5583F.b(O.c(d10), (String) null, J.t(d.f18749a, h.B((float) 40)), (C5437c) null, (C4478k) null, 0.0f, (C5749w0) null, 0, k10, 432, 248);
                k10.P();
            } else {
                k10.W(1049584686);
                C5583F.a(e.c(C10442M.f77905a, k10, 0), (String) null, J.t(d.f18749a, h.B((float) 40)), (C5437c) null, (C4478k) null, 0.0f, (C5749w0) null, k10, 432, 120);
                k10.P();
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new a(str, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(String str, int i10, C4889m mVar, int i11) {
        b(str, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final Bitmap d(Context context, String str) {
        C17542s.j(context, "context");
        C17542s.j(str, "fileName");
        try {
            InputStream open = context.getAssets().open(str);
            C17542s.i(open, "open(...)");
            return BitmapFactory.decodeStream(open);
        } catch (Exception e10) {
            Log.e("AssetImage", "Error loading image: " + str, e10);
            return null;
        }
    }
}
