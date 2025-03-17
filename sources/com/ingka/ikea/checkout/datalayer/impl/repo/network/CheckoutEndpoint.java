package com.ingka.ikea.checkout.datalayer.impl.repo.network;

import HJ.C15854t;
import Nn.C10802e;
import Nn.S;
import QL.x;
import VL.C16699a;
import VL.o;
import VL.s;
import XH.C16796C;
import XH.C16807N;
import XH.t;
import XH.v;
import YH.C16877v;
import YH.X;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import fI.C17220a;
import fI.C17221b;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
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
import tI.C17978n;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b`\u0018\u00002\u00020\u0001:\u0006\u000f\u0010\u0011\u0012\u0013\u0014J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0001\u0010\u0005\u001a\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint;", "", "", "checkoutId", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$PutShippingBillingBody;", "data", "LQL/x;", "LXH/N;", "a", "(Ljava/lang/String;Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$PutShippingBillingBody;LdI/e;)Ljava/lang/Object;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$UpsertAddressBody;", "", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$UpsertAddressRemoteModel;", "b", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$UpsertAddressBody;LdI/e;)Ljava/lang/Object;", "UpsertAddressBody", "PutShippingBillingBody", "KeyValuePair", "UpsertAddressRemoteModel", "PutShippingBillingErrorRemote", "CheckoutUserDetailsErrorRemote", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface CheckoutEndpoint {

    @p
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003#-!B?\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0019R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u0010\"\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010\u0019R(\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010(\u0012\u0004\b+\u0010%\u001a\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$CheckoutUserDetailsErrorRemote;", "Lpp/b;", "LNn/e$b;", "", "seen0", "", "errorCode", "message", "", "violatedFields", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$CheckoutUserDetailsErrorRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "c", "()LNn/e$b;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getErrorCode$annotations", "()V", "getMessage", "getMessage$annotations", "Ljava/util/List;", "getViolatedFields", "()Ljava/util/List;", "getViolatedFields$annotations", "Companion", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CheckoutUserDetailsErrorRemote implements C11768b<C10802e.b> {
        public static final a Companion = new a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public static final KSerializer<Object>[] f93660d = {null, null, new C17451f(Y0.f144077a)};

        /* renamed from: a  reason: collision with root package name */
        private final String f93661a;

        /* renamed from: b  reason: collision with root package name */
        private final String f93662b;

        /* renamed from: c  reason: collision with root package name */
        private final List<String> f93663c;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$CheckoutUserDetailsErrorRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$CheckoutUserDetailsErrorRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<CheckoutUserDetailsErrorRemote> serializer() {
                return CheckoutEndpoint$CheckoutUserDetailsErrorRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$CheckoutUserDetailsErrorRemote$b;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "Companion", "a", "SHIPPING_BILLING_VALIDATION_ERROR", "CHECKOUT_EXPIRED", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public enum b {
            SHIPPING_BILLING_VALIDATION_ERROR("InvalidShippingBilling"),
            CHECKOUT_EXPIRED("CHECKOUT_EXPIRED");
            
            public static final a Companion = null;
            /* access modifiers changed from: private */
            public final String rawValue;

            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$CheckoutUserDetailsErrorRemote$b$a;", "", "<init>", "()V", "", "rawValue", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$CheckoutUserDetailsErrorRemote$b;", "a", "(Ljava/lang/String;)Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$CheckoutUserDetailsErrorRemote$b;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
            public static final /* synthetic */ int[] f93664a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.CheckoutEndpoint$CheckoutUserDetailsErrorRemote$b[] r0 = com.ingka.ikea.checkout.datalayer.impl.repo.network.CheckoutEndpoint.CheckoutUserDetailsErrorRemote.b.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.CheckoutEndpoint$CheckoutUserDetailsErrorRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.CheckoutEndpoint.CheckoutUserDetailsErrorRemote.b.SHIPPING_BILLING_VALIDATION_ERROR     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.CheckoutEndpoint$CheckoutUserDetailsErrorRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.CheckoutEndpoint.CheckoutUserDetailsErrorRemote.b.CHECKOUT_EXPIRED     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f93664a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.CheckoutEndpoint.CheckoutUserDetailsErrorRemote.c.<clinit>():void");
            }
        }

        public /* synthetic */ CheckoutUserDetailsErrorRemote(int i10, String str, String str2, List list, T0 t02) {
            if (7 != (i10 & 7)) {
                E0.b(i10, 7, CheckoutEndpoint$CheckoutUserDetailsErrorRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f93661a = str;
            this.f93662b = str2;
            this.f93663c = list;
        }

        public static final /* synthetic */ void d(CheckoutUserDetailsErrorRemote checkoutUserDetailsErrorRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = f93660d;
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 0, y02, checkoutUserDetailsErrorRemote.f93661a);
            dVar.B(serialDescriptor, 1, y02, checkoutUserDetailsErrorRemote.f93662b);
            dVar.B(serialDescriptor, 2, kSerializerArr[2], checkoutUserDetailsErrorRemote.f93663c);
        }

        public final String b() {
            return this.f93661a;
        }

        public C10802e.b c() {
            b a10 = b.Companion.a(this.f93661a);
            int i10 = a10 == null ? -1 : c.f93664a[a10.ordinal()];
            if (i10 == -1) {
                e eVar = e.WARN;
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
                        String a11 = C11818a.a("Unhandled errorCode: " + b(), (Throwable) null);
                        if (a11 == null) {
                            break;
                        }
                        str = C11820c.a(a11);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = CheckoutUserDetailsErrorRemote.class.getName();
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
                return C10802e.b.C1701b.f84042a;
            } else if (i10 == 1) {
                List<String> list = this.f93663c;
                if (list == null) {
                    list = C16877v.n();
                }
                return new C10802e.b.c(list);
            } else if (i10 == 2) {
                return C10802e.b.a.f84041a;
            } else {
                throw new t();
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CheckoutUserDetailsErrorRemote)) {
                return false;
            }
            CheckoutUserDetailsErrorRemote checkoutUserDetailsErrorRemote = (CheckoutUserDetailsErrorRemote) obj;
            return C17542s.e(this.f93661a, checkoutUserDetailsErrorRemote.f93661a) && C17542s.e(this.f93662b, checkoutUserDetailsErrorRemote.f93662b) && C17542s.e(this.f93663c, checkoutUserDetailsErrorRemote.f93663c);
        }

        public int hashCode() {
            String str = this.f93661a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f93662b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<String> list = this.f93663c;
            if (list != null) {
                i10 = list.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            String str = this.f93661a;
            String str2 = this.f93662b;
            List<String> list = this.f93663c;
            return "CheckoutUserDetailsErrorRemote(errorCode=" + str + ", message=" + str2 + ", violatedFields=" + list + ")";
        }
    }

    @p
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 \"2\u00020\u0001:\u0002#\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u0015R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010\u001d\u0012\u0004\b!\u0010\u001f\u001a\u0004\b \u0010\u0015¨\u0006$"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$KeyValuePair;", "", "", "key", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$KeyValuePair;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getKey$annotations", "()V", "b", "getValue$annotations", "Companion", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class KeyValuePair {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f93665a;

        /* renamed from: b  reason: collision with root package name */
        private final String f93666b;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$KeyValuePair$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$KeyValuePair;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<KeyValuePair> serializer() {
                return CheckoutEndpoint$KeyValuePair$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ KeyValuePair(int i10, String str, String str2, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, CheckoutEndpoint$KeyValuePair$$serializer.INSTANCE.getDescriptor());
            }
            this.f93665a = str;
            this.f93666b = str2;
        }

        public static final /* synthetic */ void c(KeyValuePair keyValuePair, C17395d dVar, SerialDescriptor serialDescriptor) {
            dVar.y(serialDescriptor, 0, keyValuePair.f93665a);
            dVar.y(serialDescriptor, 1, keyValuePair.f93666b);
        }

        public final String a() {
            return this.f93665a;
        }

        public final String b() {
            return this.f93666b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof KeyValuePair)) {
                return false;
            }
            KeyValuePair keyValuePair = (KeyValuePair) obj;
            return C17542s.e(this.f93665a, keyValuePair.f93665a) && C17542s.e(this.f93666b, keyValuePair.f93666b);
        }

        public int hashCode() {
            return (this.f93665a.hashCode() * 31) + this.f93666b.hashCode();
        }

        public String toString() {
            String str = this.f93665a;
            String str2 = this.f93666b;
            return "KeyValuePair(key=" + str + ", value=" + str2 + ")";
        }

        public KeyValuePair(String str, String str2) {
            C17542s.j(str, "key");
            C17542s.j(str2, "value");
            this.f93665a = str;
            this.f93666b = str2;
        }
    }

    @p
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 #2\u00020\u0001:\u0002$\u001dB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$PutShippingBillingBody;", "", "", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$KeyValuePair;", "fields", "<init>", "(Ljava/util/List;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$PutShippingBillingBody;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getFields", "()Ljava/util/List;", "getFields$annotations", "()V", "Companion", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PutShippingBillingBody {
        public static final a Companion = new a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public static final KSerializer<Object>[] f93667b = {new C17451f(CheckoutEndpoint$KeyValuePair$$serializer.INSTANCE)};

        /* renamed from: a  reason: collision with root package name */
        private final List<KeyValuePair> f93668a;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$PutShippingBillingBody$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$PutShippingBillingBody;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<PutShippingBillingBody> serializer() {
                return CheckoutEndpoint$PutShippingBillingBody$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ PutShippingBillingBody(int i10, List list, T0 t02) {
            if (1 != (i10 & 1)) {
                E0.b(i10, 1, CheckoutEndpoint$PutShippingBillingBody$$serializer.INSTANCE.getDescriptor());
            }
            this.f93668a = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PutShippingBillingBody) && C17542s.e(this.f93668a, ((PutShippingBillingBody) obj).f93668a);
        }

        public int hashCode() {
            return this.f93668a.hashCode();
        }

        public String toString() {
            List<KeyValuePair> list = this.f93668a;
            return "PutShippingBillingBody(fields=" + list + ")";
        }

        public PutShippingBillingBody(List<KeyValuePair> list) {
            C17542s.j(list, "fields");
            this.f93668a = list;
        }
    }

    @p
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002%\u0013B%\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!¨\u0006&"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$PutShippingBillingErrorRemote;", "Lpp/b;", "LNn/e$b;", "", "seen0", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$CheckoutUserDetailsErrorRemote;", "validationError", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$CheckoutUserDetailsErrorRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$PutShippingBillingErrorRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()LNn/e$b;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$CheckoutUserDetailsErrorRemote;", "getValidationError", "()Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$CheckoutUserDetailsErrorRemote;", "getValidationError$annotations", "()V", "Companion", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PutShippingBillingErrorRemote implements C11768b<C10802e.b> {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final CheckoutUserDetailsErrorRemote f93669a;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$PutShippingBillingErrorRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$PutShippingBillingErrorRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<PutShippingBillingErrorRemote> serializer() {
                return CheckoutEndpoint$PutShippingBillingErrorRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ PutShippingBillingErrorRemote(int i10, CheckoutUserDetailsErrorRemote checkoutUserDetailsErrorRemote, T0 t02) {
            if (1 != (i10 & 1)) {
                E0.b(i10, 1, CheckoutEndpoint$PutShippingBillingErrorRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f93669a = checkoutUserDetailsErrorRemote;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r0 = r0.c();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Nn.C10802e.b a() {
            /*
                r1 = this;
                com.ingka.ikea.checkout.datalayer.impl.repo.network.CheckoutEndpoint$CheckoutUserDetailsErrorRemote r0 = r1.f93669a
                if (r0 == 0) goto L_0x000a
                Nn.e$b r0 = r0.c()
                if (r0 != 0) goto L_0x000c
            L_0x000a:
                Nn.e$b$b r0 = Nn.C10802e.b.C1701b.f84042a
            L_0x000c:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.CheckoutEndpoint.PutShippingBillingErrorRemote.a():Nn.e$b");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PutShippingBillingErrorRemote) && C17542s.e(this.f93669a, ((PutShippingBillingErrorRemote) obj).f93669a);
        }

        public int hashCode() {
            CheckoutUserDetailsErrorRemote checkoutUserDetailsErrorRemote = this.f93669a;
            if (checkoutUserDetailsErrorRemote == null) {
                return 0;
            }
            return checkoutUserDetailsErrorRemote.hashCode();
        }

        public String toString() {
            CheckoutUserDetailsErrorRemote checkoutUserDetailsErrorRemote = this.f93669a;
            return "PutShippingBillingErrorRemote(validationError=" + checkoutUserDetailsErrorRemote + ")";
        }
    }

    @p
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 #2\u00020\u0001:\u0002$\u001dB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$UpsertAddressBody;", "", "", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$KeyValuePair;", "fields", "<init>", "(Ljava/util/List;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$UpsertAddressBody;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getFields", "()Ljava/util/List;", "getFields$annotations", "()V", "Companion", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UpsertAddressBody {
        public static final a Companion = new a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public static final KSerializer<Object>[] f93670b = {new C17451f(CheckoutEndpoint$KeyValuePair$$serializer.INSTANCE)};

        /* renamed from: a  reason: collision with root package name */
        private final List<KeyValuePair> f93671a;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$UpsertAddressBody$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$UpsertAddressBody;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<UpsertAddressBody> serializer() {
                return CheckoutEndpoint$UpsertAddressBody$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ UpsertAddressBody(int i10, List list, T0 t02) {
            if (1 != (i10 & 1)) {
                E0.b(i10, 1, CheckoutEndpoint$UpsertAddressBody$$serializer.INSTANCE.getDescriptor());
            }
            this.f93671a = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpsertAddressBody) && C17542s.e(this.f93671a, ((UpsertAddressBody) obj).f93671a);
        }

        public int hashCode() {
            return this.f93671a.hashCode();
        }

        public String toString() {
            List<KeyValuePair> list = this.f93671a;
            return "UpsertAddressBody(fields=" + list + ")";
        }

        public UpsertAddressBody(List<KeyValuePair> list) {
            C17542s.j(list, "fields");
            this.f93671a = list;
        }
    }

    @p
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\b\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u001956$BI\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u001cR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u001cR(\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010+\u0012\u0004\b.\u0010(\u001a\u0004\b,\u0010-R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b3\u0010(\u001a\u0004\b1\u00102¨\u00067"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$UpsertAddressRemoteModel;", "Lpp/b;", "LNn/S;", "", "seen0", "", "upsertAction", "addressId", "", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$KeyValuePair;", "profileInput", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$UpsertAddressRemoteModel$PresentationRemote;", "presentation", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$UpsertAddressRemoteModel$PresentationRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$UpsertAddressRemoteModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()LNn/S;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getUpsertAction", "getUpsertAction$annotations", "()V", "getAddressId", "getAddressId$annotations", "Ljava/util/List;", "getProfileInput", "()Ljava/util/List;", "getProfileInput$annotations", "d", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$UpsertAddressRemoteModel$PresentationRemote;", "getPresentation", "()Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$UpsertAddressRemoteModel$PresentationRemote;", "getPresentation$annotations", "Companion", "PresentationRemote", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UpsertAddressRemoteModel implements C11768b<S> {
        public static final a Companion = new a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public static final KSerializer<Object>[] f93672e = {null, null, new C17451f(CheckoutEndpoint$KeyValuePair$$serializer.INSTANCE), null};

        /* renamed from: a  reason: collision with root package name */
        private final String f93673a;

        /* renamed from: b  reason: collision with root package name */
        private final String f93674b;

        /* renamed from: c  reason: collision with root package name */
        private final List<KeyValuePair> f93675c;

        /* renamed from: d  reason: collision with root package name */
        private final PresentationRemote f93676d;

        @p
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 !2\u00020\u0001:\u0002\"\u001bB+\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR(\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$UpsertAddressRemoteModel$PresentationRemote;", "", "", "seen0", "", "", "lines", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$UpsertAddressRemoteModel$PresentationRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "getLines$annotations", "()V", "Companion", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class PresentationRemote {
            public static final a Companion = new a((DefaultConstructorMarker) null);
            /* access modifiers changed from: private */

            /* renamed from: b  reason: collision with root package name */
            public static final KSerializer<Object>[] f93677b = {new C17451f(Y0.f144077a)};

            /* renamed from: a  reason: collision with root package name */
            private final List<String> f93678a;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$UpsertAddressRemoteModel$PresentationRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$UpsertAddressRemoteModel$PresentationRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a {
                private a() {
                }

                public final KSerializer<PresentationRemote> serializer() {
                    return CheckoutEndpoint$UpsertAddressRemoteModel$PresentationRemote$$serializer.INSTANCE;
                }

                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ PresentationRemote(int i10, List list, T0 t02) {
                if (1 != (i10 & 1)) {
                    E0.b(i10, 1, CheckoutEndpoint$UpsertAddressRemoteModel$PresentationRemote$$serializer.INSTANCE.getDescriptor());
                }
                this.f93678a = list;
            }

            public final List<String> b() {
                return this.f93678a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PresentationRemote) && C17542s.e(this.f93678a, ((PresentationRemote) obj).f93678a);
            }

            public int hashCode() {
                List<String> list = this.f93678a;
                if (list == null) {
                    return 0;
                }
                return list.hashCode();
            }

            public String toString() {
                List<String> list = this.f93678a;
                return "PresentationRemote(lines=" + list + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$UpsertAddressRemoteModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$UpsertAddressRemoteModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<UpsertAddressRemoteModel> serializer() {
                return CheckoutEndpoint$UpsertAddressRemoteModel$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$UpsertAddressRemoteModel$b;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "Companion", "a", "CREATE", "UPDATE", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private enum b {
            CREATE("CREATE"),
            UPDATE("UPDATE");
            
            public static final a Companion = null;
            private final String rawValue;

            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$UpsertAddressRemoteModel$b$a;", "", "<init>", "()V", "", "rawValue", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$UpsertAddressRemoteModel$b;", "a", "(Ljava/lang/String;)Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint$UpsertAddressRemoteModel$b;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
                        if (C17542s.e(((b) t10).j(), str)) {
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
            public static final /* synthetic */ int[] f93679a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.CheckoutEndpoint$UpsertAddressRemoteModel$b[] r0 = com.ingka.ikea.checkout.datalayer.impl.repo.network.CheckoutEndpoint.UpsertAddressRemoteModel.b.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.CheckoutEndpoint$UpsertAddressRemoteModel$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.CheckoutEndpoint.UpsertAddressRemoteModel.b.UPDATE     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    com.ingka.ikea.checkout.datalayer.impl.repo.network.CheckoutEndpoint$UpsertAddressRemoteModel$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.CheckoutEndpoint.UpsertAddressRemoteModel.b.CREATE     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f93679a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.CheckoutEndpoint.UpsertAddressRemoteModel.c.<clinit>():void");
            }
        }

        public /* synthetic */ UpsertAddressRemoteModel(int i10, String str, String str2, List list, PresentationRemote presentationRemote, T0 t02) {
            if (15 != (i10 & 15)) {
                E0.b(i10, 15, CheckoutEndpoint$UpsertAddressRemoteModel$$serializer.INSTANCE.getDescriptor());
            }
            this.f93673a = str;
            this.f93674b = str2;
            this.f93675c = list;
            this.f93676d = presentationRemote;
        }

        public static final /* synthetic */ void c(UpsertAddressRemoteModel upsertAddressRemoteModel, C17395d dVar, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = f93672e;
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 0, y02, upsertAddressRemoteModel.f93673a);
            dVar.B(serialDescriptor, 1, y02, upsertAddressRemoteModel.f93674b);
            dVar.B(serialDescriptor, 2, kSerializerArr[2], upsertAddressRemoteModel.f93675c);
            dVar.B(serialDescriptor, 3, CheckoutEndpoint$UpsertAddressRemoteModel$PresentationRemote$$serializer.INSTANCE, upsertAddressRemoteModel.f93676d);
        }

        public S b() {
            PresentationRemote presentationRemote = this.f93676d;
            LinkedHashMap linkedHashMap = null;
            List<String> b10 = presentationRemote != null ? presentationRemote.b() : null;
            List<KeyValuePair> list = this.f93675c;
            if (list != null) {
                Iterable<KeyValuePair> iterable = list;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(C17978n.e(X.e(C16877v.y(iterable, 10)), 16));
                for (KeyValuePair keyValuePair : iterable) {
                    v a10 = C16796C.a(keyValuePair.a(), keyValuePair.b());
                    linkedHashMap2.put(a10.c(), a10.d());
                }
                linkedHashMap = linkedHashMap2;
            }
            Collection collection = b10;
            if (collection == null || collection.isEmpty()) {
                throw new IllegalArgumentException("presentation lines missing");
            } else if (linkedHashMap == null || linkedHashMap.isEmpty()) {
                throw new IllegalArgumentException("profileInput is null or empty");
            } else {
                b a11 = b.Companion.a(this.f93673a);
                int i10 = a11 == null ? -1 : c.f93679a[a11.ordinal()];
                if (i10 == 1) {
                    String str = this.f93674b;
                    if (str != null) {
                        return new S.b(b10, linkedHashMap, str);
                    }
                    throw new IllegalArgumentException("Required value was null.");
                } else if (i10 == 2) {
                    return new S.a(b10, linkedHashMap);
                } else {
                    String str2 = this.f93673a;
                    throw new IllegalArgumentException("Unknown upsertAction: " + str2);
                }
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpsertAddressRemoteModel)) {
                return false;
            }
            UpsertAddressRemoteModel upsertAddressRemoteModel = (UpsertAddressRemoteModel) obj;
            return C17542s.e(this.f93673a, upsertAddressRemoteModel.f93673a) && C17542s.e(this.f93674b, upsertAddressRemoteModel.f93674b) && C17542s.e(this.f93675c, upsertAddressRemoteModel.f93675c) && C17542s.e(this.f93676d, upsertAddressRemoteModel.f93676d);
        }

        public int hashCode() {
            String str = this.f93673a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f93674b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<KeyValuePair> list = this.f93675c;
            int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            PresentationRemote presentationRemote = this.f93676d;
            if (presentationRemote != null) {
                i10 = presentationRemote.hashCode();
            }
            return hashCode3 + i10;
        }

        public String toString() {
            String str = this.f93673a;
            String str2 = this.f93674b;
            List<KeyValuePair> list = this.f93675c;
            PresentationRemote presentationRemote = this.f93676d;
            return "UpsertAddressRemoteModel(upsertAction=" + str + ", addressId=" + str2 + ", profileInput=" + list + ", presentation=" + presentationRemote + ")";
        }
    }

    @VL.p("checkout/v6/{cc}/{lc}/{checkoutId}/address")
    Object a(@s("checkoutId") String str, @C16699a PutShippingBillingBody putShippingBillingBody, C17164e<? super x<C16807N>> eVar);

    @o("checkout/v6/{cc}/{lc}/upsert-address")
    Object b(@C16699a UpsertAddressBody upsertAddressBody, C17164e<? super List<UpsertAddressRemoteModel>> eVar);
}
