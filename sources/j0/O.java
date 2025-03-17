package j0;

import GJ.C15767j;
import GJ.C15768k;
import XH.C16801H;
import XH.C16807N;
import YH.C16870n;
import dI.C17164e;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import k0.d;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import oI.C17693a;
import oI.C17698f;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\b\u0012\n\u0002\u0010#\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u00011B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010\u001e\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010 \u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u00132\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\"\u0010\u0015J\u0018\u0010#\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b#\u0010\u0017J\u0017\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0003H\u0001¢\u0006\u0004\b%\u0010\u0006J\r\u0010&\u001a\u00020\u0007¢\u0006\u0004\b&\u0010\fJ\u000f\u0010'\u001a\u00020\u0007H\u0000¢\u0006\u0004\b'\u0010\fJ\u000f\u0010(\u001a\u00020\u0007H\u0000¢\u0006\u0004\b(\u0010\fJ\u0017\u0010*\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0003H\u0000¢\u0006\u0004\b*\u0010\u0006J\u0013\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+¢\u0006\u0004\b,\u0010-R\u0016\u00100\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00062"}, d2 = {"Lj0/O;", "E", "Lj0/Z;", "", "initialCapacity", "<init>", "(I)V", "LXH/N;", "s", "capacity", "r", "q", "()V", "element", "o", "(Ljava/lang/Object;)I", "hash1", "p", "(I)I", "", "h", "(Ljava/lang/Object;)Z", "w", "(Ljava/lang/Object;)V", "", "elements", "j", "(Ljava/lang/Iterable;)Z", "i", "(Lj0/Z;)Z", "v", "(Ljava/lang/Iterable;)V", "u", "(Lj0/Z;)V", "x", "t", "index", "y", "m", "k", "n", "newCapacity", "z", "", "l", "()Ljava/util/Set;", "e", "I", "growthLimit", "a", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class O<E> extends Z<E> {

    /* renamed from: e  reason: collision with root package name */
    private int f24529e;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0006\b\u0004\u0018\u00002\f0\u0001R\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\tJ\u001d\u0010\u0015\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\u0015\u0010\rJ\u001d\u0010\u0016\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\u0016\u0010\r¨\u0006\u0017"}, d2 = {"Lj0/O$a;", "Lj0/Z$a;", "Lj0/Z;", "", "<init>", "(Lj0/O;)V", "element", "", "add", "(Ljava/lang/Object;)Z", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "LXH/N;", "clear", "()V", "", "iterator", "()Ljava/util/Iterator;", "remove", "retainAll", "removeAll", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class a extends Z<E>.defpackage.a implements Set<E>, C17698f {

        @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"j0/O$a$a", "", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "LXH/N;", "remove", "()V", "", "a", "I", "getCurrent", "()I", "c", "(I)V", "current", "", "b", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: j0.O$a$a  reason: collision with other inner class name */
        public static final class C0387a implements Iterator<E>, C17693a {

            /* renamed from: a  reason: collision with root package name */
            private int f24531a = -1;

            /* renamed from: b  reason: collision with root package name */
            private final Iterator<E> f24532b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ O<E> f24533c;

            @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "LGJ/j;", "LXH/N;", "<anonymous>", "(LGJ/j;)V"}, k = 3, mv = {1, 8, 0})
            @f(c = "androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1", f = "ScatterSet.kt", l = {1057}, m = "invokeSuspend")
            /* renamed from: j0.O$a$a$a  reason: collision with other inner class name */
            static final class C0388a extends k implements p<C15767j<? super E>, C17164e<? super C16807N>, Object> {

                /* renamed from: d  reason: collision with root package name */
                Object f24534d;

                /* renamed from: e  reason: collision with root package name */
                Object f24535e;

                /* renamed from: f  reason: collision with root package name */
                Object f24536f;

                /* renamed from: g  reason: collision with root package name */
                int f24537g;

                /* renamed from: h  reason: collision with root package name */
                int f24538h;

                /* renamed from: i  reason: collision with root package name */
                int f24539i;

                /* renamed from: j  reason: collision with root package name */
                int f24540j;

                /* renamed from: k  reason: collision with root package name */
                long f24541k;

                /* renamed from: l  reason: collision with root package name */
                int f24542l;

                /* renamed from: m  reason: collision with root package name */
                private /* synthetic */ Object f24543m;

                /* renamed from: n  reason: collision with root package name */
                final /* synthetic */ O<E> f24544n;

                /* renamed from: o  reason: collision with root package name */
                final /* synthetic */ C0387a f24545o;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0388a(O o10, C0387a aVar, C17164e eVar) {
                    super(2, eVar);
                    this.f24544n = o10;
                    this.f24545o = aVar;
                }

                public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                    C0388a aVar = new C0388a(this.f24544n, this.f24545o, eVar);
                    aVar.f24543m = obj;
                    return aVar;
                }

                /* renamed from: i */
                public final Object invoke(C15767j<? super E> jVar, C17164e<? super C16807N> eVar) {
                    return ((C0388a) create(jVar, eVar)).invokeSuspend(C16807N.f139792a);
                }

                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
                    	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
                    */
                /* JADX WARNING: Removed duplicated region for block: B:15:0x007a  */
                /* JADX WARNING: Removed duplicated region for block: B:19:0x00a2  */
                public final java.lang.Object invokeSuspend(java.lang.Object r23) {
                    /*
                        r22 = this;
                        r0 = r22
                        java.lang.Object r1 = eI.C17187b.f()
                        int r2 = r0.f24542l
                        r4 = 8
                        r5 = 1
                        if (r2 == 0) goto L_0x0036
                        if (r2 != r5) goto L_0x002e
                        int r2 = r0.f24540j
                        int r6 = r0.f24539i
                        long r7 = r0.f24541k
                        int r9 = r0.f24538h
                        int r10 = r0.f24537g
                        java.lang.Object r11 = r0.f24536f
                        long[] r11 = (long[]) r11
                        java.lang.Object r12 = r0.f24535e
                        j0.O r12 = (j0.O) r12
                        java.lang.Object r13 = r0.f24534d
                        j0.O$a$a r13 = (j0.O.a.C0387a) r13
                        java.lang.Object r14 = r0.f24543m
                        GJ.j r14 = (GJ.C15767j) r14
                        XH.y.b(r23)
                        goto L_0x009f
                    L_0x002e:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r1
                    L_0x0036:
                        XH.y.b(r23)
                        java.lang.Object r2 = r0.f24543m
                        GJ.j r2 = (GJ.C15767j) r2
                        j0.O<E> r6 = r0.f24544n
                        j0.O$a$a r7 = r0.f24545o
                        long[] r8 = r6.f24575a
                        int r9 = r8.length
                        int r9 = r9 + -2
                        if (r9 < 0) goto L_0x00b2
                        r10 = 0
                    L_0x0049:
                        r11 = r8[r10]
                        long r13 = ~r11
                        r15 = 7
                        long r13 = r13 << r15
                        long r13 = r13 & r11
                        r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                        long r13 = r13 & r15
                        int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                        if (r13 == 0) goto L_0x00ad
                        int r13 = r10 - r9
                        int r13 = ~r13
                        int r13 = r13 >>> 31
                        int r13 = 8 - r13
                        r14 = r2
                        r2 = 0
                        r19 = r11
                        r12 = r6
                        r11 = r8
                        r6 = r13
                        r13 = r7
                        r7 = r19
                        r21 = r10
                        r10 = r9
                        r9 = r21
                    L_0x006f:
                        if (r2 >= r6) goto L_0x00a2
                        r15 = 255(0xff, double:1.26E-321)
                        long r15 = r15 & r7
                        r17 = 128(0x80, double:6.32E-322)
                        int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
                        if (r15 >= 0) goto L_0x009f
                        int r15 = r9 << 3
                        int r15 = r15 + r2
                        r13.c(r15)
                        java.lang.Object[] r3 = r12.f24576b
                        r3 = r3[r15]
                        r0.f24543m = r14
                        r0.f24534d = r13
                        r0.f24535e = r12
                        r0.f24536f = r11
                        r0.f24537g = r10
                        r0.f24538h = r9
                        r0.f24541k = r7
                        r0.f24539i = r6
                        r0.f24540j = r2
                        r0.f24542l = r5
                        java.lang.Object r3 = r14.d(r3, r0)
                        if (r3 != r1) goto L_0x009f
                        return r1
                    L_0x009f:
                        long r7 = r7 >> r4
                        int r2 = r2 + r5
                        goto L_0x006f
                    L_0x00a2:
                        if (r6 != r4) goto L_0x00b2
                        r8 = r11
                        r6 = r12
                        r7 = r13
                        r2 = r14
                        r19 = r10
                        r10 = r9
                        r9 = r19
                    L_0x00ad:
                        if (r10 == r9) goto L_0x00b2
                        int r10 = r10 + 1
                        goto L_0x0049
                    L_0x00b2:
                        XH.N r1 = XH.C16807N.f139792a
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: j0.O.a.C0387a.C0388a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            C0387a(O<E> o10) {
                this.f24533c = o10;
                this.f24532b = C15768k.a(new C0388a(o10, this, (C17164e) null));
            }

            public final void c(int i10) {
                this.f24531a = i10;
            }

            public boolean hasNext() {
                return this.f24532b.hasNext();
            }

            public E next() {
                return this.f24532b.next();
            }

            public void remove() {
                int i10 = this.f24531a;
                if (i10 != -1) {
                    this.f24533c.y(i10);
                    this.f24531a = -1;
                }
            }
        }

        public a() {
            super();
        }

        public boolean add(E e10) {
            return O.this.h(e10);
        }

        public boolean addAll(Collection<? extends E> collection) {
            C17542s.j(collection, "elements");
            return O.this.j(collection);
        }

        public void clear() {
            O.this.m();
        }

        public Iterator<E> iterator() {
            return new C0387a(O.this);
        }

        public boolean remove(Object obj) {
            return O.this.x(obj);
        }

        public boolean removeAll(Collection<? extends Object> collection) {
            C17542s.j(collection, "elements");
            int c10 = O.this.c();
            for (Object t10 : collection) {
                O.this.t(t10);
            }
            return c10 != O.this.c();
        }

        public boolean retainAll(Collection<? extends Object> collection) {
            Collection<? extends Object> collection2 = collection;
            C17542s.j(collection2, "elements");
            O<E> o10 = O.this;
            long[] jArr = o10.f24575a;
            int length = jArr.length - 2;
            boolean z10 = false;
            if (length >= 0) {
                int i10 = 0;
                boolean z11 = false;
                while (true) {
                    long j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j10) < 128) {
                                int i13 = (i10 << 3) + i12;
                                if (!collection2.contains(o10.f24576b[i13])) {
                                    o10.y(i13);
                                    z11 = true;
                                }
                            }
                            j10 >>= 8;
                        }
                        if (i11 != 8) {
                            return z11;
                        }
                    }
                    if (i10 == length) {
                        z10 = z11;
                        break;
                    }
                    i10++;
                }
            }
            return z10;
        }
    }

    public O() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    private final int o(E e10) {
        E e11 = e10;
        int hashCode = (e11 != null ? e10.hashCode() : 0) * -862048943;
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f24577c;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f24575a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-((long) i17)) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (long) i12;
            int i18 = i12;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & -9187201950435737472L; j13 != 0; j13 &= j13 - 1) {
                int numberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j13) >> 3)) & i13;
                if (C17542s.e(this.f24576b[numberOfTrailingZeros], e11)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & -9187201950435737472L) != 0) {
                int p10 = p(i11);
                if (this.f24529e == 0 && ((this.f24575a[p10 >> 3] >> ((p10 & 7) << 3)) & 255) != 254) {
                    k();
                    p10 = p(i11);
                }
                this.f24578d++;
                int i19 = this.f24529e;
                long[] jArr2 = this.f24575a;
                int i20 = p10 >> 3;
                long j14 = jArr2[i20];
                int i21 = (p10 & 7) << 3;
                this.f24529e = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f24577c;
                long j15 = ((~(255 << i21)) & j14) | (j11 << i21);
                jArr2[i20] = j15;
                jArr2[(((p10 - 7) & i22) + (i22 & 7)) >> 3] = j15;
                return p10;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    private final int p(int i10) {
        int i11 = this.f24577c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f24575a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j10 = ((jArr[i14 + 1] << (64 - i15)) & ((-((long) i15)) >> 63)) | (jArr[i14] >>> i15);
            long j11 = j10 & ((~j10) << 7) & -9187201950435737472L;
            if (j11 != 0) {
                return (i12 + (Long.numberOfTrailingZeros(j11) >> 3)) & i11;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    private final void q() {
        this.f24529e = Y.c(b()) - this.f24578d;
    }

    private final void r(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = Y.f24573a;
        } else {
            jArr = new long[(((i10 + 15) & -8) >> 3)];
            C16870n.z(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.f24575a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        q();
    }

    private final void s(int i10) {
        int max = i10 > 0 ? Math.max(7, Y.f(i10)) : 0;
        this.f24577c = max;
        r(max);
        this.f24576b = new Object[max];
    }

    public final boolean h(E e10) {
        int c10 = c();
        this.f24576b[o(e10)] = e10;
        return c() != c10;
    }

    public final boolean i(Z<E> z10) {
        C17542s.j(z10, "elements");
        int c10 = c();
        u(z10);
        return c10 != c();
    }

    public final boolean j(Iterable<? extends E> iterable) {
        C17542s.j(iterable, "elements");
        int c10 = c();
        v(iterable);
        return c10 != c();
    }

    public final void k() {
        if (this.f24577c <= 8 || Long.compareUnsigned(C16801H.b(C16801H.b((long) this.f24578d) * 32), C16801H.b(C16801H.b((long) this.f24577c) * 25)) > 0) {
            z(Y.e(this.f24577c));
        } else {
            n();
        }
    }

    public final Set<E> l() {
        return new a();
    }

    public final void m() {
        this.f24578d = 0;
        long[] jArr = this.f24575a;
        if (jArr != Y.f24573a) {
            C16870n.z(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.f24575a;
            int i10 = this.f24577c;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        C16870n.x(this.f24576b, null, 0, this.f24577c);
        q();
    }

    public final void n() {
        int i10;
        long[] jArr = this.f24575a;
        int i11 = this.f24577c;
        Object[] objArr = this.f24576b;
        Y.a(jArr, i11);
        int i12 = 0;
        int i13 = 0;
        int i14 = -1;
        while (i13 != i11) {
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = (jArr[i15] >> i16) & 255;
            if (j10 == 128) {
                i14 = i13;
                i13++;
            } else {
                if (j10 == 254) {
                    Object obj = objArr[i13];
                    int hashCode = (obj != null ? obj.hashCode() : i12) * -862048943;
                    int i17 = hashCode ^ (hashCode << 16);
                    int i18 = i17 >>> 7;
                    int p10 = p(i18);
                    int i19 = i18 & i11;
                    if (((p10 - i19) & i11) / 8 == ((i13 - i19) & i11) / 8) {
                        jArr[i15] = (((long) (i17 & 127)) << i16) | ((~(255 << i16)) & jArr[i15]);
                        jArr[C16870n.m0(jArr)] = (jArr[i12] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i20 = p10 >> 3;
                        long j11 = jArr[i20];
                        int i21 = (p10 & 7) << 3;
                        if (((j11 >> i21) & 255) == 128) {
                            int i22 = i13;
                            jArr[i20] = (((long) (i17 & 127)) << i21) | (j11 & (~(255 << i21)));
                            jArr[i15] = (jArr[i15] & (~(255 << i16))) | (128 << i16);
                            objArr[p10] = objArr[i22];
                            objArr[i22] = null;
                            i10 = i22;
                            i14 = i10;
                        } else {
                            int i23 = i13;
                            jArr[i20] = (((long) (i17 & 127)) << i21) | (j11 & (~(255 << i21)));
                            if (i14 == -1) {
                                i14 = Y.b(jArr, i23 + 1, i11);
                            }
                            objArr[i14] = objArr[p10];
                            objArr[p10] = objArr[i23];
                            objArr[i23] = objArr[i14];
                            i10 = i23 - 1;
                        }
                        jArr[C16870n.m0(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                        i13 = i10 + 1;
                        i12 = 0;
                    }
                }
                i13++;
            }
        }
        q();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0069, code lost:
        if (((r4 & ((~r4) << 6)) & -9187201950435737472L) == 0) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006b, code lost:
        r10 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t(E r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L_0x0008
            int r1 = r14.hashCode()
            goto L_0x0009
        L_0x0008:
            r1 = r0
        L_0x0009:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13.f24577c
            int r1 = r1 >>> 7
        L_0x0016:
            r1 = r1 & r3
            long[] r4 = r13.f24575a
            int r5 = r1 >> 3
            r6 = r1 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L_0x0043:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x0062
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.f24576b
            r11 = r11[r10]
            boolean r11 = kotlin.jvm.internal.C17542s.e(r11, r14)
            if (r11 == 0) goto L_0x005c
            goto L_0x006c
        L_0x005c:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L_0x0043
        L_0x0062:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x0072
            r10 = -1
        L_0x006c:
            if (r10 < 0) goto L_0x0071
            r13.y(r10)
        L_0x0071:
            return
        L_0x0072:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.O.t(java.lang.Object):void");
    }

    public final void u(Z<E> z10) {
        C17542s.j(z10, "elements");
        Object[] objArr = z10.f24576b;
        long[] jArr = z10.f24575a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            w(objArr[(i10 << 3) + i12]);
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        return;
                    }
                }
                if (i10 != length) {
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void v(Iterable<? extends E> iterable) {
        C17542s.j(iterable, "elements");
        for (Object w10 : iterable) {
            w(w10);
        }
    }

    public final void w(E e10) {
        this.f24576b[o(e10)] = e10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006e, code lost:
        if (((r7 & ((~r7) << 6)) & -9187201950435737472L) == 0) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0070, code lost:
        r11 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean x(E r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto L_0x000c
            int r3 = r18.hashCode()
            goto L_0x000d
        L_0x000c:
            r3 = r2
        L_0x000d:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f24577c
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L_0x001c:
            long[] r7 = r0.f24575a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L_0x0048:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L_0x0067
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f24576b
            r15 = r15[r11]
            boolean r15 = kotlin.jvm.internal.C17542s.e(r15, r1)
            if (r15 == 0) goto L_0x0061
            goto L_0x0071
        L_0x0061:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L_0x0048
        L_0x0067:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L_0x007a
            r11 = -1
        L_0x0071:
            if (r11 < 0) goto L_0x0074
            r2 = r12
        L_0x0074:
            if (r2 == 0) goto L_0x0079
            r0.y(r11)
        L_0x0079:
            return r2
        L_0x007a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.O.x(java.lang.Object):boolean");
    }

    public final void y(int i10) {
        this.f24578d--;
        long[] jArr = this.f24575a;
        int i11 = this.f24577c;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        this.f24576b[i10] = null;
    }

    public final void z(int i10) {
        long[] jArr = this.f24575a;
        Object[] objArr = this.f24576b;
        int i11 = this.f24577c;
        s(i10);
        long[] jArr2 = this.f24575a;
        Object[] objArr2 = this.f24576b;
        int i12 = this.f24577c;
        for (int i13 = 0; i13 < i11; i13++) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i13];
                int hashCode = (obj != null ? obj.hashCode() : 0) * -862048943;
                int i14 = hashCode ^ (hashCode << 16);
                int p10 = p(i14 >>> 7);
                long j10 = (long) (i14 & 127);
                int i15 = p10 >> 3;
                int i16 = (p10 & 7) << 3;
                long j11 = (jArr2[i15] & (~(255 << i16))) | (j10 << i16);
                jArr2[i15] = j11;
                jArr2[(((p10 - 7) & i12) + (i12 & 7)) >> 3] = j11;
                objArr2[p10] = obj;
            }
        }
    }

    public O(int i10) {
        super((DefaultConstructorMarker) null);
        if (!(i10 >= 0)) {
            d.a("Capacity must be a positive value.");
        }
        s(Y.g(i10));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ O(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }
}
