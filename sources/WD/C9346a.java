package Wd;

import Ae.h;
import Xd.a;
import Xd.b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\rJ\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"LWd/a;", "LWd/b;", "LXd/a;", "dynamicFieldsAnalytics", "LXd/b;", "submitSuccessEvent", "submitFailEvent", "deleteSuccessEvent", "deleteFailEvent", "<init>", "(LXd/a;LXd/b;LXd/b;LXd/b;LXd/b;)V", "LXH/N;", "b", "()V", "", "code", "c", "(Ljava/lang/String;)V", "d", "a", "LXd/a;", "LXd/b;", "e", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Wd.a  reason: case insensitive filesystem */
public final class C9346a implements C9347b {

    /* renamed from: a  reason: collision with root package name */
    private final a f64654a;

    /* renamed from: b  reason: collision with root package name */
    private final b f64655b;

    /* renamed from: c  reason: collision with root package name */
    private final b f64656c;

    /* renamed from: d  reason: collision with root package name */
    private final b f64657d;

    /* renamed from: e  reason: collision with root package name */
    private final b f64658e;

    public C9346a(a aVar, b bVar, b bVar2, b bVar3, b bVar4) {
        C17542s.j(aVar, "dynamicFieldsAnalytics");
        C17542s.j(bVar, "submitSuccessEvent");
        C17542s.j(bVar2, "submitFailEvent");
        this.f64654a = aVar;
        this.f64655b = bVar;
        this.f64656c = bVar2;
        this.f64657d = bVar3;
        this.f64658e = bVar4;
    }

    public void a(String str) {
        C17542s.j(str, "code");
        b bVar = this.f64658e;
        if (bVar != null) {
            this.f64654a.g(bVar, str);
        }
    }

    public void b() {
        h.a.a(this.f64654a, this.f64655b, (Map) null, 2, (Object) null);
    }

    public void c(String str) {
        C17542s.j(str, "code");
        this.f64654a.g(this.f64656c, str);
    }

    public void d() {
        b bVar = this.f64657d;
        if (bVar != null) {
            h.a.a(this.f64654a, bVar, (Map) null, 2, (Object) null);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9346a(a aVar, b bVar, b bVar2, b bVar3, b bVar4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, bVar, bVar2, (i10 & 8) != 0 ? null : bVar3, (i10 & 16) != 0 ? null : bVar4);
    }
}
