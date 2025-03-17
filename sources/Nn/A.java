package Nn;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011¨\u0006\u001b"}, d2 = {"LNn/A;", "Landroid/os/Parcelable;", "", "icon", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class A implements Parcelable {
    public static final Parcelable.Creator<A> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f83834a;

    /* renamed from: b  reason: collision with root package name */
    private final String f83835b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<A> {
        /* renamed from: a */
        public final A createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            return new A(parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final A[] newArray(int i10) {
            return new A[i10];
        }
    }

    public A(String str, String str2) {
        C17542s.j(str, "icon");
        C17542s.j(str2, "name");
        this.f83834a = str;
        this.f83835b = str2;
    }

    public final String a() {
        return this.f83834a;
    }

    public final String b() {
        return this.f83835b;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a10 = (A) obj;
        return C17542s.e(this.f83834a, a10.f83834a) && C17542s.e(this.f83835b, a10.f83835b);
    }

    public int hashCode() {
        return (this.f83834a.hashCode() * 31) + this.f83835b.hashCode();
    }

    public String toString() {
        String str = this.f83834a;
        String str2 = this.f83835b;
        return "ParticipatingBank(icon=" + str + ", name=" + str2 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeString(this.f83834a);
        parcel.writeString(this.f83835b);
    }
}
