package qg;

import IC.C13023e;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lqg/n;", "Lqg/a;", "", "", "set", "", "allowEmptyInput", "name", "LIC/e;", "message", "<init>", "(Ljava/util/Set;ZLjava/lang/String;LIC/e;)V", "input", "d", "(Ljava/lang/String;)Z", "e", "Ljava/util/Set;", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n extends C10191a {

    /* renamed from: e  reason: collision with root package name */
    private final Set<String> f76154e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(Set<String> set, boolean z10, String str, C13023e eVar) {
        super(z10, str, eVar);
        C17542s.j(set, "set");
        C17542s.j(str, "name");
        C17542s.j(eVar, "message");
        this.f76154e = set;
    }

    /* access modifiers changed from: protected */
    public boolean d(String str) {
        C17542s.j(str, "input");
        return this.f76154e.contains(str);
    }
}
