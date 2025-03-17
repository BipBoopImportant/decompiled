package uA;

import AA.C12556a;
import TJ.C16532g;
import TJ.C16534i;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import xA.C15198a;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LuA/a;", "LAA/a;", "LxA/a;", "themeSystemApi", "<init>", "(LxA/a;)V", "a", "LxA/a;", "LTJ/g;", "", "isEnabled", "()LTJ/g;", "settings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: uA.a  reason: case insensitive filesystem */
public final class C15102a implements C12556a {

    /* renamed from: a  reason: collision with root package name */
    private final C15198a f131286a;

    public C15102a(C15198a aVar) {
        C17542s.j(aVar, "themeSystemApi");
        this.f131286a = aVar;
    }

    public C16532g<Boolean> isEnabled() {
        return C16534i.J(Boolean.valueOf(this.f131286a.b()));
    }
}
