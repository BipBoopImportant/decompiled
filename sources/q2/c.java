package q2;

import java.util.ArrayList;
import java.util.Iterator;
import p2.d;
import p2.e;
import p2.f;

public class c extends p {

    /* renamed from: k  reason: collision with root package name */
    ArrayList<p> f27773k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    private int f27774l;

    public c(e eVar, int i10) {
        super(eVar);
        this.f27832f = i10;
        q();
    }

    private void q() {
        e eVar;
        e eVar2 = this.f27828b;
        e M10 = eVar2.M(this.f27832f);
        while (true) {
            e eVar3 = M10;
            eVar = eVar2;
            eVar2 = eVar3;
            if (eVar2 == null) {
                break;
            }
            M10 = eVar2.M(this.f27832f);
        }
        this.f27828b = eVar;
        this.f27773k.add(eVar.O(this.f27832f));
        e K10 = eVar.K(this.f27832f);
        while (K10 != null) {
            this.f27773k.add(K10.O(this.f27832f));
            K10 = K10.K(this.f27832f);
        }
        Iterator<p> it = this.f27773k.iterator();
        while (it.hasNext()) {
            p next = it.next();
            int i10 = this.f27832f;
            if (i10 == 0) {
                next.f27828b.f27444c = this;
            } else if (i10 == 1) {
                next.f27828b.f27446d = this;
            }
        }
        if (this.f27832f == 0 && ((f) this.f27828b.L()).V1() && this.f27773k.size() > 1) {
            ArrayList<p> arrayList = this.f27773k;
            this.f27828b = arrayList.get(arrayList.size() - 1).f27828b;
        }
        this.f27774l = this.f27832f == 0 ? this.f27828b.z() : this.f27828b.U();
    }

    private e r() {
        for (int i10 = 0; i10 < this.f27773k.size(); i10++) {
            p pVar = this.f27773k.get(i10);
            if (pVar.f27828b.X() != 8) {
                return pVar.f27828b;
            }
        }
        return null;
    }

    private e s() {
        for (int size = this.f27773k.size() - 1; size >= 0; size--) {
            p pVar = this.f27773k.get(size);
            if (pVar.f27828b.X() != 8) {
                return pVar.f27828b;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(q2.d r27) {
        /*
            r26 = this;
            r0 = r26
            q2.f r1 = r0.f27834h
            boolean r1 = r1.f27793j
            if (r1 == 0) goto L_0x0425
            q2.f r1 = r0.f27835i
            boolean r1 = r1.f27793j
            if (r1 != 0) goto L_0x0010
            goto L_0x0425
        L_0x0010:
            p2.e r1 = r0.f27828b
            p2.e r1 = r1.L()
            boolean r2 = r1 instanceof p2.f
            if (r2 == 0) goto L_0x0021
            p2.f r1 = (p2.f) r1
            boolean r1 = r1.V1()
            goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            q2.f r2 = r0.f27835i
            int r2 = r2.f27790g
            q2.f r4 = r0.f27834h
            int r4 = r4.f27790g
            int r2 = r2 - r4
            java.util.ArrayList<q2.p> r4 = r0.f27773k
            int r4 = r4.size()
            r5 = 0
        L_0x0032:
            r6 = -1
            r7 = 8
            if (r5 >= r4) goto L_0x004a
            java.util.ArrayList<q2.p> r8 = r0.f27773k
            java.lang.Object r8 = r8.get(r5)
            q2.p r8 = (q2.p) r8
            p2.e r8 = r8.f27828b
            int r8 = r8.X()
            if (r8 != r7) goto L_0x004b
            int r5 = r5 + 1
            goto L_0x0032
        L_0x004a:
            r5 = r6
        L_0x004b:
            int r8 = r4 + -1
            r9 = r8
        L_0x004e:
            if (r9 < 0) goto L_0x0064
            java.util.ArrayList<q2.p> r10 = r0.f27773k
            java.lang.Object r10 = r10.get(r9)
            q2.p r10 = (q2.p) r10
            p2.e r10 = r10.f27828b
            int r10 = r10.X()
            if (r10 != r7) goto L_0x0063
            int r9 = r9 + -1
            goto L_0x004e
        L_0x0063:
            r6 = r9
        L_0x0064:
            r9 = 0
        L_0x0065:
            r11 = 2
            if (r9 >= r11) goto L_0x0109
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x006f:
            if (r13 >= r4) goto L_0x00fb
            java.util.ArrayList<q2.p> r3 = r0.f27773k
            java.lang.Object r3 = r3.get(r13)
            q2.p r3 = (q2.p) r3
            p2.e r11 = r3.f27828b
            int r11 = r11.X()
            if (r11 != r7) goto L_0x0083
            goto L_0x00f4
        L_0x0083:
            int r16 = r16 + 1
            if (r13 <= 0) goto L_0x008e
            if (r13 < r5) goto L_0x008e
            q2.f r11 = r3.f27834h
            int r11 = r11.f27789f
            int r14 = r14 + r11
        L_0x008e:
            q2.g r11 = r3.f27831e
            int r7 = r11.f27790g
            p2.e$b r10 = r3.f27830d
            p2.e$b r12 = p2.e.b.MATCH_CONSTRAINT
            if (r10 == r12) goto L_0x009a
            r10 = 1
            goto L_0x009b
        L_0x009a:
            r10 = 0
        L_0x009b:
            if (r10 == 0) goto L_0x00bd
            int r11 = r0.f27832f
            if (r11 != 0) goto L_0x00ac
            p2.e r12 = r3.f27828b
            q2.l r12 = r12.f27448e
            q2.g r12 = r12.f27831e
            boolean r12 = r12.f27793j
            if (r12 != 0) goto L_0x00ac
            return
        L_0x00ac:
            r12 = 1
            if (r11 != r12) goto L_0x00ba
            p2.e r11 = r3.f27828b
            q2.n r11 = r11.f27450f
            q2.g r11 = r11.f27831e
            boolean r11 = r11.f27793j
            if (r11 != 0) goto L_0x00ba
            return
        L_0x00ba:
            r19 = r7
            goto L_0x00d3
        L_0x00bd:
            r19 = r7
            r12 = 1
            int r7 = r3.f27827a
            if (r7 != r12) goto L_0x00cc
            if (r9 != 0) goto L_0x00cc
            int r7 = r11.f27796m
            int r15 = r15 + 1
        L_0x00ca:
            r10 = 1
            goto L_0x00d5
        L_0x00cc:
            boolean r7 = r11.f27793j
            if (r7 == 0) goto L_0x00d3
            r7 = r19
            goto L_0x00ca
        L_0x00d3:
            r7 = r19
        L_0x00d5:
            if (r10 != 0) goto L_0x00e9
            int r15 = r15 + 1
            p2.e r7 = r3.f27828b
            float[] r7 = r7.f27411D0
            int r10 = r0.f27832f
            r7 = r7[r10]
            r10 = 0
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 < 0) goto L_0x00ea
            float r17 = r17 + r7
            goto L_0x00ea
        L_0x00e9:
            int r14 = r14 + r7
        L_0x00ea:
            if (r13 >= r8) goto L_0x00f4
            if (r13 >= r6) goto L_0x00f4
            q2.f r3 = r3.f27835i
            int r3 = r3.f27789f
            int r3 = -r3
            int r14 = r14 + r3
        L_0x00f4:
            int r13 = r13 + 1
            r7 = 8
            r11 = 2
            goto L_0x006f
        L_0x00fb:
            if (r14 < r2) goto L_0x0106
            if (r15 != 0) goto L_0x0100
            goto L_0x0106
        L_0x0100:
            int r9 = r9 + 1
            r7 = 8
            goto L_0x0065
        L_0x0106:
            r3 = r16
            goto L_0x010e
        L_0x0109:
            r3 = 0
            r14 = 0
            r15 = 0
            r17 = 0
        L_0x010e:
            q2.f r7 = r0.f27834h
            int r7 = r7.f27790g
            if (r1 == 0) goto L_0x0118
            q2.f r7 = r0.f27835i
            int r7 = r7.f27790g
        L_0x0118:
            r9 = 1056964608(0x3f000000, float:0.5)
            if (r14 <= r2) goto L_0x012f
            r10 = 1073741824(0x40000000, float:2.0)
            if (r1 == 0) goto L_0x0128
            int r11 = r14 - r2
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            int r7 = r7 + r10
            goto L_0x012f
        L_0x0128:
            int r11 = r14 - r2
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            int r7 = r7 - r10
        L_0x012f:
            if (r15 <= 0) goto L_0x0223
            int r10 = r2 - r14
            float r10 = (float) r10
            float r11 = (float) r15
            float r11 = r10 / r11
            float r11 = r11 + r9
            int r11 = (int) r11
            r12 = 0
            r13 = 0
        L_0x013b:
            if (r12 >= r4) goto L_0x01d7
            java.util.ArrayList<q2.p> r9 = r0.f27773k
            java.lang.Object r9 = r9.get(r12)
            q2.p r9 = (q2.p) r9
            r19 = r11
            p2.e r11 = r9.f27828b
            int r11 = r11.X()
            r20 = r14
            r14 = 8
            if (r11 != r14) goto L_0x015d
        L_0x0153:
            r23 = r1
            r24 = r3
            r21 = r7
            r22 = r10
            goto L_0x01c5
        L_0x015d:
            p2.e$b r11 = r9.f27830d
            p2.e$b r14 = p2.e.b.MATCH_CONSTRAINT
            if (r11 != r14) goto L_0x0153
            q2.g r11 = r9.f27831e
            boolean r14 = r11.f27793j
            if (r14 != 0) goto L_0x0153
            r14 = 0
            int r18 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r18 <= 0) goto L_0x0180
            p2.e r14 = r9.f27828b
            float[] r14 = r14.f27411D0
            r21 = r7
            int r7 = r0.f27832f
            r7 = r14[r7]
            float r7 = r7 * r10
            float r7 = r7 / r17
            r14 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 + r14
            int r7 = (int) r7
            goto L_0x0184
        L_0x0180:
            r21 = r7
            r7 = r19
        L_0x0184:
            int r14 = r0.f27832f
            if (r14 != 0) goto L_0x0193
            p2.e r14 = r9.f27828b
            r22 = r10
            int r10 = r14.f27404A
            int r14 = r14.f27490z
            r23 = r1
            goto L_0x01a2
        L_0x0193:
            r22 = r10
            p2.e r10 = r9.f27828b
            int r14 = r10.f27410D
            int r10 = r10.f27408C
            r23 = r1
            r25 = r14
            r14 = r10
            r10 = r25
        L_0x01a2:
            int r1 = r9.f27827a
            r24 = r3
            r3 = 1
            if (r1 != r3) goto L_0x01b0
            int r1 = r11.f27796m
            int r1 = java.lang.Math.min(r7, r1)
            goto L_0x01b1
        L_0x01b0:
            r1 = r7
        L_0x01b1:
            int r1 = java.lang.Math.max(r14, r1)
            if (r10 <= 0) goto L_0x01bb
            int r1 = java.lang.Math.min(r10, r1)
        L_0x01bb:
            if (r1 == r7) goto L_0x01c0
            int r13 = r13 + 1
            r7 = r1
        L_0x01c0:
            q2.g r1 = r9.f27831e
            r1.d(r7)
        L_0x01c5:
            int r12 = r12 + 1
            r11 = r19
            r14 = r20
            r7 = r21
            r10 = r22
            r1 = r23
            r3 = r24
            r9 = 1056964608(0x3f000000, float:0.5)
            goto L_0x013b
        L_0x01d7:
            r23 = r1
            r24 = r3
            r21 = r7
            r20 = r14
            if (r13 <= 0) goto L_0x0214
            int r15 = r15 - r13
            r1 = 0
            r14 = 0
        L_0x01e4:
            if (r1 >= r4) goto L_0x0216
            java.util.ArrayList<q2.p> r3 = r0.f27773k
            java.lang.Object r3 = r3.get(r1)
            q2.p r3 = (q2.p) r3
            p2.e r7 = r3.f27828b
            int r7 = r7.X()
            r9 = 8
            if (r7 != r9) goto L_0x01f9
            goto L_0x0211
        L_0x01f9:
            if (r1 <= 0) goto L_0x0202
            if (r1 < r5) goto L_0x0202
            q2.f r7 = r3.f27834h
            int r7 = r7.f27789f
            int r14 = r14 + r7
        L_0x0202:
            q2.g r7 = r3.f27831e
            int r7 = r7.f27790g
            int r14 = r14 + r7
            if (r1 >= r8) goto L_0x0211
            if (r1 >= r6) goto L_0x0211
            q2.f r3 = r3.f27835i
            int r3 = r3.f27789f
            int r3 = -r3
            int r14 = r14 + r3
        L_0x0211:
            int r1 = r1 + 1
            goto L_0x01e4
        L_0x0214:
            r14 = r20
        L_0x0216:
            int r1 = r0.f27774l
            r3 = 2
            if (r1 != r3) goto L_0x0221
            if (r13 != 0) goto L_0x0221
            r1 = 0
            r0.f27774l = r1
            goto L_0x022d
        L_0x0221:
            r1 = 0
            goto L_0x022d
        L_0x0223:
            r23 = r1
            r24 = r3
            r21 = r7
            r20 = r14
            r1 = 0
            r3 = 2
        L_0x022d:
            if (r14 <= r2) goto L_0x0231
            r0.f27774l = r3
        L_0x0231:
            if (r24 <= 0) goto L_0x0239
            if (r15 != 0) goto L_0x0239
            if (r5 != r6) goto L_0x0239
            r0.f27774l = r3
        L_0x0239:
            int r3 = r0.f27774l
            r7 = 1
            if (r3 != r7) goto L_0x02de
            r9 = r24
            if (r9 <= r7) goto L_0x0247
            int r2 = r2 - r14
            int r3 = r9 + -1
            int r2 = r2 / r3
            goto L_0x024e
        L_0x0247:
            if (r9 != r7) goto L_0x024d
            int r2 = r2 - r14
            r3 = 2
            int r2 = r2 / r3
            goto L_0x024e
        L_0x024d:
            r2 = r1
        L_0x024e:
            if (r15 <= 0) goto L_0x0251
            r2 = r1
        L_0x0251:
            r3 = r1
            r7 = r21
        L_0x0254:
            if (r3 >= r4) goto L_0x0425
            if (r23 == 0) goto L_0x025d
            int r1 = r3 + 1
            int r1 = r4 - r1
            goto L_0x025e
        L_0x025d:
            r1 = r3
        L_0x025e:
            java.util.ArrayList<q2.p> r9 = r0.f27773k
            java.lang.Object r1 = r9.get(r1)
            q2.p r1 = (q2.p) r1
            p2.e r9 = r1.f27828b
            int r9 = r9.X()
            r10 = 8
            if (r9 != r10) goto L_0x027b
            q2.f r9 = r1.f27834h
            r9.d(r7)
            q2.f r1 = r1.f27835i
            r1.d(r7)
            goto L_0x02da
        L_0x027b:
            if (r3 <= 0) goto L_0x0282
            if (r23 == 0) goto L_0x0281
            int r7 = r7 - r2
            goto L_0x0282
        L_0x0281:
            int r7 = r7 + r2
        L_0x0282:
            if (r3 <= 0) goto L_0x0293
            if (r3 < r5) goto L_0x0293
            if (r23 == 0) goto L_0x028e
            q2.f r9 = r1.f27834h
            int r9 = r9.f27789f
            int r7 = r7 - r9
            goto L_0x0293
        L_0x028e:
            q2.f r9 = r1.f27834h
            int r9 = r9.f27789f
            int r7 = r7 + r9
        L_0x0293:
            if (r23 == 0) goto L_0x029b
            q2.f r9 = r1.f27835i
            r9.d(r7)
            goto L_0x02a0
        L_0x029b:
            q2.f r9 = r1.f27834h
            r9.d(r7)
        L_0x02a0:
            q2.g r9 = r1.f27831e
            int r10 = r9.f27790g
            p2.e$b r11 = r1.f27830d
            p2.e$b r12 = p2.e.b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x02b1
            int r11 = r1.f27827a
            r12 = 1
            if (r11 != r12) goto L_0x02b1
            int r10 = r9.f27796m
        L_0x02b1:
            if (r23 == 0) goto L_0x02b5
            int r7 = r7 - r10
            goto L_0x02b6
        L_0x02b5:
            int r7 = r7 + r10
        L_0x02b6:
            if (r23 == 0) goto L_0x02bf
            q2.f r9 = r1.f27834h
            r9.d(r7)
        L_0x02bd:
            r9 = 1
            goto L_0x02c5
        L_0x02bf:
            q2.f r9 = r1.f27835i
            r9.d(r7)
            goto L_0x02bd
        L_0x02c5:
            r1.f27833g = r9
            if (r3 >= r8) goto L_0x02da
            if (r3 >= r6) goto L_0x02da
            if (r23 == 0) goto L_0x02d4
            q2.f r1 = r1.f27835i
            int r1 = r1.f27789f
            int r1 = -r1
            int r7 = r7 - r1
            goto L_0x02da
        L_0x02d4:
            q2.f r1 = r1.f27835i
            int r1 = r1.f27789f
            int r1 = -r1
            int r7 = r7 + r1
        L_0x02da:
            int r3 = r3 + 1
            goto L_0x0254
        L_0x02de:
            r9 = r24
            if (r3 != 0) goto L_0x0375
            int r2 = r2 - r14
            r3 = 1
            int r7 = r9 + 1
            int r2 = r2 / r7
            if (r15 <= 0) goto L_0x02ea
            r2 = r1
        L_0x02ea:
            r3 = r1
            r7 = r21
        L_0x02ed:
            if (r3 >= r4) goto L_0x0425
            if (r23 == 0) goto L_0x02f6
            int r1 = r3 + 1
            int r1 = r4 - r1
            goto L_0x02f7
        L_0x02f6:
            r1 = r3
        L_0x02f7:
            java.util.ArrayList<q2.p> r9 = r0.f27773k
            java.lang.Object r1 = r9.get(r1)
            q2.p r1 = (q2.p) r1
            p2.e r9 = r1.f27828b
            int r9 = r9.X()
            r10 = 8
            if (r9 != r10) goto L_0x0314
            q2.f r9 = r1.f27834h
            r9.d(r7)
            q2.f r1 = r1.f27835i
            r1.d(r7)
            goto L_0x0371
        L_0x0314:
            if (r23 == 0) goto L_0x0318
            int r7 = r7 - r2
            goto L_0x0319
        L_0x0318:
            int r7 = r7 + r2
        L_0x0319:
            if (r3 <= 0) goto L_0x032a
            if (r3 < r5) goto L_0x032a
            if (r23 == 0) goto L_0x0325
            q2.f r9 = r1.f27834h
            int r9 = r9.f27789f
            int r7 = r7 - r9
            goto L_0x032a
        L_0x0325:
            q2.f r9 = r1.f27834h
            int r9 = r9.f27789f
            int r7 = r7 + r9
        L_0x032a:
            if (r23 == 0) goto L_0x0332
            q2.f r9 = r1.f27835i
            r9.d(r7)
            goto L_0x0337
        L_0x0332:
            q2.f r9 = r1.f27834h
            r9.d(r7)
        L_0x0337:
            q2.g r9 = r1.f27831e
            int r10 = r9.f27790g
            p2.e$b r11 = r1.f27830d
            p2.e$b r12 = p2.e.b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x034c
            int r11 = r1.f27827a
            r12 = 1
            if (r11 != r12) goto L_0x034c
            int r9 = r9.f27796m
            int r10 = java.lang.Math.min(r10, r9)
        L_0x034c:
            if (r23 == 0) goto L_0x0350
            int r7 = r7 - r10
            goto L_0x0351
        L_0x0350:
            int r7 = r7 + r10
        L_0x0351:
            if (r23 == 0) goto L_0x0359
            q2.f r9 = r1.f27834h
            r9.d(r7)
            goto L_0x035e
        L_0x0359:
            q2.f r9 = r1.f27835i
            r9.d(r7)
        L_0x035e:
            if (r3 >= r8) goto L_0x0371
            if (r3 >= r6) goto L_0x0371
            if (r23 == 0) goto L_0x036b
            q2.f r1 = r1.f27835i
            int r1 = r1.f27789f
            int r1 = -r1
            int r7 = r7 - r1
            goto L_0x0371
        L_0x036b:
            q2.f r1 = r1.f27835i
            int r1 = r1.f27789f
            int r1 = -r1
            int r7 = r7 + r1
        L_0x0371:
            int r3 = r3 + 1
            goto L_0x02ed
        L_0x0375:
            r7 = 2
            if (r3 != r7) goto L_0x0425
            int r3 = r0.f27832f
            if (r3 != 0) goto L_0x0383
            p2.e r3 = r0.f27828b
            float r3 = r3.y()
            goto L_0x0389
        L_0x0383:
            p2.e r3 = r0.f27828b
            float r3 = r3.T()
        L_0x0389:
            if (r23 == 0) goto L_0x038f
            r7 = 1065353216(0x3f800000, float:1.0)
            float r3 = r7 - r3
        L_0x038f:
            int r2 = r2 - r14
            float r2 = (float) r2
            float r2 = r2 * r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r3
            int r2 = (int) r2
            if (r2 < 0) goto L_0x039a
            if (r15 <= 0) goto L_0x039b
        L_0x039a:
            r2 = r1
        L_0x039b:
            if (r23 == 0) goto L_0x03a0
            int r7 = r21 - r2
            goto L_0x03a2
        L_0x03a0:
            int r7 = r21 + r2
        L_0x03a2:
            r3 = r1
        L_0x03a3:
            if (r3 >= r4) goto L_0x0425
            if (r23 == 0) goto L_0x03ac
            int r1 = r3 + 1
            int r1 = r4 - r1
            goto L_0x03ad
        L_0x03ac:
            r1 = r3
        L_0x03ad:
            java.util.ArrayList<q2.p> r2 = r0.f27773k
            java.lang.Object r1 = r2.get(r1)
            q2.p r1 = (q2.p) r1
            p2.e r2 = r1.f27828b
            int r2 = r2.X()
            r9 = 8
            if (r2 != r9) goto L_0x03cb
            q2.f r2 = r1.f27834h
            r2.d(r7)
            q2.f r1 = r1.f27835i
            r1.d(r7)
            r12 = 1
            goto L_0x0421
        L_0x03cb:
            if (r3 <= 0) goto L_0x03dc
            if (r3 < r5) goto L_0x03dc
            if (r23 == 0) goto L_0x03d7
            q2.f r2 = r1.f27834h
            int r2 = r2.f27789f
            int r7 = r7 - r2
            goto L_0x03dc
        L_0x03d7:
            q2.f r2 = r1.f27834h
            int r2 = r2.f27789f
            int r7 = r7 + r2
        L_0x03dc:
            if (r23 == 0) goto L_0x03e4
            q2.f r2 = r1.f27835i
            r2.d(r7)
            goto L_0x03e9
        L_0x03e4:
            q2.f r2 = r1.f27834h
            r2.d(r7)
        L_0x03e9:
            q2.g r2 = r1.f27831e
            int r10 = r2.f27790g
            p2.e$b r11 = r1.f27830d
            p2.e$b r12 = p2.e.b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x03fb
            int r11 = r1.f27827a
            r12 = 1
            if (r11 != r12) goto L_0x03fc
            int r10 = r2.f27796m
            goto L_0x03fc
        L_0x03fb:
            r12 = 1
        L_0x03fc:
            if (r23 == 0) goto L_0x0400
            int r7 = r7 - r10
            goto L_0x0401
        L_0x0400:
            int r7 = r7 + r10
        L_0x0401:
            if (r23 == 0) goto L_0x0409
            q2.f r2 = r1.f27834h
            r2.d(r7)
            goto L_0x040e
        L_0x0409:
            q2.f r2 = r1.f27835i
            r2.d(r7)
        L_0x040e:
            if (r3 >= r8) goto L_0x0421
            if (r3 >= r6) goto L_0x0421
            if (r23 == 0) goto L_0x041b
            q2.f r1 = r1.f27835i
            int r1 = r1.f27789f
            int r1 = -r1
            int r7 = r7 - r1
            goto L_0x0421
        L_0x041b:
            q2.f r1 = r1.f27835i
            int r1 = r1.f27789f
            int r1 = -r1
            int r7 = r7 + r1
        L_0x0421:
            int r3 = r3 + 1
            goto L_0x03a3
        L_0x0425:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.c.a(q2.d):void");
    }

    /* access modifiers changed from: package-private */
    public void d() {
        Iterator<p> it = this.f27773k.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = this.f27773k.size();
        if (size >= 1) {
            e eVar = this.f27773k.get(0).f27828b;
            e eVar2 = this.f27773k.get(size - 1).f27828b;
            if (this.f27832f == 0) {
                d dVar = eVar.f27428O;
                d dVar2 = eVar2.f27430Q;
                f i10 = i(dVar, 0);
                int f10 = dVar.f();
                e r10 = r();
                if (r10 != null) {
                    f10 = r10.f27428O.f();
                }
                if (i10 != null) {
                    b(this.f27834h, i10, f10);
                }
                f i11 = i(dVar2, 0);
                int f11 = dVar2.f();
                e s10 = s();
                if (s10 != null) {
                    f11 = s10.f27430Q.f();
                }
                if (i11 != null) {
                    b(this.f27835i, i11, -f11);
                }
            } else {
                d dVar3 = eVar.f27429P;
                d dVar4 = eVar2.f27431R;
                f i12 = i(dVar3, 1);
                int f12 = dVar3.f();
                e r11 = r();
                if (r11 != null) {
                    f12 = r11.f27429P.f();
                }
                if (i12 != null) {
                    b(this.f27834h, i12, f12);
                }
                f i13 = i(dVar4, 1);
                int f13 = dVar4.f();
                e s11 = s();
                if (s11 != null) {
                    f13 = s11.f27431R.f();
                }
                if (i13 != null) {
                    b(this.f27835i, i13, -f13);
                }
            }
            this.f27834h.f27784a = this;
            this.f27835i.f27784a = this;
        }
    }

    public void e() {
        for (int i10 = 0; i10 < this.f27773k.size(); i10++) {
            this.f27773k.get(i10).e();
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f27829c = null;
        Iterator<p> it = this.f27773k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    public long j() {
        int size = this.f27773k.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            p pVar = this.f27773k.get(i10);
            j10 = j10 + ((long) pVar.f27834h.f27789f) + pVar.j() + ((long) pVar.f27835i.f27789f);
        }
        return j10;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        int size = this.f27773k.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.f27773k.get(i10).m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f27832f == 0 ? "horizontal : " : "vertical : ");
        Iterator<p> it = this.f27773k.iterator();
        while (it.hasNext()) {
            sb2.append("<");
            sb2.append(it.next());
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
