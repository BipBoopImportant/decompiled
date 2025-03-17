package com.ingka.ikea.app.scanandgoonlineredesign.cleanup;

import Ry.f;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.C17542s;
import tz.C15100a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B-\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/cleanup/ScanAndGoClearCartWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "LRy/f;", "scanAndGoCartRepositoryFactory", "Ltz/a;", "getProfileState", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;LRy/f;Ltz/a;)V", "", "storeId", "familyCardId", "LXH/N;", "c", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Landroidx/work/x$a;", "doWork", "(LdI/e;)Ljava/lang/Object;", "a", "LRy/f;", "b", "Ltz/a;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScanAndGoClearCartWorker extends CoroutineWorker {

    /* renamed from: a  reason: collision with root package name */
    private final f f91226a;

    /* renamed from: b  reason: collision with root package name */
    private final C15100a f91227b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.cleanup.ScanAndGoClearCartWorker", f = "ScanAndGoClearCartWorker.kt", l = {49}, m = "clearCart")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f91228c;

        /* renamed from: d  reason: collision with root package name */
        Object f91229d;

        /* renamed from: e  reason: collision with root package name */
        Object f91230e;

        /* renamed from: f  reason: collision with root package name */
        Object f91231f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f91232g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ScanAndGoClearCartWorker f91233h;

        /* renamed from: i  reason: collision with root package name */
        int f91234i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ScanAndGoClearCartWorker scanAndGoClearCartWorker, C17164e<? super a> eVar) {
            super(eVar);
            this.f91233h = scanAndGoClearCartWorker;
        }

        public final Object invokeSuspend(Object obj) {
            this.f91232g = obj;
            this.f91234i |= Integer.MIN_VALUE;
            return this.f91233h.c((String) null, (String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.cleanup.ScanAndGoClearCartWorker", f = "ScanAndGoClearCartWorker.kt", l = {38, 36}, m = "doWork")
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f91235c;

        /* renamed from: d  reason: collision with root package name */
        Object f91236d;

        /* renamed from: e  reason: collision with root package name */
        Object f91237e;

        /* renamed from: f  reason: collision with root package name */
        Object f91238f;

        /* renamed from: g  reason: collision with root package name */
        Object f91239g;

        /* renamed from: h  reason: collision with root package name */
        Object f91240h;

        /* renamed from: i  reason: collision with root package name */
        Object f91241i;

        /* renamed from: j  reason: collision with root package name */
        int f91242j;

        /* renamed from: k  reason: collision with root package name */
        /* synthetic */ Object f91243k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ ScanAndGoClearCartWorker f91244l;

        /* renamed from: m  reason: collision with root package name */
        int f91245m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ScanAndGoClearCartWorker scanAndGoClearCartWorker, C17164e<? super b> eVar) {
            super(eVar);
            this.f91244l = scanAndGoClearCartWorker;
        }

        public final Object invokeSuspend(Object obj) {
            this.f91243k = obj;
            this.f91245m |= Integer.MIN_VALUE;
            return this.f91244l.doWork(this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScanAndGoClearCartWorker(Context context, WorkerParameters workerParameters, f fVar, C15100a aVar) {
        super(context, workerParameters);
        C17542s.j(context, "appContext");
        C17542s.j(workerParameters, "workerParams");
        C17542s.j(fVar, "scanAndGoCartRepositoryFactory");
        C17542s.j(aVar, "getProfileState");
        this.f91226a = fVar;
        this.f91227b = aVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(java.lang.String r24, java.lang.String r25, dI.C17164e<? super XH.C16807N> r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            boolean r4 = r3 instanceof com.ingka.ikea.app.scanandgoonlineredesign.cleanup.ScanAndGoClearCartWorker.a
            if (r4 == 0) goto L_0x001b
            r4 = r3
            com.ingka.ikea.app.scanandgoonlineredesign.cleanup.ScanAndGoClearCartWorker$a r4 = (com.ingka.ikea.app.scanandgoonlineredesign.cleanup.ScanAndGoClearCartWorker.a) r4
            int r5 = r4.f91234i
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.f91234i = r5
            goto L_0x0020
        L_0x001b:
            com.ingka.ikea.app.scanandgoonlineredesign.cleanup.ScanAndGoClearCartWorker$a r4 = new com.ingka.ikea.app.scanandgoonlineredesign.cleanup.ScanAndGoClearCartWorker$a
            r4.<init>(r0, r3)
        L_0x0020:
            java.lang.Object r5 = r4.f91232g
            java.lang.Object r6 = eI.C17187b.f()
            int r7 = r4.f91234i
            r8 = 1
            if (r7 == 0) goto L_0x004f
            if (r7 != r8) goto L_0x0047
            java.lang.Object r1 = r4.f91231f
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r4.f91230e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r4.f91229d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r4.f91228c
            com.ingka.ikea.app.scanandgoonlineredesign.cleanup.ScanAndGoClearCartWorker r1 = (com.ingka.ikea.app.scanandgoonlineredesign.cleanup.ScanAndGoClearCartWorker) r1
            XH.y.b(r5)
            XH.x r5 = (XH.x) r5
            java.lang.Object r2 = r5.j()
            goto L_0x006a
        L_0x0047:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x004f:
            XH.y.b(r5)
            Ry.f r5 = r0.f91226a
            Ry.e r5 = r5.invoke()
            r4.f91228c = r0
            r4.f91229d = r1
            r4.f91230e = r2
            r4.f91231f = r3
            r4.f91234i = r8
            java.lang.Object r2 = r5.l(r1, r2, r4)
            if (r2 != r6) goto L_0x0069
            return r6
        L_0x0069:
            r1 = r0
        L_0x006a:
            java.lang.Throwable r3 = XH.x.e(r2)
            java.lang.String r4 = "|"
            java.lang.String r5 = "b"
            java.lang.String r6 = "m"
            java.lang.String r7 = "main"
            java.lang.String r15 = "Kt"
            r13 = 36
            r9 = 0
            r12 = 2
            r11 = 0
            if (r3 != 0) goto L_0x0127
            XH.N r2 = (XH.C16807N) r2
            qv.e r2 = qv.e.DEBUG
            qv.d r3 = qv.d.f102012a
            java.util.List r3 = r3.a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0094:
            boolean r16 = r3.hasNext()
            if (r16 == 0) goto L_0x00ac
            java.lang.Object r8 = r3.next()
            r14 = r8
            qv.b r14 = (qv.C11819b) r14
            boolean r14 = r14.b(r2, r9)
            if (r14 == 0) goto L_0x00aa
            r10.add(r8)
        L_0x00aa:
            r8 = 1
            goto L_0x0094
        L_0x00ac:
            java.util.Iterator r3 = r10.iterator()
            r8 = r11
            r9 = r8
        L_0x00b2:
            boolean r10 = r3.hasNext()
            if (r10 == 0) goto L_0x01e6
            java.lang.Object r10 = r3.next()
            r16 = r10
            qv.b r16 = (qv.C11819b) r16
            r10 = 0
            if (r8 != 0) goto L_0x00d1
            java.lang.String r8 = "Cart cleared"
            java.lang.String r8 = qv.C11818a.a(r8, r10)
            if (r8 != 0) goto L_0x00cd
            goto L_0x01e6
        L_0x00cd:
            java.lang.String r8 = qv.C11820c.a(r8)
        L_0x00d1:
            if (r9 != 0) goto L_0x0117
            java.lang.Class r9 = r1.getClass()
            java.lang.String r9 = r9.getName()
            kotlin.jvm.internal.C17542s.g(r9)
            java.lang.String r14 = HJ.C15854t.s1(r9, r13, r11, r12, r11)
            r13 = 46
            java.lang.String r14 = HJ.C15854t.o1(r14, r13, r11, r12, r11)
            int r13 = r14.length()
            if (r13 != 0) goto L_0x00ef
            goto L_0x00f3
        L_0x00ef:
            java.lang.String r9 = HJ.C15854t.P0(r14, r15)
        L_0x00f3:
            java.lang.Thread r13 = java.lang.Thread.currentThread()
            java.lang.String r13 = r13.getName()
            r14 = 1
            boolean r13 = HJ.C15854t.b0(r13, r7, r14)
            if (r13 == 0) goto L_0x0104
            r13 = r6
            goto L_0x0105
        L_0x0104:
            r13 = r5
        L_0x0105:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r13)
            r14.append(r4)
            r14.append(r9)
            java.lang.String r9 = r14.toString()
        L_0x0117:
            r19 = 0
            r17 = r2
            r18 = r9
            r20 = r10
            r21 = r8
            r16.a(r17, r18, r19, r20, r21)
            r13 = 36
            goto L_0x00b2
        L_0x0127:
            qv.e r2 = qv.e.WARN
            qv.d r8 = qv.d.f102012a
            java.util.List r8 = r8.a()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x013a:
            boolean r13 = r8.hasNext()
            if (r13 == 0) goto L_0x0151
            java.lang.Object r13 = r8.next()
            r14 = r13
            qv.b r14 = (qv.C11819b) r14
            boolean r14 = r14.b(r2, r9)
            if (r14 == 0) goto L_0x013a
            r10.add(r13)
            goto L_0x013a
        L_0x0151:
            java.util.Iterator r8 = r10.iterator()
            r9 = r11
            r10 = r9
        L_0x0157:
            boolean r13 = r8.hasNext()
            if (r13 == 0) goto L_0x01e6
            java.lang.Object r13 = r8.next()
            qv.b r13 = (qv.C11819b) r13
            if (r9 != 0) goto L_0x0173
            java.lang.String r9 = "Failed to clear cart"
            java.lang.String r9 = qv.C11818a.a(r9, r3)
            if (r9 != 0) goto L_0x016f
            goto L_0x01e6
        L_0x016f:
            java.lang.String r9 = qv.C11820c.a(r9)
        L_0x0173:
            r16 = r9
            if (r10 != 0) goto L_0x01c0
            java.lang.Class r9 = r1.getClass()
            java.lang.String r9 = r9.getName()
            kotlin.jvm.internal.C17542s.g(r9)
            r14 = 36
            java.lang.String r10 = HJ.C15854t.s1(r9, r14, r11, r12, r11)
            r14 = 46
            java.lang.String r10 = HJ.C15854t.o1(r10, r14, r11, r12, r11)
            int r17 = r10.length()
            if (r17 != 0) goto L_0x0195
            goto L_0x0199
        L_0x0195:
            java.lang.String r9 = HJ.C15854t.P0(r10, r15)
        L_0x0199:
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            java.lang.String r10 = r10.getName()
            r12 = 1
            boolean r10 = HJ.C15854t.b0(r10, r7, r12)
            if (r10 == 0) goto L_0x01aa
            r10 = r6
            goto L_0x01ab
        L_0x01aa:
            r10 = r5
        L_0x01ab:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            r11.append(r4)
            r11.append(r9)
            java.lang.String r10 = r11.toString()
        L_0x01bd:
            r17 = r10
            goto L_0x01c4
        L_0x01c0:
            r12 = 1
            r14 = 46
            goto L_0x01bd
        L_0x01c4:
            r18 = 0
            r9 = r13
            r10 = r2
            r19 = 0
            r11 = r17
            r20 = r12
            r21 = 2
            r12 = r18
            r18 = 36
            r13 = r3
            r22 = r14
            r14 = r16
            r9.a(r10, r11, r12, r13, r14)
            r9 = r16
            r10 = r17
            r11 = r19
            r12 = r21
            goto L_0x0157
        L_0x01e6:
            XH.N r1 = XH.C16807N.f139792a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.scanandgoonlineredesign.cleanup.ScanAndGoClearCartWorker.c(java.lang.String, java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ca A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object doWork(dI.C17164e<? super androidx.work.C7054x.a> r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof com.ingka.ikea.app.scanandgoonlineredesign.cleanup.ScanAndGoClearCartWorker.b
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.ingka.ikea.app.scanandgoonlineredesign.cleanup.ScanAndGoClearCartWorker$b r2 = (com.ingka.ikea.app.scanandgoonlineredesign.cleanup.ScanAndGoClearCartWorker.b) r2
            int r3 = r2.f91245m
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f91245m = r3
            goto L_0x001c
        L_0x0017:
            com.ingka.ikea.app.scanandgoonlineredesign.cleanup.ScanAndGoClearCartWorker$b r2 = new com.ingka.ikea.app.scanandgoonlineredesign.cleanup.ScanAndGoClearCartWorker$b
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r3 = r2.f91243k
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f91245m
            r6 = 1
            r7 = 2
            if (r5 == 0) goto L_0x0072
            if (r5 == r6) goto L_0x004d
            if (r5 != r7) goto L_0x0045
            java.lang.Object r1 = r2.f91240h
            com.ingka.ikea.app.scanandgoonlineredesign.cleanup.ScanAndGoClearCartWorker r1 = (com.ingka.ikea.app.scanandgoonlineredesign.cleanup.ScanAndGoClearCartWorker) r1
            java.lang.Object r1 = r2.f91239g
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f91238f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f91236d
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r2.f91235c
            com.ingka.ikea.app.scanandgoonlineredesign.cleanup.ScanAndGoClearCartWorker r1 = (com.ingka.ikea.app.scanandgoonlineredesign.cleanup.ScanAndGoClearCartWorker) r1
            XH.y.b(r3)
            goto L_0x00cb
        L_0x0045:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x004d:
            int r1 = r2.f91242j
            java.lang.Object r5 = r2.f91240h
            com.ingka.ikea.app.scanandgoonlineredesign.cleanup.ScanAndGoClearCartWorker r5 = (com.ingka.ikea.app.scanandgoonlineredesign.cleanup.ScanAndGoClearCartWorker) r5
            java.lang.Object r6 = r2.f91239g
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r8 = r2.f91238f
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r2.f91237e
            java.lang.Object r10 = r2.f91236d
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r11 = r2.f91235c
            com.ingka.ikea.app.scanandgoonlineredesign.cleanup.ScanAndGoClearCartWorker r11 = (com.ingka.ikea.app.scanandgoonlineredesign.cleanup.ScanAndGoClearCartWorker) r11
            XH.y.b(r3)
            r16 = r5
            r5 = r1
            r1 = r10
            r10 = r9
            r9 = r8
            r8 = r6
            r6 = r16
            goto L_0x00ab
        L_0x0072:
            XH.y.b(r3)
            androidx.work.f r3 = r17.getInputData()
            java.lang.String r5 = "getInputData(...)"
            kotlin.jvm.internal.C17542s.i(r3, r5)
            java.lang.Object r9 = ej.C11243a.b(r3)
            java.lang.Throwable r3 = XH.x.e(r9)
            r5 = 0
            if (r3 != 0) goto L_0x00d5
            r3 = r9
            java.lang.String r3 = (java.lang.String) r3
            tz.a r8 = r0.f91227b
            r2.f91235c = r0
            r2.f91236d = r1
            r2.f91237e = r9
            r2.f91238f = r3
            r2.f91239g = r3
            r2.f91240h = r0
            r2.f91242j = r5
            r2.f91245m = r6
            java.lang.Object r6 = r8.a(r2)
            if (r6 != r4) goto L_0x00a5
            return r4
        L_0x00a5:
            r11 = r0
            r8 = r3
            r10 = r9
            r9 = r8
            r3 = r6
            r6 = r11
        L_0x00ab:
            r12 = r3
            rz.K r12 = (rz.K) r12
            java.lang.String r12 = r12.a()
            r2.f91235c = r11
            r2.f91236d = r1
            r2.f91237e = r10
            r2.f91238f = r9
            r2.f91239g = r8
            r2.f91240h = r6
            r2.f91241i = r3
            r2.f91242j = r5
            r2.f91245m = r7
            java.lang.Object r1 = r6.c(r8, r12, r2)
            if (r1 != r4) goto L_0x00cb
            return r4
        L_0x00cb:
            androidx.work.x$a r1 = androidx.work.C7054x.a.c()
            java.lang.String r2 = "success(...)"
            kotlin.jvm.internal.C17542s.i(r1, r2)
            return r1
        L_0x00d5:
            qv.e r1 = qv.e.WARN
            qv.d r2 = qv.d.f102012a
            java.util.List r2 = r2.a()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x00e8:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x00ff
            java.lang.Object r8 = r2.next()
            r9 = r8
            qv.b r9 = (qv.C11819b) r9
            boolean r9 = r9.b(r1, r5)
            if (r9 == 0) goto L_0x00e8
            r4.add(r8)
            goto L_0x00e8
        L_0x00ff:
            java.util.Iterator r2 = r4.iterator()
            r4 = 0
            r5 = r4
            r8 = r5
        L_0x0106:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x0176
            java.lang.Object r9 = r2.next()
            r10 = r9
            qv.b r10 = (qv.C11819b) r10
            if (r5 != 0) goto L_0x0120
            java.lang.String r5 = qv.C11818a.a(r4, r3)
            if (r5 != 0) goto L_0x011c
            goto L_0x0176
        L_0x011c:
            java.lang.String r5 = qv.C11820c.a(r5)
        L_0x0120:
            if (r8 != 0) goto L_0x016d
            java.lang.Class<com.ingka.ikea.app.scanandgoonlineredesign.cleanup.ScanAndGoClearCartWorker> r8 = com.ingka.ikea.app.scanandgoonlineredesign.cleanup.ScanAndGoClearCartWorker.class
            java.lang.String r8 = r8.getName()
            kotlin.jvm.internal.C17542s.g(r8)
            r9 = 36
            java.lang.String r9 = HJ.C15854t.s1(r8, r9, r4, r7, r4)
            r11 = 46
            java.lang.String r9 = HJ.C15854t.o1(r9, r11, r4, r7, r4)
            int r11 = r9.length()
            if (r11 != 0) goto L_0x013e
            goto L_0x0144
        L_0x013e:
            java.lang.String r8 = "Kt"
            java.lang.String r8 = HJ.C15854t.P0(r9, r8)
        L_0x0144:
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            java.lang.String r9 = r9.getName()
            java.lang.String r11 = "main"
            boolean r9 = HJ.C15854t.b0(r9, r11, r6)
            if (r9 == 0) goto L_0x0157
            java.lang.String r9 = "m"
            goto L_0x0159
        L_0x0157:
            java.lang.String r9 = "b"
        L_0x0159:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r9)
            java.lang.String r9 = "|"
            r11.append(r9)
            r11.append(r8)
            java.lang.String r8 = r11.toString()
        L_0x016d:
            r13 = 0
            r11 = r1
            r12 = r8
            r14 = r3
            r15 = r5
            r10.a(r11, r12, r13, r14, r15)
            goto L_0x0106
        L_0x0176:
            androidx.work.x$a r1 = androidx.work.C7054x.a.a()
            java.lang.String r2 = "failure(...)"
            kotlin.jvm.internal.C17542s.i(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.scanandgoonlineredesign.cleanup.ScanAndGoClearCartWorker.doWork(dI.e):java.lang.Object");
    }
}
