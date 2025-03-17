package com.ingka.ikea.core.model.product;

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

@p
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001b\b\b\u0018\u0000 :2\u00020\u0001:\u0002;$BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eBe\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u001dR \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u001dR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010%\u0012\u0004\b-\u0010(\u001a\u0004\b,\u0010\u001dR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b.\u0010%\u0012\u0004\b/\u0010(\u001a\u0004\b.\u0010\u001dR \u0010\b\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u00100\u0012\u0004\b2\u0010(\u001a\u0004\b+\u00101R(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001a\u00103\u0012\u0004\b6\u0010(\u001a\u0004\b4\u00105R\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b7\u0010%\u0012\u0004\b9\u0010(\u001a\u0004\b8\u0010\u001d¨\u0006<"}, d2 = {"Lcom/ingka/ikea/core/model/product/Price;", "", "", "sellingPrice", "priceLabel", "unitPrice", "regularPrice", "", "rawPrice", "", "Lcom/ingka/ikea/core/model/product/Fee;", "fees", "unit", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/util/List;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/util/List;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "f", "(Lcom/ingka/ikea/core/model/product/Price;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "getSellingPrice$annotations", "()V", "b", "getPriceLabel$annotations", "c", "getUnitPrice", "getUnitPrice$annotations", "d", "getRegularPrice$annotations", "D", "()D", "getRawPrice$annotations", "Ljava/util/List;", "getFees", "()Ljava/util/List;", "getFees$annotations", "g", "getUnit", "getUnit$annotations", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Price {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final KSerializer<Object>[] f95046h = {null, null, null, null, null, new C17451f(Fee$$serializer.INSTANCE), null};

    /* renamed from: a  reason: collision with root package name */
    private final String f95047a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95048b;

    /* renamed from: c  reason: collision with root package name */
    private final String f95049c;

    /* renamed from: d  reason: collision with root package name */
    private final String f95050d;

    /* renamed from: e  reason: collision with root package name */
    private final double f95051e;

    /* renamed from: f  reason: collision with root package name */
    private final List<Fee> f95052f;

    /* renamed from: g  reason: collision with root package name */
    private final String f95053g;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/product/Price$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/product/Price;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<Price> serializer() {
            return Price$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ Price(int i10, String str, String str2, String str3, String str4, double d10, List list, String str5, T0 t02) {
        if (63 != (i10 & 63)) {
            E0.b(i10, 63, Price$$serializer.INSTANCE.getDescriptor());
        }
        this.f95047a = str;
        this.f95048b = str2;
        this.f95049c = str3;
        this.f95050d = str4;
        this.f95051e = d10;
        this.f95052f = list;
        if ((i10 & 64) == 0) {
            this.f95053g = null;
        } else {
            this.f95053g = str5;
        }
    }

    public static final /* synthetic */ void f(Price price, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f95046h;
        dVar.y(serialDescriptor, 0, price.f95047a);
        dVar.y(serialDescriptor, 1, price.f95048b);
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 2, y02, price.f95049c);
        dVar.B(serialDescriptor, 3, y02, price.f95050d);
        dVar.E(serialDescriptor, 4, price.f95051e);
        dVar.B(serialDescriptor, 5, kSerializerArr[5], price.f95052f);
        if (dVar.z(serialDescriptor, 6) || price.f95053g != null) {
            dVar.B(serialDescriptor, 6, y02, price.f95053g);
        }
    }

    public final String b() {
        return this.f95048b;
    }

    public final double c() {
        return this.f95051e;
    }

    public final String d() {
        return this.f95050d;
    }

    public final String e() {
        return this.f95047a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Price)) {
            return false;
        }
        Price price = (Price) obj;
        return C17542s.e(this.f95047a, price.f95047a) && C17542s.e(this.f95048b, price.f95048b) && C17542s.e(this.f95049c, price.f95049c) && C17542s.e(this.f95050d, price.f95050d) && Double.compare(this.f95051e, price.f95051e) == 0 && C17542s.e(this.f95052f, price.f95052f) && C17542s.e(this.f95053g, price.f95053g);
    }

    public int hashCode() {
        int hashCode = ((this.f95047a.hashCode() * 31) + this.f95048b.hashCode()) * 31;
        String str = this.f95049c;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f95050d;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Double.hashCode(this.f95051e)) * 31;
        List<Fee> list = this.f95052f;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.f95053g;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode4 + i10;
    }

    public String toString() {
        String str = this.f95047a;
        String str2 = this.f95048b;
        String str3 = this.f95049c;
        String str4 = this.f95050d;
        double d10 = this.f95051e;
        List<Fee> list = this.f95052f;
        String str5 = this.f95053g;
        return "Price(sellingPrice=" + str + ", priceLabel=" + str2 + ", unitPrice=" + str3 + ", regularPrice=" + str4 + ", rawPrice=" + d10 + ", fees=" + list + ", unit=" + str5 + ")";
    }

    public Price(String str, String str2, String str3, String str4, double d10, List<Fee> list, String str5) {
        C17542s.j(str, "sellingPrice");
        C17542s.j(str2, "priceLabel");
        this.f95047a = str;
        this.f95048b = str2;
        this.f95049c = str3;
        this.f95050d = str4;
        this.f95051e = d10;
        this.f95052f = list;
        this.f95053g = str5;
    }
}
