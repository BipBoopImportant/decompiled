package ZH;

import YH.C16866j;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oI.C17698f;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000 \f*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005:\u0001!B\u001b\b\u0000\u0012\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\b\u0010\tB\t\b\u0016¢\u0006\u0004\b\b\u0010\nJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\nJ\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0013J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\u000e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001f\u001a\u00020\u000e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u001d\u0010 \u001a\u00020\u000e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0016¢\u0006\u0004\b \u0010\u001eR\u001e\u0010\u0007\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020#8VX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010$¨\u0006&"}, d2 = {"LZH/h;", "E", "", "LYH/j;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "LZH/d;", "backing", "<init>", "(LZH/d;)V", "()V", "", "b", "()Ljava/util/Set;", "", "isEmpty", "()Z", "element", "contains", "(Ljava/lang/Object;)Z", "LXH/N;", "clear", "add", "remove", "", "iterator", "()Ljava/util/Iterator;", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "removeAll", "retainAll", "a", "LZH/d;", "", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ZH.h  reason: case insensitive filesystem */
public final class C17003h<E> extends C16866j<E> implements Set<E>, Serializable, C17698f {

    /* renamed from: b  reason: collision with root package name */
    private static final a f140786b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private static final C17003h f140787c = new C17003h(C16999d.f140761n.e());

    /* renamed from: a  reason: collision with root package name */
    private final C16999d<E, ?> f140788a;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LZH/h$a;", "", "<init>", "()V", "LZH/h;", "", "Empty", "LZH/h;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ZH.h$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C17003h(C16999d<E, ?> dVar) {
        C17542s.j(dVar, "backing");
        this.f140788a = dVar;
    }

    public int a() {
        return this.f140788a.size();
    }

    public boolean add(E e10) {
        return this.f140788a.m(e10) >= 0;
    }

    public boolean addAll(Collection<? extends E> collection) {
        C17542s.j(collection, "elements");
        this.f140788a.p();
        return super.addAll(collection);
    }

    public final Set<E> b() {
        this.f140788a.o();
        return size() > 0 ? this : f140787c;
    }

    public void clear() {
        this.f140788a.clear();
    }

    public boolean contains(Object obj) {
        return this.f140788a.containsKey(obj);
    }

    public boolean isEmpty() {
        return this.f140788a.isEmpty();
    }

    public Iterator<E> iterator() {
        return this.f140788a.I();
    }

    public boolean remove(Object obj) {
        return this.f140788a.R(obj);
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        C17542s.j(collection, "elements");
        this.f140788a.p();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        C17542s.j(collection, "elements");
        this.f140788a.p();
        return super.retainAll(collection);
    }

    public C17003h() {
        this(new C16999d());
    }
}
