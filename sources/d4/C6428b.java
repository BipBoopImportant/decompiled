package D4;

import D4.E;
import QJ.F0;
import QJ.T;
import SJ.C16428d;
import TJ.C16504A;
import TJ.C16509F;
import TJ.C16511H;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import YH.Q;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.M;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R(\u0010\u0018\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0018\u00010\u00150\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R(\u0010\u001c\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0018\u00010\u00150\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR#\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"LD4/b;", "", "T", "LTJ/g;", "LD4/E;", "src", "LQJ/Q;", "scope", "<init>", "(LTJ/g;LQJ/Q;)V", "LXH/N;", "e", "()V", "LD4/E$b;", "f", "()LD4/E$b;", "LD4/k;", "a", "LD4/k;", "pageController", "LTJ/A;", "LYH/Q;", "b", "LTJ/A;", "mutableSharedSrc", "LTJ/F;", "c", "LTJ/F;", "sharedForDownstream", "LQJ/F0;", "d", "LQJ/F0;", "job", "LTJ/g;", "g", "()LTJ/g;", "downstreamFlow", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: D4.b  reason: case insensitive filesystem */
public final class C6428b<T> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C6437k<T> f34272a = new C6437k<>();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C16504A<Q<E<T>>> f34273b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C16509F<Q<E<T>>> f34274c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final F0 f34275d;

    /* renamed from: e  reason: collision with root package name */
    private final C16532g<E<T>> f34276e;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "LTJ/h;", "LD4/E;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1", f = "CachedPageEventFlow.kt", l = {103}, m = "invokeSuspend")
    /* renamed from: D4.b$a */
    static final class a extends l implements p<C16533h<? super E<T>>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f34277c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f34278d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C6428b<T> f34279e;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0018\u00010\u0002H@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "T", "LYH/Q;", "LD4/E;", "it", "", "<anonymous>", "(LYH/Q;)Z"}, k = 3, mv = {1, 8, 0})
        @f(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$1", f = "CachedPageEventFlow.kt", l = {}, m = "invokeSuspend")
        /* renamed from: D4.b$a$a  reason: collision with other inner class name */
        static final class C0538a extends l implements p<Q<? extends E<T>>, C17164e<? super Boolean>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f34280c;

            /* renamed from: d  reason: collision with root package name */
            /* synthetic */ Object f34281d;

            C0538a(C17164e<? super C0538a> eVar) {
                super(2, eVar);
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                C0538a aVar = new C0538a(eVar);
                aVar.f34281d = obj;
                return aVar;
            }

            /* renamed from: i */
            public final Object invoke(Q<? extends E<T>> q10, C17164e<? super Boolean> eVar) {
                return ((C0538a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f34280c == 0) {
                    y.b(obj);
                    return b.a(((Q) this.f34281d) != null);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0018\u00010\u0002H@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "T", "LYH/Q;", "LD4/E;", "indexedValue", "LXH/N;", "c", "(LYH/Q;LdI/e;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: D4.b$a$b  reason: collision with other inner class name */
        static final class C0539b<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ M f34282a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C16533h<E<T>> f34283b;

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @f(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$2", f = "CachedPageEventFlow.kt", l = {106}, m = "emit")
            /* renamed from: D4.b$a$b$a  reason: collision with other inner class name */
            static final class C0540a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                Object f34284c;

                /* renamed from: d  reason: collision with root package name */
                Object f34285d;

                /* renamed from: e  reason: collision with root package name */
                /* synthetic */ Object f34286e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ C0539b<T> f34287f;

                /* renamed from: g  reason: collision with root package name */
                int f34288g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0540a(C0539b<? super T> bVar, C17164e<? super C0540a> eVar) {
                    super(eVar);
                    this.f34287f = bVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f34286e = obj;
                    this.f34288g |= Integer.MIN_VALUE;
                    return this.f34287f.emit((Q) null, this);
                }
            }

            C0539b(M m10, C16533h<? super E<T>> hVar) {
                this.f34282a = m10;
                this.f34283b = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* renamed from: c */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(YH.Q<? extends D4.E<T>> r5, dI.C17164e<? super XH.C16807N> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof D4.C6428b.a.C0539b.C0540a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    D4.b$a$b$a r0 = (D4.C6428b.a.C0539b.C0540a) r0
                    int r1 = r0.f34288g
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f34288g = r1
                    goto L_0x0018
                L_0x0013:
                    D4.b$a$b$a r0 = new D4.b$a$b$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f34286e
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f34288g
                    r3 = 1
                    if (r2 == 0) goto L_0x0039
                    if (r2 != r3) goto L_0x0031
                    java.lang.Object r5 = r0.f34285d
                    YH.Q r5 = (YH.Q) r5
                    java.lang.Object r0 = r0.f34284c
                    D4.b$a$b r0 = (D4.C6428b.a.C0539b) r0
                    XH.y.b(r6)
                    goto L_0x005d
                L_0x0031:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0039:
                    XH.y.b(r6)
                    kotlin.jvm.internal.C17542s.g(r5)
                    int r6 = r5.c()
                    kotlin.jvm.internal.M r2 = r4.f34282a
                    int r2 = r2.f144346a
                    if (r6 <= r2) goto L_0x0065
                    TJ.h<D4.E<T>> r6 = r4.f34283b
                    java.lang.Object r2 = r5.d()
                    r0.f34284c = r4
                    r0.f34285d = r5
                    r0.f34288g = r3
                    java.lang.Object r6 = r6.emit(r2, r0)
                    if (r6 != r1) goto L_0x005c
                    return r1
                L_0x005c:
                    r0 = r4
                L_0x005d:
                    kotlin.jvm.internal.M r6 = r0.f34282a
                    int r5 = r5.c()
                    r6.f144346a = r5
                L_0x0065:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: D4.C6428b.a.C0539b.emit(YH.Q, dI.e):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C6428b<T> bVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f34279e = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f34279e, eVar);
            aVar.f34278d = obj;
            return aVar;
        }

        public final Object invoke(C16533h<? super E<T>> hVar, C17164e<? super C16807N> eVar) {
            return ((a) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f34277c;
            if (i10 == 0) {
                y.b(obj);
                M m10 = new M();
                m10.f144346a = Integer.MIN_VALUE;
                C16532g f02 = C16534i.f0(this.f34279e.f34274c, new C0538a((C17164e<? super C0538a>) null));
                C0539b bVar = new C0539b(m10, (C16533h) this.f34278d);
                this.f34277c = 1;
                if (f02.collect(bVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.paging.CachedPageEventFlow$job$1", f = "CachedPageEventFlow.kt", l = {77}, m = "invokeSuspend")
    /* renamed from: D4.b$b  reason: collision with other inner class name */
    static final class C0541b extends l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f34289c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16532g<E<T>> f34290d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C6428b<T> f34291e;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "T", "LYH/Q;", "LD4/E;", "it", "LXH/N;", "c", "(LYH/Q;LdI/e;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: D4.b$b$a */
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C6428b<T> f34292a;

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @f(c = "androidx.paging.CachedPageEventFlow$job$1$1", f = "CachedPageEventFlow.kt", l = {78, 79}, m = "emit")
            /* renamed from: D4.b$b$a$a  reason: collision with other inner class name */
            static final class C0542a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                Object f34293c;

                /* renamed from: d  reason: collision with root package name */
                Object f34294d;

                /* renamed from: e  reason: collision with root package name */
                /* synthetic */ Object f34295e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ a<T> f34296f;

                /* renamed from: g  reason: collision with root package name */
                int f34297g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0542a(a<? super T> aVar, C17164e<? super C0542a> eVar) {
                    super(eVar);
                    this.f34296f = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f34295e = obj;
                    this.f34297g |= Integer.MIN_VALUE;
                    return this.f34296f.emit((Q) null, this);
                }
            }

            a(C6428b<T> bVar) {
                this.f34292a = bVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x006a A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            /* renamed from: c */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(YH.Q<? extends D4.E<T>> r6, dI.C17164e<? super XH.C16807N> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof D4.C6428b.C0541b.a.C0542a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    D4.b$b$a$a r0 = (D4.C6428b.C0541b.a.C0542a) r0
                    int r1 = r0.f34297g
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f34297g = r1
                    goto L_0x0018
                L_0x0013:
                    D4.b$b$a$a r0 = new D4.b$b$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.f34295e
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f34297g
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L_0x0040
                    if (r2 == r4) goto L_0x0034
                    if (r2 != r3) goto L_0x002c
                    XH.y.b(r7)
                    goto L_0x006b
                L_0x002c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0034:
                    java.lang.Object r6 = r0.f34294d
                    YH.Q r6 = (YH.Q) r6
                    java.lang.Object r2 = r0.f34293c
                    D4.b$b$a r2 = (D4.C6428b.C0541b.a) r2
                    XH.y.b(r7)
                    goto L_0x0057
                L_0x0040:
                    XH.y.b(r7)
                    D4.b<T> r7 = r5.f34292a
                    TJ.A r7 = r7.f34273b
                    r0.f34293c = r5
                    r0.f34294d = r6
                    r0.f34297g = r4
                    java.lang.Object r7 = r7.emit(r6, r0)
                    if (r7 != r1) goto L_0x0056
                    return r1
                L_0x0056:
                    r2 = r5
                L_0x0057:
                    D4.b<T> r7 = r2.f34292a
                    D4.k r7 = r7.f34272a
                    r2 = 0
                    r0.f34293c = r2
                    r0.f34294d = r2
                    r0.f34297g = r3
                    java.lang.Object r6 = r7.c(r6, r0)
                    if (r6 != r1) goto L_0x006b
                    return r1
                L_0x006b:
                    XH.N r6 = XH.C16807N.f139792a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: D4.C6428b.C0541b.a.emit(YH.Q, dI.e):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0541b(C16532g<? extends E<T>> gVar, C6428b<T> bVar, C17164e<? super C0541b> eVar) {
            super(2, eVar);
            this.f34290d = gVar;
            this.f34291e = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C0541b(this.f34290d, this.f34291e, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((C0541b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f34289c;
            if (i10 == 0) {
                y.b(obj);
                C16532g<Q<E<T>>> h02 = C16534i.h0(this.f34290d);
                a aVar = new a(this.f34291e);
                this.f34289c = 1;
                if (h02.collect(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "it", "LXH/N;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: D4.b$c */
    static final class c extends C17544u implements C17642l<Throwable, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C6428b<T> f34298c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C6428b<T> bVar) {
            super(1);
            this.f34298c = bVar;
        }

        public final void a(Throwable th2) {
            this.f34298c.f34273b.a(null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0018\u00010\u00030\u0002H@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "T", "LTJ/h;", "LYH/Q;", "LD4/E;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.paging.CachedPageEventFlow$sharedForDownstream$1", f = "CachedPageEventFlow.kt", l = {63, 68}, m = "invokeSuspend")
    /* renamed from: D4.b$d */
    static final class d extends l implements p<C16533h<? super Q<? extends E<T>>>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f34299c;

        /* renamed from: d  reason: collision with root package name */
        int f34300d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f34301e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C6428b<T> f34302f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C6428b<T> bVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f34302f = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            d dVar = new d(this.f34302f, eVar);
            dVar.f34301e = obj;
            return dVar;
        }

        public final Object invoke(C16533h<? super Q<? extends E<T>>> hVar, C17164e<? super C16807N> eVar) {
            return ((d) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: TJ.h} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x005c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r4.f34300d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x002a
                if (r1 == r3) goto L_0x0022
                if (r1 != r2) goto L_0x001a
                java.lang.Object r1 = r4.f34299c
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r3 = r4.f34301e
                TJ.h r3 = (TJ.C16533h) r3
                XH.y.b(r5)
                goto L_0x0056
            L_0x001a:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L_0x0022:
                java.lang.Object r1 = r4.f34301e
                TJ.h r1 = (TJ.C16533h) r1
                XH.y.b(r5)
                goto L_0x0043
            L_0x002a:
                XH.y.b(r5)
                java.lang.Object r5 = r4.f34301e
                r1 = r5
                TJ.h r1 = (TJ.C16533h) r1
                D4.b<T> r5 = r4.f34302f
                D4.k r5 = r5.f34272a
                r4.f34301e = r1
                r4.f34300d = r3
                java.lang.Object r5 = r5.b(r4)
                if (r5 != r0) goto L_0x0043
                return r0
            L_0x0043:
                java.util.List r5 = (java.util.List) r5
                D4.b<T> r3 = r4.f34302f
                QJ.F0 r3 = r3.f34275d
                r3.start()
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.Iterator r5 = r5.iterator()
                r3 = r1
                r1 = r5
            L_0x0056:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L_0x006f
                java.lang.Object r5 = r1.next()
                YH.Q r5 = (YH.Q) r5
                r4.f34301e = r3
                r4.f34299c = r1
                r4.f34300d = r2
                java.lang.Object r5 = r3.emit(r5, r4)
                if (r5 != r0) goto L_0x0056
                return r0
            L_0x006f:
                XH.N r5 = XH.C16807N.f139792a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: D4.C6428b.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C6428b(C16532g<? extends E<T>> gVar, QJ.Q q10) {
        C17542s.j(gVar, "src");
        C17542s.j(q10, "scope");
        C16504A<Q<E<T>>> a10 = C16511H.a(1, Integer.MAX_VALUE, C16428d.SUSPEND);
        this.f34273b = a10;
        this.f34274c = C16534i.T(a10, new d(this, (C17164e<? super d>) null));
        F0 d10 = C16314k.d(q10, (C17168i) null, T.LAZY, new C0541b(gVar, this, (C17164e<? super C0541b>) null), 1, (Object) null);
        d10.s(new c(this));
        this.f34275d = d10;
        this.f34276e = C16534i.H(new a(this, (C17164e<? super a>) null));
    }

    public final void e() {
        F0.a.a(this.f34275d, (CancellationException) null, 1, (Object) null);
    }

    public final E.b<T> f() {
        return this.f34272a.a();
    }

    public final C16532g<E<T>> g() {
        return this.f34276e;
    }
}
