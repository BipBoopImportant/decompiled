package com.ingka.ikea.backinstock.notification.repository.network;

import XH.C16814e;
import gK.C17294a;
import iK.C17395d;
import jK.J0;
import jK.N;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody.$serializer", "LjK/N;", "Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "backinstock-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class SubscribeNotificationBody$$serializer implements N<SubscribeNotificationBody> {
    public static final SubscribeNotificationBody$$serializer INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static final int f93107a = 8;
    private static final SerialDescriptor descriptor;

    static {
        SubscribeNotificationBody$$serializer subscribeNotificationBody$$serializer = new SubscribeNotificationBody$$serializer();
        INSTANCE = subscribeNotificationBody$$serializer;
        J0 j02 = new J0("com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody", subscribeNotificationBody$$serializer, 7);
        j02.p("cashCarry", false);
        j02.p("homeDelivery", false);
        j02.p("contact", false);
        j02.p("itemKeys", false);
        j02.p("locale", false);
        j02.p("consent", false);
        j02.p("token", false);
        descriptor = j02;
    }

    private SubscribeNotificationBody$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody$HomeDelivery} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody$Contact} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody$Locale} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody$Consent} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody deserialize(kotlinx.serialization.encoding.Decoder r29) {
        /*
            r28 = this;
            r0 = r29
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody.f93099i
            boolean r3 = r0.q()
            r4 = 6
            r5 = 5
            r6 = 4
            r7 = 2
            r8 = 3
            r9 = 1
            r10 = 0
            r11 = 0
            if (r3 == 0) goto L_0x0067
            com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody$CashCarry$$serializer r3 = com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody$CashCarry$$serializer.INSTANCE
            java.lang.Object r3 = r0.A(r1, r10, r3, r11)
            com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody$CashCarry r3 = (com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody.CashCarry) r3
            com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody$HomeDelivery$$serializer r10 = com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody$HomeDelivery$$serializer.INSTANCE
            java.lang.Object r9 = r0.A(r1, r9, r10, r11)
            com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody$HomeDelivery r9 = (com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody.HomeDelivery) r9
            com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody$Contact$$serializer r10 = com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody$Contact$$serializer.INSTANCE
            java.lang.Object r7 = r0.A(r1, r7, r10, r11)
            com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody$Contact r7 = (com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody.Contact) r7
            r2 = r2[r8]
            java.lang.Object r2 = r0.o(r1, r8, r2, r11)
            java.util.List r2 = (java.util.List) r2
            com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody$Locale$$serializer r8 = com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody$Locale$$serializer.INSTANCE
            java.lang.Object r6 = r0.o(r1, r6, r8, r11)
            com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody$Locale r6 = (com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody.Locale) r6
            com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody$Consent$$serializer r8 = com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody$Consent$$serializer.INSTANCE
            java.lang.Object r5 = r0.o(r1, r5, r8, r11)
            com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody$Consent r5 = (com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody.Consent) r5
            java.lang.String r4 = r0.n(r1, r4)
            r8 = 127(0x7f, float:1.78E-43)
            r23 = r2
            r20 = r3
            r26 = r4
            r25 = r5
            r24 = r6
            r22 = r7
            r19 = r8
            r21 = r9
            goto L_0x00ea
        L_0x0067:
            r17 = r9
            r3 = r10
            r10 = r11
            r12 = r10
            r13 = r12
            r14 = r13
            r15 = r14
            r16 = r15
        L_0x0071:
            if (r17 == 0) goto L_0x00da
            int r9 = r0.p(r1)
            switch(r9) {
                case -1: goto L_0x00d6;
                case 0: goto L_0x00c7;
                case 1: goto L_0x00b8;
                case 2: goto L_0x00ac;
                case 3: goto L_0x00a0;
                case 4: goto L_0x0094;
                case 5: goto L_0x0088;
                case 6: goto L_0x0080;
                default: goto L_0x007a;
            }
        L_0x007a:
            fK.E r0 = new fK.E
            r0.<init>((int) r9)
            throw r0
        L_0x0080:
            java.lang.String r16 = r0.n(r1, r4)
            r3 = r3 | 64
        L_0x0086:
            r9 = 1
            goto L_0x0071
        L_0x0088:
            com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody$Consent$$serializer r9 = com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody$Consent$$serializer.INSTANCE
            java.lang.Object r9 = r0.o(r1, r5, r9, r10)
            r10 = r9
            com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody$Consent r10 = (com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody.Consent) r10
            r3 = r3 | 32
            goto L_0x0086
        L_0x0094:
            com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody$Locale$$serializer r9 = com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody$Locale$$serializer.INSTANCE
            java.lang.Object r9 = r0.o(r1, r6, r9, r15)
            r15 = r9
            com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody$Locale r15 = (com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody.Locale) r15
            r3 = r3 | 16
            goto L_0x0086
        L_0x00a0:
            r9 = r2[r8]
            java.lang.Object r9 = r0.o(r1, r8, r9, r14)
            r14 = r9
            java.util.List r14 = (java.util.List) r14
            r3 = r3 | 8
            goto L_0x0086
        L_0x00ac:
            com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody$Contact$$serializer r9 = com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody$Contact$$serializer.INSTANCE
            java.lang.Object r9 = r0.A(r1, r7, r9, r13)
            r13 = r9
            com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody$Contact r13 = (com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody.Contact) r13
            r3 = r3 | 4
            goto L_0x0086
        L_0x00b8:
            com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody$HomeDelivery$$serializer r9 = com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody$HomeDelivery$$serializer.INSTANCE
            r4 = 1
            java.lang.Object r9 = r0.A(r1, r4, r9, r12)
            r12 = r9
            com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody$HomeDelivery r12 = (com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody.HomeDelivery) r12
            r3 = r3 | 2
            r9 = r4
            r4 = 6
            goto L_0x0071
        L_0x00c7:
            r4 = 1
            com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody$CashCarry$$serializer r9 = com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody$CashCarry$$serializer.INSTANCE
            r4 = 0
            java.lang.Object r9 = r0.A(r1, r4, r9, r11)
            r11 = r9
            com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody$CashCarry r11 = (com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody.CashCarry) r11
            r3 = r3 | 1
        L_0x00d4:
            r4 = 6
            goto L_0x0086
        L_0x00d6:
            r4 = 0
            r17 = r4
            goto L_0x00d4
        L_0x00da:
            r19 = r3
            r25 = r10
            r20 = r11
            r21 = r12
            r22 = r13
            r23 = r14
            r24 = r15
            r26 = r16
        L_0x00ea:
            r0.c(r1)
            com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody r0 = new com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody
            r27 = 0
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, SubscribeNotificationBody subscribeNotificationBody) {
        C17542s.j(encoder, "encoder");
        C17542s.j(subscribeNotificationBody, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        SubscribeNotificationBody.b(subscribeNotificationBody, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] a10 = SubscribeNotificationBody.f93099i;
        return new KSerializer[]{C17294a.u(SubscribeNotificationBody$CashCarry$$serializer.INSTANCE), C17294a.u(SubscribeNotificationBody$HomeDelivery$$serializer.INSTANCE), C17294a.u(SubscribeNotificationBody$Contact$$serializer.INSTANCE), a10[3], SubscribeNotificationBody$Locale$$serializer.INSTANCE, SubscribeNotificationBody$Consent$$serializer.INSTANCE, Y0.f144077a};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
