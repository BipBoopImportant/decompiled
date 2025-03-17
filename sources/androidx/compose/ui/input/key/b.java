package androidx.compose.ui.input.key;

import android.view.KeyEvent;
import androidx.compose.ui.d;
import kotlin.Metadata;
import nI.C17642l;
import y1.C6254b;
import y1.C6257e;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\fR0\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R0\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/input/key/b;", "Ly1/e;", "Landroidx/compose/ui/d$c;", "Lkotlin/Function1;", "Ly1/b;", "", "onEvent", "onPreEvent", "<init>", "(LnI/l;LnI/l;)V", "event", "p1", "(Landroid/view/KeyEvent;)Z", "Y0", "n", "LnI/l;", "getOnEvent", "()LnI/l;", "C2", "(LnI/l;)V", "o", "getOnPreEvent", "D2", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class b extends d.c implements C6257e {

    /* renamed from: n  reason: collision with root package name */
    private C17642l<? super C6254b, Boolean> f18970n;

    /* renamed from: o  reason: collision with root package name */
    private C17642l<? super C6254b, Boolean> f18971o;

    public b(C17642l<? super C6254b, Boolean> lVar, C17642l<? super C6254b, Boolean> lVar2) {
        this.f18970n = lVar;
        this.f18971o = lVar2;
    }

    public final void C2(C17642l<? super C6254b, Boolean> lVar) {
        this.f18970n = lVar;
    }

    public final void D2(C17642l<? super C6254b, Boolean> lVar) {
        this.f18971o = lVar;
    }

    public boolean Y0(KeyEvent keyEvent) {
        C17642l<? super C6254b, Boolean> lVar = this.f18971o;
        if (lVar != null) {
            return lVar.invoke(C6254b.a(keyEvent)).booleanValue();
        }
        return false;
    }

    public boolean p1(KeyEvent keyEvent) {
        C17642l<? super C6254b, Boolean> lVar = this.f18970n;
        if (lVar != null) {
            return lVar.invoke(C6254b.a(keyEvent)).booleanValue();
        }
        return false;
    }
}
