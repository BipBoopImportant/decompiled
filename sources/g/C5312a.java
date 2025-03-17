package g;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0017B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0019¨\u0006\u001b"}, d2 = {"Lg/a;", "Landroid/os/Parcelable;", "", "resultCode", "Landroid/content/Intent;", "data", "<init>", "(ILandroid/content/Intent;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "", "toString", "()Ljava/lang/String;", "dest", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "I", "b", "Landroid/content/Intent;", "()Landroid/content/Intent;", "c", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
/* renamed from: g.a  reason: case insensitive filesystem */
public final class C5312a implements Parcelable {
    public static final Parcelable.Creator<C5312a> CREATOR = new C0377a();

    /* renamed from: c  reason: collision with root package name */
    public static final b f23298c = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f23299a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f23300b;

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"g/a$a", "Landroid/os/Parcelable$Creator;", "Lg/a;", "Landroid/os/Parcel;", "parcel", "a", "(Landroid/os/Parcel;)Lg/a;", "", "size", "", "b", "(I)[Lg/a;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g.a$a  reason: collision with other inner class name */
    public static final class C0377a implements Parcelable.Creator<C5312a> {
        C0377a() {
        }

        /* renamed from: a */
        public C5312a createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            return new C5312a(parcel);
        }

        /* renamed from: b */
        public C5312a[] newArray(int i10) {
            return new C5312a[i10];
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lg/a$b;", "", "<init>", "()V", "", "resultCode", "", "a", "(I)Ljava/lang/String;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g.a$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(int i10) {
            return i10 != -1 ? i10 != 0 ? String.valueOf(i10) : "RESULT_CANCELED" : "RESULT_OK";
        }

        private b() {
        }
    }

    public C5312a(int i10, Intent intent) {
        this.f23299a = i10;
        this.f23300b = intent;
    }

    public final Intent a() {
        return this.f23300b;
    }

    public final int b() {
        return this.f23299a;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + f23298c.a(this.f23299a) + ", data=" + this.f23300b + '}';
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeInt(this.f23299a);
        parcel.writeInt(this.f23300b == null ? 0 : 1);
        Intent intent = this.f23300b;
        if (intent != null) {
            intent.writeToParcel(parcel, i10);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C5312a(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
        C17542s.j(parcel, "parcel");
    }
}
