package I1;

import XH.C16807N;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import o1.C5669i;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0000\u0018\u00002\u00020\u0001Bk\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0019\u0010\u0018J!\u0010\u001b\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b!\u0010\"R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b$\u0010%R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b'\u0010#\u001a\u0004\b+\u0010%\"\u0004\b,\u0010-R*\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010#\u001a\u0004\b.\u0010%\"\u0004\b/\u0010-R*\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010#\u001a\u0004\b0\u0010%\"\u0004\b1\u0010-R*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010#\u001a\u0004\b2\u0010%\"\u0004\b3\u0010-¨\u00064"}, d2 = {"LI1/c;", "", "Lkotlin/Function0;", "LXH/N;", "onActionModeDestroy", "Lo1/i;", "rect", "onCopyRequested", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "<init>", "(LnI/a;Lo1/i;LnI/a;LnI/a;LnI/a;LnI/a;)V", "Landroid/view/Menu;", "menu", "LI1/b;", "item", "callback", "b", "(Landroid/view/Menu;LI1/b;LnI/a;)V", "Landroid/view/ActionMode;", "mode", "", "e", "(Landroid/view/ActionMode;Landroid/view/Menu;)Z", "g", "Landroid/view/MenuItem;", "d", "(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z", "f", "()V", "m", "(Landroid/view/Menu;)V", "a", "(Landroid/view/Menu;LI1/b;)V", "LnI/a;", "getOnActionModeDestroy", "()LnI/a;", "Lo1/i;", "c", "()Lo1/i;", "l", "(Lo1/i;)V", "getOnCopyRequested", "h", "(LnI/a;)V", "getOnPasteRequested", "j", "getOnCutRequested", "i", "getOnSelectAllRequested", "k", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final C17631a<C16807N> f8558a;

    /* renamed from: b  reason: collision with root package name */
    private C5669i f8559b;

    /* renamed from: c  reason: collision with root package name */
    private C17631a<C16807N> f8560c;

    /* renamed from: d  reason: collision with root package name */
    private C17631a<C16807N> f8561d;

    /* renamed from: e  reason: collision with root package name */
    private C17631a<C16807N> f8562e;

    /* renamed from: f  reason: collision with root package name */
    private C17631a<C16807N> f8563f;

    public c(C17631a<C16807N> aVar, C5669i iVar, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3, C17631a<C16807N> aVar4, C17631a<C16807N> aVar5) {
        this.f8558a = aVar;
        this.f8559b = iVar;
        this.f8560c = aVar2;
        this.f8561d = aVar3;
        this.f8562e = aVar4;
        this.f8563f = aVar5;
    }

    private final void b(Menu menu, b bVar, C17631a<C16807N> aVar) {
        if (aVar != null && menu.findItem(bVar.b()) == null) {
            a(menu, bVar);
        } else if (aVar == null && menu.findItem(bVar.b()) != null) {
            menu.removeItem(bVar.b());
        }
    }

    public final void a(Menu menu, b bVar) {
        menu.add(0, bVar.b(), bVar.j(), bVar.m()).setShowAsAction(1);
    }

    public final C5669i c() {
        return this.f8559b;
    }

    public final boolean d(ActionMode actionMode, MenuItem menuItem) {
        C17542s.g(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == b.Copy.b()) {
            C17631a<C16807N> aVar = this.f8560c;
            if (aVar != null) {
                aVar.invoke();
            }
        } else if (itemId == b.Paste.b()) {
            C17631a<C16807N> aVar2 = this.f8561d;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        } else if (itemId == b.Cut.b()) {
            C17631a<C16807N> aVar3 = this.f8562e;
            if (aVar3 != null) {
                aVar3.invoke();
            }
        } else if (itemId != b.SelectAll.b()) {
            return false;
        } else {
            C17631a<C16807N> aVar4 = this.f8563f;
            if (aVar4 != null) {
                aVar4.invoke();
            }
        }
        if (actionMode == null) {
            return true;
        }
        actionMode.finish();
        return true;
    }

    public final boolean e(ActionMode actionMode, Menu menu) {
        if (menu == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu");
        } else if (actionMode != null) {
            if (this.f8560c != null) {
                a(menu, b.Copy);
            }
            if (this.f8561d != null) {
                a(menu, b.Paste);
            }
            if (this.f8562e != null) {
                a(menu, b.Cut);
            }
            if (this.f8563f == null) {
                return true;
            }
            a(menu, b.SelectAll);
            return true;
        } else {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode");
        }
    }

    public final void f() {
        C17631a<C16807N> aVar = this.f8558a;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final boolean g(ActionMode actionMode, Menu menu) {
        if (actionMode == null || menu == null) {
            return false;
        }
        m(menu);
        return true;
    }

    public final void h(C17631a<C16807N> aVar) {
        this.f8560c = aVar;
    }

    public final void i(C17631a<C16807N> aVar) {
        this.f8562e = aVar;
    }

    public final void j(C17631a<C16807N> aVar) {
        this.f8561d = aVar;
    }

    public final void k(C17631a<C16807N> aVar) {
        this.f8563f = aVar;
    }

    public final void l(C5669i iVar) {
        this.f8559b = iVar;
    }

    public final void m(Menu menu) {
        b(menu, b.Copy, this.f8560c);
        b(menu, b.Paste, this.f8561d);
        b(menu, b.Cut, this.f8562e);
        b(menu, b.SelectAll, this.f8563f);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ c(nI.C17631a r6, o1.C5669i r7, nI.C17631a r8, nI.C17631a r9, nI.C17631a r10, nI.C17631a r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r5 = this;
            r13 = r12 & 1
            r0 = 0
            if (r13 == 0) goto L_0x0007
            r13 = r0
            goto L_0x0008
        L_0x0007:
            r13 = r6
        L_0x0008:
            r6 = r12 & 2
            if (r6 == 0) goto L_0x0012
            o1.i$a r6 = o1.C5669i.f26706e
            o1.i r7 = r6.a()
        L_0x0012:
            r1 = r7
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0019
            r2 = r0
            goto L_0x001a
        L_0x0019:
            r2 = r8
        L_0x001a:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x0020
            r3 = r0
            goto L_0x0021
        L_0x0020:
            r3 = r9
        L_0x0021:
            r6 = r12 & 16
            if (r6 == 0) goto L_0x0027
            r4 = r0
            goto L_0x0028
        L_0x0027:
            r4 = r10
        L_0x0028:
            r6 = r12 & 32
            if (r6 == 0) goto L_0x002e
            r12 = r0
            goto L_0x002f
        L_0x002e:
            r12 = r11
        L_0x002f:
            r6 = r5
            r7 = r13
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: I1.c.<init>(nI.a, o1.i, nI.a, nI.a, nI.a, nI.a, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
