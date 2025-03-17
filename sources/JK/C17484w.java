package jK;

import iK.C17394c;
import iK.C17395d;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004B\u0017\b\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f*\u00028\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u0000H$¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00028\u00022\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#\u0001\u0003%&'¨\u0006("}, d2 = {"LjK/w;", "Element", "Collection", "Builder", "LjK/a;", "Lkotlinx/serialization/KSerializer;", "elementSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "", "index", "element", "LXH/N;", "o", "(Ljava/lang/Object;ILjava/lang/Object;)V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "LiK/c;", "decoder", "builder", "startIndex", "size", "h", "(LiK/c;Ljava/lang/Object;II)V", "", "checkIndex", "i", "(LiK/c;ILjava/lang/Object;Z)V", "a", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "LjK/x;", "LjK/O0;", "LjK/R0;", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jK.w  reason: case insensitive filesystem */
public abstract class C17484w<Element, Collection, Builder> extends C17441a<Element, Collection, Builder> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final KSerializer<Element> f144177a;

    public /* synthetic */ C17484w(KSerializer kSerializer, DefaultConstructorMarker defaultConstructorMarker) {
        this(kSerializer);
    }

    public abstract SerialDescriptor getDescriptor();

    /* access modifiers changed from: protected */
    public final void h(C17394c cVar, Builder builder, int i10, int i11) {
        C17542s.j(cVar, "decoder");
        if (i11 >= 0) {
            for (int i12 = 0; i12 < i11; i12++) {
                i(cVar, i10 + i12, builder, false);
            }
            return;
        }
        throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
    }

    /* access modifiers changed from: protected */
    public void i(C17394c cVar, int i10, Builder builder, boolean z10) {
        C17542s.j(cVar, "decoder");
        o(builder, i10, C17394c.e(cVar, getDescriptor(), i10, this.f144177a, (Object) null, 8, (Object) null));
    }

    /* access modifiers changed from: protected */
    public abstract void o(Builder builder, int i10, Element element);

    public void serialize(Encoder encoder, Collection collection) {
        C17542s.j(encoder, "encoder");
        int f10 = f(collection);
        SerialDescriptor descriptor = getDescriptor();
        C17395d h10 = encoder.h(descriptor, f10);
        Iterator e10 = e(collection);
        for (int i10 = 0; i10 < f10; i10++) {
            h10.i(getDescriptor(), i10, this.f144177a, e10.next());
        }
        h10.c(descriptor);
    }

    private C17484w(KSerializer<Element> kSerializer) {
        super((DefaultConstructorMarker) null);
        this.f144177a = kSerializer;
    }
}
