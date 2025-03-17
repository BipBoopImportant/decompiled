package com.ingka.ikea.core.model.product;

import android.os.Parcel;
import android.os.Parcelable;
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
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 -2\u00020\u0001:\u0002.&B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010\u001dJ\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u001fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b*\u0010\u001fR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010+\u001a\u0004\b)\u0010,¨\u0006/"}, d2 = {"Lcom/ingka/ikea/core/model/product/ProductDimension;", "Landroid/os/Parcelable;", "", "text", "productDescription", "", "Lcom/ingka/ikea/core/model/product/PackageInformation;", "information", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/core/model/product/ProductDimension;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getText", "b", "getProductDescription", "Ljava/util/List;", "()Ljava/util/List;", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProductDimension implements Parcelable {
    public static final Parcelable.Creator<ProductDimension> CREATOR = new b();
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final KSerializer<Object>[] f95059d = {null, null, new C17451f(PackageInformation$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final String f95060a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95061b;

    /* renamed from: c  reason: collision with root package name */
    private final List<PackageInformation> f95062c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/product/ProductDimension$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/product/ProductDimension;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ProductDimension> serializer() {
            return ProductDimension$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ProductDimension> {
        /* renamed from: a */
        public final ProductDimension createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            C17542s.j(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i10 = 0; i10 != readInt; i10++) {
                    arrayList2.add(PackageInformation.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new ProductDimension(readString, readString2, arrayList);
        }

        /* renamed from: b */
        public final ProductDimension[] newArray(int i10) {
            return new ProductDimension[i10];
        }
    }

    public /* synthetic */ ProductDimension(int i10, String str, String str2, List list, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, ProductDimension$$serializer.INSTANCE.getDescriptor());
        }
        this.f95060a = str;
        this.f95061b = str2;
        this.f95062c = list;
    }

    public static final /* synthetic */ void c(ProductDimension productDimension, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f95059d;
        dVar.y(serialDescriptor, 0, productDimension.f95060a);
        dVar.B(serialDescriptor, 1, Y0.f144077a, productDimension.f95061b);
        dVar.B(serialDescriptor, 2, kSerializerArr[2], productDimension.f95062c);
    }

    public final List<PackageInformation> b() {
        return this.f95062c;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDimension)) {
            return false;
        }
        ProductDimension productDimension = (ProductDimension) obj;
        return C17542s.e(this.f95060a, productDimension.f95060a) && C17542s.e(this.f95061b, productDimension.f95061b) && C17542s.e(this.f95062c, productDimension.f95062c);
    }

    public int hashCode() {
        int hashCode = this.f95060a.hashCode() * 31;
        String str = this.f95061b;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<PackageInformation> list = this.f95062c;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        String str = this.f95060a;
        String str2 = this.f95061b;
        List<PackageInformation> list = this.f95062c;
        return "ProductDimension(text=" + str + ", productDescription=" + str2 + ", information=" + list + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeString(this.f95060a);
        parcel.writeString(this.f95061b);
        List<PackageInformation> list = this.f95062c;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        for (PackageInformation writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i10);
        }
    }

    public ProductDimension(String str, String str2, List<PackageInformation> list) {
        C17542s.j(str, "text");
        this.f95060a = str;
        this.f95061b = str2;
        this.f95062c = list;
    }
}
