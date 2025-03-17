package vH;

import BH.C15458c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LvH/A;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "LBH/c;", "response", "", "cachedResponseText", "<init>", "(LBH/c;Ljava/lang/String;)V", "a", "LBH/c;", "getResponse", "()LBH/c;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: vH.A  reason: case insensitive filesystem */
public class C18158A extends IllegalStateException {

    /* renamed from: a  reason: collision with root package name */
    private final transient C15458c f148843a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18158A(C15458c cVar, String str) {
        super("Bad response: " + cVar + ". Text: \"" + str + '\"');
        C17542s.j(cVar, "response");
        C17542s.j(str, "cachedResponseText");
        this.f148843a = cVar;
    }
}
