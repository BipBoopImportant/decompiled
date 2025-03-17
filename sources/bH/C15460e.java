package BH;

import AH.C15411b;
import HJ.C15838d;
import QJ.C16283A;
import QJ.F0;
import dI.C17164e;
import dI.C17168i;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\b\u001a\u00020\u0007*\u00020\u00002\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0015\u0010\r\u001a\u00020\n*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"LBH/c;", "LXH/N;", "c", "(LBH/c;)V", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "fallbackCharset", "", "a", "(LBH/c;Ljava/nio/charset/Charset;LdI/e;)Ljava/lang/Object;", "LAH/b;", "d", "(LBH/c;)LAH/b;", "request", "ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: BH.e  reason: case insensitive filesystem */
public final class C15460e {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "io.ktor.client.statement.HttpResponseKt", f = "HttpResponse.kt", l = {97}, m = "bodyAsText")
    /* renamed from: BH.e$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f133242c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f133243d;

        /* renamed from: e  reason: collision with root package name */
        int f133244e;

        a(C17164e<? super a> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f133243d = obj;
            this.f133244e |= Integer.MIN_VALUE;
            return C15460e.a((C15458c) null, (Charset) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(BH.C15458c r5, java.nio.charset.Charset r6, dI.C17164e<? super java.lang.String> r7) {
        /*
            boolean r0 = r7 instanceof BH.C15460e.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            BH.e$a r0 = (BH.C15460e.a) r0
            int r1 = r0.f133244e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f133244e = r1
            goto L_0x0018
        L_0x0013:
            BH.e$a r0 = new BH.e$a
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.f133243d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f133244e
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.f133242c
            java.nio.charset.CharsetDecoder r5 = (java.nio.charset.CharsetDecoder) r5
            XH.y.b(r7)
            goto L_0x0066
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            XH.y.b(r7)
            java.nio.charset.Charset r7 = EH.C15635t.a(r5)
            if (r7 != 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r6 = r7
        L_0x0040:
            java.nio.charset.CharsetDecoder r6 = r6.newDecoder()
            qH.b r5 = r5.h0()
            java.lang.Class<RH.k> r7 = RH.k.class
            uI.q r2 = kotlin.jvm.internal.P.l(r7)
            java.lang.reflect.Type r4 = uI.C18075x.f(r2)
            uI.d r7 = kotlin.jvm.internal.P.b(r7)
            OH.a r7 = OH.b.c(r4, r7, r2)
            r0.f133242c = r6
            r0.f133244e = r3
            java.lang.Object r7 = r5.a(r7, r0)
            if (r7 != r1) goto L_0x0065
            return r1
        L_0x0065:
            r5 = r6
        L_0x0066:
            if (r7 == 0) goto L_0x0077
            RH.k r7 = (RH.k) r7
            java.lang.String r6 = "decoder"
            kotlin.jvm.internal.C17542s.i(r5, r6)
            r6 = 2
            r0 = 0
            r1 = 0
            java.lang.String r5 = QH.C16247b.b(r5, r7, r1, r6, r0)
            return r5
        L_0x0077:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "null cannot be cast to non-null type io.ktor.utils.io.core.ByteReadPacket"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: BH.C15460e.a(BH.c, java.nio.charset.Charset, dI.e):java.lang.Object");
    }

    public static /* synthetic */ Object b(C15458c cVar, Charset charset, C17164e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = C15838d.f135279b;
        }
        return a(cVar, charset, eVar);
    }

    public static final void c(C15458c cVar) {
        C17542s.j(cVar, "<this>");
        C17168i.b bVar = cVar.getCoroutineContext().get(F0.f137562d0);
        C17542s.g(bVar);
        ((C16283A) bVar).l();
    }

    public static final C15411b d(C15458c cVar) {
        C17542s.j(cVar, "<this>");
        return cVar.h0().e();
    }
}
