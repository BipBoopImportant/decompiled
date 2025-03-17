package fw;

import am.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import uK.C18148c;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\tB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\r"}, d2 = {"Lfw/b;", "Lfw/a;", "Lam/h;", "timeProvider", "<init>", "(Lam/h;)V", "Lcom/ingka/ikea/messagecenter/impl/data/endpoint/MessagesRemote;", "messagesRemote", "Lfw/c;", "a", "(Lcom/ingka/ikea/messagecenter/impl/data/endpoint/MessagesRemote;)Lfw/c;", "Lam/h;", "b", "messagecenter-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f73033b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private static final int f73034c = C18148c.InformationCircle.m();

    /* renamed from: a  reason: collision with root package name */
    private final h f73035a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfw/b$a;", "", "<init>", "()V", "", "fallbackIcon", "I", "messagecenter-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(h hVar) {
        C17542s.j(hVar, "timeProvider");
        this.f73035a = hVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:92:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x028b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public fw.c a(com.ingka.ikea.messagecenter.impl.data.endpoint.MessagesRemote r30) {
        /*
            r29 = this;
            java.lang.String r0 = "messagesRemote"
            r1 = r30
            kotlin.jvm.internal.C17542s.j(r1, r0)
            com.ingka.ikea.messagecenter.impl.data.endpoint.MessageListsRemote r0 = r30.a()
            java.util.List r0 = r0.b()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r4 = YH.C16877v.y(r0, r3)
            r2.<init>(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0020:
            boolean r4 = r0.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x0044
            java.lang.Object r4 = r0.next()
            com.ingka.ikea.messagecenter.impl.data.endpoint.AlertRemote r4 = (com.ingka.ikea.messagecenter.impl.data.endpoint.AlertRemote) r4
            cw.a r6 = new cw.a
            java.lang.String r7 = r4.b()
            com.ingka.ikea.messagecenter.impl.data.endpoint.Image r4 = r4.a()
            if (r4 == 0) goto L_0x003d
            java.lang.String r5 = r4.b()
        L_0x003d:
            r6.<init>(r7, r5)
            r2.add(r6)
            goto L_0x0020
        L_0x0044:
            com.ingka.ikea.messagecenter.impl.data.endpoint.MessageListsRemote r0 = r30.a()
            java.util.List r0 = r0.c()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r4 = new java.util.ArrayList
            int r6 = YH.C16877v.y(r0, r3)
            r4.<init>(r6)
            java.util.Iterator r6 = r0.iterator()
        L_0x005b:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x01fa
            java.lang.Object r0 = r6.next()
            r7 = r0
            com.ingka.ikea.messagecenter.impl.data.endpoint.PagesRemote r7 = (com.ingka.ikea.messagecenter.impl.data.endpoint.PagesRemote) r7
            java.lang.String r9 = r7.g()
            java.lang.String r10 = r7.j()
            java.lang.String r0 = r7.f()     // Catch:{ NoSuchElementException -> 0x0081 }
            if (r0 == 0) goto L_0x0083
            uK.c$a r8 = uK.C18148c.Companion     // Catch:{ NoSuchElementException -> 0x0081 }
            uK.c r0 = r8.a(r0)     // Catch:{ NoSuchElementException -> 0x0081 }
            int r0 = r0.m()     // Catch:{ NoSuchElementException -> 0x0081 }
            goto L_0x0085
        L_0x0081:
            r0 = move-exception
            goto L_0x0088
        L_0x0083:
            int r0 = f73034c     // Catch:{ NoSuchElementException -> 0x0081 }
        L_0x0085:
            r11 = r0
            goto L_0x015a
        L_0x0088:
            qv.e r8 = qv.e.ERROR
            qv.d r11 = qv.d.f102012a
            java.util.List r11 = r11.a()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x009b:
            boolean r13 = r11.hasNext()
            r15 = 0
            if (r13 == 0) goto L_0x00b3
            java.lang.Object r13 = r11.next()
            r14 = r13
            qv.b r14 = (qv.C11819b) r14
            boolean r14 = r14.b(r8, r15)
            if (r14 == 0) goto L_0x009b
            r12.add(r13)
            goto L_0x009b
        L_0x00b3:
            java.util.Iterator r17 = r12.iterator()
            r11 = r5
            r12 = r11
        L_0x00b9:
            boolean r13 = r17.hasNext()
            if (r13 == 0) goto L_0x0156
            java.lang.Object r13 = r17.next()
            qv.b r13 = (qv.C11819b) r13
            if (r11 != 0) goto L_0x00ed
            java.lang.String r11 = r7.f()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r3 = "message icon "
            r14.append(r3)
            r14.append(r11)
            java.lang.String r3 = " not found in SkapaIcons"
            r14.append(r3)
            java.lang.String r3 = r14.toString()
            java.lang.String r3 = qv.C11818a.a(r3, r0)
            if (r3 != 0) goto L_0x00e9
            goto L_0x0156
        L_0x00e9:
            java.lang.String r11 = qv.C11820c.a(r3)
        L_0x00ed:
            r3 = r11
            if (r12 != 0) goto L_0x013d
            java.lang.Class<fw.b> r11 = fw.b.class
            java.lang.String r11 = r11.getName()
            kotlin.jvm.internal.C17542s.g(r11)
            r12 = 36
            r14 = 2
            java.lang.String r12 = HJ.C15854t.s1(r11, r12, r5, r14, r5)
            r15 = 46
            java.lang.String r12 = HJ.C15854t.o1(r12, r15, r5, r14, r5)
            int r14 = r12.length()
            if (r14 != 0) goto L_0x010d
            goto L_0x0113
        L_0x010d:
            java.lang.String r11 = "Kt"
            java.lang.String r11 = HJ.C15854t.P0(r12, r11)
        L_0x0113:
            java.lang.Thread r12 = java.lang.Thread.currentThread()
            java.lang.String r12 = r12.getName()
            java.lang.String r14 = "main"
            r15 = 1
            boolean r12 = HJ.C15854t.b0(r12, r14, r15)
            if (r12 == 0) goto L_0x0127
            java.lang.String r12 = "m"
            goto L_0x0129
        L_0x0127:
            java.lang.String r12 = "b"
        L_0x0129:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r12)
            java.lang.String r12 = "|"
            r14.append(r12)
            r14.append(r11)
            java.lang.String r12 = r14.toString()
        L_0x013d:
            r18 = r12
            r11 = r13
            r12 = r8
            r13 = r18
            r15 = 0
            r14 = r15
            r19 = r15
            r15 = r0
            r16 = r3
            r11.a(r12, r13, r14, r15, r16)
            r11 = r3
            r12 = r18
            r15 = r19
            r3 = 10
            goto L_0x00b9
        L_0x0156:
            int r0 = f73034c
            goto L_0x0085
        L_0x015a:
            cw.c$a r0 = cw.c.Companion
            java.lang.String r3 = r7.k()
            cw.c r13 = r0.a(r3)
            java.lang.String r14 = r7.a()
            java.lang.String r0 = ","
            if (r14 == 0) goto L_0x018f
            r18 = 4
            r19 = 0
            java.lang.String r15 = " "
            java.lang.String r16 = ""
            r17 = 0
            java.lang.String r23 = HJ.C15854t.Q(r14, r15, r16, r17, r18, r19)
            if (r23 == 0) goto L_0x018f
            java.lang.String[] r24 = new java.lang.String[]{r0}
            r27 = 6
            r28 = 0
            r25 = 0
            r26 = 0
            java.util.List r3 = HJ.C15854t.Y0(r23, r24, r25, r26, r27, r28)
            r16 = r3
            goto L_0x0191
        L_0x018f:
            r16 = r5
        L_0x0191:
            java.lang.String r17 = r7.b()
            if (r17 == 0) goto L_0x01ba
            r21 = 4
            r22 = 0
            java.lang.String r18 = " "
            java.lang.String r19 = ""
            r20 = 0
            java.lang.String r23 = HJ.C15854t.Q(r17, r18, r19, r20, r21, r22)
            if (r23 == 0) goto L_0x01ba
            java.lang.String[] r24 = new java.lang.String[]{r0}
            r27 = 6
            r28 = 0
            r25 = 0
            r26 = 0
            java.util.List r0 = HJ.C15854t.Y0(r23, r24, r25, r26, r27, r28)
            r17 = r0
            goto L_0x01bc
        L_0x01ba:
            r17 = r5
        L_0x01bc:
            java.lang.String r12 = r7.h()
            java.lang.Boolean r0 = r7.c()
            r3 = 0
            if (r0 == 0) goto L_0x01ce
            boolean r0 = r0.booleanValue()
            r18 = r0
            goto L_0x01d0
        L_0x01ce:
            r18 = r3
        L_0x01d0:
            java.lang.Boolean r0 = r7.e()
            if (r0 == 0) goto L_0x01dd
            boolean r0 = r0.booleanValue()
            r19 = r0
            goto L_0x01df
        L_0x01dd:
            r19 = r3
        L_0x01df:
            java.lang.Long r14 = r7.i()
            java.lang.Long r15 = r7.d()
            cw.b r0 = new cw.b
            r21 = 2048(0x800, float:2.87E-42)
            r22 = 0
            r20 = 0
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r4.add(r0)
            r3 = 10
            goto L_0x005b
        L_0x01fa:
            com.ingka.ikea.messagecenter.impl.data.endpoint.MessageListsRemote r0 = r30.a()
            java.util.List r0 = r0.d()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 10
            int r3 = YH.C16877v.y(r0, r3)
            r1.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L_0x0213:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x02aa
            java.lang.Object r3 = r0.next()
            com.ingka.ikea.messagecenter.impl.data.endpoint.WhatsNewMessage r3 = (com.ingka.ikea.messagecenter.impl.data.endpoint.WhatsNewMessage) r3
            java.lang.String r7 = r3.b()
            java.lang.String r8 = r3.f()
            java.lang.String r9 = r3.e()
            com.ingka.ikea.messagecenter.impl.data.endpoint.WhatsNewContext r6 = r3.a()
            if (r6 == 0) goto L_0x0237
            java.lang.String r6 = r6.a()
            r10 = r6
            goto L_0x0238
        L_0x0237:
            r10 = r5
        L_0x0238:
            com.ingka.ikea.messagecenter.impl.data.endpoint.Image r6 = r3.c()
            if (r6 == 0) goto L_0x0244
            java.lang.String r6 = r6.b()
            r11 = r6
            goto L_0x0245
        L_0x0244:
            r11 = r5
        L_0x0245:
            com.ingka.ikea.messagecenter.impl.data.endpoint.Video r6 = r3.g()
            if (r6 == 0) goto L_0x0251
            java.lang.String r6 = r6.b()
            r12 = r6
            goto L_0x0252
        L_0x0251:
            r12 = r5
        L_0x0252:
            com.ingka.ikea.messagecenter.impl.data.endpoint.Video r6 = r3.g()
            if (r6 == 0) goto L_0x0261
            java.lang.String r6 = r6.a()
            if (r6 != 0) goto L_0x025f
            goto L_0x0261
        L_0x025f:
            r13 = r6
            goto L_0x026d
        L_0x0261:
            com.ingka.ikea.messagecenter.impl.data.endpoint.Image r6 = r3.c()
            if (r6 == 0) goto L_0x026c
            java.lang.String r6 = r6.a()
            goto L_0x025f
        L_0x026c:
            r13 = r5
        L_0x026d:
            com.ingka.ikea.messagecenter.impl.data.endpoint.Image r6 = r3.d()
            if (r6 == 0) goto L_0x027a
            java.lang.String r6 = r6.b()
            r17 = r6
            goto L_0x027c
        L_0x027a:
            r17 = r5
        L_0x027c:
            com.ingka.ikea.messagecenter.impl.data.endpoint.Image r3 = r3.d()
            if (r3 == 0) goto L_0x028b
            java.lang.String r3 = r3.a()
            r18 = r3
            r3 = r29
            goto L_0x028f
        L_0x028b:
            r3 = r29
            r18 = r5
        L_0x028f:
            am.h r6 = r3.f73035a
            long r15 = r6.c()
            cw.f r14 = new cw.f
            r19 = 128(0x80, float:1.794E-43)
            r20 = 0
            r21 = 0
            r6 = r14
            r5 = r14
            r14 = r21
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r18, r19, r20)
            r1.add(r5)
            r5 = 0
            goto L_0x0213
        L_0x02aa:
            r3 = r29
            fw.c r0 = new fw.c
            r0.<init>(r2, r4, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fw.b.a(com.ingka.ikea.messagecenter.impl.data.endpoint.MessagesRemote):fw.c");
    }
}
