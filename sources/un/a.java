package Un;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LUn/a;", "Landroid/os/Parcelable;", "<init>", "()V", "b", "a", "LUn/a$a;", "LUn/a$b;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a implements Parcelable {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0003\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u0012¨\u0006\u001d"}, d2 = {"LUn/a$a;", "LUn/a;", "", "isFullyAvailable", "", "storeId", "<init>", "(ZLjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Ljava/lang/String;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Un.a$a  reason: collision with other inner class name */
    public static final class C1852a extends a {
        public static final Parcelable.Creator<C1852a> CREATOR = new C1853a();

        /* renamed from: a  reason: collision with root package name */
        private final boolean f88317a;

        /* renamed from: b  reason: collision with root package name */
        private final String f88318b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Un.a$a$a  reason: collision with other inner class name */
        public static final class C1853a implements Parcelable.Creator<C1852a> {
            /* renamed from: a */
            public final C1852a createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                return new C1852a(parcel.readInt() != 0, parcel.readString());
            }

            /* renamed from: b */
            public final C1852a[] newArray(int i10) {
                return new C1852a[i10];
            }
        }

        public C1852a(boolean z10, String str) {
            super((DefaultConstructorMarker) null);
            this.f88317a = z10;
            this.f88318b = str;
        }

        public final String a() {
            return this.f88318b;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1852a)) {
                return false;
            }
            C1852a aVar = (C1852a) obj;
            return this.f88317a == aVar.f88317a && C17542s.e(this.f88318b, aVar.f88318b);
        }

        public int hashCode() {
            int hashCode = Boolean.hashCode(this.f88317a) * 31;
            String str = this.f88318b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            boolean z10 = this.f88317a;
            String str = this.f88318b;
            return "Collect(isFullyAvailable=" + z10 + ", storeId=" + str + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeInt(this.f88317a ? 1 : 0);
            parcel.writeString(this.f88318b);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0003\u0010\u0019¨\u0006\u001a"}, d2 = {"LUn/a$b;", "LUn/a;", "", "isFullyAvailable", "<init>", "(Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends a {
        public static final Parcelable.Creator<b> CREATOR = new C1854a();

        /* renamed from: a  reason: collision with root package name */
        private final boolean f88319a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Un.a$b$a  reason: collision with other inner class name */
        public static final class C1854a implements Parcelable.Creator<b> {
            /* renamed from: a */
            public final b createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                return new b(parcel.readInt() != 0);
            }

            /* renamed from: b */
            public final b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(boolean z10) {
            super((DefaultConstructorMarker) null);
            this.f88319a = z10;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f88319a == ((b) obj).f88319a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f88319a);
        }

        public String toString() {
            boolean z10 = this.f88319a;
            return "Home(isFullyAvailable=" + z10 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeInt(this.f88319a ? 1 : 0);
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private a() {
    }
}
