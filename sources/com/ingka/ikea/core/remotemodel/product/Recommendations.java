package com.ingka.ikea.core.remotemodel.product;

import YH.C16877v;
import androidx.annotation.Keep;
import com.ingka.ikea.core.model.product.ProductItem;
import fK.p;
import jK.C17451f;
import jK.E0;
import jK.T0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/Recommendations;", "", "mustBeComplementedWith", "", "Lcom/ingka/ikea/core/model/product/ProductItem;", "<init>", "(Ljava/util/List;)V", "getMustBeComplementedWith", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Remote", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Keep
public final class Recommendations {
    private final List<ProductItem> mustBeComplementedWith;

    @p
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 %2\u00020\u0001:\u0002&\u001fB+\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/Recommendations$Remote;", "", "", "seen0", "", "Lcom/ingka/ikea/core/remotemodel/product/ProductLiteRemote;", "completedWith", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/core/remotemodel/product/Recommendations$Remote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/ingka/ikea/core/remotemodel/product/Recommendations;", "b", "()Lcom/ingka/ikea/core/remotemodel/product/Recommendations;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getCompletedWith", "()Ljava/util/List;", "getCompletedWith$annotations", "()V", "Companion", "$serializer", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Remote {
        public static final a Companion = new a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public static final KSerializer<Object>[] f95426b = {new C17451f(ProductLiteRemote$$serializer.INSTANCE)};

        /* renamed from: a  reason: collision with root package name */
        private final List<ProductLiteRemote> f95427a;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/Recommendations$Remote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/remotemodel/product/Recommendations$Remote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<Remote> serializer() {
                return Recommendations$Remote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Remote(int i10, List list, T0 t02) {
            if (1 != (i10 & 1)) {
                E0.b(i10, 1, Recommendations$Remote$$serializer.INSTANCE.getDescriptor());
            }
            this.f95427a = list;
        }

        public final Recommendations b() {
            Iterable<ProductLiteRemote> iterable = this.f95427a;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (ProductLiteRemote s10 : iterable) {
                arrayList.add(s10.s());
            }
            return new Recommendations(arrayList);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Remote) && C17542s.e(this.f95427a, ((Remote) obj).f95427a);
        }

        public int hashCode() {
            return this.f95427a.hashCode();
        }

        public String toString() {
            List<ProductLiteRemote> list = this.f95427a;
            return "Remote(completedWith=" + list + ")";
        }
    }

    public Recommendations(List<ProductItem> list) {
        C17542s.j(list, "mustBeComplementedWith");
        this.mustBeComplementedWith = list;
    }

    public static /* synthetic */ Recommendations copy$default(Recommendations recommendations, List<ProductItem> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = recommendations.mustBeComplementedWith;
        }
        return recommendations.copy(list);
    }

    public final List<ProductItem> component1() {
        return this.mustBeComplementedWith;
    }

    public final Recommendations copy(List<ProductItem> list) {
        C17542s.j(list, "mustBeComplementedWith");
        return new Recommendations(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Recommendations) && C17542s.e(this.mustBeComplementedWith, ((Recommendations) obj).mustBeComplementedWith);
    }

    public final List<ProductItem> getMustBeComplementedWith() {
        return this.mustBeComplementedWith;
    }

    public int hashCode() {
        return this.mustBeComplementedWith.hashCode();
    }

    public String toString() {
        List<ProductItem> list = this.mustBeComplementedWith;
        return "Recommendations(mustBeComplementedWith=" + list + ")";
    }
}
