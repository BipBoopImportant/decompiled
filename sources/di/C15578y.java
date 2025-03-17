package DI;

import GJ.C15768k;
import LI.d;
import YH.C16877v;
import cJ.C17065b;
import cJ.C17069f;
import gJ.C17289t;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.G;

/* renamed from: DI.y  reason: case insensitive filesystem */
public final class C15578y {

    /* renamed from: DI.y$a */
    /* synthetic */ class a extends G {

        /* renamed from: b  reason: collision with root package name */
        public static final a f133880b = new a();

        a() {
            super(C17065b.class, "outerClassId", "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;", 0);
        }

        public Object get(Object obj) {
            return ((C17065b) obj).e();
        }
    }

    public static final C15558e b(C15538I i10, C17065b bVar) {
        C17542s.j(i10, "<this>");
        C17542s.j(bVar, "classId");
        C15561h c10 = c(i10, bVar);
        if (c10 instanceof C15558e) {
            return (C15558e) c10;
        }
        return null;
    }

    public static final C15561h c(C15538I i10, C17065b bVar) {
        C15561h hVar;
        C17542s.j(i10, "<this>");
        C17542s.j(bVar, "classId");
        C15538I a10 = C17289t.a(i10);
        if (a10 == null) {
            C15551W v02 = i10.v0(bVar.f());
            List<C17069f> e10 = bVar.g().e();
            hVar = v02.q().e((C17069f) C16877v.w0(e10), d.FROM_DESERIALIZATION);
            if (hVar == null) {
                return null;
            }
            for (C17069f next : e10.subList(1, e10.size())) {
                if (!(hVar instanceof C15558e)) {
                    return null;
                }
                C15561h e11 = ((C15558e) hVar).U().e(next, d.FROM_DESERIALIZATION);
                if (e11 instanceof C15558e) {
                    hVar = (C15558e) e11;
                    continue;
                } else {
                    hVar = null;
                    continue;
                }
                if (hVar == null) {
                    return null;
                }
            }
        } else {
            C15551W v03 = a10.v0(bVar.f());
            List<C17069f> e12 = bVar.g().e();
            C15561h e13 = v03.q().e((C17069f) C16877v.w0(e12), d.FROM_DESERIALIZATION);
            if (e13 != null) {
                Iterator<C17069f> it = e12.subList(1, e12.size()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C17069f next2 = it.next();
                    if (e13 instanceof C15558e) {
                        C15561h e14 = ((C15558e) e13).U().e(next2, d.FROM_DESERIALIZATION);
                        if (e14 instanceof C15558e) {
                            e13 = (C15558e) e14;
                            continue;
                        } else {
                            e13 = null;
                            continue;
                        }
                        if (e13 == null) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            e13 = null;
            if (e13 != null) {
                return e13;
            }
            C15551W v04 = i10.v0(bVar.f());
            List<C17069f> e15 = bVar.g().e();
            C15561h e16 = v04.q().e((C17069f) C16877v.w0(e15), d.FROM_DESERIALIZATION);
            if (e16 == null) {
                return null;
            }
            for (C17069f next3 : e15.subList(1, e15.size())) {
                if (!(hVar instanceof C15558e)) {
                    return null;
                }
                C15561h e17 = ((C15558e) hVar).U().e(next3, d.FROM_DESERIALIZATION);
                if (e17 instanceof C15558e) {
                    e16 = (C15558e) e17;
                    continue;
                } else {
                    e16 = null;
                    continue;
                }
                if (e16 == null) {
                    return null;
                }
            }
        }
        return hVar;
    }

    public static final C15558e d(C15538I i10, C17065b bVar, C15543N n10) {
        C17542s.j(i10, "<this>");
        C17542s.j(bVar, "classId");
        C17542s.j(n10, "notFoundClasses");
        C15558e b10 = b(i10, bVar);
        return b10 != null ? b10 : n10.d(bVar, C15768k.a0(C15768k.S(C15768k.q(bVar, a.f133880b), C15577x.f133867a)));
    }

    /* access modifiers changed from: private */
    public static final int e(C17065b bVar) {
        C17542s.j(bVar, "it");
        return 0;
    }

    public static final m0 f(C15538I i10, C17065b bVar) {
        C17542s.j(i10, "<this>");
        C17542s.j(bVar, "classId");
        C15561h c10 = c(i10, bVar);
        if (c10 instanceof m0) {
            return (m0) c10;
        }
        return null;
    }
}
