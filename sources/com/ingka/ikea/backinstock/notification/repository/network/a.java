package com.ingka.ikea.backinstock.notification.repository.network;

import Ae.e;
import XH.t;
import YH.C16877v;
import com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import lm.C11550a;
import qm.C11797a;
import qm.C11798b;
import tw.g;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJC\u0010\u0015\u001a\u00020\u00142\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001d\u001a\u00020\u001c2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ8\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010H@¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010#¨\u0006$"}, d2 = {"Lcom/ingka/ikea/backinstock/notification/repository/network/a;", "Lqm/b;", "Lqm/a;", "endpoint", "Ltw/g;", "networkParameters", "LAe/e;", "analytics", "<init>", "(Lqm/a;Ltw/g;LAe/e;)V", "Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$CashCarry;", "cashCarry", "Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$HomeDelivery;", "homeDelivery", "Llm/a$a;", "contactType", "", "itemNo", "itemType", "pushToken", "Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody;", "b", "(Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$CashCarry;Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$HomeDelivery;Llm/a$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody;", "LQL/x;", "LGK/E;", "response", "Llm/a$c;", "fulfilmentOption", "LXH/N;", "c", "(LQL/x;Llm/a$c;)V", "a", "(Llm/a$c;Llm/a$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Lqm/a;", "Ltw/g;", "LAe/e;", "backinstock-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements C11798b {

    /* renamed from: a  reason: collision with root package name */
    private final C11797a f93125a;

    /* renamed from: b  reason: collision with root package name */
    private final g f93126b;

    /* renamed from: c  reason: collision with root package name */
    private final e f93127c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.backinstock.notification.repository.network.BackInStockPushNotificationsRemoteDataSourceImpl", f = "BackInStockPushNotificationsRemoteDataSource.kt", l = {62}, m = "subscribeForNotification")
    /* renamed from: com.ingka.ikea.backinstock.notification.repository.network.a$a  reason: collision with other inner class name */
    static final class C2072a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f93128c;

        /* renamed from: d  reason: collision with root package name */
        Object f93129d;

        /* renamed from: e  reason: collision with root package name */
        Object f93130e;

        /* renamed from: f  reason: collision with root package name */
        Object f93131f;

        /* renamed from: g  reason: collision with root package name */
        Object f93132g;

        /* renamed from: h  reason: collision with root package name */
        Object f93133h;

        /* renamed from: i  reason: collision with root package name */
        Object f93134i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f93135j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ a f93136k;

        /* renamed from: l  reason: collision with root package name */
        int f93137l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2072a(a aVar, C17164e<? super C2072a> eVar) {
            super(eVar);
            this.f93136k = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f93135j = obj;
            this.f93137l |= Integer.MIN_VALUE;
            return this.f93136k.a((C11550a.c) null, (C11550a.C2253a) null, (String) null, (String) null, (String) null, this);
        }
    }

    public a(C11797a aVar, g gVar, e eVar) {
        C17542s.j(aVar, "endpoint");
        C17542s.j(gVar, "networkParameters");
        C17542s.j(eVar, "analytics");
        this.f93125a = aVar;
        this.f93126b = gVar;
        this.f93127c = eVar;
    }

    private final SubscribeNotificationBody b(SubscribeNotificationBody.CashCarry cashCarry, SubscribeNotificationBody.HomeDelivery homeDelivery, C11550a.C2253a aVar, String str, String str2, String str3) {
        SubscribeNotificationBody.Contact contact;
        if (aVar instanceof C11550a.C2253a.C2254a) {
            contact = new SubscribeNotificationBody.Contact(c.EMAIL.b(), ((C11550a.C2253a.C2254a) aVar).a());
        } else if (C17542s.e(aVar, C11550a.C2253a.b.f99207a)) {
            contact = null;
        } else {
            throw new t();
        }
        return new SubscribeNotificationBody(cashCarry, homeDelivery, contact, C16877v.e(new SubscribeNotificationBody.ItemKey(str, str2)), new SubscribeNotificationBody.Locale(this.f93126b.i(), this.f93126b.a()), new SubscribeNotificationBody.Consent(true, false), str3);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void c(QL.x<GK.C15777E> r14, lm.C11550a.c r15) {
        /*
            r13 = this;
            r0 = 0
            GK.E r1 = r14.d()     // Catch:{ Exception -> 0x0022 }
            if (r1 == 0) goto L_0x00cf
            java.lang.String r1 = r1.l()     // Catch:{ Exception -> 0x0022 }
            if (r1 == 0) goto L_0x00cf
            Yz.b r2 = Yz.b.f118278a     // Catch:{ Exception -> 0x0022 }
            kK.c r2 = r2.b()     // Catch:{ Exception -> 0x0022 }
            r2.a()     // Catch:{ Exception -> 0x0022 }
            com.ingka.ikea.backinstock.notification.repository.network.ErrorBody$a r3 = com.ingka.ikea.backinstock.notification.repository.network.ErrorBody.Companion     // Catch:{ Exception -> 0x0022 }
            kotlinx.serialization.KSerializer r3 = r3.serializer()     // Catch:{ Exception -> 0x0022 }
            java.lang.Object r0 = r2.c(r3, r1)     // Catch:{ Exception -> 0x0022 }
            goto L_0x00cf
        L_0x0022:
            r1 = move-exception
            qv.e r8 = qv.e.DEBUG
            qv.d r2 = qv.d.f102012a
            java.util.List r2 = r2.a()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0036:
            boolean r4 = r2.hasNext()
            r9 = 0
            if (r4 == 0) goto L_0x004e
            java.lang.Object r4 = r2.next()
            r5 = r4
            qv.b r5 = (qv.C11819b) r5
            boolean r5 = r5.b(r8, r9)
            if (r5 == 0) goto L_0x0036
            r3.add(r4)
            goto L_0x0036
        L_0x004e:
            java.util.Iterator r10 = r3.iterator()
            r2 = r0
            r3 = r2
        L_0x0054:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L_0x00cf
            java.lang.Object r4 = r10.next()
            qv.b r4 = (qv.C11819b) r4
            if (r2 != 0) goto L_0x0070
            java.lang.String r2 = "Exception when parsing errorBody"
            java.lang.String r2 = qv.C11818a.a(r2, r1)
            if (r2 != 0) goto L_0x006c
            goto L_0x00cf
        L_0x006c:
            java.lang.String r2 = qv.C11820c.a(r2)
        L_0x0070:
            r11 = r2
            if (r3 != 0) goto L_0x00c2
            java.lang.Class r2 = r14.getClass()
            java.lang.String r2 = r2.getName()
            kotlin.jvm.internal.C17542s.g(r2)
            r3 = 36
            r5 = 2
            java.lang.String r3 = HJ.C15854t.s1(r2, r3, r0, r5, r0)
            r6 = 46
            java.lang.String r3 = HJ.C15854t.o1(r3, r6, r0, r5, r0)
            int r5 = r3.length()
            if (r5 != 0) goto L_0x0092
            goto L_0x0098
        L_0x0092:
            java.lang.String r2 = "Kt"
            java.lang.String r2 = HJ.C15854t.P0(r3, r2)
        L_0x0098:
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            java.lang.String r5 = "main"
            r6 = 1
            boolean r3 = HJ.C15854t.b0(r3, r5, r6)
            if (r3 == 0) goto L_0x00ac
            java.lang.String r3 = "m"
            goto L_0x00ae
        L_0x00ac:
            java.lang.String r3 = "b"
        L_0x00ae:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r3 = "|"
            r5.append(r3)
            r5.append(r2)
            java.lang.String r3 = r5.toString()
        L_0x00c2:
            r12 = r3
            r2 = r4
            r3 = r8
            r4 = r12
            r5 = r9
            r6 = r1
            r7 = r11
            r2.a(r3, r4, r5, r6, r7)
            r2 = r11
            r3 = r12
            goto L_0x0054
        L_0x00cf:
            com.ingka.ikea.backinstock.notification.repository.network.ErrorBody r0 = (com.ingka.ikea.backinstock.notification.repository.network.ErrorBody) r0
            java.lang.String r1 = "fulfilment"
            java.lang.String r2 = "Signup for notifications failed"
            if (r0 == 0) goto L_0x0140
            java.lang.String r14 = r0.a()
            Ae.e r0 = r13.f93127c
            com.ingka.ikea.analytics.Interaction$Component r3 = com.ingka.ikea.analytics.Interaction$Component.BACK_IN_STOCK_NOTIFY_ME_CONFIRMATION
            java.lang.String r3 = r3.getValue()
            Ae.d r4 = Ae.d.SYS_ERROR
            java.lang.String r15 = com.ingka.ikea.backinstock.notification.repository.network.b.d(r15)
            XH.v r15 = XH.C16796C.a(r1, r15)
            java.util.Map r15 = YH.X.f(r15)
            r0.q(r3, r4, r14, r15)
            if (r14 == 0) goto L_0x013a
            int r15 = r14.hashCode()
            switch(r15) {
                case -2079291601: goto L_0x012e;
                case -1906266400: goto L_0x0122;
                case 1233549290: goto L_0x0116;
                case 1797722282: goto L_0x010a;
                case 2070757205: goto L_0x00fe;
                default: goto L_0x00fd;
            }
        L_0x00fd:
            goto L_0x013a
        L_0x00fe:
            java.lang.String r15 = "UNSUPPORTED_ZIP_CODE"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x0107
            goto L_0x013a
        L_0x0107:
            lm.b$f r14 = lm.b.f.f99220a
            goto L_0x0167
        L_0x010a:
            java.lang.String r15 = "ITEM_NOT_FOUND"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x0113
            goto L_0x013a
        L_0x0113:
            lm.b$c r14 = lm.b.c.f99217a
            goto L_0x0167
        L_0x0116:
            java.lang.String r15 = "INVALID_CONTACT_VALUE"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x011f
            goto L_0x013a
        L_0x011f:
            lm.b$a r14 = lm.b.a.f99215a
            goto L_0x0167
        L_0x0122:
            java.lang.String r15 = "NOT_SOLD"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x012b
            goto L_0x013a
        L_0x012b:
            lm.b$d r14 = lm.b.d.f99218a
            goto L_0x0167
        L_0x012e:
            java.lang.String r15 = "ITEM_ALREADY_IN_STOCK"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x0137
            goto L_0x013a
        L_0x0137:
            lm.b$b r14 = lm.b.C2260b.f99216a
            goto L_0x0167
        L_0x013a:
            java.io.IOException r14 = new java.io.IOException
            r14.<init>(r2)
            goto L_0x0167
        L_0x0140:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r2)
            Ae.e r2 = r13.f93127c
            com.ingka.ikea.analytics.Interaction$Component r3 = com.ingka.ikea.analytics.Interaction$Component.BACK_IN_STOCK_NOTIFY_ME_CONFIRMATION
            java.lang.String r3 = r3.getValue()
            Ae.d r4 = Ae.d.SYS_ERROR
            int r14 = r14.b()
            java.lang.String r14 = java.lang.String.valueOf(r14)
            java.lang.String r15 = com.ingka.ikea.backinstock.notification.repository.network.b.d(r15)
            XH.v r15 = XH.C16796C.a(r1, r15)
            java.util.Map r15 = YH.X.f(r15)
            r2.q(r3, r4, r14, r15)
            r14 = r0
        L_0x0167:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.backinstock.notification.repository.network.a.c(QL.x, lm.a$c):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(lm.C11550a.c r22, lm.C11550a.C2253a r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, dI.C17164e<? super XH.C16807N> r27) {
        /*
            r21 = this;
            r7 = r21
            r8 = r27
            boolean r0 = r8 instanceof com.ingka.ikea.backinstock.notification.repository.network.a.C2072a
            if (r0 == 0) goto L_0x0018
            r0 = r8
            com.ingka.ikea.backinstock.notification.repository.network.a$a r0 = (com.ingka.ikea.backinstock.notification.repository.network.a.C2072a) r0
            int r1 = r0.f93137l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0018
            int r1 = r1 - r2
            r0.f93137l = r1
        L_0x0016:
            r9 = r0
            goto L_0x001e
        L_0x0018:
            com.ingka.ikea.backinstock.notification.repository.network.a$a r0 = new com.ingka.ikea.backinstock.notification.repository.network.a$a
            r0.<init>(r7, r8)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r0 = r9.f93135j
            java.lang.Object r10 = eI.C17187b.f()
            int r1 = r9.f93137l
            r11 = 1
            if (r1 == 0) goto L_0x0058
            if (r1 != r11) goto L_0x0050
            java.lang.Object r1 = r9.f93134i
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r9.f93133h
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r9.f93132g
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r9.f93131f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r9.f93130e
            lm.a$a r2 = (lm.C11550a.C2253a) r2
            java.lang.Object r3 = r9.f93129d
            lm.a$c r3 = (lm.C11550a.c) r3
            java.lang.Object r4 = r9.f93128c
            com.ingka.ikea.backinstock.notification.repository.network.a r4 = (com.ingka.ikea.backinstock.notification.repository.network.a) r4
            XH.y.b(r0)
            r20 = r3
            r3 = r1
            r1 = r20
            goto L_0x0095
        L_0x0050:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0058:
            XH.y.b(r0)
            qm.a r12 = r7.f93125a
            com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody$CashCarry r1 = com.ingka.ikea.backinstock.notification.repository.network.b.e(r22)
            com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody$HomeDelivery r2 = com.ingka.ikea.backinstock.notification.repository.network.b.f(r22)
            r0 = r21
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody r0 = r0.b(r1, r2, r3, r4, r5, r6)
            r9.f93128c = r7
            r1 = r22
            r9.f93129d = r1
            r2 = r23
            r9.f93130e = r2
            r3 = r24
            r9.f93131f = r3
            r4 = r25
            r9.f93132g = r4
            r4 = r26
            r9.f93133h = r4
            r9.f93134i = r8
            r9.f93137l = r11
            java.lang.Object r0 = r12.a(r0, r9)
            if (r0 != r10) goto L_0x0094
            return r10
        L_0x0094:
            r4 = r7
        L_0x0095:
            QL.x r0 = (QL.x) r0
            boolean r5 = r0.e()
            if (r5 != 0) goto L_0x0169
            qv.e r5 = qv.e.DEBUG
            qv.d r6 = qv.d.f102012a
            java.util.List r6 = r6.a()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x00b0:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x00c8
            java.lang.Object r9 = r6.next()
            r10 = r9
            qv.b r10 = (qv.C11819b) r10
            r12 = 0
            boolean r10 = r10.b(r5, r12)
            if (r10 == 0) goto L_0x00b0
            r8.add(r9)
            goto L_0x00b0
        L_0x00c8:
            java.util.Iterator r6 = r8.iterator()
            r8 = 0
            r9 = r8
            r10 = r9
        L_0x00cf:
            boolean r12 = r6.hasNext()
            if (r12 == 0) goto L_0x0166
            java.lang.Object r12 = r6.next()
            qv.b r12 = (qv.C11819b) r12
            r13 = 0
            if (r9 != 0) goto L_0x0103
            int r9 = r0.b()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Subscribe for cash n carry failed: "
            r14.append(r15)
            r14.append(r9)
            java.lang.String r9 = "}"
            r14.append(r9)
            java.lang.String r9 = r14.toString()
            java.lang.String r9 = qv.C11818a.a(r9, r13)
            if (r9 != 0) goto L_0x00ff
            goto L_0x0166
        L_0x00ff:
            java.lang.String r9 = qv.C11820c.a(r9)
        L_0x0103:
            if (r10 != 0) goto L_0x0153
            java.lang.Class r10 = r4.getClass()
            java.lang.String r10 = r10.getName()
            kotlin.jvm.internal.C17542s.g(r10)
            r14 = 36
            r15 = 2
            java.lang.String r14 = HJ.C15854t.s1(r10, r14, r8, r15, r8)
            r13 = 46
            java.lang.String r13 = HJ.C15854t.o1(r14, r13, r8, r15, r8)
            int r14 = r13.length()
            if (r14 != 0) goto L_0x0124
            goto L_0x012a
        L_0x0124:
            java.lang.String r10 = "Kt"
            java.lang.String r10 = HJ.C15854t.P0(r13, r10)
        L_0x012a:
            java.lang.Thread r13 = java.lang.Thread.currentThread()
            java.lang.String r13 = r13.getName()
            java.lang.String r14 = "main"
            boolean r13 = HJ.C15854t.b0(r13, r14, r11)
            if (r13 == 0) goto L_0x013d
            java.lang.String r13 = "m"
            goto L_0x013f
        L_0x013d:
            java.lang.String r13 = "b"
        L_0x013f:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r13)
            java.lang.String r13 = "|"
            r14.append(r13)
            r14.append(r10)
            java.lang.String r10 = r14.toString()
        L_0x0153:
            r13 = 0
            r22 = r12
            r23 = r5
            r24 = r10
            r25 = r13
            r12 = 0
            r26 = r12
            r27 = r9
            r22.a(r23, r24, r25, r26, r27)
            goto L_0x00cf
        L_0x0166:
            r4.c(r0, r1)
        L_0x0169:
            Ae.e r13 = r4.f93127c
            Ae.j r0 = Ae.j.ACTION_SUCCESS
            java.lang.String r14 = r0.b()
            com.ingka.ikea.analytics.Interaction$Component r16 = com.ingka.ikea.analytics.Interaction$Component.BACK_IN_STOCK_NOTIFY_ME_CONFIRMATION
            java.lang.String r0 = "component_value"
            java.lang.String r2 = com.ingka.ikea.backinstock.notification.repository.network.b.c(r2)
            XH.v r0 = XH.C16796C.a(r0, r2)
            java.lang.String r2 = "item_id"
            XH.v r2 = XH.C16796C.a(r2, r3)
            java.lang.String r3 = "fulfilment"
            java.lang.String r1 = com.ingka.ikea.backinstock.notification.repository.network.b.d(r1)
            XH.v r1 = XH.C16796C.a(r3, r1)
            XH.v[] r0 = new XH.v[]{r0, r2, r1}
            java.util.Map r15 = YH.X.m(r0)
            r18 = 8
            r19 = 0
            r17 = 0
            Ae.e.c.c(r13, r14, r15, r16, r17, r18, r19)
            XH.N r0 = XH.C16807N.f139792a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.backinstock.notification.repository.network.a.a(lm.a$c, lm.a$a, java.lang.String, java.lang.String, java.lang.String, dI.e):java.lang.Object");
    }
}
