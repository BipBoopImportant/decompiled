package com.ingka.ikea.pushnotification.impl.worker;

import HJ.C15854t;
import Sx.c;
import YH.X;
import YH.g0;
import android.content.Context;
import androidx.work.C7037f;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.google.firebase.messaging.S;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import eE.C14400d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u00112\u00020\u0001:\u0001\rB%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/ingka/ikea/pushnotification/impl/worker/ProcessRemoteMessageWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "LSx/b;", "messageHandler", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;LSx/b;)V", "Landroidx/work/x$a;", "doWork", "(LdI/e;)Ljava/lang/Object;", "a", "Landroidx/work/WorkerParameters;", "b", "LSx/b;", "c", "pushnotification-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProcessRemoteMessageWorker extends CoroutineWorker {

    /* renamed from: c  reason: collision with root package name */
    public static final a f119624c = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final Set<String> f119625d = g0.h("PushNotificationService-MessageId", "PushNotificationService-MessageType", "PushNotificationService-MessageSentTime");

    /* renamed from: a  reason: collision with root package name */
    private final WorkerParameters f119626a;

    /* renamed from: b  reason: collision with root package name */
    private final Sx.b f119627b;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u000b*\u00020\u0006H\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u000bH\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0006XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0006XT¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00148\u0006XT¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148\u0006XT¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/ingka/ikea/pushnotification/impl/worker/ProcessRemoteMessageWorker$a;", "", "<init>", "()V", "LeE/d;", "workScheduler", "Lcom/google/firebase/messaging/S;", "remoteMessage", "LXH/N;", "b", "(LeE/d;Lcom/google/firebase/messaging/S;)V", "Landroidx/work/f;", "inputData", "a", "(LeE/d;Landroidx/work/f;)V", "d", "(Lcom/google/firebase/messaging/S;)Landroidx/work/f;", "LSx/c;", "c", "(Landroidx/work/f;)LSx/c;", "", "WORK_SCHEDULER_WORK_NAME", "Ljava/lang/String;", "MESSAGE_STRING_ID", "MESSAGE_STRING_TYPE", "MESSAGE_LONG_SENT_TIME", "", "METADATA_KEYS", "Ljava/util/Set;", "pushnotification-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARNING: Removed duplicated region for block: B:75:0x01e3  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x0200  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(eE.C14400d r34, androidx.work.C7037f r35) {
            /*
                r33 = this;
                r0 = r34
                r9 = r35
                java.lang.String r13 = "|"
                java.lang.String r14 = "b"
                java.lang.String r15 = "m"
                java.lang.String r12 = "main"
                java.lang.String r11 = "Kt"
                java.lang.Class<com.ingka.ikea.pushnotification.impl.worker.ProcessRemoteMessageWorker$a> r16 = com.ingka.ikea.pushnotification.impl.worker.ProcessRemoteMessageWorker.a.class
                java.lang.String r1 = "workScheduler"
                kotlin.jvm.internal.C17542s.j(r0, r1)
                java.lang.String r1 = "inputData"
                kotlin.jvm.internal.C17542s.j(r9, r1)
                r8 = 36
                r6 = 2
                r4 = 0
                qv.e r1 = qv.e.DEBUG     // Catch:{ Exception -> 0x0049 }
                qv.d r2 = qv.d.f102012a     // Catch:{ Exception -> 0x0049 }
                java.util.List r2 = r2.a()     // Catch:{ Exception -> 0x0049 }
                java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch:{ Exception -> 0x0049 }
                java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x0049 }
                r3.<init>()     // Catch:{ Exception -> 0x0049 }
                java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x0049 }
            L_0x0031:
                boolean r5 = r2.hasNext()     // Catch:{ Exception -> 0x0049 }
                r10 = 0
                if (r5 == 0) goto L_0x0051
                java.lang.Object r5 = r2.next()     // Catch:{ Exception -> 0x0049 }
                r7 = r5
                qv.b r7 = (qv.C11819b) r7     // Catch:{ Exception -> 0x0049 }
                boolean r7 = r7.b(r1, r10)     // Catch:{ Exception -> 0x0049 }
                if (r7 == 0) goto L_0x0031
                r3.add(r5)     // Catch:{ Exception -> 0x0049 }
                goto L_0x0031
            L_0x0049:
                r0 = move-exception
            L_0x004a:
                r32 = r11
                r17 = r14
                r14 = r12
                goto L_0x01c9
            L_0x0051:
                java.util.Iterator r2 = r3.iterator()     // Catch:{ Exception -> 0x0049 }
                r3 = r4
                r5 = r3
            L_0x0057:
                boolean r7 = r2.hasNext()     // Catch:{ Exception -> 0x0049 }
                if (r7 == 0) goto L_0x00c8
                java.lang.Object r7 = r2.next()     // Catch:{ Exception -> 0x0049 }
                r17 = r7
                qv.b r17 = (qv.C11819b) r17     // Catch:{ Exception -> 0x0049 }
                r7 = 0
                if (r3 != 0) goto L_0x0075
                java.lang.String r3 = "Scheduling PushProcess worker"
                java.lang.String r3 = qv.C11818a.a(r3, r7)     // Catch:{ Exception -> 0x0049 }
                if (r3 != 0) goto L_0x0071
                goto L_0x00c8
            L_0x0071:
                java.lang.String r3 = qv.C11820c.a(r3)     // Catch:{ Exception -> 0x0049 }
            L_0x0075:
                if (r5 != 0) goto L_0x00b7
                java.lang.String r5 = r16.getName()     // Catch:{ Exception -> 0x0049 }
                kotlin.jvm.internal.C17542s.g(r5)     // Catch:{ Exception -> 0x0049 }
                java.lang.String r7 = HJ.C15854t.s1(r5, r8, r4, r6, r4)     // Catch:{ Exception -> 0x0049 }
                r8 = 46
                java.lang.String r7 = HJ.C15854t.o1(r7, r8, r4, r6, r4)     // Catch:{ Exception -> 0x0049 }
                int r8 = r7.length()     // Catch:{ Exception -> 0x0049 }
                if (r8 != 0) goto L_0x008f
                goto L_0x0093
            L_0x008f:
                java.lang.String r5 = HJ.C15854t.P0(r7, r11)     // Catch:{ Exception -> 0x0049 }
            L_0x0093:
                java.lang.Thread r7 = java.lang.Thread.currentThread()     // Catch:{ Exception -> 0x0049 }
                java.lang.String r7 = r7.getName()     // Catch:{ Exception -> 0x0049 }
                r8 = 1
                boolean r7 = HJ.C15854t.b0(r7, r12, r8)     // Catch:{ Exception -> 0x0049 }
                if (r7 == 0) goto L_0x00a4
                r7 = r15
                goto L_0x00a5
            L_0x00a4:
                r7 = r14
            L_0x00a5:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0049 }
                r8.<init>()     // Catch:{ Exception -> 0x0049 }
                r8.append(r7)     // Catch:{ Exception -> 0x0049 }
                r8.append(r13)     // Catch:{ Exception -> 0x0049 }
                r8.append(r5)     // Catch:{ Exception -> 0x0049 }
                java.lang.String r5 = r8.toString()     // Catch:{ Exception -> 0x0049 }
            L_0x00b7:
                r18 = r1
                r19 = r5
                r20 = r10
                r7 = 0
                r21 = r7
                r22 = r3
                r17.a(r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x0049 }
                r8 = 36
                goto L_0x0057
            L_0x00c8:
                qv.e r1 = qv.e.DEBUG     // Catch:{ Exception -> 0x0049 }
                qv.d r2 = qv.d.f102012a     // Catch:{ Exception -> 0x0049 }
                java.util.List r2 = r2.a()     // Catch:{ Exception -> 0x0049 }
                java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch:{ Exception -> 0x0049 }
                java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x0049 }
                r3.<init>()     // Catch:{ Exception -> 0x0049 }
                java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x0049 }
            L_0x00db:
                boolean r5 = r2.hasNext()     // Catch:{ Exception -> 0x0049 }
                r7 = 1
                if (r5 == 0) goto L_0x00f3
                java.lang.Object r5 = r2.next()     // Catch:{ Exception -> 0x0049 }
                r8 = r5
                qv.b r8 = (qv.C11819b) r8     // Catch:{ Exception -> 0x0049 }
                boolean r7 = r8.b(r1, r7)     // Catch:{ Exception -> 0x0049 }
                if (r7 == 0) goto L_0x00db
                r3.add(r5)     // Catch:{ Exception -> 0x0049 }
                goto L_0x00db
            L_0x00f3:
                java.util.Iterator r2 = r3.iterator()     // Catch:{ Exception -> 0x0049 }
                r3 = r4
                r5 = r3
            L_0x00f9:
                boolean r8 = r2.hasNext()     // Catch:{ Exception -> 0x0049 }
                if (r8 == 0) goto L_0x0121
                java.lang.Object r8 = r2.next()     // Catch:{ Exception -> 0x016c }
                r24 = r8
                qv.b r24 = (qv.C11819b) r24     // Catch:{ Exception -> 0x016c }
                r8 = 0
                if (r3 != 0) goto L_0x0127
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0049 }
                r3.<init>()     // Catch:{ Exception -> 0x0049 }
                java.lang.String r10 = "InputData: "
                r3.append(r10)     // Catch:{ Exception -> 0x0049 }
                r3.append(r9)     // Catch:{ Exception -> 0x0049 }
                java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0049 }
                java.lang.String r3 = qv.C11818a.a(r3, r8)     // Catch:{ Exception -> 0x0049 }
                if (r3 != 0) goto L_0x0123
            L_0x0121:
                r10 = 1
                goto L_0x0182
            L_0x0123:
                java.lang.String r3 = qv.C11820c.a(r3)     // Catch:{ Exception -> 0x0049 }
            L_0x0127:
                if (r5 != 0) goto L_0x0170
                java.lang.String r5 = r16.getName()     // Catch:{ Exception -> 0x016c }
                kotlin.jvm.internal.C17542s.g(r5)     // Catch:{ Exception -> 0x016c }
                r10 = 36
                java.lang.String r8 = HJ.C15854t.s1(r5, r10, r4, r6, r4)     // Catch:{ Exception -> 0x016c }
                r10 = 46
                java.lang.String r8 = HJ.C15854t.o1(r8, r10, r4, r6, r4)     // Catch:{ Exception -> 0x016c }
                int r18 = r8.length()     // Catch:{ Exception -> 0x016c }
                if (r18 != 0) goto L_0x0143
                goto L_0x0147
            L_0x0143:
                java.lang.String r5 = HJ.C15854t.P0(r8, r11)     // Catch:{ Exception -> 0x016c }
            L_0x0147:
                java.lang.Thread r8 = java.lang.Thread.currentThread()     // Catch:{ Exception -> 0x016c }
                java.lang.String r8 = r8.getName()     // Catch:{ Exception -> 0x016c }
                r10 = 1
                boolean r8 = HJ.C15854t.b0(r8, r12, r10)     // Catch:{ Exception -> 0x0049 }
                if (r8 == 0) goto L_0x0158
                r8 = r15
                goto L_0x0159
            L_0x0158:
                r8 = r14
            L_0x0159:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0049 }
                r4.<init>()     // Catch:{ Exception -> 0x0049 }
                r4.append(r8)     // Catch:{ Exception -> 0x0049 }
                r4.append(r13)     // Catch:{ Exception -> 0x0049 }
                r4.append(r5)     // Catch:{ Exception -> 0x0049 }
                java.lang.String r5 = r4.toString()     // Catch:{ Exception -> 0x0049 }
                goto L_0x0171
            L_0x016c:
                r0 = move-exception
                r10 = 1
                goto L_0x004a
            L_0x0170:
                r10 = 1
            L_0x0171:
                r25 = r1
                r26 = r5
                r27 = r7
                r4 = 0
                r28 = r4
                r29 = r3
                r24.a(r25, r26, r27, r28, r29)     // Catch:{ Exception -> 0x0049 }
                r4 = 0
                goto L_0x00f9
            L_0x0182:
                java.lang.Class<com.ingka.ikea.pushnotification.impl.worker.ProcessRemoteMessageWorker> r1 = com.ingka.ikea.pushnotification.impl.worker.ProcessRemoteMessageWorker.class
                uI.d r7 = kotlin.jvm.internal.P.b(r1)     // Catch:{ Exception -> 0x0049 }
                androidx.work.e$a r1 = new androidx.work.e$a     // Catch:{ Exception -> 0x0049 }
                r1.<init>()     // Catch:{ Exception -> 0x0049 }
                androidx.work.z r2 = androidx.work.C7056z.CONNECTED     // Catch:{ Exception -> 0x0049 }
                androidx.work.e$a r1 = r1.b(r2)     // Catch:{ Exception -> 0x0049 }
                androidx.work.e r8 = r1.a()     // Catch:{ Exception -> 0x0049 }
                eE.a r4 = new eE.a     // Catch:{ Exception -> 0x0049 }
                java.lang.String r2 = "PushNotificationService-ProcessPushMessage"
                r17 = 86
                r19 = 0
                r3 = 0
                r20 = 0
                r22 = 0
                r24 = 0
                r1 = r4
                r30 = r4
                r4 = r20
                r6 = r8
                r31 = r7
                r7 = r22
                r9 = r35
                r10 = r24
                r32 = r11
                r11 = r17
                r17 = r14
                r14 = r12
                r12 = r19
                r1.<init>(r2, r3, r4, r6, r7, r9, r10, r11, r12)     // Catch:{ Exception -> 0x01c8 }
                r2 = r30
                r1 = r31
                r0.a(r1, r2)     // Catch:{ Exception -> 0x01c8 }
                return
            L_0x01c8:
                r0 = move-exception
            L_0x01c9:
                qv.e r1 = qv.e.ERROR
                qv.d r2 = qv.d.f102012a
                java.util.List r2 = r2.a()
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.util.Iterator r2 = r2.iterator()
            L_0x01dc:
                boolean r4 = r2.hasNext()
                r9 = 0
                if (r4 == 0) goto L_0x01f4
                java.lang.Object r4 = r2.next()
                r5 = r4
                qv.b r5 = (qv.C11819b) r5
                boolean r5 = r5.b(r1, r9)
                if (r5 == 0) goto L_0x01dc
                r3.add(r4)
                goto L_0x01dc
            L_0x01f4:
                java.util.Iterator r2 = r3.iterator()
                r3 = 0
                r4 = 0
            L_0x01fa:
                boolean r5 = r2.hasNext()
                if (r5 == 0) goto L_0x0280
                java.lang.Object r5 = r2.next()
                qv.b r5 = (qv.C11819b) r5
                if (r4 != 0) goto L_0x0214
                java.lang.String r4 = "Exception when scheduling PushWorker"
                java.lang.String r4 = qv.C11818a.a(r4, r0)
                if (r4 == 0) goto L_0x0280
                java.lang.String r4 = qv.C11820c.a(r4)
            L_0x0214:
                r10 = r4
                if (r3 != 0) goto L_0x0263
                java.lang.String r3 = r16.getName()
                kotlin.jvm.internal.C17542s.g(r3)
                r8 = 0
                r11 = 36
                r12 = 2
                java.lang.String r4 = HJ.C15854t.s1(r3, r11, r8, r12, r8)
                r7 = 46
                java.lang.String r4 = HJ.C15854t.o1(r4, r7, r8, r12, r8)
                int r6 = r4.length()
                if (r6 != 0) goto L_0x0235
                r6 = r32
                goto L_0x023b
            L_0x0235:
                r6 = r32
                java.lang.String r3 = HJ.C15854t.P0(r4, r6)
            L_0x023b:
                java.lang.Thread r4 = java.lang.Thread.currentThread()
                java.lang.String r4 = r4.getName()
                r11 = 1
                boolean r4 = HJ.C15854t.b0(r4, r14, r11)
                if (r4 == 0) goto L_0x024c
                r4 = r15
                goto L_0x024e
            L_0x024c:
                r4 = r17
            L_0x024e:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r4)
                r7.append(r13)
                r7.append(r3)
                java.lang.String r3 = r7.toString()
            L_0x0260:
                r18 = r3
                goto L_0x0269
            L_0x0263:
                r6 = r32
                r8 = 0
                r11 = 1
                r12 = 2
                goto L_0x0260
            L_0x0269:
                r3 = r5
                r4 = r1
                r5 = r18
                r19 = r6
                r6 = r9
                r20 = 46
                r7 = r0
                r21 = r8
                r8 = r10
                r3.a(r4, r5, r6, r7, r8)
                r4 = r10
                r3 = r18
                r32 = r19
                goto L_0x01fa
            L_0x0280:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.pushnotification.impl.worker.ProcessRemoteMessageWorker.a.a(eE.d, androidx.work.f):void");
        }

        public final void b(C14400d dVar, S s10) {
            C17542s.j(dVar, "workScheduler");
            C17542s.j(s10, "remoteMessage");
            a(dVar, d(s10));
        }

        public final c c(C7037f fVar) {
            C7037f fVar2 = fVar;
            C17542s.j(fVar2, "<this>");
            Map<String, Object> e10 = fVar.e();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry next : e10.entrySet()) {
                if (!ProcessRemoteMessageWorker.f119625d.contains((String) next.getKey())) {
                    linkedHashMap.put(next.getKey(), next.getValue());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (entry.getValue() instanceof String) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(X.e(linkedHashMap2.size()));
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                Object key = entry2.getKey();
                Object value = entry2.getValue();
                C17542s.h(value, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap3.put(key, (String) value);
            }
            String g10 = fVar2.g("PushNotificationService-MessageId");
            String g11 = fVar2.g("PushNotificationService-MessageType");
            long f10 = fVar2.f("PushNotificationService-MessageSentTime", -1);
            if (g10 == null || g11 == null || f10 == -1) {
                IllegalStateException illegalStateException = new IllegalStateException("Invalid values " + g10 + " " + g11 + " " + f10);
                e eVar = e.WARN;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next2 : d.f102012a.a()) {
                    if (((C11819b) next2).b(eVar, false)) {
                        arrayList.add(next2);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList) {
                    if (str == null) {
                        String a10 = C11818a.a((String) null, illegalStateException);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    if (str2 == null) {
                        String name = C7037f.class.getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str3 = str2;
                    bVar.a(eVar, str3, false, illegalStateException, str);
                    str2 = str3;
                }
            }
            return new c(g10 == null ? "" : g10, g11 == null ? "" : g11, f10, linkedHashMap3);
        }

        public final C7037f d(S s10) {
            C17542s.j(s10, "<this>");
            C7037f.a aVar = new C7037f.a();
            String B10 = s10.B();
            String str = "";
            if (B10 == null) {
                B10 = str;
            }
            aVar.i("PushNotificationService-MessageId", B10);
            String F10 = s10.F();
            if (F10 != null) {
                str = F10;
            }
            aVar.i("PushNotificationService-MessageType", str);
            aVar.h("PushNotificationService-MessageSentTime", s10.J());
            Map<String, String> x10 = s10.x();
            C17542s.i(x10, "getData(...)");
            aVar.d(X.x(x10));
            return aVar.a();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.pushnotification.impl.worker.ProcessRemoteMessageWorker", f = "ProcessRemoteMessageWorker.kt", l = {39}, m = "doWork")
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f119628c;

        /* renamed from: d  reason: collision with root package name */
        Object f119629d;

        /* renamed from: e  reason: collision with root package name */
        Object f119630e;

        /* renamed from: f  reason: collision with root package name */
        Object f119631f;

        /* renamed from: g  reason: collision with root package name */
        Object f119632g;

        /* renamed from: h  reason: collision with root package name */
        Object f119633h;

        /* renamed from: i  reason: collision with root package name */
        Object f119634i;

        /* renamed from: j  reason: collision with root package name */
        Object f119635j;

        /* renamed from: k  reason: collision with root package name */
        Object f119636k;

        /* renamed from: l  reason: collision with root package name */
        Object f119637l;

        /* renamed from: m  reason: collision with root package name */
        Object f119638m;

        /* renamed from: n  reason: collision with root package name */
        int f119639n;

        /* renamed from: o  reason: collision with root package name */
        int f119640o;

        /* renamed from: p  reason: collision with root package name */
        int f119641p;

        /* renamed from: q  reason: collision with root package name */
        int f119642q;

        /* renamed from: r  reason: collision with root package name */
        int f119643r;

        /* renamed from: s  reason: collision with root package name */
        /* synthetic */ Object f119644s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ ProcessRemoteMessageWorker f119645t;

        /* renamed from: u  reason: collision with root package name */
        int f119646u;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ProcessRemoteMessageWorker processRemoteMessageWorker, C17164e<? super b> eVar) {
            super(eVar);
            this.f119645t = processRemoteMessageWorker;
        }

        public final Object invokeSuspend(Object obj) {
            this.f119644s = obj;
            this.f119646u |= Integer.MIN_VALUE;
            return this.f119645t.doWork(this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProcessRemoteMessageWorker(Context context, WorkerParameters workerParameters, Sx.b bVar) {
        super(context, workerParameters);
        C17542s.j(context, "appContext");
        C17542s.j(workerParameters, "workerParams");
        C17542s.j(bVar, "messageHandler");
        this.f119626a = workerParameters;
        this.f119627b = bVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v7, resolved type: qv.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v9, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: kotlin.jvm.internal.O} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: com.ingka.ikea.pushnotification.impl.worker.ProcessRemoteMessageWorker} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0264 A[EDGE_INSN: B:142:0x0264->B:98:0x0264 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01d0 A[Catch:{ Exception -> 0x01e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01f1 A[Catch:{ Exception -> 0x01e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object doWork(dI.C17164e<? super androidx.work.C7054x.a> r28) {
        /*
            r27 = this;
            r1 = r27
            r0 = r28
            boolean r2 = r0 instanceof com.ingka.ikea.pushnotification.impl.worker.ProcessRemoteMessageWorker.b
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.ingka.ikea.pushnotification.impl.worker.ProcessRemoteMessageWorker$b r2 = (com.ingka.ikea.pushnotification.impl.worker.ProcessRemoteMessageWorker.b) r2
            int r3 = r2.f119646u
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f119646u = r3
            goto L_0x001c
        L_0x0017:
            com.ingka.ikea.pushnotification.impl.worker.ProcessRemoteMessageWorker$b r2 = new com.ingka.ikea.pushnotification.impl.worker.ProcessRemoteMessageWorker$b
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r3 = r2.f119644s
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f119646u
            java.lang.String r6 = "|"
            java.lang.String r7 = "b"
            java.lang.String r8 = "m"
            java.lang.String r9 = "main"
            java.lang.String r10 = "Kt"
            r15 = 1
            if (r5 == 0) goto L_0x0075
            if (r5 != r15) goto L_0x006d
            java.lang.Object r0 = r2.f119637l
            java.util.Iterator r0 = (java.util.Iterator) r0
            java.lang.Object r0 = r2.f119636k
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r0 = r2.f119635j
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r2.f119634i
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r2.f119633h
            qv.e r0 = (qv.e) r0
            java.lang.Object r0 = r2.f119632g
            com.ingka.ikea.pushnotification.impl.worker.ProcessRemoteMessageWorker r0 = (com.ingka.ikea.pushnotification.impl.worker.ProcessRemoteMessageWorker) r0
            java.lang.Object r0 = r2.f119631f
            com.ingka.ikea.pushnotification.impl.worker.ProcessRemoteMessageWorker r0 = (com.ingka.ikea.pushnotification.impl.worker.ProcessRemoteMessageWorker) r0
            java.lang.Object r0 = r2.f119630e
            r4 = r0
            kotlin.jvm.internal.O r4 = (kotlin.jvm.internal.O) r4
            java.lang.Object r0 = r2.f119629d
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r2.f119628c
            r2 = r0
            com.ingka.ikea.pushnotification.impl.worker.ProcessRemoteMessageWorker r2 = (com.ingka.ikea.pushnotification.impl.worker.ProcessRemoteMessageWorker) r2
            XH.y.b(r3)     // Catch:{ Exception -> 0x0066 }
            r24 = r7
            r25 = r8
            goto L_0x01b7
        L_0x0066:
            r0 = move-exception
        L_0x0067:
            r24 = r7
            r25 = r8
            goto L_0x026e
        L_0x006d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0075:
            XH.y.b(r3)
            kotlin.jvm.internal.O r3 = new kotlin.jvm.internal.O
            r3.<init>()
            com.ingka.ikea.pushnotification.impl.worker.ProcessRemoteMessageWorker$a r5 = f119624c     // Catch:{ Exception -> 0x0109 }
            androidx.work.WorkerParameters r11 = r1.f119626a     // Catch:{ Exception -> 0x0109 }
            androidx.work.f r11 = r11.d()     // Catch:{ Exception -> 0x0109 }
            java.lang.String r12 = "getInputData(...)"
            kotlin.jvm.internal.C17542s.i(r11, r12)     // Catch:{ Exception -> 0x0109 }
            Sx.c r5 = r5.c(r11)     // Catch:{ Exception -> 0x0109 }
            r3.f144348a = r5     // Catch:{ Exception -> 0x0109 }
            qv.e r5 = qv.e.DEBUG     // Catch:{ Exception -> 0x0109 }
            qv.d r11 = qv.d.f102012a     // Catch:{ Exception -> 0x0109 }
            java.util.List r11 = r11.a()     // Catch:{ Exception -> 0x0109 }
            java.lang.Iterable r11 = (java.lang.Iterable) r11     // Catch:{ Exception -> 0x0109 }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ Exception -> 0x0109 }
            r12.<init>()     // Catch:{ Exception -> 0x0109 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ Exception -> 0x0109 }
        L_0x00a3:
            boolean r17 = r11.hasNext()     // Catch:{ Exception -> 0x0109 }
            if (r17 == 0) goto L_0x00be
            java.lang.Object r13 = r11.next()     // Catch:{ Exception -> 0x00ba }
            r14 = r13
            qv.b r14 = (qv.C11819b) r14     // Catch:{ Exception -> 0x00ba }
            boolean r14 = r14.b(r5, r15)     // Catch:{ Exception -> 0x00ba }
            if (r14 == 0) goto L_0x00a3
            r12.add(r13)     // Catch:{ Exception -> 0x00ba }
            goto L_0x00a3
        L_0x00ba:
            r0 = move-exception
            r2 = r1
            r4 = r3
            goto L_0x0067
        L_0x00be:
            java.util.Iterator r11 = r12.iterator()     // Catch:{ Exception -> 0x0109 }
            r17 = r12
            r13 = 0
            r14 = 0
        L_0x00c6:
            boolean r18 = r11.hasNext()     // Catch:{ Exception -> 0x0109 }
            if (r18 == 0) goto L_0x017a
            java.lang.Object r23 = r11.next()     // Catch:{ Exception -> 0x0109 }
            r17 = r23
            qv.b r17 = (qv.C11819b) r17     // Catch:{ Exception -> 0x0109 }
            if (r13 != 0) goto L_0x010d
            T r15 = r3.f144348a     // Catch:{ Exception -> 0x0109 }
            r24 = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0105 }
            r7.<init>()     // Catch:{ Exception -> 0x0105 }
            r25 = r8
            java.lang.String r8 = "Handling message "
            r7.append(r8)     // Catch:{ Exception -> 0x0100 }
            r7.append(r15)     // Catch:{ Exception -> 0x0100 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0100 }
            r8 = 0
            java.lang.String r7 = qv.C11818a.a(r7, r8)     // Catch:{ Exception -> 0x0100 }
            if (r7 != 0) goto L_0x00fa
            r26 = r4
            r4 = r23
            goto L_0x0182
        L_0x00fa:
            java.lang.String r7 = qv.C11820c.a(r7)     // Catch:{ Exception -> 0x0100 }
            r13 = r7
            goto L_0x0111
        L_0x0100:
            r0 = move-exception
        L_0x0101:
            r2 = r1
            r4 = r3
            goto L_0x026e
        L_0x0105:
            r0 = move-exception
        L_0x0106:
            r25 = r8
            goto L_0x0101
        L_0x0109:
            r0 = move-exception
            r24 = r7
            goto L_0x0106
        L_0x010d:
            r24 = r7
            r25 = r8
        L_0x0111:
            if (r14 != 0) goto L_0x015f
            java.lang.Class<com.ingka.ikea.pushnotification.impl.worker.ProcessRemoteMessageWorker> r7 = com.ingka.ikea.pushnotification.impl.worker.ProcessRemoteMessageWorker.class
            java.lang.String r7 = r7.getName()     // Catch:{ Exception -> 0x0100 }
            kotlin.jvm.internal.C17542s.g(r7)     // Catch:{ Exception -> 0x0100 }
            r26 = r4
            r8 = 36
            r14 = 2
            r15 = 0
            java.lang.String r4 = HJ.C15854t.s1(r7, r8, r15, r14, r15)     // Catch:{ Exception -> 0x0100 }
            r8 = 46
            java.lang.String r4 = HJ.C15854t.o1(r4, r8, r15, r14, r15)     // Catch:{ Exception -> 0x0100 }
            int r8 = r4.length()     // Catch:{ Exception -> 0x0100 }
            if (r8 != 0) goto L_0x0133
            goto L_0x0137
        L_0x0133:
            java.lang.String r7 = HJ.C15854t.P0(r4, r10)     // Catch:{ Exception -> 0x0100 }
        L_0x0137:
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ Exception -> 0x0100 }
            java.lang.String r4 = r4.getName()     // Catch:{ Exception -> 0x0100 }
            r8 = 1
            boolean r4 = HJ.C15854t.b0(r4, r9, r8)     // Catch:{ Exception -> 0x0100 }
            if (r4 == 0) goto L_0x0149
            r4 = r25
            goto L_0x014b
        L_0x0149:
            r4 = r24
        L_0x014b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0100 }
            r8.<init>()     // Catch:{ Exception -> 0x0100 }
            r8.append(r4)     // Catch:{ Exception -> 0x0100 }
            r8.append(r6)     // Catch:{ Exception -> 0x0100 }
            r8.append(r7)     // Catch:{ Exception -> 0x0100 }
            java.lang.String r4 = r8.toString()     // Catch:{ Exception -> 0x0100 }
            r14 = r4
            goto L_0x0161
        L_0x015f:
            r26 = r4
        L_0x0161:
            r20 = 1
            r18 = r5
            r19 = r14
            r4 = 0
            r21 = r4
            r22 = r13
            r17.a(r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x0100 }
            r17 = r23
            r7 = r24
            r8 = r25
            r4 = r26
            r15 = 1
            goto L_0x00c6
        L_0x017a:
            r26 = r4
            r24 = r7
            r25 = r8
            r4 = r17
        L_0x0182:
            Sx.b r7 = r1.f119627b     // Catch:{ Exception -> 0x0100 }
            T r8 = r3.f144348a     // Catch:{ Exception -> 0x0100 }
            Sx.c r8 = (Sx.c) r8     // Catch:{ Exception -> 0x0100 }
            r2.f119628c = r1     // Catch:{ Exception -> 0x0100 }
            r2.f119629d = r0     // Catch:{ Exception -> 0x0100 }
            r2.f119630e = r3     // Catch:{ Exception -> 0x0100 }
            r2.f119631f = r1     // Catch:{ Exception -> 0x0100 }
            r2.f119632g = r1     // Catch:{ Exception -> 0x0100 }
            r2.f119633h = r5     // Catch:{ Exception -> 0x0100 }
            r2.f119634i = r13     // Catch:{ Exception -> 0x0100 }
            r2.f119635j = r14     // Catch:{ Exception -> 0x0100 }
            r2.f119636k = r12     // Catch:{ Exception -> 0x0100 }
            r2.f119637l = r11     // Catch:{ Exception -> 0x0100 }
            r2.f119638m = r4     // Catch:{ Exception -> 0x0100 }
            r4 = 1
            r2.f119639n = r4     // Catch:{ Exception -> 0x0100 }
            r5 = 0
            r2.f119640o = r5     // Catch:{ Exception -> 0x0100 }
            r2.f119641p = r5     // Catch:{ Exception -> 0x0100 }
            r2.f119642q = r5     // Catch:{ Exception -> 0x0100 }
            r2.f119643r = r5     // Catch:{ Exception -> 0x0100 }
            r2.f119646u = r4     // Catch:{ Exception -> 0x0100 }
            java.lang.Object r0 = r7.g(r8, r2)     // Catch:{ Exception -> 0x0100 }
            r2 = r26
            if (r0 != r2) goto L_0x01b5
            return r2
        L_0x01b5:
            r2 = r1
            r4 = r3
        L_0x01b7:
            qv.e r0 = qv.e.DEBUG     // Catch:{ Exception -> 0x01e2 }
            qv.d r3 = qv.d.f102012a     // Catch:{ Exception -> 0x01e2 }
            java.util.List r3 = r3.a()     // Catch:{ Exception -> 0x01e2 }
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch:{ Exception -> 0x01e2 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x01e2 }
            r5.<init>()     // Catch:{ Exception -> 0x01e2 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x01e2 }
        L_0x01ca:
            boolean r7 = r3.hasNext()     // Catch:{ Exception -> 0x01e2 }
            if (r7 == 0) goto L_0x01e5
            java.lang.Object r7 = r3.next()     // Catch:{ Exception -> 0x01e2 }
            r8 = r7
            qv.b r8 = (qv.C11819b) r8     // Catch:{ Exception -> 0x01e2 }
            r11 = 0
            boolean r8 = r8.b(r0, r11)     // Catch:{ Exception -> 0x01e2 }
            if (r8 == 0) goto L_0x01ca
            r5.add(r7)     // Catch:{ Exception -> 0x01e2 }
            goto L_0x01ca
        L_0x01e2:
            r0 = move-exception
            goto L_0x026e
        L_0x01e5:
            java.util.Iterator r3 = r5.iterator()     // Catch:{ Exception -> 0x01e2 }
            r5 = 0
            r15 = 0
        L_0x01eb:
            boolean r7 = r3.hasNext()     // Catch:{ Exception -> 0x01e2 }
            if (r7 == 0) goto L_0x0264
            java.lang.Object r7 = r3.next()     // Catch:{ Exception -> 0x01e2 }
            r17 = r7
            qv.b r17 = (qv.C11819b) r17     // Catch:{ Exception -> 0x01e2 }
            r7 = 0
            if (r5 != 0) goto L_0x0209
            java.lang.String r5 = "Finished handling message"
            java.lang.String r5 = qv.C11818a.a(r5, r7)     // Catch:{ Exception -> 0x01e2 }
            if (r5 != 0) goto L_0x0205
            goto L_0x0264
        L_0x0205:
            java.lang.String r5 = qv.C11820c.a(r5)     // Catch:{ Exception -> 0x01e2 }
        L_0x0209:
            if (r15 != 0) goto L_0x0256
            java.lang.Class r8 = r2.getClass()     // Catch:{ Exception -> 0x01e2 }
            java.lang.String r8 = r8.getName()     // Catch:{ Exception -> 0x01e2 }
            kotlin.jvm.internal.C17542s.g(r8)     // Catch:{ Exception -> 0x01e2 }
            r11 = 36
            r12 = 2
            r13 = 0
            java.lang.String r14 = HJ.C15854t.s1(r8, r11, r13, r12, r13)     // Catch:{ Exception -> 0x01e2 }
            r11 = 46
            java.lang.String r14 = HJ.C15854t.o1(r14, r11, r13, r12, r13)     // Catch:{ Exception -> 0x01e2 }
            int r11 = r14.length()     // Catch:{ Exception -> 0x01e2 }
            if (r11 != 0) goto L_0x022b
            goto L_0x022f
        L_0x022b:
            java.lang.String r8 = HJ.C15854t.P0(r14, r10)     // Catch:{ Exception -> 0x01e2 }
        L_0x022f:
            java.lang.Thread r11 = java.lang.Thread.currentThread()     // Catch:{ Exception -> 0x01e2 }
            java.lang.String r11 = r11.getName()     // Catch:{ Exception -> 0x01e2 }
            r12 = 1
            boolean r11 = HJ.C15854t.b0(r11, r9, r12)     // Catch:{ Exception -> 0x01e2 }
            if (r11 == 0) goto L_0x0241
            r11 = r25
            goto L_0x0243
        L_0x0241:
            r11 = r24
        L_0x0243:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01e2 }
            r12.<init>()     // Catch:{ Exception -> 0x01e2 }
            r12.append(r11)     // Catch:{ Exception -> 0x01e2 }
            r12.append(r6)     // Catch:{ Exception -> 0x01e2 }
            r12.append(r8)     // Catch:{ Exception -> 0x01e2 }
            java.lang.String r8 = r12.toString()     // Catch:{ Exception -> 0x01e2 }
            r15 = r8
        L_0x0256:
            r20 = 0
            r18 = r0
            r19 = r15
            r21 = r7
            r22 = r5
            r17.a(r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x01e2 }
            goto L_0x01eb
        L_0x0264:
            androidx.work.x$a r0 = androidx.work.C7054x.a.c()
            java.lang.String r2 = "success(...)"
            kotlin.jvm.internal.C17542s.i(r0, r2)
            return r0
        L_0x026e:
            qv.e r3 = qv.e.ERROR
            qv.d r5 = qv.d.f102012a
            java.util.List r5 = r5.a()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0281:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x0299
            java.lang.Object r8 = r5.next()
            r11 = r8
            qv.b r11 = (qv.C11819b) r11
            r12 = 0
            boolean r11 = r11.b(r3, r12)
            if (r11 == 0) goto L_0x0281
            r7.add(r8)
            goto L_0x0281
        L_0x0299:
            java.util.Iterator r5 = r7.iterator()
            r7 = 0
            r15 = 0
        L_0x029f:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x0337
            java.lang.Object r8 = r5.next()
            r17 = r8
            qv.b r17 = (qv.C11819b) r17
            if (r15 != 0) goto L_0x02d7
            T r8 = r4.f144348a
            Sx.c r8 = (Sx.c) r8
            if (r8 == 0) goto L_0x02ba
            java.lang.String r15 = r8.c()
            goto L_0x02bb
        L_0x02ba:
            r15 = 0
        L_0x02bb:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r11 = "Exception in PushWorker type:"
            r8.append(r11)
            r8.append(r15)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = qv.C11818a.a(r8, r0)
            if (r8 == 0) goto L_0x0337
            java.lang.String r8 = qv.C11820c.a(r8)
            r15 = r8
        L_0x02d7:
            if (r7 != 0) goto L_0x0324
            java.lang.Class r7 = r2.getClass()
            java.lang.String r7 = r7.getName()
            kotlin.jvm.internal.C17542s.g(r7)
            r8 = 36
            r11 = 2
            r12 = 0
            java.lang.String r13 = HJ.C15854t.s1(r7, r8, r12, r11, r12)
            r14 = 46
            java.lang.String r13 = HJ.C15854t.o1(r13, r14, r12, r11, r12)
            int r16 = r13.length()
            if (r16 != 0) goto L_0x02f9
            goto L_0x02fd
        L_0x02f9:
            java.lang.String r7 = HJ.C15854t.P0(r13, r10)
        L_0x02fd:
            java.lang.Thread r13 = java.lang.Thread.currentThread()
            java.lang.String r13 = r13.getName()
            r8 = 1
            boolean r13 = HJ.C15854t.b0(r13, r9, r8)
            if (r13 == 0) goto L_0x030f
            r13 = r25
            goto L_0x0311
        L_0x030f:
            r13 = r24
        L_0x0311:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r13)
            r8.append(r6)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            goto L_0x0328
        L_0x0324:
            r11 = 2
            r12 = 0
            r14 = 46
        L_0x0328:
            r20 = 0
            r18 = r3
            r19 = r7
            r21 = r0
            r22 = r15
            r17.a(r18, r19, r20, r21, r22)
            goto L_0x029f
        L_0x0337:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.pushnotification.impl.worker.ProcessRemoteMessageWorker.doWork(dI.e):java.lang.Object");
    }
}
