package jK;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012*\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00050\u0002B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u00020\f*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0015\u001a\u00020\u0014*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00052\u0006\u0010\u0013\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u0018\u001a\u00020\u0014*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00052\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u001a8\u0016X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"LjK/f;", "E", "LjK/x;", "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Lkotlinx/serialization/KSerializer;", "element", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "r", "()Ljava/util/ArrayList;", "", "s", "(Ljava/util/ArrayList;)I", "w", "(Ljava/util/ArrayList;)Ljava/util/List;", "v", "(Ljava/util/List;)Ljava/util/ArrayList;", "size", "LXH/N;", "t", "(Ljava/util/ArrayList;I)V", "index", "u", "(Ljava/util/ArrayList;ILjava/lang/Object;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "b", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jK.f  reason: case insensitive filesystem */
public final class C17451f<E> extends C17486x<E, List<? extends E>, ArrayList<E>> {

    /* renamed from: b  reason: collision with root package name */
    private final SerialDescriptor f144098b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17451f(KSerializer<E> kSerializer) {
        super(kSerializer);
        C17542s.j(kSerializer, "element");
        this.f144098b = new C17449e(kSerializer.getDescriptor());
    }

    public SerialDescriptor getDescriptor() {
        return this.f144098b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public ArrayList<E> b() {
        return new ArrayList<>();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public int c(ArrayList<E> arrayList) {
        C17542s.j(arrayList, "<this>");
        return arrayList.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void d(ArrayList<E> arrayList, int i10) {
        C17542s.j(arrayList, "<this>");
        arrayList.ensureCapacity(i10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void o(ArrayList<E> arrayList, int i10, E e10) {
        C17542s.j(arrayList, "<this>");
        arrayList.add(i10, e10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public ArrayList<E> l(List<? extends E> list) {
        C17542s.j(list, "<this>");
        ArrayList<E> arrayList = list instanceof ArrayList ? (ArrayList) list : null;
        return arrayList == null ? new ArrayList<>(list) : arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public List<E> m(ArrayList<E> arrayList) {
        C17542s.j(arrayList, "<this>");
        return arrayList;
    }
}
