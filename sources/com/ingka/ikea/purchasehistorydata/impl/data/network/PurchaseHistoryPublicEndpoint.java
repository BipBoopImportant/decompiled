package com.ingka.ikea.purchasehistorydata.impl.data.network;

import GK.C15777E;
import QL.x;
import VL.C16699a;
import VL.C16712n;
import VL.o;
import VL.s;
import com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseDetailsRemote;
import com.ingka.ikea.purchasehistorydata.impl.data.remote.RescheduleDeliveryRemote;
import dI.C17164e;
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

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bb\u0018\u00002\u00020\u0001:\u0004\u0019\u001a\u001b\u001cJ$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ4\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0013\u0010\u0014J*\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/network/PurchaseHistoryPublicEndpoint;", "", "", "orderId", "Lcom/ingka/ikea/purchasehistorydata/impl/data/network/PurchaseHistoryPublicEndpoint$OrderLookupBody;", "body", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseDetailsRemote;", "c", "(Ljava/lang/String;Lcom/ingka/ikea/purchasehistorydata/impl/data/network/PurchaseHistoryPublicEndpoint$OrderLookupBody;LdI/e;)Ljava/lang/Object;", "reasonCode", "Lcom/ingka/ikea/purchasehistorydata/impl/data/network/PurchaseHistoryPublicEndpoint$CancelOrderBody;", "cancelOrderBody", "LQL/x;", "LGK/E;", "d", "(Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/purchasehistorydata/impl/data/network/PurchaseHistoryPublicEndpoint$CancelOrderBody;LdI/e;)Ljava/lang/Object;", "Lcom/ingka/ikea/purchasehistorydata/impl/data/network/PurchaseHistoryPublicEndpoint$RescheduleGetTimeWindowsBody;", "rescheduleGetTimeWindowsBody", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/RescheduleDeliveryRemote;", "b", "(Ljava/lang/String;Lcom/ingka/ikea/purchasehistorydata/impl/data/network/PurchaseHistoryPublicEndpoint$RescheduleGetTimeWindowsBody;LdI/e;)Ljava/lang/Object;", "Lcom/ingka/ikea/purchasehistorydata/impl/data/network/PurchaseHistoryPublicEndpoint$RescheduleTimeWindowBody;", "rescheduleOrderBody", "a", "(Ljava/lang/String;Lcom/ingka/ikea/purchasehistorydata/impl/data/network/PurchaseHistoryPublicEndpoint$RescheduleTimeWindowBody;LdI/e;)Ljava/lang/Object;", "OrderLookupBody", "CancelOrderBody", "RescheduleGetTimeWindowsBody", "RescheduleTimeWindowBody", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
interface PurchaseHistoryPublicEndpoint {

    @p
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0002 \u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001b\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u0014¨\u0006!"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/network/PurchaseHistoryPublicEndpoint$CancelOrderBody;", "", "", "cancelToken", "<init>", "(Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/purchasehistorydata/impl/data/network/PurchaseHistoryPublicEndpoint$CancelOrderBody;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCancelToken", "getCancelToken$annotations", "()V", "Companion", "$serializer", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CancelOrderBody {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f119403a;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/network/PurchaseHistoryPublicEndpoint$CancelOrderBody$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/purchasehistorydata/impl/data/network/PurchaseHistoryPublicEndpoint$CancelOrderBody;", "serializer", "()Lkotlinx/serialization/KSerializer;", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<CancelOrderBody> serializer() {
                return PurchaseHistoryPublicEndpoint$CancelOrderBody$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ CancelOrderBody(int i10, String str, T0 t02) {
            if (1 != (i10 & 1)) {
                E0.b(i10, 1, PurchaseHistoryPublicEndpoint$CancelOrderBody$$serializer.INSTANCE.getDescriptor());
            }
            this.f119403a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CancelOrderBody) && C17542s.e(this.f119403a, ((CancelOrderBody) obj).f119403a);
        }

        public int hashCode() {
            return this.f119403a.hashCode();
        }

        public String toString() {
            String str = this.f119403a;
            return "CancelOrderBody(cancelToken=" + str + ")";
        }

        public CancelOrderBody(String str) {
            C17542s.j(str, "cancelToken");
            this.f119403a = str;
        }
    }

    @p
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0002 \u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001b\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u0014¨\u0006!"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/network/PurchaseHistoryPublicEndpoint$OrderLookupBody;", "", "", "liteId", "<init>", "(Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/purchasehistorydata/impl/data/network/PurchaseHistoryPublicEndpoint$OrderLookupBody;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLiteId", "getLiteId$annotations", "()V", "Companion", "$serializer", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OrderLookupBody {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f119404a;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/network/PurchaseHistoryPublicEndpoint$OrderLookupBody$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/purchasehistorydata/impl/data/network/PurchaseHistoryPublicEndpoint$OrderLookupBody;", "serializer", "()Lkotlinx/serialization/KSerializer;", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<OrderLookupBody> serializer() {
                return PurchaseHistoryPublicEndpoint$OrderLookupBody$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ OrderLookupBody(int i10, String str, T0 t02) {
            if (1 != (i10 & 1)) {
                E0.b(i10, 1, PurchaseHistoryPublicEndpoint$OrderLookupBody$$serializer.INSTANCE.getDescriptor());
            }
            this.f119404a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OrderLookupBody) && C17542s.e(this.f119404a, ((OrderLookupBody) obj).f119404a);
        }

        public int hashCode() {
            return this.f119404a.hashCode();
        }

        public String toString() {
            String str = this.f119404a;
            return "OrderLookupBody(liteId=" + str + ")";
        }

        public OrderLookupBody(String str) {
            C17542s.j(str, "liteId");
            this.f119404a = str;
        }
    }

    @p
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 #2\u00020\u0001:\u0002$\u0012B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0015R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010\u001c\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u0015¨\u0006%"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/network/PurchaseHistoryPublicEndpoint$RescheduleGetTimeWindowsBody;", "", "", "rescheduleToken", "deliveryNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/purchasehistorydata/impl/data/network/PurchaseHistoryPublicEndpoint$RescheduleGetTimeWindowsBody;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRescheduleToken", "getRescheduleToken$annotations", "()V", "b", "getDeliveryNumber", "getDeliveryNumber$annotations", "Companion", "$serializer", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RescheduleGetTimeWindowsBody {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f119405a;

        /* renamed from: b  reason: collision with root package name */
        private final String f119406b;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/network/PurchaseHistoryPublicEndpoint$RescheduleGetTimeWindowsBody$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/purchasehistorydata/impl/data/network/PurchaseHistoryPublicEndpoint$RescheduleGetTimeWindowsBody;", "serializer", "()Lkotlinx/serialization/KSerializer;", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<RescheduleGetTimeWindowsBody> serializer() {
                return PurchaseHistoryPublicEndpoint$RescheduleGetTimeWindowsBody$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ RescheduleGetTimeWindowsBody(int i10, String str, String str2, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, PurchaseHistoryPublicEndpoint$RescheduleGetTimeWindowsBody$$serializer.INSTANCE.getDescriptor());
            }
            this.f119405a = str;
            this.f119406b = str2;
        }

        public static final /* synthetic */ void a(RescheduleGetTimeWindowsBody rescheduleGetTimeWindowsBody, C17395d dVar, SerialDescriptor serialDescriptor) {
            dVar.y(serialDescriptor, 0, rescheduleGetTimeWindowsBody.f119405a);
            dVar.B(serialDescriptor, 1, Y0.f144077a, rescheduleGetTimeWindowsBody.f119406b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RescheduleGetTimeWindowsBody)) {
                return false;
            }
            RescheduleGetTimeWindowsBody rescheduleGetTimeWindowsBody = (RescheduleGetTimeWindowsBody) obj;
            return C17542s.e(this.f119405a, rescheduleGetTimeWindowsBody.f119405a) && C17542s.e(this.f119406b, rescheduleGetTimeWindowsBody.f119406b);
        }

        public int hashCode() {
            int hashCode = this.f119405a.hashCode() * 31;
            String str = this.f119406b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.f119405a;
            String str2 = this.f119406b;
            return "RescheduleGetTimeWindowsBody(rescheduleToken=" + str + ", deliveryNumber=" + str2 + ")";
        }

        public RescheduleGetTimeWindowsBody(String str, String str2) {
            C17542s.j(str, "rescheduleToken");
            this.f119405a = str;
            this.f119406b = str2;
        }
    }

    @p
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u0000 '2\u00020\u0001:\u0003()\u001eB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0017R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010#\u0012\u0004\b&\u0010\"\u001a\u0004\b$\u0010%¨\u0006*"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/network/PurchaseHistoryPublicEndpoint$RescheduleTimeWindowBody;", "", "", "rescheduleToken", "", "Lcom/ingka/ikea/purchasehistorydata/impl/data/network/PurchaseHistoryPublicEndpoint$RescheduleTimeWindowBody$SelectedTimeWindows;", "selectedTimeWindows", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/purchasehistorydata/impl/data/network/PurchaseHistoryPublicEndpoint$RescheduleTimeWindowBody;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getRescheduleToken", "getRescheduleToken$annotations", "()V", "Ljava/util/List;", "getSelectedTimeWindows", "()Ljava/util/List;", "getSelectedTimeWindows$annotations", "Companion", "SelectedTimeWindows", "$serializer", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RescheduleTimeWindowBody {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: c  reason: collision with root package name */
        public static final int f119407c = 8;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public static final KSerializer<Object>[] f119408d = {null, new C17451f(PurchaseHistoryPublicEndpoint$RescheduleTimeWindowBody$SelectedTimeWindows$$serializer.INSTANCE)};

        /* renamed from: a  reason: collision with root package name */
        private final String f119409a;

        /* renamed from: b  reason: collision with root package name */
        private final List<SelectedTimeWindows> f119410b;

        @p
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\b\u0018\u0000 %2\u00020\u0001:\u0002&\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0016R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b$\u0010\u001f\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/network/PurchaseHistoryPublicEndpoint$RescheduleTimeWindowBody$SelectedTimeWindows;", "", "", "id", "", "authorityToLeave", "<init>", "(Ljava/lang/String;Z)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;ZLjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/purchasehistorydata/impl/data/network/PurchaseHistoryPublicEndpoint$RescheduleTimeWindowBody$SelectedTimeWindows;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "b", "Z", "getAuthorityToLeave", "()Z", "getAuthorityToLeave$annotations", "Companion", "$serializer", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class SelectedTimeWindows {
            public static final a Companion = new a((DefaultConstructorMarker) null);

            /* renamed from: a  reason: collision with root package name */
            private final String f119411a;

            /* renamed from: b  reason: collision with root package name */
            private final boolean f119412b;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/network/PurchaseHistoryPublicEndpoint$RescheduleTimeWindowBody$SelectedTimeWindows$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/purchasehistorydata/impl/data/network/PurchaseHistoryPublicEndpoint$RescheduleTimeWindowBody$SelectedTimeWindows;", "serializer", "()Lkotlinx/serialization/KSerializer;", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a {
                private a() {
                }

                public final KSerializer<SelectedTimeWindows> serializer() {
                    return PurchaseHistoryPublicEndpoint$RescheduleTimeWindowBody$SelectedTimeWindows$$serializer.INSTANCE;
                }

                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ SelectedTimeWindows(int i10, String str, boolean z10, T0 t02) {
                if (3 != (i10 & 3)) {
                    E0.b(i10, 3, PurchaseHistoryPublicEndpoint$RescheduleTimeWindowBody$SelectedTimeWindows$$serializer.INSTANCE.getDescriptor());
                }
                this.f119411a = str;
                this.f119412b = z10;
            }

            public static final /* synthetic */ void a(SelectedTimeWindows selectedTimeWindows, C17395d dVar, SerialDescriptor serialDescriptor) {
                dVar.y(serialDescriptor, 0, selectedTimeWindows.f119411a);
                dVar.x(serialDescriptor, 1, selectedTimeWindows.f119412b);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SelectedTimeWindows)) {
                    return false;
                }
                SelectedTimeWindows selectedTimeWindows = (SelectedTimeWindows) obj;
                return C17542s.e(this.f119411a, selectedTimeWindows.f119411a) && this.f119412b == selectedTimeWindows.f119412b;
            }

            public int hashCode() {
                return (this.f119411a.hashCode() * 31) + Boolean.hashCode(this.f119412b);
            }

            public String toString() {
                String str = this.f119411a;
                boolean z10 = this.f119412b;
                return "SelectedTimeWindows(id=" + str + ", authorityToLeave=" + z10 + ")";
            }

            public SelectedTimeWindows(String str, boolean z10) {
                C17542s.j(str, "id");
                this.f119411a = str;
                this.f119412b = z10;
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/network/PurchaseHistoryPublicEndpoint$RescheduleTimeWindowBody$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/purchasehistorydata/impl/data/network/PurchaseHistoryPublicEndpoint$RescheduleTimeWindowBody;", "serializer", "()Lkotlinx/serialization/KSerializer;", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<RescheduleTimeWindowBody> serializer() {
                return PurchaseHistoryPublicEndpoint$RescheduleTimeWindowBody$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ RescheduleTimeWindowBody(int i10, String str, List list, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, PurchaseHistoryPublicEndpoint$RescheduleTimeWindowBody$$serializer.INSTANCE.getDescriptor());
            }
            this.f119409a = str;
            this.f119410b = list;
        }

        public static final /* synthetic */ void b(RescheduleTimeWindowBody rescheduleTimeWindowBody, C17395d dVar, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = f119408d;
            dVar.y(serialDescriptor, 0, rescheduleTimeWindowBody.f119409a);
            dVar.i(serialDescriptor, 1, kSerializerArr[1], rescheduleTimeWindowBody.f119410b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RescheduleTimeWindowBody)) {
                return false;
            }
            RescheduleTimeWindowBody rescheduleTimeWindowBody = (RescheduleTimeWindowBody) obj;
            return C17542s.e(this.f119409a, rescheduleTimeWindowBody.f119409a) && C17542s.e(this.f119410b, rescheduleTimeWindowBody.f119410b);
        }

        public int hashCode() {
            return (this.f119409a.hashCode() * 31) + this.f119410b.hashCode();
        }

        public String toString() {
            String str = this.f119409a;
            List<SelectedTimeWindows> list = this.f119410b;
            return "RescheduleTimeWindowBody(rescheduleToken=" + str + ", selectedTimeWindows=" + list + ")";
        }

        public RescheduleTimeWindowBody(String str, List<SelectedTimeWindows> list) {
            C17542s.j(str, "rescheduleToken");
            C17542s.j(list, "selectedTimeWindows");
            this.f119409a = str;
            this.f119410b = list;
        }
    }

    @C16712n("customer/v6/{cc}/{lc}/purchase-history/reschedule/{orderId}")
    Object a(@s("orderId") String str, @C16699a RescheduleTimeWindowBody rescheduleTimeWindowBody, C17164e<? super x<C15777E>> eVar);

    @o("customer/v6/{cc}/{lc}/purchase-history/reschedule/{orderId}")
    Object b(@s("orderId") String str, @C16699a RescheduleGetTimeWindowsBody rescheduleGetTimeWindowsBody, C17164e<? super RescheduleDeliveryRemote> eVar);

    @o("customer/v6/{cc}/{lc}/purchase-history/order/{orderId}")
    Object c(@s("orderId") String str, @C16699a OrderLookupBody orderLookupBody, C17164e<? super PurchaseDetailsRemote> eVar);

    @C16712n("customer/v6/{cc}/{lc}/purchase-history/order/{orderId}/{reasonCode}")
    Object d(@s("orderId") String str, @s("reasonCode") String str2, @C16699a CancelOrderBody cancelOrderBody, C17164e<? super x<C15777E>> eVar);
}
