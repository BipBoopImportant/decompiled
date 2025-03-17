package qk;

import EB.C12832d;
import FB.C12860a;
import dI.C17164e;
import jB.C14613b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.C17542s;
import lm.C11550a;
import lm.f;
import pk.s;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J2\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000eH@¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001b\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000eH@¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010!¨\u0006\""}, d2 = {"Lqk/g;", "", "Llm/f;", "backInStockNotificationAnalytics", "LFB/a;", "localStoreSelectionRepository", "Llm/a;", "backInStockApi", "LjB/b;", "shoppingListRepository", "<init>", "(Llm/f;LFB/a;Llm/a;LjB/b;)V", "LEB/d;", "store", "", "itemNo", "itemType", "Lpk/s$g$c;", "d", "(LEB/d;Ljava/lang/String;Ljava/lang/String;)Lpk/s$g$c;", "Llm/a$c;", "fulfilmentOption", "itemName", "Lpk/s$g;", "c", "(Llm/a$c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "listId", "b", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "a", "Llm/f;", "LFB/a;", "Llm/a;", "LjB/b;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qk.g  reason: case insensitive filesystem */
public final class C11794g {

    /* renamed from: a  reason: collision with root package name */
    private final f f101623a;

    /* renamed from: b  reason: collision with root package name */
    private final C12860a f101624b;

    /* renamed from: c  reason: collision with root package name */
    private final C11550a f101625c;

    /* renamed from: d  reason: collision with root package name */
    private final C14613b f101626d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.usecase.NotifyWhenBackInStockUseCase", f = "NotifyWhenBackInStockUseCase.kt", l = {30, 43, 59}, m = "invoke")
    /* renamed from: qk.g$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f101627c;

        /* renamed from: d  reason: collision with root package name */
        Object f101628d;

        /* renamed from: e  reason: collision with root package name */
        Object f101629e;

        /* renamed from: f  reason: collision with root package name */
        Object f101630f;

        /* renamed from: g  reason: collision with root package name */
        Object f101631g;

        /* renamed from: h  reason: collision with root package name */
        Object f101632h;

        /* renamed from: i  reason: collision with root package name */
        Object f101633i;

        /* renamed from: j  reason: collision with root package name */
        Object f101634j;

        /* renamed from: k  reason: collision with root package name */
        Object f101635k;

        /* renamed from: l  reason: collision with root package name */
        /* synthetic */ Object f101636l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ C11794g f101637m;

        /* renamed from: n  reason: collision with root package name */
        int f101638n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C11794g gVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f101637m = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f101636l = obj;
            this.f101638n |= Integer.MIN_VALUE;
            return this.f101637m.b((String) null, (String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.usecase.NotifyWhenBackInStockUseCase", f = "NotifyWhenBackInStockUseCase.kt", l = {102}, m = "registerBackInStockPushNotification")
    /* renamed from: qk.g$b */
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f101639c;

        /* renamed from: d  reason: collision with root package name */
        Object f101640d;

        /* renamed from: e  reason: collision with root package name */
        Object f101641e;

        /* renamed from: f  reason: collision with root package name */
        Object f101642f;

        /* renamed from: g  reason: collision with root package name */
        Object f101643g;

        /* renamed from: h  reason: collision with root package name */
        Object f101644h;

        /* renamed from: i  reason: collision with root package name */
        Object f101645i;

        /* renamed from: j  reason: collision with root package name */
        Object f101646j;

        /* renamed from: k  reason: collision with root package name */
        int f101647k;

        /* renamed from: l  reason: collision with root package name */
        int f101648l;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f101649m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ C11794g f101650n;

        /* renamed from: o  reason: collision with root package name */
        int f101651o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C11794g gVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f101650n = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f101649m = obj;
            this.f101651o |= Integer.MIN_VALUE;
            return this.f101650n.c((C11550a.c) null, (String) null, (String) null, (String) null, this);
        }
    }

    public C11794g(f fVar, C12860a aVar, C11550a aVar2, C14613b bVar) {
        C17542s.j(fVar, "backInStockNotificationAnalytics");
        C17542s.j(aVar, "localStoreSelectionRepository");
        C17542s.j(aVar2, "backInStockApi");
        C17542s.j(bVar, "shoppingListRepository");
        this.f101623a = fVar;
        this.f101624b = aVar;
        this.f101625c = aVar2;
        this.f101626d = bVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: java.lang.String} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0096, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0097, code lost:
        r15 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x010a, code lost:
        throw r11;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:11:0x004a, B:18:0x005e] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0050 A[ExcHandler: CancellationException (r11v11 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:11:0x004a] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(lm.C11550a.c r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, dI.C17164e<? super pk.s.g> r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof qk.C11794g.b
            if (r0 == 0) goto L_0x0014
            r0 = r15
            qk.g$b r0 = (qk.C11794g.b) r0
            int r1 = r0.f101651o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.f101651o = r1
        L_0x0012:
            r6 = r0
            goto L_0x001a
        L_0x0014:
            qk.g$b r0 = new qk.g$b
            r0.<init>(r10, r15)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r0 = r6.f101649m
            java.lang.Object r9 = eI.C17187b.f()
            int r1 = r6.f101651o
            r2 = 1
            if (r1 == 0) goto L_0x005b
            if (r1 != r2) goto L_0x0053
            java.lang.Object r11 = r6.f101646j
            qk.g r11 = (qk.C11794g) r11
            java.lang.Object r11 = r6.f101645i
            qk.g r11 = (qk.C11794g) r11
            java.lang.Object r11 = r6.f101644h
            dI.e r11 = (dI.C17164e) r11
            java.lang.Object r11 = r6.f101643g
            r14 = r11
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r11 = r6.f101642f
            r13 = r11
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r11 = r6.f101641e
            r12 = r11
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r11 = r6.f101640d
            lm.a$c r11 = (lm.C11550a.c) r11
            java.lang.Object r15 = r6.f101639c
            qk.g r15 = (qk.C11794g) r15
            XH.y.b(r0)     // Catch:{ CancellationException -> 0x0050, all -> 0x004e }
            goto L_0x0087
        L_0x004e:
            r0 = move-exception
            goto L_0x0098
        L_0x0050:
            r11 = move-exception
            goto L_0x010a
        L_0x0053:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x005b:
            XH.y.b(r0)
            XH.x$a r0 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0050, all -> 0x0096 }
            lm.a r1 = r10.f101625c     // Catch:{ CancellationException -> 0x0050, all -> 0x0096 }
            r6.f101639c = r10     // Catch:{ CancellationException -> 0x0050, all -> 0x0096 }
            r6.f101640d = r11     // Catch:{ CancellationException -> 0x0050, all -> 0x0096 }
            r6.f101641e = r12     // Catch:{ CancellationException -> 0x0050, all -> 0x0096 }
            r6.f101642f = r13     // Catch:{ CancellationException -> 0x0050, all -> 0x0096 }
            r6.f101643g = r14     // Catch:{ CancellationException -> 0x0050, all -> 0x0096 }
            r6.f101644h = r15     // Catch:{ CancellationException -> 0x0050, all -> 0x0096 }
            r6.f101645i = r10     // Catch:{ CancellationException -> 0x0050, all -> 0x0096 }
            r6.f101646j = r10     // Catch:{ CancellationException -> 0x0050, all -> 0x0096 }
            r15 = 0
            r6.f101647k = r15     // Catch:{ CancellationException -> 0x0050, all -> 0x0096 }
            r6.f101648l = r15     // Catch:{ CancellationException -> 0x0050, all -> 0x0096 }
            r6.f101651o = r2     // Catch:{ CancellationException -> 0x0050, all -> 0x0096 }
            r3 = 0
            r7 = 2
            r8 = 0
            r2 = r11
            r4 = r12
            r5 = r13
            java.lang.Object r0 = lm.C11550a.b.a(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ CancellationException -> 0x0050, all -> 0x0096 }
            if (r0 != r9) goto L_0x0086
            return r9
        L_0x0086:
            r15 = r10
        L_0x0087:
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ CancellationException -> 0x0050, all -> 0x004e }
            int r0 = r0.intValue()     // Catch:{ CancellationException -> 0x0050, all -> 0x004e }
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.b.e(r0)     // Catch:{ CancellationException -> 0x0050, all -> 0x004e }
            java.lang.Object r0 = XH.x.b(r0)     // Catch:{ CancellationException -> 0x0050, all -> 0x004e }
            goto L_0x00a2
        L_0x0096:
            r0 = move-exception
            r15 = r10
        L_0x0098:
            XH.x$a r1 = XH.x.f139812b
            java.lang.Object r0 = XH.y.a(r0)
            java.lang.Object r0 = XH.x.b(r0)
        L_0x00a2:
            java.lang.Throwable r1 = XH.x.e(r0)
            if (r1 != 0) goto L_0x00b8
            java.lang.Number r0 = (java.lang.Number) r0
            int r11 = r0.intValue()
            pk.s$g$e r12 = new pk.s$g$e
            IC.e r11 = IC.C13026h.a(r11)
            r12.<init>(r11)
            goto L_0x0109
        L_0x00b8:
            boolean r0 = r1 instanceof lm.b
            if (r0 == 0) goto L_0x00c0
            r0 = r1
            lm.b r0 = (lm.b) r0
            goto L_0x00c1
        L_0x00c0:
            r0 = 0
        L_0x00c1:
            boolean r2 = r0 instanceof lm.b.e
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x00d1
            if (r14 != 0) goto L_0x00ca
            r14 = r3
        L_0x00ca:
            pk.s$g$d r15 = new pk.s$g$d
            r15.<init>(r11, r12, r13, r14)
            r12 = r15
            goto L_0x0109
        L_0x00d1:
            boolean r12 = r0 instanceof lm.b.f
            if (r12 != 0) goto L_0x00f7
            boolean r12 = r0 instanceof lm.b.d
            if (r12 != 0) goto L_0x00f7
            boolean r12 = r0 instanceof lm.b.c
            if (r12 != 0) goto L_0x00f7
            boolean r12 = r0 instanceof lm.b.C2260b
            if (r12 == 0) goto L_0x00e2
            goto L_0x00f7
        L_0x00e2:
            lm.b$a r11 = lm.b.a.f99215a
            boolean r11 = kotlin.jvm.internal.C17542s.e(r0, r11)
            if (r11 != 0) goto L_0x00f3
            if (r0 != 0) goto L_0x00ed
            goto L_0x00f3
        L_0x00ed:
            XH.t r11 = new XH.t
            r11.<init>()
            throw r11
        L_0x00f3:
            pk.s$g$a r11 = pk.s.g.a.f101085a
            r12 = r11
            goto L_0x0109
        L_0x00f7:
            pk.s$g$b r12 = new pk.s$g$b
            lm.a r13 = r15.f101625c
            java.lang.String r14 = "null cannot be cast to non-null type com.ingka.ikea.backinstock.BackInStockException"
            kotlin.jvm.internal.C17542s.h(r1, r14)
            lm.b r1 = (lm.b) r1
            IC.e r11 = r13.a(r1, r11, r3)
            r12.<init>(r11)
        L_0x0109:
            return r12
        L_0x010a:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: qk.C11794g.c(lm.a$c, java.lang.String, java.lang.String, java.lang.String, dI.e):java.lang.Object");
    }

    private final s.g.c d(C12832d dVar, String str, String str2) {
        return new s.g.c(new C11550a.c.C2255a(dVar.e(), dVar.getName()), str, str2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: dI.e<? super pk.s$g>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00e7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.lang.String r12, java.lang.String r13, dI.C17164e<? super pk.s.g> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof qk.C11794g.a
            if (r0 == 0) goto L_0x0014
            r0 = r14
            qk.g$a r0 = (qk.C11794g.a) r0
            int r1 = r0.f101638n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.f101638n = r1
        L_0x0012:
            r6 = r0
            goto L_0x001a
        L_0x0014:
            qk.g$a r0 = new qk.g$a
            r0.<init>(r11, r14)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r0 = r6.f101636l
            java.lang.Object r7 = eI.C17187b.f()
            int r1 = r6.f101638n
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0094
            if (r1 == r4) goto L_0x007e
            if (r1 == r3) goto L_0x005e
            if (r1 != r2) goto L_0x0056
            java.lang.Object r12 = r6.f101635k
            gB.b r12 = (gB.C14500b) r12
            java.lang.Object r12 = r6.f101634j
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r12 = r6.f101633i
            gB.g r12 = (gB.C14505g) r12
            java.lang.Object r12 = r6.f101632h
            lm.a$c$a r12 = (lm.C11550a.c.C2255a) r12
            java.lang.Object r12 = r6.f101631g
            EB.d r12 = (EB.C12832d) r12
            java.lang.Object r12 = r6.f101630f
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r12 = r6.f101629e
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r12 = r6.f101628d
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r12 = r6.f101627c
            qk.g r12 = (qk.C11794g) r12
            XH.y.b(r0)
            goto L_0x0135
        L_0x0056:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x005e:
            java.lang.Object r12 = r6.f101632h
            lm.a$c$a r12 = (lm.C11550a.c.C2255a) r12
            java.lang.Object r13 = r6.f101631g
            EB.d r13 = (EB.C12832d) r13
            java.lang.Object r14 = r6.f101630f
            dI.e r14 = (dI.C17164e) r14
            java.lang.Object r1 = r6.f101629e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = r6.f101628d
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r6.f101627c
            qk.g r4 = (qk.C11794g) r4
            XH.y.b(r0)
            r5 = r12
            r12 = r1
            r1 = r4
            goto L_0x00ed
        L_0x007e:
            java.lang.Object r12 = r6.f101630f
            r14 = r12
            dI.e r14 = (dI.C17164e) r14
            java.lang.Object r12 = r6.f101629e
            r13 = r12
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r12 = r6.f101628d
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r1 = r6.f101627c
            qk.g r1 = (qk.C11794g) r1
            XH.y.b(r0)
            goto L_0x00b3
        L_0x0094:
            XH.y.b(r0)
            FB.a r0 = r11.f101624b
            TJ.g r0 = r0.b()
            TJ.g r0 = TJ.C16534i.A(r0)
            r6.f101627c = r11
            r6.f101628d = r12
            r6.f101629e = r13
            r6.f101630f = r14
            r6.f101638n = r4
            java.lang.Object r0 = TJ.C16534i.B(r0, r6)
            if (r0 != r7) goto L_0x00b2
            return r7
        L_0x00b2:
            r1 = r11
        L_0x00b3:
            EB.d r0 = (EB.C12832d) r0
            lm.a$c$a r5 = new lm.a$c$a
            java.lang.String r8 = r0.e()
            java.lang.String r9 = r0.getName()
            r5.<init>(r8, r9)
            lm.f r8 = r1.f101623a
            java.lang.String r9 = "list"
            r8.a(r12, r5, r9)
            jB.b r8 = r1.f101626d
            TJ.g r8 = r8.b(r13, r12)
            TJ.g r4 = TJ.C16534i.e0(r8, r4)
            r6.f101627c = r1
            r6.f101628d = r12
            r6.f101629e = r13
            r6.f101630f = r14
            r6.f101631g = r0
            r6.f101632h = r5
            r6.f101638n = r3
            java.lang.Object r3 = TJ.C16534i.B(r4, r6)
            if (r3 != r7) goto L_0x00e8
            return r7
        L_0x00e8:
            r10 = r3
            r3 = r12
            r12 = r13
            r13 = r0
            r0 = r10
        L_0x00ed:
            gB.g r0 = (gB.C14505g) r0
            java.lang.String r4 = r0.c()
            if (r4 != 0) goto L_0x00f8
            pk.s$g$a r12 = pk.s.g.a.f101085a
            goto L_0x0149
        L_0x00f8:
            lm.a r8 = r1.f101625c
            boolean r8 = r8.b()
            r9 = 0
            if (r8 == 0) goto L_0x0136
            lm.a r8 = r1.f101625c
            boolean r8 = r8.d()
            if (r8 == 0) goto L_0x010e
            pk.s$g$c r12 = r1.d(r13, r3, r4)
            goto L_0x0149
        L_0x010e:
            gB.b r8 = r0.f()
            if (r8 == 0) goto L_0x0118
            java.lang.String r9 = r8.f()
        L_0x0118:
            r6.f101627c = r1
            r6.f101628d = r3
            r6.f101629e = r12
            r6.f101630f = r14
            r6.f101631g = r13
            r6.f101632h = r5
            r6.f101633i = r0
            r6.f101634j = r4
            r6.f101635k = r8
            r6.f101638n = r2
            r2 = r5
            r5 = r9
            java.lang.Object r0 = r1.c(r2, r3, r4, r5, r6)
            if (r0 != r7) goto L_0x0135
            return r7
        L_0x0135:
            return r0
        L_0x0136:
            gB.b r12 = r0.f()
            if (r12 == 0) goto L_0x0140
            java.lang.String r9 = r12.f()
        L_0x0140:
            if (r9 != 0) goto L_0x0144
            java.lang.String r9 = ""
        L_0x0144:
            pk.s$g$d r12 = new pk.s$g$d
            r12.<init>(r5, r3, r4, r9)
        L_0x0149:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: qk.C11794g.b(java.lang.String, java.lang.String, dI.e):java.lang.Object");
    }
}
