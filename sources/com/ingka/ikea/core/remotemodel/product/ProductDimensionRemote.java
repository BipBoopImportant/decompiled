package com.ingka.ikea.core.remotemodel.product;

import YH.C16877v;
import com.ingka.ikea.core.model.product.ProductDimension;
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

@p
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u0000 ,2\u00020\u0001:\u0002-!B?\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\"\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010\u001aR(\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010(\u0012\u0004\b+\u0010%\u001a\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/ProductDimensionRemote;", "", "", "seen0", "", "text", "productDescription", "", "Lcom/ingka/ikea/core/remotemodel/product/PackageInformationRemote;", "information", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/core/remotemodel/product/ProductDimensionRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/ingka/ikea/core/model/product/ProductDimension;", "b", "()Lcom/ingka/ikea/core/model/product/ProductDimension;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getText", "getText$annotations", "()V", "getProductDescription", "getProductDescription$annotations", "Ljava/util/List;", "getInformation", "()Ljava/util/List;", "getInformation$annotations", "Companion", "$serializer", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProductDimensionRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final KSerializer<Object>[] f95391d = {null, null, new C17451f(PackageInformationRemote$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final String f95392a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95393b;

    /* renamed from: c  reason: collision with root package name */
    private final List<PackageInformationRemote> f95394c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/ProductDimensionRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/remotemodel/product/ProductDimensionRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ProductDimensionRemote> serializer() {
            return ProductDimensionRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ProductDimensionRemote(int i10, String str, String str2, List list, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, ProductDimensionRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95392a = str;
        this.f95393b = str2;
        this.f95394c = list;
    }

    public static final /* synthetic */ void c(ProductDimensionRemote productDimensionRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f95391d;
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, productDimensionRemote.f95392a);
        dVar.B(serialDescriptor, 1, y02, productDimensionRemote.f95393b);
        dVar.B(serialDescriptor, 2, kSerializerArr[2], productDimensionRemote.f95394c);
    }

    public final ProductDimension b() {
        String str = this.f95392a;
        if (str != null) {
            String str2 = this.f95393b;
            if (str2 != null) {
                List<PackageInformationRemote> list = this.f95394c;
                if (list != null) {
                    Iterable<PackageInformationRemote> iterable = list;
                    ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
                    for (PackageInformationRemote a10 : iterable) {
                        arrayList.add(a10.a());
                    }
                    return new ProductDimension(str, str2, arrayList);
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDimensionRemote)) {
            return false;
        }
        ProductDimensionRemote productDimensionRemote = (ProductDimensionRemote) obj;
        return C17542s.e(this.f95392a, productDimensionRemote.f95392a) && C17542s.e(this.f95393b, productDimensionRemote.f95393b) && C17542s.e(this.f95394c, productDimensionRemote.f95394c);
    }

    public int hashCode() {
        String str = this.f95392a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f95393b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<PackageInformationRemote> list = this.f95394c;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        String str = this.f95392a;
        String str2 = this.f95393b;
        List<PackageInformationRemote> list = this.f95394c;
        return "ProductDimensionRemote(text=" + str + ", productDescription=" + str2 + ", information=" + list + ")";
    }
}
