package VI;

import TI.C16503g;
import bJ.C17046e;
import cJ.C17065b;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qJ.C17788A;

/* renamed from: VI.v  reason: case insensitive filesystem */
public interface C16690v extends C17788A {

    /* renamed from: VI.v$a */
    public static abstract class a {

        /* renamed from: VI.v$a$a  reason: collision with other inner class name */
        public static final class C3417a extends a {

            /* renamed from: a  reason: collision with root package name */
            private final byte[] f139422a;

            public final byte[] b() {
                return this.f139422a;
            }
        }

        /* renamed from: VI.v$a$b */
        public static final class b extends a {

            /* renamed from: a  reason: collision with root package name */
            private final C16692x f139423a;

            /* renamed from: b  reason: collision with root package name */
            private final byte[] f139424b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(C16692x xVar, byte[] bArr) {
                super((DefaultConstructorMarker) null);
                C17542s.j(xVar, "kotlinJvmBinaryClass");
                this.f139423a = xVar;
                this.f139424b = bArr;
            }

            public final C16692x b() {
                return this.f139423a;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ b(C16692x xVar, byte[] bArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(xVar, (i10 & 2) != 0 ? null : bArr);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C16692x a() {
            b bVar = this instanceof b ? (b) this : null;
            if (bVar != null) {
                return bVar.b();
            }
            return null;
        }

        private a() {
        }
    }

    a b(C16503g gVar, C17046e eVar);

    a c(C17065b bVar, C17046e eVar);
}
