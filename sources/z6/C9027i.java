package z6;

import J6.a;
import android.graphics.Path;
import android.graphics.PointF;
import w6.C8927i;

/* renamed from: z6.i  reason: case insensitive filesystem */
public class C9027i extends a<PointF> {

    /* renamed from: q  reason: collision with root package name */
    private Path f58446q;

    /* renamed from: r  reason: collision with root package name */
    private final a<PointF> f58447r;

    public C9027i(C8927i iVar, a<PointF> aVar) {
        super(iVar, (PointF) aVar.f37351b, (PointF) aVar.f37352c, aVar.f37353d, aVar.f37354e, aVar.f37355f, aVar.f37356g, aVar.f37357h);
        this.f58447r = aVar;
        j();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r4.f37351b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j() {
        /*
            r4 = this;
            T r0 = r4.f37352c
            if (r0 == 0) goto L_0x001b
            T r1 = r4.f37351b
            if (r1 == 0) goto L_0x001b
            android.graphics.PointF r1 = (android.graphics.PointF) r1
            r2 = r0
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            float r2 = r2.x
            android.graphics.PointF r0 = (android.graphics.PointF) r0
            float r0 = r0.y
            boolean r0 = r1.equals(r2, r0)
            if (r0 == 0) goto L_0x001b
            r0 = 1
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            T r1 = r4.f37351b
            if (r1 == 0) goto L_0x0036
            T r2 = r4.f37352c
            if (r2 == 0) goto L_0x0036
            if (r0 != 0) goto L_0x0036
            android.graphics.PointF r1 = (android.graphics.PointF) r1
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            J6.a<android.graphics.PointF> r0 = r4.f58447r
            android.graphics.PointF r3 = r0.f37364o
            android.graphics.PointF r0 = r0.f37365p
            android.graphics.Path r0 = I6.j.d(r1, r2, r3, r0)
            r4.f58446q = r0
        L_0x0036:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z6.C9027i.j():void");
    }

    /* access modifiers changed from: package-private */
    public Path k() {
        return this.f58446q;
    }
}
