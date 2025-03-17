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
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 -2\u00020\u0001:\u0002.&B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010\u001cJ\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,¨\u0006/"}, d2 = {"Lcom/ingka/ikea/core/model/product/PackagesMeasurements;", "Landroid/os/Parcelable;", "", "Lcom/ingka/ikea/core/model/product/Information;", "values", "Lcom/ingka/ikea/core/model/product/PackagesQuantity;", "quantity", "<init>", "(Ljava/util/List;Lcom/ingka/ikea/core/model/product/PackagesQuantity;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/ingka/ikea/core/model/product/PackagesQuantity;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/core/model/product/PackagesMeasurements;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Lcom/ingka/ikea/core/model/product/PackagesQuantity;", "()Lcom/ingka/ikea/core/model/product/PackagesQuantity;", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PackagesMeasurements implements Parcelable {
    public static final Parcelable.Creator<PackagesMeasurements> CREATOR = new b();
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer<Object>[] f95037c = {new C17451f(Information$$serializer.INSTANCE), null};

    /* renamed from: a  reason: collision with root package name */
    private final List<Information> f95038a;

    /* renamed from: b  reason: collision with root package name */
    private final PackagesQuantity f95039b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/product/PackagesMeasurements$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/product/PackagesMeasurements;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<PackagesMeasurements> serializer() {
            return PackagesMeasurements$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<PackagesMeasurements> {
        /* renamed from: a */
        public final PackagesMeasurements createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 != readInt; i10++) {
                arrayList.add(Information.CREATOR.createFromParcel(parcel));
            }
            return new PackagesMeasurements(arrayList, PackagesQuantity.CREATOR.createFromParcel(parcel));
        }

        /* renamed from: b */
        public final PackagesMeasurements[] newArray(int i10) {
            return new PackagesMeasurements[i10];
        }
    }

    public /* synthetic */ PackagesMeasurements(int i10, List list, PackagesQuantity packagesQuantity, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, PackagesMeasurements$$serializer.INSTANCE.getDescriptor());
        }
        this.f95038a = list;
        this.f95039b = packagesQuantity;
    }

    public static final /* synthetic */ void d(PackagesMeasurements packagesMeasurements, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.i(serialDescriptor, 0, f95037c[0], packagesMeasurements.f95038a);
        dVar.i(serialDescriptor, 1, PackagesQuantity$$serializer.INSTANCE, packagesMeasurements.f95039b);
    }

    public final PackagesQuantity b() {
        return this.f95039b;
    }

    public final List<Information> c() {
        return this.f95038a;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PackagesMeasurements)) {
            return false;
        }
        PackagesMeasurements packagesMeasurements = (PackagesMeasurements) obj;
        return C17542s.e(this.f95038a, packagesMeasurements.f95038a) && C17542s.e(this.f95039b, packagesMeasurements.f95039b);
    }

    public int hashCode() {
        return (this.f95038a.hashCode() * 31) + this.f95039b.hashCode();
    }

    public String toString() {
        List<Information> list = this.f95038a;
        PackagesQuantity packagesQuantity = this.f95039b;
        return "PackagesMeasurements(values=" + list + ", quantity=" + packagesQuantity + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        List<Information> list = this.f95038a;
        parcel.writeInt(list.size());
        for (Information writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i10);
        }
        this.f95039b.writeToParcel(parcel, i10);
    }

    public PackagesMeasurements(List<Information> list, PackagesQuantity packagesQuantity) {
        C17542s.j(list, "values");
        C17542s.j(packagesQuantity, "quantity");
        this.f95038a = list;
        this.f95039b = packagesQuantity;
    }
}
