package com.ingka.ikea.checkout.datalayer.impl.repo.network;

import HJ.C15854t;
import Nn.C10806i;
import Nn.t;
import YH.C16877v;
import com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PriceResponse;
import com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PriceResponse$$serializer;
import com.sugarcube.core.logger.DslKt;
import fI.C17220a;
import fI.C17221b;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
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
import qv.e;

@p
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003,-\u0015B9\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010!\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010#R\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u0010!\u0012\u0004\b*\u0010%\u001a\u0004\b)\u0010#¨\u0006."}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/ExpressAddressResponse;", "Lpp/b;", "LNn/i;", "", "seen0", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse;", "goodsTotal", "orderTotal", "shippingPrice", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse;Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse;Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/ExpressAddressResponse;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()LNn/i;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse;", "getGoodsTotal", "()Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/PriceResponse;", "getGoodsTotal$annotations", "()V", "getOrderTotal", "getOrderTotal$annotations", "c", "getShippingPrice", "getShippingPrice$annotations", "Companion", "ExpressAddressErrorResponse", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExpressAddressResponse implements C11768b<C10806i> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final PriceResponse f93680a;

    /* renamed from: b  reason: collision with root package name */
    private final PriceResponse f93681b;

    /* renamed from: c  reason: collision with root package name */
    private final PriceResponse f93682c;

    @p
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00040\u00101%B9\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010\u001dR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010&\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u001dR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010+\u0012\u0004\b.\u0010(\u001a\u0004\b,\u0010-¨\u00062"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/ExpressAddressResponse$ExpressAddressErrorResponse;", "Lpp/b;", "LNn/t;", "", "seen0", "", "status", "message", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/ExpressAddressResponse$ExpressAddressErrorResponse$Extensions;", "extensions", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/ExpressAddressResponse$ExpressAddressErrorResponse$Extensions;LjK/T0;)V", "rawValue", "LNn/t$d$a;", "b", "(Ljava/lang/String;)LNn/t$d$a;", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/ExpressAddressResponse$ExpressAddressErrorResponse;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "c", "()LNn/t;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getStatus$annotations", "()V", "getMessage", "getMessage$annotations", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/ExpressAddressResponse$ExpressAddressErrorResponse$Extensions;", "getExtensions", "()Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/ExpressAddressResponse$ExpressAddressErrorResponse$Extensions;", "getExtensions$annotations", "Companion", "Extensions", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ExpressAddressErrorResponse implements C11768b<t> {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f93683a;

        /* renamed from: b  reason: collision with root package name */
        private final String f93684b;

        /* renamed from: c  reason: collision with root package name */
        private final Extensions f93685c;

        @p
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 !2\u00020\u0001:\u0002\"\u001bB+\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR(\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/ExpressAddressResponse$ExpressAddressErrorResponse$Extensions;", "", "", "seen0", "", "", "violatedFields", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/ExpressAddressResponse$ExpressAddressErrorResponse$Extensions;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "getViolatedFields$annotations", "()V", "Companion", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Extensions {
            public static final a Companion = new a((DefaultConstructorMarker) null);
            /* access modifiers changed from: private */

            /* renamed from: b  reason: collision with root package name */
            public static final KSerializer<Object>[] f93686b = {new C17451f(Y0.f144077a)};

            /* renamed from: a  reason: collision with root package name */
            private final List<String> f93687a;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/ExpressAddressResponse$ExpressAddressErrorResponse$Extensions$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/ExpressAddressResponse$ExpressAddressErrorResponse$Extensions;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a {
                private a() {
                }

                public final KSerializer<Extensions> serializer() {
                    return ExpressAddressResponse$ExpressAddressErrorResponse$Extensions$$serializer.INSTANCE;
                }

                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ Extensions(int i10, List list, T0 t02) {
                if (1 != (i10 & 1)) {
                    E0.b(i10, 1, ExpressAddressResponse$ExpressAddressErrorResponse$Extensions$$serializer.INSTANCE.getDescriptor());
                }
                this.f93687a = list;
            }

            public final List<String> b() {
                return this.f93687a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Extensions) && C17542s.e(this.f93687a, ((Extensions) obj).f93687a);
            }

            public int hashCode() {
                List<String> list = this.f93687a;
                if (list == null) {
                    return 0;
                }
                return list.hashCode();
            }

            public String toString() {
                List<String> list = this.f93687a;
                return "Extensions(violatedFields=" + list + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/ExpressAddressResponse$ExpressAddressErrorResponse$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/ExpressAddressResponse$ExpressAddressErrorResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<ExpressAddressErrorResponse> serializer() {
                return ExpressAddressResponse$ExpressAddressErrorResponse$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/ExpressAddressResponse$ExpressAddressErrorResponse$b;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "Companion", "a", "EXPRESS_SHIPPING_BILLING_VALIDATION_ERROR", "EXPRESS_SHIPPING_BILLING_TAX_CODE_VALIDATION_ERROR", "STATECODE_MISMATCH", "ZIPCODE_MISMATCH", "VALIDATION_ERROR", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public enum b {
            EXPRESS_SHIPPING_BILLING_VALIDATION_ERROR("EXPRESS_SHIPPING_BILLING_VALIDATION_ERROR"),
            EXPRESS_SHIPPING_BILLING_TAX_CODE_VALIDATION_ERROR("EXPRESS_SHIPPING_BILLING_TAX_CODE_VALIDATION_ERROR"),
            STATECODE_MISMATCH("STATECODE_MISMATCH"),
            ZIPCODE_MISMATCH("ZIPCODE_MISMATCH"),
            VALIDATION_ERROR("VALIDATION_ERROR");
            
            public static final a Companion = null;
            /* access modifiers changed from: private */
            public final String rawValue;

            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/ExpressAddressResponse$ExpressAddressErrorResponse$b$a;", "", "<init>", "()V", "", "rawValue", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/ExpressAddressResponse$ExpressAddressErrorResponse$b;", "a", "(Ljava/lang/String;)Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/ExpressAddressResponse$ExpressAddressErrorResponse$b;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a {
                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final b a(String str) {
                    T t10;
                    Iterator<T> it = b.j().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t10 = null;
                            break;
                        }
                        t10 = it.next();
                        if (C17542s.e(((b) t10).rawValue, str)) {
                            break;
                        }
                    }
                    return (b) t10;
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

            public static C17220a<b> j() {
                return $ENTRIES;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class c {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f93688a;

            /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.ExpressAddressResponse$ExpressAddressErrorResponse$b[] r0 = com.ingka.ikea.checkout.datalayer.impl.repo.network.ExpressAddressResponse.ExpressAddressErrorResponse.b.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.ExpressAddressResponse$ExpressAddressErrorResponse$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.ExpressAddressResponse.ExpressAddressErrorResponse.b.VALIDATION_ERROR     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.ExpressAddressResponse$ExpressAddressErrorResponse$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.ExpressAddressResponse.ExpressAddressErrorResponse.b.EXPRESS_SHIPPING_BILLING_VALIDATION_ERROR     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.ExpressAddressResponse$ExpressAddressErrorResponse$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.ExpressAddressResponse.ExpressAddressErrorResponse.b.ZIPCODE_MISMATCH     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.ExpressAddressResponse$ExpressAddressErrorResponse$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.ExpressAddressResponse.ExpressAddressErrorResponse.b.STATECODE_MISMATCH     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.ExpressAddressResponse$ExpressAddressErrorResponse$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.ExpressAddressResponse.ExpressAddressErrorResponse.b.EXPRESS_SHIPPING_BILLING_TAX_CODE_VALIDATION_ERROR     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    f93688a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.ExpressAddressResponse.ExpressAddressErrorResponse.c.<clinit>():void");
            }
        }

        public /* synthetic */ ExpressAddressErrorResponse(int i10, String str, String str2, Extensions extensions, T0 t02) {
            if (7 != (i10 & 7)) {
                E0.b(i10, 7, ExpressAddressResponse$ExpressAddressErrorResponse$$serializer.INSTANCE.getDescriptor());
            }
            this.f93683a = str;
            this.f93684b = str2;
            this.f93685c = extensions;
        }

        private final t.d.a b(String str) {
            T t10;
            Iterator<T> it = t.d.a.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t10 = null;
                    break;
                }
                t10 = it.next();
                if (C17542s.e(((t.d.a) t10).j(), str)) {
                    break;
                }
            }
            t.d.a aVar = (t.d.a) t10;
            if (aVar != null) {
                return aVar;
            }
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unknown validation error: " + str);
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
                    String name = ExpressAddressErrorResponse.class.getName();
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

        public static final /* synthetic */ void d(ExpressAddressErrorResponse expressAddressErrorResponse, C17395d dVar, SerialDescriptor serialDescriptor) {
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 0, y02, expressAddressErrorResponse.f93683a);
            dVar.B(serialDescriptor, 1, y02, expressAddressErrorResponse.f93684b);
            dVar.B(serialDescriptor, 2, ExpressAddressResponse$ExpressAddressErrorResponse$Extensions$$serializer.INSTANCE, expressAddressErrorResponse.f93685c);
        }

        public final String a() {
            return this.f93683a;
        }

        public t c() {
            List list;
            List<String> b10;
            b a10 = b.Companion.a(this.f93683a);
            int i10 = a10 == null ? -1 : c.f93688a[a10.ordinal()];
            if (i10 == -1) {
                e eVar = e.DEBUG;
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
                        String a11 = C11818a.a("Handle status: " + a() + ", as a generic error", (Throwable) null);
                        if (a11 == null) {
                            break;
                        }
                        str = C11820c.a(a11);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = ExpressAddressErrorResponse.class.getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar.a(eVar, str4, false, (Throwable) null, str3);
                    str = str3;
                    str2 = str4;
                }
                return t.a.f84151a;
            } else if (i10 == 1 || i10 == 2) {
                Extensions extensions = this.f93685c;
                if (extensions == null || (b10 = extensions.b()) == null) {
                    list = C16877v.n();
                } else {
                    list = new ArrayList();
                    for (String b11 : b10) {
                        t.d.a b12 = b(b11);
                        if (b12 != null) {
                            list.add(b12);
                        }
                    }
                }
                return new t.d(list);
            } else if (i10 == 3) {
                return t.e.f84155a;
            } else {
                if (i10 == 4) {
                    return t.b.f84152a;
                }
                if (i10 == 5) {
                    return t.c.f84153a;
                }
                throw new XH.t();
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExpressAddressErrorResponse)) {
                return false;
            }
            ExpressAddressErrorResponse expressAddressErrorResponse = (ExpressAddressErrorResponse) obj;
            return C17542s.e(this.f93683a, expressAddressErrorResponse.f93683a) && C17542s.e(this.f93684b, expressAddressErrorResponse.f93684b) && C17542s.e(this.f93685c, expressAddressErrorResponse.f93685c);
        }

        public int hashCode() {
            String str = this.f93683a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f93684b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Extensions extensions = this.f93685c;
            if (extensions != null) {
                i10 = extensions.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            String str = this.f93683a;
            String str2 = this.f93684b;
            Extensions extensions = this.f93685c;
            return "ExpressAddressErrorResponse(status=" + str + ", message=" + str2 + ", extensions=" + extensions + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/ExpressAddressResponse$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/ExpressAddressResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ExpressAddressResponse> serializer() {
            return ExpressAddressResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ExpressAddressResponse(int i10, PriceResponse priceResponse, PriceResponse priceResponse2, PriceResponse priceResponse3, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, ExpressAddressResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.f93680a = priceResponse;
        this.f93681b = priceResponse2;
        this.f93682c = priceResponse3;
    }

    public static final /* synthetic */ void b(ExpressAddressResponse expressAddressResponse, C17395d dVar, SerialDescriptor serialDescriptor) {
        PriceResponse$$serializer priceResponse$$serializer = PriceResponse$$serializer.INSTANCE;
        dVar.B(serialDescriptor, 0, priceResponse$$serializer, expressAddressResponse.f93680a);
        dVar.B(serialDescriptor, 1, priceResponse$$serializer, expressAddressResponse.f93681b);
        dVar.B(serialDescriptor, 2, priceResponse$$serializer, expressAddressResponse.f93682c);
    }

    public C10806i a() {
        PriceResponse priceResponse = this.f93681b;
        if (priceResponse == null || this.f93680a == null) {
            throw new IllegalArgumentException("Missing required data: " + this);
        }
        Double d10 = priceResponse.d();
        Double c10 = this.f93681b.c();
        Double g10 = this.f93681b.g();
        List<PriceResponse.CheckoutTaxSummary> h10 = this.f93681b.h();
        PriceResponse.DiscountSummaryResponse b10 = this.f93681b.b();
        List<PriceResponse.OrderDiscountSummary> e10 = this.f93681b.e();
        PriceResponse.PriceExclSavings f10 = this.f93680a.f();
        PriceResponse priceResponse2 = this.f93682c;
        return d.P(d10, c10, g10, h10, b10, e10, f10, priceResponse2 != null ? priceResponse2.f() : null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExpressAddressResponse)) {
            return false;
        }
        ExpressAddressResponse expressAddressResponse = (ExpressAddressResponse) obj;
        return C17542s.e(this.f93680a, expressAddressResponse.f93680a) && C17542s.e(this.f93681b, expressAddressResponse.f93681b) && C17542s.e(this.f93682c, expressAddressResponse.f93682c);
    }

    public int hashCode() {
        PriceResponse priceResponse = this.f93680a;
        int i10 = 0;
        int hashCode = (priceResponse == null ? 0 : priceResponse.hashCode()) * 31;
        PriceResponse priceResponse2 = this.f93681b;
        int hashCode2 = (hashCode + (priceResponse2 == null ? 0 : priceResponse2.hashCode())) * 31;
        PriceResponse priceResponse3 = this.f93682c;
        if (priceResponse3 != null) {
            i10 = priceResponse3.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        PriceResponse priceResponse = this.f93680a;
        PriceResponse priceResponse2 = this.f93681b;
        PriceResponse priceResponse3 = this.f93682c;
        return "ExpressAddressResponse(goodsTotal=" + priceResponse + ", orderTotal=" + priceResponse2 + ", shippingPrice=" + priceResponse3 + ")";
    }
}
