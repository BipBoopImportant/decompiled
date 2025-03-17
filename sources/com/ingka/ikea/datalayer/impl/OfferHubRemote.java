package com.ingka.ikea.datalayer.impl;

import com.ingka.ikea.core.model.product.ProductCarousel;
import com.ingka.ikea.core.remotemodel.CategoriesRemote;
import com.ingka.ikea.core.remotemodel.CategoriesRemote$$serializer;
import com.ingka.ikea.core.remotemodel.product.ProductCarouselRemote;
import com.ingka.ikea.core.remotemodel.product.ProductCarouselRemote$$serializer;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kp.C11521c;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\b\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00023\u0017BC\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010(\u0012\u0004\b+\u0010'\u001a\u0004\b)\u0010*R\"\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b,\u0010(\u0012\u0004\b.\u0010'\u001a\u0004\b-\u0010*R\"\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b/\u0010(\u0012\u0004\b1\u0010'\u001a\u0004\b0\u0010*¨\u00064"}, d2 = {"Lcom/ingka/ikea/datalayer/impl/OfferHubRemote;", "Lpp/b;", "LMp/a;", "", "seen0", "Lcom/ingka/ikea/core/remotemodel/CategoriesRemote;", "categories", "Lcom/ingka/ikea/core/remotemodel/product/ProductCarouselRemote;", "recent", "expiringSoon", "lowestPrice", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/core/remotemodel/CategoriesRemote;Lcom/ingka/ikea/core/remotemodel/product/ProductCarouselRemote;Lcom/ingka/ikea/core/remotemodel/product/ProductCarouselRemote;Lcom/ingka/ikea/core/remotemodel/product/ProductCarouselRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/datalayer/impl/OfferHubRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()LMp/a;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ingka/ikea/core/remotemodel/CategoriesRemote;", "getCategories", "()Lcom/ingka/ikea/core/remotemodel/CategoriesRemote;", "getCategories$annotations", "()V", "Lcom/ingka/ikea/core/remotemodel/product/ProductCarouselRemote;", "getRecent", "()Lcom/ingka/ikea/core/remotemodel/product/ProductCarouselRemote;", "getRecent$annotations", "c", "getExpiringSoon", "getExpiringSoon$annotations", "d", "getLowestPrice", "getLowestPrice$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OfferHubRemote implements C11768b<Mp.a> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final CategoriesRemote f95485a;

    /* renamed from: b  reason: collision with root package name */
    private final ProductCarouselRemote f95486b;

    /* renamed from: c  reason: collision with root package name */
    private final ProductCarouselRemote f95487c;

    /* renamed from: d  reason: collision with root package name */
    private final ProductCarouselRemote f95488d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/datalayer/impl/OfferHubRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/datalayer/impl/OfferHubRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<OfferHubRemote> serializer() {
            return OfferHubRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ OfferHubRemote(int i10, CategoriesRemote categoriesRemote, ProductCarouselRemote productCarouselRemote, ProductCarouselRemote productCarouselRemote2, ProductCarouselRemote productCarouselRemote3, T0 t02) {
        if (15 != (i10 & 15)) {
            E0.b(i10, 15, OfferHubRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95485a = categoriesRemote;
        this.f95486b = productCarouselRemote;
        this.f95487c = productCarouselRemote2;
        this.f95488d = productCarouselRemote3;
    }

    public static final /* synthetic */ void b(OfferHubRemote offerHubRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.B(serialDescriptor, 0, CategoriesRemote$$serializer.INSTANCE, offerHubRemote.f95485a);
        ProductCarouselRemote$$serializer productCarouselRemote$$serializer = ProductCarouselRemote$$serializer.INSTANCE;
        dVar.B(serialDescriptor, 1, productCarouselRemote$$serializer, offerHubRemote.f95486b);
        dVar.B(serialDescriptor, 2, productCarouselRemote$$serializer, offerHubRemote.f95487c);
        dVar.B(serialDescriptor, 3, productCarouselRemote$$serializer, offerHubRemote.f95488d);
    }

    public Mp.a a() {
        CategoriesRemote categoriesRemote = this.f95485a;
        if (categoriesRemote != null) {
            C11521c b10 = categoriesRemote.b();
            ProductCarouselRemote productCarouselRemote = this.f95486b;
            ProductCarousel productCarousel = null;
            ProductCarousel b11 = productCarouselRemote != null ? productCarouselRemote.b() : null;
            ProductCarouselRemote productCarouselRemote2 = this.f95487c;
            ProductCarousel b12 = productCarouselRemote2 != null ? productCarouselRemote2.b() : null;
            ProductCarouselRemote productCarouselRemote3 = this.f95488d;
            if (productCarouselRemote3 != null) {
                productCarousel = productCarouselRemote3.b();
            }
            return new Mp.a(b10, b11, b12, productCarousel);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferHubRemote)) {
            return false;
        }
        OfferHubRemote offerHubRemote = (OfferHubRemote) obj;
        return C17542s.e(this.f95485a, offerHubRemote.f95485a) && C17542s.e(this.f95486b, offerHubRemote.f95486b) && C17542s.e(this.f95487c, offerHubRemote.f95487c) && C17542s.e(this.f95488d, offerHubRemote.f95488d);
    }

    public int hashCode() {
        CategoriesRemote categoriesRemote = this.f95485a;
        int i10 = 0;
        int hashCode = (categoriesRemote == null ? 0 : categoriesRemote.hashCode()) * 31;
        ProductCarouselRemote productCarouselRemote = this.f95486b;
        int hashCode2 = (hashCode + (productCarouselRemote == null ? 0 : productCarouselRemote.hashCode())) * 31;
        ProductCarouselRemote productCarouselRemote2 = this.f95487c;
        int hashCode3 = (hashCode2 + (productCarouselRemote2 == null ? 0 : productCarouselRemote2.hashCode())) * 31;
        ProductCarouselRemote productCarouselRemote3 = this.f95488d;
        if (productCarouselRemote3 != null) {
            i10 = productCarouselRemote3.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        CategoriesRemote categoriesRemote = this.f95485a;
        ProductCarouselRemote productCarouselRemote = this.f95486b;
        ProductCarouselRemote productCarouselRemote2 = this.f95487c;
        ProductCarouselRemote productCarouselRemote3 = this.f95488d;
        return "OfferHubRemote(categories=" + categoriesRemote + ", recent=" + productCarouselRemote + ", expiringSoon=" + productCarouselRemote2 + ", lowestPrice=" + productCarouselRemote3 + ")";
    }
}
