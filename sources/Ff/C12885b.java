package FF;

import com.adjust.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C5562q;
import m0.G0;
import m0.N;
import m0.z0;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\"\b\b\u0001\u0010\b*\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"LFF/b;", "T", "Lm0/N;", "", "delayInMillis", "<init>", "(I)V", "Lm0/q;", "V", "Lm0/z0;", "converter", "Lm0/G0;", "a", "(Lm0/z0;)Lm0/G0;", "I", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: FF.b  reason: case insensitive filesystem */
public final class C12885b<T> implements N<T> {

    /* renamed from: a  reason: collision with root package name */
    private final int f109858a;

    public C12885b(int i10) {
        this.f109858a = i10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12885b(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? Constants.MINIMAL_ERROR_STATUS_CODE : i10);
    }

    public <V extends C5562q> G0<V> a(z0<T, V> z0Var) {
        C17542s.j(z0Var, "converter");
        return new C12886c(this.f109858a);
    }
}
