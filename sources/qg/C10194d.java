package qg;

import IC.C13023e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lqg/d;", "Lqg/a;", "", "name", "LIC/e;", "message", "<init>", "(Ljava/lang/String;LIC/e;)V", "input", "", "d", "(Ljava/lang/String;)Z", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qg.d  reason: case insensitive filesystem */
public final class C10194d extends C10191a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10194d(String str, C13023e eVar) {
        super(false, str, eVar);
        C17542s.j(str, "name");
        C17542s.j(eVar, "message");
    }

    /* access modifiers changed from: protected */
    public boolean d(String str) {
        C17542s.j(str, "input");
        return Boolean.parseBoolean(str);
    }
}
