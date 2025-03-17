package androidx.work;

import YH.C16877v;
import android.annotation.SuppressLint;
import android.net.NetworkRequest;
import android.net.Uri;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t5.C8831z;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0003&*.B1\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tB;\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u000bB_\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\b\u0010\u0012Bg\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\b\u0010\u0015B\u0011\b\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u0019J\r\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u0019J\r\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u0019J\u000f\u0010\u001d\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\u0019J\u001a\u0010\u001e\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0017¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0017¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\u0014\u001a\u00020\u00138\u0000X\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u0010/R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010/R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010/R\u001a\u0010\r\u001a\u00020\f8GX\u0004¢\u0006\f\n\u0004\b\u001d\u00101\u001a\u0004\b*\u00102R\u001a\u0010\u000e\u001a\u00020\f8GX\u0004¢\u0006\f\n\u0004\b\u001b\u00101\u001a\u0004\b&\u00102R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8GX\u0004¢\u0006\f\n\u0004\b\u0018\u00103\u001a\u0004\b.\u00104R\u0013\u00107\u001a\u0004\u0018\u0001058G¢\u0006\u0006\u001a\u0004\b0\u00106¨\u00068"}, d2 = {"Landroidx/work/e;", "", "Landroidx/work/z;", "requiredNetworkType", "", "requiresCharging", "requiresBatteryNotLow", "requiresStorageNotLow", "<init>", "(Landroidx/work/z;ZZZ)V", "requiresDeviceIdle", "(Landroidx/work/z;ZZZZ)V", "", "contentTriggerUpdateDelayMillis", "contentTriggerMaxDelayMillis", "", "Landroidx/work/e$c;", "contentUriTriggers", "(Landroidx/work/z;ZZZZJJLjava/util/Set;)V", "Lt5/z;", "requiredNetworkRequestCompat", "(Lt5/z;Landroidx/work/z;ZZZZJJLjava/util/Set;)V", "other", "(Landroidx/work/e;)V", "i", "()Z", "j", "h", "k", "g", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Landroidx/work/z;", "f", "()Landroidx/work/z;", "b", "Lt5/z;", "e", "()Lt5/z;", "c", "Z", "d", "J", "()J", "Ljava/util/Set;", "()Ljava/util/Set;", "Landroid/net/NetworkRequest;", "()Landroid/net/NetworkRequest;", "requiredNetworkRequest", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.work.e  reason: case insensitive filesystem */
public final class C7036e {

    /* renamed from: j  reason: collision with root package name */
    public static final b f45174j = new b((DefaultConstructorMarker) null);

    /* renamed from: k  reason: collision with root package name */
    public static final C7036e f45175k = new C7036e((C7056z) null, false, false, false, 15, (DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C7056z f45176a;

    /* renamed from: b  reason: collision with root package name */
    private final C8831z f45177b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f45178c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f45179d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f45180e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f45181f;

    /* renamed from: g  reason: collision with root package name */
    private final long f45182g;

    /* renamed from: h  reason: collision with root package name */
    private final long f45183h;

    /* renamed from: i  reason: collision with root package name */
    private final Set<c> f45184i;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0007J\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0007J\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u0016\u0010\u001a\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"Landroidx/work/e$a;", "", "<init>", "()V", "", "requiresCharging", "d", "(Z)Landroidx/work/e$a;", "requiresDeviceIdle", "e", "Landroidx/work/z;", "networkType", "b", "(Landroidx/work/z;)Landroidx/work/e$a;", "requiresBatteryNotLow", "c", "Landroidx/work/e;", "a", "()Landroidx/work/e;", "Z", "Lt5/z;", "Lt5/z;", "requiredNetworkRequest", "Landroidx/work/z;", "requiredNetworkType", "f", "requiresStorageNotLow", "", "g", "J", "triggerContentUpdateDelay", "h", "triggerContentMaxDelay", "", "Landroidx/work/e$c;", "i", "Ljava/util/Set;", "contentUriTriggers", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.work.e$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f45185a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f45186b;

        /* renamed from: c  reason: collision with root package name */
        private C8831z f45187c = new C8831z((Object) null, 1, (DefaultConstructorMarker) null);

        /* renamed from: d  reason: collision with root package name */
        private C7056z f45188d = C7056z.NOT_REQUIRED;

        /* renamed from: e  reason: collision with root package name */
        private boolean f45189e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f45190f;

        /* renamed from: g  reason: collision with root package name */
        private long f45191g = -1;

        /* renamed from: h  reason: collision with root package name */
        private long f45192h = -1;

        /* renamed from: i  reason: collision with root package name */
        private Set<c> f45193i = new LinkedHashSet();

        public final C7036e a() {
            Set y12 = C16877v.y1(this.f45193i);
            return new C7036e(this.f45187c, this.f45188d, this.f45185a, this.f45186b, this.f45189e, this.f45190f, this.f45191g, this.f45192h, y12);
        }

        public final a b(C7056z zVar) {
            C17542s.j(zVar, "networkType");
            this.f45188d = zVar;
            this.f45187c = new C8831z((Object) null, 1, (DefaultConstructorMarker) null);
            return this;
        }

        public final a c(boolean z10) {
            this.f45189e = z10;
            return this;
        }

        public final a d(boolean z10) {
            this.f45185a = z10;
            return this;
        }

        public final a e(boolean z10) {
            this.f45186b = z10;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/work/e$b;", "", "<init>", "()V", "Landroidx/work/e;", "NONE", "Landroidx/work/e;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.work.e$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/work/e$c;", "", "Landroid/net/Uri;", "uri", "", "isTriggeredForDescendants", "<init>", "(Landroid/net/Uri;Z)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroid/net/Uri;", "()Landroid/net/Uri;", "b", "Z", "()Z", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.work.e$c */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final Uri f45194a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f45195b;

        public c(Uri uri, boolean z10) {
            C17542s.j(uri, "uri");
            this.f45194a = uri;
            this.f45195b = z10;
        }

        public final Uri a() {
            return this.f45194a;
        }

        public final boolean b() {
            return this.f45195b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!C17542s.e(c.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            C17542s.h(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            c cVar = (c) obj;
            return C17542s.e(this.f45194a, cVar.f45194a) && this.f45195b == cVar.f45195b;
        }

        public int hashCode() {
            return (this.f45194a.hashCode() * 31) + Boolean.hashCode(this.f45195b);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7036e(C7056z zVar, boolean z10, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C7056z.NOT_REQUIRED : zVar, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? false : z12);
    }

    public final long a() {
        return this.f45183h;
    }

    public final long b() {
        return this.f45182g;
    }

    public final Set<c> c() {
        return this.f45184i;
    }

    public final NetworkRequest d() {
        return this.f45177b.b();
    }

    public final C8831z e() {
        return this.f45177b;
    }

    @SuppressLint({"NewApi"})
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!C17542s.e(C7036e.class, obj.getClass())) {
            return false;
        }
        C7036e eVar = (C7036e) obj;
        if (this.f45178c == eVar.f45178c && this.f45179d == eVar.f45179d && this.f45180e == eVar.f45180e && this.f45181f == eVar.f45181f && this.f45182g == eVar.f45182g && this.f45183h == eVar.f45183h && C17542s.e(d(), eVar.d()) && this.f45176a == eVar.f45176a) {
            return C17542s.e(this.f45184i, eVar.f45184i);
        }
        return false;
    }

    public final C7056z f() {
        return this.f45176a;
    }

    public final boolean g() {
        return !this.f45184i.isEmpty();
    }

    public final boolean h() {
        return this.f45180e;
    }

    @SuppressLint({"NewApi"})
    public int hashCode() {
        long j10 = this.f45182g;
        long j11 = this.f45183h;
        int hashCode = ((((((((((((((this.f45176a.hashCode() * 31) + (this.f45178c ? 1 : 0)) * 31) + (this.f45179d ? 1 : 0)) * 31) + (this.f45180e ? 1 : 0)) * 31) + (this.f45181f ? 1 : 0)) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f45184i.hashCode()) * 31;
        NetworkRequest d10 = d();
        return hashCode + (d10 != null ? d10.hashCode() : 0);
    }

    public final boolean i() {
        return this.f45178c;
    }

    public final boolean j() {
        return this.f45179d;
    }

    public final boolean k() {
        return this.f45181f;
    }

    @SuppressLint({"NewApi"})
    public String toString() {
        return "Constraints{requiredNetworkType=" + this.f45176a + ", requiresCharging=" + this.f45178c + ", requiresDeviceIdle=" + this.f45179d + ", requiresBatteryNotLow=" + this.f45180e + ", requiresStorageNotLow=" + this.f45181f + ", contentTriggerUpdateDelayMillis=" + this.f45182g + ", contentTriggerMaxDelayMillis=" + this.f45183h + ", contentUriTriggers=" + this.f45184i + ", }";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @SuppressLint({"NewApi"})
    public C7036e(C7056z zVar, boolean z10, boolean z11, boolean z12) {
        this(zVar, z10, false, z11, z12);
        C17542s.j(zVar, "requiredNetworkType");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @SuppressLint({"NewApi"})
    public C7036e(C7056z zVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this(zVar, z10, z11, z12, z13, -1, 0, (Set) null, 192, (DefaultConstructorMarker) null);
        C17542s.j(zVar, "requiredNetworkType");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C7036e(androidx.work.C7056z r12, boolean r13, boolean r14, boolean r15, boolean r16, long r17, long r19, java.util.Set r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            androidx.work.z r1 = androidx.work.C7056z.NOT_REQUIRED
            goto L_0x000a
        L_0x0009:
            r1 = r12
        L_0x000a:
            r2 = r0 & 2
            r3 = 0
            if (r2 == 0) goto L_0x0011
            r2 = r3
            goto L_0x0012
        L_0x0011:
            r2 = r13
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = r3
            goto L_0x0019
        L_0x0018:
            r4 = r14
        L_0x0019:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001f
            r5 = r3
            goto L_0x0020
        L_0x001f:
            r5 = r15
        L_0x0020:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r3 = r16
        L_0x0027:
            r6 = r0 & 32
            r7 = -1
            if (r6 == 0) goto L_0x002f
            r9 = r7
            goto L_0x0031
        L_0x002f:
            r9 = r17
        L_0x0031:
            r6 = r0 & 64
            if (r6 == 0) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r7 = r19
        L_0x0038:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0041
            java.util.Set r0 = YH.g0.d()
            goto L_0x0043
        L_0x0041:
            r0 = r21
        L_0x0043:
            r12 = r11
            r13 = r1
            r14 = r2
            r15 = r4
            r16 = r5
            r17 = r3
            r18 = r9
            r20 = r7
            r22 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r20, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.C7036e.<init>(androidx.work.z, boolean, boolean, boolean, boolean, long, long, java.util.Set, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public C7036e(C7056z zVar, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, Set<c> set) {
        C17542s.j(zVar, "requiredNetworkType");
        C17542s.j(set, "contentUriTriggers");
        this.f45177b = new C8831z((Object) null, 1, (DefaultConstructorMarker) null);
        this.f45176a = zVar;
        this.f45178c = z10;
        this.f45179d = z11;
        this.f45180e = z12;
        this.f45181f = z13;
        this.f45182g = j10;
        this.f45183h = j11;
        this.f45184i = set;
    }

    public C7036e(C8831z zVar, C7056z zVar2, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, Set<c> set) {
        C17542s.j(zVar, "requiredNetworkRequestCompat");
        C17542s.j(zVar2, "requiredNetworkType");
        C17542s.j(set, "contentUriTriggers");
        this.f45177b = zVar;
        this.f45176a = zVar2;
        this.f45178c = z10;
        this.f45179d = z11;
        this.f45180e = z12;
        this.f45181f = z13;
        this.f45182g = j10;
        this.f45183h = j11;
        this.f45184i = set;
    }

    @SuppressLint({"NewApi"})
    public C7036e(C7036e eVar) {
        C17542s.j(eVar, "other");
        this.f45178c = eVar.f45178c;
        this.f45179d = eVar.f45179d;
        this.f45177b = eVar.f45177b;
        this.f45176a = eVar.f45176a;
        this.f45180e = eVar.f45180e;
        this.f45181f = eVar.f45181f;
        this.f45184i = eVar.f45184i;
        this.f45182g = eVar.f45182g;
        this.f45183h = eVar.f45183h;
    }
}
