package com.ingka.ikea.pushnotification.impl;

import Zx.d;
import aA.C13909a;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B-\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/ingka/ikea/pushnotification/impl/RegisterClientPushTokenWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "LaA/a;", "sessionManager", "LZx/d;", "repo", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;LaA/a;LZx/d;)V", "Landroidx/work/x$a;", "doWork", "(LdI/e;)Ljava/lang/Object;", "a", "LaA/a;", "b", "LZx/d;", "pushnotification-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RegisterClientPushTokenWorker extends CoroutineWorker {

    /* renamed from: a  reason: collision with root package name */
    private final C13909a f119606a;

    /* renamed from: b  reason: collision with root package name */
    private final d f119607b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.pushnotification.impl.RegisterClientPushTokenWorker", f = "RegisterClientPushTokenWorker.kt", l = {30}, m = "doWork")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f119608c;

        /* renamed from: d  reason: collision with root package name */
        Object f119609d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f119610e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ RegisterClientPushTokenWorker f119611f;

        /* renamed from: g  reason: collision with root package name */
        int f119612g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(RegisterClientPushTokenWorker registerClientPushTokenWorker, C17164e<? super a> eVar) {
            super(eVar);
            this.f119611f = registerClientPushTokenWorker;
        }

        public final Object invokeSuspend(Object obj) {
            this.f119610e = obj;
            this.f119612g |= Integer.MIN_VALUE;
            return this.f119611f.doWork(this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RegisterClientPushTokenWorker(Context context, WorkerParameters workerParameters, C13909a aVar, d dVar) {
        super(context, workerParameters);
        C17542s.j(context, "appContext");
        C17542s.j(workerParameters, "workerParams");
        C17542s.j(aVar, "sessionManager");
        C17542s.j(dVar, "repo");
        this.f119606a = aVar;
        this.f119607b = dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object doWork(dI.C17164e<? super androidx.work.C7054x.a> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.ingka.ikea.pushnotification.impl.RegisterClientPushTokenWorker.a
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.ingka.ikea.pushnotification.impl.RegisterClientPushTokenWorker$a r0 = (com.ingka.ikea.pushnotification.impl.RegisterClientPushTokenWorker.a) r0
            int r1 = r0.f119612g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f119612g = r1
            goto L_0x0018
        L_0x0013:
            com.ingka.ikea.pushnotification.impl.RegisterClientPushTokenWorker$a r0 = new com.ingka.ikea.pushnotification.impl.RegisterClientPushTokenWorker$a
            r0.<init>(r12, r13)
        L_0x0018:
            java.lang.Object r1 = r0.f119610e
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f119612g
            r4 = 1
            if (r3 == 0) goto L_0x0039
            if (r3 != r4) goto L_0x0031
            java.lang.Object r13 = r0.f119609d
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r13 = r0.f119608c
            com.ingka.ikea.pushnotification.impl.RegisterClientPushTokenWorker r13 = (com.ingka.ikea.pushnotification.impl.RegisterClientPushTokenWorker) r13
            XH.y.b(r1)     // Catch:{ IOException -> 0x0056 }
            goto L_0x004c
        L_0x0031:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0039:
            XH.y.b(r1)
            Zx.d r1 = r12.f119607b     // Catch:{ IOException -> 0x0055 }
            r0.f119608c = r12     // Catch:{ IOException -> 0x0055 }
            r0.f119609d = r13     // Catch:{ IOException -> 0x0055 }
            r0.f119612g = r4     // Catch:{ IOException -> 0x0055 }
            java.lang.Object r13 = r1.e(r0)     // Catch:{ IOException -> 0x0055 }
            if (r13 != r2) goto L_0x004b
            return r2
        L_0x004b:
            r13 = r12
        L_0x004c:
            androidx.work.x$a r0 = androidx.work.C7054x.a.c()     // Catch:{ IOException -> 0x0056 }
            kotlin.jvm.internal.C17542s.g(r0)     // Catch:{ IOException -> 0x0056 }
            goto L_0x011a
        L_0x0055:
            r13 = r12
        L_0x0056:
            aA.a r0 = r13.f119606a
            boolean r0 = r0.isLoggedIn()
            if (r0 == 0) goto L_0x0065
            androidx.work.x$a r13 = androidx.work.C7054x.a.b()
        L_0x0062:
            r0 = r13
            goto L_0x0117
        L_0x0065:
            qv.e r0 = qv.e.DEBUG
            qv.d r1 = qv.d.f102012a
            java.util.List r1 = r1.a()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0078:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0090
            java.lang.Object r3 = r1.next()
            r5 = r3
            qv.b r5 = (qv.C11819b) r5
            r6 = 0
            boolean r5 = r5.b(r0, r6)
            if (r5 == 0) goto L_0x0078
            r2.add(r3)
            goto L_0x0078
        L_0x0090:
            java.util.Iterator r1 = r2.iterator()
            r2 = 0
            r3 = r2
            r5 = r3
        L_0x0097:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x010c
            java.lang.Object r6 = r1.next()
            qv.b r6 = (qv.C11819b) r6
            r9 = 0
            if (r3 != 0) goto L_0x00b3
            java.lang.String r3 = "Guest users should not register their icm token"
            java.lang.String r3 = qv.C11818a.a(r3, r9)
            if (r3 != 0) goto L_0x00af
            goto L_0x010c
        L_0x00af:
            java.lang.String r3 = qv.C11820c.a(r3)
        L_0x00b3:
            if (r5 != 0) goto L_0x0101
            java.lang.Class<com.ingka.ikea.pushnotification.impl.RegisterClientPushTokenWorker> r5 = com.ingka.ikea.pushnotification.impl.RegisterClientPushTokenWorker.class
            java.lang.String r5 = r5.getName()
            kotlin.jvm.internal.C17542s.g(r5)
            r7 = 36
            r8 = 2
            java.lang.String r7 = HJ.C15854t.s1(r5, r7, r2, r8, r2)
            r10 = 46
            java.lang.String r7 = HJ.C15854t.o1(r7, r10, r2, r8, r2)
            int r8 = r7.length()
            if (r8 != 0) goto L_0x00d2
            goto L_0x00d8
        L_0x00d2:
            java.lang.String r5 = "Kt"
            java.lang.String r5 = HJ.C15854t.P0(r7, r5)
        L_0x00d8:
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            java.lang.String r7 = r7.getName()
            java.lang.String r8 = "main"
            boolean r7 = HJ.C15854t.b0(r7, r8, r4)
            if (r7 == 0) goto L_0x00eb
            java.lang.String r7 = "m"
            goto L_0x00ed
        L_0x00eb:
            java.lang.String r7 = "b"
        L_0x00ed:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            java.lang.String r7 = "|"
            r8.append(r7)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
        L_0x0101:
            r11 = r5
            r8 = 0
            r5 = r6
            r6 = r0
            r7 = r11
            r10 = r3
            r5.a(r6, r7, r8, r9, r10)
            r5 = r11
            goto L_0x0097
        L_0x010c:
            Zx.d r13 = r13.f119607b
            r13.f()
            androidx.work.x$a r13 = androidx.work.C7054x.a.a()
            goto L_0x0062
        L_0x0117:
            kotlin.jvm.internal.C17542s.g(r0)
        L_0x011a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.pushnotification.impl.RegisterClientPushTokenWorker.doWork(dI.e):java.lang.Object");
    }
}
