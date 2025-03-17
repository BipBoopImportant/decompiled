package kK;

import HJ.C15833N;
import HJ.C15854t;
import XH.C16801H;
import gK.C17294a;
import hK.C17339e;
import hK.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import lK.C17562C;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LkK/x;", "Lkotlinx/serialization/KSerializer;", "LkK/w;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;LkK/w;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)LkK/w;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class x implements KSerializer<w> {

    /* renamed from: a  reason: collision with root package name */
    public static final x f144331a = new x();

    /* renamed from: b  reason: collision with root package name */
    private static final SerialDescriptor f144332b = k.b("kotlinx.serialization.json.JsonLiteral", C17339e.i.f143447a);

    private x() {
    }

    /* renamed from: b */
    public w deserialize(Decoder decoder) {
        C17542s.j(decoder, "decoder");
        JsonElement h10 = r.d(decoder).h();
        if (h10 instanceof w) {
            return (w) h10;
        }
        throw C17562C.f(-1, "Unexpected JSON element, expected JsonLiteral, had " + P.b(h10.getClass()), h10.toString());
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, w wVar) {
        C17542s.j(encoder, "encoder");
        C17542s.j(wVar, "value");
        r.h(encoder);
        if (wVar.k()) {
            encoder.G(wVar.b());
        } else if (wVar.i() != null) {
            encoder.k(wVar.i()).G(wVar.b());
        } else {
            Long v10 = C15854t.v(wVar.b());
            if (v10 != null) {
                encoder.l(v10.longValue());
                return;
            }
            C16801H h10 = C15833N.h(wVar.b());
            if (h10 != null) {
                encoder.k(C17294a.z(C16801H.f139781b).getDescriptor()).l(h10.B());
                return;
            }
            Double q10 = C15854t.q(wVar.b());
            if (q10 != null) {
                encoder.f(q10.doubleValue());
                return;
            }
            Boolean y12 = C15854t.y1(wVar.b());
            if (y12 != null) {
                encoder.r(y12.booleanValue());
            } else {
                encoder.G(wVar.b());
            }
        }
    }

    public SerialDescriptor getDescriptor() {
        return f144332b;
    }
}
