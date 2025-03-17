package jK;

import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012*\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00050\u0002B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u00020\f*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0015\u001a\u00020\u0014*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00052\u0006\u0010\u0013\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u0019\u001a\u00020\u0014*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00052\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010 \u001a\u00020\u001b8\u0016X\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"LjK/S;", "E", "LjK/x;", "", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "Lkotlinx/serialization/KSerializer;", "eSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "r", "()Ljava/util/HashSet;", "", "s", "(Ljava/util/HashSet;)I", "w", "(Ljava/util/HashSet;)Ljava/util/Set;", "v", "(Ljava/util/Set;)Ljava/util/HashSet;", "size", "LXH/N;", "t", "(Ljava/util/HashSet;I)V", "index", "element", "u", "(Ljava/util/HashSet;ILjava/lang/Object;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "b", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class S<E> extends C17486x<E, Set<? extends E>, HashSet<E>> {

    /* renamed from: b  reason: collision with root package name */
    private final SerialDescriptor f144061b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public S(KSerializer<E> kSerializer) {
        super(kSerializer);
        C17542s.j(kSerializer, "eSerializer");
        this.f144061b = new Q(kSerializer.getDescriptor());
    }

    public SerialDescriptor getDescriptor() {
        return this.f144061b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public HashSet<E> b() {
        return new HashSet<>();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public int c(HashSet<E> hashSet) {
        C17542s.j(hashSet, "<this>");
        return hashSet.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void d(HashSet<E> hashSet, int i10) {
        C17542s.j(hashSet, "<this>");
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void o(HashSet<E> hashSet, int i10, E e10) {
        C17542s.j(hashSet, "<this>");
        hashSet.add(e10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public HashSet<E> l(Set<? extends E> set) {
        C17542s.j(set, "<this>");
        HashSet<E> hashSet = set instanceof HashSet ? (HashSet) set : null;
        return hashSet == null ? new HashSet<>(set) : hashSet;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public Set<E> m(HashSet<E> hashSet) {
        C17542s.j(hashSet, "<this>");
        return hashSet;
    }
}
