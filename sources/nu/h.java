package nu;

import FB.C12863d;
import Ry.f;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lnu/h;", "Lnu/g;", "LFB/d;", "storeRepository", "LRy/f;", "scanAndGoCartRepositoryFactory", "<init>", "(LFB/d;LRy/f;)V", "", "storeId", "Lnu/g$a;", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LFB/d;", "b", "LRy/f;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements g {

    /* renamed from: a  reason: collision with root package name */
    private final C12863d f100323a;

    /* renamed from: b  reason: collision with root package name */
    private final f f100324b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.usecase.GetStoreAndScanAndGoCartUseCaseImpl", f = "GetStoreAndScanAndGoCartUseCase.kt", l = {29, 32}, m = "invoke")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f100325c;

        /* renamed from: d  reason: collision with root package name */
        Object f100326d;

        /* renamed from: e  reason: collision with root package name */
        Object f100327e;

        /* renamed from: f  reason: collision with root package name */
        Object f100328f;

        /* renamed from: g  reason: collision with root package name */
        Object f100329g;

        /* renamed from: h  reason: collision with root package name */
        Object f100330h;

        /* renamed from: i  reason: collision with root package name */
        int f100331i;

        /* renamed from: j  reason: collision with root package name */
        int f100332j;

        /* renamed from: k  reason: collision with root package name */
        /* synthetic */ Object f100333k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ h f100334l;

        /* renamed from: m  reason: collision with root package name */
        int f100335m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(h hVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f100334l = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f100333k = obj;
            this.f100335m |= Integer.MIN_VALUE;
            return this.f100334l.a((String) null, this);
        }
    }

    public h(C12863d dVar, f fVar) {
        C17542s.j(dVar, "storeRepository");
        C17542s.j(fVar, "scanAndGoCartRepositoryFactory");
        this.f100323a = dVar;
        this.f100324b = fVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v10, resolved type: dI.e<? super nu.g$a>} */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0061, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0094, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0095, code lost:
        r3 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0192, code lost:
        throw r14;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:14:0x005b, B:19:0x0067] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0061 A[ExcHandler: CancellationException (r14v8 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:14:0x005b] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0085 A[SYNTHETIC, Splitter:B:25:0x0085] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008c A[Catch:{ CancellationException -> 0x0061, all -> 0x005f }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r14, dI.C17164e<? super nu.g.a> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof nu.h.a
            if (r0 == 0) goto L_0x0013
            r0 = r15
            nu.h$a r0 = (nu.h.a) r0
            int r1 = r0.f100335m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f100335m = r1
            goto L_0x0018
        L_0x0013:
            nu.h$a r0 = new nu.h$a
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r1 = r0.f100333k
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f100335m
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x0064
            if (r3 == r5) goto L_0x0046
            if (r3 != r4) goto L_0x003e
            java.lang.Object r14 = r0.f100329g
            EB.c r14 = (EB.C12831c) r14
            java.lang.Object r15 = r0.f100327e
            dI.e r15 = (dI.C17164e) r15
            java.lang.Object r15 = r0.f100326d
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r15 = r0.f100325c
            nu.h r15 = (nu.h) r15
            XH.y.b(r1)
            goto L_0x00cb
        L_0x003e:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x0046:
            java.lang.Object r14 = r0.f100329g
            nu.h r14 = (nu.h) r14
            java.lang.Object r14 = r0.f100328f
            nu.h r14 = (nu.h) r14
            java.lang.Object r14 = r0.f100327e
            r15 = r14
            dI.e r15 = (dI.C17164e) r15
            java.lang.Object r14 = r0.f100326d
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r3 = r0.f100325c
            nu.h r3 = (nu.h) r3
            XH.y.b(r1)     // Catch:{ CancellationException -> 0x0061, all -> 0x005f }
            goto L_0x0083
        L_0x005f:
            r1 = move-exception
            goto L_0x0096
        L_0x0061:
            r14 = move-exception
            goto L_0x0192
        L_0x0064:
            XH.y.b(r1)
            XH.x$a r1 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0061, all -> 0x0094 }
            FB.d r1 = r13.f100323a     // Catch:{ CancellationException -> 0x0061, all -> 0x0094 }
            r0.f100325c = r13     // Catch:{ CancellationException -> 0x0061, all -> 0x0094 }
            r0.f100326d = r14     // Catch:{ CancellationException -> 0x0061, all -> 0x0094 }
            r0.f100327e = r15     // Catch:{ CancellationException -> 0x0061, all -> 0x0094 }
            r0.f100328f = r13     // Catch:{ CancellationException -> 0x0061, all -> 0x0094 }
            r0.f100329g = r13     // Catch:{ CancellationException -> 0x0061, all -> 0x0094 }
            r0.f100331i = r6     // Catch:{ CancellationException -> 0x0061, all -> 0x0094 }
            r0.f100332j = r6     // Catch:{ CancellationException -> 0x0061, all -> 0x0094 }
            r0.f100335m = r5     // Catch:{ CancellationException -> 0x0061, all -> 0x0094 }
            java.lang.Object r1 = r1.b(r14, r0)     // Catch:{ CancellationException -> 0x0061, all -> 0x0094 }
            if (r1 != r2) goto L_0x0082
            return r2
        L_0x0082:
            r3 = r13
        L_0x0083:
            if (r1 == 0) goto L_0x008c
            EB.c r1 = (EB.C12831c) r1     // Catch:{ CancellationException -> 0x0061, all -> 0x005f }
            java.lang.Object r1 = XH.x.b(r1)     // Catch:{ CancellationException -> 0x0061, all -> 0x005f }
            goto L_0x00a0
        L_0x008c:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch:{ CancellationException -> 0x0061, all -> 0x005f }
            r7.<init>(r1)     // Catch:{ CancellationException -> 0x0061, all -> 0x005f }
            throw r7     // Catch:{ CancellationException -> 0x0061, all -> 0x005f }
        L_0x0094:
            r1 = move-exception
            r3 = r13
        L_0x0096:
            XH.x$a r7 = XH.x.f139812b
            java.lang.Object r1 = XH.y.a(r1)
            java.lang.Object r1 = XH.x.b(r1)
        L_0x00a0:
            java.lang.Throwable r7 = XH.x.e(r1)
            if (r7 != 0) goto L_0x00e4
            r7 = r1
            EB.c r7 = (EB.C12831c) r7
            Ry.f r8 = r3.f100324b
            Ry.e r8 = r8.invoke()
            TJ.g r8 = r8.a()
            r0.f100325c = r3
            r0.f100326d = r14
            r0.f100327e = r15
            r0.f100328f = r1
            r0.f100329g = r7
            r0.f100330h = r1
            r0.f100331i = r6
            r0.f100335m = r4
            java.lang.Object r1 = TJ.C16534i.B(r8, r0)
            if (r1 != r2) goto L_0x00ca
            return r2
        L_0x00ca:
            r14 = r7
        L_0x00cb:
            java.lang.Number r1 = (java.lang.Number) r1
            int r15 = r1.intValue()
            if (r15 <= 0) goto L_0x00d4
            goto L_0x00d5
        L_0x00d4:
            r5 = r6
        L_0x00d5:
            nu.g$a r15 = new nu.g$a
            java.lang.String r0 = r14.g()
            java.lang.String r14 = r14.h()
            r15.<init>(r0, r14, r5)
            goto L_0x0191
        L_0x00e4:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "Failed to get store details"
            r14.<init>(r15)
            qv.e r15 = qv.e.ERROR
            qv.d r0 = qv.d.f102012a
            java.util.List r0 = r0.a()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x00fe:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0115
            java.lang.Object r2 = r0.next()
            r7 = r2
            qv.b r7 = (qv.C11819b) r7
            boolean r7 = r7.b(r15, r6)
            if (r7 == 0) goto L_0x00fe
            r1.add(r2)
            goto L_0x00fe
        L_0x0115:
            java.util.Iterator r0 = r1.iterator()
            r1 = 0
            r2 = r1
            r6 = r2
        L_0x011c:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x0190
            java.lang.Object r7 = r0.next()
            qv.b r7 = (qv.C11819b) r7
            if (r2 != 0) goto L_0x0135
            java.lang.String r2 = qv.C11818a.a(r1, r14)
            if (r2 != 0) goto L_0x0131
            goto L_0x0190
        L_0x0131:
            java.lang.String r2 = qv.C11820c.a(r2)
        L_0x0135:
            if (r6 != 0) goto L_0x0184
            java.lang.Class r6 = r3.getClass()
            java.lang.String r6 = r6.getName()
            kotlin.jvm.internal.C17542s.g(r6)
            r8 = 36
            java.lang.String r8 = HJ.C15854t.s1(r6, r8, r1, r4, r1)
            r9 = 46
            java.lang.String r8 = HJ.C15854t.o1(r8, r9, r1, r4, r1)
            int r9 = r8.length()
            if (r9 != 0) goto L_0x0155
            goto L_0x015b
        L_0x0155:
            java.lang.String r6 = "Kt"
            java.lang.String r6 = HJ.C15854t.P0(r8, r6)
        L_0x015b:
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            java.lang.String r8 = r8.getName()
            java.lang.String r9 = "main"
            boolean r8 = HJ.C15854t.b0(r8, r9, r5)
            if (r8 == 0) goto L_0x016e
            java.lang.String r8 = "m"
            goto L_0x0170
        L_0x016e:
            java.lang.String r8 = "b"
        L_0x0170:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            java.lang.String r8 = "|"
            r9.append(r8)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
        L_0x0184:
            r12 = r6
            r9 = 0
            r6 = r7
            r7 = r15
            r8 = r12
            r10 = r14
            r11 = r2
            r6.a(r7, r8, r9, r10, r11)
            r6 = r12
            goto L_0x011c
        L_0x0190:
            r15 = r1
        L_0x0191:
            return r15
        L_0x0192:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: nu.h.a(java.lang.String, dI.e):java.lang.Object");
    }
}
