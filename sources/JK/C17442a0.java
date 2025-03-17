package jK;

import fK.q;
import iK.C17394c;
import iK.C17395d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B%\b\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00028\u00022\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0001H$¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00028\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0004X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0018\u0010\t\u001a\u00028\u0000*\u00028\u00028$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001cR\u0018\u0010\n\u001a\u00028\u0001*\u00028\u00028$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001c\u0001\u0002\u001e\u001f¨\u0006 "}, d2 = {"LjK/a0;", "K", "V", "R", "Lkotlinx/serialization/KSerializer;", "keySerializer", "valueSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "key", "value", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "LXH/N;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "a", "Lkotlinx/serialization/KSerializer;", "c", "()Lkotlinx/serialization/KSerializer;", "b", "e", "(Ljava/lang/Object;)Ljava/lang/Object;", "d", "LjK/k0;", "LjK/z0;", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jK.a0  reason: case insensitive filesystem */
public abstract class C17442a0<K, V, R> implements KSerializer<R> {

    /* renamed from: a  reason: collision with root package name */
    private final KSerializer<K> f144083a;

    /* renamed from: b  reason: collision with root package name */
    private final KSerializer<V> f144084b;

    public /* synthetic */ C17442a0(KSerializer kSerializer, KSerializer kSerializer2, DefaultConstructorMarker defaultConstructorMarker) {
        this(kSerializer, kSerializer2);
    }

    /* access modifiers changed from: protected */
    public abstract K b(R r10);

    /* access modifiers changed from: protected */
    public final KSerializer<K> c() {
        return this.f144083a;
    }

    /* access modifiers changed from: protected */
    public abstract V d(R r10);

    public R deserialize(Decoder decoder) {
        R r10;
        C17542s.j(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        C17394c b10 = decoder.b(descriptor);
        if (b10.q()) {
            C17394c cVar = b10;
            r10 = f(C17394c.e(cVar, getDescriptor(), 0, c(), (Object) null, 8, (Object) null), C17394c.e(cVar, getDescriptor(), 1, e(), (Object) null, 8, (Object) null));
        } else {
            Object a10 = f1.f144101a;
            Object a11 = f1.f144101a;
            while (true) {
                int p10 = b10.p(getDescriptor());
                if (p10 != -1) {
                    if (p10 == 0) {
                        a10 = C17394c.e(b10, getDescriptor(), 0, c(), (Object) null, 8, (Object) null);
                    } else if (p10 == 1) {
                        a11 = C17394c.e(b10, getDescriptor(), 1, e(), (Object) null, 8, (Object) null);
                    } else {
                        throw new q("Invalid index: " + p10);
                    }
                } else if (a10 == f1.f144101a) {
                    throw new q("Element 'key' is missing");
                } else if (a11 != f1.f144101a) {
                    r10 = f(a10, a11);
                } else {
                    throw new q("Element 'value' is missing");
                }
            }
        }
        b10.c(descriptor);
        return r10;
    }

    /* access modifiers changed from: protected */
    public final KSerializer<V> e() {
        return this.f144084b;
    }

    /* access modifiers changed from: protected */
    public abstract R f(K k10, V v10);

    public void serialize(Encoder encoder, R r10) {
        C17542s.j(encoder, "encoder");
        C17395d b10 = encoder.b(getDescriptor());
        b10.i(getDescriptor(), 0, this.f144083a, b(r10));
        b10.i(getDescriptor(), 1, this.f144084b, d(r10));
        b10.c(getDescriptor());
    }

    private C17442a0(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
        this.f144083a = kSerializer;
        this.f144084b = kSerializer2;
    }
}
