package com.ingka.ikea.core.model.product;

import android.os.Parcel;
import android.os.Parcelable;
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

@p
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u0000 32\u00020\u0001:\u00024)B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fB]\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\r¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b#\u0010 J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\"R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b0\u0010\"R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010*\u001a\u0004\b,\u0010\"R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010*\u001a\u0004\b1\u0010\"R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010*\u001a\u0004\b2\u0010\"¨\u00065"}, d2 = {"Lcom/ingka/ikea/core/model/product/PackageDimension;", "Landroid/os/Parcelable;", "", "text", "", "Lcom/ingka/ikea/core/model/product/PackageInformation;", "information", "itemNo", "count", "productName", "productTypeName", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "g", "(Lcom/ingka/ikea/core/model/product/PackageDimension;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getText", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "d", "e", "f", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PackageDimension implements Parcelable {
    public static final Parcelable.Creator<PackageDimension> CREATOR = new b();
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final KSerializer<Object>[] f95025g = {null, new C17451f(PackageInformation$$serializer.INSTANCE), null, null, null, null};

    /* renamed from: a  reason: collision with root package name */
    private final String f95026a;

    /* renamed from: b  reason: collision with root package name */
    private final List<PackageInformation> f95027b;

    /* renamed from: c  reason: collision with root package name */
    private final String f95028c;

    /* renamed from: d  reason: collision with root package name */
    private final String f95029d;

    /* renamed from: e  reason: collision with root package name */
    private final String f95030e;

    /* renamed from: f  reason: collision with root package name */
    private final String f95031f;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/product/PackageDimension$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/product/PackageDimension;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<PackageDimension> serializer() {
            return PackageDimension$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<PackageDimension> {
        /* renamed from: a */
        public final PackageDimension createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            C17542s.j(parcel, "parcel");
            String readString = parcel.readString();
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
            return new PackageDimension(readString, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final PackageDimension[] newArray(int i10) {
            return new PackageDimension[i10];
        }
    }

    public /* synthetic */ PackageDimension(int i10, String str, List list, String str2, String str3, String str4, String str5, T0 t02) {
        if (63 != (i10 & 63)) {
            E0.b(i10, 63, PackageDimension$$serializer.INSTANCE.getDescriptor());
        }
        this.f95026a = str;
        this.f95027b = list;
        this.f95028c = str2;
        this.f95029d = str3;
        this.f95030e = str4;
        this.f95031f = str5;
    }

    public static final /* synthetic */ void g(PackageDimension packageDimension, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f95025g;
        dVar.y(serialDescriptor, 0, packageDimension.f95026a);
        dVar.B(serialDescriptor, 1, kSerializerArr[1], packageDimension.f95027b);
        dVar.y(serialDescriptor, 2, packageDimension.f95028c);
        dVar.y(serialDescriptor, 3, packageDimension.f95029d);
        dVar.y(serialDescriptor, 4, packageDimension.f95030e);
        dVar.y(serialDescriptor, 5, packageDimension.f95031f);
    }

    public final String b() {
        return this.f95029d;
    }

    public final List<PackageInformation> c() {
        return this.f95027b;
    }

    public final String d() {
        return this.f95028c;
    }

    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f95030e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PackageDimension)) {
            return false;
        }
        PackageDimension packageDimension = (PackageDimension) obj;
        return C17542s.e(this.f95026a, packageDimension.f95026a) && C17542s.e(this.f95027b, packageDimension.f95027b) && C17542s.e(this.f95028c, packageDimension.f95028c) && C17542s.e(this.f95029d, packageDimension.f95029d) && C17542s.e(this.f95030e, packageDimension.f95030e) && C17542s.e(this.f95031f, packageDimension.f95031f);
    }

    public final String f() {
        return this.f95031f;
    }

    public int hashCode() {
        int hashCode = this.f95026a.hashCode() * 31;
        List<PackageInformation> list = this.f95027b;
        return ((((((((hashCode + (list == null ? 0 : list.hashCode())) * 31) + this.f95028c.hashCode()) * 31) + this.f95029d.hashCode()) * 31) + this.f95030e.hashCode()) * 31) + this.f95031f.hashCode();
    }

    public String toString() {
        String str = this.f95026a;
        List<PackageInformation> list = this.f95027b;
        String str2 = this.f95028c;
        String str3 = this.f95029d;
        String str4 = this.f95030e;
        String str5 = this.f95031f;
        return "PackageDimension(text=" + str + ", information=" + list + ", itemNo=" + str2 + ", count=" + str3 + ", productName=" + str4 + ", productTypeName=" + str5 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeString(this.f95026a);
        List<PackageInformation> list = this.f95027b;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (PackageInformation writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i10);
            }
        }
        parcel.writeString(this.f95028c);
        parcel.writeString(this.f95029d);
        parcel.writeString(this.f95030e);
        parcel.writeString(this.f95031f);
    }

    public PackageDimension(String str, List<PackageInformation> list, String str2, String str3, String str4, String str5) {
        C17542s.j(str, "text");
        C17542s.j(str2, "itemNo");
        C17542s.j(str3, "count");
        C17542s.j(str4, "productName");
        C17542s.j(str5, "productTypeName");
        this.f95026a = str;
        this.f95027b = list;
        this.f95028c = str2;
        this.f95029d = str3;
        this.f95030e = str4;
        this.f95031f = str5;
    }
}
