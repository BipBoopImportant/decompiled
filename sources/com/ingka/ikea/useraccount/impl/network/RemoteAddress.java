package com.ingka.ikea.useraccount.impl.network;

import HJ.C15854t;
import com.ingka.ikea.useraccount.model.Address;
import fI.C17221b;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.J;
import jK.T0;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b+\b\b\u0018\u0000 H2\u00020\u0001:\u0003\u001dI)B\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u001f2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010#R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010.\u0012\u0004\b1\u0010-\u001a\u0004\b/\u00100R\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010*\u0012\u0004\b3\u0010-\u001a\u0004\b2\u0010#R\"\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010*\u0012\u0004\b5\u0010-\u001a\u0004\b4\u0010#R\"\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b6\u0010*\u0012\u0004\b8\u0010-\u001a\u0004\b7\u0010#R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b9\u0010*\u0012\u0004\b;\u0010-\u001a\u0004\b:\u0010#R\"\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b<\u0010*\u0012\u0004\b>\u0010-\u001a\u0004\b=\u0010#R\"\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b?\u0010*\u0012\u0004\bA\u0010-\u001a\u0004\b@\u0010#R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\bB\u0010*\u0012\u0004\bD\u0010-\u001a\u0004\bC\u0010#R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\bE\u0010*\u0012\u0004\bG\u0010-\u001a\u0004\bF\u0010#¨\u0006J"}, d2 = {"Lcom/ingka/ikea/useraccount/impl/network/RemoteAddress;", "", "", "seen0", "", "id", "Lcom/ingka/ikea/useraccount/impl/network/RemoteAddress$b;", "type", "address", "address2", "address3", "postalCode", "city", "countryCode", "firstName", "lastName", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lcom/ingka/ikea/useraccount/impl/network/RemoteAddress$b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/useraccount/impl/network/RemoteAddress;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/ingka/ikea/useraccount/model/Address;", "b", "()Lcom/ingka/ikea/useraccount/model/Address;", "", "c", "()Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "Lcom/ingka/ikea/useraccount/impl/network/RemoteAddress$b;", "getType", "()Lcom/ingka/ikea/useraccount/impl/network/RemoteAddress$b;", "getType$annotations", "getAddress", "getAddress$annotations", "getAddress2", "getAddress2$annotations", "e", "getAddress3", "getAddress3$annotations", "f", "getPostalCode", "getPostalCode$annotations", "g", "getCity", "getCity$annotations", "h", "getCountryCode", "getCountryCode$annotations", "i", "getFirstName", "getFirstName$annotations", "j", "getLastName", "getLastName$annotations", "Companion", "$serializer", "useraccount-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RemoteAddress {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final KSerializer<Object>[] f120607k = {null, J.b("com.ingka.ikea.useraccount.impl.network.RemoteAddress.Type", b.values()), null, null, null, null, null, null, null, null};

    /* renamed from: a  reason: collision with root package name */
    private final String f120608a;

    /* renamed from: b  reason: collision with root package name */
    private final b f120609b;

    /* renamed from: c  reason: collision with root package name */
    private final String f120610c;

    /* renamed from: d  reason: collision with root package name */
    private final String f120611d;

    /* renamed from: e  reason: collision with root package name */
    private final String f120612e;

    /* renamed from: f  reason: collision with root package name */
    private final String f120613f;

    /* renamed from: g  reason: collision with root package name */
    private final String f120614g;

    /* renamed from: h  reason: collision with root package name */
    private final String f120615h;

    /* renamed from: i  reason: collision with root package name */
    private final String f120616i;

    /* renamed from: j  reason: collision with root package name */
    private final String f120617j;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/useraccount/impl/network/RemoteAddress$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/useraccount/impl/network/RemoteAddress;", "serializer", "()Lkotlinx/serialization/KSerializer;", "useraccount-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<RemoteAddress> serializer() {
            return RemoteAddress$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ingka/ikea/useraccount/impl/network/RemoteAddress$b;", "", "<init>", "(Ljava/lang/String;I)V", "INVOICE_DEST", "DELIVERY_DEST", "useraccount-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum b {
        INVOICE_DEST,
        DELIVERY_DEST;

        static {
            b[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    public /* synthetic */ RemoteAddress(int i10, String str, b bVar, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, T0 t02) {
        if (1023 != (i10 & 1023)) {
            E0.b(i10, 1023, RemoteAddress$$serializer.INSTANCE.getDescriptor());
        }
        this.f120608a = str;
        this.f120609b = bVar;
        this.f120610c = str2;
        this.f120611d = str3;
        this.f120612e = str4;
        this.f120613f = str5;
        this.f120614g = str6;
        this.f120615h = str7;
        this.f120616i = str8;
        this.f120617j = str9;
    }

    public static final /* synthetic */ void d(RemoteAddress remoteAddress, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f120607k;
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, remoteAddress.f120608a);
        dVar.B(serialDescriptor, 1, kSerializerArr[1], remoteAddress.f120609b);
        dVar.B(serialDescriptor, 2, y02, remoteAddress.f120610c);
        dVar.B(serialDescriptor, 3, y02, remoteAddress.f120611d);
        dVar.B(serialDescriptor, 4, y02, remoteAddress.f120612e);
        dVar.B(serialDescriptor, 5, y02, remoteAddress.f120613f);
        dVar.B(serialDescriptor, 6, y02, remoteAddress.f120614g);
        dVar.B(serialDescriptor, 7, y02, remoteAddress.f120615h);
        dVar.B(serialDescriptor, 8, y02, remoteAddress.f120616i);
        dVar.B(serialDescriptor, 9, y02, remoteAddress.f120617j);
    }

    public final Address b() {
        if (c()) {
            String str = this.f120608a;
            C17542s.g(str);
            return new Address(str, Address.Type.valueOf(String.valueOf(this.f120609b)), this.f120610c, this.f120611d, this.f120612e, this.f120613f, this.f120614g, this.f120615h, this.f120616i, this.f120617j);
        }
        throw new IllegalArgumentException("Could not create new profile object.");
    }

    public final boolean c() {
        String str = this.f120608a;
        return (str == null || C15854t.v0(str) || this.f120609b == null) ? false : true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoteAddress)) {
            return false;
        }
        RemoteAddress remoteAddress = (RemoteAddress) obj;
        return C17542s.e(this.f120608a, remoteAddress.f120608a) && this.f120609b == remoteAddress.f120609b && C17542s.e(this.f120610c, remoteAddress.f120610c) && C17542s.e(this.f120611d, remoteAddress.f120611d) && C17542s.e(this.f120612e, remoteAddress.f120612e) && C17542s.e(this.f120613f, remoteAddress.f120613f) && C17542s.e(this.f120614g, remoteAddress.f120614g) && C17542s.e(this.f120615h, remoteAddress.f120615h) && C17542s.e(this.f120616i, remoteAddress.f120616i) && C17542s.e(this.f120617j, remoteAddress.f120617j);
    }

    public int hashCode() {
        String str = this.f120608a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        b bVar = this.f120609b;
        int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str2 = this.f120610c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f120611d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f120612e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f120613f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f120614g;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f120615h;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f120616i;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f120617j;
        if (str9 != null) {
            i10 = str9.hashCode();
        }
        return hashCode9 + i10;
    }

    public String toString() {
        String str = this.f120608a;
        b bVar = this.f120609b;
        String str2 = this.f120610c;
        String str3 = this.f120611d;
        String str4 = this.f120612e;
        String str5 = this.f120613f;
        String str6 = this.f120614g;
        String str7 = this.f120615h;
        String str8 = this.f120616i;
        String str9 = this.f120617j;
        return "RemoteAddress(id=" + str + ", type=" + bVar + ", address=" + str2 + ", address2=" + str3 + ", address3=" + str4 + ", postalCode=" + str5 + ", city=" + str6 + ", countryCode=" + str7 + ", firstName=" + str8 + ", lastName=" + str9 + ")";
    }
}
