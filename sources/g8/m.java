package G8;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Marker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"LG8/m;", "", "<init>", "()V", "", "number", "LXH/N;", "f", "(Ljava/lang/String;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "LG8/o;", "operator", "d", "(LG8/m;LG8/o;)I", "a", "Ljava/lang/String;", "b", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class m {

    /* renamed from: b  reason: collision with root package name */
    public static final a f36277b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static p<m> f36278c = new p<>();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final j<m> f36279d = new l();

    /* renamed from: a  reason: collision with root package name */
    private String f36280a;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LG8/m$a;", "", "<init>", "()V", "", "n", "LG8/m;", "a", "(Ljava/lang/String;)LG8/m;", "number", "LXH/N;", "b", "(LG8/m;)V", "LG8/j;", "numberWithPatternInstanceCreator", "LG8/j;", "LG8/p;", "recycler", "LG8/p;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final m a(String str) {
            m mVar = (m) m.f36278c.a(m.f36279d);
            mVar.f(str);
            return mVar;
        }

        public final void b(m mVar) {
            C17542s.j(mVar, "number");
            m.f36278c.b(mVar);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private m() {
    }

    /* access modifiers changed from: private */
    public static final m e() {
        return new m();
    }

    public final int d(m mVar, o oVar) {
        C17542s.j(mVar, "other");
        C17542s.j(oVar, "operator");
        if (C17542s.e(this.f36280a, Marker.ANY_MARKER) || C17542s.e(mVar.f36280a, Marker.ANY_MARKER)) {
            return 0;
        }
        String str = this.f36280a;
        if (str == null && mVar.f36280a == null) {
            return 0;
        }
        String str2 = "0";
        if (str == null) {
            str = (oVar == o.LTE || oVar == o.LT) ? str2 : "99999999999";
        }
        String str3 = mVar.f36280a;
        if (str3 != null) {
            str2 = str3;
        }
        try {
            return C17542s.l(Integer.parseInt(str), Integer.parseInt(str2));
        } catch (NumberFormatException unused) {
            return str.compareTo(str2);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (C17542s.e(mVar.f36280a, this.f36280a)) {
            return true;
        }
        return (C17542s.e(mVar.f36280a, Marker.ANY_MARKER) && this.f36280a != null) || (C17542s.e(this.f36280a, Marker.ANY_MARKER) && mVar.f36280a != null);
    }

    public final void f(String str) {
        this.f36280a = str;
    }

    public int hashCode() {
        String str = this.f36280a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
