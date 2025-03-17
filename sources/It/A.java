package It;

import IC.C13023e;
import Op.d1;
import XH.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import vB.C15129b;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0007\b\t\n\u000b\f\r\u000e\u0005\u000fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006\u0001\t\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"LIt/A;", "", "LIt/A$h;", "sortOrder", "", "a", "(LIt/A$h;)I", "g", "b", "d", "k", "f", "j", "e", "i", "h", "LIt/A$a;", "LIt/A$b;", "LIt/A$d;", "LIt/A$e;", "LIt/A$f;", "LIt/A$g;", "LIt/A$i;", "LIt/A$j;", "LIt/A$k;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface A {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LIt/A$a;", "LIt/A;", "", "", "storeNames", "<init>", "(Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements A {

        /* renamed from: a  reason: collision with root package name */
        private final List<String> f82043a;

        public a(List<String> list) {
            C17542s.j(list, "storeNames");
            this.f82043a = list;
        }

        public int a(h hVar) {
            return c.a(this, hVar);
        }

        public final List<String> b() {
            return this.f82043a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C17542s.e(this.f82043a, ((a) obj).f82043a);
        }

        public int hashCode() {
            return this.f82043a.hashCode();
        }

        public String toString() {
            List<String> list = this.f82043a;
            return "ChangeStore(storeNames=" + list + ")";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u0007\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LIt/A$b;", "LIt/A;", "", "LIt/o;", "contextualCards", "<init>", "(Ljava/util/List;)V", "b", "(Ljava/util/List;)LIt/A$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements A {

        /* renamed from: a  reason: collision with root package name */
        private final List<C10752o> f82044a;

        public b(List<? extends C10752o> list) {
            C17542s.j(list, "contextualCards");
            this.f82044a = list;
        }

        public int a(h hVar) {
            return c.a(this, hVar);
        }

        public final b b(List<? extends C10752o> list) {
            C17542s.j(list, "contextualCards");
            return new b(list);
        }

        public final List<C10752o> c() {
            return this.f82044a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f82044a, ((b) obj).f82044a);
        }

        public int hashCode() {
            return this.f82044a.hashCode();
        }

        public String toString() {
            List<C10752o> list = this.f82044a;
            return "ContextualCards(contextualCards=" + list + ")";
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c {
        public static int a(A a10, h hVar) {
            C17542s.j(hVar, "sortOrder");
            return hVar.a(a10);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LIt/A$d;", "LIt/A;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements A {

        /* renamed from: a  reason: collision with root package name */
        public static final d f82045a = new d();

        private d() {
        }

        public int a(h hVar) {
            return c.a(this, hVar);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return -2094251136;
        }

        public String toString() {
            return "DisableStoreMode";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LIt/A$e;", "LIt/A;", "LGt/a;", "ikeaFamilyState", "<init>", "(LGt/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LGt/a;", "b", "()LGt/a;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e implements A {

        /* renamed from: a  reason: collision with root package name */
        private final Gt.a f82046a;

        public e(Gt.a aVar) {
            C17542s.j(aVar, "ikeaFamilyState");
            this.f82046a = aVar;
        }

        public int a(h hVar) {
            return c.a(this, hVar);
        }

        public final Gt.a b() {
            return this.f82046a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C17542s.e(this.f82046a, ((e) obj).f82046a);
        }

        public int hashCode() {
            return this.f82046a.hashCode();
        }

        public String toString() {
            Gt.a aVar = this.f82046a;
            return "FamilyEntry(ikeaFamilyState=" + aVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LIt/A$f;", "LIt/A;", "LvB/b;", "state", "<init>", "(LvB/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LvB/b;", "b", "()LvB/b;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f implements A {

        /* renamed from: b  reason: collision with root package name */
        public static final int f82047b = C15129b.f131420c;

        /* renamed from: a  reason: collision with root package name */
        private final C15129b f82048a;

        public f(C15129b bVar) {
            C17542s.j(bVar, "state");
            this.f82048a = bVar;
        }

        public int a(h hVar) {
            return c.a(this, hVar);
        }

        public final C15129b b() {
            return this.f82048a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && C17542s.e(this.f82048a, ((f) obj).f82048a);
        }

        public int hashCode() {
            return this.f82048a.hashCode();
        }

        public String toString() {
            C15129b bVar = this.f82048a;
            return "ShoppingLists(state=" + bVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LIt/A$g;", "LIt/A;", "LGt/e;", "data", "<init>", "(LGt/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LGt/e;", "b", "()LGt/e;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class g implements A {

        /* renamed from: b  reason: collision with root package name */
        public static final int f82049b = C13023e.f110931a;

        /* renamed from: a  reason: collision with root package name */
        private final Gt.e f82050a;

        public g(Gt.e eVar) {
            C17542s.j(eVar, "data");
            this.f82050a = eVar;
        }

        public int a(h hVar) {
            return c.a(this, hVar);
        }

        public final Gt.e b() {
            return this.f82050a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && C17542s.e(this.f82050a, ((g) obj).f82050a);
        }

        public int hashCode() {
            return this.f82050a.hashCode();
        }

        public String toString() {
            Gt.e eVar = this.f82050a;
            return "SmallStore(data=" + eVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\n\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\b\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"LIt/A$h;", "", "<init>", "()V", "LIt/A;", "item", "", "b", "(LIt/A;)I", "c", "a", "LIt/A$h$a;", "LIt/A$h$b;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class h {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LIt/A$h$a;", "LIt/A$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends h {

            /* renamed from: a  reason: collision with root package name */
            public static final a f82051a = new a();

            private a() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 1040196858;
            }

            public String toString() {
                return "Regular";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LIt/A$h$b;", "LIt/A$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b extends h {

            /* renamed from: a  reason: collision with root package name */
            public static final b f82052a = new b();

            private b() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 62359775;
            }

            public String toString() {
                return "StoreModeEnabled";
            }
        }

        public /* synthetic */ h(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int b(A a10) {
            if (a10 instanceof g) {
                return 0;
            }
            if (a10 instanceof b) {
                return 1;
            }
            if (a10 instanceof k) {
                return 2;
            }
            if (a10 instanceof f) {
                return 3;
            }
            if (a10 instanceof j) {
                return 4;
            }
            if (a10 instanceof e) {
                return 5;
            }
            if (a10 instanceof i) {
                return 6;
            }
            if (a10 instanceof a) {
                return 7;
            }
            if (a10 instanceof d) {
                return 8;
            }
            throw new t();
        }

        private final int c(A a10) {
            if (a10 instanceof g) {
                return 0;
            }
            if (a10 instanceof b) {
                return 1;
            }
            if (a10 instanceof f) {
                return 2;
            }
            if (a10 instanceof k) {
                return 3;
            }
            if (a10 instanceof j) {
                return 4;
            }
            if (a10 instanceof e) {
                return 5;
            }
            if (a10 instanceof i) {
                return 6;
            }
            if (a10 instanceof a) {
                return 7;
            }
            if (a10 instanceof d) {
                return 8;
            }
            throw new t();
        }

        public final int a(A a10) {
            C17542s.j(a10, "item");
            if (C17542s.e(this, a.f82051a)) {
                return b(a10);
            }
            if (C17542s.e(this, b.f82052a)) {
                return c(a10);
            }
            throw new t();
        }

        private h() {
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LIt/A$i;", "LIt/A;", "LMt/a;", "benefit", "<init>", "(LMt/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LMt/a;", "b", "()LMt/a;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class i implements A {

        /* renamed from: a  reason: collision with root package name */
        private final Mt.a f82053a;

        public i(Mt.a aVar) {
            C17542s.j(aVar, "benefit");
            this.f82053a = aVar;
        }

        public int a(h hVar) {
            return c.a(this, hVar);
        }

        public final Mt.a b() {
            return this.f82053a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && C17542s.e(this.f82053a, ((i) obj).f82053a);
        }

        public int hashCode() {
            return this.f82053a.hashCode();
        }

        public String toString() {
            Mt.a aVar = this.f82053a;
            return "StoreBenefit(benefit=" + aVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LIt/A$j;", "LIt/A;", "LXt/b;", "state", "<init>", "(LXt/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LXt/b;", "b", "()LXt/b;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class j implements A {

        /* renamed from: b  reason: collision with root package name */
        public static final int f82054b = C13023e.f110931a;

        /* renamed from: a  reason: collision with root package name */
        private final Xt.b f82055a;

        public j(Xt.b bVar) {
            C17542s.j(bVar, "state");
            this.f82055a = bVar;
        }

        public int a(h hVar) {
            return c.a(this, hVar);
        }

        public final Xt.b b() {
            return this.f82055a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && C17542s.e(this.f82055a, ((j) obj).f82055a);
        }

        public int hashCode() {
            return this.f82055a.hashCode();
        }

        public String toString() {
            Xt.b bVar = this.f82055a;
            return "StoreEvents(state=" + bVar + ")";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"LIt/A$k;", "LIt/A;", "", "LOp/d1;", "offers", "", "loading", "<init>", "(Ljava/util/List;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Z", "()Z", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class k implements A {

        /* renamed from: a  reason: collision with root package name */
        private final List<d1> f82056a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f82057b;

        public k(List<d1> list, boolean z10) {
            C17542s.j(list, "offers");
            this.f82056a = list;
            this.f82057b = z10;
        }

        public int a(h hVar) {
            return c.a(this, hVar);
        }

        public final boolean b() {
            return this.f82057b;
        }

        public final List<d1> c() {
            return this.f82056a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return C17542s.e(this.f82056a, kVar.f82056a) && this.f82057b == kVar.f82057b;
        }

        public int hashCode() {
            return (this.f82056a.hashCode() * 31) + Boolean.hashCode(this.f82057b);
        }

        public String toString() {
            List<d1> list = this.f82056a;
            boolean z10 = this.f82057b;
            return "StoreOffers(offers=" + list + ", loading=" + z10 + ")";
        }
    }

    int a(h hVar);
}
