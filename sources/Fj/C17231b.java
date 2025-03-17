package fJ;

import DI.C15544O;
import DI.C15558e;
import DI.C15561h;
import DI.C15566m;
import DI.n0;
import YH.C16877v;
import cJ.C17067d;
import cJ.C17069f;
import gJ.C17278i;
import java.util.ArrayList;
import kotlin.jvm.internal.C17542s;

/* renamed from: fJ.b  reason: case insensitive filesystem */
public interface C17231b {

    /* renamed from: fJ.b$a */
    public static final class a implements C17231b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f143159a = new a();

        private a() {
        }

        public String a(C15561h hVar, n nVar) {
            C17542s.j(hVar, "classifier");
            C17542s.j(nVar, "renderer");
            if (hVar instanceof n0) {
                C17069f name = ((n0) hVar).getName();
                C17542s.i(name, "getName(...)");
                return nVar.R(name, false);
            }
            C17067d m10 = C17278i.m(hVar);
            C17542s.i(m10, "getFqName(...)");
            return nVar.Q(m10);
        }
    }

    /* renamed from: fJ.b$b  reason: collision with other inner class name */
    public static final class C3491b implements C17231b {

        /* renamed from: a  reason: collision with root package name */
        public static final C3491b f143160a = new C3491b();

        private C3491b() {
        }

        public String a(C15561h hVar, n nVar) {
            boolean z10;
            C17542s.j(hVar, "classifier");
            C17542s.j(nVar, "renderer");
            if (hVar instanceof n0) {
                C17069f name = ((n0) hVar).getName();
                C17542s.i(name, "getName(...)");
                return nVar.R(name, false);
            }
            ArrayList arrayList = new ArrayList();
            C15566m mVar = hVar;
            do {
                arrayList.add(mVar.getName());
                C15566m b10 = mVar.b();
                z10 = b10 instanceof C15558e;
                mVar = b10;
            } while (z10);
            return C17229G.c(C16877v.W(arrayList));
        }
    }

    /* renamed from: fJ.b$c */
    public static final class c implements C17231b {

        /* renamed from: a  reason: collision with root package name */
        public static final c f143161a = new c();

        private c() {
        }

        private final String b(C15561h hVar) {
            C17069f name = hVar.getName();
            C17542s.i(name, "getName(...)");
            String b10 = C17229G.b(name);
            if (hVar instanceof n0) {
                return b10;
            }
            C15566m b11 = hVar.b();
            C17542s.i(b11, "getContainingDeclaration(...)");
            String c10 = c(b11);
            if (c10 == null || C17542s.e(c10, "")) {
                return b10;
            }
            return c10 + '.' + b10;
        }

        private final String c(C15566m mVar) {
            if (mVar instanceof C15558e) {
                return b((C15561h) mVar);
            }
            if (mVar instanceof C15544O) {
                return C17229G.a(((C15544O) mVar).f().i());
            }
            return null;
        }

        public String a(C15561h hVar, n nVar) {
            C17542s.j(hVar, "classifier");
            C17542s.j(nVar, "renderer");
            return b(hVar);
        }
    }

    String a(C15561h hVar, n nVar);
}
