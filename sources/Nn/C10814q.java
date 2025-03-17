package Nn;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b\u001c\u0010!¨\u0006%"}, d2 = {"LNn/q;", "Landroid/os/Parcelable;", "", "deliveryId", "LNn/M;", "earliestTimeWindow", "", "timeSlots", "cheapestEarliestPossibleSlot", "<init>", "(Ljava/lang/String;LNn/M;Ljava/util/List;LNn/M;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "LNn/M;", "c", "()LNn/M;", "Ljava/util/List;", "d", "()Ljava/util/List;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Nn.q  reason: case insensitive filesystem */
public final class C10814q implements Parcelable {
    public static final Parcelable.Creator<C10814q> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f84140a;

    /* renamed from: b  reason: collision with root package name */
    private final M f84141b;

    /* renamed from: c  reason: collision with root package name */
    private final List<M> f84142c;

    /* renamed from: d  reason: collision with root package name */
    private final M f84143d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Nn.q$a */
    public static final class a implements Parcelable.Creator<C10814q> {
        /* renamed from: a */
        public final C10814q createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            String readString = parcel.readString();
            M createFromParcel = M.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 != readInt; i10++) {
                arrayList.add(M.CREATOR.createFromParcel(parcel));
            }
            return new C10814q(readString, createFromParcel, arrayList, parcel.readInt() == 0 ? null : M.CREATOR.createFromParcel(parcel));
        }

        /* renamed from: b */
        public final C10814q[] newArray(int i10) {
            return new C10814q[i10];
        }
    }

    public C10814q(String str, M m10, List<M> list, M m11) {
        C17542s.j(str, "deliveryId");
        C17542s.j(m10, "earliestTimeWindow");
        C17542s.j(list, "timeSlots");
        this.f84140a = str;
        this.f84141b = m10;
        this.f84142c = list;
        this.f84143d = m11;
    }

    public final M a() {
        return this.f84143d;
    }

    public final String b() {
        return this.f84140a;
    }

    public final M c() {
        return this.f84141b;
    }

    public final List<M> d() {
        return this.f84142c;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10814q)) {
            return false;
        }
        C10814q qVar = (C10814q) obj;
        return C17542s.e(this.f84140a, qVar.f84140a) && C17542s.e(this.f84141b, qVar.f84141b) && C17542s.e(this.f84142c, qVar.f84142c) && C17542s.e(this.f84143d, qVar.f84143d);
    }

    public int hashCode() {
        int hashCode = ((((this.f84140a.hashCode() * 31) + this.f84141b.hashCode()) * 31) + this.f84142c.hashCode()) * 31;
        M m10 = this.f84143d;
        return hashCode + (m10 == null ? 0 : m10.hashCode());
    }

    public String toString() {
        String str = this.f84140a;
        M m10 = this.f84141b;
        List<M> list = this.f84142c;
        M m11 = this.f84143d;
        return "DeliveryTimeWindow(deliveryId=" + str + ", earliestTimeWindow=" + m10 + ", timeSlots=" + list + ", cheapestEarliestPossibleSlot=" + m11 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeString(this.f84140a);
        this.f84141b.writeToParcel(parcel, i10);
        List<M> list = this.f84142c;
        parcel.writeInt(list.size());
        for (M writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i10);
        }
        M m10 = this.f84143d;
        if (m10 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        m10.writeToParcel(parcel, i10);
    }
}
