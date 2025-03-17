package EH;

import EH.C15627l;
import XH.C16807N;
import XH.C16814e;
import YH.g0;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00060\f0\tH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LEH/f;", "LEH/l;", "<init>", "()V", "", "name", "", "c", "(Ljava/lang/String;)Ljava/util/List;", "", "names", "()Ljava/util/Set;", "", "a", "toString", "()Ljava/lang/String;", "", "b", "()Z", "caseInsensitiveName", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C16814e
/* renamed from: EH.f  reason: case insensitive filesystem */
public final class C15621f implements C15627l {

    /* renamed from: c  reason: collision with root package name */
    public static final C15621f f134022c = new C15621f();

    private C15621f() {
    }

    public Set<Map.Entry<String, List<String>>> a() {
        return g0.d();
    }

    public boolean b() {
        return true;
    }

    public List<String> c(String str) {
        C17542s.j(str, "name");
        return null;
    }

    public void d(p<? super String, ? super List<String>, C16807N> pVar) {
        C15627l.b.a(this, pVar);
    }

    public String get(String str) {
        return C15627l.b.b(this, str);
    }

    public Set<String> names() {
        return g0.d();
    }

    public String toString() {
        return "Headers " + a();
    }
}
