package e;

import QJ.Q;
import SJ.C16438n;
import TJ.C16532g;
import XH.C16807N;
import androidx.activity.C4987b;
import androidx.activity.v;
import dI.C17164e;
import kotlin.Metadata;
import nI.p;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012(\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0016R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cRD\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"Le/k;", "Landroidx/activity/v;", "", "enabled", "LQJ/Q;", "onBackScope", "Lkotlin/Function2;", "LTJ/g;", "Landroidx/activity/b;", "LdI/e;", "LXH/N;", "", "currentOnBack", "<init>", "(ZLQJ/Q;LnI/p;)V", "b", "(Z)V", "backEvent", "handleOnBackStarted", "(Landroidx/activity/b;)V", "handleOnBackProgressed", "handleOnBackPressed", "()V", "handleOnBackCancelled", "LQJ/Q;", "getOnBackScope", "()LQJ/Q;", "c", "(LQJ/Q;)V", "LnI/p;", "getCurrentOnBack", "()LnI/p;", "a", "(LnI/p;)V", "Le/j;", "d", "Le/j;", "onBackInstance", "e", "Z", "isActive", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: e.k  reason: case insensitive filesystem */
final class C5288k extends v {

    /* renamed from: b  reason: collision with root package name */
    private Q f23184b;

    /* renamed from: c  reason: collision with root package name */
    private p<? super C16532g<C4987b>, ? super C17164e<? super C16807N>, ? extends Object> f23185c;

    /* renamed from: d  reason: collision with root package name */
    private C5287j f23186d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f23187e;

    public C5288k(boolean z10, Q q10, p<? super C16532g<C4987b>, ? super C17164e<? super C16807N>, ? extends Object> pVar) {
        super(z10);
        this.f23184b = q10;
        this.f23185c = pVar;
    }

    public final void a(p<? super C16532g<C4987b>, ? super C17164e<? super C16807N>, ? extends Object> pVar) {
        this.f23185c = pVar;
    }

    public final void b(boolean z10) {
        C5287j jVar;
        if (!z10 && !this.f23187e && isEnabled() && (jVar = this.f23186d) != null) {
            jVar.a();
        }
        setEnabled(z10);
    }

    public final void c(Q q10) {
        this.f23184b = q10;
    }

    public void handleOnBackCancelled() {
        super.handleOnBackCancelled();
        C5287j jVar = this.f23186d;
        if (jVar != null) {
            jVar.a();
        }
        C5287j jVar2 = this.f23186d;
        if (jVar2 != null) {
            jVar2.f(false);
        }
        this.f23187e = false;
    }

    public void handleOnBackPressed() {
        C5287j jVar = this.f23186d;
        if (jVar != null && !jVar.d()) {
            jVar.a();
            this.f23186d = null;
        }
        if (this.f23186d == null) {
            this.f23186d = new C5287j(this.f23184b, false, this.f23185c, this);
        }
        C5287j jVar2 = this.f23186d;
        if (jVar2 != null) {
            jVar2.b();
        }
        C5287j jVar3 = this.f23186d;
        if (jVar3 != null) {
            jVar3.f(false);
        }
        this.f23187e = false;
    }

    public void handleOnBackProgressed(C4987b bVar) {
        super.handleOnBackProgressed(bVar);
        C5287j jVar = this.f23186d;
        if (jVar != null) {
            C16438n.b(jVar.e(bVar));
        }
    }

    public void handleOnBackStarted(C4987b bVar) {
        super.handleOnBackStarted(bVar);
        C5287j jVar = this.f23186d;
        if (jVar != null) {
            jVar.a();
        }
        if (isEnabled()) {
            this.f23186d = new C5287j(this.f23184b, true, this.f23185c, this);
        }
        this.f23187e = true;
    }
}
