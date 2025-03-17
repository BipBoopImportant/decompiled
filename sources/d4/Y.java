package D4;

import QJ.F0;
import QJ.Q;
import XH.C16807N;
import bK.C17052a;
import bK.g;
import dI.C17164e;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0003\u000f\f\u0012B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bH@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"LD4/Y;", "", "", "cancelPreviousInEqualPriority", "<init>", "(Z)V", "", "priority", "Lkotlin/Function1;", "LdI/e;", "LXH/N;", "block", "b", "(ILnI/l;LdI/e;)Ljava/lang/Object;", "LD4/Y$c;", "a", "LD4/Y$c;", "holder", "c", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Y {

    /* renamed from: b  reason: collision with root package name */
    public static final b f34232b = new b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final c f34233a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"LD4/Y$a;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "LD4/Y;", "runner", "<init>", "(LD4/Y;)V", "a", "LD4/Y;", "()LD4/Y;", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a extends CancellationException {

        /* renamed from: a  reason: collision with root package name */
        private final Y f34234a;

        public a(Y y10) {
            C17542s.j(y10, "runner");
            this.f34234a = y10;
        }

        public final Y a() {
            return this.f34234a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LD4/Y$b;", "", "<init>", "()V", "", "DEFAULT_PRIORITY", "I", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"LD4/Y$c;", "", "LD4/Y;", "singleRunner", "", "cancelPreviousInEqualPriority", "<init>", "(LD4/Y;Z)V", "", "priority", "LQJ/F0;", "job", "b", "(ILQJ/F0;LdI/e;)Ljava/lang/Object;", "LXH/N;", "a", "(LQJ/F0;LdI/e;)Ljava/lang/Object;", "LD4/Y;", "Z", "LbK/a;", "c", "LbK/a;", "mutex", "d", "LQJ/F0;", "previous", "e", "I", "previousPriority", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final Y f34235a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f34236b;

        /* renamed from: c  reason: collision with root package name */
        private final C17052a f34237c = g.b(false, 1, (Object) null);

        /* renamed from: d  reason: collision with root package name */
        private F0 f34238d;

        /* renamed from: e  reason: collision with root package name */
        private int f34239e;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @f(c = "androidx.paging.SingleRunner$Holder", f = "SingleRunner.kt", l = {129}, m = "onFinish")
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: c  reason: collision with root package name */
            Object f34240c;

            /* renamed from: d  reason: collision with root package name */
            Object f34241d;

            /* renamed from: e  reason: collision with root package name */
            Object f34242e;

            /* renamed from: f  reason: collision with root package name */
            /* synthetic */ Object f34243f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ c f34244g;

            /* renamed from: h  reason: collision with root package name */
            int f34245h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(c cVar, C17164e<? super a> eVar) {
                super(eVar);
                this.f34244g = cVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f34243f = obj;
                this.f34245h |= Integer.MIN_VALUE;
                return this.f34244g.a((F0) null, this);
            }
        }

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @f(c = "androidx.paging.SingleRunner$Holder", f = "SingleRunner.kt", l = {129, 100}, m = "tryEnqueue")
        static final class b extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: c  reason: collision with root package name */
            Object f34246c;

            /* renamed from: d  reason: collision with root package name */
            Object f34247d;

            /* renamed from: e  reason: collision with root package name */
            Object f34248e;

            /* renamed from: f  reason: collision with root package name */
            int f34249f;

            /* renamed from: g  reason: collision with root package name */
            /* synthetic */ Object f34250g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ c f34251h;

            /* renamed from: i  reason: collision with root package name */
            int f34252i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(c cVar, C17164e<? super b> eVar) {
                super(eVar);
                this.f34251h = cVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f34250g = obj;
                this.f34252i |= Integer.MIN_VALUE;
                return this.f34251h.b(0, (F0) null, this);
            }
        }

        public c(Y y10, boolean z10) {
            C17542s.j(y10, "singleRunner");
            this.f34235a = y10;
            this.f34236b = z10;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0059 A[Catch:{ all -> 0x005c }] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object a(QJ.F0 r6, dI.C17164e<? super XH.C16807N> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof D4.Y.c.a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                D4.Y$c$a r0 = (D4.Y.c.a) r0
                int r1 = r0.f34245h
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f34245h = r1
                goto L_0x0018
            L_0x0013:
                D4.Y$c$a r0 = new D4.Y$c$a
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.f34243f
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f34245h
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x0040
                if (r2 != r3) goto L_0x0038
                java.lang.Object r6 = r0.f34242e
                bK.a r6 = (bK.C17052a) r6
                java.lang.Object r1 = r0.f34241d
                QJ.F0 r1 = (QJ.F0) r1
                java.lang.Object r0 = r0.f34240c
                D4.Y$c r0 = (D4.Y.c) r0
                XH.y.b(r7)
                r7 = r6
                r6 = r1
                goto L_0x0055
            L_0x0038:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0040:
                XH.y.b(r7)
                bK.a r7 = r5.f34237c
                r0.f34240c = r5
                r0.f34241d = r6
                r0.f34242e = r7
                r0.f34245h = r3
                java.lang.Object r0 = r7.e(r4, r0)
                if (r0 != r1) goto L_0x0054
                return r1
            L_0x0054:
                r0 = r5
            L_0x0055:
                QJ.F0 r1 = r0.f34238d     // Catch:{ all -> 0x005c }
                if (r6 != r1) goto L_0x005e
                r0.f34238d = r4     // Catch:{ all -> 0x005c }
                goto L_0x005e
            L_0x005c:
                r6 = move-exception
                goto L_0x0066
            L_0x005e:
                XH.N r6 = XH.C16807N.f139792a     // Catch:{ all -> 0x005c }
                r7.d(r4)
                XH.N r6 = XH.C16807N.f139792a
                return r6
            L_0x0066:
                r7.d(r4)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: D4.Y.c.a(QJ.F0, dI.e):java.lang.Object");
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0086 A[Catch:{ all -> 0x003c }] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0087 A[Catch:{ all -> 0x003c }] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object b(int r10, QJ.F0 r11, dI.C17164e<? super java.lang.Boolean> r12) {
            /*
                r9 = this;
                boolean r0 = r12 instanceof D4.Y.c.b
                if (r0 == 0) goto L_0x0013
                r0 = r12
                D4.Y$c$b r0 = (D4.Y.c.b) r0
                int r1 = r0.f34252i
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f34252i = r1
                goto L_0x0018
            L_0x0013:
                D4.Y$c$b r0 = new D4.Y$c$b
                r0.<init>(r9, r12)
            L_0x0018:
                java.lang.Object r12 = r0.f34250g
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f34252i
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x0059
                if (r2 == r4) goto L_0x0047
                if (r2 != r3) goto L_0x003f
                int r10 = r0.f34249f
                java.lang.Object r11 = r0.f34248e
                bK.a r11 = (bK.C17052a) r11
                java.lang.Object r1 = r0.f34247d
                QJ.F0 r1 = (QJ.F0) r1
                java.lang.Object r0 = r0.f34246c
                D4.Y$c r0 = (D4.Y.c) r0
                XH.y.b(r12)     // Catch:{ all -> 0x003c }
                goto L_0x00aa
            L_0x003c:
                r10 = move-exception
                goto L_0x00b8
            L_0x003f:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L_0x0047:
                int r10 = r0.f34249f
                java.lang.Object r11 = r0.f34248e
                bK.a r11 = (bK.C17052a) r11
                java.lang.Object r2 = r0.f34247d
                QJ.F0 r2 = (QJ.F0) r2
                java.lang.Object r6 = r0.f34246c
                D4.Y$c r6 = (D4.Y.c) r6
                XH.y.b(r12)
                goto L_0x0072
            L_0x0059:
                XH.y.b(r12)
                bK.a r12 = r9.f34237c
                r0.f34246c = r9
                r0.f34247d = r11
                r0.f34248e = r12
                r0.f34249f = r10
                r0.f34252i = r4
                java.lang.Object r2 = r12.e(r5, r0)
                if (r2 != r1) goto L_0x006f
                return r1
            L_0x006f:
                r6 = r9
                r2 = r11
                r11 = r12
            L_0x0072:
                QJ.F0 r12 = r6.f34238d     // Catch:{ all -> 0x003c }
                if (r12 == 0) goto L_0x0089
                boolean r7 = r12.c()     // Catch:{ all -> 0x003c }
                if (r7 == 0) goto L_0x0089
                int r7 = r6.f34239e     // Catch:{ all -> 0x003c }
                if (r7 < r10) goto L_0x0089
                if (r7 != r10) goto L_0x0087
                boolean r7 = r6.f34236b     // Catch:{ all -> 0x003c }
                if (r7 == 0) goto L_0x0087
                goto L_0x0089
            L_0x0087:
                r4 = 0
                goto L_0x00b0
            L_0x0089:
                if (r12 == 0) goto L_0x0095
                D4.Y$a r7 = new D4.Y$a     // Catch:{ all -> 0x003c }
                D4.Y r8 = r6.f34235a     // Catch:{ all -> 0x003c }
                r7.<init>(r8)     // Catch:{ all -> 0x003c }
                r12.i(r7)     // Catch:{ all -> 0x003c }
            L_0x0095:
                if (r12 == 0) goto L_0x00ac
                r0.f34246c = r6     // Catch:{ all -> 0x003c }
                r0.f34247d = r2     // Catch:{ all -> 0x003c }
                r0.f34248e = r11     // Catch:{ all -> 0x003c }
                r0.f34249f = r10     // Catch:{ all -> 0x003c }
                r0.f34252i = r3     // Catch:{ all -> 0x003c }
                java.lang.Object r12 = r12.j0(r0)     // Catch:{ all -> 0x003c }
                if (r12 != r1) goto L_0x00a8
                return r1
            L_0x00a8:
                r1 = r2
                r0 = r6
            L_0x00aa:
                r6 = r0
                r2 = r1
            L_0x00ac:
                r6.f34238d = r2     // Catch:{ all -> 0x003c }
                r6.f34239e = r10     // Catch:{ all -> 0x003c }
            L_0x00b0:
                java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.b.a(r4)     // Catch:{ all -> 0x003c }
                r11.d(r5)
                return r10
            L_0x00b8:
                r11.d(r5)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: D4.Y.c.b(int, QJ.F0, dI.e):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.paging.SingleRunner", f = "SingleRunner.kt", l = {49}, m = "runInIsolation")
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f34253c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f34254d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Y f34255e;

        /* renamed from: f  reason: collision with root package name */
        int f34256f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(Y y10, C17164e<? super d> eVar) {
            super(eVar);
            this.f34255e = y10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f34254d = obj;
            this.f34256f |= Integer.MIN_VALUE;
            return this.f34255e.b(0, (C17642l<? super C17164e<? super C16807N>, ? extends Object>) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.paging.SingleRunner$runInIsolation$2", f = "SingleRunner.kt", l = {53, 59, 61, 61}, m = "invokeSuspend")
    static final class e extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f34257c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f34258d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Y f34259e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f34260f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17642l<C17164e<? super C16807N>, Object> f34261g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(Y y10, int i10, C17642l<? super C17164e<? super C16807N>, ? extends Object> lVar, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f34259e = y10;
            this.f34260f = i10;
            this.f34261g = lVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            e eVar2 = new e(this.f34259e, this.f34260f, this.f34261g, eVar);
            eVar2.f34258d = obj;
            return eVar2;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:29:0x008d A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r8.f34257c
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L_0x003c
                if (r1 == r5) goto L_0x0034
                if (r1 == r4) goto L_0x002a
                if (r1 == r3) goto L_0x0025
                if (r1 == r2) goto L_0x001c
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L_0x001c:
                java.lang.Object r0 = r8.f34258d
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                XH.y.b(r9)
                goto L_0x00a0
            L_0x0025:
                XH.y.b(r9)
                goto L_0x00a1
            L_0x002a:
                java.lang.Object r1 = r8.f34258d
                QJ.F0 r1 = (QJ.F0) r1
                XH.y.b(r9)     // Catch:{ all -> 0x0032 }
                goto L_0x007c
            L_0x0032:
                r9 = move-exception
                goto L_0x008e
            L_0x0034:
                java.lang.Object r1 = r8.f34258d
                QJ.F0 r1 = (QJ.F0) r1
                XH.y.b(r9)
                goto L_0x0067
            L_0x003c:
                XH.y.b(r9)
                java.lang.Object r9 = r8.f34258d
                QJ.Q r9 = (QJ.Q) r9
                dI.i r9 = r9.getCoroutineContext()
                QJ.F0$b r1 = QJ.F0.f137562d0
                dI.i$b r9 = r9.get(r1)
                if (r9 == 0) goto L_0x00a4
                QJ.F0 r9 = (QJ.F0) r9
                D4.Y r1 = r8.f34259e
                D4.Y$c r1 = r1.f34233a
                int r6 = r8.f34260f
                r8.f34258d = r9
                r8.f34257c = r5
                java.lang.Object r1 = r1.b(r6, r9, r8)
                if (r1 != r0) goto L_0x0064
                return r0
            L_0x0064:
                r7 = r1
                r1 = r9
                r9 = r7
            L_0x0067:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L_0x00a1
                nI.l<dI.e<? super XH.N>, java.lang.Object> r9 = r8.f34261g     // Catch:{ all -> 0x0032 }
                r8.f34258d = r1     // Catch:{ all -> 0x0032 }
                r8.f34257c = r4     // Catch:{ all -> 0x0032 }
                java.lang.Object r9 = r9.invoke(r8)     // Catch:{ all -> 0x0032 }
                if (r9 != r0) goto L_0x007c
                return r0
            L_0x007c:
                D4.Y r9 = r8.f34259e
                D4.Y$c r9 = r9.f34233a
                r2 = 0
                r8.f34258d = r2
                r8.f34257c = r3
                java.lang.Object r9 = r9.a(r1, r8)
                if (r9 != r0) goto L_0x00a1
                return r0
            L_0x008e:
                D4.Y r3 = r8.f34259e
                D4.Y$c r3 = r3.f34233a
                r8.f34258d = r9
                r8.f34257c = r2
                java.lang.Object r1 = r3.a(r1, r8)
                if (r1 != r0) goto L_0x009f
                return r0
            L_0x009f:
                r0 = r9
            L_0x00a0:
                throw r0
            L_0x00a1:
                XH.N r9 = XH.C16807N.f139792a
                return r9
            L_0x00a4:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "Internal error. coroutineScope should've created a job."
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: D4.Y.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public Y() {
        this(false, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Object c(Y y10, int i10, C17642l lVar, C17164e eVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return y10.b(i10, lVar, eVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(int r5, nI.C17642l<? super dI.C17164e<? super XH.C16807N>, ? extends java.lang.Object> r6, dI.C17164e<? super XH.C16807N> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof D4.Y.d
            if (r0 == 0) goto L_0x0013
            r0 = r7
            D4.Y$d r0 = (D4.Y.d) r0
            int r1 = r0.f34256f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f34256f = r1
            goto L_0x0018
        L_0x0013:
            D4.Y$d r0 = new D4.Y$d
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f34254d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f34256f
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r5 = r0.f34253c
            D4.Y r5 = (D4.Y) r5
            XH.y.b(r7)     // Catch:{ a -> 0x002d }
            goto L_0x0053
        L_0x002d:
            r6 = move-exception
            goto L_0x004d
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            XH.y.b(r7)
            D4.Y$e r7 = new D4.Y$e     // Catch:{ a -> 0x004b }
            r2 = 0
            r7.<init>(r4, r5, r6, r2)     // Catch:{ a -> 0x004b }
            r0.f34253c = r4     // Catch:{ a -> 0x004b }
            r0.f34256f = r3     // Catch:{ a -> 0x004b }
            java.lang.Object r5 = QJ.S.f(r7, r0)     // Catch:{ a -> 0x004b }
            if (r5 != r1) goto L_0x0053
            return r1
        L_0x004b:
            r6 = move-exception
            r5 = r4
        L_0x004d:
            D4.Y r7 = r6.a()
            if (r7 != r5) goto L_0x0056
        L_0x0053:
            XH.N r5 = XH.C16807N.f139792a
            return r5
        L_0x0056:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: D4.Y.b(int, nI.l, dI.e):java.lang.Object");
    }

    public Y(boolean z10) {
        this.f34233a = new c(this, z10);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10);
    }
}
