package Ri;

import Li.b;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import aA.C13909a;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.q;
import ug.k;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LRi/c;", "LRi/b;", "LLi/b;", "reviewsRepository", "LaA/a;", "sessionManager", "Lug/k;", "labsFeatures", "<init>", "(LLi/b;LaA/a;Lug/k;)V", "", "itemNo", "LTJ/g;", "LRi/a;", "a", "(Ljava/lang/String;)LTJ/g;", "LLi/b;", "b", "LaA/a;", "c", "Lug/k;", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final b f86400a;

    /* renamed from: b  reason: collision with root package name */
    private final C13909a f86401b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final k f86402c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "isLoggedIn", "", "", "writtenReviews", "LRi/a;", "<anonymous>", "(ZLjava/util/List;)LRi/a;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.ratingsandreviews.usecase.WriteReviewButtonUseCaseImpl$invoke$1", f = "WriteReviewButtonUseCase.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements q<Boolean, List<? extends String>, C17164e<? super C10911a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f86403c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ boolean f86404d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f86405e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ c f86406f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f86407g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar, String str, C17164e<? super a> eVar) {
            super(3, eVar);
            this.f86406f = cVar;
            this.f86407g = str;
        }

        public final Object i(boolean z10, List<String> list, C17164e<? super C10911a> eVar) {
            a aVar = new a(this.f86406f, this.f86407g, eVar);
            aVar.f86404d = z10;
            aVar.f86405e = list;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i(((Boolean) obj).booleanValue(), (List) obj2, (C17164e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f86403c == 0) {
                y.b(obj);
                return (!this.f86406f.f86402c.f() || ((List) this.f86405e).contains(this.f86407g)) ? C10911a.GONE : this.f86404d ? C10911a.WRITE_REVIEW : C10911a.LOGIN;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public c(b bVar, C13909a aVar, k kVar) {
        C17542s.j(bVar, "reviewsRepository");
        C17542s.j(aVar, "sessionManager");
        C17542s.j(kVar, "labsFeatures");
        this.f86400a = bVar;
        this.f86401b = aVar;
        this.f86402c = kVar;
    }

    public C16532g<C10911a> a(String str) {
        C17542s.j(str, "itemNo");
        return C16534i.n(this.f86401b.n(), this.f86400a.b(), new a(this, str, (C17164e<? super a>) null));
    }
}
