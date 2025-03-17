package hD;

import aA.C13909a;
import aA.C13910b;
import cD.C14031c;
import dI.C17164e;
import kD.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import lD.C14762d;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bHB¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LhD/d;", "LlD/d;", "LaA/a;", "sessionManager", "LcD/c;", "profileRepository", "<init>", "(LaA/a;LcD/c;)V", "", "forceRefresh", "LkD/h;", "a", "(ZLdI/e;)Ljava/lang/Object;", "LaA/a;", "b", "LcD/c;", "useraccount-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hD.d  reason: case insensitive filesystem */
public final class C14532d implements C14762d {

    /* renamed from: a  reason: collision with root package name */
    private final C13909a f127473a;

    /* renamed from: b  reason: collision with root package name */
    private final C14031c f127474b;

    public C14532d(C13909a aVar, C14031c cVar) {
        C17542s.j(aVar, "sessionManager");
        C17542s.j(cVar, "profileRepository");
        this.f127473a = aVar;
        this.f127474b = cVar;
    }

    public Object a(boolean z10, C17164e<? super h> eVar) {
        if (this.f127473a.o() == C13910b.GUEST) {
            return null;
        }
        return C14533e.c(this.f127474b, z10, eVar);
    }
}
