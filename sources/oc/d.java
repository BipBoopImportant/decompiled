package Oc;

import Mc.C9143b;
import QJ.C16310i;
import QJ.Q;
import XH.C16807N;
import XH.y;
import android.net.Uri;
import com.adjust.sdk.Constants;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import nI.p;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0016B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJo\u0010\u0016\u001a\u00020\u00122\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\r2\"\u0010\u0014\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000f2\"\u0010\u0015\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000fH@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001b\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"LOc/d;", "LOc/a;", "LMc/b;", "appInfo", "LdI/i;", "blockingDispatcher", "", "baseUrl", "<init>", "(LMc/b;LdI/i;Ljava/lang/String;)V", "Ljava/net/URL;", "c", "()Ljava/net/URL;", "", "headerOptions", "Lkotlin/Function2;", "Lorg/json/JSONObject;", "LdI/e;", "LXH/N;", "", "onSuccess", "onFailure", "a", "(Ljava/util/Map;LnI/p;LnI/p;LdI/e;)Ljava/lang/Object;", "LMc/b;", "b", "LdI/i;", "Ljava/lang/String;", "d", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d implements a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f62080d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C9143b f62081a;

    /* renamed from: b  reason: collision with root package name */
    private final C17168i f62082b;

    /* renamed from: c  reason: collision with root package name */
    private final String f62083c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LOc/d$a;", "", "<init>", "()V", "", "FIREBASE_PLATFORM", "Ljava/lang/String;", "FIREBASE_SESSIONS_BASE_URL_STRING", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2", f = "RemoteSettingsFetcher.kt", l = {68, 70, 73}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f62084c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f62085d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Map<String, String> f62086e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p<JSONObject, C17164e<? super C16807N>, Object> f62087f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ p<String, C17164e<? super C16807N>, Object> f62088g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar, Map<String, String> map, p<? super JSONObject, ? super C17164e<? super C16807N>, ? extends Object> pVar, p<? super String, ? super C17164e<? super C16807N>, ? extends Object> pVar2, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f62085d = dVar;
            this.f62086e = map;
            this.f62087f = pVar;
            this.f62088g = pVar2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f62085d, this.f62086e, this.f62087f, this.f62088g, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f62084c;
            if (i10 == 0) {
                y.b(obj);
                URLConnection openConnection = this.f62085d.c().openConnection();
                C17542s.h(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                httpsURLConnection.setRequestMethod("GET");
                httpsURLConnection.setRequestProperty("Accept", "application/json");
                for (Map.Entry next : this.f62086e.entrySet()) {
                    httpsURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
                }
                int responseCode = httpsURLConnection.getResponseCode();
                if (responseCode == 200) {
                    InputStream inputStream = httpsURLConnection.getInputStream();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    StringBuilder sb2 = new StringBuilder();
                    O o10 = new O();
                    while (true) {
                        T readLine = bufferedReader.readLine();
                        o10.f144348a = readLine;
                        if (readLine == null) {
                            break;
                        }
                        sb2.append(readLine);
                    }
                    bufferedReader.close();
                    inputStream.close();
                    JSONObject jSONObject = new JSONObject(sb2.toString());
                    p<JSONObject, C17164e<? super C16807N>, Object> pVar = this.f62087f;
                    this.f62084c = 1;
                    if (pVar.invoke(jSONObject, this) == f10) {
                        return f10;
                    }
                } else {
                    p<String, C17164e<? super C16807N>, Object> pVar2 = this.f62088g;
                    String str = "Bad response code: " + responseCode;
                    this.f62084c = 2;
                    if (pVar2.invoke(str, this) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1 || i10 == 2) {
                try {
                    y.b(obj);
                } catch (Exception e10) {
                    p<String, C17164e<? super C16807N>, Object> pVar3 = this.f62088g;
                    String message = e10.getMessage();
                    if (message == null) {
                        message = e10.toString();
                    }
                    this.f62084c = 3;
                    if (pVar3.invoke(message, this) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 3) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    public d(C9143b bVar, C17168i iVar, String str) {
        C17542s.j(bVar, "appInfo");
        C17542s.j(iVar, "blockingDispatcher");
        C17542s.j(str, "baseUrl");
        this.f62081a = bVar;
        this.f62082b = iVar;
        this.f62083c = str;
    }

    /* access modifiers changed from: private */
    public final URL c() {
        return new URL(new Uri.Builder().scheme(Constants.SCHEME).authority(this.f62083c).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp").appendPath(this.f62081a.b()).appendPath("settings").appendQueryParameter("build_version", this.f62081a.a().a()).appendQueryParameter("display_version", this.f62081a.a().f()).build().toString());
    }

    public Object a(Map<String, String> map, p<? super JSONObject, ? super C17164e<? super C16807N>, ? extends Object> pVar, p<? super String, ? super C17164e<? super C16807N>, ? extends Object> pVar2, C17164e<? super C16807N> eVar) {
        Object g10 = C16310i.g(this.f62082b, new b(this, map, pVar, pVar2, (C17164e<? super b>) null), eVar);
        return g10 == C17187b.f() ? g10 : C16807N.f139792a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(C9143b bVar, C17168i iVar, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, iVar, (i10 & 4) != 0 ? "firebase-settings.crashlytics.com" : str);
    }
}
