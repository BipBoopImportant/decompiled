package Jp;

import Lp.b;
import Mp.d;
import QJ.C16310i;
import QJ.M;
import QJ.Q;
import XH.C16807N;
import XH.y;
import com.ingka.ikea.datalayer.impl.v6.StoryRemoteV6;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LJp/a;", "LIp/a;", "LLp/a;", "commercialContentEndpoint", "LLp/b;", "secureCommercialContentEndpoint", "LCx/b;", "publisherTokenManager", "LQJ/M;", "ioDispatcher", "<init>", "(LLp/a;LLp/b;LCx/b;LQJ/M;)V", "", "storyId", "LMp/d;", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LLp/a;", "b", "LLp/b;", "c", "LCx/b;", "d", "LQJ/M;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements Ip.a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Lp.a f82670a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final b f82671b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Cx.b f82672c;

    /* renamed from: d  reason: collision with root package name */
    private final M f82673d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LMp/d;", "<anonymous>", "(LQJ/Q;)LMp/d;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.datalayer.impl.CommercialContentRepositoryImpl$getStory$2", f = "CommercialContentRepositoryImpl.kt", l = {26, 32}, m = "invokeSuspend")
    /* renamed from: Jp.a$a  reason: collision with other inner class name */
    static final class C1626a extends l implements p<Q, C17164e<? super d>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f82674c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f82675d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f82676e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1626a(a aVar, String str, C17164e<? super C1626a> eVar) {
            super(2, eVar);
            this.f82675d = aVar;
            this.f82676e = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C1626a(this.f82675d, this.f82676e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super d> eVar) {
            return ((C1626a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            StoryRemoteV6 storyRemoteV6;
            Object f10 = C17187b.f();
            int i10 = this.f82674c;
            if (i10 == 0) {
                y.b(obj);
                if (this.f82675d.f82672c.d()) {
                    b d10 = this.f82675d.f82671b;
                    String str = this.f82676e;
                    String c10 = this.f82675d.f82672c.c();
                    this.f82674c = 1;
                    obj = d10.a(str, c10, 7, this);
                    if (obj == f10) {
                        return f10;
                    }
                } else {
                    Lp.a b10 = this.f82675d.f82670a;
                    String str2 = this.f82676e;
                    this.f82674c = 2;
                    obj = b10.a(str2, 7, this);
                    if (obj == f10) {
                        return f10;
                    }
                    storyRemoteV6 = (StoryRemoteV6) obj;
                    return storyRemoteV6.b(this.f82675d.f82672c.d());
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else if (i10 == 2) {
                y.b(obj);
                storyRemoteV6 = (StoryRemoteV6) obj;
                return storyRemoteV6.b(this.f82675d.f82672c.d());
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            storyRemoteV6 = (StoryRemoteV6) obj;
            return storyRemoteV6.b(this.f82675d.f82672c.d());
        }
    }

    public a(Lp.a aVar, b bVar, Cx.b bVar2, M m10) {
        C17542s.j(aVar, "commercialContentEndpoint");
        C17542s.j(bVar, "secureCommercialContentEndpoint");
        C17542s.j(bVar2, "publisherTokenManager");
        C17542s.j(m10, "ioDispatcher");
        this.f82670a = aVar;
        this.f82671b = bVar;
        this.f82672c = bVar2;
        this.f82673d = m10;
    }

    public Object a(String str, C17164e<? super d> eVar) {
        return C16310i.g(this.f82673d, new C1626a(this, str, (C17164e<? super C1626a>) null), eVar);
    }
}
