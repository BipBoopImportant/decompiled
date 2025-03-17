package com.sugarcube.decorate_engine;

import XH.C16814e;
import fK.C17247E;
import iK.C17394c;
import iK.C17395d;
import jK.J0;
import jK.N;
import jK.T0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/sugarcube/decorate_engine/SomeAssemblyRequired.$serializer", "LjK/N;", "Lcom/sugarcube/decorate_engine/SomeAssemblyRequired;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sugarcube/decorate_engine/SomeAssemblyRequired;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sugarcube/decorate_engine/SomeAssemblyRequired;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
public final class SomeAssemblyRequired$$serializer implements N<SomeAssemblyRequired> {
    public static final SomeAssemblyRequired$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        SomeAssemblyRequired$$serializer someAssemblyRequired$$serializer = new SomeAssemblyRequired$$serializer();
        INSTANCE = someAssemblyRequired$$serializer;
        J0 j02 = new J0("com.sugarcube.decorate_engine.SomeAssemblyRequired", someAssemblyRequired$$serializer, 2);
        j02.p("assetItems", true);
        j02.p("instanceItem", true);
        descriptor = j02;
    }

    private SomeAssemblyRequired$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{SomeAssemblyRequired.$childSerializers[0], SceneLayoutInstanceItem$$serializer.INSTANCE};
    }

    public SomeAssemblyRequired deserialize(Decoder decoder) {
        int i10;
        SceneLayoutInstanceItem sceneLayoutInstanceItem;
        List list;
        C17542s.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        C17394c b10 = decoder.b(descriptor2);
        KSerializer[] access$get$childSerializers$cp = SomeAssemblyRequired.$childSerializers;
        if (b10.q()) {
            list = (List) b10.o(descriptor2, 0, access$get$childSerializers$cp[0], null);
            sceneLayoutInstanceItem = (SceneLayoutInstanceItem) b10.o(descriptor2, 1, SceneLayoutInstanceItem$$serializer.INSTANCE, null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            List list2 = null;
            SceneLayoutInstanceItem sceneLayoutInstanceItem2 = null;
            while (z10) {
                int p10 = b10.p(descriptor2);
                if (p10 == -1) {
                    z10 = false;
                } else if (p10 == 0) {
                    list2 = (List) b10.o(descriptor2, 0, access$get$childSerializers$cp[0], list2);
                    i11 |= 1;
                } else if (p10 == 1) {
                    sceneLayoutInstanceItem2 = (SceneLayoutInstanceItem) b10.o(descriptor2, 1, SceneLayoutInstanceItem$$serializer.INSTANCE, sceneLayoutInstanceItem2);
                    i11 |= 2;
                } else {
                    throw new C17247E(p10);
                }
            }
            list = list2;
            sceneLayoutInstanceItem = sceneLayoutInstanceItem2;
            i10 = i11;
        }
        b10.c(descriptor2);
        return new SomeAssemblyRequired(i10, list, sceneLayoutInstanceItem, (T0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, SomeAssemblyRequired someAssemblyRequired) {
        C17542s.j(encoder, "encoder");
        C17542s.j(someAssemblyRequired, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        SomeAssemblyRequired.write$Self$decorate_engine_release(someAssemblyRequired, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
