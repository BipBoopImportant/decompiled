package wH;

import EH.C15618c;
import EH.C15619d;
import HJ.C15854t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LwH/e;", "LEH/d;", "<init>", "()V", "LEH/c;", "contentType", "", "a", "(LEH/c;)Z", "ktor-client-content-negotiation"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: wH.e  reason: case insensitive filesystem */
public final class C18216e implements C15619d {

    /* renamed from: a  reason: collision with root package name */
    public static final C18216e f149147a = new C18216e();

    private C18216e() {
    }

    public boolean a(C15618c cVar) {
        C17542s.j(cVar, "contentType");
        if (cVar.g(C15618c.a.f133990a.a())) {
            return true;
        }
        String jVar = cVar.i().toString();
        return C15854t.W(jVar, "application/", false, 2, (Object) null) && C15854t.G(jVar, "+json", false, 2, (Object) null);
    }
}
