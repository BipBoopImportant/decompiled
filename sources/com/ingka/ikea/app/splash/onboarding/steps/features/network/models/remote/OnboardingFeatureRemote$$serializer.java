package com.ingka.ikea.app.splash.onboarding.steps.features.network.models.remote;

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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/app/splash/onboarding/steps/features/network/models/remote/OnboardingFeatureRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/app/splash/onboarding/steps/features/network/models/remote/OnboardingFeatureRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/app/splash/onboarding/steps/features/network/models/remote/OnboardingFeatureRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/app/splash/onboarding/steps/features/network/models/remote/OnboardingFeatureRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class OnboardingFeatureRemote$$serializer implements N<OnboardingFeatureRemote> {
    public static final OnboardingFeatureRemote$$serializer INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static final int f92488a = 8;
    private static final SerialDescriptor descriptor;

    static {
        OnboardingFeatureRemote$$serializer onboardingFeatureRemote$$serializer = new OnboardingFeatureRemote$$serializer();
        INSTANCE = onboardingFeatureRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.app.splash.onboarding.steps.features.network.models.remote.OnboardingFeatureRemote", onboardingFeatureRemote$$serializer, 7);
        j02.p("durationMs", false);
        j02.p("framing", false);
        j02.p("title", false);
        j02.p("category", false);
        j02.p("analytics_id", false);
        j02.p("video", false);
        j02.p("image", false);
        descriptor = j02;
    }

    private OnboardingFeatureRemote$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: com.ingka.ikea.app.splash.onboarding.steps.features.network.models.remote.VideoRemote} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: com.ingka.ikea.app.splash.onboarding.steps.features.network.models.remote.ImageRemote} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.app.splash.onboarding.steps.features.network.models.remote.OnboardingFeatureRemote deserialize(kotlinx.serialization.encoding.Decoder r31) {
        /*
            r30 = this;
            r0 = r31
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            boolean r2 = r0.q()
            r3 = 6
            r4 = 5
            r5 = 3
            r6 = 4
            r7 = 2
            r8 = 1
            r9 = 0
            r10 = 0
            if (r2 == 0) goto L_0x0053
            long r11 = r0.g(r1, r9)
            java.lang.String r2 = r0.n(r1, r8)
            java.lang.String r7 = r0.n(r1, r7)
            java.lang.String r5 = r0.n(r1, r5)
            java.lang.String r6 = r0.n(r1, r6)
            com.ingka.ikea.app.splash.onboarding.steps.features.network.models.remote.VideoRemote$$serializer r8 = com.ingka.ikea.app.splash.onboarding.steps.features.network.models.remote.VideoRemote$$serializer.INSTANCE
            java.lang.Object r4 = r0.A(r1, r4, r8, r10)
            com.ingka.ikea.app.splash.onboarding.steps.features.network.models.remote.VideoRemote r4 = (com.ingka.ikea.app.splash.onboarding.steps.features.network.models.remote.VideoRemote) r4
            com.ingka.ikea.app.splash.onboarding.steps.features.network.models.remote.ImageRemote$$serializer r8 = com.ingka.ikea.app.splash.onboarding.steps.features.network.models.remote.ImageRemote$$serializer.INSTANCE
            java.lang.Object r3 = r0.A(r1, r3, r8, r10)
            com.ingka.ikea.app.splash.onboarding.steps.features.network.models.remote.ImageRemote r3 = (com.ingka.ikea.app.splash.onboarding.steps.features.network.models.remote.ImageRemote) r3
            r8 = 127(0x7f, float:1.78E-43)
            r23 = r2
            r28 = r3
            r27 = r4
            r25 = r5
            r26 = r6
            r24 = r7
            r20 = r8
            r21 = r11
            goto L_0x00bf
        L_0x0053:
            r11 = 0
            r18 = r8
            r2 = r9
            r13 = r10
            r14 = r13
            r15 = r14
            r16 = r11
            r11 = r15
            r12 = r11
        L_0x005f:
            if (r18 == 0) goto L_0x00af
            int r9 = r0.p(r1)
            switch(r9) {
                case -1: goto L_0x00ab;
                case 0: goto L_0x00a3;
                case 1: goto L_0x009c;
                case 2: goto L_0x0095;
                case 3: goto L_0x008e;
                case 4: goto L_0x0087;
                case 5: goto L_0x007b;
                case 6: goto L_0x006e;
                default: goto L_0x0068;
            }
        L_0x0068:
            fK.E r0 = new fK.E
            r0.<init>((int) r9)
            throw r0
        L_0x006e:
            com.ingka.ikea.app.splash.onboarding.steps.features.network.models.remote.ImageRemote$$serializer r9 = com.ingka.ikea.app.splash.onboarding.steps.features.network.models.remote.ImageRemote$$serializer.INSTANCE
            java.lang.Object r9 = r0.A(r1, r3, r9, r15)
            r15 = r9
            com.ingka.ikea.app.splash.onboarding.steps.features.network.models.remote.ImageRemote r15 = (com.ingka.ikea.app.splash.onboarding.steps.features.network.models.remote.ImageRemote) r15
            r2 = r2 | 64
        L_0x0079:
            r9 = 0
            goto L_0x005f
        L_0x007b:
            com.ingka.ikea.app.splash.onboarding.steps.features.network.models.remote.VideoRemote$$serializer r9 = com.ingka.ikea.app.splash.onboarding.steps.features.network.models.remote.VideoRemote$$serializer.INSTANCE
            java.lang.Object r9 = r0.A(r1, r4, r9, r14)
            r14 = r9
            com.ingka.ikea.app.splash.onboarding.steps.features.network.models.remote.VideoRemote r14 = (com.ingka.ikea.app.splash.onboarding.steps.features.network.models.remote.VideoRemote) r14
            r2 = r2 | 32
            goto L_0x0079
        L_0x0087:
            java.lang.String r13 = r0.n(r1, r6)
            r2 = r2 | 16
            goto L_0x0079
        L_0x008e:
            java.lang.String r12 = r0.n(r1, r5)
            r2 = r2 | 8
            goto L_0x0079
        L_0x0095:
            java.lang.String r11 = r0.n(r1, r7)
            r2 = r2 | 4
            goto L_0x0079
        L_0x009c:
            java.lang.String r10 = r0.n(r1, r8)
            r2 = r2 | 2
            goto L_0x0079
        L_0x00a3:
            r9 = 0
            long r16 = r0.g(r1, r9)
            r2 = r2 | 1
            goto L_0x005f
        L_0x00ab:
            r9 = 0
            r18 = r9
            goto L_0x005f
        L_0x00af:
            r20 = r2
            r23 = r10
            r24 = r11
            r25 = r12
            r26 = r13
            r27 = r14
            r28 = r15
            r21 = r16
        L_0x00bf:
            r0.c(r1)
            com.ingka.ikea.app.splash.onboarding.steps.features.network.models.remote.OnboardingFeatureRemote r0 = new com.ingka.ikea.app.splash.onboarding.steps.features.network.models.remote.OnboardingFeatureRemote
            r29 = 0
            r19 = r0
            r19.<init>(r20, r21, r23, r24, r25, r26, r27, r28, r29)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.splash.onboarding.steps.features.network.models.remote.OnboardingFeatureRemote$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.app.splash.onboarding.steps.features.network.models.remote.OnboardingFeatureRemote");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, OnboardingFeatureRemote onboardingFeatureRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(onboardingFeatureRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        OnboardingFeatureRemote.h(onboardingFeatureRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?> u10 = C17294a.u(VideoRemote$$serializer.INSTANCE);
        KSerializer<?> u11 = C17294a.u(ImageRemote$$serializer.INSTANCE);
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{C17458i0.f144113a, y02, y02, y02, y02, u10, u11};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
