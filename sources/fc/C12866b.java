package FC;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\b\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"LFC/b;", "Landroid/os/Parcelable;", "<init>", "()V", "", "a", "()Ljava/lang/String;", "timeSlotId", "b", "LFC/b$a;", "LFC/b$b;", "timeslot_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: FC.b  reason: case insensitive filesystem */
public abstract class C12866b implements Parcelable {

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u0011¨\u0006\u001a"}, d2 = {"LFC/b$a;", "LFC/b;", "Landroid/os/Parcelable;", "", "timeSlotId", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "timeslot_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: FC.b$a */
    public static final class a extends C12866b implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C2621a();

        /* renamed from: a  reason: collision with root package name */
        private final String f109751a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: FC.b$a$a  reason: collision with other inner class name */
        public static final class C2621a implements Parcelable.Creator<a> {
            /* renamed from: a */
            public final a createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                return new a(parcel.readString());
            }

            /* renamed from: b */
            public final a[] newArray(int i10) {
                return new a[i10];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "timeSlotId");
            this.f109751a = str;
        }

        public String a() {
            return this.f109751a;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C17542s.e(this.f109751a, ((a) obj).f109751a);
        }

        public int hashCode() {
            return this.f109751a.hashCode();
        }

        public String toString() {
            String str = this.f109751a;
            return "FullCart(timeSlotId=" + str + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeString(this.f109751a);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u0011¨\u0006\u001a"}, d2 = {"LFC/b$b;", "LFC/b;", "Landroid/os/Parcelable;", "", "timeSlotId", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "timeslot_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: FC.b$b  reason: collision with other inner class name */
    public static final class C2622b extends C12866b implements Parcelable {
        public static final Parcelable.Creator<C2622b> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final String f109752a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: FC.b$b$a */
        public static final class a implements Parcelable.Creator<C2622b> {
            /* renamed from: a */
            public final C2622b createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                return new C2622b(parcel.readString());
            }

            /* renamed from: b */
            public final C2622b[] newArray(int i10) {
                return new C2622b[i10];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2622b(String str) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "timeSlotId");
            this.f109752a = str;
        }

        public String a() {
            return this.f109752a;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2622b) && C17542s.e(this.f109752a, ((C2622b) obj).f109752a);
        }

        public int hashCode() {
            return this.f109752a.hashCode();
        }

        public String toString() {
            String str = this.f109752a;
            return "PayAhead(timeSlotId=" + str + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeString(this.f109752a);
        }
    }

    public /* synthetic */ C12866b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String a();

    private C12866b() {
    }
}
