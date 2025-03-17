package lK;

import XH.C16797D;
import XH.C16799F;
import XH.C16801H;
import XH.C16804K;
import YH.g0;
import gK.C17294a;
import java.util.Set;
import kK.j;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\"\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003\"\u0018\u0010\b\u001a\u00020\u0005*\u00020\u00018@X\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0018\u0010\t\u001a\u00020\u0005*\u00020\u00018@X\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0007¨\u0006\n"}, d2 = {"", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "a", "Ljava/util/Set;", "unsignedNumberDescriptors", "", "b", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z", "isUnsignedNumber", "isUnquotedLiteral", "kotlinx-serialization-json"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<SerialDescriptor> f144499a = g0.h(C17294a.y(C16799F.f139776b).getDescriptor(), C17294a.z(C16801H.f139781b).getDescriptor(), C17294a.x(C16797D.f139771b).getDescriptor(), C17294a.A(C16804K.f139787b).getDescriptor());

    public static final boolean a(SerialDescriptor serialDescriptor) {
        C17542s.j(serialDescriptor, "<this>");
        return serialDescriptor.isInline() && C17542s.e(serialDescriptor, j.k());
    }

    public static final boolean b(SerialDescriptor serialDescriptor) {
        C17542s.j(serialDescriptor, "<this>");
        return serialDescriptor.isInline() && f144499a.contains(serialDescriptor);
    }
}
