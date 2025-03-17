package wC;

import XH.x;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import uC.C15114b;
import vC.C15131a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LwC/c;", "LwC/b;", "LwC/a;", "endpoint", "LvC/a;", "timeslotCartItemRequestMapper", "<init>", "(LwC/a;LvC/a;)V", "", "storeId", "", "LuC/b;", "cartItems", "LXH/x;", "Lcom/ingka/ikea/timeslot/impl/data/remote/model/TimeslotResponse;", "a", "(Ljava/lang/String;Ljava/util/List;LdI/e;)Ljava/lang/Object;", "LwC/a;", "b", "LvC/a;", "timeslot-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wC.c  reason: case insensitive filesystem */
public final class C15169c implements C15168b {

    /* renamed from: a  reason: collision with root package name */
    private final C15167a f131647a;

    /* renamed from: b  reason: collision with root package name */
    private final C15131a f131648b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.timeslot.impl.data.remote.datasource.TimeslotRemoteDataSourceImpl", f = "TimeslotRemoteDataSource.kt", l = {31}, m = "fetch-0E7RQCE")
    /* renamed from: wC.c$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f131649c;

        /* renamed from: d  reason: collision with root package name */
        Object f131650d;

        /* renamed from: e  reason: collision with root package name */
        Object f131651e;

        /* renamed from: f  reason: collision with root package name */
        Object f131652f;

        /* renamed from: g  reason: collision with root package name */
        Object f131653g;

        /* renamed from: h  reason: collision with root package name */
        Object f131654h;

        /* renamed from: i  reason: collision with root package name */
        Object f131655i;

        /* renamed from: j  reason: collision with root package name */
        Object f131656j;

        /* renamed from: k  reason: collision with root package name */
        Object f131657k;

        /* renamed from: l  reason: collision with root package name */
        Object f131658l;

        /* renamed from: m  reason: collision with root package name */
        Object f131659m;

        /* renamed from: n  reason: collision with root package name */
        Object f131660n;

        /* renamed from: o  reason: collision with root package name */
        Object f131661o;

        /* renamed from: p  reason: collision with root package name */
        Object f131662p;

        /* renamed from: q  reason: collision with root package name */
        int f131663q;

        /* renamed from: r  reason: collision with root package name */
        int f131664r;

        /* renamed from: s  reason: collision with root package name */
        int f131665s;

        /* renamed from: t  reason: collision with root package name */
        int f131666t;

        /* renamed from: u  reason: collision with root package name */
        /* synthetic */ Object f131667u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ C15169c f131668v;

        /* renamed from: w  reason: collision with root package name */
        int f131669w;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C15169c cVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f131668v = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f131667u = obj;
            this.f131669w |= Integer.MIN_VALUE;
            Object a10 = this.f131668v.a((String) null, (List<C15114b>) null, this);
            return a10 == C17187b.f() ? a10 : x.a(a10);
        }
    }

    public C15169c(C15167a aVar, C15131a aVar2) {
        C17542s.j(aVar, "endpoint");
        C17542s.j(aVar2, "timeslotCartItemRequestMapper");
        this.f131647a = aVar;
        this.f131648b = aVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0062, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0065, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01c9, code lost:
        r14 = XH.x.f139812b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01d4, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        return XH.x.b(XH.y.a(r13));
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0062 A[ExcHandler: all (r13v14 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:10:0x005e] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d9 A[Catch:{ CancellationException -> 0x0065, all -> 0x0062 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r13, java.util.List<uC.C15114b> r14, dI.C17164e<? super XH.x<com.ingka.ikea.timeslot.impl.data.remote.model.TimeslotResponse>> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof wC.C15169c.a
            if (r0 == 0) goto L_0x0013
            r0 = r15
            wC.c$a r0 = (wC.C15169c.a) r0
            int r1 = r0.f131669w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f131669w = r1
            goto L_0x0018
        L_0x0013:
            wC.c$a r0 = new wC.c$a
            r0.<init>(r12, r15)
        L_0x0018:
            java.lang.Object r1 = r0.f131667u
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f131669w
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0070
            if (r3 != r4) goto L_0x0068
            java.lang.Object r13 = r0.f131662p
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r13 = r0.f131661o
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r13 = r0.f131660n
            java.util.Iterator r13 = (java.util.Iterator) r13
            java.lang.Object r13 = r0.f131659m
            java.util.Collection r13 = (java.util.Collection) r13
            java.lang.Object r13 = r0.f131658l
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.lang.Object r13 = r0.f131657k
            wC.a r13 = (wC.C15167a) r13
            java.lang.Object r13 = r0.f131656j
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r13 = r0.f131655i
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.lang.Object r13 = r0.f131654h
            wC.c r13 = (wC.C15169c) r13
            java.lang.Object r13 = r0.f131653g
            wC.c r13 = (wC.C15169c) r13
            java.lang.Object r13 = r0.f131652f
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r13 = r0.f131651e
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r13 = r0.f131650d
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r13 = r0.f131649c
            wC.c r13 = (wC.C15169c) r13
            XH.y.b(r1)     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            goto L_0x00d1
        L_0x0062:
            r13 = move-exception
            goto L_0x01c9
        L_0x0065:
            r13 = move-exception
            goto L_0x01d4
        L_0x0068:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0070:
            XH.y.b(r1)
            XH.x$a r1 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            wC.a r1 = r12.f131647a     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            r3 = r14
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            r7 = 10
            int r7 = YH.C16877v.y(r3, r7)     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            r6.<init>(r7)     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            java.util.Iterator r7 = r3.iterator()     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
        L_0x0089:
            boolean r8 = r7.hasNext()     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            if (r8 == 0) goto L_0x009f
            java.lang.Object r8 = r7.next()     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            uC.b r8 = (uC.C15114b) r8     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            vC.a r9 = r12.f131648b     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            com.ingka.ikea.timeslot.impl.data.remote.model.TimeslotCartItemRequest r8 = r9.a(r8)     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            r6.add(r8)     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            goto L_0x0089
        L_0x009f:
            com.ingka.ikea.timeslot.impl.data.remote.model.TimeslotRequest r8 = new com.ingka.ikea.timeslot.impl.data.remote.model.TimeslotRequest     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            r8.<init>(r6)     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            r0.f131649c = r12     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            r0.f131650d = r13     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            r0.f131651e = r14     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            r0.f131652f = r15     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            r0.f131653g = r12     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            r0.f131654h = r12     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            r0.f131655i = r3     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            r0.f131656j = r13     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            r0.f131657k = r1     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            r0.f131658l = r3     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            r0.f131659m = r6     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            r0.f131660n = r7     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            r0.f131661o = r6     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            r0.f131662p = r6     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            r0.f131663q = r5     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            r0.f131664r = r5     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            r0.f131665s = r5     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            r0.f131666t = r5     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            r0.f131669w = r4     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            java.lang.Object r1 = r1.a(r13, r8, r0)     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            if (r1 != r2) goto L_0x00d1
            return r2
        L_0x00d1:
            QL.x r1 = (QL.x) r1     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            boolean r13 = r1.e()     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            if (r13 == 0) goto L_0x00ef
            java.lang.Object r13 = r1.a()     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            if (r13 == 0) goto L_0x00e7
            com.ingka.ikea.timeslot.impl.data.remote.model.TimeslotResponse r13 = (com.ingka.ikea.timeslot.impl.data.remote.model.TimeslotResponse) r13     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            java.lang.Object r13 = XH.x.b(r13)     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            goto L_0x01d3
        L_0x00e7:
            java.lang.String r13 = "Could not de serialize a response body"
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            r14.<init>(r13)     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            throw r14     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
        L_0x00ef:
            r13 = 0
            GK.E r14 = r1.d()     // Catch:{ Exception -> 0x0111, all -> 0x0062 }
            if (r14 == 0) goto L_0x01b5
            java.lang.String r14 = r14.l()     // Catch:{ Exception -> 0x0111, all -> 0x0062 }
            if (r14 == 0) goto L_0x01b5
            Yz.b r15 = Yz.b.f118278a     // Catch:{ Exception -> 0x0111, all -> 0x0062 }
            kK.c r15 = r15.b()     // Catch:{ Exception -> 0x0111, all -> 0x0062 }
            r15.a()     // Catch:{ Exception -> 0x0111, all -> 0x0062 }
            com.ingka.ikea.timeslot.impl.data.remote.datasource.TimeSlotApiErrorModel$a r0 = com.ingka.ikea.timeslot.impl.data.remote.datasource.TimeSlotApiErrorModel.Companion     // Catch:{ Exception -> 0x0111, all -> 0x0062 }
            kotlinx.serialization.KSerializer r0 = r0.serializer()     // Catch:{ Exception -> 0x0111, all -> 0x0062 }
            java.lang.Object r13 = r15.c(r0, r14)     // Catch:{ Exception -> 0x0111, all -> 0x0062 }
            goto L_0x01b5
        L_0x0111:
            r14 = move-exception
            qv.e r15 = qv.e.DEBUG     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            qv.d r0 = qv.d.f102012a     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            java.util.List r0 = r0.a()     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            r2.<init>()     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
        L_0x0125:
            boolean r3 = r0.hasNext()     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            if (r3 == 0) goto L_0x013c
            java.lang.Object r3 = r0.next()     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            r6 = r3
            qv.b r6 = (qv.C11819b) r6     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            boolean r6 = r6.b(r15, r5)     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            if (r6 == 0) goto L_0x0125
            r2.add(r3)     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            goto L_0x0125
        L_0x013c:
            java.util.Iterator r0 = r2.iterator()     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            r2 = r13
            r3 = r2
        L_0x0142:
            boolean r5 = r0.hasNext()     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            if (r5 == 0) goto L_0x01b5
            java.lang.Object r5 = r0.next()     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            r6 = r5
            qv.b r6 = (qv.C11819b) r6     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            if (r2 != 0) goto L_0x015e
            java.lang.String r2 = "Exception when parsing errorBody"
            java.lang.String r2 = qv.C11818a.a(r2, r14)     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            if (r2 != 0) goto L_0x015a
            goto L_0x01b5
        L_0x015a:
            java.lang.String r2 = qv.C11820c.a(r2)     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
        L_0x015e:
            if (r3 != 0) goto L_0x01ac
            java.lang.Class<QL.x> r3 = QL.x.class
            java.lang.String r3 = r3.getName()     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            kotlin.jvm.internal.C17542s.g(r3)     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            r5 = 36
            r7 = 2
            java.lang.String r5 = HJ.C15854t.s1(r3, r5, r13, r7, r13)     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            r8 = 46
            java.lang.String r5 = HJ.C15854t.o1(r5, r8, r13, r7, r13)     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            int r7 = r5.length()     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            if (r7 != 0) goto L_0x017d
            goto L_0x0183
        L_0x017d:
            java.lang.String r3 = "Kt"
            java.lang.String r3 = HJ.C15854t.P0(r5, r3)     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
        L_0x0183:
            java.lang.Thread r5 = java.lang.Thread.currentThread()     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            java.lang.String r5 = r5.getName()     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            java.lang.String r7 = "main"
            boolean r5 = HJ.C15854t.b0(r5, r7, r4)     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            if (r5 == 0) goto L_0x0196
            java.lang.String r5 = "m"
            goto L_0x0198
        L_0x0196:
            java.lang.String r5 = "b"
        L_0x0198:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            r7.<init>()     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            r7.append(r5)     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            java.lang.String r5 = "|"
            r7.append(r5)     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            r7.append(r3)     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            java.lang.String r3 = r7.toString()     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
        L_0x01ac:
            r9 = 0
            r7 = r15
            r8 = r3
            r10 = r14
            r11 = r2
            r6.a(r7, r8, r9, r10, r11)     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            goto L_0x0142
        L_0x01b5:
            com.ingka.ikea.timeslot.impl.data.remote.datasource.TimeSlotApiErrorModel r13 = (com.ingka.ikea.timeslot.impl.data.remote.datasource.TimeSlotApiErrorModel) r13     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            if (r13 == 0) goto L_0x01bf
            java.lang.String r13 = r13.toString()     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            if (r13 != 0) goto L_0x01c3
        L_0x01bf:
            java.lang.String r13 = r1.f()     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
        L_0x01c3:
            java.io.IOException r14 = new java.io.IOException     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            r14.<init>(r13)     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
            throw r14     // Catch:{ CancellationException -> 0x0065, all -> 0x0062 }
        L_0x01c9:
            XH.x$a r14 = XH.x.f139812b
            java.lang.Object r13 = XH.y.a(r13)
            java.lang.Object r13 = XH.x.b(r13)
        L_0x01d3:
            return r13
        L_0x01d4:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: wC.C15169c.a(java.lang.String, java.util.List, dI.e):java.lang.Object");
    }
}
