package EH;

import JH.v;
import YH.C16877v;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\n0\u00150\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0012J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010!\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0018H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010%R\u001a\u0010(\u001a\u00020\r8\u0016X\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010\u0014¨\u0006)"}, d2 = {"LEH/S;", "LEH/B;", "encodedParametersBuilder", "<init>", "(LEH/B;)V", "LEH/A;", "g", "()LEH/A;", "", "name", "", "c", "(Ljava/lang/String;)Ljava/util/List;", "", "contains", "(Ljava/lang/String;)Z", "", "names", "()Ljava/util/Set;", "isEmpty", "()Z", "", "a", "value", "LXH/N;", "f", "(Ljava/lang/String;Ljava/lang/String;)V", "LJH/v;", "stringValues", "d", "(LJH/v;)V", "", "values", "e", "(Ljava/lang/String;Ljava/lang/Iterable;)V", "clear", "()V", "LEH/B;", "b", "Z", "caseInsensitiveName", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: EH.S  reason: case insensitive filesystem */
public final class C15613S implements C15597B {

    /* renamed from: a  reason: collision with root package name */
    private final C15597B f133971a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f133972b;

    public C15613S(C15597B b10) {
        C17542s.j(b10, "encodedParametersBuilder");
        this.f133971a = b10;
        this.f133972b = b10.b();
    }

    public Set<Map.Entry<String, List<String>>> a() {
        return C15614T.d(this.f133971a).a();
    }

    public boolean b() {
        return this.f133972b;
    }

    public List<String> c(String str) {
        C17542s.j(str, "name");
        ArrayList arrayList = null;
        List<String> c10 = this.f133971a.c(C15617b.m(str, false, 1, (Object) null));
        if (c10 != null) {
            Iterable<String> iterable = c10;
            arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (String k10 : iterable) {
                arrayList.add(C15617b.k(k10, 0, 0, true, (Charset) null, 11, (Object) null));
            }
        }
        return arrayList;
    }

    public void clear() {
        this.f133971a.clear();
    }

    public boolean contains(String str) {
        C17542s.j(str, "name");
        return this.f133971a.contains(C15617b.m(str, false, 1, (Object) null));
    }

    public void d(v vVar) {
        C17542s.j(vVar, "stringValues");
        C15614T.c(this.f133971a, vVar);
    }

    public void e(String str, Iterable<String> iterable) {
        C17542s.j(str, "name");
        C17542s.j(iterable, "values");
        C15597B b10 = this.f133971a;
        String m10 = C15617b.m(str, false, 1, (Object) null);
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (String n10 : iterable) {
            arrayList.add(C15617b.n(n10));
        }
        b10.e(m10, arrayList);
    }

    public void f(String str, String str2) {
        C17542s.j(str, "name");
        C17542s.j(str2, "value");
        this.f133971a.f(C15617b.m(str, false, 1, (Object) null), C15617b.n(str2));
    }

    public C15596A g() {
        return C15614T.d(this.f133971a);
    }

    public boolean isEmpty() {
        return this.f133971a.isEmpty();
    }

    public Set<String> names() {
        Iterable<String> names = this.f133971a.names();
        ArrayList arrayList = new ArrayList(C16877v.y(names, 10));
        for (String k10 : names) {
            arrayList.add(C15617b.k(k10, 0, 0, false, (Charset) null, 15, (Object) null));
        }
        return C16877v.y1(arrayList);
    }
}
