package Qi;

import D4.C6429c;
import D4.M;
import D4.O;
import Gi.C10716c;
import HJ.C15854t;
import Li.C10765a;
import Li.b;
import Mi.C10768c;
import Mi.C10770e;
import Mi.C10772g;
import Mi.C10774i;
import Mi.C10775j;
import Mi.C10776k;
import Mi.m;
import Mi.n;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import Qi.C10902a;
import Ri.C10911a;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.t;
import XH.y;
import YH.X;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.ingka.ikea.app.ratingsandreviews.navigation.ReviewsRoute;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import nI.p;
import nI.q;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0001=B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010,\u001a\u00020\u001a8\u0000X\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020.0-8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001d\u00106\u001a\b\u0012\u0004\u0012\u00020.028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b \u00105R\u001c\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001070-8\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00100R\u001f\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u000107028\u0006¢\u0006\f\n\u0004\b:\u00104\u001a\u0004\b;\u00105¨\u0006>"}, d2 = {"LQi/b;", "Landroidx/lifecycle/f0;", "Landroidx/lifecycle/U;", "savedStateHandle", "LLi/b;", "reviewsRepository", "LLi/a;", "reviewsPaginationManager", "LGi/c;", "reviewsAnalytics", "LRi/b;", "writeReviewButtonUseCase", "<init>", "(Landroidx/lifecycle/U;LLi/b;LLi/a;LGi/c;LRi/b;)V", "LLi/c;", "sortingData", "LXH/N;", "E", "(LLi/c;)V", "K", "H", "()V", "", "translateReview", "I", "(Z)V", "", "reviewId", "isHelpful", "G", "(Ljava/lang/String;Z)V", "J", "m", "LLi/b;", "n", "LLi/a;", "o", "LGi/c;", "p", "LRi/b;", "q", "Ljava/lang/String;", "D", "()Ljava/lang/String;", "itemNo", "LTJ/B;", "LQi/b$a;", "r", "LTJ/B;", "_uiState", "LTJ/P;", "s", "LTJ/P;", "()LTJ/P;", "uiState", "LQi/a;", "t", "_uiEvent", "u", "y", "uiEvent", "a", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Qi.b  reason: case insensitive filesystem */
public final class C10903b extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final b f85842m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final C10765a f85843n;

    /* renamed from: o  reason: collision with root package name */
    private final C10716c f85844o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final Ri.b f85845p;

    /* renamed from: q  reason: collision with root package name */
    private final String f85846q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final C16505B<a> f85847r;

    /* renamed from: s  reason: collision with root package name */
    private final C16519P<a> f85848s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public final C16505B<C10902a> f85849t;

    /* renamed from: u  reason: collision with root package name */
    private final C16519P<C10902a> f85850u;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LQi/b$a;", "", "<init>", "()V", "b", "a", "c", "LQi/b$a$a;", "LQi/b$a$b;", "LQi/b$a$c;", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Qi.b$a */
    public static abstract class a {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LQi/b$a$a;", "LQi/b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Qi.b$a$a  reason: collision with other inner class name */
        public static final class C1752a extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final C1752a f85851a = new C1752a();

            private C1752a() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1752a);
            }

            public int hashCode() {
                return 1747941346;
            }

            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LQi/b$a$b;", "LQi/b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Qi.b$a$b  reason: collision with other inner class name */
        public static final class C1753b extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final C1753b f85852a = new C1753b();

            private C1753b() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1753b);
            }

            public int hashCode() {
                return -2039908202;
            }

            public String toString() {
                return "Loading";
            }
        }

        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, d2 = {"LQi/b$a$c;", "LQi/b$a;", "LMi/g;", "productDetailsSummary", "LTJ/g;", "LD4/M;", "LMi/i;", "reviewPagingData", "LTJ/P;", "LRi/a;", "writeReviewButtonData", "<init>", "(LMi/g;LTJ/g;LTJ/P;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LMi/g;", "()LMi/g;", "b", "LTJ/g;", "()LTJ/g;", "c", "LTJ/P;", "()LTJ/P;", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Qi.b$a$c */
        public static final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            private final C10772g f85853a;

            /* renamed from: b  reason: collision with root package name */
            private final C16532g<M<C10774i>> f85854b;

            /* renamed from: c  reason: collision with root package name */
            private final C16519P<C10911a> f85855c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(C10772g gVar, C16532g<M<C10774i>> gVar2, C16519P<? extends C10911a> p10) {
                super((DefaultConstructorMarker) null);
                C17542s.j(gVar, "productDetailsSummary");
                C17542s.j(gVar2, "reviewPagingData");
                C17542s.j(p10, "writeReviewButtonData");
                this.f85853a = gVar;
                this.f85854b = gVar2;
                this.f85855c = p10;
            }

            public final C10772g a() {
                return this.f85853a;
            }

            public final C16532g<M<C10774i>> b() {
                return this.f85854b;
            }

            public final C16519P<C10911a> c() {
                return this.f85855c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return C17542s.e(this.f85853a, cVar.f85853a) && C17542s.e(this.f85854b, cVar.f85854b) && C17542s.e(this.f85855c, cVar.f85855c);
            }

            public int hashCode() {
                return (((this.f85853a.hashCode() * 31) + this.f85854b.hashCode()) * 31) + this.f85855c.hashCode();
            }

            public String toString() {
                C10772g gVar = this.f85853a;
                C16532g<M<C10774i>> gVar2 = this.f85854b;
                C16519P<C10911a> p10 = this.f85855c;
                return "Success(productDetailsSummary=" + gVar + ", reviewPagingData=" + gVar2 + ", writeReviewButtonData=" + p10 + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Qi/b$b", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Qi.b$b  reason: collision with other inner class name */
    public static final class C1754b extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C10903b f85856a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1754b(N.a aVar, C10903b bVar) {
            super(aVar);
            this.f85856a = bVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
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
                    String a10 = C11818a.a((String) null, th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "Unable to fetch reviews";
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
            this.f85856a.f85847r.setValue(a.C1752a.f85851a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.ratingsandreviews.presentation.viewmodel.ReviewsViewModel$loadData$2", f = "ReviewsViewModel.kt", l = {96, 98}, m = "invokeSuspend")
    /* renamed from: Qi.b$c */
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f85857c;

        /* renamed from: d  reason: collision with root package name */
        Object f85858d;

        /* renamed from: e  reason: collision with root package name */
        int f85859e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C10903b f85860f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Li.c f85861g;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "reviewsVotedFor", "LD4/M;", "LMi/i;", "pagingData", "<anonymous>", "(Ljava/util/List;LD4/M;)LD4/M;"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.ingka.ikea.app.ratingsandreviews.presentation.viewmodel.ReviewsViewModel$loadData$2$pagedReviews$1", f = "ReviewsViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: Qi.b$c$a */
        static final class a extends l implements q<List<? extends String>, M<C10774i>, C17164e<? super M<C10774i>>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f85862c;

            /* renamed from: d  reason: collision with root package name */
            /* synthetic */ Object f85863d;

            /* renamed from: e  reason: collision with root package name */
            /* synthetic */ Object f85864e;

            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LMi/i;", "reviewItem", "<anonymous>", "(LMi/i;)LMi/i;"}, k = 3, mv = {2, 1, 0})
            @f(c = "com.ingka.ikea.app.ratingsandreviews.presentation.viewmodel.ReviewsViewModel$loadData$2$pagedReviews$1$1", f = "ReviewsViewModel.kt", l = {}, m = "invokeSuspend")
            /* renamed from: Qi.b$c$a$a  reason: collision with other inner class name */
            static final class C1755a extends l implements p<C10774i, C17164e<? super C10774i>, Object> {

                /* renamed from: c  reason: collision with root package name */
                int f85865c;

                /* renamed from: d  reason: collision with root package name */
                /* synthetic */ Object f85866d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ List<String> f85867e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C1755a(List<String> list, C17164e<? super C1755a> eVar) {
                    super(2, eVar);
                    this.f85867e = list;
                }

                public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                    C1755a aVar = new C1755a(this.f85867e, eVar);
                    aVar.f85866d = obj;
                    return aVar;
                }

                /* renamed from: i */
                public final Object invoke(C10774i iVar, C17164e<? super C10774i> eVar) {
                    return ((C1755a) create(iVar, eVar)).invokeSuspend(C16807N.f139792a);
                }

                public final Object invokeSuspend(Object obj) {
                    C17187b.f();
                    if (this.f85865c == 0) {
                        y.b(obj);
                        C10774i iVar = (C10774i) this.f85866d;
                        if (iVar instanceof C10775j) {
                            C10775j jVar = (C10775j) iVar;
                            boolean contains = this.f85867e.contains(jVar.g());
                            return C10775j.c(jVar, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, false, (C10776k) null, (n) null, false, contains ? jVar.i() + 1 : jVar.i(), contains, 8191, (Object) null);
                        } else if ((iVar instanceof C10768c) || (iVar instanceof C10770e) || (iVar instanceof m)) {
                            return iVar;
                        } else {
                            throw new t();
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }

            a(C17164e<? super a> eVar) {
                super(3, eVar);
            }

            /* renamed from: i */
            public final Object invoke(List<String> list, M<C10774i> m10, C17164e<? super M<C10774i>> eVar) {
                a aVar = new a(eVar);
                aVar.f85863d = list;
                aVar.f85864e = m10;
                return aVar.invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f85862c == 0) {
                    y.b(obj);
                    return O.a((M) this.f85864e, new C1755a((List) this.f85863d, (C17164e<? super C1755a>) null));
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C10903b bVar, Li.c cVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f85860f = bVar;
            this.f85861g = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f85860f, this.f85861g, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C16532g<R> gVar;
            C10772g gVar2;
            Object f10 = C17187b.f();
            int i10 = this.f85859e;
            if (i10 == 0) {
                y.b(obj);
                this.f85860f.f85847r.setValue(a.C1753b.f85852a);
                C16532g<R> n10 = C16534i.n(this.f85860f.f85842m.f(), C6429c.a(this.f85860f.f85843n.a(this.f85860f.D(), this.f85861g), g0.a(this.f85860f)), new a((C17164e<? super a>) null));
                b i11 = this.f85860f.f85842m;
                String D10 = this.f85860f.D();
                this.f85857c = n10;
                this.f85859e = 1;
                Object a10 = i11.a(D10, this);
                if (a10 == f10) {
                    return f10;
                }
                Object obj2 = a10;
                gVar = n10;
                obj = obj2;
            } else if (i10 == 1) {
                gVar = (C16532g) this.f85857c;
                y.b(obj);
            } else if (i10 == 2) {
                gVar2 = (C10772g) this.f85858d;
                gVar = (C16532g) this.f85857c;
                y.b(obj);
                this.f85860f.f85847r.setValue(new a.c(gVar2, gVar, (C16519P) obj));
                return C16807N.f139792a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C10772g gVar3 = (C10772g) obj;
            C16532g<C10911a> a11 = this.f85860f.f85845p.a(this.f85860f.D());
            Q a12 = g0.a(this.f85860f);
            this.f85857c = gVar;
            this.f85858d = gVar3;
            this.f85859e = 2;
            Object d02 = C16534i.d0(a11, a12, this);
            if (d02 == f10) {
                return f10;
            }
            gVar2 = gVar3;
            obj = d02;
            this.f85860f.f85847r.setValue(new a.c(gVar2, gVar, (C16519P) obj));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Qi/b$d", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Qi.b$d */
    public static final class d extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C10903b f85868a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(N.a aVar, C10903b bVar) {
            super(aVar);
            this.f85868a = bVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
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
                    String a10 = C11818a.a((String) null, th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "Mark review helpful failed";
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
            this.f85868a.f85849t.setValue(C10902a.C1751a.f85841a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.ratingsandreviews.presentation.viewmodel.ReviewsViewModel$onHelpfulClicked$2", f = "ReviewsViewModel.kt", l = {132}, m = "invokeSuspend")
    /* renamed from: Qi.b$e */
    static final class e extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f85869c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C10903b f85870d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f85871e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C10903b bVar, String str, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f85870d = bVar;
            this.f85871e = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f85870d, this.f85871e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f85869c;
            if (i10 == 0) {
                y.b(obj);
                b i11 = this.f85870d.f85842m;
                String str = this.f85871e;
                this.f85869c = 1;
                if (i11.d(str, this) == f10) {
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

    public C10903b(U u10, b bVar, C10765a aVar, C10716c cVar, Ri.b bVar2) {
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(bVar, "reviewsRepository");
        C17542s.j(aVar, "reviewsPaginationManager");
        C17542s.j(cVar, "reviewsAnalytics");
        C17542s.j(bVar2, "writeReviewButtonUseCase");
        this.f85842m = bVar;
        this.f85843n = aVar;
        this.f85844o = cVar;
        this.f85845p = bVar2;
        this.f85846q = ((ReviewsRoute) x4.O.a(u10, P.b(ReviewsRoute.class), X.j())).b();
        C16505B<a> a10 = C16521S.a(a.C1753b.f85852a);
        this.f85847r = a10;
        this.f85848s = C16534i.c(a10);
        C16505B<C10902a> a11 = C16521S.a(null);
        this.f85849t = a11;
        this.f85850u = a11;
        F(this, (Li.c) null, 1, (Object) null);
    }

    private final void E(Li.c cVar) {
        F0 unused = C16314k.d(g0.a(this), new C1754b(N.f137593c0, this), (T) null, new c(this, cVar, (C17164e<? super c>) null), 2, (Object) null);
    }

    static /* synthetic */ void F(C10903b bVar, Li.c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cVar = null;
        }
        bVar.E(cVar);
    }

    public final String D() {
        return this.f85846q;
    }

    public final void G(String str, boolean z10) {
        C17542s.j(str, "reviewId");
        this.f85844o.d(z10, this.f85846q);
        F0 unused = C16314k.d(g0.a(this), new d(N.f137593c0, this), (T) null, new e(this, str, (C17164e<? super e>) null), 2, (Object) null);
    }

    public final void H() {
        this.f85844o.a(this.f85846q);
    }

    public final void I(boolean z10) {
        this.f85844o.b(z10, this.f85846q);
    }

    public final void J() {
        this.f85849t.setValue(null);
    }

    public final void K(Li.c cVar) {
        C17542s.j(cVar, "sortingData");
        this.f85844o.c(cVar.b(), this.f85846q);
        E(cVar);
    }

    public final C16519P<a> m() {
        return this.f85848s;
    }

    public final C16519P<C10902a> y() {
        return this.f85850u;
    }
}
