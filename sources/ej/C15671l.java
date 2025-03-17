package EJ;

import YH.C16866j;
import YH.C16870n;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.C17527c;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.W;
import oI.C17693a;

/* renamed from: EJ.l  reason: case insensitive filesystem */
public final class C15671l<T> extends C16866j<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final b f134268c = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private Object f134269a;

    /* renamed from: b  reason: collision with root package name */
    private int f134270b;

    /* renamed from: EJ.l$a */
    private static final class a<T> implements Iterator<T>, C17693a {

        /* renamed from: a  reason: collision with root package name */
        private final Iterator<T> f134271a;

        public a(T[] tArr) {
            C17542s.j(tArr, "array");
            this.f134271a = C17527c.a(tArr);
        }

        /* renamed from: c */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.f134271a.hasNext();
        }

        public T next() {
            return this.f134271a.next();
        }
    }

    /* renamed from: EJ.l$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T> C15671l<T> a() {
            return new C15671l<>((DefaultConstructorMarker) null);
        }

        public final <T> C15671l<T> b(Collection<? extends T> collection) {
            C17542s.j(collection, "set");
            C15671l<T> lVar = new C15671l<>((DefaultConstructorMarker) null);
            lVar.addAll(collection);
            return lVar;
        }

        private b() {
        }
    }

    /* renamed from: EJ.l$c */
    private static final class c<T> implements Iterator<T>, C17693a {

        /* renamed from: a  reason: collision with root package name */
        private final T f134272a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f134273b = true;

        public c(T t10) {
            this.f134272a = t10;
        }

        /* renamed from: c */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.f134273b;
        }

        public T next() {
            if (this.f134273b) {
                this.f134273b = false;
                return this.f134272a;
            }
            throw new NoSuchElementException();
        }
    }

    public /* synthetic */ C15671l(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final <T> C15671l<T> b() {
        return f134268c.a();
    }

    public int a() {
        return this.f134270b;
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean add(T r5) {
        /*
            r4 = this;
            int r0 = r4.size()
            r1 = 1
            if (r0 != 0) goto L_0x000a
            r4.f134269a = r5
            goto L_0x0075
        L_0x000a:
            int r0 = r4.size()
            r2 = 0
            if (r0 != r1) goto L_0x0023
            java.lang.Object r0 = r4.f134269a
            boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r5)
            if (r0 == 0) goto L_0x001a
            return r2
        L_0x001a:
            java.lang.Object r0 = r4.f134269a
            java.lang.Object[] r5 = new java.lang.Object[]{r0, r5}
            r4.f134269a = r5
            goto L_0x0075
        L_0x0023:
            int r0 = r4.size()
            r3 = 5
            if (r0 >= r3) goto L_0x0063
            java.lang.Object r0 = r4.f134269a
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>"
            kotlin.jvm.internal.C17542s.h(r0, r3)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            boolean r3 = YH.C16870n.a0(r0, r5)
            if (r3 == 0) goto L_0x003a
            return r2
        L_0x003a:
            int r2 = r4.size()
            r3 = 4
            if (r2 != r3) goto L_0x004e
            int r2 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            java.util.LinkedHashSet r0 = YH.g0.e(r0)
            r0.add(r5)
            goto L_0x0060
        L_0x004e:
            int r2 = r4.size()
            int r2 = r2 + r1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            java.lang.String r2 = "copyOf(...)"
            kotlin.jvm.internal.C17542s.i(r0, r2)
            int r2 = r0.length
            int r2 = r2 - r1
            r0[r2] = r5
        L_0x0060:
            r4.f134269a = r0
            goto L_0x0075
        L_0x0063:
            java.lang.Object r0 = r4.f134269a
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>"
            kotlin.jvm.internal.C17542s.h(r0, r3)
            java.util.Set r0 = kotlin.jvm.internal.W.f(r0)
            boolean r5 = r0.add(r5)
            if (r5 != 0) goto L_0x0075
            return r2
        L_0x0075:
            int r5 = r4.size()
            int r5 = r5 + r1
            r4.i(r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: EJ.C15671l.add(java.lang.Object):boolean");
    }

    public void clear() {
        this.f134269a = null;
        i(0);
    }

    public boolean contains(Object obj) {
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return C17542s.e(this.f134269a, obj);
        }
        if (size() < 5) {
            Object obj2 = this.f134269a;
            C17542s.h(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return C16870n.a0((Object[]) obj2, obj);
        }
        Object obj3 = this.f134269a;
        C17542s.h(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    public void i(int i10) {
        this.f134270b = i10;
    }

    public Iterator<T> iterator() {
        if (size() == 0) {
            return Collections.emptySet().iterator();
        }
        if (size() == 1) {
            return new c(this.f134269a);
        }
        if (size() < 5) {
            Object obj = this.f134269a;
            C17542s.h(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new a((Object[]) obj);
        }
        Object obj2 = this.f134269a;
        C17542s.h(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return W.f(obj2).iterator();
    }

    private C15671l() {
    }
}
