package com.ingka.ikea.browseandsearch.browse.datalayer.impl.remote.models;

import YH.C16877v;
import com.ingka.ikea.core.model.Category;
import com.ingka.ikea.core.remotemodel.CategoriesRemote;
import com.ingka.ikea.core.remotemodel.CategoriesRemote$$serializer;
import com.ingka.ikea.core.remotemodel.product.ProductCarouselRemote;
import com.ingka.ikea.core.remotemodel.product.ProductCarouselRemote$$serializer;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kp.C11521c;
import nn.C11655a;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002/\u0016B9\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\"\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010$R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b-\u0010&\u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"Lcom/ingka/ikea/browseandsearch/browse/datalayer/impl/remote/models/BrowseContentRemote;", "Lpp/b;", "Lnn/a;", "", "seen0", "Lcom/ingka/ikea/core/remotemodel/CategoriesRemote;", "categoriesRemote", "roomsRemote", "Lcom/ingka/ikea/core/remotemodel/product/ProductCarouselRemote;", "promotionRemote", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/core/remotemodel/CategoriesRemote;Lcom/ingka/ikea/core/remotemodel/CategoriesRemote;Lcom/ingka/ikea/core/remotemodel/product/ProductCarouselRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/browseandsearch/browse/datalayer/impl/remote/models/BrowseContentRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()Lnn/a;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ingka/ikea/core/remotemodel/CategoriesRemote;", "getCategoriesRemote", "()Lcom/ingka/ikea/core/remotemodel/CategoriesRemote;", "getCategoriesRemote$annotations", "()V", "getRoomsRemote", "getRoomsRemote$annotations", "c", "Lcom/ingka/ikea/core/remotemodel/product/ProductCarouselRemote;", "getPromotionRemote", "()Lcom/ingka/ikea/core/remotemodel/product/ProductCarouselRemote;", "getPromotionRemote$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BrowseContentRemote implements C11768b<C11655a> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final CategoriesRemote f93346a;

    /* renamed from: b  reason: collision with root package name */
    private final CategoriesRemote f93347b;

    /* renamed from: c  reason: collision with root package name */
    private final ProductCarouselRemote f93348c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/browseandsearch/browse/datalayer/impl/remote/models/BrowseContentRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/browseandsearch/browse/datalayer/impl/remote/models/BrowseContentRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<BrowseContentRemote> serializer() {
            return BrowseContentRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ BrowseContentRemote(int i10, CategoriesRemote categoriesRemote, CategoriesRemote categoriesRemote2, ProductCarouselRemote productCarouselRemote, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, BrowseContentRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f93346a = categoriesRemote;
        this.f93347b = categoriesRemote2;
        this.f93348c = productCarouselRemote;
    }

    public static final /* synthetic */ void b(BrowseContentRemote browseContentRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        CategoriesRemote$$serializer categoriesRemote$$serializer = CategoriesRemote$$serializer.INSTANCE;
        dVar.B(serialDescriptor, 0, categoriesRemote$$serializer, browseContentRemote.f93346a);
        dVar.B(serialDescriptor, 1, categoriesRemote$$serializer, browseContentRemote.f93347b);
        dVar.B(serialDescriptor, 2, ProductCarouselRemote$$serializer.INSTANCE, browseContentRemote.f93348c);
    }

    public C11655a a() {
        List<Category> list;
        List<Category> list2;
        C11521c b10;
        C11521c b11;
        CategoriesRemote categoriesRemote = this.f93346a;
        if (categoriesRemote == null || (b11 = categoriesRemote.b()) == null || (list = b11.a()) == null) {
            list = C16877v.n();
        }
        CategoriesRemote categoriesRemote2 = this.f93347b;
        if (categoriesRemote2 == null || (b10 = categoriesRemote2.b()) == null || (list2 = b10.a()) == null) {
            list2 = C16877v.n();
        }
        ProductCarouselRemote productCarouselRemote = this.f93348c;
        return new C11655a(list, list2, productCarouselRemote != null ? productCarouselRemote.b() : null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrowseContentRemote)) {
            return false;
        }
        BrowseContentRemote browseContentRemote = (BrowseContentRemote) obj;
        return C17542s.e(this.f93346a, browseContentRemote.f93346a) && C17542s.e(this.f93347b, browseContentRemote.f93347b) && C17542s.e(this.f93348c, browseContentRemote.f93348c);
    }

    public int hashCode() {
        CategoriesRemote categoriesRemote = this.f93346a;
        int i10 = 0;
        int hashCode = (categoriesRemote == null ? 0 : categoriesRemote.hashCode()) * 31;
        CategoriesRemote categoriesRemote2 = this.f93347b;
        int hashCode2 = (hashCode + (categoriesRemote2 == null ? 0 : categoriesRemote2.hashCode())) * 31;
        ProductCarouselRemote productCarouselRemote = this.f93348c;
        if (productCarouselRemote != null) {
            i10 = productCarouselRemote.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        CategoriesRemote categoriesRemote = this.f93346a;
        CategoriesRemote categoriesRemote2 = this.f93347b;
        ProductCarouselRemote productCarouselRemote = this.f93348c;
        return "BrowseContentRemote(categoriesRemote=" + categoriesRemote + ", roomsRemote=" + categoriesRemote2 + ", promotionRemote=" + productCarouselRemote + ")";
    }
}
