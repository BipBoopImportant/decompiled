package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
import fK.C17247E;
import iK.C17394c;
import iK.C17395d;
import jK.J0;
import jK.N;
import jK.T0;
import jK.X;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/ingka/ikea/app/caasremote/models/NullableMapRemoteModel.$serializer", "LjK/N;", "Lcom/ingka/ikea/app/caasremote/models/NullableMapRemoteModel;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/app/caasremote/models/NullableMapRemoteModel;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/app/caasremote/models/NullableMapRemoteModel;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
public final class NullableMapRemoteModel$$serializer implements N<NullableMapRemoteModel> {
    public static final NullableMapRemoteModel$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        NullableMapRemoteModel$$serializer nullableMapRemoteModel$$serializer = new NullableMapRemoteModel$$serializer();
        INSTANCE = nullableMapRemoteModel$$serializer;
        J0 j02 = new J0("com.ingka.ikea.app.caasremote.models.NullableMapRemoteModel", nullableMapRemoteModel$$serializer, 4);
        j02.p("entries", false);
        j02.p("keys", false);
        j02.p("size", false);
        j02.p("values", false);
        descriptor = j02;
    }

    private NullableMapRemoteModel$$serializer() {
    }

    /* renamed from: b */
    public NullableMapRemoteModel deserialize(Decoder decoder) {
        CollectionRemoteModel collectionRemoteModel;
        int i10;
        SetRemoteModel setRemoteModel;
        SetRemoteModel setRemoteModel2;
        int i11;
        Decoder decoder2 = decoder;
        C17542s.j(decoder2, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        C17394c b10 = decoder2.b(descriptor2);
        if (b10.q()) {
            SetRemoteModel$$serializer setRemoteModel$$serializer = SetRemoteModel$$serializer.INSTANCE;
            int j10 = b10.j(descriptor2, 2);
            setRemoteModel = (SetRemoteModel) b10.o(descriptor2, 1, setRemoteModel$$serializer, null);
            collectionRemoteModel = (CollectionRemoteModel) b10.o(descriptor2, 3, CollectionRemoteModel$$serializer.INSTANCE, null);
            i10 = j10;
            i11 = 15;
            setRemoteModel2 = (SetRemoteModel) b10.o(descriptor2, 0, setRemoteModel$$serializer, null);
        } else {
            boolean z10 = true;
            int i12 = 0;
            SetRemoteModel setRemoteModel3 = null;
            SetRemoteModel setRemoteModel4 = null;
            CollectionRemoteModel collectionRemoteModel2 = null;
            int i13 = 0;
            while (z10) {
                int p10 = b10.p(descriptor2);
                if (p10 == -1) {
                    z10 = false;
                } else if (p10 == 0) {
                    setRemoteModel3 = (SetRemoteModel) b10.o(descriptor2, 0, SetRemoteModel$$serializer.INSTANCE, setRemoteModel3);
                    i13 |= 1;
                } else if (p10 == 1) {
                    setRemoteModel4 = (SetRemoteModel) b10.o(descriptor2, 1, SetRemoteModel$$serializer.INSTANCE, setRemoteModel4);
                    i13 |= 2;
                } else if (p10 == 2) {
                    i12 = b10.j(descriptor2, 2);
                    i13 |= 4;
                } else if (p10 == 3) {
                    collectionRemoteModel2 = (CollectionRemoteModel) b10.o(descriptor2, 3, CollectionRemoteModel$$serializer.INSTANCE, collectionRemoteModel2);
                    i13 |= 8;
                } else {
                    throw new C17247E(p10);
                }
            }
            i10 = i12;
            i11 = i13;
            setRemoteModel2 = setRemoteModel3;
            setRemoteModel = setRemoteModel4;
            collectionRemoteModel = collectionRemoteModel2;
        }
        b10.c(descriptor2);
        return new NullableMapRemoteModel(i11, setRemoteModel2, setRemoteModel, i10, collectionRemoteModel, (T0) null);
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, NullableMapRemoteModel nullableMapRemoteModel) {
        C17542s.j(encoder, "encoder");
        C17542s.j(nullableMapRemoteModel, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        NullableMapRemoteModel.a(nullableMapRemoteModel, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] childSerializers() {
        SetRemoteModel$$serializer setRemoteModel$$serializer = SetRemoteModel$$serializer.INSTANCE;
        return new KSerializer[]{setRemoteModel$$serializer, setRemoteModel$$serializer, X.f144073a, CollectionRemoteModel$$serializer.INSTANCE};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
