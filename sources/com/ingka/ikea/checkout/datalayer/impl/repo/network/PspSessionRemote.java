package com.ingka.ikea.checkout.datalayer.impl.repo.network;

import Nn.C10802e;
import Nn.E;
import Sn.d;
import XH.t;
import fI.C17220a;
import fI.C17221b;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\b\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u00152\u0017BM\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u001aR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\"\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010\u001aR\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u0010\"\u0012\u0004\b*\u0010%\u001a\u0004\b)\u0010\u001aR\"\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010\"\u0012\u0004\b-\u0010%\u001a\u0004\b,\u0010\u001aR\"\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b.\u0010\"\u0012\u0004\b0\u0010%\u001a\u0004\b/\u0010\u001a¨\u00063"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PspSessionRemote;", "Lpp/b;", "LSn/d;", "", "seen0", "", "psp", "apiUrl", "sessionIdentifier", "iopgId", "gatewayMerchantId", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PspSessionRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()LSn/d;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPsp", "getPsp$annotations", "()V", "getApiUrl", "getApiUrl$annotations", "c", "getSessionIdentifier", "getSessionIdentifier$annotations", "d", "getIopgId", "getIopgId$annotations", "e", "getGatewayMerchantId", "getGatewayMerchantId$annotations", "Companion", "$serializer", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PspSessionRemote implements C11768b<d> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f93730a;

    /* renamed from: b  reason: collision with root package name */
    private final String f93731b;

    /* renamed from: c  reason: collision with root package name */
    private final String f93732c;

    /* renamed from: d  reason: collision with root package name */
    private final String f93733d;

    /* renamed from: e  reason: collision with root package name */
    private final String f93734e;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PspSessionRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PspSessionRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<PspSessionRemote> serializer() {
            return PspSessionRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PspSessionRemote$b;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "Companion", "a", "ACI", "WORLDLINE", "ALFABANK", "SWISH", "PING", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private enum b {
        ACI("ACI"),
        WORLDLINE("WORLDLINE"),
        ALFABANK("ALFABANK"),
        SWISH("SWISH"),
        PING("PING");
        
        public static final a Companion = null;
        private final String rawValue;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PspSessionRemote$b$a;", "", "<init>", "()V", "", "rawValue", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PspSessionRemote$b;", "a", "(Ljava/lang/String;)Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PspSessionRemote$b;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
        public static final /* synthetic */ int[] f93735a;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.ingka.ikea.checkout.datalayer.impl.repo.network.PspSessionRemote$b[] r0 = com.ingka.ikea.checkout.datalayer.impl.repo.network.PspSessionRemote.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ingka.ikea.checkout.datalayer.impl.repo.network.PspSessionRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.PspSessionRemote.b.ACI     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.ingka.ikea.checkout.datalayer.impl.repo.network.PspSessionRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.PspSessionRemote.b.WORLDLINE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.ingka.ikea.checkout.datalayer.impl.repo.network.PspSessionRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.PspSessionRemote.b.ALFABANK     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.ingka.ikea.checkout.datalayer.impl.repo.network.PspSessionRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.PspSessionRemote.b.SWISH     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.ingka.ikea.checkout.datalayer.impl.repo.network.PspSessionRemote$b r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.PspSessionRemote.b.PING     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f93735a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.PspSessionRemote.c.<clinit>():void");
        }
    }

    public /* synthetic */ PspSessionRemote(int i10, String str, String str2, String str3, String str4, String str5, T0 t02) {
        if (31 != (i10 & 31)) {
            E0.b(i10, 31, PspSessionRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f93730a = str;
        this.f93731b = str2;
        this.f93732c = str3;
        this.f93733d = str4;
        this.f93734e = str5;
    }

    public static final /* synthetic */ void b(PspSessionRemote pspSessionRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, pspSessionRemote.f93730a);
        dVar.B(serialDescriptor, 1, y02, pspSessionRemote.f93731b);
        dVar.B(serialDescriptor, 2, y02, pspSessionRemote.f93732c);
        dVar.B(serialDescriptor, 3, y02, pspSessionRemote.f93733d);
        dVar.B(serialDescriptor, 4, y02, pspSessionRemote.f93734e);
    }

    public d a() {
        E e10;
        b a10 = b.Companion.a(this.f93730a);
        int i10 = a10 == null ? -1 : c.f93735a[a10.ordinal()];
        if (i10 != -1) {
            if (i10 == 1) {
                e10 = E.ACI;
            } else if (i10 == 2) {
                e10 = E.WORLDLINE;
            } else if (i10 == 3) {
                e10 = E.ALFABANK;
            } else if (i10 == 4) {
                e10 = E.SWISH;
            } else if (i10 != 5) {
                throw new t();
            }
            E e11 = e10;
            String str = this.f93731b;
            if (str != null) {
                String str2 = this.f93732c;
                if (str2 != null) {
                    String str3 = this.f93733d;
                    if (str3 != null) {
                        return new d(e11, str, str2, str3, this.f93734e);
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        String str4 = this.f93730a;
        throw new C10802e.c.b("Unknown PSP: " + str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PspSessionRemote)) {
            return false;
        }
        PspSessionRemote pspSessionRemote = (PspSessionRemote) obj;
        return C17542s.e(this.f93730a, pspSessionRemote.f93730a) && C17542s.e(this.f93731b, pspSessionRemote.f93731b) && C17542s.e(this.f93732c, pspSessionRemote.f93732c) && C17542s.e(this.f93733d, pspSessionRemote.f93733d) && C17542s.e(this.f93734e, pspSessionRemote.f93734e);
    }

    public int hashCode() {
        String str = this.f93730a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f93731b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f93732c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f93733d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f93734e;
        if (str5 != null) {
            i10 = str5.hashCode();
        }
        return hashCode4 + i10;
    }

    public String toString() {
        String str = this.f93730a;
        String str2 = this.f93731b;
        String str3 = this.f93732c;
        String str4 = this.f93733d;
        String str5 = this.f93734e;
        return "PspSessionRemote(psp=" + str + ", apiUrl=" + str2 + ", sessionIdentifier=" + str3 + ", iopgId=" + str4 + ", gatewayMerchantId=" + str5 + ")";
    }
}
