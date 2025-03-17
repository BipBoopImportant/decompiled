package com.ingka.ikea.checkout.datalayer.impl.repo.network;

import HJ.C15850p;
import HJ.C15854t;
import M6.g;
import Nn.C10799b;
import Nn.C10800c;
import Nn.C10801d;
import Nn.C10802e;
import Nn.C10803f;
import Nn.C10804g;
import Nn.C10808k;
import Nn.C10810m;
import Nn.C10811n;
import Nn.C10812o;
import Nn.C10813p;
import Nn.C10814q;
import Nn.G;
import Nn.J;
import Nn.K;
import Nn.M;
import Nn.N;
import Nn.P;
import Nn.r;
import Nn.u;
import Nn.z;
import XH.t;
import YH.C16877v;
import bI.C17035a;
import com.ingka.ikea.appconfig.model.LocationLatLng;
import com.ingka.ikea.checkout.datalayer.impl.repo.network.b;
import com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PriceResponse;
import com.ingka.ikea.checkout.datalayer.model.ShippingBillingDynamicModel;
import com.ingka.ikea.dynamicfields.datalayer.Conditions;
import com.ingka.ikea.dynamicfields.datalayer.DynamicFields$Configuration;
import com.ingka.ikea.dynamicfields.datalayer.FieldAttributes;
import com.ingka.ikea.dynamicfields.datalayer.KeyRegex;
import com.ingka.ikea.dynamicfields.datalayer.KeyValue;
import com.ingka.ikea.dynamicfields.datalayer.c;
import com.sugarcube.core.logger.DslKt;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kp.h;
import nI.C17642l;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;
import th.C10256a;
import vh.A0;
import vh.C10314a;
import vh.C10315a0;
import vh.C10318c;
import vh.C10325f0;
import vh.C10339p;
import vh.C10343u;
import vh.E0;
import vh.F;
import vh.L;
import vh.N;
import vh.Q;
import vh.X;
import vh.u0;
import wh.C10373d;
import wh.C10374e;
import wh.C10375f;
import wh.C10377h;
import wh.C10378i;
import wh.q;

@Metadata(d1 = {"\u0000\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\r\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a)\u0010\u0011\u001a\u00020\u00102\u000e\u0010\u000f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0013*\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a!\u0010\u001c\u001a\u00020\u001b*\u00020\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a#\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00132\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u0013H\u0002¢\u0006\u0004\b \u0010\u0017\u001ak\u0010/\u001a\u00020.2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010#\u001a\u0004\u0018\u00010!2\b\u0010$\u001a\u0004\u0018\u00010!2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u00132\b\u0010(\u001a\u0004\u0018\u00010'2\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\u00132\b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010-\u001a\u0004\u0018\u00010+H\u0000¢\u0006\u0004\b/\u00100\u001a!\u00104\u001a\u000203*\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00190\u0013H\u0002¢\u0006\u0004\b4\u00105\u001a\u0013\u00107\u001a\u00020+*\u000206H\u0002¢\u0006\u0004\b7\u00108\u001a\u001f\u0010:\u001a\b\u0012\u0004\u0012\u00020%0\u0013*\b\u0012\u0004\u0012\u0002090\u0013H\u0002¢\u0006\u0004\b:\u0010\u0017\u001a\u0013\u0010<\u001a\u00020'*\u00020;H\u0002¢\u0006\u0004\b<\u0010=\u001a\u001f\u0010?\u001a\b\u0012\u0004\u0012\u00020)0\u0013*\b\u0012\u0004\u0012\u00020>0\u0013H\u0002¢\u0006\u0004\b?\u0010\u0017\u001a#\u0010\u0001\u001a\u0004\u0018\u00010C*\u00020@2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020A0\u0013H\u0002¢\u0006\u0004\b\u0001\u0010D\u001a\u0013\u0010G\u001a\u00020F*\u00020EH\u0002¢\u0006\u0004\bG\u0010H\u001a\u0015\u0010K\u001a\u0004\u0018\u00010J*\u00020IH\u0002¢\u0006\u0004\bK\u0010L\u001a\u0015\u0010M\u001a\u0004\u0018\u00010\u0015*\u00020\u0014H\u0002¢\u0006\u0004\bM\u0010N\u001a\u0015\u0010P\u001a\u00020\u0004*\u0004\u0018\u00010OH\u0002¢\u0006\u0004\bP\u0010Q\u001a\u001b\u0010S\u001a\n\u0012\u0004\u0012\u00020R\u0018\u00010\u0013*\u00020\u0014H\u0002¢\u0006\u0004\bS\u0010T\u001a#\u0010Z\u001a\u00020R*\u00020U2\u0006\u0010W\u001a\u00020V2\u0006\u0010Y\u001a\u00020XH\u0002¢\u0006\u0004\bZ\u0010[\u001a\u0013\u0010]\u001a\u00020\u0004*\u00020\\H\u0002¢\u0006\u0004\b]\u0010^\u001a\u0019\u0010a\u001a\b\u0012\u0004\u0012\u00020`0\u0013*\u00020_H\u0002¢\u0006\u0004\ba\u0010b\u001a\u0013\u0010d\u001a\u00020R*\u00020cH\u0002¢\u0006\u0004\bd\u0010e\u001a\u0019\u0010i\u001a\u0004\u0018\u00010h2\u0006\u0010g\u001a\u00020fH\u0002¢\u0006\u0004\bi\u0010j\u001aK\u0010o\u001a\u00020n2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010#\u001a\u0004\u0018\u00010!2\b\u0010$\u001a\u0004\u0018\u00010!2\b\u0010k\u001a\u0004\u0018\u00010!2\b\u0010l\u001a\u0004\u0018\u00010!2\b\u0010m\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\bo\u0010p\u001a+\u0010t\u001a\u00020s*\u00020q2\u000e\u0010r\u001a\n\u0012\u0004\u0012\u00020R\u0018\u00010\u00132\u0006\u0010Y\u001a\u00020XH\u0002¢\u0006\u0004\bt\u0010u\u001a\u0013\u0010x\u001a\u00020w*\u00020vH\u0002¢\u0006\u0004\bx\u0010y\u001a)\u0010}\u001a\b\u0012\u0004\u0012\u00020|0\u00132\u0012\u0010{\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020z0\u000bH\u0002¢\u0006\u0004\b}\u0010~\u001a\u001e\u0010\u0001\u001a\u0005\u0018\u00010\u00012\u0007\u0010\u0001\u001a\u00020H\u0002¢\u0006\u0006\b\u0001\u0010\u0001\u001a\u0018\u0010\u0001\u001a\u00030\u0001*\u00030\u0001H\u0002¢\u0006\u0006\b\u0001\u0010\u0001\u001a\"\u0010\u0001\u001a\u0005\u0018\u00010\u0001*\u00030\u00012\u0006\u0010Y\u001a\u00020XH\u0002¢\u0006\u0006\b\u0001\u0010\u0001\u001a!\u0010\u0001\u001a\u00030\u0001*\u00030\u00012\u0007\u0010\u0001\u001a\u00020XH\u0002¢\u0006\u0006\b\u0001\u0010\u0001\u001a\u0018\u0010\u0001\u001a\u00030\u0001*\u00030\u0001H\u0002¢\u0006\u0006\b\u0001\u0010\u0001\u001a\u0018\u0010\u0001\u001a\u00030\u0001*\u00030\u0001H\u0002¢\u0006\u0006\b\u0001\u0010\u0001¨\u0006\u0001"}, d2 = {"LM6/w$a;", "D", "LM6/g;", "response", "", "zipCode", "p", "(LM6/g;Ljava/lang/String;)LM6/g;", "LM6/o;", "error", "LXH/v;", "", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/b;", "W", "(LM6/o;)LXH/v;", "errorList", "LNn/e$a;", "V", "(Ljava/util/Map;Ljava/lang/String;)LNn/e$a;", "", "Lvh/u;", "LNn/o;", "r", "(Ljava/util/List;)Ljava/util/List;", "Lth/a$d;", "LNn/d$a;", "items", "LNn/f;", "v", "(Lth/a$d;Ljava/util/List;)LNn/f;", "ungroupedCollectDeliveryServices", "LNn/k;", "Q", "", "orderTotalInclTax", "orderTotalExclTax", "orderTotalTax", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse$CheckoutTaxSummary;", "orderTotalTaxSummaryList", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse$DiscountSummaryResponse;", "orderTotalDiscountSummary", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse$OrderDiscountSummary;", "orderTotalOrderDiscountSummaryList", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse$PriceExclSavings;", "subTotalExclDiscounts", "shippingPriceExclDiscounts", "LNn/i;", "P", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse$DiscountSummaryResponse;Ljava/util/List;Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse$PriceExclSavings;Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse$PriceExclSavings;)LNn/i;", "Lvh/c;", "requested", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/a;", "G", "(Lvh/c;Ljava/util/List;)Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/a;", "Lvh/X$a;", "N", "(Lvh/X$a;)Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse$PriceExclSavings;", "Lvh/a0$c;", "t", "Lvh/a0$a;", "u", "(Lvh/a0$a;)Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse$DiscountSummaryResponse;", "Lvh/N$a;", "M", "Lvh/f0;", "LNn/q;", "deliveryTimeWindows", "LNn/K;", "(Lvh/f0;Ljava/util/List;)LNn/K;", "Lvh/f0$h;", "LNn/K$b$b;", "B", "(Lvh/f0$h;)LNn/K$b$b;", "Lvh/u0;", "LNn/n;", "w", "(Lvh/u0;)LNn/n;", "y", "(Lvh/u;)LNn/o;", "Lvh/p;", "K", "(Lvh/p;)Ljava/lang/String;", "LNn/G;", "T", "(Lvh/u;)Ljava/util/List;", "Lvh/Q;", "Lwh/d;", "fulfillmentPossibility", "", "supportsWheelChairCapability", "z", "(Lvh/Q;Lwh/d;Z)LNn/G;", "Lvh/a;", "J", "(Lvh/a;)Ljava/lang/String;", "Lvh/L;", "LNn/z;", "L", "(Lvh/L;)Ljava/util/List;", "Lvh/f0$j;", "A", "(Lvh/f0$j;)LNn/G;", "Lwh/e;", "fulfillmentServiceType", "LNn/u;", "S", "(Lwh/e;)LNn/u;", "subTotalPriceInclTax", "subTotalPriceExclTax", "subTotalPriceTax", "Lkp/h;", "U", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lkp/h;", "Lvh/u$b;", "availablePickUpPoints", "LNn/o$b;", "x", "(Lvh/u$b;Ljava/util/List;Z)LNn/o$b;", "Lwh/h;", "LNn/P;", "F", "(Lwh/h;)LNn/P;", "", "data", "Lwh/i;", "s", "(Ljava/util/Map;)Ljava/util/List;", "Lwh/f;", "fulfillmentMethodType", "LNn/p;", "R", "(Lwh/f;)LNn/p;", "Lvh/f0$k;", "LNn/K$b$c;", "C", "(Lvh/f0$k;)LNn/K$b$c;", "Lvh/A0;", "LNn/M;", "E", "(Lvh/A0;Z)LNn/M;", "Lvh/E0;", "overrideInputValues", "Lcom/ingka/ikea/checkout/datalayer/model/ShippingBillingDynamicModel;", "H", "(Lvh/E0;Z)Lcom/ingka/ikea/checkout/datalayer/model/ShippingBillingDynamicModel;", "Lvh/F;", "Lcom/ingka/ikea/dynamicfields/datalayer/FieldAttributes;", "I", "(Lvh/F;)Lcom/ingka/ikea/dynamicfields/datalayer/FieldAttributes;", "LNn/J$b;", "Lwh/q;", "O", "(LNn/J$b;)Lwh/q;", "onlinecheckout-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f93881a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f93882b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f93883c;

        /* renamed from: d  reason: collision with root package name */
        public static final /* synthetic */ int[] f93884d;

        /* renamed from: e  reason: collision with root package name */
        public static final /* synthetic */ int[] f93885e;

        /* renamed from: f  reason: collision with root package name */
        public static final /* synthetic */ int[] f93886f;

        /* renamed from: g  reason: collision with root package name */
        public static final /* synthetic */ int[] f93887g;

        /* renamed from: h  reason: collision with root package name */
        public static final /* synthetic */ int[] f93888h;

        /* JADX WARNING: Can't wrap try/catch for region: R(83:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|25|26|27|28|29|30|(2:31|32)|33|35|36|37|38|39|40|(2:41|42)|43|45|46|47|48|49|50|51|52|53|54|(2:55|56)|57|59|60|61|62|63|64|65|66|67|69|70|71|72|73|74|(2:75|76)|77|79|80|81|82|83|84|85|86|87|88|89|90|(2:91|92)|93|95|96|97|98|(2:99|100)|101|103|104|(2:105|106)|107|109) */
        /* JADX WARNING: Can't wrap try/catch for region: R(85:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|25|26|27|28|29|30|(2:31|32)|33|35|36|37|38|39|40|(2:41|42)|43|45|46|47|48|49|50|51|52|53|54|(2:55|56)|57|59|60|61|62|63|64|65|66|67|69|70|71|72|73|74|(2:75|76)|77|79|80|81|82|83|84|85|86|87|88|89|90|(2:91|92)|93|95|96|97|98|99|100|101|103|104|(2:105|106)|107|109) */
        /* JADX WARNING: Can't wrap try/catch for region: R(86:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|25|26|27|28|29|30|(2:31|32)|33|35|36|37|38|39|40|(2:41|42)|43|45|46|47|48|49|50|51|52|53|54|(2:55|56)|57|59|60|61|62|63|64|65|66|67|69|70|71|72|73|74|(2:75|76)|77|79|80|81|82|83|84|85|86|87|88|89|90|(2:91|92)|93|95|96|97|98|99|100|101|103|104|(2:105|106)|107|109) */
        /* JADX WARNING: Can't wrap try/catch for region: R(87:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|(2:31|32)|33|35|36|37|38|39|40|(2:41|42)|43|45|46|47|48|49|50|51|52|53|54|(2:55|56)|57|59|60|61|62|63|64|65|66|67|69|70|71|72|73|74|(2:75|76)|77|79|80|81|82|83|84|85|86|87|88|89|90|(2:91|92)|93|95|96|97|98|99|100|101|103|104|(2:105|106)|107|109) */
        /* JADX WARNING: Can't wrap try/catch for region: R(88:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|35|36|37|38|39|40|(2:41|42)|43|45|46|47|48|49|50|51|52|53|54|(2:55|56)|57|59|60|61|62|63|64|65|66|67|69|70|71|72|73|74|(2:75|76)|77|79|80|81|82|83|84|85|86|87|88|89|90|(2:91|92)|93|95|96|97|98|99|100|101|103|104|(2:105|106)|107|109) */
        /* JADX WARNING: Can't wrap try/catch for region: R(89:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|35|36|37|38|39|40|(2:41|42)|43|45|46|47|48|49|50|51|52|53|54|(2:55|56)|57|59|60|61|62|63|64|65|66|67|69|70|71|72|73|74|(2:75|76)|77|79|80|81|82|83|84|85|86|87|88|89|90|(2:91|92)|93|95|96|97|98|99|100|101|103|104|(2:105|106)|107|109) */
        /* JADX WARNING: Can't wrap try/catch for region: R(91:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|35|36|37|38|39|40|(2:41|42)|43|45|46|47|48|49|50|51|52|53|54|(2:55|56)|57|59|60|61|62|63|64|65|66|67|69|70|71|72|73|74|(2:75|76)|77|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|95|96|97|98|99|100|101|103|104|(2:105|106)|107|109) */
        /* JADX WARNING: Can't wrap try/catch for region: R(92:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|35|36|37|38|39|40|(2:41|42)|43|45|46|47|48|49|50|51|52|53|54|(2:55|56)|57|59|60|61|62|63|64|65|66|67|69|70|71|72|73|74|75|76|77|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|95|96|97|98|99|100|101|103|104|(2:105|106)|107|109) */
        /* JADX WARNING: Can't wrap try/catch for region: R(93:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|35|36|37|38|39|40|(2:41|42)|43|45|46|47|48|49|50|51|52|53|54|(2:55|56)|57|59|60|61|62|63|64|65|66|67|69|70|71|72|73|74|75|76|77|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|95|96|97|98|99|100|101|103|104|105|106|107|109) */
        /* JADX WARNING: Can't wrap try/catch for region: R(94:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|35|36|37|38|39|40|(2:41|42)|43|45|46|47|48|49|50|51|52|53|54|(2:55|56)|57|59|60|61|62|63|64|65|66|67|69|70|71|72|73|74|75|76|77|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|95|96|97|98|99|100|101|103|104|105|106|107|109) */
        /* JADX WARNING: Can't wrap try/catch for region: R(95:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|35|36|37|38|39|40|41|42|43|45|46|47|48|49|50|51|52|53|54|(2:55|56)|57|59|60|61|62|63|64|65|66|67|69|70|71|72|73|74|75|76|77|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|95|96|97|98|99|100|101|103|104|105|106|107|109) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:105:0x018b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x005e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0077 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x007f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0087 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00a0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00b0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00b8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00d1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x00db */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x00e5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x0100 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x0108 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x0110 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x0129 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x0131 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x0139 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x0141 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x0149 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x0151 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:97:0x016a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:99:0x0172 */
        static {
            /*
                Nn.p[] r0 = Nn.C10813p.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                Nn.p r2 = Nn.C10813p.HOME     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                Nn.p r3 = Nn.C10813p.LOCKER     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                Nn.p r4 = Nn.C10813p.PICKUP     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r4 = 4
                Nn.p r5 = Nn.C10813p.PICKUP_STORE     // Catch:{ NoSuchFieldError -> 0x002b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                r5 = 5
                Nn.p r6 = Nn.C10813p.CLICK_AND_COLLECT_STORE     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r0[r6] = r5     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                r6 = 6
                Nn.p r7 = Nn.C10813p.CLICK_AND_COLLECT_NEAR_YOU     // Catch:{ NoSuchFieldError -> 0x003d }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r0[r7] = r6     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                f93881a = r0
                wh.m[] r0 = wh.m.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                wh.m r7 = wh.m.NO     // Catch:{ NoSuchFieldError -> 0x004e }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r0[r7] = r1     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                wh.m r7 = wh.m.YES     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r0[r7] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                wh.m r7 = wh.m.UNKNOWN__     // Catch:{ NoSuchFieldError -> 0x005e }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r0[r7] = r3     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                wh.m r7 = wh.m.UNCERTAIN     // Catch:{ NoSuchFieldError -> 0x0066 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0066 }
                r0[r7] = r4     // Catch:{ NoSuchFieldError -> 0x0066 }
            L_0x0066:
                f93882b = r0
                wh.d[] r0 = wh.C10373d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                wh.d r7 = wh.C10373d.UNKNOWN__     // Catch:{ NoSuchFieldError -> 0x0077 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0077 }
                r0[r7] = r1     // Catch:{ NoSuchFieldError -> 0x0077 }
            L_0x0077:
                wh.d r7 = wh.C10373d.PARTIAL     // Catch:{ NoSuchFieldError -> 0x007f }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x007f }
                r0[r7] = r2     // Catch:{ NoSuchFieldError -> 0x007f }
            L_0x007f:
                wh.d r7 = wh.C10373d.NONE     // Catch:{ NoSuchFieldError -> 0x0087 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0087 }
                r0[r7] = r3     // Catch:{ NoSuchFieldError -> 0x0087 }
            L_0x0087:
                wh.d r7 = wh.C10373d.FULL     // Catch:{ NoSuchFieldError -> 0x008f }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r0[r7] = r4     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                f93883c = r0
                wh.e[] r0 = wh.C10374e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                wh.e r7 = wh.C10374e.STANDARD     // Catch:{ NoSuchFieldError -> 0x00a0 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a0 }
                r0[r7] = r1     // Catch:{ NoSuchFieldError -> 0x00a0 }
            L_0x00a0:
                wh.e r7 = wh.C10374e.STANDARD_RD     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r0[r7] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                wh.e r7 = wh.C10374e.CURBSIDE     // Catch:{ NoSuchFieldError -> 0x00b0 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b0 }
                r0[r7] = r3     // Catch:{ NoSuchFieldError -> 0x00b0 }
            L_0x00b0:
                wh.e r7 = wh.C10374e.CURBSIDE_RD     // Catch:{ NoSuchFieldError -> 0x00b8 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b8 }
                r0[r7] = r4     // Catch:{ NoSuchFieldError -> 0x00b8 }
            L_0x00b8:
                wh.e r7 = wh.C10374e.EXPRESS     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r0[r7] = r5     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                wh.e r7 = wh.C10374e.EXPRESS_RD     // Catch:{ NoSuchFieldError -> 0x00c8 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c8 }
                r0[r7] = r6     // Catch:{ NoSuchFieldError -> 0x00c8 }
            L_0x00c8:
                r7 = 7
                wh.e r8 = wh.C10374e.EXPRESS_CURBSIDE     // Catch:{ NoSuchFieldError -> 0x00d1 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d1 }
                r0[r8] = r7     // Catch:{ NoSuchFieldError -> 0x00d1 }
            L_0x00d1:
                wh.e r8 = wh.C10374e.EXPRESS_CURBSIDE_RD     // Catch:{ NoSuchFieldError -> 0x00db }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x00db }
                r9 = 8
                r0[r8] = r9     // Catch:{ NoSuchFieldError -> 0x00db }
            L_0x00db:
                wh.e r8 = wh.C10374e.LOCKER     // Catch:{ NoSuchFieldError -> 0x00e5 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e5 }
                r9 = 9
                r0[r8] = r9     // Catch:{ NoSuchFieldError -> 0x00e5 }
            L_0x00e5:
                wh.e r8 = wh.C10374e.UNKNOWN__     // Catch:{ NoSuchFieldError -> 0x00ef }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ef }
                r9 = 10
                r0[r8] = r9     // Catch:{ NoSuchFieldError -> 0x00ef }
            L_0x00ef:
                f93884d = r0
                wh.h[] r0 = wh.C10377h.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                wh.h r8 = wh.C10377h.TRUCK     // Catch:{ NoSuchFieldError -> 0x0100 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0100 }
                r0[r8] = r1     // Catch:{ NoSuchFieldError -> 0x0100 }
            L_0x0100:
                wh.h r8 = wh.C10377h.PARCEL     // Catch:{ NoSuchFieldError -> 0x0108 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0108 }
                r0[r8] = r2     // Catch:{ NoSuchFieldError -> 0x0108 }
            L_0x0108:
                wh.h r8 = wh.C10377h.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0110 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0110 }
                r0[r8] = r3     // Catch:{ NoSuchFieldError -> 0x0110 }
            L_0x0110:
                wh.h r8 = wh.C10377h.UNKNOWN__     // Catch:{ NoSuchFieldError -> 0x0118 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0118 }
                r0[r8] = r4     // Catch:{ NoSuchFieldError -> 0x0118 }
            L_0x0118:
                f93885e = r0
                wh.f[] r0 = wh.C10375f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                wh.f r8 = wh.C10375f.HOME_DELIVERY     // Catch:{ NoSuchFieldError -> 0x0129 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0129 }
                r0[r8] = r1     // Catch:{ NoSuchFieldError -> 0x0129 }
            L_0x0129:
                wh.f r8 = wh.C10375f.PUP     // Catch:{ NoSuchFieldError -> 0x0131 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0131 }
                r0[r8] = r2     // Catch:{ NoSuchFieldError -> 0x0131 }
            L_0x0131:
                wh.f r8 = wh.C10375f.CLICK_COLLECT_STORE     // Catch:{ NoSuchFieldError -> 0x0139 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0139 }
                r0[r8] = r3     // Catch:{ NoSuchFieldError -> 0x0139 }
            L_0x0139:
                wh.f r8 = wh.C10375f.CLICK_COLLECT     // Catch:{ NoSuchFieldError -> 0x0141 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0141 }
                r0[r8] = r4     // Catch:{ NoSuchFieldError -> 0x0141 }
            L_0x0141:
                wh.f r4 = wh.C10375f.PUOP     // Catch:{ NoSuchFieldError -> 0x0149 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0149 }
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0149 }
            L_0x0149:
                wh.f r4 = wh.C10375f.LOCKER     // Catch:{ NoSuchFieldError -> 0x0151 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0151 }
                r0[r4] = r6     // Catch:{ NoSuchFieldError -> 0x0151 }
            L_0x0151:
                wh.f r4 = wh.C10375f.UNKNOWN__     // Catch:{ NoSuchFieldError -> 0x0159 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0159 }
                r0[r4] = r7     // Catch:{ NoSuchFieldError -> 0x0159 }
            L_0x0159:
                f93886f = r0
                wh.a[] r0 = wh.C10370a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                wh.a r4 = wh.C10370a.AUTH_TO_LEAVE     // Catch:{ NoSuchFieldError -> 0x016a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x016a }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x016a }
            L_0x016a:
                wh.a r4 = wh.C10370a.WHEELCHAIR     // Catch:{ NoSuchFieldError -> 0x0172 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0172 }
                r0[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0172 }
            L_0x0172:
                wh.a r4 = wh.C10370a.UNKNOWN__     // Catch:{ NoSuchFieldError -> 0x017a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x017a }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x017a }
            L_0x017a:
                f93887g = r0
                Nn.J$b[] r0 = Nn.J.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Nn.J$b r3 = Nn.J.b.HOME     // Catch:{ NoSuchFieldError -> 0x018b }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x018b }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x018b }
            L_0x018b:
                Nn.J$b r1 = Nn.J.b.COLLECT     // Catch:{ NoSuchFieldError -> 0x0193 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0193 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0193 }
            L_0x0193:
                f93888h = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.d.a.<clinit>():void");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        public final int compare(T t10, T t11) {
            double d10;
            Double b10;
            Double b11;
            C10812o oVar = (C10812o) t10;
            C10811n g10 = oVar.g();
            double d11 = Double.MAX_VALUE;
            Double d12 = null;
            if (g10 == null || (b11 = g10.b()) == null) {
                C10811n g11 = oVar.g();
                Double a10 = g11 != null ? g11.a() : null;
                d10 = a10 != null ? a10.doubleValue() : Double.MAX_VALUE;
            } else {
                d10 = b11.doubleValue();
            }
            Double valueOf = Double.valueOf(d10);
            C10812o oVar2 = (C10812o) t11;
            C10811n g12 = oVar2.g();
            if (g12 == null || (b10 = g12.b()) == null) {
                C10811n g13 = oVar2.g();
                if (g13 != null) {
                    d12 = g13.a();
                }
                if (d12 != null) {
                    d11 = d12.doubleValue();
                }
            } else {
                d11 = b10.doubleValue();
            }
            return C17035a.e(valueOf, Double.valueOf(d11));
        }
    }

    private static final G A(C10325f0.j jVar) {
        Double d10 = jVar.d();
        Double e10 = jVar.e();
        LocationLatLng locationLatLng = (d10 == null || e10 == null) ? null : new LocationLatLng(d10.doubleValue(), e10.doubleValue());
        String f10 = jVar.f();
        C10799b bVar = new C10799b(J(jVar.a().a()), jVar.a().a().c(), jVar.a().a().b(), locationLatLng);
        List<z> L10 = L(jVar.h().a());
        String g10 = jVar.g();
        return new G(jVar.c(), f10, (C10811n) null, bVar, L10, g10, Double.valueOf(jVar.b()), (M) null, G.b.YES);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final Nn.K.b.C1695b B(vh.C10325f0.h r4) {
        /*
            vh.f0$d r0 = r4.c()
            if (r0 == 0) goto L_0x0011
            vh.p r0 = r0.a()
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = K(r0)
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            java.lang.String r1 = r4.b()
            java.lang.String r2 = r4.d()
            boolean r4 = r4.a()
            Nn.K$b$b r3 = new Nn.K$b$b
            r3.<init>(r0, r2, r1, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.d.B(vh.f0$h):Nn.K$b$b");
    }

    private static final K.b.c C(C10325f0.k kVar) {
        ArrayList arrayList;
        C10811n nVar;
        N n10;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Zo.b.f90092a.d());
        Double d10 = null;
        try {
            Date parse = simpleDateFormat.parse(kVar.b());
            Date parse2 = simpleDateFormat.parse(kVar.f());
            List<C10325f0.b> a10 = kVar.a();
            if (a10 != null) {
                ArrayList arrayList2 = new ArrayList();
                for (C10325f0.b a11 : a10) {
                    int i10 = a.f93887g[a11.a().ordinal()];
                    if (i10 == 1) {
                        n10 = N.AUTHORITY_TO_LEAVE;
                    } else if (i10 == 2) {
                        n10 = N.WHEELCHAIR;
                    } else if (i10 == 3) {
                        n10 = null;
                    } else {
                        throw new t();
                    }
                    if (n10 != null) {
                        arrayList2.add(n10);
                    }
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            C10325f0.i d11 = kVar.d();
            if ((d11 != null ? d11.b() : null) == null) {
                C10325f0.i d12 = kVar.d();
                if ((d12 != null ? d12.a() : null) == null) {
                    nVar = null;
                    C17542s.g(parse);
                    C17542s.g(parse2);
                    return new K.b.c(parse, parse2, kVar.c(), nVar, arrayList);
                }
            }
            C10325f0.i d13 = kVar.d();
            Double b10 = d13 != null ? d13.b() : null;
            C10325f0.i d14 = kVar.d();
            if (d14 != null) {
                d10 = d14.a();
            }
            nVar = new C10811n(b10, d10);
            C17542s.g(parse);
            C17542s.g(parse2);
            return new K.b.c(parse, parse2, kVar.c(), nVar, arrayList);
        } catch (ParseException e10) {
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList3 = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList3.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList3) {
                if (str == null) {
                    String a12 = C11818a.a("Invalid date", e10);
                    if (a12 == null) {
                        break;
                    }
                    str = C11820c.a(a12);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = kVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, e10, str3);
                str = str3;
                str2 = str4;
            }
            throw e10;
        }
    }

    /* access modifiers changed from: private */
    public static final K D(C10325f0 f0Var, List<C10814q> list) {
        C10811n w10;
        C10813p R10;
        Object obj;
        C10325f0.f fVar;
        Object obj2;
        u S10 = S(f0Var.d());
        List<C10325f0.f> list2 = null;
        if (S10 == null || (w10 = w(f0Var.e().a())) == null || (R10 = R(f0Var.b())) == null) {
            return null;
        }
        String c10 = f0Var.c();
        Iterable<C10325f0.c> a10 = f0Var.a();
        ArrayList arrayList = new ArrayList(C16877v.y(a10, 10));
        for (C10325f0.c cVar : a10) {
            Iterator it = f0Var.f().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = list2;
                    break;
                }
                obj = it.next();
                if (C17542s.e(((C10325f0.m) obj).a(), cVar.b())) {
                    break;
                }
            }
            C10325f0.m mVar = (C10325f0.m) obj;
            List<C10325f0.f> b10 = mVar != null ? mVar.b() : list2;
            String b11 = cVar.b();
            Iterable<C10325f0.e> a11 = cVar.a();
            ArrayList arrayList2 = new ArrayList(C16877v.y(a11, 10));
            for (C10325f0.e eVar : a11) {
                String b12 = eVar.b();
                if (b12 == null) {
                    b12 = eVar.a();
                }
                if (b10 != null) {
                    Iterator it2 = b10.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it2.next();
                        if (C17542s.e(((C10325f0.f) obj2).a(), b12)) {
                            break;
                        }
                    }
                    fVar = (C10325f0.f) obj2;
                } else {
                    fVar = null;
                }
                arrayList2.add(new C10810m(b12, fVar != null ? Integer.valueOf(fVar.b()) : null, fVar != null ? Integer.valueOf(fVar.c()) : null));
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList3 = new ArrayList();
            for (Object next : arrayList2) {
                if (hashSet.add(((C10810m) next).b())) {
                    arrayList3.add(next);
                }
            }
            boolean d10 = cVar.d();
            K.b.c C10 = C(cVar.f());
            P F10 = F(cVar.h());
            C10325f0.j e10 = cVar.e();
            arrayList.add(new K.b(b11, arrayList3, d10, C10, F10, e10 != null ? A(e10) : null, B(cVar.c())));
            list2 = null;
        }
        return new K(S10, R10, c10, w10, arrayList, list);
    }

    /* access modifiers changed from: private */
    public static final M E(A0 a02, boolean z10) {
        String str;
        char c10;
        boolean z11;
        C10811n nVar;
        Iterator it;
        String str2;
        String str3;
        C10800c cVar;
        Iterator it2;
        String str4;
        String str5;
        String str6 = DslKt.INDICATOR_BACKGROUND;
        String str7 = DslKt.INDICATOR_MAIN;
        int i10 = 1;
        int i11 = 2;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Zo.b.f90092a.d());
            Date b10 = Rn.b.b(a02.b(), simpleDateFormat);
            Date b11 = Rn.b.b(a02.f(), simpleDateFormat);
            if (b10 == null || b11 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it3 = a02.a().iterator();
            while (it3.hasNext()) {
                int i12 = a.f93887g[((A0.a) it3.next()).a().ordinal()];
                if (i12 != i10) {
                    Class<A0> cls = A0.class;
                    if (i12 == i11) {
                        it = it3;
                        str3 = str6;
                        str2 = str7;
                        IllegalStateException illegalStateException = new IllegalStateException("Received an wheelchair capability type. Should not be possible");
                        e eVar = e.ERROR;
                        ArrayList<C11819b> arrayList2 = new ArrayList<>();
                        for (Object next : qv.d.f102012a.a()) {
                            if (((C11819b) next).b(eVar, false)) {
                                arrayList2.add(next);
                            }
                        }
                        String str8 = null;
                        String str9 = null;
                        for (C11819b bVar : arrayList2) {
                            if (str8 == null) {
                                String a10 = C11818a.a((String) null, illegalStateException);
                                if (a10 == null) {
                                    break;
                                }
                                str8 = C11820c.a(a10);
                            }
                            if (str9 == null) {
                                String name = cls.getName();
                                C17542s.g(name);
                                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                                if (o12.length() != 0) {
                                    name = C15854t.P0(o12, "Kt");
                                }
                                str9 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str2 : str3) + DslKt.INDICATOR_SEPARATOR + name;
                            }
                            bVar.a(eVar, str9, false, illegalStateException, str8);
                        }
                    } else if (i12 == 3) {
                        IllegalStateException illegalStateException2 = new IllegalStateException("Received an unknown capability type");
                        e eVar2 = e.ERROR;
                        ArrayList<C11819b> arrayList3 = new ArrayList<>();
                        for (Object next2 : qv.d.f102012a.a()) {
                            if (((C11819b) next2).b(eVar2, false)) {
                                arrayList3.add(next2);
                            }
                        }
                        String str10 = null;
                        String str11 = null;
                        for (C11819b bVar2 : arrayList3) {
                            if (str10 == null) {
                                String a11 = C11818a.a((String) null, illegalStateException2);
                                if (a11 == null) {
                                    break;
                                }
                                str10 = C11820c.a(a11);
                            }
                            if (str11 == null) {
                                String name2 = cls.getName();
                                C17542s.g(name2);
                                it2 = it3;
                                str5 = str6;
                                str4 = str7;
                                String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                                if (o13.length() != 0) {
                                    name2 = C15854t.P0(o13, "Kt");
                                }
                                str11 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str4 : str5) + DslKt.INDICATOR_SEPARATOR + name2;
                            } else {
                                it2 = it3;
                                str5 = str6;
                                str4 = str7;
                            }
                            bVar2.a(eVar2, str11, false, illegalStateException2, str10);
                            str6 = str5;
                            str7 = str4;
                            it3 = it2;
                        }
                        it = it3;
                        str3 = str6;
                        str2 = str7;
                    } else {
                        throw new t();
                    }
                    cVar = null;
                } else {
                    it = it3;
                    str3 = str6;
                    str2 = str7;
                    cVar = new C10800c(N.AUTHORITY_TO_LEAVE, false);
                }
                if (cVar != null) {
                    arrayList.add(cVar);
                }
                str6 = str3;
                str7 = str2;
                it3 = it;
                i10 = 1;
                i11 = 2;
            }
            List c11 = C16877v.c();
            c11.addAll(arrayList);
            if (z10) {
                c11.add(new C10800c(N.WHEELCHAIR, false));
            }
            List a12 = C16877v.a(c11);
            A0.b e10 = a02.e();
            if ((e10 != null ? e10.b() : null) == null) {
                A0.b e11 = a02.e();
                if ((e11 != null ? e11.a() : null) == null) {
                    nVar = null;
                    return new M(b10, b11, a02.d(), a12, nVar, a02.c());
                }
            }
            A0.b e12 = a02.e();
            Double b12 = e12 != null ? e12.b() : null;
            A0.b e13 = a02.e();
            nVar = new C10811n(b12, e13 != null ? e13.a() : null);
            return new M(b10, b11, a02.d(), a12, nVar, a02.c());
        } catch (ParseException e14) {
            String str12 = str6;
            String str13 = str7;
            e eVar3 = e.ERROR;
            ArrayList<C11819b> arrayList4 = new ArrayList<>();
            for (Object next3 : qv.d.f102012a.a()) {
                if (((C11819b) next3).b(eVar3, false)) {
                    arrayList4.add(next3);
                }
            }
            String str14 = null;
            String str15 = null;
            for (C11819b bVar3 : arrayList4) {
                if (str14 == null) {
                    String a13 = C11818a.a("Invalid date", e14);
                    if (a13 == null) {
                        return null;
                    }
                    str14 = C11820c.a(a13);
                }
                String str16 = str14;
                if (str15 == null) {
                    String name3 = a02.getClass().getName();
                    C17542s.g(name3);
                    c10 = '.';
                    String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o14.length() != 0) {
                        name3 = C15854t.P0(o14, "Kt");
                    }
                    z11 = true;
                    str = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str13 : str12) + DslKt.INDICATOR_SEPARATOR + name3;
                } else {
                    z11 = true;
                    c10 = '.';
                    str = str15;
                }
                boolean z12 = z11;
                char c12 = c10;
                bVar3.a(eVar3, str, false, e14, str16);
                str14 = str16;
                str15 = str;
            }
            return null;
        }
    }

    private static final P F(C10377h hVar) {
        int i10 = a.f93885e[hVar.ordinal()];
        if (i10 == 1) {
            return P.TRUCK;
        }
        if (i10 == 2) {
            return P.PARCEL;
        }
        if (i10 == 3) {
            return P.PARCEL;
        }
        if (i10 == 4) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unknown type: " + hVar);
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = C10377h.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, illegalArgumentException, str3);
                str = str3;
                str2 = str4;
            }
            return P.PARCEL;
        }
        throw new t();
    }

    /* access modifiers changed from: private */
    public static final a G(C10318c cVar, List<C10801d.a> list) {
        PriceResponse.PriceExclSavings priceExclSavings;
        X a10;
        Object obj;
        C10801d.a.b a11;
        Iterable b10 = cVar.b();
        ArrayList arrayList = new ArrayList(C16877v.y(b10, 10));
        Iterator it = b10.iterator();
        while (true) {
            priceExclSavings = null;
            if (!it.hasNext()) {
                break;
            }
            C10318c.a aVar = (C10318c.a) it.next();
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (C17542s.e(((C10801d.a) obj).b(), aVar.a())) {
                    break;
                }
            }
            C10801d.a aVar2 = (C10801d.a) obj;
            int c10 = aVar2 != null ? aVar2.c() : aVar.b();
            String a12 = aVar.a();
            int b11 = aVar.b();
            Double a13 = aVar.c().a();
            arrayList.add(new C10804g(a12, b11, a13 != null ? a13.doubleValue() : 0.0d, aVar.c().b(), aVar.d(), c10, (aVar2 == null || (a11 = aVar2.a()) == null) ? null : new C10804g.b(a11.d(), a11.c(), a11.b(), a11.a(), aVar2.d())));
        }
        C10315a0 b12 = cVar.d().b();
        List<N.a> a14 = cVar.d().a().a();
        X.a a15 = cVar.g().a().a();
        C10318c.d f10 = cVar.f();
        X.a a16 = (f10 == null || (a10 = f10.a()) == null) ? null : a10.a();
        Double c11 = b12.c();
        Double b13 = b12.b();
        Double d10 = b12.d();
        List<C10315a0.c> f11 = b12.f();
        List<PriceResponse.CheckoutTaxSummary> t10 = f11 != null ? t(f11) : null;
        List<PriceResponse.OrderDiscountSummary> M10 = a14 != null ? M(a14) : null;
        C10315a0.a a17 = b12.a();
        PriceResponse.DiscountSummaryResponse u10 = a17 != null ? u(a17) : null;
        PriceResponse.PriceExclSavings N10 = a15 != null ? N(a15) : null;
        if (a16 != null) {
            priceExclSavings = N(a16);
        }
        return new a(cVar.a(), cVar.e().a(), P(c11, b13, d10, t10, u10, M10, N10, priceExclSavings), arrayList);
    }

    /* access modifiers changed from: private */
    public static final ShippingBillingDynamicModel H(E0 e02, boolean z10) {
        Iterable<E0.b> b10 = e02.b();
        ArrayList arrayList = new ArrayList(C16877v.y(b10, 10));
        for (E0.b a10 : b10) {
            arrayList.add(I(a10.a()));
        }
        DynamicFields$Configuration dynamicFields$Configuration = new DynamicFields$Configuration(arrayList, YH.X.j());
        Iterable<E0.c> c10 = e02.c();
        ArrayList arrayList2 = new ArrayList(C16877v.y(c10, 10));
        for (E0.c a11 : c10) {
            arrayList2.add(I(a11.a()));
        }
        DynamicFields$Configuration dynamicFields$Configuration2 = new DynamicFields$Configuration(arrayList2, YH.X.j());
        Iterable<E0.a> a12 = e02.a();
        ArrayList arrayList3 = new ArrayList(C16877v.y(a12, 10));
        for (E0.a a13 : a12) {
            arrayList3.add(I(a13.a()));
        }
        DynamicFields$Configuration dynamicFields$Configuration3 = new DynamicFields$Configuration(arrayList3, YH.X.j());
        Iterable<E0.d> d10 = e02.d();
        ArrayList arrayList4 = new ArrayList(C16877v.y(d10, 10));
        for (E0.d a14 : d10) {
            arrayList4.add(I(a14.a()));
        }
        return new ShippingBillingDynamicModel(dynamicFields$Configuration, dynamicFields$Configuration2, dynamicFields$Configuration3, new DynamicFields$Configuration(arrayList4, YH.X.j()), z10);
    }

    private static final FieldAttributes I(F f10) {
        String g10 = f10.g();
        String i10 = f10.i();
        String l10 = f10.l();
        String j10 = f10.j();
        String k10 = f10.k();
        String f11 = f10.f();
        String d10 = f10.d();
        boolean h10 = f10.h();
        String c10 = f10.c();
        com.ingka.ikea.dynamicfields.datalayer.b bVar = com.ingka.ikea.dynamicfields.datalayer.b.n().get(f10.e());
        c cVar = c.n().get(f10.m());
        com.ingka.ikea.dynamicfields.datalayer.a valueOf = com.ingka.ikea.dynamicfields.datalayer.a.valueOf(f10.a());
        Iterable b10 = f10.b();
        ArrayList arrayList = new ArrayList(C16877v.y(b10, 10));
        Iterator it = b10.iterator();
        while (it.hasNext()) {
            F.b bVar2 = (F.b) it.next();
            arrayList.add(new KeyValue(bVar2.b(), bVar2.c(), bVar2.a()));
            it = it;
            valueOf = valueOf;
        }
        com.ingka.ikea.dynamicfields.datalayer.a aVar = valueOf;
        Iterable n10 = f10.n();
        ArrayList arrayList2 = new ArrayList(C16877v.y(n10, 10));
        Iterator it2 = n10.iterator();
        while (it2.hasNext()) {
            F.c cVar2 = (F.c) it2.next();
            arrayList2.add(new KeyValue(cVar2.b(), cVar2.c(), cVar2.a()));
            it2 = it2;
            arrayList = arrayList;
        }
        ArrayList arrayList3 = arrayList;
        Iterable o10 = f10.o();
        int i11 = 10;
        ArrayList arrayList4 = new ArrayList(C16877v.y(o10, 10));
        Iterator it3 = o10.iterator();
        while (it3.hasNext()) {
            Iterable b11 = ((F.d) it3.next()).b();
            Iterator it4 = it3;
            ArrayList arrayList5 = arrayList2;
            ArrayList arrayList6 = new ArrayList(C16877v.y(b11, i11));
            for (Iterator it5 = b11.iterator(); it5.hasNext(); it5 = it5) {
                F.a aVar2 = (F.a) it5.next();
                arrayList6.add(new KeyRegex(aVar2.a(), aVar2.b()));
            }
            arrayList4.add(new Conditions(arrayList6));
            it3 = it4;
            arrayList2 = arrayList5;
            i11 = 10;
        }
        ArrayList arrayList7 = arrayList2;
        return new FieldAttributes(g10, i10, l10, j10, k10, f11, d10, h10, c10, bVar, cVar, aVar, arrayList3, arrayList2, arrayList4);
    }

    private static final String J(C10314a aVar) {
        return C15854t.z1(new C15850p("\\s+").j(C16877v.G0(aVar.a(), " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null), " ")).toString();
    }

    private static final String K(C10339p pVar) {
        C10339p.a a10;
        C10339p.c b10;
        C10339p.a a11;
        C10339p.b a12;
        C10339p.a a13;
        C10339p.c b11;
        C10339p.a a14;
        C10339p.b a15;
        String str = null;
        String b12 = pVar != null ? pVar.b() : null;
        String a16 = (pVar == null || (a14 = pVar.a()) == null || (a15 = a14.a()) == null) ? null : a15.a();
        String a17 = (pVar == null || (a13 = pVar.a()) == null || (b11 = a13.b()) == null) ? null : b11.a();
        String b13 = (pVar == null || (a11 = pVar.a()) == null || (a12 = a11.a()) == null) ? null : a12.b();
        if (!(pVar == null || (a10 = pVar.a()) == null || (b10 = a10.b()) == null)) {
            str = b10.b();
        }
        return Rn.b.a(b12, a16, a17, b13, str);
    }

    private static final List<z> L(L l10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new z(Oo.b.f84469P1, l10.b()));
        arrayList.add(new z(Oo.b.f84549X1, l10.f()));
        arrayList.add(new z(Oo.b.f84569Z1, l10.g()));
        arrayList.add(new z(Oo.b.f84529V1, l10.e()));
        arrayList.add(new z(Oo.b.f84449N1, l10.a()));
        arrayList.add(new z(Oo.b.f84489R1, l10.c()));
        arrayList.add(new z(Oo.b.f84509T1, l10.d()));
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static final List<PriceResponse.OrderDiscountSummary> M(List<N.a> list) {
        Iterable<N.a> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (N.a aVar : iterable) {
            arrayList.add(new PriceResponse.OrderDiscountSummary(aVar.a(), aVar.b()));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static final PriceResponse.PriceExclSavings N(X.a aVar) {
        return new PriceResponse.PriceExclSavings(aVar.b(), aVar.a(), aVar.c());
    }

    /* access modifiers changed from: private */
    public static final q O(J.b bVar) {
        int i10 = a.f93888h[bVar.ordinal()];
        if (i10 == 1) {
            return q.HOME_DELIVERY;
        }
        if (i10 == 2) {
            return q.COLLECT;
        }
        throw new t();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r3 = r22.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final Nn.C10806i P(java.lang.Double r18, java.lang.Double r19, java.lang.Double r20, java.util.List<com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PriceResponse.CheckoutTaxSummary> r21, com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PriceResponse.DiscountSummaryResponse r22, java.util.List<com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PriceResponse.OrderDiscountSummary> r23, com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PriceResponse.PriceExclSavings r24, com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PriceResponse.PriceExclSavings r25) {
        /*
            r0 = 0
            r2 = 0
            if (r22 == 0) goto L_0x0015
            java.lang.Double r3 = r22.a()
            if (r3 == 0) goto L_0x0015
            double r4 = r3.doubleValue()
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x0015
            r15 = r3
            goto L_0x0016
        L_0x0015:
            r15 = r2
        L_0x0016:
            if (r22 == 0) goto L_0x0022
            java.lang.Double r3 = r22.c()
            if (r3 == 0) goto L_0x0022
            double r0 = r3.doubleValue()
        L_0x0022:
            r13 = r0
            if (r23 == 0) goto L_0x0059
            r0 = r23
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0032:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x005a
            java.lang.Object r3 = r0.next()
            com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PriceResponse$OrderDiscountSummary r3 = (com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PriceResponse.OrderDiscountSummary) r3
            java.lang.Double r4 = r3.a()
            if (r4 == 0) goto L_0x0052
            double r4 = r4.doubleValue()
            java.lang.String r3 = r3.b()
            kp.e r6 = new kp.e
            r6.<init>(r4, r2, r3)
            goto L_0x0053
        L_0x0052:
            r6 = r2
        L_0x0053:
            if (r6 == 0) goto L_0x0032
            r1.add(r6)
            goto L_0x0032
        L_0x0059:
            r1 = r2
        L_0x005a:
            if (r21 == 0) goto L_0x0095
            r0 = r21
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0069:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0093
            java.lang.Object r4 = r0.next()
            com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PriceResponse$CheckoutTaxSummary r4 = (com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PriceResponse.CheckoutTaxSummary) r4
            java.lang.String r5 = r4.a()
            java.lang.Double r4 = r4.b()
            if (r5 == 0) goto L_0x008c
            if (r4 != 0) goto L_0x0082
            goto L_0x008c
        L_0x0082:
            kp.k r6 = new kp.k
            double r7 = r4.doubleValue()
            r6.<init>(r7, r5)
            goto L_0x008d
        L_0x008c:
            r6 = r2
        L_0x008d:
            if (r6 == 0) goto L_0x0069
            r3.add(r6)
            goto L_0x0069
        L_0x0093:
            r9 = r3
            goto L_0x0096
        L_0x0095:
            r9 = r2
        L_0x0096:
            if (r24 == 0) goto L_0x009e
            java.lang.Double r0 = r24.b()
            r6 = r0
            goto L_0x009f
        L_0x009e:
            r6 = r2
        L_0x009f:
            if (r24 == 0) goto L_0x00a7
            java.lang.Double r0 = r24.a()
            r7 = r0
            goto L_0x00a8
        L_0x00a7:
            r7 = r2
        L_0x00a8:
            if (r24 == 0) goto L_0x00b0
            java.lang.Double r0 = r24.c()
            r8 = r0
            goto L_0x00b1
        L_0x00b0:
            r8 = r2
        L_0x00b1:
            r3 = r18
            r4 = r19
            r5 = r20
            kp.h r6 = U(r3, r4, r5, r6, r7, r8)
            if (r25 == 0) goto L_0x00c3
            java.lang.Double r0 = r25.b()
            r7 = r0
            goto L_0x00c4
        L_0x00c3:
            r7 = r2
        L_0x00c4:
            if (r25 == 0) goto L_0x00cc
            java.lang.Double r0 = r25.a()
            r8 = r0
            goto L_0x00cd
        L_0x00cc:
            r8 = r2
        L_0x00cd:
            java.util.List r10 = YH.C16877v.n()
            if (r22 == 0) goto L_0x00d7
            java.lang.Double r2 = r22.b()
        L_0x00d7:
            r16 = r2
            if (r1 != 0) goto L_0x00e2
            java.util.List r0 = YH.C16877v.n()
            r17 = r0
            goto L_0x00e4
        L_0x00e2:
            r17 = r1
        L_0x00e4:
            Nn.i r0 = new Nn.i
            r5 = r0
            r11 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11, r13, r15, r16, r17)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.d.P(java.lang.Double, java.lang.Double, java.lang.Double, java.util.List, com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PriceResponse$DiscountSummaryResponse, java.util.List, com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PriceResponse$PriceExclSavings, com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PriceResponse$PriceExclSavings):Nn.i");
    }

    /* access modifiers changed from: private */
    public static final List<C10808k> Q(List<? extends C10812o> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (C10812o oVar : list) {
            switch (a.f93881a[oVar.i().ordinal()]) {
                case 1:
                    IllegalStateException illegalStateException = new IllegalStateException("Unexpected Home delivery");
                    e eVar = e.ERROR;
                    ArrayList<C11819b> arrayList5 = new ArrayList<>();
                    for (Object next : qv.d.f102012a.a()) {
                        if (((C11819b) next).b(eVar, false)) {
                            arrayList5.add(next);
                        }
                    }
                    String str = null;
                    String str2 = null;
                    for (C11819b bVar : arrayList5) {
                        if (str == null) {
                            String a10 = C11818a.a((String) null, illegalStateException);
                            if (a10 == null) {
                                break;
                            } else {
                                str = C11820c.a(a10);
                            }
                        }
                        String str3 = str;
                        if (str2 == null) {
                            str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "getCollectDeliveriesGrouped";
                        }
                        String str4 = str2;
                        bVar.a(eVar, str4, false, illegalStateException, str3);
                        str = str3;
                        str2 = str4;
                    }
                    break;
                case 2:
                    arrayList.add(oVar);
                    break;
                case 3:
                    arrayList3.add(oVar);
                    break;
                case 4:
                case 5:
                    arrayList2.add(oVar);
                    break;
                case 6:
                    arrayList4.add(oVar);
                    break;
                default:
                    throw new t();
            }
        }
        List c10 = C16877v.c();
        if (!arrayList2.isEmpty()) {
            c10.add(new C10808k.d(arrayList2));
        }
        if (!arrayList4.isEmpty()) {
            c10.add(new C10808k.a(arrayList4));
        }
        if (!arrayList3.isEmpty()) {
            c10.add(new C10808k.c(arrayList3));
        }
        if (!arrayList.isEmpty()) {
            c10.add(new C10808k.b(arrayList));
        }
        return C16877v.a(c10);
    }

    private static final C10813p R(C10375f fVar) {
        switch (a.f93886f[fVar.ordinal()]) {
            case 1:
                return C10813p.HOME;
            case 2:
                return C10813p.PICKUP;
            case 3:
                return C10813p.CLICK_AND_COLLECT_STORE;
            case 4:
                return C10813p.CLICK_AND_COLLECT_NEAR_YOU;
            case 5:
                return C10813p.PICKUP_STORE;
            case 6:
                return C10813p.LOCKER;
            case 7:
                IllegalStateException illegalStateException = new IllegalStateException("Fulfillment method type not supported " + fVar);
                e eVar = e.ERROR;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList) {
                    if (str == null) {
                        String a10 = C11818a.a((String) null, illegalStateException);
                        if (a10 == null) {
                            return null;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "getDeliveryServiceType";
                    }
                    String str4 = str2;
                    bVar.a(eVar, str4, false, illegalStateException, str3);
                    str = str3;
                    str2 = str4;
                }
                return null;
            default:
                throw new t();
        }
    }

    private static final u S(C10374e eVar) {
        switch (a.f93884d[eVar.ordinal()]) {
            case 1:
                return u.STANDARD;
            case 2:
                return u.STANDARD_RANGE_OF_DAYS;
            case 3:
                return u.CURBSIDE;
            case 4:
                return u.CURBSIDE_RANGE_OF_DAYS;
            case 5:
                return u.EXPRESS;
            case 6:
                return u.EXPRESS_RANGE_OF_DAYS;
            case 7:
                return u.EXPRESS_CURBSIDE;
            case 8:
                return u.EXPRESS_CURBSIDE_RANGE_OF_DAYS;
            case 9:
                return u.LOCKER;
            case 10:
                IllegalStateException illegalStateException = new IllegalStateException("Fulfillment service type not supported " + eVar);
                e eVar2 = e.ERROR;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar2, false)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList) {
                    if (str == null) {
                        String a10 = C11818a.a((String) null, illegalStateException);
                        if (a10 == null) {
                            return null;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "getFulfillmentServiceType";
                    }
                    String str4 = str2;
                    bVar.a(eVar2, str4, false, illegalStateException, str3);
                    str = str3;
                    str2 = str4;
                }
                return null;
            default:
                throw new t();
        }
    }

    private static final List<G> T(C10343u uVar) {
        C10343u.b bVar;
        C10343u.a a10;
        List<C10343u.f> b10;
        List<C10343u.b> a11 = uVar.a();
        ArrayList arrayList = null;
        if (!(a11 == null || (bVar = (C10343u.b) C16877v.w0(a11)) == null || (a10 = bVar.a()) == null || (b10 = a10.b()) == null)) {
            Iterable<C10343u.f> iterable = b10;
            arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (C10343u.f a12 : iterable) {
                arrayList.add(z(a12.a(), uVar.c(), uVar.l()));
            }
        }
        return arrayList;
    }

    private static final h U(Double d10, Double d11, Double d12, Double d13, Double d14, Double d15) {
        double d16 = 0.0d;
        double doubleValue = d11 != null ? d11.doubleValue() : 0.0d;
        double doubleValue2 = d10 != null ? d10.doubleValue() : doubleValue;
        double doubleValue3 = d12 != null ? d12.doubleValue() : 0.0d;
        double doubleValue4 = d14 != null ? d14.doubleValue() : 0.0d;
        double doubleValue5 = d13 != null ? d13.doubleValue() : doubleValue4;
        if (d15 != null) {
            d16 = d15.doubleValue();
        }
        return new h(doubleValue2, doubleValue, doubleValue3, doubleValue5, doubleValue4, d16);
    }

    private static final C10802e.a V(Map<?, ?> map, String str) {
        String str2;
        boolean z10;
        String str3;
        C10802e.a.C1699a aVar;
        Object obj;
        String obj2;
        Object obj3;
        Object obj4 = map.get(b.a.C2088a.C2090b.ALLOWED_STATES.b());
        String str4 = null;
        List list = obj4 instanceof List ? (List) obj4 : null;
        if (list == null) {
            list = C16877v.n();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            str2 = "";
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Map map2 = next instanceof Map ? (Map) next : null;
            if (map2 == null || (obj3 = map2.get(b.a.C2088a.C2089a.STATE_NAME.b())) == null || (str3 = obj3.toString()) == null) {
                str3 = str2;
            }
            if (!(map2 == null || (obj = map2.get(b.a.C2088a.C2089a.STATE_CODE.b())) == null || (obj2 = obj.toString()) == null)) {
                str2 = obj2;
            }
            if (!C15854t.v0(str2)) {
                aVar = new C10802e.a.C1699a(str3, str2);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("Missing state code. entry: " + next);
                e eVar = e.ERROR;
                ArrayList<C11819b> arrayList2 = new ArrayList<>();
                for (Object next2 : qv.d.f102012a.a()) {
                    if (((C11819b) next2).b(eVar, false)) {
                        arrayList2.add(next2);
                    }
                }
                String str5 = null;
                String str6 = null;
                for (C11819b bVar : arrayList2) {
                    if (str5 == null) {
                        String a10 = C11818a.a((String) null, illegalStateException);
                        if (a10 == null) {
                            break;
                        }
                        str5 = C11820c.a(a10);
                    }
                    if (str6 == null) {
                        str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "parseAmbiguousDeliveryAreaError";
                    }
                    bVar.a(eVar, str6, false, illegalStateException, str5);
                }
                aVar = null;
            }
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        if (arrayList.isEmpty()) {
            IllegalStateException illegalStateException2 = new IllegalStateException("No states returned, fieldStates: " + list);
            e eVar2 = e.ERROR;
            ArrayList<C11819b> arrayList3 = new ArrayList<>();
            for (Object next3 : qv.d.f102012a.a()) {
                if (((C11819b) next3).b(eVar2, false)) {
                    arrayList3.add(next3);
                }
            }
            String str7 = null;
            String str8 = null;
            for (C11819b bVar2 : arrayList3) {
                if (str7 == null) {
                    String a11 = C11818a.a((String) null, illegalStateException2);
                    if (a11 == null) {
                        break;
                    }
                    str7 = C11820c.a(a11);
                }
                if (str8 == null) {
                    str8 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "parseAmbiguousDeliveryAreaError";
                }
                String str9 = str8;
                bVar2.a(eVar2, str9, false, illegalStateException2, str7);
                str8 = str9;
            }
        }
        if (str == null || str.length() == 0) {
            IllegalStateException illegalStateException3 = new IllegalStateException("No zip code");
            e eVar3 = e.ERROR;
            ArrayList<C11819b> arrayList4 = new ArrayList<>();
            for (Object next4 : qv.d.f102012a.a()) {
                if (((C11819b) next4).b(eVar3, false)) {
                    arrayList4.add(next4);
                }
            }
            String str10 = null;
            String str11 = null;
            for (C11819b bVar3 : arrayList4) {
                if (str10 == null) {
                    String a12 = C11818a.a(str4, illegalStateException3);
                    if (a12 == null) {
                        break;
                    }
                    str10 = C11820c.a(a12);
                }
                if (str11 == null) {
                    z10 = true;
                    str11 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "parseAmbiguousDeliveryAreaError";
                } else {
                    z10 = true;
                }
                String str12 = str11;
                boolean z11 = z10;
                bVar3.a(eVar3, str12, false, illegalStateException3, str10);
                str11 = str12;
                str4 = null;
            }
        }
        if (str != null) {
            str2 = str;
        }
        return new C10802e.a(arrayList, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r2 = r0.get("code");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final XH.v<java.util.Map<?, ?>, com.ingka.ikea.checkout.datalayer.impl.repo.network.b> W(M6.o r12) {
        /*
            java.lang.String r0 = "error"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            java.util.Map r0 = r12.a()
            r1 = 0
            if (r0 == 0) goto L_0x0019
            java.lang.String r2 = "code"
            java.lang.Object r2 = r0.get(r2)
            if (r2 == 0) goto L_0x0019
            java.lang.String r2 = r2.toString()
            goto L_0x001a
        L_0x0019:
            r2 = r1
        L_0x001a:
            com.ingka.ikea.checkout.datalayer.impl.repo.network.b$c r3 = com.ingka.ikea.checkout.datalayer.impl.repo.network.b.f93740b
            com.ingka.ikea.checkout.datalayer.impl.repo.network.b r2 = r3.a(r2)
            if (r0 == 0) goto L_0x002b
            if (r2 != 0) goto L_0x0025
            goto L_0x002b
        L_0x0025:
            XH.v r12 = new XH.v
            r12.<init>(r0, r2)
            return r12
        L_0x002b:
            qv.e r2 = qv.e.WARN
            qv.d r3 = qv.d.f102012a
            java.util.List r3 = r3.a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x003e:
            boolean r5 = r3.hasNext()
            r9 = 0
            if (r5 == 0) goto L_0x0056
            java.lang.Object r5 = r3.next()
            r6 = r5
            qv.b r6 = (qv.C11819b) r6
            boolean r6 = r6.b(r2, r9)
            if (r6 == 0) goto L_0x003e
            r4.add(r5)
            goto L_0x003e
        L_0x0056:
            java.util.Iterator r10 = r4.iterator()
            r3 = r1
        L_0x005b:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L_0x00ca
            java.lang.Object r4 = r10.next()
            qv.b r4 = (qv.C11819b) r4
            r7 = 0
            if (r1 != 0) goto L_0x0091
            java.lang.String r1 = r12.b()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Unhandled error: "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r6 = ", message: "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            java.lang.String r1 = qv.C11818a.a(r1, r7)
            if (r1 == 0) goto L_0x00ca
            java.lang.String r1 = qv.C11820c.a(r1)
        L_0x0091:
            if (r3 != 0) goto L_0x00bf
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            java.lang.String r5 = "main"
            r6 = 1
            boolean r3 = HJ.C15854t.b0(r3, r5, r6)
            if (r3 == 0) goto L_0x00a7
            java.lang.String r3 = "m"
            goto L_0x00a9
        L_0x00a7:
            java.lang.String r3 = "b"
        L_0x00a9:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r3 = "|"
            r5.append(r3)
            java.lang.String r3 = "parseCustomError"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
        L_0x00bf:
            r11 = r3
            r3 = r4
            r4 = r2
            r5 = r11
            r6 = r9
            r8 = r1
            r3.a(r4, r5, r6, r7, r8)
            r3 = r11
            goto L_0x005b
        L_0x00ca:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r12 = r12.b()
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.d.W(M6.o):XH.v");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Iterable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Iterable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.Iterable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.Iterable} */
    /* JADX WARNING: type inference failed for: r3v9, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v11, types: [java.util.List] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <D extends M6.w.a> M6.g<D> p(M6.g<D> r19, java.lang.String r20) {
        /*
            r0 = r19
            java.util.List<M6.o> r1 = r0.f38572d
            if (r1 == 0) goto L_0x01ee
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01ee
            java.lang.Object r0 = r1.next()
            M6.o r0 = (M6.o) r0
            XH.v r0 = W(r0)
            java.lang.Object r1 = r0.a()
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r0 = r0.b()
            com.ingka.ikea.checkout.datalayer.impl.repo.network.b r0 = (com.ingka.ikea.checkout.datalayer.impl.repo.network.b) r0
            com.ingka.ikea.checkout.datalayer.impl.repo.network.b$a$f r2 = com.ingka.ikea.checkout.datalayer.impl.repo.network.b.a.f.f93747c
            boolean r2 = kotlin.jvm.internal.C17542s.e(r0, r2)
            r3 = 0
            if (r2 == 0) goto L_0x0072
            com.ingka.ikea.checkout.datalayer.impl.repo.network.b$a$f$a r0 = com.ingka.ikea.checkout.datalayer.impl.repo.network.b.a.f.C2092a.VIOLATED_FIELDS
            java.lang.String r0 = r0.b()
            java.lang.Object r0 = r1.get(r0)
            boolean r1 = r0 instanceof java.util.List
            if (r1 == 0) goto L_0x0042
            r3 = r0
            java.util.List r3 = (java.util.List) r3
        L_0x0042:
            if (r3 != 0) goto L_0x0048
            java.util.List r3 = YH.C16877v.n()
        L_0x0048:
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = YH.C16877v.y(r3, r1)
            r0.<init>(r1)
            java.util.Iterator r1 = r3.iterator()
        L_0x0059:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x006b
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.add(r2)
            goto L_0x0059
        L_0x006b:
            Nn.e$b$c r1 = new Nn.e$b$c
            r1.<init>(r0)
            goto L_0x01ed
        L_0x0072:
            com.ingka.ikea.checkout.datalayer.impl.repo.network.b$a$a r2 = com.ingka.ikea.checkout.datalayer.impl.repo.network.b.a.C2088a.f93742c
            boolean r2 = kotlin.jvm.internal.C17542s.e(r0, r2)
            if (r2 != 0) goto L_0x01e7
            com.ingka.ikea.checkout.datalayer.impl.repo.network.b$a$d r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.b.a.d.f93745c
            boolean r1 = kotlin.jvm.internal.C17542s.e(r0, r1)
            if (r1 != 0) goto L_0x01df
            com.ingka.ikea.checkout.datalayer.impl.repo.network.b$a$c r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.b.a.c.f93744c
            boolean r1 = kotlin.jvm.internal.C17542s.e(r0, r1)
            if (r1 != 0) goto L_0x01df
            com.ingka.ikea.checkout.datalayer.impl.repo.network.b$a$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.b.a.C2091b.f93743c
            boolean r1 = kotlin.jvm.internal.C17542s.e(r0, r1)
            if (r1 != 0) goto L_0x01dc
            com.ingka.ikea.checkout.datalayer.impl.repo.network.b$a$g r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.b.a.g.f93748c
            boolean r1 = kotlin.jvm.internal.C17542s.e(r0, r1)
            java.lang.String r2 = "|"
            java.lang.String r4 = "b"
            java.lang.String r5 = "m"
            r6 = 1
            java.lang.String r7 = "main"
            java.lang.String r8 = "checkErrors"
            if (r1 == 0) goto L_0x0127
            qv.e r0 = qv.e.INFO
            qv.d r1 = qv.d.f102012a
            java.util.List r1 = r1.a()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x00b8:
            boolean r10 = r1.hasNext()
            r15 = 0
            if (r10 == 0) goto L_0x00d0
            java.lang.Object r10 = r1.next()
            r11 = r10
            qv.b r11 = (qv.C11819b) r11
            boolean r11 = r11.b(r0, r15)
            if (r11 == 0) goto L_0x00b8
            r9.add(r10)
            goto L_0x00b8
        L_0x00d0:
            java.util.Iterator r1 = r9.iterator()
            r9 = r3
        L_0x00d5:
            boolean r10 = r1.hasNext()
            if (r10 == 0) goto L_0x0123
            java.lang.Object r10 = r1.next()
            qv.b r10 = (qv.C11819b) r10
            r13 = 0
            if (r3 != 0) goto L_0x00f0
            java.lang.String r3 = "Order is already completed"
            java.lang.String r3 = qv.C11818a.a(r3, r13)
            if (r3 == 0) goto L_0x0123
            java.lang.String r3 = qv.C11820c.a(r3)
        L_0x00f0:
            if (r9 != 0) goto L_0x0115
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            java.lang.String r9 = r9.getName()
            boolean r9 = HJ.C15854t.b0(r9, r7, r6)
            if (r9 == 0) goto L_0x0102
            r9 = r5
            goto L_0x0103
        L_0x0102:
            r9 = r4
        L_0x0103:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r9)
            r11.append(r2)
            r11.append(r8)
            java.lang.String r9 = r11.toString()
        L_0x0115:
            r16 = r9
            r9 = r10
            r10 = r0
            r11 = r16
            r12 = r15
            r14 = r3
            r9.a(r10, r11, r12, r13, r14)
            r9 = r16
            goto L_0x00d5
        L_0x0123:
            Nn.e$d r1 = Nn.C10802e.d.f84046a
            goto L_0x01ed
        L_0x0127:
            com.ingka.ikea.checkout.datalayer.impl.repo.network.b$a$e r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.b.a.e.f93746c
            boolean r1 = kotlin.jvm.internal.C17542s.e(r0, r1)
            if (r1 != 0) goto L_0x01d9
            boolean r1 = r0 instanceof com.ingka.ikea.checkout.datalayer.impl.repo.network.b.C2093b
            if (r1 == 0) goto L_0x01d3
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Unexpected error: "
            r9.append(r10)
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            r1.<init>(r0)
            qv.e r0 = qv.e.ERROR
            qv.d r9 = qv.d.f102012a
            java.util.List r9 = r9.a()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x015c:
            boolean r11 = r9.hasNext()
            r15 = 0
            if (r11 == 0) goto L_0x0174
            java.lang.Object r11 = r9.next()
            r12 = r11
            qv.b r12 = (qv.C11819b) r12
            boolean r12 = r12.b(r0, r15)
            if (r12 == 0) goto L_0x015c
            r10.add(r11)
            goto L_0x015c
        L_0x0174:
            java.util.Iterator r16 = r10.iterator()
            r9 = r3
            r10 = r9
        L_0x017a:
            boolean r11 = r16.hasNext()
            if (r11 == 0) goto L_0x01cb
            java.lang.Object r11 = r16.next()
            qv.b r11 = (qv.C11819b) r11
            if (r9 != 0) goto L_0x0192
            java.lang.String r9 = qv.C11818a.a(r3, r1)
            if (r9 == 0) goto L_0x01cb
            java.lang.String r9 = qv.C11820c.a(r9)
        L_0x0192:
            r17 = r9
            if (r10 != 0) goto L_0x01b9
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            java.lang.String r9 = r9.getName()
            boolean r9 = HJ.C15854t.b0(r9, r7, r6)
            if (r9 == 0) goto L_0x01a6
            r9 = r5
            goto L_0x01a7
        L_0x01a6:
            r9 = r4
        L_0x01a7:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            r10.append(r2)
            r10.append(r8)
            java.lang.String r10 = r10.toString()
        L_0x01b9:
            r18 = r10
            r9 = r11
            r10 = r0
            r11 = r18
            r12 = r15
            r13 = r1
            r14 = r17
            r9.a(r10, r11, r12, r13, r14)
            r9 = r17
            r10 = r18
            goto L_0x017a
        L_0x01cb:
            Nn.e$c$b r1 = new Nn.e$c$b
            java.lang.String r0 = "Unexpected error"
            r1.<init>(r0)
            goto L_0x01ed
        L_0x01d3:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x01d9:
            Nn.e$d r1 = Nn.C10802e.d.f84046a
            goto L_0x01ed
        L_0x01dc:
            Nn.e$c$a r1 = Nn.C10802e.c.a.f84044a
            goto L_0x01ed
        L_0x01df:
            Nn.e$e r1 = new Nn.e$e
            Nn.e$e$a r0 = Nn.C10802e.C1702e.a.UNABLE_TO_DELIVER
            r1.<init>(r0)
            goto L_0x01ed
        L_0x01e7:
            r0 = r20
            Nn.e$a r1 = V(r1, r0)
        L_0x01ed:
            throw r1
        L_0x01ee:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.d.p(M6.g, java.lang.String):M6.g");
    }

    static /* synthetic */ g q(g gVar, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        return p(gVar, str);
    }

    /* access modifiers changed from: private */
    public static final List<C10812o> r(List<C10343u> list) {
        ArrayList arrayList = new ArrayList();
        for (C10343u y10 : list) {
            C10812o y11 = y(y10);
            if (y11 != null) {
                arrayList.add(y11);
            }
        }
        return C16877v.g1(arrayList, new b());
    }

    /* access modifiers changed from: private */
    public static final List<C10378i> s(Map<String, ? extends Object> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry next : map.entrySet()) {
            arrayList.add(new C10378i((String) next.getKey(), next.getValue().toString()));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static final List<PriceResponse.CheckoutTaxSummary> t(List<C10315a0.c> list) {
        Iterable<C10315a0.c> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (C10315a0.c cVar : iterable) {
            arrayList.add(new PriceResponse.CheckoutTaxSummary(cVar.a().a(), cVar.a().b()));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static final PriceResponse.DiscountSummaryResponse u(C10315a0.a aVar) {
        return new PriceResponse.DiscountSummaryResponse(aVar.e(), aVar.b(), aVar.d());
    }

    /* access modifiers changed from: private */
    public static final C10803f v(C10256a.d dVar, List<C10801d.a> list) {
        Iterable<C10256a.f> c10 = dVar.c();
        ArrayList arrayList = new ArrayList(C16877v.y(c10, 10));
        for (C10256a.f a10 : c10) {
            arrayList.add(a10.a());
        }
        List<C10812o> r10 = r(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (C10256a.b a11 : dVar.b()) {
            C10812o y10 = y(a11.a());
            if (y10 != null) {
                arrayList2.add(y10);
            }
        }
        if (!r10.isEmpty() || !arrayList2.isEmpty()) {
            a G10 = G(dVar.a().a(), list);
            return new C10803f(G10.a(), G10.d(), r10, Q(arrayList2), (K) null, G10.c(), G10.b(), (ShippingBillingDynamicModel) null, (r) null);
        }
        e eVar = e.DEBUG;
        ArrayList<C11819b> arrayList3 = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList3.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList3) {
            if (str == null) {
                String a12 = C11818a.a("No delivery services available", (Throwable) null);
                if (a12 == null) {
                    break;
                }
                str = C11820c.a(a12);
            }
            if (str2 == null) {
                String name = C10256a.d.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            bVar.a(eVar, str2, false, (Throwable) null, str);
        }
        throw new C10802e.C1702e(C10802e.C1702e.a.UNABLE_TO_DELIVER);
    }

    private static final C10811n w(u0 u0Var) {
        if (u0Var.b() == null && u0Var.a() == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("No valid price: " + u0Var);
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = u0.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, illegalArgumentException, str3);
                str = str3;
                str2 = str4;
            }
            return null;
        }
        Double b10 = u0Var.b();
        Double a11 = u0Var.a();
        return new C10811n(b10, Double.valueOf(a11 != null ? a11.doubleValue() : 0.0d));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0014, code lost:
        r3 = r3.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final Nn.C10812o.b x(vh.C10343u.b r3, java.util.List<Nn.G> r4, boolean r5) {
        /*
            Nn.o$b r0 = new Nn.o$b
            java.lang.String r1 = r3.e()
            wh.h r2 = r3.g()
            Nn.P r2 = F(r2)
            vh.u$e r3 = r3.d()
            if (r3 == 0) goto L_0x001f
            vh.A0 r3 = r3.a()
            if (r3 == 0) goto L_0x001f
            Nn.M r3 = E(r3, r5)
            goto L_0x0020
        L_0x001f:
            r3 = 0
        L_0x0020:
            r0.<init>(r1, r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.d.x(vh.u$b, java.util.List, boolean):Nn.o$b");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        r3 = r3.a();
     */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x03c5  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0432  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final Nn.C10812o y(vh.C10343u r31) {
        /*
            wh.f r0 = r31.b()
            Nn.p r2 = R(r0)
            r0 = 0
            if (r2 != 0) goto L_0x000c
            return r0
        L_0x000c:
            wh.e r1 = r31.j()
            Nn.u r8 = S(r1)
            if (r8 != 0) goto L_0x0017
            return r0
        L_0x0017:
            java.util.List r1 = T(r31)
            vh.u$g r3 = r31.g()
            vh.u$c r3 = r3.b()
            if (r3 == 0) goto L_0x0031
            vh.p r3 = r3.a()
            if (r3 == 0) goto L_0x0031
            java.lang.String r3 = K(r3)
            r4 = r3
            goto L_0x0032
        L_0x0031:
            r4 = r0
        L_0x0032:
            vh.u$g r3 = r31.g()
            vh.u$c r3 = r3.b()
            if (r3 == 0) goto L_0x0053
            vh.p r3 = r3.a()
            if (r3 == 0) goto L_0x0053
            vh.p$a r3 = r3.a()
            if (r3 == 0) goto L_0x0053
            vh.p$b r3 = r3.a()
            if (r3 == 0) goto L_0x0053
            java.lang.String r3 = r3.a()
            goto L_0x0054
        L_0x0053:
            r3 = r0
        L_0x0054:
            java.text.SimpleDateFormat r5 = new java.text.SimpleDateFormat
            Zo.b r6 = Zo.b.f90092a
            java.util.Locale r6 = r6.d()
            java.lang.String r7 = "yyyy-MM-dd'T'HH:mm:ss.SSS"
            r5.<init>(r7, r6)
            java.util.Date r3 = Rn.b.b(r3, r5)
            if (r3 == 0) goto L_0x0071
            long r5 = r3.getTime()
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r5 = r3
            goto L_0x0072
        L_0x0071:
            r5 = r0
        L_0x0072:
            wh.d r3 = r31.c()
            wh.d r6 = wh.C10373d.FULL
            java.lang.String r7 = "|"
            java.lang.String r9 = "b"
            java.lang.String r10 = "m"
            java.lang.String r12 = "main"
            java.lang.String r13 = "Kt"
            r15 = 36
            java.lang.Class<vh.u> r16 = vh.C10343u.class
            r11 = 2
            if (r3 != r6) goto L_0x014e
            wh.m r3 = r31.h()
            wh.m r6 = wh.m.NO
            if (r3 != r6) goto L_0x014e
            qv.e r1 = qv.e.INFO
            qv.d r3 = qv.d.f102012a
            java.util.List r3 = r3.a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x00a4:
            boolean r5 = r3.hasNext()
            r6 = 0
            if (r5 == 0) goto L_0x00bc
            java.lang.Object r5 = r3.next()
            r8 = r5
            qv.b r8 = (qv.C11819b) r8
            boolean r6 = r8.b(r1, r6)
            if (r6 == 0) goto L_0x00a4
            r4.add(r5)
            goto L_0x00a4
        L_0x00bc:
            java.util.Iterator r3 = r4.iterator()
            r4 = r0
            r5 = r4
        L_0x00c2:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x014d
            java.lang.Object r8 = r3.next()
            r18 = r8
            qv.b r18 = (qv.C11819b) r18
            r8 = 0
            if (r4 != 0) goto L_0x00fb
            java.lang.String r4 = r31.d()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r14 = "Filtering away delivery service: type: "
            r6.append(r14)
            r6.append(r2)
            java.lang.String r14 = ", id: "
            r6.append(r14)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            java.lang.String r4 = qv.C11818a.a(r4, r8)
            if (r4 != 0) goto L_0x00f7
            goto L_0x014d
        L_0x00f7:
            java.lang.String r4 = qv.C11820c.a(r4)
        L_0x00fb:
            if (r5 != 0) goto L_0x013d
            java.lang.String r5 = r16.getName()
            kotlin.jvm.internal.C17542s.g(r5)
            java.lang.String r6 = HJ.C15854t.s1(r5, r15, r0, r11, r0)
            r14 = 46
            java.lang.String r6 = HJ.C15854t.o1(r6, r14, r0, r11, r0)
            int r14 = r6.length()
            if (r14 != 0) goto L_0x0115
            goto L_0x0119
        L_0x0115:
            java.lang.String r5 = HJ.C15854t.P0(r6, r13)
        L_0x0119:
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r6 = r6.getName()
            r14 = 1
            boolean r6 = HJ.C15854t.b0(r6, r12, r14)
            if (r6 == 0) goto L_0x012a
            r6 = r10
            goto L_0x012b
        L_0x012a:
            r6 = r9
        L_0x012b:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r6)
            r14.append(r7)
            r14.append(r5)
            java.lang.String r5 = r14.toString()
        L_0x013d:
            r19 = r1
            r20 = r5
            r6 = 0
            r21 = r6
            r22 = r8
            r23 = r4
            r18.a(r19, r20, r21, r22, r23)
            goto L_0x00c2
        L_0x014d:
            return r0
        L_0x014e:
            vh.u$h r3 = r31.k()
            if (r3 == 0) goto L_0x0161
            vh.u0 r3 = r3.a()
            if (r3 == 0) goto L_0x0161
            Nn.n r3 = w(r3)
            r18 = r3
            goto L_0x0163
        L_0x0161:
            r18 = r0
        L_0x0163:
            java.util.List r3 = r31.m()
            r6 = r3
            java.util.Collection r6 = (java.util.Collection) r6
            r14 = 10
            r19 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            if (r6 == 0) goto L_0x02a2
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x017b
            goto L_0x02a2
        L_0x017b:
            java.lang.String r6 = r31.d()
            vh.u$g r7 = r31.g()
            java.lang.String r7 = r7.c()
            vh.u$g r9 = r31.g()
            java.lang.String r9 = r9.d()
            boolean r12 = r31.l()
            Nn.o$c r13 = new Nn.o$c
            boolean r10 = r31.i()
            java.lang.Double r11 = r31.f()
            java.lang.Double r15 = r31.e()
            r13.<init>(r10, r11, r15)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r15 = new java.util.ArrayList
            int r10 = YH.C16877v.y(r3, r14)
            r15.<init>(r10)
            java.util.Iterator r3 = r3.iterator()
        L_0x01b3:
            boolean r10 = r3.hasNext()
            if (r10 == 0) goto L_0x01d7
            java.lang.Object r10 = r3.next()
            vh.u$i r10 = (vh.C10343u.i) r10
            Nn.Q r11 = new Nn.Q
            java.lang.String r0 = r10.b()
            int r14 = r10.a()
            int r10 = r10.c()
            r11.<init>(r0, r14, r10)
            r15.add(r11)
            r0 = 0
            r14 = 10
            goto L_0x01b3
        L_0x01d7:
            java.util.List r0 = r31.a()
            if (r0 == 0) goto L_0x0208
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r3 = new java.util.ArrayList
            r10 = 10
            int r10 = YH.C16877v.y(r0, r10)
            r3.<init>(r10)
            java.util.Iterator r0 = r0.iterator()
        L_0x01ee:
            boolean r10 = r0.hasNext()
            if (r10 == 0) goto L_0x0206
            java.lang.Object r10 = r0.next()
            vh.u$b r10 = (vh.C10343u.b) r10
            boolean r11 = r31.l()
            Nn.o$b r10 = x(r10, r1, r11)
            r3.add(r10)
            goto L_0x01ee
        L_0x0206:
            r11 = r3
            goto L_0x020d
        L_0x0208:
            java.util.List r0 = YH.C16877v.n()
            r11 = r0
        L_0x020d:
            if (r1 == 0) goto L_0x0283
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r0 = r1.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L_0x0223
            r23 = r12
            r24 = r13
            r22 = r15
            r1 = 0
            goto L_0x0274
        L_0x0223:
            java.lang.Object r1 = r0.next()
            boolean r3 = r0.hasNext()
            if (r3 != 0) goto L_0x0234
            r23 = r12
            r24 = r13
            r22 = r15
            goto L_0x0274
        L_0x0234:
            r3 = r1
            Nn.G r3 = (Nn.G) r3
            java.lang.Double r3 = r3.b()
            if (r3 == 0) goto L_0x0242
            double r16 = r3.doubleValue()
            goto L_0x0244
        L_0x0242:
            r16 = r19
        L_0x0244:
            r22 = r15
            r14 = r16
        L_0x0248:
            java.lang.Object r3 = r0.next()
            r10 = r3
            Nn.G r10 = (Nn.G) r10
            java.lang.Double r10 = r10.b()
            if (r10 == 0) goto L_0x0260
            double r16 = r10.doubleValue()
            r23 = r12
            r24 = r13
            r12 = r16
            goto L_0x0266
        L_0x0260:
            r23 = r12
            r24 = r13
            r12 = r19
        L_0x0266:
            int r10 = java.lang.Double.compare(r14, r12)
            if (r10 <= 0) goto L_0x026e
            r1 = r3
            r14 = r12
        L_0x026e:
            boolean r3 = r0.hasNext()
            if (r3 != 0) goto L_0x027e
        L_0x0274:
            Nn.G r1 = (Nn.G) r1
            if (r1 == 0) goto L_0x0289
            java.lang.Double r0 = r1.b()
            r10 = r0
            goto L_0x028a
        L_0x027e:
            r12 = r23
            r13 = r24
            goto L_0x0248
        L_0x0283:
            r23 = r12
            r24 = r13
            r22 = r15
        L_0x0289:
            r10 = 0
        L_0x028a:
            Nn.o$d r0 = new Nn.o$d
            r1 = r0
            r16 = 4096(0x1000, float:5.74E-42)
            r17 = 0
            r14 = 0
            r3 = r6
            r6 = r7
            r7 = r9
            r9 = r18
            r12 = r23
            r13 = r24
            r15 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x045c
        L_0x02a2:
            if (r18 != 0) goto L_0x0352
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Delivery price is missing"
            r0.<init>(r1)
            qv.e r1 = qv.e.ERROR
            qv.d r2 = qv.d.f102012a
            java.util.List r2 = r2.a()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x02be:
            boolean r4 = r2.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x02d6
            java.lang.Object r4 = r2.next()
            r6 = r4
            qv.b r6 = (qv.C11819b) r6
            boolean r5 = r6.b(r1, r5)
            if (r5 == 0) goto L_0x02be
            r3.add(r4)
            goto L_0x02be
        L_0x02d6:
            java.util.Iterator r2 = r3.iterator()
            r3 = 0
            r4 = 0
        L_0x02dc:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0350
            java.lang.Object r6 = r2.next()
            qv.b r6 = (qv.C11819b) r6
            r8 = 0
            if (r3 != 0) goto L_0x02f7
            java.lang.String r3 = qv.C11818a.a(r8, r0)
            if (r3 != 0) goto L_0x02f3
            r0 = r8
            goto L_0x0351
        L_0x02f3:
            java.lang.String r3 = qv.C11820c.a(r3)
        L_0x02f7:
            if (r4 != 0) goto L_0x033a
            java.lang.String r4 = r16.getName()
            kotlin.jvm.internal.C17542s.g(r4)
            java.lang.String r14 = HJ.C15854t.s1(r4, r15, r8, r11, r8)
            r15 = 46
            java.lang.String r14 = HJ.C15854t.o1(r14, r15, r8, r11, r8)
            int r8 = r14.length()
            if (r8 != 0) goto L_0x0311
            goto L_0x0315
        L_0x0311:
            java.lang.String r4 = HJ.C15854t.P0(r14, r13)
        L_0x0315:
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            java.lang.String r8 = r8.getName()
            r14 = 1
            boolean r8 = HJ.C15854t.b0(r8, r12, r14)
            if (r8 == 0) goto L_0x0326
            r8 = r10
            goto L_0x0327
        L_0x0326:
            r8 = r9
        L_0x0327:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r8)
            r11.append(r7)
            r11.append(r4)
            java.lang.String r4 = r11.toString()
            goto L_0x033d
        L_0x033a:
            r14 = 1
            r15 = 46
        L_0x033d:
            r25 = r6
            r26 = r1
            r27 = r4
            r28 = r5
            r29 = r0
            r30 = r3
            r25.a(r26, r27, r28, r29, r30)
            r11 = 2
            r15 = 36
            goto L_0x02dc
        L_0x0350:
            r0 = 0
        L_0x0351:
            return r0
        L_0x0352:
            r0 = 0
            java.lang.String r3 = r31.d()
            vh.u$g r6 = r31.g()
            java.lang.String r6 = r6.c()
            vh.u$g r7 = r31.g()
            java.lang.String r7 = r7.d()
            if (r1 == 0) goto L_0x03be
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            boolean r9 = r1.hasNext()
            if (r9 != 0) goto L_0x0377
            r9 = r0
            goto L_0x03b4
        L_0x0377:
            java.lang.Object r9 = r1.next()
            boolean r10 = r1.hasNext()
            if (r10 != 0) goto L_0x0382
            goto L_0x03b4
        L_0x0382:
            r10 = r9
            Nn.G r10 = (Nn.G) r10
            java.lang.Double r10 = r10.b()
            if (r10 == 0) goto L_0x0390
            double r10 = r10.doubleValue()
            goto L_0x0392
        L_0x0390:
            r10 = r19
        L_0x0392:
            java.lang.Object r12 = r1.next()
            r13 = r12
            Nn.G r13 = (Nn.G) r13
            java.lang.Double r13 = r13.b()
            if (r13 == 0) goto L_0x03a4
            double r13 = r13.doubleValue()
            goto L_0x03a6
        L_0x03a4:
            r13 = r19
        L_0x03a6:
            int r15 = java.lang.Double.compare(r10, r13)
            if (r15 <= 0) goto L_0x03ae
            r9 = r12
            r10 = r13
        L_0x03ae:
            boolean r12 = r1.hasNext()
            if (r12 != 0) goto L_0x0392
        L_0x03b4:
            Nn.G r9 = (Nn.G) r9
            if (r9 == 0) goto L_0x03be
            java.lang.Double r1 = r9.b()
            r10 = r1
            goto L_0x03bf
        L_0x03be:
            r10 = r0
        L_0x03bf:
            java.util.List r1 = r31.a()
            if (r1 == 0) goto L_0x0432
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r9 = new java.util.ArrayList
            r11 = 10
            int r12 = YH.C16877v.y(r1, r11)
            r9.<init>(r12)
            java.util.Iterator r1 = r1.iterator()
        L_0x03d6:
            boolean r11 = r1.hasNext()
            if (r11 == 0) goto L_0x0430
            java.lang.Object r11 = r1.next()
            vh.u$b r11 = (vh.C10343u.b) r11
            vh.u$a r12 = r11.a()
            if (r12 == 0) goto L_0x0422
            java.util.List r12 = r12.b()
            if (r12 == 0) goto L_0x0422
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r13 = new java.util.ArrayList
            r14 = 10
            int r15 = YH.C16877v.y(r12, r14)
            r13.<init>(r15)
            java.util.Iterator r12 = r12.iterator()
        L_0x03ff:
            boolean r15 = r12.hasNext()
            if (r15 == 0) goto L_0x0423
            java.lang.Object r15 = r12.next()
            vh.u$f r15 = (vh.C10343u.f) r15
            vh.Q r15 = r15.a()
            wh.d r0 = r31.c()
            boolean r14 = r31.l()
            Nn.G r0 = z(r15, r0, r14)
            r13.add(r0)
            r0 = 0
            r14 = 10
            goto L_0x03ff
        L_0x0422:
            r13 = 0
        L_0x0423:
            boolean r0 = r31.l()
            Nn.o$b r0 = x(r11, r13, r0)
            r9.add(r0)
            r0 = 0
            goto L_0x03d6
        L_0x0430:
            r11 = r9
            goto L_0x0437
        L_0x0432:
            java.util.List r0 = YH.C16877v.n()
            r11 = r0
        L_0x0437:
            boolean r12 = r31.l()
            Nn.o$c r13 = new Nn.o$c
            boolean r0 = r31.i()
            java.lang.Double r1 = r31.f()
            java.lang.Double r9 = r31.e()
            r13.<init>(r0, r1, r9)
            vh.u$g r0 = r31.g()
            java.lang.Integer r14 = r0.a()
            Nn.o$a r0 = new Nn.o$a
            r1 = r0
            r9 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x045c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.d.y(vh.u):Nn.o");
    }

    private static final G z(Q q10, C10373d dVar, boolean z10) {
        G.b bVar;
        A0 a10;
        u0 a11;
        Double e10 = q10.e();
        Double f10 = q10.f();
        M m10 = null;
        LocationLatLng locationLatLng = (e10 == null || f10 == null) ? null : new LocationLatLng(e10.doubleValue(), f10.doubleValue());
        String g10 = q10.g();
        C10799b bVar2 = new C10799b(J(q10.a().a()), q10.a().a().c(), q10.a().a().b(), locationLatLng);
        List<z> L10 = L(q10.i().a());
        String h10 = q10.h();
        String d10 = q10.d();
        double b10 = q10.b();
        Q.d j10 = q10.j();
        C10811n w10 = (j10 == null || (a11 = j10.a()) == null) ? null : w(a11);
        Q.b c10 = q10.c();
        if (!(c10 == null || (a10 = c10.a()) == null)) {
            m10 = E(a10, z10);
        }
        M m11 = m10;
        int i10 = a.f93883c[dVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            int i11 = a.f93882b[q10.k().ordinal()];
            if (i11 == 1 || i11 == 2) {
                bVar = G.b.YES;
            } else if (i11 == 3 || i11 == 4) {
                bVar = G.b.UNCERTAIN;
            } else {
                throw new t();
            }
        } else if (i10 == 3) {
            bVar = G.b.NO;
        } else if (i10 == 4) {
            int i12 = a.f93882b[q10.k().ordinal()];
            if (i12 == 1) {
                bVar = G.b.NO;
            } else if (i12 == 2) {
                bVar = G.b.YES;
            } else if (i12 == 3 || i12 == 4) {
                bVar = G.b.UNCERTAIN;
            } else {
                throw new t();
            }
        } else {
            throw new t();
        }
        return new G(d10, g10, w10, bVar2, L10, h10, Double.valueOf(b10), m11, bVar);
    }
}
