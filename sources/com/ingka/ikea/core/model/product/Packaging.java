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
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 .2\u00020\u0001:\u0002/'B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nBE\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b!\u0010\u001eJ\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010 R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b)\u0010+\u001a\u0004\b-\u0010,¨\u00060"}, d2 = {"Lcom/ingka/ikea/core/model/product/Packaging;", "Landroid/os/Parcelable;", "", "title", "", "Lcom/ingka/ikea/core/model/product/ItemPackages;", "packages", "Lcom/ingka/ikea/core/model/product/Information;", "values", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "e", "(Lcom/ingka/ikea/core/model/product/Packaging;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Ljava/util/List;", "()Ljava/util/List;", "d", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Packaging implements Parcelable {
    public static final Parcelable.Creator<Packaging> CREATOR = new b();
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final KSerializer<Object>[] f95042d = {null, new C17451f(ItemPackages$$serializer.INSTANCE), new C17451f(Information$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final String f95043a;

    /* renamed from: b  reason: collision with root package name */
    private final List<ItemPackages> f95044b;

    /* renamed from: c  reason: collision with root package name */
    private final List<Information> f95045c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/product/Packaging$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/product/Packaging;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<Packaging> serializer() {
            return Packaging$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<Packaging> {
        /* renamed from: a */
        public final Packaging createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 != readInt; i10++) {
                arrayList.add(ItemPackages.CREATOR.createFromParcel(parcel));
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i11 = 0; i11 != readInt2; i11++) {
                arrayList2.add(Information.CREATOR.createFromParcel(parcel));
            }
            return new Packaging(readString, arrayList, arrayList2);
        }

        /* renamed from: b */
        public final Packaging[] newArray(int i10) {
            return new Packaging[i10];
        }
    }

    public /* synthetic */ Packaging(int i10, String str, List list, List list2, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, Packaging$$serializer.INSTANCE.getDescriptor());
        }
        this.f95043a = str;
        this.f95044b = list;
        this.f95045c = list2;
    }

    public static final /* synthetic */ void e(Packaging packaging, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f95042d;
        dVar.y(serialDescriptor, 0, packaging.f95043a);
        dVar.i(serialDescriptor, 1, kSerializerArr[1], packaging.f95044b);
        dVar.i(serialDescriptor, 2, kSerializerArr[2], packaging.f95045c);
    }

    public final List<ItemPackages> b() {
        return this.f95044b;
    }

    public final String c() {
        return this.f95043a;
    }

    public final List<Information> d() {
        return this.f95045c;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Packaging)) {
            return false;
        }
        Packaging packaging = (Packaging) obj;
        return C17542s.e(this.f95043a, packaging.f95043a) && C17542s.e(this.f95044b, packaging.f95044b) && C17542s.e(this.f95045c, packaging.f95045c);
    }

    public int hashCode() {
        return (((this.f95043a.hashCode() * 31) + this.f95044b.hashCode()) * 31) + this.f95045c.hashCode();
    }

    public String toString() {
        String str = this.f95043a;
        List<ItemPackages> list = this.f95044b;
        List<Information> list2 = this.f95045c;
        return "Packaging(title=" + str + ", packages=" + list + ", values=" + list2 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeString(this.f95043a);
        List<ItemPackages> list = this.f95044b;
        parcel.writeInt(list.size());
        for (ItemPackages writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i10);
        }
        List<Information> list2 = this.f95045c;
        parcel.writeInt(list2.size());
        for (Information writeToParcel2 : list2) {
            writeToParcel2.writeToParcel(parcel, i10);
        }
    }

    public Packaging(String str, List<ItemPackages> list, List<Information> list2) {
        C17542s.j(str, "title");
        C17542s.j(list, "packages");
        C17542s.j(list2, "values");
        this.f95043a = str;
        this.f95044b = list;
        this.f95045c = list2;
    }
}
