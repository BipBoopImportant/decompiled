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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/contentsquare/android/core/features/config/model/JsonConfig.ApiErrorsV2.BodyAttributePath.$serializer", "LjK/N;", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrorsV2$BodyAttributePath;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrorsV2$BodyAttributePath;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrorsV2$BodyAttributePath;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C16814e
public final class JsonConfig$ApiErrorsV2$BodyAttributePath$$serializer implements N<JsonConfig.ApiErrorsV2.BodyAttributePath> {
    public static final JsonConfig$ApiErrorsV2$BodyAttributePath$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        JsonConfig$ApiErrorsV2$BodyAttributePath$$serializer jsonConfig$ApiErrorsV2$BodyAttributePath$$serializer = new JsonConfig$ApiErrorsV2$BodyAttributePath$$serializer();
        INSTANCE = jsonConfig$ApiErrorsV2$BodyAttributePath$$serializer;
        J0 j02 = new J0("com.contentsquare.android.core.features.config.model.JsonConfig.ApiErrorsV2.BodyAttributePath", jsonConfig$ApiErrorsV2$BodyAttributePath$$serializer, 4);
        j02.p("path", false);
        j02.p("encrypted", false);
        j02.p("primary", false);
        j02.p("type", false);
        descriptor = j02;
    }

    private JsonConfig$ApiErrorsV2$BodyAttributePath$$serializer() {
    }

    /* renamed from: b */
    public JsonConfig.ApiErrorsV2.BodyAttributePath deserialize(Decoder decoder) {
        String str;
        boolean z10;
        boolean z11;
        String str2;
        int i10;
        Decoder decoder2 = decoder;
        C17542s.j(decoder2, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        C17394c b10 = decoder2.b(descriptor2);
        if (b10.q()) {
            String n10 = b10.n(descriptor2, 0);
            boolean D10 = b10.D(descriptor2, 1);
            boolean D11 = b10.D(descriptor2, 2);
            str2 = n10;
            str = b10.n(descriptor2, 3);
            z10 = D11;
            z11 = D10;
            i10 = 15;
        } else {
            String str3 = null;
            String str4 = null;
            boolean z12 = true;
            boolean z13 = false;
            boolean z14 = false;
            int i11 = 0;
            while (z12) {
                int p10 = b10.p(descriptor2);
                if (p10 == -1) {
                    z12 = false;
                } else if (p10 == 0) {
                    str3 = b10.n(descriptor2, 0);
                    i11 |= 1;
                } else if (p10 == 1) {
                    z14 = b10.D(descriptor2, 1);
                    i11 |= 2;
                } else if (p10 == 2) {
                    z13 = b10.D(descriptor2, 2);
                    i11 |= 4;
                } else if (p10 == 3) {
                    str4 = b10.n(descriptor2, 3);
                    i11 |= 8;
                } else {
                    throw new C17247E(p10);
                }
            }
            str2 = str3;
            str = str4;
            z10 = z13;
            z11 = z14;
            i10 = i11;
        }
        b10.c(descriptor2);
        return new JsonConfig.ApiErrorsV2.BodyAttributePath(i10, str2, z11, z10, str, (T0) null);
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, JsonConfig.ApiErrorsV2.BodyAttributePath bodyAttributePath) {
        C17542s.j(encoder, "encoder");
        C17542s.j(bodyAttributePath, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        JsonConfig.ApiErrorsV2.BodyAttributePath.e(bodyAttributePath, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] childSerializers() {
        Y0 y02 = Y0.f144077a;
        C17457i iVar = C17457i.f144111a;
        return new KSerializer[]{y02, iVar, iVar, y02};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
