package sH;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LsH/a;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "a", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: sH.a  reason: case insensitive filesystem */
public final class C17897a extends IllegalStateException {

    /* renamed from: a  reason: collision with root package name */
    private final Throwable f146970a;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17897a(Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : th2);
    }

    public Throwable getCause() {
        return this.f146970a;
    }

    public C17897a(Throwable th2) {
        super("Client already closed");
        this.f146970a = th2;
    }
}
