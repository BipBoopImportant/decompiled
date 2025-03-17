package com.ingka.ikea.app.scanandgoonlineredesign.cleanup;

import QJ.M;
import QJ.Q;
import XH.C16807N;
import XH.y;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B7\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/cleanup/ScanAndGoCleanupWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "LQJ/M;", "dispatcher", "LOz/b;", "scanAndGoCleanUpUseCase", "LDw/b;", "ongoingInStoreOrderOrderRepository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;LQJ/M;LOz/b;LDw/b;)V", "Landroidx/work/x$a;", "doWork", "(LdI/e;)Ljava/lang/Object;", "a", "LQJ/M;", "b", "LOz/b;", "c", "LDw/b;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScanAndGoCleanupWorker extends CoroutineWorker {

    /* renamed from: a  reason: collision with root package name */
    private final M f91212a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Oz.b f91213b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Dw.b f91214c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.app.scanandgoonlineredesign.cleanup.ScanAndGoCleanupWorker", f = "ScanAndGoCleanupWorker.kt", l = {39}, m = "doWork")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f91215c;

        /* renamed from: d  reason: collision with root package name */
        Object f91216d;

        /* renamed from: e  reason: collision with root package name */
        Object f91217e;

        /* renamed from: f  reason: collision with root package name */
        Object f91218f;

        /* renamed from: g  reason: collision with root package name */
        int f91219g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f91220h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ ScanAndGoCleanupWorker f91221i;

        /* renamed from: j  reason: collision with root package name */
        int f91222j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ScanAndGoCleanupWorker scanAndGoCleanupWorker, C17164e<? super a> eVar) {
            super(eVar);
            this.f91221i = scanAndGoCleanupWorker;
        }

        public final Object invokeSuspend(Object obj) {
            this.f91220h = obj;
            this.f91222j |= Integer.MIN_VALUE;
            return this.f91221i.doWork(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.scanandgoonlineredesign.cleanup.ScanAndGoCleanupWorker$doWork$2$1", f = "ScanAndGoCleanupWorker.kt", l = {40, 43}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f91223c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ScanAndGoCleanupWorker f91224d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f91225e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ScanAndGoCleanupWorker scanAndGoCleanupWorker, String str, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f91224d = scanAndGoCleanupWorker;
            this.f91225e = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f91224d, this.f91225e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f91223c;
            if (i10 == 0) {
                y.b(obj);
                Oz.b c10 = this.f91224d.f91213b;
                String str = this.f91225e;
                this.f91223c = 1;
                if (c10.a(str, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else if (i10 == 2) {
                y.b(obj);
                return C16807N.f139792a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Dw.b b10 = this.f91224d.f91214c;
            this.f91223c = 2;
            if (b10.e(this) == f10) {
                return f10;
            }
            return C16807N.f139792a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScanAndGoCleanupWorker(Context context, WorkerParameters workerParameters, M m10, Oz.b bVar, Dw.b bVar2) {
        super(context, workerParameters);
        C17542s.j(context, "appContext");
        C17542s.j(workerParameters, "workerParams");
        C17542s.j(m10, "dispatcher");
        C17542s.j(bVar, "scanAndGoCleanUpUseCase");
        C17542s.j(bVar2, "ongoingInStoreOrderOrderRepository");
        this.f91212a = m10;
        this.f91213b = bVar;
        this.f91214c = bVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object doWork(dI.C17164e<? super androidx.work.C7054x.a> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.ingka.ikea.app.scanandgoonlineredesign.cleanup.ScanAndGoCleanupWorker.a
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.ingka.ikea.app.scanandgoonlineredesign.cleanup.ScanAndGoCleanupWorker$a r0 = (com.ingka.ikea.app.scanandgoonlineredesign.cleanup.ScanAndGoCleanupWorker.a) r0
            int r1 = r0.f91222j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f91222j = r1
            goto L_0x0018
        L_0x0013:
            com.ingka.ikea.app.scanandgoonlineredesign.cleanup.ScanAndGoCleanupWorker$a r0 = new com.ingka.ikea.app.scanandgoonlineredesign.cleanup.ScanAndGoCleanupWorker$a
            r0.<init>(r12, r13)
        L_0x0018:
            java.lang.Object r1 = r0.f91220h
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f91222j
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r13 = r0.f91218f
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r13 = r0.f91216d
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r13 = r0.f91215c
            com.ingka.ikea.app.scanandgoonlineredesign.cleanup.ScanAndGoCleanupWorker r13 = (com.ingka.ikea.app.scanandgoonlineredesign.cleanup.ScanAndGoCleanupWorker) r13
            XH.y.b(r1)
            goto L_0x0072
        L_0x0035:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x003d:
            XH.y.b(r1)
            androidx.work.f r1 = r12.getInputData()
            java.lang.String r3 = "getInputData(...)"
            kotlin.jvm.internal.C17542s.i(r1, r3)
            java.lang.Object r1 = ej.C11243a.b(r1)
            java.lang.Throwable r3 = XH.x.e(r1)
            r5 = 0
            r11 = 0
            if (r3 != 0) goto L_0x007c
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            QJ.M r6 = r12.f91212a
            com.ingka.ikea.app.scanandgoonlineredesign.cleanup.ScanAndGoCleanupWorker$b r7 = new com.ingka.ikea.app.scanandgoonlineredesign.cleanup.ScanAndGoCleanupWorker$b
            r7.<init>(r12, r3, r11)
            r0.f91215c = r12
            r0.f91216d = r13
            r0.f91217e = r1
            r0.f91218f = r3
            r0.f91219g = r5
            r0.f91222j = r4
            java.lang.Object r13 = QJ.C16310i.g(r6, r7, r0)
            if (r13 != r2) goto L_0x0072
            return r2
        L_0x0072:
            androidx.work.x$a r13 = androidx.work.C7054x.a.c()
            java.lang.String r0 = "success(...)"
            kotlin.jvm.internal.C17542s.i(r13, r0)
            return r13
        L_0x007c:
            qv.e r13 = qv.e.WARN
            qv.d r0 = qv.d.f102012a
            java.util.List r0 = r0.a()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x008f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00a6
            java.lang.Object r2 = r0.next()
            r6 = r2
            qv.b r6 = (qv.C11819b) r6
            boolean r6 = r6.b(r13, r5)
            if (r6 == 0) goto L_0x008f
            r1.add(r2)
            goto L_0x008f
        L_0x00a6:
            java.util.Iterator r0 = r1.iterator()
            r1 = r11
            r2 = r1
        L_0x00ac:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x011c
            java.lang.Object r5 = r0.next()
            qv.b r5 = (qv.C11819b) r5
            if (r1 != 0) goto L_0x00c5
            java.lang.String r1 = qv.C11818a.a(r11, r3)
            if (r1 != 0) goto L_0x00c1
            goto L_0x011c
        L_0x00c1:
            java.lang.String r1 = qv.C11820c.a(r1)
        L_0x00c5:
            if (r2 != 0) goto L_0x0113
            java.lang.Class<com.ingka.ikea.app.scanandgoonlineredesign.cleanup.ScanAndGoCleanupWorker> r2 = com.ingka.ikea.app.scanandgoonlineredesign.cleanup.ScanAndGoCleanupWorker.class
            java.lang.String r2 = r2.getName()
            kotlin.jvm.internal.C17542s.g(r2)
            r6 = 36
            r7 = 2
            java.lang.String r6 = HJ.C15854t.s1(r2, r6, r11, r7, r11)
            r8 = 46
            java.lang.String r6 = HJ.C15854t.o1(r6, r8, r11, r7, r11)
            int r7 = r6.length()
            if (r7 != 0) goto L_0x00e4
            goto L_0x00ea
        L_0x00e4:
            java.lang.String r2 = "Kt"
            java.lang.String r2 = HJ.C15854t.P0(r6, r2)
        L_0x00ea:
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r6 = r6.getName()
            java.lang.String r7 = "main"
            boolean r6 = HJ.C15854t.b0(r6, r7, r4)
            if (r6 == 0) goto L_0x00fd
            java.lang.String r6 = "m"
            goto L_0x00ff
        L_0x00fd:
            java.lang.String r6 = "b"
        L_0x00ff:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            java.lang.String r6 = "|"
            r7.append(r6)
            r7.append(r2)
            java.lang.String r2 = r7.toString()
        L_0x0113:
            r8 = 0
            r6 = r13
            r7 = r2
            r9 = r3
            r10 = r1
            r5.a(r6, r7, r8, r9, r10)
            goto L_0x00ac
        L_0x011c:
            androidx.work.x$a r13 = androidx.work.C7054x.a.a()
            java.lang.String r0 = "failure(...)"
            kotlin.jvm.internal.C17542s.i(r13, r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.scanandgoonlineredesign.cleanup.ScanAndGoCleanupWorker.doWork(dI.e):java.lang.Object");
    }
}
