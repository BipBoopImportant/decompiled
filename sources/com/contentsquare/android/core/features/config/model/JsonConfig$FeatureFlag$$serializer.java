package com.contentsquare.android.core.features.config.model;

import XH.C16814e;
import com.contentsquare.android.core.features.config.model.JsonConfig;
import fK.C17247E;
import iK.C17394c;
import iK.C17395d;
import jK.C17457i;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/contentsquare/android/core/features/config/model/JsonConfig.FeatureFlag.$serializer", "LjK/N;", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$FeatureFlag;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/contentsquare/android/core/features/config/model/JsonConfig$FeatureFlag;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/contentsquare/android/core/features/config/model/JsonConfig$FeatureFlag;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C16814e
public final class JsonConfig$FeatureFlag$$serializer implements N<JsonConfig.FeatureFlag> {
    public static final JsonConfig$FeatureFlag$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        JsonConfig$FeatureFlag$$serializer jsonConfig$FeatureFlag$$serializer = new JsonConfig$FeatureFlag$$serializer();
        INSTANCE = jsonConfig$FeatureFlag$$serializer;
        J0 j02 = new J0("com.contentsquare.android.core.features.config.model.JsonConfig.FeatureFlag", jsonConfig$FeatureFlag$$serializer, 3);
        j02.p("name", false);
        j02.p("min_version", false);
        j02.p("enabled", false);
        descriptor = j02;
    }

    private JsonConfig$FeatureFlag$$serializer() {
    }

    /* renamed from: b */
    public JsonConfig.FeatureFlag deserialize(Decoder decoder) {
        boolean z10;
        String str;
        String str2;
        int i10;
        Decoder decoder2 = decoder;
        C17542s.j(decoder2, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        C17394c b10 = decoder2.b(descriptor2);
        if (b10.q()) {
            String n10 = b10.n(descriptor2, 0);
            String n11 = b10.n(descriptor2, 1);
            str2 = n10;
            z10 = b10.D(descriptor2, 2);
            str = n11;
            i10 = 7;
        } else {
            String str3 = null;
            String str4 = null;
            boolean z11 = true;
            boolean z12 = false;
            int i11 = 0;
            while (z11) {
                int p10 = b10.p(descriptor2);
                if (p10 == -1) {
                    z11 = false;
                } else if (p10 == 0) {
                    str3 = b10.n(descriptor2, 0);
                    i11 |= 1;
                } else if (p10 == 1) {
                    str4 = b10.n(descriptor2, 1);
                    i11 |= 2;
                } else if (p10 == 2) {
                    z12 = b10.D(descriptor2, 2);
                    i11 |= 4;
                } else {
                    throw new C17247E(p10);
                }
            }
            str2 = str3;
            z10 = z12;
            str = str4;
            i10 = i11;
        }
        b10.c(descriptor2);
        return new JsonConfig.FeatureFlag(i10, str2, str, z10, (T0) null);
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, JsonConfig.FeatureFlag featureFlag) {
        C17542s.j(encoder, "encoder");
        C17542s.j(featureFlag, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        JsonConfig.FeatureFlag.d(featureFlag, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] childSerializers() {
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{y02, y02, C17457i.f144111a};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
