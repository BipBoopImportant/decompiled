package com.ingka.ikea.purchasehistorydata.impl.data.remote;

import HJ.C15854t;
import Hx.c;
import Hx.f;
import YH.C16877v;
import androidx.annotation.Keep;
import com.ingka.ikea.purchasehistorydata.impl.data.remote.DeliveryMethodRemote;
import com.ingka.ikea.purchasehistorydata.impl.data.remote.OrderActionRemote;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Keep
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b#\b\b\u0018\u0000 a2\u00020\u0001:\u0003bcdB\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\r\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r¢\u0006\u0004\b\u0015\u0010\u0016B\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\r\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0015\u0010\u001bJ%\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\r2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010'\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0001¢\u0006\u0004\b%\u0010&J\u000f\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010,J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010,J\u0012\u0010/\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010,J\u0012\u00102\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b4\u00105J\u0018\u00106\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b8\u00109J\u0018\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b:\u00107J\u0018\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b;\u00107J¦\u0001\u0010<\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\r2\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b>\u0010,J\u0010\u0010?\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b?\u0010@J\u001a\u0010C\u001a\u00020B2\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bC\u0010DR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010E\u0012\u0004\bG\u0010H\u001a\u0004\bF\u0010,R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010E\u0012\u0004\bJ\u0010H\u001a\u0004\bI\u0010,R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010E\u0012\u0004\bL\u0010H\u001a\u0004\bK\u0010,R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010M\u0012\u0004\bN\u0010H\u001a\u0004\b\u001d\u00100R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\b\u0010E\u0012\u0004\bP\u0010H\u001a\u0004\bO\u0010,R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\n\u0010Q\u0012\u0004\bS\u0010H\u001a\u0004\bR\u00103R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\f\u0010T\u0012\u0004\bV\u0010H\u001a\u0004\bU\u00105R(\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010W\u0012\u0004\bY\u0010H\u001a\u0004\bX\u00107R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010Z\u0012\u0004\b\\\u0010H\u001a\u0004\b[\u00109R(\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\r8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010W\u0012\u0004\b^\u0010H\u001a\u0004\b]\u00107R(\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010W\u0012\u0004\b`\u0010H\u001a\u0004\b_\u00107¨\u0006e"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseDetailsRemote;", "", "", "id", "status", "type", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseDetailsRemote$OrderActionsRemote;", "actions", "storeName", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/CostsRemote;", "costs", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DateAndTimeRemote;", "dateAndTime", "", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote;", "deliveryMethods", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote$Articles;", "articles", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchasePaymentRemote;", "payments", "invoices", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseDetailsRemote$OrderActionsRemote;Ljava/lang/String;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/CostsRemote;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DateAndTimeRemote;Ljava/util/List;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote$Articles;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseDetailsRemote$OrderActionsRemote;Ljava/lang/String;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/CostsRemote;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DateAndTimeRemote;Ljava/util/List;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote$Articles;Ljava/util/List;Ljava/util/List;LjK/T0;)V", "LHx/c$d;", "getActions", "(Ljava/util/List;)Ljava/util/List;", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$purchasehistorydata_implementation_release", "(Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseDetailsRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "LHx/c;", "convertToLocal", "()LHx/c;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseDetailsRemote$OrderActionsRemote;", "component5", "component6", "()Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/CostsRemote;", "component7", "()Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DateAndTimeRemote;", "component8", "()Ljava/util/List;", "component9", "()Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote$Articles;", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseDetailsRemote$OrderActionsRemote;Ljava/lang/String;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/CostsRemote;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DateAndTimeRemote;Ljava/util/List;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote$Articles;Ljava/util/List;Ljava/util/List;)Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseDetailsRemote;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getStatus", "getStatus$annotations", "getType", "getType$annotations", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseDetailsRemote$OrderActionsRemote;", "getActions$annotations", "getStoreName", "getStoreName$annotations", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/CostsRemote;", "getCosts", "getCosts$annotations", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DateAndTimeRemote;", "getDateAndTime", "getDateAndTime$annotations", "Ljava/util/List;", "getDeliveryMethods", "getDeliveryMethods$annotations", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryMethodRemote$Articles;", "getArticles", "getArticles$annotations", "getPayments", "getPayments$annotations", "getInvoices", "getInvoices$annotations", "Companion", "OrderActionsRemote", "$serializer", "a", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PurchaseDetailsRemote {
    /* access modifiers changed from: private */
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, new C17451f(DeliveryMethodRemote$$serializer.INSTANCE), null, new C17451f(PurchasePaymentRemote$$serializer.INSTANCE), new C17451f(Y0.f144077a)};
    public static final int $stable = 8;
    public static final a Companion = new a((DefaultConstructorMarker) null);
    private final OrderActionsRemote actions;
    private final DeliveryMethodRemote.Articles articles;
    private final CostsRemote costs;
    private final DateAndTimeRemote dateAndTime;
    private final List<DeliveryMethodRemote> deliveryMethods;

    /* renamed from: id  reason: collision with root package name */
    private final String f119542id;
    private final List<String> invoices;
    private final List<PurchasePaymentRemote> payments;
    private final String status;
    private final String storeName;
    private final String type;

    @p
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u0000 -2\u00020\u0001:\u0002.\u0017B9\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u0010\"\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010$R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010)\u0012\u0004\b,\u0010&\u001a\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseDetailsRemote$OrderActionsRemote;", "", "", "seen0", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/OrderActionRemote$Action;", "cancellation", "reschedule", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/OrderActionRemote$AssemblyActionRemote;", "assembly", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/purchasehistorydata/impl/data/remote/OrderActionRemote$Action;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/OrderActionRemote$Action;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/OrderActionRemote$AssemblyActionRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseDetailsRemote$OrderActionsRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "LHx/c$d;", "a", "()Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/OrderActionRemote$Action;", "getCancellation", "()Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/OrderActionRemote$Action;", "getCancellation$annotations", "()V", "b", "getReschedule$annotations", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/OrderActionRemote$AssemblyActionRemote;", "getAssembly", "()Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/OrderActionRemote$AssemblyActionRemote;", "getAssembly$annotations", "Companion", "$serializer", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OrderActionsRemote {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: d  reason: collision with root package name */
        public static final int f119545d = 8;

        /* renamed from: a  reason: collision with root package name */
        private final OrderActionRemote.Action f119546a;

        /* renamed from: b  reason: collision with root package name */
        private final OrderActionRemote.Action f119547b;

        /* renamed from: c  reason: collision with root package name */
        private final OrderActionRemote.AssemblyActionRemote f119548c;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseDetailsRemote$OrderActionsRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseDetailsRemote$OrderActionsRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<OrderActionsRemote> serializer() {
                return PurchaseDetailsRemote$OrderActionsRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ OrderActionsRemote(int i10, OrderActionRemote.Action action, OrderActionRemote.Action action2, OrderActionRemote.AssemblyActionRemote assemblyActionRemote, T0 t02) {
            if (7 != (i10 & 7)) {
                E0.b(i10, 7, PurchaseDetailsRemote$OrderActionsRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f119546a = action;
            this.f119547b = action2;
            this.f119548c = assemblyActionRemote;
        }

        public static final /* synthetic */ void c(OrderActionsRemote orderActionsRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            OrderActionRemote$Action$$serializer orderActionRemote$Action$$serializer = OrderActionRemote$Action$$serializer.INSTANCE;
            dVar.B(serialDescriptor, 0, orderActionRemote$Action$$serializer, orderActionsRemote.f119546a);
            dVar.B(serialDescriptor, 1, orderActionRemote$Action$$serializer, orderActionsRemote.f119547b);
            dVar.B(serialDescriptor, 2, OrderActionRemote$AssemblyActionRemote$$serializer.INSTANCE, orderActionsRemote.f119548c);
        }

        public final List<c.d> a() {
            c.d.a a10;
            c.d.e c10;
            c.d.b b10;
            List c11 = C16877v.c();
            OrderActionRemote.Action action = this.f119546a;
            if (!(action == null || (b10 = action.b()) == null)) {
                c11.add(b10);
            }
            OrderActionRemote.Action action2 = this.f119547b;
            if (!(action2 == null || (c10 = action2.c()) == null)) {
                c11.add(c10);
            }
            OrderActionRemote.AssemblyActionRemote assemblyActionRemote = this.f119548c;
            if (!(assemblyActionRemote == null || (a10 = assemblyActionRemote.a()) == null)) {
                c11.add(a10);
            }
            return C16877v.a(c11);
        }

        public final OrderActionRemote.Action b() {
            return this.f119547b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OrderActionsRemote)) {
                return false;
            }
            OrderActionsRemote orderActionsRemote = (OrderActionsRemote) obj;
            return C17542s.e(this.f119546a, orderActionsRemote.f119546a) && C17542s.e(this.f119547b, orderActionsRemote.f119547b) && C17542s.e(this.f119548c, orderActionsRemote.f119548c);
        }

        public int hashCode() {
            OrderActionRemote.Action action = this.f119546a;
            int i10 = 0;
            int hashCode = (action == null ? 0 : action.hashCode()) * 31;
            OrderActionRemote.Action action2 = this.f119547b;
            int hashCode2 = (hashCode + (action2 == null ? 0 : action2.hashCode())) * 31;
            OrderActionRemote.AssemblyActionRemote assemblyActionRemote = this.f119548c;
            if (assemblyActionRemote != null) {
                i10 = assemblyActionRemote.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            OrderActionRemote.Action action = this.f119546a;
            OrderActionRemote.Action action2 = this.f119547b;
            OrderActionRemote.AssemblyActionRemote assemblyActionRemote = this.f119548c;
            return "OrderActionsRemote(cancellation=" + action + ", reschedule=" + action2 + ", assembly=" + assemblyActionRemote + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseDetailsRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseDetailsRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<PurchaseDetailsRemote> serializer() {
            return PurchaseDetailsRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PurchaseDetailsRemote(int i10, String str, String str2, String str3, OrderActionsRemote orderActionsRemote, String str4, CostsRemote costsRemote, DateAndTimeRemote dateAndTimeRemote, List list, DeliveryMethodRemote.Articles articles2, List list2, List list3, T0 t02) {
        if (2047 != (i10 & 2047)) {
            E0.b(i10, 2047, PurchaseDetailsRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f119542id = str;
        this.status = str2;
        this.type = str3;
        this.actions = orderActionsRemote;
        this.storeName = str4;
        this.costs = costsRemote;
        this.dateAndTime = dateAndTimeRemote;
        this.deliveryMethods = list;
        this.articles = articles2;
        this.payments = list2;
        this.invoices = list3;
    }

    public static /* synthetic */ PurchaseDetailsRemote copy$default(PurchaseDetailsRemote purchaseDetailsRemote, String str, String str2, String str3, OrderActionsRemote orderActionsRemote, String str4, CostsRemote costsRemote, DateAndTimeRemote dateAndTimeRemote, List list, DeliveryMethodRemote.Articles articles2, List list2, List list3, int i10, Object obj) {
        PurchaseDetailsRemote purchaseDetailsRemote2 = purchaseDetailsRemote;
        int i11 = i10;
        return purchaseDetailsRemote.copy((i11 & 1) != 0 ? purchaseDetailsRemote2.f119542id : str, (i11 & 2) != 0 ? purchaseDetailsRemote2.status : str2, (i11 & 4) != 0 ? purchaseDetailsRemote2.type : str3, (i11 & 8) != 0 ? purchaseDetailsRemote2.actions : orderActionsRemote, (i11 & 16) != 0 ? purchaseDetailsRemote2.storeName : str4, (i11 & 32) != 0 ? purchaseDetailsRemote2.costs : costsRemote, (i11 & 64) != 0 ? purchaseDetailsRemote2.dateAndTime : dateAndTimeRemote, (i11 & 128) != 0 ? purchaseDetailsRemote2.deliveryMethods : list, (i11 & 256) != 0 ? purchaseDetailsRemote2.articles : articles2, (i11 & 512) != 0 ? purchaseDetailsRemote2.payments : list2, (i11 & 1024) != 0 ? purchaseDetailsRemote2.invoices : list3);
    }

    public static /* synthetic */ void getActions$annotations() {
    }

    public static /* synthetic */ void getArticles$annotations() {
    }

    public static /* synthetic */ void getCosts$annotations() {
    }

    public static /* synthetic */ void getDateAndTime$annotations() {
    }

    public static /* synthetic */ void getDeliveryMethods$annotations() {
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public static /* synthetic */ void getInvoices$annotations() {
    }

    public static /* synthetic */ void getPayments$annotations() {
    }

    public static /* synthetic */ void getStatus$annotations() {
    }

    public static /* synthetic */ void getStoreName$annotations() {
    }

    public static /* synthetic */ void getType$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchasehistorydata_implementation_release(PurchaseDetailsRemote purchaseDetailsRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, purchaseDetailsRemote.f119542id);
        dVar.B(serialDescriptor, 1, y02, purchaseDetailsRemote.status);
        dVar.B(serialDescriptor, 2, y02, purchaseDetailsRemote.type);
        dVar.B(serialDescriptor, 3, PurchaseDetailsRemote$OrderActionsRemote$$serializer.INSTANCE, purchaseDetailsRemote.actions);
        dVar.B(serialDescriptor, 4, y02, purchaseDetailsRemote.storeName);
        dVar.B(serialDescriptor, 5, CostsRemote$$serializer.INSTANCE, purchaseDetailsRemote.costs);
        dVar.B(serialDescriptor, 6, DateAndTimeRemote$$serializer.INSTANCE, purchaseDetailsRemote.dateAndTime);
        dVar.B(serialDescriptor, 7, kSerializerArr[7], purchaseDetailsRemote.deliveryMethods);
        dVar.B(serialDescriptor, 8, DeliveryMethodRemote$Articles$$serializer.INSTANCE, purchaseDetailsRemote.articles);
        dVar.B(serialDescriptor, 9, kSerializerArr[9], purchaseDetailsRemote.payments);
        dVar.B(serialDescriptor, 10, kSerializerArr[10], purchaseDetailsRemote.invoices);
    }

    public final String component1() {
        return this.f119542id;
    }

    public final List<PurchasePaymentRemote> component10() {
        return this.payments;
    }

    public final List<String> component11() {
        return this.invoices;
    }

    public final String component2() {
        return this.status;
    }

    public final String component3() {
        return this.type;
    }

    public final OrderActionsRemote component4() {
        return this.actions;
    }

    public final String component5() {
        return this.storeName;
    }

    public final CostsRemote component6() {
        return this.costs;
    }

    public final DateAndTimeRemote component7() {
        return this.dateAndTime;
    }

    public final List<DeliveryMethodRemote> component8() {
        return this.deliveryMethods;
    }

    public final DeliveryMethodRemote.Articles component9() {
        return this.articles;
    }

    public final c convertToLocal() {
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        List<PurchaseArticleRemote> b10;
        DateAndTimeRemote dateAndTimeRemote = this.dateAndTime;
        c.a aVar = null;
        c.b convertToLocal = dateAndTimeRemote != null ? dateAndTimeRemote.convertToLocal() : null;
        String str2 = this.f119542id;
        if (str2 == null || C15854t.v0(str2) || (str = this.status) == null || C15854t.v0(str)) {
            return null;
        }
        c.e a10 = c.e.Companion.a(this.status);
        String str3 = this.f119542id;
        f a11 = PurchaseTypeRemote.Companion.a(this.type);
        String str4 = this.storeName;
        CostsRemote costsRemote = this.costs;
        if (costsRemote != null) {
            aVar = costsRemote.convertToLocal();
        }
        c.a aVar2 = aVar;
        List<DeliveryMethodRemote> list = this.deliveryMethods;
        if (list != null) {
            Iterable<DeliveryMethodRemote> iterable = list;
            ArrayList arrayList4 = new ArrayList(C16877v.y(iterable, 10));
            for (DeliveryMethodRemote convertToLocal2 : iterable) {
                arrayList4.add(convertToLocal2.convertToLocal());
            }
            arrayList = arrayList4;
        } else {
            arrayList = C16877v.n();
        }
        DeliveryMethodRemote.Articles articles2 = this.articles;
        if (articles2 == null || (b10 = articles2.b()) == null) {
            arrayList2 = C16877v.n();
        } else {
            Iterable<PurchaseArticleRemote> iterable2 = b10;
            ArrayList arrayList5 = new ArrayList(C16877v.y(iterable2, 10));
            for (PurchaseArticleRemote a12 : iterable2) {
                arrayList5.add(a12.a());
            }
            arrayList2 = arrayList5;
        }
        List<PurchasePaymentRemote> list2 = this.payments;
        if (list2 != null) {
            Iterable<PurchasePaymentRemote> iterable3 = list2;
            ArrayList arrayList6 = new ArrayList(C16877v.y(iterable3, 10));
            for (PurchasePaymentRemote a13 : iterable3) {
                arrayList6.add(a13.a());
            }
            arrayList3 = arrayList6;
        } else {
            arrayList3 = C16877v.n();
        }
        return new c(str3, a11, a10, convertToLocal, str4, aVar2, arrayList, arrayList2, arrayList3, getActions(this.invoices));
    }

    public final PurchaseDetailsRemote copy(String str, String str2, String str3, OrderActionsRemote orderActionsRemote, String str4, CostsRemote costsRemote, DateAndTimeRemote dateAndTimeRemote, List<DeliveryMethodRemote> list, DeliveryMethodRemote.Articles articles2, List<PurchasePaymentRemote> list2, List<String> list3) {
        return new PurchaseDetailsRemote(str, str2, str3, orderActionsRemote, str4, costsRemote, dateAndTimeRemote, list, articles2, list2, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseDetailsRemote)) {
            return false;
        }
        PurchaseDetailsRemote purchaseDetailsRemote = (PurchaseDetailsRemote) obj;
        return C17542s.e(this.f119542id, purchaseDetailsRemote.f119542id) && C17542s.e(this.status, purchaseDetailsRemote.status) && C17542s.e(this.type, purchaseDetailsRemote.type) && C17542s.e(this.actions, purchaseDetailsRemote.actions) && C17542s.e(this.storeName, purchaseDetailsRemote.storeName) && C17542s.e(this.costs, purchaseDetailsRemote.costs) && C17542s.e(this.dateAndTime, purchaseDetailsRemote.dateAndTime) && C17542s.e(this.deliveryMethods, purchaseDetailsRemote.deliveryMethods) && C17542s.e(this.articles, purchaseDetailsRemote.articles) && C17542s.e(this.payments, purchaseDetailsRemote.payments) && C17542s.e(this.invoices, purchaseDetailsRemote.invoices);
    }

    public final OrderActionsRemote getActions() {
        return this.actions;
    }

    public final DeliveryMethodRemote.Articles getArticles() {
        return this.articles;
    }

    public final CostsRemote getCosts() {
        return this.costs;
    }

    public final DateAndTimeRemote getDateAndTime() {
        return this.dateAndTime;
    }

    public final List<DeliveryMethodRemote> getDeliveryMethods() {
        return this.deliveryMethods;
    }

    public final String getId() {
        return this.f119542id;
    }

    public final List<String> getInvoices() {
        return this.invoices;
    }

    public final List<PurchasePaymentRemote> getPayments() {
        return this.payments;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getStoreName() {
        return this.storeName;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.f119542id;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.status;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        OrderActionsRemote orderActionsRemote = this.actions;
        int hashCode4 = (hashCode3 + (orderActionsRemote == null ? 0 : orderActionsRemote.hashCode())) * 31;
        String str4 = this.storeName;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        CostsRemote costsRemote = this.costs;
        int hashCode6 = (hashCode5 + (costsRemote == null ? 0 : costsRemote.hashCode())) * 31;
        DateAndTimeRemote dateAndTimeRemote = this.dateAndTime;
        int hashCode7 = (hashCode6 + (dateAndTimeRemote == null ? 0 : dateAndTimeRemote.hashCode())) * 31;
        List<DeliveryMethodRemote> list = this.deliveryMethods;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        DeliveryMethodRemote.Articles articles2 = this.articles;
        int hashCode9 = (hashCode8 + (articles2 == null ? 0 : articles2.hashCode())) * 31;
        List<PurchasePaymentRemote> list2 = this.payments;
        int hashCode10 = (hashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.invoices;
        if (list3 != null) {
            i10 = list3.hashCode();
        }
        return hashCode10 + i10;
    }

    public String toString() {
        String str = this.f119542id;
        String str2 = this.status;
        String str3 = this.type;
        OrderActionsRemote orderActionsRemote = this.actions;
        String str4 = this.storeName;
        CostsRemote costsRemote = this.costs;
        DateAndTimeRemote dateAndTimeRemote = this.dateAndTime;
        List<DeliveryMethodRemote> list = this.deliveryMethods;
        DeliveryMethodRemote.Articles articles2 = this.articles;
        List<PurchasePaymentRemote> list2 = this.payments;
        List<String> list3 = this.invoices;
        return "PurchaseDetailsRemote(id=" + str + ", status=" + str2 + ", type=" + str3 + ", actions=" + orderActionsRemote + ", storeName=" + str4 + ", costs=" + costsRemote + ", dateAndTime=" + dateAndTimeRemote + ", deliveryMethods=" + list + ", articles=" + articles2 + ", payments=" + list2 + ", invoices=" + list3 + ")";
    }

    public PurchaseDetailsRemote(String str, String str2, String str3, OrderActionsRemote orderActionsRemote, String str4, CostsRemote costsRemote, DateAndTimeRemote dateAndTimeRemote, List<DeliveryMethodRemote> list, DeliveryMethodRemote.Articles articles2, List<PurchasePaymentRemote> list2, List<String> list3) {
        this.f119542id = str;
        this.status = str2;
        this.type = str3;
        this.actions = orderActionsRemote;
        this.storeName = str4;
        this.costs = costsRemote;
        this.dateAndTime = dateAndTimeRemote;
        this.deliveryMethods = list;
        this.articles = articles2;
        this.payments = list2;
        this.invoices = list3;
    }

    private final List<c.d> getActions(List<String> list) {
        List list2;
        List<c.d> a10;
        List c10 = C16877v.c();
        OrderActionsRemote orderActionsRemote = this.actions;
        if (!(orderActionsRemote == null || (a10 = orderActionsRemote.a()) == null)) {
            c10.addAll(a10);
        }
        if (list != null) {
            Iterable<String> iterable = list;
            list2 = new ArrayList(C16877v.y(iterable, 10));
            for (String dVar : iterable) {
                list2.add(new c.d.C2666d(dVar));
            }
        } else {
            list2 = C16877v.n();
        }
        if (!list2.isEmpty()) {
            c10.add(new c.d.f(true, list2));
        }
        return C16877v.a(c10);
    }
}
