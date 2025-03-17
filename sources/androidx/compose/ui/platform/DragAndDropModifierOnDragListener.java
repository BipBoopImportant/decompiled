package androidx.compose.ui.platform;

import XH.C16807N;
import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.d;
import j0.C5446b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l1.C5509b;
import l1.C5510c;
import l1.C5511d;
import l1.C5512e;
import l1.C5514g;
import l1.C5515h;
import nI.C17642l;
import nI.q;
import o1.C5673m;
import r1.f;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012*\u0010\n\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R8\u0010\n\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\t0\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00130\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\u00020!8\u0016X\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$¨\u0006&"}, d2 = {"Landroidx/compose/ui/platform/DragAndDropModifierOnDragListener;", "Landroid/view/View$OnDragListener;", "Ll1/c;", "Lkotlin/Function3;", "Ll1/h;", "Lo1/m;", "Lkotlin/Function1;", "Lr1/f;", "LXH/N;", "", "startDrag", "<init>", "(LnI/q;)V", "Landroid/view/View;", "view", "Landroid/view/DragEvent;", "event", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z", "Ll1/d;", "node", "b", "(Ll1/d;)V", "a", "(Ll1/d;)Z", "LnI/q;", "Ll1/e;", "Ll1/e;", "rootDragAndDropNode", "Lj0/b;", "c", "Lj0/b;", "interestedNodes", "Landroidx/compose/ui/d;", "d", "Landroidx/compose/ui/d;", "()Landroidx/compose/ui/d;", "modifier", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class DragAndDropModifierOnDragListener implements View.OnDragListener, C5510c {

    /* renamed from: a  reason: collision with root package name */
    private final q<C5515h, C5673m, C17642l<? super f, C16807N>, Boolean> f19183a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C5512e f19184b = new C5512e(a.f19187c);

    /* renamed from: c  reason: collision with root package name */
    private final C5446b<C5511d> f19185c = new C5446b<>(0, 1, (DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    private final d f19186d = new DragAndDropModifierOnDragListener$modifier$1(this);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll1/b;", "it", "Ll1/g;", "a", "(Ll1/b;)Ll1/g;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<C5509b, C5514g> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f19187c = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final C5514g invoke(C5509b bVar) {
            return null;
        }
    }

    public DragAndDropModifierOnDragListener(q<? super C5515h, ? super C5673m, ? super C17642l<? super f, C16807N>, Boolean> qVar) {
        this.f19183a = qVar;
    }

    public boolean a(C5511d dVar) {
        return this.f19185c.contains(dVar);
    }

    public void b(C5511d dVar) {
        this.f19185c.add(dVar);
    }

    public d d() {
        return this.f19186d;
    }

    public boolean onDrag(View view, DragEvent dragEvent) {
        C5509b bVar = new C5509b(dragEvent);
        switch (dragEvent.getAction()) {
            case 1:
                boolean C22 = this.f19184b.C2(bVar);
                for (C5511d b02 : this.f19185c) {
                    b02.b0(bVar);
                }
                return C22;
            case 2:
                this.f19184b.c0(bVar);
                return false;
            case 3:
                return this.f19184b.X1(bVar);
            case 4:
                this.f19184b.x0(bVar);
                return false;
            case 5:
                this.f19184b.h0(bVar);
                return false;
            case 6:
                this.f19184b.y0(bVar);
                return false;
            default:
                return false;
        }
    }
}
