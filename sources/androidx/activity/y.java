package androidx.activity;

import XH.C16807N;
import androidx.lifecycle.C5221y;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\t\u001a\u00020\u0006*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/activity/w;", "Landroidx/lifecycle/y;", "owner", "", "enabled", "Lkotlin/Function1;", "Landroidx/activity/v;", "LXH/N;", "onBackPressed", "a", "(Landroidx/activity/w;Landroidx/lifecycle/y;ZLnI/l;)Landroidx/activity/v;", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class y {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/activity/y$a", "Landroidx/activity/v;", "LXH/N;", "handleOnBackPressed", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends v {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<v, C16807N> f15332b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(boolean z10, C17642l<? super v, C16807N> lVar) {
            super(z10);
            this.f15332b = lVar;
        }

        public void handleOnBackPressed() {
            this.f15332b.invoke(this);
        }
    }

    public static final v a(w wVar, C5221y yVar, boolean z10, C17642l<? super v, C16807N> lVar) {
        C17542s.j(wVar, "<this>");
        C17542s.j(lVar, "onBackPressed");
        a aVar = new a(z10, lVar);
        if (yVar != null) {
            wVar.i(yVar, aVar);
        } else {
            wVar.h(aVar);
        }
        return aVar;
    }

    public static /* synthetic */ v b(w wVar, C5221y yVar, boolean z10, C17642l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            yVar = null;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return a(wVar, yVar, z10, lVar);
    }
}
