package com.appmattus.certificatetransparency.internal.loglist.model.v3;

import XH.C16814e;
import com.appmattus.certificatetransparency.internal.loglist.model.v3.State;
import fK.C17247E;
import iK.C17394c;
import iK.C17395d;
import jK.J0;
import jK.N;
import jK.T0;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/appmattus/certificatetransparency/internal/loglist/model/v3/State.ReadOnly.$serializer", "LjK/N;", "Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State$ReadOnly;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State$ReadOnly;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State$ReadOnly;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class State$ReadOnly$$serializer implements N<State.ReadOnly> {
    public static final State$ReadOnly$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        State$ReadOnly$$serializer state$ReadOnly$$serializer = new State$ReadOnly$$serializer();
        INSTANCE = state$ReadOnly$$serializer;
        J0 j02 = new J0("readonly", state$ReadOnly$$serializer, 2);
        j02.p("timestamp", false);
        j02.p("final_tree_head", false);
        descriptor = j02;
    }

    private State$ReadOnly$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{State.ReadOnly.$childSerializers[0], FinalTreeHead$$serializer.INSTANCE};
    }

    public final State.ReadOnly deserialize(Decoder decoder) {
        int i10;
        FinalTreeHead finalTreeHead;
        Instant instant;
        C17542s.j(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        C17394c b10 = decoder.b(serialDescriptor);
        KSerializer[] access$get$childSerializers$cp = State.ReadOnly.$childSerializers;
        if (b10.q()) {
            instant = (Instant) b10.o(serialDescriptor, 0, access$get$childSerializers$cp[0], null);
            finalTreeHead = (FinalTreeHead) b10.o(serialDescriptor, 1, FinalTreeHead$$serializer.INSTANCE, null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            Instant instant2 = null;
            FinalTreeHead finalTreeHead2 = null;
            while (z10) {
                int p10 = b10.p(serialDescriptor);
                if (p10 == -1) {
                    z10 = false;
                } else if (p10 == 0) {
                    instant2 = (Instant) b10.o(serialDescriptor, 0, access$get$childSerializers$cp[0], instant2);
                    i11 |= 1;
                } else if (p10 == 1) {
                    finalTreeHead2 = (FinalTreeHead) b10.o(serialDescriptor, 1, FinalTreeHead$$serializer.INSTANCE, finalTreeHead2);
                    i11 |= 2;
                } else {
                    throw new C17247E(p10);
                }
            }
            instant = instant2;
            finalTreeHead = finalTreeHead2;
            i10 = i11;
        }
        b10.c(serialDescriptor);
        return new State.ReadOnly(i10, instant, finalTreeHead, (T0) null);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, State.ReadOnly readOnly) {
        C17542s.j(encoder, "encoder");
        C17542s.j(readOnly, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        State.ReadOnly.write$Self$certificatetransparency(readOnly, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
