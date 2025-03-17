package m8;

import XH.t;
import YH.C16877v;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import o1.C5669i;
import t8.C8840a;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J3\u0010\u0018\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bH\u0002¢\u0006\u0004\b!\u0010\"J3\u0010$\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u00042\u0006\u0010#\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b$\u0010%J)\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060&2\u0006\u0010#\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006)"}, d2 = {"Lm8/a;", "", "<init>", "()V", "T", "parent", "Lm8/d;", "currentLayoutNode", "Lo1/i;", "parentBounds", "", "indexInParent", "", "clipToParent", "Lm8/b;", "callback", "LXH/N;", "e", "(Ljava/lang/Object;Lm8/d;Lo1/i;IZLm8/b;)V", "", "nodesPath", "node", "Lo1/g;", "targetCoordinates", "a", "(Ljava/util/List;Lm8/d;J)V", "LL1/p;", "", "d", "(LL1/p;)Ljava/lang/String;", "fullSizeRect", "clippedRect", "", "b", "(Lo1/i;Lo1/i;)F", "root", "f", "(Lm8/d;ZLm8/b;)V", "", "c", "(Lm8/d;J)Ljava/util/List;", "compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: m8.a  reason: case insensitive filesystem */
public final class C8560a {
    private final void a(List<C8563d> list, C8563d dVar, long j10) {
        if (dVar.getBounds().f(j10)) {
            list.add(dVar);
            for (C8563d a10 : dVar.e()) {
                a(list, a10, j10);
            }
        }
    }

    private final float b(C5669i iVar, C5669i iVar2) {
        if (iVar.x() || iVar2.x()) {
            return 0.0f;
        }
        return ((float) 1) - ((iVar2.n() * iVar2.t()) / (iVar.n() * iVar.t()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = r4.n();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String d(L1.p r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x0015
            L1.l r0 = r4.n()
            if (r0 == 0) goto L_0x0015
            L1.s r1 = L1.s.f9010a
            L1.w r1 = r1.y()
            java.lang.Object r0 = L1.m.a(r0, r1)
            L1.i r0 = (L1.i) r0
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r4 != 0) goto L_0x0019
            goto L_0x004e
        L_0x0019:
            if (r0 == 0) goto L_0x002a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "Sem.Role."
            r4.<init>(r1)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            goto L_0x0050
        L_0x002a:
            L1.l r0 = r4.n()
            L1.s r1 = L1.s.f9010a
            L1.w r2 = r1.g()
            boolean r0 = r0.k(r2)
            if (r0 == 0) goto L_0x003d
            java.lang.String r4 = "Sem.EditableText"
            goto L_0x0050
        L_0x003d:
            L1.l r4 = r4.n()
            L1.w r0 = r1.D()
            boolean r4 = r4.k(r0)
            if (r4 == 0) goto L_0x004e
            java.lang.String r4 = "Sem.Text"
            goto L_0x0050
        L_0x004e:
            java.lang.String r4 = "Sem"
        L_0x0050:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: m8.C8560a.d(L1.p):java.lang.String");
    }

    private final <T> void e(T t10, C8563d dVar, C5669i iVar, int i10, boolean z10, C8561b<T> bVar) {
        C5669i iVar2;
        boolean z11 = z10;
        C5669i bounds = dVar.getBounds();
        if (z11) {
            C5669i a10 = C8562c.b(bounds, iVar);
            if (!C17542s.e(a10, C5669i.f26706e.a())) {
                iVar2 = a10;
            } else {
                return;
            }
        } else if (!z11) {
            iVar2 = bounds;
        } else {
            throw new t();
        }
        C8561b<T> bVar2 = bVar;
        T t11 = t10;
        C8563d dVar2 = dVar;
        C5669i iVar3 = iVar2;
        T a11 = bVar2.a(t11, dVar2, iVar3, d(dVar.c()), i10, b(bounds, iVar2));
        int i11 = 0;
        for (T next : dVar.e()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C16877v.x();
            }
            int a12 = C8840a.a(dVar, i11);
            e(a11, (C8563d) next, iVar2, a12, z10, bVar);
            i11 = i12;
            iVar2 = iVar2;
        }
    }

    public static /* synthetic */ void g(C8560a aVar, Object obj, C8563d dVar, C5669i iVar, int i10, boolean z10, C8561b bVar, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = null;
        }
        aVar.e(obj, dVar, iVar, i10, z10, bVar);
    }

    public static /* synthetic */ void h(C8560a aVar, C8563d dVar, boolean z10, C8561b bVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        aVar.f(dVar, z10, bVar);
    }

    public final List<C8563d> c(C8563d dVar, long j10) {
        C17542s.j(dVar, "root");
        ArrayList arrayList = new ArrayList();
        a(arrayList, dVar, j10);
        return arrayList;
    }

    public final <T> void f(C8563d dVar, boolean z10, C8561b<T> bVar) {
        C17542s.j(dVar, "root");
        C17542s.j(bVar, "callback");
        g(this, (Object) null, dVar, dVar.getBounds(), 0, z10, bVar, 1, (Object) null);
    }
}
