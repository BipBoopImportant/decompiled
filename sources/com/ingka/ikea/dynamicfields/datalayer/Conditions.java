package com.ingka.ikea.dynamicfields.datalayer;

import android.os.Parcel;
import android.os.Parcelable;
import fK.p;
import jK.C17451f;
import jK.E0;
import jK.T0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

@p
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 *2\u00020\u0001:\u0002+$B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001aJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'¨\u0006,"}, d2 = {"Lcom/ingka/ikea/dynamicfields/datalayer/Conditions;", "Landroid/os/Parcelable;", "", "Lcom/ingka/ikea/dynamicfields/datalayer/KeyRegex;", "conditions", "<init>", "(Ljava/util/List;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/dynamicfields/datalayer/Conditions;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "getConditions$annotations", "()V", "Companion", "$serializer", "dynamicfields-datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Conditions implements Parcelable {
    public static final Parcelable.Creator<Conditions> CREATOR = new b();
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final KSerializer<Object>[] f95661b = {new C17451f(KeyRegex$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final List<KeyRegex> f95662a;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/dynamicfields/datalayer/Conditions$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/dynamicfields/datalayer/Conditions;", "serializer", "()Lkotlinx/serialization/KSerializer;", "dynamicfields-datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<Conditions> serializer() {
            return Conditions$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<Conditions> {
        /* renamed from: a */
        public final Conditions createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 != readInt; i10++) {
                arrayList.add(KeyRegex.CREATOR.createFromParcel(parcel));
            }
            return new Conditions(arrayList);
        }

        /* renamed from: b */
        public final Conditions[] newArray(int i10) {
            return new Conditions[i10];
        }
    }

    public /* synthetic */ Conditions(int i10, List list, T0 t02) {
        if (1 != (i10 & 1)) {
            E0.b(i10, 1, Conditions$$serializer.INSTANCE.getDescriptor());
        }
        this.f95662a = list;
    }

    public final List<KeyRegex> b() {
        return this.f95662a;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Conditions) && C17542s.e(this.f95662a, ((Conditions) obj).f95662a);
    }

    public int hashCode() {
        return this.f95662a.hashCode();
    }

    public String toString() {
        List<KeyRegex> list = this.f95662a;
        return "Conditions(conditions=" + list + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        List<KeyRegex> list = this.f95662a;
        parcel.writeInt(list.size());
        for (KeyRegex writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i10);
        }
    }

    public Conditions(List<KeyRegex> list) {
        C17542s.j(list, "conditions");
        this.f95662a = list;
    }
}
