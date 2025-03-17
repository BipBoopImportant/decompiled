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
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 -2\u00020\u0001:\u0002.&B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010\u001dJ\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u001fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b)\u0010\u001fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b(\u0010*\u001a\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/ingka/ikea/core/model/product/ProductMeasurements;", "Landroid/os/Parcelable;", "", "imageUrl", "disclaimer", "", "Lcom/ingka/ikea/core/model/product/Information;", "values", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "e", "(Lcom/ingka/ikea/core/model/product/ProductMeasurements;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProductMeasurements implements Parcelable {
    public static final Parcelable.Creator<ProductMeasurements> CREATOR = new b();
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final KSerializer<Object>[] f95141d = {null, null, new C17451f(Information$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final String f95142a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95143b;

    /* renamed from: c  reason: collision with root package name */
    private final List<Information> f95144c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/product/ProductMeasurements$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/product/ProductMeasurements;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ProductMeasurements> serializer() {
            return ProductMeasurements$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ProductMeasurements> {
        /* renamed from: a */
        public final ProductMeasurements createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 != readInt; i10++) {
                arrayList.add(Information.CREATOR.createFromParcel(parcel));
            }
            return new ProductMeasurements(readString, readString2, arrayList);
        }

        /* renamed from: b */
        public final ProductMeasurements[] newArray(int i10) {
            return new ProductMeasurements[i10];
        }
    }

    public /* synthetic */ ProductMeasurements(int i10, String str, String str2, List list, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, ProductMeasurements$$serializer.INSTANCE.getDescriptor());
        }
        this.f95142a = str;
        this.f95143b = str2;
        this.f95144c = list;
    }

    public static final /* synthetic */ void e(ProductMeasurements productMeasurements, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f95141d;
        dVar.y(serialDescriptor, 0, productMeasurements.f95142a);
        dVar.B(serialDescriptor, 1, Y0.f144077a, productMeasurements.f95143b);
        dVar.i(serialDescriptor, 2, kSerializerArr[2], productMeasurements.f95144c);
    }

    public final String b() {
        return this.f95143b;
    }

    public final String c() {
        return this.f95142a;
    }

    public final List<Information> d() {
        return this.f95144c;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductMeasurements)) {
            return false;
        }
        ProductMeasurements productMeasurements = (ProductMeasurements) obj;
        return C17542s.e(this.f95142a, productMeasurements.f95142a) && C17542s.e(this.f95143b, productMeasurements.f95143b) && C17542s.e(this.f95144c, productMeasurements.f95144c);
    }

    public int hashCode() {
        int hashCode = this.f95142a.hashCode() * 31;
        String str = this.f95143b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f95144c.hashCode();
    }

    public String toString() {
        String str = this.f95142a;
        String str2 = this.f95143b;
        List<Information> list = this.f95144c;
        return "ProductMeasurements(imageUrl=" + str + ", disclaimer=" + str2 + ", values=" + list + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeString(this.f95142a);
        parcel.writeString(this.f95143b);
        List<Information> list = this.f95144c;
        parcel.writeInt(list.size());
        for (Information writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i10);
        }
    }

    public ProductMeasurements(String str, String str2, List<Information> list) {
        C17542s.j(str, "imageUrl");
        C17542s.j(list, "values");
        this.f95142a = str;
        this.f95143b = str2;
        this.f95144c = list;
    }
}
