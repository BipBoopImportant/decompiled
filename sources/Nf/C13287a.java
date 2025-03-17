package NF;

import QJ.C16311i0;
import QJ.F0;
import QJ.Q;
import QJ.S;
import QJ.T;
import TJ.C16533h;
import XH.C16807N;
import XH.y;
import com.sugarcube.app.base.data.preferences.PreferenceImpl;
import com.sugarcube.app.base.data.preferences.PreferenceStorage;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H@¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R2\u0010\u001a\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\u0016j\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f`\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002XD¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001b8\u0002XD¢\u0006\u0006\n\u0004\b\u001f\u0010\u001d¨\u0006!"}, d2 = {"LNF/a;", "", "Lcom/sugarcube/app/base/data/preferences/PreferenceStorage;", "preferenceStorage", "<init>", "(Lcom/sugarcube/app/base/data/preferences/PreferenceStorage;)V", "LXH/N;", "k", "(LdI/e;)Ljava/lang/Object;", "i", "Ljava/util/UUID;", "uuid", "g", "(Ljava/util/UUID;)V", "j", "", "h", "(Ljava/util/UUID;)J", "a", "Lcom/sugarcube/app/base/data/preferences/PreferenceStorage;", "getPreferenceStorage", "()Lcom/sugarcube/app/base/data/preferences/PreferenceStorage;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "b", "Ljava/util/HashMap;", "captureTimes", "", "c", "Ljava/lang/String;", "key", "d", "value", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: NF.a  reason: case insensitive filesystem */
public final class C13287a {

    /* renamed from: a  reason: collision with root package name */
    private final PreferenceStorage f112453a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public HashMap<UUID, Long> f112454b = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final String f112455c = "key";
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final String f112456d = "value";

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.util.CaptureAnalyticsHelper$1", f = "CaptureAnalyticsHelper.kt", l = {21}, m = "invokeSuspend")
    /* renamed from: NF.a$a  reason: collision with other inner class name */
    static final class C2765a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f112457c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C13287a f112458d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2765a(C13287a aVar, C17164e<? super C2765a> eVar) {
            super(2, eVar);
            this.f112458d = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C2765a(this.f112458d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C2765a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f112457c;
            if (i10 == 0) {
                y.b(obj);
                C13287a aVar = this.f112458d;
                this.f112457c = 1;
                if (aVar.i(this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.util.CaptureAnalyticsHelper$addCaptureTime$1", f = "CaptureAnalyticsHelper.kt", l = {26}, m = "invokeSuspend")
    /* renamed from: NF.a$b */
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f112459c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C13287a f112460d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C13287a aVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f112460d = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f112460d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f112459c;
            if (i10 == 0) {
                y.b(obj);
                C13287a aVar = this.f112460d;
                this.f112459c = 1;
                if (aVar.k(this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: NF.a$c */
    static final class c<T> implements C16533h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C13287a f112461a;

        c(C13287a aVar) {
            this.f112461a = aVar;
        }

        /* renamed from: c */
        public final Object emit(String str, C17164e<? super C16807N> eVar) {
            if (str.length() > 0) {
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    int length = jSONArray.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i10);
                        this.f112461a.f112454b.put(UUID.fromString(jSONObject.getString(this.f112461a.f112455c)), kotlin.coroutines.jvm.internal.b.f(jSONObject.getLong(this.f112461a.f112456d)));
                    }
                } catch (JSONException unused) {
                    this.f112461a.f112454b = new HashMap();
                }
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.util.CaptureAnalyticsHelper$removeCaptureTime$1", f = "CaptureAnalyticsHelper.kt", l = {31}, m = "invokeSuspend")
    /* renamed from: NF.a$d */
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f112462c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C13287a f112463d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C13287a aVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f112463d = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f112463d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f112462c;
            if (i10 == 0) {
                y.b(obj);
                C13287a aVar = this.f112463d;
                this.f112462c = 1;
                if (aVar.k(this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    public C13287a(PreferenceStorage preferenceStorage) {
        C17542s.j(preferenceStorage, "preferenceStorage");
        this.f112453a = preferenceStorage;
        F0 unused = C16314k.d(S.a(C16311i0.b()), (C17168i) null, (T) null, new C2765a(this, (C17164e<? super C2765a>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final Object i(C17164e<? super C16807N> eVar) {
        Object collect = this.f112453a.getPreference(PreferenceImpl.PreferencesKeys.getCAPTURES_IN_PROGRESS_KEY(), "").collect(new c(this), eVar);
        return collect == C17187b.f() ? collect : C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final Object k(C17164e<? super C16807N> eVar) {
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry next : this.f112454b.entrySet()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(this.f112455c, ((UUID) next.getKey()).toString());
            jSONObject.put(this.f112456d, ((Number) next.getValue()).longValue());
            jSONArray.put(jSONObject);
        }
        Object preference = this.f112453a.setPreference(PreferenceImpl.PreferencesKeys.getCAPTURES_IN_PROGRESS_KEY(), jSONArray.toString(), eVar);
        return preference == C17187b.f() ? preference : C16807N.f139792a;
    }

    public final void g(UUID uuid) {
        C17542s.j(uuid, "uuid");
        HashMap<UUID, Long> hashMap = this.f112454b;
        long currentTimeMillis = System.currentTimeMillis();
        Long l10 = this.f112454b.get(uuid);
        hashMap.put(uuid, Long.valueOf(currentTimeMillis - (l10 != null ? l10.longValue() : 0)));
        F0 unused = C16314k.d(S.a(C16311i0.b()), (C17168i) null, (T) null, new b(this, (C17164e<? super b>) null), 3, (Object) null);
    }

    public final long h(UUID uuid) {
        C17542s.j(uuid, "uuid");
        Long l10 = this.f112454b.get(uuid);
        if (l10 != null) {
            return l10.longValue();
        }
        return 0;
    }

    public final void j(UUID uuid) {
        C17542s.j(uuid, "uuid");
        this.f112454b.remove(uuid);
        F0 unused = C16314k.d(S.a(C16311i0.b()), (C17168i) null, (T) null, new d(this, (C17164e<? super d>) null), 3, (Object) null);
    }
}
