package hK;

import jK.S0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import mK.C17611d;
import uI.C18055d;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\"$\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005*\u00020\u00018FX\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"LmK/d;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "b", "(LmK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "LuI/d;", "context", "c", "(Lkotlinx/serialization/descriptors/SerialDescriptor;LuI/d;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "a", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)LuI/d;", "getCapturedKClass$annotations", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "capturedKClass", "kotlinx-serialization-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: hK.b  reason: case insensitive filesystem */
public final class C17336b {
    public static final C18055d<?> a(SerialDescriptor serialDescriptor) {
        C17542s.j(serialDescriptor, "<this>");
        if (serialDescriptor instanceof C17337c) {
            return ((C17337c) serialDescriptor).f143435b;
        }
        if (serialDescriptor instanceof S0) {
            return a(((S0) serialDescriptor).k());
        }
        return null;
    }

    public static final SerialDescriptor b(C17611d dVar, SerialDescriptor serialDescriptor) {
        KSerializer c10;
        C17542s.j(dVar, "<this>");
        C17542s.j(serialDescriptor, "descriptor");
        C18055d<?> a10 = a(serialDescriptor);
        if (a10 == null || (c10 = C17611d.c(dVar, a10, (List) null, 2, (Object) null)) == null) {
            return null;
        }
        return c10.getDescriptor();
    }

    public static final SerialDescriptor c(SerialDescriptor serialDescriptor, C18055d<?> dVar) {
        C17542s.j(serialDescriptor, "<this>");
        C17542s.j(dVar, "context");
        return new C17337c(serialDescriptor, dVar);
    }
}
