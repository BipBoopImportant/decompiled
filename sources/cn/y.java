package Cn;

import Cn.x;
import En.c;
import PD.d;
import XH.C16807N;
import XH.t;
import YC.C13857b;
import YC.C13860e;
import androidx.lifecycle.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0011\u001a\u00020\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"LCn/y;", "Landroidx/lifecycle/f0;", "LPD/d;", "getWebViewUrlUseCase", "LEn/a;", "webViewHeroUrlRedirectUseCase", "LYC/b;", "uiMode", "<init>", "(LPD/d;LEn/a;LYC/b;)V", "", "url", "Lkotlin/Function1;", "LCn/x;", "LXH/N;", "action", "", "z", "(Ljava/lang/String;LnI/l;)Z", "h", "(Ljava/lang/String;)Ljava/lang/String;", "m", "LPD/d;", "n", "LEn/a;", "o", "LYC/b;", "p", "a", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y extends f0 {

    /* renamed from: p  reason: collision with root package name */
    public static final a f79638p = new a((DefaultConstructorMarker) null);

    /* renamed from: q  reason: collision with root package name */
    public static final int f79639q = 8;

    /* renamed from: m  reason: collision with root package name */
    private final d f79640m;

    /* renamed from: n  reason: collision with root package name */
    private final En.a f79641n;

    /* renamed from: o  reason: collision with root package name */
    private final C13857b f79642o;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LCn/y$a;", "", "<init>", "()V", "", "REDIRECT_URL", "Ljava/lang/String;", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public y(d dVar, En.a aVar, C13857b bVar) {
        C17542s.j(dVar, "getWebViewUrlUseCase");
        C17542s.j(aVar, "webViewHeroUrlRedirectUseCase");
        C17542s.j(bVar, "uiMode");
        this.f79640m = dVar;
        this.f79641n = aVar;
        this.f79642o = bVar;
    }

    public final String h(String str) {
        C17542s.j(str, "url");
        return this.f79640m.a(str, "https://www.ikea.com/ikeaapp/_placeholder", C13857b.a.b(this.f79642o, (C13860e) null, 1, (Object) null));
    }

    public final boolean z(String str, C17642l<? super x, C16807N> lVar) {
        C17542s.j(lVar, "action");
        c a10 = this.f79641n.a(str);
        if (a10 instanceof c.a) {
            lVar.invoke(new x.a(((c.a) a10).a()));
            return true;
        } else if (C17542s.e(a10, c.b.f80742a)) {
            return false;
        } else {
            throw new t();
        }
    }
}
