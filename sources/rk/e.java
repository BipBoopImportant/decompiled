package Rk;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0010B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\t¨\u0006\u0018"}, d2 = {"LRk/e;", "", "", "deepLink", "", "isResolved", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "hasUnresolvedDeepLink", "c", "requireDeepLink", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* renamed from: c  reason: collision with root package name */
    public static final a f86503c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f86504a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f86505b;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LRk/e$a;", "", "<init>", "()V", "Landroid/content/Intent;", "intent", "LRk/e;", "a", "(Landroid/content/Intent;)LRk/e;", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r1 = r5.getData();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final Rk.e a(android.content.Intent r5) {
            /*
                r4 = this;
                Rk.e r0 = new Rk.e
                if (r5 == 0) goto L_0x000f
                android.net.Uri r1 = r5.getData()
                if (r1 == 0) goto L_0x000f
                java.lang.String r1 = r1.toString()
                goto L_0x0010
            L_0x000f:
                r1 = 0
            L_0x0010:
                r2 = 0
                if (r5 == 0) goto L_0x0019
                java.lang.String r3 = "isResolved"
                boolean r2 = r5.getBooleanExtra(r3, r2)
            L_0x0019:
                r0.<init>(r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Rk.e.a.a(android.content.Intent):Rk.e");
        }

        private a() {
        }
    }

    public e() {
        this((String) null, false, 3, (DefaultConstructorMarker) null);
    }

    public final String a() {
        return this.f86504a;
    }

    public final boolean b() {
        return this.f86504a != null && !this.f86505b;
    }

    public final String c() {
        String str = this.f86504a;
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return C17542s.e(this.f86504a, eVar.f86504a) && this.f86505b == eVar.f86505b;
    }

    public int hashCode() {
        String str = this.f86504a;
        return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.f86505b);
    }

    public String toString() {
        String str = this.f86504a;
        boolean z10 = this.f86505b;
        return "IntentParams(deepLink=" + str + ", isResolved=" + z10 + ")";
    }

    public e(String str, boolean z10) {
        this.f86504a = str;
        this.f86505b = z10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? false : z10);
    }
}
