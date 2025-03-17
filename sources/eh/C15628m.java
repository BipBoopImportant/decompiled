package EH;

import JH.x;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"LEH/m;", "LJH/x;", "", "size", "<init>", "(I)V", "LEH/l;", "p", "()LEH/l;", "", "name", "LXH/N;", "n", "(Ljava/lang/String;)V", "value", "o", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: EH.m  reason: case insensitive filesystem */
public final class C15628m extends x {
    public C15628m() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: protected */
    public void n(String str) {
        C17542s.j(str, "name");
        super.n(str);
        C15631p.f134088a.a(str);
    }

    /* access modifiers changed from: protected */
    public void o(String str) {
        C17542s.j(str, "value");
        super.o(str);
        C15631p.f134088a.b(str);
    }

    public C15627l p() {
        return new C15629n(k());
    }

    public C15628m(int i10) {
        super(true, i10);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15628m(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 8 : i10);
    }
}
