package o0;

import A1.C4336c;
import A1.K;
import A1.U;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.p;
import o0.C5658i;
import o1.C5667g;
import p0.t;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a(\u0010\n\u001a\u00020\b*\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H@¢\u0006\u0004\b\n\u0010\u000b\u001a\u0014\u0010\u000e\u001a\u00020\r*\u00020\fH@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/d;", "Lo0/i;", "state", "c", "(Landroidx/compose/ui/d;Lo0/i;)Landroidx/compose/ui/d;", "LA1/K;", "Lkotlin/Function1;", "Lo1/g;", "LXH/N;", "onDown", "d", "(LA1/K;LnI/l;LdI/e;)Ljava/lang/Object;", "LA1/c;", "LA1/B;", "b", "(LA1/c;LdI/e;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: o0.c  reason: case insensitive filesystem */
public final class C5652c {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt", f = "ContextMenuGestures.android.kt", l = {66}, m = "awaitFirstRightClickDown")
    /* renamed from: o0.c$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f26621c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f26622d;

        /* renamed from: e  reason: collision with root package name */
        int f26623e;

        a(C17164e<? super a> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f26622d = obj;
            this.f26623e |= Integer.MIN_VALUE;
            return C5652c.b((C4336c) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LA1/K;", "LXH/N;", "<anonymous>", "(LA1/K;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt$contextMenuGestures$1", f = "ContextMenuGestures.android.kt", l = {44}, m = "invokeSuspend")
    /* renamed from: o0.c$b */
    static final class b extends l implements p<K, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f26624c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f26625d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C5658i f26626e;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo1/g;", "it", "LXH/N;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: o0.c$b$a */
        static final class a extends C17544u implements C17642l<C5667g, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C5658i f26627c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C5658i iVar) {
                super(1);
                this.f26627c = iVar;
            }

            public final void a(long j10) {
                this.f26627c.b(new C5658i.a.b(j10, (DefaultConstructorMarker) null));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((C5667g) obj).v());
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C5658i iVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f26626e = iVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f26626e, eVar);
            bVar.f26625d = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(K k10, C17164e<? super C16807N> eVar) {
            return ((b) create(k10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f26624c;
            if (i10 == 0) {
                y.b(obj);
                a aVar = new a(this.f26626e);
                this.f26624c = 1;
                if (C5652c.d((K) this.f26625d, aVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LA1/c;", "LXH/N;", "<anonymous>", "(LA1/c;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt$onRightClickDown$2", f = "ContextMenuGestures.android.kt", l = {53, 56}, m = "invokeSuspend")
    /* renamed from: o0.c$c  reason: collision with other inner class name */
    static final class C0425c extends k implements p<C4336c, C17164e<? super C16807N>, Object> {

        /* renamed from: d  reason: collision with root package name */
        int f26628d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f26629e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l<C5667g, C16807N> f26630f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0425c(C17642l<? super C5667g, C16807N> lVar, C17164e<? super C0425c> eVar) {
            super(2, eVar);
            this.f26630f = lVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C0425c cVar = new C0425c(this.f26630f, eVar);
            cVar.f26629e = obj;
            return cVar;
        }

        /* renamed from: i */
        public final Object invoke(C4336c cVar, C17164e<? super C16807N> eVar) {
            return ((C0425c) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: A1.c} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r7.f26628d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0022
                if (r1 == r3) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                XH.y.b(r8)
                goto L_0x0053
            L_0x0012:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x001a:
                java.lang.Object r1 = r7.f26629e
                A1.c r1 = (A1.C4336c) r1
                XH.y.b(r8)
                goto L_0x0035
            L_0x0022:
                XH.y.b(r8)
                java.lang.Object r8 = r7.f26629e
                r1 = r8
                A1.c r1 = (A1.C4336c) r1
                r7.f26629e = r1
                r7.f26628d = r3
                java.lang.Object r8 = o0.C5652c.b(r1, r7)
                if (r8 != r0) goto L_0x0035
                return r0
            L_0x0035:
                A1.B r8 = (A1.B) r8
                r8.a()
                nI.l<o1.g, XH.N> r4 = r7.f26630f
                long r5 = r8.h()
                o1.g r8 = o1.C5667g.d(r5)
                r4.invoke(r8)
                r8 = 0
                r7.f26629e = r8
                r7.f26628d = r2
                java.lang.Object r8 = p0.G.l(r1, r8, r7, r3, r8)
                if (r8 != r0) goto L_0x0053
                return r0
            L_0x0053:
                A1.B r8 = (A1.B) r8
                if (r8 == 0) goto L_0x005a
                r8.a()
            L_0x005a:
                XH.N r8 = XH.C16807N.f139792a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: o0.C5652c.C0425c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: private */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
    public static final java.lang.Object b(A1.C4336c r8, dI.C17164e<? super A1.B> r9) {
        /*
            boolean r0 = r9 instanceof o0.C5652c.a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            o0.c$a r0 = (o0.C5652c.a) r0
            int r1 = r0.f26623e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f26623e = r1
            goto L_0x0018
        L_0x0013:
            o0.c$a r0 = new o0.c$a
            r0.<init>(r9)
        L_0x0018:
            java.lang.Object r9 = r0.f26622d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f26623e
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r8 = r0.f26621c
            A1.c r8 = (A1.C4336c) r8
            XH.y.b(r9)
            goto L_0x0044
        L_0x002d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0035:
            XH.y.b(r9)
        L_0x0038:
            r0.f26621c = r8
            r0.f26623e = r3
            r9 = 0
            java.lang.Object r9 = A1.C4336c.J1(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L_0x0044
            return r1
        L_0x0044:
            A1.p r9 = (A1.C4349p) r9
            int r2 = r9.b()
            boolean r2 = A1.C4353u.d(r2)
            if (r2 == 0) goto L_0x0038
            java.util.List r2 = r9.c()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L_0x005a:
            if (r6 >= r4) goto L_0x006c
            java.lang.Object r7 = r2.get(r6)
            A1.B r7 = (A1.B) r7
            boolean r7 = A1.C4350q.a(r7)
            if (r7 != 0) goto L_0x0069
            goto L_0x0038
        L_0x0069:
            int r6 = r6 + 1
            goto L_0x005a
        L_0x006c:
            java.util.List r8 = r9.c()
            java.lang.Object r8 = r8.get(r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.C5652c.b(A1.c, dI.e):java.lang.Object");
    }

    public static final androidx.compose.ui.d c(androidx.compose.ui.d dVar, C5658i iVar) {
        return U.d(dVar, C5653d.f26631a, new b(iVar, (C17164e<? super b>) null));
    }

    public static final Object d(K k10, C17642l<? super C5667g, C16807N> lVar, C17164e<? super C16807N> eVar) {
        Object c10 = t.c(k10, new C0425c(lVar, (C17164e<? super C0425c>) null), eVar);
        return c10 == C17187b.f() ? c10 : C16807N.f139792a;
    }
}
