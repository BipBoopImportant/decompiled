package jK;

import fK.C17252e;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "seen", "goldenMask", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "LXH/N;", "b", "(IILkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "seenArray", "goldenMaskArray", "a", "([I[ILkotlinx/serialization/descriptors/SerialDescriptor;)V", "kotlinx-serialization-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class E0 {
    public static final void a(int[] iArr, int[] iArr2, SerialDescriptor serialDescriptor) {
        C17542s.j(iArr, "seenArray");
        C17542s.j(iArr2, "goldenMaskArray");
        C17542s.j(serialDescriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int length = iArr2.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = iArr2[i10] & (~iArr[i10]);
            if (i11 != 0) {
                for (int i12 = 0; i12 < 32; i12++) {
                    if ((i11 & 1) != 0) {
                        arrayList.add(serialDescriptor.e((i10 * 32) + i12));
                    }
                    i11 >>>= 1;
                }
            }
        }
        throw new C17252e(arrayList, serialDescriptor.i());
    }

    public static final void b(int i10, int i11, SerialDescriptor serialDescriptor) {
        C17542s.j(serialDescriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i12 = (~i10) & i11;
        for (int i13 = 0; i13 < 32; i13++) {
            if ((i12 & 1) != 0) {
                arrayList.add(serialDescriptor.e(i13));
            }
            i12 >>>= 1;
        }
        throw new C17252e(arrayList, serialDescriptor.i());
    }
}
