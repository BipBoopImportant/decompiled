package OJ;

import KJ.C15992h;
import MJ.C16081d;
import PJ.C16209c;
import YH.C16867k;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000f\b\u0000\u0018\u0000 \u0018*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001)B/\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u000fJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0000X\u0004¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00078\u0000X\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020\u001c8VX\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u001e¨\u0006+"}, d2 = {"LOJ/b;", "E", "LYH/k;", "LKJ/h;", "", "firstElement", "lastElement", "LMJ/d;", "LOJ/a;", "hashMap", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;LMJ/d;)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "addAll", "(Ljava/util/Collection;)LKJ/h;", "", "iterator", "()Ljava/util/Iterator;", "LKJ/h$a;", "e", "()LKJ/h$a;", "other", "equals", "", "hashCode", "()I", "b", "Ljava/lang/Object;", "m", "()Ljava/lang/Object;", "c", "q", "d", "LMJ/d;", "p", "()LMJ/d;", "a", "size", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: OJ.b  reason: case insensitive filesystem */
public final class C16167b<E> extends C16867k<E> implements C15992h<E> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f136920e = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final C16167b f136921f;

    /* renamed from: b  reason: collision with root package name */
    private final Object f136922b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f136923c;

    /* renamed from: d  reason: collision with root package name */
    private final C16081d<E, C16166a> f136924d;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0001\u0010\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LOJ/b$a;", "", "<init>", "()V", "E", "LKJ/h;", "a", "()LKJ/h;", "LOJ/b;", "", "EMPTY", "LOJ/b;", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: OJ.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <E> C15992h<E> a() {
            return C16167b.f136921f;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"E", "LOJ/a;", "<anonymous parameter 0>", "<anonymous parameter 1>", "", "a", "(LOJ/a;LOJ/a;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: OJ.b$b  reason: collision with other inner class name */
    static final class C3362b extends C17544u implements p<C16166a, C16166a, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final C3362b f136925c = new C3362b();

        C3362b() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean invoke(C16166a aVar, C16166a aVar2) {
            C17542s.j(aVar, "<anonymous parameter 0>");
            C17542s.j(aVar2, "<anonymous parameter 1>");
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"E", "LOJ/a;", "<anonymous parameter 0>", "<anonymous parameter 1>", "", "a", "(LOJ/a;LOJ/a;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: OJ.b$c */
    static final class c extends C17544u implements p<C16166a, C16166a, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final c f136926c = new c();

        c() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean invoke(C16166a aVar, C16166a aVar2) {
            C17542s.j(aVar, "<anonymous parameter 0>");
            C17542s.j(aVar2, "<anonymous parameter 1>");
            return Boolean.TRUE;
        }
    }

    static {
        C16209c cVar = C16209c.f137201a;
        f136921f = new C16167b(cVar, cVar, C16081d.f136411d.a());
    }

    public C16167b(Object obj, Object obj2, C16081d<E, C16166a> dVar) {
        C17542s.j(dVar, "hashMap");
        this.f136922b = obj;
        this.f136923c = obj2;
        this.f136924d = dVar;
    }

    public int a() {
        return this.f136924d.size();
    }

    public C15992h<E> addAll(Collection<? extends E> collection) {
        C17542s.j(collection, "elements");
        if (collection.isEmpty()) {
            return this;
        }
        C15992h.a e10 = e();
        e10.addAll(collection);
        return e10.g();
    }

    public boolean contains(Object obj) {
        return this.f136924d.containsKey(obj);
    }

    public C15992h.a<E> e() {
        return new C16168c(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        return set instanceof C16167b ? this.f136924d.s().k(((C16167b) obj).f136924d.s(), C3362b.f136925c) : set instanceof C16168c ? this.f136924d.s().k(((C16168c) obj).i().k(), c.f136926c) : super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public Iterator<E> iterator() {
        return new C16169d(this.f136922b, this.f136924d);
    }

    public final Object m() {
        return this.f136922b;
    }

    public final C16081d<E, C16166a> p() {
        return this.f136924d;
    }

    public final Object q() {
        return this.f136923c;
    }
}
