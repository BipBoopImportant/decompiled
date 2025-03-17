package pf;

import TC.e;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.recyclerview.widget.RecyclerView;
import c1.c;
import com.google.ar.core.ImageMetadata;
import kotlin.Metadata;
import lm.C11550a;
import nI.p;
import nf.v;
import rf.b;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lrf/b;", "viewModel", "Llm/a$c;", "fulfilmentOption", "", "productTitle", "itemNo", "itemType", "Lpf/a;", "actions", "LXH/N;", "b", "(Lrf/b;Llm/a$c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpf/a;LU0/m;I)V", "backinstock-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: pf.e  reason: case insensitive filesystem */
public final class C10142e {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pf.e$a */
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f75866a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C11550a.c f75867b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f75868c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f75869d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f75870e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C10138a f75871f;

        a(b bVar, C11550a.c cVar, String str, String str2, String str3, C10138a aVar) {
            this.f75866a = bVar;
            this.f75867b = cVar;
            this.f75868c = str;
            this.f75869d = str2;
            this.f75870e = str3;
            this.f75871f = aVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-2039018390, i10, -1, "com.ingka.ikea.app.backinstocknotifications.fragments.BackInStockNotificationsScreen.<anonymous> (BackInStockNotificationsDialogFragment.kt:163)");
                }
                v.v(this.f75866a, this.f75867b, this.f75868c, this.f75869d, this.f75870e, this.f75871f, mVar, 0);
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

    /* access modifiers changed from: private */
    public static final void b(b bVar, C11550a.c cVar, String str, String str2, String str3, C10138a aVar, C4889m mVar, int i10) {
        int i11;
        int i12 = i10;
        C4889m k10 = mVar.k(1206355216);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(bVar) ? 4 : 2) | i12;
        } else {
            b bVar2 = bVar;
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(cVar) ? 32 : 16;
        } else {
            C11550a.c cVar2 = cVar;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.V(str) ? 256 : 128;
        } else {
            String str4 = str;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.V(str2) ? RecyclerView.n.FLAG_MOVED : 1024;
        } else {
            String str5 = str2;
        }
        String str6 = str3;
        if ((i12 & 24576) == 0) {
            i11 |= k10.V(str6) ? 16384 : 8192;
        }
        C10138a aVar2 = aVar;
        if ((196608 & i12) == 0) {
            i11 |= k10.V(aVar2) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((74899 & i11) != 74898 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1206355216, i11, -1, "com.ingka.ikea.app.backinstocknotifications.fragments.BackInStockNotificationsScreen (BackInStockNotificationsDialogFragment.kt:161)");
            }
            e.e(false, c.e(-2039018390, true, new a(bVar, cVar, str, str2, str3, aVar), k10, 54), k10, 48, 1);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C10141d(bVar, cVar, str, str2, str3, aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(b bVar, C11550a.c cVar, String str, String str2, String str3, C10138a aVar, int i10, C4889m mVar, int i11) {
        b(bVar, cVar, str, str2, str3, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
