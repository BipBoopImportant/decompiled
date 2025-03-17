package jK;

import fK.q;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.descriptors.SerialDescriptor;
import uI.C18055d;
import uI.C18057f;
import uI.C18068q;
import uI.C18069r;
import uI.C18070s;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u0006*\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\n*\u0006\u0012\u0002\b\u00030\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\tH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0019\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\t*\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0017\u001a\u00020\u0012*\u00020\u0016H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\"\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019¨\u0006\u001b"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "", "a", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/util/Set;", "", "", "b", "(Ljava/util/List;)[Lkotlinx/serialization/descriptors/SerialDescriptor;", "LuI/d;", "", "f", "(LuI/d;)Ljava/lang/Void;", "e", "(LuI/d;)Ljava/lang/String;", "className", "d", "(Ljava/lang/String;)Ljava/lang/String;", "LuI/q;", "", "c", "(LuI/q;)LuI/d;", "LuI/s;", "g", "(LuI/s;)LuI/q;", "[Lkotlinx/serialization/descriptors/SerialDescriptor;", "EMPTY_DESCRIPTOR_ARRAY", "kotlinx-serialization-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class D0 {

    /* renamed from: a  reason: collision with root package name */
    private static final SerialDescriptor[] f144014a = new SerialDescriptor[0];

    public static final Set<String> a(SerialDescriptor serialDescriptor) {
        C17542s.j(serialDescriptor, "<this>");
        if (serialDescriptor instanceof C17467n) {
            return ((C17467n) serialDescriptor).a();
        }
        HashSet hashSet = new HashSet(serialDescriptor.d());
        int d10 = serialDescriptor.d();
        for (int i10 = 0; i10 < d10; i10++) {
            hashSet.add(serialDescriptor.e(i10));
        }
        return hashSet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        r1 = (kotlinx.serialization.descriptors.SerialDescriptor[]) r1.toArray(new kotlinx.serialization.descriptors.SerialDescriptor[0]);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlinx.serialization.descriptors.SerialDescriptor[] b(java.util.List<? extends kotlinx.serialization.descriptors.SerialDescriptor> r1) {
        /*
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x000b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x000c
        L_0x000b:
            r1 = 0
        L_0x000c:
            if (r1 == 0) goto L_0x001b
            java.util.Collection r1 = (java.util.Collection) r1
            r0 = 0
            kotlinx.serialization.descriptors.SerialDescriptor[] r0 = new kotlinx.serialization.descriptors.SerialDescriptor[r0]
            java.lang.Object[] r1 = r1.toArray(r0)
            kotlinx.serialization.descriptors.SerialDescriptor[] r1 = (kotlinx.serialization.descriptors.SerialDescriptor[]) r1
            if (r1 != 0) goto L_0x001d
        L_0x001b:
            kotlinx.serialization.descriptors.SerialDescriptor[] r1 = f144014a
        L_0x001d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: jK.D0.b(java.util.List):kotlinx.serialization.descriptors.SerialDescriptor[]");
    }

    public static final C18055d<Object> c(C18068q qVar) {
        C17542s.j(qVar, "<this>");
        C18057f e10 = qVar.e();
        if (e10 instanceof C18055d) {
            return (C18055d) e10;
        }
        if (e10 instanceof C18069r) {
            throw new IllegalArgumentException("Captured type parameter " + e10 + " from generic non-reified function. Such functionality cannot be supported because " + e10 + " is erased, either specify serializer explicitly or make calling function inline with reified " + e10 + '.');
        }
        throw new IllegalArgumentException("Only KClass supported as classifier, got " + e10);
    }

    public static final String d(String str) {
        C17542s.j(str, "className");
        return "Serializer for class '" + str + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n";
    }

    public static final String e(C18055d<?> dVar) {
        C17542s.j(dVar, "<this>");
        String f10 = dVar.f();
        if (f10 == null) {
            f10 = "<local class name not available>";
        }
        return d(f10);
    }

    public static final Void f(C18055d<?> dVar) {
        C17542s.j(dVar, "<this>");
        throw new q(e(dVar));
    }

    public static final C18068q g(C18070s sVar) {
        C17542s.j(sVar, "<this>");
        C18068q c10 = sVar.c();
        if (c10 != null) {
            return c10;
        }
        throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + sVar.c()).toString());
    }
}
