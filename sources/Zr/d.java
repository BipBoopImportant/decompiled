package zr;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\b\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0013B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0016\u0010\u001c¨\u0006\u001d"}, d2 = {"Lzr/d;", "", "", "name", "text", "", "selected", "", "includedInspirationIds", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "e", "Z", "d", "()Z", "Ljava/util/List;", "()Ljava/util/List;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* renamed from: e  reason: collision with root package name */
    public static final a f107570e = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final d f107571f = new d("", "", false, (List<String>) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f107572a;

    /* renamed from: b  reason: collision with root package name */
    private final String f107573b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f107574c;

    /* renamed from: d  reason: collision with root package name */
    private final List<String> f107575d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lzr/d$a;", "", "<init>", "()V", "Lzr/d;", "INSPIRATION_ALL", "Lzr/d;", "a", "()Lzr/d;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a() {
            return d.f107571f;
        }

        private a() {
        }
    }

    public d(String str, String str2, boolean z10, List<String> list) {
        C17542s.j(str, "name");
        C17542s.j(str2, "text");
        this.f107572a = str;
        this.f107573b = str2;
        this.f107574c = z10;
        this.f107575d = list;
    }

    public final List<String> b() {
        return this.f107575d;
    }

    public final String c() {
        return this.f107572a;
    }

    public final boolean d() {
        return this.f107574c;
    }

    public final String e() {
        return this.f107573b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return C17542s.e(this.f107572a, dVar.f107572a) && C17542s.e(this.f107573b, dVar.f107573b) && this.f107574c == dVar.f107574c && C17542s.e(this.f107575d, dVar.f107575d);
    }

    public int hashCode() {
        int hashCode = ((((this.f107572a.hashCode() * 31) + this.f107573b.hashCode()) * 31) + Boolean.hashCode(this.f107574c)) * 31;
        List<String> list = this.f107575d;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        String str = this.f107572a;
        String str2 = this.f107573b;
        boolean z10 = this.f107574c;
        List<String> list = this.f107575d;
        return "InspirationFilterValue(name=" + str + ", text=" + str2 + ", selected=" + z10 + ", includedInspirationIds=" + list + ")";
    }
}
