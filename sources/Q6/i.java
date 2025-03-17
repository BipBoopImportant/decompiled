package Q6;

import M6.B;
import XH.C16796C;
import XH.t;
import YH.C16877v;
import YH.U;
import YH.X;
import YH.g0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import tI.C17974j;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0006\u001a\u0004\u0018\u00010\u0004*\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u0000\"\u0004\b\u0000\u0010\b2\b\u0010\t\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0000H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010\u0003R\u0018\u00101\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00104\u001a\u00020\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00108\u001a\b\u0012\u0004\u0012\u000206058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u00107R\u0014\u0010;\u001a\u00020\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006<"}, d2 = {"LQ6/i;", "LQ6/g;", "<init>", "()V", "", "other", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "T", "value", "q", "(Ljava/lang/Object;)LQ6/i;", "e", "()Ljava/lang/Object;", "G", "()LQ6/g;", "E", "C", "K", "", "name", "q1", "(Ljava/lang/String;)LQ6/g;", "n", "(Ljava/lang/String;)LQ6/i;", "", "o", "(Z)LQ6/i;", "", "f", "(D)LQ6/i;", "", "g", "(I)LQ6/i;", "", "h", "(J)LQ6/i;", "LQ6/e;", "l", "(LQ6/e;)LQ6/i;", "LM6/B;", "i", "(LM6/B;)LQ6/i;", "d", "()LQ6/i;", "LXH/N;", "close", "a", "Ljava/lang/Object;", "root", "b", "Z", "rootSet", "", "LQ6/i$a;", "Ljava/util/List;", "stack", "m", "()Ljava/lang/String;", "path", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class i implements g {

    /* renamed from: a  reason: collision with root package name */
    private Object f39622a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f39623b;

    /* renamed from: c  reason: collision with root package name */
    private final List<a> f39624c = new ArrayList();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LQ6/i$a;", "", "<init>", "()V", "a", "b", "LQ6/i$a$a;", "LQ6/i$a$b;", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"LQ6/i$a$a;", "LQ6/i$a;", "", "", "list", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "a", "Ljava/util/List;", "()Ljava/util/List;", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: Q6.i$a$a  reason: collision with other inner class name */
        public static final class C0630a extends a {

            /* renamed from: a  reason: collision with root package name */
            private final List<Object> f39625a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0630a(List<Object> list) {
                super((DefaultConstructorMarker) null);
                C17542s.j(list, "list");
                this.f39625a = list;
            }

            public final List<Object> a() {
                return this.f39625a;
            }

            public String toString() {
                return "List (" + this.f39625a.size() + ')';
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u000e\u0018\u00002\u00020\u0001B'\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nR%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR$\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LQ6/i$a$b;", "LQ6/i$a;", "", "", "", "map", "name", "<init>", "(Ljava/util/Map;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "b", "Ljava/lang/String;", "c", "(Ljava/lang/String;)V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class b extends a {

            /* renamed from: a  reason: collision with root package name */
            private final Map<String, Object> f39626a;

            /* renamed from: b  reason: collision with root package name */
            private String f39627b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(Map<String, Object> map, String str) {
                super((DefaultConstructorMarker) null);
                C17542s.j(map, "map");
                this.f39626a = map;
                this.f39627b = str;
            }

            public final Map<String, Object> a() {
                return this.f39626a;
            }

            public final String b() {
                return this.f39627b;
            }

            public final void c(String str) {
                this.f39627b = str;
            }

            public String toString() {
                return "Map (" + this.f39627b + ')';
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final Object c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj2 == null) {
            return obj;
        }
        if (obj instanceof List) {
            if (obj2 instanceof List) {
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list.size() == list2.size()) {
                    C17974j o10 = C16877v.o((Collection) obj);
                    ArrayList arrayList = new ArrayList(C16877v.y(o10, 10));
                    Iterator it = o10.iterator();
                    while (it.hasNext()) {
                        int c10 = ((U) it).c();
                        arrayList.add(c(list.get(c10), list2.get(c10)));
                    }
                    return arrayList;
                }
                throw new IllegalStateException(("Cannot merge " + obj + " with " + obj2).toString());
            }
            throw new IllegalStateException(("Cannot merge " + obj + " with " + obj2).toString());
        } else if (obj instanceof Map) {
            if (obj2 instanceof Map) {
                Map map = (Map) obj;
                Map map2 = (Map) obj2;
                Iterable<String> k10 = g0.k(map.keySet(), map2.keySet());
                ArrayList arrayList2 = new ArrayList(C16877v.y(k10, 10));
                for (String str : k10) {
                    arrayList2.add(C16796C.a(str, c(map.get(str), map2.get(str))));
                }
                return X.v(arrayList2);
            }
            throw new IllegalStateException(("Cannot merge " + obj + " with " + obj2).toString());
        } else if (C17542s.e(obj, obj2)) {
            return obj;
        } else {
            throw new IllegalStateException(("Cannot merge " + obj + " with " + obj2).toString());
        }
    }

    private final <T> i q(T t10) {
        a aVar = (a) C16877v.K0(this.f39624c);
        if (aVar instanceof a.b) {
            a.b bVar = (a.b) aVar;
            String b10 = bVar.b();
            if (b10 != null) {
                if (bVar.a().containsKey(b10)) {
                    bVar.a().put(b10, c(bVar.a().get(b10), t10));
                } else {
                    bVar.a().put(b10, t10);
                }
                bVar.c((String) null);
            } else {
                throw new IllegalStateException("Check failed.");
            }
        } else if (aVar instanceof a.C0630a) {
            ((a.C0630a) aVar).a().add(t10);
        } else {
            this.f39622a = t10;
            this.f39623b = true;
        }
        return this;
    }

    public g C() {
        this.f39624c.add(new a.b(new LinkedHashMap(), (String) null));
        return this;
    }

    public g E() {
        List<a> list = this.f39624c;
        a remove = list.remove(list.size() - 1);
        if (remove instanceof a.C0630a) {
            q(((a.C0630a) remove).a());
            return this;
        }
        throw new IllegalStateException("Check failed.");
    }

    public g G() {
        this.f39624c.add(new a.C0630a(new ArrayList()));
        return this;
    }

    public g K() {
        List<a> list = this.f39624c;
        a remove = list.remove(list.size() - 1);
        if (remove instanceof a.b) {
            q(((a.b) remove).a());
            return this;
        }
        throw new IllegalStateException("Check failed.");
    }

    public void close() {
    }

    /* renamed from: d */
    public i e3() {
        return q((Object) null);
    }

    public final Object e() {
        if (this.f39623b) {
            return this.f39622a;
        }
        throw new IllegalStateException("Check failed.");
    }

    /* renamed from: f */
    public i c0(double d10) {
        return q(Double.valueOf(d10));
    }

    /* renamed from: g */
    public i X(int i10) {
        return q(Integer.valueOf(i10));
    }

    /* renamed from: h */
    public i V(long j10) {
        return q(Long.valueOf(j10));
    }

    /* renamed from: i */
    public i x1(B b10) {
        C17542s.j(b10, "value");
        return q((Object) null);
    }

    /* renamed from: l */
    public i m1(e eVar) {
        C17542s.j(eVar, "value");
        return q(eVar);
    }

    public String m() {
        String str;
        Iterable<a> iterable = this.f39624c;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (a aVar : iterable) {
            if (aVar instanceof a.C0630a) {
                str = String.valueOf(((a.C0630a) aVar).a().size());
            } else if (aVar instanceof a.b) {
                str = ((a.b) aVar).b();
                if (str == null) {
                    str = "?";
                }
            } else {
                throw new t();
            }
            arrayList.add(str);
        }
        return C16877v.G0(arrayList, ".", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null);
    }

    /* renamed from: n */
    public i T1(String str) {
        C17542s.j(str, "value");
        return q(str);
    }

    /* renamed from: o */
    public i z0(boolean z10) {
        return q(Boolean.valueOf(z10));
    }

    public g q1(String str) {
        C17542s.j(str, "name");
        a aVar = (a) C16877v.I0(this.f39624c);
        if (aVar instanceof a.b) {
            a.b bVar = (a.b) aVar;
            if (bVar.b() == null) {
                bVar.c(str);
                return this;
            }
            throw new IllegalStateException("Check failed.");
        }
        throw new IllegalStateException("Check failed.");
    }
}
