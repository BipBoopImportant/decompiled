package T1;

import I2.O;
import XH.C16814e;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u001f\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001eR\u001b\u0010#\u001a\u00020\u001f8BX\u0002¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%¨\u0006'"}, d2 = {"LT1/v;", "LT1/u;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "", "c", "()Z", "LXH/N;", "f", "()V", "a", "b", "", "token", "Landroid/view/inputmethod/ExtractedText;", "extractedText", "d", "(ILandroid/view/inputmethod/ExtractedText;)V", "selectionStart", "selectionEnd", "compositionStart", "compositionEnd", "e", "(IIII)V", "Landroid/view/inputmethod/CursorAnchorInfo;", "cursorAnchorInfo", "g", "(Landroid/view/inputmethod/CursorAnchorInfo;)V", "Landroid/view/View;", "Landroid/view/inputmethod/InputMethodManager;", "LXH/o;", "i", "()Landroid/view/inputmethod/InputMethodManager;", "imm", "LI2/O;", "LI2/O;", "softwareKeyboardControllerCompat", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C16814e
/* renamed from: T1.v  reason: case insensitive filesystem */
public final class C4852v implements C4851u {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final View f13639a;

    /* renamed from: b  reason: collision with root package name */
    private final C16824o f13640b = C16825p.a(s.NONE, new a(this));

    /* renamed from: c  reason: collision with root package name */
    private final O f13641c;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/inputmethod/InputMethodManager;", "b", "()Landroid/view/inputmethod/InputMethodManager;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: T1.v$a */
    static final class a extends C17544u implements C17631a<InputMethodManager> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4852v f13642c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C4852v vVar) {
            super(0);
            this.f13642c = vVar;
        }

        /* renamed from: b */
        public final InputMethodManager invoke() {
            Object systemService = this.f13642c.f13639a.getContext().getSystemService("input_method");
            C17542s.h(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (InputMethodManager) systemService;
        }
    }

    public C4852v(View view) {
        this.f13639a = view;
        this.f13641c = new O(view);
    }

    private final InputMethodManager i() {
        return (InputMethodManager) this.f13640b.getValue();
    }

    public void a() {
        this.f13641c.b();
    }

    public void b() {
        this.f13641c.a();
    }

    public boolean c() {
        return i().isActive(this.f13639a);
    }

    public void d(int i10, ExtractedText extractedText) {
        i().updateExtractedText(this.f13639a, i10, extractedText);
    }

    public void e(int i10, int i11, int i12, int i13) {
        i().updateSelection(this.f13639a, i10, i11, i12, i13);
    }

    public void f() {
        i().restartInput(this.f13639a);
    }

    public void g(CursorAnchorInfo cursorAnchorInfo) {
        i().updateCursorAnchorInfo(this.f13639a, cursorAnchorInfo);
    }
}
