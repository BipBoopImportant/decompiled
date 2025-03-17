package com.ingka.ikea.core.remotemodel.product;

import YH.C16877v;
import com.ingka.ikea.core.model.product.ProductItem;
import com.ingka.ikea.core.model.product.ProductLarge;
import com.ingka.ikea.core.remotemodel.product.Recommendations;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import op.C11697h;
import op.C11699j;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\b\u0018\u0000 <2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002=/B?\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0007¢\u0006\u0004\b!\u0010\"J\u0013\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u0007¢\u0006\u0004\b$\u0010\"J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.R \u0010\u0006\u001a\u00020\u00058\u0000X\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b3\u00104\u001a\u0004\b1\u00102R&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0000X\u0004¢\u0006\u0012\n\u0004\b$\u00105\u0012\u0004\b7\u00104\u001a\u0004\b6\u0010\"R \u0010\u000b\u001a\u00020\n8\u0000X\u0004¢\u0006\u0012\n\u0004\b!\u00108\u0012\u0004\b;\u00104\u001a\u0004\b9\u0010:¨\u0006>"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/ProductDetailsResponseRemote;", "Lpp/b;", "Lop/j;", "", "seen0", "Lcom/ingka/ikea/core/remotemodel/product/ProductDetailsRemote;", "product", "", "Lcom/ingka/ikea/core/remotemodel/product/FacetsRemote;", "facets", "Lcom/ingka/ikea/core/remotemodel/product/Recommendations$Remote;", "recommendations", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/core/remotemodel/product/ProductDetailsRemote;Ljava/util/List;Lcom/ingka/ikea/core/remotemodel/product/Recommendations$Remote;LjK/T0;)V", "Lcom/ingka/ikea/core/remotemodel/product/Recommendations;", "e", "()Lcom/ingka/ikea/core/remotemodel/product/Recommendations;", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "g", "(Lcom/ingka/ikea/core/remotemodel/product/ProductDetailsResponseRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "f", "()Lop/j;", "Lcom/ingka/ikea/core/model/product/ProductLarge;", "d", "()Lcom/ingka/ikea/core/model/product/ProductLarge;", "Lop/h;", "c", "()Ljava/util/List;", "Lcom/ingka/ikea/core/model/product/ProductItem;", "b", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/core/remotemodel/product/ProductDetailsRemote;", "getProduct$remote_model_release", "()Lcom/ingka/ikea/core/remotemodel/product/ProductDetailsRemote;", "getProduct$remote_model_release$annotations", "()V", "Ljava/util/List;", "getFacets$remote_model_release", "getFacets$remote_model_release$annotations", "Lcom/ingka/ikea/core/remotemodel/product/Recommendations$Remote;", "getRecommendations$remote_model_release", "()Lcom/ingka/ikea/core/remotemodel/product/Recommendations$Remote;", "getRecommendations$remote_model_release$annotations", "Companion", "$serializer", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProductDetailsResponseRemote implements C11768b<C11699j> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final KSerializer<Object>[] f95387d = {null, new C17451f(FacetsRemote$$serializer.INSTANCE), null};

    /* renamed from: a  reason: collision with root package name */
    private final ProductDetailsRemote f95388a;

    /* renamed from: b  reason: collision with root package name */
    private final List<FacetsRemote> f95389b;

    /* renamed from: c  reason: collision with root package name */
    private final Recommendations.Remote f95390c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/ProductDetailsResponseRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/remotemodel/product/ProductDetailsResponseRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ProductDetailsResponseRemote> serializer() {
            return ProductDetailsResponseRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ProductDetailsResponseRemote(int i10, ProductDetailsRemote productDetailsRemote, List list, Recommendations.Remote remote, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, ProductDetailsResponseRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95388a = productDetailsRemote;
        this.f95389b = list;
        this.f95390c = remote;
    }

    private final Recommendations e() {
        return this.f95390c.b();
    }

    public static final /* synthetic */ void g(ProductDetailsResponseRemote productDetailsResponseRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f95387d;
        dVar.i(serialDescriptor, 0, ProductDetailsRemote$$serializer.INSTANCE, productDetailsResponseRemote.f95388a);
        dVar.i(serialDescriptor, 1, kSerializerArr[1], productDetailsResponseRemote.f95389b);
        dVar.i(serialDescriptor, 2, Recommendations$Remote$$serializer.INSTANCE, productDetailsResponseRemote.f95390c);
    }

    public final List<ProductItem> b() {
        return e().getMustBeComplementedWith();
    }

    public final List<C11697h> c() {
        Iterable<FacetsRemote> iterable = this.f95389b;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (FacetsRemote b10 : iterable) {
            arrayList.add(b10.b());
        }
        return arrayList;
    }

    public final ProductLarge d() {
        return this.f95388a.c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDetailsResponseRemote)) {
            return false;
        }
        ProductDetailsResponseRemote productDetailsResponseRemote = (ProductDetailsResponseRemote) obj;
        return C17542s.e(this.f95388a, productDetailsResponseRemote.f95388a) && C17542s.e(this.f95389b, productDetailsResponseRemote.f95389b) && C17542s.e(this.f95390c, productDetailsResponseRemote.f95390c);
    }

    public C11699j f() {
        ProductLarge c10 = this.f95388a.c();
        Iterable<FacetsRemote> iterable = this.f95389b;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (FacetsRemote b10 : iterable) {
            arrayList.add(b10.b());
        }
        return new C11699j(c10, this.f95390c.b().getMustBeComplementedWith(), arrayList);
    }

    public int hashCode() {
        return (((this.f95388a.hashCode() * 31) + this.f95389b.hashCode()) * 31) + this.f95390c.hashCode();
    }

    public String toString() {
        ProductDetailsRemote productDetailsRemote = this.f95388a;
        List<FacetsRemote> list = this.f95389b;
        Recommendations.Remote remote = this.f95390c;
        return "ProductDetailsResponseRemote(product=" + productDetailsRemote + ", facets=" + list + ", recommendations=" + remote + ")";
    }
}
