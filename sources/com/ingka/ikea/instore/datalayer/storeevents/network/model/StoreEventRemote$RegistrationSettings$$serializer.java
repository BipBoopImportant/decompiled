package com.ingka.ikea.instore.datalayer.storeevents.network.model;

import XH.C16814e;
import com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote;
import gK.C17294a;
import iK.C17395d;
import jK.C17457i;
import jK.C17458i0;
import jK.J0;
import jK.N;
import jK.X;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote.RegistrationSettings.$serializer", "LjK/N;", "Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$RegistrationSettings;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$RegistrationSettings;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$RegistrationSettings;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class StoreEventRemote$RegistrationSettings$$serializer implements N<StoreEventRemote.RegistrationSettings> {
    public static final StoreEventRemote$RegistrationSettings$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        StoreEventRemote$RegistrationSettings$$serializer storeEventRemote$RegistrationSettings$$serializer = new StoreEventRemote$RegistrationSettings$$serializer();
        INSTANCE = storeEventRemote$RegistrationSettings$$serializer;
        J0 j02 = new J0("com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote.RegistrationSettings", storeEventRemote$RegistrationSettings$$serializer, 8);
        j02.p("waitingListEnabled", false);
        j02.p("registrationRequired", false);
        j02.p("registrationStarts", false);
        j02.p("registrationCloseTime", false);
        j02.p("reminders", false);
        j02.p("participantsPerRegistration", false);
        j02.p("childrenPerRegistration", false);
        j02.p("childrenIncludedInCount", false);
        descriptor = j02;
    }

    private StoreEventRemote$RegistrationSettings$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.Integer} */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00c7, code lost:
        r4 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00c8, code lost:
        r5 = 6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote.RegistrationSettings deserialize(kotlinx.serialization.encoding.Decoder r29) {
        /*
            r28 = this;
            r0 = r29
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote.RegistrationSettings.f96191i
            boolean r3 = r0.q()
            r4 = 7
            r5 = 6
            r6 = 5
            r7 = 3
            r8 = 2
            r9 = 4
            r10 = 1
            r11 = 0
            r12 = 0
            if (r3 == 0) goto L_0x0070
            jK.i r3 = jK.C17457i.f144111a
            java.lang.Object r11 = r0.A(r1, r11, r3, r12)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            java.lang.Object r10 = r0.A(r1, r10, r3, r12)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            jK.Y0 r13 = jK.Y0.f144077a
            java.lang.Object r8 = r0.A(r1, r8, r13, r12)
            java.lang.String r8 = (java.lang.String) r8
            jK.i0 r13 = jK.C17458i0.f144113a
            java.lang.Object r7 = r0.A(r1, r7, r13, r12)
            java.lang.Long r7 = (java.lang.Long) r7
            r2 = r2[r9]
            java.lang.Object r2 = r0.o(r1, r9, r2, r12)
            java.util.List r2 = (java.util.List) r2
            jK.X r9 = jK.X.f144073a
            java.lang.Object r6 = r0.A(r1, r6, r9, r12)
            java.lang.Integer r6 = (java.lang.Integer) r6
            java.lang.Object r5 = r0.A(r1, r5, r9, r12)
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.lang.Object r3 = r0.A(r1, r4, r3, r12)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r4 = 255(0xff, float:3.57E-43)
            r23 = r2
            r26 = r3
            r18 = r4
            r25 = r5
            r24 = r6
            r22 = r7
            r21 = r8
            r20 = r10
            r19 = r11
            goto L_0x010e
        L_0x0070:
            r16 = r10
            r3 = r11
            r7 = r12
            r8 = r7
            r10 = r8
            r11 = r10
            r13 = r11
            r14 = r13
            r15 = r14
        L_0x007a:
            if (r16 == 0) goto L_0x00fc
            int r9 = r0.p(r1)
            switch(r9) {
                case -1: goto L_0x00f7;
                case 0: goto L_0x00e8;
                case 1: goto L_0x00d9;
                case 2: goto L_0x00ca;
                case 3: goto L_0x00ba;
                case 4: goto L_0x00ac;
                case 5: goto L_0x00a0;
                case 6: goto L_0x0095;
                case 7: goto L_0x0089;
                default: goto L_0x0083;
            }
        L_0x0083:
            fK.E r0 = new fK.E
            r0.<init>((int) r9)
            throw r0
        L_0x0089:
            jK.i r9 = jK.C17457i.f144111a
            java.lang.Object r7 = r0.A(r1, r4, r9, r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            r3 = r3 | 128(0x80, float:1.794E-43)
        L_0x0093:
            r9 = 4
            goto L_0x007a
        L_0x0095:
            jK.X r9 = jK.X.f144073a
            java.lang.Object r8 = r0.A(r1, r5, r9, r8)
            java.lang.Integer r8 = (java.lang.Integer) r8
            r3 = r3 | 64
            goto L_0x0093
        L_0x00a0:
            jK.X r9 = jK.X.f144073a
            java.lang.Object r9 = r0.A(r1, r6, r9, r10)
            r10 = r9
            java.lang.Integer r10 = (java.lang.Integer) r10
            r3 = r3 | 32
            goto L_0x0093
        L_0x00ac:
            r9 = 4
            r4 = r2[r9]
            java.lang.Object r4 = r0.o(r1, r9, r4, r11)
            r11 = r4
            java.util.List r11 = (java.util.List) r11
            r3 = r3 | 16
            r4 = 7
            goto L_0x007a
        L_0x00ba:
            r9 = 4
            jK.i0 r4 = jK.C17458i0.f144113a
            r5 = 3
            java.lang.Object r4 = r0.A(r1, r5, r4, r15)
            r15 = r4
            java.lang.Long r15 = (java.lang.Long) r15
            r3 = r3 | 8
        L_0x00c7:
            r4 = 7
        L_0x00c8:
            r5 = 6
            goto L_0x007a
        L_0x00ca:
            r5 = 3
            r9 = 4
            jK.Y0 r4 = jK.Y0.f144077a
            r5 = 2
            java.lang.Object r4 = r0.A(r1, r5, r4, r14)
            r14 = r4
            java.lang.String r14 = (java.lang.String) r14
            r3 = r3 | 4
            goto L_0x00c7
        L_0x00d9:
            r5 = 2
            r9 = 4
            jK.i r4 = jK.C17457i.f144111a
            r5 = 1
            java.lang.Object r4 = r0.A(r1, r5, r4, r13)
            r13 = r4
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            r3 = r3 | 2
            goto L_0x00c7
        L_0x00e8:
            r5 = 1
            r9 = 4
            jK.i r4 = jK.C17457i.f144111a
            r5 = 0
            java.lang.Object r4 = r0.A(r1, r5, r4, r12)
            r12 = r4
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            r3 = r3 | 1
            goto L_0x00c7
        L_0x00f7:
            r5 = 0
            r9 = 4
            r16 = r5
            goto L_0x00c8
        L_0x00fc:
            r18 = r3
            r26 = r7
            r25 = r8
            r24 = r10
            r23 = r11
            r19 = r12
            r20 = r13
            r21 = r14
            r22 = r15
        L_0x010e:
            r0.c(r1)
            com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote$RegistrationSettings r0 = new com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote$RegistrationSettings
            r27 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote$RegistrationSettings$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote$RegistrationSettings");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, StoreEventRemote.RegistrationSettings registrationSettings) {
        C17542s.j(encoder, "encoder");
        C17542s.j(registrationSettings, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        StoreEventRemote.RegistrationSettings.j(registrationSettings, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] a10 = StoreEventRemote.RegistrationSettings.f96191i;
        C17457i iVar = C17457i.f144111a;
        KSerializer<?> u10 = C17294a.u(iVar);
        KSerializer<?> u11 = C17294a.u(iVar);
        KSerializer<?> u12 = C17294a.u(Y0.f144077a);
        KSerializer<?> u13 = C17294a.u(C17458i0.f144113a);
        KSerializer<?> kSerializer = a10[4];
        X x10 = X.f144073a;
        return new KSerializer[]{u10, u11, u12, u13, kSerializer, C17294a.u(x10), C17294a.u(x10), C17294a.u(iVar)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
