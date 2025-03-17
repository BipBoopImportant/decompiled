package com.ingka.ikea.core.model.product;

import XH.C16814e;
import android.os.Parcel;
import android.os.Parcelable;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u0000 /2\u00020\u0001:\u00020&B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010\u001dJ\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010*\u001a\u0004\b+\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b&\u0010.¨\u00061"}, d2 = {"Lcom/ingka/ikea/core/model/product/PackageInfoData;", "Landroid/os/Parcelable;", "Lcom/ingka/ikea/core/model/product/ImageObject;", "image", "", "dimension", "Lcom/ingka/ikea/core/model/product/PackageDetails;", "packageDetails", "<init>", "(Lcom/ingka/ikea/core/model/product/ImageObject;Ljava/lang/String;Lcom/ingka/ikea/core/model/product/PackageDetails;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILcom/ingka/ikea/core/model/product/ImageObject;Ljava/lang/String;Lcom/ingka/ikea/core/model/product/PackageDetails;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/core/model/product/PackageInfoData;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/core/model/product/ImageObject;", "getImage", "()Lcom/ingka/ikea/core/model/product/ImageObject;", "Ljava/lang/String;", "getDimension", "c", "Lcom/ingka/ikea/core/model/product/PackageDetails;", "()Lcom/ingka/ikea/core/model/product/PackageDetails;", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public final class PackageInfoData implements Parcelable {
    public static final Parcelable.Creator<PackageInfoData> CREATOR = new b();
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final ImageObject f95032a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95033b;

    /* renamed from: c  reason: collision with root package name */
    private final PackageDetails f95034c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/product/PackageInfoData$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/product/PackageInfoData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<PackageInfoData> serializer() {
            return PackageInfoData$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<PackageInfoData> {
        /* renamed from: a */
        public final PackageInfoData createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            return new PackageInfoData(ImageObject.CREATOR.createFromParcel(parcel), parcel.readString(), PackageDetails.CREATOR.createFromParcel(parcel));
        }

        /* renamed from: b */
        public final PackageInfoData[] newArray(int i10) {
            return new PackageInfoData[i10];
        }
    }

    public /* synthetic */ PackageInfoData(int i10, ImageObject imageObject, String str, PackageDetails packageDetails, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, PackageInfoData$$serializer.INSTANCE.getDescriptor());
        }
        this.f95032a = imageObject;
        this.f95033b = str;
        this.f95034c = packageDetails;
    }

    public static final /* synthetic */ void b(PackageInfoData packageInfoData, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.i(serialDescriptor, 0, ImageObject$$serializer.INSTANCE, packageInfoData.f95032a);
        dVar.y(serialDescriptor, 1, packageInfoData.f95033b);
        dVar.i(serialDescriptor, 2, PackageDetails$$serializer.INSTANCE, packageInfoData.f95034c);
    }

    public final PackageDetails a() {
        return this.f95034c;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PackageInfoData)) {
            return false;
        }
        PackageInfoData packageInfoData = (PackageInfoData) obj;
        return C17542s.e(this.f95032a, packageInfoData.f95032a) && C17542s.e(this.f95033b, packageInfoData.f95033b) && C17542s.e(this.f95034c, packageInfoData.f95034c);
    }

    public int hashCode() {
        return (((this.f95032a.hashCode() * 31) + this.f95033b.hashCode()) * 31) + this.f95034c.hashCode();
    }

    public String toString() {
        ImageObject imageObject = this.f95032a;
        String str = this.f95033b;
        PackageDetails packageDetails = this.f95034c;
        return "PackageInfoData(image=" + imageObject + ", dimension=" + str + ", packageDetails=" + packageDetails + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        this.f95032a.writeToParcel(parcel, i10);
        parcel.writeString(this.f95033b);
        this.f95034c.writeToParcel(parcel, i10);
    }

    public PackageInfoData(ImageObject imageObject, String str, PackageDetails packageDetails) {
        C17542s.j(imageObject, "image");
        C17542s.j(str, "dimension");
        C17542s.j(packageDetails, "packageDetails");
        this.f95032a = imageObject;
        this.f95033b = str;
        this.f95034c = packageDetails;
    }
}
