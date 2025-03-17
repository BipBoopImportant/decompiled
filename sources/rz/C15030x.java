package rz;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/ProductLiteRemote;", "Lrz/w;", "a", "(Lcom/ingka/ikea/core/remotemodel/product/ProductLiteRemote;)Lrz/w;", "datalayer_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: rz.x  reason: case insensitive filesystem */
public final class C15030x {
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        r6 = r6.a();
     */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final rz.C15029w a(com.ingka.ikea.core.remotemodel.product.ProductLiteRemote r26) {
        /*
            java.lang.String r0 = "<this>"
            r1 = r26
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r2 = r26.i()
            java.lang.String r3 = r26.j()
            java.lang.String r4 = r26.p()
            java.lang.String r0 = "Required value was null."
            if (r4 == 0) goto L_0x0268
            java.lang.String r5 = r26.e()
            if (r5 == 0) goto L_0x0262
            com.ingka.ikea.core.remotemodel.product.DisclaimerRemote r6 = r26.f()
            if (r6 == 0) goto L_0x002e
            com.ingka.ikea.core.remotemodel.ImageRemote r6 = r6.a()
            if (r6 == 0) goto L_0x002e
            java.lang.String r6 = r6.b()
            goto L_0x002f
        L_0x002e:
            r6 = 0
        L_0x002f:
            com.ingka.ikea.core.remotemodel.product.BadgeRemote r8 = r26.m()
            if (r8 == 0) goto L_0x003c
            com.ingka.ikea.core.model.product.Badge r8 = r8.a()
            r16 = r8
            goto L_0x003e
        L_0x003c:
            r16 = 0
        L_0x003e:
            java.lang.Boolean r8 = r26.q()
            if (r8 == 0) goto L_0x025c
            boolean r8 = r8.booleanValue()
            java.lang.String r9 = r26.c()
            com.ingka.ikea.core.remotemodel.ImageRemote r10 = r26.g()
            if (r10 == 0) goto L_0x0057
            com.ingka.ikea.core.model.Image r10 = r10.c()
            goto L_0x0058
        L_0x0057:
            r10 = 0
        L_0x0058:
            com.ingka.ikea.core.remotemodel.ImageRemote r11 = r26.d()
            if (r11 == 0) goto L_0x0063
            com.ingka.ikea.core.model.Image r11 = r11.c()
            goto L_0x0064
        L_0x0063:
            r11 = 0
        L_0x0064:
            com.ingka.ikea.core.remotemodel.product.PricePackageRemote r12 = r26.l()
            if (r12 == 0) goto L_0x0256
            com.ingka.ikea.core.model.product.a r12 = r12.f()
            java.util.List r13 = r26.n()
            if (r13 == 0) goto L_0x00dc
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r13 = r13.iterator()
        L_0x007f:
            boolean r17 = r13.hasNext()
            if (r17 == 0) goto L_0x00a5
            java.lang.Object r7 = r13.next()
            r18 = r7
            com.ingka.ikea.core.remotemodel.product.DisclaimerRemote r18 = (com.ingka.ikea.core.remotemodel.product.DisclaimerRemote) r18
            com.ingka.ikea.core.model.product.Disclaimer r18 = r18.d()
            com.ingka.ikea.core.model.product.DisclaimerType r14 = r18.e()
            com.ingka.ikea.core.model.product.DisclaimerType r1 = com.ingka.ikea.core.model.product.DisclaimerType.ENERGY_SHEET_URL
            if (r14 == r1) goto L_0x00a1
            com.ingka.ikea.core.model.product.DisclaimerType r1 = com.ingka.ikea.core.model.product.DisclaimerType.ENERGY_SHEET_DEEPLINK
            if (r14 != r1) goto L_0x009e
            goto L_0x00a1
        L_0x009e:
            r1 = r26
            goto L_0x007f
        L_0x00a1:
            r15.add(r7)
            goto L_0x009e
        L_0x00a5:
            java.util.ArrayList r1 = new java.util.ArrayList
            r7 = 10
            int r13 = YH.C16877v.y(r15, r7)
            r1.<init>(r13)
            java.util.Iterator r7 = r15.iterator()
        L_0x00b4:
            boolean r13 = r7.hasNext()
            if (r13 == 0) goto L_0x00d4
            java.lang.Object r13 = r7.next()
            com.ingka.ikea.core.remotemodel.product.DisclaimerRemote r13 = (com.ingka.ikea.core.remotemodel.product.DisclaimerRemote) r13
            com.ingka.ikea.core.remotemodel.LinkRemote r14 = r13.b()
            if (r14 == 0) goto L_0x00cf
            java.lang.String r13 = r13.c()
            com.ingka.ikea.core.model.Link r13 = r14.c(r13)
            goto L_0x00d0
        L_0x00cf:
            r13 = 0
        L_0x00d0:
            r1.add(r13)
            goto L_0x00b4
        L_0x00d4:
            java.lang.Object r1 = YH.C16877v.y0(r1)
            com.ingka.ikea.core.model.Link r1 = (com.ingka.ikea.core.model.Link) r1
            r14 = r1
            goto L_0x00dd
        L_0x00dc:
            r14 = 0
        L_0x00dd:
            java.util.List r1 = r26.b()
            if (r1 == 0) goto L_0x0107
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x00ee:
            boolean r13 = r1.hasNext()
            if (r13 == 0) goto L_0x0104
            java.lang.Object r13 = r1.next()
            com.ingka.ikea.core.remotemodel.product.AvailabilityRemote r13 = (com.ingka.ikea.core.remotemodel.product.AvailabilityRemote) r13
            op.b r13 = r13.h()
            if (r13 == 0) goto L_0x00ee
            r7.add(r13)
            goto L_0x00ee
        L_0x0104:
            r18 = r7
            goto L_0x0109
        L_0x0107:
            r18 = 0
        L_0x0109:
            com.ingka.ikea.core.remotemodel.product.HighlightRemote r1 = r26.o()
            if (r1 == 0) goto L_0x0116
            com.ingka.ikea.core.model.product.Highlight r1 = r1.a()
            r20 = r1
            goto L_0x0118
        L_0x0116:
            r20 = 0
        L_0x0118:
            java.util.List r1 = r26.n()
            if (r1 == 0) goto L_0x0146
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r7 = new java.util.ArrayList
            r13 = 10
            int r15 = YH.C16877v.y(r1, r13)
            r7.<init>(r15)
            java.util.Iterator r1 = r1.iterator()
        L_0x012f:
            boolean r13 = r1.hasNext()
            if (r13 == 0) goto L_0x0143
            java.lang.Object r13 = r1.next()
            com.ingka.ikea.core.remotemodel.product.DisclaimerRemote r13 = (com.ingka.ikea.core.remotemodel.product.DisclaimerRemote) r13
            com.ingka.ikea.core.model.product.Disclaimer r13 = r13.d()
            r7.add(r13)
            goto L_0x012f
        L_0x0143:
            r21 = r7
            goto L_0x0148
        L_0x0146:
            r21 = 0
        L_0x0148:
            java.util.List r1 = r26.k()
            if (r1 == 0) goto L_0x0176
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r7 = new java.util.ArrayList
            r13 = 10
            int r13 = YH.C16877v.y(r1, r13)
            r7.<init>(r13)
            java.util.Iterator r1 = r1.iterator()
        L_0x015f:
            boolean r13 = r1.hasNext()
            if (r13 == 0) goto L_0x0173
            java.lang.Object r13 = r1.next()
            com.ingka.ikea.core.remotemodel.product.DisclaimerRemote r13 = (com.ingka.ikea.core.remotemodel.product.DisclaimerRemote) r13
            com.ingka.ikea.core.model.product.Disclaimer r13 = r13.d()
            r7.add(r13)
            goto L_0x015f
        L_0x0173:
            r19 = r7
            goto L_0x0178
        L_0x0176:
            r19 = 0
        L_0x0178:
            com.ingka.ikea.core.remotemodel.product.DisclaimerRemote r1 = r26.f()
            if (r1 == 0) goto L_0x0185
            com.ingka.ikea.core.model.product.Disclaimer r1 = r1.d()
            r24 = r1
            goto L_0x0187
        L_0x0185:
            r24 = 0
        L_0x0187:
            java.util.List r1 = r26.n()
            if (r1 == 0) goto L_0x01b8
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0193:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x01ad
            java.lang.Object r7 = r1.next()
            r13 = r7
            com.ingka.ikea.core.remotemodel.product.DisclaimerRemote r13 = (com.ingka.ikea.core.remotemodel.product.DisclaimerRemote) r13
            com.ingka.ikea.core.model.product.Disclaimer r13 = r13.d()
            com.ingka.ikea.core.model.product.DisclaimerType r13 = r13.e()
            com.ingka.ikea.core.model.product.DisclaimerType r15 = com.ingka.ikea.core.model.product.DisclaimerType.COLOR_INFO
            if (r13 != r15) goto L_0x0193
            goto L_0x01ae
        L_0x01ad:
            r7 = 0
        L_0x01ae:
            com.ingka.ikea.core.remotemodel.product.DisclaimerRemote r7 = (com.ingka.ikea.core.remotemodel.product.DisclaimerRemote) r7
            if (r7 == 0) goto L_0x01b8
            java.lang.String r1 = r7.c()
            r13 = r1
            goto L_0x01b9
        L_0x01b8:
            r13 = 0
        L_0x01b9:
            java.util.List r1 = r26.n()
            if (r1 == 0) goto L_0x0236
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x01ca:
            boolean r15 = r1.hasNext()
            if (r15 == 0) goto L_0x01f0
            java.lang.Object r15 = r1.next()
            r22 = r15
            com.ingka.ikea.core.remotemodel.product.DisclaimerRemote r22 = (com.ingka.ikea.core.remotemodel.product.DisclaimerRemote) r22
            com.ingka.ikea.core.model.product.Disclaimer r22 = r22.d()
            r26 = r1
            com.ingka.ikea.core.model.product.DisclaimerType r1 = r22.e()
            r25 = r14
            com.ingka.ikea.core.model.product.DisclaimerType r14 = com.ingka.ikea.core.model.product.DisclaimerType.PRICE_DELIVERY
            if (r1 != r14) goto L_0x01eb
            r7.add(r15)
        L_0x01eb:
            r1 = r26
            r14 = r25
            goto L_0x01ca
        L_0x01f0:
            r25 = r14
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x01fb:
            boolean r14 = r7.hasNext()
            if (r14 == 0) goto L_0x0233
            java.lang.Object r14 = r7.next()
            com.ingka.ikea.core.remotemodel.product.DisclaimerRemote r14 = (com.ingka.ikea.core.remotemodel.product.DisclaimerRemote) r14
            com.ingka.ikea.core.remotemodel.LinkRemote r15 = r14.b()
            if (r15 == 0) goto L_0x0213
            java.lang.String r15 = r15.a()
            if (r15 != 0) goto L_0x0216
        L_0x0213:
            r26 = r7
            goto L_0x022a
        L_0x0216:
            java.lang.String r14 = r14.c()
            if (r14 == 0) goto L_0x0224
            r26 = r7
            com.ingka.ikea.core.model.product.DeliveryCalculationDisclaimer r7 = new com.ingka.ikea.core.model.product.DeliveryCalculationDisclaimer
            r7.<init>(r14, r14, r15)
            goto L_0x022b
        L_0x0224:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        L_0x022a:
            r7 = 0
        L_0x022b:
            if (r7 == 0) goto L_0x0230
            r1.add(r7)
        L_0x0230:
            r7 = r26
            goto L_0x01fb
        L_0x0233:
            r17 = r1
            goto L_0x023a
        L_0x0236:
            r25 = r14
            r17 = 0
        L_0x023a:
            rz.w r0 = new rz.w
            r1 = r0
            r22 = 8192(0x2000, float:1.14794E-41)
            r23 = 0
            r15 = 0
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r17
            r14 = r25
            r17 = r18
            r18 = r20
            r20 = r24
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r0
        L_0x0256:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        L_0x025c:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        L_0x0262:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        L_0x0268:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rz.C15030x.a(com.ingka.ikea.core.remotemodel.product.ProductLiteRemote):rz.w");
    }
}
