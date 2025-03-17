package com.ingka.ikea.checkout.datalayer.impl.repo.network;

import QL.x;
import VL.C16699a;
import VL.C16704f;
import VL.C16706h;
import VL.o;
import VL.t;
import XH.C16807N;
import com.ingka.ikea.checkout.datalayer.impl.repo.network.model.InitiatePaymentResponse;
import com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote;
import com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote;
import dI.C17164e;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b`\u0018\u00002\u00020\u0001:\u000b./012345678J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\b\u0010\tJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u0017\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\b\u0001\u0010\u0003\u001a\u00020\u001bH§@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\b\u0001\u0010\u0003\u001a\u00020\u001fH§@¢\u0006\u0004\b!\u0010\"J\u001a\u0010#\u001a\u00020 2\b\b\u0001\u0010\u0017\u001a\u00020\u0016H§@¢\u0006\u0004\b#\u0010\u001aJ\u001a\u0010%\u001a\u00020 2\b\b\u0001\u0010\u0003\u001a\u00020$H§@¢\u0006\u0004\b%\u0010&J \u0010(\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b2\b\b\u0001\u0010\u0003\u001a\u00020'H§@¢\u0006\u0004\b(\u0010)J \u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u000b2\b\b\u0001\u0010\u0003\u001a\u00020*H§@¢\u0006\u0004\b,\u0010-¨\u00069"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint;", "", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$CreatePspSessionBody;", "data", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PspSessionRemote;", "k", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$CreatePspSessionBody;LdI/e;)Ljava/lang/Object;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$OnlineTransferSessionBody;", "j", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$OnlineTransferSessionBody;LdI/e;)Ljava/lang/Object;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$PrepaidPaymentBody;", "LQL/x;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PrepaidResponse;", "l", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$PrepaidPaymentBody;LdI/e;)Ljava/lang/Object;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$ExternalPaymentBody;", "LXH/N;", "c", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$ExternalPaymentBody;LdI/e;)Ljava/lang/Object;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$DeletePrepaidPaymentBody;", "b", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$DeletePrepaidPaymentBody;LdI/e;)Ljava/lang/Object;", "", "paymentContextId", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote;", "i", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$InitiatePaymentBody;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/InitiatePaymentResponse;", "e", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$InitiatePaymentBody;LdI/e;)Ljava/lang/Object;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$InitiateExpressPaymentBody;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote;", "f", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$InitiateExpressPaymentBody;LdI/e;)Ljava/lang/Object;", "g", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$CompletePaymentBody;", "d", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$CompletePaymentBody;LdI/e;)Ljava/lang/Object;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$DeletePaymentSessionBody;", "h", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$DeletePaymentSessionBody;LdI/e;)Ljava/lang/Object;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$ExpressAddressBody;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/ExpressAddressResponse;", "a", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$ExpressAddressBody;LdI/e;)Ljava/lang/Object;", "InitiatePaymentBody", "InitiateExpressPaymentBody", "CompletePaymentBody", "DeletePaymentSessionBody", "PrepaidPaymentBody", "DeletePrepaidPaymentBody", "ExternalPaymentBody", "CreatePspSessionBody", "OnlineTransferSessionBody", "ExpressAddressBody", "GooglePayTaxInfo", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface PaymentEndpoint {

    @p
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\b\u0018\u0000 %2\u00020\u0001:\u0002&\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0016R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b$\u0010\u001f\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$CompletePaymentBody;", "", "", "paymentContextId", "", "usePaymentOnDelivery", "<init>", "(Ljava/lang/String;Z)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;ZLjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$CompletePaymentBody;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPaymentContextId", "getPaymentContextId$annotations", "()V", "b", "Z", "getUsePaymentOnDelivery", "()Z", "getUsePaymentOnDelivery$annotations", "Companion", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CompletePaymentBody {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f93689a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f93690b;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$CompletePaymentBody$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$CompletePaymentBody;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<CompletePaymentBody> serializer() {
                return PaymentEndpoint$CompletePaymentBody$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ CompletePaymentBody(int i10, String str, boolean z10, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, PaymentEndpoint$CompletePaymentBody$$serializer.INSTANCE.getDescriptor());
            }
            this.f93689a = str;
            this.f93690b = z10;
        }

        public static final /* synthetic */ void a(CompletePaymentBody completePaymentBody, C17395d dVar, SerialDescriptor serialDescriptor) {
            dVar.y(serialDescriptor, 0, completePaymentBody.f93689a);
            dVar.x(serialDescriptor, 1, completePaymentBody.f93690b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CompletePaymentBody)) {
                return false;
            }
            CompletePaymentBody completePaymentBody = (CompletePaymentBody) obj;
            return C17542s.e(this.f93689a, completePaymentBody.f93689a) && this.f93690b == completePaymentBody.f93690b;
        }

        public int hashCode() {
            return (this.f93689a.hashCode() * 31) + Boolean.hashCode(this.f93690b);
        }

        public String toString() {
            String str = this.f93689a;
            boolean z10 = this.f93690b;
            return "CompletePaymentBody(paymentContextId=" + str + ", usePaymentOnDelivery=" + z10 + ")";
        }

        public CompletePaymentBody(String str, boolean z10) {
            C17542s.j(str, "paymentContextId");
            this.f93689a = str;
            this.f93690b = z10;
        }
    }

    @p
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 #2\u00020\u0001:\u0002$\u0012B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0015R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010\u001c\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u0015¨\u0006%"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$CreatePspSessionBody;", "", "", "paymentContextId", "shopperResultUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$CreatePspSessionBody;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPaymentContextId", "getPaymentContextId$annotations", "()V", "b", "getShopperResultUrl", "getShopperResultUrl$annotations", "Companion", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CreatePspSessionBody {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f93691a;

        /* renamed from: b  reason: collision with root package name */
        private final String f93692b;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$CreatePspSessionBody$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$CreatePspSessionBody;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<CreatePspSessionBody> serializer() {
                return PaymentEndpoint$CreatePspSessionBody$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ CreatePspSessionBody(int i10, String str, String str2, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, PaymentEndpoint$CreatePspSessionBody$$serializer.INSTANCE.getDescriptor());
            }
            this.f93691a = str;
            this.f93692b = str2;
        }

        public static final /* synthetic */ void a(CreatePspSessionBody createPspSessionBody, C17395d dVar, SerialDescriptor serialDescriptor) {
            dVar.y(serialDescriptor, 0, createPspSessionBody.f93691a);
            dVar.B(serialDescriptor, 1, Y0.f144077a, createPspSessionBody.f93692b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CreatePspSessionBody)) {
                return false;
            }
            CreatePspSessionBody createPspSessionBody = (CreatePspSessionBody) obj;
            return C17542s.e(this.f93691a, createPspSessionBody.f93691a) && C17542s.e(this.f93692b, createPspSessionBody.f93692b);
        }

        public int hashCode() {
            int hashCode = this.f93691a.hashCode() * 31;
            String str = this.f93692b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.f93691a;
            String str2 = this.f93692b;
            return "CreatePspSessionBody(paymentContextId=" + str + ", shopperResultUrl=" + str2 + ")";
        }

        public CreatePspSessionBody(String str, String str2) {
            C17542s.j(str, "paymentContextId");
            this.f93691a = str;
            this.f93692b = str2;
        }
    }

    @p
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0002 \u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001b\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u0014¨\u0006!"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$DeletePaymentSessionBody;", "", "", "paymentContextId", "<init>", "(Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$DeletePaymentSessionBody;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPaymentContextId", "getPaymentContextId$annotations", "()V", "Companion", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeletePaymentSessionBody {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f93693a;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$DeletePaymentSessionBody$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$DeletePaymentSessionBody;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<DeletePaymentSessionBody> serializer() {
                return PaymentEndpoint$DeletePaymentSessionBody$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ DeletePaymentSessionBody(int i10, String str, T0 t02) {
            if (1 != (i10 & 1)) {
                E0.b(i10, 1, PaymentEndpoint$DeletePaymentSessionBody$$serializer.INSTANCE.getDescriptor());
            }
            this.f93693a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeletePaymentSessionBody) && C17542s.e(this.f93693a, ((DeletePaymentSessionBody) obj).f93693a);
        }

        public int hashCode() {
            return this.f93693a.hashCode();
        }

        public String toString() {
            String str = this.f93693a;
            return "DeletePaymentSessionBody(paymentContextId=" + str + ")";
        }

        public DeletePaymentSessionBody(String str) {
            C17542s.j(str, "paymentContextId");
            this.f93693a = str;
        }
    }

    @p
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 #2\u00020\u0001:\u0002$\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0015R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010\u001c\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u0015¨\u0006%"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$DeletePrepaidPaymentBody;", "", "", "paymentContextId", "iopgId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$DeletePrepaidPaymentBody;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPaymentContextId", "getPaymentContextId$annotations", "()V", "b", "getIopgId", "getIopgId$annotations", "Companion", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeletePrepaidPaymentBody {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f93694a;

        /* renamed from: b  reason: collision with root package name */
        private final String f93695b;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$DeletePrepaidPaymentBody$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$DeletePrepaidPaymentBody;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<DeletePrepaidPaymentBody> serializer() {
                return PaymentEndpoint$DeletePrepaidPaymentBody$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ DeletePrepaidPaymentBody(int i10, String str, String str2, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, PaymentEndpoint$DeletePrepaidPaymentBody$$serializer.INSTANCE.getDescriptor());
            }
            this.f93694a = str;
            this.f93695b = str2;
        }

        public static final /* synthetic */ void a(DeletePrepaidPaymentBody deletePrepaidPaymentBody, C17395d dVar, SerialDescriptor serialDescriptor) {
            dVar.y(serialDescriptor, 0, deletePrepaidPaymentBody.f93694a);
            dVar.y(serialDescriptor, 1, deletePrepaidPaymentBody.f93695b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeletePrepaidPaymentBody)) {
                return false;
            }
            DeletePrepaidPaymentBody deletePrepaidPaymentBody = (DeletePrepaidPaymentBody) obj;
            return C17542s.e(this.f93694a, deletePrepaidPaymentBody.f93694a) && C17542s.e(this.f93695b, deletePrepaidPaymentBody.f93695b);
        }

        public int hashCode() {
            return (this.f93694a.hashCode() * 31) + this.f93695b.hashCode();
        }

        public String toString() {
            String str = this.f93694a;
            String str2 = this.f93695b;
            return "DeletePrepaidPaymentBody(paymentContextId=" + str + ", iopgId=" + str2 + ")";
        }

        public DeletePrepaidPaymentBody(String str, String str2) {
            C17542s.j(str, "paymentContextId");
            C17542s.j(str2, "iopgId");
            this.f93694a = str;
            this.f93695b = str2;
        }
    }

    @p
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u0000 *2\u00020\u0001:\u0002+\u0014B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0017R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u001e\u0012\u0004\b$\u0010!\u001a\u0004\b#\u0010\u0017R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b)\u0010!\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$ExpressAddressBody;", "", "", "checkoutId", "googlePayPaymentDataJson", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$GooglePayTaxInfo;", "googlePayTaxInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$GooglePayTaxInfo;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$GooglePayTaxInfo;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$ExpressAddressBody;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCheckoutId", "getCheckoutId$annotations", "()V", "b", "getGooglePayPaymentDataJson", "getGooglePayPaymentDataJson$annotations", "c", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$GooglePayTaxInfo;", "getGooglePayTaxInfo", "()Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$GooglePayTaxInfo;", "getGooglePayTaxInfo$annotations", "Companion", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ExpressAddressBody {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f93696a;

        /* renamed from: b  reason: collision with root package name */
        private final String f93697b;

        /* renamed from: c  reason: collision with root package name */
        private final GooglePayTaxInfo f93698c;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$ExpressAddressBody$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$ExpressAddressBody;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<ExpressAddressBody> serializer() {
                return PaymentEndpoint$ExpressAddressBody$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ ExpressAddressBody(int i10, String str, String str2, GooglePayTaxInfo googlePayTaxInfo, T0 t02) {
            if (7 != (i10 & 7)) {
                E0.b(i10, 7, PaymentEndpoint$ExpressAddressBody$$serializer.INSTANCE.getDescriptor());
            }
            this.f93696a = str;
            this.f93697b = str2;
            this.f93698c = googlePayTaxInfo;
        }

        public static final /* synthetic */ void a(ExpressAddressBody expressAddressBody, C17395d dVar, SerialDescriptor serialDescriptor) {
            dVar.y(serialDescriptor, 0, expressAddressBody.f93696a);
            dVar.y(serialDescriptor, 1, expressAddressBody.f93697b);
            dVar.B(serialDescriptor, 2, PaymentEndpoint$GooglePayTaxInfo$$serializer.INSTANCE, expressAddressBody.f93698c);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExpressAddressBody)) {
                return false;
            }
            ExpressAddressBody expressAddressBody = (ExpressAddressBody) obj;
            return C17542s.e(this.f93696a, expressAddressBody.f93696a) && C17542s.e(this.f93697b, expressAddressBody.f93697b) && C17542s.e(this.f93698c, expressAddressBody.f93698c);
        }

        public int hashCode() {
            int hashCode = ((this.f93696a.hashCode() * 31) + this.f93697b.hashCode()) * 31;
            GooglePayTaxInfo googlePayTaxInfo = this.f93698c;
            return hashCode + (googlePayTaxInfo == null ? 0 : googlePayTaxInfo.hashCode());
        }

        public String toString() {
            String str = this.f93696a;
            String str2 = this.f93697b;
            GooglePayTaxInfo googlePayTaxInfo = this.f93698c;
            return "ExpressAddressBody(checkoutId=" + str + ", googlePayPaymentDataJson=" + str2 + ", googlePayTaxInfo=" + googlePayTaxInfo + ")";
        }

        public ExpressAddressBody(String str, String str2, GooglePayTaxInfo googlePayTaxInfo) {
            C17542s.j(str, "checkoutId");
            C17542s.j(str2, "googlePayPaymentDataJson");
            this.f93696a = str;
            this.f93697b = str2;
            this.f93698c = googlePayTaxInfo;
        }
    }

    @p
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 #2\u00020\u0001:\u0002$\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0015R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010\u001c\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u0015¨\u0006%"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$ExternalPaymentBody;", "", "", "paymentContextId", "externalSessionIopgId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$ExternalPaymentBody;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPaymentContextId", "getPaymentContextId$annotations", "()V", "b", "getExternalSessionIopgId", "getExternalSessionIopgId$annotations", "Companion", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ExternalPaymentBody {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f93699a;

        /* renamed from: b  reason: collision with root package name */
        private final String f93700b;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$ExternalPaymentBody$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$ExternalPaymentBody;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<ExternalPaymentBody> serializer() {
                return PaymentEndpoint$ExternalPaymentBody$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ ExternalPaymentBody(int i10, String str, String str2, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, PaymentEndpoint$ExternalPaymentBody$$serializer.INSTANCE.getDescriptor());
            }
            this.f93699a = str;
            this.f93700b = str2;
        }

        public static final /* synthetic */ void a(ExternalPaymentBody externalPaymentBody, C17395d dVar, SerialDescriptor serialDescriptor) {
            dVar.y(serialDescriptor, 0, externalPaymentBody.f93699a);
            dVar.y(serialDescriptor, 1, externalPaymentBody.f93700b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExternalPaymentBody)) {
                return false;
            }
            ExternalPaymentBody externalPaymentBody = (ExternalPaymentBody) obj;
            return C17542s.e(this.f93699a, externalPaymentBody.f93699a) && C17542s.e(this.f93700b, externalPaymentBody.f93700b);
        }

        public int hashCode() {
            return (this.f93699a.hashCode() * 31) + this.f93700b.hashCode();
        }

        public String toString() {
            String str = this.f93699a;
            String str2 = this.f93700b;
            return "ExternalPaymentBody(paymentContextId=" + str + ", externalSessionIopgId=" + str2 + ")";
        }

        public ExternalPaymentBody(String str, String str2) {
            C17542s.j(str, "paymentContextId");
            C17542s.j(str2, "externalSessionIopgId");
            this.f93699a = str;
            this.f93700b = str2;
        }
    }

    @p
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0018\b\b\u0018\u0000 32\u00020\u0001:\u00024\u0016BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBW\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0019R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010 \u0012\u0004\b&\u0010#\u001a\u0004\b%\u0010\u0019R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u0010 \u0012\u0004\b)\u0010#\u001a\u0004\b(\u0010\u0019R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u0010 \u0012\u0004\b,\u0010#\u001a\u0004\b+\u0010\u0019R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b-\u0010 \u0012\u0004\b/\u0010#\u001a\u0004\b.\u0010\u0019R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b0\u0010 \u0012\u0004\b2\u0010#\u001a\u0004\b1\u0010\u0019¨\u00065"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$GooglePayTaxInfo;", "", "", "taxCodeType", "taxCode", "countryOfOrigin", "fiscalCode", "recipientCodeType", "recipientCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$GooglePayTaxInfo;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTaxCodeType", "getTaxCodeType$annotations", "()V", "b", "getTaxCode", "getTaxCode$annotations", "c", "getCountryOfOrigin", "getCountryOfOrigin$annotations", "d", "getFiscalCode", "getFiscalCode$annotations", "e", "getRecipientCodeType", "getRecipientCodeType$annotations", "f", "getRecipientCode", "getRecipientCode$annotations", "Companion", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GooglePayTaxInfo {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f93701a;

        /* renamed from: b  reason: collision with root package name */
        private final String f93702b;

        /* renamed from: c  reason: collision with root package name */
        private final String f93703c;

        /* renamed from: d  reason: collision with root package name */
        private final String f93704d;

        /* renamed from: e  reason: collision with root package name */
        private final String f93705e;

        /* renamed from: f  reason: collision with root package name */
        private final String f93706f;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$GooglePayTaxInfo$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$GooglePayTaxInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<GooglePayTaxInfo> serializer() {
                return PaymentEndpoint$GooglePayTaxInfo$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ GooglePayTaxInfo(int i10, String str, String str2, String str3, String str4, String str5, String str6, T0 t02) {
            if (63 != (i10 & 63)) {
                E0.b(i10, 63, PaymentEndpoint$GooglePayTaxInfo$$serializer.INSTANCE.getDescriptor());
            }
            this.f93701a = str;
            this.f93702b = str2;
            this.f93703c = str3;
            this.f93704d = str4;
            this.f93705e = str5;
            this.f93706f = str6;
        }

        public static final /* synthetic */ void a(GooglePayTaxInfo googlePayTaxInfo, C17395d dVar, SerialDescriptor serialDescriptor) {
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 0, y02, googlePayTaxInfo.f93701a);
            dVar.B(serialDescriptor, 1, y02, googlePayTaxInfo.f93702b);
            dVar.B(serialDescriptor, 2, y02, googlePayTaxInfo.f93703c);
            dVar.B(serialDescriptor, 3, y02, googlePayTaxInfo.f93704d);
            dVar.B(serialDescriptor, 4, y02, googlePayTaxInfo.f93705e);
            dVar.B(serialDescriptor, 5, y02, googlePayTaxInfo.f93706f);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GooglePayTaxInfo)) {
                return false;
            }
            GooglePayTaxInfo googlePayTaxInfo = (GooglePayTaxInfo) obj;
            return C17542s.e(this.f93701a, googlePayTaxInfo.f93701a) && C17542s.e(this.f93702b, googlePayTaxInfo.f93702b) && C17542s.e(this.f93703c, googlePayTaxInfo.f93703c) && C17542s.e(this.f93704d, googlePayTaxInfo.f93704d) && C17542s.e(this.f93705e, googlePayTaxInfo.f93705e) && C17542s.e(this.f93706f, googlePayTaxInfo.f93706f);
        }

        public int hashCode() {
            String str = this.f93701a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f93702b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f93703c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f93704d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f93705e;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f93706f;
            if (str6 != null) {
                i10 = str6.hashCode();
            }
            return hashCode5 + i10;
        }

        public String toString() {
            String str = this.f93701a;
            String str2 = this.f93702b;
            String str3 = this.f93703c;
            String str4 = this.f93704d;
            String str5 = this.f93705e;
            String str6 = this.f93706f;
            return "GooglePayTaxInfo(taxCodeType=" + str + ", taxCode=" + str2 + ", countryOfOrigin=" + str3 + ", fiscalCode=" + str4 + ", recipientCodeType=" + str5 + ", recipientCode=" + str6 + ")";
        }

        public GooglePayTaxInfo(String str, String str2, String str3, String str4, String str5, String str6) {
            this.f93701a = str;
            this.f93702b = str2;
            this.f93703c = str3;
            this.f93704d = str4;
            this.f93705e = str5;
            this.f93706f = str6;
        }
    }

    @p
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0002 \u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001b\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u0014¨\u0006!"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$InitiateExpressPaymentBody;", "", "", "checkoutId", "<init>", "(Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$InitiateExpressPaymentBody;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCheckoutId", "getCheckoutId$annotations", "()V", "Companion", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InitiateExpressPaymentBody {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f93707a;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$InitiateExpressPaymentBody$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$InitiateExpressPaymentBody;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<InitiateExpressPaymentBody> serializer() {
                return PaymentEndpoint$InitiateExpressPaymentBody$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ InitiateExpressPaymentBody(int i10, String str, T0 t02) {
            if (1 != (i10 & 1)) {
                E0.b(i10, 1, PaymentEndpoint$InitiateExpressPaymentBody$$serializer.INSTANCE.getDescriptor());
            }
            this.f93707a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitiateExpressPaymentBody) && C17542s.e(this.f93707a, ((InitiateExpressPaymentBody) obj).f93707a);
        }

        public int hashCode() {
            return this.f93707a.hashCode();
        }

        public String toString() {
            String str = this.f93707a;
            return "InitiateExpressPaymentBody(checkoutId=" + str + ")";
        }

        public InitiateExpressPaymentBody(String str) {
            C17542s.j(str, "checkoutId");
            this.f93707a = str;
        }
    }

    @p
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 #2\u00020\u0001:\u0002$\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0015R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010\u001c\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u0015¨\u0006%"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$InitiatePaymentBody;", "", "", "checkoutId", "serviceAreaId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$InitiatePaymentBody;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCheckoutId", "getCheckoutId$annotations", "()V", "b", "getServiceAreaId", "getServiceAreaId$annotations", "Companion", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InitiatePaymentBody {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f93708a;

        /* renamed from: b  reason: collision with root package name */
        private final String f93709b;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$InitiatePaymentBody$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$InitiatePaymentBody;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<InitiatePaymentBody> serializer() {
                return PaymentEndpoint$InitiatePaymentBody$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ InitiatePaymentBody(int i10, String str, String str2, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, PaymentEndpoint$InitiatePaymentBody$$serializer.INSTANCE.getDescriptor());
            }
            this.f93708a = str;
            this.f93709b = str2;
        }

        public static final /* synthetic */ void a(InitiatePaymentBody initiatePaymentBody, C17395d dVar, SerialDescriptor serialDescriptor) {
            dVar.y(serialDescriptor, 0, initiatePaymentBody.f93708a);
            dVar.y(serialDescriptor, 1, initiatePaymentBody.f93709b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitiatePaymentBody)) {
                return false;
            }
            InitiatePaymentBody initiatePaymentBody = (InitiatePaymentBody) obj;
            return C17542s.e(this.f93708a, initiatePaymentBody.f93708a) && C17542s.e(this.f93709b, initiatePaymentBody.f93709b);
        }

        public int hashCode() {
            return (this.f93708a.hashCode() * 31) + this.f93709b.hashCode();
        }

        public String toString() {
            String str = this.f93708a;
            String str2 = this.f93709b;
            return "InitiatePaymentBody(checkoutId=" + str + ", serviceAreaId=" + str2 + ")";
        }

        public InitiatePaymentBody(String str, String str2) {
            C17542s.j(str, "checkoutId");
            C17542s.j(str2, "serviceAreaId");
            this.f93708a = str;
            this.f93709b = str2;
        }
    }

    @p
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 #2\u00020\u0001:\u0002$\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0015R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010\u001c\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u0015¨\u0006%"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$OnlineTransferSessionBody;", "", "", "paymentContextId", "paymentBrandName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$OnlineTransferSessionBody;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPaymentContextId", "getPaymentContextId$annotations", "()V", "b", "getPaymentBrandName", "getPaymentBrandName$annotations", "Companion", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnlineTransferSessionBody {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f93710a;

        /* renamed from: b  reason: collision with root package name */
        private final String f93711b;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$OnlineTransferSessionBody$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$OnlineTransferSessionBody;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<OnlineTransferSessionBody> serializer() {
                return PaymentEndpoint$OnlineTransferSessionBody$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ OnlineTransferSessionBody(int i10, String str, String str2, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, PaymentEndpoint$OnlineTransferSessionBody$$serializer.INSTANCE.getDescriptor());
            }
            this.f93710a = str;
            this.f93711b = str2;
        }

        public static final /* synthetic */ void a(OnlineTransferSessionBody onlineTransferSessionBody, C17395d dVar, SerialDescriptor serialDescriptor) {
            dVar.y(serialDescriptor, 0, onlineTransferSessionBody.f93710a);
            dVar.y(serialDescriptor, 1, onlineTransferSessionBody.f93711b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnlineTransferSessionBody)) {
                return false;
            }
            OnlineTransferSessionBody onlineTransferSessionBody = (OnlineTransferSessionBody) obj;
            return C17542s.e(this.f93710a, onlineTransferSessionBody.f93710a) && C17542s.e(this.f93711b, onlineTransferSessionBody.f93711b);
        }

        public int hashCode() {
            return (this.f93710a.hashCode() * 31) + this.f93711b.hashCode();
        }

        public String toString() {
            String str = this.f93710a;
            String str2 = this.f93711b;
            return "OnlineTransferSessionBody(paymentContextId=" + str + ", paymentBrandName=" + str2 + ")";
        }

        public OnlineTransferSessionBody(String str, String str2) {
            C17542s.j(str, "paymentContextId");
            C17542s.j(str2, "paymentBrandName");
            this.f93710a = str;
            this.f93711b = str2;
        }
    }

    @p
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u0000 '2\u00020\u0001:\u0002(\u0013B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u001d\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010\u001d\u0012\u0004\b#\u0010 \u001a\u0004\b\"\u0010\u0016R \u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010\u001d\u0012\u0004\b&\u0010 \u001a\u0004\b%\u0010\u0016¨\u0006)"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$PrepaidPaymentBody;", "", "", "paymentContextId", "cardNumber", "securityCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$PrepaidPaymentBody;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPaymentContextId", "getPaymentContextId$annotations", "()V", "b", "getCardNumber", "getCardNumber$annotations", "c", "getSecurityCode", "getSecurityCode$annotations", "Companion", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PrepaidPaymentBody {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f93712a;

        /* renamed from: b  reason: collision with root package name */
        private final String f93713b;

        /* renamed from: c  reason: collision with root package name */
        private final String f93714c;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$PrepaidPaymentBody$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$PrepaidPaymentBody;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<PrepaidPaymentBody> serializer() {
                return PaymentEndpoint$PrepaidPaymentBody$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ PrepaidPaymentBody(int i10, String str, String str2, String str3, T0 t02) {
            if (7 != (i10 & 7)) {
                E0.b(i10, 7, PaymentEndpoint$PrepaidPaymentBody$$serializer.INSTANCE.getDescriptor());
            }
            this.f93712a = str;
            this.f93713b = str2;
            this.f93714c = str3;
        }

        public static final /* synthetic */ void a(PrepaidPaymentBody prepaidPaymentBody, C17395d dVar, SerialDescriptor serialDescriptor) {
            dVar.y(serialDescriptor, 0, prepaidPaymentBody.f93712a);
            dVar.y(serialDescriptor, 1, prepaidPaymentBody.f93713b);
            dVar.y(serialDescriptor, 2, prepaidPaymentBody.f93714c);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PrepaidPaymentBody)) {
                return false;
            }
            PrepaidPaymentBody prepaidPaymentBody = (PrepaidPaymentBody) obj;
            return C17542s.e(this.f93712a, prepaidPaymentBody.f93712a) && C17542s.e(this.f93713b, prepaidPaymentBody.f93713b) && C17542s.e(this.f93714c, prepaidPaymentBody.f93714c);
        }

        public int hashCode() {
            return (((this.f93712a.hashCode() * 31) + this.f93713b.hashCode()) * 31) + this.f93714c.hashCode();
        }

        public String toString() {
            String str = this.f93712a;
            String str2 = this.f93713b;
            String str3 = this.f93714c;
            return "PrepaidPaymentBody(paymentContextId=" + str + ", cardNumber=" + str2 + ", securityCode=" + str3 + ")";
        }

        public PrepaidPaymentBody(String str, String str2, String str3) {
            C17542s.j(str, "paymentContextId");
            C17542s.j(str2, "cardNumber");
            C17542s.j(str3, "securityCode");
            this.f93712a = str;
            this.f93713b = str2;
            this.f93714c = str3;
        }
    }

    @VL.p("checkout/v6/payments/{cc}/{lc}/express-payment/google-pay-address")
    Object a(@C16699a ExpressAddressBody expressAddressBody, C17164e<? super x<ExpressAddressResponse>> eVar);

    @C16706h(hasBody = true, method = "DELETE", path = "checkout/v6/payments/{cc}/{lc}/prepaid-payment")
    Object b(@C16699a DeletePrepaidPaymentBody deletePrepaidPaymentBody, C17164e<? super x<PrepaidResponse>> eVar);

    @o("checkout/v6/payments/{cc}/{lc}/external-payment")
    Object c(@C16699a ExternalPaymentBody externalPaymentBody, C17164e<? super x<C16807N>> eVar);

    @o("checkout/v6/payments/{cc}/{lc}/complete-payment")
    Object d(@C16699a CompletePaymentBody completePaymentBody, C17164e<? super PaymentContextRemote> eVar);

    @o("checkout/v6/payments/{cc}/{lc}/payment")
    Object e(@C16699a InitiatePaymentBody initiatePaymentBody, C17164e<? super InitiatePaymentResponse> eVar);

    @o("checkout/v6/payments/{cc}/{lc}/express-payment")
    Object f(@C16699a InitiateExpressPaymentBody initiateExpressPaymentBody, C17164e<? super PaymentContextRemote> eVar);

    @C16704f("checkout/v6/payments/{cc}/{lc}/payment-status")
    Object g(@t("paymentContextId") String str, C17164e<? super PaymentContextRemote> eVar);

    @C16706h(hasBody = true, method = "DELETE", path = "checkout/v6/payments/{cc}/{lc}/payment-session")
    Object h(@C16699a DeletePaymentSessionBody deletePaymentSessionBody, C17164e<? super x<C16807N>> eVar);

    @C16704f("checkout/v6/payments/{cc}/{lc}/payment-options")
    Object i(@t("paymentContextId") String str, C17164e<? super PaymentOptionsRemote> eVar);

    @o("checkout/v6/payments/{cc}/{lc}/online-transfer-session")
    Object j(@C16699a OnlineTransferSessionBody onlineTransferSessionBody, C17164e<? super PspSessionRemote> eVar);

    @o("checkout/v6/payments/{cc}/{lc}/psp-session")
    Object k(@C16699a CreatePspSessionBody createPspSessionBody, C17164e<? super PspSessionRemote> eVar);

    @o("checkout/v6/payments/{cc}/{lc}/prepaid-payment")
    Object l(@C16699a PrepaidPaymentBody prepaidPaymentBody, C17164e<? super x<PrepaidResponse>> eVar);
}
