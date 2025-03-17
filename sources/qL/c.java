package Ql;

import Sl.d;
import XH.x;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bHB¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LQl/c;", "LSl/d;", "LSl/a;", "getDeviceLocaleUseCase", "LIl/c;", "marketConfigRemoteDataSource", "<init>", "(LSl/a;LIl/c;)V", "LXH/x;", "LSl/d$a;", "invoke-IoAF18A", "(LdI/e;)Ljava/lang/Object;", "invoke", "a", "LSl/a;", "b", "LIl/c;", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    private final Sl.a f85972a;

    /* renamed from: b  reason: collision with root package name */
    private final Il.c f85973b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.appconfig.impl.usecase.GetMarketsConfigUseCaseImpl", f = "GetMarketsConfigUseCaseImpl.kt", l = {22}, m = "invoke-IoAF18A")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f85974c;

        /* renamed from: d  reason: collision with root package name */
        Object f85975d;

        /* renamed from: e  reason: collision with root package name */
        Object f85976e;

        /* renamed from: f  reason: collision with root package name */
        Object f85977f;

        /* renamed from: g  reason: collision with root package name */
        Object f85978g;

        /* renamed from: h  reason: collision with root package name */
        int f85979h;

        /* renamed from: i  reason: collision with root package name */
        int f85980i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f85981j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ c f85982k;

        /* renamed from: l  reason: collision with root package name */
        int f85983l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f85982k = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f85981j = obj;
            this.f85983l |= Integer.MIN_VALUE;
            Object r22 = this.f85982k.m7invokeIoAF18A(this);
            return r22 == C17187b.f() ? r22 : x.a(r22);
        }
    }

    public c(Sl.a aVar, Il.c cVar) {
        C17542s.j(aVar, "getDeviceLocaleUseCase");
        C17542s.j(cVar, "marketConfigRemoteDataSource");
        this.f85972a = aVar;
        this.f85973b = cVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: Rl.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: Rl.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: Rl.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: Rl.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: Rl.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: Rl.d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b A[Catch:{ CancellationException -> 0x0040, all -> 0x003d }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010a A[Catch:{ CancellationException -> 0x0040, all -> 0x003d }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m7invokeIoAF18A(dI.C17164e<? super XH.x<Sl.d.a>> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof Ql.c.a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            Ql.c$a r0 = (Ql.c.a) r0
            int r1 = r0.f85983l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f85983l = r1
            goto L_0x0018
        L_0x0013:
            Ql.c$a r0 = new Ql.c$a
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r1 = r0.f85981j
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f85983l
            r4 = 1
            if (r3 == 0) goto L_0x004b
            if (r3 != r4) goto L_0x0043
            java.lang.Object r10 = r0.f85978g
            java.util.Locale r10 = (java.util.Locale) r10
            java.lang.Object r2 = r0.f85977f
            Ql.c r2 = (Ql.c) r2
            java.lang.Object r2 = r0.f85976e
            Ql.c r2 = (Ql.c) r2
            java.lang.Object r2 = r0.f85975d
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r0 = r0.f85974c
            Ql.c r0 = (Ql.c) r0
            XH.y.b(r1)     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            goto L_0x0073
        L_0x003d:
            r10 = move-exception
            goto L_0x0112
        L_0x0040:
            r10 = move-exception
            goto L_0x011d
        L_0x0043:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x004b:
            XH.y.b(r1)
            XH.x$a r1 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            Sl.a r1 = r9.f85972a     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            java.util.Locale r1 = r1.invoke()     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            Il.c r3 = r9.f85973b     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            r0.f85974c = r9     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            r0.f85975d = r10     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            r0.f85976e = r9     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            r0.f85977f = r9     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            r0.f85978g = r1     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            r10 = 0
            r0.f85979h = r10     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            r0.f85980i = r10     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            r0.f85983l = r4     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            java.lang.Object r10 = r3.b(r0)     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            if (r10 != r2) goto L_0x0070
            return r2
        L_0x0070:
            r8 = r1
            r1 = r10
            r10 = r8
        L_0x0073:
            java.util.List r1 = (java.util.List) r1     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            boolean r0 = r1.isEmpty()     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            if (r0 != 0) goto L_0x010a
            r0 = r1
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
        L_0x0082:
            boolean r2 = r0.hasNext()     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            r3 = 0
            if (r2 == 0) goto L_0x00b4
            java.lang.Object r2 = r0.next()     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            r4 = r2
            Rl.d r4 = (Rl.d) r4     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            java.lang.String r4 = r4.a()     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            java.lang.String r5 = r10.getCountry()     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            java.lang.String r6 = "getCountry(...)"
            kotlin.jvm.internal.C17542s.i(r5, r6)     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            java.util.Locale r6 = java.util.Locale.US     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            java.lang.String r7 = "US"
            kotlin.jvm.internal.C17542s.i(r6, r7)     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            java.lang.String r5 = r5.toLowerCase(r6)     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            java.lang.String r6 = "toLowerCase(...)"
            kotlin.jvm.internal.C17542s.i(r5, r6)     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r5)     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            if (r4 == 0) goto L_0x0082
            goto L_0x00b5
        L_0x00b4:
            r2 = r3
        L_0x00b5:
            Rl.d r2 = (Rl.d) r2     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            if (r2 != 0) goto L_0x00c0
            java.lang.Object r0 = YH.C16877v.w0(r1)     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            r2 = r0
            Rl.d r2 = (Rl.d) r2     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
        L_0x00c0:
            java.util.List r0 = r2.b()     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
        L_0x00ca:
            boolean r4 = r0.hasNext()     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            if (r4 == 0) goto L_0x00ef
            java.lang.Object r4 = r0.next()     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            r5 = r4
            Rl.f r5 = (Rl.f) r5     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            java.lang.String r6 = r10.getLanguage()     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            java.util.Locale r7 = new java.util.Locale     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            java.lang.String r5 = r5.a()     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            r7.<init>(r5)     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            java.lang.String r5 = r7.getLanguage()     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            boolean r5 = r6.equals(r5)     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            if (r5 == 0) goto L_0x00ca
            r3 = r4
        L_0x00ef:
            Rl.f r3 = (Rl.f) r3     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            if (r3 != 0) goto L_0x00fe
            java.util.List r10 = r2.b()     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            java.lang.Object r10 = YH.C16877v.w0(r10)     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            r3 = r10
            Rl.f r3 = (Rl.f) r3     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
        L_0x00fe:
            XH.x$a r10 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            Sl.d$a r10 = new Sl.d$a     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            r10.<init>(r2, r3, r1)     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            java.lang.Object r10 = XH.x.b(r10)     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            return r10
        L_0x010a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            java.lang.String r0 = "The list of available markets was empty"
            r10.<init>(r0)     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
            throw r10     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
        L_0x0112:
            XH.x$a r0 = XH.x.f139812b
            java.lang.Object r10 = XH.y.a(r10)
            java.lang.Object r10 = XH.x.b(r10)
            return r10
        L_0x011d:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: Ql.c.m7invokeIoAF18A(dI.e):java.lang.Object");
    }
}
