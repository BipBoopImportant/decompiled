package lz;

import GK.C15777E;
import QL.x;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ApiErrorDataModel;
import hp.C11377c;
import iz.C14587a;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Llz/h;", "", "<init>", "()V", "T", "LQL/x;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ApiErrorDataModel;", "c", "(LQL/x;)Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ApiErrorDataModel;", "Liz/a;", "errorMapper", "response", "b", "(Liz/a;LQL/x;)Ljava/lang/Object;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f129233a = new h();

    private h() {
    }

    /* access modifiers changed from: private */
    public final <T> T b(C14587a aVar, x<T> xVar) {
        String l10;
        String str = "Could not determine response error";
        if (!xVar.e()) {
            ApiErrorDataModel c10 = c(xVar);
            if (c10 == null) {
                try {
                    C15777E d10 = xVar.d();
                    if (!(d10 == null || (l10 = d10.l()) == null)) {
                        str = l10;
                    }
                } catch (IOException unused) {
                }
                throw new C11377c(C11377c.a.RESPONSE, str);
            }
            throw aVar.a(c10);
        }
        T a10 = xVar.a();
        C17542s.g(a10);
        return a10;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e0 A[SYNTHETIC, Splitter:B:36:0x00e0] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <T> com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ApiErrorDataModel c(QL.x<T> r22) {
        /*
            r21 = this;
            java.lang.String r1 = "|"
            java.lang.String r2 = "b"
            java.lang.String r3 = "m"
            java.lang.String r4 = "main"
            java.lang.String r5 = "Kt"
            java.lang.String r6 = "Exception when parsing errorBody"
            r9 = 36
            r10 = 2
            r11 = 0
            GK.E r0 = r22.d()     // Catch:{ Exception -> 0x0031 }
            if (r0 == 0) goto L_0x00db
            java.lang.String r0 = r0.l()     // Catch:{ Exception -> 0x0031 }
            if (r0 == 0) goto L_0x00db
            Yz.b r12 = Yz.b.f118278a     // Catch:{ Exception -> 0x0031 }
            kK.c r12 = r12.b()     // Catch:{ Exception -> 0x0031 }
            r12.a()     // Catch:{ Exception -> 0x0031 }
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ApiErrorDataModel$a r13 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ApiErrorDataModel.Companion     // Catch:{ Exception -> 0x0031 }
            kotlinx.serialization.KSerializer r13 = r13.serializer()     // Catch:{ Exception -> 0x0031 }
            java.lang.Object r0 = r12.c(r13, r0)     // Catch:{ Exception -> 0x0031 }
            goto L_0x00dc
        L_0x0031:
            r0 = move-exception
            qv.e r15 = qv.e.DEBUG
            qv.d r12 = qv.d.f102012a
            java.util.List r12 = r12.a()
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r12 = r12.iterator()
        L_0x0045:
            boolean r14 = r12.hasNext()
            r7 = 0
            if (r14 == 0) goto L_0x005d
            java.lang.Object r14 = r12.next()
            r8 = r14
            qv.b r8 = (qv.C11819b) r8
            boolean r7 = r8.b(r15, r7)
            if (r7 == 0) goto L_0x0045
            r13.add(r14)
            goto L_0x0045
        L_0x005d:
            java.util.Iterator r8 = r13.iterator()
            r12 = r11
            r13 = r12
        L_0x0063:
            boolean r14 = r8.hasNext()
            if (r14 == 0) goto L_0x00db
            java.lang.Object r14 = r8.next()
            qv.b r14 = (qv.C11819b) r14
            if (r12 != 0) goto L_0x007d
            java.lang.String r12 = qv.C11818a.a(r6, r0)
            if (r12 != 0) goto L_0x0079
            goto L_0x00db
        L_0x0079:
            java.lang.String r12 = qv.C11820c.a(r12)
        L_0x007d:
            r18 = r12
            if (r13 != 0) goto L_0x00c5
            java.lang.Class r12 = r22.getClass()
            java.lang.String r12 = r12.getName()
            kotlin.jvm.internal.C17542s.g(r12)
            java.lang.String r13 = HJ.C15854t.s1(r12, r9, r11, r10, r11)
            r9 = 46
            java.lang.String r13 = HJ.C15854t.o1(r13, r9, r11, r10, r11)
            int r9 = r13.length()
            if (r9 != 0) goto L_0x009d
            goto L_0x00a1
        L_0x009d:
            java.lang.String r12 = HJ.C15854t.P0(r13, r5)
        L_0x00a1:
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            java.lang.String r9 = r9.getName()
            r13 = 1
            boolean r9 = HJ.C15854t.b0(r9, r4, r13)
            if (r9 == 0) goto L_0x00b2
            r9 = r3
            goto L_0x00b3
        L_0x00b2:
            r9 = r2
        L_0x00b3:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r9)
            r13.append(r1)
            r13.append(r12)
            java.lang.String r13 = r13.toString()
        L_0x00c5:
            r9 = r13
            r12 = r14
            r13 = r15
            r14 = r9
            r20 = r15
            r15 = r7
            r16 = r0
            r17 = r18
            r12.a(r13, r14, r15, r16, r17)
            r13 = r9
            r12 = r18
            r15 = r20
            r9 = 36
            goto L_0x0063
        L_0x00db:
            r0 = r11
        L_0x00dc:
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ApiErrorDataModel r0 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ApiErrorDataModel) r0
            if (r0 != 0) goto L_0x01b6
            GK.E r0 = r22.d()     // Catch:{ Exception -> 0x0101 }
            if (r0 == 0) goto L_0x0103
            java.lang.String r0 = r0.l()     // Catch:{ Exception -> 0x0101 }
            if (r0 == 0) goto L_0x0103
            Yz.b r7 = Yz.b.f118278a     // Catch:{ Exception -> 0x0101 }
            kK.c r7 = r7.b()     // Catch:{ Exception -> 0x0101 }
            r7.a()     // Catch:{ Exception -> 0x0101 }
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ApiErrorDataModelEnhanced$a r8 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ApiErrorDataModelEnhanced.Companion     // Catch:{ Exception -> 0x0101 }
            kotlinx.serialization.KSerializer r8 = r8.serializer()     // Catch:{ Exception -> 0x0101 }
            java.lang.Object r0 = r7.c(r8, r0)     // Catch:{ Exception -> 0x0101 }
            goto L_0x01b6
        L_0x0101:
            r0 = move-exception
            goto L_0x0106
        L_0x0103:
            r0 = r11
            goto L_0x01b6
        L_0x0106:
            qv.e r7 = qv.e.DEBUG
            qv.d r8 = qv.d.f102012a
            java.util.List r8 = r8.a()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x0119:
            boolean r12 = r8.hasNext()
            r15 = 0
            if (r12 == 0) goto L_0x0131
            java.lang.Object r12 = r8.next()
            r13 = r12
            qv.b r13 = (qv.C11819b) r13
            boolean r13 = r13.b(r7, r15)
            if (r13 == 0) goto L_0x0119
            r9.add(r12)
            goto L_0x0119
        L_0x0131:
            java.util.Iterator r8 = r9.iterator()
            r9 = r11
            r12 = r9
        L_0x0137:
            boolean r13 = r8.hasNext()
            if (r13 == 0) goto L_0x0103
            java.lang.Object r13 = r8.next()
            qv.b r13 = (qv.C11819b) r13
            if (r9 != 0) goto L_0x0150
            java.lang.String r9 = qv.C11818a.a(r6, r0)
            if (r9 != 0) goto L_0x014c
            goto L_0x0103
        L_0x014c:
            java.lang.String r9 = qv.C11820c.a(r9)
        L_0x0150:
            if (r12 != 0) goto L_0x019d
            java.lang.Class r12 = r22.getClass()
            java.lang.String r12 = r12.getName()
            kotlin.jvm.internal.C17542s.g(r12)
            r14 = 36
            java.lang.String r15 = HJ.C15854t.s1(r12, r14, r11, r10, r11)
            r18 = r2
            r2 = 46
            java.lang.String r15 = HJ.C15854t.o1(r15, r2, r11, r10, r11)
            int r17 = r15.length()
            if (r17 != 0) goto L_0x0172
            goto L_0x0176
        L_0x0172:
            java.lang.String r12 = HJ.C15854t.P0(r15, r5)
        L_0x0176:
            java.lang.Thread r15 = java.lang.Thread.currentThread()
            java.lang.String r15 = r15.getName()
            r2 = 1
            boolean r15 = HJ.C15854t.b0(r15, r4, r2)
            if (r15 == 0) goto L_0x0187
            r15 = r3
            goto L_0x0189
        L_0x0187:
            r15 = r18
        L_0x0189:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r15)
            r2.append(r1)
            r2.append(r12)
            java.lang.String r12 = r2.toString()
        L_0x019b:
            r2 = r12
            goto L_0x01a2
        L_0x019d:
            r18 = r2
            r14 = 36
            goto L_0x019b
        L_0x01a2:
            r12 = r13
            r13 = r7
            r19 = r14
            r14 = r2
            r20 = 0
            r15 = r20
            r16 = r0
            r17 = r9
            r12.a(r13, r14, r15, r16, r17)
            r12 = r2
            r2 = r18
            goto L_0x0137
        L_0x01b6:
            boolean r1 = r0 instanceof com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ApiErrorDataModelEnhanced
            if (r1 == 0) goto L_0x01d8
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ApiErrorDataModelEnhanced r0 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ApiErrorDataModelEnhanced) r0
            java.lang.String r1 = r0.d()
            java.util.List r2 = r0.c()
            if (r2 == 0) goto L_0x01cd
            java.lang.Object r2 = YH.C16877v.y0(r2)
            r11 = r2
            java.lang.String r11 = (java.lang.String) r11
        L_0x01cd:
            int r0 = r0.b()
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ApiErrorDataModel r2 = new com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ApiErrorDataModel
            r2.<init>(r0, r1, r11)
            r11 = r2
            goto L_0x01df
        L_0x01d8:
            boolean r1 = r0 instanceof com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ApiErrorDataModel
            if (r1 == 0) goto L_0x01df
            r11 = r0
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ApiErrorDataModel r11 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ApiErrorDataModel) r11
        L_0x01df:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: lz.h.c(QL.x):com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ApiErrorDataModel");
    }
}
