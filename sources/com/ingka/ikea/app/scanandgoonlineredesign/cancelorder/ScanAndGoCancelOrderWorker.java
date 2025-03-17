package com.ingka.ikea.app.scanandgoonlineredesign.cancelorder;

import FB.C12860a;
import android.content.Context;
import androidx.work.C7037f;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sz.C15054a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u000fB-\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/cancelorder/ScanAndGoCancelOrderWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lsz/a;", "checkoutRepository", "LFB/a;", "localStoreSelectionRepository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lsz/a;LFB/a;)V", "Landroidx/work/x$a;", "doWork", "(LdI/e;)Ljava/lang/Object;", "a", "Lsz/a;", "b", "LFB/a;", "c", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScanAndGoCancelOrderWorker extends CoroutineWorker {

    /* renamed from: c  reason: collision with root package name */
    public static final a f91195c = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f91196d = 8;

    /* renamed from: a  reason: collision with root package name */
    private final C15054a f91197a;

    /* renamed from: b  reason: collision with root package name */
    private final C12860a f91198b;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/cancelorder/ScanAndGoCancelOrderWorker$a;", "", "<init>", "()V", "", "salesOrderId", "Landroidx/work/f;", "a", "(I)Landroidx/work/f;", "", "SALES_ORDER_ID", "Ljava/lang/String;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7037f a(int i10) {
            return new C7037f.a().g("salesOrderId", i10).a();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.app.scanandgoonlineredesign.cancelorder.ScanAndGoCancelOrderWorker", f = "ScanAndGoCancelOrderWorker.kt", l = {39}, m = "doWork")
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f91199c;

        /* renamed from: d  reason: collision with root package name */
        Object f91200d;

        /* renamed from: e  reason: collision with root package name */
        Object f91201e;

        /* renamed from: f  reason: collision with root package name */
        int f91202f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f91203g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ScanAndGoCancelOrderWorker f91204h;

        /* renamed from: i  reason: collision with root package name */
        int f91205i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ScanAndGoCancelOrderWorker scanAndGoCancelOrderWorker, C17164e<? super b> eVar) {
            super(eVar);
            this.f91204h = scanAndGoCancelOrderWorker;
        }

        public final Object invokeSuspend(Object obj) {
            this.f91203g = obj;
            this.f91205i |= Integer.MIN_VALUE;
            return this.f91204h.doWork(this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScanAndGoCancelOrderWorker(Context context, WorkerParameters workerParameters, C15054a aVar, C12860a aVar2) {
        super(context, workerParameters);
        C17542s.j(context, "appContext");
        C17542s.j(workerParameters, "workerParams");
        C17542s.j(aVar, "checkoutRepository");
        C17542s.j(aVar2, "localStoreSelectionRepository");
        this.f91197a = aVar;
        this.f91198b = aVar2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: com.ingka.ikea.app.scanandgoonlineredesign.cancelorder.ScanAndGoCancelOrderWorker} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object doWork(dI.C17164e<? super androidx.work.C7054x.a> r25) {
        /*
            r24 = this;
            r1 = r24
            r0 = r25
            boolean r2 = r0 instanceof com.ingka.ikea.app.scanandgoonlineredesign.cancelorder.ScanAndGoCancelOrderWorker.b
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.ingka.ikea.app.scanandgoonlineredesign.cancelorder.ScanAndGoCancelOrderWorker$b r2 = (com.ingka.ikea.app.scanandgoonlineredesign.cancelorder.ScanAndGoCancelOrderWorker.b) r2
            int r3 = r2.f91205i
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f91205i = r3
            goto L_0x001c
        L_0x0017:
            com.ingka.ikea.app.scanandgoonlineredesign.cancelorder.ScanAndGoCancelOrderWorker$b r2 = new com.ingka.ikea.app.scanandgoonlineredesign.cancelorder.ScanAndGoCancelOrderWorker$b
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r3 = r2.f91203g
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f91205i
            java.lang.String r6 = "|"
            java.lang.String r7 = "b"
            java.lang.String r8 = "m"
            java.lang.String r9 = "main"
            java.lang.String r10 = "Kt"
            r12 = 36
            r13 = 0
            r14 = 2
            r15 = 1
            r11 = 0
            if (r5 == 0) goto L_0x0055
            if (r5 != r15) goto L_0x004d
            java.lang.Object r0 = r2.f91201e
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r2.f91200d
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r2.f91199c
            r2 = r0
            com.ingka.ikea.app.scanandgoonlineredesign.cancelorder.ScanAndGoCancelOrderWorker r2 = (com.ingka.ikea.app.scanandgoonlineredesign.cancelorder.ScanAndGoCancelOrderWorker) r2
            XH.y.b(r3)     // Catch:{ Exception -> 0x004a }
            goto L_0x0141
        L_0x004a:
            r0 = move-exception
            goto L_0x014a
        L_0x004d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0055:
            XH.y.b(r3)
            androidx.work.f r3 = r24.getInputData()
            java.lang.String r5 = "salesOrderId"
            r15 = -1
            int r3 = r3.d(r5, r15)
            if (r3 != r15) goto L_0x0113
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Started Cancel order worker without salesOrderId"
            r0.<init>(r2)
            qv.e r2 = qv.e.ERROR
            qv.d r3 = qv.d.f102012a
            java.util.List r3 = r3.a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x007f:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0096
            java.lang.Object r5 = r3.next()
            r15 = r5
            qv.b r15 = (qv.C11819b) r15
            boolean r15 = r15.b(r2, r13)
            if (r15 == 0) goto L_0x007f
            r4.add(r5)
            goto L_0x007f
        L_0x0096:
            java.util.Iterator r3 = r4.iterator()
            r4 = r11
            r5 = r4
        L_0x009c:
            boolean r13 = r3.hasNext()
            if (r13 == 0) goto L_0x0109
            java.lang.Object r13 = r3.next()
            r17 = r13
            qv.b r17 = (qv.C11819b) r17
            if (r4 != 0) goto L_0x00b7
            java.lang.String r4 = qv.C11818a.a(r11, r0)
            if (r4 != 0) goto L_0x00b3
            goto L_0x0109
        L_0x00b3:
            java.lang.String r4 = qv.C11820c.a(r4)
        L_0x00b7:
            if (r5 != 0) goto L_0x00fb
            java.lang.Class<com.ingka.ikea.app.scanandgoonlineredesign.cancelorder.ScanAndGoCancelOrderWorker> r5 = com.ingka.ikea.app.scanandgoonlineredesign.cancelorder.ScanAndGoCancelOrderWorker.class
            java.lang.String r5 = r5.getName()
            kotlin.jvm.internal.C17542s.g(r5)
            java.lang.String r13 = HJ.C15854t.s1(r5, r12, r11, r14, r11)
            r15 = 46
            java.lang.String r13 = HJ.C15854t.o1(r13, r15, r11, r14, r11)
            int r15 = r13.length()
            if (r15 != 0) goto L_0x00d3
            goto L_0x00d7
        L_0x00d3:
            java.lang.String r5 = HJ.C15854t.P0(r13, r10)
        L_0x00d7:
            java.lang.Thread r13 = java.lang.Thread.currentThread()
            java.lang.String r13 = r13.getName()
            r15 = 1
            boolean r13 = HJ.C15854t.b0(r13, r9, r15)
            if (r13 == 0) goto L_0x00e8
            r13 = r8
            goto L_0x00e9
        L_0x00e8:
            r13 = r7
        L_0x00e9:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r13)
            r15.append(r6)
            r15.append(r5)
            java.lang.String r5 = r15.toString()
        L_0x00fb:
            r20 = 0
            r18 = r2
            r19 = r5
            r21 = r0
            r22 = r4
            r17.a(r18, r19, r20, r21, r22)
            goto L_0x009c
        L_0x0109:
            androidx.work.x$a r0 = androidx.work.C7054x.a.a()
            java.lang.String r2 = "failure(...)"
            kotlin.jvm.internal.C17542s.i(r0, r2)
            return r0
        L_0x0113:
            sz.a r5 = r1.f91197a     // Catch:{ Exception -> 0x0122 }
            FB.a r15 = r1.f91198b     // Catch:{ Exception -> 0x0122 }
            EB.d r15 = r15.c()     // Catch:{ Exception -> 0x0122 }
            if (r15 == 0) goto L_0x0125
            java.lang.String r15 = r15.e()     // Catch:{ Exception -> 0x0122 }
            goto L_0x0126
        L_0x0122:
            r0 = move-exception
            r2 = r1
            goto L_0x014a
        L_0x0125:
            r15 = r11
        L_0x0126:
            if (r15 != 0) goto L_0x012d
            java.lang.String r17 = ""
            r12 = r17
            goto L_0x012e
        L_0x012d:
            r12 = r15
        L_0x012e:
            r2.f91199c = r1     // Catch:{ Exception -> 0x0122 }
            r2.f91200d = r0     // Catch:{ Exception -> 0x0122 }
            r2.f91201e = r15     // Catch:{ Exception -> 0x0122 }
            r2.f91202f = r3     // Catch:{ Exception -> 0x0122 }
            r15 = 1
            r2.f91205i = r15     // Catch:{ Exception -> 0x0122 }
            java.lang.Object r0 = r5.a(r12, r3, r2)     // Catch:{ Exception -> 0x0122 }
            if (r0 != r4) goto L_0x0140
            return r4
        L_0x0140:
            r2 = r1
        L_0x0141:
            androidx.work.x$a r0 = androidx.work.C7054x.a.c()     // Catch:{ Exception -> 0x004a }
            kotlin.jvm.internal.C17542s.g(r0)     // Catch:{ Exception -> 0x004a }
            goto L_0x01f6
        L_0x014a:
            qv.e r3 = qv.e.WARN
            qv.d r4 = qv.d.f102012a
            java.util.List r4 = r4.a()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x015d:
            boolean r12 = r4.hasNext()
            if (r12 == 0) goto L_0x0174
            java.lang.Object r12 = r4.next()
            r15 = r12
            qv.b r15 = (qv.C11819b) r15
            boolean r15 = r15.b(r3, r13)
            if (r15 == 0) goto L_0x015d
            r5.add(r12)
            goto L_0x015d
        L_0x0174:
            java.util.Iterator r4 = r5.iterator()
            r5 = r11
            r12 = r5
        L_0x017a:
            boolean r13 = r4.hasNext()
            if (r13 == 0) goto L_0x01ef
            java.lang.Object r13 = r4.next()
            r18 = r13
            qv.b r18 = (qv.C11819b) r18
            if (r5 != 0) goto L_0x0195
            java.lang.String r5 = qv.C11818a.a(r11, r0)
            if (r5 != 0) goto L_0x0191
            goto L_0x01ef
        L_0x0191:
            java.lang.String r5 = qv.C11820c.a(r5)
        L_0x0195:
            if (r12 != 0) goto L_0x01de
            java.lang.Class r12 = r2.getClass()
            java.lang.String r12 = r12.getName()
            kotlin.jvm.internal.C17542s.g(r12)
            r13 = 36
            java.lang.String r15 = HJ.C15854t.s1(r12, r13, r11, r14, r11)
            r13 = 46
            java.lang.String r15 = HJ.C15854t.o1(r15, r13, r11, r14, r11)
            int r16 = r15.length()
            if (r16 != 0) goto L_0x01b5
            goto L_0x01b9
        L_0x01b5:
            java.lang.String r12 = HJ.C15854t.P0(r15, r10)
        L_0x01b9:
            java.lang.Thread r15 = java.lang.Thread.currentThread()
            java.lang.String r15 = r15.getName()
            r11 = 1
            boolean r15 = HJ.C15854t.b0(r15, r9, r11)
            if (r15 == 0) goto L_0x01ca
            r15 = r8
            goto L_0x01cb
        L_0x01ca:
            r15 = r7
        L_0x01cb:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r15)
            r11.append(r6)
            r11.append(r12)
            java.lang.String r12 = r11.toString()
            goto L_0x01e0
        L_0x01de:
            r13 = 46
        L_0x01e0:
            r21 = 0
            r19 = r3
            r20 = r12
            r22 = r0
            r23 = r5
            r18.a(r19, r20, r21, r22, r23)
            r11 = 0
            goto L_0x017a
        L_0x01ef:
            androidx.work.x$a r0 = androidx.work.C7054x.a.a()
            kotlin.jvm.internal.C17542s.g(r0)
        L_0x01f6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.scanandgoonlineredesign.cancelorder.ScanAndGoCancelOrderWorker.doWork(dI.e):java.lang.Object");
    }
}
