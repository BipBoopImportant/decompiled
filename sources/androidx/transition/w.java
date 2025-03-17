package androidx.transition;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.C7026l;
import java.util.ArrayList;
import java.util.Iterator;

public class w extends C7026l {

    /* renamed from: Q  reason: collision with root package name */
    ArrayList<C7026l> f44764Q = new ArrayList<>();

    /* renamed from: R  reason: collision with root package name */
    private boolean f44765R = true;

    /* renamed from: S  reason: collision with root package name */
    int f44766S;

    /* renamed from: T  reason: collision with root package name */
    boolean f44767T = false;

    /* renamed from: U  reason: collision with root package name */
    private int f44768U = 0;

    class a extends s {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C7026l f44769a;

        a(C7026l lVar) {
            this.f44769a = lVar;
        }

        public void j(C7026l lVar) {
            this.f44769a.o0();
            lVar.k0(this);
        }
    }

    class b extends s {
        b() {
        }

        public void l(C7026l lVar) {
            w.this.f44764Q.remove(lVar);
            if (!w.this.V()) {
                w.this.g0(C7026l.i.f44753c, false);
                w wVar = w.this;
                wVar.f44695B = true;
                wVar.g0(C7026l.i.f44752b, false);
            }
        }
    }

    static class c extends s {

        /* renamed from: a  reason: collision with root package name */
        w f44772a;

        c(w wVar) {
            this.f44772a = wVar;
        }

        public void e(C7026l lVar) {
            w wVar = this.f44772a;
            if (!wVar.f44767T) {
                wVar.x0();
                this.f44772a.f44767T = true;
            }
        }

        public void j(C7026l lVar) {
            w wVar = this.f44772a;
            int i10 = wVar.f44766S - 1;
            wVar.f44766S = i10;
            if (i10 == 0) {
                wVar.f44767T = false;
                wVar.y();
            }
            lVar.k0(this);
        }
    }

    private void C0(C7026l lVar) {
        this.f44764Q.add(lVar);
        lVar.f44723r = this;
    }

    private int G0(long j10) {
        for (int i10 = 1; i10 < this.f44764Q.size(); i10++) {
            if (this.f44764Q.get(i10).f44705L > j10) {
                return i10 - 1;
            }
        }
        return this.f44764Q.size() - 1;
    }

    private void O0() {
        c cVar = new c(this);
        Iterator<C7026l> it = this.f44764Q.iterator();
        while (it.hasNext()) {
            it.next().c(cVar);
        }
        this.f44766S = this.f44764Q.size();
    }

    /* renamed from: A0 */
    public w d(View view) {
        for (int i10 = 0; i10 < this.f44764Q.size(); i10++) {
            this.f44764Q.get(i10).d(view);
        }
        return (w) super.d(view);
    }

    public w B0(C7026l lVar) {
        C0(lVar);
        long j10 = this.f44708c;
        if (j10 >= 0) {
            lVar.q0(j10);
        }
        if ((this.f44768U & 1) != 0) {
            lVar.s0(D());
        }
        if ((this.f44768U & 2) != 0) {
            lVar.v0(I());
        }
        if ((this.f44768U & 4) != 0) {
            lVar.u0(H());
        }
        if ((this.f44768U & 8) != 0) {
            lVar.r0(C());
        }
        return this;
    }

    public C7026l D0(int i10) {
        if (i10 < 0 || i10 >= this.f44764Q.size()) {
            return null;
        }
        return this.f44764Q.get(i10);
    }

    public int F0() {
        return this.f44764Q.size();
    }

    /* renamed from: H0 */
    public w k0(C7026l.h hVar) {
        return (w) super.k0(hVar);
    }

    /* renamed from: I0 */
    public w l0(View view) {
        for (int i10 = 0; i10 < this.f44764Q.size(); i10++) {
            this.f44764Q.get(i10).l0(view);
        }
        return (w) super.l0(view);
    }

    /* renamed from: J0 */
    public w q0(long j10) {
        ArrayList<C7026l> arrayList;
        super.q0(j10);
        if (this.f44708c >= 0 && (arrayList = this.f44764Q) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f44764Q.get(i10).q0(j10);
            }
        }
        return this;
    }

    /* renamed from: K0 */
    public w s0(TimeInterpolator timeInterpolator) {
        this.f44768U |= 1;
        ArrayList<C7026l> arrayList = this.f44764Q;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f44764Q.get(i10).s0(timeInterpolator);
            }
        }
        return (w) super.s0(timeInterpolator);
    }

    public w L0(int i10) {
        if (i10 == 0) {
            this.f44765R = true;
        } else if (i10 == 1) {
            this.f44765R = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i10);
        }
        return this;
    }

    /* renamed from: M0 */
    public w w0(long j10) {
        return (w) super.w0(j10);
    }

    /* access modifiers changed from: package-private */
    public boolean V() {
        for (int i10 = 0; i10 < this.f44764Q.size(); i10++) {
            if (this.f44764Q.get(i10).V()) {
                return true;
            }
        }
        return false;
    }

    public boolean W() {
        int size = this.f44764Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.f44764Q.get(i10).W()) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void cancel() {
        super.cancel();
        int size = this.f44764Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f44764Q.get(i10).cancel();
        }
    }

    public void h0(View view) {
        super.h0(view);
        int size = this.f44764Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f44764Q.get(i10).h0(view);
        }
    }

    /* access modifiers changed from: package-private */
    public void j0() {
        this.f44703J = 0;
        b bVar = new b();
        for (int i10 = 0; i10 < this.f44764Q.size(); i10++) {
            C7026l lVar = this.f44764Q.get(i10);
            lVar.c(bVar);
            lVar.j0();
            long R10 = lVar.R();
            if (this.f44765R) {
                this.f44703J = Math.max(this.f44703J, R10);
            } else {
                long j10 = this.f44703J;
                lVar.f44705L = j10;
                this.f44703J = j10 + R10;
            }
        }
    }

    public void k(y yVar) {
        if (Y(yVar.f44775b)) {
            Iterator<C7026l> it = this.f44764Q.iterator();
            while (it.hasNext()) {
                C7026l next = it.next();
                if (next.Y(yVar.f44775b)) {
                    next.k(yVar);
                    yVar.f44776c.add(next);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void m(y yVar) {
        super.m(yVar);
        int size = this.f44764Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f44764Q.get(i10).m(yVar);
        }
    }

    public void m0(View view) {
        super.m0(view);
        int size = this.f44764Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f44764Q.get(i10).m0(view);
        }
    }

    public void n(y yVar) {
        if (Y(yVar.f44775b)) {
            Iterator<C7026l> it = this.f44764Q.iterator();
            while (it.hasNext()) {
                C7026l next = it.next();
                if (next.Y(yVar.f44775b)) {
                    next.n(yVar);
                    yVar.f44776c.add(next);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void o0() {
        if (this.f44764Q.isEmpty()) {
            x0();
            y();
            return;
        }
        O0();
        if (!this.f44765R) {
            for (int i10 = 1; i10 < this.f44764Q.size(); i10++) {
                this.f44764Q.get(i10 - 1).c(new a(this.f44764Q.get(i10)));
            }
            C7026l lVar = this.f44764Q.get(0);
            if (lVar != null) {
                lVar.o0();
                return;
            }
            return;
        }
        Iterator<C7026l> it = this.f44764Q.iterator();
        while (it.hasNext()) {
            it.next().o0();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void p0(long r19, long r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r3 = r21
            long r5 = r18.R()
            androidx.transition.w r7 = r0.f44723r
            r8 = 0
            if (r7 == 0) goto L_0x0021
            int r7 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x0018
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 < 0) goto L_0x0020
        L_0x0018:
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0021
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0021
        L_0x0020:
            return
        L_0x0021:
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r10 = 0
            if (r7 >= 0) goto L_0x0028
            r12 = 1
            goto L_0x0029
        L_0x0028:
            r12 = r10
        L_0x0029:
            int r13 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r13 < 0) goto L_0x0031
            int r14 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r14 < 0) goto L_0x0039
        L_0x0031:
            int r14 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r14 > 0) goto L_0x0040
            int r14 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r14 <= 0) goto L_0x0040
        L_0x0039:
            r0.f44695B = r10
            androidx.transition.l$i r14 = androidx.transition.C7026l.i.f44751a
            r0.g0(r14, r12)
        L_0x0040:
            boolean r14 = r0.f44765R
            if (r14 == 0) goto L_0x005d
        L_0x0044:
            java.util.ArrayList<androidx.transition.l> r7 = r0.f44764Q
            int r7 = r7.size()
            if (r10 >= r7) goto L_0x005a
            java.util.ArrayList<androidx.transition.l> r7 = r0.f44764Q
            java.lang.Object r7 = r7.get(r10)
            androidx.transition.l r7 = (androidx.transition.C7026l) r7
            r7.p0(r1, r3)
            int r10 = r10 + 1
            goto L_0x0044
        L_0x005a:
            r16 = r12
            goto L_0x00a5
        L_0x005d:
            int r10 = r0.G0(r3)
            if (r7 < 0) goto L_0x0088
        L_0x0063:
            java.util.ArrayList<androidx.transition.l> r7 = r0.f44764Q
            int r7 = r7.size()
            if (r10 >= r7) goto L_0x005a
            java.util.ArrayList<androidx.transition.l> r7 = r0.f44764Q
            java.lang.Object r7 = r7.get(r10)
            androidx.transition.l r7 = (androidx.transition.C7026l) r7
            long r14 = r7.f44705L
            r16 = r12
            long r11 = r1 - r14
            int r17 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r17 >= 0) goto L_0x007e
            goto L_0x00a5
        L_0x007e:
            long r14 = r3 - r14
            r7.p0(r11, r14)
            int r10 = r10 + 1
            r12 = r16
            goto L_0x0063
        L_0x0088:
            r16 = r12
        L_0x008a:
            if (r10 < 0) goto L_0x00a5
            java.util.ArrayList<androidx.transition.l> r7 = r0.f44764Q
            java.lang.Object r7 = r7.get(r10)
            androidx.transition.l r7 = (androidx.transition.C7026l) r7
            long r11 = r7.f44705L
            long r14 = r1 - r11
            long r11 = r3 - r11
            r7.p0(r14, r11)
            int r7 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r7 < 0) goto L_0x00a2
            goto L_0x00a5
        L_0x00a2:
            int r10 = r10 + -1
            goto L_0x008a
        L_0x00a5:
            androidx.transition.w r7 = r0.f44723r
            if (r7 == 0) goto L_0x00c3
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x00b1
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x00b7
        L_0x00b1:
            if (r13 >= 0) goto L_0x00c3
            int r2 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r2 < 0) goto L_0x00c3
        L_0x00b7:
            if (r1 <= 0) goto L_0x00bc
            r1 = 1
            r0.f44695B = r1
        L_0x00bc:
            androidx.transition.l$i r1 = androidx.transition.C7026l.i.f44752b
            r11 = r16
            r0.g0(r1, r11)
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.w.p0(long, long):void");
    }

    /* renamed from: r */
    public C7026l clone() {
        w wVar = (w) super.clone();
        wVar.f44764Q = new ArrayList<>();
        int size = this.f44764Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            wVar.C0(this.f44764Q.get(i10).clone());
        }
        return wVar;
    }

    public void r0(C7026l.e eVar) {
        super.r0(eVar);
        this.f44768U |= 8;
        int size = this.f44764Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f44764Q.get(i10).r0(eVar);
        }
    }

    public void u0(C7020f fVar) {
        super.u0(fVar);
        this.f44768U |= 4;
        if (this.f44764Q != null) {
            for (int i10 = 0; i10 < this.f44764Q.size(); i10++) {
                this.f44764Q.get(i10).u0(fVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void v(ViewGroup viewGroup, z zVar, z zVar2, ArrayList<y> arrayList, ArrayList<y> arrayList2) {
        long M10 = M();
        int size = this.f44764Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            C7026l lVar = this.f44764Q.get(i10);
            if (M10 > 0 && (this.f44765R || i10 == 0)) {
                long M11 = lVar.M();
                if (M11 > 0) {
                    lVar.w0(M11 + M10);
                } else {
                    lVar.w0(M10);
                }
            }
            lVar.v(viewGroup, zVar, zVar2, arrayList, arrayList2);
        }
    }

    public void v0(u uVar) {
        super.v0(uVar);
        this.f44768U |= 2;
        int size = this.f44764Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f44764Q.get(i10).v0(uVar);
        }
    }

    /* access modifiers changed from: package-private */
    public String y0(String str) {
        String y02 = super.y0(str);
        for (int i10 = 0; i10 < this.f44764Q.size(); i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(y02);
            sb2.append("\n");
            sb2.append(this.f44764Q.get(i10).y0(str + "  "));
            y02 = sb2.toString();
        }
        return y02;
    }

    /* renamed from: z0 */
    public w c(C7026l.h hVar) {
        return (w) super.c(hVar);
    }
}
