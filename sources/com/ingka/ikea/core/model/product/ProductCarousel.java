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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 (2\u00020\u0001:\u0002) B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nBI\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b#\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010\u0019R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b#\u0010&\u001a\u0004\b$\u0010'¨\u0006*"}, d2 = {"Lcom/ingka/ikea/core/model/product/ProductCarousel;", "", "", "id", "purpose", "title", "", "Lcom/ingka/ikea/core/model/product/ProductItem;", "products", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "f", "(Lcom/ingka/ikea/core/model/product/ProductCarousel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "e", "Ljava/util/List;", "()Ljava/util/List;", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProductCarousel {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final KSerializer<Object>[] f95054e = {null, null, null, new C17451f(ProductItem$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final String f95055a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95056b;

    /* renamed from: c  reason: collision with root package name */
    private final String f95057c;

    /* renamed from: d  reason: collision with root package name */
    private final List<ProductItem> f95058d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/product/ProductCarousel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/product/ProductCarousel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ProductCarousel> serializer() {
            return ProductCarousel$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ProductCarousel(int i10, String str, String str2, String str3, List list, T0 t02) {
        if (15 != (i10 & 15)) {
            E0.b(i10, 15, ProductCarousel$$serializer.INSTANCE.getDescriptor());
        }
        this.f95055a = str;
        this.f95056b = str2;
        this.f95057c = str3;
        this.f95058d = list;
    }

    public static final /* synthetic */ void f(ProductCarousel productCarousel, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f95054e;
        dVar.y(serialDescriptor, 0, productCarousel.f95055a);
        dVar.B(serialDescriptor, 1, Y0.f144077a, productCarousel.f95056b);
        dVar.y(serialDescriptor, 2, productCarousel.f95057c);
        dVar.i(serialDescriptor, 3, kSerializerArr[3], productCarousel.f95058d);
    }

    public final String b() {
        return this.f95055a;
    }

    public final List<ProductItem> c() {
        return this.f95058d;
    }

    public final String d() {
        return this.f95056b;
    }

    public final String e() {
        return this.f95057c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductCarousel)) {
            return false;
        }
        ProductCarousel productCarousel = (ProductCarousel) obj;
        return C17542s.e(this.f95055a, productCarousel.f95055a) && C17542s.e(this.f95056b, productCarousel.f95056b) && C17542s.e(this.f95057c, productCarousel.f95057c) && C17542s.e(this.f95058d, productCarousel.f95058d);
    }

    public int hashCode() {
        int hashCode = this.f95055a.hashCode() * 31;
        String str = this.f95056b;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f95057c.hashCode()) * 31) + this.f95058d.hashCode();
    }

    public String toString() {
        String str = this.f95055a;
        String str2 = this.f95056b;
        String str3 = this.f95057c;
        List<ProductItem> list = this.f95058d;
        return "ProductCarousel(id=" + str + ", purpose=" + str2 + ", title=" + str3 + ", products=" + list + ")";
    }

    public ProductCarousel(String str, String str2, String str3, List<ProductItem> list) {
        C17542s.j(str, "id");
        C17542s.j(str3, "title");
        C17542s.j(list, "products");
        this.f95055a = str;
        this.f95056b = str2;
        this.f95057c = str3;
        this.f95058d = list;
    }
}
