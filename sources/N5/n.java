package N5;

import XH.C16796C;
import XH.v;
import YH.X;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oI.C17693a;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000  2\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001:\u0003!\u001e B\u001d\b\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0005¢\u0006\u0004\b\u0007\u0010\bB\t\b\u0016¢\u0006\u0004\b\u0007\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"LN5/n;", "", "LXH/v;", "", "LN5/n$c;", "", "entries", "<init>", "(Ljava/util/Map;)V", "()V", "", "isEmpty", "()Z", "i", "()Ljava/util/Map;", "", "iterator", "()Ljava/util/Iterator;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "LN5/n$a;", "k", "()LN5/n$a;", "a", "Ljava/util/Map;", "b", "c", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n implements Iterable<v<? extends String, ? extends c>>, C17693a {

    /* renamed from: b  reason: collision with root package name */
    public static final b f39090b = new b((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final n f39091c = new n();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, c> f39092a;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000b¨\u0006\r"}, d2 = {"LN5/n$a;", "", "LN5/n;", "parameters", "<init>", "(LN5/n;)V", "a", "()LN5/n;", "", "", "LN5/n$c;", "Ljava/util/Map;", "entries", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, c> f39093a;

        public a(n nVar) {
            this.f39093a = X.z(nVar.f39092a);
        }

        public final n a() {
            return new n(S5.c.b(this.f39093a), (DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LN5/n$b;", "", "<init>", "()V", "LN5/n;", "EMPTY", "LN5/n;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\f\u0010\u000b¨\u0006\u0014"}, d2 = {"LN5/n$c;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "value", "b", "Ljava/lang/String;", "memoryCacheKey", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final Object f39094a;

        /* renamed from: b  reason: collision with root package name */
        private final String f39095b;

        public final String a() {
            return this.f39095b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C17542s.e(this.f39094a, cVar.f39094a) && C17542s.e(this.f39095b, cVar.f39095b);
            }
        }

        public int hashCode() {
            Object obj = this.f39094a;
            int i10 = 0;
            int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
            String str = this.f39095b;
            if (str != null) {
                i10 = str.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            return "Entry(value=" + this.f39094a + ", memoryCacheKey=" + this.f39095b + ')';
        }
    }

    public /* synthetic */ n(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && C17542s.e(this.f39092a, ((n) obj).f39092a);
    }

    public int hashCode() {
        return this.f39092a.hashCode();
    }

    public final Map<String, String> i() {
        if (isEmpty()) {
            return X.j();
        }
        Map<String, c> map = this.f39092a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            String a10 = ((c) next.getValue()).a();
            if (a10 != null) {
                linkedHashMap.put(next.getKey(), a10);
            }
        }
        return linkedHashMap;
    }

    public final boolean isEmpty() {
        return this.f39092a.isEmpty();
    }

    public Iterator<v<String, c>> iterator() {
        Map<String, c> map = this.f39092a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry next : map.entrySet()) {
            arrayList.add(C16796C.a((String) next.getKey(), (c) next.getValue()));
        }
        return arrayList.iterator();
    }

    public final a k() {
        return new a(this);
    }

    public String toString() {
        return "Parameters(entries=" + this.f39092a + ')';
    }

    private n(Map<String, c> map) {
        this.f39092a = map;
    }

    public n() {
        this(X.j());
    }
}
