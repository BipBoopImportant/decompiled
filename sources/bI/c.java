package BI;

import BI.f;
import fI.C17221b;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public enum c {
    Function,
    SuspendFunction,
    KFunction,
    KSuspendFunction,
    UNKNOWN;
    
    public static final a Companion = null;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(f fVar) {
            C17542s.j(fVar, "functionTypeKind");
            return C17542s.e(fVar, f.a.f133287e) ? c.Function : C17542s.e(fVar, f.d.f133290e) ? c.SuspendFunction : C17542s.e(fVar, f.b.f133288e) ? c.KFunction : C17542s.e(fVar, f.c.f133289e) ? c.KSuspendFunction : c.UNKNOWN;
        }

        private a() {
        }
    }

    static {
        c[] a10;
        $ENTRIES = C17221b.a(a10);
        Companion = new a((DefaultConstructorMarker) null);
    }
}
