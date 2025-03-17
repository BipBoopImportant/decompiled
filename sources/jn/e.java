package Jn;

import Fn.h;
import YH.C16877v;
import com.ingka.ikea.app.caasremote.models.CurrentPricePropertiesRemoteModel;
import com.ingka.ikea.app.caasremote.models.NullableAssemblyServiceTotalPriceResponseRemoteModel;
import com.ingka.ikea.app.caasremote.models.NullableBasePricePropertiesRemoteModel;
import com.ingka.ikea.app.caasremote.models.NullableCartResponsePriceRemoteModel;
import com.ingka.ikea.app.caasremote.models.NullableCartUpsellSavingsDistributionRemoteModel;
import com.ingka.ikea.app.caasremote.models.NullableCartUpsellSavingsRemoteModel;
import com.ingka.ikea.app.caasremote.models.NullableTotalSavingsSummaryDistributionRemoteModel;
import com.ingka.ikea.app.caasremote.models.NullableTotalSavingsSummaryRemoteModel;
import com.ingka.ikea.app.caasremote.models.NullableUpsellTotalPricePropertiesRemoteModel;
import com.ingka.ikea.app.caasremote.models.SummaryOfCartTotalSavingsRemoteModel;
import com.ingka.ikea.app.caasremote.models.TotalPriceResponseRemoteModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import pp.C11769c;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\f*\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LJn/e;", "Lpp/c;", "LFn/h;", "Lcom/ingka/ikea/app/caasremote/models/NullableCartResponsePriceRemoteModel;", "<init>", "()V", "Lcom/ingka/ikea/app/caasremote/models/TotalPriceResponseRemoteModel;", "LFn/h$c;", "d", "(Lcom/ingka/ikea/app/caasremote/models/TotalPriceResponseRemoteModel;)LFn/h$c;", "e", "c", "", "Lcom/ingka/ikea/app/caasremote/models/SummaryOfCartTotalSavingsRemoteModel;", "LFn/h$b;", "b", "(Ljava/util/List;)Ljava/util/List;", "remote", "f", "(Lcom/ingka/ikea/app/caasremote/models/NullableCartResponsePriceRemoteModel;)LFn/h;", "caas-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements C11769c<h, NullableCartResponsePriceRemoteModel> {
    private final List<h.b> b(List<SummaryOfCartTotalSavingsRemoteModel> list) {
        Iterable<SummaryOfCartTotalSavingsRemoteModel> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (SummaryOfCartTotalSavingsRemoteModel summaryOfCartTotalSavingsRemoteModel : iterable) {
            arrayList.add(new h.b(summaryOfCartTotalSavingsRemoteModel.a(), summaryOfCartTotalSavingsRemoteModel.b(), summaryOfCartTotalSavingsRemoteModel.c()));
        }
        return arrayList;
    }

    private final h.c c(TotalPriceResponseRemoteModel totalPriceResponseRemoteModel) {
        CurrentPricePropertiesRemoteModel a10;
        NullableAssemblyServiceTotalPriceResponseRemoteModel a11 = totalPriceResponseRemoteModel.a();
        if (a11 == null || (a10 = a11.a()) == null) {
            return null;
        }
        Double b10 = a10.b();
        Double a12 = a10.a();
        return new h.c(b10, a12 != null ? a12.doubleValue() : 0.0d, a10.c());
    }

    private final h.c d(TotalPriceResponseRemoteModel totalPriceResponseRemoteModel) {
        CurrentPricePropertiesRemoteModel b10 = totalPriceResponseRemoteModel.b();
        Double b11 = b10.b();
        Double a10 = b10.a();
        return new h.c(b11, a10 != null ? a10.doubleValue() : 0.0d, b10.c());
    }

    private final h.c e(TotalPriceResponseRemoteModel totalPriceResponseRemoteModel) {
        NullableBasePricePropertiesRemoteModel a10 = totalPriceResponseRemoteModel.c().a();
        double d10 = 0.0d;
        if (a10 != null) {
            Double b10 = a10.b();
            Double a11 = a10.a();
            if (a11 != null) {
                d10 = a11.doubleValue();
            }
            return new h.c(b10, d10, a10.c());
        }
        CurrentPricePropertiesRemoteModel b11 = totalPriceResponseRemoteModel.c().b();
        Double b12 = b11.b();
        Double a12 = b11.a();
        if (a12 != null) {
            d10 = a12.doubleValue();
        }
        return new h.c(b12, d10, b11.c());
    }

    /* renamed from: f */
    public h a(NullableCartResponsePriceRemoteModel nullableCartResponsePriceRemoteModel) {
        NullableCartUpsellSavingsRemoteModel a10;
        NullableCartUpsellSavingsDistributionRemoteModel a11;
        NullableTotalSavingsSummaryDistributionRemoteModel b10;
        C17542s.j(nullableCartResponsePriceRemoteModel, "remote");
        h.c d10 = d(nullableCartResponsePriceRemoteModel.b());
        h.c e10 = e(nullableCartResponsePriceRemoteModel.b());
        h.c c10 = c(nullableCartResponsePriceRemoteModel.b());
        NullableTotalSavingsSummaryRemoteModel d11 = nullableCartResponsePriceRemoteModel.b().d();
        List<h.b> list = null;
        Double a12 = d11 != null ? d11.a() : null;
        NullableTotalSavingsSummaryRemoteModel d12 = nullableCartResponsePriceRemoteModel.b().d();
        Double a13 = (d12 == null || (b10 = d12.b()) == null) ? null : b10.a();
        NullableUpsellTotalPricePropertiesRemoteModel e11 = nullableCartResponsePriceRemoteModel.b().e();
        Double a14 = (e11 == null || (a10 = e11.a()) == null || (a11 = a10.a()) == null) ? null : a11.a();
        List<SummaryOfCartTotalSavingsRemoteModel> c11 = nullableCartResponsePriceRemoteModel.c();
        if (c11 != null) {
            list = b(c11);
        }
        if (list == null) {
            list = C16877v.n();
        }
        return new h(new h.a(d10, e10, list, c10), a12, a13, a14);
    }
}
