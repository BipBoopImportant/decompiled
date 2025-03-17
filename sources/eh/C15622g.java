package EH;

import EH.C15596A;
import XH.C16807N;
import YH.g0;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010&\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00060\f0\tH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u000e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0010¨\u0006\u0019"}, d2 = {"LEH/g;", "LEH/A;", "<init>", "()V", "", "name", "", "c", "(Ljava/lang/String;)Ljava/util/List;", "", "names", "()Ljava/util/Set;", "", "a", "", "isEmpty", "()Z", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "caseInsensitiveName", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: EH.g  reason: case insensitive filesystem */
public final class C15622g implements C15596A {

    /* renamed from: c  reason: collision with root package name */
    public static final C15622g f134023c = new C15622g();

    private C15622g() {
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
        C15596A.b.a(this, pVar);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C15596A) && ((C15596A) obj).isEmpty();
    }

    public boolean isEmpty() {
        return true;
    }

    public Set<String> names() {
        return g0.d();
    }

    public String toString() {
        return "Parameters " + a();
    }
}
