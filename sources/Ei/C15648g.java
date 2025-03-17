package EI;

import AI.C15429j;
import AI.C15435p;
import DI.C15538I;
import XH.C16796C;
import XH.v;
import YH.C16877v;
import YH.X;
import cJ.C17065b;
import cJ.C17066c;
import cJ.C17069f;
import iJ.C17367a;
import iJ.C17368b;
import iJ.C17377k;
import iJ.C17391y;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import uJ.C18096U;
import uJ.C18113f0;
import uJ.Q0;

/* renamed from: EI.g  reason: case insensitive filesystem */
public final class C15648g {

    /* renamed from: a  reason: collision with root package name */
    private static final C17069f f134226a;

    /* renamed from: b  reason: collision with root package name */
    private static final C17069f f134227b;

    /* renamed from: c  reason: collision with root package name */
    private static final C17069f f134228c;

    /* renamed from: d  reason: collision with root package name */
    private static final C17069f f134229d;

    /* renamed from: e  reason: collision with root package name */
    private static final C17069f f134230e;

    static {
        C17069f v10 = C17069f.v("message");
        C17542s.i(v10, "identifier(...)");
        f134226a = v10;
        C17069f v11 = C17069f.v("replaceWith");
        C17542s.i(v11, "identifier(...)");
        f134227b = v11;
        C17069f v12 = C17069f.v("level");
        C17542s.i(v12, "identifier(...)");
        f134228c = v12;
        C17069f v13 = C17069f.v("expression");
        C17542s.i(v13, "identifier(...)");
        f134229d = v13;
        C17069f v14 = C17069f.v("imports");
        C17542s.i(v14, "identifier(...)");
        f134230e = v14;
    }

    public static final C15644c b(C15429j jVar, String str, String str2, String str3, boolean z10) {
        C17542s.j(jVar, "<this>");
        C17542s.j(str, "message");
        C17542s.j(str2, "replaceWith");
        C17542s.j(str3, "level");
        C15653l lVar = new C15653l(jVar, C15435p.a.f133051B, X.m(C16796C.a(f134229d, new C17391y(str2)), C16796C.a(f134230e, new C17368b(C16877v.n(), new C15647f(jVar)))), false, 8, (DefaultConstructorMarker) null);
        C17066c cVar = C15435p.a.f133138y;
        v a10 = C16796C.a(f134226a, new C17391y(str));
        v a11 = C16796C.a(f134227b, new C17367a(lVar));
        C17069f fVar = f134228c;
        C17065b c10 = C17065b.f141241d.c(C15435p.a.f133049A);
        C17069f v10 = C17069f.v(str3);
        C17542s.i(v10, "identifier(...)");
        return new C15653l(jVar, cVar, X.m(a10, a11, C16796C.a(fVar, new C17377k(c10, v10))), z10);
    }

    public static /* synthetic */ C15644c c(C15429j jVar, String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = "";
        }
        if ((i10 & 4) != 0) {
            str3 = "WARNING";
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return b(jVar, str, str2, str3, z10);
    }

    /* access modifiers changed from: private */
    public static final C18096U d(C15429j jVar, C15538I i10) {
        C17542s.j(i10, "module");
        C18113f0 m10 = i10.p().m(Q0.INVARIANT, jVar.X());
        C17542s.i(m10, "getArrayType(...)");
        return m10;
    }
}
