package Iz;

import EB.C12832d;
import FB.C12860a;
import Il.d;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import sf.C10242c;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u000eH@¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010#¨\u0006$"}, d2 = {"LIz/d;", "LIz/c;", "Lsf/c;", "appUserDataRepository", "LFB/a;", "localStoreSelectionRepository", "LIl/d;", "marketConfigRepository", "LIz/e;", "deepLinkWrongMarketNavigation", "LIz/g;", "deepLinkWrongStoreNavigation", "<init>", "(Lsf/c;LFB/a;LIl/d;LIz/e;LIz/g;)V", "LIz/t;", "params", "", "d", "(LIz/t;)Z", "LEB/d;", "storeSelection", "e", "(LEB/d;LIz/t;)Z", "", "marketCode", "c", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LIz/c$a;", "a", "(LIz/t;LdI/e;)Ljava/lang/Object;", "Lsf/c;", "b", "LFB/a;", "LIl/d;", "LIz/e;", "LIz/g;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Iz.d  reason: case insensitive filesystem */
public final class C13038d implements C13037c {

    /* renamed from: a  reason: collision with root package name */
    private final C10242c f111025a;

    /* renamed from: b  reason: collision with root package name */
    private final C12860a f111026b;

    /* renamed from: c  reason: collision with root package name */
    private final d f111027c;

    /* renamed from: d  reason: collision with root package name */
    private final C13039e f111028d;

    /* renamed from: e  reason: collision with root package name */
    private final C13041g f111029e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.scanandgo.navigation.DeepLinkParameterValidatorImpl", f = "DeepLinkParameterValidator.kt", l = {85}, m = "getMarketName")
    /* renamed from: Iz.d$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f111030c;

        /* renamed from: d  reason: collision with root package name */
        Object f111031d;

        /* renamed from: e  reason: collision with root package name */
        Object f111032e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f111033f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C13038d f111034g;

        /* renamed from: h  reason: collision with root package name */
        int f111035h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C13038d dVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f111034g = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f111033f = obj;
            this.f111035h |= Integer.MIN_VALUE;
            return this.f111034g.c((String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.scanandgo.navigation.DeepLinkParameterValidatorImpl", f = "DeepLinkParameterValidator.kt", l = {44}, m = "validate")
    /* renamed from: Iz.d$b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f111036c;

        /* renamed from: d  reason: collision with root package name */
        Object f111037d;

        /* renamed from: e  reason: collision with root package name */
        Object f111038e;

        /* renamed from: f  reason: collision with root package name */
        Object f111039f;

        /* renamed from: g  reason: collision with root package name */
        Object f111040g;

        /* renamed from: h  reason: collision with root package name */
        Object f111041h;

        /* renamed from: i  reason: collision with root package name */
        Object f111042i;

        /* renamed from: j  reason: collision with root package name */
        Object f111043j;

        /* renamed from: k  reason: collision with root package name */
        int f111044k;

        /* renamed from: l  reason: collision with root package name */
        int f111045l;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f111046m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ C13038d f111047n;

        /* renamed from: o  reason: collision with root package name */
        int f111048o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C13038d dVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f111047n = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f111046m = obj;
            this.f111048o |= Integer.MIN_VALUE;
            return this.f111047n.a((C13053t) null, this);
        }
    }

    public C13038d(C10242c cVar, C12860a aVar, d dVar, C13039e eVar, C13041g gVar) {
        C17542s.j(cVar, "appUserDataRepository");
        C17542s.j(aVar, "localStoreSelectionRepository");
        C17542s.j(dVar, "marketConfigRepository");
        C17542s.j(eVar, "deepLinkWrongMarketNavigation");
        C17542s.j(gVar, "deepLinkWrongStoreNavigation");
        this.f111025a = cVar;
        this.f111026b = aVar;
        this.f111027c = dVar;
        this.f111028d = eVar;
        this.f111029e = gVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0070 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(java.lang.String r6, dI.C17164e<? super java.lang.String> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Iz.C13038d.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            Iz.d$a r0 = (Iz.C13038d.a) r0
            int r1 = r0.f111035h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f111035h = r1
            goto L_0x0018
        L_0x0013:
            Iz.d$a r0 = new Iz.d$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f111033f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f111035h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r6 = r0.f111032e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f111031d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r0.f111030c
            Iz.d r7 = (Iz.C13038d) r7
            XH.y.b(r1)
            goto L_0x0051
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            XH.y.b(r1)
            Il.d r1 = r5.f111027c
            r0.f111030c = r5
            r0.f111031d = r6
            r0.f111032e = r7
            r0.f111035h = r4
            java.lang.Object r1 = r1.b(r0)
            if (r1 != r2) goto L_0x0051
            return r2
        L_0x0051:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r7 = r1.iterator()
        L_0x0057:
            boolean r0 = r7.hasNext()
            r1 = 0
            if (r0 == 0) goto L_0x0070
            java.lang.Object r0 = r7.next()
            r2 = r0
            Rl.d r2 = (Rl.d) r2
            java.lang.String r2 = r2.a()
            boolean r2 = kotlin.jvm.internal.C17542s.e(r2, r6)
            if (r2 == 0) goto L_0x0057
            goto L_0x0071
        L_0x0070:
            r0 = r1
        L_0x0071:
            Rl.d r0 = (Rl.d) r0
            if (r0 == 0) goto L_0x0079
            java.lang.String r1 = r0.c()
        L_0x0079:
            if (r1 == 0) goto L_0x007c
            return r1
        L_0x007c:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Required value was null."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Iz.C13038d.c(java.lang.String, dI.e):java.lang.Object");
    }

    private final boolean d(C13053t tVar) {
        String c10 = this.f111025a.c();
        if (c10 == null) {
            return false;
        }
        return !C17542s.e(c10, tVar.c());
    }

    private final boolean e(C12832d dVar, C13053t tVar) {
        String e10;
        if (dVar == null || (e10 = dVar.e()) == null) {
            return false;
        }
        return !C17542s.e(e10, tVar.d());
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(Iz.C13053t r8, dI.C17164e<? super Iz.C13037c.a> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof Iz.C13038d.b
            if (r0 == 0) goto L_0x0013
            r0 = r9
            Iz.d$b r0 = (Iz.C13038d.b) r0
            int r1 = r0.f111048o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f111048o = r1
            goto L_0x0018
        L_0x0013:
            Iz.d$b r0 = new Iz.d$b
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r1 = r0.f111046m
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f111048o
            r4 = 1
            if (r3 == 0) goto L_0x0057
            if (r3 != r4) goto L_0x004f
            java.lang.Object r8 = r0.f111043j
            Iz.e r8 = (Iz.C13039e) r8
            java.lang.Object r9 = r0.f111042i
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r2 = r0.f111041h
            EB.d r2 = (EB.C12832d) r2
            java.lang.Object r2 = r0.f111040g
            Iz.d r2 = (Iz.C13038d) r2
            java.lang.Object r2 = r0.f111039f
            Iz.d r2 = (Iz.C13038d) r2
            java.lang.Object r2 = r0.f111038e
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r2 = r0.f111037d
            Iz.t r2 = (Iz.C13053t) r2
            java.lang.Object r0 = r0.f111036c
            Iz.d r0 = (Iz.C13038d) r0
            XH.y.b(r1)     // Catch:{ CancellationException -> 0x004c, all -> 0x0049 }
            goto L_0x0092
        L_0x0049:
            r8 = move-exception
            goto L_0x00c5
        L_0x004c:
            r8 = move-exception
            goto L_0x00db
        L_0x004f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0057:
            XH.y.b(r1)
            XH.x$a r1 = XH.x.f139812b     // Catch:{ CancellationException -> 0x004c, all -> 0x0049 }
            FB.a r1 = r7.f111026b     // Catch:{ CancellationException -> 0x004c, all -> 0x0049 }
            EB.d r1 = r1.c()     // Catch:{ CancellationException -> 0x004c, all -> 0x0049 }
            boolean r3 = r7.d(r8)     // Catch:{ CancellationException -> 0x004c, all -> 0x0049 }
            if (r3 == 0) goto L_0x009e
            Iz.e r3 = r7.f111028d     // Catch:{ CancellationException -> 0x004c, all -> 0x0049 }
            java.lang.String r5 = r8.e()     // Catch:{ CancellationException -> 0x004c, all -> 0x0049 }
            java.lang.String r6 = r8.c()     // Catch:{ CancellationException -> 0x004c, all -> 0x0049 }
            r0.f111036c = r7     // Catch:{ CancellationException -> 0x004c, all -> 0x0049 }
            r0.f111037d = r8     // Catch:{ CancellationException -> 0x004c, all -> 0x0049 }
            r0.f111038e = r9     // Catch:{ CancellationException -> 0x004c, all -> 0x0049 }
            r0.f111039f = r7     // Catch:{ CancellationException -> 0x004c, all -> 0x0049 }
            r0.f111040g = r7     // Catch:{ CancellationException -> 0x004c, all -> 0x0049 }
            r0.f111041h = r1     // Catch:{ CancellationException -> 0x004c, all -> 0x0049 }
            r0.f111042i = r5     // Catch:{ CancellationException -> 0x004c, all -> 0x0049 }
            r0.f111043j = r3     // Catch:{ CancellationException -> 0x004c, all -> 0x0049 }
            r8 = 0
            r0.f111044k = r8     // Catch:{ CancellationException -> 0x004c, all -> 0x0049 }
            r0.f111045l = r8     // Catch:{ CancellationException -> 0x004c, all -> 0x0049 }
            r0.f111048o = r4     // Catch:{ CancellationException -> 0x004c, all -> 0x0049 }
            java.lang.Object r1 = r7.c(r6, r0)     // Catch:{ CancellationException -> 0x004c, all -> 0x0049 }
            if (r1 != r2) goto L_0x0090
            return r2
        L_0x0090:
            r8 = r3
            r9 = r5
        L_0x0092:
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ CancellationException -> 0x004c, all -> 0x0049 }
            android.net.Uri r8 = r8.a(r9, r1)     // Catch:{ CancellationException -> 0x004c, all -> 0x0049 }
            Iz.c$a$b r9 = new Iz.c$a$b     // Catch:{ CancellationException -> 0x004c, all -> 0x0049 }
            r9.<init>(r8)     // Catch:{ CancellationException -> 0x004c, all -> 0x0049 }
            goto L_0x00c0
        L_0x009e:
            boolean r9 = r7.e(r1, r8)     // Catch:{ CancellationException -> 0x004c, all -> 0x0049 }
            if (r9 == 0) goto L_0x00be
            Iz.c$a$b r9 = new Iz.c$a$b     // Catch:{ CancellationException -> 0x004c, all -> 0x0049 }
            Iz.g r0 = r7.f111029e     // Catch:{ CancellationException -> 0x004c, all -> 0x0049 }
            java.lang.String r8 = r8.e()     // Catch:{ CancellationException -> 0x004c, all -> 0x0049 }
            if (r1 == 0) goto L_0x00b4
            java.lang.String r1 = r1.getName()     // Catch:{ CancellationException -> 0x004c, all -> 0x0049 }
            if (r1 != 0) goto L_0x00b6
        L_0x00b4:
            java.lang.String r1 = ""
        L_0x00b6:
            android.net.Uri r8 = r0.a(r8, r1)     // Catch:{ CancellationException -> 0x004c, all -> 0x0049 }
            r9.<init>(r8)     // Catch:{ CancellationException -> 0x004c, all -> 0x0049 }
            goto L_0x00c0
        L_0x00be:
            Iz.c$a$c r9 = Iz.C13037c.a.C2685c.f111022a     // Catch:{ CancellationException -> 0x004c, all -> 0x0049 }
        L_0x00c0:
            java.lang.Object r8 = XH.x.b(r9)     // Catch:{ CancellationException -> 0x004c, all -> 0x0049 }
            goto L_0x00cf
        L_0x00c5:
            XH.x$a r9 = XH.x.f139812b
            java.lang.Object r8 = XH.y.a(r8)
            java.lang.Object r8 = XH.x.b(r8)
        L_0x00cf:
            java.lang.Throwable r9 = XH.x.e(r8)
            if (r9 != 0) goto L_0x00d8
            Iz.c$a r8 = (Iz.C13037c.a) r8
            return r8
        L_0x00d8:
            Iz.c$a$a r8 = Iz.C13037c.a.C2684a.f111020a
            return r8
        L_0x00db:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Iz.C13038d.a(Iz.t, dI.e):java.lang.Object");
    }
}
