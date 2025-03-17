package jK;

import fK.C17251d;
import fK.C17257j;
import fK.q;
import fK.r;
import iK.C17394c;
import iK.C17395d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.O;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import uI.C18055d;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\t\b\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00162\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001a\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00192\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"LjK/b;", "", "T", "Lkotlinx/serialization/KSerializer;", "<init>", "()V", "LiK/c;", "compositeDecoder", "c", "(LiK/c;)Ljava/lang/Object;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "", "klassName", "LfK/d;", "d", "(LiK/c;Ljava/lang/String;)LfK/d;", "LfK/r;", "e", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)LfK/r;", "LuI/d;", "f", "()LuI/d;", "baseClass", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jK.b  reason: case insensitive filesystem */
public abstract class C17443b<T> implements KSerializer<T> {
    /* access modifiers changed from: private */
    public final T c(C17394c cVar) {
        return C17394c.e(cVar, getDescriptor(), 1, C17257j.a(this, cVar, cVar.n(getDescriptor(), 0)), (Object) null, 8, (Object) null);
    }

    public C17251d<T> d(C17394c cVar, String str) {
        C17542s.j(cVar, "decoder");
        return cVar.a().e(f(), str);
    }

    public final T deserialize(Decoder decoder) {
        T t10;
        C17542s.j(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        C17394c b10 = decoder.b(descriptor);
        O o10 = new O();
        if (b10.q()) {
            t10 = c(b10);
        } else {
            t10 = null;
            while (true) {
                int p10 = b10.p(getDescriptor());
                if (p10 != -1) {
                    if (p10 == 0) {
                        o10.f144348a = b10.n(getDescriptor(), p10);
                    } else if (p10 != 1) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Invalid index in polymorphic deserialization of ");
                        String str = (String) o10.f144348a;
                        if (str == null) {
                            str = "unknown class";
                        }
                        sb2.append(str);
                        sb2.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                        sb2.append(p10);
                        throw new q(sb2.toString());
                    } else {
                        T t11 = o10.f144348a;
                        if (t11 != null) {
                            o10.f144348a = t11;
                            C17251d a10 = C17257j.a(this, b10, (String) t11);
                            t10 = C17394c.e(b10, getDescriptor(), p10, a10, (Object) null, 8, (Object) null);
                        } else {
                            throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                        }
                    }
                } else if (t10 != null) {
                    C17542s.h(t10, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer");
                } else {
                    throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) o10.f144348a)).toString());
                }
            }
        }
        b10.c(descriptor);
        return t10;
    }

    public r<T> e(Encoder encoder, T t10) {
        C17542s.j(encoder, "encoder");
        C17542s.j(t10, "value");
        return encoder.a().f(f(), t10);
    }

    public abstract C18055d<T> f();

    public final void serialize(Encoder encoder, T t10) {
        C17542s.j(encoder, "encoder");
        C17542s.j(t10, "value");
        r b10 = C17257j.b(this, encoder, t10);
        SerialDescriptor descriptor = getDescriptor();
        C17395d b11 = encoder.b(descriptor);
        b11.y(getDescriptor(), 0, b10.getDescriptor().i());
        SerialDescriptor descriptor2 = getDescriptor();
        C17542s.h(b10, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        b11.i(descriptor2, 1, b10, t10);
        b11.c(descriptor);
    }
}
