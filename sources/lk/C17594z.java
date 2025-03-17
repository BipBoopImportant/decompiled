package lK;

import jK.C17440E;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.descriptors.SerialDescriptor;
import nI.p;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R$\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b8\u0000@BX\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0019"}, d2 = {"LlK/z;", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "index", "", "e", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", "LXH/N;", "c", "(I)V", "d", "()I", "LjK/E;", "a", "LjK/E;", "origin", "value", "b", "Z", "()Z", "isUnmarkedNull", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lK.z  reason: case insensitive filesystem */
public final class C17594z {

    /* renamed from: a  reason: collision with root package name */
    private final C17440E f144545a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f144546b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lK.z$a */
    /* synthetic */ class a extends C17540p implements p<SerialDescriptor, Integer, Boolean> {
        a(Object obj) {
            super(2, obj, C17594z.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return t((SerialDescriptor) obj, ((Number) obj2).intValue());
        }

        public final Boolean t(SerialDescriptor serialDescriptor, int i10) {
            C17542s.j(serialDescriptor, "p0");
            return Boolean.valueOf(((C17594z) this.receiver).e(serialDescriptor, i10));
        }
    }

    public C17594z(SerialDescriptor serialDescriptor) {
        C17542s.j(serialDescriptor, "descriptor");
        this.f144545a = new C17440E(serialDescriptor, new a(this));
    }

    /* access modifiers changed from: private */
    public final boolean e(SerialDescriptor serialDescriptor, int i10) {
        boolean z10 = !serialDescriptor.j(i10) && serialDescriptor.g(i10).b();
        this.f144546b = z10;
        return z10;
    }

    public final boolean b() {
        return this.f144546b;
    }

    public final void c(int i10) {
        this.f144545a.a(i10);
    }

    public final int d() {
        return this.f144545a.d();
    }
}
