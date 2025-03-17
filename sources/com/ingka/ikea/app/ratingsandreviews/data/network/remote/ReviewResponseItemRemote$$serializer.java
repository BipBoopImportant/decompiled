package com.ingka.ikea.app.ratingsandreviews.data.network.remote;

import XH.C16814e;
import gK.C17294a;
import iK.C17395d;
import jK.C17457i;
import jK.J0;
import jK.M;
import jK.N;
import jK.X;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/app/ratingsandreviews/data/network/remote/ReviewResponseItemRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/ReviewResponseItemRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/ReviewResponseItemRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/ReviewResponseItemRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class ReviewResponseItemRemote$$serializer implements N<ReviewResponseItemRemote> {
    public static final ReviewResponseItemRemote$$serializer INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static final int f91078a = 8;
    private static final SerialDescriptor descriptor;

    static {
        ReviewResponseItemRemote$$serializer reviewResponseItemRemote$$serializer = new ReviewResponseItemRemote$$serializer();
        INSTANCE = reviewResponseItemRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.app.ratingsandreviews.data.network.remote.ReviewResponseItemRemote", reviewResponseItemRemote$$serializer, 11);
        j02.p("id", false);
        j02.p("nickName", false);
        j02.p("sourceLanguageCode", false);
        j02.p("sourceCountryCode", false);
        j02.p("rating", false);
        j02.p("age", false);
        j02.p("title", false);
        j02.p("reviewText", false);
        j02.p("verifiedPurchase", false);
        j02.p("response", false);
        j02.p("positiveFeedbacksCount", false);
        descriptor = j02;
    }

    private ReviewResponseItemRemote$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: com.ingka.ikea.app.ratingsandreviews.data.network.remote.ReviewReplyRemote} */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00eb, code lost:
        r3 = 10;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.app.ratingsandreviews.data.network.remote.ReviewResponseItemRemote deserialize(kotlinx.serialization.encoding.Decoder r39) {
        /*
            r38 = this;
            r0 = r39
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            boolean r2 = r0.q()
            r3 = 10
            r4 = 9
            r5 = 7
            r6 = 6
            r7 = 5
            r8 = 3
            r9 = 8
            r10 = 4
            r11 = 2
            r12 = 1
            r13 = 0
            r14 = 0
            if (r2 == 0) goto L_0x0072
            java.lang.String r2 = r0.n(r1, r13)
            java.lang.String r12 = r0.n(r1, r12)
            java.lang.String r11 = r0.n(r1, r11)
            java.lang.String r8 = r0.n(r1, r8)
            float r10 = r0.v(r1, r10)
            java.lang.String r7 = r0.n(r1, r7)
            java.lang.String r6 = r0.n(r1, r6)
            java.lang.String r5 = r0.n(r1, r5)
            jK.i r13 = jK.C17457i.f144111a
            java.lang.Object r9 = r0.A(r1, r9, r13, r14)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            com.ingka.ikea.app.ratingsandreviews.data.network.remote.ReviewReplyRemote$$serializer r13 = com.ingka.ikea.app.ratingsandreviews.data.network.remote.ReviewReplyRemote$$serializer.INSTANCE
            java.lang.Object r4 = r0.A(r1, r4, r13, r14)
            com.ingka.ikea.app.ratingsandreviews.data.network.remote.ReviewReplyRemote r4 = (com.ingka.ikea.app.ratingsandreviews.data.network.remote.ReviewReplyRemote) r4
            int r3 = r0.j(r1, r3)
            r13 = 2047(0x7ff, float:2.868E-42)
            r26 = r2
            r36 = r3
            r35 = r4
            r33 = r5
            r32 = r6
            r31 = r7
            r29 = r8
            r34 = r9
            r30 = r10
            r28 = r11
            r27 = r12
            r25 = r13
            goto L_0x0114
        L_0x0072:
            r2 = 0
            r23 = r12
            r15 = r13
            r12 = r14
            r16 = r12
            r17 = r16
            r18 = r17
            r19 = r18
            r20 = r19
            r21 = r20
            r22 = r21
            r13 = r22
            r14 = r2
            r2 = r15
        L_0x0089:
            if (r23 == 0) goto L_0x00fc
            int r11 = r0.p(r1)
            switch(r11) {
                case -1: goto L_0x00f7;
                case 0: goto L_0x00ee;
                case 1: goto L_0x00e3;
                case 2: goto L_0x00db;
                case 3: goto L_0x00d4;
                case 4: goto L_0x00cd;
                case 5: goto L_0x00c6;
                case 6: goto L_0x00bf;
                case 7: goto L_0x00b8;
                case 8: goto L_0x00ac;
                case 9: goto L_0x00a0;
                case 10: goto L_0x0098;
                default: goto L_0x0092;
            }
        L_0x0092:
            fK.E r0 = new fK.E
            r0.<init>((int) r11)
            throw r0
        L_0x0098:
            int r2 = r0.j(r1, r3)
            r15 = r15 | 1024(0x400, float:1.435E-42)
        L_0x009e:
            r11 = 2
            goto L_0x0089
        L_0x00a0:
            com.ingka.ikea.app.ratingsandreviews.data.network.remote.ReviewReplyRemote$$serializer r11 = com.ingka.ikea.app.ratingsandreviews.data.network.remote.ReviewReplyRemote$$serializer.INSTANCE
            java.lang.Object r11 = r0.A(r1, r4, r11, r12)
            r12 = r11
            com.ingka.ikea.app.ratingsandreviews.data.network.remote.ReviewReplyRemote r12 = (com.ingka.ikea.app.ratingsandreviews.data.network.remote.ReviewReplyRemote) r12
            r15 = r15 | 512(0x200, float:7.175E-43)
            goto L_0x009e
        L_0x00ac:
            jK.i r11 = jK.C17457i.f144111a
            java.lang.Object r11 = r0.A(r1, r9, r11, r13)
            r13 = r11
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            r15 = r15 | 256(0x100, float:3.59E-43)
            goto L_0x009e
        L_0x00b8:
            java.lang.String r22 = r0.n(r1, r5)
            r15 = r15 | 128(0x80, float:1.794E-43)
            goto L_0x009e
        L_0x00bf:
            java.lang.String r21 = r0.n(r1, r6)
            r15 = r15 | 64
            goto L_0x009e
        L_0x00c6:
            java.lang.String r20 = r0.n(r1, r7)
            r15 = r15 | 32
            goto L_0x009e
        L_0x00cd:
            float r14 = r0.v(r1, r10)
            r15 = r15 | 16
            goto L_0x009e
        L_0x00d4:
            java.lang.String r19 = r0.n(r1, r8)
            r15 = r15 | 8
            goto L_0x009e
        L_0x00db:
            r11 = 2
            java.lang.String r18 = r0.n(r1, r11)
            r15 = r15 | 4
            goto L_0x0089
        L_0x00e3:
            r3 = 1
            r11 = 2
            java.lang.String r17 = r0.n(r1, r3)
            r15 = r15 | 2
        L_0x00eb:
            r3 = 10
            goto L_0x0089
        L_0x00ee:
            r3 = 0
            r11 = 2
            java.lang.String r16 = r0.n(r1, r3)
            r15 = r15 | 1
            goto L_0x00eb
        L_0x00f7:
            r3 = 0
            r11 = 2
            r23 = r3
            goto L_0x00eb
        L_0x00fc:
            r36 = r2
            r35 = r12
            r34 = r13
            r30 = r14
            r25 = r15
            r26 = r16
            r27 = r17
            r28 = r18
            r29 = r19
            r31 = r20
            r32 = r21
            r33 = r22
        L_0x0114:
            r0.c(r1)
            com.ingka.ikea.app.ratingsandreviews.data.network.remote.ReviewResponseItemRemote r0 = new com.ingka.ikea.app.ratingsandreviews.data.network.remote.ReviewResponseItemRemote
            r37 = 0
            r24 = r0
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.ratingsandreviews.data.network.remote.ReviewResponseItemRemote$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.app.ratingsandreviews.data.network.remote.ReviewResponseItemRemote");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, ReviewResponseItemRemote reviewResponseItemRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(reviewResponseItemRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        ReviewResponseItemRemote.c(reviewResponseItemRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?> u10 = C17294a.u(C17457i.f144111a);
        KSerializer<?> u11 = C17294a.u(ReviewReplyRemote$$serializer.INSTANCE);
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{y02, y02, y02, y02, M.f144051a, y02, y02, y02, u10, u11, X.f144073a};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
