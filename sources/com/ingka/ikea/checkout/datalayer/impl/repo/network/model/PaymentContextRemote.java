package com.ingka.ikea.checkout.datalayer.impl.repo.network.model;

import HJ.C15854t;
import Nn.F;
import Rn.f;
import Rn.h;
import XH.t;
import com.sugarcube.core.logger.DslKt;
import fI.C17220a;
import fI.C17221b;
import fK.p;
import iK.C17395d;
import jK.C17438C;
import jK.C17451f;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
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
import qv.d;
import qv.e;

@p
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b.\b\b\u0018\u0000 W2\b\u0012\u0004\u0012\u00020\u00020\u0001:\t\u001fXYZ[\\]^4B­\u0001\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\f\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\f\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\f\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001f\u001a\u00020\u001e*\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J'\u0010'\u001a\u00020&2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0001¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0002H\u0016¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b2\u00103R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b4\u00105\u0012\u0004\b7\u00108\u001a\u0004\b6\u0010,R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u00109\u0012\u0004\b<\u00108\u001a\u0004\b:\u0010;R\"\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b=\u00109\u0012\u0004\b?\u00108\u001a\u0004\b>\u0010;R\"\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u00105\u0012\u0004\bA\u00108\u001a\u0004\b@\u0010,R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u00105\u0012\u0004\bB\u00108\u001a\u0004\b=\u0010,R(\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\bC\u0010D\u0012\u0004\bG\u00108\u001a\u0004\bE\u0010FR(\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\bH\u0010D\u0012\u0004\bJ\u00108\u001a\u0004\bI\u0010FR(\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\bK\u0010D\u0012\u0004\bM\u00108\u001a\u0004\bL\u0010FR(\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\bN\u0010D\u0012\u0004\bP\u00108\u001a\u0004\bO\u0010FR(\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\bQ\u0010D\u0012\u0004\bS\u00108\u001a\u0004\bR\u0010FR(\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\bT\u0010D\u0012\u0004\bV\u00108\u001a\u0004\bU\u0010F¨\u0006_"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote;", "Lpp/b;", "LRn/f;", "", "seen0", "", "paymentContextId", "", "amountLeftToPay", "amountPaid", "orderNumber", "status", "", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$CreditCardTransactionRemote;", "creditCardTransactions", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$PrepaidCardTransactionRemote;", "prepaidCardTransactions", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$WalletTransactionRemote;", "walletTransactions", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$AccountVoucherTransactionRemote;", "accountVoucherTransactions", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$OpenInvoiceTransactionRemote;", "openInvoiceTransactions", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$OnlineTransferTransactionRemote;", "onlineTransferTransactions", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;LjK/T0;)V", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$b;", "LRn/h;", "b", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$b;)LRn/h;", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "e", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "d", "()LRn/f;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getPaymentContextId", "getPaymentContextId$annotations", "()V", "Ljava/lang/Double;", "getAmountLeftToPay", "()Ljava/lang/Double;", "getAmountLeftToPay$annotations", "c", "getAmountPaid", "getAmountPaid$annotations", "getOrderNumber", "getOrderNumber$annotations", "getStatus$annotations", "f", "Ljava/util/List;", "getCreditCardTransactions", "()Ljava/util/List;", "getCreditCardTransactions$annotations", "g", "getPrepaidCardTransactions", "getPrepaidCardTransactions$annotations", "h", "getWalletTransactions", "getWalletTransactions$annotations", "i", "getAccountVoucherTransactions", "getAccountVoucherTransactions$annotations", "j", "getOpenInvoiceTransactions", "getOpenInvoiceTransactions$annotations", "k", "getOnlineTransferTransactions", "getOnlineTransferTransactions$annotations", "Companion", "CreditCardTransactionRemote", "PrepaidCardTransactionRemote", "WalletTransactionRemote", "AccountVoucherTransactionRemote", "OpenInvoiceTransactionRemote", "OnlineTransferTransactionRemote", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PaymentContextRemote implements C11768b<f> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final KSerializer<Object>[] f94114l = {null, null, null, null, null, new C17451f(PaymentContextRemote$CreditCardTransactionRemote$$serializer.INSTANCE), new C17451f(PaymentContextRemote$PrepaidCardTransactionRemote$$serializer.INSTANCE), new C17451f(PaymentContextRemote$WalletTransactionRemote$$serializer.INSTANCE), new C17451f(PaymentContextRemote$AccountVoucherTransactionRemote$$serializer.INSTANCE), new C17451f(PaymentContextRemote$OpenInvoiceTransactionRemote$$serializer.INSTANCE), new C17451f(PaymentContextRemote$OnlineTransferTransactionRemote$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final String f94115a;

    /* renamed from: b  reason: collision with root package name */
    private final Double f94116b;

    /* renamed from: c  reason: collision with root package name */
    private final Double f94117c;

    /* renamed from: d  reason: collision with root package name */
    private final String f94118d;

    /* renamed from: e  reason: collision with root package name */
    private final String f94119e;

    /* renamed from: f  reason: collision with root package name */
    private final List<CreditCardTransactionRemote> f94120f;

    /* renamed from: g  reason: collision with root package name */
    private final List<PrepaidCardTransactionRemote> f94121g;

    /* renamed from: h  reason: collision with root package name */
    private final List<WalletTransactionRemote> f94122h;

    /* renamed from: i  reason: collision with root package name */
    private final List<AccountVoucherTransactionRemote> f94123i;

    /* renamed from: j  reason: collision with root package name */
    private final List<OpenInvoiceTransactionRemote> f94124j;

    /* renamed from: k  reason: collision with root package name */
    private final List<OnlineTransferTransactionRemote> f94125k;

    @p
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\b\b\u0018\u0000 ?2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0003&@\u001bBk\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u001eR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010'\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010\u001eR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010-\u0012\u0004\b0\u0010*\u001a\u0004\b.\u0010/R\"\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b1\u0010'\u0012\u0004\b3\u0010*\u001a\u0004\b2\u0010\u001eR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b4\u0010'\u0012\u0004\b6\u0010*\u001a\u0004\b5\u0010\u001eR\"\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b7\u0010'\u0012\u0004\b9\u0010*\u001a\u0004\b8\u0010\u001eR\"\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b:\u0010'\u0012\u0004\b;\u0010*\u001a\u0004\b&\u0010\u001eR\"\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b<\u0010'\u0012\u0004\b>\u0010*\u001a\u0004\b=\u0010\u001e¨\u0006A"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$AccountVoucherTransactionRemote;", "Lpp/b;", "LNn/F$a;", "", "seen0", "", "pspBrandName", "label", "", "amount", "pspTimestamp", "accountVoucherStatus", "reference", "expiryDate", "entityId", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$AccountVoucherTransactionRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()LNn/F$a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getPspBrandName", "getPspBrandName$annotations", "()V", "getLabel", "getLabel$annotations", "Ljava/lang/Double;", "getAmount", "()Ljava/lang/Double;", "getAmount$annotations", "d", "getPspTimestamp", "getPspTimestamp$annotations", "e", "getAccountVoucherStatus", "getAccountVoucherStatus$annotations", "f", "getReference", "getReference$annotations", "g", "getExpiryDate$annotations", "h", "getEntityId", "getEntityId$annotations", "Companion", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AccountVoucherTransactionRemote implements C11768b<F.a> {
        public static final b Companion = new b((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f94126a;

        /* renamed from: b  reason: collision with root package name */
        private final String f94127b;

        /* renamed from: c  reason: collision with root package name */
        private final Double f94128c;

        /* renamed from: d  reason: collision with root package name */
        private final String f94129d;

        /* renamed from: e  reason: collision with root package name */
        private final String f94130e;

        /* renamed from: f  reason: collision with root package name */
        private final String f94131f;

        /* renamed from: g  reason: collision with root package name */
        private final String f94132g;

        /* renamed from: h  reason: collision with root package name */
        private final String f94133h;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$AccountVoucherTransactionRemote$a;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "Companion", "a", "INITIALIZED", "CAPTURED", "FAILED", "CANCELLED", "UNCERTAIN", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public enum a {
            INITIALIZED("INITIALIZED"),
            CAPTURED("CAPTURED"),
            FAILED("FAILED"),
            CANCELLED("CANCELLED"),
            UNCERTAIN("UNCERTAIN");
            
            public static final C2097a Companion = null;
            private final String rawValue;

            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$AccountVoucherTransactionRemote$a$a;", "", "<init>", "()V", "", "rawValue", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$AccountVoucherTransactionRemote$a;", "a", "(Ljava/lang/String;)Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$AccountVoucherTransactionRemote$a;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$AccountVoucherTransactionRemote$a$a  reason: collision with other inner class name */
            public static final class C2097a {
                public /* synthetic */ C2097a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final a a(String str) {
                    T t10;
                    Iterator<T> it = a.b().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t10 = null;
                            break;
                        }
                        t10 = it.next();
                        if (C15854t.H(((a) t10).j(), str, true)) {
                            break;
                        }
                    }
                    a aVar = (a) t10;
                    if (aVar != null) {
                        return aVar;
                    }
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unknown status: " + str);
                    e eVar = e.ERROR;
                    ArrayList<C11819b> arrayList = new ArrayList<>();
                    for (Object next : d.f102012a.a()) {
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
                                return null;
                            }
                            str2 = C11820c.a(a10);
                        }
                        String str4 = str2;
                        if (str3 == null) {
                            String name = C2097a.class.getName();
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

                private C2097a() {
                }
            }

            static {
                a[] a10;
                $ENTRIES = C17221b.a(a10);
                Companion = new C2097a((DefaultConstructorMarker) null);
            }

            private a(String str) {
                this.rawValue = str;
            }

            public static C17220a<a> b() {
                return $ENTRIES;
            }

            public final String j() {
                return this.rawValue;
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$AccountVoucherTransactionRemote$b;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$AccountVoucherTransactionRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b {
            private b() {
            }

            public final KSerializer<AccountVoucherTransactionRemote> serializer() {
                return PaymentContextRemote$AccountVoucherTransactionRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class c {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f94134a;

            /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$AccountVoucherTransactionRemote$a[] r0 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.AccountVoucherTransactionRemote.a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$AccountVoucherTransactionRemote$a r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.AccountVoucherTransactionRemote.a.CAPTURED     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$AccountVoucherTransactionRemote$a r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.AccountVoucherTransactionRemote.a.UNCERTAIN     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$AccountVoucherTransactionRemote$a r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.AccountVoucherTransactionRemote.a.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$AccountVoucherTransactionRemote$a r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.AccountVoucherTransactionRemote.a.FAILED     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$AccountVoucherTransactionRemote$a r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.AccountVoucherTransactionRemote.a.CANCELLED     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    f94134a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.AccountVoucherTransactionRemote.c.<clinit>():void");
            }
        }

        public /* synthetic */ AccountVoucherTransactionRemote(int i10, String str, String str2, Double d10, String str3, String str4, String str5, String str6, String str7, T0 t02) {
            if (255 != (i10 & 255)) {
                E0.b(i10, 255, PaymentContextRemote$AccountVoucherTransactionRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f94126a = str;
            this.f94127b = str2;
            this.f94128c = d10;
            this.f94129d = str3;
            this.f94130e = str4;
            this.f94131f = str5;
            this.f94132g = str6;
            this.f94133h = str7;
        }

        public static final /* synthetic */ void c(AccountVoucherTransactionRemote accountVoucherTransactionRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 0, y02, accountVoucherTransactionRemote.f94126a);
            dVar.B(serialDescriptor, 1, y02, accountVoucherTransactionRemote.f94127b);
            dVar.B(serialDescriptor, 2, C17438C.f144010a, accountVoucherTransactionRemote.f94128c);
            dVar.B(serialDescriptor, 3, y02, accountVoucherTransactionRemote.f94129d);
            dVar.B(serialDescriptor, 4, y02, accountVoucherTransactionRemote.f94130e);
            dVar.B(serialDescriptor, 5, y02, accountVoucherTransactionRemote.f94131f);
            dVar.B(serialDescriptor, 6, y02, accountVoucherTransactionRemote.f94132g);
            dVar.B(serialDescriptor, 7, y02, accountVoucherTransactionRemote.f94133h);
        }

        public final String a() {
            return this.f94132g;
        }

        public F.a b() {
            boolean z10;
            String str;
            a a10 = a.Companion.a(this.f94130e);
            Double d10 = this.f94128c;
            String str2 = DslKt.INDICATOR_BACKGROUND;
            Class<AccountVoucherTransactionRemote> cls = AccountVoucherTransactionRemote.class;
            LocalDateTime localDateTime = null;
            if (d10 == null || a10 == null || this.f94131f == null || this.f94132g == null || this.f94133h == null) {
                String str3 = str2;
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Required fields missing: " + this);
                e eVar = e.ERROR;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str4 = null;
                String str5 = null;
                for (C11819b bVar : arrayList) {
                    if (str4 == null) {
                        String a11 = C11818a.a((String) null, illegalArgumentException);
                        if (a11 == null) {
                            break;
                        }
                        str4 = C11820c.a(a11);
                    }
                    if (str5 == null) {
                        String name = cls.getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str5 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str3) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    bVar.a(eVar, str5, false, illegalArgumentException, str4);
                }
                return null;
            }
            int i10 = c.f94134a[a10.ordinal()];
            if (i10 == 1 || i10 == 2) {
                z10 = true;
            } else if (i10 == 3 || i10 == 4 || i10 == 5) {
                z10 = false;
            } else {
                throw new t();
            }
            try {
                localDateTime = LocalDateTime.parse(this.f94132g, DateTimeFormatter.ISO_DATE_TIME);
            } catch (Exception e10) {
                e eVar2 = e.ERROR;
                ArrayList<C11819b> arrayList2 = new ArrayList<>();
                for (Object next2 : d.f102012a.a()) {
                    if (((C11819b) next2).b(eVar2, false)) {
                        arrayList2.add(next2);
                    }
                }
                String str6 = null;
                String str7 = null;
                for (C11819b bVar2 : arrayList2) {
                    if (str6 == null) {
                        String a12 = C11818a.a("Unable to parse expiryDate: " + a(), e10);
                        if (a12 == null) {
                            break;
                        }
                        str6 = C11820c.a(a12);
                    }
                    if (str7 == null) {
                        String name2 = cls.getName();
                        C17542s.g(name2);
                        str = str2;
                        String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o13.length() != 0) {
                            name2 = C15854t.P0(o13, "Kt");
                        }
                        str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name2;
                    } else {
                        str = str2;
                    }
                    bVar2.a(eVar2, str7, false, e10, str6);
                    str2 = str;
                }
            }
            return new F.a(this.f94126a, this.f94127b, z10, a10.j(), this.f94129d, (String) null, this.f94128c.doubleValue(), this.f94133h, this.f94131f, localDateTime, 32, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AccountVoucherTransactionRemote)) {
                return false;
            }
            AccountVoucherTransactionRemote accountVoucherTransactionRemote = (AccountVoucherTransactionRemote) obj;
            return C17542s.e(this.f94126a, accountVoucherTransactionRemote.f94126a) && C17542s.e(this.f94127b, accountVoucherTransactionRemote.f94127b) && C17542s.e(this.f94128c, accountVoucherTransactionRemote.f94128c) && C17542s.e(this.f94129d, accountVoucherTransactionRemote.f94129d) && C17542s.e(this.f94130e, accountVoucherTransactionRemote.f94130e) && C17542s.e(this.f94131f, accountVoucherTransactionRemote.f94131f) && C17542s.e(this.f94132g, accountVoucherTransactionRemote.f94132g) && C17542s.e(this.f94133h, accountVoucherTransactionRemote.f94133h);
        }

        public int hashCode() {
            String str = this.f94126a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f94127b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Double d10 = this.f94128c;
            int hashCode3 = (hashCode2 + (d10 == null ? 0 : d10.hashCode())) * 31;
            String str3 = this.f94129d;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f94130e;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f94131f;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f94132g;
            int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.f94133h;
            if (str7 != null) {
                i10 = str7.hashCode();
            }
            return hashCode7 + i10;
        }

        public String toString() {
            String str = this.f94126a;
            String str2 = this.f94127b;
            Double d10 = this.f94128c;
            String str3 = this.f94129d;
            String str4 = this.f94130e;
            String str5 = this.f94131f;
            String str6 = this.f94132g;
            String str7 = this.f94133h;
            return "AccountVoucherTransactionRemote(pspBrandName=" + str + ", label=" + str2 + ", amount=" + d10 + ", pspTimestamp=" + str3 + ", accountVoucherStatus=" + str4 + ", reference=" + str5 + ", expiryDate=" + str6 + ", entityId=" + str7 + ")";
        }
    }

    @p
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\b\u0018\u0000 <2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0003\u0018=\u001aBa\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u001dR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u001dR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u0010(\u001a\u0004\b-\u0010.R\"\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b0\u0010%\u0012\u0004\b2\u0010(\u001a\u0004\b1\u0010\u001dR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b3\u0010%\u0012\u0004\b5\u0010(\u001a\u0004\b4\u0010\u001dR\"\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b6\u0010%\u0012\u0004\b8\u0010(\u001a\u0004\b7\u0010\u001dR\"\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b9\u0010%\u0012\u0004\b;\u0010(\u001a\u0004\b:\u0010\u001d¨\u0006>"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$CreditCardTransactionRemote;", "Lpp/b;", "LNn/F$b;", "", "seen0", "", "pspBrandName", "label", "", "amount", "pspTimestamp", "creditCardStatus", "creditCardDeclineReason", "authorisationCode", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$CreditCardTransactionRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()LNn/F$b;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPspBrandName", "getPspBrandName$annotations", "()V", "getLabel", "getLabel$annotations", "c", "Ljava/lang/Double;", "getAmount", "()Ljava/lang/Double;", "getAmount$annotations", "d", "getPspTimestamp", "getPspTimestamp$annotations", "e", "getCreditCardStatus", "getCreditCardStatus$annotations", "f", "getCreditCardDeclineReason", "getCreditCardDeclineReason$annotations", "g", "getAuthorisationCode", "getAuthorisationCode$annotations", "Companion", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CreditCardTransactionRemote implements C11768b<F.b> {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f94135a;

        /* renamed from: b  reason: collision with root package name */
        private final String f94136b;

        /* renamed from: c  reason: collision with root package name */
        private final Double f94137c;

        /* renamed from: d  reason: collision with root package name */
        private final String f94138d;

        /* renamed from: e  reason: collision with root package name */
        private final String f94139e;

        /* renamed from: f  reason: collision with root package name */
        private final String f94140f;

        /* renamed from: g  reason: collision with root package name */
        private final String f94141g;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$CreditCardTransactionRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$CreditCardTransactionRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<CreditCardTransactionRemote> serializer() {
                return PaymentContextRemote$CreditCardTransactionRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$CreditCardTransactionRemote$b;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "Companion", "a", "INITIALIZED", "CANCELLED", "DECLINED", "CHALLENGED", "CHALLENGED_APPROVED", "CHALLENGED_DECLINED", "AUTHORIZED", "UNCERTAIN", "CAPTURED", "ENFORCE_FAILED", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public enum b {
            INITIALIZED("INITIALIZED"),
            CANCELLED("CANCELLED"),
            DECLINED("DECLINED"),
            CHALLENGED("CHALLENGED"),
            CHALLENGED_APPROVED("CHALLENGED_APPROVED"),
            CHALLENGED_DECLINED("CHALLENGED_DECLINED"),
            AUTHORIZED("AUTHORIZED"),
            UNCERTAIN("UNCERTAIN"),
            CAPTURED("CAPTURED"),
            ENFORCE_FAILED("ENFORCE_FAILED");
            
            public static final a Companion = null;
            private final String rawValue;

            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$CreditCardTransactionRemote$b$a;", "", "<init>", "()V", "", "rawValue", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$CreditCardTransactionRemote$b;", "a", "(Ljava/lang/String;)Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$CreditCardTransactionRemote$b;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a {
                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final b a(String str) {
                    T t10;
                    Iterator<T> it = b.b().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t10 = null;
                            break;
                        }
                        t10 = it.next();
                        if (C15854t.H(((b) t10).j(), str, true)) {
                            break;
                        }
                    }
                    b bVar = (b) t10;
                    if (bVar != null) {
                        return bVar;
                    }
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unknown status: " + str);
                    e eVar = e.ERROR;
                    ArrayList<C11819b> arrayList = new ArrayList<>();
                    for (Object next : d.f102012a.a()) {
                        if (((C11819b) next).b(eVar, false)) {
                            arrayList.add(next);
                        }
                    }
                    String str2 = null;
                    String str3 = null;
                    for (C11819b bVar2 : arrayList) {
                        if (str2 == null) {
                            String a10 = C11818a.a((String) null, illegalArgumentException);
                            if (a10 == null) {
                                return null;
                            }
                            str2 = C11820c.a(a10);
                        }
                        String str4 = str2;
                        if (str3 == null) {
                            String name = a.class.getName();
                            C17542s.g(name);
                            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o12.length() != 0) {
                                name = C15854t.P0(o12, "Kt");
                            }
                            str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                        }
                        String str5 = str3;
                        bVar2.a(eVar, str5, false, illegalArgumentException, str4);
                        str2 = str4;
                        str3 = str5;
                    }
                    return null;
                }

                private a() {
                }
            }

            static {
                b[] a10;
                $ENTRIES = C17221b.a(a10);
                Companion = new a((DefaultConstructorMarker) null);
            }

            private b(String str) {
                this.rawValue = str;
            }

            public static C17220a<b> b() {
                return $ENTRIES;
            }

            public final String j() {
                return this.rawValue;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class c {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f94142a;

            /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(2:19|20)|21|23) */
            /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|23) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
            /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$CreditCardTransactionRemote$b[] r0 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.CreditCardTransactionRemote.b.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$CreditCardTransactionRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.CreditCardTransactionRemote.b.CAPTURED     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$CreditCardTransactionRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.CreditCardTransactionRemote.b.CHALLENGED     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$CreditCardTransactionRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.CreditCardTransactionRemote.b.UNCERTAIN     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$CreditCardTransactionRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.CreditCardTransactionRemote.b.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$CreditCardTransactionRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.CreditCardTransactionRemote.b.CANCELLED     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$CreditCardTransactionRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.CreditCardTransactionRemote.b.DECLINED     // Catch:{ NoSuchFieldError -> 0x003d }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                    r2 = 6
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
                L_0x003d:
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$CreditCardTransactionRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.CreditCardTransactionRemote.b.CHALLENGED_APPROVED     // Catch:{ NoSuchFieldError -> 0x0046 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                    r2 = 7
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
                L_0x0046:
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$CreditCardTransactionRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.CreditCardTransactionRemote.b.CHALLENGED_DECLINED     // Catch:{ NoSuchFieldError -> 0x0050 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                    r2 = 8
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
                L_0x0050:
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$CreditCardTransactionRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.CreditCardTransactionRemote.b.AUTHORIZED     // Catch:{ NoSuchFieldError -> 0x005a }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                    r2 = 9
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
                L_0x005a:
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$CreditCardTransactionRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.CreditCardTransactionRemote.b.ENFORCE_FAILED     // Catch:{ NoSuchFieldError -> 0x0064 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                    r2 = 10
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
                L_0x0064:
                    f94142a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.CreditCardTransactionRemote.c.<clinit>():void");
            }
        }

        public /* synthetic */ CreditCardTransactionRemote(int i10, String str, String str2, Double d10, String str3, String str4, String str5, String str6, T0 t02) {
            if (127 != (i10 & 127)) {
                E0.b(i10, 127, PaymentContextRemote$CreditCardTransactionRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f94135a = str;
            this.f94136b = str2;
            this.f94137c = d10;
            this.f94138d = str3;
            this.f94139e = str4;
            this.f94140f = str5;
            this.f94141g = str6;
        }

        public static final /* synthetic */ void b(CreditCardTransactionRemote creditCardTransactionRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 0, y02, creditCardTransactionRemote.f94135a);
            dVar.B(serialDescriptor, 1, y02, creditCardTransactionRemote.f94136b);
            dVar.B(serialDescriptor, 2, C17438C.f144010a, creditCardTransactionRemote.f94137c);
            dVar.B(serialDescriptor, 3, y02, creditCardTransactionRemote.f94138d);
            dVar.B(serialDescriptor, 4, y02, creditCardTransactionRemote.f94139e);
            dVar.B(serialDescriptor, 5, y02, creditCardTransactionRemote.f94140f);
            dVar.B(serialDescriptor, 6, y02, creditCardTransactionRemote.f94141g);
        }

        public F.b a() {
            b a10 = b.Companion.a(this.f94139e);
            boolean z10 = true;
            if (this.f94137c == null || a10 == null) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Required fields missing: " + this);
                e eVar = e.ERROR;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList) {
                    if (str == null) {
                        String a11 = C11818a.a((String) null, illegalArgumentException);
                        if (a11 == null) {
                            break;
                        }
                        str = C11820c.a(a11);
                    }
                    if (str2 == null) {
                        String name = CreditCardTransactionRemote.class.getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    bVar.a(eVar, str2, false, illegalArgumentException, str);
                }
                return null;
            }
            switch (c.f94142a[a10.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    z10 = false;
                    break;
                default:
                    throw new t();
            }
            return new F.b(this.f94135a, this.f94136b, z10, a10.j(), this.f94138d, this.f94140f, this.f94137c.doubleValue(), this.f94141g);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CreditCardTransactionRemote)) {
                return false;
            }
            CreditCardTransactionRemote creditCardTransactionRemote = (CreditCardTransactionRemote) obj;
            return C17542s.e(this.f94135a, creditCardTransactionRemote.f94135a) && C17542s.e(this.f94136b, creditCardTransactionRemote.f94136b) && C17542s.e(this.f94137c, creditCardTransactionRemote.f94137c) && C17542s.e(this.f94138d, creditCardTransactionRemote.f94138d) && C17542s.e(this.f94139e, creditCardTransactionRemote.f94139e) && C17542s.e(this.f94140f, creditCardTransactionRemote.f94140f) && C17542s.e(this.f94141g, creditCardTransactionRemote.f94141g);
        }

        public int hashCode() {
            String str = this.f94135a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f94136b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Double d10 = this.f94137c;
            int hashCode3 = (hashCode2 + (d10 == null ? 0 : d10.hashCode())) * 31;
            String str3 = this.f94138d;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f94139e;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f94140f;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f94141g;
            if (str6 != null) {
                i10 = str6.hashCode();
            }
            return hashCode6 + i10;
        }

        public String toString() {
            String str = this.f94135a;
            String str2 = this.f94136b;
            Double d10 = this.f94137c;
            String str3 = this.f94138d;
            String str4 = this.f94139e;
            String str5 = this.f94140f;
            String str6 = this.f94141g;
            return "CreditCardTransactionRemote(pspBrandName=" + str + ", label=" + str2 + ", amount=" + d10 + ", pspTimestamp=" + str3 + ", creditCardStatus=" + str4 + ", creditCardDeclineReason=" + str5 + ", authorisationCode=" + str6 + ")";
        }
    }

    @p
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\b\u0018\u0000 42\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0003\u00165\u0018BM\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010#\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\u001bR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b-\u0010&\u001a\u0004\b+\u0010,R\"\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b.\u0010#\u0012\u0004\b0\u0010&\u001a\u0004\b/\u0010\u001bR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b1\u0010#\u0012\u0004\b3\u0010&\u001a\u0004\b2\u0010\u001b¨\u00066"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$OnlineTransferTransactionRemote;", "Lpp/b;", "LNn/F$c;", "", "seen0", "", "pspBrandName", "label", "", "amount", "pspTimestamp", "status", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$OnlineTransferTransactionRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()LNn/F$c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPspBrandName", "getPspBrandName$annotations", "()V", "getLabel", "getLabel$annotations", "c", "Ljava/lang/Double;", "getAmount", "()Ljava/lang/Double;", "getAmount$annotations", "d", "getPspTimestamp", "getPspTimestamp$annotations", "e", "getStatus", "getStatus$annotations", "Companion", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnlineTransferTransactionRemote implements C11768b<F.c> {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f94143a;

        /* renamed from: b  reason: collision with root package name */
        private final String f94144b;

        /* renamed from: c  reason: collision with root package name */
        private final Double f94145c;

        /* renamed from: d  reason: collision with root package name */
        private final String f94146d;

        /* renamed from: e  reason: collision with root package name */
        private final String f94147e;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$OnlineTransferTransactionRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$OnlineTransferTransactionRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<OnlineTransferTransactionRemote> serializer() {
                return PaymentContextRemote$OnlineTransferTransactionRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$OnlineTransferTransactionRemote$b;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "Companion", "a", "INITIALIZED", "DECLINED", "CAPTURED", "FAILED", "CANCELLED", "UNCERTAIN", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public enum b {
            INITIALIZED("INITIALIZED"),
            DECLINED("DECLINED"),
            CAPTURED("CAPTURED"),
            FAILED("FAILED"),
            CANCELLED("CANCELLED"),
            UNCERTAIN("UNCERTAIN");
            
            public static final a Companion = null;
            private final String rawValue;

            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$OnlineTransferTransactionRemote$b$a;", "", "<init>", "()V", "", "rawValue", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$OnlineTransferTransactionRemote$b;", "a", "(Ljava/lang/String;)Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$OnlineTransferTransactionRemote$b;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a {
                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final b a(String str) {
                    T t10;
                    Iterator<T> it = b.b().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t10 = null;
                            break;
                        }
                        t10 = it.next();
                        if (C15854t.H(((b) t10).j(), str, true)) {
                            break;
                        }
                    }
                    b bVar = (b) t10;
                    if (bVar != null) {
                        return bVar;
                    }
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unknown status: " + str);
                    e eVar = e.ERROR;
                    ArrayList<C11819b> arrayList = new ArrayList<>();
                    for (Object next : d.f102012a.a()) {
                        if (((C11819b) next).b(eVar, false)) {
                            arrayList.add(next);
                        }
                    }
                    String str2 = null;
                    String str3 = null;
                    for (C11819b bVar2 : arrayList) {
                        if (str2 == null) {
                            String a10 = C11818a.a((String) null, illegalArgumentException);
                            if (a10 == null) {
                                return null;
                            }
                            str2 = C11820c.a(a10);
                        }
                        String str4 = str2;
                        if (str3 == null) {
                            String name = a.class.getName();
                            C17542s.g(name);
                            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o12.length() != 0) {
                                name = C15854t.P0(o12, "Kt");
                            }
                            str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                        }
                        String str5 = str3;
                        bVar2.a(eVar, str5, false, illegalArgumentException, str4);
                        str2 = str4;
                        str3 = str5;
                    }
                    return null;
                }

                private a() {
                }
            }

            static {
                b[] a10;
                $ENTRIES = C17221b.a(a10);
                Companion = new a((DefaultConstructorMarker) null);
            }

            private b(String str) {
                this.rawValue = str;
            }

            public static C17220a<b> b() {
                return $ENTRIES;
            }

            public final String j() {
                return this.rawValue;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class c {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f94148a;

            /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|4|5|6|7|8|9|10|11|12|13|15) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$OnlineTransferTransactionRemote$b[] r0 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.OnlineTransferTransactionRemote.b.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$OnlineTransferTransactionRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.OnlineTransferTransactionRemote.b.CAPTURED     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$OnlineTransferTransactionRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.OnlineTransferTransactionRemote.b.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$OnlineTransferTransactionRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.OnlineTransferTransactionRemote.b.DECLINED     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$OnlineTransferTransactionRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.OnlineTransferTransactionRemote.b.FAILED     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$OnlineTransferTransactionRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.OnlineTransferTransactionRemote.b.CANCELLED     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$OnlineTransferTransactionRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.OnlineTransferTransactionRemote.b.UNCERTAIN     // Catch:{ NoSuchFieldError -> 0x003d }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                    r2 = 6
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
                L_0x003d:
                    f94148a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.OnlineTransferTransactionRemote.c.<clinit>():void");
            }
        }

        public /* synthetic */ OnlineTransferTransactionRemote(int i10, String str, String str2, Double d10, String str3, String str4, T0 t02) {
            if (31 != (i10 & 31)) {
                E0.b(i10, 31, PaymentContextRemote$OnlineTransferTransactionRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f94143a = str;
            this.f94144b = str2;
            this.f94145c = d10;
            this.f94146d = str3;
            this.f94147e = str4;
        }

        public static final /* synthetic */ void b(OnlineTransferTransactionRemote onlineTransferTransactionRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 0, y02, onlineTransferTransactionRemote.f94143a);
            dVar.B(serialDescriptor, 1, y02, onlineTransferTransactionRemote.f94144b);
            dVar.B(serialDescriptor, 2, C17438C.f144010a, onlineTransferTransactionRemote.f94145c);
            dVar.B(serialDescriptor, 3, y02, onlineTransferTransactionRemote.f94146d);
            dVar.B(serialDescriptor, 4, y02, onlineTransferTransactionRemote.f94147e);
        }

        public F.c a() {
            b a10 = b.Companion.a(this.f94147e);
            boolean z10 = true;
            if (this.f94145c == null || a10 == null) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Required fields missing: " + this);
                e eVar = e.ERROR;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList) {
                    if (str == null) {
                        String a11 = C11818a.a((String) null, illegalArgumentException);
                        if (a11 == null) {
                            break;
                        }
                        str = C11820c.a(a11);
                    }
                    if (str2 == null) {
                        String name = OnlineTransferTransactionRemote.class.getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    bVar.a(eVar, str2, false, illegalArgumentException, str);
                }
                return null;
            }
            switch (c.f94148a[a10.ordinal()]) {
                case 1:
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    z10 = false;
                    break;
                default:
                    throw new t();
            }
            return new F.c(this.f94143a, this.f94144b, z10, a10.j(), this.f94146d, (String) null, this.f94145c.doubleValue());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnlineTransferTransactionRemote)) {
                return false;
            }
            OnlineTransferTransactionRemote onlineTransferTransactionRemote = (OnlineTransferTransactionRemote) obj;
            return C17542s.e(this.f94143a, onlineTransferTransactionRemote.f94143a) && C17542s.e(this.f94144b, onlineTransferTransactionRemote.f94144b) && C17542s.e(this.f94145c, onlineTransferTransactionRemote.f94145c) && C17542s.e(this.f94146d, onlineTransferTransactionRemote.f94146d) && C17542s.e(this.f94147e, onlineTransferTransactionRemote.f94147e);
        }

        public int hashCode() {
            String str = this.f94143a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f94144b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Double d10 = this.f94145c;
            int hashCode3 = (hashCode2 + (d10 == null ? 0 : d10.hashCode())) * 31;
            String str3 = this.f94146d;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f94147e;
            if (str4 != null) {
                i10 = str4.hashCode();
            }
            return hashCode4 + i10;
        }

        public String toString() {
            String str = this.f94143a;
            String str2 = this.f94144b;
            Double d10 = this.f94145c;
            String str3 = this.f94146d;
            String str4 = this.f94147e;
            return "OnlineTransferTransactionRemote(pspBrandName=" + str + ", label=" + str2 + ", amount=" + d10 + ", pspTimestamp=" + str3 + ", status=" + str4 + ")";
        }
    }

    @p
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\b\u0018\u0000 82\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0003\u00179\u0019BW\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u001cR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010$\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010\u001cR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b.\u0010'\u001a\u0004\b,\u0010-R\"\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b/\u0010$\u0012\u0004\b1\u0010'\u001a\u0004\b0\u0010\u001cR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b2\u0010$\u0012\u0004\b4\u0010'\u001a\u0004\b3\u0010\u001cR\"\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b5\u0010$\u0012\u0004\b7\u0010'\u001a\u0004\b6\u0010\u001c¨\u0006:"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$OpenInvoiceTransactionRemote;", "Lpp/b;", "LNn/F$d;", "", "seen0", "", "pspBrandName", "label", "", "amount", "pspTimestamp", "openInvoiceStatus", "openInvoiceDeclineReason", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$OpenInvoiceTransactionRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()LNn/F$d;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPspBrandName", "getPspBrandName$annotations", "()V", "getLabel", "getLabel$annotations", "c", "Ljava/lang/Double;", "getAmount", "()Ljava/lang/Double;", "getAmount$annotations", "d", "getPspTimestamp", "getPspTimestamp$annotations", "e", "getOpenInvoiceStatus", "getOpenInvoiceStatus$annotations", "f", "getOpenInvoiceDeclineReason", "getOpenInvoiceDeclineReason$annotations", "Companion", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OpenInvoiceTransactionRemote implements C11768b<F.d> {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f94149a;

        /* renamed from: b  reason: collision with root package name */
        private final String f94150b;

        /* renamed from: c  reason: collision with root package name */
        private final Double f94151c;

        /* renamed from: d  reason: collision with root package name */
        private final String f94152d;

        /* renamed from: e  reason: collision with root package name */
        private final String f94153e;

        /* renamed from: f  reason: collision with root package name */
        private final String f94154f;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$OpenInvoiceTransactionRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$OpenInvoiceTransactionRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<OpenInvoiceTransactionRemote> serializer() {
                return PaymentContextRemote$OpenInvoiceTransactionRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$OpenInvoiceTransactionRemote$b;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "Companion", "a", "INITIALIZED", "CANCELLED", "DECLINED", "AUTHORIZED", "UNCERTAIN", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public enum b {
            INITIALIZED("INITIALIZED"),
            CANCELLED("CANCELLED"),
            DECLINED("DECLINED"),
            AUTHORIZED("AUTHORIZED"),
            UNCERTAIN("UNCERTAIN");
            
            public static final a Companion = null;
            private final String rawValue;

            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$OpenInvoiceTransactionRemote$b$a;", "", "<init>", "()V", "", "rawValue", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$OpenInvoiceTransactionRemote$b;", "a", "(Ljava/lang/String;)Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$OpenInvoiceTransactionRemote$b;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a {
                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final b a(String str) {
                    T t10;
                    Iterator<T> it = b.b().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t10 = null;
                            break;
                        }
                        t10 = it.next();
                        if (C15854t.H(((b) t10).j(), str, true)) {
                            break;
                        }
                    }
                    b bVar = (b) t10;
                    if (bVar != null) {
                        return bVar;
                    }
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unknown status: " + str);
                    e eVar = e.ERROR;
                    ArrayList<C11819b> arrayList = new ArrayList<>();
                    for (Object next : d.f102012a.a()) {
                        if (((C11819b) next).b(eVar, false)) {
                            arrayList.add(next);
                        }
                    }
                    String str2 = null;
                    String str3 = null;
                    for (C11819b bVar2 : arrayList) {
                        if (str2 == null) {
                            String a10 = C11818a.a((String) null, illegalArgumentException);
                            if (a10 == null) {
                                return null;
                            }
                            str2 = C11820c.a(a10);
                        }
                        String str4 = str2;
                        if (str3 == null) {
                            String name = a.class.getName();
                            C17542s.g(name);
                            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o12.length() != 0) {
                                name = C15854t.P0(o12, "Kt");
                            }
                            str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                        }
                        String str5 = str3;
                        bVar2.a(eVar, str5, false, illegalArgumentException, str4);
                        str2 = str4;
                        str3 = str5;
                    }
                    return null;
                }

                private a() {
                }
            }

            static {
                b[] a10;
                $ENTRIES = C17221b.a(a10);
                Companion = new a((DefaultConstructorMarker) null);
            }

            private b(String str) {
                this.rawValue = str;
            }

            public static C17220a<b> b() {
                return $ENTRIES;
            }

            public final String j() {
                return this.rawValue;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class c {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f94155a;

            /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$OpenInvoiceTransactionRemote$b[] r0 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.OpenInvoiceTransactionRemote.b.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$OpenInvoiceTransactionRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.OpenInvoiceTransactionRemote.b.AUTHORIZED     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$OpenInvoiceTransactionRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.OpenInvoiceTransactionRemote.b.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$OpenInvoiceTransactionRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.OpenInvoiceTransactionRemote.b.CANCELLED     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$OpenInvoiceTransactionRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.OpenInvoiceTransactionRemote.b.DECLINED     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$OpenInvoiceTransactionRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.OpenInvoiceTransactionRemote.b.UNCERTAIN     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    f94155a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.OpenInvoiceTransactionRemote.c.<clinit>():void");
            }
        }

        public /* synthetic */ OpenInvoiceTransactionRemote(int i10, String str, String str2, Double d10, String str3, String str4, String str5, T0 t02) {
            if (63 != (i10 & 63)) {
                E0.b(i10, 63, PaymentContextRemote$OpenInvoiceTransactionRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f94149a = str;
            this.f94150b = str2;
            this.f94151c = d10;
            this.f94152d = str3;
            this.f94153e = str4;
            this.f94154f = str5;
        }

        public static final /* synthetic */ void b(OpenInvoiceTransactionRemote openInvoiceTransactionRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 0, y02, openInvoiceTransactionRemote.f94149a);
            dVar.B(serialDescriptor, 1, y02, openInvoiceTransactionRemote.f94150b);
            dVar.B(serialDescriptor, 2, C17438C.f144010a, openInvoiceTransactionRemote.f94151c);
            dVar.B(serialDescriptor, 3, y02, openInvoiceTransactionRemote.f94152d);
            dVar.B(serialDescriptor, 4, y02, openInvoiceTransactionRemote.f94153e);
            dVar.B(serialDescriptor, 5, y02, openInvoiceTransactionRemote.f94154f);
        }

        public F.d a() {
            b a10 = b.Companion.a(this.f94153e);
            boolean z10 = true;
            if (this.f94151c == null || a10 == null) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Required fields missing: " + this);
                e eVar = e.ERROR;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList) {
                    if (str == null) {
                        String a11 = C11818a.a((String) null, illegalArgumentException);
                        if (a11 == null) {
                            break;
                        }
                        str = C11820c.a(a11);
                    }
                    if (str2 == null) {
                        String name = OpenInvoiceTransactionRemote.class.getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    bVar.a(eVar, str2, false, illegalArgumentException, str);
                }
                return null;
            }
            int i10 = c.f94155a[a10.ordinal()];
            if (i10 != 1) {
                if (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) {
                    z10 = false;
                } else {
                    throw new t();
                }
            }
            return new F.d(this.f94149a, this.f94150b, z10, a10.j(), this.f94152d, this.f94154f, this.f94151c.doubleValue());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenInvoiceTransactionRemote)) {
                return false;
            }
            OpenInvoiceTransactionRemote openInvoiceTransactionRemote = (OpenInvoiceTransactionRemote) obj;
            return C17542s.e(this.f94149a, openInvoiceTransactionRemote.f94149a) && C17542s.e(this.f94150b, openInvoiceTransactionRemote.f94150b) && C17542s.e(this.f94151c, openInvoiceTransactionRemote.f94151c) && C17542s.e(this.f94152d, openInvoiceTransactionRemote.f94152d) && C17542s.e(this.f94153e, openInvoiceTransactionRemote.f94153e) && C17542s.e(this.f94154f, openInvoiceTransactionRemote.f94154f);
        }

        public int hashCode() {
            String str = this.f94149a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f94150b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Double d10 = this.f94151c;
            int hashCode3 = (hashCode2 + (d10 == null ? 0 : d10.hashCode())) * 31;
            String str3 = this.f94152d;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f94153e;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f94154f;
            if (str5 != null) {
                i10 = str5.hashCode();
            }
            return hashCode5 + i10;
        }

        public String toString() {
            String str = this.f94149a;
            String str2 = this.f94150b;
            Double d10 = this.f94151c;
            String str3 = this.f94152d;
            String str4 = this.f94153e;
            String str5 = this.f94154f;
            return "OpenInvoiceTransactionRemote(pspBrandName=" + str + ", label=" + str2 + ", amount=" + d10 + ", pspTimestamp=" + str3 + ", openInvoiceStatus=" + str4 + ", openInvoiceDeclineReason=" + str5 + ")";
        }
    }

    @p
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\"\b\b\u0018\u0000 D2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0003\u001aE\u001cBu\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u001fR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010'\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010\u001fR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b-\u0010.\u0012\u0004\b1\u0010*\u001a\u0004\b/\u00100R\"\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b2\u0010'\u0012\u0004\b4\u0010*\u001a\u0004\b3\u0010\u001fR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b5\u0010'\u0012\u0004\b7\u0010*\u001a\u0004\b6\u0010\u001fR\"\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b8\u0010.\u0012\u0004\b:\u0010*\u001a\u0004\b9\u00100R\"\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b;\u0010'\u0012\u0004\b=\u0010*\u001a\u0004\b<\u0010\u001fR\"\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b>\u0010'\u0012\u0004\b@\u0010*\u001a\u0004\b?\u0010\u001fR\"\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\bA\u0010'\u0012\u0004\bC\u0010*\u001a\u0004\bB\u0010\u001f¨\u0006F"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$PrepaidCardTransactionRemote;", "Lpp/b;", "LNn/F$f;", "", "seen0", "", "pspBrandName", "label", "", "amount", "pspTimestamp", "iopgId", "balanceAmount", "last4Digits", "prepaidCardStatus", "prepaidCardDeclineReason", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$PrepaidCardTransactionRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()LNn/F$f;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPspBrandName", "getPspBrandName$annotations", "()V", "getLabel", "getLabel$annotations", "c", "Ljava/lang/Double;", "getAmount", "()Ljava/lang/Double;", "getAmount$annotations", "d", "getPspTimestamp", "getPspTimestamp$annotations", "e", "getIopgId", "getIopgId$annotations", "f", "getBalanceAmount", "getBalanceAmount$annotations", "g", "getLast4Digits", "getLast4Digits$annotations", "h", "getPrepaidCardStatus", "getPrepaidCardStatus$annotations", "i", "getPrepaidCardDeclineReason", "getPrepaidCardDeclineReason$annotations", "Companion", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PrepaidCardTransactionRemote implements C11768b<F.f> {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f94156a;

        /* renamed from: b  reason: collision with root package name */
        private final String f94157b;

        /* renamed from: c  reason: collision with root package name */
        private final Double f94158c;

        /* renamed from: d  reason: collision with root package name */
        private final String f94159d;

        /* renamed from: e  reason: collision with root package name */
        private final String f94160e;

        /* renamed from: f  reason: collision with root package name */
        private final Double f94161f;

        /* renamed from: g  reason: collision with root package name */
        private final String f94162g;

        /* renamed from: h  reason: collision with root package name */
        private final String f94163h;

        /* renamed from: i  reason: collision with root package name */
        private final String f94164i;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$PrepaidCardTransactionRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$PrepaidCardTransactionRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<PrepaidCardTransactionRemote> serializer() {
                return PaymentContextRemote$PrepaidCardTransactionRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$PrepaidCardTransactionRemote$b;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "Companion", "a", "DECLINED", "AUTHORIZED", "PENDING_CAPTURE", "PENDING_CANCELLATION", "CAPTURED", "FAILED", "CANCELLED", "CANCEL_FAILED", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public enum b {
            DECLINED("DECLINED"),
            AUTHORIZED("AUTHORIZED"),
            PENDING_CAPTURE("PENDING_CAPTURE"),
            PENDING_CANCELLATION("PENDING_CANCELLATION"),
            CAPTURED("CAPTURED"),
            FAILED("FAILED"),
            CANCELLED("CANCELLED"),
            CANCEL_FAILED("CANCEL_FAILED");
            
            public static final a Companion = null;
            private final String rawValue;

            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$PrepaidCardTransactionRemote$b$a;", "", "<init>", "()V", "", "rawValue", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$PrepaidCardTransactionRemote$b;", "a", "(Ljava/lang/String;)Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$PrepaidCardTransactionRemote$b;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a {
                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final b a(String str) {
                    T t10;
                    Iterator<T> it = b.b().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t10 = null;
                            break;
                        }
                        t10 = it.next();
                        if (C15854t.H(((b) t10).j(), str, true)) {
                            break;
                        }
                    }
                    b bVar = (b) t10;
                    if (bVar != null) {
                        return bVar;
                    }
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unknown status: " + str);
                    e eVar = e.ERROR;
                    ArrayList<C11819b> arrayList = new ArrayList<>();
                    for (Object next : d.f102012a.a()) {
                        if (((C11819b) next).b(eVar, false)) {
                            arrayList.add(next);
                        }
                    }
                    String str2 = null;
                    String str3 = null;
                    for (C11819b bVar2 : arrayList) {
                        if (str2 == null) {
                            String a10 = C11818a.a((String) null, illegalArgumentException);
                            if (a10 == null) {
                                return null;
                            }
                            str2 = C11820c.a(a10);
                        }
                        String str4 = str2;
                        if (str3 == null) {
                            String name = a.class.getName();
                            C17542s.g(name);
                            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o12.length() != 0) {
                                name = C15854t.P0(o12, "Kt");
                            }
                            str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                        }
                        String str5 = str3;
                        bVar2.a(eVar, str5, false, illegalArgumentException, str4);
                        str2 = str4;
                        str3 = str5;
                    }
                    return null;
                }

                private a() {
                }
            }

            static {
                b[] a10;
                $ENTRIES = C17221b.a(a10);
                Companion = new a((DefaultConstructorMarker) null);
            }

            private b(String str) {
                this.rawValue = str;
            }

            public static C17220a<b> b() {
                return $ENTRIES;
            }

            public final String j() {
                return this.rawValue;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class c {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f94165a;

            /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|19) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
            /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$PrepaidCardTransactionRemote$b[] r0 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.PrepaidCardTransactionRemote.b.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$PrepaidCardTransactionRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.PrepaidCardTransactionRemote.b.AUTHORIZED     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$PrepaidCardTransactionRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.PrepaidCardTransactionRemote.b.CAPTURED     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$PrepaidCardTransactionRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.PrepaidCardTransactionRemote.b.PENDING_CAPTURE     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$PrepaidCardTransactionRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.PrepaidCardTransactionRemote.b.DECLINED     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$PrepaidCardTransactionRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.PrepaidCardTransactionRemote.b.PENDING_CANCELLATION     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$PrepaidCardTransactionRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.PrepaidCardTransactionRemote.b.FAILED     // Catch:{ NoSuchFieldError -> 0x003d }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                    r2 = 6
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
                L_0x003d:
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$PrepaidCardTransactionRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.PrepaidCardTransactionRemote.b.CANCELLED     // Catch:{ NoSuchFieldError -> 0x0046 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                    r2 = 7
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
                L_0x0046:
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$PrepaidCardTransactionRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.PrepaidCardTransactionRemote.b.CANCEL_FAILED     // Catch:{ NoSuchFieldError -> 0x0050 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                    r2 = 8
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
                L_0x0050:
                    f94165a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.PrepaidCardTransactionRemote.c.<clinit>():void");
            }
        }

        public /* synthetic */ PrepaidCardTransactionRemote(int i10, String str, String str2, Double d10, String str3, String str4, Double d11, String str5, String str6, String str7, T0 t02) {
            if (511 != (i10 & 511)) {
                E0.b(i10, 511, PaymentContextRemote$PrepaidCardTransactionRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f94156a = str;
            this.f94157b = str2;
            this.f94158c = d10;
            this.f94159d = str3;
            this.f94160e = str4;
            this.f94161f = d11;
            this.f94162g = str5;
            this.f94163h = str6;
            this.f94164i = str7;
        }

        public static final /* synthetic */ void b(PrepaidCardTransactionRemote prepaidCardTransactionRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 0, y02, prepaidCardTransactionRemote.f94156a);
            dVar.B(serialDescriptor, 1, y02, prepaidCardTransactionRemote.f94157b);
            C17438C c10 = C17438C.f144010a;
            dVar.B(serialDescriptor, 2, c10, prepaidCardTransactionRemote.f94158c);
            dVar.B(serialDescriptor, 3, y02, prepaidCardTransactionRemote.f94159d);
            dVar.B(serialDescriptor, 4, y02, prepaidCardTransactionRemote.f94160e);
            dVar.B(serialDescriptor, 5, c10, prepaidCardTransactionRemote.f94161f);
            dVar.B(serialDescriptor, 6, y02, prepaidCardTransactionRemote.f94162g);
            dVar.B(serialDescriptor, 7, y02, prepaidCardTransactionRemote.f94163h);
            dVar.B(serialDescriptor, 8, y02, prepaidCardTransactionRemote.f94164i);
        }

        public F.f a() {
            boolean z10;
            String str;
            b a10 = b.Companion.a(this.f94163h);
            Double d10 = this.f94158c;
            String str2 = DslKt.INDICATOR_BACKGROUND;
            Class<PrepaidCardTransactionRemote> cls = PrepaidCardTransactionRemote.class;
            if (d10 == null || a10 == null || this.f94160e == null || this.f94162g == null) {
                String str3 = str2;
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Required fields missing: " + this);
                e eVar = e.ERROR;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str4 = null;
                String str5 = null;
                for (C11819b bVar : arrayList) {
                    if (str4 == null) {
                        String a11 = C11818a.a((String) null, illegalArgumentException);
                        if (a11 == null) {
                            break;
                        }
                        str4 = C11820c.a(a11);
                    }
                    if (str5 == null) {
                        String name = cls.getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str5 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str3) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    bVar.a(eVar, str5, false, illegalArgumentException, str4);
                }
                return null;
            }
            switch (c.f94165a[a10.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    z10 = true;
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    z10 = false;
                    break;
                default:
                    throw new t();
            }
            if (z10 && this.f94161f == null) {
                IllegalStateException illegalStateException = new IllegalStateException("A successful card should have a balance amount");
                e eVar2 = e.ERROR;
                ArrayList<C11819b> arrayList2 = new ArrayList<>();
                for (Object next2 : d.f102012a.a()) {
                    if (((C11819b) next2).b(eVar2, false)) {
                        arrayList2.add(next2);
                    }
                }
                String str6 = null;
                String str7 = null;
                for (C11819b bVar2 : arrayList2) {
                    if (str6 == null) {
                        String a12 = C11818a.a((String) null, illegalStateException);
                        if (a12 != null) {
                            str6 = C11820c.a(a12);
                        }
                    }
                    if (str7 == null) {
                        String name2 = cls.getName();
                        C17542s.g(name2);
                        str = str2;
                        String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o13.length() != 0) {
                            name2 = C15854t.P0(o13, "Kt");
                        }
                        str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name2;
                    } else {
                        str = str2;
                    }
                    bVar2.a(eVar2, str7, false, illegalStateException, str6);
                    str2 = str;
                }
            }
            return new F.f(this.f94156a, this.f94157b, z10, a10.j(), this.f94159d, this.f94164i, this.f94158c.doubleValue(), this.f94160e, this.f94161f, this.f94162g);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PrepaidCardTransactionRemote)) {
                return false;
            }
            PrepaidCardTransactionRemote prepaidCardTransactionRemote = (PrepaidCardTransactionRemote) obj;
            return C17542s.e(this.f94156a, prepaidCardTransactionRemote.f94156a) && C17542s.e(this.f94157b, prepaidCardTransactionRemote.f94157b) && C17542s.e(this.f94158c, prepaidCardTransactionRemote.f94158c) && C17542s.e(this.f94159d, prepaidCardTransactionRemote.f94159d) && C17542s.e(this.f94160e, prepaidCardTransactionRemote.f94160e) && C17542s.e(this.f94161f, prepaidCardTransactionRemote.f94161f) && C17542s.e(this.f94162g, prepaidCardTransactionRemote.f94162g) && C17542s.e(this.f94163h, prepaidCardTransactionRemote.f94163h) && C17542s.e(this.f94164i, prepaidCardTransactionRemote.f94164i);
        }

        public int hashCode() {
            String str = this.f94156a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f94157b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Double d10 = this.f94158c;
            int hashCode3 = (hashCode2 + (d10 == null ? 0 : d10.hashCode())) * 31;
            String str3 = this.f94159d;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f94160e;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Double d11 = this.f94161f;
            int hashCode6 = (hashCode5 + (d11 == null ? 0 : d11.hashCode())) * 31;
            String str5 = this.f94162g;
            int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f94163h;
            int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.f94164i;
            if (str7 != null) {
                i10 = str7.hashCode();
            }
            return hashCode8 + i10;
        }

        public String toString() {
            String str = this.f94156a;
            String str2 = this.f94157b;
            Double d10 = this.f94158c;
            String str3 = this.f94159d;
            String str4 = this.f94160e;
            Double d11 = this.f94161f;
            String str5 = this.f94162g;
            String str6 = this.f94163h;
            String str7 = this.f94164i;
            return "PrepaidCardTransactionRemote(pspBrandName=" + str + ", label=" + str2 + ", amount=" + d10 + ", pspTimestamp=" + str3 + ", iopgId=" + str4 + ", balanceAmount=" + d11 + ", last4Digits=" + str5 + ", prepaidCardStatus=" + str6 + ", prepaidCardDeclineReason=" + str7 + ")";
        }
    }

    @p
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\b\u0018\u0000 82\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0003\u00179\u0019BW\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u001cR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010$\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010\u001cR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b.\u0010'\u001a\u0004\b,\u0010-R\"\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b/\u0010$\u0012\u0004\b1\u0010'\u001a\u0004\b0\u0010\u001cR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b2\u0010$\u0012\u0004\b4\u0010'\u001a\u0004\b3\u0010\u001cR\"\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b5\u0010$\u0012\u0004\b7\u0010'\u001a\u0004\b6\u0010\u001c¨\u0006:"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$WalletTransactionRemote;", "Lpp/b;", "LNn/F$g;", "", "seen0", "", "pspBrandName", "label", "", "amount", "pspTimestamp", "walletStatus", "walletDeclineReason", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$WalletTransactionRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()LNn/F$g;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPspBrandName", "getPspBrandName$annotations", "()V", "getLabel", "getLabel$annotations", "c", "Ljava/lang/Double;", "getAmount", "()Ljava/lang/Double;", "getAmount$annotations", "d", "getPspTimestamp", "getPspTimestamp$annotations", "e", "getWalletStatus", "getWalletStatus$annotations", "f", "getWalletDeclineReason", "getWalletDeclineReason$annotations", "Companion", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class WalletTransactionRemote implements C11768b<F.g> {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f94166a;

        /* renamed from: b  reason: collision with root package name */
        private final String f94167b;

        /* renamed from: c  reason: collision with root package name */
        private final Double f94168c;

        /* renamed from: d  reason: collision with root package name */
        private final String f94169d;

        /* renamed from: e  reason: collision with root package name */
        private final String f94170e;

        /* renamed from: f  reason: collision with root package name */
        private final String f94171f;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$WalletTransactionRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$WalletTransactionRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<WalletTransactionRemote> serializer() {
                return PaymentContextRemote$WalletTransactionRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$WalletTransactionRemote$b;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "Companion", "a", "INITIALIZED", "CANCELLED", "DECLINED", "AUTHORIZED", "CAPTURED", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public enum b {
            INITIALIZED("INITIALIZED"),
            CANCELLED("CANCELLED"),
            DECLINED("DECLINED"),
            AUTHORIZED("AUTHORIZED"),
            CAPTURED("CAPTURED");
            
            public static final a Companion = null;
            private final String rawValue;

            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$WalletTransactionRemote$b$a;", "", "<init>", "()V", "", "rawValue", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$WalletTransactionRemote$b;", "a", "(Ljava/lang/String;)Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$WalletTransactionRemote$b;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a {
                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final b a(String str) {
                    T t10;
                    Iterator<T> it = b.b().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t10 = null;
                            break;
                        }
                        t10 = it.next();
                        if (C15854t.H(((b) t10).j(), str, true)) {
                            break;
                        }
                    }
                    b bVar = (b) t10;
                    if (bVar != null) {
                        return bVar;
                    }
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unknown status: " + str);
                    e eVar = e.ERROR;
                    ArrayList<C11819b> arrayList = new ArrayList<>();
                    for (Object next : d.f102012a.a()) {
                        if (((C11819b) next).b(eVar, false)) {
                            arrayList.add(next);
                        }
                    }
                    String str2 = null;
                    String str3 = null;
                    for (C11819b bVar2 : arrayList) {
                        if (str2 == null) {
                            String a10 = C11818a.a((String) null, illegalArgumentException);
                            if (a10 == null) {
                                return null;
                            }
                            str2 = C11820c.a(a10);
                        }
                        String str4 = str2;
                        if (str3 == null) {
                            String name = a.class.getName();
                            C17542s.g(name);
                            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o12.length() != 0) {
                                name = C15854t.P0(o12, "Kt");
                            }
                            str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                        }
                        String str5 = str3;
                        bVar2.a(eVar, str5, false, illegalArgumentException, str4);
                        str2 = str4;
                        str3 = str5;
                    }
                    return null;
                }

                private a() {
                }
            }

            static {
                b[] a10;
                $ENTRIES = C17221b.a(a10);
                Companion = new a((DefaultConstructorMarker) null);
            }

            private b(String str) {
                this.rawValue = str;
            }

            public static C17220a<b> b() {
                return $ENTRIES;
            }

            public final String j() {
                return this.rawValue;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class c {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f94172a;

            /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$WalletTransactionRemote$b[] r0 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.WalletTransactionRemote.b.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$WalletTransactionRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.WalletTransactionRemote.b.AUTHORIZED     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$WalletTransactionRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.WalletTransactionRemote.b.CAPTURED     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$WalletTransactionRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.WalletTransactionRemote.b.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$WalletTransactionRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.WalletTransactionRemote.b.CANCELLED     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$WalletTransactionRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.WalletTransactionRemote.b.DECLINED     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    f94172a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.WalletTransactionRemote.c.<clinit>():void");
            }
        }

        public /* synthetic */ WalletTransactionRemote(int i10, String str, String str2, Double d10, String str3, String str4, String str5, T0 t02) {
            if (63 != (i10 & 63)) {
                E0.b(i10, 63, PaymentContextRemote$WalletTransactionRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f94166a = str;
            this.f94167b = str2;
            this.f94168c = d10;
            this.f94169d = str3;
            this.f94170e = str4;
            this.f94171f = str5;
        }

        public static final /* synthetic */ void b(WalletTransactionRemote walletTransactionRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 0, y02, walletTransactionRemote.f94166a);
            dVar.B(serialDescriptor, 1, y02, walletTransactionRemote.f94167b);
            dVar.B(serialDescriptor, 2, C17438C.f144010a, walletTransactionRemote.f94168c);
            dVar.B(serialDescriptor, 3, y02, walletTransactionRemote.f94169d);
            dVar.B(serialDescriptor, 4, y02, walletTransactionRemote.f94170e);
            dVar.B(serialDescriptor, 5, y02, walletTransactionRemote.f94171f);
        }

        public F.g a() {
            b a10 = b.Companion.a(this.f94170e);
            boolean z10 = true;
            if (this.f94168c == null || a10 == null) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Required fields missing: " + this);
                e eVar = e.ERROR;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList) {
                    if (str == null) {
                        String a11 = C11818a.a((String) null, illegalArgumentException);
                        if (a11 == null) {
                            break;
                        }
                        str = C11820c.a(a11);
                    }
                    if (str2 == null) {
                        String name = WalletTransactionRemote.class.getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    bVar.a(eVar, str2, false, illegalArgumentException, str);
                }
                return null;
            }
            int i10 = c.f94172a[a10.ordinal()];
            if (!(i10 == 1 || i10 == 2)) {
                if (i10 == 3 || i10 == 4 || i10 == 5) {
                    z10 = false;
                } else {
                    throw new t();
                }
            }
            return new F.g(this.f94166a, this.f94167b, z10, a10.j(), this.f94169d, this.f94171f, this.f94168c.doubleValue());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WalletTransactionRemote)) {
                return false;
            }
            WalletTransactionRemote walletTransactionRemote = (WalletTransactionRemote) obj;
            return C17542s.e(this.f94166a, walletTransactionRemote.f94166a) && C17542s.e(this.f94167b, walletTransactionRemote.f94167b) && C17542s.e(this.f94168c, walletTransactionRemote.f94168c) && C17542s.e(this.f94169d, walletTransactionRemote.f94169d) && C17542s.e(this.f94170e, walletTransactionRemote.f94170e) && C17542s.e(this.f94171f, walletTransactionRemote.f94171f);
        }

        public int hashCode() {
            String str = this.f94166a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f94167b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Double d10 = this.f94168c;
            int hashCode3 = (hashCode2 + (d10 == null ? 0 : d10.hashCode())) * 31;
            String str3 = this.f94169d;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f94170e;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f94171f;
            if (str5 != null) {
                i10 = str5.hashCode();
            }
            return hashCode5 + i10;
        }

        public String toString() {
            String str = this.f94166a;
            String str2 = this.f94167b;
            Double d10 = this.f94168c;
            String str3 = this.f94169d;
            String str4 = this.f94170e;
            String str5 = this.f94171f;
            return "WalletTransactionRemote(pspBrandName=" + str + ", label=" + str2 + ", amount=" + d10 + ", pspTimestamp=" + str3 + ", walletStatus=" + str4 + ", walletDeclineReason=" + str5 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<PaymentContextRemote> serializer() {
            return PaymentContextRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$b;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "Companion", "a", "CREATED", "EXPRESS_CREATED", "PSP_SESSION_INITIALIZED", "TRANSACTION_PROGRESS_STARTED", "TRANSACTION_PROCESS_STARTED", "IN_PROGRESS", "PARTLY_AUTHORIZED", "DELAYED_RESULT", "AUTHORIZED", "COMPLETED", "DECLINED_PAYMENT", "INVALIDATED", "CANCELLED", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum b {
        CREATED("CREATED"),
        EXPRESS_CREATED("EXPRESS_CREATED"),
        PSP_SESSION_INITIALIZED("PSP_SESSION_INITIALIZED"),
        TRANSACTION_PROGRESS_STARTED("TRANSACTION_PROGRESS_STARTED"),
        TRANSACTION_PROCESS_STARTED("TRANSACTION_PROCESS_STARTED"),
        IN_PROGRESS("IN_PROGRESS"),
        PARTLY_AUTHORIZED("PARTLY_AUTHORIZED"),
        DELAYED_RESULT("DELAYED_RESULT"),
        AUTHORIZED("AUTHORIZED"),
        COMPLETED("COMPLETED"),
        DECLINED_PAYMENT("DECLINED_PAYMENT"),
        INVALIDATED("INVALIDATED"),
        CANCELLED("CANCELLED");
        
        public static final a Companion = null;
        private final String rawValue;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$b$a;", "", "<init>", "()V", "", "rawValue", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$b;", "a", "(Ljava/lang/String;)Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PaymentContextRemote$b;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b a(String str) {
                T t10;
                Iterator<T> it = b.b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t10 = null;
                        break;
                    }
                    t10 = it.next();
                    if (C15854t.H(((b) t10).j(), str, true)) {
                        break;
                    }
                }
                b bVar = (b) t10;
                if (bVar != null) {
                    return bVar;
                }
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unknown status: " + str);
                e eVar = e.ERROR;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str2 = null;
                String str3 = null;
                for (C11819b bVar2 : arrayList) {
                    if (str2 == null) {
                        String a10 = C11818a.a((String) null, illegalArgumentException);
                        if (a10 == null) {
                            return null;
                        }
                        str2 = C11820c.a(a10);
                    }
                    String str4 = str2;
                    if (str3 == null) {
                        String name = a.class.getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str5 = str3;
                    bVar2.a(eVar, str5, false, illegalArgumentException, str4);
                    str2 = str4;
                    str3 = str5;
                }
                return null;
            }

            private a() {
            }
        }

        static {
            b[] a10;
            $ENTRIES = C17221b.a(a10);
            Companion = new a((DefaultConstructorMarker) null);
        }

        private b(String str) {
            this.rawValue = str;
        }

        public static C17220a<b> b() {
            return $ENTRIES;
        }

        public final String j() {
            return this.rawValue;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f94173a;

        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|(2:25|26)|27|29) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|29) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$b[] r0 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.b.PSP_SESSION_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.b.DELAYED_RESULT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.b.COMPLETED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.b.IN_PROGRESS     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.b.TRANSACTION_PROGRESS_STARTED     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.b.TRANSACTION_PROCESS_STARTED     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.b.CREATED     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.b.PARTLY_AUTHORIZED     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.b.DECLINED_PAYMENT     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.b.INVALIDATED     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.b.CANCELLED     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.b.AUTHORIZED     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.b.EXPRESS_CREATED     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                f94173a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.c.<clinit>():void");
        }
    }

    public /* synthetic */ PaymentContextRemote(int i10, String str, Double d10, Double d11, String str2, String str3, List list, List list2, List list3, List list4, List list5, List list6, T0 t02) {
        if (2047 != (i10 & 2047)) {
            E0.b(i10, 2047, PaymentContextRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f94115a = str;
        this.f94116b = d10;
        this.f94117c = d11;
        this.f94118d = str2;
        this.f94119e = str3;
        this.f94120f = list;
        this.f94121g = list2;
        this.f94122h = list3;
        this.f94123i = list4;
        this.f94124j = list5;
        this.f94125k = list6;
    }

    private final h b(b bVar) {
        switch (c.f94173a[bVar.ordinal()]) {
            case 1:
                return h.INITIALIZED;
            case 2:
                return h.DELAYED_RESULT;
            case 3:
                return h.COMPLETED;
            case 4:
            case 5:
            case 6:
                return h.IN_PROGRESS;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return h.OTHER;
            default:
                throw new t();
        }
    }

    public static final /* synthetic */ void e(PaymentContextRemote paymentContextRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f94114l;
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, paymentContextRemote.f94115a);
        C17438C c10 = C17438C.f144010a;
        dVar.B(serialDescriptor, 1, c10, paymentContextRemote.f94116b);
        dVar.B(serialDescriptor, 2, c10, paymentContextRemote.f94117c);
        dVar.B(serialDescriptor, 3, y02, paymentContextRemote.f94118d);
        dVar.B(serialDescriptor, 4, y02, paymentContextRemote.f94119e);
        dVar.B(serialDescriptor, 5, kSerializerArr[5], paymentContextRemote.f94120f);
        dVar.B(serialDescriptor, 6, kSerializerArr[6], paymentContextRemote.f94121g);
        dVar.B(serialDescriptor, 7, kSerializerArr[7], paymentContextRemote.f94122h);
        dVar.B(serialDescriptor, 8, kSerializerArr[8], paymentContextRemote.f94123i);
        dVar.B(serialDescriptor, 9, kSerializerArr[9], paymentContextRemote.f94124j);
        dVar.B(serialDescriptor, 10, kSerializerArr[10], paymentContextRemote.f94125k);
    }

    public final String c() {
        return this.f94119e;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: java.util.Collection} */
    /* JADX WARNING: type inference failed for: r10v7, types: [java.util.Collection] */
    /* JADX WARNING: type inference failed for: r10v10, types: [java.util.Collection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r10v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Rn.f d() {
        /*
            r25 = this;
            r0 = r25
            qv.e r7 = qv.e.DEBUG
            qv.d r1 = qv.d.f102012a
            java.util.List r1 = r1.a()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0015:
            boolean r3 = r1.hasNext()
            r8 = 0
            if (r3 == 0) goto L_0x002d
            java.lang.Object r3 = r1.next()
            r4 = r3
            qv.b r4 = (qv.C11819b) r4
            boolean r4 = r4.b(r7, r8)
            if (r4 == 0) goto L_0x0015
            r2.add(r3)
            goto L_0x0015
        L_0x002d:
            java.util.Iterator r9 = r2.iterator()
            r10 = 0
            r1 = r10
            r2 = r1
        L_0x0034:
            boolean r3 = r9.hasNext()
            java.lang.String r4 = "|"
            java.lang.String r5 = "b"
            java.lang.String r6 = "m"
            java.lang.String r12 = "main"
            java.lang.String r13 = "Kt"
            r15 = 36
            java.lang.Class<com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote> r16 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.class
            if (r3 == 0) goto L_0x00c3
            java.lang.Object r3 = r9.next()
            qv.b r3 = (qv.C11819b) r3
            r11 = 0
            if (r1 != 0) goto L_0x0071
            java.lang.String r1 = r25.c()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r8 = "Got payment status: "
            r14.append(r8)
            r14.append(r1)
            java.lang.String r1 = r14.toString()
            java.lang.String r1 = qv.C11818a.a(r1, r11)
            if (r1 != 0) goto L_0x006d
            goto L_0x00c3
        L_0x006d:
            java.lang.String r1 = qv.C11820c.a(r1)
        L_0x0071:
            r8 = r1
            if (r2 != 0) goto L_0x00b3
            java.lang.String r1 = r16.getName()
            kotlin.jvm.internal.C17542s.g(r1)
            r2 = 2
            java.lang.String r14 = HJ.C15854t.s1(r1, r15, r10, r2, r10)
            r15 = 46
            java.lang.String r2 = HJ.C15854t.o1(r14, r15, r10, r2, r10)
            int r14 = r2.length()
            if (r14 != 0) goto L_0x008d
            goto L_0x0091
        L_0x008d:
            java.lang.String r1 = HJ.C15854t.P0(r2, r13)
        L_0x0091:
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r13 = 1
            boolean r2 = HJ.C15854t.b0(r2, r12, r13)
            if (r2 == 0) goto L_0x00a1
            r5 = r6
        L_0x00a1:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r2.append(r4)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
        L_0x00b3:
            r12 = r2
            r1 = r3
            r2 = r7
            r3 = r12
            r14 = 0
            r4 = r14
            r5 = r11
            r6 = r8
            r1.a(r2, r3, r4, r5, r6)
            r1 = r8
            r2 = r12
            r8 = r14
            goto L_0x0034
        L_0x00c3:
            java.lang.String r1 = r0.f94115a
            if (r1 == 0) goto L_0x02f5
            boolean r1 = HJ.C15854t.v0(r1)
            if (r1 != 0) goto L_0x02f5
            com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$b$a r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.b.Companion
            java.lang.String r2 = r0.f94119e
            com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$b r1 = r1.a(r2)
            java.lang.Double r2 = r0.f94116b
            if (r2 == 0) goto L_0x022a
            if (r1 != 0) goto L_0x00dd
            goto L_0x022a
        L_0x00dd:
            java.util.List<com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$CreditCardTransactionRemote> r2 = r0.f94120f
            if (r2 == 0) goto L_0x0102
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x00ec:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0103
            java.lang.Object r4 = r2.next()
            com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$CreditCardTransactionRemote r4 = (com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.CreditCardTransactionRemote) r4
            Nn.F$b r4 = r4.a()
            if (r4 == 0) goto L_0x00ec
            r3.add(r4)
            goto L_0x00ec
        L_0x0102:
            r3 = r10
        L_0x0103:
            java.util.List<com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$PrepaidCardTransactionRemote> r2 = r0.f94121g
            if (r2 == 0) goto L_0x0128
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0112:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0129
            java.lang.Object r5 = r2.next()
            com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$PrepaidCardTransactionRemote r5 = (com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.PrepaidCardTransactionRemote) r5
            Nn.F$f r5 = r5.a()
            if (r5 == 0) goto L_0x0112
            r4.add(r5)
            goto L_0x0112
        L_0x0128:
            r4 = r10
        L_0x0129:
            java.util.List<com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$WalletTransactionRemote> r2 = r0.f94122h
            if (r2 == 0) goto L_0x014e
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0138:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x014f
            java.lang.Object r6 = r2.next()
            com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$WalletTransactionRemote r6 = (com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.WalletTransactionRemote) r6
            Nn.F$g r6 = r6.a()
            if (r6 == 0) goto L_0x0138
            r5.add(r6)
            goto L_0x0138
        L_0x014e:
            r5 = r10
        L_0x014f:
            java.util.List<com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$AccountVoucherTransactionRemote> r2 = r0.f94123i
            if (r2 == 0) goto L_0x0174
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x015e:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0175
            java.lang.Object r7 = r2.next()
            com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$AccountVoucherTransactionRemote r7 = (com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.AccountVoucherTransactionRemote) r7
            Nn.F$a r7 = r7.b()
            if (r7 == 0) goto L_0x015e
            r6.add(r7)
            goto L_0x015e
        L_0x0174:
            r6 = r10
        L_0x0175:
            java.util.List<com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$OpenInvoiceTransactionRemote> r2 = r0.f94124j
            if (r2 == 0) goto L_0x019a
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0184:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x019b
            java.lang.Object r8 = r2.next()
            com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$OpenInvoiceTransactionRemote r8 = (com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.OpenInvoiceTransactionRemote) r8
            Nn.F$d r8 = r8.a()
            if (r8 == 0) goto L_0x0184
            r7.add(r8)
            goto L_0x0184
        L_0x019a:
            r7 = r10
        L_0x019b:
            java.util.List<com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$OnlineTransferTransactionRemote> r2 = r0.f94125k
            if (r2 == 0) goto L_0x01c0
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x01aa:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x01c0
            java.lang.Object r8 = r2.next()
            com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote$OnlineTransferTransactionRemote r8 = (com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.OnlineTransferTransactionRemote) r8
            Nn.F$c r8 = r8.a()
            if (r8 == 0) goto L_0x01aa
            r10.add(r8)
            goto L_0x01aa
        L_0x01c0:
            java.lang.String r12 = r0.f94115a
            Rn.h r14 = r0.b(r1)
            java.lang.Double r1 = r0.f94116b
            java.util.List r2 = YH.C16877v.c()
            if (r3 == 0) goto L_0x01cf
            goto L_0x01d5
        L_0x01cf:
            java.util.List r3 = YH.C16877v.n()
            java.util.Collection r3 = (java.util.Collection) r3
        L_0x01d5:
            r2.addAll(r3)
            if (r4 == 0) goto L_0x01db
            goto L_0x01e2
        L_0x01db:
            java.util.List r3 = YH.C16877v.n()
            r4 = r3
            java.util.Collection r4 = (java.util.Collection) r4
        L_0x01e2:
            r2.addAll(r4)
            if (r5 == 0) goto L_0x01e8
            goto L_0x01ef
        L_0x01e8:
            java.util.List r3 = YH.C16877v.n()
            r5 = r3
            java.util.Collection r5 = (java.util.Collection) r5
        L_0x01ef:
            r2.addAll(r5)
            if (r6 == 0) goto L_0x01f5
            goto L_0x01fc
        L_0x01f5:
            java.util.List r3 = YH.C16877v.n()
            r6 = r3
            java.util.Collection r6 = (java.util.Collection) r6
        L_0x01fc:
            r2.addAll(r6)
            if (r7 == 0) goto L_0x0202
            goto L_0x0209
        L_0x0202:
            java.util.List r3 = YH.C16877v.n()
            r7 = r3
            java.util.Collection r7 = (java.util.Collection) r7
        L_0x0209:
            r2.addAll(r7)
            if (r10 == 0) goto L_0x020f
            goto L_0x0216
        L_0x020f:
            java.util.List r3 = YH.C16877v.n()
            r10 = r3
            java.util.Collection r10 = (java.util.Collection) r10
        L_0x0216:
            r2.addAll(r10)
            java.util.List r17 = YH.C16877v.a(r2)
            java.lang.String r13 = r0.f94118d
            Rn.f r2 = new Rn.f
            double r15 = r1.doubleValue()
            r11 = r2
            r11.<init>(r12, r13, r14, r15, r17)
            return r2
        L_0x022a:
            java.lang.String r1 = r0.f94119e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "Required fields missing, leftToPay: "
            r3.append(r7)
            r3.append(r2)
            java.lang.String r2 = ", status: "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r1)
            qv.e r3 = qv.e.ERROR
            qv.d r7 = qv.d.f102012a
            java.util.List r7 = r7.a()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x025d:
            boolean r9 = r7.hasNext()
            r11 = 0
            if (r9 == 0) goto L_0x0275
            java.lang.Object r9 = r7.next()
            r14 = r9
            qv.b r14 = (qv.C11819b) r14
            boolean r11 = r14.b(r3, r11)
            if (r11 == 0) goto L_0x025d
            r8.add(r9)
            goto L_0x025d
        L_0x0275:
            java.util.Iterator r7 = r8.iterator()
            r8 = r10
            r9 = r8
        L_0x027b:
            boolean r14 = r7.hasNext()
            if (r14 == 0) goto L_0x02ef
            java.lang.Object r14 = r7.next()
            r19 = r14
            qv.b r19 = (qv.C11819b) r19
            if (r8 != 0) goto L_0x0295
            java.lang.String r8 = qv.C11818a.a(r10, r2)
            if (r8 == 0) goto L_0x02ef
            java.lang.String r8 = qv.C11820c.a(r8)
        L_0x0295:
            if (r9 != 0) goto L_0x02d9
            java.lang.String r9 = r16.getName()
            kotlin.jvm.internal.C17542s.g(r9)
            r14 = 2
            java.lang.String r11 = HJ.C15854t.s1(r9, r15, r10, r14, r10)
            r15 = 46
            java.lang.String r11 = HJ.C15854t.o1(r11, r15, r10, r14, r10)
            int r18 = r11.length()
            if (r18 != 0) goto L_0x02b0
            goto L_0x02b4
        L_0x02b0:
            java.lang.String r9 = HJ.C15854t.P0(r11, r13)
        L_0x02b4:
            java.lang.Thread r11 = java.lang.Thread.currentThread()
            java.lang.String r11 = r11.getName()
            r10 = 1
            boolean r11 = HJ.C15854t.b0(r11, r12, r10)
            if (r11 == 0) goto L_0x02c5
            r11 = r6
            goto L_0x02c6
        L_0x02c5:
            r11 = r5
        L_0x02c6:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r11)
            r10.append(r4)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            goto L_0x02dc
        L_0x02d9:
            r14 = 2
            r15 = 46
        L_0x02dc:
            r20 = r3
            r21 = r9
            r10 = 0
            r22 = r10
            r23 = r2
            r24 = r8
            r19.a(r20, r21, r22, r23, r24)
            r11 = r10
            r10 = 0
            r15 = 36
            goto L_0x027b
        L_0x02ef:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r1)
            throw r2
        L_0x02f5:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Missing payment context id"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote.d():Rn.f");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentContextRemote)) {
            return false;
        }
        PaymentContextRemote paymentContextRemote = (PaymentContextRemote) obj;
        return C17542s.e(this.f94115a, paymentContextRemote.f94115a) && C17542s.e(this.f94116b, paymentContextRemote.f94116b) && C17542s.e(this.f94117c, paymentContextRemote.f94117c) && C17542s.e(this.f94118d, paymentContextRemote.f94118d) && C17542s.e(this.f94119e, paymentContextRemote.f94119e) && C17542s.e(this.f94120f, paymentContextRemote.f94120f) && C17542s.e(this.f94121g, paymentContextRemote.f94121g) && C17542s.e(this.f94122h, paymentContextRemote.f94122h) && C17542s.e(this.f94123i, paymentContextRemote.f94123i) && C17542s.e(this.f94124j, paymentContextRemote.f94124j) && C17542s.e(this.f94125k, paymentContextRemote.f94125k);
    }

    public int hashCode() {
        String str = this.f94115a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d10 = this.f94116b;
        int hashCode2 = (hashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.f94117c;
        int hashCode3 = (hashCode2 + (d11 == null ? 0 : d11.hashCode())) * 31;
        String str2 = this.f94118d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f94119e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<CreditCardTransactionRemote> list = this.f94120f;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<PrepaidCardTransactionRemote> list2 = this.f94121g;
        int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<WalletTransactionRemote> list3 = this.f94122h;
        int hashCode8 = (hashCode7 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<AccountVoucherTransactionRemote> list4 = this.f94123i;
        int hashCode9 = (hashCode8 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<OpenInvoiceTransactionRemote> list5 = this.f94124j;
        int hashCode10 = (hashCode9 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<OnlineTransferTransactionRemote> list6 = this.f94125k;
        if (list6 != null) {
            i10 = list6.hashCode();
        }
        return hashCode10 + i10;
    }

    public String toString() {
        String str = this.f94115a;
        Double d10 = this.f94116b;
        Double d11 = this.f94117c;
        String str2 = this.f94118d;
        String str3 = this.f94119e;
        List<CreditCardTransactionRemote> list = this.f94120f;
        List<PrepaidCardTransactionRemote> list2 = this.f94121g;
        List<WalletTransactionRemote> list3 = this.f94122h;
        List<AccountVoucherTransactionRemote> list4 = this.f94123i;
        List<OpenInvoiceTransactionRemote> list5 = this.f94124j;
        List<OnlineTransferTransactionRemote> list6 = this.f94125k;
        return "PaymentContextRemote(paymentContextId=" + str + ", amountLeftToPay=" + d10 + ", amountPaid=" + d11 + ", orderNumber=" + str2 + ", status=" + str3 + ", creditCardTransactions=" + list + ", prepaidCardTransactions=" + list2 + ", walletTransactions=" + list3 + ", accountVoucherTransactions=" + list4 + ", openInvoiceTransactions=" + list5 + ", onlineTransferTransactions=" + list6 + ")";
    }
}
