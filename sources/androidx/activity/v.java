package androidx.activity;

import XH.C16807N;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0006H'¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0014\u0010\u0013R*\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00028G@GX\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u0005R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR*\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001d8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Landroidx/activity/v;", "", "", "enabled", "<init>", "(Z)V", "LXH/N;", "remove", "()V", "Landroidx/activity/b;", "backEvent", "handleOnBackStarted", "(Landroidx/activity/b;)V", "handleOnBackProgressed", "handleOnBackPressed", "handleOnBackCancelled", "Landroidx/activity/c;", "cancellable", "addCancellable", "(Landroidx/activity/c;)V", "removeCancellable", "value", "isEnabled", "Z", "()Z", "setEnabled", "Ljava/util/concurrent/CopyOnWriteArrayList;", "cancellables", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lkotlin/Function0;", "enabledChangedCallback", "LnI/a;", "getEnabledChangedCallback$activity_release", "()LnI/a;", "setEnabledChangedCallback$activity_release", "(LnI/a;)V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class v {
    private final CopyOnWriteArrayList<C4988c> cancellables = new CopyOnWriteArrayList<>();
    private C17631a<C16807N> enabledChangedCallback;
    private boolean isEnabled;

    public v(boolean z10) {
        this.isEnabled = z10;
    }

    public final void addCancellable(C4988c cVar) {
        C17542s.j(cVar, "cancellable");
        this.cancellables.add(cVar);
    }

    public final C17631a<C16807N> getEnabledChangedCallback$activity_release() {
        return this.enabledChangedCallback;
    }

    public void handleOnBackCancelled() {
    }

    public abstract void handleOnBackPressed();

    public void handleOnBackProgressed(C4987b bVar) {
        C17542s.j(bVar, "backEvent");
    }

    public void handleOnBackStarted(C4987b bVar) {
        C17542s.j(bVar, "backEvent");
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void remove() {
        for (C4988c cancel : this.cancellables) {
            cancel.cancel();
        }
    }

    public final void removeCancellable(C4988c cVar) {
        C17542s.j(cVar, "cancellable");
        this.cancellables.remove(cVar);
    }

    public final void setEnabled(boolean z10) {
        this.isEnabled = z10;
        C17631a<C16807N> aVar = this.enabledChangedCallback;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void setEnabledChangedCallback$activity_release(C17631a<C16807N> aVar) {
        this.enabledChangedCallback = aVar;
    }
}
