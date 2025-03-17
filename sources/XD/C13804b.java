package XD;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import x4.C;
import x4.C8951o;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\tJ#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"LXD/b;", "", "Lx4/o;", "navController", "Lx4/C;", "navOptions", "LXH/N;", "b", "(Lx4/o;Lx4/C;)V", "a", "welcome_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: XD.b  reason: case insensitive filesystem */
public interface C13804b {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LXD/b$a;", "Landroid/os/Parcelable;", "b", "a", "LXD/b$a$a;", "LXD/b$a$b;", "welcome_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: XD.b$a */
    public interface a extends Parcelable {

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0011\u0010\rJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LXD/b$a$a;", "LXD/b$a;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "welcome_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: XD.b$a$a  reason: collision with other inner class name */
        public static final class C2914a implements a, Parcelable {
            public static final Parcelable.Creator<C2914a> CREATOR = new C2915a();

            /* renamed from: a  reason: collision with root package name */
            public static final C2914a f117803a = new C2914a();

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: XD.b$a$a$a  reason: collision with other inner class name */
            public static final class C2915a implements Parcelable.Creator<C2914a> {
                /* renamed from: a */
                public final C2914a createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    parcel.readInt();
                    return C2914a.f117803a;
                }

                /* renamed from: b */
                public final C2914a[] newArray(int i10) {
                    return new C2914a[i10];
                }
            }

            private C2914a() {
            }

            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C2914a);
            }

            public int hashCode() {
                return 1304262233;
            }

            public String toString() {
                return "Cancelled";
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0011\u0010\rJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LXD/b$a$b;", "LXD/b$a;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "welcome_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: XD.b$a$b  reason: collision with other inner class name */
        public static final class C2916b implements a, Parcelable {
            public static final Parcelable.Creator<C2916b> CREATOR = new C2917a();

            /* renamed from: a  reason: collision with root package name */
            public static final C2916b f117804a = new C2916b();

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: XD.b$a$b$a  reason: collision with other inner class name */
            public static final class C2917a implements Parcelable.Creator<C2916b> {
                /* renamed from: a */
                public final C2916b createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    parcel.readInt();
                    return C2916b.f117804a;
                }

                /* renamed from: b */
                public final C2916b[] newArray(int i10) {
                    return new C2916b[i10];
                }
            }

            private C2916b() {
            }

            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C2916b);
            }

            public int hashCode() {
                return 596258571;
            }

            public String toString() {
                return "Success";
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                parcel.writeInt(1);
            }
        }
    }

    void a(C8951o oVar, C c10);

    void b(C8951o oVar, C c10);
}
