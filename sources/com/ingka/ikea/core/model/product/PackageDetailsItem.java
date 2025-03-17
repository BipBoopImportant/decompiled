package com.ingka.ikea.core.model.product;

import android.os.Parcel;
import android.os.Parcelable;
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
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\b\u0018\u0000 62\u00020\u0001:\u00027)B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBS\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0005¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b#\u0010 J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\"R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b-\u0010\"R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b.\u00100R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b1\u00103R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0018\u00104\u001a\u0004\b,\u00105¨\u00068"}, d2 = {"Lcom/ingka/ikea/core/model/product/PackageDetailsItem;", "Landroid/os/Parcelable;", "", "type", "totalCount", "", "packageCount", "", "Lcom/ingka/ikea/core/model/product/PackageDimension;", "packages", "Lcom/ingka/ikea/core/model/product/ProductDimension;", "details", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lcom/ingka/ikea/core/model/product/ProductDimension;)V", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lcom/ingka/ikea/core/model/product/ProductDimension;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "e", "(Lcom/ingka/ikea/core/model/product/PackageDetailsItem;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getType", "b", "getTotalCount", "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "d", "Ljava/util/List;", "()Ljava/util/List;", "Lcom/ingka/ikea/core/model/product/ProductDimension;", "()Lcom/ingka/ikea/core/model/product/ProductDimension;", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PackageDetailsItem implements Parcelable {
    public static final Parcelable.Creator<PackageDetailsItem> CREATOR = new b();
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final KSerializer<Object>[] f95019f = {null, null, null, new C17451f(PackageDimension$$serializer.INSTANCE), null};

    /* renamed from: a  reason: collision with root package name */
    private final String f95020a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95021b;

    /* renamed from: c  reason: collision with root package name */
    private final Integer f95022c;

    /* renamed from: d  reason: collision with root package name */
    private final List<PackageDimension> f95023d;

    /* renamed from: e  reason: collision with root package name */
    private final ProductDimension f95024e;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/product/PackageDetailsItem$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/product/PackageDetailsItem;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<PackageDetailsItem> serializer() {
            return PackageDetailsItem$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<PackageDetailsItem> {
        /* renamed from: a */
        public final PackageDetailsItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            C17542s.j(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            ProductDimension productDimension = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i10 = 0; i10 != readInt; i10++) {
                    arrayList.add(PackageDimension.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                productDimension = ProductDimension.CREATOR.createFromParcel(parcel);
            }
            return new PackageDetailsItem(readString, readString2, valueOf, arrayList, productDimension);
        }

        /* renamed from: b */
        public final PackageDetailsItem[] newArray(int i10) {
            return new PackageDetailsItem[i10];
        }
    }

    public /* synthetic */ PackageDetailsItem(int i10, String str, String str2, Integer num, List list, ProductDimension productDimension, T0 t02) {
        if (31 != (i10 & 31)) {
            E0.b(i10, 31, PackageDetailsItem$$serializer.INSTANCE.getDescriptor());
        }
        this.f95020a = str;
        this.f95021b = str2;
        this.f95022c = num;
        this.f95023d = list;
        this.f95024e = productDimension;
    }

    public static final /* synthetic */ void e(PackageDetailsItem packageDetailsItem, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f95019f;
        dVar.y(serialDescriptor, 0, packageDetailsItem.f95020a);
        dVar.B(serialDescriptor, 1, Y0.f144077a, packageDetailsItem.f95021b);
        dVar.B(serialDescriptor, 2, X.f144073a, packageDetailsItem.f95022c);
        dVar.B(serialDescriptor, 3, kSerializerArr[3], packageDetailsItem.f95023d);
        dVar.B(serialDescriptor, 4, ProductDimension$$serializer.INSTANCE, packageDetailsItem.f95024e);
    }

    public final ProductDimension b() {
        return this.f95024e;
    }

    public final Integer c() {
        return this.f95022c;
    }

    public final List<PackageDimension> d() {
        return this.f95023d;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PackageDetailsItem)) {
            return false;
        }
        PackageDetailsItem packageDetailsItem = (PackageDetailsItem) obj;
        return C17542s.e(this.f95020a, packageDetailsItem.f95020a) && C17542s.e(this.f95021b, packageDetailsItem.f95021b) && C17542s.e(this.f95022c, packageDetailsItem.f95022c) && C17542s.e(this.f95023d, packageDetailsItem.f95023d) && C17542s.e(this.f95024e, packageDetailsItem.f95024e);
    }

    public final String getType() {
        return this.f95020a;
    }

    public int hashCode() {
        int hashCode = this.f95020a.hashCode() * 31;
        String str = this.f95021b;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f95022c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List<PackageDimension> list = this.f95023d;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        ProductDimension productDimension = this.f95024e;
        if (productDimension != null) {
            i10 = productDimension.hashCode();
        }
        return hashCode4 + i10;
    }

    public String toString() {
        String str = this.f95020a;
        String str2 = this.f95021b;
        Integer num = this.f95022c;
        List<PackageDimension> list = this.f95023d;
        ProductDimension productDimension = this.f95024e;
        return "PackageDetailsItem(type=" + str + ", totalCount=" + str2 + ", packageCount=" + num + ", packages=" + list + ", details=" + productDimension + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeString(this.f95020a);
        parcel.writeString(this.f95021b);
        Integer num = this.f95022c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        List<PackageDimension> list = this.f95023d;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (PackageDimension writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i10);
            }
        }
        ProductDimension productDimension = this.f95024e;
        if (productDimension == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        productDimension.writeToParcel(parcel, i10);
    }

    public PackageDetailsItem(String str, String str2, Integer num, List<PackageDimension> list, ProductDimension productDimension) {
        C17542s.j(str, "type");
        this.f95020a = str;
        this.f95021b = str2;
        this.f95022c = num;
        this.f95023d = list;
        this.f95024e = productDimension;
    }
}
