package jK;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LjK/O;", "LjK/l0;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "keyDesc", "valueDesc", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class O extends C17464l0 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public O(SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2) {
        super("kotlin.collections.HashMap", serialDescriptor, serialDescriptor2, (DefaultConstructorMarker) null);
        C17542s.j(serialDescriptor, "keyDesc");
        C17542s.j(serialDescriptor2, "valueDesc");
    }
}
