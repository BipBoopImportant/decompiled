package Mn;

import android.os.Parcel;
import android.os.Parcelable;
import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"LMn/d;", "Landroid/os/Parcelable;", "LMn/d$a;", "action", "<init>", "(LMn/d$a;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LMn/d$a;", "()LMn/d$a;", "checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new b();

    /* renamed from: a  reason: collision with root package name */
    private final a f83520a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"LMn/d$a;", "", "<init>", "(Ljava/lang/String;I)V", "START_CHECKOUT", "checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum a {
        START_CHECKOUT;

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<d> {
        /* renamed from: a */
        public final d createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            return new d(a.valueOf(parcel.readString()));
        }

        /* renamed from: b */
        public final d[] newArray(int i10) {
            return new d[i10];
        }
    }

    public d(a aVar) {
        C17542s.j(aVar, "action");
        this.f83520a = aVar;
    }

    public final a a() {
        return this.f83520a;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f83520a == ((d) obj).f83520a;
    }

    public int hashCode() {
        return this.f83520a.hashCode();
    }

    public String toString() {
        a aVar = this.f83520a;
        return "Result(action=" + aVar + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeString(this.f83520a.name());
    }
}
