package Jn;

import Fn.a;
import XH.t;
import com.ingka.ikea.app.caasremote.models.ItemSubtotalResponseRemoteModel;
import com.ingka.ikea.app.caasremote.models.ItemUnitPriceRemoteModel;
import com.ingka.ikea.app.caasremote.models.NullableBasePricePropertiesRemoteModel;
import com.ingka.ikea.app.caasremote.models.NullableItemResponsePriceRemoteModel;
import com.ingka.ikea.app.caasremote.models.NullableLowestPreviousPriceRemoteModel;
import com.ingka.ikea.app.caasremote.models.NullableUpsellPricePropertiesRemoteModel;
import com.ingka.ikea.app.caasremote.models.NullableUpsellUnitPricePropertiesRemoteModel;
import com.ingka.ikea.app.caasremote.models.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import pp.C11769c;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0007*\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u0004\u0018\u00010\u0007*\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\tJ\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\tJ\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LJn/n;", "Lpp/c;", "LFn/a$c$e;", "Lcom/ingka/ikea/app/caasremote/models/NullableItemResponsePriceRemoteModel;", "<init>", "()V", "Lcom/ingka/ikea/app/caasremote/models/ItemSubtotalResponseRemoteModel;", "", "c", "(Lcom/ingka/ikea/app/caasremote/models/ItemSubtotalResponseRemoteModel;)Ljava/lang/Double;", "Lcom/ingka/ikea/app/caasremote/models/ItemUnitPriceRemoteModel;", "d", "(Lcom/ingka/ikea/app/caasremote/models/ItemUnitPriceRemoteModel;)Ljava/lang/Double;", "e", "b", "g", "LFn/a$c$e$a;", "f", "(Lcom/ingka/ikea/app/caasremote/models/NullableItemResponsePriceRemoteModel;)LFn/a$c$e$a;", "", "h", "(Lcom/ingka/ikea/app/caasremote/models/ItemUnitPriceRemoteModel;)Ljava/lang/String;", "remote", "i", "(Lcom/ingka/ikea/app/caasremote/models/NullableItemResponsePriceRemoteModel;)LFn/a$c$e;", "caas-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n implements C11769c<a.c.e, NullableItemResponsePriceRemoteModel> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f82653a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.ingka.ikea.app.caasremote.models.g[] r0 = com.ingka.ikea.app.caasremote.models.g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ingka.ikea.app.caasremote.models.g r1 = com.ingka.ikea.app.caasremote.models.g.NEW_LOWER_PRICE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.ingka.ikea.app.caasremote.models.g r1 = com.ingka.ikea.app.caasremote.models.g.TIME_RESTRICTED_OFFER     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f82653a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Jn.n.a.<clinit>():void");
        }
    }

    private final Double b(ItemSubtotalResponseRemoteModel itemSubtotalResponseRemoteModel) {
        Double b10;
        NullableBasePricePropertiesRemoteModel a10 = itemSubtotalResponseRemoteModel.a();
        if (a10 != null && (b10 = a10.b()) != null) {
            return b10;
        }
        NullableBasePricePropertiesRemoteModel a11 = itemSubtotalResponseRemoteModel.a();
        if (a11 != null) {
            return a11.a();
        }
        return null;
    }

    private final Double c(ItemSubtotalResponseRemoteModel itemSubtotalResponseRemoteModel) {
        Double b10 = itemSubtotalResponseRemoteModel.b().b();
        return b10 == null ? itemSubtotalResponseRemoteModel.b().a() : b10;
    }

    private final Double d(ItemUnitPriceRemoteModel itemUnitPriceRemoteModel) {
        Double b10 = itemUnitPriceRemoteModel.b().b();
        return b10 == null ? itemUnitPriceRemoteModel.b().a() : b10;
    }

    private final Double e(ItemUnitPriceRemoteModel itemUnitPriceRemoteModel) {
        Double b10;
        NullableLowestPreviousPriceRemoteModel c10 = itemUnitPriceRemoteModel.c();
        if (c10 != null && (b10 = c10.b()) != null) {
            return b10;
        }
        NullableLowestPreviousPriceRemoteModel c11 = itemUnitPriceRemoteModel.c();
        if (c11 != null) {
            return c11.a();
        }
        return null;
    }

    private final a.c.e.C1563a f(NullableItemResponsePriceRemoteModel nullableItemResponsePriceRemoteModel) {
        g d10 = nullableItemResponsePriceRemoteModel.b().d();
        int i10 = d10 == null ? -1 : a.f82653a[d10.ordinal()];
        if (i10 == -1) {
            return null;
        }
        if (i10 == 1) {
            return a.c.e.C1563a.NEW_LOWER_PRICE;
        }
        if (i10 == 2) {
            return a.c.e.C1563a.TRO;
        }
        throw new t();
    }

    private final Double g(ItemSubtotalResponseRemoteModel itemSubtotalResponseRemoteModel) {
        Double b10;
        NullableUpsellPricePropertiesRemoteModel c10 = itemSubtotalResponseRemoteModel.c();
        if (c10 != null && (b10 = c10.b()) != null) {
            return b10;
        }
        NullableUpsellPricePropertiesRemoteModel c11 = itemSubtotalResponseRemoteModel.c();
        if (c11 != null) {
            return c11.a();
        }
        return null;
    }

    private final String h(ItemUnitPriceRemoteModel itemUnitPriceRemoteModel) {
        String a10;
        g d10 = itemUnitPriceRemoteModel.d();
        int i10 = d10 == null ? -1 : a.f82653a[d10.ordinal()];
        if (i10 != -1) {
            if (i10 == 1) {
                return null;
            }
            if (i10 != 2) {
                throw new t();
            }
        }
        NullableUpsellUnitPricePropertiesRemoteModel e10 = itemUnitPriceRemoteModel.e();
        return (e10 == null || (a10 = e10.a()) == null) ? itemUnitPriceRemoteModel.b().c() : a10;
    }

    /* renamed from: i */
    public a.c.e a(NullableItemResponsePriceRemoteModel nullableItemResponsePriceRemoteModel) {
        C17542s.j(nullableItemResponsePriceRemoteModel, "remote");
        String h10 = h(nullableItemResponsePriceRemoteModel.b());
        Double c10 = c(nullableItemResponsePriceRemoteModel.a());
        double doubleValue = c10 != null ? c10.doubleValue() : 0.0d;
        Double d10 = d(nullableItemResponsePriceRemoteModel.b());
        double doubleValue2 = d10 != null ? d10.doubleValue() : 0.0d;
        Double b10 = b(nullableItemResponsePriceRemoteModel.a());
        Double e10 = e(nullableItemResponsePriceRemoteModel.b());
        Double g10 = g(nullableItemResponsePriceRemoteModel.a());
        a.c.e.C1563a f10 = f(nullableItemResponsePriceRemoteModel);
        Boolean f11 = nullableItemResponsePriceRemoteModel.b().f();
        return new a.c.e(f10, f11 != null ? f11.booleanValue() : false, doubleValue, doubleValue2, e10, b10, g10, h10);
    }
}
