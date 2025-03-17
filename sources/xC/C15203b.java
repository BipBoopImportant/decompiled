package xC;

import XH.x;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import uC.C15114b;
import vC.C15132b;
import wC.C15168b;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LxC/b;", "LxC/a;", "LwC/b;", "dataSource", "LvC/b;", "mapper", "<init>", "(LwC/b;LvC/b;)V", "", "storeId", "", "LuC/b;", "cartItems", "LXH/x;", "LuC/a;", "a", "(Ljava/lang/String;Ljava/util/List;LdI/e;)Ljava/lang/Object;", "LwC/b;", "b", "LvC/b;", "timeslot-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: xC.b  reason: case insensitive filesystem */
public final class C15203b implements C15202a {

    /* renamed from: a  reason: collision with root package name */
    private final C15168b f131834a;

    /* renamed from: b  reason: collision with root package name */
    private final C15132b f131835b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.timeslot.impl.data.repository.TimeslotRepositoryImpl", f = "TimeslotRepositoryImpl.kt", l = {23}, m = "fetch-0E7RQCE")
    /* renamed from: xC.b$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f131836c;

        /* renamed from: d  reason: collision with root package name */
        Object f131837d;

        /* renamed from: e  reason: collision with root package name */
        Object f131838e;

        /* renamed from: f  reason: collision with root package name */
        Object f131839f;

        /* renamed from: g  reason: collision with root package name */
        Object f131840g;

        /* renamed from: h  reason: collision with root package name */
        Object f131841h;

        /* renamed from: i  reason: collision with root package name */
        int f131842i;

        /* renamed from: j  reason: collision with root package name */
        int f131843j;

        /* renamed from: k  reason: collision with root package name */
        /* synthetic */ Object f131844k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ C15203b f131845l;

        /* renamed from: m  reason: collision with root package name */
        int f131846m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C15203b bVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f131845l = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f131844k = obj;
            this.f131846m |= Integer.MIN_VALUE;
            Object a10 = this.f131845l.a((String) null, (List<C15114b>) null, this);
            return a10 == C17187b.f() ? a10 : x.a(a10);
        }
    }

    public C15203b(C15168b bVar, C15132b bVar2) {
        C17542s.j(bVar, "dataSource");
        C17542s.j(bVar2, "mapper");
        this.f131834a = bVar;
        this.f131835b = bVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c6, code lost:
        r13 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c7, code lost:
        r14 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x017e, code lost:
        throw r13;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:10:0x003e, B:17:0x0059] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004b A[ExcHandler: CancellationException (r13v11 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:10:0x003e] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0089 A[Catch:{ CancellationException -> 0x004b, all -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00be A[Catch:{ CancellationException -> 0x004b, all -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r13, java.util.List<uC.C15114b> r14, dI.C17164e<? super XH.x<uC.C15113a>> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof xC.C15203b.a
            if (r0 == 0) goto L_0x0013
            r0 = r15
            xC.b$a r0 = (xC.C15203b.a) r0
            int r1 = r0.f131846m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f131846m = r1
            goto L_0x0018
        L_0x0013:
            xC.b$a r0 = new xC.b$a
            r0.<init>(r12, r15)
        L_0x0018:
            java.lang.Object r1 = r0.f131844k
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f131846m
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0056
            if (r3 != r5) goto L_0x004e
            java.lang.Object r13 = r0.f131841h
            xC.b r13 = (xC.C15203b) r13
            java.lang.Object r14 = r0.f131840g
            xC.b r14 = (xC.C15203b) r14
            java.lang.Object r14 = r0.f131839f
            dI.e r14 = (dI.C17164e) r14
            java.lang.Object r14 = r0.f131838e
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r14 = r0.f131837d
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r14 = r0.f131836c
            xC.b r14 = (xC.C15203b) r14
            XH.y.b(r1)     // Catch:{ CancellationException -> 0x004b, all -> 0x0048 }
            XH.x r1 = (XH.x) r1     // Catch:{ CancellationException -> 0x004b, all -> 0x0048 }
            java.lang.Object r15 = r1.j()     // Catch:{ CancellationException -> 0x004b, all -> 0x0048 }
            goto L_0x0078
        L_0x0048:
            r13 = move-exception
            goto L_0x00c8
        L_0x004b:
            r13 = move-exception
            goto L_0x017e
        L_0x004e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0056:
            XH.y.b(r1)
            XH.x$a r1 = XH.x.f139812b     // Catch:{ CancellationException -> 0x004b, all -> 0x00c6 }
            wC.b r1 = r12.f131834a     // Catch:{ CancellationException -> 0x004b, all -> 0x00c6 }
            r0.f131836c = r12     // Catch:{ CancellationException -> 0x004b, all -> 0x00c6 }
            r0.f131837d = r13     // Catch:{ CancellationException -> 0x004b, all -> 0x00c6 }
            r0.f131838e = r14     // Catch:{ CancellationException -> 0x004b, all -> 0x00c6 }
            r0.f131839f = r15     // Catch:{ CancellationException -> 0x004b, all -> 0x00c6 }
            r0.f131840g = r12     // Catch:{ CancellationException -> 0x004b, all -> 0x00c6 }
            r0.f131841h = r12     // Catch:{ CancellationException -> 0x004b, all -> 0x00c6 }
            r0.f131842i = r4     // Catch:{ CancellationException -> 0x004b, all -> 0x00c6 }
            r0.f131843j = r4     // Catch:{ CancellationException -> 0x004b, all -> 0x00c6 }
            r0.f131846m = r5     // Catch:{ CancellationException -> 0x004b, all -> 0x00c6 }
            java.lang.Object r15 = r1.a(r13, r14, r0)     // Catch:{ CancellationException -> 0x004b, all -> 0x00c6 }
            if (r15 != r2) goto L_0x0076
            return r2
        L_0x0076:
            r13 = r12
            r14 = r13
        L_0x0078:
            XH.y.b(r15)     // Catch:{ CancellationException -> 0x004b, all -> 0x0048 }
            com.ingka.ikea.timeslot.impl.data.remote.model.TimeslotResponse r15 = (com.ingka.ikea.timeslot.impl.data.remote.model.TimeslotResponse) r15     // Catch:{ CancellationException -> 0x004b, all -> 0x0048 }
            java.util.List r0 = r15.b()     // Catch:{ CancellationException -> 0x004b, all -> 0x0048 }
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ CancellationException -> 0x004b, all -> 0x0048 }
            boolean r0 = r0.isEmpty()     // Catch:{ CancellationException -> 0x004b, all -> 0x0048 }
            if (r0 != 0) goto L_0x00be
            java.util.List r15 = r15.b()     // Catch:{ CancellationException -> 0x004b, all -> 0x0048 }
            java.lang.Iterable r15 = (java.lang.Iterable) r15     // Catch:{ CancellationException -> 0x004b, all -> 0x0048 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ CancellationException -> 0x004b, all -> 0x0048 }
            r1 = 10
            int r1 = YH.C16877v.y(r15, r1)     // Catch:{ CancellationException -> 0x004b, all -> 0x0048 }
            r0.<init>(r1)     // Catch:{ CancellationException -> 0x004b, all -> 0x0048 }
            java.util.Iterator r15 = r15.iterator()     // Catch:{ CancellationException -> 0x004b, all -> 0x0048 }
        L_0x009e:
            boolean r1 = r15.hasNext()     // Catch:{ CancellationException -> 0x004b, all -> 0x0048 }
            if (r1 == 0) goto L_0x00b4
            java.lang.Object r1 = r15.next()     // Catch:{ CancellationException -> 0x004b, all -> 0x0048 }
            com.ingka.ikea.timeslot.impl.data.remote.model.TimeslotRemoteData r1 = (com.ingka.ikea.timeslot.impl.data.remote.model.TimeslotRemoteData) r1     // Catch:{ CancellationException -> 0x004b, all -> 0x0048 }
            vC.b r2 = r13.f131835b     // Catch:{ CancellationException -> 0x004b, all -> 0x0048 }
            uC.c r1 = r2.b(r1)     // Catch:{ CancellationException -> 0x004b, all -> 0x0048 }
            r0.add(r1)     // Catch:{ CancellationException -> 0x004b, all -> 0x0048 }
            goto L_0x009e
        L_0x00b4:
            uC.a r13 = new uC.a     // Catch:{ CancellationException -> 0x004b, all -> 0x0048 }
            r13.<init>(r0)     // Catch:{ CancellationException -> 0x004b, all -> 0x0048 }
            java.lang.Object r13 = XH.x.b(r13)     // Catch:{ CancellationException -> 0x004b, all -> 0x0048 }
            goto L_0x00d2
        L_0x00be:
            java.lang.String r13 = "There are no existing timeWindows"
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException     // Catch:{ CancellationException -> 0x004b, all -> 0x0048 }
            r15.<init>(r13)     // Catch:{ CancellationException -> 0x004b, all -> 0x0048 }
            throw r15     // Catch:{ CancellationException -> 0x004b, all -> 0x0048 }
        L_0x00c6:
            r13 = move-exception
            r14 = r12
        L_0x00c8:
            XH.x$a r15 = XH.x.f139812b
            java.lang.Object r13 = XH.y.a(r13)
            java.lang.Object r13 = XH.x.b(r13)
        L_0x00d2:
            java.lang.Throwable r15 = XH.x.e(r13)
            if (r15 == 0) goto L_0x017d
            qv.e r0 = qv.e.WARN
            qv.d r1 = qv.d.f102012a
            java.util.List r1 = r1.a()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x00eb:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0102
            java.lang.Object r3 = r1.next()
            r6 = r3
            qv.b r6 = (qv.C11819b) r6
            boolean r6 = r6.b(r0, r4)
            if (r6 == 0) goto L_0x00eb
            r2.add(r3)
            goto L_0x00eb
        L_0x0102:
            java.util.Iterator r1 = r2.iterator()
            r2 = 0
            r3 = r2
            r4 = r3
        L_0x0109:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x017d
            java.lang.Object r6 = r1.next()
            qv.b r6 = (qv.C11819b) r6
            if (r3 != 0) goto L_0x0124
            java.lang.String r3 = "Failed to fetch timeslots:"
            java.lang.String r3 = qv.C11818a.a(r3, r15)
            if (r3 != 0) goto L_0x0120
            goto L_0x017d
        L_0x0120:
            java.lang.String r3 = qv.C11820c.a(r3)
        L_0x0124:
            if (r4 != 0) goto L_0x0174
            java.lang.Class r4 = r14.getClass()
            java.lang.String r4 = r4.getName()
            kotlin.jvm.internal.C17542s.g(r4)
            r7 = 36
            r8 = 2
            java.lang.String r7 = HJ.C15854t.s1(r4, r7, r2, r8, r2)
            r9 = 46
            java.lang.String r7 = HJ.C15854t.o1(r7, r9, r2, r8, r2)
            int r8 = r7.length()
            if (r8 != 0) goto L_0x0145
            goto L_0x014b
        L_0x0145:
            java.lang.String r4 = "Kt"
            java.lang.String r4 = HJ.C15854t.P0(r7, r4)
        L_0x014b:
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            java.lang.String r7 = r7.getName()
            java.lang.String r8 = "main"
            boolean r7 = HJ.C15854t.b0(r7, r8, r5)
            if (r7 == 0) goto L_0x015e
            java.lang.String r7 = "m"
            goto L_0x0160
        L_0x015e:
            java.lang.String r7 = "b"
        L_0x0160:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            java.lang.String r7 = "|"
            r8.append(r7)
            r8.append(r4)
            java.lang.String r4 = r8.toString()
        L_0x0174:
            r9 = 0
            r7 = r0
            r8 = r4
            r10 = r15
            r11 = r3
            r6.a(r7, r8, r9, r10, r11)
            goto L_0x0109
        L_0x017d:
            return r13
        L_0x017e:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: xC.C15203b.a(java.lang.String, java.util.List, dI.e):java.lang.Object");
    }
}
