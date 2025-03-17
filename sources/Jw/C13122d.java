package Jw;

import Hw.C13012a;
import Iw.b;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import ug.m;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LJw/d;", "LJw/c;", "LHw/a;", "orderPickupStatusEndpoint", "LIw/b;", "pickupStatusMapper", "Lug/m;", "scanAndGoOverride", "<init>", "(LHw/a;LIw/b;Lug/m;)V", "", "orderNumber", "LDw/c;", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LHw/a;", "b", "LIw/b;", "c", "Lug/m;", "ongoinginstoreordersrepository-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Jw.d  reason: case insensitive filesystem */
public final class C13122d implements C13121c {

    /* renamed from: a  reason: collision with root package name */
    private final C13012a f111377a;

    /* renamed from: b  reason: collision with root package name */
    private final b f111378b;

    /* renamed from: c  reason: collision with root package name */
    private final m f111379c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.ongoinginstoreordersrepository.impl.source.OrderPickupStatusRemoteSourceImpl", f = "OrderPickupStatusRemoteSource.kt", l = {31}, m = "getStatus")
    /* renamed from: Jw.d$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f111380c;

        /* renamed from: d  reason: collision with root package name */
        Object f111381d;

        /* renamed from: e  reason: collision with root package name */
        Object f111382e;

        /* renamed from: f  reason: collision with root package name */
        Object f111383f;

        /* renamed from: g  reason: collision with root package name */
        Object f111384g;

        /* renamed from: h  reason: collision with root package name */
        Object f111385h;

        /* renamed from: i  reason: collision with root package name */
        Object f111386i;

        /* renamed from: j  reason: collision with root package name */
        Object f111387j;

        /* renamed from: k  reason: collision with root package name */
        Object f111388k;

        /* renamed from: l  reason: collision with root package name */
        int f111389l;

        /* renamed from: m  reason: collision with root package name */
        int f111390m;

        /* renamed from: n  reason: collision with root package name */
        int f111391n;

        /* renamed from: o  reason: collision with root package name */
        /* synthetic */ Object f111392o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ C13122d f111393p;

        /* renamed from: q  reason: collision with root package name */
        int f111394q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C13122d dVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f111393p = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f111392o = obj;
            this.f111394q |= Integer.MIN_VALUE;
            return this.f111393p.a((String) null, this);
        }
    }

    public C13122d(C13012a aVar, b bVar, m mVar) {
        C17542s.j(aVar, "orderPickupStatusEndpoint");
        C17542s.j(bVar, "pickupStatusMapper");
        C17542s.j(mVar, "scanAndGoOverride");
        this.f111377a = aVar;
        this.f111378b = bVar;
        this.f111379c = mVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0053, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0089, code lost:
        r14 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008a, code lost:
        r15 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0196, code lost:
        throw r14;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:10:0x004b, B:17:0x0061] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0053 A[ExcHandler: CancellationException (r14v14 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:10:0x004b] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c2 A[Catch:{ CancellationException -> 0x0053, all -> 0x0050 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c7 A[Catch:{ CancellationException -> 0x0053, all -> 0x0050 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ca A[Catch:{ CancellationException -> 0x0053, all -> 0x0050 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d5 A[Catch:{ CancellationException -> 0x0053, all -> 0x0050 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r14, dI.C17164e<? super Dw.c> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof Jw.C13122d.a
            if (r0 == 0) goto L_0x0013
            r0 = r15
            Jw.d$a r0 = (Jw.C13122d.a) r0
            int r1 = r0.f111394q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f111394q = r1
            goto L_0x0018
        L_0x0013:
            Jw.d$a r0 = new Jw.d$a
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r1 = r0.f111392o
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f111394q
            r4 = 1
            r5 = 0
            r6 = 0
            if (r3 == 0) goto L_0x005e
            if (r3 != r4) goto L_0x0056
            java.lang.Object r14 = r0.f111388k
            Dw.c r14 = (Dw.c) r14
            java.lang.Object r14 = r0.f111387j
            java.util.Iterator r14 = (java.util.Iterator) r14
            java.lang.Object r14 = r0.f111386i
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.lang.Object r14 = r0.f111385h
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r14 = r0.f111384g
            Jw.d r14 = (Jw.C13122d) r14
            java.lang.Object r15 = r0.f111383f
            Jw.d r15 = (Jw.C13122d) r15
            java.lang.Object r15 = r0.f111382e
            dI.e r15 = (dI.C17164e) r15
            java.lang.Object r15 = r0.f111381d
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r15 = r0.f111380c
            Jw.d r15 = (Jw.C13122d) r15
            XH.y.b(r1)     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            goto L_0x00b8
        L_0x0050:
            r14 = move-exception
            goto L_0x00dd
        L_0x0053:
            r14 = move-exception
            goto L_0x0196
        L_0x0056:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x005e:
            XH.y.b(r1)
            XH.x$a r1 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0053, all -> 0x0089 }
            ug.m r1 = r13.f111379c     // Catch:{ CancellationException -> 0x0053, all -> 0x0089 }
            java.lang.String r1 = r1.b()     // Catch:{ CancellationException -> 0x0053, all -> 0x0089 }
            fI.a r3 = Dw.c.b()     // Catch:{ CancellationException -> 0x0053, all -> 0x0089 }
            java.util.Iterator r7 = r3.iterator()     // Catch:{ CancellationException -> 0x0053, all -> 0x0089 }
        L_0x0071:
            boolean r8 = r7.hasNext()     // Catch:{ CancellationException -> 0x0053, all -> 0x0089 }
            if (r8 == 0) goto L_0x008c
            java.lang.Object r8 = r7.next()     // Catch:{ CancellationException -> 0x0053, all -> 0x0089 }
            r9 = r8
            Dw.c r9 = (Dw.c) r9     // Catch:{ CancellationException -> 0x0053, all -> 0x0089 }
            java.lang.String r9 = r9.j()     // Catch:{ CancellationException -> 0x0053, all -> 0x0089 }
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r1)     // Catch:{ CancellationException -> 0x0053, all -> 0x0089 }
            if (r9 == 0) goto L_0x0071
            goto L_0x008d
        L_0x0089:
            r14 = move-exception
            r15 = r13
            goto L_0x00dd
        L_0x008c:
            r8 = r6
        L_0x008d:
            Dw.c r8 = (Dw.c) r8     // Catch:{ CancellationException -> 0x0053, all -> 0x0089 }
            if (r8 == 0) goto L_0x0093
            r15 = r13
            goto L_0x00d0
        L_0x0093:
            Hw.a r9 = r13.f111377a     // Catch:{ CancellationException -> 0x0053, all -> 0x0089 }
            r0.f111380c = r13     // Catch:{ CancellationException -> 0x0053, all -> 0x0089 }
            r0.f111381d = r14     // Catch:{ CancellationException -> 0x0053, all -> 0x0089 }
            r0.f111382e = r15     // Catch:{ CancellationException -> 0x0053, all -> 0x0089 }
            r0.f111383f = r13     // Catch:{ CancellationException -> 0x0053, all -> 0x0089 }
            r0.f111384g = r13     // Catch:{ CancellationException -> 0x0053, all -> 0x0089 }
            r0.f111385h = r1     // Catch:{ CancellationException -> 0x0053, all -> 0x0089 }
            r0.f111386i = r3     // Catch:{ CancellationException -> 0x0053, all -> 0x0089 }
            r0.f111387j = r7     // Catch:{ CancellationException -> 0x0053, all -> 0x0089 }
            r0.f111388k = r8     // Catch:{ CancellationException -> 0x0053, all -> 0x0089 }
            r0.f111389l = r5     // Catch:{ CancellationException -> 0x0053, all -> 0x0089 }
            r0.f111390m = r5     // Catch:{ CancellationException -> 0x0053, all -> 0x0089 }
            r0.f111391n = r5     // Catch:{ CancellationException -> 0x0053, all -> 0x0089 }
            r0.f111394q = r4     // Catch:{ CancellationException -> 0x0053, all -> 0x0089 }
            java.lang.Object r1 = r9.a(r14, r0)     // Catch:{ CancellationException -> 0x0053, all -> 0x0089 }
            if (r1 != r2) goto L_0x00b6
            return r2
        L_0x00b6:
            r14 = r13
            r15 = r14
        L_0x00b8:
            QL.x r1 = (QL.x) r1     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            java.lang.Object r0 = r1.a()     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            com.ingka.ikea.ongoinginstoreordersrepository.impl.endpoint.OrderPickupStatusRemoteModel r0 = (com.ingka.ikea.ongoinginstoreordersrepository.impl.endpoint.OrderPickupStatusRemoteModel) r0     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            if (r0 == 0) goto L_0x00c7
            java.lang.String r0 = r0.a()     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            goto L_0x00c8
        L_0x00c7:
            r0 = r6
        L_0x00c8:
            if (r0 == 0) goto L_0x00d5
            Iw.b r14 = r14.f111378b     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            Dw.c r8 = r14.a(r0)     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
        L_0x00d0:
            java.lang.Object r14 = XH.x.b(r8)     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            goto L_0x00e7
        L_0x00d5:
            java.lang.String r14 = "Required value was null."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            r0.<init>(r14)     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            throw r0     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
        L_0x00dd:
            XH.x$a r0 = XH.x.f139812b
            java.lang.Object r14 = XH.y.a(r14)
            java.lang.Object r14 = XH.x.b(r14)
        L_0x00e7:
            java.lang.Throwable r0 = XH.x.e(r14)
            if (r0 != 0) goto L_0x00f0
            Dw.c r14 = (Dw.c) r14
            return r14
        L_0x00f0:
            qv.e r14 = qv.e.WARN
            qv.d r1 = qv.d.f102012a
            java.util.List r1 = r1.a()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0103:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x011a
            java.lang.Object r3 = r1.next()
            r7 = r3
            qv.b r7 = (qv.C11819b) r7
            boolean r7 = r7.b(r14, r5)
            if (r7 == 0) goto L_0x0103
            r2.add(r3)
            goto L_0x0103
        L_0x011a:
            java.util.Iterator r1 = r2.iterator()
            r2 = r6
            r3 = r2
        L_0x0120:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0193
            java.lang.Object r5 = r1.next()
            r7 = r5
            qv.b r7 = (qv.C11819b) r7
            if (r2 != 0) goto L_0x013a
            java.lang.String r2 = qv.C11818a.a(r6, r0)
            if (r2 != 0) goto L_0x0136
            goto L_0x0193
        L_0x0136:
            java.lang.String r2 = qv.C11820c.a(r2)
        L_0x013a:
            if (r3 != 0) goto L_0x018a
            java.lang.Class r3 = r15.getClass()
            java.lang.String r3 = r3.getName()
            kotlin.jvm.internal.C17542s.g(r3)
            r5 = 36
            r8 = 2
            java.lang.String r5 = HJ.C15854t.s1(r3, r5, r6, r8, r6)
            r9 = 46
            java.lang.String r5 = HJ.C15854t.o1(r5, r9, r6, r8, r6)
            int r8 = r5.length()
            if (r8 != 0) goto L_0x015b
            goto L_0x0161
        L_0x015b:
            java.lang.String r3 = "Kt"
            java.lang.String r3 = HJ.C15854t.P0(r5, r3)
        L_0x0161:
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            java.lang.String r5 = r5.getName()
            java.lang.String r8 = "main"
            boolean r5 = HJ.C15854t.b0(r5, r8, r4)
            if (r5 == 0) goto L_0x0174
            java.lang.String r5 = "m"
            goto L_0x0176
        L_0x0174:
            java.lang.String r5 = "b"
        L_0x0176:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            java.lang.String r5 = "|"
            r8.append(r5)
            r8.append(r3)
            java.lang.String r3 = r8.toString()
        L_0x018a:
            r10 = 0
            r8 = r14
            r9 = r3
            r11 = r0
            r12 = r2
            r7.a(r8, r9, r10, r11, r12)
            goto L_0x0120
        L_0x0193:
            Dw.c r14 = Dw.c.UNKNOWN
            return r14
        L_0x0196:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: Jw.C13122d.a(java.lang.String, dI.e):java.lang.Object");
    }
}
