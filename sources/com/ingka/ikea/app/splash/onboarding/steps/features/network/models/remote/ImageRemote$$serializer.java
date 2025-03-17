package com.ingka.ikea.app.splash.onboarding.steps.features.network.models.remote;

import XH.C16814e;
import fK.C17247E;
import iK.C17394c;
import iK.C17395d;
import jK.J0;
import jK.N;
import jK.T0;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/app/splash/onboarding/steps/features/network/models/remote/ImageRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/app/splash/onboarding/steps/features/network/models/remote/ImageRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/app/splash/onboarding/steps/features/network/models/remote/ImageRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/app/splash/onboarding/steps/features/network/models/remote/ImageRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class ImageRemote$$serializer implements N<ImageRemote> {
    public static final ImageRemote$$serializer INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static final int f92480a = 8;
    private static final SerialDescriptor descriptor;

    static {
        ImageRemote$$serializer imageRemote$$serializer = new ImageRemote$$serializer();
        INSTANCE = imageRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.app.splash.onboarding.steps.features.network.models.remote.ImageRemote", imageRemote$$serializer, 1);
        j02.p("url", false);
        descriptor = j02;
    }

    private ImageRemote$$serializer() {
    }

    /* renamed from: b */
    public final ImageRemote deserialize(Decoder decoder) {
        String str;
        C17542s.j(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        C17394c b10 = decoder.b(serialDescriptor);
        int i10 = 1;
        if (b10.q()) {
            str = b10.n(serialDescriptor, 0);
        } else {
            boolean z10 = true;
            int i11 = 0;
            str = null;
            while (z10) {
                int p10 = b10.p(serialDescriptor);
                if (p10 == -1) {
                    z10 = false;
                } else if (p10 == 0) {
                    str = b10.n(serialDescriptor, 0);
                    i11 = 1;
                } else {
                    throw new C17247E(p10);
                }
            }
            i10 = i11;
        }
        b10.c(serialDescriptor);
        return new ImageRemote(i10, str, (T0) null);
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, ImageRemote imageRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(imageRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        b10.y(serialDescriptor, 0, imageRemote.f92479a);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{Y0.f144077a};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
