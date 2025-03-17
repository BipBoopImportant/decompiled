package kw;

import Gs.b;
import cw.d;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHB¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lkw/o;", "Lkw/n;", "LGs/b;", "inboxRepository", "Lcw/d;", "messageCenterRepository", "Llw/a;", "whatsNewInboxFeature", "Lkw/d;", "getContentUriUseCase", "<init>", "(LGs/b;Lcw/d;Llw/a;Lkw/d;)V", "LXH/N;", "a", "(LdI/e;)Ljava/lang/Object;", "LGs/b;", "b", "Lcw/d;", "c", "Llw/a;", "d", "Lkw/d;", "messaging-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o implements n {

    /* renamed from: a  reason: collision with root package name */
    private final b f25266a;

    /* renamed from: b  reason: collision with root package name */
    private final d f25267b;

    /* renamed from: c  reason: collision with root package name */
    private final lw.a f25268c;

    /* renamed from: d  reason: collision with root package name */
    private final d f25269d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.messaging.impl.domain.WhatsNewMessagesForInboxUseCaseImpl", f = "WhatsNewMessagesForInboxUseCase.kt", l = {36, 45, 59, 66}, m = "invoke")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: A  reason: collision with root package name */
        int f25270A;

        /* renamed from: B  reason: collision with root package name */
        int f25271B;

        /* renamed from: C  reason: collision with root package name */
        int f25272C;

        /* renamed from: D  reason: collision with root package name */
        /* synthetic */ Object f25273D;

        /* renamed from: E  reason: collision with root package name */
        final /* synthetic */ o f25274E;

        /* renamed from: F  reason: collision with root package name */
        int f25275F;

        /* renamed from: c  reason: collision with root package name */
        Object f25276c;

        /* renamed from: d  reason: collision with root package name */
        Object f25277d;

        /* renamed from: e  reason: collision with root package name */
        Object f25278e;

        /* renamed from: f  reason: collision with root package name */
        Object f25279f;

        /* renamed from: g  reason: collision with root package name */
        Object f25280g;

        /* renamed from: h  reason: collision with root package name */
        Object f25281h;

        /* renamed from: i  reason: collision with root package name */
        Object f25282i;

        /* renamed from: j  reason: collision with root package name */
        Object f25283j;

        /* renamed from: k  reason: collision with root package name */
        Object f25284k;

        /* renamed from: l  reason: collision with root package name */
        Object f25285l;

        /* renamed from: m  reason: collision with root package name */
        Object f25286m;

        /* renamed from: n  reason: collision with root package name */
        Object f25287n;

        /* renamed from: o  reason: collision with root package name */
        Object f25288o;

        /* renamed from: p  reason: collision with root package name */
        Object f25289p;

        /* renamed from: q  reason: collision with root package name */
        Object f25290q;

        /* renamed from: r  reason: collision with root package name */
        Object f25291r;

        /* renamed from: s  reason: collision with root package name */
        Object f25292s;

        /* renamed from: t  reason: collision with root package name */
        Object f25293t;

        /* renamed from: u  reason: collision with root package name */
        Object f25294u;

        /* renamed from: v  reason: collision with root package name */
        Object f25295v;

        /* renamed from: w  reason: collision with root package name */
        int f25296w;

        /* renamed from: x  reason: collision with root package name */
        int f25297x;

        /* renamed from: y  reason: collision with root package name */
        int f25298y;

        /* renamed from: z  reason: collision with root package name */
        int f25299z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(o oVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f25274E = oVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f25273D = obj;
            this.f25275F |= Integer.MIN_VALUE;
            return this.f25274E.a(this);
        }
    }

    public o(b bVar, d dVar, lw.a aVar, d dVar2) {
        C17542s.j(bVar, "inboxRepository");
        C17542s.j(dVar, "messageCenterRepository");
        C17542s.j(aVar, "whatsNewInboxFeature");
        C17542s.j(dVar2, "getContentUriUseCase");
        this.f25266a = bVar;
        this.f25267b = dVar;
        this.f25268c = aVar;
        this.f25269d = dVar2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: cw.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0295 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x029a  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(dI.C17164e<? super XH.C16807N> r35) {
        /*
            r34 = this;
            r0 = r34
            r1 = r35
            boolean r2 = r1 instanceof kw.o.a
            if (r2 == 0) goto L_0x0017
            r2 = r1
            kw.o$a r2 = (kw.o.a) r2
            int r3 = r2.f25275F
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f25275F = r3
            goto L_0x001c
        L_0x0017:
            kw.o$a r2 = new kw.o$a
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r3 = r2.f25273D
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f25275F
            r7 = 4
            r8 = 3
            r9 = 2
            r10 = 1
            if (r5 == 0) goto L_0x011c
            if (r5 == r10) goto L_0x0110
            if (r5 == r9) goto L_0x0094
            if (r5 == r8) goto L_0x006f
            if (r5 != r7) goto L_0x0067
            int r1 = r2.f25298y
            int r5 = r2.f25297x
            int r6 = r2.f25296w
            java.lang.Object r8 = r2.f25286m
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r2.f25285l
            cw.f r9 = (cw.f) r9
            java.lang.Object r9 = r2.f25283j
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r10 = r2.f25282i
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Object r12 = r2.f25281h
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r13 = r2.f25280g
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r14 = r2.f25279f
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r15 = r2.f25278e
            java.lang.Object r7 = r2.f25277d
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r11 = r2.f25276c
            kw.o r11 = (kw.o) r11
            XH.y.b(r3)
            r3 = r5
            r0 = r12
            r5 = 4
            r12 = r4
            goto L_0x0328
        L_0x0067:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x006f:
            int r1 = r2.f25297x
            int r5 = r2.f25296w
            java.lang.Object r6 = r2.f25281h
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r2.f25280g
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r2.f25279f
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r2.f25278e
            java.lang.Object r10 = r2.f25277d
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r11 = r2.f25276c
            kw.o r11 = (kw.o) r11
            XH.y.b(r3)
            XH.x r3 = (XH.x) r3
            r3.j()
            r12 = r4
            goto L_0x0298
        L_0x0094:
            int r1 = r2.f25298y
            int r5 = r2.f25297x
            int r7 = r2.f25296w
            java.lang.Object r10 = r2.f25295v
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r2.f25294u
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r2.f25293t
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r2.f25292s
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r2.f25291r
            java.util.Map r10 = (java.util.Map) r10
            java.lang.Object r11 = r2.f25290q
            java.util.Map r11 = (java.util.Map) r11
            java.lang.Object r12 = r2.f25289p
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r2.f25288o
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r2.f25287n
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r15 = r2.f25286m
            java.util.Collection r15 = (java.util.Collection) r15
            java.lang.Object r6 = r2.f25285l
            cw.f r6 = (cw.f) r6
            java.lang.Object r8 = r2.f25283j
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r2.f25282i
            java.util.Collection r9 = (java.util.Collection) r9
            r35 = r1
            java.lang.Object r1 = r2.f25281h
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r19 = r1
            java.lang.Object r1 = r2.f25280g
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r20 = r1
            java.lang.Object r1 = r2.f25279f
            java.util.List r1 = (java.util.List) r1
            r21 = r1
            java.lang.Object r1 = r2.f25278e
            r22 = r1
            java.lang.Object r1 = r2.f25277d
            dI.e r1 = (dI.C17164e) r1
            r23 = r1
            java.lang.Object r1 = r2.f25276c
            kw.o r1 = (kw.o) r1
            XH.y.b(r3)
            r0 = r35
            r32 = r8
            r8 = r2
            r2 = r23
            r23 = r15
            r15 = r9
            r9 = r32
            r33 = r4
            r4 = r3
            r3 = r22
            r22 = r14
            r14 = r6
            r6 = r21
            r21 = r13
            r13 = r12
            r12 = r33
            goto L_0x01f0
        L_0x0110:
            java.lang.Object r1 = r2.f25277d
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r5 = r2.f25276c
            kw.o r5 = (kw.o) r5
            XH.y.b(r3)
            goto L_0x0133
        L_0x011c:
            XH.y.b(r3)
            cw.d r3 = r0.f25267b
            TJ.g r3 = r3.a()
            r2.f25276c = r0
            r2.f25277d = r1
            r2.f25275F = r10
            java.lang.Object r3 = TJ.C16534i.B(r3, r2)
            if (r3 != r4) goto L_0x0132
            return r4
        L_0x0132:
            r5 = r0
        L_0x0133:
            r6 = r3
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x025b
            r7 = r6
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 10
            int r9 = YH.C16877v.y(r7, r9)
            r8.<init>(r9)
            java.util.Iterator r9 = r7.iterator()
            r15 = r8
            r10 = 0
            r11 = 0
            r12 = 0
            r8 = r2
            r2 = r1
            r1 = r5
            r5 = r7
        L_0x0152:
            boolean r13 = r9.hasNext()
            if (r13 == 0) goto L_0x024f
            java.lang.Object r13 = r9.next()
            r14 = r13
            cw.f r14 = (cw.f) r14
            java.lang.String r0 = r14.e()
            r19 = r4
            java.lang.String r4 = r14.l()
            r20 = r12
            java.lang.String r12 = r14.k()
            r21 = r11
            java.util.Map r11 = YH.X.c()
            r22 = r10
            java.lang.String r10 = "messageId"
            r35 = r12
            java.lang.String r12 = r14.e()
            r11.put(r10, r12)
            java.lang.String r10 = r14.c()
            if (r10 == 0) goto L_0x020d
            kw.d r12 = r1.f25269d
            r23 = r12
            android.net.Uri r12 = android.net.Uri.parse(r10)
            r8.f25276c = r1
            r8.f25277d = r2
            r8.f25278e = r3
            r8.f25279f = r6
            r8.f25280g = r7
            r8.f25281h = r5
            r8.f25282i = r15
            r8.f25283j = r9
            r8.f25284k = r13
            r8.f25285l = r14
            r8.f25286m = r15
            r8.f25287n = r0
            r8.f25288o = r4
            r13 = r35
            r8.f25289p = r13
            r8.f25290q = r11
            r8.f25291r = r11
            r8.f25292s = r10
            r8.f25293t = r10
            r8.f25294u = r10
            r8.f25295v = r10
            r10 = r22
            r8.f25296w = r10
            r35 = r0
            r0 = r21
            r8.f25297x = r0
            r0 = r20
            r8.f25298y = r0
            r0 = 0
            r8.f25299z = r0
            r8.f25270A = r0
            r8.f25271B = r0
            r8.f25272C = r0
            r0 = 2
            r8.f25275F = r0
            r0 = r23
            java.lang.Object r0 = r0.a(r12, r8)
            r12 = r19
            if (r0 != r12) goto L_0x01df
            return r12
        L_0x01df:
            r22 = r35
            r19 = r5
            r23 = r15
            r5 = r21
            r21 = r4
            r4 = r0
            r0 = r20
            r20 = r7
            r7 = r10
            r10 = r11
        L_0x01f0:
            java.lang.String r4 = (java.lang.String) r4
            r35 = r0
            if (r4 == 0) goto L_0x01fb
            java.lang.String r0 = "contentUri"
            r10.put(r0, r4)
        L_0x01fb:
            r10 = r7
            r27 = r13
            r7 = r20
            r26 = r21
            r25 = r22
            r0 = r23
            r20 = r35
            r21 = r5
            r5 = r19
            goto L_0x021c
        L_0x020d:
            r13 = r35
            r35 = r0
            r12 = r19
            r10 = r22
            r25 = r35
            r26 = r4
            r27 = r13
            r0 = r15
        L_0x021c:
            java.util.Map r30 = YH.X.b(r11)
            java.lang.String r4 = r14.i()
            if (r4 == 0) goto L_0x0236
            com.ingka.ikea.core.model.Image r11 = new com.ingka.ikea.core.model.Image
            java.lang.String r13 = r14.h()
            if (r13 != 0) goto L_0x0230
            java.lang.String r13 = ""
        L_0x0230:
            r11.<init>(r4, r13)
            r31 = r11
            goto L_0x0238
        L_0x0236:
            r31 = 0
        L_0x0238:
            long r28 = r14.j()
            Ps.c r4 = new Ps.c
            r24 = r4
            r24.<init>(r25, r26, r27, r28, r30, r31)
            r0.add(r4)
            r0 = r34
            r4 = r12
            r12 = r20
            r11 = r21
            goto L_0x0152
        L_0x024f:
            r12 = r4
            r0 = r15
            java.util.List r0 = (java.util.List) r0
            r11 = r1
            r9 = r3
            r5 = r10
            r10 = r2
            r2 = r8
            r8 = r6
            r6 = r0
            goto L_0x0262
        L_0x025b:
            r12 = r4
            r10 = r1
            r9 = r3
            r11 = r5
            r8 = r6
            r5 = 0
            r6 = 0
        L_0x0262:
            Gs.b r0 = r11.f25266a
            lw.a r1 = r11.f25268c
            if (r6 != 0) goto L_0x026f
            java.util.List r3 = YH.C16877v.n()
            r20 = r3
            goto L_0x0271
        L_0x026f:
            r20 = r6
        L_0x0271:
            Ps.a r21 = Ps.a.Other
            r2.f25276c = r11
            r2.f25277d = r10
            r2.f25278e = r9
            r2.f25279f = r8
            r2.f25280g = r6
            r2.f25281h = r6
            r2.f25296w = r5
            r3 = 0
            r2.f25297x = r3
            r3 = 3
            r2.f25275F = r3
            r22 = 1
            r18 = r0
            r19 = r1
            r23 = r2
            java.lang.Object r0 = r18.e(r19, r20, r21, r22, r23)
            if (r0 != r12) goto L_0x0296
            return r12
        L_0x0296:
            r7 = r6
            r1 = 0
        L_0x0298:
            if (r8 == 0) goto L_0x032a
            r0 = r8
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x02a6:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x02bd
            java.lang.Object r4 = r0.next()
            r13 = r4
            cw.f r13 = (cw.f) r13
            int r13 = r13.d()
            if (r13 <= 0) goto L_0x02a6
            r3.add(r4)
            goto L_0x02a6
        L_0x02bd:
            java.util.Iterator r0 = r3.iterator()
            r13 = r7
            r14 = r8
            r15 = r9
            r7 = r10
            r9 = r0
            r8 = r3
            r10 = r8
            r0 = r6
            r6 = r5
            r5 = r1
            r1 = 0
        L_0x02cc:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x032a
            java.lang.Object r3 = r9.next()
            r4 = r3
            cw.f r4 = (cw.f) r4
            r19 = r12
            Gs.b r12 = r11.f25266a
            r16 = r12
            Ps.b r12 = new Ps.b
            r17 = r1
            java.lang.String r1 = r4.e()
            r18 = r5
            lw.a r5 = r11.f25268c
            java.lang.String r5 = r5.d()
            r12.<init>(r1, r5)
            r2.f25276c = r11
            r2.f25277d = r7
            r2.f25278e = r15
            r2.f25279f = r14
            r2.f25280g = r13
            r2.f25281h = r0
            r2.f25282i = r10
            r2.f25283j = r9
            r2.f25284k = r3
            r2.f25285l = r4
            r2.f25286m = r8
            r2.f25296w = r6
            r1 = r18
            r2.f25297x = r1
            r3 = r17
            r2.f25298y = r3
            r4 = 0
            r2.f25299z = r4
            r5 = 4
            r2.f25275F = r5
            r4 = r16
            java.lang.Object r4 = r4.d(r12, r2)
            r12 = r19
            if (r4 != r12) goto L_0x0323
            return r12
        L_0x0323:
            r32 = r3
            r3 = r1
            r1 = r32
        L_0x0328:
            r5 = r3
            goto L_0x02cc
        L_0x032a:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kw.o.a(dI.e):java.lang.Object");
    }
}
