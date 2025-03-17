package vv;

import YH.C16877v;
import com.ingka.ikea.mcomsettings.MComConfig;
import com.ingka.ikea.mcomsettings.impl.AvailablePaymentOptionHolder;
import com.ingka.ikea.mcomsettings.impl.CardHolderNameValidation;
import com.ingka.ikea.mcomsettings.impl.EmployeeDiscountConfig;
import com.ingka.ikea.mcomsettings.impl.PaymentTermsAndConditionHolder;
import com.ingka.ikea.mcomsettings.impl.db.MComSurveyConfig;
import com.ingka.ikea.mcomsettings.impl.db.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvv/c;", "Lcom/ingka/ikea/mcomsettings/MComConfig;", "a", "(Lvv/c;)Lcom/ingka/ikea/mcomsettings/MComConfig;", "mcomsettings-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: vv.d  reason: case insensitive filesystem */
public final class C12271d {
    public static final MComConfig a(C12270c cVar) {
        ArrayList arrayList;
        C17542s.j(cVar, "<this>");
        String o10 = cVar.o();
        String k10 = cVar.k();
        boolean h10 = cVar.h();
        boolean t10 = cVar.t();
        boolean s10 = cVar.s();
        String e10 = cVar.e();
        Iterable<PaymentTermsAndConditionHolder> l10 = cVar.l();
        ArrayList arrayList2 = new ArrayList(C16877v.y(l10, 10));
        for (PaymentTermsAndConditionHolder g10 : l10) {
            arrayList2.add(a.g(g10));
        }
        MComConfig.d d10 = a.d(cVar.g());
        CardHolderNameValidation b10 = cVar.b();
        MComConfig.b c10 = b10 != null ? a.c(b10) : null;
        boolean q10 = cVar.q();
        List<AvailablePaymentOptionHolder> c11 = cVar.c();
        if (c11 != null) {
            Iterable<AvailablePaymentOptionHolder> iterable = c11;
            ArrayList arrayList3 = new ArrayList(C16877v.y(iterable, 10));
            for (AvailablePaymentOptionHolder a10 : iterable) {
                arrayList3.add(a.a(a10));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        boolean m10 = cVar.m();
        String f10 = cVar.f();
        MComSurveyConfig d11 = cVar.d();
        MComConfig.f f11 = d11 != null ? a.f(d11) : null;
        MComSurveyConfig a11 = cVar.a();
        MComConfig.f f12 = a11 != null ? a.f(a11) : null;
        boolean p10 = cVar.p();
        EmployeeDiscountConfig i10 = cVar.i();
        return new MComConfig(o10, k10, h10, t10, s10, e10, arrayList2, d10, c10, q10, arrayList, m10, f10, f11, f12, p10, i10 != null ? a.e(i10) : null, cVar.r(), cVar.j(), cVar.n());
    }
}
