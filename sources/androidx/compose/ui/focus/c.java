package androidx.compose.ui.focus;

import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import n1.C5623c;
import n1.C5635o;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bR.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/focus/c;", "Ln1/c;", "Landroidx/compose/ui/d$c;", "Lkotlin/Function1;", "Ln1/o;", "LXH/N;", "onFocusChanged", "<init>", "(LnI/l;)V", "focusState", "J", "(Ln1/o;)V", "n", "LnI/l;", "getOnFocusChanged", "()LnI/l;", "C2", "o", "Ln1/o;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class c extends d.c implements C5623c {

    /* renamed from: n  reason: collision with root package name */
    private C17642l<? super C5635o, C16807N> f18830n;

    /* renamed from: o  reason: collision with root package name */
    private C5635o f18831o;

    public c(C17642l<? super C5635o, C16807N> lVar) {
        this.f18830n = lVar;
    }

    public final void C2(C17642l<? super C5635o, C16807N> lVar) {
        this.f18830n = lVar;
    }

    public void J(C5635o oVar) {
        if (!C17542s.e(this.f18831o, oVar)) {
            this.f18831o = oVar;
            this.f18830n.invoke(oVar);
        }
    }
}
