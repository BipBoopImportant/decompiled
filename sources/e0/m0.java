package E0;

import I2.O;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001b\u0010#\u001a\u00020\u001f8BX\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%¨\u0006'"}, d2 = {"LE0/m0;", "LE0/l0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "", "c", "()Z", "LXH/N;", "f", "()V", "", "token", "Landroid/view/inputmethod/ExtractedText;", "extractedText", "d", "(ILandroid/view/inputmethod/ExtractedText;)V", "selectionStart", "selectionEnd", "compositionStart", "compositionEnd", "e", "(IIII)V", "Landroid/view/inputmethod/CursorAnchorInfo;", "cursorAnchorInfo", "g", "(Landroid/view/inputmethod/CursorAnchorInfo;)V", "h", "a", "Landroid/view/View;", "Landroid/view/inputmethod/InputMethodManager;", "b", "LXH/o;", "()Landroid/view/inputmethod/InputMethodManager;", "imm", "LI2/O;", "LI2/O;", "softwareKeyboardControllerCompat", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class m0 implements l0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final View f5709a;

    /* renamed from: b  reason: collision with root package name */
    private final C16824o f5710b = C16825p.a(s.NONE, new a(this));

    /* renamed from: c  reason: collision with root package name */
    private final O f5711c;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/inputmethod/InputMethodManager;", "b", "()Landroid/view/inputmethod/InputMethodManager;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17631a<InputMethodManager> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m0 f5712c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(m0 m0Var) {
            super(0);
            this.f5712c = m0Var;
        }

        /* renamed from: b */
        public final InputMethodManager invoke() {
            Object systemService = this.f5712c.f5709a.getContext().getSystemService("input_method");
            C17542s.h(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (InputMethodManager) systemService;
        }
    }

    public m0(View view) {
        this.f5709a = view;
        this.f5711c = new O(view);
    }

    private final InputMethodManager b() {
        return (InputMethodManager) this.f5710b.getValue();
    }

    public boolean c() {
        return b().isActive(this.f5709a);
    }

    public void d(int i10, ExtractedText extractedText) {
        b().updateExtractedText(this.f5709a, i10, extractedText);
    }

    public void e(int i10, int i11, int i12, int i13) {
        b().updateSelection(this.f5709a, i10, i11, i12, i13);
    }

    public void f() {
        b().restartInput(this.f5709a);
    }

    public void g(CursorAnchorInfo cursorAnchorInfo) {
        b().updateCursorAnchorInfo(this.f5709a, cursorAnchorInfo);
    }

    public void h() {
        if (Build.VERSION.SDK_INT >= 34) {
            C4447e.f5702a.a(b(), this.f5709a);
        }
    }
}
