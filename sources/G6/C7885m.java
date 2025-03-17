package g6;

import HJ.C15854t;
import T5.G;
import T5.r;
import WK.C16770e;
import X5.C6721f;
import X5.s;
import X5.t;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.y;
import Y5.a;
import Z5.j;
import Z5.o;
import android.content.Context;
import com.adjust.sdk.Constants;
import dI.C17164e;
import eI.C17187b;
import g6.C7886n;
import h6.C7933b;
import h6.C7934c;
import h6.C7936e;
import k6.C8450q;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.O;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import r6.u;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u00012BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J6\u0010\u001a\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0015H@¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJB\u0010$\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001e2\u0006\u0010\u001f\u001a\u00020\u00172\"\u0010#\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000!\u0012\u0006\u0012\u0004\u0018\u00010\"0 H@¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u0004\u0018\u00010\u0015*\u00020\u0011H\u0002¢\u0006\u0004\b&\u0010'J\u0013\u0010)\u001a\u00020(*\u00020\u0011H\u0002¢\u0006\u0004\b)\u0010*J\u0014\u0010,\u001a\u00020(*\u00020+H@¢\u0006\u0004\b,\u0010-J\u0013\u0010/\u001a\u00020(*\u00020.H\u0002¢\u0006\u0004\b/\u00100J\u0010\u00102\u001a\u000201H@¢\u0006\u0004\b2\u00103J#\u00105\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u00104\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b5\u00106R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00107R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010;R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010;R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010B\u001a\u00020\u00028BX\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8BX\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006G"}, d2 = {"Lg6/m;", "LZ5/j;", "", "url", "Lk6/q;", "options", "LXH/o;", "Lg6/i;", "networkClient", "LY5/a;", "diskCache", "Lg6/b;", "cacheStrategy", "Lg6/d;", "connectivityChecker", "<init>", "(Ljava/lang/String;Lk6/q;LXH/o;LXH/o;LXH/o;Lg6/d;)V", "LY5/a$c;", "m", "()LY5/a$c;", "snapshot", "Lg6/q;", "cacheResponse", "Lg6/o;", "networkRequest", "networkResponse", "r", "(LY5/a$c;Lg6/q;Lg6/o;Lg6/q;LdI/e;)Ljava/lang/Object;", "l", "()Lg6/o;", "T", "request", "Lkotlin/Function2;", "LdI/e;", "", "block", "h", "(Lg6/o;LnI/p;LdI/e;)Ljava/lang/Object;", "q", "(LY5/a$c;)Lg6/q;", "LX5/s;", "o", "(LY5/a$c;)LX5/s;", "Lg6/r;", "p", "(Lg6/r;LdI/e;)Ljava/lang/Object;", "LWK/e;", "n", "(LWK/e;)LX5/s;", "LZ5/i;", "a", "(LdI/e;)Ljava/lang/Object;", "contentType", "k", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Ljava/lang/String;", "b", "Lk6/q;", "c", "LXH/o;", "d", "e", "f", "Lg6/d;", "i", "()Ljava/lang/String;", "diskCacheKey", "LWK/l;", "j", "()LWK/l;", "fileSystem", "coil-network-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: g6.m  reason: case insensitive filesystem */
public final class C7885m implements j {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final String f51286a;

    /* renamed from: b  reason: collision with root package name */
    private final C8450q f51287b;

    /* renamed from: c  reason: collision with root package name */
    private final C16824o<C7881i> f51288c;

    /* renamed from: d  reason: collision with root package name */
    private final C16824o<Y5.a> f51289d;

    /* renamed from: e  reason: collision with root package name */
    private final C16824o<C7874b> f51290e;

    /* renamed from: f  reason: collision with root package name */
    private final C7876d f51291f;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"T", "Lg6/q;", "response", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "coil3.network.NetworkFetcher$executeNetworkRequest$2", f = "NetworkFetcher.kt", l = {205}, m = "invokeSuspend")
    /* renamed from: g6.m$b */
    static final class b extends l implements p<C7889q, C17164e<? super T>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f51296c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f51297d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p<C7889q, C17164e<? super T>, Object> f51298e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(p<? super C7889q, ? super C17164e<? super T>, ? extends Object> pVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f51298e = pVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f51298e, eVar);
            bVar.f51297d = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(C7889q qVar, C17164e<? super T> eVar) {
            return ((b) create(qVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f51296c;
            if (i10 == 0) {
                y.b(obj);
                C7889q qVar = (C7889q) this.f51297d;
                int d10 = qVar.d();
                if ((200 > d10 || d10 >= 300) && qVar.d() != 304) {
                    throw new C7879g(qVar);
                }
                p<C7889q, C17164e<? super T>, Object> pVar = this.f51298e;
                this.f51296c = 1;
                obj = pVar.invoke(qVar, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "coil3.network.NetworkFetcher", f = "NetworkFetcher.kt", l = {61, 74, 102}, m = "fetch")
    /* renamed from: g6.m$c */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f51299c;

        /* renamed from: d  reason: collision with root package name */
        Object f51300d;

        /* renamed from: e  reason: collision with root package name */
        Object f51301e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f51302f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C7885m f51303g;

        /* renamed from: h  reason: collision with root package name */
        int f51304h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C7885m mVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f51303g = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f51302f = obj;
            this.f51304h |= Integer.MIN_VALUE;
            return this.f51303g.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg6/q;", "response", "LZ5/o;", "<anonymous>", "(Lg6/q;)LZ5/o;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "coil3.network.NetworkFetcher$fetch$2", f = "NetworkFetcher.kt", l = {104}, m = "invokeSuspend")
    /* renamed from: g6.m$d */
    static final class d extends l implements p<C7889q, C17164e<? super o>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f51305c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f51306d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C7885m f51307e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C7885m mVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f51307e = mVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            d dVar = new d(this.f51307e, eVar);
            dVar.f51306d = obj;
            return dVar;
        }

        /* renamed from: i */
        public final Object invoke(C7889q qVar, C17164e<? super o> eVar) {
            return ((d) create(qVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C7889q qVar;
            Object f10 = C17187b.f();
            int i10 = this.f51305c;
            if (i10 == 0) {
                y.b(obj);
                C7889q qVar2 = (C7889q) this.f51306d;
                C7885m mVar = this.f51307e;
                C7890r f11 = C7936e.f(qVar2);
                this.f51306d = qVar2;
                this.f51305c = 1;
                Object e10 = mVar.p(f11, this);
                if (e10 == f10) {
                    return f10;
                }
                qVar = qVar2;
                obj = e10;
            } else if (i10 == 1) {
                qVar = (C7889q) this.f51306d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7885m mVar2 = this.f51307e;
            return new o((s) obj, mVar2.k(mVar2.f51286a, qVar.e().c("Content-Type")), C6721f.NETWORK);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg6/q;", "response", "LZ5/o;", "<anonymous>", "(Lg6/q;)LZ5/o;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "coil3.network.NetworkFetcher$fetch$fetchResult$1", f = "NetworkFetcher.kt", l = {76, 87}, m = "invokeSuspend")
    /* renamed from: g6.m$e */
    static final class e extends l implements p<C7889q, C17164e<? super o>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f51308c;

        /* renamed from: d  reason: collision with root package name */
        int f51309d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f51310e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ O<a.c> f51311f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C7885m f51312g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ O<C7889q> f51313h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C7887o f51314i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(O<a.c> o10, C7885m mVar, O<C7889q> o11, C7887o oVar, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f51311f = o10;
            this.f51312g = mVar;
            this.f51313h = o11;
            this.f51314i = oVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            e eVar2 = new e(this.f51311f, this.f51312g, this.f51313h, this.f51314i, eVar);
            eVar2.f51310e = obj;
            return eVar2;
        }

        /* renamed from: i */
        public final Object invoke(C7889q qVar, C17164e<? super o> eVar) {
            return ((e) create(qVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x00bf  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00df A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(T r14) {
            /*
                r13 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r13.f51309d
                java.lang.String r2 = "Content-Type"
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L_0x002e
                if (r1 == r4) goto L_0x0022
                if (r1 != r3) goto L_0x001a
                java.lang.Object r0 = r13.f51310e
                g6.q r0 = (g6.C7889q) r0
                XH.y.b(r14)
                goto L_0x00b3
            L_0x001a:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L_0x0022:
                java.lang.Object r1 = r13.f51308c
                kotlin.jvm.internal.O r1 = (kotlin.jvm.internal.O) r1
                java.lang.Object r4 = r13.f51310e
                g6.q r4 = (g6.C7889q) r4
                XH.y.b(r14)
                goto L_0x0057
            L_0x002e:
                XH.y.b(r14)
                java.lang.Object r14 = r13.f51310e
                g6.q r14 = (g6.C7889q) r14
                kotlin.jvm.internal.O<Y5.a$c> r1 = r13.f51311f
                g6.m r6 = r13.f51312g
                T r7 = r1.f144348a
                Y5.a$c r7 = (Y5.a.c) r7
                kotlin.jvm.internal.O<g6.q> r8 = r13.f51313h
                T r8 = r8.f144348a
                g6.q r8 = (g6.C7889q) r8
                g6.o r9 = r13.f51314i
                r13.f51310e = r14
                r13.f51308c = r1
                r13.f51309d = r4
                r10 = r14
                r11 = r13
                java.lang.Object r4 = r6.r(r7, r8, r9, r10, r11)
                if (r4 != r0) goto L_0x0054
                return r0
            L_0x0054:
                r12 = r4
                r4 = r14
                r14 = r12
            L_0x0057:
                r1.f144348a = r14
                kotlin.jvm.internal.O<Y5.a$c> r14 = r13.f51311f
                T r14 = r14.f144348a
                if (r14 == 0) goto L_0x00a1
                kotlin.jvm.internal.O<g6.q> r0 = r13.f51313h
                g6.m r1 = r13.f51312g
                kotlin.jvm.internal.C17542s.g(r14)
                Y5.a$c r14 = (Y5.a.c) r14
                g6.q r14 = r1.q(r14)
                r0.f144348a = r14
                Z5.o r14 = new Z5.o
                g6.m r0 = r13.f51312g
                kotlin.jvm.internal.O<Y5.a$c> r1 = r13.f51311f
                T r1 = r1.f144348a
                kotlin.jvm.internal.C17542s.g(r1)
                Y5.a$c r1 = (Y5.a.c) r1
                X5.s r0 = r0.o(r1)
                g6.m r1 = r13.f51312g
                java.lang.String r3 = r1.f51286a
                kotlin.jvm.internal.O<g6.q> r4 = r13.f51313h
                T r4 = r4.f144348a
                g6.q r4 = (g6.C7889q) r4
                if (r4 == 0) goto L_0x0097
                g6.n r4 = r4.e()
                if (r4 == 0) goto L_0x0097
                java.lang.String r5 = r4.c(r2)
            L_0x0097:
                java.lang.String r1 = r1.k(r3, r5)
                X5.f r2 = X5.C6721f.NETWORK
                r14.<init>(r0, r1, r2)
                return r14
            L_0x00a1:
                g6.r r14 = h6.C7936e.f(r4)
                r13.f51310e = r4
                r13.f51308c = r5
                r13.f51309d = r3
                java.lang.Object r14 = h6.C7936e.e(r14, r13)
                if (r14 != r0) goto L_0x00b2
                return r0
            L_0x00b2:
                r0 = r4
            L_0x00b3:
                WK.e r14 = (WK.C16770e) r14
                long r3 = r14.size()
                r6 = 0
                int r1 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r1 <= 0) goto L_0x00df
                Z5.o r1 = new Z5.o
                g6.m r3 = r13.f51312g
                X5.s r14 = r3.n(r14)
                g6.m r3 = r13.f51312g
                java.lang.String r4 = r3.f51286a
                g6.n r0 = r0.e()
                java.lang.String r0 = r0.c(r2)
                java.lang.String r0 = r3.k(r4, r0)
                X5.f r2 = X5.C6721f.NETWORK
                r1.<init>(r14, r0, r2)
                return r1
            L_0x00df:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: g6.C7885m.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "coil3.network.NetworkFetcher", f = "NetworkFetcher.kt", l = {245}, m = "toImageSource")
    /* renamed from: g6.m$f */
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f51315c;

        /* renamed from: d  reason: collision with root package name */
        Object f51316d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f51317e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C7885m f51318f;

        /* renamed from: g  reason: collision with root package name */
        int f51319g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C7885m mVar, C17164e<? super f> eVar) {
            super(eVar);
            this.f51318f = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f51317e = obj;
            this.f51319g |= Integer.MIN_VALUE;
            return this.f51318f.p((C7890r) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "coil3.network.NetworkFetcher", f = "NetworkFetcher.kt", l = {138, 153}, m = "writeToDiskCache")
    /* renamed from: g6.m$g */
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f51320c;

        /* renamed from: d  reason: collision with root package name */
        Object f51321d;

        /* renamed from: e  reason: collision with root package name */
        Object f51322e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f51323f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C7885m f51324g;

        /* renamed from: h  reason: collision with root package name */
        int f51325h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C7885m mVar, C17164e<? super g> eVar) {
            super(eVar);
            this.f51324g = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f51323f = obj;
            this.f51325h |= Integer.MIN_VALUE;
            return this.f51324g.r((a.c) null, (C7889q) null, (C7887o) null, (C7889q) null, this);
        }
    }

    public C7885m(String str, C8450q qVar, C16824o<? extends C7881i> oVar, C16824o<? extends Y5.a> oVar2, C16824o<? extends C7874b> oVar3, C7876d dVar) {
        this.f51286a = str;
        this.f51287b = qVar;
        this.f51288c = oVar;
        this.f51289d = oVar2;
        this.f51290e = oVar3;
        this.f51291f = dVar;
    }

    private final <T> Object h(C7887o oVar, p<? super C7889q, ? super C17164e<? super T>, ? extends Object> pVar, C17164e<? super T> eVar) {
        if (this.f51287b.h().b()) {
            h6.f.a();
        }
        return this.f51288c.getValue().a(oVar, new b(pVar, (C17164e<? super b>) null), eVar);
    }

    private final String i() {
        String d10 = this.f51287b.d();
        return d10 == null ? this.f51286a : d10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r0.r();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final WK.C16777l j() {
        /*
            r1 = this;
            XH.o<Y5.a> r0 = r1.f51289d
            java.lang.Object r0 = r0.getValue()
            Y5.a r0 = (Y5.a) r0
            if (r0 == 0) goto L_0x0010
            WK.l r0 = r0.r()
            if (r0 != 0) goto L_0x0016
        L_0x0010:
            k6.q r0 = r1.f51287b
            WK.l r0 = r0.g()
        L_0x0016:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.C7885m.j():WK.l");
    }

    private final C7887o l() {
        C7886n.a d10 = C7880h.b(this.f51287b).d();
        boolean b10 = this.f51287b.e().b();
        boolean z10 = this.f51287b.h().b() && this.f51291f.a();
        if (!z10 && b10) {
            d10.c("Cache-Control", "only-if-cached, max-stale=2147483647");
        } else if (!z10 || b10) {
            if (!z10 && !b10) {
                d10.c("Cache-Control", "no-cache, only-if-cached");
            }
        } else if (this.f51287b.e().j()) {
            d10.c("Cache-Control", "no-cache");
        } else {
            d10.c("Cache-Control", "no-cache, no-store");
        }
        return new C7887o(this.f51286a, C7880h.c(this.f51287b), d10.b(), C7880h.a(this.f51287b), this.f51287b.f());
    }

    private final a.c m() {
        Y5.a value;
        if (!this.f51287b.e().b() || (value = this.f51289d.getValue()) == null) {
            return null;
        }
        return value.t(i());
    }

    /* access modifiers changed from: private */
    public final s n(C16770e eVar) {
        return t.c(eVar, j(), (s.a) null, 4, (Object) null);
    }

    /* access modifiers changed from: private */
    public final s o(a.c cVar) {
        return t.d(cVar.getData(), j(), i(), cVar, (s.a) null, 16, (Object) null);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object p(g6.C7890r r5, dI.C17164e<? super X5.s> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof g6.C7885m.f
            if (r0 == 0) goto L_0x0013
            r0 = r6
            g6.m$f r0 = (g6.C7885m.f) r0
            int r1 = r0.f51319g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f51319g = r1
            goto L_0x0018
        L_0x0013:
            g6.m$f r0 = new g6.m$f
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f51317e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f51319g
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r5 = r0.f51316d
            WK.e r5 = (WK.C16770e) r5
            java.lang.Object r0 = r0.f51315c
            g6.m r0 = (g6.C7885m) r0
            XH.y.b(r6)
            goto L_0x0050
        L_0x0031:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0039:
            XH.y.b(r6)
            WK.e r6 = new WK.e
            r6.<init>()
            r0.f51315c = r4
            r0.f51316d = r6
            r0.f51319g = r3
            java.lang.Object r5 = r5.A(r6, r0)
            if (r5 != r1) goto L_0x004e
            return r1
        L_0x004e:
            r0 = r4
            r5 = r6
        L_0x0050:
            X5.s r5 = r0.n(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.C7885m.p(g6.r, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0030 A[Catch:{ IOException -> 0x0032 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0031 A[Catch:{ IOException -> 0x0032 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final g6.C7889q q(Y5.a.c r3) {
        /*
            r2 = this;
            r0 = 0
            WK.l r1 = r2.j()     // Catch:{ IOException -> 0x0032 }
            WK.E r3 = r3.j()     // Catch:{ IOException -> 0x0032 }
            WK.N r3 = r1.B(r3)     // Catch:{ IOException -> 0x0032 }
            WK.g r3 = WK.y.d(r3)     // Catch:{ IOException -> 0x0032 }
            g6.a r1 = g6.C7873a.f51268a     // Catch:{ all -> 0x0021 }
            g6.q r1 = r1.a(r3)     // Catch:{ all -> 0x0021 }
            if (r3 == 0) goto L_0x001f
            r3.close()     // Catch:{ all -> 0x001d }
            goto L_0x001f
        L_0x001d:
            r3 = move-exception
            goto L_0x002e
        L_0x001f:
            r3 = r0
            goto L_0x002e
        L_0x0021:
            r1 = move-exception
            if (r3 == 0) goto L_0x002c
            r3.close()     // Catch:{ all -> 0x0028 }
            goto L_0x002c
        L_0x0028:
            r3 = move-exception
            XH.C16816g.a(r1, r3)     // Catch:{ IOException -> 0x0032 }
        L_0x002c:
            r3 = r1
            r1 = r0
        L_0x002e:
            if (r3 != 0) goto L_0x0031
            return r1
        L_0x0031:
            throw r3     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.C7885m.q(Y5.a$c):g6.q");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: Y5.a$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: g6.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: g6.q} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c1 A[SYNTHETIC, Splitter:B:38:0x00c1] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object r(Y5.a.c r15, g6.C7889q r16, g6.C7887o r17, g6.C7889q r18, dI.C17164e<? super Y5.a.c> r19) {
        /*
            r14 = this;
            r1 = r14
            r0 = r15
            r2 = r19
            boolean r3 = r2 instanceof g6.C7885m.g
            if (r3 == 0) goto L_0x0017
            r3 = r2
            g6.m$g r3 = (g6.C7885m.g) r3
            int r4 = r3.f51325h
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0017
            int r4 = r4 - r5
            r3.f51325h = r4
            goto L_0x001c
        L_0x0017:
            g6.m$g r3 = new g6.m$g
            r3.<init>(r14, r2)
        L_0x001c:
            java.lang.Object r2 = r3.f51323f
            java.lang.Object r10 = eI.C17187b.f()
            int r4 = r3.f51325h
            r11 = 2
            r5 = 1
            r12 = 0
            if (r4 == 0) goto L_0x0060
            if (r4 == r5) goto L_0x004c
            if (r4 != r11) goto L_0x0044
            java.lang.Object r0 = r3.f51322e
            r4 = r0
            Y5.a$b r4 = (Y5.a.b) r4
            java.lang.Object r0 = r3.f51321d
            r5 = r0
            g6.q r5 = (g6.C7889q) r5
            java.lang.Object r0 = r3.f51320c
            r3 = r0
            g6.q r3 = (g6.C7889q) r3
            XH.y.b(r2)     // Catch:{ Exception -> 0x0041 }
            goto L_0x0117
        L_0x0041:
            r0 = move-exception
            goto L_0x011d
        L_0x0044:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x004c:
            java.lang.Object r0 = r3.f51322e
            g6.q r0 = (g6.C7889q) r0
            java.lang.Object r4 = r3.f51321d
            Y5.a$c r4 = (Y5.a.c) r4
            java.lang.Object r5 = r3.f51320c
            g6.m r5 = (g6.C7885m) r5
            XH.y.b(r2)
            r13 = r2
            r2 = r0
            r0 = r4
            r4 = r13
            goto L_0x0099
        L_0x0060:
            XH.y.b(r2)
            k6.q r2 = r1.f51287b
            k6.c r2 = r2.e()
            boolean r2 = r2.j()
            if (r2 != 0) goto L_0x0075
            if (r0 == 0) goto L_0x0074
            h6.C7936e.c(r15)
        L_0x0074:
            return r12
        L_0x0075:
            XH.o<g6.b> r2 = r1.f51290e
            java.lang.Object r2 = r2.getValue()
            r4 = r2
            g6.b r4 = (g6.C7874b) r4
            k6.q r8 = r1.f51287b
            r3.f51320c = r1
            r3.f51321d = r0
            r2 = r18
            r3.f51322e = r2
            r3.f51325h = r5
            r5 = r16
            r6 = r17
            r7 = r18
            r9 = r3
            java.lang.Object r4 = r4.a(r5, r6, r7, r8, r9)
            if (r4 != r10) goto L_0x0098
            return r10
        L_0x0098:
            r5 = r1
        L_0x0099:
            g6.b$c r4 = (g6.C7874b.c) r4
            g6.q r4 = r4.a()
            if (r4 != 0) goto L_0x00a2
            return r12
        L_0x00a2:
            if (r0 == 0) goto L_0x00aa
            Y5.a$b r0 = r0.I()
        L_0x00a8:
            r6 = r0
            goto L_0x00be
        L_0x00aa:
            XH.o<Y5.a> r0 = r5.f51289d
            java.lang.Object r0 = r0.getValue()
            Y5.a r0 = (Y5.a) r0
            if (r0 == 0) goto L_0x00bd
            java.lang.String r6 = r5.i()
            Y5.a$b r0 = r0.s(r6)
            goto L_0x00a8
        L_0x00bd:
            r6 = r12
        L_0x00be:
            if (r6 != 0) goto L_0x00c1
            return r12
        L_0x00c1:
            WK.l r0 = r5.j()     // Catch:{ Exception -> 0x00f0 }
            WK.E r7 = r6.j()     // Catch:{ Exception -> 0x00f0 }
            r8 = 0
            WK.L r0 = r0.z(r7, r8)     // Catch:{ Exception -> 0x00f0 }
            WK.f r7 = WK.y.c(r0)     // Catch:{ Exception -> 0x00f0 }
            g6.a r0 = g6.C7873a.f51268a     // Catch:{ all -> 0x00e2 }
            r0.b(r4, r7)     // Catch:{ all -> 0x00e2 }
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x00e2 }
            if (r7 == 0) goto L_0x00f5
            r7.close()     // Catch:{ all -> 0x00df }
            goto L_0x00f5
        L_0x00df:
            r0 = move-exception
            r12 = r0
            goto L_0x00f5
        L_0x00e2:
            r0 = move-exception
            r12 = r0
            if (r7 == 0) goto L_0x00f5
            r7.close()     // Catch:{ all -> 0x00ea }
            goto L_0x00f5
        L_0x00ea:
            r0 = move-exception
            r7 = r0
            XH.C16816g.a(r12, r7)     // Catch:{ Exception -> 0x00f0 }
            goto L_0x00f5
        L_0x00f0:
            r0 = move-exception
            r3 = r2
            r5 = r4
            r4 = r6
            goto L_0x011d
        L_0x00f5:
            if (r12 != 0) goto L_0x011c
            g6.r r0 = r4.c()     // Catch:{ Exception -> 0x00f0 }
            if (r0 == 0) goto L_0x0114
            WK.l r5 = r5.j()     // Catch:{ Exception -> 0x00f0 }
            WK.E r7 = r6.getData()     // Catch:{ Exception -> 0x00f0 }
            r3.f51320c = r2     // Catch:{ Exception -> 0x00f0 }
            r3.f51321d = r4     // Catch:{ Exception -> 0x00f0 }
            r3.f51322e = r6     // Catch:{ Exception -> 0x00f0 }
            r3.f51325h = r11     // Catch:{ Exception -> 0x00f0 }
            java.lang.Object r0 = r0.B2(r5, r7, r3)     // Catch:{ Exception -> 0x00f0 }
            if (r0 != r10) goto L_0x0114
            return r10
        L_0x0114:
            r3 = r2
            r5 = r4
            r4 = r6
        L_0x0117:
            Y5.a$c r0 = r4.l()     // Catch:{ Exception -> 0x0041 }
            return r0
        L_0x011c:
            throw r12     // Catch:{ Exception -> 0x00f0 }
        L_0x011d:
            h6.C7936e.a(r4)
            g6.r r2 = r3.c()
            if (r2 == 0) goto L_0x0129
            h6.C7936e.c(r2)
        L_0x0129:
            g6.r r2 = r5.c()
            if (r2 == 0) goto L_0x0132
            h6.C7936e.c(r2)
        L_0x0132:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.C7885m.r(Y5.a$c, g6.q, g6.o, g6.q, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f8 A[Catch:{ Exception -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x011c A[Catch:{ Exception -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0146 A[Catch:{ Exception -> 0x0051 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0147 A[Catch:{ Exception -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x014c A[Catch:{ Exception -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(dI.C17164e<? super Z5.i> r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            boolean r2 = r0 instanceof g6.C7885m.c
            if (r2 == 0) goto L_0x0017
            r2 = r0
            g6.m$c r2 = (g6.C7885m.c) r2
            int r3 = r2.f51304h
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f51304h = r3
            goto L_0x001c
        L_0x0017:
            g6.m$c r2 = new g6.m$c
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.f51302f
            java.lang.Object r3 = eI.C17187b.f()
            int r4 = r2.f51304h
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L_0x006f
            if (r4 == r7) goto L_0x0055
            if (r4 == r6) goto L_0x0044
            if (r4 != r5) goto L_0x003c
            java.lang.Object r2 = r2.f51299c
            kotlin.jvm.internal.O r2 = (kotlin.jvm.internal.O) r2
            XH.y.b(r0)     // Catch:{ Exception -> 0x0039 }
            goto L_0x0163
        L_0x0039:
            r0 = move-exception
            goto L_0x0166
        L_0x003c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0044:
            java.lang.Object r4 = r2.f51300d
            kotlin.jvm.internal.O r4 = (kotlin.jvm.internal.O) r4
            java.lang.Object r6 = r2.f51299c
            g6.m r6 = (g6.C7885m) r6
            XH.y.b(r0)     // Catch:{ Exception -> 0x0051 }
            goto L_0x0148
        L_0x0051:
            r0 = move-exception
            r2 = r4
            goto L_0x0166
        L_0x0055:
            java.lang.Object r4 = r2.f51301e
            kotlin.jvm.internal.O r4 = (kotlin.jvm.internal.O) r4
            java.lang.Object r7 = r2.f51300d
            kotlin.jvm.internal.O r7 = (kotlin.jvm.internal.O) r7
            java.lang.Object r9 = r2.f51299c
            g6.m r9 = (g6.C7885m) r9
            XH.y.b(r0)     // Catch:{ Exception -> 0x006b }
            r16 = r7
            r7 = r4
            r4 = r16
            goto L_0x00f0
        L_0x006b:
            r0 = move-exception
            r2 = r7
            goto L_0x0166
        L_0x006f:
            XH.y.b(r0)
            kotlin.jvm.internal.O r4 = new kotlin.jvm.internal.O
            r4.<init>()
            Y5.a$c r0 = r17.m()
            r4.f144348a = r0
            kotlin.jvm.internal.O r0 = new kotlin.jvm.internal.O     // Catch:{ Exception -> 0x0051 }
            r0.<init>()     // Catch:{ Exception -> 0x0051 }
            T r9 = r4.f144348a     // Catch:{ Exception -> 0x0051 }
            if (r9 == 0) goto L_0x011f
            WK.l r9 = r17.j()     // Catch:{ Exception -> 0x0051 }
            T r10 = r4.f144348a     // Catch:{ Exception -> 0x0051 }
            Y5.a$c r10 = (Y5.a.c) r10     // Catch:{ Exception -> 0x0051 }
            WK.E r10 = r10.j()     // Catch:{ Exception -> 0x0051 }
            WK.k r9 = r9.s(r10)     // Catch:{ Exception -> 0x0051 }
            java.lang.Long r9 = r9.d()     // Catch:{ Exception -> 0x0051 }
            if (r9 != 0) goto L_0x009d
            goto L_0x00bd
        L_0x009d:
            long r9 = r9.longValue()     // Catch:{ Exception -> 0x0051 }
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L_0x00bd
            Z5.o r0 = new Z5.o     // Catch:{ Exception -> 0x0051 }
            T r2 = r4.f144348a     // Catch:{ Exception -> 0x0051 }
            Y5.a$c r2 = (Y5.a.c) r2     // Catch:{ Exception -> 0x0051 }
            X5.s r2 = r1.o(r2)     // Catch:{ Exception -> 0x0051 }
            java.lang.String r3 = r1.f51286a     // Catch:{ Exception -> 0x0051 }
            java.lang.String r3 = r1.k(r3, r8)     // Catch:{ Exception -> 0x0051 }
            X5.f r5 = X5.C6721f.DISK     // Catch:{ Exception -> 0x0051 }
            r0.<init>(r2, r3, r5)     // Catch:{ Exception -> 0x0051 }
            return r0
        L_0x00bd:
            T r9 = r4.f144348a     // Catch:{ Exception -> 0x0051 }
            Y5.a$c r9 = (Y5.a.c) r9     // Catch:{ Exception -> 0x0051 }
            g6.q r9 = r1.q(r9)     // Catch:{ Exception -> 0x0051 }
            r0.f144348a = r9     // Catch:{ Exception -> 0x0051 }
            if (r9 == 0) goto L_0x011f
            XH.o<g6.b> r9 = r1.f51290e     // Catch:{ Exception -> 0x0051 }
            java.lang.Object r9 = r9.getValue()     // Catch:{ Exception -> 0x0051 }
            g6.b r9 = (g6.C7874b) r9     // Catch:{ Exception -> 0x0051 }
            T r10 = r0.f144348a     // Catch:{ Exception -> 0x0051 }
            g6.q r10 = (g6.C7889q) r10     // Catch:{ Exception -> 0x0051 }
            g6.o r11 = r17.l()     // Catch:{ Exception -> 0x0051 }
            k6.q r12 = r1.f51287b     // Catch:{ Exception -> 0x0051 }
            r2.f51299c = r1     // Catch:{ Exception -> 0x0051 }
            r2.f51300d = r4     // Catch:{ Exception -> 0x0051 }
            r2.f51301e = r0     // Catch:{ Exception -> 0x0051 }
            r2.f51304h = r7     // Catch:{ Exception -> 0x0051 }
            java.lang.Object r7 = r9.b(r10, r11, r12, r2)     // Catch:{ Exception -> 0x0051 }
            if (r7 != r3) goto L_0x00ea
            return r3
        L_0x00ea:
            r9 = r1
            r16 = r7
            r7 = r0
            r0 = r16
        L_0x00f0:
            g6.b$b r0 = (g6.C7874b.C0844b) r0     // Catch:{ Exception -> 0x0051 }
            g6.q r10 = r0.b()     // Catch:{ Exception -> 0x0051 }
            if (r10 == 0) goto L_0x011c
            Z5.o r2 = new Z5.o     // Catch:{ Exception -> 0x0051 }
            T r3 = r4.f144348a     // Catch:{ Exception -> 0x0051 }
            Y5.a$c r3 = (Y5.a.c) r3     // Catch:{ Exception -> 0x0051 }
            X5.s r3 = r9.o(r3)     // Catch:{ Exception -> 0x0051 }
            java.lang.String r5 = r9.f51286a     // Catch:{ Exception -> 0x0051 }
            g6.q r0 = r0.b()     // Catch:{ Exception -> 0x0051 }
            g6.n r0 = r0.e()     // Catch:{ Exception -> 0x0051 }
            java.lang.String r6 = "Content-Type"
            java.lang.String r0 = r0.c(r6)     // Catch:{ Exception -> 0x0051 }
            java.lang.String r0 = r9.k(r5, r0)     // Catch:{ Exception -> 0x0051 }
            X5.f r5 = X5.C6721f.DISK     // Catch:{ Exception -> 0x0051 }
            r2.<init>(r3, r0, r5)     // Catch:{ Exception -> 0x0051 }
            return r2
        L_0x011c:
            r12 = r7
            r7 = r9
            goto L_0x0122
        L_0x011f:
            r12 = r0
            r7 = r1
            r0 = r8
        L_0x0122:
            if (r0 == 0) goto L_0x012a
            g6.o r0 = r0.a()     // Catch:{ Exception -> 0x0051 }
            if (r0 != 0) goto L_0x012e
        L_0x012a:
            g6.o r0 = r7.l()     // Catch:{ Exception -> 0x0051 }
        L_0x012e:
            g6.m$e r15 = new g6.m$e     // Catch:{ Exception -> 0x0051 }
            r14 = 0
            r9 = r15
            r10 = r4
            r11 = r7
            r13 = r0
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x0051 }
            r2.f51299c = r7     // Catch:{ Exception -> 0x0051 }
            r2.f51300d = r4     // Catch:{ Exception -> 0x0051 }
            r2.f51301e = r8     // Catch:{ Exception -> 0x0051 }
            r2.f51304h = r6     // Catch:{ Exception -> 0x0051 }
            java.lang.Object r0 = r7.h(r0, r15, r2)     // Catch:{ Exception -> 0x0051 }
            if (r0 != r3) goto L_0x0147
            return r3
        L_0x0147:
            r6 = r7
        L_0x0148:
            Z5.o r0 = (Z5.o) r0     // Catch:{ Exception -> 0x0051 }
            if (r0 != 0) goto L_0x0165
            g6.o r0 = r6.l()     // Catch:{ Exception -> 0x0051 }
            g6.m$d r7 = new g6.m$d     // Catch:{ Exception -> 0x0051 }
            r7.<init>(r6, r8)     // Catch:{ Exception -> 0x0051 }
            r2.f51299c = r4     // Catch:{ Exception -> 0x0051 }
            r2.f51300d = r8     // Catch:{ Exception -> 0x0051 }
            r2.f51304h = r5     // Catch:{ Exception -> 0x0051 }
            java.lang.Object r0 = r6.h(r0, r7, r2)     // Catch:{ Exception -> 0x0051 }
            if (r0 != r3) goto L_0x0162
            return r3
        L_0x0162:
            r2 = r4
        L_0x0163:
            Z5.o r0 = (Z5.o) r0     // Catch:{ Exception -> 0x0039 }
        L_0x0165:
            return r0
        L_0x0166:
            T r2 = r2.f144348a
            Y5.a$c r2 = (Y5.a.c) r2
            if (r2 == 0) goto L_0x016f
            h6.C7936e.c(r2)
        L_0x016f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.C7885m.a(dI.e):java.lang.Object");
    }

    public final String k(String str, String str2) {
        String b10;
        if ((str2 == null || C15854t.W(str2, "text/plain", false, 2, (Object) null)) && (b10 = u.f55715a.b(str)) != null) {
            return b10;
        }
        if (str2 != null) {
            return C15854t.s1(str2, ';', (String) null, 2, (Object) null);
        }
        return null;
    }

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B?\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0018\b\u0002\u0010\f\u001a\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR$\u0010#\u001a\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000b0 8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lg6/m$a;", "LZ5/j$a;", "LT5/G;", "Lkotlin/Function0;", "Lg6/i;", "networkClient", "Lg6/b;", "cacheStrategy", "Lkotlin/Function1;", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "Lg6/d;", "connectivityChecker", "<init>", "(LnI/a;LnI/a;LnI/l;)V", "data", "", "g", "(LT5/G;)Z", "Lk6/q;", "options", "LT5/r;", "imageLoader", "LZ5/j;", "e", "(LT5/G;Lk6/q;LT5/r;)LZ5/j;", "LXH/o;", "a", "LXH/o;", "networkClientLazy", "b", "cacheStrategyLazy", "Lh6/b;", "c", "Lh6/b;", "connectivityCheckerLazy", "coil-network-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: g6.m$a */
    public static final class a implements j.a<G> {

        /* renamed from: a  reason: collision with root package name */
        private final C16824o<C7881i> f51292a;

        /* renamed from: b  reason: collision with root package name */
        private final C16824o<C7874b> f51293b;

        /* renamed from: c  reason: collision with root package name */
        private final C7933b<Context, C7876d> f51294c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: g6.m$a$a  reason: collision with other inner class name */
        /* synthetic */ class C0845a extends C17540p implements C17642l<Context, C7876d> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0845a f51295a = new C0845a();

            C0845a() {
                super(1, C7878f.class, "ConnectivityChecker", "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;", 1);
            }

            /* renamed from: t */
            public final C7876d invoke(Context context) {
                return C7878f.a(context);
            }
        }

        public a(C17631a<? extends C7881i> aVar, C17631a<? extends C7874b> aVar2, C17642l<? super Context, ? extends C7876d> lVar) {
            this.f51292a = C16825p.b(aVar);
            this.f51293b = C16825p.b(aVar2);
            this.f51294c = C7934c.a(lVar);
        }

        /* access modifiers changed from: private */
        public static final C7874b d() {
            return C7874b.f51270b;
        }

        /* access modifiers changed from: private */
        public static final Y5.a f(r rVar) {
            return rVar.a();
        }

        private final boolean g(G g10) {
            return C17542s.e(g10.c(), "http") || C17542s.e(g10.c(), Constants.SCHEME);
        }

        /* renamed from: e */
        public j a(G g10, C8450q qVar, r rVar) {
            if (!g(g10)) {
                return null;
            }
            return new C7885m(g10.toString(), qVar, this.f51292a, C16825p.b(new C7883k(rVar)), this.f51293b, this.f51294c.a(qVar.c()));
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ a(nI.C17631a r1, nI.C17631a r2, nI.C17642l r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
            /*
                r0 = this;
                r5 = r4 & 2
                if (r5 == 0) goto L_0x0009
                g6.l r2 = new g6.l
                r2.<init>()
            L_0x0009:
                r4 = r4 & 4
                if (r4 == 0) goto L_0x000f
                g6.m$a$a r3 = g6.C7885m.a.C0845a.f51295a
            L_0x000f:
                r0.<init>(r1, r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g6.C7885m.a.<init>(nI.a, nI.a, nI.l, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
