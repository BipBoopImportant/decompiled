package n1;

import C1.b;
import android.view.KeyEvent;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import o1.C5669i;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ:\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nH&ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J2\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0017\u0010\u0018J*\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u001bH&ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H&ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!H&¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u000bH&¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020(H&¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020+H&¢\u0006\u0004\b,\u0010-R\u0014\u00101\u001a\u00020.8&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00105\u001a\u0002028&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00109\u001a\u0002068&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00108ø\u0001\u0001\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006:À\u0006\u0001"}, d2 = {"Ln1/i;", "Ln1/f;", "Landroidx/compose/ui/focus/d;", "focusDirection", "Lo1/i;", "previouslyFocusedRect", "", "f", "(Landroidx/compose/ui/focus/d;Lo1/i;)Z", "focusedRect", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusTargetNode;", "onFound", "k", "(ILo1/i;LnI/l;)Ljava/lang/Boolean;", "LXH/N;", "p", "()V", "force", "refreshFocusEvents", "clearOwnerFocus", "j", "(ZZZI)Z", "o", "()Lo1/i;", "Ly1/b;", "keyEvent", "Lkotlin/Function0;", "onFocusedItem", "n", "(Landroid/view/KeyEvent;LnI/a;)Z", "e", "(Landroid/view/KeyEvent;)Z", "LC1/b;", "event", "b", "(LC1/b;)Z", "node", "h", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "Ln1/c;", "g", "(Ln1/c;)V", "Ln1/j;", "m", "(Ln1/j;)V", "Landroidx/compose/ui/d;", "i", "()Landroidx/compose/ui/d;", "modifier", "Ln1/t;", "c", "()Ln1/t;", "focusTransactionManager", "Ln1/o;", "l", "()Ln1/o;", "rootState", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: n1.i  reason: case insensitive filesystem */
public interface C5629i extends C5626f {

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: n1.i$a */
    static final class a extends C17544u implements C17631a<Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f26510c = new a();

        a() {
            super(0);
        }

        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    static /* synthetic */ boolean a(C5629i iVar, KeyEvent keyEvent, C17631a aVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                aVar = a.f26510c;
            }
            return iVar.n(keyEvent, aVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchKeyEvent-YhN2O0w");
    }

    boolean b(b bVar);

    C5640t c();

    boolean e(KeyEvent keyEvent);

    boolean f(d dVar, C5669i iVar);

    void g(C5623c cVar);

    void h(FocusTargetNode focusTargetNode);

    androidx.compose.ui.d i();

    boolean j(boolean z10, boolean z11, boolean z12, int i10);

    Boolean k(int i10, C5669i iVar, C17642l<? super FocusTargetNode, Boolean> lVar);

    C5635o l();

    void m(C5630j jVar);

    boolean n(KeyEvent keyEvent, C17631a<Boolean> aVar);

    C5669i o();

    void p();
}
