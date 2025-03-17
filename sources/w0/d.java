package W0;

import GJ.C15767j;
import GJ.C15768k;
import XH.C16807N;
import dI.C17164e;
import j0.Z;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.internal.C17534j;
import nI.p;
import oI.C17693a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0000X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001b"}, d2 = {"LW0/d;", "T", "", "Lj0/Z;", "set", "<init>", "(Lj0/Z;)V", "", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "element", "contains", "(Ljava/lang/Object;)Z", "a", "Lj0/Z;", "b", "()Lj0/Z;", "", "()I", "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d<T> implements Set<T>, C17693a {

    /* renamed from: a  reason: collision with root package name */
    private final Z<T> f14632a;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LGJ/j;", "LXH/N;", "<anonymous>", "(LGJ/j;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.runtime.collection.ScatterSetWrapper$iterator$1", f = "ScatterSetWrapper.kt", l = {34}, m = "invokeSuspend")
    static final class a extends k implements p<C15767j<? super T>, C17164e<? super C16807N>, Object> {

        /* renamed from: d  reason: collision with root package name */
        Object f14633d;

        /* renamed from: e  reason: collision with root package name */
        Object f14634e;

        /* renamed from: f  reason: collision with root package name */
        int f14635f;

        /* renamed from: g  reason: collision with root package name */
        int f14636g;

        /* renamed from: h  reason: collision with root package name */
        int f14637h;

        /* renamed from: i  reason: collision with root package name */
        int f14638i;

        /* renamed from: j  reason: collision with root package name */
        long f14639j;

        /* renamed from: k  reason: collision with root package name */
        int f14640k;

        /* renamed from: l  reason: collision with root package name */
        private /* synthetic */ Object f14641l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ d<T> f14642m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d<T> dVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f14642m = dVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f14642m, eVar);
            aVar.f14641l = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(C15767j<? super T> jVar, C17164e<? super C16807N> eVar) {
            return ((a) create(jVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0076  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0097  */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                r20 = this;
                r0 = r20
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f14640k
                r3 = 0
                r4 = 8
                r5 = 1
                if (r2 == 0) goto L_0x0033
                if (r2 != r5) goto L_0x002b
                int r2 = r0.f14638i
                int r6 = r0.f14637h
                long r7 = r0.f14639j
                int r9 = r0.f14636g
                int r10 = r0.f14635f
                java.lang.Object r11 = r0.f14634e
                long[] r11 = (long[]) r11
                java.lang.Object r12 = r0.f14633d
                java.lang.Object[] r12 = (java.lang.Object[]) r12
                java.lang.Object r13 = r0.f14641l
                GJ.j r13 = (GJ.C15767j) r13
                XH.y.b(r21)
                goto L_0x0094
            L_0x002b:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0033:
                XH.y.b(r21)
                java.lang.Object r2 = r0.f14641l
                GJ.j r2 = (GJ.C15767j) r2
                W0.d<T> r6 = r0.f14642m
                j0.Z r6 = r6.b()
                java.lang.Object[] r7 = r6.f24576b
                long[] r6 = r6.f24575a
                int r8 = r6.length
                int r8 = r8 + -2
                if (r8 < 0) goto L_0x00a2
                r9 = r3
            L_0x004a:
                r10 = r6[r9]
                long r12 = ~r10
                r14 = 7
                long r12 = r12 << r14
                long r12 = r12 & r10
                r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r12 = r12 & r14
                int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r12 == 0) goto L_0x009d
                int r12 = r9 - r8
                int r12 = ~r12
                int r12 = r12 >>> 31
                int r12 = 8 - r12
                r13 = r2
                r2 = r3
                r18 = r10
                r11 = r6
                r10 = r8
                r6 = r12
                r12 = r7
                r7 = r18
            L_0x006b:
                if (r2 >= r6) goto L_0x0097
                r14 = 255(0xff, double:1.26E-321)
                long r14 = r14 & r7
                r16 = 128(0x80, double:6.32E-322)
                int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                if (r14 >= 0) goto L_0x0094
                int r14 = r9 << 3
                int r14 = r14 + r2
                r14 = r12[r14]
                r0.f14641l = r13
                r0.f14633d = r12
                r0.f14634e = r11
                r0.f14635f = r10
                r0.f14636g = r9
                r0.f14639j = r7
                r0.f14637h = r6
                r0.f14638i = r2
                r0.f14640k = r5
                java.lang.Object r14 = r13.d(r14, r0)
                if (r14 != r1) goto L_0x0094
                return r1
            L_0x0094:
                long r7 = r7 >> r4
                int r2 = r2 + r5
                goto L_0x006b
            L_0x0097:
                if (r6 != r4) goto L_0x00a2
                r8 = r10
                r6 = r11
                r7 = r12
                r2 = r13
            L_0x009d:
                if (r9 == r8) goto L_0x00a2
                int r9 = r9 + 1
                goto L_0x004a
            L_0x00a2:
                XH.N r1 = XH.C16807N.f139792a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: W0.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public d(Z<T> z10) {
        this.f14632a = z10;
    }

    public int a() {
        return this.f14632a.c();
    }

    public boolean add(T t10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Z<T> b() {
        return this.f14632a;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        return this.f14632a.a(obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        Iterable<Object> iterable = collection;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object a10 : iterable) {
            if (!this.f14632a.a(a10)) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return this.f14632a.d();
    }

    public Iterator<T> iterator() {
        return C15768k.a(new a(this, (C17164e<? super a>) null));
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return a();
    }

    public Object[] toArray() {
        return C17534j.a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        return C17534j.b(this, tArr);
    }
}
