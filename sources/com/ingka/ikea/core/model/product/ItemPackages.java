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
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u0000 12\u00020\u0001:\u00022(B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bBS\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\"\u0010\u001fJ\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010)\u001a\u0004\b+\u0010!R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b,\u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010!R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b.\u00100¨\u00063"}, d2 = {"Lcom/ingka/ikea/core/model/product/ItemPackages;", "Landroid/os/Parcelable;", "", "description", "itemNo", "name", "warning", "", "Lcom/ingka/ikea/core/model/product/PackagesMeasurements;", "packageMeasurements", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "g", "(Lcom/ingka/ikea/core/model/product/ItemPackages;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "f", "e", "Ljava/util/List;", "()Ljava/util/List;", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ItemPackages implements Parcelable {
    public static final Parcelable.Creator<ItemPackages> CREATOR = new b();
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final KSerializer<Object>[] f94988f = {null, null, null, null, new C17451f(PackagesMeasurements$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final String f94989a;

    /* renamed from: b  reason: collision with root package name */
    private final String f94990b;

    /* renamed from: c  reason: collision with root package name */
    private final String f94991c;

    /* renamed from: d  reason: collision with root package name */
    private final String f94992d;

    /* renamed from: e  reason: collision with root package name */
    private final List<PackagesMeasurements> f94993e;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/product/ItemPackages$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/product/ItemPackages;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ItemPackages> serializer() {
            return ItemPackages$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ItemPackages> {
        /* renamed from: a */
        public final ItemPackages createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 != readInt; i10++) {
                arrayList.add(PackagesMeasurements.CREATOR.createFromParcel(parcel));
            }
            return new ItemPackages(readString, readString2, readString3, readString4, arrayList);
        }

        /* renamed from: b */
        public final ItemPackages[] newArray(int i10) {
            return new ItemPackages[i10];
        }
    }

    public /* synthetic */ ItemPackages(int i10, String str, String str2, String str3, String str4, List list, T0 t02) {
        if (31 != (i10 & 31)) {
            E0.b(i10, 31, ItemPackages$$serializer.INSTANCE.getDescriptor());
        }
        this.f94989a = str;
        this.f94990b = str2;
        this.f94991c = str3;
        this.f94992d = str4;
        this.f94993e = list;
    }

    public static final /* synthetic */ void g(ItemPackages itemPackages, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f94988f;
        dVar.y(serialDescriptor, 0, itemPackages.f94989a);
        dVar.y(serialDescriptor, 1, itemPackages.f94990b);
        dVar.y(serialDescriptor, 2, itemPackages.f94991c);
        dVar.B(serialDescriptor, 3, Y0.f144077a, itemPackages.f94992d);
        dVar.i(serialDescriptor, 4, kSerializerArr[4], itemPackages.f94993e);
    }

    public final String b() {
        return this.f94989a;
    }

    public final String c() {
        return this.f94990b;
    }

    public final String d() {
        return this.f94991c;
    }

    public final int describeContents() {
        return 0;
    }

    public final List<PackagesMeasurements> e() {
        return this.f94993e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemPackages)) {
            return false;
        }
        ItemPackages itemPackages = (ItemPackages) obj;
        return C17542s.e(this.f94989a, itemPackages.f94989a) && C17542s.e(this.f94990b, itemPackages.f94990b) && C17542s.e(this.f94991c, itemPackages.f94991c) && C17542s.e(this.f94992d, itemPackages.f94992d) && C17542s.e(this.f94993e, itemPackages.f94993e);
    }

    public final String f() {
        return this.f94992d;
    }

    public int hashCode() {
        int hashCode = ((((this.f94989a.hashCode() * 31) + this.f94990b.hashCode()) * 31) + this.f94991c.hashCode()) * 31;
        String str = this.f94992d;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f94993e.hashCode();
    }

    public String toString() {
        String str = this.f94989a;
        String str2 = this.f94990b;
        String str3 = this.f94991c;
        String str4 = this.f94992d;
        List<PackagesMeasurements> list = this.f94993e;
        return "ItemPackages(description=" + str + ", itemNo=" + str2 + ", name=" + str3 + ", warning=" + str4 + ", packageMeasurements=" + list + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeString(this.f94989a);
        parcel.writeString(this.f94990b);
        parcel.writeString(this.f94991c);
        parcel.writeString(this.f94992d);
        List<PackagesMeasurements> list = this.f94993e;
        parcel.writeInt(list.size());
        for (PackagesMeasurements writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i10);
        }
    }

    public ItemPackages(String str, String str2, String str3, String str4, List<PackagesMeasurements> list) {
        C17542s.j(str, "description");
        C17542s.j(str2, "itemNo");
        C17542s.j(str3, "name");
        C17542s.j(list, "packageMeasurements");
        this.f94989a = str;
        this.f94990b = str2;
        this.f94991c = str3;
        this.f94992d = str4;
        this.f94993e = list;
    }
}
