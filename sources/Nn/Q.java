package Nn;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"LNn/Q;", "Landroid/os/Parcelable;", "", "itemNumber", "", "availableQuantity", "requestedQuantity", "<init>", "(Ljava/lang/String;II)V", "Landroid/os/Parcel;", "dest", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "c", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Q implements Parcelable {
    public static final Parcelable.Creator<Q> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f84008a;

    /* renamed from: b  reason: collision with root package name */
    private final int f84009b;

    /* renamed from: c  reason: collision with root package name */
    private final int f84010c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Q> {
        /* renamed from: a */
        public final Q createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            return new Q(parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        /* renamed from: b */
        public final Q[] newArray(int i10) {
            return new Q[i10];
        }
    }

    public Q(String str, int i10, int i11) {
        C17542s.j(str, "itemNumber");
        this.f84008a = str;
        this.f84009b = i10;
        this.f84010c = i11;
    }

    public final int a() {
        return this.f84009b;
    }

    public final String b() {
        return this.f84008a;
    }

    public final int c() {
        return this.f84010c;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q10 = (Q) obj;
        return C17542s.e(this.f84008a, q10.f84008a) && this.f84009b == q10.f84009b && this.f84010c == q10.f84010c;
    }

    public int hashCode() {
        return (((this.f84008a.hashCode() * 31) + Integer.hashCode(this.f84009b)) * 31) + Integer.hashCode(this.f84010c);
    }

    public String toString() {
        String str = this.f84008a;
        int i10 = this.f84009b;
        int i11 = this.f84010c;
        return "UnavailableCheckoutItem(itemNumber=" + str + ", availableQuantity=" + i10 + ", requestedQuantity=" + i11 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeString(this.f84008a);
        parcel.writeInt(this.f84009b);
        parcel.writeInt(this.f84010c);
    }
}
