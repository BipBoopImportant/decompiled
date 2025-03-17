package com.ingka.ikea.core.remotemodel.product;

import com.ingka.ikea.core.model.product.PackageDetailsItem;
import com.ingka.ikea.core.model.product.PackageDimension;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import jK.X;
import jK.Y0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001a\b\b\u0018\u0000 92\u00020\u0001:\u0002:$BS\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u001dR(\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010)\u0012\u0004\b,\u0010(\u001a\u0004\b*\u0010+R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010-\u0012\u0004\b0\u0010(\u001a\u0004\b.\u0010/R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b1\u0010%\u0012\u0004\b3\u0010(\u001a\u0004\b2\u0010\u001dR\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b4\u00105\u0012\u0004\b8\u0010(\u001a\u0004\b6\u00107¨\u0006;"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/PackageDetailsItemRemote;", "", "", "seen0", "", "type", "", "Lcom/ingka/ikea/core/remotemodel/product/PackageDimensionRemote;", "packages", "Lcom/ingka/ikea/core/remotemodel/product/ProductDimensionRemote;", "details", "totalCount", "packageCount", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/util/List;Lcom/ingka/ikea/core/remotemodel/product/ProductDimensionRemote;Ljava/lang/String;Ljava/lang/Integer;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/core/remotemodel/product/PackageDetailsItemRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/ingka/ikea/core/model/product/PackageDetailsItem;", "b", "()Lcom/ingka/ikea/core/model/product/PackageDetailsItem;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getType", "getType$annotations", "()V", "Ljava/util/List;", "getPackages", "()Ljava/util/List;", "getPackages$annotations", "Lcom/ingka/ikea/core/remotemodel/product/ProductDimensionRemote;", "getDetails", "()Lcom/ingka/ikea/core/remotemodel/product/ProductDimensionRemote;", "getDetails$annotations", "d", "getTotalCount", "getTotalCount$annotations", "e", "Ljava/lang/Integer;", "getPackageCount", "()Ljava/lang/Integer;", "getPackageCount$annotations", "Companion", "$serializer", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PackageDetailsItemRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final KSerializer<Object>[] f95317f = {null, new C17451f(PackageDimensionRemote$$serializer.INSTANCE), null, null, null};

    /* renamed from: a  reason: collision with root package name */
    private final String f95318a;

    /* renamed from: b  reason: collision with root package name */
    private final List<PackageDimensionRemote> f95319b;

    /* renamed from: c  reason: collision with root package name */
    private final ProductDimensionRemote f95320c;

    /* renamed from: d  reason: collision with root package name */
    private final String f95321d;

    /* renamed from: e  reason: collision with root package name */
    private final Integer f95322e;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/PackageDetailsItemRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/remotemodel/product/PackageDetailsItemRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<PackageDetailsItemRemote> serializer() {
            return PackageDetailsItemRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PackageDetailsItemRemote(int i10, String str, List list, ProductDimensionRemote productDimensionRemote, String str2, Integer num, T0 t02) {
        if (31 != (i10 & 31)) {
            E0.b(i10, 31, PackageDetailsItemRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95318a = str;
        this.f95319b = list;
        this.f95320c = productDimensionRemote;
        this.f95321d = str2;
        this.f95322e = num;
    }

    public static final /* synthetic */ void c(PackageDetailsItemRemote packageDetailsItemRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f95317f;
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, packageDetailsItemRemote.f95318a);
        dVar.B(serialDescriptor, 1, kSerializerArr[1], packageDetailsItemRemote.f95319b);
        dVar.B(serialDescriptor, 2, ProductDimensionRemote$$serializer.INSTANCE, packageDetailsItemRemote.f95320c);
        dVar.B(serialDescriptor, 3, y02, packageDetailsItemRemote.f95321d);
        dVar.B(serialDescriptor, 4, X.f144073a, packageDetailsItemRemote.f95322e);
    }

    public final PackageDetailsItem b() {
        ArrayList arrayList;
        String str = this.f95318a;
        if (str != null) {
            String str2 = this.f95321d;
            Integer num = this.f95322e;
            List<PackageDimensionRemote> list = this.f95319b;
            if (list != null) {
                arrayList = new ArrayList();
                for (PackageDimensionRemote b10 : list) {
                    PackageDimension b11 = b10.b();
                    if (b11 != null) {
                        arrayList.add(b11);
                    }
                }
            } else {
                arrayList = null;
            }
            ProductDimensionRemote productDimensionRemote = this.f95320c;
            return new PackageDetailsItem(str, str2, num, arrayList, productDimensionRemote != null ? productDimensionRemote.b() : null);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PackageDetailsItemRemote)) {
            return false;
        }
        PackageDetailsItemRemote packageDetailsItemRemote = (PackageDetailsItemRemote) obj;
        return C17542s.e(this.f95318a, packageDetailsItemRemote.f95318a) && C17542s.e(this.f95319b, packageDetailsItemRemote.f95319b) && C17542s.e(this.f95320c, packageDetailsItemRemote.f95320c) && C17542s.e(this.f95321d, packageDetailsItemRemote.f95321d) && C17542s.e(this.f95322e, packageDetailsItemRemote.f95322e);
    }

    public int hashCode() {
        String str = this.f95318a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<PackageDimensionRemote> list = this.f95319b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        ProductDimensionRemote productDimensionRemote = this.f95320c;
        int hashCode3 = (hashCode2 + (productDimensionRemote == null ? 0 : productDimensionRemote.hashCode())) * 31;
        String str2 = this.f95321d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f95322e;
        if (num != null) {
            i10 = num.hashCode();
        }
        return hashCode4 + i10;
    }

    public String toString() {
        String str = this.f95318a;
        List<PackageDimensionRemote> list = this.f95319b;
        ProductDimensionRemote productDimensionRemote = this.f95320c;
        String str2 = this.f95321d;
        Integer num = this.f95322e;
        return "PackageDetailsItemRemote(type=" + str + ", packages=" + list + ", details=" + productDimensionRemote + ", totalCount=" + str2 + ", packageCount=" + num + ")";
    }
}
