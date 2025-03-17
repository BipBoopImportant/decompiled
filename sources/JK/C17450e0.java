package jK;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012*\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00050\u0002B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u00020\f*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0015\u001a\u00020\u0014*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00052\u0006\u0010\u0013\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u0019\u001a\u00020\u0014*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00052\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010 \u001a\u00020\u001b8\u0016X\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"LjK/e0;", "E", "LjK/x;", "", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "Lkotlinx/serialization/KSerializer;", "eSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "r", "()Ljava/util/LinkedHashSet;", "", "s", "(Ljava/util/LinkedHashSet;)I", "w", "(Ljava/util/LinkedHashSet;)Ljava/util/Set;", "v", "(Ljava/util/Set;)Ljava/util/LinkedHashSet;", "size", "LXH/N;", "t", "(Ljava/util/LinkedHashSet;I)V", "index", "element", "u", "(Ljava/util/LinkedHashSet;ILjava/lang/Object;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "b", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jK.e0  reason: case insensitive filesystem */
public final class C17450e0<E> extends C17486x<E, Set<? extends E>, LinkedHashSet<E>> {

    /* renamed from: b  reason: collision with root package name */
    private final SerialDescriptor f144093b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17450e0(KSerializer<E> kSerializer) {
        super(kSerializer);
        C17542s.j(kSerializer, "eSerializer");
        this.f144093b = new C17448d0(kSerializer.getDescriptor());
    }

    public SerialDescriptor getDescriptor() {
        return this.f144093b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public LinkedHashSet<E> b() {
        return new LinkedHashSet<>();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public int c(LinkedHashSet<E> linkedHashSet) {
        C17542s.j(linkedHashSet, "<this>");
        return linkedHashSet.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void d(LinkedHashSet<E> linkedHashSet, int i10) {
        C17542s.j(linkedHashSet, "<this>");
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void o(LinkedHashSet<E> linkedHashSet, int i10, E e10) {
        C17542s.j(linkedHashSet, "<this>");
        linkedHashSet.add(e10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public LinkedHashSet<E> l(Set<? extends E> set) {
        C17542s.j(set, "<this>");
        LinkedHashSet<E> linkedHashSet = set instanceof LinkedHashSet ? (LinkedHashSet) set : null;
        return linkedHashSet == null ? new LinkedHashSet<>(set) : linkedHashSet;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public Set<E> m(LinkedHashSet<E> linkedHashSet) {
        C17542s.j(linkedHashSet, "<this>");
        return linkedHashSet;
    }
}
