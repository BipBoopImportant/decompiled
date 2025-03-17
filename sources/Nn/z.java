package Nn;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u0011¨\u0006\u001c"}, d2 = {"LNn/z;", "Landroid/os/Parcelable;", "", "dayOfWeek", "", "openingSpan", "<init>", "(ILjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z implements Parcelable {
    public static final Parcelable.Creator<z> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final int f84166a;

    /* renamed from: b  reason: collision with root package name */
    private final String f84167b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<z> {
        /* renamed from: a */
        public final z createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            return new z(parcel.readInt(), parcel.readString());
        }

        /* renamed from: b */
        public final z[] newArray(int i10) {
            return new z[i10];
        }
    }

    public z(int i10, String str) {
        this.f84166a = i10;
        this.f84167b = str;
    }

    public final int a() {
        return this.f84166a;
    }

    public final String b() {
        return this.f84167b;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f84166a == zVar.f84166a && C17542s.e(this.f84167b, zVar.f84167b);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f84166a) * 31;
        String str = this.f84167b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        int i10 = this.f84166a;
        String str = this.f84167b;
        return "OpeningHourHolder(dayOfWeek=" + i10 + ", openingSpan=" + str + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeInt(this.f84166a);
        parcel.writeString(this.f84167b);
    }
}
