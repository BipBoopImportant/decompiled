package x4;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 +2\u00020\u0001:\u0001\u001eB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ/\u0010\u0011\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\"\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b\u001c\u0010\u0015R\u0019\u0010'\u001a\u0004\u0018\u00010#8\u0006¢\u0006\f\n\u0004\b\u0011\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010*\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010&¨\u0006,"}, d2 = {"Lx4/m;", "Landroid/os/Parcelable;", "Lx4/l;", "entry", "<init>", "(Lx4/l;)V", "Landroid/os/Parcel;", "inParcel", "(Landroid/os/Parcel;)V", "Landroid/content/Context;", "context", "Lx4/v;", "destination", "Landroidx/lifecycle/r$b;", "hostLifecycleState", "Lx4/p;", "viewModel", "c", "(Landroid/content/Context;Lx4/v;Landroidx/lifecycle/r$b;Lx4/p;)Lx4/l;", "", "describeContents", "()I", "parcel", "i", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "id", "I", "destinationId", "Landroid/os/Bundle;", "Landroid/os/Bundle;", "getArgs", "()Landroid/os/Bundle;", "args", "d", "getSavedState", "savedState", "e", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
/* renamed from: x4.m  reason: case insensitive filesystem */
public final class C8949m implements Parcelable {
    public static final Parcelable.Creator<C8949m> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    public static final b f57539e = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f57540a;

    /* renamed from: b  reason: collision with root package name */
    private final int f57541b;

    /* renamed from: c  reason: collision with root package name */
    private final Bundle f57542c;

    /* renamed from: d  reason: collision with root package name */
    private final Bundle f57543d;

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"x4/m$a", "Landroid/os/Parcelable$Creator;", "Lx4/m;", "Landroid/os/Parcel;", "inParcel", "a", "(Landroid/os/Parcel;)Lx4/m;", "", "size", "", "b", "(I)[Lx4/m;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: x4.m$a */
    public static final class a implements Parcelable.Creator<C8949m> {
        a() {
        }

        /* renamed from: a */
        public C8949m createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "inParcel");
            return new C8949m(parcel);
        }

        /* renamed from: b */
        public C8949m[] newArray(int i10) {
            return new C8949m[i10];
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lx4/m$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lx4/m;", "CREATOR", "Landroid/os/Parcelable$Creator;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: x4.m$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public C8949m(C8948l lVar) {
        C17542s.j(lVar, "entry");
        this.f57540a = lVar.f();
        this.f57541b = lVar.e().x();
        this.f57542c = lVar.c();
        Bundle bundle = new Bundle();
        this.f57543d = bundle;
        lVar.j(bundle);
    }

    public final int a() {
        return this.f57541b;
    }

    public final String b() {
        return this.f57540a;
    }

    public final C8948l c(Context context, v vVar, r.b bVar, C8952p pVar) {
        C17542s.j(context, "context");
        C17542s.j(vVar, "destination");
        C17542s.j(bVar, "hostLifecycleState");
        Bundle bundle = this.f57542c;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        return C8948l.f57521o.a(context, vVar, bundle, bVar, pVar, this.f57540a, this.f57543d);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "parcel");
        parcel.writeString(this.f57540a);
        parcel.writeInt(this.f57541b);
        parcel.writeBundle(this.f57542c);
        parcel.writeBundle(this.f57543d);
    }

    public C8949m(Parcel parcel) {
        C17542s.j(parcel, "inParcel");
        String readString = parcel.readString();
        C17542s.g(readString);
        this.f57540a = readString;
        this.f57541b = parcel.readInt();
        Class<C8949m> cls = C8949m.class;
        this.f57542c = parcel.readBundle(cls.getClassLoader());
        Bundle readBundle = parcel.readBundle(cls.getClassLoader());
        C17542s.g(readBundle);
        this.f57543d = readBundle;
    }
}
