package E0;

import QJ.F0;
import QJ.Q;
import QJ.S;
import QJ.T;
import U0.C4892n0;
import U0.D0;
import XH.C16807N;
import XH.y;
import d0.i;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H@¢\u0006\u0004\b\u0005\u0010\u0006R*\u0010\f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007j\n\u0012\u0006\u0012\u0004\u0018\u00010\b`\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR+\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8F@BX\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"LE0/o;", "", "<init>", "()V", "LXH/N;", "e", "(LdI/e;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicReference;", "LQJ/F0;", "Landroidx/compose/foundation/AtomicReference;", "a", "Ljava/util/concurrent/atomic/AtomicReference;", "animationJob", "", "<set-?>", "b", "LU0/n0;", "c", "()F", "d", "(F)V", "cursorAlpha", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: E0.o  reason: case insensitive filesystem */
public final class C4457o {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public AtomicReference<F0> f5721a = new AtomicReference<>((Object) null);

    /* renamed from: b  reason: collision with root package name */
    private final C4892n0 f5722b = D0.a(0.0f);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "", "<anonymous>", "(LQJ/Q;)Z"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2", f = "CursorAnimationState.kt", l = {}, m = "invokeSuspend")
    /* renamed from: E0.o$a */
    static final class a extends l implements p<Q, C17164e<? super Boolean>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f5723c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f5724d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4457o f5725e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1", f = "CursorAnimationState.kt", l = {69, 77, 79}, m = "invokeSuspend")
        /* renamed from: E0.o$a$a  reason: collision with other inner class name */
        static final class C0043a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f5726c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ F0 f5727d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C4457o f5728e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0043a(F0 f02, C4457o oVar, C17164e<? super C0043a> eVar) {
                super(2, eVar);
                this.f5727d = f02;
                this.f5728e = oVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C0043a(this.f5727d, this.f5728e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C0043a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
                	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
                */
            /* JADX WARNING: Removed duplicated region for block: B:21:0x0049 A[Catch:{ all -> 0x0018 }, RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:24:0x0057 A[RETURN] */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    java.lang.Object r0 = eI.C17187b.f()
                    int r1 = r8.f5726c
                    r2 = 0
                    r3 = 500(0x1f4, double:2.47E-321)
                    r5 = 3
                    r6 = 2
                    r7 = 1
                    if (r1 == 0) goto L_0x002a
                    if (r1 == r7) goto L_0x0026
                    if (r1 == r6) goto L_0x0022
                    if (r1 != r5) goto L_0x001a
                    XH.y.b(r9)     // Catch:{ all -> 0x0018 }
                    goto L_0x003a
                L_0x0018:
                    r9 = move-exception
                    goto L_0x0058
                L_0x001a:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L_0x0022:
                    XH.y.b(r9)     // Catch:{ all -> 0x0018 }
                    goto L_0x004a
                L_0x0026:
                    XH.y.b(r9)
                    goto L_0x003a
                L_0x002a:
                    XH.y.b(r9)
                    QJ.F0 r9 = r8.f5727d
                    if (r9 == 0) goto L_0x003a
                    r8.f5726c = r7
                    java.lang.Object r9 = QJ.I0.g(r9, r8)
                    if (r9 != r0) goto L_0x003a
                    return r0
                L_0x003a:
                    E0.o r9 = r8.f5728e     // Catch:{ all -> 0x0018 }
                    r1 = 1065353216(0x3f800000, float:1.0)
                    r9.d(r1)     // Catch:{ all -> 0x0018 }
                    r8.f5726c = r6     // Catch:{ all -> 0x0018 }
                    java.lang.Object r9 = QJ.C16297b0.b(r3, r8)     // Catch:{ all -> 0x0018 }
                    if (r9 != r0) goto L_0x004a
                    return r0
                L_0x004a:
                    E0.o r9 = r8.f5728e     // Catch:{ all -> 0x0018 }
                    r9.d(r2)     // Catch:{ all -> 0x0018 }
                    r8.f5726c = r5     // Catch:{ all -> 0x0018 }
                    java.lang.Object r9 = QJ.C16297b0.b(r3, r8)     // Catch:{ all -> 0x0018 }
                    if (r9 != r0) goto L_0x003a
                    return r0
                L_0x0058:
                    E0.o r0 = r8.f5728e
                    r0.d(r2)
                    throw r9
                */
                throw new UnsupportedOperationException("Method not decompiled: E0.C4457o.a.C0043a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C4457o oVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f5725e = oVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f5725e, eVar);
            aVar.f5724d = obj;
            return aVar;
        }

        public final Object invoke(Q q10, C17164e<? super Boolean> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f5723c == 0) {
                y.b(obj);
                return b.a(i.a(this.f5725e.f5721a, (Object) null, C16314k.d((Q) this.f5724d, (C17168i) null, (T) null, new C0043a((F0) this.f5725e.f5721a.getAndSet((Object) null), this.f5725e, (C17164e<? super C0043a>) null), 3, (Object) null)));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: private */
    public final void d(float f10) {
        this.f5722b.n(f10);
    }

    public final float c() {
        return this.f5722b.a();
    }

    public final Object e(C17164e<? super C16807N> eVar) {
        Object f10 = S.f(new a(this, (C17164e<? super a>) null), eVar);
        return f10 == C17187b.f() ? f10 : C16807N.f139792a;
    }
}
