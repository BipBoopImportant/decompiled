package sD;

import HJ.C15854t;
import QJ.F0;
import QJ.M;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16521S;
import TJ.C16532g;
import XH.C16807N;
import XH.y;
import android.content.Context;
import android.content.SharedPreferences;
import com.ingka.ikea.app.base.UserPostalCodeAddress;
import com.optimizely.ab.config.FeatureVariable;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import eI.C17187b;
import gK.C17294a;
import jK.C17451f;
import java.util.ArrayList;
import java.util.List;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;
import sf.C10242c;
import sf.C10243d;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B/\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0!8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\"\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0&8\u0016X\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u001b\u0010)R\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110!8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010$R\"\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110&8\u0016X\u0004¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010)R\u001c\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110!8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u0010$R\"\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110&8\u0016X\u0004¢\u0006\f\n\u0004\b2\u0010(\u001a\u0004\b3\u0010)R\u001a\u00107\u001a\b\u0012\u0004\u0012\u0002050!8\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u0010$R \u00109\u001a\b\u0012\u0004\u0012\u0002050&8\u0016X\u0004¢\u0006\f\n\u0004\b8\u0010(\u001a\u0004\b-\u0010)R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u0002050!8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010$R \u0010=\u001a\b\u0012\u0004\u0012\u0002050&8\u0016X\u0004¢\u0006\f\n\u0004\b;\u0010(\u001a\u0004\b<\u0010)R \u0010B\u001a\n ?*\u0004\u0018\u00010>0>*\u00020\u00028BX\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR(\u0010F\u001a\u0004\u0018\u00010\"2\b\u0010C\u001a\u0004\u0018\u00010\"8V@VX\u000e¢\u0006\f\u001a\u0004\b6\u0010D\"\u0004\b0\u0010ER$\u0010K\u001a\u0002052\u0006\u0010C\u001a\u0002058V@VX\u000e¢\u0006\f\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR(\u0010O\u001a\u0004\u0018\u00010\u00112\b\u0010C\u001a\u0004\u0018\u00010\u00118V@VX\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010L\"\u0004\bM\u0010NR(\u0010Q\u001a\u0004\u0018\u00010\u00112\b\u0010C\u001a\u0004\u0018\u00010\u00118V@VX\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010L\"\u0004\bP\u0010NR$\u0010V\u001a\u00020R2\u0006\u0010C\u001a\u00020R8V@VX\u000e¢\u0006\f\u001a\u0004\b8\u0010S\"\u0004\bT\u0010UR$\u0010Y\u001a\u00020R2\u0006\u0010C\u001a\u00020R8V@VX\u000e¢\u0006\f\u001a\u0004\bW\u0010S\"\u0004\bX\u0010UR(\u0010^\u001a\u0004\u0018\u00010Z2\b\u0010C\u001a\u0004\u0018\u00010Z8V@VX\u000e¢\u0006\f\u001a\u0004\b[\u0010\\\"\u0004\b2\u0010]R$\u0010`\u001a\u0002052\u0006\u0010C\u001a\u0002058V@VX\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010H\"\u0004\b_\u0010JR$\u0010b\u001a\u0002052\u0006\u0010C\u001a\u0002058V@VX\u000e¢\u0006\f\u001a\u0004\b+\u0010H\"\u0004\ba\u0010JR$\u0010c\u001a\u00020\u00112\u0006\u0010C\u001a\u00020\u00118V@VX\u000e¢\u0006\f\u001a\u0004\b'\u0010L\"\u0004\b;\u0010NR$\u0010e\u001a\u0002052\u0006\u0010C\u001a\u0002058V@VX\u000e¢\u0006\f\u001a\u0004\bd\u0010H\"\u0004\b#\u0010J¨\u0006f"}, d2 = {"LsD/c;", "Lsf/c;", "Landroid/content/Context;", "context", "LQJ/M;", "dispatcher", "LQJ/Q;", "scope", "LkK/c;", "json", "<init>", "(Landroid/content/Context;LQJ/M;LQJ/Q;LkK/c;)V", "LXH/N;", "I", "()V", "", "Lcom/ingka/ikea/app/base/UserPostalCodeAddress$AdditionalValue;", "", "F", "(Ljava/util/List;)Ljava/lang/String;", "x", "a", "Landroid/content/Context;", "b", "LQJ/M;", "c", "LQJ/Q;", "d", "LkK/c;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "e", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "listener", "LTJ/B;", "Lcom/ingka/ikea/app/base/UserPostalCodeAddress;", "f", "LTJ/B;", "_postalCodeAddressFlow", "LTJ/g;", "g", "LTJ/g;", "()LTJ/g;", "postalCodeAddressFlow", "h", "_marketCodeFlow", "i", "n", "marketCodeFlow", "j", "_languageCodeFlow", "k", "y", "languageCodeFlow", "", "l", "_isInboxNotificationOptInShownFlow", "m", "isInboxNotificationOptInShownFlow", "_membershipTakeATourShownFlow", "o", "s", "membershipTakeATourShownFlow", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "H", "(Landroid/content/Context;)Landroid/content/SharedPreferences;", "preferences", "value", "()Lcom/ingka/ikea/app/base/UserPostalCodeAddress;", "(Lcom/ingka/ikea/app/base/UserPostalCodeAddress;)V", "postalCodeAddress", "v", "()Z", "A", "(Z)V", "regionSelected", "()Ljava/lang/String;", "B", "(Ljava/lang/String;)V", "marketCode", "p", "languageCode", "", "()J", "t", "(J)V", "abortCheckoutTimestamp", "u", "w", "dismissAbortCheckoutSurveyTimestamp", "Lsf/d;", "q", "()Lsf/d;", "(Lsf/d;)V", "preferredDeliveryOption", "z", "isCombinedCartOnboardingShown", "r", "isInboxNotificationOptInShown", "themeUiMode", "G", "membershipTakeATourShown", "userdataservice-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: sD.c  reason: case insensitive filesystem */
public final class C15039c implements C10242c {

    /* renamed from: a  reason: collision with root package name */
    private final Context f130938a;

    /* renamed from: b  reason: collision with root package name */
    private final M f130939b;

    /* renamed from: c  reason: collision with root package name */
    private final Q f130940c;

    /* renamed from: d  reason: collision with root package name */
    private final C17514c f130941d;

    /* renamed from: e  reason: collision with root package name */
    private SharedPreferences.OnSharedPreferenceChangeListener f130942e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final C16505B<UserPostalCodeAddress> f130943f;

    /* renamed from: g  reason: collision with root package name */
    private final C16532g<UserPostalCodeAddress> f130944g;

    /* renamed from: h  reason: collision with root package name */
    private final C16505B<String> f130945h;

    /* renamed from: i  reason: collision with root package name */
    private final C16532g<String> f130946i;

    /* renamed from: j  reason: collision with root package name */
    private final C16505B<String> f130947j;

    /* renamed from: k  reason: collision with root package name */
    private final C16532g<String> f130948k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final C16505B<Boolean> f130949l;

    /* renamed from: m  reason: collision with root package name */
    private final C16532g<Boolean> f130950m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final C16505B<Boolean> f130951n;

    /* renamed from: o  reason: collision with root package name */
    private final C16532g<Boolean> f130952o;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.userdataservice.impl.AppUserDataRepository$observeKeys$1$1", f = "AppUserDataRepository.kt", l = {191}, m = "invokeSuspend")
    /* renamed from: sD.c$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f130953c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C15039c f130954d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C15039c cVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f130954d = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f130954d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f130953c;
            if (i10 == 0) {
                y.b(obj);
                C16505B E10 = this.f130954d.f130943f;
                UserPostalCodeAddress l10 = this.f130954d.l();
                this.f130953c = 1;
                if (E10.emit(l10, this) == f10) {
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
    @f(c = "com.ingka.ikea.userdataservice.impl.AppUserDataRepository$observeKeys$1$2", f = "AppUserDataRepository.kt", l = {197}, m = "invokeSuspend")
    /* renamed from: sD.c$b */
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f130955c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C15039c f130956d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C15039c cVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f130956d = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f130956d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f130955c;
            if (i10 == 0) {
                y.b(obj);
                C16505B E10 = this.f130956d.f130943f;
                UserPostalCodeAddress l10 = this.f130956d.l();
                this.f130955c = 1;
                if (E10.emit(l10, this) == f10) {
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
    @f(c = "com.ingka.ikea.userdataservice.impl.AppUserDataRepository$observeKeys$1$3", f = "AppUserDataRepository.kt", l = {203}, m = "invokeSuspend")
    /* renamed from: sD.c$c  reason: collision with other inner class name */
    static final class C3240c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f130957c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C15039c f130958d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3240c(C15039c cVar, C17164e<? super C3240c> eVar) {
            super(2, eVar);
            this.f130958d = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C3240c(this.f130958d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C3240c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f130957c;
            if (i10 == 0) {
                y.b(obj);
                C16505B D10 = this.f130958d.f130951n;
                Boolean a10 = kotlin.coroutines.jvm.internal.b.a(this.f130958d.G());
                this.f130957c = 1;
                if (D10.emit(a10, this) == f10) {
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
    @f(c = "com.ingka.ikea.userdataservice.impl.AppUserDataRepository$observeKeys$1$4", f = "AppUserDataRepository.kt", l = {209}, m = "invokeSuspend")
    /* renamed from: sD.c$d */
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f130959c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C15039c f130960d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C15039c cVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f130960d = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f130960d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f130959c;
            if (i10 == 0) {
                y.b(obj);
                C16505B C10 = this.f130960d.f130949l;
                Boolean a10 = kotlin.coroutines.jvm.internal.b.a(this.f130960d.h());
                this.f130959c = 1;
                if (C10.emit(a10, this) == f10) {
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

    public C15039c(Context context, M m10, Q q10, C17514c cVar) {
        C17542s.j(context, "context");
        C17542s.j(m10, "dispatcher");
        C17542s.j(q10, "scope");
        C17542s.j(cVar, FeatureVariable.JSON_TYPE);
        this.f130938a = context;
        this.f130939b = m10;
        this.f130940c = q10;
        this.f130941d = cVar;
        C16505B<UserPostalCodeAddress> a10 = C16521S.a(l());
        this.f130943f = a10;
        this.f130944g = a10;
        C16505B<String> a11 = C16521S.a(c());
        this.f130945h = a11;
        this.f130946i = a11;
        C16505B<String> a12 = C16521S.a(a());
        this.f130947j = a12;
        this.f130948k = a12;
        C16505B<Boolean> a13 = C16521S.a(Boolean.valueOf(h()));
        this.f130949l = a13;
        this.f130950m = a13;
        C16505B<Boolean> a14 = C16521S.a(Boolean.valueOf(G()));
        this.f130951n = a14;
        this.f130952o = a14;
        I();
    }

    private final String F(List<UserPostalCodeAddress.AdditionalValue> list) {
        try {
            return this.f130941d.b(C17294a.h(UserPostalCodeAddress.AdditionalValue.Companion.serializer()), list);
        } catch (IllegalArgumentException e10) {
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Error converting to json", e10);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = list.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, e10, str3);
                str = str3;
                str2 = str4;
            }
            return null;
        }
    }

    private final SharedPreferences H(Context context) {
        return G4.b.a(context);
    }

    private final void I() {
        this.f130942e = new C15038b(this);
        H(this.f130938a).registerOnSharedPreferenceChangeListener(this.f130942e);
    }

    /* access modifiers changed from: private */
    public static final void J(C15039c cVar, SharedPreferences sharedPreferences, String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -2059362409:
                    if (str.equals("membership_take_a_tour_shown")) {
                        F0 unused = C16314k.d(cVar.f130940c, cVar.f130939b, (T) null, new C3240c(cVar, (C17164e<? super C3240c>) null), 2, (Object) null);
                        return;
                    }
                    return;
                case -327324545:
                    if (str.equals("area_code_key")) {
                        F0 unused2 = C16314k.d(cVar.f130940c, cVar.f130939b, (T) null, new b(cVar, (C17164e<? super b>) null), 2, (Object) null);
                        return;
                    }
                    return;
                case 735389185:
                    if (str.equals("postal_code_key")) {
                        F0 unused3 = C16314k.d(cVar.f130940c, cVar.f130939b, (T) null, new a(cVar, (C17164e<? super a>) null), 2, (Object) null);
                        return;
                    }
                    return;
                case 1431263198:
                    if (str.equals("inbox_notification_opt_in_shown")) {
                        F0 unused4 = C16314k.d(cVar.f130940c, cVar.f130939b, (T) null, new d(cVar, (C17164e<? super d>) null), 2, (Object) null);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public void A(boolean z10) {
        SharedPreferences H10 = H(this.f130938a);
        C17542s.i(H10, "<get-preferences>(...)");
        SharedPreferences.Editor edit = H10.edit();
        edit.putBoolean("region_selected", z10);
        edit.apply();
    }

    public void B(String str) {
        SharedPreferences H10 = H(this.f130938a);
        C17542s.i(H10, "<get-preferences>(...)");
        SharedPreferences.Editor edit = H10.edit();
        edit.putString("market_code_key", str);
        edit.apply();
        this.f130945h.setValue(str);
    }

    public boolean G() {
        return H(this.f130938a).getBoolean("membership_take_a_tour_shown", false);
    }

    public String a() {
        String string = H(this.f130938a).getString("language_code_key", "");
        return string == null ? "" : string;
    }

    public String c() {
        String string = H(this.f130938a).getString("market_code_key", "");
        return string == null ? "" : string;
    }

    public C16532g<UserPostalCodeAddress> d() {
        return this.f130944g;
    }

    public boolean e() {
        return H(this.f130938a).getBoolean("combined_cart_shown", false);
    }

    public void f(boolean z10) {
        SharedPreferences H10 = H(this.f130938a);
        C17542s.i(H10, "<get-preferences>(...)");
        SharedPreferences.Editor edit = H10.edit();
        edit.putBoolean("membership_take_a_tour_shown", z10);
        edit.apply();
    }

    public String g() {
        String string = H(this.f130938a).getString("theme_ui_mode", "");
        return string == null ? "" : string;
    }

    public boolean h() {
        return H(this.f130938a).getBoolean("inbox_notification_opt_in_shown", false);
    }

    public C16532g<Boolean> i() {
        return this.f130950m;
    }

    public void j(UserPostalCodeAddress userPostalCodeAddress) {
        ArrayList<UserPostalCodeAddress.AdditionalValue> a10;
        SharedPreferences H10 = H(this.f130938a);
        C17542s.i(H10, "<get-preferences>(...)");
        SharedPreferences.Editor edit = H10.edit();
        String str = null;
        edit.putString("postal_code_key", userPostalCodeAddress != null ? userPostalCodeAddress.d() : null);
        edit.putString("area_code_key", userPostalCodeAddress != null ? userPostalCodeAddress.c() : null);
        if (!(userPostalCodeAddress == null || (a10 = userPostalCodeAddress.a()) == null)) {
            str = F(a10);
        }
        edit.putString("address_additional_values_v2_key", str);
        edit.apply();
    }

    public void k(C10243d dVar) {
        SharedPreferences H10 = H(this.f130938a);
        C17542s.i(H10, "<get-preferences>(...)");
        SharedPreferences.Editor edit = H10.edit();
        edit.putString("preferred_delivery_option", dVar != null ? dVar.j() : null);
        edit.apply();
    }

    public UserPostalCodeAddress l() {
        List list;
        Object obj;
        ArrayList arrayList = null;
        String string = H(this.f130938a).getString("postal_code_key", (String) null);
        String string2 = H(this.f130938a).getString("area_code_key", (String) null);
        if (string == null) {
            return null;
        }
        String string3 = H(this.f130938a).getString("address_additional_values_v2_key", (String) null);
        if (string3 == null || string3.length() == 0) {
            string3 = null;
        }
        if (string3 != null) {
            try {
                C17514c b10 = Yz.b.f118278a.b();
                b10.a();
                obj = b10.c(C17294a.u(new C17451f(UserPostalCodeAddress.AdditionalValue.Companion.serializer())), string3);
            } catch (Exception e10) {
                e eVar = e.WARN;
                ArrayList<C11819b> arrayList2 = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList2.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList2) {
                    if (str == null) {
                        String a10 = C11818a.a((String) null, e10);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "Error deserializing json";
                    }
                    String str4 = str2;
                    bVar.a(eVar, str4, false, e10, str3);
                    str = str3;
                    str2 = str4;
                }
                obj = null;
            }
            list = (List) obj;
        } else {
            list = null;
        }
        if (list != null) {
            arrayList = new ArrayList(list);
        }
        return new UserPostalCodeAddress(string, string2, arrayList);
    }

    public long m() {
        return H(this.f130938a).getLong("abort_checkout_timestamp", 0);
    }

    public C16532g<String> n() {
        return this.f130946i;
    }

    public void o(String str) {
        C17542s.j(str, "value");
        SharedPreferences H10 = H(this.f130938a);
        C17542s.i(H10, "<get-preferences>(...)");
        SharedPreferences.Editor edit = H10.edit();
        edit.putString("theme_ui_mode", str);
        edit.apply();
    }

    public void p(String str) {
        SharedPreferences H10 = H(this.f130938a);
        C17542s.i(H10, "<get-preferences>(...)");
        SharedPreferences.Editor edit = H10.edit();
        edit.putString("language_code_key", str);
        edit.apply();
        this.f130947j.setValue(str);
    }

    public C10243d q() {
        return C10243d.Companion.a(H(this.f130938a).getString("preferred_delivery_option", (String) null));
    }

    public void r(boolean z10) {
        SharedPreferences H10 = H(this.f130938a);
        C17542s.i(H10, "<get-preferences>(...)");
        SharedPreferences.Editor edit = H10.edit();
        edit.putBoolean("inbox_notification_opt_in_shown", z10);
        edit.apply();
    }

    public C16532g<Boolean> s() {
        return this.f130952o;
    }

    public void t(long j10) {
        SharedPreferences H10 = H(this.f130938a);
        C17542s.i(H10, "<get-preferences>(...)");
        SharedPreferences.Editor edit = H10.edit();
        edit.putLong("abort_checkout_timestamp", j10);
        edit.apply();
    }

    public long u() {
        return H(this.f130938a).getLong("dismiss_abort_checkout_survey_timestamp", 0);
    }

    public boolean v() {
        return H(this.f130938a).getBoolean("region_selected", false);
    }

    public void w(long j10) {
        SharedPreferences H10 = H(this.f130938a);
        C17542s.i(H10, "<get-preferences>(...)");
        SharedPreferences.Editor edit = H10.edit();
        edit.putLong("dismiss_abort_checkout_survey_timestamp", j10);
        edit.apply();
    }

    public void x() {
        H(this.f130938a).edit().remove("postal_code_key").remove("preferred_delivery_option").apply();
    }

    public C16532g<String> y() {
        return this.f130948k;
    }

    public void z(boolean z10) {
        SharedPreferences H10 = H(this.f130938a);
        C17542s.i(H10, "<get-preferences>(...)");
        SharedPreferences.Editor edit = H10.edit();
        edit.putBoolean("combined_cart_shown", z10);
        edit.apply();
    }
}
