package com.sugarcube.app.base.navigation;

import XH.C16814e;
import com.adjust.sdk.Constants;
import com.sugarcube.app.base.navigation.Kreativ;
import gK.C17294a;
import iK.C17395d;
import jK.C17457i;
import jK.J0;
import jK.N;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sugarcube/app/base/navigation/Kreativ.Entry.$serializer", "LjK/N;", "Lcom/sugarcube/app/base/navigation/Kreativ$Entry;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sugarcube/app/base/navigation/Kreativ$Entry;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sugarcube/app/base/navigation/Kreativ$Entry;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class Kreativ$Entry$$serializer implements N<Kreativ.Entry> {
    public static final Kreativ$Entry$$serializer INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static final int f123109a = 8;
    private static final SerialDescriptor descriptor;

    static {
        Kreativ$Entry$$serializer kreativ$Entry$$serializer = new Kreativ$Entry$$serializer();
        INSTANCE = kreativ$Entry$$serializer;
        J0 j02 = new J0("com.sugarcube.app.base.navigation.Kreativ.Entry", kreativ$Entry$$serializer, 8);
        j02.p("sceneUuid", true);
        j02.p("compositionUuid", true);
        j02.p("messageFlavor", true);
        j02.p("source", true);
        j02.p(Constants.DEEPLINK, true);
        j02.p("furniture", true);
        j02.p("scan", true);
        j02.p("sharedUuid", true);
        descriptor = j02;
    }

    private Kreativ$Entry$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.sugarcube.app.base.navigation.Kreativ.Entry deserialize(kotlinx.serialization.encoding.Decoder r29) {
        /*
            r28 = this;
            r0 = r29
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            boolean r2 = r0.q()
            r3 = 7
            r4 = 6
            r5 = 5
            r6 = 3
            r7 = 4
            r8 = 2
            r9 = 1
            r10 = 0
            r11 = 0
            if (r2 == 0) goto L_0x0062
            jK.Y0 r2 = jK.Y0.f144077a
            java.lang.Object r10 = r0.A(r1, r10, r2, r11)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r0.A(r1, r9, r2, r11)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r0.A(r1, r8, r2, r11)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r6 = r0.A(r1, r6, r2, r11)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r0.A(r1, r7, r2, r11)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r5 = r0.A(r1, r5, r2, r11)
            java.lang.String r5 = (java.lang.String) r5
            boolean r4 = r0.D(r1, r4)
            java.lang.Object r2 = r0.A(r1, r3, r2, r11)
            java.lang.String r2 = (java.lang.String) r2
            r3 = 255(0xff, float:3.57E-43)
            r26 = r2
            r18 = r3
            r25 = r4
            r24 = r5
            r22 = r6
            r23 = r7
            r21 = r8
            r20 = r9
            r19 = r10
            goto L_0x00f8
        L_0x0062:
            r16 = r9
            r2 = r10
            r8 = r11
            r9 = r8
            r12 = r9
            r13 = r12
            r14 = r13
            r15 = r14
            r10 = r15
            r11 = r2
        L_0x006d:
            if (r16 == 0) goto L_0x00e6
            int r6 = r0.p(r1)
            switch(r6) {
                case -1: goto L_0x00e2;
                case 0: goto L_0x00d4;
                case 1: goto L_0x00c6;
                case 2: goto L_0x00b7;
                case 3: goto L_0x00a8;
                case 4: goto L_0x009c;
                case 5: goto L_0x0090;
                case 6: goto L_0x0089;
                case 7: goto L_0x007c;
                default: goto L_0x0076;
            }
        L_0x0076:
            fK.E r0 = new fK.E
            r0.<init>((int) r6)
            throw r0
        L_0x007c:
            jK.Y0 r6 = jK.Y0.f144077a
            java.lang.Object r6 = r0.A(r1, r3, r6, r8)
            r8 = r6
            java.lang.String r8 = (java.lang.String) r8
            r2 = r2 | 128(0x80, float:1.794E-43)
        L_0x0087:
            r6 = 3
            goto L_0x006d
        L_0x0089:
            boolean r11 = r0.D(r1, r4)
            r2 = r2 | 64
            goto L_0x0087
        L_0x0090:
            jK.Y0 r6 = jK.Y0.f144077a
            java.lang.Object r6 = r0.A(r1, r5, r6, r9)
            r9 = r6
            java.lang.String r9 = (java.lang.String) r9
            r2 = r2 | 32
            goto L_0x0087
        L_0x009c:
            jK.Y0 r6 = jK.Y0.f144077a
            java.lang.Object r6 = r0.A(r1, r7, r6, r10)
            r10 = r6
            java.lang.String r10 = (java.lang.String) r10
            r2 = r2 | 16
            goto L_0x0087
        L_0x00a8:
            jK.Y0 r6 = jK.Y0.f144077a
            r3 = 3
            java.lang.Object r6 = r0.A(r1, r3, r6, r15)
            r15 = r6
            java.lang.String r15 = (java.lang.String) r15
            r2 = r2 | 8
            r6 = r3
            r3 = 7
            goto L_0x006d
        L_0x00b7:
            r3 = 3
            jK.Y0 r6 = jK.Y0.f144077a
            r3 = 2
            java.lang.Object r6 = r0.A(r1, r3, r6, r14)
            r14 = r6
            java.lang.String r14 = (java.lang.String) r14
            r2 = r2 | 4
        L_0x00c4:
            r3 = 7
            goto L_0x0087
        L_0x00c6:
            r3 = 2
            jK.Y0 r6 = jK.Y0.f144077a
            r3 = 1
            java.lang.Object r6 = r0.A(r1, r3, r6, r13)
            r13 = r6
            java.lang.String r13 = (java.lang.String) r13
            r2 = r2 | 2
            goto L_0x00c4
        L_0x00d4:
            r3 = 1
            jK.Y0 r6 = jK.Y0.f144077a
            r3 = 0
            java.lang.Object r6 = r0.A(r1, r3, r6, r12)
            r12 = r6
            java.lang.String r12 = (java.lang.String) r12
            r2 = r2 | 1
            goto L_0x00c4
        L_0x00e2:
            r3 = 0
            r16 = r3
            goto L_0x00c4
        L_0x00e6:
            r18 = r2
            r26 = r8
            r24 = r9
            r23 = r10
            r25 = r11
            r19 = r12
            r20 = r13
            r21 = r14
            r22 = r15
        L_0x00f8:
            r0.c(r1)
            com.sugarcube.app.base.navigation.Kreativ$Entry r0 = new com.sugarcube.app.base.navigation.Kreativ$Entry
            r27 = 0
            r17 = r0
            r17.<init>((int) r18, (java.lang.String) r19, (java.lang.String) r20, (java.lang.String) r21, (java.lang.String) r22, (java.lang.String) r23, (java.lang.String) r24, (boolean) r25, (java.lang.String) r26, (jK.T0) r27)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.navigation.Kreativ$Entry$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.sugarcube.app.base.navigation.Kreativ$Entry");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, Kreativ.Entry entry) {
        C17542s.j(encoder, "encoder");
        C17542s.j(entry, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        Kreativ.Entry.h(entry, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{C17294a.u(y02), C17294a.u(y02), C17294a.u(y02), C17294a.u(y02), C17294a.u(y02), C17294a.u(y02), C17457i.f144111a, C17294a.u(y02)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
