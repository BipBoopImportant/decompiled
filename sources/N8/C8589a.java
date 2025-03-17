package n8;

import L1.k;
import L1.l;
import L1.p;
import YH.C16877v;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import m8.C8560a;
import m8.C8561b;
import m8.C8563d;
import nI.C17642l;
import o1.C5669i;
import p8.C8638a;
import p8.b;
import pI.C17752b;
import w8.e;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J7\u0010\u001e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00112\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00150\u001bH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010%\u001a\u00020$2\b\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010'¨\u0006("}, d2 = {"Ln8/a;", "", "Lm8/a;", "composeTreeWalker", "<init>", "(Lm8/a;)V", "Lw8/e;", "rootNode", "LXH/N;", "b", "(Lw8/e;)V", "", "siblings", "a", "(Ljava/util/List;)V", "node1", "node2", "", "f", "(Lw8/e;Lw8/e;)Z", "node", "", "c", "(Lw8/e;)Ljava/lang/String;", "Lm8/d;", "rootLayoutNode", "clipToParent", "Lkotlin/Function1;", "Landroid/graphics/Rect;", "bitmapProvider", "g", "(Lm8/d;ZLnI/l;)Lw8/e;", "LL1/p;", "nodeNullable", "Lp8/a;", "classNameResolver", "Lw8/e$a;", "d", "(LL1/p;Lp8/a;)Lw8/e$a;", "Lm8/a;", "compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: n8.a  reason: case insensitive filesystem */
public final class C8589a {

    /* renamed from: a  reason: collision with root package name */
    private final C8560a f55101a;

    /* renamed from: n8.a$a  reason: collision with other inner class name */
    public static final class C0879a implements C8561b<e> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ C17642l<Rect, String> f55102a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ O<e> f55103b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ C8589a f55104c;

        public C0879a(C17642l<? super Rect, String> lVar, O<e> o10, C8589a aVar) {
            this.f55102a = lVar;
            this.f55103b = o10;
            this.f55104c = aVar;
        }

        public final Object a(Object obj, C8563d dVar, C5669i iVar, String str, int i10, float f10) {
            String invoke;
            List<e> g10;
            l n10;
            l n11;
            e eVar = (e) obj;
            C17542s.j(dVar, "node");
            C17542s.j(iVar, "bounds");
            C17542s.j(str, "nodeName");
            p c10 = dVar.c();
            Rect rect = new Rect(C17752b.e(iVar.o()), C17752b.e(iVar.r()), C17752b.e(iVar.p()), C17752b.e(iVar.j()));
            if ((eVar != null ? eVar.d() : null) == null || !C17542s.e(eVar.e(), rect)) {
                invoke = this.f55102a.invoke(rect);
            } else {
                invoke = eVar.d();
                eVar.r((String) null);
            }
            String str2 = invoke;
            float a10 = dVar.a();
            float n12 = (this.f55103b.f144348a == null || eVar == null) ? a10 : eVar.n() * a10;
            T t10 = r1;
            e eVar2 = eVar;
            T eVar3 = new e(String.valueOf(dVar.b().q()), str, eVar, rect, dVar.d(), dVar.isVisible(), i10, n12, n12 == 1.0f ? null : "#00000000", str2, (List) null, C8589a.e(this.f55104c, c10, (C8638a) null, 2, (Object) null), (c10 == null || (n11 = c10.n()) == null) ? false : n11.k(k.f8953a.k()), false, (c10 == null || (n10 = c10.n()) == null) ? false : C17542s.e(C8590b.b(n10), Boolean.TRUE), 9216, (DefaultConstructorMarker) null);
            O<e> o10 = this.f55103b;
            if (o10.f144348a == null) {
                T t11 = t10;
                o10.f144348a = t11;
                return t11;
            }
            T t12 = t10;
            if (eVar2 == null || (g10 = eVar2.g()) == null) {
                return t12;
            }
            g10.add(t12);
            return t12;
        }
    }

    public C8589a(C8560a aVar) {
        C17542s.j(aVar, "composeTreeWalker");
        this.f55101a = aVar;
    }

    private final void a(List<e> list) {
        int size = list.size() - 1;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = list.get(i10);
            if (!eVar.p()) {
                int size2 = list.size();
                for (int i11 = i10 + 1; i11 < size2; i11++) {
                    e eVar2 = list.get(i11);
                    if (!eVar2.p() && f(eVar, eVar2)) {
                        eVar2.s(true);
                        eVar2.r((String) null);
                    }
                }
            }
        }
    }

    private final void b(e eVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(eVar);
        do {
            List<e> g10 = ((e) arrayList.remove(0)).g();
            a(g10);
            arrayList.addAll(g10);
        } while (!arrayList.isEmpty());
    }

    private final String c(e eVar) {
        if (eVar.d() != null) {
            return eVar.d();
        }
        List<e> g10 = eVar.g();
        ArrayList<e> arrayList = new ArrayList<>();
        for (T next : g10) {
            if (C17542s.e(((e) next).e(), eVar.e())) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C16877v.y(arrayList, 10));
        for (e c10 : arrayList) {
            arrayList2.add(c(c10));
        }
        return (String) C16877v.y0(arrayList2);
    }

    public static /* synthetic */ e.a e(C8589a aVar, p pVar, C8638a aVar2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar2 = new b();
        }
        return aVar.d(pVar, aVar2);
    }

    private final boolean f(e eVar, e eVar2) {
        return eVar.q() && eVar2.g().isEmpty() && C17542s.e(eVar.e(), eVar2.e()) && eVar.n() > 0.0f && eVar2.n() > 0.0f && !eVar.h() && !eVar2.h() && !eVar2.o() && C17542s.e(c(eVar), eVar2.d());
    }

    /* JADX WARNING: type inference failed for: r6v7, types: [XH.i] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final w8.e.a d(L1.p r6, p8.C8638a r7) {
        /*
            r5 = this;
            java.lang.String r0 = "classNameResolver"
            kotlin.jvm.internal.C17542s.j(r7, r0)
            if (r6 != 0) goto L_0x000a
            w8.e$a$b r6 = w8.e.a.b.f57364a
            return r6
        L_0x000a:
            L1.l r0 = r6.n()
            L1.s r1 = L1.s.f9010a
            L1.w r2 = r1.I()
            java.lang.Object r0 = L1.m.a(r0, r2)
            L1.j r0 = (L1.j) r0
            L1.l r2 = r6.n()
            L1.k r3 = L1.k.f8953a
            L1.w r4 = r3.t()
            java.lang.Object r2 = L1.m.a(r2, r4)
            L1.a r2 = (L1.a) r2
            r4 = 0
            if (r2 == 0) goto L_0x0034
            XH.i r2 = r2.a()
            nI.p r2 = (nI.p) r2
            goto L_0x0035
        L_0x0034:
            r2 = r4
        L_0x0035:
            if (r0 == 0) goto L_0x0083
            if (r2 == 0) goto L_0x0083
            E1.z r0 = r6.p()
            java.util.List r0 = r0.r()
            boolean r7 = p8.c.e(r0, r7)
            L1.l r0 = r6.n()
            L1.w r1 = r1.a()
            java.lang.Object r0 = L1.m.a(r0, r1)
            L1.b r0 = (L1.b) r0
            if (r0 == 0) goto L_0x005a
            int r0 = r0.a()
            goto L_0x005b
        L_0x005a:
            r0 = 0
        L_0x005b:
            int r7 = java.lang.Math.max(r0, r7)
            L1.l r6 = r6.n()
            L1.w r0 = r3.v()
            java.lang.Object r6 = L1.m.a(r6, r0)
            L1.a r6 = (L1.a) r6
            if (r6 == 0) goto L_0x0076
            XH.i r6 = r6.a()
            r4 = r6
            nI.l r4 = (nI.C17642l) r4
        L_0x0076:
            if (r7 <= 0) goto L_0x0080
            if (r4 == 0) goto L_0x0080
            w8.e$a$c r6 = new w8.e$a$c
            r6.<init>(r7)
            goto L_0x0085
        L_0x0080:
            w8.e$a$a r6 = w8.e.a.C0924a.f57363a
            goto L_0x0085
        L_0x0083:
            w8.e$a$b r6 = w8.e.a.b.f57364a
        L_0x0085:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: n8.C8589a.d(L1.p, p8.a):w8.e$a");
    }

    public final e g(C8563d dVar, boolean z10, C17642l<? super Rect, String> lVar) {
        C17542s.j(dVar, "rootLayoutNode");
        C17542s.j(lVar, "bitmapProvider");
        O o10 = new O();
        this.f55101a.f(dVar, z10, new C0879a(lVar, o10, this));
        e eVar = (e) o10.f144348a;
        if (eVar != null) {
            b(eVar);
        }
        return (e) o10.f144348a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8589a(C8560a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new C8560a() : aVar);
    }
}
