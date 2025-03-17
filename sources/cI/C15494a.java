package CI;

import DI.C15535F;
import DI.C15555b;
import DI.C15558e;
import DI.C15573t;
import DI.C15579z;
import DI.d0;
import DI.i0;
import EI.C15649h;
import GI.C15721O;
import YH.C16877v;
import cJ.C17069f;
import java.util.List;
import kJ.C17506e;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nJ.C17651f;
import tJ.C17994n;

/* renamed from: CI.a  reason: case insensitive filesystem */
public final class C15494a extends C17651f {

    /* renamed from: e  reason: collision with root package name */
    public static final C3292a f133488e = new C3292a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final C17069f f133489f;

    /* renamed from: CI.a$a  reason: collision with other inner class name */
    public static final class C3292a {
        public /* synthetic */ C3292a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C17069f a() {
            return C15494a.f133489f;
        }

        private C3292a() {
        }
    }

    static {
        C17069f v10 = C17069f.v("clone");
        C17542s.i(v10, "identifier(...)");
        f133489f = v10;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15494a(C17994n nVar, C15558e eVar) {
        super(nVar, eVar);
        C17542s.j(nVar, "storageManager");
        C17542s.j(eVar, "containingClass");
    }

    /* access modifiers changed from: protected */
    public List<C15579z> j() {
        C15721O l12 = C15721O.l1(m(), C15649h.f134231V.b(), f133489f, C15555b.a.DECLARATION, i0.f133841a);
        l12.R0((d0) null, m().J0(), C16877v.n(), C16877v.n(), C16877v.n(), C17506e.m(m()).i(), C15535F.OPEN, C15573t.f133851c);
        return C16877v.e(l12);
    }
}
