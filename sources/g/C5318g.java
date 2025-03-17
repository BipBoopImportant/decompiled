package g;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0002\u0015\u001cB1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u001c\u0010\u000f¨\u0006\u001f"}, d2 = {"Lg/g;", "Landroid/os/Parcelable;", "Landroid/content/IntentSender;", "intentSender", "Landroid/content/Intent;", "fillInIntent", "", "flagsMask", "flagsValues", "<init>", "(Landroid/content/IntentSender;Landroid/content/Intent;II)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "describeContents", "()I", "dest", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Landroid/content/IntentSender;", "d", "()Landroid/content/IntentSender;", "b", "Landroid/content/Intent;", "()Landroid/content/Intent;", "c", "I", "e", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
/* renamed from: g.g  reason: case insensitive filesystem */
public final class C5318g implements Parcelable {
    public static final Parcelable.Creator<C5318g> CREATOR = new b();

    /* renamed from: e  reason: collision with root package name */
    public static final c f23324e = new c((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final IntentSender f23325a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f23326b;

    /* renamed from: c  reason: collision with root package name */
    private final int f23327c;

    /* renamed from: d  reason: collision with root package name */
    private final int f23328d;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017¨\u0006\u001b"}, d2 = {"Lg/g$a;", "", "Landroid/content/IntentSender;", "intentSender", "<init>", "(Landroid/content/IntentSender;)V", "Landroid/app/PendingIntent;", "pendingIntent", "(Landroid/app/PendingIntent;)V", "Landroid/content/Intent;", "fillInIntent", "b", "(Landroid/content/Intent;)Lg/g$a;", "", "values", "mask", "c", "(II)Lg/g$a;", "Lg/g;", "a", "()Lg/g;", "Landroid/content/IntentSender;", "Landroid/content/Intent;", "I", "flagsMask", "d", "flagsValues", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g.g$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final IntentSender f23329a;

        /* renamed from: b  reason: collision with root package name */
        private Intent f23330b;

        /* renamed from: c  reason: collision with root package name */
        private int f23331c;

        /* renamed from: d  reason: collision with root package name */
        private int f23332d;

        public a(IntentSender intentSender) {
            C17542s.j(intentSender, "intentSender");
            this.f23329a = intentSender;
        }

        public final C5318g a() {
            return new C5318g(this.f23329a, this.f23330b, this.f23331c, this.f23332d);
        }

        public final a b(Intent intent) {
            this.f23330b = intent;
            return this;
        }

        public final a c(int i10, int i11) {
            this.f23332d = i10;
            this.f23331c = i11;
            return this;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(android.app.PendingIntent r2) {
            /*
                r1 = this;
                java.lang.String r0 = "pendingIntent"
                kotlin.jvm.internal.C17542s.j(r2, r0)
                android.content.IntentSender r2 = r2.getIntentSender()
                java.lang.String r0 = "pendingIntent.intentSender"
                kotlin.jvm.internal.C17542s.i(r2, r0)
                r1.<init>((android.content.IntentSender) r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g.C5318g.a.<init>(android.app.PendingIntent):void");
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"g/g$b", "Landroid/os/Parcelable$Creator;", "Lg/g;", "Landroid/os/Parcel;", "inParcel", "a", "(Landroid/os/Parcel;)Lg/g;", "", "size", "", "b", "(I)[Lg/g;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g.g$b */
    public static final class b implements Parcelable.Creator<C5318g> {
        b() {
        }

        /* renamed from: a */
        public C5318g createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "inParcel");
            return new C5318g(parcel);
        }

        /* renamed from: b */
        public C5318g[] newArray(int i10) {
            return new C5318g[i10];
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg/g$c;", "", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g.g$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public C5318g(IntentSender intentSender, Intent intent, int i10, int i11) {
        C17542s.j(intentSender, "intentSender");
        this.f23325a = intentSender;
        this.f23326b = intent;
        this.f23327c = i10;
        this.f23328d = i11;
    }

    public final Intent a() {
        return this.f23326b;
    }

    public final int b() {
        return this.f23327c;
    }

    public final int c() {
        return this.f23328d;
    }

    public final IntentSender d() {
        return this.f23325a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeParcelable(this.f23325a, i10);
        parcel.writeParcelable(this.f23326b, i10);
        parcel.writeInt(this.f23327c);
        parcel.writeInt(this.f23328d);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5318g(android.os.Parcel r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            java.lang.Class<android.content.IntentSender> r0 = android.content.IntentSender.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r4.readParcelable(r0)
            kotlin.jvm.internal.C17542s.g(r0)
            android.content.IntentSender r0 = (android.content.IntentSender) r0
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r1 = r4.readParcelable(r1)
            android.content.Intent r1 = (android.content.Intent) r1
            int r2 = r4.readInt()
            int r4 = r4.readInt()
            r3.<init>(r0, r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.C5318g.<init>(android.os.Parcel):void");
    }
}
