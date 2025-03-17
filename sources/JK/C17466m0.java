package jK;

import YH.X;
import hK.C17339e;
import iK.C17394c;
import iK.C17395d;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import tI.C17972h;
import tI.C17978n;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\u0014\b\u0003\u0010\u0005*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006B%\b\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u00032\u0006\u0010\u0018\u001a\u00020\u0017H\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0014\u0010)\u001a\u00020&8&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(\u0001\u0002*+¨\u0006,"}, d2 = {"LjK/m0;", "Key", "Value", "Collection", "", "Builder", "LjK/a;", "", "Lkotlinx/serialization/KSerializer;", "keySerializer", "valueSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "LiK/c;", "decoder", "builder", "", "startIndex", "size", "LXH/N;", "p", "(LiK/c;Ljava/util/Map;II)V", "index", "", "checkIndex", "q", "(LiK/c;ILjava/util/Map;Z)V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "a", "Lkotlinx/serialization/KSerializer;", "n", "()Lkotlinx/serialization/KSerializer;", "b", "o", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "LjK/P;", "LjK/c0;", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jK.m0  reason: case insensitive filesystem */
public abstract class C17466m0<Key, Value, Collection, Builder extends Map<Key, Value>> extends C17441a<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {

    /* renamed from: a  reason: collision with root package name */
    private final KSerializer<Key> f144137a;

    /* renamed from: b  reason: collision with root package name */
    private final KSerializer<Value> f144138b;

    public /* synthetic */ C17466m0(KSerializer kSerializer, KSerializer kSerializer2, DefaultConstructorMarker defaultConstructorMarker) {
        this(kSerializer, kSerializer2);
    }

    public abstract SerialDescriptor getDescriptor();

    public final KSerializer<Key> n() {
        return this.f144137a;
    }

    public final KSerializer<Value> o() {
        return this.f144138b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void h(C17394c cVar, Builder builder, int i10, int i11) {
        C17542s.j(cVar, "decoder");
        C17542s.j(builder, "builder");
        if (i11 >= 0) {
            C17972h v10 = C17978n.v(C17978n.w(0, i11 * 2), 2);
            int p10 = v10.p();
            int q10 = v10.q();
            int s10 = v10.s();
            if ((s10 > 0 && p10 <= q10) || (s10 < 0 && q10 <= p10)) {
                while (true) {
                    i(cVar, i10 + p10, builder, false);
                    if (p10 != q10) {
                        p10 += s10;
                    } else {
                        return;
                    }
                }
            }
        } else {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void i(C17394c cVar, int i10, Builder builder, boolean z10) {
        int i11;
        Value value;
        C17542s.j(cVar, "decoder");
        C17542s.j(builder, "builder");
        Object e10 = C17394c.e(cVar, getDescriptor(), i10, this.f144137a, (Object) null, 8, (Object) null);
        if (z10) {
            i11 = cVar.p(getDescriptor());
            if (i11 != i10 + 1) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + i10 + ", returned index for value: " + i11).toString());
            }
        } else {
            i11 = i10 + 1;
        }
        int i12 = i11;
        if (!builder.containsKey(e10) || (this.f144138b.getDescriptor().h() instanceof C17339e)) {
            value = C17394c.e(cVar, getDescriptor(), i12, this.f144138b, (Object) null, 8, (Object) null);
        } else {
            value = cVar.o(getDescriptor(), i12, this.f144138b, X.k(builder, e10));
        }
        builder.put(e10, value);
    }

    public void serialize(Encoder encoder, Collection collection) {
        C17542s.j(encoder, "encoder");
        int f10 = f(collection);
        SerialDescriptor descriptor = getDescriptor();
        C17395d h10 = encoder.h(descriptor, f10);
        Iterator e10 = e(collection);
        int i10 = 0;
        while (e10.hasNext()) {
            Map.Entry entry = (Map.Entry) e10.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i11 = i10 + 1;
            h10.i(getDescriptor(), i10, n(), key);
            i10 += 2;
            h10.i(getDescriptor(), i11, o(), value);
        }
        h10.c(descriptor);
    }

    private C17466m0(KSerializer<Key> kSerializer, KSerializer<Value> kSerializer2) {
        super((DefaultConstructorMarker) null);
        this.f144137a = kSerializer;
        this.f144138b = kSerializer2;
    }
}
