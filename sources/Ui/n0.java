package UI;

import VI.C16664F;
import XH.C16796C;
import XH.C16807N;
import XH.v;
import YH.C16870n;
import YH.C16877v;
import YH.Q;
import YH.X;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C17542s;
import lJ.C17558e;
import nI.C17642l;
import tI.C17978n;

final class n0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, g0> f139053a = new LinkedHashMap();

    public final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f139054a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n0 f139055b;

        /* renamed from: UI.n0$a$a  reason: collision with other inner class name */
        public final class C3401a {

            /* renamed from: a  reason: collision with root package name */
            private final String f139056a;

            /* renamed from: b  reason: collision with root package name */
            private final String f139057b;

            /* renamed from: c  reason: collision with root package name */
            private final List<v<String, r0>> f139058c = new ArrayList();

            /* renamed from: d  reason: collision with root package name */
            private v<String, r0> f139059d = C16796C.a("V", null);

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ a f139060e;

            public C3401a(a aVar, String str, String str2) {
                C17542s.j(str, "functionName");
                this.f139060e = aVar;
                this.f139056a = str;
                this.f139057b = str2;
            }

            public final v<String, g0> a() {
                C16664F f10 = C16664F.f139318a;
                String c10 = this.f139060e.c();
                String str = this.f139056a;
                Iterable<v> iterable = this.f139058c;
                ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
                for (v c11 : iterable) {
                    arrayList.add((String) c11.c());
                }
                String l10 = f10.l(c10, f10.j(str, arrayList, this.f139059d.c()));
                r0 d10 = this.f139059d.d();
                Iterable<v> iterable2 = this.f139058c;
                ArrayList arrayList2 = new ArrayList(C16877v.y(iterable2, 10));
                for (v d11 : iterable2) {
                    arrayList2.add((r0) d11.d());
                }
                return C16796C.a(l10, new g0(d10, arrayList2, this.f139057b));
            }

            public final void b(String str, C16587h... hVarArr) {
                r0 r0Var;
                C17542s.j(str, "type");
                C17542s.j(hVarArr, "qualifiers");
                Collection collection = this.f139058c;
                if (hVarArr.length == 0) {
                    r0Var = null;
                } else {
                    Iterable<Q> p12 = C16870n.p1(hVarArr);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(C17978n.e(X.e(C16877v.y(p12, 10)), 16));
                    for (Q q10 : p12) {
                        linkedHashMap.put(Integer.valueOf(q10.c()), (C16587h) q10.d());
                    }
                    r0Var = new r0(linkedHashMap);
                }
                collection.add(C16796C.a(str, r0Var));
            }

            public final void c(String str, C16587h... hVarArr) {
                C17542s.j(str, "type");
                C17542s.j(hVarArr, "qualifiers");
                Iterable<Q> p12 = C16870n.p1(hVarArr);
                LinkedHashMap linkedHashMap = new LinkedHashMap(C17978n.e(X.e(C16877v.y(p12, 10)), 16));
                for (Q q10 : p12) {
                    linkedHashMap.put(Integer.valueOf(q10.c()), (C16587h) q10.d());
                }
                this.f139059d = C16796C.a(str, new r0(linkedHashMap));
            }

            public final void d(C17558e eVar) {
                C17542s.j(eVar, "type");
                String m10 = eVar.m();
                C17542s.i(m10, "getDesc(...)");
                this.f139059d = C16796C.a(m10, null);
            }
        }

        public a(n0 n0Var, String str) {
            C17542s.j(str, "className");
            this.f139055b = n0Var;
            this.f139054a = str;
        }

        public static /* synthetic */ void b(a aVar, String str, String str2, C17642l lVar, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            aVar.a(str, str2, lVar);
        }

        public final void a(String str, String str2, C17642l<? super C3401a, C16807N> lVar) {
            C17542s.j(str, "name");
            C17542s.j(lVar, "block");
            Map a10 = this.f139055b.f139053a;
            C3401a aVar = new C3401a(this, str, str2);
            lVar.invoke(aVar);
            v<String, g0> a11 = aVar.a();
            a10.put(a11.c(), a11.d());
        }

        public final String c() {
            return this.f139054a;
        }
    }

    public final Map<String, g0> b() {
        return this.f139053a;
    }
}
