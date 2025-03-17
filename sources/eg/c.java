package Eg;

import Cg.a;
import Eg.b;
import HJ.C15854t;
import QJ.C16297b0;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16534i;
import XH.C16807N;
import XH.t;
import XH.y;
import YH.C16877v;
import androidx.lifecycle.F;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.ingka.ikea.analytics.Interaction$Component;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import ip.C11410b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import nI.q;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import zg.C10548a;
import zg.C10550c;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001NB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001a\u001a\u00020\r*\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\u001d\u0010%\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u0012¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\b¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\b¢\u0006\u0004\b)\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001c\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0.8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001f\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0016\u0010:\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u001c\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010<0;8\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\r0;8\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010>R\u001d\u0010G\u001a\b\u0012\u0004\u0012\u00020C0B8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\b*\u0010FR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X.¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010M\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006O"}, d2 = {"LEg/c;", "Landroidx/lifecycle/f0;", "Lzg/a;", "feedbackRepository", "LDg/a;", "analytics", "<init>", "(Lzg/a;LDg/a;)V", "LXH/N;", "J", "(LdI/e;)Ljava/lang/Object;", "LEg/a;", "newState", "", "clearNoQuestionsFeedback", "M", "(LEg/a;Z)V", "", "", "", "rating", "", "Lzg/c;", "D", "(Ljava/util/Map;I)Ljava/util/List;", "maxCharLimit", "F", "(LEg/a;I)Z", "LEg/b;", "surveyConfig", "K", "(LEg/b;)V", "LCg/a;", "I", "(LCg/a;)V", "id", "text", "L", "(Ljava/lang/String;Ljava/lang/String;)V", "H", "()V", "G", "m", "Lzg/a;", "n", "LDg/a;", "Lip/b;", "o", "Lip/b;", "_surveySent", "Landroidx/lifecycle/F;", "p", "Landroidx/lifecycle/F;", "E", "()Landroidx/lifecycle/F;", "surveySent", "q", "LEg/a;", "surveyRatingState", "LTJ/B;", "LEg/c$a$c;", "r", "LTJ/B;", "uiContent", "s", "surveyHidden", "LTJ/P;", "LEg/c$a;", "t", "LTJ/P;", "()LTJ/P;", "uiState", "u", "LEg/b;", "LQJ/F0;", "v", "LQJ/F0;", "feedbackJob", "a", "inappfeedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends f0 {

    /* renamed from: w  reason: collision with root package name */
    public static final int f60231w = 8;

    /* renamed from: m  reason: collision with root package name */
    private final C10548a f60232m;

    /* renamed from: n  reason: collision with root package name */
    private final Dg.a f60233n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final C11410b<Cg.a> f60234o;

    /* renamed from: p  reason: collision with root package name */
    private final F<Cg.a> f60235p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public a f60236q = new a((Cg.a) null, (Map) null, false, false, 15, (DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final C16505B<a.C0984c> f60237r;

    /* renamed from: s  reason: collision with root package name */
    private final C16505B<Boolean> f60238s;

    /* renamed from: t  reason: collision with root package name */
    private final C16519P<a> f60239t;

    /* renamed from: u  reason: collision with root package name */
    private b f60240u;

    /* renamed from: v  reason: collision with root package name */
    private F0 f60241v;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LEg/c$a;", "", "<init>", "()V", "c", "a", "b", "LEg/c$a$a;", "LEg/c$a$b;", "LEg/c$a$c;", "inappfeedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public static final int f60242a = 0;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEg/c$a$a;", "LEg/c$a;", "<init>", "()V", "inappfeedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Eg.c$a$a  reason: collision with other inner class name */
        public static final class C0983a extends a {

            /* renamed from: b  reason: collision with root package name */
            public static final C0983a f60243b = new C0983a();

            private C0983a() {
                super((DefaultConstructorMarker) null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEg/c$a$b;", "LEg/c$a;", "<init>", "()V", "inappfeedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b extends a {

            /* renamed from: b  reason: collision with root package name */
            public static final b f60244b = new b();

            private b() {
                super((DefaultConstructorMarker) null);
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0019\u0010!¨\u0006\""}, d2 = {"LEg/c$a$c;", "LEg/c$a;", "LEg/b;", "surveyConfig", "LEg/a;", "ratingState", "", "noQuestionsFeedback", "", "showNoQuestionsView", "<init>", "(LEg/b;LEg/a;Ljava/lang/Integer;Z)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "LEg/b;", "d", "()LEg/b;", "c", "LEg/a;", "()LEg/a;", "Ljava/lang/Integer;", "a", "()Ljava/lang/Integer;", "e", "Z", "()Z", "inappfeedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Eg.c$a$c  reason: collision with other inner class name */
        public static final class C0984c extends a {

            /* renamed from: f  reason: collision with root package name */
            public static final int f60245f = 8;

            /* renamed from: b  reason: collision with root package name */
            private final b f60246b;

            /* renamed from: c  reason: collision with root package name */
            private final a f60247c;

            /* renamed from: d  reason: collision with root package name */
            private final Integer f60248d;

            /* renamed from: e  reason: collision with root package name */
            private final boolean f60249e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0984c(b bVar, a aVar, Integer num, boolean z10) {
                super((DefaultConstructorMarker) null);
                C17542s.j(bVar, "surveyConfig");
                C17542s.j(aVar, "ratingState");
                this.f60246b = bVar;
                this.f60247c = aVar;
                this.f60248d = num;
                this.f60249e = z10;
            }

            public final Integer a() {
                return this.f60248d;
            }

            public final a b() {
                return this.f60247c;
            }

            public final boolean c() {
                return this.f60249e;
            }

            public final b d() {
                return this.f60246b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0984c)) {
                    return false;
                }
                C0984c cVar = (C0984c) obj;
                return C17542s.e(this.f60246b, cVar.f60246b) && C17542s.e(this.f60247c, cVar.f60247c) && C17542s.e(this.f60248d, cVar.f60248d) && this.f60249e == cVar.f60249e;
            }

            public int hashCode() {
                int hashCode = ((this.f60246b.hashCode() * 31) + this.f60247c.hashCode()) * 31;
                Integer num = this.f60248d;
                return ((hashCode + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.f60249e);
            }

            public String toString() {
                b bVar = this.f60246b;
                a aVar = this.f60247c;
                Integer num = this.f60248d;
                boolean z10 = this.f60249e;
                return "SurveyDetails(surveyConfig=" + bVar + ", ratingState=" + aVar + ", noQuestionsFeedback=" + num + ", showNoQuestionsView=" + z10 + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Eg/c$b", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f60250a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(N.a aVar, c cVar) {
            super(aVar);
            this.f60250a = cVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            c cVar = this.f60250a;
            qv.e eVar = qv.e.WARN;
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
                    String a10 = C11818a.a("Unable to send survey", th2);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = cVar.getClass().getName();
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
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.inappfeedback.survey.viewmodels.SurveyViewModel$sendSurvey$2", f = "SurveyViewModel.kt", l = {166}, m = "invokeSuspend")
    /* renamed from: Eg.c$c  reason: collision with other inner class name */
    static final class C0985c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f60251c;

        /* renamed from: d  reason: collision with root package name */
        Object f60252d;

        /* renamed from: e  reason: collision with root package name */
        Object f60253e;

        /* renamed from: f  reason: collision with root package name */
        Object f60254f;

        /* renamed from: g  reason: collision with root package name */
        Object f60255g;

        /* renamed from: h  reason: collision with root package name */
        Object f60256h;

        /* renamed from: i  reason: collision with root package name */
        Object f60257i;

        /* renamed from: j  reason: collision with root package name */
        Object f60258j;

        /* renamed from: k  reason: collision with root package name */
        int f60259k;

        /* renamed from: l  reason: collision with root package name */
        int f60260l;

        /* renamed from: m  reason: collision with root package name */
        int f60261m;

        /* renamed from: n  reason: collision with root package name */
        int f60262n;

        /* renamed from: o  reason: collision with root package name */
        int f60263o;

        /* renamed from: p  reason: collision with root package name */
        int f60264p;

        /* renamed from: q  reason: collision with root package name */
        private /* synthetic */ Object f60265q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ c f60266r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0985c(c cVar, C17164e<? super C0985c> eVar) {
            super(2, eVar);
            this.f60266r = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C0985c cVar = new C0985c(this.f60266r, eVar);
            cVar.f60265q = obj;
            return cVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C0985c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: qv.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.util.ArrayList} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                r22 = this;
                r0 = r22
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f60264p
                r3 = 1
                if (r2 == 0) goto L_0x003a
                if (r2 != r3) goto L_0x0032
                java.lang.Object r1 = r0.f60257i
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r1 = r0.f60256h
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.lang.Object r1 = r0.f60255g
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f60254f
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f60253e
                qv.e r1 = (qv.e) r1
                java.lang.Object r1 = r0.f60252d
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f60251c
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f60265q
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r23)
                goto L_0x014c
            L_0x0032:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x003a:
                XH.y.b(r23)
                java.lang.Object r2 = r0.f60265q
                QJ.Q r2 = (QJ.Q) r2
                qv.e r10 = qv.e.DEBUG
                qv.d r4 = qv.d.f102012a
                java.util.List r4 = r4.a()
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                java.util.Iterator r4 = r4.iterator()
            L_0x0054:
                boolean r5 = r4.hasNext()
                r12 = 0
                if (r5 == 0) goto L_0x006c
                java.lang.Object r5 = r4.next()
                r6 = r5
                qv.b r6 = (qv.C11819b) r6
                boolean r6 = r6.b(r10, r12)
                if (r6 == 0) goto L_0x0054
                r11.add(r5)
                goto L_0x0054
            L_0x006c:
                java.util.Iterator r13 = r11.iterator()
                r14 = 0
                r6 = r11
                r4 = r14
                r5 = r4
            L_0x0074:
                boolean r7 = r13.hasNext()
                r8 = 2
                if (r7 == 0) goto L_0x00f9
                java.lang.Object r15 = r13.next()
                r6 = r15
                qv.b r6 = (qv.C11819b) r6
                r9 = 0
                if (r4 != 0) goto L_0x0094
                java.lang.String r7 = "Send survey"
                java.lang.String r7 = qv.C11818a.a(r7, r9)
                if (r7 != 0) goto L_0x0090
                r6 = r15
                goto L_0x00f9
            L_0x0090:
                java.lang.String r4 = qv.C11820c.a(r7)
            L_0x0094:
                r16 = r4
                if (r5 != 0) goto L_0x00e5
                java.lang.Class r4 = r2.getClass()
                java.lang.String r4 = r4.getName()
                kotlin.jvm.internal.C17542s.g(r4)
                r5 = 36
                java.lang.String r5 = HJ.C15854t.s1(r4, r5, r14, r8, r14)
                r7 = 46
                java.lang.String r5 = HJ.C15854t.o1(r5, r7, r14, r8, r14)
                int r7 = r5.length()
                if (r7 != 0) goto L_0x00b6
                goto L_0x00bc
            L_0x00b6:
                java.lang.String r4 = "Kt"
                java.lang.String r4 = HJ.C15854t.P0(r5, r4)
            L_0x00bc:
                java.lang.Thread r5 = java.lang.Thread.currentThread()
                java.lang.String r5 = r5.getName()
                java.lang.String r7 = "main"
                boolean r5 = HJ.C15854t.b0(r5, r7, r3)
                if (r5 == 0) goto L_0x00cf
                java.lang.String r5 = "m"
                goto L_0x00d1
            L_0x00cf:
                java.lang.String r5 = "b"
            L_0x00d1:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r5)
                java.lang.String r5 = "|"
                r7.append(r5)
                r7.append(r4)
                java.lang.String r5 = r7.toString()
            L_0x00e5:
                r17 = r5
                r7 = 0
                r4 = r6
                r5 = r10
                r6 = r17
                r8 = r9
                r9 = r16
                r4.a(r5, r6, r7, r8, r9)
                r6 = r15
                r4 = r16
                r5 = r17
                goto L_0x0074
            L_0x00f9:
                Eg.c r7 = r0.f60266r
                ip.b r7 = r7.f60234o
                Eg.c r9 = r0.f60266r
                Eg.a r9 = r9.f60236q
                Cg.a r9 = r9.e()
                r7.d(r9)
                Eg.c r7 = r0.f60266r
                Eg.a r15 = r7.f60236q
                r20 = 11
                r21 = 0
                r16 = 0
                r17 = 0
                r18 = 1
                r19 = 0
                Eg.a r9 = Eg.a.b(r15, r16, r17, r18, r19, r20, r21)
                Eg.c.N(r7, r9, r12, r8, r14)
                Eg.c r7 = r0.f60266r
                r0.f60265q = r2
                r0.f60251c = r2
                r0.f60252d = r2
                r0.f60253e = r10
                r0.f60254f = r4
                r0.f60255g = r5
                r0.f60256h = r11
                r0.f60257i = r13
                r0.f60258j = r6
                r0.f60259k = r12
                r0.f60260l = r12
                r0.f60261m = r12
                r0.f60262n = r12
                r0.f60263o = r12
                r0.f60264p = r3
                java.lang.Object r2 = r7.J(r0)
                if (r2 != r1) goto L_0x014c
                return r1
            L_0x014c:
                XH.N r1 = XH.C16807N.f139792a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: Eg.c.C0985c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Eg/c$d", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f60267a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(N.a aVar, c cVar) {
            super(aVar);
            this.f60267a = cVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            c cVar = this.f60267a;
            qv.e eVar = qv.e.WARN;
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
                    String a10 = C11818a.a("Error waiting to clear feedback", th2);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = cVar.getClass().getName();
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
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.inappfeedback.survey.viewmodels.SurveyViewModel$setRating$2", f = "SurveyViewModel.kt", l = {105}, m = "invokeSuspend")
    static final class e extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f60268c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f60269d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(c cVar, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f60269d = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f60269d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f60268c;
            if (i10 == 0) {
                y.b(obj);
                long millis = TimeUnit.SECONDS.toMillis(3);
                this.f60268c = 1;
                if (C16297b0.b(millis, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.C0984c cVar = (a.C0984c) this.f60269d.f60237r.getValue();
            if (cVar == null) {
                c cVar2 = this.f60269d;
                cVar2.M(cVar2.f60236q, true);
            } else if (!cVar.b().f()) {
                c cVar3 = this.f60269d;
                cVar3.M(cVar3.f60236q, true);
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LEg/c$a$c;", "uiContent", "", "surveyHidden", "LEg/c$a;", "<anonymous>", "(LEg/c$a$c;Z)LEg/c$a;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.inappfeedback.survey.viewmodels.SurveyViewModel$uiState$1", f = "SurveyViewModel.kt", l = {}, m = "invokeSuspend")
    static final class f extends l implements q<a.C0984c, Boolean, C17164e<? super a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f60270c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f60271d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ boolean f60272e;

        f(C17164e<? super f> eVar) {
            super(3, eVar);
        }

        public final Object i(a.C0984c cVar, boolean z10, C17164e<? super a> eVar) {
            f fVar = new f(eVar);
            fVar.f60271d = cVar;
            fVar.f60272e = z10;
            return fVar.invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i((a.C0984c) obj, ((Boolean) obj2).booleanValue(), (C17164e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f60270c == 0) {
                y.b(obj);
                a.C0984c cVar = (a.C0984c) this.f60271d;
                return this.f60272e ? a.C0983a.f60243b : cVar != null ? cVar : a.b.f60244b;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public c(C10548a aVar, Dg.a aVar2) {
        C17542s.j(aVar, "feedbackRepository");
        C17542s.j(aVar2, "analytics");
        this.f60232m = aVar;
        this.f60233n = aVar2;
        C11410b<Cg.a> bVar = new C11410b<>();
        this.f60234o = bVar;
        this.f60235p = bVar;
        C16505B<a.C0984c> a10 = C16521S.a(null);
        this.f60237r = a10;
        C16505B<Boolean> a11 = C16521S.a(Boolean.FALSE);
        this.f60238s = a11;
        this.f60239t = C16534i.c0(C16534i.n(a10, a11, new f((C17164e<? super f>) null)), g0.a(this), ip.f.a(), a.b.f60244b);
    }

    private final List<C10550c> D(Map<String, String> map, int i10) {
        Object obj;
        String str;
        b bVar = this.f60240u;
        if (bVar == null) {
            C17542s.z("surveyConfig");
            bVar = null;
        }
        List a10 = d.b(bVar.f(), i10);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            if (((CharSequence) next.getValue()).length() > 0) {
                Iterable<b.a> iterable = a10;
                ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
                for (b.a a11 : iterable) {
                    arrayList.add(a11.a());
                }
                if (arrayList.contains(next.getKey())) {
                    linkedHashMap.put(next.getKey(), next.getValue());
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            Iterator it = a10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C17542s.e(((b.a) obj).a(), entry.getKey())) {
                    break;
                }
            }
            b.a aVar = (b.a) obj;
            if (aVar == null || (str = aVar.d()) == null) {
                str = "";
            }
            arrayList2.add(new C10550c(str2, str, str3));
        }
        return arrayList2;
    }

    private final boolean F(a aVar, int i10) {
        Map<String, String> d10;
        Cg.a e10 = aVar.e();
        List<C10550c> list = null;
        if (!(e10 == null || (d10 = aVar.d()) == null)) {
            list = D(d10, d.c(e10));
        }
        if (list == null) {
            return true;
        }
        Iterable<C10550c> iterable = list;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        for (C10550c a10 : iterable) {
            if (a10.a().length() > i10) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public final Object J(C17164e<? super C16807N> eVar) {
        int i10;
        b bVar = this.f60240u;
        List<C10550c> list = null;
        if (bVar == null) {
            C17542s.z("surveyConfig");
            bVar = null;
        }
        Cg.a e10 = this.f60236q.e();
        if (e10 != null) {
            i10 = d.c(e10);
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Submit survey without any rating set");
            qv.e eVar2 = qv.e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar2, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar2 : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a((String) null, illegalStateException);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = c.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar2.a(eVar2, str4, false, illegalStateException, str3);
                str = str3;
                str2 = str4;
            }
            i10 = 0;
        }
        int i11 = i10;
        Map<String, String> d10 = this.f60236q.d();
        if (d10 != null) {
            list = D(d10, i11);
        }
        C10548a aVar = this.f60232m;
        String d11 = bVar.d();
        if (list == null) {
            list = C16877v.n();
        }
        Object a11 = aVar.a(d11, i11, list, bVar.g(), eVar);
        return a11 == C17187b.f() ? a11 : C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final void M(a aVar, boolean z10) {
        c cVar = this;
        b bVar = cVar.f60240u;
        Integer num = null;
        if (bVar == null) {
            C17542s.z("surveyConfig");
            bVar = null;
        }
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar2 : arrayList) {
            if (str == null) {
                Cg.a e10 = aVar.e();
                String a10 = C11818a.a("Update rating state: " + (e10 != null ? Integer.valueOf(d.c(e10)) : null), (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = c.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar2.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        cVar.f60236q = a.b(aVar, (Cg.a) null, (Map) null, false, cVar.F(aVar, bVar.e()), 7, (Object) null);
        Cg.a e11 = aVar.e();
        List n10 = e11 == null ? C16877v.n() : d.b(bVar.f(), d.c(e11));
        if (!z10 && n10.isEmpty()) {
            Cg.a e12 = cVar.f60236q.e();
            if ((e12 instanceof a.c) || (e12 instanceof a.e) || (e12 instanceof a.d)) {
                num = Integer.valueOf(Oo.b.f84702l3);
            } else if ((e12 instanceof a.b) || (e12 instanceof a.C0970a)) {
                num = Integer.valueOf(Oo.b.f84713m3);
            } else if (e12 != null) {
                throw new t();
            }
        }
        C16505B<a.C0984c> b10 = cVar.f60237r;
        while (true) {
            a.C0984c value = b10.getValue();
            a.C0984c cVar2 = value;
            if (!b10.e(value, new a.C0984c(b.b(bVar, (String) null, (String) null, (String) null, (String) null, n10, (Interaction$Component) null, 0, 111, (Object) null), cVar.f60236q, num, n10.isEmpty()))) {
                cVar = this;
            } else {
                return;
            }
        }
    }

    static /* synthetic */ void N(c cVar, a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        cVar.M(aVar, z10);
    }

    public final F<Cg.a> E() {
        return this.f60235p;
    }

    public final void G() {
        Boolean value;
        C16505B<Boolean> b10 = this.f60238s;
        do {
            value = b10.getValue();
            value.booleanValue();
        } while (!b10.e(value, Boolean.TRUE));
    }

    public final void H() {
        F0 unused = C16314k.d(g0.a(this), new b(N.f137593c0, this), (T) null, new C0985c(this, (C17164e<? super C0985c>) null), 2, (Object) null);
    }

    public final void I(Cg.a aVar) {
        C17542s.j(aVar, "rating");
        N(this, a.b(this.f60236q, aVar, (Map) null, false, false, 14, (Object) null), false, 2, (Object) null);
        Dg.a aVar2 = this.f60233n;
        int c10 = d.c(aVar);
        b bVar = this.f60240u;
        if (bVar == null) {
            C17542s.z("surveyConfig");
            bVar = null;
        }
        aVar2.a(bVar.c(), c10);
        F0 f02 = this.f60241v;
        if (f02 != null) {
            F0.a.a(f02, (CancellationException) null, 1, (Object) null);
        }
        this.f60241v = C16314k.d(g0.a(this), new d(N.f137593c0, this), (T) null, new e(this, (C17164e<? super e>) null), 2, (Object) null);
    }

    public final void K(b bVar) {
        C17542s.j(bVar, "surveyConfig");
        this.f60240u = bVar;
        N(this, this.f60236q, false, 2, (Object) null);
    }

    public final void L(String str, String str2) {
        C17542s.j(str, "id");
        C17542s.j(str2, "text");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, String> d10 = this.f60236q.d();
        if (d10 != null) {
            linkedHashMap.putAll(d10);
        }
        linkedHashMap.put(str, str2);
        N(this, a.b(this.f60236q, (Cg.a) null, linkedHashMap, false, false, 13, (Object) null), false, 2, (Object) null);
    }

    public final C16519P<a> m() {
        return this.f60239t;
    }
}
