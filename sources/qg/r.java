package qg;

import HJ.C15850p;
import IC.C13023e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lqg/r;", "Lqg/a;", "", "regexToMatch", "", "allowEmptyInput", "name", "LIC/e;", "message", "<init>", "(Ljava/lang/String;ZLjava/lang/String;LIC/e;)V", "input", "d", "(Ljava/lang/String;)Z", "LHJ/p;", "e", "LHJ/p;", "regex", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r extends C10191a {

    /* renamed from: e  reason: collision with root package name */
    private final C15850p f76181e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(String str, boolean z10, String str2, C13023e eVar) {
        super(z10, str2, eVar);
        C17542s.j(str, "regexToMatch");
        C17542s.j(str2, "name");
        C17542s.j(eVar, "message");
        this.f76181e = new C15850p(str);
    }

    /* access modifiers changed from: protected */
    public boolean d(String str) {
        C17542s.j(str, "input");
        return this.f76181e.i(str);
    }
}
