package Se;

import Ae.f;
import HJ.C15854t;
import QJ.Q;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.v;
import XH.y;
import YH.C16877v;
import YH.X;
import android.app.Activity;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import nI.q;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010#\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0016B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001b\u001a\u00020\r2\u0018\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u00190\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010 \u001a\u00020\r2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001e0\u001dH\u0016¢\u0006\u0004\b \u0010!J!\u0010%\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010$\u001a\u00020\u0014H\u0017¢\u0006\u0004\b%\u0010&J/\u0010(\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u00142\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0018\u00010\u001dH\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010,R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010-\u001a\u0004\b.\u0010/R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u0005008\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u00101R\u0014\u00105\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u0006:"}, d2 = {"LSe/e;", "LAe/f;", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "firebase", "", "LAe/a;", "interceptorSet", "LEe/a;", "analyticsEnabledUseCase", "LQJ/Q;", "applicationScope", "<init>", "(Lcom/google/firebase/analytics/FirebaseAnalytics;Ljava/util/Set;LEe/a;LQJ/Q;)V", "LXH/N;", "l", "()V", "Landroid/os/Bundle;", "bundle", "d", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "", "icmId", "a", "(Ljava/lang/String;)V", "", "LXH/v;", "userProperties", "c", "(Ljava/util/List;)V", "", "", "values", "i", "(Ljava/util/Map;)V", "Landroid/app/Activity;", "activity", "viewName", "e", "(Landroid/app/Activity;Ljava/lang/String;)V", "eventKey", "track", "(Ljava/lang/String;Ljava/util/Map;)V", "b", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "LEe/a;", "LQJ/Q;", "getApplicationScope", "()LQJ/Q;", "", "Ljava/util/Set;", "interceptors", "f", "Landroid/os/Bundle;", "defaultEventParams", "", "g", "Z", "analyticsEnabled", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements f {

    /* renamed from: b  reason: collision with root package name */
    private final FirebaseAnalytics f63391b;

    /* renamed from: c  reason: collision with root package name */
    private final Ee.a f63392c;

    /* renamed from: d  reason: collision with root package name */
    private final Q f63393d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<Ae.a> f63394e;

    /* renamed from: f  reason: collision with root package name */
    private final Bundle f63395f = new Bundle();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public boolean f63396g;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"LSe/e$a;", "", "", "eventKey", "Landroid/os/Bundle;", "parameters", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;)V", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "firebase", "LXH/N;", "c", "(Lcom/google/firebase/analytics/FirebaseAnalytics;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f63397a;

        /* renamed from: b  reason: collision with root package name */
        private final Bundle f63398b;

        public a(String str, Bundle bundle) {
            C17542s.j(str, "eventKey");
            this.f63397a = str;
            this.f63398b = bundle;
        }

        public final String a() {
            return this.f63397a;
        }

        public final Bundle b() {
            return this.f63398b;
        }

        public void c(FirebaseAnalytics firebaseAnalytics) {
            C17542s.j(firebaseAnalytics, "firebase");
            qv.e eVar = qv.e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Track eventKey: " + a() + ", parameters: " + b(), (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = a.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, (Throwable) null, str3);
                str = str3;
                str2 = str4;
            }
            firebaseAnalytics.a(this.f63397a, this.f63398b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f63397a, aVar.f63397a) && C17542s.e(this.f63398b, aVar.f63398b);
        }

        public int hashCode() {
            int hashCode = this.f63397a.hashCode() * 31;
            Bundle bundle = this.f63398b;
            return hashCode + (bundle == null ? 0 : bundle.hashCode());
        }

        public String toString() {
            String str = this.f63397a;
            Bundle bundle = this.f63398b;
            return "FirebaseTrackEvent(eventKey=" + str + ", parameters=" + bundle + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "analyticsEnabled", "LXH/N;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.analytics.FirebaseAnalyticsEngine$monitorAnalyticsConsent$1", f = "FirebaseAnalyticsEngine.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements p<Boolean, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f63399c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ boolean f63400d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e f63401e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar, C17164e<? super b> eVar2) {
            super(2, eVar2);
            this.f63401e = eVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f63401e, eVar);
            bVar.f63400d = ((Boolean) obj).booleanValue();
            return bVar;
        }

        public final Object i(boolean z10, C17164e<? super C16807N> eVar) {
            return ((b) create(Boolean.valueOf(z10), eVar)).invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i(((Boolean) obj).booleanValue(), (C17164e) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f63399c == 0) {
                y.b(obj);
                boolean z10 = this.f63400d;
                e eVar = this.f63401e;
                qv.e eVar2 = qv.e.DEBUG;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : d.f102012a.a()) {
                    if (((C11819b) next).b(eVar2, false)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList) {
                    if (str == null) {
                        String a10 = C11818a.a("FirebaseAnalyticsEngine: analytics enabled: " + z10, (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = eVar.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar.a(eVar2, str4, false, (Throwable) null, str3);
                    str = str3;
                    str2 = str4;
                }
                this.f63401e.f63396g = z10;
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LTJ/h;", "", "", "throwable", "LXH/N;", "<anonymous>", "(LTJ/h;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.analytics.FirebaseAnalyticsEngine$monitorAnalyticsConsent$2", f = "FirebaseAnalyticsEngine.kt", l = {}, m = "invokeSuspend")
    static final class c extends l implements q<C16533h<? super Boolean>, Throwable, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f63402c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f63403d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f63404e;

        c(C17164e<? super c> eVar) {
            super(3, eVar);
        }

        public final Object invoke(C16533h<? super Boolean> hVar, Throwable th2, C17164e<? super C16807N> eVar) {
            c cVar = new c(eVar);
            cVar.f63403d = hVar;
            cVar.f63404e = th2;
            return cVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f63402c == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f63403d;
                Throwable th2 = (Throwable) this.f63404e;
                qv.e eVar = qv.e.ERROR;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList) {
                    if (str == null) {
                        String a10 = C11818a.a("FirebaseAnalyticsEngine: Caught exception while monitoring analytics", th2);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = hVar.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar.a(eVar, str4, false, th2, str3);
                    str = str3;
                    str2 = str4;
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public e(FirebaseAnalytics firebaseAnalytics, Set<? extends Ae.a> set, Ee.a aVar, Q q10) {
        C17542s.j(firebaseAnalytics, "firebase");
        C17542s.j(set, "interceptorSet");
        C17542s.j(aVar, "analyticsEnabledUseCase");
        C17542s.j(q10, "applicationScope");
        this.f63391b = firebaseAnalytics;
        this.f63392c = aVar;
        this.f63393d = q10;
        this.f63394e = C16877v.x1(set);
        l();
    }

    private final Bundle d(Bundle bundle) {
        return bundle == null ? new Bundle() : bundle;
    }

    static /* synthetic */ Bundle f(e eVar, Bundle bundle, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bundle = null;
        }
        return eVar.d(bundle);
    }

    private final void l() {
        C16534i.M(C16534i.g(C16534i.R(this.f63392c.invoke(), new b(this, (C17164e<? super b>) null)), new c((C17164e<? super c>) null)), this.f63393d);
    }

    public void a(String str) {
        this.f63391b.e(str);
    }

    public void c(List<v<String, String>> list) {
        Object obj;
        C17542s.j(list, "userProperties");
        for (v next : list) {
            String str = (String) next.c();
            String str2 = (String) next.d();
            this.f63391b.f(str, str2);
            FirebaseCrashlytics.getInstance().setCustomKey(str, str2);
            for (Ae.a c10 : this.f63394e) {
                c10.c(str, str2, this.f63396g);
            }
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C17542s.e(((v) obj).c(), "market")) {
                break;
            }
        }
        v vVar = (v) obj;
        if (vVar != null) {
            i(X.f(vVar));
        }
    }

    public void e(Activity activity, String str) {
        char c10;
        String str2;
        String str3 = str;
        C17542s.j(str3, "viewName");
        int length = str.length();
        String str4 = DslKt.INDICATOR_BACKGROUND;
        char c11 = '$';
        Class<e> cls = e.class;
        if (length == 0) {
            qv.e eVar = qv.e.WARN;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str5 = null;
            String str6 = null;
            for (C11819b bVar : arrayList) {
                if (str5 == null) {
                    String a10 = C11818a.a("Analytics view name not defined.", (Throwable) null);
                    if (a10 != null) {
                        str5 = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                if (str6 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, c11, (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str4) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str7 = str6;
                bVar.a(eVar, str7, false, (Throwable) null, str5);
                str6 = str7;
                c11 = '$';
            }
            return;
        }
        for (Ae.a a11 : this.f63394e) {
            a11.a(activity, str3, f(this, (Bundle) null, 1, (Object) null), this.f63396g);
        }
        if (this.f63396g) {
            qv.e eVar2 = qv.e.DEBUG;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str8 = null;
            String str9 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str8 == null) {
                    String a12 = C11818a.a("Track view: " + str3, (Throwable) null);
                    if (a12 == null) {
                        break;
                    }
                    str8 = C11820c.a(a12);
                }
                if (str9 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    str2 = str4;
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str9 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str2) + DslKt.INDICATOR_SEPARATOR + name2;
                } else {
                    str2 = str4;
                }
                bVar2.a(eVar2, str9, false, (Throwable) null, str8);
                str4 = str2;
            }
            Bundle bundle = new Bundle();
            bundle.putString("screen_name", str3);
            bundle.putString("screen_class", str3);
            this.f63391b.a("screen_view", bundle);
            return;
        }
        String str10 = str4;
        qv.e eVar3 = qv.e.WARN;
        ArrayList<C11819b> arrayList3 = new ArrayList<>();
        for (Object next3 : d.f102012a.a()) {
            if (((C11819b) next3).b(eVar3, false)) {
                arrayList3.add(next3);
            }
        }
        String str11 = null;
        String str12 = null;
        for (C11819b bVar3 : arrayList3) {
            if (str11 == null) {
                String a13 = C11818a.a("Not tracking view: " + str3, (Throwable) null);
                if (a13 != null) {
                    str11 = C11820c.a(a13);
                } else {
                    return;
                }
            }
            if (str12 == null) {
                String name3 = cls.getName();
                C17542s.g(name3);
                c10 = '$';
                String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o14.length() != 0) {
                    name3 = C15854t.P0(o14, "Kt");
                }
                str12 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str10) + DslKt.INDICATOR_SEPARATOR + name3;
            } else {
                c10 = '$';
            }
            char c12 = c10;
            bVar3.a(eVar3, str12, false, (Throwable) null, str11);
        }
    }

    public void i(Map<String, ? extends Object> map) {
        C17542s.j(map, "values");
        this.f63395f.putAll(Ae.e.f58681a.a(map));
        this.f63391b.d(this.f63395f);
    }

    public void track(String str, Map<String, ? extends Object> map) {
        C17542s.j(str, "eventKey");
        Bundle a10 = Ae.e.f58681a.a(map);
        for (Ae.a b10 : this.f63394e) {
            b10.b(str, d(a10), this.f63396g);
        }
        Fe.a.f60482a.a(str);
        Fe.b.f60484a.a(map);
        if (this.f63396g) {
            new a(str, a10).c(this.f63391b);
            return;
        }
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str2 = null;
        String str3 = null;
        for (C11819b bVar : arrayList) {
            if (str2 == null) {
                String a11 = C11818a.a("Not tracking event: " + str, (Throwable) null);
                if (a11 != null) {
                    str2 = C11820c.a(a11);
                } else {
                    return;
                }
            }
            String str4 = str2;
            if (str3 == null) {
                String name = e.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str5 = str3;
            bVar.a(eVar, str5, false, (Throwable) null, str4);
            str2 = str4;
            str3 = str5;
        }
    }
}
