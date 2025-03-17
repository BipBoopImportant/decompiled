package lK;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LlK/o;", "LlK/n;", "LlK/v;", "writer", "", "forceQuoting", "<init>", "(LlK/v;Z)V", "", "value", "LXH/N;", "n", "(Ljava/lang/String;)V", "c", "Z", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lK.o  reason: case insensitive filesystem */
public final class C17584o extends C17583n {

    /* renamed from: c  reason: collision with root package name */
    private final boolean f144536c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17584o(C17590v vVar, boolean z10) {
        super(vVar);
        C17542s.j(vVar, "writer");
        this.f144536c = z10;
    }

    public void n(String str) {
        C17542s.j(str, "value");
        if (this.f144536c) {
            super.n(str);
        } else {
            super.k(str);
        }
    }
}
