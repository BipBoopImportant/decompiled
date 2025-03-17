package Op;

import IC.C13023e;
import IC.C13026h;
import KJ.C15985a;
import KJ.C15987c;
import Oo.b;
import Op.C10828d;
import Op.C10850o;
import Op.a1;
import SC.L2;
import XH.t;
import YH.C16877v;
import androidx.recyclerview.widget.RecyclerView;
import com.ingka.ikea.core.model.Image;
import com.ingka.ikea.core.model.Link;
import com.ingka.ikea.core.model.product.Badge;
import com.ingka.ikea.core.model.product.ProductItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kp.C11522d;
import qx.C14957b;
import qx.c;
import uK.C18146a;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001am\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0001\u0010\u0017\u001a\u00020\u0016*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018\u001aA\u0010\u001b\u001a\u00020\u001a*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001c\u001a#\u0010 \u001a\u00020\u001f*\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b \u0010!\u001a\u0011\u0010$\u001a\u00020#*\u00020\"¢\u0006\u0004\b$\u0010%\u001a\u001b\u0010(\u001a\u00020'*\u00020&2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010)\u001a\u0013\u0010,\u001a\u00020+*\u00020*H\u0002¢\u0006\u0004\b,\u0010-\u001a\u0013\u00100\u001a\u00020/*\u00020.H\u0002¢\u0006\u0004\b0\u00101\u001a7\u00106\u001a\b\u0012\u0004\u0012\u000205042\u0006\u00102\u001a\u00020.2\b\u00103\u001a\u0004\u0018\u00010.2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b6\u00107\u001a\u0013\u0010:\u001a\u000209*\u000208H\u0002¢\u0006\u0004\b:\u0010;\u001a\u0011\u0010=\u001a\u00020<*\u000208¢\u0006\u0004\b=\u0010>¨\u0006?"}, d2 = {"Lcom/ingka/ikea/core/model/product/ProductItem;", "", "", "itemNosAddingToCart", "", "allProductNumbersInShoppingLists", "Lkp/d;", "currencyConfig", "", "familyAndRegularPriceSameSize", "allowAddToCart", "allowAddToFavourites", "allowMultipleImages", "prioritizeContextualImage", "allowOfferDaysLeft", "LOp/d1;", "n", "(Lcom/ingka/ikea/core/model/product/ProductItem;Ljava/util/List;Ljava/util/Set;Lkp/d;ZZZZZZ)LOp/d1;", "LOp/b1;", "quantityRepresentation", "isClickable", "showOptionsMenu", "LOp/a1;", "l", "(Lcom/ingka/ikea/core/model/product/ProductItem;LOp/b1;Ljava/util/List;Ljava/util/Set;Lkp/d;ZZZZZZZZ)LOp/a1;", "enableProductDisclaimers", "LOp/d;", "f", "(Lcom/ingka/ikea/core/model/product/ProductItem;Lkp/d;ZZZZ)LOp/d;", "Lcom/ingka/ikea/core/model/product/ProductItem$ProductInfo;", "allowOffersDayLeft", "LOp/d$h;", "e", "(Lcom/ingka/ikea/core/model/product/ProductItem$ProductInfo;Lkp/d;Z)LOp/d$h;", "Lcom/ingka/ikea/core/model/product/ProductItem$ProductDisclaimer;", "LOp/d$g;", "c", "(Lcom/ingka/ikea/core/model/product/ProductItem$ProductDisclaimer;)LOp/d$g;", "Lcom/ingka/ikea/core/model/product/ProductItem$Price;", "LOp/d$l;", "b", "(Lcom/ingka/ikea/core/model/product/ProductItem$Price;Lkp/d;)LOp/d$l;", "Lcom/ingka/ikea/core/model/Link;", "LOp/d$e;", "k", "(Lcom/ingka/ikea/core/model/Link;)LOp/d$e;", "Lcom/ingka/ikea/core/model/Image;", "LOp/d$d;", "j", "(Lcom/ingka/ikea/core/model/Image;)LOp/d$d;", "productImage", "contextualImage", "LKJ/c;", "LOp/d$m;", "a", "(Lcom/ingka/ikea/core/model/Image;Lcom/ingka/ikea/core/model/Image;ZZ)LKJ/c;", "Lcom/ingka/ikea/core/model/product/Badge;", "", "d", "(Lcom/ingka/ikea/core/model/product/Badge;)I", "LOp/d$b;", "i", "(Lcom/ingka/ikea/core/model/product/Badge;)LOp/d$b;", "product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class B0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f84860a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f84861b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f84862c;

        /* renamed from: d  reason: collision with root package name */
        public static final /* synthetic */ int[] f84863d;

        /* renamed from: e  reason: collision with root package name */
        public static final /* synthetic */ int[] f84864e;

        /* JADX WARNING: Can't wrap try/catch for region: R(47:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|(2:25|26)|27|29|30|31|32|33|34|(2:35|36)|37|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|57|58|(2:59|60)|61|63) */
        /* JADX WARNING: Can't wrap try/catch for region: R(49:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|(2:25|26)|27|29|30|31|32|33|34|(2:35|36)|37|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|57|58|59|60|61|63) */
        /* JADX WARNING: Can't wrap try/catch for region: R(51:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|(2:25|26)|27|29|30|31|32|33|34|35|36|37|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|57|58|59|60|61|63) */
        /* JADX WARNING: Can't wrap try/catch for region: R(54:0|1|2|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|24|25|26|27|29|30|31|32|33|34|35|36|37|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|57|58|59|60|61|63) */
        /* JADX WARNING: Can't wrap try/catch for region: R(55:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|29|30|31|32|33|34|35|36|37|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|57|58|59|60|61|63) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0045 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x004d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0066 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0076 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x008f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0097 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x009f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00a7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00af */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00b8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00c1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00dc */
        static {
            /*
                op.n[] r0 = op.C11703n.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                op.n r2 = op.C11703n.HIGH_IN_STOCK     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                op.n r3 = op.C11703n.MEDIUM_IN_STOCK     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                op.n r4 = op.C11703n.LOW_IN_STOCK     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r4 = 4
                op.n r5 = op.C11703n.OUT_OF_STOCK     // Catch:{ NoSuchFieldError -> 0x002b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                r5 = 5
                op.n r6 = op.C11703n.NOT_SOLD     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r0[r6] = r5     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f84860a = r0
                com.ingka.ikea.core.model.product.AvailabilityType[] r0 = com.ingka.ikea.core.model.product.AvailabilityType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ingka.ikea.core.model.product.AvailabilityType r6 = com.ingka.ikea.core.model.product.AvailabilityType.HOME_DELIVERY     // Catch:{ NoSuchFieldError -> 0x0045 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0045 }
                r0[r6] = r1     // Catch:{ NoSuchFieldError -> 0x0045 }
            L_0x0045:
                com.ingka.ikea.core.model.product.AvailabilityType r6 = com.ingka.ikea.core.model.product.AvailabilityType.CASH_AND_CARRY     // Catch:{ NoSuchFieldError -> 0x004d }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r6] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                com.ingka.ikea.core.model.product.AvailabilityType r6 = com.ingka.ikea.core.model.product.AvailabilityType.CLICK_AND_COLLECT     // Catch:{ NoSuchFieldError -> 0x0055 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0055 }
                r0[r6] = r3     // Catch:{ NoSuchFieldError -> 0x0055 }
            L_0x0055:
                f84861b = r0
                op.e[] r0 = op.C11694e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                op.e r6 = op.C11694e.NEW_PRODUCT     // Catch:{ NoSuchFieldError -> 0x0066 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0066 }
                r0[r6] = r1     // Catch:{ NoSuchFieldError -> 0x0066 }
            L_0x0066:
                op.e r6 = op.C11694e.FAMILY_PRICE     // Catch:{ NoSuchFieldError -> 0x006e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r0[r6] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                op.e r6 = op.C11694e.NEW_LOWER_PRICE     // Catch:{ NoSuchFieldError -> 0x0076 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0076 }
                r0[r6] = r3     // Catch:{ NoSuchFieldError -> 0x0076 }
            L_0x0076:
                op.e r6 = op.C11694e.TIME_RESTRICTED_OFFER     // Catch:{ NoSuchFieldError -> 0x007e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
                r0[r6] = r4     // Catch:{ NoSuchFieldError -> 0x007e }
            L_0x007e:
                f84862c = r0
                com.ingka.ikea.core.model.product.ProductItem$ProductDisclaimer$c[] r0 = com.ingka.ikea.core.model.product.ProductItem.ProductDisclaimer.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ingka.ikea.core.model.product.ProductItem$ProductDisclaimer$c r6 = com.ingka.ikea.core.model.product.ProductItem.ProductDisclaimer.c.ENERGY_SHEET_URL     // Catch:{ NoSuchFieldError -> 0x008f }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r0[r6] = r1     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                com.ingka.ikea.core.model.product.ProductItem$ProductDisclaimer$c r6 = com.ingka.ikea.core.model.product.ProductItem.ProductDisclaimer.c.ENERGY_SHEET_DEEPLINK     // Catch:{ NoSuchFieldError -> 0x0097 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0097 }
                r0[r6] = r2     // Catch:{ NoSuchFieldError -> 0x0097 }
            L_0x0097:
                com.ingka.ikea.core.model.product.ProductItem$ProductDisclaimer$c r6 = com.ingka.ikea.core.model.product.ProductItem.ProductDisclaimer.c.PRICE_DELIVERY     // Catch:{ NoSuchFieldError -> 0x009f }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x009f }
                r0[r6] = r3     // Catch:{ NoSuchFieldError -> 0x009f }
            L_0x009f:
                com.ingka.ikea.core.model.product.ProductItem$ProductDisclaimer$c r3 = com.ingka.ikea.core.model.product.ProductItem.ProductDisclaimer.c.LAST_CHANCE     // Catch:{ NoSuchFieldError -> 0x00a7 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a7 }
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x00a7 }
            L_0x00a7:
                com.ingka.ikea.core.model.product.ProductItem$ProductDisclaimer$c r3 = com.ingka.ikea.core.model.product.ProductItem.ProductDisclaimer.c.COLOR_INFO     // Catch:{ NoSuchFieldError -> 0x00af }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00af }
                r0[r3] = r5     // Catch:{ NoSuchFieldError -> 0x00af }
            L_0x00af:
                com.ingka.ikea.core.model.product.ProductItem$ProductDisclaimer$c r3 = com.ingka.ikea.core.model.product.ProductItem.ProductDisclaimer.c.WARNING_CHOKING_HAZARD     // Catch:{ NoSuchFieldError -> 0x00b8 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b8 }
                r4 = 6
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x00b8 }
            L_0x00b8:
                com.ingka.ikea.core.model.product.ProductItem$ProductDisclaimer$c r3 = com.ingka.ikea.core.model.product.ProductItem.ProductDisclaimer.c.SDM_ADVERTISEMENT     // Catch:{ NoSuchFieldError -> 0x00c1 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c1 }
                r4 = 7
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x00c1 }
            L_0x00c1:
                com.ingka.ikea.core.model.product.ProductItem$ProductDisclaimer$c r3 = com.ingka.ikea.core.model.product.ProductItem.ProductDisclaimer.c.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x00cb }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cb }
                r4 = 8
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x00cb }
            L_0x00cb:
                f84863d = r0
                op.c[] r0 = op.C11692c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                op.c r3 = op.C11692c.TOP_SELLER     // Catch:{ NoSuchFieldError -> 0x00dc }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00dc }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x00dc }
            L_0x00dc:
                op.c r1 = op.C11692c.LIMITED_EDITION     // Catch:{ NoSuchFieldError -> 0x00e4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e4 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e4 }
            L_0x00e4:
                f84864e = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Op.B0.a.<clinit>():void");
        }
    }

    private static final C15987c<C10828d.m> a(Image image, Image image2, boolean z10, boolean z11) {
        if (z11 && !z10 && image2 != null) {
            return C15985a.b(new C10828d.m.a(new C10828d.C1720d(image2.getUrl(), image2.A0())));
        }
        List t10 = C16877v.t(new C10828d.m.b(new C10828d.C1720d(image.getUrl(), image.A0())));
        if (z10 && image2 != null) {
            t10.add(!z11 ? 1 : 0, new C10828d.m.a(new C10828d.C1720d(image2.getUrl(), image2.A0())));
        }
        return C15985a.l(t10);
    }

    private static final C10828d.l b(ProductItem.Price price, C11522d dVar) {
        C10828d.l lVar;
        c cVar = null;
        if (price instanceof ProductItem.Price.BtiPrice) {
            ProductItem.Price.BtiPrice btiPrice = (ProductItem.Price.BtiPrice) price;
            c a10 = C14957b.a(btiPrice.e().c(), dVar);
            Double d10 = btiPrice.e().d();
            if (d10 != null) {
                cVar = C14957b.a(d10.doubleValue(), dVar);
            }
            lVar = new C10828d.l.a(new C10828d.l.e(cVar, a10, C16877v.n(), btiPrice.e().e()));
        } else if (price instanceof ProductItem.Price.FamilyPrice) {
            ProductItem.Price.FamilyPrice familyPrice = (ProductItem.Price.FamilyPrice) price;
            c a11 = C14957b.a(familyPrice.e().c(), dVar);
            Double d11 = familyPrice.e().d();
            if (d11 != null) {
                cVar = C14957b.a(d11.doubleValue(), dVar);
            }
            lVar = new C10828d.l.b(new C10828d.l.e(cVar, a11, C16877v.n(), familyPrice.e().e()));
        } else if (price instanceof ProductItem.Price.NewLowerPrice) {
            ProductItem.Price.NewLowerPrice newLowerPrice = (ProductItem.Price.NewLowerPrice) price;
            c a12 = C14957b.a(newLowerPrice.e().c(), dVar);
            Double d12 = newLowerPrice.e().d();
            if (d12 != null) {
                cVar = C14957b.a(d12.doubleValue(), dVar);
            }
            lVar = new C10828d.l.c(new C10828d.l.e(cVar, a12, C16877v.n(), newLowerPrice.e().e()));
        } else if (price instanceof ProductItem.Price.RegularPrice) {
            ProductItem.Price.RegularPrice regularPrice = (ProductItem.Price.RegularPrice) price;
            c a13 = C14957b.a(regularPrice.e().c(), dVar);
            Double d13 = regularPrice.e().d();
            if (d13 != null) {
                cVar = C14957b.a(d13.doubleValue(), dVar);
            }
            lVar = new C10828d.l.f(new C10828d.l.e(cVar, a13, C16877v.n(), regularPrice.e().e()));
        } else if (price instanceof ProductItem.Price.TimeRestrictedPrice) {
            ProductItem.Price.TimeRestrictedPrice timeRestrictedPrice = (ProductItem.Price.TimeRestrictedPrice) price;
            c a14 = C14957b.a(timeRestrictedPrice.e().c(), dVar);
            Double d14 = timeRestrictedPrice.e().d();
            if (d14 != null) {
                cVar = C14957b.a(d14.doubleValue(), dVar);
            }
            lVar = new C10828d.l.g(new C10828d.l.e(cVar, a14, C16877v.n(), timeRestrictedPrice.e().e()));
        } else {
            throw new t();
        }
        return lVar;
    }

    public static final C10828d.g c(ProductItem.ProductDisclaimer productDisclaimer) {
        C10828d.g.a aVar;
        C17542s.j(productDisclaimer, "<this>");
        C13023e c10 = C13026h.c(productDisclaimer.d());
        Image b10 = productDisclaimer.b();
        C10828d.e eVar = null;
        C10828d.C1720d dVar = b10 != null ? new C10828d.C1720d(b10.getUrl(), b10.A0()) : null;
        Link c11 = productDisclaimer.c();
        if (c11 != null) {
            eVar = k(c11);
        }
        switch (a.f84863d[productDisclaimer.e().ordinal()]) {
            case 1:
                aVar = C10828d.g.a.ENERGY_SHEET_URL;
                break;
            case 2:
                aVar = C10828d.g.a.ENERGY_SHEET_DEEPLINK;
                break;
            case 3:
                aVar = C10828d.g.a.PRICE_DELIVERY;
                break;
            case 4:
                aVar = C10828d.g.a.LAST_CHANCE;
                break;
            case 5:
                aVar = C10828d.g.a.COLOR_INFO;
                break;
            case 6:
                aVar = C10828d.g.a.WARNING_CHOKING_HAZARD;
                break;
            case 7:
                aVar = C10828d.g.a.SDM_ADVERTISEMENT;
                break;
            case 8:
                aVar = C10828d.g.a.UNKNOWN;
                break;
            default:
                throw new t();
        }
        return new C10828d.g(c10, dVar, aVar, eVar);
    }

    private static final int d(Badge badge) {
        int i10 = a.f84864e[badge.c().ordinal()];
        if (i10 == 1) {
            return b.f84418K0;
        }
        if (i10 == 2) {
            return b.f84408J0;
        }
        throw new t();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        r0 = r0.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final Op.C10828d.h e(com.ingka.ikea.core.model.product.ProductItem.ProductInfo r18, kp.C11522d r19, boolean r20) {
        /*
            r0 = r19
            java.lang.String r1 = "<this>"
            r2 = r18
            kotlin.jvm.internal.C17542s.j(r2, r1)
            java.lang.String r1 = "currencyConfig"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            com.ingka.ikea.core.model.product.ProductItem$ProductItemHighlight r1 = r18.e()
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0045
            Op.d$i r5 = new Op.d$i
            op.e r1 = r1.b()
            int[] r6 = Op.B0.a.f84862c
            int r1 = r1.ordinal()
            r1 = r6[r1]
            if (r1 == r3) goto L_0x003e
            r6 = 2
            if (r1 == r6) goto L_0x003b
            r6 = 3
            if (r1 == r6) goto L_0x0038
            r6 = 4
            if (r1 != r6) goto L_0x0032
            Op.d$k r1 = Op.C10828d.k.TIME_RESTRICTED_OFFER
            goto L_0x0040
        L_0x0032:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x0038:
            Op.d$k r1 = Op.C10828d.k.NEW_LOWER_PRICE
            goto L_0x0040
        L_0x003b:
            Op.d$k r1 = Op.C10828d.k.FAMILY_PRICE
            goto L_0x0040
        L_0x003e:
            Op.d$k r1 = Op.C10828d.k.NEW_PRODUCT
        L_0x0040:
            r5.<init>(r1)
            r7 = r5
            goto L_0x0046
        L_0x0045:
            r7 = r4
        L_0x0046:
            java.lang.String r9 = r18.i()
            java.lang.String r10 = r18.c()
            com.ingka.ikea.core.model.product.ProductItem$Price r1 = r18.g()
            Op.d$l r12 = b(r1, r0)
            com.ingka.ikea.core.model.product.ProductItem$EnergyClassDisclaimer r0 = r18.d()
            if (r0 == 0) goto L_0x006d
            com.ingka.ikea.core.model.Image r0 = r0.a()
            if (r0 == 0) goto L_0x006d
            Op.d$c r1 = new Op.d$c
            Op.d$d r0 = j(r0)
            r1.<init>(r0)
            r13 = r1
            goto L_0x006e
        L_0x006d:
            r13 = r4
        L_0x006e:
            java.util.List r0 = r18.h()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r5 = 10
            int r5 = YH.C16877v.y(r0, r5)
            r1.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x0083:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0097
            java.lang.Object r5 = r0.next()
            java.lang.String r5 = (java.lang.String) r5
            IC.e r5 = IC.C13026h.c(r5)
            r1.add(r5)
            goto L_0x0083
        L_0x0097:
            KJ.c r14 = KJ.C15985a.h(r1)
            java.lang.String r15 = r18.b()
            if (r20 == 0) goto L_0x00b0
            java.lang.String r0 = r18.f()
            if (r0 == 0) goto L_0x00b0
            Op.e r1 = new Op.e
            r1.<init>(r4, r3, r4)
            IC.e r4 = r1.a(r0)
        L_0x00b0:
            r8 = r4
            Op.d$h r0 = new Op.d$h
            r16 = 16
            r17 = 0
            r11 = 0
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Op.B0.e(com.ingka.ikea.core.model.product.ProductItem$ProductInfo, kp.d, boolean):Op.d$h");
    }

    public static final C10828d f(ProductItem productItem, C11522d dVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        C15987c a10;
        L2 l22;
        int i10;
        C11522d dVar2 = dVar;
        C17542s.j(productItem, "<this>");
        C17542s.j(dVar2, "currencyConfig");
        String f10 = productItem.f();
        String g10 = productItem.g();
        Badge h10 = productItem.h();
        C10828d.b i11 = h10 != null ? i(h10) : null;
        C15987c<C10828d.m> a11 = a(productItem.d(), productItem.c(), z11, z12);
        C10828d.h e10 = e(productItem.e(), dVar2, z13);
        if (z10) {
            Iterable<ProductItem.ProductDisclaimer> i12 = productItem.i();
            ArrayList arrayList = new ArrayList(C16877v.y(i12, 10));
            for (ProductItem.ProductDisclaimer c10 : i12) {
                arrayList.add(c(c10));
            }
            a10 = C15985a.h(arrayList);
        } else {
            a10 = C15985a.a();
        }
        C15987c cVar = a10;
        Iterable<ProductItem.Availability> b10 = productItem.b();
        ArrayList arrayList2 = new ArrayList(C16877v.y(b10, 10));
        for (ProductItem.Availability availability : b10) {
            String c11 = availability.c();
            if (c11 == null) {
                c11 = "";
            }
            C13023e c12 = C13026h.c(c11);
            int i13 = a.f84860a[availability.b().ordinal()];
            if (i13 == 1 || i13 == 2) {
                l22 = L2.Available;
            } else if (i13 == 3) {
                l22 = L2.Low;
            } else if (i13 == 4) {
                l22 = L2.Unavailable;
            } else if (i13 == 5) {
                l22 = L2.Indeterminate;
            } else {
                throw new t();
            }
            int i14 = a.f84861b[availability.d().ordinal()];
            if (i14 == 1) {
                i10 = C18146a.f148385c3;
            } else if (i14 == 2) {
                i10 = C18146a.f148658td;
            } else if (i14 == 3) {
                i10 = C18146a.f148352a2;
            } else {
                throw new t();
            }
            arrayList2.add(new C10828d.f(c12, l22, Integer.valueOf(i10)));
        }
        return new C10828d(f10, g10, i11, a11, e10, cVar, C15985a.h(arrayList2), productItem.j());
    }

    public static /* synthetic */ C10828d.h g(ProductItem.ProductInfo productInfo, C11522d dVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return e(productInfo, dVar, z10);
    }

    public static /* synthetic */ C10828d h(ProductItem productItem, C11522d dVar, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return f(productItem, dVar, z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? false : z12, (i10 & 16) != 0 ? false : z13);
    }

    public static final C10828d.b i(Badge badge) {
        C10828d.a aVar;
        C17542s.j(badge, "<this>");
        String b10 = badge.b();
        C13023e c10 = b10 != null ? C13026h.c(b10) : C13026h.a(d(badge));
        int i10 = a.f84864e[badge.c().ordinal()];
        if (i10 == 1) {
            aVar = C10828d.a.TOP_SELLER;
        } else if (i10 == 2) {
            aVar = C10828d.a.LIMITED_EDITION;
        } else {
            throw new t();
        }
        return new C10828d.b(aVar, c10);
    }

    private static final C10828d.C1720d j(Image image) {
        return new C10828d.C1720d(image.getUrl(), image.A0());
    }

    private static final C10828d.e k(Link link) {
        if (link instanceof Link.Deeplink) {
            Link.Deeplink deeplink = (Link.Deeplink) link;
            return new C10828d.e.a(deeplink.d(), deeplink.e());
        } else if (link instanceof Link.External) {
            Link.External external = (Link.External) link;
            return new C10828d.e.b(external.d(), external.e());
        } else {
            throw new t();
        }
    }

    public static final a1 l(ProductItem productItem, b1 b1Var, List<String> list, Set<String> set, C11522d dVar, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        boolean z18;
        List<String> list2 = list;
        Set<String> set2 = set;
        ProductItem productItem2 = productItem;
        C17542s.j(productItem, "<this>");
        b1 b1Var2 = b1Var;
        C17542s.j(b1Var, "quantityRepresentation");
        C17542s.j(list, "itemNosAddingToCart");
        C17542s.j(set2, "allProductNumbersInShoppingLists");
        C17542s.j(dVar, "currencyConfig");
        List c10 = C16877v.c();
        boolean z19 = true;
        if (z11 && productItem.j()) {
            Iterable iterable = list2;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (C17542s.e((String) it.next(), productItem.f())) {
                            z18 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z18 = false;
            c10.add(new C10850o.a(z18, (C10850o.d) null, 2, (DefaultConstructorMarker) null));
        }
        if (z12) {
            Iterable iterable2 = set2;
            if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                Iterator it2 = iterable2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (C17542s.e((String) it2.next(), productItem.f())) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z19 = false;
            c10.add(new C10850o.e(z19));
        }
        List a10 = C16877v.a(c10);
        if (a10.isEmpty()) {
            a10 = null;
        }
        return new a1(a10 != null ? new a1.a(C15985a.h(a10)) : null, h(productItem, dVar, false, z15, z16, z17, 2, (Object) null), dVar, b1Var, z14, z13, z10);
    }

    public static /* synthetic */ a1 m(ProductItem productItem, b1 b1Var, List list, Set set, C11522d dVar, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, int i10, Object obj) {
        int i11 = i10;
        return l(productItem, b1Var, list, set, dVar, (i11 & 16) != 0 ? false : z10, z11, z12, z13, (i11 & 256) != 0 ? false : z14, (i11 & 512) != 0 ? false : z15, (i11 & 1024) != 0 ? false : z16, (i11 & RecyclerView.n.FLAG_MOVED) != 0 ? false : z17);
    }

    public static final d1 n(ProductItem productItem, List<String> list, Set<String> set, C11522d dVar, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        C10850o.a aVar;
        boolean z16;
        List<String> list2 = list;
        Set<String> set2 = set;
        ProductItem productItem2 = productItem;
        C17542s.j(productItem, "<this>");
        C17542s.j(list, "itemNosAddingToCart");
        C17542s.j(set, "allProductNumbersInShoppingLists");
        C11522d dVar2 = dVar;
        C17542s.j(dVar, "currencyConfig");
        boolean z17 = true;
        if (!z11 || !productItem.j()) {
            aVar = null;
        } else {
            Iterable iterable = list2;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (C17542s.e((String) it.next(), productItem.f())) {
                            z16 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z16 = false;
            aVar = new C10850o.a(z16, (C10850o.d) null, 2, (DefaultConstructorMarker) null);
        }
        Iterable iterable2 = set2;
        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
            Iterator it2 = iterable2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (C17542s.e((String) it2.next(), productItem.f())) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z17 = false;
        return new d1(aVar, new C10867x(z17, z12), h(productItem, dVar, false, z13, z14, z15, 2, (Object) null), dVar, z10);
    }

    public static /* synthetic */ d1 o(ProductItem productItem, List list, Set set, C11522d dVar, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i10, Object obj) {
        int i11 = i10;
        return n(productItem, list, set, dVar, (i11 & 8) != 0 ? false : z10, z11, z12, (i11 & 64) != 0 ? false : z13, (i11 & 128) != 0 ? false : z14, (i11 & 256) != 0 ? false : z15);
    }
}
