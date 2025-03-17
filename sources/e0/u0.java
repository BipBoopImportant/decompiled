package E0;

import B0.B;
import H0.Q;
import N1.W;
import T1.C4832a;
import T1.C4838g;
import T1.C4839h;
import T1.C4840i;
import T1.C4845n;
import T1.M;
import T1.N;
import T1.O;
import T1.P;
import T1.r;
import XH.C16807N;
import YH.C16877v;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.ui.platform.w1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010!\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\u0016J\u000f\u0010\"\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\"\u0010\u0016J\u000f\u0010#\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010$J!\u0010(\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010'\u001a\u00020\u0018H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u0018H\u0016¢\u0006\u0004\b,\u0010-J!\u0010.\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010'\u001a\u00020\u0018H\u0016¢\u0006\u0004\b.\u0010)J\u001f\u00101\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00182\u0006\u00100\u001a\u00020\u0018H\u0016¢\u0006\u0004\b1\u0010-J\u001f\u00102\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00182\u0006\u00100\u001a\u00020\u0018H\u0016¢\u0006\u0004\b2\u0010-J\u001f\u00103\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u0018H\u0016¢\u0006\u0004\b3\u0010-J\u000f\u00104\u001a\u00020\u0006H\u0016¢\u0006\u0004\b4\u0010\u0016J\u0017\u00107\u001a\u00020\u00062\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u001f\u0010;\u001a\u00020%2\u0006\u00109\u001a\u00020\u00182\u0006\u0010:\u001a\u00020\u0018H\u0016¢\u0006\u0004\b;\u0010<J\u001f\u0010=\u001a\u00020%2\u0006\u00109\u001a\u00020\u00182\u0006\u0010:\u001a\u00020\u0018H\u0016¢\u0006\u0004\b=\u0010<J\u0019\u0010>\u001a\u0004\u0018\u00010%2\u0006\u0010:\u001a\u00020\u0018H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\u0018H\u0016¢\u0006\u0004\bA\u0010BJ!\u0010F\u001a\u00020E2\b\u0010D\u001a\u0004\u0018\u00010C2\u0006\u0010:\u001a\u00020\u0018H\u0016¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020\u00062\u0006\u0010H\u001a\u00020\u0018H\u0016¢\u0006\u0004\bI\u0010BJ\u0017\u0010K\u001a\u00020\u00062\u0006\u0010J\u001a\u00020\u0018H\u0016¢\u0006\u0004\bK\u0010BJ+\u0010R\u001a\u00020\u00122\u0006\u0010M\u001a\u00020L2\b\u0010O\u001a\u0004\u0018\u00010N2\b\u0010Q\u001a\u0004\u0018\u00010PH\u0016¢\u0006\u0004\bR\u0010SJ!\u0010W\u001a\u00020\u00062\u0006\u0010M\u001a\u00020T2\b\u0010V\u001a\u0004\u0018\u00010UH\u0016¢\u0006\u0004\bW\u0010XJ\u0019\u0010Z\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010YH\u0016¢\u0006\u0004\bZ\u0010[J\u0019\u0010^\u001a\u00020\u00062\b\u0010]\u001a\u0004\u0018\u00010\\H\u0016¢\u0006\u0004\b^\u0010_J\u0011\u0010a\u001a\u0004\u0018\u00010`H\u0016¢\u0006\u0004\ba\u0010bJ\u0017\u0010d\u001a\u00020\u00062\u0006\u0010c\u001a\u00020\u0018H\u0016¢\u0006\u0004\bd\u0010BJ\u0017\u0010f\u001a\u00020\u00062\u0006\u0010e\u001a\u00020\u0006H\u0016¢\u0006\u0004\bf\u0010gJ\u0017\u0010i\u001a\u00020\u00182\u0006\u0010h\u001a\u00020\u0018H\u0016¢\u0006\u0004\bi\u0010jJ#\u0010o\u001a\u00020\u00062\b\u0010l\u001a\u0004\u0018\u00010k2\b\u0010n\u001a\u0004\u0018\u00010mH\u0016¢\u0006\u0004\bo\u0010pJ)\u0010t\u001a\u00020\u00062\u0006\u0010r\u001a\u00020q2\u0006\u0010:\u001a\u00020\u00182\b\u0010s\u001a\u0004\u0018\u00010mH\u0016¢\u0006\u0004\bt\u0010uR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010yR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010}\u001a\u0004\b~\u0010R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\u000f\n\u0005\b\u0015\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\u000f\n\u0005\b\u0017\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u001a\u0010\u0001R2\u0010\u0001\u001a\u00020\u00022\u0007\u0010\u0001\u001a\u00020\u00028\u0000@@X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u001f\u0010\u0001R\u0018\u0010\u0001\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010{R\u001e\u0010\u0001\u001a\t\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010{¨\u0006\u0001"}, d2 = {"LE0/u0;", "Landroid/view/inputmethod/InputConnection;", "LT1/P;", "initState", "LE0/k0;", "eventCallback", "", "autoCorrect", "LB0/B;", "legacyTextFieldState", "LH0/Q;", "textFieldSelectionManager", "Landroidx/compose/ui/platform/w1;", "viewConfiguration", "<init>", "(LT1/P;LE0/k0;ZLB0/B;LH0/Q;Landroidx/compose/ui/platform/w1;)V", "LT1/i;", "editCommand", "LXH/N;", "c", "(LT1/i;)V", "d", "()Z", "e", "", "code", "f", "(I)V", "state", "LE0/l0;", "inputMethodManager", "h", "(LT1/P;LE0/l0;)V", "beginBatchEdit", "endBatchEdit", "closeConnection", "()V", "", "text", "newCursorPosition", "commitText", "(Ljava/lang/CharSequence;I)Z", "start", "end", "setComposingRegion", "(II)Z", "setComposingText", "beforeLength", "afterLength", "deleteSurroundingTextInCodePoints", "deleteSurroundingText", "setSelection", "finishComposingText", "Landroid/view/KeyEvent;", "event", "sendKeyEvent", "(Landroid/view/KeyEvent;)Z", "maxChars", "flags", "getTextBeforeCursor", "(II)Ljava/lang/CharSequence;", "getTextAfterCursor", "getSelectedText", "(I)Ljava/lang/CharSequence;", "cursorUpdateMode", "requestCursorUpdates", "(I)Z", "Landroid/view/inputmethod/ExtractedTextRequest;", "request", "Landroid/view/inputmethod/ExtractedText;", "getExtractedText", "(Landroid/view/inputmethod/ExtractedTextRequest;I)Landroid/view/inputmethod/ExtractedText;", "id", "performContextMenuAction", "editorAction", "performEditorAction", "Landroid/view/inputmethod/HandwritingGesture;", "gesture", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/function/IntConsumer;", "consumer", "performHandwritingGesture", "(Landroid/view/inputmethod/HandwritingGesture;Ljava/util/concurrent/Executor;Ljava/util/function/IntConsumer;)V", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "Landroid/os/CancellationSignal;", "cancellationSignal", "previewHandwritingGesture", "(Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z", "Landroid/view/inputmethod/CompletionInfo;", "commitCompletion", "(Landroid/view/inputmethod/CompletionInfo;)Z", "Landroid/view/inputmethod/CorrectionInfo;", "correctionInfo", "commitCorrection", "(Landroid/view/inputmethod/CorrectionInfo;)Z", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "states", "clearMetaKeyStates", "enabled", "reportFullscreenMode", "(Z)Z", "reqModes", "getCursorCapsMode", "(I)I", "", "action", "Landroid/os/Bundle;", "data", "performPrivateCommand", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "Landroid/view/inputmethod/InputContentInfo;", "inputContentInfo", "opts", "commitContent", "(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z", "a", "LE0/k0;", "getEventCallback", "()LE0/k0;", "b", "Z", "getAutoCorrect", "LB0/B;", "getLegacyTextFieldState", "()LB0/B;", "LH0/Q;", "getTextFieldSelectionManager", "()LH0/Q;", "Landroidx/compose/ui/platform/w1;", "getViewConfiguration", "()Landroidx/compose/ui/platform/w1;", "I", "batchDepth", "value", "g", "LT1/P;", "getTextFieldValue$foundation_release", "()LT1/P;", "(LT1/P;)V", "textFieldValue", "currentExtractedTextRequestToken", "i", "extractedTextMonitorMode", "", "j", "Ljava/util/List;", "editCommands", "k", "isActive", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class u0 implements InputConnection {

    /* renamed from: a  reason: collision with root package name */
    private final k0 f5767a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f5768b;

    /* renamed from: c  reason: collision with root package name */
    private final B f5769c;

    /* renamed from: d  reason: collision with root package name */
    private final Q f5770d;

    /* renamed from: e  reason: collision with root package name */
    private final w1 f5771e;

    /* renamed from: f  reason: collision with root package name */
    private int f5772f;

    /* renamed from: g  reason: collision with root package name */
    private P f5773g;

    /* renamed from: h  reason: collision with root package name */
    private int f5774h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f5775i;

    /* renamed from: j  reason: collision with root package name */
    private final List<C4840i> f5776j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    private boolean f5777k = true;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LT1/i;", "it", "LXH/N;", "a", "(LT1/i;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<C4840i, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ u0 f5778c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(u0 u0Var) {
            super(1);
            this.f5778c = u0Var;
        }

        public final void a(C4840i iVar) {
            this.f5778c.c(iVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C4840i) obj);
            return C16807N.f139792a;
        }
    }

    public u0(P p10, k0 k0Var, boolean z10, B b10, Q q10, w1 w1Var) {
        this.f5767a = k0Var;
        this.f5768b = z10;
        this.f5769c = b10;
        this.f5770d = q10;
        this.f5771e = w1Var;
        this.f5773g = p10;
    }

    /* access modifiers changed from: private */
    public final void c(C4840i iVar) {
        d();
        try {
            this.f5776j.add(iVar);
        } finally {
            e();
        }
    }

    private final boolean d() {
        this.f5772f++;
        return true;
    }

    private final boolean e() {
        int i10 = this.f5772f - 1;
        this.f5772f = i10;
        if (i10 == 0 && !this.f5776j.isEmpty()) {
            this.f5767a.d(C16877v.w1(this.f5776j));
            this.f5776j.clear();
        }
        return this.f5772f > 0;
    }

    private final void f(int i10) {
        sendKeyEvent(new KeyEvent(0, i10));
        sendKeyEvent(new KeyEvent(1, i10));
    }

    public boolean beginBatchEdit() {
        boolean z10 = this.f5777k;
        return z10 ? d() : z10;
    }

    public boolean clearMetaKeyStates(int i10) {
        boolean z10 = this.f5777k;
        if (z10) {
            return false;
        }
        return z10;
    }

    public void closeConnection() {
        this.f5776j.clear();
        this.f5772f = 0;
        this.f5777k = false;
        this.f5767a.e(this);
    }

    public boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z10 = this.f5777k;
        if (z10) {
            return false;
        }
        return z10;
    }

    public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        boolean z10 = this.f5777k;
        if (z10) {
            return false;
        }
        return z10;
    }

    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z10 = this.f5777k;
        return z10 ? this.f5768b : z10;
    }

    public boolean commitText(CharSequence charSequence, int i10) {
        boolean z10 = this.f5777k;
        if (z10) {
            c(new C4832a(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    public boolean deleteSurroundingText(int i10, int i11) {
        boolean z10 = this.f5777k;
        if (!z10) {
            return z10;
        }
        c(new C4838g(i10, i11));
        return true;
    }

    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        boolean z10 = this.f5777k;
        if (!z10) {
            return z10;
        }
        c(new C4839h(i10, i11));
        return true;
    }

    public boolean endBatchEdit() {
        return e();
    }

    public boolean finishComposingText() {
        boolean z10 = this.f5777k;
        if (!z10) {
            return z10;
        }
        c(new C4845n());
        return true;
    }

    public final void g(P p10) {
        this.f5773g = p10;
    }

    public int getCursorCapsMode(int i10) {
        return TextUtils.getCapsMode(this.f5773g.i(), W.l(this.f5773g.h()), i10);
    }

    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        boolean z10 = true;
        int i11 = 0;
        if ((i10 & 1) == 0) {
            z10 = false;
        }
        this.f5775i = z10;
        if (z10) {
            if (extractedTextRequest != null) {
                i11 = extractedTextRequest.token;
            }
            this.f5774h = i11;
        }
        return v0.b(this.f5773g);
    }

    public Handler getHandler() {
        return null;
    }

    public CharSequence getSelectedText(int i10) {
        if (W.h(this.f5773g.h())) {
            return null;
        }
        return T1.Q.a(this.f5773g).toString();
    }

    public CharSequence getTextAfterCursor(int i10, int i11) {
        return T1.Q.b(this.f5773g, i10).toString();
    }

    public CharSequence getTextBeforeCursor(int i10, int i11) {
        return T1.Q.c(this.f5773g, i10).toString();
    }

    public final void h(P p10, l0 l0Var) {
        if (this.f5777k) {
            g(p10);
            if (this.f5775i) {
                l0Var.d(this.f5774h, v0.b(p10));
            }
            W g10 = p10.g();
            int i10 = -1;
            int l10 = g10 != null ? W.l(g10.r()) : -1;
            W g11 = p10.g();
            if (g11 != null) {
                i10 = W.k(g11.r());
            }
            l0Var.e(W.l(p10.h()), W.k(p10.h()), l10, i10);
        }
    }

    public boolean performContextMenuAction(int i10) {
        boolean z10 = this.f5777k;
        if (z10) {
            z10 = false;
            switch (i10) {
                case 16908319:
                    c(new O(0, this.f5773g.i().length()));
                    break;
                case 16908320:
                    f(277);
                    break;
                case 16908321:
                    f(278);
                    break;
                case 16908322:
                    f(279);
                    break;
            }
        }
        return z10;
    }

    public boolean performEditorAction(int i10) {
        int i11;
        boolean z10 = this.f5777k;
        if (!z10) {
            return z10;
        }
        if (i10 != 0) {
            switch (i10) {
                case 2:
                    i11 = r.f13620b.c();
                    break;
                case 3:
                    i11 = r.f13620b.g();
                    break;
                case 4:
                    i11 = r.f13620b.h();
                    break;
                case 5:
                    i11 = r.f13620b.d();
                    break;
                case 6:
                    i11 = r.f13620b.b();
                    break;
                case 7:
                    i11 = r.f13620b.f();
                    break;
                default:
                    Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i10);
                    i11 = r.f13620b.a();
                    break;
            }
        } else {
            i11 = r.f13620b.a();
        }
        this.f5767a.c(i11);
        return true;
    }

    public void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        if (Build.VERSION.SDK_INT >= 34) {
            C4445c.f5701a.b(this.f5769c, this.f5770d, handwritingGesture, this.f5771e, executor, intConsumer, new a(this));
        }
    }

    public boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z10 = this.f5777k;
        if (z10) {
            return true;
        }
        return z10;
    }

    public boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C4445c.f5701a.d(this.f5769c, this.f5770d, previewableHandwritingGesture, cancellationSignal);
        }
        return false;
    }

    public boolean reportFullscreenMode(boolean z10) {
        return false;
    }

    public boolean requestCursorUpdates(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14 = this.f5777k;
        if (!z14) {
            return z14;
        }
        boolean z15 = false;
        boolean z16 = (i10 & 1) != 0;
        boolean z17 = (i10 & 2) != 0;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            boolean z18 = (i10 & 16) != 0;
            boolean z19 = (i10 & 8) != 0;
            boolean z20 = (i10 & 4) != 0;
            if (i11 >= 34 && (i10 & 32) != 0) {
                z15 = true;
            }
            if (z18 || z19 || z20 || z15) {
                z10 = z15;
                z11 = z20;
                z12 = z19;
                z13 = z18;
            } else if (i11 >= 34) {
                z13 = true;
                z12 = true;
                z11 = true;
                z10 = true;
            } else {
                z10 = z15;
                z13 = true;
                z12 = true;
                z11 = true;
            }
        } else {
            z11 = false;
            z10 = false;
            z13 = true;
            z12 = true;
        }
        this.f5767a.b(z16, z17, z13, z12, z11, z10);
        return true;
    }

    public boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z10 = this.f5777k;
        if (!z10) {
            return z10;
        }
        this.f5767a.a(keyEvent);
        return true;
    }

    public boolean setComposingRegion(int i10, int i11) {
        boolean z10 = this.f5777k;
        if (z10) {
            c(new M(i10, i11));
        }
        return z10;
    }

    public boolean setComposingText(CharSequence charSequence, int i10) {
        boolean z10 = this.f5777k;
        if (z10) {
            c(new N(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    public boolean setSelection(int i10, int i11) {
        boolean z10 = this.f5777k;
        if (!z10) {
            return z10;
        }
        c(new O(i10, i11));
        return true;
    }
}
