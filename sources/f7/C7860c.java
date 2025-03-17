package f7;

import hK.C17339e;
import hK.k;
import j7.j;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lf7/c;", "Lkotlinx/serialization/KSerializer;", "Ljava/time/Instant;", "<init>", "()V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/time/Instant;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "c", "(Lkotlinx/serialization/encoding/Encoder;Ljava/time/Instant;)Ljava/lang/Void;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "a", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: f7.c  reason: case insensitive filesystem */
public final class C7860c implements KSerializer<Instant> {

    /* renamed from: a  reason: collision with root package name */
    private final SerialDescriptor f51205a = k.b("Rfc3339", C17339e.i.f143447a);

    /* renamed from: b */
    public Instant deserialize(Decoder decoder) {
        C17542s.j(decoder, "decoder");
        return j.a(decoder.z());
    }

    /* renamed from: c */
    public Void serialize(Encoder encoder, Instant instant) {
        C17542s.j(encoder, "encoder");
        C17542s.j(instant, "value");
        throw new IllegalStateException("Serialization not supported");
    }

    public SerialDescriptor getDescriptor() {
        return this.f51205a;
    }
}
