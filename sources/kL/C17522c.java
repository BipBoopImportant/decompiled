package kL;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0005\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LkL/c;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "msg", "parent", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", "koin-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kL.c  reason: case insensitive filesystem */
public final class C17522c extends Exception {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17522c(String str, Exception exc) {
        super(str, exc);
        C17542s.j(str, "msg");
        C17542s.j(exc, "parent");
    }
}
