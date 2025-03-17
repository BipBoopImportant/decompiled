package Ug;

import IC.C13023e;
import IC.C13026h;
import Nn.C10806i;
import Nn.C10813p;
import RC.m;
import Vg.a;
import YH.C16877v;
import androidx.recyclerview.widget.RecyclerView;
import ip.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kp.C11523e;
import kp.h;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ?\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LUg/a;", "", "<init>", "()V", "LNn/i;", "", "LVg/a$a$d;", "a", "(LNn/i;)Ljava/util/List;", "checkoutPrice", "LVg/a$a$f;", "salesTaxes", "LVg/a$a$a;", "amountLeftToPay", "", "showPriceEntriesExclVat", "LNn/p;", "deliveryServiceType", "LVg/a$a;", "b", "(LNn/i;Ljava/util/List;LVg/a$a$a;ZLNn/p;)LVg/a$a;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {
    private final List<a.C1128a.d> a(C10806i iVar) {
        List c10 = C16877v.c();
        Iterable<C11523e> f10 = iVar.f();
        ArrayList arrayList = new ArrayList(C16877v.y(f10, 10));
        for (C11523e eVar : f10) {
            double a10 = eVar.a();
            String c11 = eVar.c();
            arrayList.add(Boolean.valueOf(c10.add(new a.C1128a.d(a10, (String) null, c11 != null ? C13026h.c(c11) : null))));
        }
        return C16877v.a(c10);
    }

    public final a.C1128a b(C10806i iVar, List<a.C1128a.f> list, a.C1128a.C1129a aVar, boolean z10, C10813p pVar) {
        a.C1128a.b bVar;
        C17542s.j(iVar, "checkoutPrice");
        C17542s.j(list, "salesTaxes");
        h i10 = iVar.i();
        a.C1128a.e eVar = new a.C1128a.e(Double.valueOf(i10.d()), i10.e(), Double.valueOf(i10.f()));
        a.C1128a.e eVar2 = new a.C1128a.e(Double.valueOf(i10.a()), i10.b(), Double.valueOf(i10.c()));
        List<a.C1128a.d> a10 = a(iVar);
        Double e10 = z10 ? iVar.e() : iVar.d();
        double d10 = 0.0d;
        double d11 = 0.0d;
        for (a.C1128a.d a11 : a10) {
            d11 += a11.a();
        }
        Double valueOf = Double.valueOf(d11);
        Double d12 = null;
        if (!g.a(Double.valueOf(valueOf.doubleValue()), 0.0d)) {
            valueOf = null;
        }
        Double valueOf2 = Double.valueOf(iVar.g());
        if (!g.a(Double.valueOf(valueOf2.doubleValue()), 0.0d)) {
            valueOf2 = null;
        }
        if (e10 != null) {
            C13023e a12 = Xg.a.f64820a.a(pVar);
            Double d13 = iVar.d();
            Double e11 = iVar.e();
            double doubleValue = e11 != null ? e11.doubleValue() : 0.0d;
            Double d14 = iVar.d();
            if (d14 != null) {
                double doubleValue2 = d14.doubleValue();
                Double e12 = iVar.e();
                if (e12 != null) {
                    d10 = e12.doubleValue();
                }
                d12 = Double.valueOf(doubleValue2 - d10);
            }
            bVar = new a.C1128a.b(a12, new a.C1128a.e(d13, doubleValue, d12));
        } else {
            bVar = null;
        }
        return new a.C1128a(eVar, eVar2, valueOf, valueOf2, (Double) null, (a.C1128a.c) null, a10, (a.C1128a.e) null, bVar, list, aVar, (m.b) null, RecyclerView.n.FLAG_MOVED, (DefaultConstructorMarker) null);
    }
}
