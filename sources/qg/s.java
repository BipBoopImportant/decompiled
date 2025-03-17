package qg;

import IC.C13023e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lqg/s;", "Lqg/a;", "", "invalidInput", "name", "LIC/e;", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;LIC/e;)V", "input", "", "d", "(Ljava/lang/String;)Z", "e", "Ljava/lang/String;", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s extends C10191a {

    /* renamed from: e  reason: collision with root package name */
    private final String f76182e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s(String str, String str2, C13023e eVar) {
        super(true, str2, eVar);
        C17542s.j(str, "invalidInput");
        C17542s.j(str2, "name");
        C17542s.j(eVar, "message");
        this.f76182e = str;
    }

    /* access modifiers changed from: protected */
    public boolean d(String str) {
        C17542s.j(str, "input");
        return !C17542s.e(this.f76182e, str);
    }
}
