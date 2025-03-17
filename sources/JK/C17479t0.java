package jK;

import fK.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LjK/t0;", "Lkotlinx/serialization/KSerializer;", "", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Void;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Void;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jK.t0  reason: case insensitive filesystem */
public final class C17479t0 implements KSerializer {

    /* renamed from: a  reason: collision with root package name */
    public static final C17479t0 f144167a = new C17479t0();

    /* renamed from: b  reason: collision with root package name */
    private static final SerialDescriptor f144168b = C17477s0.f144158a;

    private C17479t0() {
    }

    /* renamed from: b */
    public Void deserialize(Decoder decoder) {
        C17542s.j(decoder, "decoder");
        throw new q("'kotlin.Nothing' does not have instances");
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, Void voidR) {
        C17542s.j(encoder, "encoder");
        C17542s.j(voidR, "value");
        throw new q("'kotlin.Nothing' cannot be serialized");
    }

    public SerialDescriptor getDescriptor() {
        return f144168b;
    }
}
