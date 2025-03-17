package GI;

import DI.C15558e;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nJ.C17656k;
import uJ.H0;
import vJ.g;

/* renamed from: GI.z  reason: case insensitive filesystem */
public abstract class C15756z implements C15558e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f134717a = new a((DefaultConstructorMarker) null);

    /* renamed from: GI.z$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C17656k a(C15558e eVar, H0 h02, g gVar) {
            C17656k S10;
            C17542s.j(eVar, "<this>");
            C17542s.j(h02, "typeSubstitution");
            C17542s.j(gVar, "kotlinTypeRefiner");
            C15756z zVar = eVar instanceof C15756z ? (C15756z) eVar : null;
            if (zVar != null && (S10 = zVar.S(h02, gVar)) != null) {
                return S10;
            }
            C17656k B10 = eVar.B(h02);
            C17542s.i(B10, "getMemberScope(...)");
            return B10;
        }

        public final C17656k b(C15558e eVar, g gVar) {
            C17656k j02;
            C17542s.j(eVar, "<this>");
            C17542s.j(gVar, "kotlinTypeRefiner");
            C15756z zVar = eVar instanceof C15756z ? (C15756z) eVar : null;
            if (zVar != null && (j02 = zVar.j0(gVar)) != null) {
                return j02;
            }
            C17656k X10 = eVar.X();
            C17542s.i(X10, "getUnsubstitutedMemberScope(...)");
            return X10;
        }

        private a() {
        }
    }

    /* access modifiers changed from: protected */
    public abstract C17656k S(H0 h02, g gVar);

    /* access modifiers changed from: protected */
    public abstract C17656k j0(g gVar);
}
