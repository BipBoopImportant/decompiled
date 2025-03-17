package nu;

import FB.C12860a;
import FB.C12863d;
import Oz.b;
import XH.x;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import sf.C10242c;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fHB¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lnu/o;", "Lnu/n;", "LFB/a;", "localStoreSelectionRepository", "LFB/d;", "storeRepository", "Lsf/c;", "appUserDataRepository", "LOz/b;", "scanAndGoCleanUpUseCase", "<init>", "(LFB/a;LFB/d;Lsf/c;LOz/b;)V", "", "storeId", "LXH/x;", "LXH/N;", "invoke-gIAlu-s", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "invoke", "a", "LFB/a;", "b", "LFB/d;", "c", "Lsf/c;", "d", "LOz/b;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o implements n {

    /* renamed from: a  reason: collision with root package name */
    private final C12860a f100385a;

    /* renamed from: b  reason: collision with root package name */
    private final C12863d f100386b;

    /* renamed from: c  reason: collision with root package name */
    private final C10242c f100387c;

    /* renamed from: d  reason: collision with root package name */
    private final b f100388d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.instore.impl.usecase.UpdateStoreUseCaseImpl", f = "UpdateStoreUseCase.kt", l = {41, 52}, m = "invoke-gIAlu-s")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f100389c;

        /* renamed from: d  reason: collision with root package name */
        Object f100390d;

        /* renamed from: e  reason: collision with root package name */
        Object f100391e;

        /* renamed from: f  reason: collision with root package name */
        Object f100392f;

        /* renamed from: g  reason: collision with root package name */
        Object f100393g;

        /* renamed from: h  reason: collision with root package name */
        Object f100394h;

        /* renamed from: i  reason: collision with root package name */
        Object f100395i;

        /* renamed from: j  reason: collision with root package name */
        Object f100396j;

        /* renamed from: k  reason: collision with root package name */
        Object f100397k;

        /* renamed from: l  reason: collision with root package name */
        int f100398l;

        /* renamed from: m  reason: collision with root package name */
        int f100399m;

        /* renamed from: n  reason: collision with root package name */
        /* synthetic */ Object f100400n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ o f100401o;

        /* renamed from: p  reason: collision with root package name */
        int f100402p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(o oVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f100401o = oVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f100400n = obj;
            this.f100402p |= Integer.MIN_VALUE;
            Object r22 = this.f100401o.m13invokegIAlus((String) null, this);
            return r22 == C17187b.f() ? r22 : x.a(r22);
        }
    }

    public o(C12860a aVar, C12863d dVar, C10242c cVar, b bVar) {
        C17542s.j(aVar, "localStoreSelectionRepository");
        C17542s.j(dVar, "storeRepository");
        C17542s.j(cVar, "appUserDataRepository");
        C17542s.j(bVar, "scanAndGoCleanUpUseCase");
        this.f100385a = aVar;
        this.f100386b = dVar;
        this.f100387c = cVar;
        this.f100388d = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0074, code lost:
        r14 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0075, code lost:
        r1 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0079, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f9, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00fa, code lost:
        r8 = r13;
        r6 = r14;
        r14 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0155, code lost:
        throw r14;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:14:0x006b, B:29:0x009c] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0079 A[ExcHandler: CancellationException (r14v17 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:14:0x006b] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c1 A[Catch:{ CancellationException -> 0x0079, all -> 0x00f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f4 A[Catch:{ CancellationException -> 0x0079, all -> 0x00f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: invoke-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m13invokegIAlus(java.lang.String r14, dI.C17164e<? super XH.x<XH.C16807N>> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof nu.o.a
            if (r0 == 0) goto L_0x0013
            r0 = r15
            nu.o$a r0 = (nu.o.a) r0
            int r1 = r0.f100402p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f100402p = r1
            goto L_0x0018
        L_0x0013:
            nu.o$a r0 = new nu.o$a
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r1 = r0.f100400n
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f100402p
            r4 = 0
            r5 = 2
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L_0x007c
            if (r3 == r6) goto L_0x0053
            if (r3 != r5) goto L_0x004b
            java.lang.Object r14 = r0.f100396j
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r14 = r0.f100395i
            EB.d r14 = (EB.C12832d) r14
            java.lang.Object r14 = r0.f100394h
            EB.c r14 = (EB.C12831c) r14
            java.lang.Object r14 = r0.f100392f
            EB.d r14 = (EB.C12832d) r14
            java.lang.Object r14 = r0.f100391e
            dI.e r14 = (dI.C17164e) r14
            java.lang.Object r14 = r0.f100390d
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r14 = r0.f100389c
            nu.o r14 = (nu.o) r14
            XH.y.b(r1)
            goto L_0x0149
        L_0x004b:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x0053:
            java.lang.Object r14 = r0.f100394h
            nu.o r14 = (nu.o) r14
            java.lang.Object r15 = r0.f100393g
            nu.o r15 = (nu.o) r15
            java.lang.Object r15 = r0.f100392f
            EB.d r15 = (EB.C12832d) r15
            java.lang.Object r3 = r0.f100391e
            dI.e r3 = (dI.C17164e) r3
            java.lang.Object r6 = r0.f100390d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r8 = r0.f100389c
            nu.o r8 = (nu.o) r8
            XH.y.b(r1)     // Catch:{ CancellationException -> 0x0079, all -> 0x0074 }
            r12 = r15
            r15 = r14
            r14 = r6
            r6 = r1
            r1 = r12
            goto L_0x00bd
        L_0x0074:
            r14 = move-exception
            r1 = r15
        L_0x0076:
            r15 = r3
            goto L_0x00fd
        L_0x0079:
            r14 = move-exception
            goto L_0x0155
        L_0x007c:
            XH.y.b(r1)
            FB.a r1 = r13.f100385a
            EB.d r1 = r1.c()
            if (r1 == 0) goto L_0x008c
            java.lang.String r3 = r1.e()
            goto L_0x008d
        L_0x008c:
            r3 = r4
        L_0x008d:
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r14)
            if (r3 == 0) goto L_0x009c
            XH.x$a r14 = XH.x.f139812b
            XH.N r14 = XH.C16807N.f139792a
            java.lang.Object r14 = XH.x.b(r14)
            return r14
        L_0x009c:
            XH.x$a r3 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0079, all -> 0x00f9 }
            FB.d r3 = r13.f100386b     // Catch:{ CancellationException -> 0x0079, all -> 0x00f9 }
            r0.f100389c = r13     // Catch:{ CancellationException -> 0x0079, all -> 0x00f9 }
            r0.f100390d = r14     // Catch:{ CancellationException -> 0x0079, all -> 0x00f9 }
            r0.f100391e = r15     // Catch:{ CancellationException -> 0x0079, all -> 0x00f9 }
            r0.f100392f = r1     // Catch:{ CancellationException -> 0x0079, all -> 0x00f9 }
            r0.f100393g = r13     // Catch:{ CancellationException -> 0x0079, all -> 0x00f9 }
            r0.f100394h = r13     // Catch:{ CancellationException -> 0x0079, all -> 0x00f9 }
            r0.f100398l = r7     // Catch:{ CancellationException -> 0x0079, all -> 0x00f9 }
            r0.f100399m = r7     // Catch:{ CancellationException -> 0x0079, all -> 0x00f9 }
            r0.f100402p = r6     // Catch:{ CancellationException -> 0x0079, all -> 0x00f9 }
            java.lang.Object r3 = r3.b(r14, r0)     // Catch:{ CancellationException -> 0x0079, all -> 0x00f9 }
            if (r3 != r2) goto L_0x00b9
            return r2
        L_0x00b9:
            r8 = r13
            r6 = r3
            r3 = r15
            r15 = r8
        L_0x00bd:
            EB.c r6 = (EB.C12831c) r6     // Catch:{ CancellationException -> 0x0079, all -> 0x00f0 }
            if (r6 != 0) goto L_0x00f4
            XH.x$a r6 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0079, all -> 0x00f0 }
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ CancellationException -> 0x0079, all -> 0x00f0 }
            sf.c r15 = r15.f100387c     // Catch:{ CancellationException -> 0x0079, all -> 0x00f0 }
            java.lang.String r15 = r15.c()     // Catch:{ CancellationException -> 0x0079, all -> 0x00f0 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ CancellationException -> 0x0079, all -> 0x00f0 }
            r9.<init>()     // Catch:{ CancellationException -> 0x0079, all -> 0x00f0 }
            java.lang.String r10 = "Failed to get store with id: "
            r9.append(r10)     // Catch:{ CancellationException -> 0x0079, all -> 0x00f0 }
            r9.append(r14)     // Catch:{ CancellationException -> 0x0079, all -> 0x00f0 }
            java.lang.String r10 = " for market "
            r9.append(r10)     // Catch:{ CancellationException -> 0x0079, all -> 0x00f0 }
            r9.append(r15)     // Catch:{ CancellationException -> 0x0079, all -> 0x00f0 }
            java.lang.String r15 = r9.toString()     // Catch:{ CancellationException -> 0x0079, all -> 0x00f0 }
            r6.<init>(r15)     // Catch:{ CancellationException -> 0x0079, all -> 0x00f0 }
            java.lang.Object r15 = XH.y.a(r6)     // Catch:{ CancellationException -> 0x0079, all -> 0x00f0 }
            java.lang.Object r14 = XH.x.b(r15)     // Catch:{ CancellationException -> 0x0079, all -> 0x00f0 }
            return r14
        L_0x00f0:
            r15 = move-exception
            r6 = r14
            r14 = r15
            goto L_0x0076
        L_0x00f4:
            java.lang.Object r15 = XH.x.b(r6)     // Catch:{ CancellationException -> 0x0079, all -> 0x00f0 }
            goto L_0x010a
        L_0x00f9:
            r3 = move-exception
            r8 = r13
            r6 = r14
            r14 = r3
        L_0x00fd:
            XH.x$a r3 = XH.x.f139812b
            java.lang.Object r14 = XH.y.a(r14)
            java.lang.Object r14 = XH.x.b(r14)
            r3 = r15
            r15 = r14
            r14 = r6
        L_0x010a:
            boolean r6 = XH.x.h(r15)
            if (r6 == 0) goto L_0x0150
            r6 = r15
            EB.c r6 = (EB.C12831c) r6
            FB.a r9 = r8.f100385a
            EB.d r9 = FB.C12861b.a(r9)
            if (r9 == 0) goto L_0x011f
            java.lang.String r4 = r9.e()
        L_0x011f:
            FB.a r10 = r8.f100385a
            EB.d$a r11 = EB.C12832d.f109333f
            EB.d r11 = r11.a(r6)
            r10.a(r11)
            Oz.b r10 = r8.f100388d
            r0.f100389c = r8
            r0.f100390d = r14
            r0.f100391e = r3
            r0.f100392f = r1
            r0.f100393g = r15
            r0.f100394h = r6
            r0.f100395i = r9
            r0.f100396j = r4
            r0.f100397k = r15
            r0.f100398l = r7
            r0.f100402p = r5
            java.lang.Object r14 = r10.a(r4, r0)
            if (r14 != r2) goto L_0x0149
            return r2
        L_0x0149:
            XH.N r14 = XH.C16807N.f139792a
            java.lang.Object r14 = XH.x.b(r14)
            goto L_0x0154
        L_0x0150:
            java.lang.Object r14 = XH.x.b(r15)
        L_0x0154:
            return r14
        L_0x0155:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: nu.o.m13invokegIAlus(java.lang.String, dI.e):java.lang.Object");
    }
}
