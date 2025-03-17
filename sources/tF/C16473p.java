package TF;

import SF.C16402c;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: TF.p  reason: case insensitive filesystem */
public final class C16473p implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f138449a;

    /* renamed from: b  reason: collision with root package name */
    public final View f138450b;

    /* renamed from: c  reason: collision with root package name */
    public final C16475r f138451c;

    /* renamed from: d  reason: collision with root package name */
    public final C16476s f138452d;

    /* renamed from: e  reason: collision with root package name */
    public final C16477t f138453e;

    /* renamed from: f  reason: collision with root package name */
    public final C16478u f138454f;

    /* renamed from: g  reason: collision with root package name */
    public final C16479v f138455g;

    /* renamed from: h  reason: collision with root package name */
    public final C16474q f138456h;

    private C16473p(ConstraintLayout constraintLayout, View view, C16475r rVar, C16476s sVar, C16477t tVar, C16478u uVar, C16479v vVar, C16474q qVar) {
        this.f138449a = constraintLayout;
        this.f138450b = view;
        this.f138451c = rVar;
        this.f138452d = sVar;
        this.f138453e = tVar;
        this.f138454f = uVar;
        this.f138455g = vVar;
        this.f138456h = qVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = SF.C16401b.f138161p1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static TF.C16473p a(android.view.View r10) {
        /*
            int r0 = SF.C16401b.f138158o1
            android.view.View r3 = X4.b.a(r10, r0)
            if (r3 == 0) goto L_0x005a
            int r0 = SF.C16401b.f138161p1
            android.view.View r1 = X4.b.a(r10, r0)
            if (r1 == 0) goto L_0x005a
            TF.r r4 = TF.C16475r.a(r1)
            int r0 = SF.C16401b.f138164q1
            android.view.View r1 = X4.b.a(r10, r0)
            if (r1 == 0) goto L_0x005a
            TF.s r5 = TF.C16476s.a(r1)
            int r0 = SF.C16401b.f138167r1
            android.view.View r1 = X4.b.a(r10, r0)
            if (r1 == 0) goto L_0x005a
            TF.t r6 = TF.C16477t.a(r1)
            int r0 = SF.C16401b.f138170s1
            android.view.View r1 = X4.b.a(r10, r0)
            if (r1 == 0) goto L_0x005a
            TF.u r7 = TF.C16478u.a(r1)
            int r0 = SF.C16401b.f138173t1
            android.view.View r1 = X4.b.a(r10, r0)
            if (r1 == 0) goto L_0x005a
            TF.v r8 = TF.C16479v.a(r1)
            int r0 = SF.C16401b.f138176u1
            android.view.View r1 = X4.b.a(r10, r0)
            if (r1 == 0) goto L_0x005a
            TF.q r9 = TF.C16474q.a(r1)
            TF.p r0 = new TF.p
            r2 = r10
            androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        L_0x005a:
            android.content.res.Resources r10 = r10.getResources()
            java.lang.String r10 = r10.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r10 = r1.concat(r10)
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: TF.C16473p.a(android.view.View):TF.p");
    }

    public static C16473p c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C16402c.f138199h, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f138449a;
    }
}
