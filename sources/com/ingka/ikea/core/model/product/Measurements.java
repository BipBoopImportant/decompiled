package com.ingka.ikea.core.model.product;

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
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 .2\u00020\u0001:\u0002/&B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010\u001dJ\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b(\u0010,\u001a\u0004\b&\u0010-¨\u00060"}, d2 = {"Lcom/ingka/ikea/core/model/product/Measurements;", "Landroid/os/Parcelable;", "", "title", "Lcom/ingka/ikea/core/model/product/ProductMeasurements;", "productMeasurements", "Lcom/ingka/ikea/core/model/product/Packaging;", "packaging", "<init>", "(Ljava/lang/String;Lcom/ingka/ikea/core/model/product/ProductMeasurements;Lcom/ingka/ikea/core/model/product/Packaging;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/ingka/ikea/core/model/product/ProductMeasurements;Lcom/ingka/ikea/core/model/product/Packaging;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/core/model/product/Measurements;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Lcom/ingka/ikea/core/model/product/ProductMeasurements;", "()Lcom/ingka/ikea/core/model/product/ProductMeasurements;", "Lcom/ingka/ikea/core/model/product/Packaging;", "()Lcom/ingka/ikea/core/model/product/Packaging;", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Measurements implements Parcelable {
    public static final Parcelable.Creator<Measurements> CREATOR = new b();
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f94996a;

    /* renamed from: b  reason: collision with root package name */
    private final ProductMeasurements f94997b;

    /* renamed from: c  reason: collision with root package name */
    private final Packaging f94998c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/product/Measurements$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/product/Measurements;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<Measurements> serializer() {
            return Measurements$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<Measurements> {
        /* renamed from: a */
        public final Measurements createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            return new Measurements(parcel.readString(), ProductMeasurements.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Packaging.CREATOR.createFromParcel(parcel));
        }

        /* renamed from: b */
        public final Measurements[] newArray(int i10) {
            return new Measurements[i10];
        }
    }

    public /* synthetic */ Measurements(int i10, String str, ProductMeasurements productMeasurements, Packaging packaging, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, Measurements$$serializer.INSTANCE.getDescriptor());
        }
        this.f94996a = str;
        this.f94997b = productMeasurements;
        this.f94998c = packaging;
    }

    public static final /* synthetic */ void d(Measurements measurements, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, measurements.f94996a);
        dVar.i(serialDescriptor, 1, ProductMeasurements$$serializer.INSTANCE, measurements.f94997b);
        dVar.B(serialDescriptor, 2, Packaging$$serializer.INSTANCE, measurements.f94998c);
    }

    public final Packaging a() {
        return this.f94998c;
    }

    public final ProductMeasurements b() {
        return this.f94997b;
    }

    public final String c() {
        return this.f94996a;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Measurements)) {
            return false;
        }
        Measurements measurements = (Measurements) obj;
        return C17542s.e(this.f94996a, measurements.f94996a) && C17542s.e(this.f94997b, measurements.f94997b) && C17542s.e(this.f94998c, measurements.f94998c);
    }

    public int hashCode() {
        int hashCode = ((this.f94996a.hashCode() * 31) + this.f94997b.hashCode()) * 31;
        Packaging packaging = this.f94998c;
        return hashCode + (packaging == null ? 0 : packaging.hashCode());
    }

    public String toString() {
        String str = this.f94996a;
        ProductMeasurements productMeasurements = this.f94997b;
        Packaging packaging = this.f94998c;
        return "Measurements(title=" + str + ", productMeasurements=" + productMeasurements + ", packaging=" + packaging + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeString(this.f94996a);
        this.f94997b.writeToParcel(parcel, i10);
        Packaging packaging = this.f94998c;
        if (packaging == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        packaging.writeToParcel(parcel, i10);
    }

    public Measurements(String str, ProductMeasurements productMeasurements, Packaging packaging) {
        C17542s.j(str, "title");
        C17542s.j(productMeasurements, "productMeasurements");
        this.f94996a = str;
        this.f94997b = productMeasurements;
        this.f94998c = packaging;
    }
}
