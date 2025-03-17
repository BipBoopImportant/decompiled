package com.ingka.ikea.browseandsearch.browse.datalayer.impl.remote.models;

import YH.C16877v;
import com.ingka.ikea.core.model.product.ProductCarousel;
import com.ingka.ikea.core.remotemodel.product.ProductLiteRemote;
import com.ingka.ikea.core.remotemodel.product.ProductLiteRemote$$serializer;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u0000 ,2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002-\"B5\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R(\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010(\u0012\u0004\b+\u0010'\u001a\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/ingka/ikea/browseandsearch/browse/datalayer/impl/remote/models/UserRecommendationsCarouselRemote;", "Lpp/b;", "Lcom/ingka/ikea/core/model/product/ProductCarousel;", "", "seen0", "Lcom/ingka/ikea/browseandsearch/browse/datalayer/impl/remote/models/CategoryHeaderRemote;", "category", "", "Lcom/ingka/ikea/core/remotemodel/product/ProductLiteRemote;", "products", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/browseandsearch/browse/datalayer/impl/remote/models/CategoryHeaderRemote;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/browseandsearch/browse/datalayer/impl/remote/models/UserRecommendationsCarouselRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()Lcom/ingka/ikea/core/model/product/ProductCarousel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/browseandsearch/browse/datalayer/impl/remote/models/CategoryHeaderRemote;", "getCategory", "()Lcom/ingka/ikea/browseandsearch/browse/datalayer/impl/remote/models/CategoryHeaderRemote;", "getCategory$annotations", "()V", "Ljava/util/List;", "getProducts", "()Ljava/util/List;", "getProducts$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UserRecommendationsCarouselRemote implements C11768b<ProductCarousel> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer<Object>[] f93372c = {null, new C17451f(ProductLiteRemote$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final CategoryHeaderRemote f93373a;

    /* renamed from: b  reason: collision with root package name */
    private final List<ProductLiteRemote> f93374b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/browseandsearch/browse/datalayer/impl/remote/models/UserRecommendationsCarouselRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/browseandsearch/browse/datalayer/impl/remote/models/UserRecommendationsCarouselRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<UserRecommendationsCarouselRemote> serializer() {
            return UserRecommendationsCarouselRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ UserRecommendationsCarouselRemote(int i10, CategoryHeaderRemote categoryHeaderRemote, List list, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, UserRecommendationsCarouselRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f93373a = categoryHeaderRemote;
        this.f93374b = list;
    }

    public static final /* synthetic */ void c(UserRecommendationsCarouselRemote userRecommendationsCarouselRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f93372c;
        dVar.i(serialDescriptor, 0, CategoryHeaderRemote$$serializer.INSTANCE, userRecommendationsCarouselRemote.f93373a);
        dVar.B(serialDescriptor, 1, kSerializerArr[1], userRecommendationsCarouselRemote.f93374b);
    }

    public ProductCarousel b() {
        Collection collection = this.f93374b;
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        String a10 = this.f93373a.a();
        String b10 = this.f93373a.b();
        Iterable<ProductLiteRemote> iterable = this.f93374b;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (ProductLiteRemote s10 : iterable) {
            arrayList.add(s10.s());
        }
        return new ProductCarousel(a10, (String) null, b10, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserRecommendationsCarouselRemote)) {
            return false;
        }
        UserRecommendationsCarouselRemote userRecommendationsCarouselRemote = (UserRecommendationsCarouselRemote) obj;
        return C17542s.e(this.f93373a, userRecommendationsCarouselRemote.f93373a) && C17542s.e(this.f93374b, userRecommendationsCarouselRemote.f93374b);
    }

    public int hashCode() {
        int hashCode = this.f93373a.hashCode() * 31;
        List<ProductLiteRemote> list = this.f93374b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        CategoryHeaderRemote categoryHeaderRemote = this.f93373a;
        List<ProductLiteRemote> list = this.f93374b;
        return "UserRecommendationsCarouselRemote(category=" + categoryHeaderRemote + ", products=" + list + ")";
    }
}
