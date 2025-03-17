package u6;

import QJ.C16310i;
import QJ.C16311i0;
import QJ.M;
import QJ.Q;
import XH.C16807N;
import XH.x;
import XH.y;
import com.afterpay.android.Afterpay;
import com.afterpay.android.cashapp.AfterpayCashAppSigningResponse;
import com.afterpay.android.cashapp.AfterpayCashAppValidationRequest;
import com.afterpay.android.cashapp.AfterpayCashAppValidationResponse;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import fK.z;
import java.net.URL;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17546w;
import kotlin.jvm.internal.P;
import mK.C17611d;
import nI.C17642l;
import nI.p;
import t6.C8833b;
import u6.C8883d;
import uI.C18068q;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH@ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ9\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u0014\u0010\u0015\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lu6/b;", "", "<init>", "()V", "", "token", "LXH/x;", "Lcom/afterpay/android/cashapp/AfterpayCashAppSigningResponse;", "c", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lu6/c;", "LXH/N;", "complete", "b", "(Ljava/lang/String;LnI/l;LdI/e;)Ljava/lang/Object;", "jwt", "customerId", "grantId", "Lu6/d;", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LnI/l;)V", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: u6.b  reason: case insensitive filesystem */
public final class C8881b {

    /* renamed from: a  reason: collision with root package name */
    public static final C8881b f56850a = new C8881b();

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @f(c = "com.afterpay.android.cashapp.AfterpayCashAppCheckout", f = "AfterpayCashAppCheckout.kt", l = {23}, m = "performSignPaymentRequest")
    /* renamed from: u6.b$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f56851c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f56852d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C8881b f56853e;

        /* renamed from: f  reason: collision with root package name */
        int f56854f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C8881b bVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f56853e = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f56852d = obj;
            this.f56854f |= Integer.MIN_VALUE;
            return this.f56853e.b((String) null, (C17642l<? super C8882c, C16807N>) null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @f(c = "com.afterpay.android.cashapp.AfterpayCashAppCheckout", f = "AfterpayCashAppCheckout.kt", l = {52}, m = "signPayment-gIAlu-s")
    /* renamed from: u6.b$b  reason: collision with other inner class name */
    static final class C0913b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f56855c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C8881b f56856d;

        /* renamed from: e  reason: collision with root package name */
        int f56857e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0913b(C8881b bVar, C17164e<? super C0913b> eVar) {
            super(eVar);
            this.f56856d = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f56855c = obj;
            this.f56857e |= Integer.MIN_VALUE;
            Object a10 = this.f56856d.c((String) null, this);
            return a10 == C17187b.f() ? a10 : x.a(a10);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQJ/Q;", "LXH/x;", "Lcom/afterpay/android/cashapp/AfterpayCashAppSigningResponse;", "<anonymous>", "(LQJ/Q;)LXH/x;"}, k = 3, mv = {1, 7, 1})
    @f(c = "com.afterpay.android.cashapp.AfterpayCashAppCheckout$signPayment$2$response$1", f = "AfterpayCashAppCheckout.kt", l = {}, m = "invokeSuspend")
    /* renamed from: u6.b$c */
    static final class c extends l implements p<Q, C17164e<? super x<? extends AfterpayCashAppSigningResponse>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f56858c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ URL f56859d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f56860e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(URL url, String str, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f56859d = url;
            this.f56860e = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f56859d, this.f56860e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super x<AfterpayCashAppSigningResponse>> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ad, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            jI.C17416c.a(r0, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b1, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d4, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
            jI.C17416c.a(r2, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d8, code lost:
            throw r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                eI.C17187b.f()
                int r0 = r6.f56858c
                if (r0 != 0) goto L_0x00e8
                XH.y.b(r7)
                com.afterpay.android.cashapp.AfterpayCashAppApi r7 = com.afterpay.android.cashapp.AfterpayCashAppApi.f45960a
                java.net.URL r0 = r6.f56859d
                com.afterpay.android.cashapp.AfterpayCashAppApi$a r1 = com.afterpay.android.cashapp.AfterpayCashAppApi.a.POST
                java.lang.String r2 = r6.f56860e
                java.net.URLConnection r0 = r0.openConnection()
                java.lang.Object r0 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r0)
                java.net.URLConnection r0 = (java.net.URLConnection) r0
                java.lang.String r3 = "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection"
                kotlin.jvm.internal.C17542s.h(r0, r3)
                javax.net.ssl.HttpsURLConnection r0 = (javax.net.ssl.HttpsURLConnection) r0
                r7.c(r0, r1)     // Catch:{ Exception -> 0x004a }
                r7 = 0
                if (r2 == 0) goto L_0x002b
                r1 = r2
                goto L_0x002c
            L_0x002b:
                r1 = r7
            L_0x002c:
                java.lang.String r3 = "kotlinx.serialization.serializer.withModule"
                if (r1 != 0) goto L_0x004d
                kK.c r1 = com.afterpay.android.cashapp.AfterpayCashAppApi.f45961b     // Catch:{ Exception -> 0x004a }
                mK.d r4 = r1.a()     // Catch:{ Exception -> 0x004a }
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                uI.q r5 = kotlin.jvm.internal.P.l(r5)     // Catch:{ Exception -> 0x004a }
                kotlin.jvm.internal.C17546w.a(r3)     // Catch:{ Exception -> 0x004a }
                kotlinx.serialization.KSerializer r4 = fK.z.d(r4, r5)     // Catch:{ Exception -> 0x004a }
                java.lang.String r1 = r1.b(r4, r2)     // Catch:{ Exception -> 0x004a }
                goto L_0x004d
            L_0x004a:
                r7 = move-exception
                goto L_0x00d9
            L_0x004d:
                java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x004a }
                java.io.OutputStream r4 = r0.getOutputStream()     // Catch:{ Exception -> 0x004a }
                r2.<init>(r4)     // Catch:{ Exception -> 0x004a }
                r2.write(r1)     // Catch:{ all -> 0x00d2 }
                r2.flush()     // Catch:{ all -> 0x00d2 }
                XH.N r1 = XH.C16807N.f139792a     // Catch:{ all -> 0x00d2 }
                jI.C17416c.a(r2, r7)     // Catch:{ Exception -> 0x004a }
                java.io.InputStream r1 = r0.getErrorStream()     // Catch:{ Exception -> 0x004a }
                if (r1 != 0) goto L_0x00b2
                int r1 = r0.getResponseCode()     // Catch:{ Exception -> 0x004a }
                r2 = 400(0x190, float:5.6E-43)
                if (r1 >= r2) goto L_0x00b2
                java.io.InputStream r0 = r0.getInputStream()     // Catch:{ Exception -> 0x004a }
                java.lang.String r1 = "connection.inputStream"
                kotlin.jvm.internal.C17542s.i(r0, r1)     // Catch:{ Exception -> 0x004a }
                java.nio.charset.Charset r1 = HJ.C15838d.f135279b     // Catch:{ Exception -> 0x004a }
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x004a }
                r2.<init>(r0, r1)     // Catch:{ Exception -> 0x004a }
                java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ Exception -> 0x004a }
                r1 = 8192(0x2000, float:1.14794E-41)
                r0.<init>(r2, r1)     // Catch:{ Exception -> 0x004a }
                java.lang.String r1 = jI.C17431r.h(r0)     // Catch:{ all -> 0x00ab }
                kK.c r2 = com.afterpay.android.cashapp.AfterpayCashAppApi.f45961b     // Catch:{ all -> 0x00ab }
                mK.d r4 = r2.a()     // Catch:{ all -> 0x00ab }
                java.lang.Class<com.afterpay.android.cashapp.AfterpayCashAppSigningResponse> r5 = com.afterpay.android.cashapp.AfterpayCashAppSigningResponse.class
                uI.q r5 = kotlin.jvm.internal.P.l(r5)     // Catch:{ all -> 0x00ab }
                kotlin.jvm.internal.C17546w.a(r3)     // Catch:{ all -> 0x00ab }
                kotlinx.serialization.KSerializer r3 = fK.z.d(r4, r5)     // Catch:{ all -> 0x00ab }
                java.lang.Object r1 = r2.c(r3, r1)     // Catch:{ all -> 0x00ab }
                java.lang.Object r1 = XH.x.b(r1)     // Catch:{ all -> 0x00ab }
                jI.C17416c.a(r0, r7)     // Catch:{ Exception -> 0x004a }
                goto L_0x00e3
            L_0x00ab:
                r7 = move-exception
                throw r7     // Catch:{ all -> 0x00ad }
            L_0x00ad:
                r1 = move-exception
                jI.C17416c.a(r0, r7)     // Catch:{ Exception -> 0x004a }
                throw r1     // Catch:{ Exception -> 0x004a }
            L_0x00b2:
                java.io.InvalidObjectException r7 = new java.io.InvalidObjectException     // Catch:{ Exception -> 0x004a }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004a }
                r1.<init>()     // Catch:{ Exception -> 0x004a }
                java.lang.String r2 = "Unexpected response code: "
                r1.append(r2)     // Catch:{ Exception -> 0x004a }
                int r0 = r0.getResponseCode()     // Catch:{ Exception -> 0x004a }
                r1.append(r0)     // Catch:{ Exception -> 0x004a }
                r0 = 46
                r1.append(r0)     // Catch:{ Exception -> 0x004a }
                java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x004a }
                r7.<init>(r0)     // Catch:{ Exception -> 0x004a }
                throw r7     // Catch:{ Exception -> 0x004a }
            L_0x00d2:
                r7 = move-exception
                throw r7     // Catch:{ all -> 0x00d4 }
            L_0x00d4:
                r0 = move-exception
                jI.C17416c.a(r2, r7)     // Catch:{ Exception -> 0x004a }
                throw r0     // Catch:{ Exception -> 0x004a }
            L_0x00d9:
                XH.x$a r0 = XH.x.f139812b
                java.lang.Object r7 = XH.y.a(r7)
                java.lang.Object r1 = XH.x.b(r7)
            L_0x00e3:
                XH.x r7 = XH.x.a(r1)
                return r7
            L_0x00e8:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: u6.C8881b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 7, 1})
    @f(c = "com.afterpay.android.cashapp.AfterpayCashAppCheckout$validatePayment$1", f = "AfterpayCashAppCheckout.kt", l = {80}, m = "invokeSuspend")
    /* renamed from: u6.b$d */
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f56861c;

        /* renamed from: d  reason: collision with root package name */
        int f56862d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f56863e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f56864f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f56865g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17642l<C8883d, C16807N> f56866h;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQJ/Q;", "LXH/x;", "Lcom/afterpay/android/cashapp/AfterpayCashAppValidationResponse;", "<anonymous>", "(LQJ/Q;)LXH/x;"}, k = 3, mv = {1, 7, 1})
        @f(c = "com.afterpay.android.cashapp.AfterpayCashAppCheckout$validatePayment$1$1$response$1", f = "AfterpayCashAppCheckout.kt", l = {}, m = "invokeSuspend")
        /* renamed from: u6.b$d$a */
        static final class a extends l implements p<Q, C17164e<? super x<? extends AfterpayCashAppValidationResponse>>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f56867c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ URL f56868d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ String f56869e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(URL url, String str, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f56868d = url;
                this.f56869e = str;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f56868d, this.f56869e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super x<AfterpayCashAppValidationResponse>> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ad, code lost:
                r1 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
                jI.C17416c.a(r0, r7);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b1, code lost:
                throw r1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d4, code lost:
                r0 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
                jI.C17416c.a(r2, r7);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d8, code lost:
                throw r0;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    eI.C17187b.f()
                    int r0 = r6.f56867c
                    if (r0 != 0) goto L_0x00e8
                    XH.y.b(r7)
                    com.afterpay.android.cashapp.AfterpayCashAppApi r7 = com.afterpay.android.cashapp.AfterpayCashAppApi.f45960a
                    java.net.URL r0 = r6.f56868d
                    com.afterpay.android.cashapp.AfterpayCashAppApi$a r1 = com.afterpay.android.cashapp.AfterpayCashAppApi.a.POST
                    java.lang.String r2 = r6.f56869e
                    java.net.URLConnection r0 = r0.openConnection()
                    java.lang.Object r0 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r0)
                    java.net.URLConnection r0 = (java.net.URLConnection) r0
                    java.lang.String r3 = "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection"
                    kotlin.jvm.internal.C17542s.h(r0, r3)
                    javax.net.ssl.HttpsURLConnection r0 = (javax.net.ssl.HttpsURLConnection) r0
                    r7.c(r0, r1)     // Catch:{ Exception -> 0x004a }
                    r7 = 0
                    if (r2 == 0) goto L_0x002b
                    r1 = r2
                    goto L_0x002c
                L_0x002b:
                    r1 = r7
                L_0x002c:
                    java.lang.String r3 = "kotlinx.serialization.serializer.withModule"
                    if (r1 != 0) goto L_0x004d
                    kK.c r1 = com.afterpay.android.cashapp.AfterpayCashAppApi.f45961b     // Catch:{ Exception -> 0x004a }
                    mK.d r4 = r1.a()     // Catch:{ Exception -> 0x004a }
                    java.lang.Class<java.lang.String> r5 = java.lang.String.class
                    uI.q r5 = kotlin.jvm.internal.P.l(r5)     // Catch:{ Exception -> 0x004a }
                    kotlin.jvm.internal.C17546w.a(r3)     // Catch:{ Exception -> 0x004a }
                    kotlinx.serialization.KSerializer r4 = fK.z.d(r4, r5)     // Catch:{ Exception -> 0x004a }
                    java.lang.String r1 = r1.b(r4, r2)     // Catch:{ Exception -> 0x004a }
                    goto L_0x004d
                L_0x004a:
                    r7 = move-exception
                    goto L_0x00d9
                L_0x004d:
                    java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x004a }
                    java.io.OutputStream r4 = r0.getOutputStream()     // Catch:{ Exception -> 0x004a }
                    r2.<init>(r4)     // Catch:{ Exception -> 0x004a }
                    r2.write(r1)     // Catch:{ all -> 0x00d2 }
                    r2.flush()     // Catch:{ all -> 0x00d2 }
                    XH.N r1 = XH.C16807N.f139792a     // Catch:{ all -> 0x00d2 }
                    jI.C17416c.a(r2, r7)     // Catch:{ Exception -> 0x004a }
                    java.io.InputStream r1 = r0.getErrorStream()     // Catch:{ Exception -> 0x004a }
                    if (r1 != 0) goto L_0x00b2
                    int r1 = r0.getResponseCode()     // Catch:{ Exception -> 0x004a }
                    r2 = 400(0x190, float:5.6E-43)
                    if (r1 >= r2) goto L_0x00b2
                    java.io.InputStream r0 = r0.getInputStream()     // Catch:{ Exception -> 0x004a }
                    java.lang.String r1 = "connection.inputStream"
                    kotlin.jvm.internal.C17542s.i(r0, r1)     // Catch:{ Exception -> 0x004a }
                    java.nio.charset.Charset r1 = HJ.C15838d.f135279b     // Catch:{ Exception -> 0x004a }
                    java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x004a }
                    r2.<init>(r0, r1)     // Catch:{ Exception -> 0x004a }
                    java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ Exception -> 0x004a }
                    r1 = 8192(0x2000, float:1.14794E-41)
                    r0.<init>(r2, r1)     // Catch:{ Exception -> 0x004a }
                    java.lang.String r1 = jI.C17431r.h(r0)     // Catch:{ all -> 0x00ab }
                    kK.c r2 = com.afterpay.android.cashapp.AfterpayCashAppApi.f45961b     // Catch:{ all -> 0x00ab }
                    mK.d r4 = r2.a()     // Catch:{ all -> 0x00ab }
                    java.lang.Class<com.afterpay.android.cashapp.AfterpayCashAppValidationResponse> r5 = com.afterpay.android.cashapp.AfterpayCashAppValidationResponse.class
                    uI.q r5 = kotlin.jvm.internal.P.l(r5)     // Catch:{ all -> 0x00ab }
                    kotlin.jvm.internal.C17546w.a(r3)     // Catch:{ all -> 0x00ab }
                    kotlinx.serialization.KSerializer r3 = fK.z.d(r4, r5)     // Catch:{ all -> 0x00ab }
                    java.lang.Object r1 = r2.c(r3, r1)     // Catch:{ all -> 0x00ab }
                    java.lang.Object r1 = XH.x.b(r1)     // Catch:{ all -> 0x00ab }
                    jI.C17416c.a(r0, r7)     // Catch:{ Exception -> 0x004a }
                    goto L_0x00e3
                L_0x00ab:
                    r7 = move-exception
                    throw r7     // Catch:{ all -> 0x00ad }
                L_0x00ad:
                    r1 = move-exception
                    jI.C17416c.a(r0, r7)     // Catch:{ Exception -> 0x004a }
                    throw r1     // Catch:{ Exception -> 0x004a }
                L_0x00b2:
                    java.io.InvalidObjectException r7 = new java.io.InvalidObjectException     // Catch:{ Exception -> 0x004a }
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004a }
                    r1.<init>()     // Catch:{ Exception -> 0x004a }
                    java.lang.String r2 = "Unexpected response code: "
                    r1.append(r2)     // Catch:{ Exception -> 0x004a }
                    int r0 = r0.getResponseCode()     // Catch:{ Exception -> 0x004a }
                    r1.append(r0)     // Catch:{ Exception -> 0x004a }
                    r0 = 46
                    r1.append(r0)     // Catch:{ Exception -> 0x004a }
                    java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x004a }
                    r7.<init>(r0)     // Catch:{ Exception -> 0x004a }
                    throw r7     // Catch:{ Exception -> 0x004a }
                L_0x00d2:
                    r7 = move-exception
                    throw r7     // Catch:{ all -> 0x00d4 }
                L_0x00d4:
                    r0 = move-exception
                    jI.C17416c.a(r2, r7)     // Catch:{ Exception -> 0x004a }
                    throw r0     // Catch:{ Exception -> 0x004a }
                L_0x00d9:
                    XH.x$a r0 = XH.x.f139812b
                    java.lang.Object r7 = XH.y.a(r7)
                    java.lang.Object r1 = XH.x.b(r7)
                L_0x00e3:
                    XH.x r7 = XH.x.a(r1)
                    return r7
                L_0x00e8:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                */
                throw new UnsupportedOperationException("Method not decompiled: u6.C8881b.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(String str, String str2, String str3, C17642l<? super C8883d, C16807N> lVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f56863e = str;
            this.f56864f = str2;
            this.f56865g = str3;
            this.f56866h = lVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f56863e, this.f56864f, this.f56865g, this.f56866h, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17642l<C8883d, C16807N> lVar;
            URL j10;
            Object f10 = C17187b.f();
            int i10 = this.f56862d;
            if (i10 == 0) {
                y.b(obj);
                C8833b f11 = Afterpay.f45951a.f();
                if (f11 == null || (j10 = f11.j()) == null) {
                    return null;
                }
                String str = this.f56863e;
                String str2 = this.f56864f;
                String str3 = this.f56865g;
                C17642l<C8883d, C16807N> lVar2 = this.f56866h;
                AfterpayCashAppValidationRequest afterpayCashAppValidationRequest = new AfterpayCashAppValidationRequest(str, str2, str3);
                C17514c.a aVar = C17514c.f144280d;
                C17611d a10 = aVar.a();
                C18068q l10 = P.l(AfterpayCashAppValidationRequest.class);
                C17546w.a("kotlinx.serialization.serializer.withModule");
                String b10 = aVar.b(z.d(a10, l10), afterpayCashAppValidationRequest);
                M b11 = C16311i0.b();
                a aVar2 = new a(j10, b10, (C17164e<? super a>) null);
                this.f56861c = lVar2;
                this.f56862d = 1;
                obj = C16310i.g(b11, aVar2, this);
                if (obj == f10) {
                    return f10;
                }
                lVar = lVar2;
            } else if (i10 == 1) {
                lVar = (C17642l) this.f56861c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object j11 = ((x) obj).j();
            if (x.h(j11)) {
                AfterpayCashAppValidationResponse afterpayCashAppValidationResponse = (AfterpayCashAppValidationResponse) j11;
                if (C17542s.e(afterpayCashAppValidationResponse.a(), "SUCCESS")) {
                    lVar.invoke(new C8883d.b(afterpayCashAppValidationResponse));
                } else {
                    lVar.invoke(new C8883d.a(new Exception("status is " + afterpayCashAppValidationResponse.a())));
                }
            }
            Throwable e10 = x.e(j11);
            if (e10 != null) {
                lVar.invoke(new C8883d.a(new Exception(e10.getMessage())));
            }
            return C16807N.f139792a;
        }
    }

    private C8881b() {
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(java.lang.String r7, dI.C17164e<? super XH.x<com.afterpay.android.cashapp.AfterpayCashAppSigningResponse>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof u6.C8881b.C0913b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            u6.b$b r0 = (u6.C8881b.C0913b) r0
            int r1 = r0.f56857e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f56857e = r1
            goto L_0x0018
        L_0x0013:
            u6.b$b r0 = new u6.b$b
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f56855c
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f56857e
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            XH.y.b(r8)     // Catch:{ all -> 0x0029 }
            goto L_0x006f
        L_0x0029:
            r7 = move-exception
            goto L_0x0087
        L_0x002b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0033:
            XH.y.b(r8)
            XH.x$a r8 = XH.x.f139812b     // Catch:{ all -> 0x0029 }
            com.afterpay.android.Afterpay r8 = com.afterpay.android.Afterpay.f45951a     // Catch:{ all -> 0x0029 }
            t6.b r8 = r8.f()     // Catch:{ all -> 0x0029 }
            if (r8 == 0) goto L_0x007f
            java.net.URL r8 = r8.b()     // Catch:{ all -> 0x0029 }
            if (r8 == 0) goto L_0x007f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0029 }
            r2.<init>()     // Catch:{ all -> 0x0029 }
            java.lang.String r4 = "{ \"token\": \""
            r2.append(r4)     // Catch:{ all -> 0x0029 }
            r2.append(r7)     // Catch:{ all -> 0x0029 }
            java.lang.String r7 = "\" }"
            r2.append(r7)     // Catch:{ all -> 0x0029 }
            java.lang.String r7 = r2.toString()     // Catch:{ all -> 0x0029 }
            QJ.M r2 = QJ.C16311i0.b()     // Catch:{ all -> 0x0029 }
            u6.b$c r4 = new u6.b$c     // Catch:{ all -> 0x0029 }
            r5 = 0
            r4.<init>(r8, r7, r5)     // Catch:{ all -> 0x0029 }
            r0.f56857e = r3     // Catch:{ all -> 0x0029 }
            java.lang.Object r8 = QJ.C16310i.g(r2, r4, r0)     // Catch:{ all -> 0x0029 }
            if (r8 != r1) goto L_0x006f
            return r1
        L_0x006f:
            XH.x r8 = (XH.x) r8     // Catch:{ all -> 0x0029 }
            java.lang.Object r7 = r8.j()     // Catch:{ all -> 0x0029 }
            XH.y.b(r7)     // Catch:{ all -> 0x0029 }
            com.afterpay.android.cashapp.AfterpayCashAppSigningResponse r7 = (com.afterpay.android.cashapp.AfterpayCashAppSigningResponse) r7     // Catch:{ all -> 0x0029 }
            java.lang.Object r7 = XH.x.b(r7)     // Catch:{ all -> 0x0029 }
            goto L_0x0091
        L_0x007f:
            java.lang.Exception r7 = new java.lang.Exception     // Catch:{ all -> 0x0029 }
            java.lang.String r8 = "No signing url found"
            r7.<init>(r8)     // Catch:{ all -> 0x0029 }
            throw r7     // Catch:{ all -> 0x0029 }
        L_0x0087:
            XH.x$a r8 = XH.x.f139812b
            java.lang.Object r7 = XH.y.a(r7)
            java.lang.Object r7 = XH.x.b(r7)
        L_0x0091:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.C8881b.c(java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: nI.l<? super u6.c, XH.N>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0055 A[Catch:{ all -> 0x0034 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a9 A[Catch:{ all -> 0x0034 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.lang.String r11, nI.C17642l<? super u6.C8882c, XH.C16807N> r12, dI.C17164e<? super XH.C16807N> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof u6.C8881b.a
            if (r0 == 0) goto L_0x0013
            r0 = r13
            u6.b$a r0 = (u6.C8881b.a) r0
            int r1 = r0.f56854f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f56854f = r1
            goto L_0x0018
        L_0x0013:
            u6.b$a r0 = new u6.b$a
            r0.<init>(r10, r13)
        L_0x0018:
            java.lang.Object r13 = r0.f56852d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f56854f
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r11 = r0.f56851c
            r12 = r11
            nI.l r12 = (nI.C17642l) r12
            XH.y.b(r13)     // Catch:{ all -> 0x0034 }
            XH.x r13 = (XH.x) r13     // Catch:{ all -> 0x0034 }
            java.lang.Object r11 = r13.j()     // Catch:{ all -> 0x0034 }
            goto L_0x004f
        L_0x0034:
            r11 = move-exception
            goto L_0x00b9
        L_0x0037:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003f:
            XH.y.b(r13)
            XH.x$a r13 = XH.x.f139812b     // Catch:{ all -> 0x0034 }
            r0.f56851c = r12     // Catch:{ all -> 0x0034 }
            r0.f56854f = r3     // Catch:{ all -> 0x0034 }
            java.lang.Object r11 = r10.c(r11, r0)     // Catch:{ all -> 0x0034 }
            if (r11 != r1) goto L_0x004f
            return r1
        L_0x004f:
            boolean r13 = XH.x.h(r11)     // Catch:{ all -> 0x0034 }
            if (r13 == 0) goto L_0x00a3
            r13 = r11
            com.afterpay.android.cashapp.AfterpayCashAppSigningResponse r13 = (com.afterpay.android.cashapp.AfterpayCashAppSigningResponse) r13     // Catch:{ all -> 0x0034 }
            com.afterpay.android.cashapp.AfterpayCashAppJwt$Companion r0 = com.afterpay.android.cashapp.AfterpayCashAppJwt.Companion     // Catch:{ all -> 0x0034 }
            java.lang.String r1 = r13.b()     // Catch:{ all -> 0x0034 }
            java.lang.Object r0 = r0.a(r1)     // Catch:{ all -> 0x0034 }
            boolean r1 = XH.x.h(r0)     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x0095
            r1 = r0
            com.afterpay.android.cashapp.AfterpayCashAppJwt r1 = (com.afterpay.android.cashapp.AfterpayCashAppJwt) r1     // Catch:{ all -> 0x0034 }
            u6.a r9 = new u6.a     // Catch:{ all -> 0x0034 }
            com.afterpay.android.cashapp.AfterpayCashAppAmount r2 = r1.a()     // Catch:{ all -> 0x0034 }
            java.lang.String r2 = r2.a()     // Catch:{ all -> 0x0034 }
            double r3 = java.lang.Double.parseDouble(r2)     // Catch:{ all -> 0x0034 }
            java.lang.String r5 = r1.c()     // Catch:{ all -> 0x0034 }
            java.lang.String r6 = r1.b()     // Catch:{ all -> 0x0034 }
            java.lang.String r7 = r13.a()     // Catch:{ all -> 0x0034 }
            java.lang.String r8 = r13.b()     // Catch:{ all -> 0x0034 }
            r2 = r9
            r2.<init>(r3, r5, r6, r7, r8)     // Catch:{ all -> 0x0034 }
            u6.c$b r13 = new u6.c$b     // Catch:{ all -> 0x0034 }
            r13.<init>(r9)     // Catch:{ all -> 0x0034 }
            r12.invoke(r13)     // Catch:{ all -> 0x0034 }
        L_0x0095:
            java.lang.Throwable r13 = XH.x.e(r0)     // Catch:{ all -> 0x0034 }
            if (r13 == 0) goto L_0x00a3
            u6.c$a r0 = new u6.c$a     // Catch:{ all -> 0x0034 }
            r0.<init>(r13)     // Catch:{ all -> 0x0034 }
            r12.invoke(r0)     // Catch:{ all -> 0x0034 }
        L_0x00a3:
            java.lang.Throwable r13 = XH.x.e(r11)     // Catch:{ all -> 0x0034 }
            if (r13 == 0) goto L_0x00b1
            u6.c$a r0 = new u6.c$a     // Catch:{ all -> 0x0034 }
            r0.<init>(r13)     // Catch:{ all -> 0x0034 }
            r12.invoke(r0)     // Catch:{ all -> 0x0034 }
        L_0x00b1:
            XH.x r11 = XH.x.a(r11)     // Catch:{ all -> 0x0034 }
            XH.x.b(r11)     // Catch:{ all -> 0x0034 }
            goto L_0x00c2
        L_0x00b9:
            XH.x$a r12 = XH.x.f139812b
            java.lang.Object r11 = XH.y.a(r11)
            XH.x.b(r11)
        L_0x00c2:
            XH.N r11 = XH.C16807N.f139792a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.C8881b.b(java.lang.String, nI.l, dI.e):java.lang.Object");
    }

    public final void d(String str, String str2, String str3, C17642l<? super C8883d, C16807N> lVar) {
        C17542s.j(str, "jwt");
        C17542s.j(str2, "customerId");
        C17542s.j(str3, "grantId");
        C17542s.j(lVar, "complete");
        if (((C16807N) C16312j.b((C17168i) null, new d(str, str2, str3, lVar, (C17164e<? super d>) null), 1, (Object) null)) == null) {
            lVar.invoke(new C8883d.a(new Exception("environment not set")));
        }
    }
}
