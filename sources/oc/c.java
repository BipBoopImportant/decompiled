package Oc;

import HJ.C15850p;
import IJ.C15906b;
import IJ.C15908d;
import IJ.C15909e;
import Mc.C9143b;
import R2.h;
import W2.f;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.y;
import android.util.Log;
import bK.C17052a;
import bK.g;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.p;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0016B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0013H@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010$R\u0016\u0010(\u001a\u0004\u0018\u00010&8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010'R\u001f\u0010+\u001a\u0004\u0018\u00010)8VX\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0018\u0010*R\u0016\u0010.\u001a\u0004\u0018\u00010,8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010-\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006/"}, d2 = {"LOc/c;", "LOc/h;", "LdI/i;", "backgroundDispatcher", "Lnc/e;", "firebaseInstallationsApi", "LMc/b;", "appInfo", "LOc/a;", "configsFetcher", "LR2/h;", "LW2/f;", "dataStore", "<init>", "(LdI/i;Lnc/e;LMc/b;LOc/a;LR2/h;)V", "", "s", "g", "(Ljava/lang/String;)Ljava/lang/String;", "LXH/N;", "d", "(LdI/e;)Ljava/lang/Object;", "a", "LdI/i;", "b", "Lnc/e;", "c", "LMc/b;", "LOc/a;", "LOc/g;", "e", "LXH/o;", "f", "()LOc/g;", "settingsCache", "LbK/a;", "LbK/a;", "fetchInProgress", "", "()Ljava/lang/Boolean;", "sessionEnabled", "LIJ/b;", "()LIJ/b;", "sessionRestartTimeout", "", "()Ljava/lang/Double;", "samplingRate", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c implements h {

    /* renamed from: g  reason: collision with root package name */
    private static final a f62060g = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C17168i f62061a;

    /* renamed from: b  reason: collision with root package name */
    private final nc.e f62062b;

    /* renamed from: c  reason: collision with root package name */
    private final C9143b f62063c;

    /* renamed from: d  reason: collision with root package name */
    private final a f62064d;

    /* renamed from: e  reason: collision with root package name */
    private final C16824o f62065e;

    /* renamed from: f  reason: collision with root package name */
    private final C17052a f62066f = g.b(false, 1, (Object) null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LOc/c$a;", "", "<init>", "()V", "", "FORWARD_SLASH_STRING", "Ljava/lang/String;", "TAG", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LOc/g;", "b", "()LOc/g;"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17631a<g> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h<f> f62067c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(h<f> hVar) {
            super(0);
            this.f62067c = hVar;
        }

        /* renamed from: b */
        public final g invoke() {
            return new g(this.f62067c);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.RemoteSettings", f = "RemoteSettings.kt", l = {170, 76, 94}, m = "updateSettings")
    /* renamed from: Oc.c$c  reason: collision with other inner class name */
    static final class C1049c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f62068c;

        /* renamed from: d  reason: collision with root package name */
        Object f62069d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f62070e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ c f62071f;

        /* renamed from: g  reason: collision with root package name */
        int f62072g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1049c(c cVar, C17164e<? super C1049c> eVar) {
            super(eVar);
            this.f62071f = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f62070e = obj;
            this.f62072g |= Integer.MIN_VALUE;
            return this.f62071f.d(this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lorg/json/JSONObject;", "it", "LXH/N;", "<anonymous>", "(Lorg/json/JSONObject;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1", f = "RemoteSettings.kt", l = {125, 128, 131, 133, 134, 136}, m = "invokeSuspend")
    static final class d extends l implements p<JSONObject, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f62073c;

        /* renamed from: d  reason: collision with root package name */
        Object f62074d;

        /* renamed from: e  reason: collision with root package name */
        int f62075e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f62076f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c f62077g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f62077g = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            d dVar = new d(this.f62077g, eVar);
            dVar.f62076f = obj;
            return dVar;
        }

        /* renamed from: i */
        public final Object invoke(JSONObject jSONObject, C17164e<? super C16807N> eVar) {
            return ((d) create(jSONObject, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f9, code lost:
            if (((java.lang.Integer) r8.f144348a) == null) goto L_0x0115;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00fb, code lost:
            r12.f62076f = r1;
            r12.f62073c = r0;
            r12.f62074d = null;
            r12.f62075e = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x0112, code lost:
            if (Oc.c.e(r12.f62077g).m((java.lang.Integer) r8.f144348a, r12) != r4) goto L_0x0115;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x0114, code lost:
            return r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x0119, code lost:
            if (((java.lang.Double) r1.f144348a) == null) goto L_0x0135;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x011b, code lost:
            r12.f62076f = r0;
            r12.f62073c = null;
            r12.f62074d = null;
            r12.f62075e = 3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x0132, code lost:
            if (Oc.c.e(r12.f62077g).i((java.lang.Double) r1.f144348a, r12) != r4) goto L_0x0135;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0134, code lost:
            return r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0139, code lost:
            if (((java.lang.Integer) r0.f144348a) == null) goto L_0x0158;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x013b, code lost:
            r12.f62076f = null;
            r12.f62073c = null;
            r12.f62074d = null;
            r12.f62075e = 4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0152, code lost:
            if (Oc.c.e(r12.f62077g).j((java.lang.Integer) r0.f144348a, r12) != r4) goto L_0x0155;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x0154, code lost:
            return r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0155, code lost:
            r13 = XH.C16807N.f139792a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0158, code lost:
            r13 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x0159, code lost:
            if (r13 != null) goto L_0x0178;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x015b, code lost:
            r13 = Oc.c.e(r12.f62077g);
            r0 = kotlin.coroutines.jvm.internal.b.e(86400);
            r12.f62076f = null;
            r12.f62073c = null;
            r12.f62074d = null;
            r12.f62075e = 5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x0175, code lost:
            if (r13.j(r0, r12) != r4) goto L_0x0178;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x0177, code lost:
            return r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x0178, code lost:
            r13 = Oc.c.e(r12.f62077g);
            r0 = kotlin.coroutines.jvm.internal.b.f(java.lang.System.currentTimeMillis());
            r12.f62076f = null;
            r12.f62073c = null;
            r12.f62074d = null;
            r12.f62075e = 6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x0193, code lost:
            if (r13.k(r0, r12) != r4) goto L_0x0196;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x0195, code lost:
            return r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0198, code lost:
            return XH.C16807N.f139792a;
         */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00d7  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00f3  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.String r0 = "cache_duration"
                java.lang.String r1 = "session_timeout_seconds"
                java.lang.String r2 = "sampling_rate"
                java.lang.String r3 = "sessions_enabled"
                java.lang.Object r4 = eI.C17187b.f()
                int r5 = r12.f62075e
                r6 = 0
                switch(r5) {
                    case 0: goto L_0x0050;
                    case 1: goto L_0x003f;
                    case 2: goto L_0x0032;
                    case 3: goto L_0x0029;
                    case 4: goto L_0x0024;
                    case 5: goto L_0x001f;
                    case 6: goto L_0x001a;
                    default: goto L_0x0012;
                }
            L_0x0012:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x001a:
                XH.y.b(r13)
                goto L_0x0196
            L_0x001f:
                XH.y.b(r13)
                goto L_0x0178
            L_0x0024:
                XH.y.b(r13)
                goto L_0x0155
            L_0x0029:
                java.lang.Object r0 = r12.f62076f
                kotlin.jvm.internal.O r0 = (kotlin.jvm.internal.O) r0
                XH.y.b(r13)
                goto L_0x0135
            L_0x0032:
                java.lang.Object r0 = r12.f62073c
                kotlin.jvm.internal.O r0 = (kotlin.jvm.internal.O) r0
                java.lang.Object r1 = r12.f62076f
                kotlin.jvm.internal.O r1 = (kotlin.jvm.internal.O) r1
                XH.y.b(r13)
                goto L_0x0115
            L_0x003f:
                java.lang.Object r0 = r12.f62074d
                kotlin.jvm.internal.O r0 = (kotlin.jvm.internal.O) r0
                java.lang.Object r1 = r12.f62073c
                kotlin.jvm.internal.O r1 = (kotlin.jvm.internal.O) r1
                java.lang.Object r2 = r12.f62076f
                kotlin.jvm.internal.O r2 = (kotlin.jvm.internal.O) r2
                XH.y.b(r13)
                goto L_0x00f0
            L_0x0050:
                XH.y.b(r13)
                java.lang.Object r13 = r12.f62076f
                org.json.JSONObject r13 = (org.json.JSONObject) r13
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r7 = "Fetched settings: "
                r5.append(r7)
                r5.append(r13)
                java.lang.String r5 = r5.toString()
                java.lang.String r7 = "SessionConfigFetcher"
                android.util.Log.d(r7, r5)
                kotlin.jvm.internal.O r5 = new kotlin.jvm.internal.O
                r5.<init>()
                kotlin.jvm.internal.O r8 = new kotlin.jvm.internal.O
                r8.<init>()
                kotlin.jvm.internal.O r9 = new kotlin.jvm.internal.O
                r9.<init>()
                java.lang.String r10 = "app_quality"
                boolean r11 = r13.has(r10)
                if (r11 == 0) goto L_0x00d4
                java.lang.Object r13 = r13.get(r10)
                java.lang.String r10 = "null cannot be cast to non-null type org.json.JSONObject"
                kotlin.jvm.internal.C17542s.h(r13, r10)
                org.json.JSONObject r13 = (org.json.JSONObject) r13
                boolean r10 = r13.has(r3)     // Catch:{ JSONException -> 0x009c }
                if (r10 == 0) goto L_0x009f
                java.lang.Object r3 = r13.get(r3)     // Catch:{ JSONException -> 0x009c }
                java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ JSONException -> 0x009c }
                goto L_0x00a0
            L_0x009c:
                r13 = move-exception
                r3 = r6
                goto L_0x00ce
            L_0x009f:
                r3 = r6
            L_0x00a0:
                boolean r10 = r13.has(r2)     // Catch:{ JSONException -> 0x00af }
                if (r10 == 0) goto L_0x00b1
                java.lang.Object r2 = r13.get(r2)     // Catch:{ JSONException -> 0x00af }
                java.lang.Double r2 = (java.lang.Double) r2     // Catch:{ JSONException -> 0x00af }
                r5.f144348a = r2     // Catch:{ JSONException -> 0x00af }
                goto L_0x00b1
            L_0x00af:
                r13 = move-exception
                goto L_0x00ce
            L_0x00b1:
                boolean r2 = r13.has(r1)     // Catch:{ JSONException -> 0x00af }
                if (r2 == 0) goto L_0x00bf
                java.lang.Object r1 = r13.get(r1)     // Catch:{ JSONException -> 0x00af }
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ JSONException -> 0x00af }
                r8.f144348a = r1     // Catch:{ JSONException -> 0x00af }
            L_0x00bf:
                boolean r1 = r13.has(r0)     // Catch:{ JSONException -> 0x00af }
                if (r1 == 0) goto L_0x00d5
                java.lang.Object r13 = r13.get(r0)     // Catch:{ JSONException -> 0x00af }
                java.lang.Integer r13 = (java.lang.Integer) r13     // Catch:{ JSONException -> 0x00af }
                r9.f144348a = r13     // Catch:{ JSONException -> 0x00af }
                goto L_0x00d5
            L_0x00ce:
                java.lang.String r0 = "Error parsing the configs remotely fetched: "
                android.util.Log.e(r7, r0, r13)
                goto L_0x00d5
            L_0x00d4:
                r3 = r6
            L_0x00d5:
                if (r3 == 0) goto L_0x00f3
                Oc.c r13 = r12.f62077g
                Oc.g r13 = r13.f()
                r12.f62076f = r5
                r12.f62073c = r8
                r12.f62074d = r9
                r0 = 1
                r12.f62075e = r0
                java.lang.Object r13 = r13.n(r3, r12)
                if (r13 != r4) goto L_0x00ed
                return r4
            L_0x00ed:
                r2 = r5
                r1 = r8
                r0 = r9
            L_0x00f0:
                r8 = r1
                r1 = r2
                goto L_0x00f5
            L_0x00f3:
                r1 = r5
                r0 = r9
            L_0x00f5:
                T r13 = r8.f144348a
                java.lang.Integer r13 = (java.lang.Integer) r13
                if (r13 == 0) goto L_0x0115
                Oc.c r13 = r12.f62077g
                Oc.g r13 = r13.f()
                T r2 = r8.f144348a
                java.lang.Integer r2 = (java.lang.Integer) r2
                r12.f62076f = r1
                r12.f62073c = r0
                r12.f62074d = r6
                r3 = 2
                r12.f62075e = r3
                java.lang.Object r13 = r13.m(r2, r12)
                if (r13 != r4) goto L_0x0115
                return r4
            L_0x0115:
                T r13 = r1.f144348a
                java.lang.Double r13 = (java.lang.Double) r13
                if (r13 == 0) goto L_0x0135
                Oc.c r13 = r12.f62077g
                Oc.g r13 = r13.f()
                T r1 = r1.f144348a
                java.lang.Double r1 = (java.lang.Double) r1
                r12.f62076f = r0
                r12.f62073c = r6
                r12.f62074d = r6
                r2 = 3
                r12.f62075e = r2
                java.lang.Object r13 = r13.i(r1, r12)
                if (r13 != r4) goto L_0x0135
                return r4
            L_0x0135:
                T r13 = r0.f144348a
                java.lang.Integer r13 = (java.lang.Integer) r13
                if (r13 == 0) goto L_0x0158
                Oc.c r13 = r12.f62077g
                Oc.g r13 = r13.f()
                T r0 = r0.f144348a
                java.lang.Integer r0 = (java.lang.Integer) r0
                r12.f62076f = r6
                r12.f62073c = r6
                r12.f62074d = r6
                r1 = 4
                r12.f62075e = r1
                java.lang.Object r13 = r13.j(r0, r12)
                if (r13 != r4) goto L_0x0155
                return r4
            L_0x0155:
                XH.N r13 = XH.C16807N.f139792a
                goto L_0x0159
            L_0x0158:
                r13 = r6
            L_0x0159:
                if (r13 != 0) goto L_0x0178
                Oc.c r13 = r12.f62077g
                Oc.g r13 = r13.f()
                r0 = 86400(0x15180, float:1.21072E-40)
                java.lang.Integer r0 = kotlin.coroutines.jvm.internal.b.e(r0)
                r12.f62076f = r6
                r12.f62073c = r6
                r12.f62074d = r6
                r1 = 5
                r12.f62075e = r1
                java.lang.Object r13 = r13.j(r0, r12)
                if (r13 != r4) goto L_0x0178
                return r4
            L_0x0178:
                Oc.c r13 = r12.f62077g
                Oc.g r13 = r13.f()
                long r0 = java.lang.System.currentTimeMillis()
                java.lang.Long r0 = kotlin.coroutines.jvm.internal.b.f(r0)
                r12.f62076f = r6
                r12.f62073c = r6
                r12.f62074d = r6
                r1 = 6
                r12.f62075e = r1
                java.lang.Object r13 = r13.k(r0, r12)
                if (r13 != r4) goto L_0x0196
                return r4
            L_0x0196:
                XH.N r13 = XH.C16807N.f139792a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: Oc.c.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "msg", "LXH/N;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2", f = "RemoteSettings.kt", l = {}, m = "invokeSuspend")
    static final class e extends l implements p<String, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f62078c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f62079d;

        e(C17164e<? super e> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f62079d = obj;
            return eVar2;
        }

        /* renamed from: i */
        public final Object invoke(String str, C17164e<? super C16807N> eVar) {
            return ((e) create(str, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f62078c == 0) {
                y.b(obj);
                Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.f62079d));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public c(C17168i iVar, nc.e eVar, C9143b bVar, a aVar, h<f> hVar) {
        C17542s.j(iVar, "backgroundDispatcher");
        C17542s.j(eVar, "firebaseInstallationsApi");
        C17542s.j(bVar, "appInfo");
        C17542s.j(aVar, "configsFetcher");
        C17542s.j(hVar, "dataStore");
        this.f62061a = iVar;
        this.f62062b = eVar;
        this.f62063c = bVar;
        this.f62064d = aVar;
        this.f62065e = C16825p.b(new b(hVar));
    }

    /* access modifiers changed from: private */
    public final g f() {
        return (g) this.f62065e.getValue();
    }

    private final String g(String str) {
        return new C15850p("/").j(str, "");
    }

    public Boolean a() {
        return f().g();
    }

    public C15906b b() {
        Integer e10 = f().e();
        if (e10 == null) {
            return null;
        }
        C15906b.a aVar = C15906b.f135496b;
        return C15906b.v(C15908d.s(e10.intValue(), C15909e.SECONDS));
    }

    public Double c() {
        return f().f();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0092 A[Catch:{ all -> 0x009d }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a3 A[SYNTHETIC, Splitter:B:41:0x00a3] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c5 A[Catch:{ all -> 0x004f }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object d(dI.C17164e<? super XH.C16807N> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof Oc.c.C1049c
            if (r0 == 0) goto L_0x0013
            r0 = r14
            Oc.c$c r0 = (Oc.c.C1049c) r0
            int r1 = r0.f62072g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f62072g = r1
            goto L_0x0018
        L_0x0013:
            Oc.c$c r0 = new Oc.c$c
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f62070e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f62072g
            r3 = 3
            r4 = 1
            java.lang.String r5 = "SessionConfigFetcher"
            r6 = 2
            r7 = 0
            if (r2 == 0) goto L_0x0060
            if (r2 == r4) goto L_0x0053
            if (r2 == r6) goto L_0x0042
            if (r2 != r3) goto L_0x003a
            java.lang.Object r0 = r0.f62068c
            bK.a r0 = (bK.C17052a) r0
            XH.y.b(r14)     // Catch:{ all -> 0x0037 }
            goto L_0x014e
        L_0x0037:
            r14 = move-exception
            goto L_0x0156
        L_0x003a:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0042:
            java.lang.Object r2 = r0.f62069d
            bK.a r2 = (bK.C17052a) r2
            java.lang.Object r4 = r0.f62068c
            Oc.c r4 = (Oc.c) r4
            XH.y.b(r14)     // Catch:{ all -> 0x004f }
            goto L_0x00b7
        L_0x004f:
            r14 = move-exception
            r0 = r2
            goto L_0x0156
        L_0x0053:
            java.lang.Object r2 = r0.f62069d
            bK.a r2 = (bK.C17052a) r2
            java.lang.Object r4 = r0.f62068c
            Oc.c r4 = (Oc.c) r4
            XH.y.b(r14)
            r14 = r2
            goto L_0x0088
        L_0x0060:
            XH.y.b(r14)
            bK.a r14 = r13.f62066f
            boolean r14 = r14.c()
            if (r14 != 0) goto L_0x0078
            Oc.g r14 = r13.f()
            boolean r14 = r14.d()
            if (r14 != 0) goto L_0x0078
            XH.N r14 = XH.C16807N.f139792a
            return r14
        L_0x0078:
            bK.a r14 = r13.f62066f
            r0.f62068c = r13
            r0.f62069d = r14
            r0.f62072g = r4
            java.lang.Object r2 = r14.e(r7, r0)
            if (r2 != r1) goto L_0x0087
            return r1
        L_0x0087:
            r4 = r13
        L_0x0088:
            Oc.g r2 = r4.f()     // Catch:{ all -> 0x009d }
            boolean r2 = r2.d()     // Catch:{ all -> 0x009d }
            if (r2 != 0) goto L_0x00a3
            java.lang.String r0 = "Remote settings cache not expired. Using cached values."
            android.util.Log.d(r5, r0)     // Catch:{ all -> 0x009d }
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x009d }
            r14.d(r7)
            return r0
        L_0x009d:
            r0 = move-exception
            r12 = r0
            r0 = r14
            r14 = r12
            goto L_0x0156
        L_0x00a3:
            Mc.s$a r2 = Mc.s.f61821c     // Catch:{ all -> 0x009d }
            nc.e r8 = r4.f62062b     // Catch:{ all -> 0x009d }
            r0.f62068c = r4     // Catch:{ all -> 0x009d }
            r0.f62069d = r14     // Catch:{ all -> 0x009d }
            r0.f62072g = r6     // Catch:{ all -> 0x009d }
            java.lang.Object r2 = r2.a(r8, r0)     // Catch:{ all -> 0x009d }
            if (r2 != r1) goto L_0x00b4
            return r1
        L_0x00b4:
            r12 = r2
            r2 = r14
            r14 = r12
        L_0x00b7:
            Mc.s r14 = (Mc.s) r14     // Catch:{ all -> 0x004f }
            java.lang.String r14 = r14.b()     // Catch:{ all -> 0x004f }
            java.lang.String r8 = ""
            boolean r8 = kotlin.jvm.internal.C17542s.e(r14, r8)     // Catch:{ all -> 0x004f }
            if (r8 == 0) goto L_0x00d0
            java.lang.String r14 = "Error getting Firebase Installation ID. Skipping this Session Event."
            android.util.Log.w(r5, r14)     // Catch:{ all -> 0x004f }
            XH.N r14 = XH.C16807N.f139792a     // Catch:{ all -> 0x004f }
            r2.d(r7)
            return r14
        L_0x00d0:
            java.lang.String r8 = "X-Crashlytics-Installation-ID"
            XH.v r14 = XH.C16796C.a(r8, r14)     // Catch:{ all -> 0x004f }
            java.lang.String r8 = "X-Crashlytics-Device-Model"
            kotlin.jvm.internal.V r9 = kotlin.jvm.internal.V.f144353a     // Catch:{ all -> 0x004f }
            java.lang.String r9 = "%s/%s"
            java.lang.String r10 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x004f }
            java.lang.String r11 = android.os.Build.MODEL     // Catch:{ all -> 0x004f }
            java.lang.Object[] r10 = new java.lang.Object[]{r10, r11}     // Catch:{ all -> 0x004f }
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r10, r6)     // Catch:{ all -> 0x004f }
            java.lang.String r6 = java.lang.String.format(r9, r6)     // Catch:{ all -> 0x004f }
            java.lang.String r9 = "format(format, *args)"
            kotlin.jvm.internal.C17542s.i(r6, r9)     // Catch:{ all -> 0x004f }
            java.lang.String r6 = r4.g(r6)     // Catch:{ all -> 0x004f }
            XH.v r6 = XH.C16796C.a(r8, r6)     // Catch:{ all -> 0x004f }
            java.lang.String r8 = "X-Crashlytics-OS-Build-Version"
            java.lang.String r9 = android.os.Build.VERSION.INCREMENTAL     // Catch:{ all -> 0x004f }
            java.lang.String r10 = "INCREMENTAL"
            kotlin.jvm.internal.C17542s.i(r9, r10)     // Catch:{ all -> 0x004f }
            java.lang.String r9 = r4.g(r9)     // Catch:{ all -> 0x004f }
            XH.v r8 = XH.C16796C.a(r8, r9)     // Catch:{ all -> 0x004f }
            java.lang.String r9 = "X-Crashlytics-OS-Display-Version"
            java.lang.String r10 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x004f }
            java.lang.String r11 = "RELEASE"
            kotlin.jvm.internal.C17542s.i(r10, r11)     // Catch:{ all -> 0x004f }
            java.lang.String r10 = r4.g(r10)     // Catch:{ all -> 0x004f }
            XH.v r9 = XH.C16796C.a(r9, r10)     // Catch:{ all -> 0x004f }
            java.lang.String r10 = "X-Crashlytics-API-Client-Version"
            Mc.b r11 = r4.f62063c     // Catch:{ all -> 0x004f }
            java.lang.String r11 = r11.f()     // Catch:{ all -> 0x004f }
            XH.v r10 = XH.C16796C.a(r10, r11)     // Catch:{ all -> 0x004f }
            XH.v[] r14 = new XH.v[]{r14, r6, r8, r9, r10}     // Catch:{ all -> 0x004f }
            java.util.Map r14 = YH.X.m(r14)     // Catch:{ all -> 0x004f }
            java.lang.String r6 = "Fetching settings from server."
            android.util.Log.d(r5, r6)     // Catch:{ all -> 0x004f }
            Oc.a r5 = r4.f62064d     // Catch:{ all -> 0x004f }
            Oc.c$d r6 = new Oc.c$d     // Catch:{ all -> 0x004f }
            r6.<init>(r4, r7)     // Catch:{ all -> 0x004f }
            Oc.c$e r4 = new Oc.c$e     // Catch:{ all -> 0x004f }
            r4.<init>(r7)     // Catch:{ all -> 0x004f }
            r0.f62068c = r2     // Catch:{ all -> 0x004f }
            r0.f62069d = r7     // Catch:{ all -> 0x004f }
            r0.f62072g = r3     // Catch:{ all -> 0x004f }
            java.lang.Object r14 = r5.a(r14, r6, r4, r0)     // Catch:{ all -> 0x004f }
            if (r14 != r1) goto L_0x014d
            return r1
        L_0x014d:
            r0 = r2
        L_0x014e:
            XH.N r14 = XH.C16807N.f139792a     // Catch:{ all -> 0x0037 }
            r0.d(r7)
            XH.N r14 = XH.C16807N.f139792a
            return r14
        L_0x0156:
            r0.d(r7)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: Oc.c.d(dI.e):java.lang.Object");
    }
}
