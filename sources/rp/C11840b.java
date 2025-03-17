package rp;

import XH.t;
import YH.C16877v;
import com.ingka.ikea.core.model.Image;
import com.ingka.ikea.core.model.product.Disclaimer;
import com.ingka.ikea.core.model.product.ProductItem;
import com.ingka.ikea.core.remotemodel.ImageRemote;
import com.ingka.ikea.core.remotemodel.product.DisclaimerRemote;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003*\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "Lcom/ingka/ikea/core/remotemodel/product/DisclaimerRemote;", "productDisclaimers", "Lcom/ingka/ikea/core/model/product/ProductItem$ProductDisclaimer;", "b", "(Ljava/util/List;)Ljava/util/List;", "Lcom/ingka/ikea/core/model/product/Disclaimer;", "c", "(Lcom/ingka/ikea/core/model/product/Disclaimer;)Lcom/ingka/ikea/core/model/product/ProductItem$ProductDisclaimer;", "energyClassDisclaimer", "Lcom/ingka/ikea/core/model/product/ProductItem$EnergyClassDisclaimer;", "a", "(Lcom/ingka/ikea/core/remotemodel/product/DisclaimerRemote;)Lcom/ingka/ikea/core/model/product/ProductItem$EnergyClassDisclaimer;", "remote-model_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: rp.b  reason: case insensitive filesystem */
public final class C11840b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: rp.b$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f102113a;

        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|31) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0082 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.ingka.ikea.core.model.product.DisclaimerType[] r0 = com.ingka.ikea.core.model.product.DisclaimerType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ingka.ikea.core.model.product.DisclaimerType r1 = com.ingka.ikea.core.model.product.DisclaimerType.ENERGY_SHEET_URL     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.ingka.ikea.core.model.product.DisclaimerType r1 = com.ingka.ikea.core.model.product.DisclaimerType.ENERGY_SHEET_DEEPLINK     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.ingka.ikea.core.model.product.DisclaimerType r1 = com.ingka.ikea.core.model.product.DisclaimerType.PRICE_DELIVERY     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.ingka.ikea.core.model.product.DisclaimerType r1 = com.ingka.ikea.core.model.product.DisclaimerType.LAST_CHANCE     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.ingka.ikea.core.model.product.DisclaimerType r1 = com.ingka.ikea.core.model.product.DisclaimerType.COLOR_INFO     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                com.ingka.ikea.core.model.product.DisclaimerType r1 = com.ingka.ikea.core.model.product.DisclaimerType.WARNING_CHOKING_HAZARD     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                com.ingka.ikea.core.model.product.DisclaimerType r1 = com.ingka.ikea.core.model.product.DisclaimerType.SDM_ADVERTISEMENT     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                com.ingka.ikea.core.model.product.DisclaimerType r1 = com.ingka.ikea.core.model.product.DisclaimerType.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                com.ingka.ikea.core.model.product.DisclaimerType r1 = com.ingka.ikea.core.model.product.DisclaimerType.OFFER_VALIDITY     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                com.ingka.ikea.core.model.product.DisclaimerType r1 = com.ingka.ikea.core.model.product.DisclaimerType.INDICATIVE_DISCOUNT     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                com.ingka.ikea.core.model.product.DisclaimerType r1 = com.ingka.ikea.core.model.product.DisclaimerType.REGULAR_PRICE     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                com.ingka.ikea.core.model.product.DisclaimerType r1 = com.ingka.ikea.core.model.product.DisclaimerType.ENERGY_SYMBOL_URL     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                com.ingka.ikea.core.model.product.DisclaimerType r1 = com.ingka.ikea.core.model.product.DisclaimerType.REPAIRABILITY_INDEX     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                com.ingka.ikea.core.model.product.DisclaimerType r1 = com.ingka.ikea.core.model.product.DisclaimerType.LOWEST_PREVIOUS_PRICE     // Catch:{ NoSuchFieldError -> 0x008c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008c }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008c }
            L_0x008c:
                f102113a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rp.C11840b.a.<clinit>():void");
        }
    }

    public static final ProductItem.EnergyClassDisclaimer a(DisclaimerRemote disclaimerRemote) {
        Image image = null;
        if (disclaimerRemote == null) {
            return null;
        }
        String c10 = disclaimerRemote.c();
        if (c10 != null) {
            ImageRemote a10 = disclaimerRemote.a();
            if (a10 != null) {
                image = a10.c();
            }
            return new ProductItem.EnergyClassDisclaimer(c10, image);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final List<ProductItem.ProductDisclaimer> b(List<DisclaimerRemote> list) {
        if (list == null) {
            return C16877v.n();
        }
        Iterable<DisclaimerRemote> iterable = list;
        ArrayList<Disclaimer> arrayList = new ArrayList<>(C16877v.y(iterable, 10));
        for (DisclaimerRemote d10 : iterable) {
            arrayList.add(d10.d());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Disclaimer c10 : arrayList) {
            ProductItem.ProductDisclaimer c11 = c(c10);
            if (c11 != null) {
                arrayList2.add(c11);
            }
        }
        return arrayList2;
    }

    private static final ProductItem.ProductDisclaimer c(Disclaimer disclaimer) {
        ProductItem.ProductDisclaimer.c cVar;
        switch (a.f102113a[disclaimer.e().ordinal()]) {
            case 1:
                cVar = ProductItem.ProductDisclaimer.c.ENERGY_SHEET_URL;
                break;
            case 2:
                cVar = ProductItem.ProductDisclaimer.c.ENERGY_SHEET_DEEPLINK;
                break;
            case 3:
                cVar = ProductItem.ProductDisclaimer.c.PRICE_DELIVERY;
                break;
            case 4:
                cVar = ProductItem.ProductDisclaimer.c.LAST_CHANCE;
                break;
            case 5:
                cVar = ProductItem.ProductDisclaimer.c.COLOR_INFO;
                break;
            case 6:
                cVar = ProductItem.ProductDisclaimer.c.WARNING_CHOKING_HAZARD;
                break;
            case 7:
                cVar = ProductItem.ProductDisclaimer.c.SDM_ADVERTISEMENT;
                break;
            case 8:
                cVar = ProductItem.ProductDisclaimer.c.UNKNOWN;
                break;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                cVar = null;
                break;
            default:
                throw new t();
        }
        if (cVar == null) {
            return null;
        }
        return new ProductItem.ProductDisclaimer(disclaimer.d(), disclaimer.b(), cVar, disclaimer.c());
    }
}
