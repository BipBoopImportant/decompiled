package Fp;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000fJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001c\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001b\u0010\u000f¨\u0006\u001d"}, d2 = {"LFp/e;", "Landroid/os/Parcelable;", "", "image", "title", "message", "<init>", "(III)V", "Landroid/os/Parcel;", "dest", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "dataethics-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final int f81007a;

    /* renamed from: b  reason: collision with root package name */
    private final int f81008b;

    /* renamed from: c  reason: collision with root package name */
    private final int f81009c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<e> {
        /* renamed from: a */
        public final e createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            return new e(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* renamed from: b */
        public final e[] newArray(int i10) {
            return new e[i10];
        }
    }

    public e(int i10, int i11, int i12) {
        this.f81007a = i10;
        this.f81008b = i11;
        this.f81009c = i12;
    }

    public final int a() {
        return this.f81007a;
    }

    public final int b() {
        return this.f81009c;
    }

    public final int c() {
        return this.f81008b;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f81007a == eVar.f81007a && this.f81008b == eVar.f81008b && this.f81009c == eVar.f81009c;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f81007a) * 31) + Integer.hashCode(this.f81008b)) * 31) + Integer.hashCode(this.f81009c);
    }

    public String toString() {
        int i10 = this.f81007a;
        int i11 = this.f81008b;
        int i12 = this.f81009c;
        return "HeaderWithImageData(image=" + i10 + ", title=" + i11 + ", message=" + i12 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeInt(this.f81007a);
        parcel.writeInt(this.f81008b);
        parcel.writeInt(this.f81009c);
    }
}
