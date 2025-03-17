package jK;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\b!\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0002*\u0004\b\u0002\u0010\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\n*\u00028\u0001H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r*\u00028\u0001H\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LjK/x;", "E", "", "C", "B", "LjK/w;", "Lkotlinx/serialization/KSerializer;", "element", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "", "q", "(Ljava/util/Collection;)I", "", "p", "(Ljava/util/Collection;)Ljava/util/Iterator;", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jK.x  reason: case insensitive filesystem */
public abstract class C17486x<E, C extends Collection<? extends E>, B> extends C17484w<E, C, B> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17486x(KSerializer<E> kSerializer) {
        super(kSerializer, (DefaultConstructorMarker) null);
        C17542s.j(kSerializer, "element");
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public Iterator<E> e(C c10) {
        C17542s.j(c10, "<this>");
        return c10.iterator();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public int f(C c10) {
        C17542s.j(c10, "<this>");
        return c10.size();
    }
}
