package com.ingka.ikea.purchasehistorydata.impl.data.remote;

import HJ.C15854t;
import Hx.c;
import androidx.annotation.Keep;
import com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseDetailsRemote;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;

@p
@Keep
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b%\b\b\u0018\u0000 [2\u00020\u0001:\u0006\\]^_`aBw\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ'\u0010#\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0018\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010(J\u0012\u0010.\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0018\u00100\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b0\u0010,J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010(J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010(J\u0012\u00103\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b5\u00106J\u0001\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b9\u0010(J\u0010\u0010:\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b:\u0010;J\u001a\u0010>\u001a\u00020=2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b>\u0010?R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010@\u0012\u0004\bB\u0010C\u001a\u0004\bA\u0010(R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010D\u0012\u0004\bF\u0010C\u001a\u0004\bE\u0010*R(\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\b\u0010G\u0012\u0004\bI\u0010C\u001a\u0004\bH\u0010,R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\t\u0010@\u0012\u0004\bK\u0010C\u001a\u0004\bJ\u0010(R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010L\u0012\u0004\bN\u0010C\u001a\u0004\bM\u0010/R(\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\r\u0010G\u0012\u0004\bP\u0010C\u001a\u0004\bO\u0010,R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010@\u0012\u0004\bR\u0010C\u001a\u0004\bQ\u0010(R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010@\u0012\u0004\bT\u0010C\u001a\u0004\bS\u0010(R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010U\u0012\u0004\bW\u0010C\u001a\u0004\bV\u00104R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010X\u0012\u0004\bZ\u0010C\u001a\u0004\bY\u00106¨\u0006b"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote;", "", "", "id", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote$Articles;", "articles", "", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/StatusRemote;", "statusV2", "type", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote$DeliveryDateRemote;", "deliveryDate", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote$TrackingInformationRemote;", "trackingInformation", "carrier", "deliveryNumber", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote$DeliveryAddressRemote;", "deliveryAddress", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseDetailsRemote$OrderActionsRemote;", "actions", "<init>", "(Ljava/lang/String;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote$Articles;Ljava/util/List;Ljava/lang/String;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote$DeliveryDateRemote;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote$DeliveryAddressRemote;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseDetailsRemote$OrderActionsRemote;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote$Articles;Ljava/util/List;Ljava/lang/String;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote$DeliveryDateRemote;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote$DeliveryAddressRemote;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseDetailsRemote$OrderActionsRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$purchasehistorydata_implementation_release", "(Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "LHx/c$c;", "convertToLocal", "()LHx/c$c;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote$Articles;", "component3", "()Ljava/util/List;", "component4", "component5", "()Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote$DeliveryDateRemote;", "component6", "component7", "component8", "component9", "()Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote$DeliveryAddressRemote;", "component10", "()Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseDetailsRemote$OrderActionsRemote;", "copy", "(Ljava/lang/String;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote$Articles;Ljava/util/List;Ljava/lang/String;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote$DeliveryDateRemote;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote$DeliveryAddressRemote;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseDetailsRemote$OrderActionsRemote;)Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote$Articles;", "getArticles", "getArticles$annotations", "Ljava/util/List;", "getStatusV2", "getStatusV2$annotations", "getType", "getType$annotations", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote$DeliveryDateRemote;", "getDeliveryDate", "getDeliveryDate$annotations", "getTrackingInformation", "getTrackingInformation$annotations", "getCarrier", "getCarrier$annotations", "getDeliveryNumber", "getDeliveryNumber$annotations", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote$DeliveryAddressRemote;", "getDeliveryAddress", "getDeliveryAddress$annotations", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseDetailsRemote$OrderActionsRemote;", "getActions", "getActions$annotations", "Companion", "TrackingInformationRemote", "DeliveryDateRemote", "Articles", "DeliveryAddressRemote", "$serializer", "a", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DeliveryMethodRemote {
    /* access modifiers changed from: private */
    public static final KSerializer<Object>[] $childSerializers = {null, null, new C17451f(StatusRemote$$serializer.INSTANCE), null, null, new C17451f(DeliveryMethodRemote$TrackingInformationRemote$$serializer.INSTANCE), null, null, null, null};
    public static final int $stable = 8;
    public static final a Companion = new a((DefaultConstructorMarker) null);
    private final PurchaseDetailsRemote.OrderActionsRemote actions;
    private final Articles articles;
    private final String carrier;
    private final DeliveryAddressRemote deliveryAddress;
    private final DeliveryDateRemote deliveryDate;
    private final String deliveryNumber;

    /* renamed from: id  reason: collision with root package name */
    private final String f119496id;
    private final List<StatusRemote> statusV2;
    private final List<TrackingInformationRemote> trackingInformation;
    private final String type;

    @p
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 \"2\u00020\u0001:\u0002#\u001cB+\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR(\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote$Articles;", "", "", "seen0", "", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseArticleRemote;", "products", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote$Articles;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "getProducts$annotations", "()V", "Companion", "$serializer", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Articles {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: b  reason: collision with root package name */
        public static final int f119502b = 8;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public static final KSerializer<Object>[] f119503c = {new C17451f(PurchaseArticleRemote$$serializer.INSTANCE)};

        /* renamed from: a  reason: collision with root package name */
        private final List<PurchaseArticleRemote> f119504a;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote$Articles$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote$Articles;", "serializer", "()Lkotlinx/serialization/KSerializer;", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<Articles> serializer() {
                return DeliveryMethodRemote$Articles$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Articles(int i10, List list, T0 t02) {
            if (1 != (i10 & 1)) {
                E0.b(i10, 1, DeliveryMethodRemote$Articles$$serializer.INSTANCE.getDescriptor());
            }
            this.f119504a = list;
        }

        public final List<PurchaseArticleRemote> b() {
            return this.f119504a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Articles) && C17542s.e(this.f119504a, ((Articles) obj).f119504a);
        }

        public int hashCode() {
            List<PurchaseArticleRemote> list = this.f119504a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            List<PurchaseArticleRemote> list = this.f119504a;
            return "Articles(products=" + list + ")";
        }
    }

    @p
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 %2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002&\u0014B/\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0017R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001f\u0012\u0004\b$\u0010\"\u001a\u0004\b#\u0010\u0017¨\u0006'"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote$DeliveryAddressRemote;", "Lpp/b;", "LHx/c$c$a;", "", "seen0", "", "title", "subtitle", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote$DeliveryAddressRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()LHx/c$c$a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getSubtitle", "getSubtitle$annotations", "Companion", "$serializer", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeliveryAddressRemote implements C11768b<c.C2661c.a> {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f119505a;

        /* renamed from: b  reason: collision with root package name */
        private final String f119506b;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote$DeliveryAddressRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote$DeliveryAddressRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<DeliveryAddressRemote> serializer() {
                return DeliveryMethodRemote$DeliveryAddressRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ DeliveryAddressRemote(int i10, String str, String str2, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, DeliveryMethodRemote$DeliveryAddressRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f119505a = str;
            this.f119506b = str2;
        }

        public static final /* synthetic */ void b(DeliveryAddressRemote deliveryAddressRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 0, y02, deliveryAddressRemote.f119505a);
            dVar.B(serialDescriptor, 1, y02, deliveryAddressRemote.f119506b);
        }

        public c.C2661c.a a() {
            String str = this.f119505a;
            if (str == null || C15854t.v0(str)) {
                return null;
            }
            String str2 = this.f119505a;
            String str3 = this.f119506b;
            if (str3 == null) {
                str3 = "";
            }
            return new c.C2661c.a(str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeliveryAddressRemote)) {
                return false;
            }
            DeliveryAddressRemote deliveryAddressRemote = (DeliveryAddressRemote) obj;
            return C17542s.e(this.f119505a, deliveryAddressRemote.f119505a) && C17542s.e(this.f119506b, deliveryAddressRemote.f119506b);
        }

        public int hashCode() {
            String str = this.f119505a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f119506b;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            String str = this.f119505a;
            String str2 = this.f119506b;
            return "DeliveryAddressRemote(title=" + str + ", subtitle=" + str2 + ")";
        }
    }

    @p
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 $2\u00020\u0001:\u0002%\u001cB/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001c\u0010\u001eR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b#\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006&"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote$DeliveryDateRemote;", "", "", "seen0", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DateAndTimeRemote;", "actual", "", "estimatedTimeRange", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/purchasehistorydata/impl/data/remote/DateAndTimeRemote;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote$DeliveryDateRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DateAndTimeRemote;", "()Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DateAndTimeRemote;", "getActual$annotations", "()V", "b", "Ljava/lang/String;", "getEstimatedTimeRange$annotations", "Companion", "$serializer", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeliveryDateRemote {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final DateAndTimeRemote f119507a;

        /* renamed from: b  reason: collision with root package name */
        private final String f119508b;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote$DeliveryDateRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote$DeliveryDateRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<DeliveryDateRemote> serializer() {
                return DeliveryMethodRemote$DeliveryDateRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ DeliveryDateRemote(int i10, DateAndTimeRemote dateAndTimeRemote, String str, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, DeliveryMethodRemote$DeliveryDateRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f119507a = dateAndTimeRemote;
            this.f119508b = str;
        }

        public static final /* synthetic */ void c(DeliveryDateRemote deliveryDateRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            dVar.B(serialDescriptor, 0, DateAndTimeRemote$$serializer.INSTANCE, deliveryDateRemote.f119507a);
            dVar.B(serialDescriptor, 1, Y0.f144077a, deliveryDateRemote.f119508b);
        }

        public final DateAndTimeRemote a() {
            return this.f119507a;
        }

        public final String b() {
            return this.f119508b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeliveryDateRemote)) {
                return false;
            }
            DeliveryDateRemote deliveryDateRemote = (DeliveryDateRemote) obj;
            return C17542s.e(this.f119507a, deliveryDateRemote.f119507a) && C17542s.e(this.f119508b, deliveryDateRemote.f119508b);
        }

        public int hashCode() {
            DateAndTimeRemote dateAndTimeRemote = this.f119507a;
            int i10 = 0;
            int hashCode = (dateAndTimeRemote == null ? 0 : dateAndTimeRemote.hashCode()) * 31;
            String str = this.f119508b;
            if (str != null) {
                i10 = str.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            DateAndTimeRemote dateAndTimeRemote = this.f119507a;
            String str = this.f119508b;
            return "DeliveryDateRemote(actual=" + dateAndTimeRemote + ", estimatedTimeRange=" + str + ")";
        }
    }

    @p
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 !2\u00020\u0001:\u0002\"\u001bB/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0014R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001c\u0012\u0004\b \u0010\u001f\u001a\u0004\b\u001b\u0010\u0014¨\u0006#"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote$TrackingInformationRemote;", "", "", "seen0", "", "trackingNumber", "trackingLink", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote$TrackingInformationRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getTrackingNumber$annotations", "()V", "getTrackingLink$annotations", "Companion", "$serializer", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TrackingInformationRemote {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f119509a;

        /* renamed from: b  reason: collision with root package name */
        private final String f119510b;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote$TrackingInformationRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote$TrackingInformationRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<TrackingInformationRemote> serializer() {
                return DeliveryMethodRemote$TrackingInformationRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ TrackingInformationRemote(int i10, String str, String str2, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, DeliveryMethodRemote$TrackingInformationRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f119509a = str;
            this.f119510b = str2;
        }

        public static final /* synthetic */ void c(TrackingInformationRemote trackingInformationRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 0, y02, trackingInformationRemote.f119509a);
            dVar.B(serialDescriptor, 1, y02, trackingInformationRemote.f119510b);
        }

        public final String a() {
            return this.f119510b;
        }

        public final String b() {
            return this.f119509a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TrackingInformationRemote)) {
                return false;
            }
            TrackingInformationRemote trackingInformationRemote = (TrackingInformationRemote) obj;
            return C17542s.e(this.f119509a, trackingInformationRemote.f119509a) && C17542s.e(this.f119510b, trackingInformationRemote.f119510b);
        }

        public int hashCode() {
            String str = this.f119509a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f119510b;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            String str = this.f119509a;
            String str2 = this.f119510b;
            return "TrackingInformationRemote(trackingNumber=" + str + ", trackingLink=" + str2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<DeliveryMethodRemote> serializer() {
            return DeliveryMethodRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DeliveryMethodRemote(int i10, String str, Articles articles2, List list, String str2, DeliveryDateRemote deliveryDateRemote, List list2, String str3, String str4, DeliveryAddressRemote deliveryAddressRemote, PurchaseDetailsRemote.OrderActionsRemote orderActionsRemote, T0 t02) {
        if (1023 != (i10 & 1023)) {
            E0.b(i10, 1023, DeliveryMethodRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f119496id = str;
        this.articles = articles2;
        this.statusV2 = list;
        this.type = str2;
        this.deliveryDate = deliveryDateRemote;
        this.trackingInformation = list2;
        this.carrier = str3;
        this.deliveryNumber = str4;
        this.deliveryAddress = deliveryAddressRemote;
        this.actions = orderActionsRemote;
    }

    public static /* synthetic */ DeliveryMethodRemote copy$default(DeliveryMethodRemote deliveryMethodRemote, String str, Articles articles2, List list, String str2, DeliveryDateRemote deliveryDateRemote, List list2, String str3, String str4, DeliveryAddressRemote deliveryAddressRemote, PurchaseDetailsRemote.OrderActionsRemote orderActionsRemote, int i10, Object obj) {
        DeliveryMethodRemote deliveryMethodRemote2 = deliveryMethodRemote;
        int i11 = i10;
        return deliveryMethodRemote.copy((i11 & 1) != 0 ? deliveryMethodRemote2.f119496id : str, (i11 & 2) != 0 ? deliveryMethodRemote2.articles : articles2, (i11 & 4) != 0 ? deliveryMethodRemote2.statusV2 : list, (i11 & 8) != 0 ? deliveryMethodRemote2.type : str2, (i11 & 16) != 0 ? deliveryMethodRemote2.deliveryDate : deliveryDateRemote, (i11 & 32) != 0 ? deliveryMethodRemote2.trackingInformation : list2, (i11 & 64) != 0 ? deliveryMethodRemote2.carrier : str3, (i11 & 128) != 0 ? deliveryMethodRemote2.deliveryNumber : str4, (i11 & 256) != 0 ? deliveryMethodRemote2.deliveryAddress : deliveryAddressRemote, (i11 & 512) != 0 ? deliveryMethodRemote2.actions : orderActionsRemote);
    }

    public static /* synthetic */ void getActions$annotations() {
    }

    public static /* synthetic */ void getArticles$annotations() {
    }

    public static /* synthetic */ void getCarrier$annotations() {
    }

    public static /* synthetic */ void getDeliveryAddress$annotations() {
    }

    public static /* synthetic */ void getDeliveryDate$annotations() {
    }

    public static /* synthetic */ void getDeliveryNumber$annotations() {
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public static /* synthetic */ void getStatusV2$annotations() {
    }

    public static /* synthetic */ void getTrackingInformation$annotations() {
    }

    public static /* synthetic */ void getType$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchasehistorydata_implementation_release(DeliveryMethodRemote deliveryMethodRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, deliveryMethodRemote.f119496id);
        dVar.B(serialDescriptor, 1, DeliveryMethodRemote$Articles$$serializer.INSTANCE, deliveryMethodRemote.articles);
        dVar.B(serialDescriptor, 2, kSerializerArr[2], deliveryMethodRemote.statusV2);
        dVar.B(serialDescriptor, 3, y02, deliveryMethodRemote.type);
        dVar.B(serialDescriptor, 4, DeliveryMethodRemote$DeliveryDateRemote$$serializer.INSTANCE, deliveryMethodRemote.deliveryDate);
        dVar.B(serialDescriptor, 5, kSerializerArr[5], deliveryMethodRemote.trackingInformation);
        dVar.B(serialDescriptor, 6, y02, deliveryMethodRemote.carrier);
        dVar.B(serialDescriptor, 7, y02, deliveryMethodRemote.deliveryNumber);
        dVar.B(serialDescriptor, 8, DeliveryMethodRemote$DeliveryAddressRemote$$serializer.INSTANCE, deliveryMethodRemote.deliveryAddress);
        dVar.B(serialDescriptor, 9, PurchaseDetailsRemote$OrderActionsRemote$$serializer.INSTANCE, deliveryMethodRemote.actions);
    }

    public final String component1() {
        return this.f119496id;
    }

    public final PurchaseDetailsRemote.OrderActionsRemote component10() {
        return this.actions;
    }

    public final Articles component2() {
        return this.articles;
    }

    public final List<StatusRemote> component3() {
        return this.statusV2;
    }

    public final String component4() {
        return this.type;
    }

    public final DeliveryDateRemote component5() {
        return this.deliveryDate;
    }

    public final List<TrackingInformationRemote> component6() {
        return this.trackingInformation;
    }

    public final String component7() {
        return this.carrier;
    }

    public final String component8() {
        return this.deliveryNumber;
    }

    public final DeliveryAddressRemote component9() {
        return this.deliveryAddress;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0134  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final Hx.c.C2661c convertToLocal() {
        /*
            r23 = this;
            r0 = r23
            java.lang.String r1 = r0.f119496id
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0141
            boolean r1 = HJ.C15854t.v0(r1)
            if (r1 == 0) goto L_0x0010
            goto L_0x0141
        L_0x0010:
            java.util.List<com.ingka.ikea.purchasehistorydata.impl.data.remote.StatusRemote> r1 = r0.statusV2
            r4 = 10
            if (r1 == 0) goto L_0x003b
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = YH.C16877v.y(r1, r4)
            r5.<init>(r6)
            java.util.Iterator r1 = r1.iterator()
        L_0x0025:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0039
            java.lang.Object r6 = r1.next()
            com.ingka.ikea.purchasehistorydata.impl.data.remote.StatusRemote r6 = (com.ingka.ikea.purchasehistorydata.impl.data.remote.StatusRemote) r6
            Hx.c$c$d r6 = r6.convertToLocal()
            r5.add(r6)
            goto L_0x0025
        L_0x0039:
            r9 = r5
            goto L_0x0040
        L_0x003b:
            java.util.List r5 = YH.C16877v.n()
            goto L_0x0039
        L_0x0040:
            com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote$DeliveryDateRemote r1 = r0.deliveryDate
            if (r1 == 0) goto L_0x0049
            com.ingka.ikea.purchasehistorydata.impl.data.remote.DateAndTimeRemote r1 = r1.a()
            goto L_0x004a
        L_0x0049:
            r1 = r3
        L_0x004a:
            if (r1 == 0) goto L_0x0061
            com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote$DeliveryDateRemote r1 = r0.deliveryDate
            com.ingka.ikea.purchasehistorydata.impl.data.remote.DateAndTimeRemote r1 = r1.a()
            Hx.c$b r1 = r1.convertToLocal()
            if (r1 == 0) goto L_0x005e
            Hx.c$c$b$a r5 = new Hx.c$c$b$a
            r5.<init>(r1)
            goto L_0x005f
        L_0x005e:
            r5 = r3
        L_0x005f:
            r12 = r5
            goto L_0x007a
        L_0x0061:
            com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote$DeliveryDateRemote r1 = r0.deliveryDate
            if (r1 == 0) goto L_0x006a
            java.lang.String r1 = r1.b()
            goto L_0x006b
        L_0x006a:
            r1 = r3
        L_0x006b:
            if (r1 == 0) goto L_0x005e
            boolean r5 = HJ.C15854t.v0(r1)
            if (r5 == 0) goto L_0x0074
            goto L_0x005e
        L_0x0074:
            Hx.c$c$b$b r5 = new Hx.c$c$b$b
            r5.<init>(r1)
            goto L_0x005f
        L_0x007a:
            java.util.List<com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote$TrackingInformationRemote> r1 = r0.trackingInformation
            if (r1 == 0) goto L_0x00d3
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0089:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x00d4
            java.lang.Object r6 = r1.next()
            com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote$TrackingInformationRemote r6 = (com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote.TrackingInformationRemote) r6
            java.lang.String r7 = r6.b()
            if (r7 == 0) goto L_0x00a1
            boolean r7 = HJ.C15854t.v0(r7)
            if (r7 == 0) goto L_0x00ae
        L_0x00a1:
            java.lang.String r7 = r6.a()
            if (r7 == 0) goto L_0x00cc
            boolean r7 = HJ.C15854t.v0(r7)
            if (r7 == 0) goto L_0x00ae
            goto L_0x00cc
        L_0x00ae:
            java.lang.String r7 = r6.b()
            java.lang.String r6 = r6.a()
            if (r6 == 0) goto L_0x00c1
            boolean r8 = HJ.C15854t.v0(r6)
            if (r8 == 0) goto L_0x00bf
            goto L_0x00c1
        L_0x00bf:
            r8 = 0
            goto L_0x00c2
        L_0x00c1:
            r8 = r2
        L_0x00c2:
            if (r8 != 0) goto L_0x00c5
            goto L_0x00c6
        L_0x00c5:
            r6 = r3
        L_0x00c6:
            Hx.c$c$e r8 = new Hx.c$c$e
            r8.<init>(r7, r6)
            goto L_0x00cd
        L_0x00cc:
            r8 = r3
        L_0x00cd:
            if (r8 == 0) goto L_0x0089
            r5.add(r8)
            goto L_0x0089
        L_0x00d3:
            r5 = r3
        L_0x00d4:
            java.lang.String r7 = r0.f119496id
            com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote$Articles r1 = r0.articles
            if (r1 == 0) goto L_0x0105
            java.util.List r1 = r1.b()
            if (r1 == 0) goto L_0x0105
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            int r4 = YH.C16877v.y(r1, r4)
            r2.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L_0x00ef:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0103
            java.lang.Object r4 = r1.next()
            com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseArticleRemote r4 = (com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseArticleRemote) r4
            Hx.b r4 = r4.a()
            r2.add(r4)
            goto L_0x00ef
        L_0x0103:
            r8 = r2
            goto L_0x010a
        L_0x0105:
            java.util.List r1 = YH.C16877v.n()
            r8 = r1
        L_0x010a:
            Hx.c$c$c$a r1 = Hx.c.C2661c.C2663c.Companion
            java.lang.String r2 = r0.type
            Hx.c$c$c r11 = r1.a(r2)
            if (r5 != 0) goto L_0x011a
            java.util.List r1 = YH.C16877v.n()
            r14 = r1
            goto L_0x011b
        L_0x011a:
            r14 = r5
        L_0x011b:
            java.lang.String r13 = r0.carrier
            java.lang.String r15 = r0.deliveryNumber
            com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseDetailsRemote$OrderActionsRemote r1 = r0.actions
            if (r1 == 0) goto L_0x012f
            com.ingka.ikea.purchasehistorydata.impl.data.remote.OrderActionRemote$Action r1 = r1.b()
            if (r1 == 0) goto L_0x012f
            Hx.c$d$e r1 = r1.c()
            r10 = r1
            goto L_0x0130
        L_0x012f:
            r10 = r3
        L_0x0130:
            com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote$DeliveryAddressRemote r1 = r0.deliveryAddress
            if (r1 == 0) goto L_0x0138
            Hx.c$c$a r3 = r1.a()
        L_0x0138:
            r16 = r3
            Hx.c$c r1 = new Hx.c$c
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r1
        L_0x0141:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r0.f119496id
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Invalid delivery method id: "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r1.<init>(r4)
            qv.e r4 = qv.e.ERROR
            qv.d r5 = qv.d.f102012a
            java.util.List r5 = r5.a()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x016c:
            boolean r7 = r5.hasNext()
            r8 = 0
            if (r7 == 0) goto L_0x0184
            java.lang.Object r7 = r5.next()
            r9 = r7
            qv.b r9 = (qv.C11819b) r9
            boolean r8 = r9.b(r4, r8)
            if (r8 == 0) goto L_0x016c
            r6.add(r7)
            goto L_0x016c
        L_0x0184:
            java.util.Iterator r5 = r6.iterator()
            r6 = r3
            r7 = r6
        L_0x018a:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x0200
            java.lang.Object r9 = r5.next()
            r17 = r9
            qv.b r17 = (qv.C11819b) r17
            if (r6 != 0) goto L_0x01a4
            java.lang.String r6 = qv.C11818a.a(r3, r1)
            if (r6 == 0) goto L_0x0200
            java.lang.String r6 = qv.C11820c.a(r6)
        L_0x01a4:
            if (r7 != 0) goto L_0x01f2
            java.lang.Class<com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote> r7 = com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote.class
            java.lang.String r7 = r7.getName()
            kotlin.jvm.internal.C17542s.g(r7)
            r9 = 36
            r10 = 2
            java.lang.String r9 = HJ.C15854t.s1(r7, r9, r3, r10, r3)
            r11 = 46
            java.lang.String r9 = HJ.C15854t.o1(r9, r11, r3, r10, r3)
            int r10 = r9.length()
            if (r10 != 0) goto L_0x01c3
            goto L_0x01c9
        L_0x01c3:
            java.lang.String r7 = "Kt"
            java.lang.String r7 = HJ.C15854t.P0(r9, r7)
        L_0x01c9:
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            java.lang.String r9 = r9.getName()
            java.lang.String r10 = "main"
            boolean r9 = HJ.C15854t.b0(r9, r10, r2)
            if (r9 == 0) goto L_0x01dc
            java.lang.String r9 = "m"
            goto L_0x01de
        L_0x01dc:
            java.lang.String r9 = "b"
        L_0x01de:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            java.lang.String r9 = "|"
            r10.append(r9)
            r10.append(r7)
            java.lang.String r7 = r10.toString()
        L_0x01f2:
            r18 = r4
            r19 = r7
            r20 = r8
            r21 = r1
            r22 = r6
            r17.a(r18, r19, r20, r21, r22)
            goto L_0x018a
        L_0x0200:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote.convertToLocal():Hx.c$c");
    }

    public final DeliveryMethodRemote copy(String str, Articles articles2, List<StatusRemote> list, String str2, DeliveryDateRemote deliveryDateRemote, List<TrackingInformationRemote> list2, String str3, String str4, DeliveryAddressRemote deliveryAddressRemote, PurchaseDetailsRemote.OrderActionsRemote orderActionsRemote) {
        return new DeliveryMethodRemote(str, articles2, list, str2, deliveryDateRemote, list2, str3, str4, deliveryAddressRemote, orderActionsRemote);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryMethodRemote)) {
            return false;
        }
        DeliveryMethodRemote deliveryMethodRemote = (DeliveryMethodRemote) obj;
        return C17542s.e(this.f119496id, deliveryMethodRemote.f119496id) && C17542s.e(this.articles, deliveryMethodRemote.articles) && C17542s.e(this.statusV2, deliveryMethodRemote.statusV2) && C17542s.e(this.type, deliveryMethodRemote.type) && C17542s.e(this.deliveryDate, deliveryMethodRemote.deliveryDate) && C17542s.e(this.trackingInformation, deliveryMethodRemote.trackingInformation) && C17542s.e(this.carrier, deliveryMethodRemote.carrier) && C17542s.e(this.deliveryNumber, deliveryMethodRemote.deliveryNumber) && C17542s.e(this.deliveryAddress, deliveryMethodRemote.deliveryAddress) && C17542s.e(this.actions, deliveryMethodRemote.actions);
    }

    public final PurchaseDetailsRemote.OrderActionsRemote getActions() {
        return this.actions;
    }

    public final Articles getArticles() {
        return this.articles;
    }

    public final String getCarrier() {
        return this.carrier;
    }

    public final DeliveryAddressRemote getDeliveryAddress() {
        return this.deliveryAddress;
    }

    public final DeliveryDateRemote getDeliveryDate() {
        return this.deliveryDate;
    }

    public final String getDeliveryNumber() {
        return this.deliveryNumber;
    }

    public final String getId() {
        return this.f119496id;
    }

    public final List<StatusRemote> getStatusV2() {
        return this.statusV2;
    }

    public final List<TrackingInformationRemote> getTrackingInformation() {
        return this.trackingInformation;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.f119496id;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Articles articles2 = this.articles;
        int hashCode2 = (hashCode + (articles2 == null ? 0 : articles2.hashCode())) * 31;
        List<StatusRemote> list = this.statusV2;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.type;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DeliveryDateRemote deliveryDateRemote = this.deliveryDate;
        int hashCode5 = (hashCode4 + (deliveryDateRemote == null ? 0 : deliveryDateRemote.hashCode())) * 31;
        List<TrackingInformationRemote> list2 = this.trackingInformation;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str3 = this.carrier;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.deliveryNumber;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        DeliveryAddressRemote deliveryAddressRemote = this.deliveryAddress;
        int hashCode9 = (hashCode8 + (deliveryAddressRemote == null ? 0 : deliveryAddressRemote.hashCode())) * 31;
        PurchaseDetailsRemote.OrderActionsRemote orderActionsRemote = this.actions;
        if (orderActionsRemote != null) {
            i10 = orderActionsRemote.hashCode();
        }
        return hashCode9 + i10;
    }

    public String toString() {
        String str = this.f119496id;
        Articles articles2 = this.articles;
        List<StatusRemote> list = this.statusV2;
        String str2 = this.type;
        DeliveryDateRemote deliveryDateRemote = this.deliveryDate;
        List<TrackingInformationRemote> list2 = this.trackingInformation;
        String str3 = this.carrier;
        String str4 = this.deliveryNumber;
        DeliveryAddressRemote deliveryAddressRemote = this.deliveryAddress;
        PurchaseDetailsRemote.OrderActionsRemote orderActionsRemote = this.actions;
        return "DeliveryMethodRemote(id=" + str + ", articles=" + articles2 + ", statusV2=" + list + ", type=" + str2 + ", deliveryDate=" + deliveryDateRemote + ", trackingInformation=" + list2 + ", carrier=" + str3 + ", deliveryNumber=" + str4 + ", deliveryAddress=" + deliveryAddressRemote + ", actions=" + orderActionsRemote + ")";
    }

    public DeliveryMethodRemote(String str, Articles articles2, List<StatusRemote> list, String str2, DeliveryDateRemote deliveryDateRemote, List<TrackingInformationRemote> list2, String str3, String str4, DeliveryAddressRemote deliveryAddressRemote, PurchaseDetailsRemote.OrderActionsRemote orderActionsRemote) {
        this.f119496id = str;
        this.articles = articles2;
        this.statusV2 = list;
        this.type = str2;
        this.deliveryDate = deliveryDateRemote;
        this.trackingInformation = list2;
        this.carrier = str3;
        this.deliveryNumber = str4;
        this.deliveryAddress = deliveryAddressRemote;
        this.actions = orderActionsRemote;
    }
}
