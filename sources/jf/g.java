package Jf;

import hK.C17339e;
import hK.k;
import java.math.BigInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LJf/g;", "Lkotlinx/serialization/KSerializer;", "Ljava/math/BigInteger;", "<init>", "()V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/math/BigInteger;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Ljava/math/BigInteger;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class g implements KSerializer<BigInteger> {

    /* renamed from: a  reason: collision with root package name */
    public static final g f61297a = new g();

    /* renamed from: b  reason: collision with root package name */
    private static final SerialDescriptor f61298b = k.b("BigInteger", C17339e.i.f143447a);

    private g() {
    }

    /* renamed from: b */
    public BigInteger deserialize(Decoder decoder) {
        C17542s.j(decoder, "decoder");
        return new BigInteger(decoder.z());
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, BigInteger bigInteger) {
        C17542s.j(encoder, "encoder");
        C17542s.j(bigInteger, "value");
        String bigInteger2 = bigInteger.toString();
        C17542s.i(bigInteger2, "toString(...)");
        encoder.G(bigInteger2);
    }

    public SerialDescriptor getDescriptor() {
        return f61298b;
    }
}
