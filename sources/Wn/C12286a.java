package wn;

import android.os.Parcel;
import android.os.Parcelable;
import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lwn/a;", "Landroid/os/Parcelable;", "", "", "key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "CATEGORIES", "ROOMS", "COMM_POSTS", "SEARCH", "RECOMMENDATION", "OFFERS", "PRODUCTS", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wn.a  reason: case insensitive filesystem */
public enum C12286a implements Parcelable {
    CATEGORIES("categories"),
    ROOMS("rooms"),
    COMM_POSTS("campaigns"),
    SEARCH("search"),
    RECOMMENDATION("user/recommendations"),
    OFFERS("offers"),
    PRODUCTS("products");
    
    public static final Parcelable.Creator<C12286a> CREATOR = null;
    private final String key;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wn.a$a  reason: collision with other inner class name */
    public static final class C2508a implements Parcelable.Creator<C12286a> {
        /* renamed from: a */
        public final C12286a createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            return C12286a.valueOf(parcel.readString());
        }

        /* renamed from: b */
        public final C12286a[] newArray(int i10) {
            return new C12286a[i10];
        }
    }

    static {
        C12286a[] a10;
        $ENTRIES = C17221b.a(a10);
        CREATOR = new C2508a();
    }

    private C12286a(String str) {
        this.key = str;
    }

    public final String b() {
        return this.key;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeString(name());
    }
}
