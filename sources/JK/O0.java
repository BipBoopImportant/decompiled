package jK;

import iK.C17395d;
import jK.M0;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b!\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u000e\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B\u0017\b\u0000\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\n*\u00028\u0002H\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00028\u0001*\u00028\u0002H\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u0010*\u00028\u00022\u0006\u0010\u000f\u001a\u00020\nH\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013*\u00028\u0001H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0018\u001a\u00020\u0010*\u00028\u00022\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00028\u0002H\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00028\u0001H$¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010!\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\nH$¢\u0006\u0004\b!\u0010\"J\u001d\u0010%\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020#2\u0006\u0010$\u001a\u00028\u0001¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00028\u00012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*R\u0017\u00100\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"LjK/O0;", "Element", "Array", "LjK/M0;", "Builder", "LjK/w;", "Lkotlinx/serialization/KSerializer;", "primitiveSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "", "q", "(LjK/M0;)I", "u", "(LjK/M0;)Ljava/lang/Object;", "size", "LXH/N;", "r", "(LjK/M0;I)V", "", "e", "(Ljava/lang/Object;)Ljava/util/Iterator;", "index", "element", "t", "(LjK/M0;ILjava/lang/Object;)V", "p", "()LjK/M0;", "s", "()Ljava/lang/Object;", "LiK/d;", "encoder", "content", "v", "(LiK/d;Ljava/lang/Object;I)V", "Lkotlinx/serialization/encoding/Encoder;", "value", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "b", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class O0<Element, Array, Builder extends M0<Array>> extends C17484w<Element, Array, Builder> {

    /* renamed from: b  reason: collision with root package name */
    private final SerialDescriptor f144054b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public O0(KSerializer<Element> kSerializer) {
        super(kSerializer, (DefaultConstructorMarker) null);
        C17542s.j(kSerializer, "primitiveSerializer");
        this.f144054b = new N0(kSerializer.getDescriptor());
    }

    public final Array deserialize(Decoder decoder) {
        C17542s.j(decoder, "decoder");
        return g(decoder, null);
    }

    /* access modifiers changed from: protected */
    public final Iterator<Element> e(Array array) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    public final SerialDescriptor getDescriptor() {
        return this.f144054b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final Builder b() {
        return (M0) l(s());
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final int c(Builder builder) {
        C17542s.j(builder, "<this>");
        return builder.d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void d(Builder builder, int i10) {
        C17542s.j(builder, "<this>");
        builder.b(i10);
    }

    /* access modifiers changed from: protected */
    public abstract Array s();

    public final void serialize(Encoder encoder, Array array) {
        C17542s.j(encoder, "encoder");
        int f10 = f(array);
        SerialDescriptor serialDescriptor = this.f144054b;
        C17395d h10 = encoder.h(serialDescriptor, f10);
        v(h10, array, f10);
        h10.c(serialDescriptor);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void o(Builder builder, int i10, Element element) {
        C17542s.j(builder, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final Array m(Builder builder) {
        C17542s.j(builder, "<this>");
        return builder.a();
    }

    /* access modifiers changed from: protected */
    public abstract void v(C17395d dVar, Array array, int i10);
}
