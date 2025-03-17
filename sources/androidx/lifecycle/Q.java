package androidx.lifecycle;

import QJ.C16310i;
import QJ.C16311i0;
import QJ.C16320n;
import QJ.F0;
import QJ.P0;
import QJ.S;
import QJ.T;
import XH.C16807N;
import XH.x;
import XH.y;
import androidx.lifecycle.r;
import bK.C17052a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.O;
import nI.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a@\u0010\t\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003H@¢\u0006\u0004\b\t\u0010\n\u001a@\u0010\f\u001a\u00020\u0006*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003H@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/lifecycle/r;", "Landroidx/lifecycle/r$b;", "state", "Lkotlin/Function2;", "LQJ/Q;", "LdI/e;", "LXH/N;", "", "block", "a", "(Landroidx/lifecycle/r;Landroidx/lifecycle/r$b;LnI/p;LdI/e;)Ljava/lang/Object;", "Landroidx/lifecycle/y;", "b", "(Landroidx/lifecycle/y;Landroidx/lifecycle/r$b;LnI/p;LdI/e;)Ljava/lang/Object;", "lifecycle-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Q {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", l = {84}, m = "invokeSuspend")
    static final class a extends l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f22174c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f22175d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ r f22176e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ r.b f22177f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ p<QJ.Q, C17164e<? super C16807N>, Object> f22178g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", l = {166}, m = "invokeSuspend")
        /* renamed from: androidx.lifecycle.Q$a$a  reason: collision with other inner class name */
        static final class C0340a extends l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            Object f22179c;

            /* renamed from: d  reason: collision with root package name */
            Object f22180d;

            /* renamed from: e  reason: collision with root package name */
            Object f22181e;

            /* renamed from: f  reason: collision with root package name */
            Object f22182f;

            /* renamed from: g  reason: collision with root package name */
            Object f22183g;

            /* renamed from: h  reason: collision with root package name */
            Object f22184h;

            /* renamed from: i  reason: collision with root package name */
            int f22185i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ r f22186j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ r.b f22187k;

            /* renamed from: l  reason: collision with root package name */
            final /* synthetic */ QJ.Q f22188l;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ p<QJ.Q, C17164e<? super C16807N>, Object> f22189m;

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/lifecycle/y;", "<anonymous parameter 0>", "Landroidx/lifecycle/r$a;", "event", "LXH/N;", "e", "(Landroidx/lifecycle/y;Landroidx/lifecycle/r$a;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.lifecycle.Q$a$a$a  reason: collision with other inner class name */
            static final class C0341a implements C5218v {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ r.a f22190a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ O<F0> f22191b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ QJ.Q f22192c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ r.a f22193d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C16320n<C16807N> f22194e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ C17052a f22195f;

                /* renamed from: g  reason: collision with root package name */
                final /* synthetic */ p<QJ.Q, C17164e<? super C16807N>, Object> f22196g;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
                @f(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {171, 110}, m = "invokeSuspend")
                /* renamed from: androidx.lifecycle.Q$a$a$a$a  reason: collision with other inner class name */
                static final class C0342a extends l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

                    /* renamed from: c  reason: collision with root package name */
                    Object f22197c;

                    /* renamed from: d  reason: collision with root package name */
                    Object f22198d;

                    /* renamed from: e  reason: collision with root package name */
                    int f22199e;

                    /* renamed from: f  reason: collision with root package name */
                    final /* synthetic */ C17052a f22200f;

                    /* renamed from: g  reason: collision with root package name */
                    final /* synthetic */ p<QJ.Q, C17164e<? super C16807N>, Object> f22201g;

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
                    @f(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {111}, m = "invokeSuspend")
                    /* renamed from: androidx.lifecycle.Q$a$a$a$a$a  reason: collision with other inner class name */
                    static final class C0343a extends l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

                        /* renamed from: c  reason: collision with root package name */
                        int f22202c;

                        /* renamed from: d  reason: collision with root package name */
                        private /* synthetic */ Object f22203d;

                        /* renamed from: e  reason: collision with root package name */
                        final /* synthetic */ p<QJ.Q, C17164e<? super C16807N>, Object> f22204e;

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        C0343a(p<? super QJ.Q, ? super C17164e<? super C16807N>, ? extends Object> pVar, C17164e<? super C0343a> eVar) {
                            super(2, eVar);
                            this.f22204e = pVar;
                        }

                        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                            C0343a aVar = new C0343a(this.f22204e, eVar);
                            aVar.f22203d = obj;
                            return aVar;
                        }

                        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
                            return ((C0343a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                        }

                        public final Object invokeSuspend(Object obj) {
                            Object f10 = C17187b.f();
                            int i10 = this.f22202c;
                            if (i10 == 0) {
                                y.b(obj);
                                p<QJ.Q, C17164e<? super C16807N>, Object> pVar = this.f22204e;
                                this.f22202c = 1;
                                if (pVar.invoke((QJ.Q) this.f22203d, this) == f10) {
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

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C0342a(C17052a aVar, p<? super QJ.Q, ? super C17164e<? super C16807N>, ? extends Object> pVar, C17164e<? super C0342a> eVar) {
                        super(2, eVar);
                        this.f22200f = aVar;
                        this.f22201g = pVar;
                    }

                    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                        return new C0342a(this.f22200f, this.f22201g, eVar);
                    }

                    public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
                        return ((C0342a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Throwable th2;
                        C17052a aVar;
                        C17052a aVar2;
                        p<QJ.Q, C17164e<? super C16807N>, Object> pVar;
                        Object f10 = C17187b.f();
                        int i10 = this.f22199e;
                        if (i10 == 0) {
                            y.b(obj);
                            aVar2 = this.f22200f;
                            pVar = this.f22201g;
                            this.f22197c = aVar2;
                            this.f22198d = pVar;
                            this.f22199e = 1;
                            if (aVar2.e((Object) null, this) == f10) {
                                return f10;
                            }
                        } else if (i10 == 1) {
                            pVar = (p) this.f22198d;
                            y.b(obj);
                            aVar2 = (C17052a) this.f22197c;
                        } else if (i10 == 2) {
                            aVar = (C17052a) this.f22197c;
                            try {
                                y.b(obj);
                                C16807N n10 = C16807N.f139792a;
                                aVar.d((Object) null);
                                return C16807N.f139792a;
                            } catch (Throwable th3) {
                                th2 = th3;
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        try {
                            C0343a aVar3 = new C0343a(pVar, (C17164e<? super C0343a>) null);
                            this.f22197c = aVar2;
                            this.f22198d = null;
                            this.f22199e = 2;
                            if (S.f(aVar3, this) == f10) {
                                return f10;
                            }
                            aVar = aVar2;
                            C16807N n102 = C16807N.f139792a;
                            aVar.d((Object) null);
                            return C16807N.f139792a;
                        } catch (Throwable th4) {
                            Throwable th5 = th4;
                            aVar = aVar2;
                            th2 = th5;
                            aVar.d((Object) null);
                            throw th2;
                        }
                    }
                }

                C0341a(r.a aVar, O<F0> o10, QJ.Q q10, r.a aVar2, C16320n<? super C16807N> nVar, C17052a aVar3, p<? super QJ.Q, ? super C17164e<? super C16807N>, ? extends Object> pVar) {
                    this.f22190a = aVar;
                    this.f22191b = o10;
                    this.f22192c = q10;
                    this.f22193d = aVar2;
                    this.f22194e = nVar;
                    this.f22195f = aVar3;
                    this.f22196g = pVar;
                }

                public final void e(C5221y yVar, r.a aVar) {
                    C17542s.j(yVar, "<anonymous parameter 0>");
                    C17542s.j(aVar, "event");
                    if (aVar == this.f22190a) {
                        this.f22191b.f144348a = C16314k.d(this.f22192c, (C17168i) null, (T) null, new C0342a(this.f22195f, this.f22196g, (C17164e<? super C0342a>) null), 3, (Object) null);
                        return;
                    }
                    if (aVar == this.f22193d) {
                        F0 f02 = (F0) this.f22191b.f144348a;
                        if (f02 != null) {
                            F0.a.a(f02, (CancellationException) null, 1, (Object) null);
                        }
                        this.f22191b.f144348a = null;
                    }
                    if (aVar == r.a.ON_DESTROY) {
                        C16320n<C16807N> nVar = this.f22194e;
                        x.a aVar2 = x.f139812b;
                        nVar.resumeWith(x.b(C16807N.f139792a));
                    }
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0340a(r rVar, r.b bVar, QJ.Q q10, p<? super QJ.Q, ? super C17164e<? super C16807N>, ? extends Object> pVar, C17164e<? super C0340a> eVar) {
                super(2, eVar);
                this.f22186j = rVar;
                this.f22187k = bVar;
                this.f22188l = q10;
                this.f22189m = pVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C0340a(this.f22186j, this.f22187k, this.f22188l, this.f22189m, eVar);
            }

            public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
                return ((C0340a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: kotlin.jvm.internal.O} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: kotlin.jvm.internal.O} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r17) {
                /*
                    r16 = this;
                    r1 = r16
                    java.lang.Object r0 = eI.C17187b.f()
                    int r2 = r1.f22185i
                    r3 = 0
                    r4 = 1
                    if (r2 == 0) goto L_0x0038
                    if (r2 != r4) goto L_0x0030
                    java.lang.Object r0 = r1.f22184h
                    nI.p r0 = (nI.p) r0
                    java.lang.Object r0 = r1.f22183g
                    QJ.Q r0 = (QJ.Q) r0
                    java.lang.Object r0 = r1.f22182f
                    androidx.lifecycle.r r0 = (androidx.lifecycle.r) r0
                    java.lang.Object r0 = r1.f22181e
                    androidx.lifecycle.r$b r0 = (androidx.lifecycle.r.b) r0
                    java.lang.Object r0 = r1.f22180d
                    r2 = r0
                    kotlin.jvm.internal.O r2 = (kotlin.jvm.internal.O) r2
                    java.lang.Object r0 = r1.f22179c
                    r5 = r0
                    kotlin.jvm.internal.O r5 = (kotlin.jvm.internal.O) r5
                    XH.y.b(r17)     // Catch:{ all -> 0x002d }
                    goto L_0x00b1
                L_0x002d:
                    r0 = move-exception
                    goto L_0x00c9
                L_0x0030:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r0.<init>(r2)
                    throw r0
                L_0x0038:
                    XH.y.b(r17)
                    androidx.lifecycle.r r2 = r1.f22186j
                    androidx.lifecycle.r$b r2 = r2.d()
                    androidx.lifecycle.r$b r5 = androidx.lifecycle.r.b.DESTROYED
                    if (r2 != r5) goto L_0x0048
                    XH.N r0 = XH.C16807N.f139792a
                    return r0
                L_0x0048:
                    kotlin.jvm.internal.O r2 = new kotlin.jvm.internal.O
                    r2.<init>()
                    kotlin.jvm.internal.O r13 = new kotlin.jvm.internal.O
                    r13.<init>()
                    androidx.lifecycle.r$b r5 = r1.f22187k     // Catch:{ all -> 0x00a8 }
                    androidx.lifecycle.r r14 = r1.f22186j     // Catch:{ all -> 0x00a8 }
                    QJ.Q r8 = r1.f22188l     // Catch:{ all -> 0x00a8 }
                    nI.p<QJ.Q, dI.e<? super XH.N>, java.lang.Object> r12 = r1.f22189m     // Catch:{ all -> 0x00a8 }
                    r1.f22179c = r2     // Catch:{ all -> 0x00a8 }
                    r1.f22180d = r13     // Catch:{ all -> 0x00a8 }
                    r1.f22181e = r5     // Catch:{ all -> 0x00a8 }
                    r1.f22182f = r14     // Catch:{ all -> 0x00a8 }
                    r1.f22183g = r8     // Catch:{ all -> 0x00a8 }
                    r1.f22184h = r12     // Catch:{ all -> 0x00a8 }
                    r1.f22185i = r4     // Catch:{ all -> 0x00a8 }
                    QJ.p r15 = new QJ.p     // Catch:{ all -> 0x00a8 }
                    dI.e r6 = eI.C17187b.c(r16)     // Catch:{ all -> 0x00a8 }
                    r15.<init>(r6, r4)     // Catch:{ all -> 0x00a8 }
                    r15.C()     // Catch:{ all -> 0x00a8 }
                    androidx.lifecycle.r$a$a r6 = androidx.lifecycle.r.a.Companion     // Catch:{ all -> 0x00a8 }
                    androidx.lifecycle.r$a r7 = r6.c(r5)     // Catch:{ all -> 0x00a8 }
                    androidx.lifecycle.r$a r9 = r6.a(r5)     // Catch:{ all -> 0x00a8 }
                    r5 = 0
                    bK.a r11 = bK.g.b(r5, r4, r3)     // Catch:{ all -> 0x00a8 }
                    androidx.lifecycle.Q$a$a$a r10 = new androidx.lifecycle.Q$a$a$a     // Catch:{ all -> 0x00a8 }
                    r5 = r10
                    r6 = r7
                    r7 = r2
                    r3 = r10
                    r10 = r15
                    r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00a8 }
                    r13.f144348a = r3     // Catch:{ all -> 0x00a8 }
                    java.lang.String r5 = "null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver"
                    kotlin.jvm.internal.C17542s.h(r3, r5)     // Catch:{ all -> 0x00a8 }
                    r10 = r3
                    androidx.lifecycle.v r10 = (androidx.lifecycle.C5218v) r10     // Catch:{ all -> 0x00a8 }
                    r14.c(r10)     // Catch:{ all -> 0x00a8 }
                    java.lang.Object r3 = r15.w()     // Catch:{ all -> 0x00a8 }
                    java.lang.Object r5 = eI.C17187b.f()     // Catch:{ all -> 0x00a8 }
                    if (r3 != r5) goto L_0x00ac
                    kotlin.coroutines.jvm.internal.h.c(r16)     // Catch:{ all -> 0x00a8 }
                    goto L_0x00ac
                L_0x00a8:
                    r0 = move-exception
                    r5 = r2
                    r2 = r13
                    goto L_0x00c9
                L_0x00ac:
                    if (r3 != r0) goto L_0x00af
                    return r0
                L_0x00af:
                    r5 = r2
                    r2 = r13
                L_0x00b1:
                    T r0 = r5.f144348a
                    QJ.F0 r0 = (QJ.F0) r0
                    if (r0 == 0) goto L_0x00bb
                    r3 = 0
                    QJ.F0.a.a(r0, r3, r4, r3)
                L_0x00bb:
                    T r0 = r2.f144348a
                    androidx.lifecycle.v r0 = (androidx.lifecycle.C5218v) r0
                    if (r0 == 0) goto L_0x00c6
                    androidx.lifecycle.r r2 = r1.f22186j
                    r2.g(r0)
                L_0x00c6:
                    XH.N r0 = XH.C16807N.f139792a
                    return r0
                L_0x00c9:
                    T r3 = r5.f144348a
                    QJ.F0 r3 = (QJ.F0) r3
                    if (r3 == 0) goto L_0x00d3
                    r5 = 0
                    QJ.F0.a.a(r3, r5, r4, r5)
                L_0x00d3:
                    T r2 = r2.f144348a
                    androidx.lifecycle.v r2 = (androidx.lifecycle.C5218v) r2
                    if (r2 == 0) goto L_0x00de
                    androidx.lifecycle.r r3 = r1.f22186j
                    r3.g(r2)
                L_0x00de:
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.Q.a.C0340a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(r rVar, r.b bVar, p<? super QJ.Q, ? super C17164e<? super C16807N>, ? extends Object> pVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f22176e = rVar;
            this.f22177f = bVar;
            this.f22178g = pVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f22176e, this.f22177f, this.f22178g, eVar);
            aVar.f22175d = obj;
            return aVar;
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f22174c;
            if (i10 == 0) {
                y.b(obj);
                P0 P02 = C16311i0.c().P0();
                C0340a aVar = new C0340a(this.f22176e, this.f22177f, (QJ.Q) this.f22175d, this.f22178g, (C17164e<? super C0340a>) null);
                this.f22174c = 1;
                if (C16310i.g(P02, aVar, this) == f10) {
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

    public static final Object a(r rVar, r.b bVar, p<? super QJ.Q, ? super C17164e<? super C16807N>, ? extends Object> pVar, C17164e<? super C16807N> eVar) {
        if (bVar == r.b.INITIALIZED) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        } else if (rVar.d() == r.b.DESTROYED) {
            return C16807N.f139792a;
        } else {
            Object f10 = S.f(new a(rVar, bVar, pVar, (C17164e<? super a>) null), eVar);
            return f10 == C17187b.f() ? f10 : C16807N.f139792a;
        }
    }

    public static final Object b(C5221y yVar, r.b bVar, p<? super QJ.Q, ? super C17164e<? super C16807N>, ? extends Object> pVar, C17164e<? super C16807N> eVar) {
        Object a10 = a(yVar.getLifecycle(), bVar, pVar, eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }
}
