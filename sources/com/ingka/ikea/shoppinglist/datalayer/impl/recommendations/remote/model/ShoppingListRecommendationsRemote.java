package com.ingka.ikea.shoppinglist.datalayer.impl.recommendations.remote.model;

import com.ingka.ikea.core.remotemodel.InspirationFeedItemRemote;
import com.ingka.ikea.core.remotemodel.InspirationFeedItemRemote$$serializer;
import com.ingka.ikea.core.remotemodel.product.ProductLiteRemote;
import com.ingka.ikea.core.remotemodel.product.ProductLiteRemote$$serializer;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\b\u0018\u0000 ,2\u00020\u0001:\u0003-. BE\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(R&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u0010&\u0012\u0004\b+\u0010%\u001a\u0004\b*\u0010(¨\u0006/"}, d2 = {"Lcom/ingka/ikea/shoppinglist/datalayer/impl/recommendations/remote/model/ShoppingListRecommendationsRemote;", "", "", "seen0", "Lcom/ingka/ikea/shoppinglist/datalayer/impl/recommendations/remote/model/CategoryHeaderRemote;", "category", "", "Lcom/ingka/ikea/core/remotemodel/product/ProductLiteRemote;", "recommendations", "Lcom/ingka/ikea/shoppinglist/datalayer/impl/recommendations/remote/model/ShoppingListRecommendationsRemote$InspirationFeed;", "inspirationFeed", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/shoppinglist/datalayer/impl/recommendations/remote/model/CategoryHeaderRemote;Ljava/util/List;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "e", "(Lcom/ingka/ikea/shoppinglist/datalayer/impl/recommendations/remote/model/ShoppingListRecommendationsRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/shoppinglist/datalayer/impl/recommendations/remote/model/CategoryHeaderRemote;", "b", "()Lcom/ingka/ikea/shoppinglist/datalayer/impl/recommendations/remote/model/CategoryHeaderRemote;", "getCategory$annotations", "()V", "Ljava/util/List;", "d", "()Ljava/util/List;", "getRecommendations$annotations", "c", "getInspirationFeed$annotations", "Companion", "InspirationFeed", "$serializer", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ShoppingListRecommendationsRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final KSerializer<Object>[] f120305d = {null, new C17451f(ProductLiteRemote$$serializer.INSTANCE), new C17451f(ShoppingListRecommendationsRemote$InspirationFeed$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final CategoryHeaderRemote f120306a;

    /* renamed from: b  reason: collision with root package name */
    private final List<ProductLiteRemote> f120307b;

    /* renamed from: c  reason: collision with root package name */
    private final List<InspirationFeed> f120308c;

    @p
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 \"2\u00020\u0001:\u0002#\u001cB+\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/ingka/ikea/shoppinglist/datalayer/impl/recommendations/remote/model/ShoppingListRecommendationsRemote$InspirationFeed;", "", "", "seen0", "", "Lcom/ingka/ikea/core/remotemodel/InspirationFeedItemRemote;", "inspirations", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/shoppinglist/datalayer/impl/recommendations/remote/model/ShoppingListRecommendationsRemote$InspirationFeed;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "getInspirations$annotations", "()V", "Companion", "$serializer", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InspirationFeed {
        public static final a Companion = new a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public static final KSerializer<Object>[] f120309b = {new C17451f(InspirationFeedItemRemote$$serializer.INSTANCE)};

        /* renamed from: a  reason: collision with root package name */
        private final List<InspirationFeedItemRemote> f120310a;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/shoppinglist/datalayer/impl/recommendations/remote/model/ShoppingListRecommendationsRemote$InspirationFeed$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/shoppinglist/datalayer/impl/recommendations/remote/model/ShoppingListRecommendationsRemote$InspirationFeed;", "serializer", "()Lkotlinx/serialization/KSerializer;", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<InspirationFeed> serializer() {
                return ShoppingListRecommendationsRemote$InspirationFeed$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ InspirationFeed(int i10, List list, T0 t02) {
            if (1 != (i10 & 1)) {
                E0.b(i10, 1, ShoppingListRecommendationsRemote$InspirationFeed$$serializer.INSTANCE.getDescriptor());
            }
            this.f120310a = list;
        }

        public final List<InspirationFeedItemRemote> b() {
            return this.f120310a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InspirationFeed) && C17542s.e(this.f120310a, ((InspirationFeed) obj).f120310a);
        }

        public int hashCode() {
            return this.f120310a.hashCode();
        }

        public String toString() {
            List<InspirationFeedItemRemote> list = this.f120310a;
            return "InspirationFeed(inspirations=" + list + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/shoppinglist/datalayer/impl/recommendations/remote/model/ShoppingListRecommendationsRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/shoppinglist/datalayer/impl/recommendations/remote/model/ShoppingListRecommendationsRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ShoppingListRecommendationsRemote> serializer() {
            return ShoppingListRecommendationsRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ShoppingListRecommendationsRemote(int i10, CategoryHeaderRemote categoryHeaderRemote, List list, List list2, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, ShoppingListRecommendationsRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f120306a = categoryHeaderRemote;
        this.f120307b = list;
        this.f120308c = list2;
    }

    public static final /* synthetic */ void e(ShoppingListRecommendationsRemote shoppingListRecommendationsRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f120305d;
        dVar.i(serialDescriptor, 0, CategoryHeaderRemote$$serializer.INSTANCE, shoppingListRecommendationsRemote.f120306a);
        dVar.i(serialDescriptor, 1, kSerializerArr[1], shoppingListRecommendationsRemote.f120307b);
        dVar.i(serialDescriptor, 2, kSerializerArr[2], shoppingListRecommendationsRemote.f120308c);
    }

    public final CategoryHeaderRemote b() {
        return this.f120306a;
    }

    public final List<InspirationFeed> c() {
        return this.f120308c;
    }

    public final List<ProductLiteRemote> d() {
        return this.f120307b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShoppingListRecommendationsRemote)) {
            return false;
        }
        ShoppingListRecommendationsRemote shoppingListRecommendationsRemote = (ShoppingListRecommendationsRemote) obj;
        return C17542s.e(this.f120306a, shoppingListRecommendationsRemote.f120306a) && C17542s.e(this.f120307b, shoppingListRecommendationsRemote.f120307b) && C17542s.e(this.f120308c, shoppingListRecommendationsRemote.f120308c);
    }

    public int hashCode() {
        return (((this.f120306a.hashCode() * 31) + this.f120307b.hashCode()) * 31) + this.f120308c.hashCode();
    }

    public String toString() {
        CategoryHeaderRemote categoryHeaderRemote = this.f120306a;
        List<ProductLiteRemote> list = this.f120307b;
        List<InspirationFeed> list2 = this.f120308c;
        return "ShoppingListRecommendationsRemote(category=" + categoryHeaderRemote + ", recommendations=" + list + ", inspirationFeed=" + list2 + ")";
    }
}
