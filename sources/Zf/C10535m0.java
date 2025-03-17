package zf;

import B0.C4373q;
import Bl.c;
import IC.C13023e;
import IC.C13026h;
import KJ.C15988d;
import N1.G;
import N1.P;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import TC.C13679b;
import TC.e;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import Y1.j;
import Y1.k;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.q;
import u0.C5968C;
import u0.C5972G;
import u0.C5979c;
import u0.C5991o;
import u0.C5993q;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lu0/C;", "", "legalInformationFooter", "LXH/N;", "b", "(Lu0/C;Ljava/lang/String;)V", "browse-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: zf.m0  reason: case insensitive filesystem */
public final class C10535m0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zf.m0$a */
    static final class a implements q<C5991o, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f78301a;

        a(String str) {
            this.f78301a = str;
        }

        public final void a(C5991o oVar, C4889m mVar, int i10) {
            int i11 = i10;
            C17542s.j(oVar, "$this$item");
            if ((i11 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1689666930, i11, -1, "com.ingka.ikea.app.browseandsearch.browseV2.compose.legalInformationFooter.<anonymous> (LegalInformationFooter.kt:20)");
                }
                c.c(C13026h.c(this.f78301a), C5116k1.a(e.i(d.f18749a), "LegalInformationFooter"), (G) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, (C15988d<String, C4373q>) null, (C17642l<? super P, C16807N>) null, (C13679b) null, mVar, C13023e.f110931a, 0, 262140);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5991o) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    public static final void b(C5968C c10, String str) {
        C17542s.j(c10, "<this>");
        C17542s.j(str, "legalInformationFooter");
        c10.d("LegalInformationFooter", new C10533l0(), "LegalInformationFooter", c1.c.c(1689666930, true, new a(str)));
    }

    /* access modifiers changed from: private */
    public static final C5979c c(C5993q qVar) {
        C17542s.j(qVar, "$this$item");
        return C5979c.a(C5972G.a(qVar.a()));
    }
}
