package jK;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"LjK/N0;", "LjK/f0;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "primitive", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "c", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "serialName", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class N0 extends C17452f0 {

    /* renamed from: c  reason: collision with root package name */
    private final String f144053c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public N0(SerialDescriptor serialDescriptor) {
        super(serialDescriptor, (DefaultConstructorMarker) null);
        C17542s.j(serialDescriptor, "primitive");
        this.f144053c = serialDescriptor.i() + "Array";
    }

    public String i() {
        return this.f144053c;
    }
}
