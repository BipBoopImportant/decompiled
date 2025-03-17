package com.ingka.ikea.localnotification.impl;

import Ae.e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/ingka/ikea/localnotification/impl/LocalNotificationReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "LXH/N;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "LAe/e;", "c", "LAe/e;", "b", "()LAe/e;", "setAnalytics", "(LAe/e;)V", "analytics", "d", "a", "localnotification-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LocalNotificationReceiver extends a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f96533d = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public e f96534c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/ingka/ikea/localnotification/impl/LocalNotificationReceiver$a;", "", "<init>", "()V", "", "NOTIFICATION_ID_KEY", "Ljava/lang/String;", "NOTIFICATION_PURPOSE_KEY", "NOTIFICATION_SOURCE_KEY", "NOTIFICATION_CENTER_APP_LOCATION_VALUE", "localnotification-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final e b() {
        e eVar = this.f96534c;
        if (eVar != null) {
            return eVar;
        }
        C17542s.z("analytics");
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = r33.getExtras();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r32, android.content.Intent r33) {
        /*
            r31 = this;
            super.onReceive(r32, r33)
            r0 = 0
            if (r33 == 0) goto L_0x0017
            android.os.Bundle r1 = r33.getExtras()
            if (r1 == 0) goto L_0x0017
            java.lang.String r2 = "com.ingka.ikea.notificationId"
            int r1 = r1.getInt(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0018
        L_0x0017:
            r1 = r0
        L_0x0018:
            java.lang.String r2 = ""
            if (r33 == 0) goto L_0x002a
            android.os.Bundle r3 = r33.getExtras()
            if (r3 == 0) goto L_0x002a
            java.lang.String r4 = "com.ingka.ikea.purpose"
            java.lang.String r3 = r3.getString(r4)
            if (r3 != 0) goto L_0x002b
        L_0x002a:
            r3 = r2
        L_0x002b:
            if (r33 == 0) goto L_0x003d
            android.os.Bundle r4 = r33.getExtras()
            if (r4 == 0) goto L_0x003d
            java.lang.String r5 = "com.ingka.ikea.source"
            java.lang.String r4 = r4.getString(r5)
            if (r4 != 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r2 = r4
        L_0x003d:
            java.lang.String r4 = "|"
            java.lang.String r5 = "b"
            java.lang.String r6 = "m"
            java.lang.String r8 = "main"
            java.lang.String r9 = "Kt"
            r11 = 36
            java.lang.Class<com.ingka.ikea.localnotification.impl.LocalNotificationReceiver> r12 = com.ingka.ikea.localnotification.impl.LocalNotificationReceiver.class
            r13 = 2
            if (r1 != 0) goto L_0x00ef
            qv.e r1 = qv.e.DEBUG
            qv.d r2 = qv.d.f102012a
            java.util.List r2 = r2.a()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0061:
            boolean r14 = r2.hasNext()
            r15 = 0
            if (r14 == 0) goto L_0x0079
            java.lang.Object r14 = r2.next()
            r7 = r14
            qv.b r7 = (qv.C11819b) r7
            boolean r7 = r7.b(r1, r15)
            if (r7 == 0) goto L_0x0061
            r3.add(r14)
            goto L_0x0061
        L_0x0079:
            java.util.Iterator r2 = r3.iterator()
            r3 = r0
            r7 = r3
        L_0x007f:
            boolean r14 = r2.hasNext()
            if (r14 == 0) goto L_0x00ee
            java.lang.Object r14 = r2.next()
            qv.b r14 = (qv.C11819b) r14
            r10 = 0
            if (r3 != 0) goto L_0x009b
            java.lang.String r3 = "Notification id is null"
            java.lang.String r3 = qv.C11818a.a(r3, r10)
            if (r3 != 0) goto L_0x0097
            goto L_0x00ee
        L_0x0097:
            java.lang.String r3 = qv.C11820c.a(r3)
        L_0x009b:
            if (r7 != 0) goto L_0x00dd
            java.lang.String r7 = r12.getName()
            kotlin.jvm.internal.C17542s.g(r7)
            java.lang.String r15 = HJ.C15854t.s1(r7, r11, r0, r13, r0)
            r11 = 46
            java.lang.String r15 = HJ.C15854t.o1(r15, r11, r0, r13, r0)
            int r11 = r15.length()
            if (r11 != 0) goto L_0x00b5
            goto L_0x00b9
        L_0x00b5:
            java.lang.String r7 = HJ.C15854t.P0(r15, r9)
        L_0x00b9:
            java.lang.Thread r11 = java.lang.Thread.currentThread()
            java.lang.String r11 = r11.getName()
            r15 = 1
            boolean r11 = HJ.C15854t.b0(r11, r8, r15)
            if (r11 == 0) goto L_0x00ca
            r11 = r6
            goto L_0x00cb
        L_0x00ca:
            r11 = r5
        L_0x00cb:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r11)
            r15.append(r4)
            r15.append(r7)
            java.lang.String r7 = r15.toString()
        L_0x00dd:
            r11 = 0
            r15 = r1
            r16 = r7
            r17 = r11
            r18 = r10
            r19 = r3
            r14.a(r15, r16, r17, r18, r19)
            r15 = r11
            r11 = 36
            goto L_0x007f
        L_0x00ee:
            return
        L_0x00ef:
            qv.e r7 = qv.e.DEBUG
            qv.d r10 = qv.d.f102012a
            java.util.List r10 = r10.a()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x0102:
            boolean r14 = r10.hasNext()
            r15 = 0
            if (r14 == 0) goto L_0x011b
            java.lang.Object r14 = r10.next()
            r0 = r14
            qv.b r0 = (qv.C11819b) r0
            boolean r0 = r0.b(r7, r15)
            if (r0 == 0) goto L_0x0119
            r11.add(r14)
        L_0x0119:
            r0 = 0
            goto L_0x0102
        L_0x011b:
            java.util.Iterator r0 = r11.iterator()
            r10 = 0
            r11 = 0
        L_0x0121:
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x01b1
            java.lang.Object r14 = r0.next()
            r20 = r14
            qv.b r20 = (qv.C11819b) r20
            r14 = 0
            if (r10 != 0) goto L_0x014f
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r15 = "Notification dismissed: "
            r10.append(r15)
            r10.append(r1)
            java.lang.String r10 = r10.toString()
            java.lang.String r10 = qv.C11818a.a(r10, r14)
            if (r10 != 0) goto L_0x014b
            goto L_0x01b1
        L_0x014b:
            java.lang.String r10 = qv.C11820c.a(r10)
        L_0x014f:
            if (r11 != 0) goto L_0x0197
            java.lang.String r11 = r12.getName()
            kotlin.jvm.internal.C17542s.g(r11)
            r18 = r0
            r14 = 36
            r15 = 0
            java.lang.String r0 = HJ.C15854t.s1(r11, r14, r15, r13, r15)
            r14 = 46
            java.lang.String r0 = HJ.C15854t.o1(r0, r14, r15, r13, r15)
            int r19 = r0.length()
            if (r19 != 0) goto L_0x016e
            goto L_0x0172
        L_0x016e:
            java.lang.String r11 = HJ.C15854t.P0(r0, r9)
        L_0x0172:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            r13 = 1
            boolean r0 = HJ.C15854t.b0(r0, r8, r13)
            if (r0 == 0) goto L_0x0183
            r0 = r6
            goto L_0x0184
        L_0x0183:
            r0 = r5
        L_0x0184:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r0)
            r13.append(r4)
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            goto L_0x019c
        L_0x0197:
            r18 = r0
            r14 = 46
            r15 = 0
        L_0x019c:
            r21 = r7
            r22 = r11
            r0 = 0
            r23 = r0
            r13 = 0
            r24 = r13
            r25 = r10
            r20.a(r21, r22, r23, r24, r25)
            r15 = r0
            r0 = r18
            r13 = 2
            goto L_0x0121
        L_0x01b1:
            Ae.e r24 = r31.b()
            Ae.j r0 = Ae.j.ACTION_TAP
            java.lang.String r25 = r0.b()
            com.ingka.ikea.analytics.Interaction$Component r27 = com.ingka.ikea.analytics.Interaction$Component.NOTIFICATION_DISMISSED
            java.lang.String r0 = "component_value"
            XH.v r0 = XH.C16796C.a(r0, r2)
            java.lang.String r2 = "purpose"
            XH.v r2 = XH.C16796C.a(r2, r3)
            java.lang.String r3 = "app_location"
            java.lang.String r4 = "notification_center"
            XH.v r3 = XH.C16796C.a(r3, r4)
            java.lang.String r4 = "id"
            XH.v r1 = XH.C16796C.a(r4, r1)
            XH.v[] r0 = new XH.v[]{r0, r2, r3, r1}
            java.util.Map r26 = YH.X.m(r0)
            r29 = 8
            r30 = 0
            r28 = 0
            Ae.e.c.c(r24, r25, r26, r27, r28, r29, r30)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.localnotification.impl.LocalNotificationReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
