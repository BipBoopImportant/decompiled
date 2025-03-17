package G1;

import XH.C16824o;
import XH.C16825p;
import XH.s;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\tJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R'\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00170\u00168BX\u0002¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR$\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u001cj\b\u0012\u0004\u0012\u00020\u0006`\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060 8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010!¨\u0006#"}, d2 = {"LG1/n;", "", "", "extraAssertions", "<init>", "(Z)V", "LG1/G;", "node", "b", "(LG1/G;)Z", "LXH/N;", "a", "(LG1/G;)V", "f", "e", "()LG1/G;", "d", "()Z", "", "toString", "()Ljava/lang/String;", "Z", "", "", "LXH/o;", "c", "()Ljava/util/Map;", "mapOfOriginalDepth", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "Ljava/util/Comparator;", "DepthComparator", "LG1/D0;", "LG1/D0;", "set", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: G1.n  reason: case insensitive filesystem */
public final class C4511n {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f6553a;

    /* renamed from: b  reason: collision with root package name */
    private final C16824o f6554b = C16825p.a(s.NONE, b.f6557c);

    /* renamed from: c  reason: collision with root package name */
    private final Comparator<G> f6555c;

    /* renamed from: d  reason: collision with root package name */
    private final D0<G> f6556d;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003J\u001f\u0010\u0004\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0007¨\u0006\b"}, d2 = {"G1/n$a", "Ljava/util/Comparator;", "LG1/G;", "Lkotlin/Comparator;", "a", "b", "", "(LG1/G;LG1/G;)I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: G1.n$a */
    public static final class a implements Comparator<G> {
        a() {
        }

        /* renamed from: a */
        public int compare(G g10, G g11) {
            int l10 = C17542s.l(g10.O(), g11.O());
            return l10 != 0 ? l10 : C17542s.l(g10.hashCode(), g11.hashCode());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "LG1/G;", "", "b", "()Ljava/util/Map;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: G1.n$b */
    static final class b extends C17544u implements C17631a<Map<G, Integer>> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f6557c = new b();

        b() {
            super(0);
        }

        /* renamed from: b */
        public final Map<G, Integer> invoke() {
            return new LinkedHashMap();
        }
    }

    public C4511n(boolean z10) {
        this.f6553a = z10;
        a aVar = new a();
        this.f6555c = aVar;
        this.f6556d = new D0<>(aVar);
    }

    private final Map<G, Integer> c() {
        return (Map) this.f6554b.getValue();
    }

    public final void a(G g10) {
        if (!g10.c()) {
            D1.a.b("DepthSortedSet.add called on an unattached node");
        }
        if (this.f6553a) {
            Integer num = c().get(g10);
            if (num == null) {
                c().put(g10, Integer.valueOf(g10.O()));
            } else {
                if (!(num.intValue() == g10.O())) {
                    D1.a.b("invalid node depth");
                }
            }
        }
        this.f6556d.add(g10);
    }

    public final boolean b(G g10) {
        boolean contains = this.f6556d.contains(g10);
        if (this.f6553a) {
            if (!(contains == c().containsKey(g10))) {
                D1.a.b("inconsistency in TreeSet");
            }
        }
        return contains;
    }

    public final boolean d() {
        return this.f6556d.isEmpty();
    }

    public final G e() {
        G first = this.f6556d.first();
        f(first);
        return first;
    }

    public final boolean f(G g10) {
        if (!g10.c()) {
            D1.a.b("DepthSortedSet.remove called on an unattached node");
        }
        boolean remove = this.f6556d.remove(g10);
        if (this.f6553a) {
            if (!C17542s.e(c().remove(g10), remove ? Integer.valueOf(g10.O()) : null)) {
                D1.a.b("invalid node depth");
            }
        }
        return remove;
    }

    public String toString() {
        return this.f6556d.toString();
    }
}
