package com.ingka.ikea.checkout.datalayer.impl.repo.network;

import HJ.C15854t;
import Nn.C10802e;
import Nn.C10806i;
import Rn.e;
import XH.t;
import YH.C16877v;
import com.sugarcube.core.logger.DslKt;
import fI.C17220a;
import fI.C17221b;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.M;
import jK.T0;
import jK.Y0;
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

@p
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\b\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000356$BI\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u001cR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u001cR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010+\u0012\u0004\b.\u0010(\u001a\u0004\b,\u0010-R(\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b3\u0010(\u001a\u0004\b1\u00102¨\u00067"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PrepaidResponse;", "Lpp/b;", "LRn/e;", "", "seen0", "", "orderNumber", "paymentContextId", "", "amountLeftToPay", "", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PrepaidResponse$PrepaidCardTransactionsRemote;", "prepaidCardTransactions", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PrepaidResponse;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()LRn/e;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getOrderNumber", "getOrderNumber$annotations", "()V", "getPaymentContextId", "getPaymentContextId$annotations", "Ljava/lang/Float;", "getAmountLeftToPay", "()Ljava/lang/Float;", "getAmountLeftToPay$annotations", "d", "Ljava/util/List;", "getPrepaidCardTransactions", "()Ljava/util/List;", "getPrepaidCardTransactions$annotations", "Companion", "PrepaidCardTransactionsRemote", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PrepaidResponse implements C11768b<e> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final KSerializer<Object>[] f93717e = {null, null, null, new C17451f(PrepaidResponse$PrepaidCardTransactionsRemote$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final String f93718a;

    /* renamed from: b  reason: collision with root package name */
    private final String f93719b;

    /* renamed from: c  reason: collision with root package name */
    private final Float f93720c;

    /* renamed from: d  reason: collision with root package name */
    private final List<PrepaidCardTransactionsRemote> f93721d;

    @p
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\b\u0018\u0000 <2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0003\u0018=\u001aBa\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u001dR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u001dR\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010%\u0012\u0004\b-\u0010(\u001a\u0004\b,\u0010\u001dR\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b.\u0010/\u0012\u0004\b2\u0010(\u001a\u0004\b0\u00101R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b3\u0010%\u0012\u0004\b5\u0010(\u001a\u0004\b4\u0010\u001dR\"\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b6\u0010/\u0012\u0004\b8\u0010(\u001a\u0004\b7\u00101R\"\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b9\u0010%\u0012\u0004\b;\u0010(\u001a\u0004\b:\u0010\u001d¨\u0006>"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PrepaidResponse$PrepaidCardTransactionsRemote;", "Lpp/b;", "LNn/i$a;", "", "seen0", "", "pspBrandName", "label", "iopgId", "", "amount", "prepaidCardStatus", "balanceAmount", "last4Digits", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PrepaidResponse$PrepaidCardTransactionsRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()LNn/i$a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPspBrandName", "getPspBrandName$annotations", "()V", "getLabel", "getLabel$annotations", "c", "getIopgId", "getIopgId$annotations", "d", "Ljava/lang/Float;", "getAmount", "()Ljava/lang/Float;", "getAmount$annotations", "e", "getPrepaidCardStatus", "getPrepaidCardStatus$annotations", "f", "getBalanceAmount", "getBalanceAmount$annotations", "g", "getLast4Digits", "getLast4Digits$annotations", "Companion", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PrepaidCardTransactionsRemote implements C11768b<C10806i.a> {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f93722a;

        /* renamed from: b  reason: collision with root package name */
        private final String f93723b;

        /* renamed from: c  reason: collision with root package name */
        private final String f93724c;

        /* renamed from: d  reason: collision with root package name */
        private final Float f93725d;

        /* renamed from: e  reason: collision with root package name */
        private final String f93726e;

        /* renamed from: f  reason: collision with root package name */
        private final Float f93727f;

        /* renamed from: g  reason: collision with root package name */
        private final String f93728g;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PrepaidResponse$PrepaidCardTransactionsRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PrepaidResponse$PrepaidCardTransactionsRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<PrepaidCardTransactionsRemote> serializer() {
                return PrepaidResponse$PrepaidCardTransactionsRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PrepaidResponse$PrepaidCardTransactionsRemote$b;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "", "m", "()Z", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "Companion", "a", "DECLINED", "AUTHORIZED", "PENDING_CAPTURE", "PENDING_CANCELLATION", "CAPTURED", "FAILED", "CANCELLED", "CANCEL_FAILED", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PrepaidResponse$PrepaidCardTransactionsRemote$b$a;", "", "<init>", "()V", "", "rawValue", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PrepaidResponse$PrepaidCardTransactionsRemote$b;", "a", "(Ljava/lang/String;)Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PrepaidResponse$PrepaidCardTransactionsRemote$b;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
                    return (b) t10;
                }

                private a() {
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.ingka.ikea.checkout.datalayer.impl.repo.network.PrepaidResponse$PrepaidCardTransactionsRemote$b$b  reason: collision with other inner class name */
            public /* synthetic */ class C2087b {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f93729a = null;

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
                        com.ingka.ikea.checkout.datalayer.impl.repo.network.PrepaidResponse$PrepaidCardTransactionsRemote$b[] r0 = com.ingka.ikea.checkout.datalayer.impl.repo.network.PrepaidResponse.PrepaidCardTransactionsRemote.b.values()
                        int r0 = r0.length
                        int[] r0 = new int[r0]
                        com.ingka.ikea.checkout.datalayer.impl.repo.network.PrepaidResponse$PrepaidCardTransactionsRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.PrepaidResponse.PrepaidCardTransactionsRemote.b.AUTHORIZED     // Catch:{ NoSuchFieldError -> 0x0010 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                        r2 = 1
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                    L_0x0010:
                        com.ingka.ikea.checkout.datalayer.impl.repo.network.PrepaidResponse$PrepaidCardTransactionsRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.PrepaidResponse.PrepaidCardTransactionsRemote.b.PENDING_CAPTURE     // Catch:{ NoSuchFieldError -> 0x0019 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                        r2 = 2
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                    L_0x0019:
                        com.ingka.ikea.checkout.datalayer.impl.repo.network.PrepaidResponse$PrepaidCardTransactionsRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.PrepaidResponse.PrepaidCardTransactionsRemote.b.CAPTURED     // Catch:{ NoSuchFieldError -> 0x0022 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                        r2 = 3
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                    L_0x0022:
                        com.ingka.ikea.checkout.datalayer.impl.repo.network.PrepaidResponse$PrepaidCardTransactionsRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.PrepaidResponse.PrepaidCardTransactionsRemote.b.DECLINED     // Catch:{ NoSuchFieldError -> 0x002b }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                        r2 = 4
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                    L_0x002b:
                        com.ingka.ikea.checkout.datalayer.impl.repo.network.PrepaidResponse$PrepaidCardTransactionsRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.PrepaidResponse.PrepaidCardTransactionsRemote.b.PENDING_CANCELLATION     // Catch:{ NoSuchFieldError -> 0x0034 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                        r2 = 5
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                    L_0x0034:
                        com.ingka.ikea.checkout.datalayer.impl.repo.network.PrepaidResponse$PrepaidCardTransactionsRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.PrepaidResponse.PrepaidCardTransactionsRemote.b.FAILED     // Catch:{ NoSuchFieldError -> 0x003d }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                        r2 = 6
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
                    L_0x003d:
                        com.ingka.ikea.checkout.datalayer.impl.repo.network.PrepaidResponse$PrepaidCardTransactionsRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.PrepaidResponse.PrepaidCardTransactionsRemote.b.CANCELLED     // Catch:{ NoSuchFieldError -> 0x0046 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                        r2 = 7
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
                    L_0x0046:
                        com.ingka.ikea.checkout.datalayer.impl.repo.network.PrepaidResponse$PrepaidCardTransactionsRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.PrepaidResponse.PrepaidCardTransactionsRemote.b.CANCEL_FAILED     // Catch:{ NoSuchFieldError -> 0x0050 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                        r2 = 8
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
                    L_0x0050:
                        f93729a = r0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.PrepaidResponse.PrepaidCardTransactionsRemote.b.C2087b.<clinit>():void");
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

            public final boolean m() {
                switch (C2087b.f93729a[ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        return true;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        return false;
                    default:
                        throw new t();
                }
            }
        }

        public /* synthetic */ PrepaidCardTransactionsRemote(int i10, String str, String str2, String str3, Float f10, String str4, Float f11, String str5, T0 t02) {
            if (127 != (i10 & 127)) {
                E0.b(i10, 127, PrepaidResponse$PrepaidCardTransactionsRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f93722a = str;
            this.f93723b = str2;
            this.f93724c = str3;
            this.f93725d = f10;
            this.f93726e = str4;
            this.f93727f = f11;
            this.f93728g = str5;
        }

        public static final /* synthetic */ void b(PrepaidCardTransactionsRemote prepaidCardTransactionsRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 0, y02, prepaidCardTransactionsRemote.f93722a);
            dVar.B(serialDescriptor, 1, y02, prepaidCardTransactionsRemote.f93723b);
            dVar.B(serialDescriptor, 2, y02, prepaidCardTransactionsRemote.f93724c);
            M m10 = M.f144051a;
            dVar.B(serialDescriptor, 3, m10, prepaidCardTransactionsRemote.f93725d);
            dVar.B(serialDescriptor, 4, y02, prepaidCardTransactionsRemote.f93726e);
            dVar.B(serialDescriptor, 5, m10, prepaidCardTransactionsRemote.f93727f);
            dVar.B(serialDescriptor, 6, y02, prepaidCardTransactionsRemote.f93728g);
        }

        public C10806i.a a() {
            b a10 = b.Companion.a(this.f93726e);
            String str = null;
            Boolean valueOf = a10 != null ? Boolean.valueOf(a10.m()) : null;
            Class<PrepaidCardTransactionsRemote> cls = PrepaidCardTransactionsRemote.class;
            if (C17542s.e(valueOf, Boolean.TRUE)) {
                Float f10 = this.f93727f;
                if (f10 != null) {
                    String str2 = this.f93724c;
                    if (str2 != null) {
                        String str3 = this.f93728g;
                        if (str3 != null) {
                            Double valueOf2 = Double.valueOf((double) f10.floatValue());
                            Float f11 = this.f93725d;
                            if (f11 != null) {
                                return new C10806i.a(str2, str3, valueOf2, (double) f11.floatValue());
                            }
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                IllegalStateException illegalStateException = new IllegalStateException("A successful card should have a balance amount");
                qv.e eVar = qv.e.ERROR;
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
                        String a11 = C11818a.a((String) null, illegalStateException);
                        if (a11 == null) {
                            return null;
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
                        str5 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    bVar.a(eVar, str5, false, illegalStateException, str4);
                }
                return null;
            } else if (C17542s.e(valueOf, Boolean.FALSE)) {
                return null;
            } else {
                if (valueOf == null) {
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unknown status: " + a10);
                    qv.e eVar2 = qv.e.ERROR;
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
                            String a12 = C11818a.a(str, illegalStateException2);
                            if (a12 == null) {
                                break;
                            }
                            str6 = C11820c.a(a12);
                        }
                        if (str7 == null) {
                            String name2 = cls.getName();
                            C17542s.g(name2);
                            String o13 = C15854t.o1(C15854t.s1(name2, '$', str, 2, str), '.', str, 2, str);
                            if (o13.length() != 0) {
                                name2 = C15854t.P0(o13, "Kt");
                            }
                            str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
                        }
                        bVar2.a(eVar2, str7, false, illegalStateException2, str6);
                        str = null;
                    }
                    return null;
                }
                throw new t();
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PrepaidCardTransactionsRemote)) {
                return false;
            }
            PrepaidCardTransactionsRemote prepaidCardTransactionsRemote = (PrepaidCardTransactionsRemote) obj;
            return C17542s.e(this.f93722a, prepaidCardTransactionsRemote.f93722a) && C17542s.e(this.f93723b, prepaidCardTransactionsRemote.f93723b) && C17542s.e(this.f93724c, prepaidCardTransactionsRemote.f93724c) && C17542s.e(this.f93725d, prepaidCardTransactionsRemote.f93725d) && C17542s.e(this.f93726e, prepaidCardTransactionsRemote.f93726e) && C17542s.e(this.f93727f, prepaidCardTransactionsRemote.f93727f) && C17542s.e(this.f93728g, prepaidCardTransactionsRemote.f93728g);
        }

        public int hashCode() {
            String str = this.f93722a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f93723b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f93724c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Float f10 = this.f93725d;
            int hashCode4 = (hashCode3 + (f10 == null ? 0 : f10.hashCode())) * 31;
            String str4 = this.f93726e;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Float f11 = this.f93727f;
            int hashCode6 = (hashCode5 + (f11 == null ? 0 : f11.hashCode())) * 31;
            String str5 = this.f93728g;
            if (str5 != null) {
                i10 = str5.hashCode();
            }
            return hashCode6 + i10;
        }

        public String toString() {
            String str = this.f93722a;
            String str2 = this.f93723b;
            String str3 = this.f93724c;
            Float f10 = this.f93725d;
            String str4 = this.f93726e;
            Float f11 = this.f93727f;
            String str5 = this.f93728g;
            return "PrepaidCardTransactionsRemote(pspBrandName=" + str + ", label=" + str2 + ", iopgId=" + str3 + ", amount=" + f10 + ", prepaidCardStatus=" + str4 + ", balanceAmount=" + f11 + ", last4Digits=" + str5 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PrepaidResponse$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PrepaidResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<PrepaidResponse> serializer() {
            return PrepaidResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PrepaidResponse(int i10, String str, String str2, Float f10, List list, T0 t02) {
        if (15 != (i10 & 15)) {
            E0.b(i10, 15, PrepaidResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.f93718a = str;
        this.f93719b = str2;
        this.f93720c = f10;
        this.f93721d = list;
    }

    public static final /* synthetic */ void c(PrepaidResponse prepaidResponse, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f93717e;
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, prepaidResponse.f93718a);
        dVar.B(serialDescriptor, 1, y02, prepaidResponse.f93719b);
        dVar.B(serialDescriptor, 2, M.f144051a, prepaidResponse.f93720c);
        dVar.B(serialDescriptor, 3, kSerializerArr[3], prepaidResponse.f93721d);
    }

    public e b() {
        ArrayList arrayList;
        String str = this.f93719b;
        if (str == null || C15854t.v0(str)) {
            throw new C10802e.c.b("No payment context id");
        }
        List<PrepaidCardTransactionsRemote> list = this.f93721d;
        if (list != null) {
            arrayList = new ArrayList();
            for (PrepaidCardTransactionsRemote a10 : list) {
                C10806i.a a11 = a10.a();
                if (a11 != null) {
                    arrayList.add(a11);
                }
            }
        } else {
            arrayList = null;
        }
        Float f10 = this.f93720c;
        if (f10 != null) {
            return new e(this.f93718a, str, (double) f10.floatValue(), arrayList == null ? C16877v.n() : arrayList);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrepaidResponse)) {
            return false;
        }
        PrepaidResponse prepaidResponse = (PrepaidResponse) obj;
        return C17542s.e(this.f93718a, prepaidResponse.f93718a) && C17542s.e(this.f93719b, prepaidResponse.f93719b) && C17542s.e(this.f93720c, prepaidResponse.f93720c) && C17542s.e(this.f93721d, prepaidResponse.f93721d);
    }

    public int hashCode() {
        String str = this.f93718a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f93719b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Float f10 = this.f93720c;
        int hashCode3 = (hashCode2 + (f10 == null ? 0 : f10.hashCode())) * 31;
        List<PrepaidCardTransactionsRemote> list = this.f93721d;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        String str = this.f93718a;
        String str2 = this.f93719b;
        Float f10 = this.f93720c;
        List<PrepaidCardTransactionsRemote> list = this.f93721d;
        return "PrepaidResponse(orderNumber=" + str + ", paymentContextId=" + str2 + ", amountLeftToPay=" + f10 + ", prepaidCardTransactions=" + list + ")";
    }
}
