package p0;

import A1.B;
import A1.C4336c;
import A1.K;
import XH.C16807N;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import nI.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H@¢\u0006\u0004\b\u0005\u0010\u0006\u001a8\u0010\f\u001a\u00020\u0004*\u00020\u00072\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bH@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LA1/c;", "", "a", "(LA1/c;)Z", "LXH/N;", "b", "(LA1/c;LdI/e;)Ljava/lang/Object;", "LA1/K;", "Lkotlin/Function2;", "LdI/e;", "", "block", "c", "(LA1/K;LnI/p;LdI/e;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class t {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", l = {86}, m = "awaitAllPointersUp")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f27150c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f27151d;

        /* renamed from: e  reason: collision with root package name */
        int f27152e;

        a(C17164e<? super a> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f27151d = obj;
            this.f27152e |= Integer.MIN_VALUE;
            return t.b((C4336c) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LA1/c;", "LXH/N;", "<anonymous>", "(LA1/c;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", f = "ForEachGesture.kt", l = {104, 107, 112}, m = "invokeSuspend")
    static final class b extends k implements p<C4336c, C17164e<? super C16807N>, Object> {

        /* renamed from: d  reason: collision with root package name */
        int f27153d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f27154e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17168i f27155f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ p<C4336c, C17164e<? super C16807N>, Object> f27156g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C17168i iVar, p<? super C4336c, ? super C17164e<? super C16807N>, ? extends Object> pVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f27155f = iVar;
            this.f27156g = pVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f27155f, this.f27156g, eVar);
            bVar.f27154e = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(C4336c cVar, C17164e<? super C16807N> eVar) {
            return ((b) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0043 A[SYNTHETIC, Splitter:B:19:0x0043] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005b A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r7.f27153d
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x0034
                if (r1 == r4) goto L_0x002c
                if (r1 == r3) goto L_0x0021
                if (r1 != r2) goto L_0x0019
                java.lang.Object r1 = r7.f27154e
                A1.c r1 = (A1.C4336c) r1
                XH.y.b(r8)
                goto L_0x0028
            L_0x0019:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x0021:
                java.lang.Object r1 = r7.f27154e
                A1.c r1 = (A1.C4336c) r1
                XH.y.b(r8)     // Catch:{ CancellationException -> 0x002a }
            L_0x0028:
                r8 = r1
                goto L_0x003b
            L_0x002a:
                r8 = move-exception
                goto L_0x0060
            L_0x002c:
                java.lang.Object r1 = r7.f27154e
                A1.c r1 = (A1.C4336c) r1
                XH.y.b(r8)     // Catch:{ CancellationException -> 0x002a }
                goto L_0x0051
            L_0x0034:
                XH.y.b(r8)
                java.lang.Object r8 = r7.f27154e
                A1.c r8 = (A1.C4336c) r8
            L_0x003b:
                dI.i r1 = r7.f27155f
                boolean r1 = QJ.I0.p(r1)
                if (r1 == 0) goto L_0x0074
                nI.p<A1.c, dI.e<? super XH.N>, java.lang.Object> r1 = r7.f27156g     // Catch:{ CancellationException -> 0x005c }
                r7.f27154e = r8     // Catch:{ CancellationException -> 0x005c }
                r7.f27153d = r4     // Catch:{ CancellationException -> 0x005c }
                java.lang.Object r1 = r1.invoke(r8, r7)     // Catch:{ CancellationException -> 0x005c }
                if (r1 != r0) goto L_0x0050
                return r0
            L_0x0050:
                r1 = r8
            L_0x0051:
                r7.f27154e = r1     // Catch:{ CancellationException -> 0x002a }
                r7.f27153d = r3     // Catch:{ CancellationException -> 0x002a }
                java.lang.Object r8 = p0.t.b(r1, r7)     // Catch:{ CancellationException -> 0x002a }
                if (r8 != r0) goto L_0x0028
                return r0
            L_0x005c:
                r1 = move-exception
                r6 = r1
                r1 = r8
                r8 = r6
            L_0x0060:
                dI.i r5 = r7.f27155f
                boolean r5 = QJ.I0.p(r5)
                if (r5 == 0) goto L_0x0073
                r7.f27154e = r1
                r7.f27153d = r2
                java.lang.Object r8 = p0.t.b(r1, r7)
                if (r8 != r0) goto L_0x0028
                return r0
            L_0x0073:
                throw r8
            L_0x0074:
                XH.N r8 = XH.C16807N.f139792a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p0.t.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final boolean a(C4336c cVar) {
        List<B> c10 = cVar.b1().c();
        int size = c10.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            } else if (c10.get(i10).i()) {
                z10 = true;
                break;
            } else {
                i10++;
            }
        }
        return !z10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (a(r6) == false) goto L_0x003e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0068 A[EDGE_INSN: B:25:0x0068->B:22:0x0068 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(A1.C4336c r6, dI.C17164e<? super XH.C16807N> r7) {
        /*
            boolean r0 = r7 instanceof p0.t.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            p0.t$a r0 = (p0.t.a) r0
            int r1 = r0.f27152e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f27152e = r1
            goto L_0x0018
        L_0x0013:
            p0.t$a r0 = new p0.t$a
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.f27151d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f27152e
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r6 = r0.f27150c
            A1.c r6 = (A1.C4336c) r6
            XH.y.b(r7)
            goto L_0x004b
        L_0x002d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0035:
            XH.y.b(r7)
            boolean r7 = a(r6)
            if (r7 != 0) goto L_0x0068
        L_0x003e:
            A1.r r7 = A1.r.Final
            r0.f27150c = r6
            r0.f27152e = r3
            java.lang.Object r7 = r6.B1(r7, r0)
            if (r7 != r1) goto L_0x004b
            return r1
        L_0x004b:
            A1.p r7 = (A1.C4349p) r7
            java.util.List r7 = r7.c()
            int r2 = r7.size()
            r4 = 0
        L_0x0056:
            if (r4 >= r2) goto L_0x0068
            java.lang.Object r5 = r7.get(r4)
            A1.B r5 = (A1.B) r5
            boolean r5 = r5.i()
            if (r5 == 0) goto L_0x0065
            goto L_0x003e
        L_0x0065:
            int r4 = r4 + 1
            goto L_0x0056
        L_0x0068:
            XH.N r6 = XH.C16807N.f139792a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.t.b(A1.c, dI.e):java.lang.Object");
    }

    public static final Object c(K k10, p<? super C4336c, ? super C17164e<? super C16807N>, ? extends Object> pVar, C17164e<? super C16807N> eVar) {
        Object t12 = k10.t1(new b(eVar.getContext(), pVar, (C17164e<? super b>) null), eVar);
        return t12 == C17187b.f() ? t12 : C16807N.f139792a;
    }
}
