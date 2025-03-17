package jv;

import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.t;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import androidx.recyclerview.widget.RecyclerView;
import com.ingka.ikea.core.model.Image;
import hv.C11385a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ingka/ikea/core/model/Image;", "image", "Lhv/a;", "state", "Lkotlin/Function0;", "LXH/N;", "onPlayClick", "Landroidx/compose/ui/d;", "modifier", "b", "(Lcom/ingka/ikea/core/model/Image;Lhv/a;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "liveshopping-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: jv.k  reason: case insensitive filesystem */
public final class C11491k {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jv.k$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f98887a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                hv.a[] r0 = hv.C11385a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                hv.a r1 = hv.C11385a.ENDED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                hv.a r1 = hv.C11385a.SCHEDULED     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f98887a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: jv.C11491k.a.<clinit>():void");
        }
    }

    public static final void b(Image image, C11385a aVar, C17631a<C16807N> aVar2, d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        C17542s.j(image, "image");
        C17542s.j(aVar, "state");
        C17542s.j(aVar2, "onPlayClick");
        C4889m k10 = mVar.k(-1555564342);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (k10.F(image) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= k10.V(aVar) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= k10.F(aVar2) ? 256 : 128;
        }
        int i13 = i11 & 8;
        if (i13 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= k10.V(dVar) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 1171) != 1170 || !k10.l()) {
            if (i13 != 0) {
                dVar = d.f18749a;
            }
            if (C4895p.J()) {
                C4895p.S(-1555564342, i12, -1, "com.ingka.ikea.liveshopping.impl.presentation.compose.EventImageByState (EventImageByState.kt:18)");
            }
            int i14 = a.f98887a[aVar.ordinal()];
            if (i14 == 1) {
                k10.W(-340671538);
                C11495o.b(image, aVar2, C5116k1.a(dVar, "eventImageWithPlayButton"), k10, (i12 & 14) | ((i12 >> 3) & 112), 0);
                k10.P();
            } else if (i14 == 2) {
                k10.W(-340408844);
                C11493m.b(image, C5116k1.a(dVar, "eventImage"), k10, i12 & 14, 0);
                k10.P();
            } else {
                k10.W(543198794);
                k10.P();
                throw new t();
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        d dVar2 = dVar;
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C11490j(image, aVar, aVar2, dVar2, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(Image image, C11385a aVar, C17631a aVar2, d dVar, int i10, int i11, C4889m mVar, int i12) {
        b(image, aVar, aVar2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
