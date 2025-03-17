package DB;

import FB.C12860a;
import FB.C12863d;
import dI.C17164e;
import gp.C11343b;
import gp.C11346e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00108\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u0013¨\u0006\u0015"}, d2 = {"LDB/b;", "Lgp/b;", "LFB/a;", "localStoreSelectionRepository", "LFB/d;", "storeRepository", "<init>", "(LFB/a;LFB/d;)V", "", "param", "", "b", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "a", "LFB/a;", "LFB/d;", "Lgp/e;", "c", "Lgp/e;", "()Lgp/e;", "taskId", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: DB.b  reason: case insensitive filesystem */
public final class C12730b implements C11343b {

    /* renamed from: a  reason: collision with root package name */
    private final C12860a f108524a;

    /* renamed from: b  reason: collision with root package name */
    private final C12863d f108525b;

    /* renamed from: c  reason: collision with root package name */
    private final C11346e f108526c = C11346e.UPDATE_LOCALLY_SELECTED_STORE;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.store.datalayer.impl.tasks.UpdateLocallySelectedStoreTask", f = "UpdateLocallySelectedStoreTask.kt", l = {30}, m = "execute")
    /* renamed from: DB.b$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f108527c;

        /* renamed from: d  reason: collision with root package name */
        Object f108528d;

        /* renamed from: e  reason: collision with root package name */
        Object f108529e;

        /* renamed from: f  reason: collision with root package name */
        Object f108530f;

        /* renamed from: g  reason: collision with root package name */
        Object f108531g;

        /* renamed from: h  reason: collision with root package name */
        Object f108532h;

        /* renamed from: i  reason: collision with root package name */
        int f108533i;

        /* renamed from: j  reason: collision with root package name */
        int f108534j;

        /* renamed from: k  reason: collision with root package name */
        /* synthetic */ Object f108535k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ C12730b f108536l;

        /* renamed from: m  reason: collision with root package name */
        int f108537m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C12730b bVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f108536l = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f108535k = obj;
            this.f108537m |= Integer.MIN_VALUE;
            return this.f108536l.b((Object) null, this);
        }
    }

    public C12730b(C12860a aVar, C12863d dVar) {
        C17542s.j(aVar, "localStoreSelectionRepository");
        C17542s.j(dVar, "storeRepository");
        this.f108524a = aVar;
        this.f108525b = dVar;
    }

    public C11346e a() {
        return this.f108526c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009a, code lost:
        r14 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009b, code lost:
        r0 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0155, code lost:
        throw r14;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:10:0x003b, B:18:0x0057] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0041 A[ExcHandler: CancellationException (r14v15 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:10:0x003b] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0080 A[Catch:{ CancellationException -> 0x0041, all -> 0x003f }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0094 A[Catch:{ CancellationException -> 0x0041, all -> 0x003f }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(java.lang.Object r14, dI.C17164e<? super java.lang.Boolean> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof DB.C12730b.a
            if (r0 == 0) goto L_0x0013
            r0 = r15
            DB.b$a r0 = (DB.C12730b.a) r0
            int r1 = r0.f108537m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f108537m = r1
            goto L_0x0018
        L_0x0013:
            DB.b$a r0 = new DB.b$a
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r1 = r0.f108535k
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f108537m
            r4 = 0
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x004c
            if (r3 != r5) goto L_0x0044
            java.lang.Object r14 = r0.f108532h
            DB.b r14 = (DB.C12730b) r14
            java.lang.Object r15 = r0.f108531g
            DB.b r15 = (DB.C12730b) r15
            java.lang.Object r15 = r0.f108530f
            EB.d r15 = (EB.C12832d) r15
            java.lang.Object r2 = r0.f108529e
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r0 = r0.f108527c
            DB.b r0 = (DB.C12730b) r0
            XH.y.b(r1)     // Catch:{ CancellationException -> 0x0041, all -> 0x003f }
            goto L_0x007c
        L_0x003f:
            r14 = move-exception
            goto L_0x009c
        L_0x0041:
            r14 = move-exception
            goto L_0x0155
        L_0x0044:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x004c:
            XH.y.b(r1)
            FB.a r1 = r13.f108524a
            EB.d r1 = r1.c()
            if (r1 == 0) goto L_0x0156
            XH.x$a r3 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0041, all -> 0x009a }
            FB.d r3 = r13.f108525b     // Catch:{ CancellationException -> 0x0041, all -> 0x009a }
            java.lang.String r7 = r1.e()     // Catch:{ CancellationException -> 0x0041, all -> 0x009a }
            r0.f108527c = r13     // Catch:{ CancellationException -> 0x0041, all -> 0x009a }
            r0.f108528d = r14     // Catch:{ CancellationException -> 0x0041, all -> 0x009a }
            r0.f108529e = r15     // Catch:{ CancellationException -> 0x0041, all -> 0x009a }
            r0.f108530f = r1     // Catch:{ CancellationException -> 0x0041, all -> 0x009a }
            r0.f108531g = r13     // Catch:{ CancellationException -> 0x0041, all -> 0x009a }
            r0.f108532h = r13     // Catch:{ CancellationException -> 0x0041, all -> 0x009a }
            r0.f108533i = r4     // Catch:{ CancellationException -> 0x0041, all -> 0x009a }
            r0.f108534j = r4     // Catch:{ CancellationException -> 0x0041, all -> 0x009a }
            r0.f108537m = r5     // Catch:{ CancellationException -> 0x0041, all -> 0x009a }
            java.lang.Object r14 = r3.b(r7, r0)     // Catch:{ CancellationException -> 0x0041, all -> 0x009a }
            if (r14 != r2) goto L_0x0078
            return r2
        L_0x0078:
            r0 = r13
            r15 = r1
            r1 = r14
            r14 = r0
        L_0x007c:
            EB.c r1 = (EB.C12831c) r1     // Catch:{ CancellationException -> 0x0041, all -> 0x003f }
            if (r1 == 0) goto L_0x0094
            EB.d$a r2 = EB.C12832d.f109333f     // Catch:{ CancellationException -> 0x0041, all -> 0x003f }
            EB.d r1 = r2.a(r1)     // Catch:{ CancellationException -> 0x0041, all -> 0x003f }
            boolean r15 = kotlin.jvm.internal.C17542s.e(r1, r15)     // Catch:{ CancellationException -> 0x0041, all -> 0x003f }
            if (r15 != 0) goto L_0x0091
            FB.a r14 = r14.f108524a     // Catch:{ CancellationException -> 0x0041, all -> 0x003f }
            r14.a(r1)     // Catch:{ CancellationException -> 0x0041, all -> 0x003f }
        L_0x0091:
            XH.N r14 = XH.C16807N.f139792a     // Catch:{ CancellationException -> 0x0041, all -> 0x003f }
            goto L_0x0095
        L_0x0094:
            r14 = r6
        L_0x0095:
            java.lang.Object r14 = XH.x.b(r14)     // Catch:{ CancellationException -> 0x0041, all -> 0x003f }
            goto L_0x00a6
        L_0x009a:
            r14 = move-exception
            r0 = r13
        L_0x009c:
            XH.x$a r15 = XH.x.f139812b
            java.lang.Object r14 = XH.y.a(r14)
            java.lang.Object r14 = XH.x.b(r14)
        L_0x00a6:
            java.lang.Throwable r15 = XH.x.e(r14)
            if (r15 == 0) goto L_0x0150
            qv.e r1 = qv.e.WARN
            qv.d r2 = qv.d.f102012a
            java.util.List r2 = r2.a()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x00bf:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x00d6
            java.lang.Object r7 = r2.next()
            r8 = r7
            qv.b r8 = (qv.C11819b) r8
            boolean r8 = r8.b(r1, r4)
            if (r8 == 0) goto L_0x00bf
            r3.add(r7)
            goto L_0x00bf
        L_0x00d6:
            java.util.Iterator r2 = r3.iterator()
            r3 = r6
            r4 = r3
        L_0x00dc:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0150
            java.lang.Object r7 = r2.next()
            qv.b r7 = (qv.C11819b) r7
            if (r3 != 0) goto L_0x00f7
            java.lang.String r3 = "Failed to update local store selection"
            java.lang.String r3 = qv.C11818a.a(r3, r15)
            if (r3 != 0) goto L_0x00f3
            goto L_0x0150
        L_0x00f3:
            java.lang.String r3 = qv.C11820c.a(r3)
        L_0x00f7:
            if (r4 != 0) goto L_0x0147
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            kotlin.jvm.internal.C17542s.g(r4)
            r8 = 36
            r9 = 2
            java.lang.String r8 = HJ.C15854t.s1(r4, r8, r6, r9, r6)
            r10 = 46
            java.lang.String r8 = HJ.C15854t.o1(r8, r10, r6, r9, r6)
            int r9 = r8.length()
            if (r9 != 0) goto L_0x0118
            goto L_0x011e
        L_0x0118:
            java.lang.String r4 = "Kt"
            java.lang.String r4 = HJ.C15854t.P0(r8, r4)
        L_0x011e:
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            java.lang.String r8 = r8.getName()
            java.lang.String r9 = "main"
            boolean r8 = HJ.C15854t.b0(r8, r9, r5)
            if (r8 == 0) goto L_0x0131
            java.lang.String r8 = "m"
            goto L_0x0133
        L_0x0131:
            java.lang.String r8 = "b"
        L_0x0133:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            java.lang.String r8 = "|"
            r9.append(r8)
            r9.append(r4)
            java.lang.String r4 = r9.toString()
        L_0x0147:
            r10 = 0
            r8 = r1
            r9 = r4
            r11 = r15
            r12 = r3
            r7.a(r8, r9, r10, r11, r12)
            goto L_0x00dc
        L_0x0150:
            boolean r5 = XH.x.h(r14)
            goto L_0x0156
        L_0x0155:
            throw r14
        L_0x0156:
            java.lang.Boolean r14 = kotlin.coroutines.jvm.internal.b.a(r5)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: DB.C12730b.b(java.lang.Object, dI.e):java.lang.Object");
    }
}
