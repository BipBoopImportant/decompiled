package Nn;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u001a\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0016R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u001c\u0010'¨\u0006("}, d2 = {"LNn/O;", "Landroid/os/Parcelable;", "", "selectTimeWindowDescription", "", "LNn/M;", "availableTimeSlots", "cheapestEarliestPossibleSlot", "", "allowChangingTimeslot", "<init>", "(Ljava/lang/String;Ljava/util/List;LNn/M;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Ljava/util/List;", "()Ljava/util/List;", "LNn/M;", "getCheapestEarliestPossibleSlot", "()LNn/M;", "d", "Z", "()Z", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class O implements Parcelable {
    public static final Parcelable.Creator<O> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f84004a;

    /* renamed from: b  reason: collision with root package name */
    private final List<M> f84005b;

    /* renamed from: c  reason: collision with root package name */
    private final M f84006c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f84007d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<O> {
        /* renamed from: a */
        public final O createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            C17542s.j(parcel, "parcel");
            String readString = parcel.readString();
            boolean z10 = false;
            M m10 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i10 = 0; i10 != readInt; i10++) {
                    arrayList.add(M.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                m10 = M.CREATOR.createFromParcel(parcel);
            }
            M m11 = m10;
            if (parcel.readInt() != 0) {
                z10 = true;
            }
            return new O(readString, arrayList, m11, z10);
        }

        /* renamed from: b */
        public final O[] newArray(int i10) {
            return new O[i10];
        }
    }

    public O(String str, List<M> list, M m10, boolean z10) {
        this.f84004a = str;
        this.f84005b = list;
        this.f84006c = m10;
        this.f84007d = z10;
    }

    public final boolean a() {
        return this.f84007d;
    }

    public final List<M> b() {
        return this.f84005b;
    }

    public final String c() {
        return this.f84004a;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o10 = (O) obj;
        return C17542s.e(this.f84004a, o10.f84004a) && C17542s.e(this.f84005b, o10.f84005b) && C17542s.e(this.f84006c, o10.f84006c) && this.f84007d == o10.f84007d;
    }

    public int hashCode() {
        String str = this.f84004a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<M> list = this.f84005b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        M m10 = this.f84006c;
        if (m10 != null) {
            i10 = m10.hashCode();
        }
        return ((hashCode2 + i10) * 31) + Boolean.hashCode(this.f84007d);
    }

    public String toString() {
        String str = this.f84004a;
        List<M> list = this.f84005b;
        M m10 = this.f84006c;
        boolean z10 = this.f84007d;
        return "TimeWindowData(selectTimeWindowDescription=" + str + ", availableTimeSlots=" + list + ", cheapestEarliestPossibleSlot=" + m10 + ", allowChangingTimeslot=" + z10 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeString(this.f84004a);
        List<M> list = this.f84005b;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (M writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i10);
            }
        }
        M m10 = this.f84006c;
        if (m10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            m10.writeToParcel(parcel, i10);
        }
        parcel.writeInt(this.f84007d ? 1 : 0);
    }
}
