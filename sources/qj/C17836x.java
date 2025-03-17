package qJ;

import XI.q;
import kotlin.jvm.internal.C17542s;
import uJ.C18096U;
import uJ.C18113f0;

/* renamed from: qJ.x  reason: case insensitive filesystem */
public interface C17836x {

    /* renamed from: qJ.x$a */
    public static final class a implements C17836x {

        /* renamed from: a  reason: collision with root package name */
        public static final a f146611a = new a();

        private a() {
        }

        public C18096U a(q qVar, String str, C18113f0 f0Var, C18113f0 f0Var2) {
            C17542s.j(qVar, "proto");
            C17542s.j(str, "flexibleId");
            C17542s.j(f0Var, "lowerBound");
            C17542s.j(f0Var2, "upperBound");
            throw new IllegalArgumentException("This method should not be used.");
        }
    }

    C18096U a(q qVar, String str, C18113f0 f0Var, C18113f0 f0Var2);
}
