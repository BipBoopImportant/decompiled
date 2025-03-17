package e;

import P4.g;
import U0.C4889m;
import U0.r;
import XH.C16807N;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.j;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\f\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/activity/j;", "LU0/r;", "parent", "Lkotlin/Function0;", "LXH/N;", "content", "a", "(Landroidx/activity/j;LU0/r;LnI/p;)V", "c", "(Landroidx/activity/j;)V", "Landroid/view/ViewGroup$LayoutParams;", "Landroid/view/ViewGroup$LayoutParams;", "DefaultActivityContentLayoutParams", "activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: e.e  reason: case insensitive filesystem */
public final class C5282e {

    /* renamed from: a  reason: collision with root package name */
    private static final ViewGroup.LayoutParams f23162a = new ViewGroup.LayoutParams(-2, -2);

    public static final void a(j jVar, r rVar, p<? super C4889m, ? super Integer, C16807N> pVar) {
        View childAt = ((ViewGroup) jVar.getWindow().getDecorView().findViewById(16908290)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(rVar);
            composeView.setContent(pVar);
            return;
        }
        ComposeView composeView2 = new ComposeView(jVar, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView2.setParentCompositionContext(rVar);
        composeView2.setContent(pVar);
        c(jVar);
        jVar.setContentView(composeView2, f23162a);
    }

    public static /* synthetic */ void b(j jVar, r rVar, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            rVar = null;
        }
        a(jVar, rVar, pVar);
    }

    private static final void c(j jVar) {
        View decorView = jVar.getWindow().getDecorView();
        if (l0.a(decorView) == null) {
            l0.b(decorView, jVar);
        }
        if (m0.a(decorView) == null) {
            m0.b(decorView, jVar);
        }
        if (g.a(decorView) == null) {
            g.b(decorView, jVar);
        }
    }
}
