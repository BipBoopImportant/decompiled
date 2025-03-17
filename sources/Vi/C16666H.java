package VI;

import DI.C15558e;
import YH.C16877v;
import java.util.Collection;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import uJ.C18096U;

/* renamed from: VI.H  reason: case insensitive filesystem */
public final class C16666H implements C16665G<C16687s> {

    /* renamed from: a  reason: collision with root package name */
    public static final C16666H f139319a = new C16666H();

    private C16666H() {
    }

    public String b(C15558e eVar) {
        C17542s.j(eVar, "classDescriptor");
        return null;
    }

    public String c(C15558e eVar) {
        C17542s.j(eVar, "classDescriptor");
        return null;
    }

    public C18096U d(C18096U u10) {
        C17542s.j(u10, "kotlinType");
        return null;
    }

    public void e(C18096U u10, C15558e eVar) {
        C17542s.j(u10, "kotlinType");
        C17542s.j(eVar, "descriptor");
    }

    public C18096U f(Collection<? extends C18096U> collection) {
        C17542s.j(collection, "types");
        throw new AssertionError("There should be no intersection type in existing descriptors, but found: " + C16877v.G0(collection, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 63, (Object) null));
    }

    /* renamed from: g */
    public C16687s a(C15558e eVar) {
        C17542s.j(eVar, "classDescriptor");
        return null;
    }
}
