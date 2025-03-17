package x5;

import SJ.C16434j;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import w5.c;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "T", "Lw5/c;", "LTJ/g;", "a", "(Lw5/c;)LTJ/g;", "sqldelight-coroutines-extensions"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: x5.b  reason: case insensitive filesystem */
public final class C8954b {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "LTJ/h;", "Lw5/c;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {1, 9, 0})
    @f(c = "app.cash.sqldelight.coroutines.FlowQuery$asFlow$1", f = "FlowExtensions.kt", l = {47, 48}, m = "invokeSuspend")
    /* renamed from: x5.b$a */
    static final class a extends l implements p<C16533h<? super c<? extends T>>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f57722c;

        /* renamed from: d  reason: collision with root package name */
        Object f57723d;

        /* renamed from: e  reason: collision with root package name */
        int f57724e;

        /* renamed from: f  reason: collision with root package name */
        private /* synthetic */ Object f57725f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c<T> f57726g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c<? extends T> cVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f57726g = cVar;
        }

        /* access modifiers changed from: private */
        public static final void j(C16434j jVar) {
            jVar.k(C16807N.f139792a);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f57726g, eVar);
            aVar.f57725f = obj;
            return aVar;
        }

        public final Object invoke(C16533h<? super c<? extends T>> hVar, C17164e<? super C16807N> eVar) {
            return ((a) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0069 A[Catch:{ all -> 0x001f }] */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0074 A[Catch:{ all -> 0x001f }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r7.f57724e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0039
                if (r1 == r3) goto L_0x0029
                if (r1 != r2) goto L_0x0021
                java.lang.Object r1 = r7.f57723d
                SJ.l r1 = (SJ.C16436l) r1
                java.lang.Object r4 = r7.f57722c
                w5.c$a r4 = (w5.c.a) r4
                java.lang.Object r5 = r7.f57725f
                TJ.h r5 = (TJ.C16533h) r5
                XH.y.b(r8)     // Catch:{ all -> 0x001f }
            L_0x001d:
                r8 = r5
                goto L_0x005a
            L_0x001f:
                r8 = move-exception
                goto L_0x0090
            L_0x0021:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x0029:
                java.lang.Object r1 = r7.f57723d
                SJ.l r1 = (SJ.C16436l) r1
                java.lang.Object r4 = r7.f57722c
                w5.c$a r4 = (w5.c.a) r4
                java.lang.Object r5 = r7.f57725f
                TJ.h r5 = (TJ.C16533h) r5
                XH.y.b(r8)     // Catch:{ all -> 0x001f }
                goto L_0x006c
            L_0x0039:
                XH.y.b(r8)
                java.lang.Object r8 = r7.f57725f
                TJ.h r8 = (TJ.C16533h) r8
                r1 = -1
                r4 = 6
                r5 = 0
                SJ.j r1 = SJ.C16437m.b(r1, r5, r5, r4, r5)
                XH.N r4 = XH.C16807N.f139792a
                r1.k(r4)
                x5.a r4 = new x5.a
                r4.<init>(r1)
                w5.c<T> r5 = r7.f57726g
                r5.f(r4)
                SJ.l r1 = r1.iterator()     // Catch:{ all -> 0x001f }
            L_0x005a:
                r7.f57725f = r8     // Catch:{ all -> 0x001f }
                r7.f57722c = r4     // Catch:{ all -> 0x001f }
                r7.f57723d = r1     // Catch:{ all -> 0x001f }
                r7.f57724e = r3     // Catch:{ all -> 0x001f }
                java.lang.Object r5 = r1.a(r7)     // Catch:{ all -> 0x001f }
                if (r5 != r0) goto L_0x0069
                return r0
            L_0x0069:
                r6 = r5
                r5 = r8
                r8 = r6
            L_0x006c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x001f }
                boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x001f }
                if (r8 == 0) goto L_0x0088
                r1.next()     // Catch:{ all -> 0x001f }
                w5.c<T> r8 = r7.f57726g     // Catch:{ all -> 0x001f }
                r7.f57725f = r5     // Catch:{ all -> 0x001f }
                r7.f57722c = r4     // Catch:{ all -> 0x001f }
                r7.f57723d = r1     // Catch:{ all -> 0x001f }
                r7.f57724e = r2     // Catch:{ all -> 0x001f }
                java.lang.Object r8 = r5.emit(r8, r7)     // Catch:{ all -> 0x001f }
                if (r8 != r0) goto L_0x001d
                return r0
            L_0x0088:
                w5.c<T> r8 = r7.f57726g
                r8.g(r4)
                XH.N r8 = XH.C16807N.f139792a
                return r8
            L_0x0090:
                w5.c<T> r0 = r7.f57726g
                r0.g(r4)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: x5.C8954b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final <T> C16532g<c<T>> a(c<? extends T> cVar) {
        C17542s.j(cVar, "<this>");
        return C16534i.H(new a(cVar, (C17164e<? super a>) null));
    }
}
