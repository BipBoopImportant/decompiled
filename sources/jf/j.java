package Jf;

import hK.C17339e;
import hK.k;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LJf/j;", "Lkotlinx/serialization/KSerializer;", "Ljava/time/OffsetDateTime;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Ljava/time/OffsetDateTime;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/time/OffsetDateTime;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class j implements KSerializer<OffsetDateTime> {

    /* renamed from: a  reason: collision with root package name */
    public static final j f61303a = new j();

    /* renamed from: b  reason: collision with root package name */
    private static final SerialDescriptor f61304b = k.b("OffsetDateTime", C17339e.i.f143447a);

    private j() {
    }

    /* renamed from: b */
    public OffsetDateTime deserialize(Decoder decoder) {
        C17542s.j(decoder, "decoder");
        OffsetDateTime parse = OffsetDateTime.parse(decoder.z(), DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        C17542s.i(parse, "parse(...)");
        return parse;
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, OffsetDateTime offsetDateTime) {
        C17542s.j(encoder, "encoder");
        C17542s.j(offsetDateTime, "value");
        String format = DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(offsetDateTime);
        C17542s.i(format, "format(...)");
        encoder.G(format);
    }

    public SerialDescriptor getDescriptor() {
        return f61304b;
    }
}
