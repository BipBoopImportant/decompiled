package com.ingka.ikea.userappointments.impl.models.remote;

import XH.C16814e;
import iK.C17395d;
import jK.J0;
import jK.N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/userappointments/impl/models/remote/AppointmentRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/userappointments/impl/models/remote/AppointmentRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/userappointments/impl/models/remote/AppointmentRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/userappointments/impl/models/remote/AppointmentRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "userappointments-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class AppointmentRemote$$serializer implements N<AppointmentRemote> {
    public static final AppointmentRemote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        AppointmentRemote$$serializer appointmentRemote$$serializer = new AppointmentRemote$$serializer();
        INSTANCE = appointmentRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.userappointments.impl.models.remote.AppointmentRemote", appointmentRemote$$serializer, 29);
        j02.p("id", false);
        j02.p("serviceProductId", false);
        j02.p("startDate", false);
        j02.p("actualStartDate", false);
        j02.p("endDate", false);
        j02.p("actualEndDate", false);
        j02.p("cancelDate", false);
        j02.p("bookingDate", false);
        j02.p("dateCreated", false);
        j02.p("dateUpdated", false);
        j02.p("coworkerId", false);
        j02.p("partyUId", false);
        j02.p("businessCustomerId", false);
        j02.p("specialNeedDetails", false);
        j02.p("progressDetails", false);
        j02.p("language", false);
        j02.p("appointmentDetails", false);
        j02.p("status", false);
        j02.p("type", false);
        j02.p("postalCode", false);
        j02.p("orderNumber", false);
        j02.p("orderNumberSource", false);
        j02.p("countryCode", false);
        j02.p("localityCode", false);
        j02.p("plannerId", false);
        j02.p("projectId", false);
        j02.p("appointmentLink", false);
        j02.p("customerVideoLink", false);
        j02.p("serviceProductTitle", false);
        descriptor = j02;
    }

    private AppointmentRemote$$serializer() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x01ab, code lost:
        r25 = r44;
        r34 = r46;
        r28 = r48;
        r37 = r49;
        r38 = r50;
        r29 = r52;
        r41 = r53;
        r42 = r54;
        r31 = r55;
        r30 = r56;
        r32 = r57;
        r33 = r58;
        r27 = r60;
        r60 = r61;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0535, code lost:
        r29 = r51;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x053f, code lost:
        r51 = r39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x05bd, code lost:
        r51 = r39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0733, code lost:
        r94 = r25;
        r25 = r2;
        r2 = r94;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0777, code lost:
        r44 = r25;
        r1 = r27;
        r48 = r28;
        r52 = r29;
        r56 = r30;
        r55 = r31;
        r57 = r32;
        r58 = r33;
        r46 = r34;
        r49 = r37;
        r50 = r38;
        r53 = r41;
        r54 = r42;
        r15 = r60;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.userappointments.impl.models.remote.AppointmentRemote deserialize(kotlinx.serialization.encoding.Decoder r96) {
        /*
            r95 = this;
            r0 = r96
            java.lang.String r9 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r9)
            kotlinx.serialization.descriptors.SerialDescriptor r9 = descriptor
            iK.c r0 = r0.b(r9)
            boolean r10 = r0.q()
            r5 = 10
            r6 = 9
            r7 = 7
            r8 = 6
            r11 = 5
            r12 = 3
            r14 = 8
            r13 = 4
            r15 = 2
            r1 = 1
            r2 = 0
            r3 = 0
            if (r10 == 0) goto L_0x0159
            int r2 = r0.j(r9, r2)
            jK.Y0 r10 = jK.Y0.f144077a
            java.lang.Object r1 = r0.A(r9, r1, r10, r3)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r15 = r0.A(r9, r15, r10, r3)
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r12 = r0.A(r9, r12, r10, r3)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r0.A(r9, r13, r10, r3)
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r11 = r0.A(r9, r11, r10, r3)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r8 = r0.A(r9, r8, r10, r3)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r0.A(r9, r7, r10, r3)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r14 = r0.A(r9, r14, r10, r3)
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r6 = r0.A(r9, r6, r10, r3)
            java.lang.String r6 = (java.lang.String) r6
            jK.X r4 = jK.X.f144073a
            java.lang.Object r4 = r0.A(r9, r5, r4, r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            r5 = 11
            java.lang.Object r5 = r0.A(r9, r5, r10, r3)
            java.lang.String r5 = (java.lang.String) r5
            r31 = r1
            r1 = 12
            java.lang.Object r1 = r0.A(r9, r1, r10, r3)
            java.lang.String r1 = (java.lang.String) r1
            r30 = r1
            r1 = 13
            java.lang.Object r1 = r0.A(r9, r1, r10, r3)
            java.lang.String r1 = (java.lang.String) r1
            r29 = r1
            r1 = 14
            java.lang.Object r1 = r0.A(r9, r1, r10, r3)
            java.lang.String r1 = (java.lang.String) r1
            r28 = r1
            r1 = 15
            java.lang.Object r1 = r0.A(r9, r1, r10, r3)
            java.lang.String r1 = (java.lang.String) r1
            r27 = r1
            r1 = 16
            java.lang.Object r1 = r0.A(r9, r1, r10, r3)
            java.lang.String r1 = (java.lang.String) r1
            r26 = r1
            r1 = 17
            java.lang.Object r1 = r0.A(r9, r1, r10, r3)
            java.lang.String r1 = (java.lang.String) r1
            r25 = r1
            r1 = 18
            java.lang.Object r1 = r0.A(r9, r1, r10, r3)
            java.lang.String r1 = (java.lang.String) r1
            r24 = r1
            r1 = 19
            java.lang.Object r1 = r0.A(r9, r1, r10, r3)
            java.lang.String r1 = (java.lang.String) r1
            r23 = r1
            r1 = 20
            java.lang.Object r1 = r0.A(r9, r1, r10, r3)
            java.lang.String r1 = (java.lang.String) r1
            r96 = r1
            r1 = 21
            java.lang.Object r1 = r0.A(r9, r1, r10, r3)
            java.lang.String r1 = (java.lang.String) r1
            r22 = r1
            r1 = 22
            java.lang.Object r1 = r0.A(r9, r1, r10, r3)
            java.lang.String r1 = (java.lang.String) r1
            r21 = r1
            r1 = 23
            java.lang.Object r1 = r0.A(r9, r1, r10, r3)
            java.lang.String r1 = (java.lang.String) r1
            r20 = r1
            r1 = 24
            java.lang.Object r1 = r0.A(r9, r1, r10, r3)
            java.lang.String r1 = (java.lang.String) r1
            r19 = r1
            r1 = 25
            java.lang.Object r1 = r0.A(r9, r1, r10, r3)
            java.lang.String r1 = (java.lang.String) r1
            r18 = r1
            r1 = 26
            java.lang.Object r1 = r0.A(r9, r1, r10, r3)
            java.lang.String r1 = (java.lang.String) r1
            r17 = r1
            r1 = 27
            java.lang.Object r1 = r0.A(r9, r1, r10, r3)
            java.lang.String r1 = (java.lang.String) r1
            r16 = r1
            r1 = 28
            java.lang.Object r1 = r0.A(r9, r1, r10, r3)
            java.lang.String r1 = (java.lang.String) r1
            r3 = 536870911(0x1fffffff, float:1.0842021E-19)
            r84 = r96
            r92 = r1
            r64 = r2
            r63 = r3
            r74 = r4
            r75 = r5
            r73 = r6
            r71 = r7
            r70 = r8
            r69 = r11
            r67 = r12
            r68 = r13
            r72 = r14
            r66 = r15
            r91 = r16
            r90 = r17
            r89 = r18
            r88 = r19
            r87 = r20
            r86 = r21
            r85 = r22
            r83 = r23
            r82 = r24
            r81 = r25
            r80 = r26
            r79 = r27
            r78 = r28
            r77 = r29
            r76 = r30
            r65 = r31
            goto L_0x07f5
        L_0x0159:
            r59 = r1
            r4 = r2
            r43 = r4
            r1 = r3
            r2 = r1
            r5 = r2
            r6 = r5
            r7 = r6
            r8 = r7
            r10 = r8
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r44 = r15
            r45 = r44
            r46 = r45
            r47 = r46
            r48 = r47
            r49 = r48
            r50 = r49
            r51 = r50
            r52 = r51
            r53 = r52
            r54 = r53
            r55 = r54
            r56 = r55
            r57 = r56
            r58 = r57
        L_0x0188:
            if (r59 == 0) goto L_0x0795
            r60 = r1
            int r1 = r0.p(r9)
            switch(r1) {
                case -1: goto L_0x073a;
                case 0: goto L_0x06f2;
                case 1: goto L_0x06a3;
                case 2: goto L_0x0655;
                case 3: goto L_0x060a;
                case 4: goto L_0x05c1;
                case 5: goto L_0x057c;
                case 6: goto L_0x0543;
                case 7: goto L_0x04fe;
                case 8: goto L_0x04b7;
                case 9: goto L_0x0476;
                case 10: goto L_0x043c;
                case 11: goto L_0x0402;
                case 12: goto L_0x03c8;
                case 13: goto L_0x038e;
                case 14: goto L_0x0356;
                case 15: goto L_0x0320;
                case 16: goto L_0x02e8;
                case 17: goto L_0x02a9;
                case 18: goto L_0x0293;
                case 19: goto L_0x027d;
                case 20: goto L_0x0267;
                case 21: goto L_0x0251;
                case 22: goto L_0x023b;
                case 23: goto L_0x0225;
                case 24: goto L_0x0210;
                case 25: goto L_0x01fb;
                case 26: goto L_0x01e6;
                case 27: goto L_0x01d1;
                case 28: goto L_0x0199;
                default: goto L_0x0193;
            }
        L_0x0193:
            fK.E r0 = new fK.E
            r0.<init>((int) r1)
            throw r0
        L_0x0199:
            jK.Y0 r1 = jK.Y0.f144077a
            r61 = r15
            r15 = 28
            java.lang.Object r1 = r0.A(r9, r15, r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r4 = r4 | r2
            XH.N r2 = XH.C16807N.f139792a
            r2 = r1
        L_0x01ab:
            r25 = r44
            r34 = r46
            r28 = r48
            r37 = r49
            r38 = r50
            r29 = r52
            r41 = r53
            r42 = r54
            r31 = r55
            r30 = r56
            r32 = r57
            r33 = r58
            r27 = r60
            r60 = r61
        L_0x01c7:
            r1 = 0
            r15 = 1
            r36 = 4
            r40 = 8
            r44 = 2
            goto L_0x0777
        L_0x01d1:
            r61 = r15
            r15 = 28
            jK.Y0 r1 = jK.Y0.f144077a
            r15 = 27
            java.lang.Object r1 = r0.A(r9, r15, r1, r10)
            java.lang.String r1 = (java.lang.String) r1
            r10 = 134217728(0x8000000, float:3.85186E-34)
            r4 = r4 | r10
            XH.N r10 = XH.C16807N.f139792a
            r10 = r1
            goto L_0x01ab
        L_0x01e6:
            r61 = r15
            r15 = 27
            jK.Y0 r1 = jK.Y0.f144077a
            r15 = 26
            java.lang.Object r1 = r0.A(r9, r15, r1, r3)
            java.lang.String r1 = (java.lang.String) r1
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            r4 = r4 | r3
            XH.N r3 = XH.C16807N.f139792a
            r3 = r1
            goto L_0x01ab
        L_0x01fb:
            r61 = r15
            r15 = 26
            jK.Y0 r1 = jK.Y0.f144077a
            r15 = 25
            java.lang.Object r1 = r0.A(r9, r15, r1, r5)
            java.lang.String r1 = (java.lang.String) r1
            r5 = 33554432(0x2000000, float:9.403955E-38)
            r4 = r4 | r5
            XH.N r5 = XH.C16807N.f139792a
            r5 = r1
            goto L_0x01ab
        L_0x0210:
            r61 = r15
            r15 = 25
            jK.Y0 r1 = jK.Y0.f144077a
            r15 = 24
            java.lang.Object r1 = r0.A(r9, r15, r1, r6)
            java.lang.String r1 = (java.lang.String) r1
            r6 = 16777216(0x1000000, float:2.3509887E-38)
            r4 = r4 | r6
            XH.N r6 = XH.C16807N.f139792a
            r6 = r1
            goto L_0x01ab
        L_0x0225:
            r61 = r15
            r15 = 24
            jK.Y0 r1 = jK.Y0.f144077a
            r15 = 23
            java.lang.Object r1 = r0.A(r9, r15, r1, r14)
            java.lang.String r1 = (java.lang.String) r1
            r14 = 8388608(0x800000, float:1.17549435E-38)
            r4 = r4 | r14
            XH.N r14 = XH.C16807N.f139792a
            r14 = r1
            goto L_0x01ab
        L_0x023b:
            r61 = r15
            r15 = 23
            jK.Y0 r1 = jK.Y0.f144077a
            r15 = 22
            java.lang.Object r1 = r0.A(r9, r15, r1, r7)
            java.lang.String r1 = (java.lang.String) r1
            r7 = 4194304(0x400000, float:5.877472E-39)
            r4 = r4 | r7
            XH.N r7 = XH.C16807N.f139792a
            r7 = r1
            goto L_0x01ab
        L_0x0251:
            r61 = r15
            r15 = 22
            jK.Y0 r1 = jK.Y0.f144077a
            r15 = 21
            java.lang.Object r1 = r0.A(r9, r15, r1, r8)
            java.lang.String r1 = (java.lang.String) r1
            r8 = 2097152(0x200000, float:2.938736E-39)
            r4 = r4 | r8
            XH.N r8 = XH.C16807N.f139792a
            r8 = r1
            goto L_0x01ab
        L_0x0267:
            r61 = r15
            r15 = 21
            jK.Y0 r1 = jK.Y0.f144077a
            r15 = 20
            java.lang.Object r1 = r0.A(r9, r15, r1, r11)
            java.lang.String r1 = (java.lang.String) r1
            r11 = 1048576(0x100000, float:1.469368E-39)
            r4 = r4 | r11
            XH.N r11 = XH.C16807N.f139792a
            r11 = r1
            goto L_0x01ab
        L_0x027d:
            r61 = r15
            r15 = 20
            jK.Y0 r1 = jK.Y0.f144077a
            r15 = 19
            java.lang.Object r1 = r0.A(r9, r15, r1, r13)
            java.lang.String r1 = (java.lang.String) r1
            r13 = 524288(0x80000, float:7.34684E-40)
            r4 = r4 | r13
            XH.N r13 = XH.C16807N.f139792a
            r13 = r1
            goto L_0x01ab
        L_0x0293:
            r61 = r15
            r15 = 19
            jK.Y0 r1 = jK.Y0.f144077a
            r15 = 18
            java.lang.Object r1 = r0.A(r9, r15, r1, r12)
            java.lang.String r1 = (java.lang.String) r1
            r12 = 262144(0x40000, float:3.67342E-40)
            r4 = r4 | r12
            XH.N r12 = XH.C16807N.f139792a
            r12 = r1
            goto L_0x01ab
        L_0x02a9:
            r61 = r15
            r15 = 18
            jK.Y0 r1 = jK.Y0.f144077a
            r25 = r2
            r2 = r61
            r15 = 17
            java.lang.Object r1 = r0.A(r9, r15, r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            r2 = 131072(0x20000, float:1.83671E-40)
            r4 = r4 | r2
            XH.N r2 = XH.C16807N.f139792a
            r2 = r25
            r25 = r44
            r34 = r46
            r28 = r48
            r37 = r49
            r38 = r50
            r29 = r52
            r41 = r53
            r42 = r54
            r31 = r55
            r30 = r56
            r32 = r57
            r33 = r58
            r27 = r60
            r15 = 1
            r36 = 4
            r40 = 8
            r44 = 2
            r60 = r1
        L_0x02e5:
            r1 = 0
            goto L_0x0777
        L_0x02e8:
            r25 = r2
            r2 = r15
            r15 = 17
            jK.Y0 r1 = jK.Y0.f144077a
            r15 = 16
            r94 = r60
            r60 = r2
            r2 = r94
            java.lang.Object r1 = r0.A(r9, r15, r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            r2 = 65536(0x10000, float:9.18355E-41)
            r4 = r4 | r2
            XH.N r2 = XH.C16807N.f139792a
            r27 = r1
            r2 = r25
            r25 = r44
            r34 = r46
            r28 = r48
            r37 = r49
            r38 = r50
            r29 = r52
            r41 = r53
            r42 = r54
            r31 = r55
            r30 = r56
            r32 = r57
            r33 = r58
            goto L_0x01c7
        L_0x0320:
            r25 = r2
            r2 = r60
            r60 = r15
            jK.Y0 r1 = jK.Y0.f144077a
            r27 = r2
            r2 = r58
            r15 = 15
            java.lang.Object r1 = r0.A(r9, r15, r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            r2 = 32768(0x8000, float:4.5918E-41)
            r4 = r4 | r2
            XH.N r2 = XH.C16807N.f139792a
            r33 = r1
            r2 = r25
            r25 = r44
            r34 = r46
            r28 = r48
            r37 = r49
            r38 = r50
            r29 = r52
            r41 = r53
            r42 = r54
            r31 = r55
            r30 = r56
            r32 = r57
            goto L_0x01c7
        L_0x0356:
            r25 = r2
            r2 = r58
            r27 = r60
            r60 = r15
            r15 = 15
            jK.Y0 r1 = jK.Y0.f144077a
            r28 = r2
            r2 = r57
            r15 = 14
            java.lang.Object r1 = r0.A(r9, r15, r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            r4 = r4 | 16384(0x4000, float:2.2959E-41)
            XH.N r2 = XH.C16807N.f139792a
            r32 = r1
            r2 = r25
            r33 = r28
            r25 = r44
            r34 = r46
            r28 = r48
            r37 = r49
            r38 = r50
            r29 = r52
            r41 = r53
            r42 = r54
            r31 = r55
            r30 = r56
            goto L_0x01c7
        L_0x038e:
            r25 = r2
            r2 = r57
            r28 = r58
            r27 = r60
            r60 = r15
            r15 = 14
            jK.Y0 r1 = jK.Y0.f144077a
            r29 = r2
            r2 = r56
            r15 = 13
            java.lang.Object r1 = r0.A(r9, r15, r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            r4 = r4 | 8192(0x2000, float:1.14794E-41)
            XH.N r2 = XH.C16807N.f139792a
            r30 = r1
            r2 = r25
            r33 = r28
            r32 = r29
            r25 = r44
            r34 = r46
            r28 = r48
            r37 = r49
            r38 = r50
            r29 = r52
            r41 = r53
            r42 = r54
            r31 = r55
            goto L_0x01c7
        L_0x03c8:
            r25 = r2
            r2 = r56
            r29 = r57
            r28 = r58
            r27 = r60
            r60 = r15
            r15 = 13
            jK.Y0 r1 = jK.Y0.f144077a
            r30 = r2
            r2 = r55
            r15 = 12
            java.lang.Object r1 = r0.A(r9, r15, r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            r4 = r4 | 4096(0x1000, float:5.74E-42)
            XH.N r2 = XH.C16807N.f139792a
            r31 = r1
            r2 = r25
            r33 = r28
            r32 = r29
            r25 = r44
            r34 = r46
            r28 = r48
            r37 = r49
            r38 = r50
            r29 = r52
            r41 = r53
            r42 = r54
            goto L_0x01c7
        L_0x0402:
            r25 = r2
            r2 = r55
            r30 = r56
            r29 = r57
            r28 = r58
            r27 = r60
            r60 = r15
            r15 = 12
            jK.Y0 r1 = jK.Y0.f144077a
            r31 = r2
            r2 = r54
            r15 = 11
            java.lang.Object r1 = r0.A(r9, r15, r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            r4 = r4 | 2048(0x800, float:2.87E-42)
            XH.N r2 = XH.C16807N.f139792a
            r42 = r1
            r2 = r25
            r33 = r28
            r32 = r29
            r25 = r44
            r34 = r46
            r28 = r48
            r37 = r49
            r38 = r50
            r29 = r52
            r41 = r53
            goto L_0x01c7
        L_0x043c:
            r25 = r2
            r2 = r54
            r31 = r55
            r30 = r56
            r29 = r57
            r28 = r58
            r27 = r60
            r60 = r15
            r15 = 11
            jK.X r1 = jK.X.f144073a
            r42 = r2
            r2 = r53
            r15 = 10
            java.lang.Object r1 = r0.A(r9, r15, r1, r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r4 = r4 | 1024(0x400, float:1.435E-42)
            XH.N r2 = XH.C16807N.f139792a
            r41 = r1
            r2 = r25
            r33 = r28
            r32 = r29
            r25 = r44
            r34 = r46
            r28 = r48
            r37 = r49
            r38 = r50
            r29 = r52
            goto L_0x01c7
        L_0x0476:
            r25 = r2
            r2 = r53
            r42 = r54
            r31 = r55
            r30 = r56
            r29 = r57
            r28 = r58
            r27 = r60
            r60 = r15
            r15 = 10
            jK.Y0 r1 = jK.Y0.f144077a
            r41 = r2
            r2 = r52
            r15 = 9
            java.lang.Object r1 = r0.A(r9, r15, r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            r4 = r4 | 512(0x200, float:7.175E-43)
            XH.N r2 = XH.C16807N.f139792a
            r2 = r25
            r33 = r28
            r32 = r29
            r25 = r44
            r34 = r46
            r28 = r48
            r37 = r49
            r38 = r50
            r15 = 1
            r36 = 4
            r40 = 8
            r44 = 2
            r29 = r1
            goto L_0x02e5
        L_0x04b7:
            r25 = r2
            r2 = r52
            r41 = r53
            r42 = r54
            r31 = r55
            r30 = r56
            r29 = r57
            r28 = r58
            r27 = r60
            r60 = r15
            r15 = 9
            jK.Y0 r1 = jK.Y0.f144077a
            r15 = 8
            r94 = r51
            r51 = r2
            r2 = r94
            java.lang.Object r1 = r0.A(r9, r15, r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            r4 = r4 | 256(0x100, float:3.59E-43)
            XH.N r2 = XH.C16807N.f139792a
            r2 = r25
            r33 = r28
            r32 = r29
            r25 = r44
            r34 = r46
            r28 = r48
            r37 = r49
            r38 = r50
            r29 = r51
            r15 = 1
            r36 = 4
            r40 = 8
            r44 = 2
            r51 = r1
            goto L_0x02e5
        L_0x04fe:
            r25 = r2
            r2 = r51
            r51 = r52
            r41 = r53
            r42 = r54
            r31 = r55
            r30 = r56
            r29 = r57
            r28 = r58
            r27 = r60
            r60 = r15
            jK.Y0 r1 = jK.Y0.f144077a
            r39 = r2
            r2 = r50
            r15 = 7
            java.lang.Object r1 = r0.A(r9, r15, r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            r4 = r4 | 128(0x80, float:1.794E-43)
            XH.N r2 = XH.C16807N.f139792a
            r38 = r1
            r2 = r25
            r33 = r28
            r32 = r29
            r25 = r44
            r34 = r46
            r28 = r48
            r37 = r49
        L_0x0535:
            r29 = r51
            r1 = 0
            r15 = 1
            r36 = 4
            r40 = 8
            r44 = 2
        L_0x053f:
            r51 = r39
            goto L_0x0777
        L_0x0543:
            r25 = r2
            r2 = r50
            r39 = r51
            r51 = r52
            r41 = r53
            r42 = r54
            r31 = r55
            r30 = r56
            r29 = r57
            r28 = r58
            r27 = r60
            r60 = r15
            r15 = 7
            jK.Y0 r1 = jK.Y0.f144077a
            r38 = r2
            r2 = r49
            r15 = 6
            java.lang.Object r1 = r0.A(r9, r15, r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            r4 = r4 | 64
            XH.N r2 = XH.C16807N.f139792a
            r37 = r1
            r2 = r25
            r33 = r28
            r32 = r29
            r25 = r44
            r34 = r46
            r28 = r48
            goto L_0x0535
        L_0x057c:
            r25 = r2
            r2 = r49
            r38 = r50
            r39 = r51
            r51 = r52
            r41 = r53
            r42 = r54
            r31 = r55
            r30 = r56
            r29 = r57
            r28 = r58
            r27 = r60
            r60 = r15
            r15 = 6
            jK.Y0 r1 = jK.Y0.f144077a
            r37 = r2
            r2 = r48
            r15 = 5
            java.lang.Object r1 = r0.A(r9, r15, r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            r4 = r4 | 32
            XH.N r2 = XH.C16807N.f139792a
            r2 = r25
            r33 = r28
            r32 = r29
            r25 = r44
            r34 = r46
            r29 = r51
            r15 = 1
            r36 = 4
            r40 = 8
            r44 = 2
            r28 = r1
        L_0x05bd:
            r51 = r39
            goto L_0x02e5
        L_0x05c1:
            r25 = r2
            r2 = r48
            r37 = r49
            r38 = r50
            r39 = r51
            r51 = r52
            r41 = r53
            r42 = r54
            r31 = r55
            r30 = r56
            r29 = r57
            r28 = r58
            r27 = r60
            r60 = r15
            r15 = 5
            jK.Y0 r1 = jK.Y0.f144077a
            r15 = 4
            r94 = r47
            r47 = r2
            r2 = r94
            java.lang.Object r1 = r0.A(r9, r15, r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            r15 = 16
            r4 = r4 | r15
            XH.N r2 = XH.C16807N.f139792a
            r2 = r25
            r33 = r28
            r32 = r29
            r25 = r44
            r34 = r46
            r28 = r47
            r29 = r51
            r15 = 1
            r36 = 4
            r40 = 8
            r44 = 2
            r47 = r1
            goto L_0x05bd
        L_0x060a:
            r25 = r2
            r2 = r47
            r47 = r48
            r37 = r49
            r38 = r50
            r39 = r51
            r51 = r52
            r41 = r53
            r42 = r54
            r31 = r55
            r30 = r56
            r29 = r57
            r28 = r58
            r27 = r60
            r60 = r15
            r15 = 16
            jK.Y0 r1 = jK.Y0.f144077a
            r35 = r2
            r2 = r46
            r15 = 3
            java.lang.Object r1 = r0.A(r9, r15, r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            r40 = 8
            r4 = r4 | 8
            XH.N r2 = XH.C16807N.f139792a
            r34 = r1
            r2 = r25
            r33 = r28
            r32 = r29
            r25 = r44
            r28 = r47
            r29 = r51
            r1 = 0
            r15 = 1
            r36 = 4
            r44 = 2
            r47 = r35
            goto L_0x053f
        L_0x0655:
            r25 = r2
            r2 = r46
            r35 = r47
            r47 = r48
            r37 = r49
            r38 = r50
            r39 = r51
            r51 = r52
            r41 = r53
            r42 = r54
            r31 = r55
            r30 = r56
            r29 = r57
            r28 = r58
            r27 = r60
            r40 = 8
            r60 = r15
            r15 = 3
            jK.Y0 r1 = jK.Y0.f144077a
            r34 = r2
            r2 = r45
            r15 = 2
            java.lang.Object r1 = r0.A(r9, r15, r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            r36 = 4
            r4 = r4 | 4
            XH.N r2 = XH.C16807N.f139792a
            r45 = r1
            r2 = r25
            r33 = r28
            r32 = r29
            r25 = r44
            r28 = r47
            r29 = r51
            r1 = 0
            r44 = r15
            r47 = r35
            r51 = r39
            r15 = 1
            goto L_0x0777
        L_0x06a3:
            r25 = r2
            r2 = r45
            r34 = r46
            r35 = r47
            r47 = r48
            r37 = r49
            r38 = r50
            r39 = r51
            r51 = r52
            r41 = r53
            r42 = r54
            r31 = r55
            r30 = r56
            r29 = r57
            r28 = r58
            r27 = r60
            r36 = 4
            r40 = 8
            r60 = r15
            r15 = 2
            jK.Y0 r1 = jK.Y0.f144077a
            r33 = r2
            r2 = r44
            r15 = 1
            java.lang.Object r1 = r0.A(r9, r15, r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            r44 = 2
            r4 = r4 | 2
            XH.N r2 = XH.C16807N.f139792a
            r2 = r25
            r32 = r29
            r45 = r33
            r29 = r51
            r25 = r1
            r33 = r28
            r51 = r39
            r28 = r47
            r1 = 0
            r47 = r35
            goto L_0x0777
        L_0x06f2:
            r25 = r2
            r2 = r44
            r33 = r45
            r34 = r46
            r35 = r47
            r47 = r48
            r37 = r49
            r38 = r50
            r39 = r51
            r51 = r52
            r41 = r53
            r42 = r54
            r31 = r55
            r30 = r56
            r29 = r57
            r28 = r58
            r27 = r60
            r1 = 0
            r36 = 4
            r40 = 8
            r44 = 2
            r60 = r15
            r15 = 1
            int r32 = r0.j(r9, r1)
            r4 = r4 | r15
            XH.N r43 = XH.C16807N.f139792a
            r43 = r32
            r33 = r28
            r32 = r29
            r28 = r47
            r29 = r51
            r47 = r35
            r51 = r39
        L_0x0733:
            r94 = r25
            r25 = r2
            r2 = r94
            goto L_0x0777
        L_0x073a:
            r25 = r2
            r2 = r44
            r33 = r45
            r34 = r46
            r35 = r47
            r47 = r48
            r37 = r49
            r38 = r50
            r39 = r51
            r51 = r52
            r41 = r53
            r42 = r54
            r31 = r55
            r30 = r56
            r29 = r57
            r28 = r58
            r27 = r60
            r1 = 0
            r36 = 4
            r40 = 8
            r44 = 2
            r60 = r15
            r15 = 1
            XH.N r32 = XH.C16807N.f139792a
            r59 = r1
            r32 = r29
            r29 = r51
            r33 = r28
            r51 = r39
            r28 = r47
            r47 = r35
            goto L_0x0733
        L_0x0777:
            r44 = r25
            r1 = r27
            r48 = r28
            r52 = r29
            r56 = r30
            r55 = r31
            r57 = r32
            r58 = r33
            r46 = r34
            r49 = r37
            r50 = r38
            r53 = r41
            r54 = r42
            r15 = r60
            goto L_0x0188
        L_0x0795:
            r27 = r1
            r25 = r2
            r60 = r15
            r2 = r44
            r33 = r45
            r34 = r46
            r35 = r47
            r47 = r48
            r37 = r49
            r38 = r50
            r39 = r51
            r51 = r52
            r41 = r53
            r42 = r54
            r31 = r55
            r30 = r56
            r29 = r57
            r28 = r58
            r65 = r2
            r90 = r3
            r63 = r4
            r89 = r5
            r88 = r6
            r86 = r7
            r85 = r8
            r91 = r10
            r84 = r11
            r82 = r12
            r83 = r13
            r87 = r14
            r92 = r25
            r80 = r27
            r79 = r28
            r78 = r29
            r77 = r30
            r76 = r31
            r66 = r33
            r67 = r34
            r68 = r35
            r70 = r37
            r71 = r38
            r72 = r39
            r74 = r41
            r75 = r42
            r64 = r43
            r69 = r47
            r73 = r51
            r81 = r60
        L_0x07f5:
            r0.c(r9)
            com.ingka.ikea.userappointments.impl.models.remote.AppointmentRemote r0 = new com.ingka.ikea.userappointments.impl.models.remote.AppointmentRemote
            r62 = r0
            r93 = 0
            r62.<init>(r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.userappointments.impl.models.remote.AppointmentRemote$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.userappointments.impl.models.remote.AppointmentRemote");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, AppointmentRemote appointmentRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(appointmentRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        AppointmentRemote.D(appointmentRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: kotlinx.serialization.KSerializer<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        /*
            r31 = this;
            jK.X r0 = jK.X.f144073a
            jK.Y0 r1 = jK.Y0.f144077a
            kotlinx.serialization.KSerializer r2 = gK.C17294a.u(r1)
            kotlinx.serialization.KSerializer r3 = gK.C17294a.u(r1)
            kotlinx.serialization.KSerializer r4 = gK.C17294a.u(r1)
            kotlinx.serialization.KSerializer r5 = gK.C17294a.u(r1)
            kotlinx.serialization.KSerializer r6 = gK.C17294a.u(r1)
            kotlinx.serialization.KSerializer r7 = gK.C17294a.u(r1)
            kotlinx.serialization.KSerializer r8 = gK.C17294a.u(r1)
            kotlinx.serialization.KSerializer r9 = gK.C17294a.u(r1)
            kotlinx.serialization.KSerializer r10 = gK.C17294a.u(r1)
            kotlinx.serialization.KSerializer r11 = gK.C17294a.u(r0)
            kotlinx.serialization.KSerializer r12 = gK.C17294a.u(r1)
            kotlinx.serialization.KSerializer r13 = gK.C17294a.u(r1)
            kotlinx.serialization.KSerializer r14 = gK.C17294a.u(r1)
            kotlinx.serialization.KSerializer r15 = gK.C17294a.u(r1)
            kotlinx.serialization.KSerializer r16 = gK.C17294a.u(r1)
            kotlinx.serialization.KSerializer r17 = gK.C17294a.u(r1)
            kotlinx.serialization.KSerializer r18 = gK.C17294a.u(r1)
            kotlinx.serialization.KSerializer r19 = gK.C17294a.u(r1)
            kotlinx.serialization.KSerializer r20 = gK.C17294a.u(r1)
            kotlinx.serialization.KSerializer r21 = gK.C17294a.u(r1)
            kotlinx.serialization.KSerializer r22 = gK.C17294a.u(r1)
            kotlinx.serialization.KSerializer r23 = gK.C17294a.u(r1)
            kotlinx.serialization.KSerializer r24 = gK.C17294a.u(r1)
            kotlinx.serialization.KSerializer r25 = gK.C17294a.u(r1)
            kotlinx.serialization.KSerializer r26 = gK.C17294a.u(r1)
            kotlinx.serialization.KSerializer r27 = gK.C17294a.u(r1)
            kotlinx.serialization.KSerializer r28 = gK.C17294a.u(r1)
            kotlinx.serialization.KSerializer r1 = gK.C17294a.u(r1)
            r29 = r1
            r1 = 29
            kotlinx.serialization.KSerializer[] r1 = new kotlinx.serialization.KSerializer[r1]
            r30 = 0
            r1[r30] = r0
            r0 = 1
            r1[r0] = r2
            r0 = 2
            r1[r0] = r3
            r0 = 3
            r1[r0] = r4
            r0 = 4
            r1[r0] = r5
            r0 = 5
            r1[r0] = r6
            r0 = 6
            r1[r0] = r7
            r0 = 7
            r1[r0] = r8
            r0 = 8
            r1[r0] = r9
            r0 = 9
            r1[r0] = r10
            r0 = 10
            r1[r0] = r11
            r0 = 11
            r1[r0] = r12
            r0 = 12
            r1[r0] = r13
            r0 = 13
            r1[r0] = r14
            r0 = 14
            r1[r0] = r15
            r0 = 15
            r1[r0] = r16
            r0 = 16
            r1[r0] = r17
            r0 = 17
            r1[r0] = r18
            r0 = 18
            r1[r0] = r19
            r0 = 19
            r1[r0] = r20
            r0 = 20
            r1[r0] = r21
            r0 = 21
            r1[r0] = r22
            r0 = 22
            r1[r0] = r23
            r0 = 23
            r1[r0] = r24
            r0 = 24
            r1[r0] = r25
            r0 = 25
            r1[r0] = r26
            r0 = 26
            r1[r0] = r27
            r0 = 27
            r1[r0] = r28
            r0 = 28
            r1[r0] = r29
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.userappointments.impl.models.remote.AppointmentRemote$$serializer.childSerializers():kotlinx.serialization.KSerializer[]");
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
