package com.ingka.ikea.appconfig.model;

import XH.C16814e;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/appconfig/model/PostalCodePickerConfig.$serializer", "LjK/N;", "Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "appconfig_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class PostalCodePickerConfig$$serializer implements N<PostalCodePickerConfig> {
    public static final PostalCodePickerConfig$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PostalCodePickerConfig$$serializer postalCodePickerConfig$$serializer = new PostalCodePickerConfig$$serializer();
        INSTANCE = postalCodePickerConfig$$serializer;
        J0 j02 = new J0("com.ingka.ikea.appconfig.model.PostalCodePickerConfig", postalCodePickerConfig$$serializer, 8);
        j02.p("type", false);
        j02.p("isAutoCompleteEnabled", false);
        j02.p("isStreetNumberEnabled", false);
        j02.p("isLocationServiceEnabled", false);
        j02.p("isStateRequired", false);
        j02.p("zipInValidation", false);
        j02.p("googleSourceZipCodeKey", true);
        j02.p("ambiguousAreas", true);
        descriptor = j02;
    }

    private PostalCodePickerConfig$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: com.ingka.ikea.appconfig.model.PostalCodePickerConfig$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: com.ingka.ikea.appconfig.model.ZipInValidation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.appconfig.model.PostalCodePickerConfig deserialize(kotlinx.serialization.encoding.Decoder r32) {
        /*
            r31 = this;
            r0 = r32
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.appconfig.model.PostalCodePickerConfig.f93003i
            boolean r3 = r0.q()
            r4 = 6
            r5 = 5
            r6 = 3
            r7 = 4
            r8 = 2
            r9 = 7
            r10 = 1
            r11 = 0
            r12 = 0
            if (r3 == 0) goto L_0x0066
            r3 = r2[r11]
            java.lang.Object r3 = r0.o(r1, r11, r3, r12)
            com.ingka.ikea.appconfig.model.PostalCodePickerConfig$b r3 = (com.ingka.ikea.appconfig.model.PostalCodePickerConfig.b) r3
            boolean r10 = r0.D(r1, r10)
            boolean r8 = r0.D(r1, r8)
            boolean r6 = r0.D(r1, r6)
            boolean r7 = r0.D(r1, r7)
            com.ingka.ikea.appconfig.model.ZipInValidation$$serializer r11 = com.ingka.ikea.appconfig.model.ZipInValidation$$serializer.INSTANCE
            java.lang.Object r5 = r0.A(r1, r5, r11, r12)
            com.ingka.ikea.appconfig.model.ZipInValidation r5 = (com.ingka.ikea.appconfig.model.ZipInValidation) r5
            jK.Y0 r11 = jK.Y0.f144077a
            java.lang.Object r4 = r0.A(r1, r4, r11, r12)
            java.lang.String r4 = (java.lang.String) r4
            r2 = r2[r9]
            java.lang.Object r2 = r0.o(r1, r9, r2, r12)
            java.util.List r2 = (java.util.List) r2
            r9 = 255(0xff, float:3.57E-43)
            r29 = r2
            r22 = r3
            r28 = r4
            r27 = r5
            r25 = r6
            r26 = r7
            r24 = r8
            r21 = r9
            r23 = r10
            goto L_0x0104
        L_0x0066:
            r19 = r10
            r3 = r11
            r13 = r3
            r14 = r13
            r15 = r14
            r8 = r12
            r10 = r8
            r16 = r10
            r11 = r16
            r12 = r15
        L_0x0073:
            if (r19 == 0) goto L_0x00f0
            int r6 = r0.p(r1)
            switch(r6) {
                case -1: goto L_0x00e5;
                case 0: goto L_0x00ce;
                case 1: goto L_0x00c1;
                case 2: goto L_0x00b6;
                case 3: goto L_0x00ae;
                case 4: goto L_0x00a7;
                case 5: goto L_0x009b;
                case 6: goto L_0x008f;
                case 7: goto L_0x0082;
                default: goto L_0x007c;
            }
        L_0x007c:
            fK.E r0 = new fK.E
            r0.<init>((int) r6)
            throw r0
        L_0x0082:
            r6 = r2[r9]
            java.lang.Object r6 = r0.o(r1, r9, r6, r8)
            r8 = r6
            java.util.List r8 = (java.util.List) r8
            r14 = r14 | 128(0x80, float:1.794E-43)
        L_0x008d:
            r6 = 3
            goto L_0x0073
        L_0x008f:
            jK.Y0 r6 = jK.Y0.f144077a
            java.lang.Object r6 = r0.A(r1, r4, r6, r10)
            r10 = r6
            java.lang.String r10 = (java.lang.String) r10
            r14 = r14 | 64
            goto L_0x008d
        L_0x009b:
            com.ingka.ikea.appconfig.model.ZipInValidation$$serializer r6 = com.ingka.ikea.appconfig.model.ZipInValidation$$serializer.INSTANCE
            java.lang.Object r6 = r0.A(r1, r5, r6, r11)
            r11 = r6
            com.ingka.ikea.appconfig.model.ZipInValidation r11 = (com.ingka.ikea.appconfig.model.ZipInValidation) r11
            r14 = r14 | 32
            goto L_0x008d
        L_0x00a7:
            boolean r12 = r0.D(r1, r7)
            r14 = r14 | 16
            goto L_0x008d
        L_0x00ae:
            r6 = 3
            boolean r3 = r0.D(r1, r6)
            r14 = r14 | 8
            goto L_0x0073
        L_0x00b6:
            r6 = 3
            r13 = 2
            boolean r18 = r0.D(r1, r13)
            r14 = r14 | 4
            r13 = r18
            goto L_0x0073
        L_0x00c1:
            r6 = 3
            r15 = 1
            r17 = 2
            boolean r18 = r0.D(r1, r15)
            r14 = r14 | 2
            r15 = r18
            goto L_0x0073
        L_0x00ce:
            r4 = 0
            r6 = 3
            r17 = 2
            r18 = 1
            r5 = r2[r4]
            r6 = r16
            java.lang.Object r5 = r0.o(r1, r4, r5, r6)
            r16 = r5
            com.ingka.ikea.appconfig.model.PostalCodePickerConfig$b r16 = (com.ingka.ikea.appconfig.model.PostalCodePickerConfig.b) r16
            r14 = r14 | 1
            r4 = 6
            r5 = 5
            goto L_0x008d
        L_0x00e5:
            r6 = r16
            r4 = 0
            r17 = 2
            r18 = 1
            r19 = r4
            r4 = 6
            goto L_0x008d
        L_0x00f0:
            r6 = r16
            r25 = r3
            r22 = r6
            r29 = r8
            r28 = r10
            r27 = r11
            r26 = r12
            r24 = r13
            r21 = r14
            r23 = r15
        L_0x0104:
            r0.c(r1)
            com.ingka.ikea.appconfig.model.PostalCodePickerConfig r0 = new com.ingka.ikea.appconfig.model.PostalCodePickerConfig
            r30 = 0
            r20 = r0
            r20.<init>((int) r21, (com.ingka.ikea.appconfig.model.PostalCodePickerConfig.b) r22, (boolean) r23, (boolean) r24, (boolean) r25, (boolean) r26, (com.ingka.ikea.appconfig.model.ZipInValidation) r27, (java.lang.String) r28, (java.util.List) r29, (jK.T0) r30)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.appconfig.model.PostalCodePickerConfig$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.appconfig.model.PostalCodePickerConfig");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, PostalCodePickerConfig postalCodePickerConfig) {
        C17542s.j(encoder, "encoder");
        C17542s.j(postalCodePickerConfig, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        PostalCodePickerConfig.o(postalCodePickerConfig, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] a10 = PostalCodePickerConfig.f93003i;
        KSerializer<?> kSerializer = a10[0];
        KSerializer<?> u10 = C17294a.u(ZipInValidation$$serializer.INSTANCE);
        KSerializer<?> u11 = C17294a.u(Y0.f144077a);
        KSerializer<?> kSerializer2 = a10[7];
        C17457i iVar = C17457i.f144111a;
        return new KSerializer[]{kSerializer, iVar, iVar, iVar, iVar, u10, u11, kSerializer2};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
