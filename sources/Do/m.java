package Do;

import Nn.u;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LDo/m;", "Landroid/os/Parcelable;", "<init>", "()V", "b", "c", "a", "LDo/m$a;", "LDo/m$b;", "LDo/m$c;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class m implements Parcelable {

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LDo/m$a;", "LDo/m;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends m {
        public static final Parcelable.Creator<a> CREATOR = new C1507a();

        /* renamed from: a  reason: collision with root package name */
        public static final a f80102a = new a();

        /* renamed from: b  reason: collision with root package name */
        public static final int f80103b = 8;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Do.m$a$a  reason: collision with other inner class name */
        public static final class C1507a implements Parcelable.Creator<a> {
            /* renamed from: a */
            public final a createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                parcel.readInt();
                return a.f80102a;
            }

            /* renamed from: b */
            public final a[] newArray(int i10) {
                return new a[i10];
            }
        }

        private a() {
            super((DefaultConstructorMarker) null);
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 1455626408;
        }

        public String toString() {
            return "Combined";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"LDo/m$b;", "LDo/m;", "LNn/u;", "serviceType", "<init>", "(LNn/u;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LNn/u;", "()LNn/u;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends m {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        public static final int f80104b = 8;

        /* renamed from: a  reason: collision with root package name */
        private final u f80105a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<b> {
            /* renamed from: a */
            public final b createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                return new b(u.valueOf(parcel.readString()));
            }

            /* renamed from: b */
            public final b[] newArray(int i10) {
                return new b[i10];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(u uVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(uVar, "serviceType");
            this.f80105a = uVar;
        }

        public final u a() {
            return this.f80105a;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f80105a == ((b) obj).f80105a;
        }

        public int hashCode() {
            return this.f80105a.hashCode();
        }

        public String toString() {
            u uVar = this.f80105a;
            return "HomeDeliveryOption(serviceType=" + uVar + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeString(this.f80105a.name());
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000eJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0010¨\u0006\u0019"}, d2 = {"LDo/m$c;", "LDo/m;", "", "identifier", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends m {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        public static final int f80106b = 8;

        /* renamed from: a  reason: collision with root package name */
        private final String f80107a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<c> {
            /* renamed from: a */
            public final c createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                return new c(parcel.readString());
            }

            /* renamed from: b */
            public final c[] newArray(int i10) {
                return new c[i10];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "identifier");
            this.f80107a = str;
        }

        public final String a() {
            return this.f80107a;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C17542s.e(this.f80107a, ((c) obj).f80107a);
        }

        public int hashCode() {
            return this.f80107a.hashCode();
        }

        public String toString() {
            String str = this.f80107a;
            return "PickUpPoint(identifier=" + str + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeString(this.f80107a);
        }
    }

    public /* synthetic */ m(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private m() {
    }
}
