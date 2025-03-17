package jK;

import hK.i;
import hK.l;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "typeParams", "", "a", "(Lkotlinx/serialization/descriptors/SerialDescriptor;[Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "kotlinx-serialization-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class K0 {
    public static final int a(SerialDescriptor serialDescriptor, SerialDescriptor[] serialDescriptorArr) {
        C17542s.j(serialDescriptor, "<this>");
        C17542s.j(serialDescriptorArr, "typeParams");
        int hashCode = (serialDescriptor.i().hashCode() * 31) + Arrays.hashCode(serialDescriptorArr);
        Iterable<SerialDescriptor> a10 = i.a(serialDescriptor);
        Iterator<SerialDescriptor> it = a10.iterator();
        int i10 = 1;
        int i11 = 1;
        while (true) {
            int i12 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i13 = i11 * 31;
            String i14 = it.next().i();
            if (i14 != null) {
                i12 = i14.hashCode();
            }
            i11 = i13 + i12;
        }
        for (SerialDescriptor h10 : a10) {
            int i15 = i10 * 31;
            l h11 = h10.h();
            i10 = i15 + (h11 != null ? h11.hashCode() : 0);
        }
        return (((hashCode * 31) + i11) * 31) + i10;
    }
}
