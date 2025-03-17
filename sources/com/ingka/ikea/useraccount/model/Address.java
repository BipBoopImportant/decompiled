package com.ingka.ikea.useraccount.model;

import androidx.annotation.Keep;
import fI.C17220a;
import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\b\b\u0018\u00002\u00020\u0001:\u0001-Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b\u0019\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u0011R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b#\u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010\u0011R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001a\u001a\u0004\b\u001c\u0010\u0011R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001a\u001a\u0004\b \u0010\u0011R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001a\u001a\u0004\b!\u0010\u0011R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001a\u001a\u0004\b$\u0010\u0011R\u0017\u0010,\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b&\u0010+¨\u0006."}, d2 = {"Lcom/ingka/ikea/useraccount/model/Address;", "", "", "id", "Lcom/ingka/ikea/useraccount/model/Address$Type;", "type", "address", "address2", "address3", "postalCode", "city", "countryCode", "firstName", "lastName", "<init>", "(Ljava/lang/String;Lcom/ingka/ikea/useraccount/model/Address$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "Lcom/ingka/ikea/useraccount/model/Address$Type;", "getType", "()Lcom/ingka/ikea/useraccount/model/Address$Type;", "c", "d", "getAddress2", "getAddress3", "f", "g", "h", "i", "j", "k", "Z", "()Z", "isInvoice", "Type", "useraccount_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Address {

    /* renamed from: a  reason: collision with root package name */
    private final String f120634a;

    /* renamed from: b  reason: collision with root package name */
    private final Type f120635b;

    /* renamed from: c  reason: collision with root package name */
    private final String f120636c;

    /* renamed from: d  reason: collision with root package name */
    private final String f120637d;

    /* renamed from: e  reason: collision with root package name */
    private final String f120638e;

    /* renamed from: f  reason: collision with root package name */
    private final String f120639f;

    /* renamed from: g  reason: collision with root package name */
    private final String f120640g;

    /* renamed from: h  reason: collision with root package name */
    private final String f120641h;

    /* renamed from: i  reason: collision with root package name */
    private final String f120642i;

    /* renamed from: j  reason: collision with root package name */
    private final String f120643j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f120644k;

    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ingka/ikea/useraccount/model/Address$Type;", "", "<init>", "(Ljava/lang/String;I)V", "INVOICE_DEST", "DELIVERY_DEST", "useraccount_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Type {
        INVOICE_DEST,
        DELIVERY_DEST;

        static {
            Type[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<Type> getEntries() {
            return $ENTRIES;
        }
    }

    public Address(String str, Type type, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        C17542s.j(str, "id");
        C17542s.j(type, "type");
        this.f120634a = str;
        this.f120635b = type;
        this.f120636c = str2;
        this.f120637d = str3;
        this.f120638e = str4;
        this.f120639f = str5;
        this.f120640g = str6;
        this.f120641h = str7;
        this.f120642i = str8;
        this.f120643j = str9;
        this.f120644k = type == Type.INVOICE_DEST;
    }

    public final String a() {
        return this.f120636c;
    }

    public final String b() {
        return this.f120640g;
    }

    public final String c() {
        return this.f120641h;
    }

    public final String d() {
        return this.f120642i;
    }

    public final String e() {
        return this.f120634a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Address)) {
            return false;
        }
        Address address = (Address) obj;
        return C17542s.e(this.f120634a, address.f120634a) && this.f120635b == address.f120635b && C17542s.e(this.f120636c, address.f120636c) && C17542s.e(this.f120637d, address.f120637d) && C17542s.e(this.f120638e, address.f120638e) && C17542s.e(this.f120639f, address.f120639f) && C17542s.e(this.f120640g, address.f120640g) && C17542s.e(this.f120641h, address.f120641h) && C17542s.e(this.f120642i, address.f120642i) && C17542s.e(this.f120643j, address.f120643j);
    }

    public final String f() {
        return this.f120643j;
    }

    public final String g() {
        return this.f120639f;
    }

    public final boolean h() {
        return this.f120644k;
    }

    public int hashCode() {
        int hashCode = ((this.f120634a.hashCode() * 31) + this.f120635b.hashCode()) * 31;
        String str = this.f120636c;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f120637d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f120638e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f120639f;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f120640g;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f120641h;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f120642i;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f120643j;
        if (str8 != null) {
            i10 = str8.hashCode();
        }
        return hashCode8 + i10;
    }

    public String toString() {
        String str = this.f120634a;
        Type type = this.f120635b;
        String str2 = this.f120636c;
        String str3 = this.f120637d;
        String str4 = this.f120638e;
        String str5 = this.f120639f;
        String str6 = this.f120640g;
        String str7 = this.f120641h;
        String str8 = this.f120642i;
        String str9 = this.f120643j;
        return "Address(id=" + str + ", type=" + type + ", address=" + str2 + ", address2=" + str3 + ", address3=" + str4 + ", postalCode=" + str5 + ", city=" + str6 + ", countryCode=" + str7 + ", firstName=" + str8 + ", lastName=" + str9 + ")";
    }
}
