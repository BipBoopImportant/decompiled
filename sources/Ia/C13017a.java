package IA;

import HA.C12960a;
import KA.C13123a;
import KA.C13124b;
import LA.C13173a;
import QJ.C16310i;
import QJ.M;
import QJ.Q;
import XH.C16807N;
import XH.y;
import com.ingka.ikea.shoppableimage.impl.data.network.ShoppableImageRemote;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LIA/a;", "LKA/b;", "LHA/a;", "shoppableImageEndpoint", "LQJ/M;", "ioDispatcher", "<init>", "(LHA/a;LQJ/M;)V", "", "imageId", "LKA/a;", "type", "LLA/a;", "a", "(Ljava/lang/String;LKA/a;LdI/e;)Ljava/lang/Object;", "LHA/a;", "b", "LQJ/M;", "shoppableimage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: IA.a  reason: case insensitive filesystem */
public final class C13017a implements C13124b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C12960a f110910a;

    /* renamed from: b  reason: collision with root package name */
    private final M f110911b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LLA/a;", "<anonymous>", "(LQJ/Q;)LLA/a;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.shoppableimage.impl.data.repository.ShoppableImageRepositoryImpl$getShoppableImage$2", f = "ShoppableImageRepositoryImpl.kt", l = {26}, m = "invokeSuspend")
    /* renamed from: IA.a$a  reason: collision with other inner class name */
    static final class C2676a extends l implements p<Q, C17164e<? super C13173a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f110912c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C13017a f110913d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C13123a f110914e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f110915f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2676a(C13017a aVar, C13123a aVar2, String str, C17164e<? super C2676a> eVar) {
            super(2, eVar);
            this.f110913d = aVar;
            this.f110914e = aVar2;
            this.f110915f = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C2676a(this.f110913d, this.f110914e, this.f110915f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C13173a> eVar) {
            return ((C2676a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f110912c;
            if (i10 == 0) {
                y.b(obj);
                C12960a b10 = this.f110913d.f110910a;
                String b11 = this.f110914e.b();
                String str = this.f110915f;
                this.f110912c = 1;
                obj = b10.a(b11, str, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return ((ShoppableImageRemote) obj).b();
        }
    }

    public C13017a(C12960a aVar, M m10) {
        C17542s.j(aVar, "shoppableImageEndpoint");
        C17542s.j(m10, "ioDispatcher");
        this.f110910a = aVar;
        this.f110911b = m10;
    }

    public Object a(String str, C13123a aVar, C17164e<? super C13173a> eVar) {
        return C16310i.g(this.f110911b, new C2676a(this, aVar, str, (C17164e<? super C2676a>) null), eVar);
    }
}
