package Pp;

import IC.C13023e;
import IC.C13026h;
import Il.a;
import Oo.b;
import Op.C10828d;
import XH.t;
import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qx.C14956a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J9\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"LPp/f;", "", "LIl/a;", "appConfigApi", "<init>", "(LIl/a;)V", "LOp/d$l;", "price", "", "previousPrice", "upsellPrice", "lowestPreviousPrice", "", "LIC/e;", "a", "(LOp/d$l;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Ljava/util/List;", "LIl/a;", "product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final a f85680a;

    public f(a aVar) {
        C17542s.j(aVar, "appConfigApi");
        this.f85680a = aVar;
    }

    public final List<C13023e> a(C10828d.l lVar, Double d10, Double d11, Double d12) {
        C17542s.j(lVar, "price");
        boolean z10 = lVar instanceof C10828d.l.c;
        C13023e eVar = null;
        if (!z10 && !(lVar instanceof C10828d.l.b) && !(lVar instanceof C10828d.l.g) && !(lVar instanceof C10828d.l.C1721d)) {
            if ((lVar instanceof C10828d.l.a) || (lVar instanceof C10828d.l.f)) {
                d12 = null;
            } else {
                throw new t();
            }
        }
        if (d12 != null) {
            eVar = C13026h.b(b.f84342C4, C14956a.f130484a.b(d12.doubleValue(), this.f85680a.s()));
        } else if (d10 != null) {
            double doubleValue = d10.doubleValue();
            if (lVar instanceof C10828d.l.b) {
                eVar = C13026h.b(b.f84481Q3, C14956a.f130484a.b(d10.doubleValue(), this.f85680a.s()));
            } else if (!(lVar instanceof C10828d.l.C1721d) && !(lVar instanceof C10828d.l.g)) {
                if (z10) {
                    eVar = C13026h.b(b.f84482Q4, C14956a.f130484a.b(d10.doubleValue(), this.f85680a.s()));
                } else if ((lVar instanceof C10828d.l.f) || (lVar instanceof C10828d.l.a)) {
                    eVar = C13026h.b(b.f84333B5, C14956a.f130484a.b(doubleValue, this.f85680a.s()));
                } else {
                    throw new t();
                }
            }
        }
        List c10 = C16877v.c();
        if (eVar != null) {
            c10.add(eVar);
        }
        if (d11 != null) {
            c10.add(C13026h.b(b.f84501S3, C14956a.f130484a.b(d11.doubleValue(), this.f85680a.s())));
        }
        return C16877v.a(c10);
    }
}
