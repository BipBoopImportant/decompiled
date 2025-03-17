package Bx;

import XH.C16814e;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.DialogFragment;
import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x4.C8951o;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0005\nJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LBx/a;", "", "LBx/a$a;", "promotionMode", "Landroidx/fragment/app/DialogFragment;", "a", "(LBx/a$a;)Landroidx/fragment/app/DialogFragment;", "Lx4/o;", "navController", "LXH/N;", "b", "(Lx4/o;LBx/a$a;)V", "profile_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"LBx/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "BACK_IN_STOCK_NOTIFICATIONS", "CART", "SHOPPING_LIST", "SCAN_AND_GO", "SCAN_AND_GO_UPGRADE_TO_FAMILY", "profile_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Bx.a$a  reason: collision with other inner class name */
    public enum C2584a {
        BACK_IN_STOCK_NOTIFICATIONS,
        CART,
        SHOPPING_LIST,
        SCAN_AND_GO,
        SCAN_AND_GO_UPGRADE_TO_FAMILY;

        static {
            C2584a[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"LBx/a$b;", "Landroid/os/Parcelable;", "<init>", "()V", "c", "b", "d", "a", "LBx/a$b$a;", "LBx/a$b$b;", "LBx/a$b$c;", "LBx/a$b$d;", "profile_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b implements Parcelable {

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0011\u0010\rJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LBx/a$b$a;", "LBx/a$b;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "profile_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Bx.a$b$a  reason: collision with other inner class name */
        public static final class C2585a extends b implements Parcelable {
            public static final Parcelable.Creator<C2585a> CREATOR = new C2586a();

            /* renamed from: a  reason: collision with root package name */
            public static final C2585a f108190a = new C2585a();

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Bx.a$b$a$a  reason: collision with other inner class name */
            public static final class C2586a implements Parcelable.Creator<C2585a> {
                /* renamed from: a */
                public final C2585a createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    parcel.readInt();
                    return C2585a.f108190a;
                }

                /* renamed from: b */
                public final C2585a[] newArray(int i10) {
                    return new C2585a[i10];
                }
            }

            private C2585a() {
                super((DefaultConstructorMarker) null);
            }

            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C2585a);
            }

            public int hashCode() {
                return 30805542;
            }

            public String toString() {
                return "Cancelled";
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0011\u0010\rJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LBx/a$b$b;", "LBx/a$b;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "profile_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Bx.a$b$b  reason: collision with other inner class name */
        public static final class C2587b extends b implements Parcelable {
            public static final Parcelable.Creator<C2587b> CREATOR = new C2588a();

            /* renamed from: a  reason: collision with root package name */
            public static final C2587b f108191a = new C2587b();

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Bx.a$b$b$a  reason: collision with other inner class name */
            public static final class C2588a implements Parcelable.Creator<C2587b> {
                /* renamed from: a */
                public final C2587b createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    parcel.readInt();
                    return C2587b.f108191a;
                }

                /* renamed from: b */
                public final C2587b[] newArray(int i10) {
                    return new C2587b[i10];
                }
            }

            private C2587b() {
                super((DefaultConstructorMarker) null);
            }

            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C2587b);
            }

            public int hashCode() {
                return -286316162;
            }

            public String toString() {
                return "Dismissed";
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0011\u0010\rJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LBx/a$b$c;", "LBx/a$b;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "profile_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c extends b implements Parcelable {
            public static final Parcelable.Creator<c> CREATOR = new C2589a();

            /* renamed from: a  reason: collision with root package name */
            public static final c f108192a = new c();

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Bx.a$b$c$a  reason: collision with other inner class name */
            public static final class C2589a implements Parcelable.Creator<c> {
                /* renamed from: a */
                public final c createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    parcel.readInt();
                    return c.f108192a;
                }

                /* renamed from: b */
                public final c[] newArray(int i10) {
                    return new c[i10];
                }
            }

            private c() {
                super((DefaultConstructorMarker) null);
            }

            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 66605778;
            }

            public String toString() {
                return "LoggedIn";
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0011\u0010\rJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LBx/a$b$d;", "LBx/a$b;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "profile_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class d extends b implements Parcelable {
            public static final Parcelable.Creator<d> CREATOR = new C2590a();

            /* renamed from: a  reason: collision with root package name */
            public static final d f108193a = new d();

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Bx.a$b$d$a  reason: collision with other inner class name */
            public static final class C2590a implements Parcelable.Creator<d> {
                /* renamed from: a */
                public final d createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    parcel.readInt();
                    return d.f108193a;
                }

                /* renamed from: b */
                public final d[] newArray(int i10) {
                    return new d[i10];
                }
            }

            private d() {
                super((DefaultConstructorMarker) null);
            }

            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return -258996942;
            }

            public String toString() {
                return "UpgradedToFamily";
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @C16814e
    DialogFragment a(C2584a aVar);

    void b(C8951o oVar, C2584a aVar);
}
