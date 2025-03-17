package Py;

import XH.C16807N;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.U;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import x4.C8951o;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\tJ/\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LPy/a;", "", "Lx4/o;", "navController", "", "timeSlotId", "", "isEarlyPayment", "LXH/N;", "a", "(Lx4/o;Ljava/lang/String;Ljava/lang/Boolean;)V", "Landroidx/lifecycle/U;", "savedStatehandle", "Landroidx/lifecycle/y;", "lifecycleOwner", "Lkotlin/Function1;", "LPy/a$a;", "listener", "b", "(Landroidx/lifecycle/U;Landroidx/lifecycle/y;LnI/l;)V", "checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LPy/a$a;", "Landroid/os/Parcelable;", "<init>", "()V", "a", "c", "b", "LPy/a$a$a;", "LPy/a$a$b;", "LPy/a$a$c;", "checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Py.a$a  reason: collision with other inner class name */
    public static abstract class C2810a implements Parcelable {

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000eJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0010¨\u0006\u0019"}, d2 = {"LPy/a$a$a;", "LPy/a$a;", "", "errorMessage", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Py.a$a$a  reason: collision with other inner class name */
        public static final class C2811a extends C2810a {
            public static final Parcelable.Creator<C2811a> CREATOR = new C2812a();

            /* renamed from: a  reason: collision with root package name */
            private final String f114045a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Py.a$a$a$a  reason: collision with other inner class name */
            public static final class C2812a implements Parcelable.Creator<C2811a> {
                /* renamed from: a */
                public final C2811a createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    return new C2811a(parcel.readString());
                }

                /* renamed from: b */
                public final C2811a[] newArray(int i10) {
                    return new C2811a[i10];
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2811a(String str) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "errorMessage");
                this.f114045a = str;
            }

            public final String a() {
                return this.f114045a;
            }

            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2811a) && C17542s.e(this.f114045a, ((C2811a) obj).f114045a);
            }

            public int hashCode() {
                return this.f114045a.hashCode();
            }

            public String toString() {
                String str = this.f114045a;
                return "Error(errorMessage=" + str + ")";
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                parcel.writeString(this.f114045a);
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0011\u0010\rJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LPy/a$a$b;", "LPy/a$a;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Py.a$a$b */
        public static final class b extends C2810a implements Parcelable {
            public static final Parcelable.Creator<b> CREATOR = new C2813a();

            /* renamed from: a  reason: collision with root package name */
            public static final b f114046a = new b();

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Py.a$a$b$a  reason: collision with other inner class name */
            public static final class C2813a implements Parcelable.Creator<b> {
                /* renamed from: a */
                public final b createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    parcel.readInt();
                    return b.f114046a;
                }

                /* renamed from: b */
                public final b[] newArray(int i10) {
                    return new b[i10];
                }
            }

            private b() {
                super((DefaultConstructorMarker) null);
            }

            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -1068150404;
            }

            public String toString() {
                return "Ignore";
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0011\u0010\rJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LPy/a$a$c;", "LPy/a$a;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Py.a$a$c */
        public static final class c extends C2810a implements Parcelable {
            public static final Parcelable.Creator<c> CREATOR = new C2814a();

            /* renamed from: a  reason: collision with root package name */
            public static final c f114047a = new c();

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Py.a$a$c$a  reason: collision with other inner class name */
            public static final class C2814a implements Parcelable.Creator<c> {
                /* renamed from: a */
                public final c createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    parcel.readInt();
                    return c.f114047a;
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
                return -1909286666;
            }

            public String toString() {
                return "Paid";
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ C2810a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2810a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public static /* synthetic */ void a(a aVar, C8951o oVar, String str, Boolean bool, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    str = null;
                }
                if ((i10 & 4) != 0) {
                    bool = null;
                }
                aVar.a(oVar, str, bool);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateToScanAndGoCheckout");
        }
    }

    void a(C8951o oVar, String str, Boolean bool);

    void b(U u10, C5221y yVar, C17642l<? super C2810a, C16807N> lVar);
}
