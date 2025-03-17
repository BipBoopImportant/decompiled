package com.afterpay.android.cashapp;

import XH.C16807N;
import XH.C16814e;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import javax.net.ssl.HttpsURLConnection;
import kK.C17514c;
import kK.C17516e;
import kK.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import nI.C17642l;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/afterpay/android/cashapp/AfterpayCashAppApi;", "", "<init>", "()V", "Ljavax/net/ssl/HttpsURLConnection;", "connection", "Lcom/afterpay/android/cashapp/AfterpayCashAppApi$a;", "type", "LXH/N;", "c", "(Ljavax/net/ssl/HttpsURLConnection;Lcom/afterpay/android/cashapp/AfterpayCashAppApi$a;)V", "LkK/c;", "b", "LkK/c;", "json", "ApiErrorCashApp", "a", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AfterpayCashAppApi {

    /* renamed from: a  reason: collision with root package name */
    public static final AfterpayCashAppApi f45960a = new AfterpayCashAppApi();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final C17514c f45961b = v.b((C17514c) null, c.f45967c, 1, (Object) null);

    @p
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u0000 &2\u00020\u0001:\u0002'&BA\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b\u001e\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0018¨\u0006("}, d2 = {"Lcom/afterpay/android/cashapp/AfterpayCashAppApi$ApiErrorCashApp;", "", "", "seen1", "", "errorCode", "errorId", "message", "httpStatusCode", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/afterpay/android/cashapp/AfterpayCashAppApi$ApiErrorCashApp;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getErrorCode", "b", "getErrorId", "c", "getMessage", "d", "I", "getHttpStatusCode", "Companion", "$serializer", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class ApiErrorCashApp {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f45962a;

        /* renamed from: b  reason: collision with root package name */
        private final String f45963b;

        /* renamed from: c  reason: collision with root package name */
        private final String f45964c;

        /* renamed from: d  reason: collision with root package name */
        private final int f45965d;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/afterpay/android/cashapp/AfterpayCashAppApi$ApiErrorCashApp$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/afterpay/android/cashapp/AfterpayCashAppApi$ApiErrorCashApp;", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<ApiErrorCashApp> serializer() {
                return AfterpayCashAppApi$ApiErrorCashApp$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @C16814e
        public /* synthetic */ ApiErrorCashApp(int i10, String str, String str2, String str3, int i11, T0 t02) {
            if (15 != (i10 & 15)) {
                E0.b(i10, 15, AfterpayCashAppApi$ApiErrorCashApp$$serializer.INSTANCE.getDescriptor());
            }
            this.f45962a = str;
            this.f45963b = str2;
            this.f45964c = str3;
            this.f45965d = i11;
        }

        public static final void a(ApiErrorCashApp apiErrorCashApp, C17395d dVar, SerialDescriptor serialDescriptor) {
            C17542s.j(apiErrorCashApp, "self");
            C17542s.j(dVar, "output");
            C17542s.j(serialDescriptor, "serialDesc");
            dVar.y(serialDescriptor, 0, apiErrorCashApp.f45962a);
            dVar.y(serialDescriptor, 1, apiErrorCashApp.f45963b);
            dVar.y(serialDescriptor, 2, apiErrorCashApp.f45964c);
            dVar.w(serialDescriptor, 3, apiErrorCashApp.f45965d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ApiErrorCashApp)) {
                return false;
            }
            ApiErrorCashApp apiErrorCashApp = (ApiErrorCashApp) obj;
            return C17542s.e(this.f45962a, apiErrorCashApp.f45962a) && C17542s.e(this.f45963b, apiErrorCashApp.f45963b) && C17542s.e(this.f45964c, apiErrorCashApp.f45964c) && this.f45965d == apiErrorCashApp.f45965d;
        }

        public int hashCode() {
            return (((((this.f45962a.hashCode() * 31) + this.f45963b.hashCode()) * 31) + this.f45964c.hashCode()) * 31) + Integer.hashCode(this.f45965d);
        }

        public String toString() {
            return "ApiErrorCashApp(errorCode=" + this.f45962a + ", errorId=" + this.f45963b + ", message=" + this.f45964c + ", httpStatusCode=" + this.f45965d + ')';
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/afterpay/android/cashapp/AfterpayCashAppApi$a;", "", "<init>", "(Ljava/lang/String;I)V", "POST", "PUT", "GET", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum a {
        POST,
        PUT,
        GET
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f45966a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.afterpay.android.cashapp.AfterpayCashAppApi$a[] r0 = com.afterpay.android.cashapp.AfterpayCashAppApi.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.afterpay.android.cashapp.AfterpayCashAppApi$a r1 = com.afterpay.android.cashapp.AfterpayCashAppApi.a.POST     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.afterpay.android.cashapp.AfterpayCashAppApi$a r1 = com.afterpay.android.cashapp.AfterpayCashAppApi.a.PUT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.afterpay.android.cashapp.AfterpayCashAppApi$a r1 = com.afterpay.android.cashapp.AfterpayCashAppApi.a.GET     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f45966a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.afterpay.android.cashapp.AfterpayCashAppApi.b.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LkK/e;", "LXH/N;", "invoke", "(LkK/e;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    static final class c extends C17544u implements C17642l<C17516e, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final c f45967c = new c();

        c() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C17516e) obj);
            return C16807N.f139792a;
        }

        public final void invoke(C17516e eVar) {
            C17542s.j(eVar, "$this$Json");
            eVar.g(true);
        }
    }

    private AfterpayCashAppApi() {
    }

    /* access modifiers changed from: private */
    public final void c(HttpsURLConnection httpsURLConnection, a aVar) {
        httpsURLConnection.setRequestMethod(aVar.name());
        httpsURLConnection.setRequestProperty("4.4.0-android", "X-Afterpay-SDK");
        int[] iArr = b.f45966a;
        int i10 = iArr[aVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            httpsURLConnection.setRequestProperty("Content-Type", "application/json");
            httpsURLConnection.setRequestProperty("Accept", "application/json");
        }
        int i11 = iArr[aVar.ordinal()];
        if (i11 == 1) {
            httpsURLConnection.setDoInput(true);
            httpsURLConnection.setDoOutput(true);
        } else if (i11 == 2) {
            httpsURLConnection.setDoInput(true);
            httpsURLConnection.setDoOutput(false);
        } else if (i11 == 3) {
            httpsURLConnection.setDoInput(true);
            httpsURLConnection.setDoOutput(false);
        }
    }
}
