package n1;

import D1.a;
import W0.b;
import XH.C16807N;
import XH.C16820k;
import androidx.compose.ui.focus.FocusTargetNode;
import j0.N;
import j0.Y;
import kotlin.Metadata;
import nI.C17631a;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000f0\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R,\u0010\u001c\u001a\u0004\u0018\u00010\n*\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\n8F@FX\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Ln1/t;", "", "<init>", "()V", "LXH/N;", "f", "h", "g", "Lj0/N;", "Landroidx/compose/ui/focus/FocusTargetNode;", "Ln1/p;", "a", "Lj0/N;", "states", "LW0/b;", "Lkotlin/Function0;", "b", "LW0/b;", "cancellationListener", "", "c", "Z", "ongoingTransaction", "value", "i", "(Landroidx/compose/ui/focus/FocusTargetNode;)Ln1/p;", "j", "(Landroidx/compose/ui/focus/FocusTargetNode;Ln1/p;)V", "uncommittedFocusState", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: n1.t  reason: case insensitive filesystem */
public final class C5640t {

    /* renamed from: a  reason: collision with root package name */
    private final N<FocusTargetNode, C5636p> f26512a = Y.d();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final b<C17631a<C16807N>> f26513b = new b<>(new C17631a[16], 0);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public boolean f26514c;

    /* access modifiers changed from: private */
    public final void f() {
        this.f26514c = true;
    }

    /* access modifiers changed from: private */
    public final void g() {
        this.f26512a.i();
        int i10 = 0;
        this.f26514c = false;
        b<C17631a<C16807N>> bVar = this.f26513b;
        int r10 = bVar.r();
        if (r10 > 0) {
            Object[] q10 = bVar.q();
            do {
                ((C17631a) q10[i10]).invoke();
                i10++;
            } while (i10 < r10);
        }
        this.f26513b.k();
    }

    /* access modifiers changed from: private */
    public final void h() {
        N<FocusTargetNode, C5636p> n10 = this.f26512a;
        Object[] objArr = n10.f24569b;
        long[] jArr = n10.f24568a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            ((FocusTargetNode) objArr[(i10 << 3) + i12]).G2();
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        this.f26512a.i();
        this.f26514c = false;
        this.f26513b.k();
    }

    public final C5636p i(FocusTargetNode focusTargetNode) {
        return this.f26512a.c(focusTargetNode);
    }

    public final void j(FocusTargetNode focusTargetNode, C5636p pVar) {
        N<FocusTargetNode, C5636p> n10 = this.f26512a;
        if (pVar != null) {
            n10.s(focusTargetNode, pVar);
        } else {
            a.c("requires a non-null focus state");
            throw new C16820k();
        }
    }
}
