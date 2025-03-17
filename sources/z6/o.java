package z6;

import B6.b;
import J6.c;
import java.util.List;

public class o extends C9025g<b> {

    class a extends c<b> {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ J6.b f58463d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ c f58464e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b f58465f;

        a(J6.b bVar, c cVar, b bVar2) {
            this.f58463d = bVar;
            this.f58464e = cVar;
            this.f58465f = bVar2;
        }

        /* JADX WARNING: type inference failed for: r17v0, types: [J6.b, J6.b<B6.b>] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public B6.b a(J6.b<B6.b> r17) {
            /*
                r16 = this;
                r0 = r16
                J6.b r1 = r0.f58463d
                float r2 = r17.f()
                float r3 = r17.a()
                java.lang.Object r4 = r17.g()
                B6.b r4 = (B6.b) r4
                java.lang.String r4 = r4.f33209a
                java.lang.Object r5 = r17.b()
                B6.b r5 = (B6.b) r5
                java.lang.String r5 = r5.f33209a
                float r6 = r17.d()
                float r7 = r17.c()
                float r8 = r17.e()
                r1.h(r2, r3, r4, r5, r6, r7, r8)
                J6.c r1 = r0.f58464e
                J6.b r2 = r0.f58463d
                java.lang.Object r1 = r1.a(r2)
                r3 = r1
                java.lang.String r3 = (java.lang.String) r3
                float r1 = r17.c()
                r2 = 1065353216(0x3f800000, float:1.0)
                int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r1 != 0) goto L_0x0047
                java.lang.Object r1 = r17.b()
            L_0x0044:
                B6.b r1 = (B6.b) r1
                goto L_0x004c
            L_0x0047:
                java.lang.Object r1 = r17.g()
                goto L_0x0044
            L_0x004c:
                B6.b r2 = r0.f58465f
                java.lang.String r4 = r1.f33210b
                float r5 = r1.f33211c
                B6.b$a r6 = r1.f33212d
                int r7 = r1.f33213e
                float r8 = r1.f33214f
                float r9 = r1.f33215g
                int r10 = r1.f33216h
                int r11 = r1.f33217i
                float r12 = r1.f33218j
                boolean r13 = r1.f33219k
                android.graphics.PointF r14 = r1.f33220l
                android.graphics.PointF r15 = r1.f33221m
                r2.a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                B6.b r1 = r0.f58465f
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: z6.o.a.a(J6.b):B6.b");
        }
    }

    public o(List<J6.a<b>> list) {
        super(list);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public b i(J6.a<b> aVar, float f10) {
        T t10;
        c<A> cVar = this.f58423e;
        if (cVar == null) {
            return (f10 != 1.0f || (t10 = aVar.f37352c) == null) ? (b) aVar.f37351b : (b) t10;
        }
        float f11 = aVar.f37356g;
        Float f12 = aVar.f37357h;
        float floatValue = f12 == null ? Float.MAX_VALUE : f12.floatValue();
        T t11 = aVar.f37351b;
        b bVar = (b) t11;
        T t12 = aVar.f37352c;
        return (b) cVar.b(f11, floatValue, bVar, t12 == null ? (b) t11 : (b) t12, f10, d(), f());
    }

    public void q(c<String> cVar) {
        super.n(new a(new J6.b(), cVar, new b()));
    }
}
