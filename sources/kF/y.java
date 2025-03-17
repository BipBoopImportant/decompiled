package Kf;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u000f¨\u0006\u001c"}, d2 = {"LKf/y;", "Landroid/os/Parcelable;", "", "productNumber", "", "quantity", "<init>", "(Ljava/lang/String;I)V", "Landroid/os/Parcel;", "dest", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y implements Parcelable {
    public static final Parcelable.Creator<y> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f61527a;

    /* renamed from: b  reason: collision with root package name */
    private final int f61528b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<y> {
        /* renamed from: a */
        public final y createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            return new y(parcel.readString(), parcel.readInt());
        }

        /* renamed from: b */
        public final y[] newArray(int i10) {
            return new y[i10];
        }
    }

    public y(String str, int i10) {
        C17542s.j(str, "productNumber");
        this.f61527a = str;
        this.f61528b = i10;
    }

    public final String a() {
        return this.f61527a;
    }

    public final int b() {
        return this.f61528b;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return C17542s.e(this.f61527a, yVar.f61527a) && this.f61528b == yVar.f61528b;
    }

    public int hashCode() {
        return (this.f61527a.hashCode() * 31) + Integer.hashCode(this.f61528b);
    }

    public String toString() {
        String str = this.f61527a;
        int i10 = this.f61528b;
        return "CartItem(productNumber=" + str + ", quantity=" + i10 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeString(this.f61527a);
        parcel.writeInt(this.f61528b);
    }
}
