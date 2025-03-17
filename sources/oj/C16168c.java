package OJ;

import KJ.C15992h;
import MJ.C16083f;
import PJ.C16207a;
import PJ.C16209c;
import YH.C16866j;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.p;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u000eJ\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR$\u0010%\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b \u0010\"\"\u0004\b#\u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010!R&\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020)0(8\u0000X\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020\u001a8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001c¨\u00060"}, d2 = {"LOJ/c;", "E", "LYH/j;", "LKJ/h$a;", "LOJ/b;", "set", "<init>", "(LOJ/b;)V", "LKJ/h;", "g", "()LKJ/h;", "element", "", "contains", "(Ljava/lang/Object;)Z", "add", "remove", "LXH/N;", "clear", "()V", "", "iterator", "()Ljava/util/Iterator;", "", "other", "equals", "", "hashCode", "()I", "a", "LOJ/b;", "builtSet", "b", "Ljava/lang/Object;", "()Ljava/lang/Object;", "setFirstElement$kotlinx_collections_immutable", "(Ljava/lang/Object;)V", "firstElement", "c", "lastElement", "LMJ/f;", "LOJ/a;", "d", "LMJ/f;", "i", "()LMJ/f;", "hashMapBuilder", "size", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: OJ.c  reason: case insensitive filesystem */
public final class C16168c<E> extends C16866j<E> implements C15992h.a<E> {

    /* renamed from: a  reason: collision with root package name */
    private C16167b<E> f136927a;

    /* renamed from: b  reason: collision with root package name */
    private Object f136928b;

    /* renamed from: c  reason: collision with root package name */
    private Object f136929c;

    /* renamed from: d  reason: collision with root package name */
    private final C16083f<E, C16166a> f136930d;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"E", "LOJ/a;", "<anonymous parameter 0>", "<anonymous parameter 1>", "", "a", "(LOJ/a;LOJ/a;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: OJ.c$a */
    static final class a extends C17544u implements p<C16166a, C16166a, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f136931c = new a();

        a() {
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
    /* renamed from: OJ.c$b */
    static final class b extends C17544u implements p<C16166a, C16166a, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f136932c = new b();

        b() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean invoke(C16166a aVar, C16166a aVar2) {
            C17542s.j(aVar, "<anonymous parameter 0>");
            C17542s.j(aVar2, "<anonymous parameter 1>");
            return Boolean.TRUE;
        }
    }

    public C16168c(C16167b<E> bVar) {
        C17542s.j(bVar, "set");
        this.f136927a = bVar;
        this.f136928b = bVar.m();
        this.f136929c = bVar.q();
        this.f136930d = bVar.p().e();
    }

    public int a() {
        return this.f136930d.size();
    }

    public boolean add(E e10) {
        if (this.f136930d.containsKey(e10)) {
            return false;
        }
        this.f136927a = null;
        if (isEmpty()) {
            this.f136928b = e10;
            this.f136929c = e10;
            this.f136930d.put(e10, new C16166a());
            return true;
        }
        C16166a aVar = this.f136930d.get(this.f136929c);
        C17542s.g(aVar);
        this.f136930d.put(this.f136929c, aVar.e(e10));
        this.f136930d.put(e10, new C16166a(this.f136929c));
        this.f136929c = e10;
        return true;
    }

    public final Object b() {
        return this.f136928b;
    }

    public void clear() {
        if (!this.f136930d.isEmpty()) {
            this.f136927a = null;
        }
        this.f136930d.clear();
        C16209c cVar = C16209c.f137201a;
        this.f136928b = cVar;
        this.f136929c = cVar;
    }

    public boolean contains(Object obj) {
        return this.f136930d.containsKey(obj);
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
        return set instanceof C16167b ? this.f136930d.k().k(((C16167b) obj).p().s(), a.f136931c) : set instanceof C16168c ? this.f136930d.k().k(((C16168c) obj).f136930d.k(), b.f136932c) : super.equals(obj);
    }

    public C15992h<E> g() {
        C16167b<E> bVar = this.f136927a;
        boolean z10 = false;
        if (bVar != null) {
            C16207a.a(this.f136930d.h() != null);
            C16207a.a(this.f136928b == bVar.m());
            if (this.f136929c == bVar.q()) {
                z10 = true;
            }
            C16207a.a(z10);
            return bVar;
        }
        if (this.f136930d.h() == null) {
            z10 = true;
        }
        C16207a.a(z10);
        C16167b<E> bVar2 = new C16167b<>(this.f136928b, this.f136929c, this.f136930d.g());
        this.f136927a = bVar2;
        return bVar2;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public final C16083f<E, C16166a> i() {
        return this.f136930d;
    }

    public Iterator<E> iterator() {
        return new C16170e(this);
    }

    public boolean remove(Object obj) {
        C16166a remove = this.f136930d.remove(obj);
        if (remove == null) {
            return false;
        }
        this.f136927a = null;
        if (remove.b()) {
            C16166a aVar = this.f136930d.get(remove.d());
            C17542s.g(aVar);
            this.f136930d.put(remove.d(), aVar.e(remove.c()));
        } else {
            this.f136928b = remove.c();
        }
        if (remove.a()) {
            C16166a aVar2 = this.f136930d.get(remove.c());
            C17542s.g(aVar2);
            this.f136930d.put(remove.c(), aVar2.f(remove.d()));
            return true;
        }
        this.f136929c = remove.d();
        return true;
    }
}
