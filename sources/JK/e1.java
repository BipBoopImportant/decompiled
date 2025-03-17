package jK;

import XH.C16795B;
import XH.C16807N;
import fK.q;
import hK.C17335a;
import hK.k;
import iK.C17394c;
import iK.C17395d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00050\u0004B1\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ)\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ1\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u001a\u0010!\u001a\u00020\u001d8\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"LjK/e1;", "A", "B", "C", "Lkotlinx/serialization/KSerializer;", "LXH/B;", "aSerializer", "bSerializer", "cSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "LiK/c;", "composite", "c", "(LiK/c;)LXH/B;", "d", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "g", "(Lkotlinx/serialization/encoding/Encoder;LXH/B;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "f", "(Lkotlinx/serialization/encoding/Decoder;)LXH/B;", "a", "Lkotlinx/serialization/KSerializer;", "b", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e1<A, B, C> implements KSerializer<C16795B<? extends A, ? extends B, ? extends C>> {

    /* renamed from: a  reason: collision with root package name */
    private final KSerializer<A> f144094a;

    /* renamed from: b  reason: collision with root package name */
    private final KSerializer<B> f144095b;

    /* renamed from: c  reason: collision with root package name */
    private final KSerializer<C> f144096c;

    /* renamed from: d  reason: collision with root package name */
    private final SerialDescriptor f144097d = k.d("kotlin.Triple", new SerialDescriptor[0], new d1(this));

    public e1(KSerializer<A> kSerializer, KSerializer<B> kSerializer2, KSerializer<C> kSerializer3) {
        C17542s.j(kSerializer, "aSerializer");
        C17542s.j(kSerializer2, "bSerializer");
        C17542s.j(kSerializer3, "cSerializer");
        this.f144094a = kSerializer;
        this.f144095b = kSerializer2;
        this.f144096c = kSerializer3;
    }

    private final C16795B<A, B, C> c(C17394c cVar) {
        Object e10 = C17394c.e(cVar, getDescriptor(), 0, this.f144094a, (Object) null, 8, (Object) null);
        Object e11 = C17394c.e(cVar, getDescriptor(), 1, this.f144095b, (Object) null, 8, (Object) null);
        Object e12 = C17394c.e(cVar, getDescriptor(), 2, this.f144096c, (Object) null, 8, (Object) null);
        cVar.c(getDescriptor());
        return new C16795B<>(e10, e11, e12);
    }

    private final C16795B<A, B, C> d(C17394c cVar) {
        Object a10 = f1.f144101a;
        Object a11 = f1.f144101a;
        Object a12 = f1.f144101a;
        while (true) {
            int p10 = cVar.p(getDescriptor());
            if (p10 == -1) {
                cVar.c(getDescriptor());
                if (a10 == f1.f144101a) {
                    throw new q("Element 'first' is missing");
                } else if (a11 == f1.f144101a) {
                    throw new q("Element 'second' is missing");
                } else if (a12 != f1.f144101a) {
                    return new C16795B<>(a10, a11, a12);
                } else {
                    throw new q("Element 'third' is missing");
                }
            } else if (p10 == 0) {
                a10 = C17394c.e(cVar, getDescriptor(), 0, this.f144094a, (Object) null, 8, (Object) null);
            } else if (p10 == 1) {
                a11 = C17394c.e(cVar, getDescriptor(), 1, this.f144095b, (Object) null, 8, (Object) null);
            } else if (p10 == 2) {
                a12 = C17394c.e(cVar, getDescriptor(), 2, this.f144096c, (Object) null, 8, (Object) null);
            } else {
                throw new q("Unexpected index " + p10);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N e(e1 e1Var, C17335a aVar) {
        C17542s.j(aVar, "$this$buildClassSerialDescriptor");
        C17335a aVar2 = aVar;
        C17335a.b(aVar2, "first", e1Var.f144094a.getDescriptor(), (List) null, false, 12, (Object) null);
        C17335a.b(aVar2, "second", e1Var.f144095b.getDescriptor(), (List) null, false, 12, (Object) null);
        C17335a.b(aVar, "third", e1Var.f144096c.getDescriptor(), (List) null, false, 12, (Object) null);
        return C16807N.f139792a;
    }

    /* renamed from: f */
    public C16795B<A, B, C> deserialize(Decoder decoder) {
        C17542s.j(decoder, "decoder");
        C17394c b10 = decoder.b(getDescriptor());
        return b10.q() ? c(b10) : d(b10);
    }

    /* renamed from: g */
    public void serialize(Encoder encoder, C16795B<? extends A, ? extends B, ? extends C> b10) {
        C17542s.j(encoder, "encoder");
        C17542s.j(b10, "value");
        C17395d b11 = encoder.b(getDescriptor());
        b11.i(getDescriptor(), 0, this.f144094a, b10.d());
        b11.i(getDescriptor(), 1, this.f144095b, b10.e());
        b11.i(getDescriptor(), 2, this.f144096c, b10.f());
        b11.c(getDescriptor());
    }

    public SerialDescriptor getDescriptor() {
        return this.f144097d;
    }
}
