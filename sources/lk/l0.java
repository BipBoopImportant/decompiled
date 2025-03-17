package lK;

import hK.C17338d;
import hK.C17339e;
import hK.l;
import hK.m;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LkK/c;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "desc", "LlK/k0;", "b", "(LkK/c;Lkotlinx/serialization/descriptors/SerialDescriptor;)LlK/k0;", "LmK/d;", "module", "a", "(Lkotlinx/serialization/descriptors/SerialDescriptor;LmK/d;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-json"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l0 {
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001c, code lost:
        r3 = a(r0, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlinx.serialization.descriptors.SerialDescriptor a(kotlinx.serialization.descriptors.SerialDescriptor r2, mK.C17611d r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            java.lang.String r0 = "module"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            hK.l r0 = r2.h()
            hK.l$a r1 = hK.l.a.f143468a
            boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r1)
            if (r0 == 0) goto L_0x0025
            kotlinx.serialization.descriptors.SerialDescriptor r0 = hK.C17336b.b(r3, r2)
            if (r0 == 0) goto L_0x0034
            kotlinx.serialization.descriptors.SerialDescriptor r3 = a(r0, r3)
            if (r3 != 0) goto L_0x0023
            goto L_0x0034
        L_0x0023:
            r2 = r3
            goto L_0x0034
        L_0x0025:
            boolean r0 = r2.isInline()
            if (r0 == 0) goto L_0x0034
            r0 = 0
            kotlinx.serialization.descriptors.SerialDescriptor r2 = r2.g(r0)
            kotlinx.serialization.descriptors.SerialDescriptor r2 = a(r2, r3)
        L_0x0034:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: lK.l0.a(kotlinx.serialization.descriptors.SerialDescriptor, mK.d):kotlinx.serialization.descriptors.SerialDescriptor");
    }

    public static final k0 b(C17514c cVar, SerialDescriptor serialDescriptor) {
        C17542s.j(cVar, "<this>");
        C17542s.j(serialDescriptor, "desc");
        l h10 = serialDescriptor.h();
        if (h10 instanceof C17338d) {
            return k0.POLY_OBJ;
        }
        if (C17542s.e(h10, m.b.f143471a)) {
            return k0.LIST;
        }
        if (!C17542s.e(h10, m.c.f143472a)) {
            return k0.OBJ;
        }
        SerialDescriptor a10 = a(serialDescriptor.g(0), cVar.a());
        l h11 = a10.h();
        if ((h11 instanceof C17339e) || C17542s.e(h11, l.b.f143469a)) {
            return k0.MAP;
        }
        if (cVar.g().c()) {
            return k0.LIST;
        }
        throw C17562C.d(a10);
    }
}
