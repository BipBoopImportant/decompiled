package cb;

import XH.C16807N;
import ab.C9404b;
import com.google.android.play.core.install.InstallState;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcb/b;", "Lab/b;", "listener", "Lkotlin/Function1;", "LXH/N;", "disposeAction", "<init>", "(Lab/b;LnI/l;)V", "Lcom/google/android/play/core/install/InstallState;", "state", "b", "(Lcom/google/android/play/core/install/InstallState;)V", "a", "Lab/b;", "getListener", "()Lab/b;", "LnI/l;", "getDisposeAction", "()LnI/l;", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_app_update_ktx"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: cb.b  reason: case insensitive filesystem */
final class C9448b implements C9404b {

    /* renamed from: a  reason: collision with root package name */
    private final C9404b f65673a;

    /* renamed from: b  reason: collision with root package name */
    private final C17642l<C9448b, C16807N> f65674b;

    public C9448b(C9404b bVar, C17642l<? super C9448b, C16807N> lVar) {
        C17542s.j(bVar, "listener");
        C17542s.j(lVar, "disposeAction");
        this.f65673a = bVar;
        this.f65674b = lVar;
    }

    /* renamed from: b */
    public final void a(InstallState installState) {
        C17542s.j(installState, "state");
        this.f65673a.a(installState);
        int c10 = installState.c();
        if (c10 == 0 || c10 == 11 || c10 == 5 || c10 == 6) {
            this.f65674b.invoke(this);
        }
    }
}
