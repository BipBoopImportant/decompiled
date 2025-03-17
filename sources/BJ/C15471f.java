package BJ;

import DI.C15579z;
import kotlin.jvm.internal.C17542s;

/* renamed from: BJ.f  reason: case insensitive filesystem */
public interface C15471f {

    /* renamed from: BJ.f$a */
    public static final class a {
        public static String a(C15471f fVar, C15579z zVar) {
            C17542s.j(zVar, "functionDescriptor");
            if (!fVar.a(zVar)) {
                return fVar.getDescription();
            }
            return null;
        }
    }

    boolean a(C15579z zVar);

    String b(C15579z zVar);

    String getDescription();
}
