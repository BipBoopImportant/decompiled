package com.ingka.ikea.checkout.datalayer.impl.repo.network.model;

import HJ.C15854t;
import Nn.A;
import Nn.B;
import Nn.C10798a;
import Nn.D;
import Nn.v;
import Tn.c;
import Tn.d;
import Tn.e;
import Tn.f;
import Tn.g;
import Tn.h;
import Tn.i;
import Tn.j;
import Tn.k;
import XH.t;
import YH.C16877v;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.sugarcube.core.logger.DslKt;
import fI.C17220a;
import fI.C17221b;
import fK.p;
import iK.C17395d;
import jK.C17438C;
import jK.C17451f;
import jK.C17457i;
import jK.E0;
import jK.T0;
import jK.X;
import jK.Y0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;

@p
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b/\b\b\u0018\u0000 O2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u000eP0QRSTUVWXYZ%[Bµ\u0001\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0002\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0002\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0002\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0002\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0002\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0002\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b3\u00104\u001a\u0004\b2\u0010(R(\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u00105\u0012\u0004\b7\u00104\u001a\u0004\b6\u0010&R(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u00105\u0012\u0004\b9\u00104\u001a\u0004\b8\u0010&R(\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b:\u00105\u0012\u0004\b<\u00104\u001a\u0004\b;\u0010&R(\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b=\u00105\u0012\u0004\b?\u00104\u001a\u0004\b>\u0010&R(\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b@\u00105\u0012\u0004\bB\u00104\u001a\u0004\bA\u0010&R(\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\bC\u00105\u0012\u0004\bE\u00104\u001a\u0004\bD\u0010&R(\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\bF\u00105\u0012\u0004\bH\u00104\u001a\u0004\bG\u0010&R(\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\bI\u00105\u0012\u0004\bK\u00104\u001a\u0004\bJ\u0010&R(\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\bL\u00105\u0012\u0004\bN\u00104\u001a\u0004\bM\u0010&¨\u0006\\"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote;", "Lpp/b;", "", "LNn/D;", "", "seen0", "", "paymentContextId", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$CreditCardOptionRemote;", "creditCardPaymentTypes", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$PaymentOptionRemote;", "customerFinancePaymentTypes", "openInvoicePaymentTypes", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$WalletPaymentOptionRemote;", "walletPaymentTypes", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$PrepaidPaymentOptionRemote;", "prepaidPaymentTypes", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$OnlineTransferRemote;", "onlineTransferPaymentTypes", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$PayOnDeliveryRemote;", "payOnDeliveryPaymentTypes", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$GooglePayOptionRemote;", "googlePayPaymentTypes", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$PaymentGroupRemote;", "grouping", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()Ljava/util/List;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getPaymentContextId", "getPaymentContextId$annotations", "()V", "Ljava/util/List;", "getCreditCardPaymentTypes", "getCreditCardPaymentTypes$annotations", "getCustomerFinancePaymentTypes", "getCustomerFinancePaymentTypes$annotations", "d", "getOpenInvoicePaymentTypes", "getOpenInvoicePaymentTypes$annotations", "e", "getWalletPaymentTypes", "getWalletPaymentTypes$annotations", "f", "getPrepaidPaymentTypes", "getPrepaidPaymentTypes$annotations", "g", "getOnlineTransferPaymentTypes", "getOnlineTransferPaymentTypes$annotations", "h", "getPayOnDeliveryPaymentTypes", "getPayOnDeliveryPaymentTypes$annotations", "i", "getGooglePayPaymentTypes", "getGooglePayPaymentTypes$annotations", "j", "getGrouping", "getGrouping$annotations", "Companion", "PaymentGroupRemote", "ParticipatingBankRemote", "AdditionalInformationRemote", "CreditCardOptionRemote", "PaymentOptionRemote", "WalletPaymentOptionRemote", "PrepaidPaymentOptionRemote", "OnlineTransferRemote", "PayOnDeliveryRemote", "GooglePayOptionRemote", "ConfigurationRemote", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PaymentOptionsRemote implements C11768b<List<? extends D>> {
    public static final b Companion = new b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final KSerializer<Object>[] f94174k;

    /* renamed from: a  reason: collision with root package name */
    private final String f94175a;

    /* renamed from: b  reason: collision with root package name */
    private final List<CreditCardOptionRemote> f94176b;

    /* renamed from: c  reason: collision with root package name */
    private final List<PaymentOptionRemote> f94177c;

    /* renamed from: d  reason: collision with root package name */
    private final List<PaymentOptionRemote> f94178d;

    /* renamed from: e  reason: collision with root package name */
    private final List<WalletPaymentOptionRemote> f94179e;

    /* renamed from: f  reason: collision with root package name */
    private final List<PrepaidPaymentOptionRemote> f94180f;

    /* renamed from: g  reason: collision with root package name */
    private final List<OnlineTransferRemote> f94181g;

    /* renamed from: h  reason: collision with root package name */
    private final List<PayOnDeliveryRemote> f94182h;

    /* renamed from: i  reason: collision with root package name */
    private final List<GooglePayOptionRemote> f94183i;

    /* renamed from: j  reason: collision with root package name */
    private final List<PaymentGroupRemote> f94184j;

    @p
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u0000 )2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002*\u0015B9\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0018R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010 \u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010\u0018R\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010 \u0012\u0004\b(\u0010#\u001a\u0004\b'\u0010\u0018¨\u0006+"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$AdditionalInformationRemote;", "Lpp/b;", "LNn/a;", "", "seen0", "", "body", "title", "entryPointText", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$AdditionalInformationRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()LNn/a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBody", "getBody$annotations", "()V", "getTitle", "getTitle$annotations", "c", "getEntryPointText", "getEntryPointText$annotations", "Companion", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AdditionalInformationRemote implements C11768b<C10798a> {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f94185a;

        /* renamed from: b  reason: collision with root package name */
        private final String f94186b;

        /* renamed from: c  reason: collision with root package name */
        private final String f94187c;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$AdditionalInformationRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$AdditionalInformationRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<AdditionalInformationRemote> serializer() {
                return PaymentOptionsRemote$AdditionalInformationRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ AdditionalInformationRemote(int i10, String str, String str2, String str3, T0 t02) {
            if (7 != (i10 & 7)) {
                E0.b(i10, 7, PaymentOptionsRemote$AdditionalInformationRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f94185a = str;
            this.f94186b = str2;
            this.f94187c = str3;
        }

        public static final /* synthetic */ void b(AdditionalInformationRemote additionalInformationRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 0, y02, additionalInformationRemote.f94185a);
            dVar.B(serialDescriptor, 1, y02, additionalInformationRemote.f94186b);
            dVar.B(serialDescriptor, 2, y02, additionalInformationRemote.f94187c);
        }

        public C10798a a() {
            String str;
            String str2;
            String str3 = this.f94185a;
            if (str3 == null || str3.length() == 0 || (str = this.f94186b) == null || str.length() == 0 || (str2 = this.f94187c) == null || str2.length() == 0) {
                return null;
            }
            return new C10798a(this.f94185a, this.f94186b, this.f94187c);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdditionalInformationRemote)) {
                return false;
            }
            AdditionalInformationRemote additionalInformationRemote = (AdditionalInformationRemote) obj;
            return C17542s.e(this.f94185a, additionalInformationRemote.f94185a) && C17542s.e(this.f94186b, additionalInformationRemote.f94186b) && C17542s.e(this.f94187c, additionalInformationRemote.f94187c);
        }

        public int hashCode() {
            String str = this.f94185a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f94186b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f94187c;
            if (str3 != null) {
                i10 = str3.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            String str = this.f94185a;
            String str2 = this.f94186b;
            String str3 = this.f94187c;
            return "AdditionalInformationRemote(body=" + str + ", title=" + str2 + ", entryPointText=" + str3 + ")";
        }
    }

    @p
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u0000 +2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0004,-.!B/\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010'\u0012\u0004\b*\u0010&\u001a\u0004\b(\u0010)¨\u0006/"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$ConfigurationRemote;", "Lpp/b;", "LNn/D$a;", "", "seen0", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$ConfigurationRemote$AfterPayRemote;", "afterPay", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$ConfigurationRemote$IdealRemote;", "ideal", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$ConfigurationRemote$AfterPayRemote;Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$ConfigurationRemote$IdealRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$ConfigurationRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()LNn/D$a;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$ConfigurationRemote$AfterPayRemote;", "getAfterPay", "()Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$ConfigurationRemote$AfterPayRemote;", "getAfterPay$annotations", "()V", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$ConfigurationRemote$IdealRemote;", "getIdeal", "()Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$ConfigurationRemote$IdealRemote;", "getIdeal$annotations", "Companion", "AfterPayRemote", "IdealRemote", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ConfigurationRemote implements C11768b<D.a> {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final AfterPayRemote f94188a;

        /* renamed from: b  reason: collision with root package name */
        private final IdealRemote f94189b;

        @p
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\b\u0018\u0000 02\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u00021\"BC\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010#\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010%R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b-\u0010'\u001a\u0004\b,\u0010\u001aR\"\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010+\u0012\u0004\b/\u0010'\u001a\u0004\b.\u0010\u001a¨\u00062"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$ConfigurationRemote$AfterPayRemote;", "Lpp/b;", "LNn/D$a$a;", "", "seen0", "", "minimumAmount", "maximumAmount", "", "locale", "consumerLocale", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$ConfigurationRemote$AfterPayRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()LNn/D$a$a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Double;", "getMinimumAmount", "()Ljava/lang/Double;", "getMinimumAmount$annotations", "()V", "getMaximumAmount", "getMaximumAmount$annotations", "c", "Ljava/lang/String;", "getLocale", "getLocale$annotations", "getConsumerLocale", "getConsumerLocale$annotations", "Companion", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class AfterPayRemote implements C11768b<D.a.C1690a> {
            public static final a Companion = new a((DefaultConstructorMarker) null);

            /* renamed from: a  reason: collision with root package name */
            private final Double f94190a;

            /* renamed from: b  reason: collision with root package name */
            private final Double f94191b;

            /* renamed from: c  reason: collision with root package name */
            private final String f94192c;

            /* renamed from: d  reason: collision with root package name */
            private final String f94193d;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$ConfigurationRemote$AfterPayRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$ConfigurationRemote$AfterPayRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a {
                private a() {
                }

                public final KSerializer<AfterPayRemote> serializer() {
                    return PaymentOptionsRemote$ConfigurationRemote$AfterPayRemote$$serializer.INSTANCE;
                }

                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ AfterPayRemote(int i10, Double d10, Double d11, String str, String str2, T0 t02) {
                if (15 != (i10 & 15)) {
                    E0.b(i10, 15, PaymentOptionsRemote$ConfigurationRemote$AfterPayRemote$$serializer.INSTANCE.getDescriptor());
                }
                this.f94190a = d10;
                this.f94191b = d11;
                this.f94192c = str;
                this.f94193d = str2;
            }

            /* access modifiers changed from: private */
            public static final D.a.C1690a c(AfterPayRemote afterPayRemote) {
                Double d10 = afterPayRemote.f94190a;
                if (d10 != null) {
                    double doubleValue = d10.doubleValue();
                    Double d11 = afterPayRemote.f94191b;
                    if (d11 != null) {
                        double doubleValue2 = d11.doubleValue();
                        String str = afterPayRemote.f94192c;
                        if (str != null) {
                            String str2 = afterPayRemote.f94193d;
                            if (str2 != null) {
                                return new D.a.C1690a(doubleValue, doubleValue2, str, str2);
                            }
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Required value was null.");
            }

            public static final /* synthetic */ void d(AfterPayRemote afterPayRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
                C17438C c10 = C17438C.f144010a;
                dVar.B(serialDescriptor, 0, c10, afterPayRemote.f94190a);
                dVar.B(serialDescriptor, 1, c10, afterPayRemote.f94191b);
                Y0 y02 = Y0.f144077a;
                dVar.B(serialDescriptor, 2, y02, afterPayRemote.f94192c);
                dVar.B(serialDescriptor, 3, y02, afterPayRemote.f94193d);
            }

            public D.a.C1690a b() {
                return (D.a.C1690a) k.b(this, new Tn.b(this));
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AfterPayRemote)) {
                    return false;
                }
                AfterPayRemote afterPayRemote = (AfterPayRemote) obj;
                return C17542s.e(this.f94190a, afterPayRemote.f94190a) && C17542s.e(this.f94191b, afterPayRemote.f94191b) && C17542s.e(this.f94192c, afterPayRemote.f94192c) && C17542s.e(this.f94193d, afterPayRemote.f94193d);
            }

            public int hashCode() {
                Double d10 = this.f94190a;
                int i10 = 0;
                int hashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
                Double d11 = this.f94191b;
                int hashCode2 = (hashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
                String str = this.f94192c;
                int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f94193d;
                if (str2 != null) {
                    i10 = str2.hashCode();
                }
                return hashCode3 + i10;
            }

            public String toString() {
                Double d10 = this.f94190a;
                Double d11 = this.f94191b;
                String str = this.f94192c;
                String str2 = this.f94193d;
                return "AfterPayRemote(minimumAmount=" + d10 + ", maximumAmount=" + d11 + ", locale=" + str + ", consumerLocale=" + str2 + ")";
            }
        }

        @p
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u0000 #2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002$\u001eB%\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0016¨\u0006%"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$ConfigurationRemote$IdealRemote;", "Lpp/b;", "LNn/D$a$b;", "", "seen0", "", "country", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$ConfigurationRemote$IdealRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()LNn/D$a$b;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCountry", "getCountry$annotations", "()V", "Companion", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class IdealRemote implements C11768b<D.a.b> {
            public static final a Companion = new a((DefaultConstructorMarker) null);

            /* renamed from: a  reason: collision with root package name */
            private final String f94194a;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$ConfigurationRemote$IdealRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$ConfigurationRemote$IdealRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a {
                private a() {
                }

                public final KSerializer<IdealRemote> serializer() {
                    return PaymentOptionsRemote$ConfigurationRemote$IdealRemote$$serializer.INSTANCE;
                }

                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ IdealRemote(int i10, String str, T0 t02) {
                if (1 != (i10 & 1)) {
                    E0.b(i10, 1, PaymentOptionsRemote$ConfigurationRemote$IdealRemote$$serializer.INSTANCE.getDescriptor());
                }
                this.f94194a = str;
            }

            /* access modifiers changed from: private */
            public static final D.a.b c(IdealRemote idealRemote) {
                String str = idealRemote.f94194a;
                if (str != null) {
                    return new D.a.b(str);
                }
                throw new IllegalArgumentException("Required value was null.");
            }

            public D.a.b b() {
                return (D.a.b) k.b(this, new c(this));
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof IdealRemote) && C17542s.e(this.f94194a, ((IdealRemote) obj).f94194a);
            }

            public int hashCode() {
                String str = this.f94194a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                String str = this.f94194a;
                return "IdealRemote(country=" + str + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$ConfigurationRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$ConfigurationRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<ConfigurationRemote> serializer() {
                return PaymentOptionsRemote$ConfigurationRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ ConfigurationRemote(int i10, AfterPayRemote afterPayRemote, IdealRemote idealRemote, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, PaymentOptionsRemote$ConfigurationRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f94188a = afterPayRemote;
            this.f94189b = idealRemote;
        }

        /* access modifiers changed from: private */
        public static final D.a c(ConfigurationRemote configurationRemote) {
            AfterPayRemote afterPayRemote = configurationRemote.f94188a;
            if (afterPayRemote != null) {
                return afterPayRemote.b();
            }
            IdealRemote idealRemote = configurationRemote.f94189b;
            if (idealRemote != null) {
                return idealRemote.b();
            }
            return null;
        }

        public static final /* synthetic */ void d(ConfigurationRemote configurationRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            dVar.B(serialDescriptor, 0, PaymentOptionsRemote$ConfigurationRemote$AfterPayRemote$$serializer.INSTANCE, configurationRemote.f94188a);
            dVar.B(serialDescriptor, 1, PaymentOptionsRemote$ConfigurationRemote$IdealRemote$$serializer.INSTANCE, configurationRemote.f94189b);
        }

        public D.a b() {
            return (D.a) k.b(this, new Tn.a(this));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConfigurationRemote)) {
                return false;
            }
            ConfigurationRemote configurationRemote = (ConfigurationRemote) obj;
            return C17542s.e(this.f94188a, configurationRemote.f94188a) && C17542s.e(this.f94189b, configurationRemote.f94189b);
        }

        public int hashCode() {
            AfterPayRemote afterPayRemote = this.f94188a;
            int i10 = 0;
            int hashCode = (afterPayRemote == null ? 0 : afterPayRemote.hashCode()) * 31;
            IdealRemote idealRemote = this.f94189b;
            if (idealRemote != null) {
                i10 = idealRemote.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            AfterPayRemote afterPayRemote = this.f94188a;
            IdealRemote idealRemote = this.f94189b;
            return "ConfigurationRemote(afterPay=" + afterPayRemote + ", ideal=" + idealRemote + ")";
        }
    }

    @p
    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b7\b\b\u0018\u0000 X2\u00020\u0001:\u0002Y-B\u0001\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010$\u001a\u0004\u0018\u00010#2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\n¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\f2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b-\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010'R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b2\u0010.\u0012\u0004\b4\u00101\u001a\u0004\b3\u0010'R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010.\u0012\u0004\b6\u00101\u001a\u0004\b5\u0010'R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b7\u00108\u0012\u0004\b;\u00101\u001a\u0004\b9\u0010:R(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010<\u0012\u0004\b?\u00101\u001a\u0004\b=\u0010>R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b@\u0010A\u0012\u0004\bD\u00101\u001a\u0004\bB\u0010CR\"\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\bE\u0010.\u0012\u0004\bG\u00101\u001a\u0004\bF\u0010'R(\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\n8\u0006X\u0004¢\u0006\u0012\n\u0004\bH\u0010<\u0012\u0004\bJ\u00101\u001a\u0004\bI\u0010>R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\bK\u0010L\u0012\u0004\bO\u00101\u001a\u0004\bM\u0010NR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\bP\u0010L\u0012\u0004\bR\u00101\u001a\u0004\bQ\u0010NR\"\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0004¢\u0006\u0012\n\u0004\bS\u0010T\u0012\u0004\bW\u00101\u001a\u0004\bU\u0010V¨\u0006Z"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$CreditCardOptionRemote;", "", "", "seen0", "", "pspBrandName", "label", "warningLabel", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$AdditionalInformationRemote;", "additionalInformation", "", "icons", "", "skipCVV", "paymentBinDetectionType", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$ParticipatingBankRemote;", "participatingBanks", "rating", "groupKey", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$ConfigurationRemote;", "configuration", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$AdditionalInformationRemote;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$ConfigurationRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "e", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$CreditCardOptionRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "LNn/D$f;", "paymentGroups", "LNn/D$g;", "c", "(Ljava/util/List;)LNn/D$g;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getPspBrandName", "getPspBrandName$annotations", "()V", "b", "getLabel", "getLabel$annotations", "getWarningLabel", "getWarningLabel$annotations", "d", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$AdditionalInformationRemote;", "getAdditionalInformation", "()Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$AdditionalInformationRemote;", "getAdditionalInformation$annotations", "Ljava/util/List;", "getIcons", "()Ljava/util/List;", "getIcons$annotations", "f", "Ljava/lang/Boolean;", "getSkipCVV", "()Ljava/lang/Boolean;", "getSkipCVV$annotations", "g", "getPaymentBinDetectionType", "getPaymentBinDetectionType$annotations", "h", "getParticipatingBanks", "getParticipatingBanks$annotations", "i", "Ljava/lang/Integer;", "getRating", "()Ljava/lang/Integer;", "getRating$annotations", "j", "getGroupKey", "getGroupKey$annotations", "k", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$ConfigurationRemote;", "getConfiguration", "()Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$ConfigurationRemote;", "getConfiguration$annotations", "Companion", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CreditCardOptionRemote {
        public static final a Companion = new a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public static final KSerializer<Object>[] f94195l = {null, null, null, null, new C17451f(Y0.f144077a), null, null, new C17451f(PaymentOptionsRemote$ParticipatingBankRemote$$serializer.INSTANCE), null, null, null};

        /* renamed from: a  reason: collision with root package name */
        private final String f94196a;

        /* renamed from: b  reason: collision with root package name */
        private final String f94197b;

        /* renamed from: c  reason: collision with root package name */
        private final String f94198c;

        /* renamed from: d  reason: collision with root package name */
        private final AdditionalInformationRemote f94199d;

        /* renamed from: e  reason: collision with root package name */
        private final List<String> f94200e;

        /* renamed from: f  reason: collision with root package name */
        private final Boolean f94201f;

        /* renamed from: g  reason: collision with root package name */
        private final String f94202g;

        /* renamed from: h  reason: collision with root package name */
        private final List<ParticipatingBankRemote> f94203h;

        /* renamed from: i  reason: collision with root package name */
        private final Integer f94204i;

        /* renamed from: j  reason: collision with root package name */
        private final Integer f94205j;

        /* renamed from: k  reason: collision with root package name */
        private final ConfigurationRemote f94206k;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$CreditCardOptionRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$CreditCardOptionRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<CreditCardOptionRemote> serializer() {
                return PaymentOptionsRemote$CreditCardOptionRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ CreditCardOptionRemote(int i10, String str, String str2, String str3, AdditionalInformationRemote additionalInformationRemote, List list, Boolean bool, String str4, List list2, Integer num, Integer num2, ConfigurationRemote configurationRemote, T0 t02) {
            if (2047 != (i10 & 2047)) {
                E0.b(i10, 2047, PaymentOptionsRemote$CreditCardOptionRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f94196a = str;
            this.f94197b = str2;
            this.f94198c = str3;
            this.f94199d = additionalInformationRemote;
            this.f94200e = list;
            this.f94201f = bool;
            this.f94202g = str4;
            this.f94203h = list2;
            this.f94204i = num;
            this.f94205j = num2;
            this.f94206k = configurationRemote;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00ac  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00b2  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static final Nn.D.g d(com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote.CreditCardOptionRemote r14, java.util.List r15) {
            /*
                java.lang.Integer r0 = r14.f94204i
                r1 = 0
                if (r0 == 0) goto L_0x000b
                int r0 = r0.intValue()
                r3 = r0
                goto L_0x000c
            L_0x000b:
                r3 = r1
            L_0x000c:
                java.lang.String r4 = r14.f94196a
                java.lang.String r0 = "Required value was null."
                if (r4 == 0) goto L_0x00c0
                java.lang.String r5 = r14.f94197b
                if (r5 == 0) goto L_0x00ba
                java.lang.Boolean r0 = r14.f94201f
                if (r0 == 0) goto L_0x001e
                boolean r1 = r0.booleanValue()
            L_0x001e:
                r6 = r1
                java.lang.String r7 = r14.f94198c
                com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$AdditionalInformationRemote r0 = r14.f94199d
                r1 = 0
                if (r0 == 0) goto L_0x002c
                Nn.a r0 = r0.a()
                r8 = r0
                goto L_0x002d
            L_0x002c:
                r8 = r1
            L_0x002d:
                java.util.List<java.lang.String> r0 = r14.f94200e
                if (r0 != 0) goto L_0x0035
                java.util.List r0 = YH.C16877v.n()
            L_0x0035:
                r9 = r0
                java.util.List<com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$ParticipatingBankRemote> r0 = r14.f94203h
                if (r0 == 0) goto L_0x005d
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r0 = r0.iterator()
            L_0x0045:
                boolean r10 = r0.hasNext()
                if (r10 == 0) goto L_0x005b
                java.lang.Object r10 = r0.next()
                com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$ParticipatingBankRemote r10 = (com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote.ParticipatingBankRemote) r10
                Nn.A r10 = r10.a()
                if (r10 == 0) goto L_0x0045
                r2.add(r10)
                goto L_0x0045
            L_0x005b:
                r10 = r2
                goto L_0x0062
            L_0x005d:
                java.util.List r0 = YH.C16877v.n()
                r10 = r0
            L_0x0062:
                com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$a$a r0 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote.a.Companion
                java.lang.String r2 = r14.f94202g
                com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$a r0 = r0.a(r2)
                Nn.B r11 = r0.b()
                if (r15 == 0) goto L_0x00a7
                java.lang.Iterable r15 = (java.lang.Iterable) r15
                java.util.Iterator r15 = r15.iterator()
            L_0x0076:
                boolean r0 = r15.hasNext()
                if (r0 == 0) goto L_0x0093
                java.lang.Object r0 = r15.next()
                r2 = r0
                Nn.D$f r2 = (Nn.D.f) r2
                java.lang.Integer r12 = r14.f94205j
                int r2 = r2.a()
                if (r12 != 0) goto L_0x008c
                goto L_0x0076
            L_0x008c:
                int r12 = r12.intValue()
                if (r12 != r2) goto L_0x0076
                goto L_0x0094
            L_0x0093:
                r0 = r1
            L_0x0094:
                Nn.D$f r0 = (Nn.D.f) r0
                if (r0 == 0) goto L_0x00a7
                Nn.D$f r15 = new Nn.D$f
                int r2 = r0.a()
                java.lang.String r0 = r0.b()
                r15.<init>(r2, r0)
                r12 = r15
                goto L_0x00a8
            L_0x00a7:
                r12 = r1
            L_0x00a8:
                com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$ConfigurationRemote r14 = r14.f94206k
                if (r14 == 0) goto L_0x00b2
                Nn.D$a r14 = r14.b()
                r13 = r14
                goto L_0x00b3
            L_0x00b2:
                r13 = r1
            L_0x00b3:
                Nn.D$g r14 = new Nn.D$g
                r2 = r14
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return r14
            L_0x00ba:
                java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
                r14.<init>(r0)
                throw r14
            L_0x00c0:
                java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
                r14.<init>(r0)
                throw r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote.CreditCardOptionRemote.d(com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$CreditCardOptionRemote, java.util.List):Nn.D$g");
        }

        public static final /* synthetic */ void e(CreditCardOptionRemote creditCardOptionRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = f94195l;
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 0, y02, creditCardOptionRemote.f94196a);
            dVar.B(serialDescriptor, 1, y02, creditCardOptionRemote.f94197b);
            dVar.B(serialDescriptor, 2, y02, creditCardOptionRemote.f94198c);
            dVar.B(serialDescriptor, 3, PaymentOptionsRemote$AdditionalInformationRemote$$serializer.INSTANCE, creditCardOptionRemote.f94199d);
            dVar.B(serialDescriptor, 4, kSerializerArr[4], creditCardOptionRemote.f94200e);
            dVar.B(serialDescriptor, 5, C17457i.f144111a, creditCardOptionRemote.f94201f);
            dVar.B(serialDescriptor, 6, y02, creditCardOptionRemote.f94202g);
            dVar.B(serialDescriptor, 7, kSerializerArr[7], creditCardOptionRemote.f94203h);
            X x10 = X.f144073a;
            dVar.B(serialDescriptor, 8, x10, creditCardOptionRemote.f94204i);
            dVar.B(serialDescriptor, 9, x10, creditCardOptionRemote.f94205j);
            dVar.B(serialDescriptor, 10, PaymentOptionsRemote$ConfigurationRemote$$serializer.INSTANCE, creditCardOptionRemote.f94206k);
        }

        public final D.g c(List<D.f> list) {
            return (D.g) k.b(this, new d(this, list));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CreditCardOptionRemote)) {
                return false;
            }
            CreditCardOptionRemote creditCardOptionRemote = (CreditCardOptionRemote) obj;
            return C17542s.e(this.f94196a, creditCardOptionRemote.f94196a) && C17542s.e(this.f94197b, creditCardOptionRemote.f94197b) && C17542s.e(this.f94198c, creditCardOptionRemote.f94198c) && C17542s.e(this.f94199d, creditCardOptionRemote.f94199d) && C17542s.e(this.f94200e, creditCardOptionRemote.f94200e) && C17542s.e(this.f94201f, creditCardOptionRemote.f94201f) && C17542s.e(this.f94202g, creditCardOptionRemote.f94202g) && C17542s.e(this.f94203h, creditCardOptionRemote.f94203h) && C17542s.e(this.f94204i, creditCardOptionRemote.f94204i) && C17542s.e(this.f94205j, creditCardOptionRemote.f94205j) && C17542s.e(this.f94206k, creditCardOptionRemote.f94206k);
        }

        public int hashCode() {
            String str = this.f94196a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f94197b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f94198c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            AdditionalInformationRemote additionalInformationRemote = this.f94199d;
            int hashCode4 = (hashCode3 + (additionalInformationRemote == null ? 0 : additionalInformationRemote.hashCode())) * 31;
            List<String> list = this.f94200e;
            int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
            Boolean bool = this.f94201f;
            int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str4 = this.f94202g;
            int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
            List<ParticipatingBankRemote> list2 = this.f94203h;
            int hashCode8 = (hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
            Integer num = this.f94204i;
            int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f94205j;
            int hashCode10 = (hashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
            ConfigurationRemote configurationRemote = this.f94206k;
            if (configurationRemote != null) {
                i10 = configurationRemote.hashCode();
            }
            return hashCode10 + i10;
        }

        public String toString() {
            String str = this.f94196a;
            String str2 = this.f94197b;
            String str3 = this.f94198c;
            AdditionalInformationRemote additionalInformationRemote = this.f94199d;
            List<String> list = this.f94200e;
            Boolean bool = this.f94201f;
            String str4 = this.f94202g;
            List<ParticipatingBankRemote> list2 = this.f94203h;
            Integer num = this.f94204i;
            Integer num2 = this.f94205j;
            ConfigurationRemote configurationRemote = this.f94206k;
            return "CreditCardOptionRemote(pspBrandName=" + str + ", label=" + str2 + ", warningLabel=" + str3 + ", additionalInformation=" + additionalInformationRemote + ", icons=" + list + ", skipCVV=" + bool + ", paymentBinDetectionType=" + str4 + ", participatingBanks=" + list2 + ", rating=" + num + ", groupKey=" + num2 + ", configuration=" + configurationRemote + ")";
        }
    }

    @p
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b&\b\b\u0018\u0000 G2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002H'Bw\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010 R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b,\u0010(\u0012\u0004\b.\u0010+\u001a\u0004\b-\u0010 R\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010(\u0012\u0004\b0\u0010+\u001a\u0004\b/\u0010 R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b1\u00102\u0012\u0004\b5\u0010+\u001a\u0004\b3\u00104R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001b\u00106\u0012\u0004\b9\u0010+\u001a\u0004\b7\u00108R(\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r8\u0006X\u0004¢\u0006\u0012\n\u0004\b:\u0010;\u0012\u0004\b>\u0010+\u001a\u0004\b<\u0010=R(\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r8\u0006X\u0004¢\u0006\u0012\n\u0004\b?\u0010;\u0012\u0004\bA\u0010+\u001a\u0004\b@\u0010=R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\u0012\n\u0004\bB\u0010C\u0012\u0004\bF\u0010+\u001a\u0004\bD\u0010E¨\u0006I"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$GooglePayOptionRemote;", "Lpp/b;", "LNn/D$c;", "", "seen0", "", "pspBrandName", "label", "warningLabel", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$AdditionalInformationRemote;", "additionalInformation", "", "skipCVV", "", "paymentMethods", "cardNetworks", "rating", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$AdditionalInformationRemote;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "e", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$GooglePayOptionRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "c", "()LNn/D$c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getPspBrandName", "getPspBrandName$annotations", "()V", "b", "getLabel", "getLabel$annotations", "getWarningLabel", "getWarningLabel$annotations", "d", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$AdditionalInformationRemote;", "getAdditionalInformation", "()Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$AdditionalInformationRemote;", "getAdditionalInformation$annotations", "Ljava/lang/Boolean;", "getSkipCVV", "()Ljava/lang/Boolean;", "getSkipCVV$annotations", "f", "Ljava/util/List;", "getPaymentMethods", "()Ljava/util/List;", "getPaymentMethods$annotations", "g", "getCardNetworks", "getCardNetworks$annotations", "h", "Ljava/lang/Integer;", "getRating", "()Ljava/lang/Integer;", "getRating$annotations", "Companion", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GooglePayOptionRemote implements C11768b<D.c> {
        public static final a Companion = new a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public static final KSerializer<Object>[] f94207i;

        /* renamed from: a  reason: collision with root package name */
        private final String f94208a;

        /* renamed from: b  reason: collision with root package name */
        private final String f94209b;

        /* renamed from: c  reason: collision with root package name */
        private final String f94210c;

        /* renamed from: d  reason: collision with root package name */
        private final AdditionalInformationRemote f94211d;

        /* renamed from: e  reason: collision with root package name */
        private final Boolean f94212e;

        /* renamed from: f  reason: collision with root package name */
        private final List<String> f94213f;

        /* renamed from: g  reason: collision with root package name */
        private final List<String> f94214g;

        /* renamed from: h  reason: collision with root package name */
        private final Integer f94215h;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$GooglePayOptionRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$GooglePayOptionRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<GooglePayOptionRemote> serializer() {
                return PaymentOptionsRemote$GooglePayOptionRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            Y0 y02 = Y0.f144077a;
            f94207i = new KSerializer[]{null, null, null, null, null, new C17451f(y02), new C17451f(y02), null};
        }

        public /* synthetic */ GooglePayOptionRemote(int i10, String str, String str2, String str3, AdditionalInformationRemote additionalInformationRemote, Boolean bool, List list, List list2, Integer num, T0 t02) {
            if (255 != (i10 & 255)) {
                E0.b(i10, 255, PaymentOptionsRemote$GooglePayOptionRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f94208a = str;
            this.f94209b = str2;
            this.f94210c = str3;
            this.f94211d = additionalInformationRemote;
            this.f94212e = bool;
            this.f94213f = list;
            this.f94214g = list2;
            this.f94215h = num;
        }

        /* access modifiers changed from: private */
        public static final D.c d(GooglePayOptionRemote googlePayOptionRemote) {
            String str = googlePayOptionRemote.f94208a;
            if (str != null) {
                String str2 = googlePayOptionRemote.f94209b;
                if (str2 != null) {
                    v vVar = new v(Rn.b.e(googlePayOptionRemote.f94213f), Rn.b.d(googlePayOptionRemote.f94214g));
                    Boolean bool = googlePayOptionRemote.f94212e;
                    int i10 = 0;
                    boolean booleanValue = bool != null ? bool.booleanValue() : false;
                    String str3 = googlePayOptionRemote.f94210c;
                    AdditionalInformationRemote additionalInformationRemote = googlePayOptionRemote.f94211d;
                    C10798a a10 = additionalInformationRemote != null ? additionalInformationRemote.a() : null;
                    Integer num = googlePayOptionRemote.f94215h;
                    if (num != null) {
                        i10 = num.intValue();
                    }
                    return new D.c(i10, str, str2, booleanValue, str3, a10, vVar);
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        public static final /* synthetic */ void e(GooglePayOptionRemote googlePayOptionRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = f94207i;
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 0, y02, googlePayOptionRemote.f94208a);
            dVar.B(serialDescriptor, 1, y02, googlePayOptionRemote.f94209b);
            dVar.B(serialDescriptor, 2, y02, googlePayOptionRemote.f94210c);
            dVar.B(serialDescriptor, 3, PaymentOptionsRemote$AdditionalInformationRemote$$serializer.INSTANCE, googlePayOptionRemote.f94211d);
            dVar.B(serialDescriptor, 4, C17457i.f144111a, googlePayOptionRemote.f94212e);
            dVar.B(serialDescriptor, 5, kSerializerArr[5], googlePayOptionRemote.f94213f);
            dVar.B(serialDescriptor, 6, kSerializerArr[6], googlePayOptionRemote.f94214g);
            dVar.B(serialDescriptor, 7, X.f144073a, googlePayOptionRemote.f94215h);
        }

        public D.c c() {
            return (D.c) k.b(this, new e(this));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GooglePayOptionRemote)) {
                return false;
            }
            GooglePayOptionRemote googlePayOptionRemote = (GooglePayOptionRemote) obj;
            return C17542s.e(this.f94208a, googlePayOptionRemote.f94208a) && C17542s.e(this.f94209b, googlePayOptionRemote.f94209b) && C17542s.e(this.f94210c, googlePayOptionRemote.f94210c) && C17542s.e(this.f94211d, googlePayOptionRemote.f94211d) && C17542s.e(this.f94212e, googlePayOptionRemote.f94212e) && C17542s.e(this.f94213f, googlePayOptionRemote.f94213f) && C17542s.e(this.f94214g, googlePayOptionRemote.f94214g) && C17542s.e(this.f94215h, googlePayOptionRemote.f94215h);
        }

        public int hashCode() {
            String str = this.f94208a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f94209b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f94210c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            AdditionalInformationRemote additionalInformationRemote = this.f94211d;
            int hashCode4 = (hashCode3 + (additionalInformationRemote == null ? 0 : additionalInformationRemote.hashCode())) * 31;
            Boolean bool = this.f94212e;
            int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            List<String> list = this.f94213f;
            int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
            List<String> list2 = this.f94214g;
            int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
            Integer num = this.f94215h;
            if (num != null) {
                i10 = num.hashCode();
            }
            return hashCode7 + i10;
        }

        public String toString() {
            String str = this.f94208a;
            String str2 = this.f94209b;
            String str3 = this.f94210c;
            AdditionalInformationRemote additionalInformationRemote = this.f94211d;
            Boolean bool = this.f94212e;
            List<String> list = this.f94213f;
            List<String> list2 = this.f94214g;
            Integer num = this.f94215h;
            return "GooglePayOptionRemote(pspBrandName=" + str + ", label=" + str2 + ", warningLabel=" + str3 + ", additionalInformation=" + additionalInformationRemote + ", skipCVV=" + bool + ", paymentMethods=" + list + ", cardNetworks=" + list2 + ", rating=" + num + ")";
        }
    }

    @p
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\b\u0018\u0000 =2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002>%B]\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u001dR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u0010&\u0012\u0004\b,\u0010)\u001a\u0004\b+\u0010\u001dR\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010&\u0012\u0004\b.\u0010)\u001a\u0004\b-\u0010\u001dR\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b3\u0010)\u001a\u0004\b1\u00102R(\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0018\u00104\u0012\u0004\b7\u0010)\u001a\u0004\b5\u00106R\"\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\u0012\n\u0004\b8\u00109\u0012\u0004\b<\u0010)\u001a\u0004\b:\u0010;¨\u0006?"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$OnlineTransferRemote;", "Lpp/b;", "LNn/D$d;", "", "seen0", "", "pspBrandName", "label", "warningLabel", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$AdditionalInformationRemote;", "additionalInformation", "", "icons", "rating", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$AdditionalInformationRemote;Ljava/util/List;Ljava/lang/Integer;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "e", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$OnlineTransferRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "c", "()LNn/D$d;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getPspBrandName", "getPspBrandName$annotations", "()V", "b", "getLabel", "getLabel$annotations", "getWarningLabel", "getWarningLabel$annotations", "d", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$AdditionalInformationRemote;", "getAdditionalInformation", "()Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$AdditionalInformationRemote;", "getAdditionalInformation$annotations", "Ljava/util/List;", "getIcons", "()Ljava/util/List;", "getIcons$annotations", "f", "Ljava/lang/Integer;", "getRating", "()Ljava/lang/Integer;", "getRating$annotations", "Companion", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnlineTransferRemote implements C11768b<D.d> {
        public static final a Companion = new a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public static final KSerializer<Object>[] f94216g = {null, null, null, null, new C17451f(Y0.f144077a), null};

        /* renamed from: a  reason: collision with root package name */
        private final String f94217a;

        /* renamed from: b  reason: collision with root package name */
        private final String f94218b;

        /* renamed from: c  reason: collision with root package name */
        private final String f94219c;

        /* renamed from: d  reason: collision with root package name */
        private final AdditionalInformationRemote f94220d;

        /* renamed from: e  reason: collision with root package name */
        private final List<String> f94221e;

        /* renamed from: f  reason: collision with root package name */
        private final Integer f94222f;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$OnlineTransferRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$OnlineTransferRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<OnlineTransferRemote> serializer() {
                return PaymentOptionsRemote$OnlineTransferRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ OnlineTransferRemote(int i10, String str, String str2, String str3, AdditionalInformationRemote additionalInformationRemote, List list, Integer num, T0 t02) {
            if (63 != (i10 & 63)) {
                E0.b(i10, 63, PaymentOptionsRemote$OnlineTransferRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f94217a = str;
            this.f94218b = str2;
            this.f94219c = str3;
            this.f94220d = additionalInformationRemote;
            this.f94221e = list;
            this.f94222f = num;
        }

        /* access modifiers changed from: private */
        public static final D.d d(OnlineTransferRemote onlineTransferRemote) {
            String str = onlineTransferRemote.f94217a;
            if (str != null) {
                String str2 = onlineTransferRemote.f94218b;
                if (str2 != null) {
                    String str3 = onlineTransferRemote.f94219c;
                    AdditionalInformationRemote additionalInformationRemote = onlineTransferRemote.f94220d;
                    C10798a a10 = additionalInformationRemote != null ? additionalInformationRemote.a() : null;
                    List<String> list = onlineTransferRemote.f94221e;
                    if (list == null) {
                        list = C16877v.n();
                    }
                    List<String> list2 = list;
                    Integer num = onlineTransferRemote.f94222f;
                    return new D.d(num != null ? num.intValue() : 0, str, str2, str3, a10, list2);
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        public static final /* synthetic */ void e(OnlineTransferRemote onlineTransferRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = f94216g;
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 0, y02, onlineTransferRemote.f94217a);
            dVar.B(serialDescriptor, 1, y02, onlineTransferRemote.f94218b);
            dVar.B(serialDescriptor, 2, y02, onlineTransferRemote.f94219c);
            dVar.B(serialDescriptor, 3, PaymentOptionsRemote$AdditionalInformationRemote$$serializer.INSTANCE, onlineTransferRemote.f94220d);
            dVar.B(serialDescriptor, 4, kSerializerArr[4], onlineTransferRemote.f94221e);
            dVar.B(serialDescriptor, 5, X.f144073a, onlineTransferRemote.f94222f);
        }

        public D.d c() {
            return (D.d) k.b(this, new f(this));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnlineTransferRemote)) {
                return false;
            }
            OnlineTransferRemote onlineTransferRemote = (OnlineTransferRemote) obj;
            return C17542s.e(this.f94217a, onlineTransferRemote.f94217a) && C17542s.e(this.f94218b, onlineTransferRemote.f94218b) && C17542s.e(this.f94219c, onlineTransferRemote.f94219c) && C17542s.e(this.f94220d, onlineTransferRemote.f94220d) && C17542s.e(this.f94221e, onlineTransferRemote.f94221e) && C17542s.e(this.f94222f, onlineTransferRemote.f94222f);
        }

        public int hashCode() {
            String str = this.f94217a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f94218b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f94219c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            AdditionalInformationRemote additionalInformationRemote = this.f94220d;
            int hashCode4 = (hashCode3 + (additionalInformationRemote == null ? 0 : additionalInformationRemote.hashCode())) * 31;
            List<String> list = this.f94221e;
            int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
            Integer num = this.f94222f;
            if (num != null) {
                i10 = num.hashCode();
            }
            return hashCode5 + i10;
        }

        public String toString() {
            String str = this.f94217a;
            String str2 = this.f94218b;
            String str3 = this.f94219c;
            AdditionalInformationRemote additionalInformationRemote = this.f94220d;
            List<String> list = this.f94221e;
            Integer num = this.f94222f;
            return "OnlineTransferRemote(pspBrandName=" + str + ", label=" + str2 + ", warningLabel=" + str3 + ", additionalInformation=" + additionalInformationRemote + ", icons=" + list + ", rating=" + num + ")";
        }
    }

    @p
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 %2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002&\u0014B/\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0017R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001f\u0012\u0004\b$\u0010\"\u001a\u0004\b#\u0010\u0017¨\u0006'"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$ParticipatingBankRemote;", "Lpp/b;", "LNn/A;", "", "seen0", "", "name", "icon", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$ParticipatingBankRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()LNn/A;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getName$annotations", "()V", "getIcon", "getIcon$annotations", "Companion", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ParticipatingBankRemote implements C11768b<A> {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f94223a;

        /* renamed from: b  reason: collision with root package name */
        private final String f94224b;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$ParticipatingBankRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$ParticipatingBankRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<ParticipatingBankRemote> serializer() {
                return PaymentOptionsRemote$ParticipatingBankRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ ParticipatingBankRemote(int i10, String str, String str2, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, PaymentOptionsRemote$ParticipatingBankRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f94223a = str;
            this.f94224b = str2;
        }

        public static final /* synthetic */ void b(ParticipatingBankRemote participatingBankRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 0, y02, participatingBankRemote.f94223a);
            dVar.B(serialDescriptor, 1, y02, participatingBankRemote.f94224b);
        }

        public A a() {
            String str;
            String str2 = this.f94223a;
            if (str2 == null || str2.length() == 0 || (str = this.f94224b) == null || str.length() == 0) {
                return null;
            }
            return new A(this.f94224b, this.f94223a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ParticipatingBankRemote)) {
                return false;
            }
            ParticipatingBankRemote participatingBankRemote = (ParticipatingBankRemote) obj;
            return C17542s.e(this.f94223a, participatingBankRemote.f94223a) && C17542s.e(this.f94224b, participatingBankRemote.f94224b);
        }

        public int hashCode() {
            String str = this.f94223a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f94224b;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            String str = this.f94223a;
            String str2 = this.f94224b;
            return "ParticipatingBankRemote(name=" + str + ", icon=" + str2 + ")";
        }
    }

    @p
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\b\u0018\u0000 =2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002>%B]\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u001dR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u0010&\u0012\u0004\b,\u0010)\u001a\u0004\b+\u0010\u001dR\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010&\u0012\u0004\b.\u0010)\u001a\u0004\b-\u0010\u001dR\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b3\u0010)\u001a\u0004\b1\u00102R(\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0018\u00104\u0012\u0004\b7\u0010)\u001a\u0004\b5\u00106R\"\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\u0012\n\u0004\b8\u00109\u0012\u0004\b<\u0010)\u001a\u0004\b:\u0010;¨\u0006?"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$PayOnDeliveryRemote;", "Lpp/b;", "LNn/D$e;", "", "seen0", "", "pspBrandName", "label", "warningLabel", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$AdditionalInformationRemote;", "additionalInformation", "", "icons", "rating", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$AdditionalInformationRemote;Ljava/util/List;Ljava/lang/Integer;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "e", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$PayOnDeliveryRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "c", "()LNn/D$e;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getPspBrandName", "getPspBrandName$annotations", "()V", "b", "getLabel", "getLabel$annotations", "getWarningLabel", "getWarningLabel$annotations", "d", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$AdditionalInformationRemote;", "getAdditionalInformation", "()Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$AdditionalInformationRemote;", "getAdditionalInformation$annotations", "Ljava/util/List;", "getIcons", "()Ljava/util/List;", "getIcons$annotations", "f", "Ljava/lang/Integer;", "getRating", "()Ljava/lang/Integer;", "getRating$annotations", "Companion", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PayOnDeliveryRemote implements C11768b<D.e> {
        public static final a Companion = new a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public static final KSerializer<Object>[] f94225g = {null, null, null, null, new C17451f(Y0.f144077a), null};

        /* renamed from: a  reason: collision with root package name */
        private final String f94226a;

        /* renamed from: b  reason: collision with root package name */
        private final String f94227b;

        /* renamed from: c  reason: collision with root package name */
        private final String f94228c;

        /* renamed from: d  reason: collision with root package name */
        private final AdditionalInformationRemote f94229d;

        /* renamed from: e  reason: collision with root package name */
        private final List<String> f94230e;

        /* renamed from: f  reason: collision with root package name */
        private final Integer f94231f;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$PayOnDeliveryRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$PayOnDeliveryRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<PayOnDeliveryRemote> serializer() {
                return PaymentOptionsRemote$PayOnDeliveryRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ PayOnDeliveryRemote(int i10, String str, String str2, String str3, AdditionalInformationRemote additionalInformationRemote, List list, Integer num, T0 t02) {
            if (63 != (i10 & 63)) {
                E0.b(i10, 63, PaymentOptionsRemote$PayOnDeliveryRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f94226a = str;
            this.f94227b = str2;
            this.f94228c = str3;
            this.f94229d = additionalInformationRemote;
            this.f94230e = list;
            this.f94231f = num;
        }

        /* access modifiers changed from: private */
        public static final D.e d(PayOnDeliveryRemote payOnDeliveryRemote) {
            String str = payOnDeliveryRemote.f94226a;
            if (str != null) {
                String str2 = payOnDeliveryRemote.f94227b;
                if (str2 != null) {
                    String str3 = payOnDeliveryRemote.f94228c;
                    AdditionalInformationRemote additionalInformationRemote = payOnDeliveryRemote.f94229d;
                    C10798a a10 = additionalInformationRemote != null ? additionalInformationRemote.a() : null;
                    Integer num = payOnDeliveryRemote.f94231f;
                    return new D.e(num != null ? num.intValue() : 0, str, str2, false, str3, a10, 8, (DefaultConstructorMarker) null);
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        public static final /* synthetic */ void e(PayOnDeliveryRemote payOnDeliveryRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = f94225g;
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 0, y02, payOnDeliveryRemote.f94226a);
            dVar.B(serialDescriptor, 1, y02, payOnDeliveryRemote.f94227b);
            dVar.B(serialDescriptor, 2, y02, payOnDeliveryRemote.f94228c);
            dVar.B(serialDescriptor, 3, PaymentOptionsRemote$AdditionalInformationRemote$$serializer.INSTANCE, payOnDeliveryRemote.f94229d);
            dVar.B(serialDescriptor, 4, kSerializerArr[4], payOnDeliveryRemote.f94230e);
            dVar.B(serialDescriptor, 5, X.f144073a, payOnDeliveryRemote.f94231f);
        }

        public D.e c() {
            return (D.e) k.b(this, new g(this));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PayOnDeliveryRemote)) {
                return false;
            }
            PayOnDeliveryRemote payOnDeliveryRemote = (PayOnDeliveryRemote) obj;
            return C17542s.e(this.f94226a, payOnDeliveryRemote.f94226a) && C17542s.e(this.f94227b, payOnDeliveryRemote.f94227b) && C17542s.e(this.f94228c, payOnDeliveryRemote.f94228c) && C17542s.e(this.f94229d, payOnDeliveryRemote.f94229d) && C17542s.e(this.f94230e, payOnDeliveryRemote.f94230e) && C17542s.e(this.f94231f, payOnDeliveryRemote.f94231f);
        }

        public int hashCode() {
            String str = this.f94226a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f94227b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f94228c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            AdditionalInformationRemote additionalInformationRemote = this.f94229d;
            int hashCode4 = (hashCode3 + (additionalInformationRemote == null ? 0 : additionalInformationRemote.hashCode())) * 31;
            List<String> list = this.f94230e;
            int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
            Integer num = this.f94231f;
            if (num != null) {
                i10 = num.hashCode();
            }
            return hashCode5 + i10;
        }

        public String toString() {
            String str = this.f94226a;
            String str2 = this.f94227b;
            String str3 = this.f94228c;
            AdditionalInformationRemote additionalInformationRemote = this.f94229d;
            List<String> list = this.f94230e;
            Integer num = this.f94231f;
            return "PayOnDeliveryRemote(pspBrandName=" + str + ", label=" + str2 + ", warningLabel=" + str3 + ", additionalInformation=" + additionalInformationRemote + ", icons=" + list + ", rating=" + num + ")";
        }
    }

    @p
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 '2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002(\u0014B/\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010$\u0012\u0004\b&\u0010#\u001a\u0004\b%\u0010\u0017¨\u0006)"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$PaymentGroupRemote;", "Lpp/b;", "LNn/D$f;", "", "seen0", "key", "", "label", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Integer;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$PaymentGroupRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()LNn/D$f;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getKey", "()Ljava/lang/Integer;", "getKey$annotations", "()V", "Ljava/lang/String;", "getLabel", "getLabel$annotations", "Companion", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PaymentGroupRemote implements C11768b<D.f> {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final Integer f94232a;

        /* renamed from: b  reason: collision with root package name */
        private final String f94233b;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$PaymentGroupRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$PaymentGroupRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<PaymentGroupRemote> serializer() {
                return PaymentOptionsRemote$PaymentGroupRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ PaymentGroupRemote(int i10, Integer num, String str, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, PaymentOptionsRemote$PaymentGroupRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f94232a = num;
            this.f94233b = str;
        }

        public static final /* synthetic */ void b(PaymentGroupRemote paymentGroupRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            dVar.B(serialDescriptor, 0, X.f144073a, paymentGroupRemote.f94232a);
            dVar.B(serialDescriptor, 1, Y0.f144077a, paymentGroupRemote.f94233b);
        }

        public D.f a() {
            String str;
            if (this.f94232a != null && (str = this.f94233b) != null && str.length() != 0) {
                return new D.f(this.f94232a.intValue(), this.f94233b);
            }
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid payment group: " + this);
            qv.e eVar = qv.e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str2 = null;
            String str3 = null;
            for (C11819b bVar : arrayList) {
                if (str2 == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 == null) {
                        break;
                    }
                    str2 = C11820c.a(a10);
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = PaymentGroupRemote.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str5 = str3;
                bVar.a(eVar, str5, false, illegalArgumentException, str4);
                str2 = str4;
                str3 = str5;
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentGroupRemote)) {
                return false;
            }
            PaymentGroupRemote paymentGroupRemote = (PaymentGroupRemote) obj;
            return C17542s.e(this.f94232a, paymentGroupRemote.f94232a) && C17542s.e(this.f94233b, paymentGroupRemote.f94233b);
        }

        public int hashCode() {
            Integer num = this.f94232a;
            int i10 = 0;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.f94233b;
            if (str != null) {
                i10 = str.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            Integer num = this.f94232a;
            String str = this.f94233b;
            return "PaymentGroupRemote(key=" + num + ", label=" + str + ")";
        }
    }

    @p
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b&\b\b\u0018\u0000 G2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002H'Bq\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\r2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010 R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b,\u0010(\u0012\u0004\b.\u0010+\u001a\u0004\b-\u0010 R\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010(\u0012\u0004\b0\u0010+\u001a\u0004\b/\u0010 R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b1\u00102\u0012\u0004\b5\u0010+\u001a\u0004\b3\u00104R(\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001b\u00106\u0012\u0004\b9\u0010+\u001a\u0004\b7\u00108R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0004¢\u0006\u0012\n\u0004\b:\u0010;\u0012\u0004\b>\u0010+\u001a\u0004\b<\u0010=R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b?\u0010(\u0012\u0004\bA\u0010+\u001a\u0004\b@\u0010 R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\u0012\n\u0004\bB\u0010C\u0012\u0004\bF\u0010+\u001a\u0004\bD\u0010E¨\u0006I"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$PaymentOptionRemote;", "Lpp/b;", "LNn/D$g;", "", "seen0", "", "pspBrandName", "label", "warningLabel", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$AdditionalInformationRemote;", "additionalInformation", "", "icons", "", "skipCVV", "paymentBinDetectionType", "rating", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$AdditionalInformationRemote;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "e", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$PaymentOptionRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "c", "()LNn/D$g;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getPspBrandName", "getPspBrandName$annotations", "()V", "b", "getLabel", "getLabel$annotations", "getWarningLabel", "getWarningLabel$annotations", "d", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$AdditionalInformationRemote;", "getAdditionalInformation", "()Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$AdditionalInformationRemote;", "getAdditionalInformation$annotations", "Ljava/util/List;", "getIcons", "()Ljava/util/List;", "getIcons$annotations", "f", "Ljava/lang/Boolean;", "getSkipCVV", "()Ljava/lang/Boolean;", "getSkipCVV$annotations", "g", "getPaymentBinDetectionType", "getPaymentBinDetectionType$annotations", "h", "Ljava/lang/Integer;", "getRating", "()Ljava/lang/Integer;", "getRating$annotations", "Companion", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PaymentOptionRemote implements C11768b<D.g> {
        public static final a Companion = new a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public static final KSerializer<Object>[] f94234i = {null, null, null, null, new C17451f(Y0.f144077a), null, null, null};

        /* renamed from: a  reason: collision with root package name */
        private final String f94235a;

        /* renamed from: b  reason: collision with root package name */
        private final String f94236b;

        /* renamed from: c  reason: collision with root package name */
        private final String f94237c;

        /* renamed from: d  reason: collision with root package name */
        private final AdditionalInformationRemote f94238d;

        /* renamed from: e  reason: collision with root package name */
        private final List<String> f94239e;

        /* renamed from: f  reason: collision with root package name */
        private final Boolean f94240f;

        /* renamed from: g  reason: collision with root package name */
        private final String f94241g;

        /* renamed from: h  reason: collision with root package name */
        private final Integer f94242h;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$PaymentOptionRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$PaymentOptionRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<PaymentOptionRemote> serializer() {
                return PaymentOptionsRemote$PaymentOptionRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ PaymentOptionRemote(int i10, String str, String str2, String str3, AdditionalInformationRemote additionalInformationRemote, List list, Boolean bool, String str4, Integer num, T0 t02) {
            if (255 != (i10 & 255)) {
                E0.b(i10, 255, PaymentOptionsRemote$PaymentOptionRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f94235a = str;
            this.f94236b = str2;
            this.f94237c = str3;
            this.f94238d = additionalInformationRemote;
            this.f94239e = list;
            this.f94240f = bool;
            this.f94241g = str4;
            this.f94242h = num;
        }

        /* access modifiers changed from: private */
        public static final D.g d(PaymentOptionRemote paymentOptionRemote) {
            Integer num = paymentOptionRemote.f94242h;
            int intValue = num != null ? num.intValue() : 0;
            String str = paymentOptionRemote.f94235a;
            if (str != null) {
                String str2 = paymentOptionRemote.f94236b;
                if (str2 != null) {
                    Boolean bool = paymentOptionRemote.f94240f;
                    boolean booleanValue = bool != null ? bool.booleanValue() : false;
                    String str3 = paymentOptionRemote.f94237c;
                    AdditionalInformationRemote additionalInformationRemote = paymentOptionRemote.f94238d;
                    C10798a a10 = additionalInformationRemote != null ? additionalInformationRemote.a() : null;
                    List<String> list = paymentOptionRemote.f94239e;
                    if (list == null) {
                        list = C16877v.n();
                    }
                    return new D.g(intValue, str, str2, booleanValue, str3, a10, list, C16877v.n(), a.Companion.a(paymentOptionRemote.f94241g).b(), (D.f) null, (D.a) null);
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        public static final /* synthetic */ void e(PaymentOptionRemote paymentOptionRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = f94234i;
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 0, y02, paymentOptionRemote.f94235a);
            dVar.B(serialDescriptor, 1, y02, paymentOptionRemote.f94236b);
            dVar.B(serialDescriptor, 2, y02, paymentOptionRemote.f94237c);
            dVar.B(serialDescriptor, 3, PaymentOptionsRemote$AdditionalInformationRemote$$serializer.INSTANCE, paymentOptionRemote.f94238d);
            dVar.B(serialDescriptor, 4, kSerializerArr[4], paymentOptionRemote.f94239e);
            dVar.B(serialDescriptor, 5, C17457i.f144111a, paymentOptionRemote.f94240f);
            dVar.B(serialDescriptor, 6, y02, paymentOptionRemote.f94241g);
            dVar.B(serialDescriptor, 7, X.f144073a, paymentOptionRemote.f94242h);
        }

        public D.g c() {
            return (D.g) k.b(this, new h(this));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentOptionRemote)) {
                return false;
            }
            PaymentOptionRemote paymentOptionRemote = (PaymentOptionRemote) obj;
            return C17542s.e(this.f94235a, paymentOptionRemote.f94235a) && C17542s.e(this.f94236b, paymentOptionRemote.f94236b) && C17542s.e(this.f94237c, paymentOptionRemote.f94237c) && C17542s.e(this.f94238d, paymentOptionRemote.f94238d) && C17542s.e(this.f94239e, paymentOptionRemote.f94239e) && C17542s.e(this.f94240f, paymentOptionRemote.f94240f) && C17542s.e(this.f94241g, paymentOptionRemote.f94241g) && C17542s.e(this.f94242h, paymentOptionRemote.f94242h);
        }

        public int hashCode() {
            String str = this.f94235a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f94236b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f94237c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            AdditionalInformationRemote additionalInformationRemote = this.f94238d;
            int hashCode4 = (hashCode3 + (additionalInformationRemote == null ? 0 : additionalInformationRemote.hashCode())) * 31;
            List<String> list = this.f94239e;
            int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
            Boolean bool = this.f94240f;
            int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str4 = this.f94241g;
            int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Integer num = this.f94242h;
            if (num != null) {
                i10 = num.hashCode();
            }
            return hashCode7 + i10;
        }

        public String toString() {
            String str = this.f94235a;
            String str2 = this.f94236b;
            String str3 = this.f94237c;
            AdditionalInformationRemote additionalInformationRemote = this.f94238d;
            List<String> list = this.f94239e;
            Boolean bool = this.f94240f;
            String str4 = this.f94241g;
            Integer num = this.f94242h;
            return "PaymentOptionRemote(pspBrandName=" + str + ", label=" + str2 + ", warningLabel=" + str3 + ", additionalInformation=" + additionalInformationRemote + ", icons=" + list + ", skipCVV=" + bool + ", paymentBinDetectionType=" + str4 + ", rating=" + num + ")";
        }
    }

    @p
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\b\u0018\u0000 =2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002>%B]\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u001dR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u0010&\u0012\u0004\b,\u0010)\u001a\u0004\b+\u0010\u001dR\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010&\u0012\u0004\b.\u0010)\u001a\u0004\b-\u0010\u001dR\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b3\u0010)\u001a\u0004\b1\u00102R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0018\u00104\u0012\u0004\b7\u0010)\u001a\u0004\b5\u00106R(\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b8\u00109\u0012\u0004\b<\u0010)\u001a\u0004\b:\u0010;¨\u0006?"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$PrepaidPaymentOptionRemote;", "Lpp/b;", "LNn/D$b;", "", "seen0", "", "pspBrandName", "label", "warningLabel", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$AdditionalInformationRemote;", "additionalInformation", "rating", "", "icons", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$AdditionalInformationRemote;Ljava/lang/Integer;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "e", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$PrepaidPaymentOptionRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "c", "()LNn/D$b;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getPspBrandName", "getPspBrandName$annotations", "()V", "b", "getLabel", "getLabel$annotations", "getWarningLabel", "getWarningLabel$annotations", "d", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$AdditionalInformationRemote;", "getAdditionalInformation", "()Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$AdditionalInformationRemote;", "getAdditionalInformation$annotations", "Ljava/lang/Integer;", "getRating", "()Ljava/lang/Integer;", "getRating$annotations", "f", "Ljava/util/List;", "getIcons", "()Ljava/util/List;", "getIcons$annotations", "Companion", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PrepaidPaymentOptionRemote implements C11768b<D.b> {
        public static final a Companion = new a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public static final KSerializer<Object>[] f94243g = {null, null, null, null, null, new C17451f(Y0.f144077a)};

        /* renamed from: a  reason: collision with root package name */
        private final String f94244a;

        /* renamed from: b  reason: collision with root package name */
        private final String f94245b;

        /* renamed from: c  reason: collision with root package name */
        private final String f94246c;

        /* renamed from: d  reason: collision with root package name */
        private final AdditionalInformationRemote f94247d;

        /* renamed from: e  reason: collision with root package name */
        private final Integer f94248e;

        /* renamed from: f  reason: collision with root package name */
        private final List<String> f94249f;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$PrepaidPaymentOptionRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$PrepaidPaymentOptionRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<PrepaidPaymentOptionRemote> serializer() {
                return PaymentOptionsRemote$PrepaidPaymentOptionRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ PrepaidPaymentOptionRemote(int i10, String str, String str2, String str3, AdditionalInformationRemote additionalInformationRemote, Integer num, List list, T0 t02) {
            if (63 != (i10 & 63)) {
                E0.b(i10, 63, PaymentOptionsRemote$PrepaidPaymentOptionRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f94244a = str;
            this.f94245b = str2;
            this.f94246c = str3;
            this.f94247d = additionalInformationRemote;
            this.f94248e = num;
            this.f94249f = list;
        }

        /* access modifiers changed from: private */
        public static final D.b d(PrepaidPaymentOptionRemote prepaidPaymentOptionRemote) {
            Integer num = prepaidPaymentOptionRemote.f94248e;
            int intValue = num != null ? num.intValue() : 0;
            String str = prepaidPaymentOptionRemote.f94244a;
            if (str != null) {
                String str2 = prepaidPaymentOptionRemote.f94245b;
                if (str2 != null) {
                    String str3 = prepaidPaymentOptionRemote.f94246c;
                    AdditionalInformationRemote additionalInformationRemote = prepaidPaymentOptionRemote.f94247d;
                    C10798a a10 = additionalInformationRemote != null ? additionalInformationRemote.a() : null;
                    List<String> list = prepaidPaymentOptionRemote.f94249f;
                    if (list == null) {
                        list = C16877v.n();
                    }
                    return new D.b(intValue, str, str2, false, str3, a10, list, 8, (DefaultConstructorMarker) null);
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        public static final /* synthetic */ void e(PrepaidPaymentOptionRemote prepaidPaymentOptionRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = f94243g;
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 0, y02, prepaidPaymentOptionRemote.f94244a);
            dVar.B(serialDescriptor, 1, y02, prepaidPaymentOptionRemote.f94245b);
            dVar.B(serialDescriptor, 2, y02, prepaidPaymentOptionRemote.f94246c);
            dVar.B(serialDescriptor, 3, PaymentOptionsRemote$AdditionalInformationRemote$$serializer.INSTANCE, prepaidPaymentOptionRemote.f94247d);
            dVar.B(serialDescriptor, 4, X.f144073a, prepaidPaymentOptionRemote.f94248e);
            dVar.B(serialDescriptor, 5, kSerializerArr[5], prepaidPaymentOptionRemote.f94249f);
        }

        public D.b c() {
            return (D.b) k.b(this, new i(this));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PrepaidPaymentOptionRemote)) {
                return false;
            }
            PrepaidPaymentOptionRemote prepaidPaymentOptionRemote = (PrepaidPaymentOptionRemote) obj;
            return C17542s.e(this.f94244a, prepaidPaymentOptionRemote.f94244a) && C17542s.e(this.f94245b, prepaidPaymentOptionRemote.f94245b) && C17542s.e(this.f94246c, prepaidPaymentOptionRemote.f94246c) && C17542s.e(this.f94247d, prepaidPaymentOptionRemote.f94247d) && C17542s.e(this.f94248e, prepaidPaymentOptionRemote.f94248e) && C17542s.e(this.f94249f, prepaidPaymentOptionRemote.f94249f);
        }

        public int hashCode() {
            String str = this.f94244a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f94245b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f94246c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            AdditionalInformationRemote additionalInformationRemote = this.f94247d;
            int hashCode4 = (hashCode3 + (additionalInformationRemote == null ? 0 : additionalInformationRemote.hashCode())) * 31;
            Integer num = this.f94248e;
            int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
            List<String> list = this.f94249f;
            if (list != null) {
                i10 = list.hashCode();
            }
            return hashCode5 + i10;
        }

        public String toString() {
            String str = this.f94244a;
            String str2 = this.f94245b;
            String str3 = this.f94246c;
            AdditionalInformationRemote additionalInformationRemote = this.f94247d;
            Integer num = this.f94248e;
            List<String> list = this.f94249f;
            return "PrepaidPaymentOptionRemote(pspBrandName=" + str + ", label=" + str2 + ", warningLabel=" + str3 + ", additionalInformation=" + additionalInformationRemote + ", rating=" + num + ", icons=" + list + ")";
        }
    }

    @p
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b+\b\b\u0018\u0000 N2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002O)B{\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\r2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\"R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b.\u0010*\u0012\u0004\b0\u0010-\u001a\u0004\b/\u0010\"R\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010*\u0012\u0004\b2\u0010-\u001a\u0004\b1\u0010\"R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b3\u00104\u0012\u0004\b7\u0010-\u001a\u0004\b5\u00106R(\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u00108\u0012\u0004\b;\u0010-\u001a\u0004\b9\u0010:R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0004¢\u0006\u0012\n\u0004\b<\u0010=\u0012\u0004\b@\u0010-\u001a\u0004\b>\u0010?R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\bA\u0010*\u0012\u0004\bC\u0010-\u001a\u0004\bB\u0010\"R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\u0012\n\u0004\bD\u0010E\u0012\u0004\bH\u0010-\u001a\u0004\bF\u0010GR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0004¢\u0006\u0012\n\u0004\bI\u0010J\u0012\u0004\bM\u0010-\u001a\u0004\bK\u0010L¨\u0006P"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$WalletPaymentOptionRemote;", "Lpp/b;", "LNn/D$h;", "", "seen0", "", "pspBrandName", "label", "warningLabel", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$AdditionalInformationRemote;", "additionalInformation", "", "icons", "", "skipCVV", "paymentBinDetectionType", "rating", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$ConfigurationRemote;", "configuration", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$AdditionalInformationRemote;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$ConfigurationRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "e", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$WalletPaymentOptionRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "c", "()LNn/D$h;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getPspBrandName", "getPspBrandName$annotations", "()V", "b", "getLabel", "getLabel$annotations", "getWarningLabel", "getWarningLabel$annotations", "d", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$AdditionalInformationRemote;", "getAdditionalInformation", "()Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$AdditionalInformationRemote;", "getAdditionalInformation$annotations", "Ljava/util/List;", "getIcons", "()Ljava/util/List;", "getIcons$annotations", "f", "Ljava/lang/Boolean;", "getSkipCVV", "()Ljava/lang/Boolean;", "getSkipCVV$annotations", "g", "getPaymentBinDetectionType", "getPaymentBinDetectionType$annotations", "h", "Ljava/lang/Integer;", "getRating", "()Ljava/lang/Integer;", "getRating$annotations", "i", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$ConfigurationRemote;", "getConfiguration", "()Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$ConfigurationRemote;", "getConfiguration$annotations", "Companion", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class WalletPaymentOptionRemote implements C11768b<D.h> {
        public static final a Companion = new a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public static final KSerializer<Object>[] f94250j = {null, null, null, null, new C17451f(Y0.f144077a), null, null, null, null};

        /* renamed from: a  reason: collision with root package name */
        private final String f94251a;

        /* renamed from: b  reason: collision with root package name */
        private final String f94252b;

        /* renamed from: c  reason: collision with root package name */
        private final String f94253c;

        /* renamed from: d  reason: collision with root package name */
        private final AdditionalInformationRemote f94254d;

        /* renamed from: e  reason: collision with root package name */
        private final List<String> f94255e;

        /* renamed from: f  reason: collision with root package name */
        private final Boolean f94256f;

        /* renamed from: g  reason: collision with root package name */
        private final String f94257g;

        /* renamed from: h  reason: collision with root package name */
        private final Integer f94258h;

        /* renamed from: i  reason: collision with root package name */
        private final ConfigurationRemote f94259i;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$WalletPaymentOptionRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$WalletPaymentOptionRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<WalletPaymentOptionRemote> serializer() {
                return PaymentOptionsRemote$WalletPaymentOptionRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ WalletPaymentOptionRemote(int i10, String str, String str2, String str3, AdditionalInformationRemote additionalInformationRemote, List list, Boolean bool, String str4, Integer num, ConfigurationRemote configurationRemote, T0 t02) {
            if (511 != (i10 & 511)) {
                E0.b(i10, 511, PaymentOptionsRemote$WalletPaymentOptionRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f94251a = str;
            this.f94252b = str2;
            this.f94253c = str3;
            this.f94254d = additionalInformationRemote;
            this.f94255e = list;
            this.f94256f = bool;
            this.f94257g = str4;
            this.f94258h = num;
            this.f94259i = configurationRemote;
        }

        /* access modifiers changed from: private */
        public static final D.h d(WalletPaymentOptionRemote walletPaymentOptionRemote) {
            D.a aVar;
            C10798a aVar2 = null;
            if (C17542s.e(walletPaymentOptionRemote.f94251a, CheckoutConstants.PaymentBrands.AFTERPAY_PACIFIC)) {
                ConfigurationRemote configurationRemote = walletPaymentOptionRemote.f94259i;
                D.a b10 = configurationRemote != null ? configurationRemote.b() : null;
                if (b10 != null) {
                    aVar = b10;
                } else {
                    throw new IllegalArgumentException("AfterPay configuration is missing");
                }
            } else {
                aVar = null;
            }
            Integer num = walletPaymentOptionRemote.f94258h;
            boolean z10 = false;
            int intValue = num != null ? num.intValue() : 0;
            String str = walletPaymentOptionRemote.f94251a;
            if (str != null) {
                String str2 = walletPaymentOptionRemote.f94252b;
                if (str2 != null) {
                    Boolean bool = walletPaymentOptionRemote.f94256f;
                    if (bool != null) {
                        z10 = bool.booleanValue();
                    }
                    boolean z11 = z10;
                    String str3 = walletPaymentOptionRemote.f94253c;
                    AdditionalInformationRemote additionalInformationRemote = walletPaymentOptionRemote.f94254d;
                    if (additionalInformationRemote != null) {
                        aVar2 = additionalInformationRemote.a();
                    }
                    C10798a aVar3 = aVar2;
                    List<String> list = walletPaymentOptionRemote.f94255e;
                    if (list == null) {
                        list = C16877v.n();
                    }
                    return new D.h(intValue, str, str2, z11, str3, aVar3, list, a.Companion.a(walletPaymentOptionRemote.f94257g).b(), aVar);
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        public static final /* synthetic */ void e(WalletPaymentOptionRemote walletPaymentOptionRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = f94250j;
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 0, y02, walletPaymentOptionRemote.f94251a);
            dVar.B(serialDescriptor, 1, y02, walletPaymentOptionRemote.f94252b);
            dVar.B(serialDescriptor, 2, y02, walletPaymentOptionRemote.f94253c);
            dVar.B(serialDescriptor, 3, PaymentOptionsRemote$AdditionalInformationRemote$$serializer.INSTANCE, walletPaymentOptionRemote.f94254d);
            dVar.B(serialDescriptor, 4, kSerializerArr[4], walletPaymentOptionRemote.f94255e);
            dVar.B(serialDescriptor, 5, C17457i.f144111a, walletPaymentOptionRemote.f94256f);
            dVar.B(serialDescriptor, 6, y02, walletPaymentOptionRemote.f94257g);
            dVar.B(serialDescriptor, 7, X.f144073a, walletPaymentOptionRemote.f94258h);
            dVar.B(serialDescriptor, 8, PaymentOptionsRemote$ConfigurationRemote$$serializer.INSTANCE, walletPaymentOptionRemote.f94259i);
        }

        public D.h c() {
            return (D.h) k.b(this, new j(this));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WalletPaymentOptionRemote)) {
                return false;
            }
            WalletPaymentOptionRemote walletPaymentOptionRemote = (WalletPaymentOptionRemote) obj;
            return C17542s.e(this.f94251a, walletPaymentOptionRemote.f94251a) && C17542s.e(this.f94252b, walletPaymentOptionRemote.f94252b) && C17542s.e(this.f94253c, walletPaymentOptionRemote.f94253c) && C17542s.e(this.f94254d, walletPaymentOptionRemote.f94254d) && C17542s.e(this.f94255e, walletPaymentOptionRemote.f94255e) && C17542s.e(this.f94256f, walletPaymentOptionRemote.f94256f) && C17542s.e(this.f94257g, walletPaymentOptionRemote.f94257g) && C17542s.e(this.f94258h, walletPaymentOptionRemote.f94258h) && C17542s.e(this.f94259i, walletPaymentOptionRemote.f94259i);
        }

        public int hashCode() {
            String str = this.f94251a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f94252b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f94253c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            AdditionalInformationRemote additionalInformationRemote = this.f94254d;
            int hashCode4 = (hashCode3 + (additionalInformationRemote == null ? 0 : additionalInformationRemote.hashCode())) * 31;
            List<String> list = this.f94255e;
            int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
            Boolean bool = this.f94256f;
            int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str4 = this.f94257g;
            int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Integer num = this.f94258h;
            int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
            ConfigurationRemote configurationRemote = this.f94259i;
            if (configurationRemote != null) {
                i10 = configurationRemote.hashCode();
            }
            return hashCode8 + i10;
        }

        public String toString() {
            String str = this.f94251a;
            String str2 = this.f94252b;
            String str3 = this.f94253c;
            AdditionalInformationRemote additionalInformationRemote = this.f94254d;
            List<String> list = this.f94255e;
            Boolean bool = this.f94256f;
            String str4 = this.f94257g;
            Integer num = this.f94258h;
            ConfigurationRemote configurationRemote = this.f94259i;
            return "WalletPaymentOptionRemote(pspBrandName=" + str + ", label=" + str2 + ", warningLabel=" + str3 + ", additionalInformation=" + additionalInformationRemote + ", icons=" + list + ", skipCVV=" + bool + ", paymentBinDetectionType=" + str4 + ", rating=" + num + ", configuration=" + configurationRemote + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$a;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "LNn/B;", "b", "()LNn/B;", "Ljava/lang/String;", "m", "()Ljava/lang/String;", "Companion", "a", "REGEX", "BINLIST", "NONE", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum a {
        REGEX("REGEX"),
        BINLIST("BINLIST"),
        NONE("NONE");
        
        public static final C2098a Companion = null;
        private final String rawValue;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$a$a;", "", "<init>", "()V", "", "rawValue", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$a;", "a", "(Ljava/lang/String;)Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$a;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$a$a  reason: collision with other inner class name */
        public static final class C2098a {
            public /* synthetic */ C2098a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(String str) {
                T t10;
                Iterator<T> it = a.j().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t10 = null;
                        break;
                    }
                    t10 = it.next();
                    if (C15854t.H(((a) t10).m(), str, true)) {
                        break;
                    }
                }
                a aVar = (a) t10;
                return aVar == null ? a.NONE : aVar;
            }

            private C2098a() {
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class b {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f94260a = null;

            /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            static {
                /*
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$a[] r0 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote.a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$a r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote.a.REGEX     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$a r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote.a.BINLIST     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote$a r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote.a.NONE     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    f94260a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote.a.b.<clinit>():void");
            }
        }

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
            Companion = new C2098a((DefaultConstructorMarker) null);
        }

        private a(String str) {
            this.rawValue = str;
        }

        public static C17220a<a> j() {
            return $ENTRIES;
        }

        public final B b() {
            int i10 = b.f94260a[ordinal()];
            if (i10 == 1) {
                return B.REGEX;
            }
            if (i10 == 2) {
                return B.BINLIST;
            }
            if (i10 == 3) {
                return B.DEFAULT;
            }
            throw new t();
        }

        public final String m() {
            return this.rawValue;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote$b;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentOptionsRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "AFTERPAY_PACIFIC_BRAND", "Ljava/lang/String;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PaymentOptionsRemote> serializer() {
            return PaymentOptionsRemote$$serializer.INSTANCE;
        }

        private b() {
        }
    }

    static {
        C17451f fVar = new C17451f(PaymentOptionsRemote$CreditCardOptionRemote$$serializer.INSTANCE);
        PaymentOptionsRemote$PaymentOptionRemote$$serializer paymentOptionsRemote$PaymentOptionRemote$$serializer = PaymentOptionsRemote$PaymentOptionRemote$$serializer.INSTANCE;
        f94174k = new KSerializer[]{null, fVar, new C17451f(paymentOptionsRemote$PaymentOptionRemote$$serializer), new C17451f(paymentOptionsRemote$PaymentOptionRemote$$serializer), new C17451f(PaymentOptionsRemote$WalletPaymentOptionRemote$$serializer.INSTANCE), new C17451f(PaymentOptionsRemote$PrepaidPaymentOptionRemote$$serializer.INSTANCE), new C17451f(PaymentOptionsRemote$OnlineTransferRemote$$serializer.INSTANCE), new C17451f(PaymentOptionsRemote$PayOnDeliveryRemote$$serializer.INSTANCE), new C17451f(PaymentOptionsRemote$GooglePayOptionRemote$$serializer.INSTANCE), new C17451f(PaymentOptionsRemote$PaymentGroupRemote$$serializer.INSTANCE)};
    }

    public /* synthetic */ PaymentOptionsRemote(int i10, String str, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, T0 t02) {
        if (1023 != (i10 & 1023)) {
            E0.b(i10, 1023, PaymentOptionsRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f94175a = str;
        this.f94176b = list;
        this.f94177c = list2;
        this.f94178d = list3;
        this.f94179e = list4;
        this.f94180f = list5;
        this.f94181g = list6;
        this.f94182h = list7;
        this.f94183i = list8;
        this.f94184j = list9;
    }

    public static final /* synthetic */ void c(PaymentOptionsRemote paymentOptionsRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f94174k;
        dVar.B(serialDescriptor, 0, Y0.f144077a, paymentOptionsRemote.f94175a);
        dVar.B(serialDescriptor, 1, kSerializerArr[1], paymentOptionsRemote.f94176b);
        dVar.B(serialDescriptor, 2, kSerializerArr[2], paymentOptionsRemote.f94177c);
        dVar.B(serialDescriptor, 3, kSerializerArr[3], paymentOptionsRemote.f94178d);
        dVar.B(serialDescriptor, 4, kSerializerArr[4], paymentOptionsRemote.f94179e);
        dVar.B(serialDescriptor, 5, kSerializerArr[5], paymentOptionsRemote.f94180f);
        dVar.B(serialDescriptor, 6, kSerializerArr[6], paymentOptionsRemote.f94181g);
        dVar.B(serialDescriptor, 7, kSerializerArr[7], paymentOptionsRemote.f94182h);
        dVar.B(serialDescriptor, 8, kSerializerArr[8], paymentOptionsRemote.f94183i);
        dVar.B(serialDescriptor, 9, kSerializerArr[9], paymentOptionsRemote.f94184j);
    }

    public List<D> b() {
        ArrayList arrayList;
        Collection collection;
        Collection collection2;
        Collection collection3;
        Collection collection4;
        Collection collection5;
        Collection collection6;
        Collection collection7;
        List<PaymentGroupRemote> list = this.f94184j;
        Collection collection8 = null;
        if (list != null) {
            arrayList = new ArrayList();
            for (PaymentGroupRemote a10 : list) {
                D.f a11 = a10.a();
                if (a11 != null) {
                    arrayList.add(a11);
                }
            }
        } else {
            arrayList = null;
        }
        List<CreditCardOptionRemote> list2 = this.f94176b;
        if (list2 != null) {
            collection = new ArrayList();
            for (CreditCardOptionRemote c10 : list2) {
                D.g c11 = c10.c(arrayList);
                if (c11 != null) {
                    collection.add(c11);
                }
            }
        } else {
            collection = null;
        }
        List<PaymentOptionRemote> list3 = this.f94177c;
        if (list3 != null) {
            collection2 = new ArrayList();
            for (PaymentOptionRemote c12 : list3) {
                D.g c13 = c12.c();
                if (c13 != null) {
                    collection2.add(c13);
                }
            }
        } else {
            collection2 = null;
        }
        List<WalletPaymentOptionRemote> list4 = this.f94179e;
        if (list4 != null) {
            collection3 = new ArrayList();
            for (WalletPaymentOptionRemote c14 : list4) {
                D.h c15 = c14.c();
                if (c15 != null) {
                    collection3.add(c15);
                }
            }
        } else {
            collection3 = null;
        }
        List<PaymentOptionRemote> list5 = this.f94178d;
        if (list5 != null) {
            collection4 = new ArrayList();
            for (PaymentOptionRemote c16 : list5) {
                D.g c17 = c16.c();
                if (c17 != null) {
                    collection4.add(c17);
                }
            }
        } else {
            collection4 = null;
        }
        List<PrepaidPaymentOptionRemote> list6 = this.f94180f;
        if (list6 != null) {
            collection5 = new ArrayList();
            for (PrepaidPaymentOptionRemote c18 : list6) {
                D.b c19 = c18.c();
                if (c19 != null) {
                    collection5.add(c19);
                }
            }
        } else {
            collection5 = null;
        }
        List<OnlineTransferRemote> list7 = this.f94181g;
        if (list7 != null) {
            collection6 = new ArrayList();
            for (OnlineTransferRemote c20 : list7) {
                D.d c21 = c20.c();
                if (c21 != null) {
                    collection6.add(c21);
                }
            }
        } else {
            collection6 = null;
        }
        List<PayOnDeliveryRemote> list8 = this.f94182h;
        if (list8 != null) {
            collection7 = new ArrayList();
            for (PayOnDeliveryRemote c22 : list8) {
                D.e c23 = c22.c();
                if (c23 != null) {
                    collection7.add(c23);
                }
            }
        } else {
            collection7 = null;
        }
        List<GooglePayOptionRemote> list9 = this.f94183i;
        if (list9 != null) {
            collection8 = new ArrayList();
            for (GooglePayOptionRemote c24 : list9) {
                D.c c25 = c24.c();
                if (c25 != null) {
                    collection8.add(c25);
                }
            }
        }
        List c26 = C16877v.c();
        if (collection == null) {
            collection = C16877v.n();
        }
        c26.addAll(collection);
        if (collection2 == null) {
            collection2 = C16877v.n();
        }
        c26.addAll(collection2);
        if (collection3 == null) {
            collection3 = C16877v.n();
        }
        c26.addAll(collection3);
        if (collection4 == null) {
            collection4 = C16877v.n();
        }
        c26.addAll(collection4);
        if (collection5 == null) {
            collection5 = C16877v.n();
        }
        c26.addAll(collection5);
        if (collection6 == null) {
            collection6 = C16877v.n();
        }
        c26.addAll(collection6);
        if (collection7 == null) {
            collection7 = C16877v.n();
        }
        c26.addAll(collection7);
        if (collection8 == null) {
            collection8 = C16877v.n();
        }
        c26.addAll(collection8);
        return C16877v.a(c26);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentOptionsRemote)) {
            return false;
        }
        PaymentOptionsRemote paymentOptionsRemote = (PaymentOptionsRemote) obj;
        return C17542s.e(this.f94175a, paymentOptionsRemote.f94175a) && C17542s.e(this.f94176b, paymentOptionsRemote.f94176b) && C17542s.e(this.f94177c, paymentOptionsRemote.f94177c) && C17542s.e(this.f94178d, paymentOptionsRemote.f94178d) && C17542s.e(this.f94179e, paymentOptionsRemote.f94179e) && C17542s.e(this.f94180f, paymentOptionsRemote.f94180f) && C17542s.e(this.f94181g, paymentOptionsRemote.f94181g) && C17542s.e(this.f94182h, paymentOptionsRemote.f94182h) && C17542s.e(this.f94183i, paymentOptionsRemote.f94183i) && C17542s.e(this.f94184j, paymentOptionsRemote.f94184j);
    }

    public int hashCode() {
        String str = this.f94175a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<CreditCardOptionRemote> list = this.f94176b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<PaymentOptionRemote> list2 = this.f94177c;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<PaymentOptionRemote> list3 = this.f94178d;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<WalletPaymentOptionRemote> list4 = this.f94179e;
        int hashCode5 = (hashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<PrepaidPaymentOptionRemote> list5 = this.f94180f;
        int hashCode6 = (hashCode5 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<OnlineTransferRemote> list6 = this.f94181g;
        int hashCode7 = (hashCode6 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<PayOnDeliveryRemote> list7 = this.f94182h;
        int hashCode8 = (hashCode7 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<GooglePayOptionRemote> list8 = this.f94183i;
        int hashCode9 = (hashCode8 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<PaymentGroupRemote> list9 = this.f94184j;
        if (list9 != null) {
            i10 = list9.hashCode();
        }
        return hashCode9 + i10;
    }

    public String toString() {
        String str = this.f94175a;
        List<CreditCardOptionRemote> list = this.f94176b;
        List<PaymentOptionRemote> list2 = this.f94177c;
        List<PaymentOptionRemote> list3 = this.f94178d;
        List<WalletPaymentOptionRemote> list4 = this.f94179e;
        List<PrepaidPaymentOptionRemote> list5 = this.f94180f;
        List<OnlineTransferRemote> list6 = this.f94181g;
        List<PayOnDeliveryRemote> list7 = this.f94182h;
        List<GooglePayOptionRemote> list8 = this.f94183i;
        List<PaymentGroupRemote> list9 = this.f94184j;
        return "PaymentOptionsRemote(paymentContextId=" + str + ", creditCardPaymentTypes=" + list + ", customerFinancePaymentTypes=" + list2 + ", openInvoicePaymentTypes=" + list3 + ", walletPaymentTypes=" + list4 + ", prepaidPaymentTypes=" + list5 + ", onlineTransferPaymentTypes=" + list6 + ", payOnDeliveryPaymentTypes=" + list7 + ", googlePayPaymentTypes=" + list8 + ", grouping=" + list9 + ")";
    }
}
