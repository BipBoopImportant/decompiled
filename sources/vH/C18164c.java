package vH;

import BH.C15458c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"LvH/c;", "LvH/A;", "LBH/c;", "response", "", "cachedResponseText", "<init>", "(LBH/c;Ljava/lang/String;)V", "b", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: vH.c  reason: case insensitive filesystem */
public final class C18164c extends C18158A {

    /* renamed from: b  reason: collision with root package name */
    private final String f148855b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18164c(C15458c cVar, String str) {
        super(cVar, str);
        C17542s.j(cVar, "response");
        C17542s.j(str, "cachedResponseText");
        this.f148855b = "Client request(" + cVar.h0().e().U().d() + ' ' + cVar.h0().e().getUrl() + ") invalid: " + cVar.f() + ". Text: \"" + str + '\"';
    }

    public String getMessage() {
        return this.f148855b;
    }
}
