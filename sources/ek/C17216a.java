package eK;

import dK.C17174c;
import hK.C17339e;
import hK.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LeK/a;", "Lkotlinx/serialization/KSerializer;", "LdK/c;", "<init>", "()V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)LdK/c;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;LdK/c;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kotlinx-datetime"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: eK.a  reason: case insensitive filesystem */
public final class C17216a implements KSerializer<C17174c> {

    /* renamed from: a  reason: collision with root package name */
    public static final C17216a f143133a = new C17216a();

    /* renamed from: b  reason: collision with root package name */
    private static final SerialDescriptor f143134b = k.b("Instant", C17339e.i.f143447a);

    private C17216a() {
    }

    /* renamed from: b */
    public C17174c deserialize(Decoder decoder) {
        C17542s.j(decoder, "decoder");
        return C17174c.Companion.d(decoder.z());
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, C17174c cVar) {
        C17542s.j(encoder, "encoder");
        C17542s.j(cVar, "value");
        encoder.G(cVar.toString());
    }

    public SerialDescriptor getDescriptor() {
        return f143134b;
    }
}
