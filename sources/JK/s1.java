package jK;

import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"LjK/s1;", "Lkotlinx/serialization/KSerializer;", "LXH/N;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "c", "(Lkotlinx/serialization/encoding/Encoder;LXH/N;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s1 implements KSerializer<C16807N> {

    /* renamed from: b  reason: collision with root package name */
    public static final s1 f144161b = new s1();

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C17487x0<C16807N> f144162a = new C17487x0<>("kotlin.Unit", C16807N.f139792a);

    private s1() {
    }

    public void b(Decoder decoder) {
        C17542s.j(decoder, "decoder");
        this.f144162a.deserialize(decoder);
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, C16807N n10) {
        C17542s.j(encoder, "encoder");
        C17542s.j(n10, "value");
        this.f144162a.serialize(encoder, n10);
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        b(decoder);
        return C16807N.f139792a;
    }

    public SerialDescriptor getDescriptor() {
        return this.f144162a.getDescriptor();
    }
}
