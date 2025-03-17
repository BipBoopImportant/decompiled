package Nn;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e¨\u0006\u001f"}, d2 = {"LNn/c;", "Landroid/os/Parcelable;", "LNn/N;", "timeWindowCapability", "", "selected", "<init>", "(LNn/N;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LNn/N;", "b", "()LNn/N;", "Z", "()Z", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Nn.c  reason: case insensitive filesystem */
public final class C10800c implements Parcelable {
    public static final Parcelable.Creator<C10800c> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final N f84023a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f84024b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Nn.c$a */
    public static final class a implements Parcelable.Creator<C10800c> {
        /* renamed from: a */
        public final C10800c createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            return new C10800c(N.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final C10800c[] newArray(int i10) {
            return new C10800c[i10];
        }
    }

    public C10800c(N n10, boolean z10) {
        C17542s.j(n10, "timeWindowCapability");
        this.f84023a = n10;
        this.f84024b = z10;
    }

    public final boolean a() {
        return this.f84024b;
    }

    public final N b() {
        return this.f84023a;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10800c)) {
            return false;
        }
        C10800c cVar = (C10800c) obj;
        return this.f84023a == cVar.f84023a && this.f84024b == cVar.f84024b;
    }

    public int hashCode() {
        return (this.f84023a.hashCode() * 31) + Boolean.hashCode(this.f84024b);
    }

    public String toString() {
        N n10 = this.f84023a;
        boolean z10 = this.f84024b;
        return "CapabilityHolder(timeWindowCapability=" + n10 + ", selected=" + z10 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeString(this.f84023a.name());
        parcel.writeInt(this.f84024b ? 1 : 0);
    }
}
