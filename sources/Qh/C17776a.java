package qH;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"LqH/a;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "LqH/b;", "call", "<init>", "(LqH/b;)V", "", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: qH.a  reason: case insensitive filesystem */
public final class C17776a extends IllegalStateException {

    /* renamed from: a  reason: collision with root package name */
    private final String f146437a;

    public C17776a(C17777b bVar) {
        C17542s.j(bVar, "call");
        this.f146437a = "Response already received: " + bVar;
    }

    public String getMessage() {
        return this.f146437a;
    }
}
