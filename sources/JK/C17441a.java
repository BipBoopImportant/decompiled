package jK;

import iK.C17394c;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004B\t\b\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\n*\u00028\u0001H$¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f*\u00028\u0001H$¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00028\u0002H$¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\n*\u00028\u0002H$¢\u0006\u0004\b\u0014\u0010\u000eJ\u0013\u0010\u0015\u001a\u00028\u0001*\u00028\u0002H$¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00028\u0002*\u00028\u0001H$¢\u0006\u0004\b\u0017\u0010\u0016J\u001b\u0010\u001a\u001a\u00020\u0019*\u00028\u00022\u0006\u0010\u0018\u001a\u00020\nH$¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u00028\u00012\u0006\u0010\b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00018\u0001H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00028\u00012\u0006\u0010\b\u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010!J1\u0010%\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u00022\b\b\u0002\u0010$\u001a\u00020#H$¢\u0006\u0004\b%\u0010&J/\u0010(\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u00022\u0006\u0010'\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\nH$¢\u0006\u0004\b(\u0010)\u0001\u0002*+¨\u0006,"}, d2 = {"LjK/a;", "Element", "Collection", "Builder", "Lkotlinx/serialization/KSerializer;", "<init>", "()V", "LiK/c;", "decoder", "builder", "", "k", "(LiK/c;Ljava/lang/Object;)I", "f", "(Ljava/lang/Object;)I", "", "e", "(Ljava/lang/Object;)Ljava/util/Iterator;", "b", "()Ljava/lang/Object;", "c", "m", "(Ljava/lang/Object;)Ljava/lang/Object;", "l", "size", "LXH/N;", "d", "(Ljava/lang/Object;I)V", "Lkotlinx/serialization/encoding/Decoder;", "previous", "g", "(Lkotlinx/serialization/encoding/Decoder;Ljava/lang/Object;)Ljava/lang/Object;", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "index", "", "checkIndex", "i", "(LiK/c;ILjava/lang/Object;Z)V", "startIndex", "h", "(LiK/c;Ljava/lang/Object;II)V", "LjK/w;", "LjK/m0;", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jK.a  reason: case insensitive filesystem */
public abstract class C17441a<Element, Collection, Builder> implements KSerializer<Collection> {
    public /* synthetic */ C17441a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void j(C17441a aVar, C17394c cVar, int i10, Object obj, boolean z10, int i11, Object obj2) {
        if (obj2 == null) {
            if ((i11 & 8) != 0) {
                z10 = true;
            }
            aVar.i(cVar, i10, obj, z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
    }

    private final int k(C17394c cVar, Builder builder) {
        int l10 = cVar.l(getDescriptor());
        d(builder, l10);
        return l10;
    }

    /* access modifiers changed from: protected */
    public abstract Builder b();

    /* access modifiers changed from: protected */
    public abstract int c(Builder builder);

    /* access modifiers changed from: protected */
    public abstract void d(Builder builder, int i10);

    public Collection deserialize(Decoder decoder) {
        C17542s.j(decoder, "decoder");
        return g(decoder, (Object) null);
    }

    /* access modifiers changed from: protected */
    public abstract Iterator<Element> e(Collection collection);

    /* access modifiers changed from: protected */
    public abstract int f(Collection collection);

    public final Collection g(Decoder decoder, Collection collection) {
        Object obj;
        C17542s.j(decoder, "decoder");
        if (collection == null || (obj = l(collection)) == null) {
            obj = b();
        }
        int c10 = c(obj);
        C17394c b10 = decoder.b(getDescriptor());
        if (!b10.q()) {
            while (true) {
                int p10 = b10.p(getDescriptor());
                if (p10 == -1) {
                    break;
                }
                j(this, b10, c10 + p10, obj, false, 8, (Object) null);
            }
        } else {
            h(b10, obj, c10, k(b10, obj));
        }
        b10.c(getDescriptor());
        return m(obj);
    }

    /* access modifiers changed from: protected */
    public abstract void h(C17394c cVar, Builder builder, int i10, int i11);

    /* access modifiers changed from: protected */
    public abstract void i(C17394c cVar, int i10, Builder builder, boolean z10);

    /* access modifiers changed from: protected */
    public abstract Builder l(Collection collection);

    /* access modifiers changed from: protected */
    public abstract Collection m(Builder builder);

    private C17441a() {
    }
}
