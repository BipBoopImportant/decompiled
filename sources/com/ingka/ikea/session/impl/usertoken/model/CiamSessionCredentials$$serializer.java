package com.ingka.ikea.session.impl.usertoken.model;

import XH.C16814e;
import gK.C17294a;
import iK.C17395d;
import jK.C17458i0;
import jK.J0;
import jK.N;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/session/impl/usertoken/model/CiamSessionCredentials.$serializer", "LjK/N;", "Lcom/ingka/ikea/session/impl/usertoken/model/CiamSessionCredentials;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/session/impl/usertoken/model/CiamSessionCredentials;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/session/impl/usertoken/model/CiamSessionCredentials;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "usersession-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class CiamSessionCredentials$$serializer implements N<CiamSessionCredentials> {
    public static final CiamSessionCredentials$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CiamSessionCredentials$$serializer ciamSessionCredentials$$serializer = new CiamSessionCredentials$$serializer();
        INSTANCE = ciamSessionCredentials$$serializer;
        J0 j02 = new J0("com.ingka.ikea.session.impl.usertoken.model.CiamSessionCredentials", ciamSessionCredentials$$serializer, 6);
        j02.p("idToken", false);
        j02.p("accessToken", false);
        j02.p("type", true);
        j02.p("refreshToken", false);
        j02.p("expiresAt", false);
        j02.p("scope", true);
        descriptor = j02;
    }

    private CiamSessionCredentials$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00ae, code lost:
        r3 = 5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.session.impl.usertoken.model.CiamSessionCredentials deserialize(kotlinx.serialization.encoding.Decoder r28) {
        /*
            r27 = this;
            r0 = r28
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            boolean r2 = r0.q()
            r3 = 5
            r4 = 3
            r5 = 4
            r6 = 2
            r7 = 1
            r8 = 0
            r9 = 0
            if (r2 == 0) goto L_0x0050
            jK.Y0 r2 = jK.Y0.f144077a
            java.lang.Object r8 = r0.A(r1, r8, r2, r9)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r0.A(r1, r7, r2, r9)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r0.A(r1, r6, r2, r9)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r4 = r0.A(r1, r4, r2, r9)
            java.lang.String r4 = (java.lang.String) r4
            long r10 = r0.g(r1, r5)
            java.lang.Object r2 = r0.A(r1, r3, r2, r9)
            java.lang.String r2 = (java.lang.String) r2
            r3 = 63
            r25 = r2
            r18 = r3
            r22 = r4
            r21 = r6
            r20 = r7
            r19 = r8
            r23 = r10
            goto L_0x00c3
        L_0x0050:
            r10 = 0
            r16 = r7
            r2 = r8
            r12 = r9
            r13 = r12
            r14 = r10
            r10 = r13
            r11 = r10
        L_0x005a:
            if (r16 == 0) goto L_0x00b5
            int r8 = r0.p(r1)
            switch(r8) {
                case -1: goto L_0x00b0;
                case 0: goto L_0x00a1;
                case 1: goto L_0x0095;
                case 2: goto L_0x0089;
                case 3: goto L_0x007d;
                case 4: goto L_0x0076;
                case 5: goto L_0x0069;
                default: goto L_0x0063;
            }
        L_0x0063:
            fK.E r0 = new fK.E
            r0.<init>((int) r8)
            throw r0
        L_0x0069:
            jK.Y0 r8 = jK.Y0.f144077a
            java.lang.Object r8 = r0.A(r1, r3, r8, r13)
            r13 = r8
            java.lang.String r13 = (java.lang.String) r13
            r2 = r2 | 32
        L_0x0074:
            r8 = 0
            goto L_0x005a
        L_0x0076:
            long r14 = r0.g(r1, r5)
            r2 = r2 | 16
            goto L_0x0074
        L_0x007d:
            jK.Y0 r8 = jK.Y0.f144077a
            java.lang.Object r8 = r0.A(r1, r4, r8, r12)
            r12 = r8
            java.lang.String r12 = (java.lang.String) r12
            r2 = r2 | 8
            goto L_0x0074
        L_0x0089:
            jK.Y0 r8 = jK.Y0.f144077a
            java.lang.Object r8 = r0.A(r1, r6, r8, r11)
            r11 = r8
            java.lang.String r11 = (java.lang.String) r11
            r2 = r2 | 4
            goto L_0x0074
        L_0x0095:
            jK.Y0 r8 = jK.Y0.f144077a
            java.lang.Object r8 = r0.A(r1, r7, r8, r10)
            r10 = r8
            java.lang.String r10 = (java.lang.String) r10
            r2 = r2 | 2
            goto L_0x0074
        L_0x00a1:
            jK.Y0 r8 = jK.Y0.f144077a
            r3 = 0
            java.lang.Object r8 = r0.A(r1, r3, r8, r9)
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            r2 = r2 | 1
            r8 = r3
        L_0x00ae:
            r3 = 5
            goto L_0x005a
        L_0x00b0:
            r3 = 0
            r8 = r3
            r16 = r8
            goto L_0x00ae
        L_0x00b5:
            r18 = r2
            r19 = r9
            r20 = r10
            r21 = r11
            r22 = r12
            r25 = r13
            r23 = r14
        L_0x00c3:
            r0.c(r1)
            com.ingka.ikea.session.impl.usertoken.model.CiamSessionCredentials r0 = new com.ingka.ikea.session.impl.usertoken.model.CiamSessionCredentials
            r26 = 0
            r17 = r0
            r17.<init>((int) r18, (java.lang.String) r19, (java.lang.String) r20, (java.lang.String) r21, (java.lang.String) r22, (long) r23, (java.lang.String) r25, (jK.T0) r26)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.session.impl.usertoken.model.CiamSessionCredentials$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.session.impl.usertoken.model.CiamSessionCredentials");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, CiamSessionCredentials ciamSessionCredentials) {
        C17542s.j(encoder, "encoder");
        C17542s.j(ciamSessionCredentials, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        CiamSessionCredentials.i(ciamSessionCredentials, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{C17294a.u(y02), C17294a.u(y02), C17294a.u(y02), C17294a.u(y02), C17458i0.f144113a, C17294a.u(y02)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
