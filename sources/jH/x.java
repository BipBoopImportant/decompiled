package JH;

import XH.C16807N;
import YH.C16877v;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.p;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001a\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\r0\u00190\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u0016J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001e\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010\u001dJ\u0017\u0010#\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J%\u0010'\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u001bH\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b-\u0010*J\u0017\u0010.\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\bH\u0014¢\u0006\u0004\b.\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010/\u001a\u0004\b0\u0010\u0018R,\u0010&\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\n018\u0004X\u0004¢\u0006\f\n\u0004\b0\u00102\u001a\u0004\b3\u00104¨\u00065"}, d2 = {"LJH/x;", "LJH/w;", "", "caseInsensitiveName", "", "size", "<init>", "(ZI)V", "", "name", "", "i", "(Ljava/lang/String;)Ljava/util/List;", "", "c", "contains", "(Ljava/lang/String;)Z", "value", "h", "(Ljava/lang/String;Ljava/lang/String;)Z", "", "names", "()Ljava/util/Set;", "isEmpty", "()Z", "", "a", "LXH/N;", "m", "(Ljava/lang/String;Ljava/lang/String;)V", "j", "(Ljava/lang/String;)Ljava/lang/String;", "f", "LJH/v;", "stringValues", "d", "(LJH/v;)V", "", "values", "e", "(Ljava/lang/String;Ljava/lang/Iterable;)V", "l", "(Ljava/lang/String;)V", "clear", "()V", "n", "o", "Z", "b", "", "Ljava/util/Map;", "k", "()Ljava/util/Map;", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class x implements w {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f135741a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, List<String>> f135742b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "name", "", "values", "LXH/N;", "a", "(Ljava/lang/String;Ljava/util/List;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements p<String, List<? extends String>, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ x f135743c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(x xVar) {
            super(2);
            this.f135743c = xVar;
        }

        public final void a(String str, List<String> list) {
            C17542s.j(str, "name");
            C17542s.j(list, "values");
            this.f135743c.e(str, list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((String) obj, (List) obj2);
            return C16807N.f139792a;
        }
    }

    public x(boolean z10, int i10) {
        this.f135741a = z10;
        this.f135742b = z10 ? l.a() : new LinkedHashMap<>(i10);
    }

    private final List<String> i(String str) {
        List<String> list = this.f135742b.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        n(str);
        this.f135742b.put(str, arrayList);
        return arrayList;
    }

    public Set<Map.Entry<String, List<String>>> a() {
        return k.a(this.f135742b.entrySet());
    }

    public final boolean b() {
        return this.f135741a;
    }

    public List<String> c(String str) {
        C17542s.j(str, "name");
        return this.f135742b.get(str);
    }

    public void clear() {
        this.f135742b.clear();
    }

    public boolean contains(String str) {
        C17542s.j(str, "name");
        return this.f135742b.containsKey(str);
    }

    public void d(v vVar) {
        C17542s.j(vVar, "stringValues");
        vVar.d(new a(this));
    }

    public void e(String str, Iterable<String> iterable) {
        C17542s.j(str, "name");
        C17542s.j(iterable, "values");
        List<String> i10 = i(str);
        for (String next : iterable) {
            o(next);
            i10.add(next);
        }
    }

    public void f(String str, String str2) {
        C17542s.j(str, "name");
        C17542s.j(str2, "value");
        o(str2);
        i(str).add(str2);
    }

    public boolean h(String str, String str2) {
        C17542s.j(str, "name");
        C17542s.j(str2, "value");
        List list = this.f135742b.get(str);
        if (list != null) {
            return list.contains(str2);
        }
        return false;
    }

    public boolean isEmpty() {
        return this.f135742b.isEmpty();
    }

    public String j(String str) {
        C17542s.j(str, "name");
        List<String> c10 = c(str);
        if (c10 != null) {
            return (String) C16877v.y0(c10);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final Map<String, List<String>> k() {
        return this.f135742b;
    }

    public void l(String str) {
        C17542s.j(str, "name");
        this.f135742b.remove(str);
    }

    public void m(String str, String str2) {
        C17542s.j(str, "name");
        C17542s.j(str2, "value");
        o(str2);
        List<String> i10 = i(str);
        i10.clear();
        i10.add(str2);
    }

    /* access modifiers changed from: protected */
    public void n(String str) {
        C17542s.j(str, "name");
    }

    public Set<String> names() {
        return this.f135742b.keySet();
    }

    /* access modifiers changed from: protected */
    public void o(String str) {
        C17542s.j(str, "value");
    }
}
