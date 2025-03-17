package com.ingka.ikea.core.remotemodel.product;

import YH.C16877v;
import com.ingka.ikea.core.model.product.ProductMeasurements;
import com.ingka.ikea.core.remotemodel.InformationRemote;
import com.ingka.ikea.core.remotemodel.InformationRemote$$serializer;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\b\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00021#B?\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0006\u001a\u00020\u00058\u0000X\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u001bR&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010,\u0012\u0004\b/\u0010(\u001a\u0004\b-\u0010.¨\u00062"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/ProductMeasurementsRemote;", "Lpp/b;", "Lcom/ingka/ikea/core/model/product/ProductMeasurements;", "", "seen0", "Lcom/ingka/ikea/core/remotemodel/product/ImageUrlRemote;", "image", "", "disclaimer", "", "Lcom/ingka/ikea/core/remotemodel/InformationRemote;", "values", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/core/remotemodel/product/ImageUrlRemote;Ljava/lang/String;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/core/remotemodel/product/ProductMeasurementsRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()Lcom/ingka/ikea/core/model/product/ProductMeasurements;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/core/remotemodel/product/ImageUrlRemote;", "getImage$remote_model_release", "()Lcom/ingka/ikea/core/remotemodel/product/ImageUrlRemote;", "getImage$remote_model_release$annotations", "()V", "Ljava/lang/String;", "getDisclaimer$remote_model_release", "getDisclaimer$remote_model_release$annotations", "Ljava/util/List;", "getValues$remote_model_release", "()Ljava/util/List;", "getValues$remote_model_release$annotations", "Companion", "$serializer", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProductMeasurementsRemote implements C11768b<ProductMeasurements> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final KSerializer<Object>[] f95411d = {null, null, new C17451f(InformationRemote$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final ImageUrlRemote f95412a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95413b;

    /* renamed from: c  reason: collision with root package name */
    private final List<InformationRemote> f95414c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/ProductMeasurementsRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/remotemodel/product/ProductMeasurementsRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ProductMeasurementsRemote> serializer() {
            return ProductMeasurementsRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ProductMeasurementsRemote(int i10, ImageUrlRemote imageUrlRemote, String str, List list, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, ProductMeasurementsRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95412a = imageUrlRemote;
        this.f95413b = str;
        this.f95414c = list;
    }

    public static final /* synthetic */ void c(ProductMeasurementsRemote productMeasurementsRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f95411d;
        dVar.i(serialDescriptor, 0, ImageUrlRemote$$serializer.INSTANCE, productMeasurementsRemote.f95412a);
        dVar.B(serialDescriptor, 1, Y0.f144077a, productMeasurementsRemote.f95413b);
        dVar.i(serialDescriptor, 2, kSerializerArr[2], productMeasurementsRemote.f95414c);
    }

    public ProductMeasurements b() {
        String b10 = this.f95412a.b();
        String str = this.f95413b;
        Iterable<InformationRemote> iterable = this.f95414c;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (InformationRemote a10 : iterable) {
            arrayList.add(a10.a());
        }
        return new ProductMeasurements(b10, str, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductMeasurementsRemote)) {
            return false;
        }
        ProductMeasurementsRemote productMeasurementsRemote = (ProductMeasurementsRemote) obj;
        return C17542s.e(this.f95412a, productMeasurementsRemote.f95412a) && C17542s.e(this.f95413b, productMeasurementsRemote.f95413b) && C17542s.e(this.f95414c, productMeasurementsRemote.f95414c);
    }

    public int hashCode() {
        int hashCode = this.f95412a.hashCode() * 31;
        String str = this.f95413b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f95414c.hashCode();
    }

    public String toString() {
        ImageUrlRemote imageUrlRemote = this.f95412a;
        String str = this.f95413b;
        List<InformationRemote> list = this.f95414c;
        return "ProductMeasurementsRemote(image=" + imageUrlRemote + ", disclaimer=" + str + ", values=" + list + ")";
    }
}
