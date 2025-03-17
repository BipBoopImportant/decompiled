package Sl;

import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LSl/b;", "LSl/g;", "linkType", "LSl/h;", "a", "(LSl/b;LSl/g;LdI/e;)Ljava/lang/Object;", "appconfig_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.appconfig.usecase.GetMarketLinksUseCaseKt", f = "GetMarketLinksUseCase.kt", l = {58}, m = "getMarketLink")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f87216c;

        /* renamed from: d  reason: collision with root package name */
        Object f87217d;

        /* renamed from: e  reason: collision with root package name */
        Object f87218e;

        /* renamed from: f  reason: collision with root package name */
        Object f87219f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f87220g;

        /* renamed from: h  reason: collision with root package name */
        int f87221h;

        a(C17164e<? super a> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f87220g = obj;
            this.f87221h |= Integer.MIN_VALUE;
            return c.a((b) null, (g) null, this);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: Sl.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: Sl.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: Sl.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: Sl.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: Sl.g} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(Sl.b r5, Sl.g r6, dI.C17164e<? super Sl.h> r7) {
        /*
            boolean r0 = r7 instanceof Sl.c.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            Sl.c$a r0 = (Sl.c.a) r0
            int r1 = r0.f87221h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f87221h = r1
            goto L_0x0018
        L_0x0013:
            Sl.c$a r0 = new Sl.c$a
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r1 = r0.f87220g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f87221h
            r4 = 1
            if (r3 == 0) goto L_0x0042
            if (r3 != r4) goto L_0x003a
            java.lang.Object r5 = r0.f87219f
            Sl.g[] r5 = (Sl.g[]) r5
            java.lang.Object r5 = r0.f87218e
            dI.e r5 = (dI.C17164e) r5
            java.lang.Object r5 = r0.f87217d
            r6 = r5
            Sl.g r6 = (Sl.g) r6
            java.lang.Object r5 = r0.f87216c
            Sl.b r5 = (Sl.b) r5
            XH.y.b(r1)
            goto L_0x005e
        L_0x003a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0042:
            XH.y.b(r1)
            Sl.g[] r1 = new Sl.g[]{r6}
            TJ.g r3 = r5.a(r1)
            r0.f87216c = r5
            r0.f87217d = r6
            r0.f87218e = r7
            r0.f87219f = r1
            r0.f87221h = r4
            java.lang.Object r1 = TJ.C16534i.D(r3, r0)
            if (r1 != r2) goto L_0x005e
            return r2
        L_0x005e:
            java.util.List r1 = (java.util.List) r1
            r5 = 0
            if (r1 == 0) goto L_0x007f
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r7 = r1.iterator()
        L_0x0069:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x007d
            java.lang.Object r0 = r7.next()
            r1 = r0
            Sl.h r1 = (Sl.h) r1
            Sl.g r1 = r1.b()
            if (r1 != r6) goto L_0x0069
            r5 = r0
        L_0x007d:
            Sl.h r5 = (Sl.h) r5
        L_0x007f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Sl.c.a(Sl.b, Sl.g, dI.e):java.lang.Object");
    }
}
