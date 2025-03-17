package ao;

import HJ.C15854t;
import Il.a;
import Nn.C;
import Nn.C10803f;
import Nn.C10804g;
import Nn.C10806i;
import Nn.C10813p;
import Nn.C10814q;
import Nn.F;
import Nn.K;
import Nn.u;
import Nn.x;
import XH.C16807N;
import YH.C16877v;
import bo.f;
import com.ingka.ikea.checkout.datalayer.model.ShippingBillingDynamicModel;
import com.ingka.ikea.checkout.impl.confirmation.ConfirmationActivity;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import jo.C11435a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import no.C11663a;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qx.C14956a;
import qx.C14957b;
import qx.c;
import xo.C12322b;
import xo.C12325e;
import xo.j;
import yo.e;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014¨\u0006\u0015"}, d2 = {"Lao/d;", "Lao/c;", "LNn/x;", "checkoutRepository", "LIl/a;", "appConfigApi", "<init>", "(LNn/x;LIl/a;)V", "Lcom/ingka/ikea/checkout/datalayer/model/ShippingBillingDynamicModel;", "model", "", "Lcom/ingka/ikea/checkout/impl/confirmation/ConfirmationActivity$a;", "b", "(Lcom/ingka/ikea/checkout/datalayer/model/ShippingBillingDynamicModel;)Ljava/util/List;", "", "checkoutId", "Lbo/f$a;", "a", "(Ljava/lang/String;)Lbo/f$a;", "LNn/x;", "LIl/a;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ao.d  reason: case insensitive filesystem */
public final class C11075d implements C11074c {

    /* renamed from: a  reason: collision with root package name */
    private final x f90351a;

    /* renamed from: b  reason: collision with root package name */
    private final a f90352b;

    public C11075d(x xVar, a aVar) {
        C17542s.j(xVar, "checkoutRepository");
        C17542s.j(aVar, "appConfigApi");
        this.f90351a = xVar;
        this.f90352b = aVar;
    }

    private final List<ConfirmationActivity.a> b(ShippingBillingDynamicModel shippingBillingDynamicModel) {
        C12325e eVar = C12325e.f106111a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String country = this.f90352b.A().getCountry();
        C17542s.i(country, "getCountry(...)");
        C12322b d10 = eVar.d(shippingBillingDynamicModel, (C12322b) null, linkedHashMap, true, country, (C17642l<Object, C16807N>) null);
        e a10 = j.a(d10.d());
        e a11 = j.a(d10.c());
        ConfirmationActivity.a aVar = null;
        ConfirmationActivity.a aVar2 = a10 != null ? new ConfirmationActivity.a(a10.c(), a10.a()) : null;
        if (a11 != null) {
            aVar = new ConfirmationActivity.a(a11.c(), a11.a());
        }
        return C16877v.s(aVar2, aVar);
    }

    public f.a a(String str) {
        List<F> n10;
        C11663a.b bVar;
        String str2 = str;
        C17542s.j(str2, "checkoutId");
        C10803f s10 = this.f90351a.s(str2);
        C i10 = this.f90351a.i(str2);
        String str3 = null;
        K i11 = s10 != null ? s10.i() : null;
        if (i11 == null) {
            IllegalStateException illegalStateException = new IllegalStateException("No selected delivery");
            qv.e eVar = qv.e.WARN;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str4 = null;
            String str5 = null;
            for (C11819b bVar2 : arrayList) {
                if (str4 == null) {
                    String a10 = C11818a.a((String) null, illegalStateException);
                    if (a10 == null) {
                        break;
                    }
                    str4 = C11820c.a(a10);
                }
                String str6 = str4;
                if (str5 == null) {
                    String name = C11075d.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str5 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str7 = str5;
                bVar2.a(eVar, str7, false, illegalStateException, str6);
                str4 = str6;
                str5 = str7;
            }
            return null;
        }
        List<ConfirmationActivity.a> b10 = b(s10.k());
        Iterable<C10804g> g10 = s10.g();
        ArrayList arrayList2 = new ArrayList(C16877v.y(g10, 10));
        for (C10804g gVar : g10) {
            String b11 = gVar.b();
            String type = gVar.getType();
            C10804g.b a11 = gVar.a();
            String d10 = a11 != null ? a11.d() : str3;
            C10804g.b a12 = gVar.a();
            String c10 = a12 != null ? a12.c() : str3;
            C10804g.b a13 = gVar.a();
            String b12 = a13 != null ? a13.b() : str3;
            int c11 = gVar.c();
            C10804g.b a14 = gVar.a();
            String a15 = a14 != null ? a14.a() : str3;
            double d11 = gVar.d();
            c a16 = C14957b.a(gVar.d(), this.f90352b.s());
            C14956a aVar = C14956a.f130484a;
            K k10 = i11;
            C11663a.b bVar3 = new C11663a.b(d11, a16, aVar.b(gVar.d(), this.f90352b.s()));
            Double e10 = gVar.e();
            if (e10 != null) {
                double doubleValue = e10.doubleValue();
                bVar = new C11663a.b(doubleValue, C14957b.a(doubleValue, this.f90352b.s()), aVar.b(doubleValue, this.f90352b.s()));
            } else {
                bVar = null;
            }
            arrayList2.add(new C11663a(b11, type, d10, c10, b12, c11, a15, bVar3, bVar));
            i11 = k10;
            str3 = null;
        }
        K k11 = i11;
        String d12 = i10 != null ? i10.d() : null;
        C10806i h10 = s10.h();
        String f10 = k11.f();
        C10813p c12 = k11.c();
        u e11 = k11.e();
        Iterable<K.b> a17 = k11.a();
        ArrayList arrayList3 = new ArrayList(C16877v.y(a17, 10));
        for (K.b a18 : a17) {
            arrayList3.add(C11435a.f98597j.a(a18, k11.c(), s10.f(), s10.d(), (List<C10814q>) null, (C11435a.b) null));
        }
        f.a.C1967a aVar2 = new f.a.C1967a(f10, c12, e11, arrayList3, b10);
        Double valueOf = i10 != null ? Double.valueOf(i10.c()) : null;
        if (i10 == null || (n10 = i10.g()) == null) {
            n10 = C16877v.n();
        }
        return new f.a(d12, h10, arrayList2, aVar2, valueOf, n10);
    }
}
