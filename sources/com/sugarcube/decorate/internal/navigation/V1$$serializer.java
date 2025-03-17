package com.sugarcube.decorate.internal.navigation;

import XH.C16814e;
import gK.C17294a;
import iK.C17395d;
import jK.C17457i;
import jK.J0;
import jK.N;
import jK.X;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sugarcube/decorate/internal/navigation/V1.$serializer", "LjK/N;", "Lcom/sugarcube/decorate/internal/navigation/V1;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sugarcube/decorate/internal/navigation/V1;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sugarcube/decorate/internal/navigation/V1;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "shared_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class V1$$serializer implements N<V1> {
    public static final V1$$serializer INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static final int f126137a = 8;
    private static final SerialDescriptor descriptor;

    static {
        V1$$serializer v1$$serializer = new V1$$serializer();
        INSTANCE = v1$$serializer;
        J0 j02 = new J0("com.sugarcube.decorate.internal.navigation.V1", v1$$serializer, 5);
        j02.p("sceneUuid", false);
        j02.p("compositionUuid", true);
        j02.p("sceneDeprecatedId", true);
        j02.p("sceneIsNewDesign", true);
        j02.p("furniture", true);
        descriptor = j02;
    }

    private V1$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.sugarcube.decorate.internal.navigation.V1 deserialize(kotlinx.serialization.encoding.Decoder r24) {
        /*
            r23 = this;
            r0 = r24
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.sugarcube.decorate.internal.navigation.V1.f126131g
            boolean r3 = r0.q()
            r4 = 3
            r5 = 2
            r6 = 4
            r7 = 1
            r8 = 0
            r9 = 0
            if (r3 == 0) goto L_0x0049
            java.lang.String r3 = r0.n(r1, r8)
            jK.Y0 r8 = jK.Y0.f144077a
            java.lang.Object r7 = r0.A(r1, r7, r8, r9)
            java.lang.String r7 = (java.lang.String) r7
            int r5 = r0.j(r1, r5)
            boolean r4 = r0.D(r1, r4)
            r2 = r2[r6]
            java.lang.Object r2 = r0.A(r1, r6, r2, r9)
            java.util.List r2 = (java.util.List) r2
            r6 = 31
            r21 = r2
            r17 = r3
            r20 = r4
            r19 = r5
            r16 = r6
            r18 = r7
            goto L_0x00a7
        L_0x0049:
            r14 = r7
            r3 = r8
            r10 = r3
            r11 = r9
            r12 = r11
            r13 = r12
            r9 = r10
        L_0x0050:
            if (r14 == 0) goto L_0x009b
            int r15 = r0.p(r1)
            r8 = -1
            if (r15 == r8) goto L_0x0098
            if (r15 == 0) goto L_0x0090
            if (r15 == r7) goto L_0x0084
            if (r15 == r5) goto L_0x007d
            if (r15 == r4) goto L_0x0076
            if (r15 != r6) goto L_0x0070
            r8 = r2[r6]
            java.lang.Object r8 = r0.A(r1, r6, r8, r13)
            r13 = r8
            java.util.List r13 = (java.util.List) r13
            r10 = r10 | 16
        L_0x006e:
            r8 = 0
            goto L_0x0050
        L_0x0070:
            fK.E r0 = new fK.E
            r0.<init>((int) r15)
            throw r0
        L_0x0076:
            boolean r3 = r0.D(r1, r4)
            r10 = r10 | 8
            goto L_0x006e
        L_0x007d:
            int r9 = r0.j(r1, r5)
            r10 = r10 | 4
            goto L_0x006e
        L_0x0084:
            jK.Y0 r8 = jK.Y0.f144077a
            java.lang.Object r8 = r0.A(r1, r7, r8, r12)
            r12 = r8
            java.lang.String r12 = (java.lang.String) r12
            r10 = r10 | 2
            goto L_0x006e
        L_0x0090:
            r8 = 0
            java.lang.String r11 = r0.n(r1, r8)
            r10 = r10 | 1
            goto L_0x0050
        L_0x0098:
            r8 = 0
            r14 = r8
            goto L_0x0050
        L_0x009b:
            r20 = r3
            r19 = r9
            r16 = r10
            r17 = r11
            r18 = r12
            r21 = r13
        L_0x00a7:
            r0.c(r1)
            com.sugarcube.decorate.internal.navigation.V1 r0 = new com.sugarcube.decorate.internal.navigation.V1
            r22 = 0
            r15 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.internal.navigation.V1$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.sugarcube.decorate.internal.navigation.V1");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, V1 v12) {
        C17542s.j(encoder, "encoder");
        C17542s.j(v12, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        V1.g(v12, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer[] a10 = V1.f126131g;
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{y02, C17294a.u(y02), X.f144073a, C17457i.f144111a, C17294a.u(a10[4])};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
