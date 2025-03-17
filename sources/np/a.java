package Np;

import TJ.C16505B;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import YH.X;
import dI.C17164e;
import eI.C17187b;
import j0.C5444A;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00122\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R&\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r0\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001b¨\u0006\u001d"}, d2 = {"LNp/a;", "", "K", "V", "", "maxSize", "<init>", "(I)V", "key", "value", "LXH/N;", "e", "(Ljava/lang/Object;Ljava/lang/Object;)V", "", "c", "()Ljava/util/Map;", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "LTJ/g;", "d", "(Ljava/lang/Object;)LTJ/g;", "a", "()V", "Lj0/A;", "Lj0/A;", "cacheMap", "LTJ/B;", "LTJ/B;", "cacheFlow", "datastorage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class a<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final C5444A<K, V> f84232a;

    /* renamed from: b  reason: collision with root package name */
    private final C16505B<Map<K, V>> f84233b = C16521S.a(X.j());

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Np.a$a  reason: collision with other inner class name */
    public static final class C1711a implements C16532g<V> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f84234a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f84235b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Np.a$a$a  reason: collision with other inner class name */
        public static final class C1712a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f84236a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Object f84237b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.datastorage.lrucache.LruCacheWithFlow$getAsFlow$$inlined$map$1$2", f = "LruCacheWithFlow.kt", l = {50}, m = "emit")
            /* renamed from: Np.a$a$a$a  reason: collision with other inner class name */
            public static final class C1713a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f84238c;

                /* renamed from: d  reason: collision with root package name */
                int f84239d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C1712a f84240e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1713a(C1712a aVar, C17164e eVar) {
                    super(eVar);
                    this.f84240e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f84238c = obj;
                    this.f84239d |= Integer.MIN_VALUE;
                    return this.f84240e.emit((Object) null, this);
                }
            }

            public C1712a(C16533h hVar, Object obj) {
                this.f84236a = hVar;
                this.f84237b = obj;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Np.a.C1711a.C1712a.C1713a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Np.a$a$a$a r0 = (Np.a.C1711a.C1712a.C1713a) r0
                    int r1 = r0.f84239d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f84239d = r1
                    goto L_0x0018
                L_0x0013:
                    Np.a$a$a$a r0 = new Np.a$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f84238c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f84239d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0047
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f84236a
                    java.util.Map r5 = (java.util.Map) r5
                    java.lang.Object r2 = r4.f84237b
                    java.lang.Object r5 = r5.get(r2)
                    r0.f84239d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0047
                    return r1
                L_0x0047:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Np.a.C1711a.C1712a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public C1711a(C16532g gVar, Object obj) {
            this.f84234a = gVar;
            this.f84235b = obj;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f84234a.collect(new C1712a(hVar, this.f84235b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public a(int i10) {
        this.f84232a = new C5444A<>(i10);
    }

    public final void a() {
        Map<K, V> value;
        this.f84232a.c();
        C16505B<Map<K, V>> b10 = this.f84233b;
        do {
            value = b10.getValue();
            Map map = value;
        } while (!b10.e(value, X.j()));
    }

    public final V b(K k10) {
        C17542s.j(k10, "key");
        return this.f84233b.getValue().get(k10);
    }

    public final Map<K, V> c() {
        return this.f84232a.k();
    }

    public final C16532g<V> d(K k10) {
        C17542s.j(k10, "key");
        return new C1711a(this.f84233b, k10);
    }

    public final void e(K k10, V v10) {
        Map<K, V> value;
        C17542s.j(k10, "key");
        C17542s.j(v10, "value");
        this.f84232a.f(k10, v10);
        C16505B<Map<K, V>> b10 = this.f84233b;
        do {
            value = b10.getValue();
            Map map = value;
        } while (!b10.e(value, this.f84232a.k()));
    }
}
