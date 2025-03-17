package zg;

import dI.C17164e;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import yg.C10476a;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J8\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lzg/b;", "Lzg/a;", "Lyg/a;", "feedbackEndpoint", "<init>", "(Lyg/a;)V", "", "id", "", "rating", "", "Lzg/c;", "answers", "storeId", "LXH/N;", "a", "(Ljava/lang/String;ILjava/util/List;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Lyg/a;", "inappfeedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: zg.b  reason: case insensitive filesystem */
public final class C10549b implements C10548a {

    /* renamed from: a  reason: collision with root package name */
    private final C10476a f78359a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.app.inappfeedback.data.provider.FeedbackRepositoryImpl", f = "FeedbackRepositoryImpl.kt", l = {22}, m = "sendSurvey")
    /* renamed from: zg.b$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f78360c;

        /* renamed from: d  reason: collision with root package name */
        Object f78361d;

        /* renamed from: e  reason: collision with root package name */
        Object f78362e;

        /* renamed from: f  reason: collision with root package name */
        Object f78363f;

        /* renamed from: g  reason: collision with root package name */
        Object f78364g;

        /* renamed from: h  reason: collision with root package name */
        Object f78365h;

        /* renamed from: i  reason: collision with root package name */
        Object f78366i;

        /* renamed from: j  reason: collision with root package name */
        Object f78367j;

        /* renamed from: k  reason: collision with root package name */
        Object f78368k;

        /* renamed from: l  reason: collision with root package name */
        Object f78369l;

        /* renamed from: m  reason: collision with root package name */
        Object f78370m;

        /* renamed from: n  reason: collision with root package name */
        Object f78371n;

        /* renamed from: o  reason: collision with root package name */
        Object f78372o;

        /* renamed from: p  reason: collision with root package name */
        Object f78373p;

        /* renamed from: q  reason: collision with root package name */
        Object f78374q;

        /* renamed from: r  reason: collision with root package name */
        int f78375r;

        /* renamed from: s  reason: collision with root package name */
        int f78376s;

        /* renamed from: t  reason: collision with root package name */
        int f78377t;

        /* renamed from: u  reason: collision with root package name */
        int f78378u;

        /* renamed from: v  reason: collision with root package name */
        int f78379v;

        /* renamed from: w  reason: collision with root package name */
        /* synthetic */ Object f78380w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ C10549b f78381x;

        /* renamed from: y  reason: collision with root package name */
        int f78382y;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C10549b bVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f78381x = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f78380w = obj;
            this.f78382y |= Integer.MIN_VALUE;
            return this.f78381x.a((String) null, 0, (List<C10550c>) null, (String) null, this);
        }
    }

    public C10549b(C10476a aVar) {
        C17542s.j(aVar, "feedbackEndpoint");
        this.f78359a = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r17, int r18, java.util.List<zg.C10550c> r19, java.lang.String r20, dI.C17164e<? super XH.C16807N> r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            boolean r6 = r5 instanceof zg.C10549b.a
            if (r6 == 0) goto L_0x001f
            r6 = r5
            zg.b$a r6 = (zg.C10549b.a) r6
            int r7 = r6.f78382y
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r7 & r8
            if (r9 == 0) goto L_0x001f
            int r7 = r7 - r8
            r6.f78382y = r7
            goto L_0x0024
        L_0x001f:
            zg.b$a r6 = new zg.b$a
            r6.<init>(r0, r5)
        L_0x0024:
            java.lang.Object r7 = r6.f78380w
            java.lang.Object r8 = eI.C17187b.f()
            int r9 = r6.f78382y
            r10 = 1
            if (r9 == 0) goto L_0x007a
            if (r9 != r10) goto L_0x0072
            java.lang.Object r1 = r6.f78374q
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r6.f78373p
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r6.f78372o
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r6.f78371n
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r6.f78370m
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r6.f78369l
            yg.a r1 = (yg.C10476a) r1
            java.lang.Object r1 = r6.f78368k
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r6.f78367j
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r1 = r6.f78366i
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r6.f78365h
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r6.f78364g
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r6.f78363f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r6.f78362e
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r6.f78361d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r6.f78360c
            zg.b r1 = (zg.C10549b) r1
            XH.y.b(r7)
            goto L_0x00eb
        L_0x0072:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x007a:
            XH.y.b(r7)
            yg.a r7 = r0.f78359a
            r9 = r3
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r11 = new java.util.ArrayList
            r12 = 10
            int r12 = YH.C16877v.y(r9, r12)
            r11.<init>(r12)
            java.util.Iterator r12 = r9.iterator()
        L_0x0091:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x00b3
            java.lang.Object r13 = r12.next()
            zg.c r13 = (zg.C10550c) r13
            com.ingka.ikea.app.inappfeedback.data.model.ApiRequestSurveyQuestion r14 = new com.ingka.ikea.app.inappfeedback.data.model.ApiRequestSurveyQuestion
            java.lang.String r15 = r13.b()
            java.lang.String r10 = r13.c()
            java.lang.String r13 = r13.a()
            r14.<init>(r15, r10, r13)
            r11.add(r14)
            r10 = 1
            goto L_0x0091
        L_0x00b3:
            com.ingka.ikea.app.inappfeedback.data.model.ApiRequestSurveyBody r10 = new com.ingka.ikea.app.inappfeedback.data.model.ApiRequestSurveyBody
            r10.<init>(r1, r2, r11, r4)
            r6.f78360c = r0
            r6.f78361d = r1
            r6.f78362e = r3
            r6.f78363f = r4
            r6.f78364g = r5
            r6.f78365h = r9
            r6.f78366i = r9
            r6.f78367j = r11
            r6.f78368k = r12
            r6.f78369l = r7
            r6.f78370m = r1
            r6.f78371n = r11
            r6.f78372o = r4
            r6.f78373p = r11
            r6.f78374q = r1
            r6.f78375r = r2
            r1 = 0
            r6.f78376s = r1
            r6.f78377t = r1
            r6.f78378u = r2
            r6.f78379v = r2
            r1 = 1
            r6.f78382y = r1
            java.lang.Object r7 = r7.a(r10, r6)
            if (r7 != r8) goto L_0x00eb
            return r8
        L_0x00eb:
            QL.x r7 = (QL.x) r7
            boolean r1 = r7.e()
            if (r1 == 0) goto L_0x00f6
            XH.N r1 = XH.C16807N.f139792a
            return r1
        L_0x00f6:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Unable to send survey"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zg.C10549b.a(java.lang.String, int, java.util.List, java.lang.String, dI.e):java.lang.Object");
    }
}
