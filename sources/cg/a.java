package Cg;

import android.os.Parcel;
import android.os.Parcelable;
import com.ingka.ikea.app.inappfeedback.q;
import com.ingka.ikea.app.inappfeedback.s;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\f\u000f\r\n\bB!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\t\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\b\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b\u0001\u0005\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"LCg/a;", "Landroid/os/Parcelable;", "", "resource", "sortOrder", "contentDescription", "<init>", "(III)V", "a", "I", "b", "()I", "c", "d", "value", "e", "LCg/a$a;", "LCg/a$b;", "LCg/a$c;", "LCg/a$d;", "LCg/a$e;", "inappfeedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a implements Parcelable {

    /* renamed from: a  reason: collision with root package name */
    private final int f58991a;

    /* renamed from: b  reason: collision with root package name */
    private final int f58992b;

    /* renamed from: c  reason: collision with root package name */
    private final int f58993c;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LCg/a$a;", "LCg/a;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "inappfeedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Cg.a$a  reason: collision with other inner class name */
    public static final class C0970a extends a {
        public static final Parcelable.Creator<C0970a> CREATOR = new C0971a();

        /* renamed from: d  reason: collision with root package name */
        public static final C0970a f58994d = new C0970a();

        /* renamed from: e  reason: collision with root package name */
        public static final int f58995e = 8;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Cg.a$a$a  reason: collision with other inner class name */
        public static final class C0971a implements Parcelable.Creator<C0970a> {
            /* renamed from: a */
            public final C0970a createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                parcel.readInt();
                return C0970a.f58994d;
            }

            /* renamed from: b */
            public final C0970a[] newArray(int i10) {
                return new C0970a[i10];
            }
        }

        private C0970a() {
            super(q.f71974b, 4, s.f71984f, (DefaultConstructorMarker) null);
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LCg/a$b;", "LCg/a;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "inappfeedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends a {
        public static final Parcelable.Creator<b> CREATOR = new C0972a();

        /* renamed from: d  reason: collision with root package name */
        public static final b f58996d = new b();

        /* renamed from: e  reason: collision with root package name */
        public static final int f58997e = 8;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Cg.a$b$a  reason: collision with other inner class name */
        public static final class C0972a implements Parcelable.Creator<b> {
            /* renamed from: a */
            public final b createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                parcel.readInt();
                return b.f58996d;
            }

            /* renamed from: b */
            public final b[] newArray(int i10) {
                return new b[i10];
            }
        }

        private b() {
            super(q.f71977e, 3, s.f71980b, (DefaultConstructorMarker) null);
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LCg/a$c;", "LCg/a;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "inappfeedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends a {
        public static final Parcelable.Creator<c> CREATOR = new C0973a();

        /* renamed from: d  reason: collision with root package name */
        public static final c f58998d = new c();

        /* renamed from: e  reason: collision with root package name */
        public static final int f58999e = 8;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Cg.a$c$a  reason: collision with other inner class name */
        public static final class C0973a implements Parcelable.Creator<c> {
            /* renamed from: a */
            public final c createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                parcel.readInt();
                return c.f58998d;
            }

            /* renamed from: b */
            public final c[] newArray(int i10) {
                return new c[i10];
            }
        }

        private c() {
            super(q.f71976d, 0, s.f71981c, (DefaultConstructorMarker) null);
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LCg/a$d;", "LCg/a;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "inappfeedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends a {
        public static final Parcelable.Creator<d> CREATOR = new C0974a();

        /* renamed from: d  reason: collision with root package name */
        public static final d f59000d = new d();

        /* renamed from: e  reason: collision with root package name */
        public static final int f59001e = 8;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Cg.a$d$a  reason: collision with other inner class name */
        public static final class C0974a implements Parcelable.Creator<d> {
            /* renamed from: a */
            public final d createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                parcel.readInt();
                return d.f59000d;
            }

            /* renamed from: b */
            public final d[] newArray(int i10) {
                return new d[i10];
            }
        }

        private d() {
            super(q.f71975c, 2, s.f71982d, (DefaultConstructorMarker) null);
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LCg/a$e;", "LCg/a;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "inappfeedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e extends a {
        public static final Parcelable.Creator<e> CREATOR = new C0975a();

        /* renamed from: d  reason: collision with root package name */
        public static final e f59002d = new e();

        /* renamed from: e  reason: collision with root package name */
        public static final int f59003e = 8;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Cg.a$e$a  reason: collision with other inner class name */
        public static final class C0975a implements Parcelable.Creator<e> {
            /* renamed from: a */
            public final e createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                parcel.readInt();
                return e.f59002d;
            }

            /* renamed from: b */
            public final e[] newArray(int i10) {
                return new e[i10];
            }
        }

        private e() {
            super(q.f71973a, 1, s.f71983e, (DefaultConstructorMarker) null);
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ a(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12);
    }

    public final int a() {
        return this.f58993c;
    }

    public final int b() {
        return this.f58991a;
    }

    public final int c() {
        return this.f58992b;
    }

    public final int d() {
        return this.f58992b + 1;
    }

    private a(int i10, int i11, int i12) {
        this.f58991a = i10;
        this.f58992b = i11;
        this.f58993c = i12;
    }
}
