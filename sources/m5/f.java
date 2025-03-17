package M5;

import GK.C15776D;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LM5/f;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "LGK/D;", "response", "<init>", "(LGK/D;)V", "a", "LGK/D;", "getResponse", "()LGK/D;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private final C15776D f38521a;

    public f(C15776D d10) {
        super("HTTP " + d10.g() + ": " + d10.s());
        this.f38521a = d10;
    }
}
