package jK;

import YH.C16870n;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17527c;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import uI.C18055d;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\n\b\u0001\u0010\u0003*\u0004\u0018\u00018\u00002*\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u00070\u0004B#\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011*\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u0007H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\u000e*\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u0007H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005*\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u0007H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u0007*\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001e\u001a\u00020\u001d*\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u00072\u0006\u0010\u001c\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ3\u0010\"\u001a\u00020\u001d*\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u00072\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\"\u0010#R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010+\u001a\u00020&8\u0016X\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"LjK/R0;", "", "ElementKlass", "Element", "LjK/w;", "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "LuI/d;", "kClass", "Lkotlinx/serialization/KSerializer;", "eSerializer", "<init>", "(LuI/d;Lkotlinx/serialization/KSerializer;)V", "", "t", "([Ljava/lang/Object;)I", "", "s", "([Ljava/lang/Object;)Ljava/util/Iterator;", "p", "()Ljava/util/ArrayList;", "q", "(Ljava/util/ArrayList;)I", "w", "(Ljava/util/ArrayList;)[Ljava/lang/Object;", "v", "([Ljava/lang/Object;)Ljava/util/ArrayList;", "size", "LXH/N;", "r", "(Ljava/util/ArrayList;I)V", "index", "element", "u", "(Ljava/util/ArrayList;ILjava/lang/Object;)V", "b", "LuI/d;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "c", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class R0<ElementKlass, Element extends ElementKlass> extends C17484w<Element, Element[], ArrayList<Element>> {

    /* renamed from: b  reason: collision with root package name */
    private final C18055d<ElementKlass> f144059b;

    /* renamed from: c  reason: collision with root package name */
    private final SerialDescriptor f144060c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public R0(C18055d<ElementKlass> dVar, KSerializer<Element> kSerializer) {
        super(kSerializer, (DefaultConstructorMarker) null);
        C17542s.j(dVar, "kClass");
        C17542s.j(kSerializer, "eSerializer");
        this.f144059b = dVar;
        this.f144060c = new C17447d(kSerializer.getDescriptor());
    }

    public SerialDescriptor getDescriptor() {
        return this.f144060c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public ArrayList<Element> b() {
        return new ArrayList<>();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public int c(ArrayList<Element> arrayList) {
        C17542s.j(arrayList, "<this>");
        return arrayList.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void d(ArrayList<Element> arrayList, int i10) {
        C17542s.j(arrayList, "<this>");
        arrayList.ensureCapacity(i10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public Iterator<Element> e(Element[] elementArr) {
        C17542s.j(elementArr, "<this>");
        return C17527c.a(elementArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public int f(Element[] elementArr) {
        C17542s.j(elementArr, "<this>");
        return elementArr.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void o(ArrayList<Element> arrayList, int i10, Element element) {
        C17542s.j(arrayList, "<this>");
        arrayList.add(i10, element);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public ArrayList<Element> l(Element[] elementArr) {
        C17542s.j(elementArr, "<this>");
        return new ArrayList<>(C16870n.f(elementArr));
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public Element[] m(ArrayList<Element> arrayList) {
        C17542s.j(arrayList, "<this>");
        return C0.r(arrayList, this.f144059b);
    }
}
