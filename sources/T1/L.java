package T1;

import N1.W;
import XH.C16814e;
import YH.C16877v;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010!\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u0010J\u000f\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u0010J\u000f\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\"\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010!\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u0012H\u0016¢\u0006\u0004\b&\u0010'J!\u0010(\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010!\u001a\u00020\u0012H\u0016¢\u0006\u0004\b(\u0010#J\u001f\u0010+\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u0012H\u0016¢\u0006\u0004\b+\u0010'J\u001f\u0010,\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u0012H\u0016¢\u0006\u0004\b,\u0010'J\u001f\u0010-\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u0012H\u0016¢\u0006\u0004\b-\u0010'J\u000f\u0010.\u001a\u00020\u0006H\u0016¢\u0006\u0004\b.\u0010\u0010J\u0017\u00101\u001a\u00020\u00062\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u001f\u00105\u001a\u00020\u001f2\u0006\u00103\u001a\u00020\u00122\u0006\u00104\u001a\u00020\u0012H\u0016¢\u0006\u0004\b5\u00106J\u001f\u00107\u001a\u00020\u001f2\u0006\u00103\u001a\u00020\u00122\u0006\u00104\u001a\u00020\u0012H\u0016¢\u0006\u0004\b7\u00106J\u0019\u00108\u001a\u0004\u0018\u00010\u001f2\u0006\u00104\u001a\u00020\u0012H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u0012H\u0016¢\u0006\u0004\b;\u0010<J!\u0010@\u001a\u00020?2\b\u0010>\u001a\u0004\u0018\u00010=2\u0006\u00104\u001a\u00020\u0012H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\u0012H\u0016¢\u0006\u0004\bC\u0010<J\u0017\u0010E\u001a\u00020\u00062\u0006\u0010D\u001a\u00020\u0012H\u0016¢\u0006\u0004\bE\u0010<J\u0019\u0010G\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010FH\u0016¢\u0006\u0004\bG\u0010HJ\u0019\u0010K\u001a\u00020\u00062\b\u0010J\u001a\u0004\u0018\u00010IH\u0016¢\u0006\u0004\bK\u0010LJ\u0011\u0010N\u001a\u0004\u0018\u00010MH\u0016¢\u0006\u0004\bN\u0010OJ\u0017\u0010Q\u001a\u00020\u00062\u0006\u0010P\u001a\u00020\u0012H\u0016¢\u0006\u0004\bQ\u0010<J\u0017\u0010S\u001a\u00020\u00062\u0006\u0010R\u001a\u00020\u0006H\u0016¢\u0006\u0004\bS\u0010TJ\u0017\u0010V\u001a\u00020\u00122\u0006\u0010U\u001a\u00020\u0012H\u0016¢\u0006\u0004\bV\u0010WJ#\u0010\\\u001a\u00020\u00062\b\u0010Y\u001a\u0004\u0018\u00010X2\b\u0010[\u001a\u0004\u0018\u00010ZH\u0016¢\u0006\u0004\b\\\u0010]J)\u0010a\u001a\u00020\u00062\u0006\u0010_\u001a\u00020^2\u0006\u00104\u001a\u00020\u00122\b\u0010`\u001a\u0004\u0018\u00010ZH\u0016¢\u0006\u0004\ba\u0010bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010g\u001a\u0004\bh\u0010\u0010R\u0016\u0010j\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010iR*\u0010q\u001a\u00020\u00022\u0006\u0010k\u001a\u00020\u00028\u0000@@X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\u0016\u0010r\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010iR\u0016\u0010s\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bo\u0010gR\u001a\u0010v\u001a\b\u0012\u0004\u0012\u00020\n0t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010uR\u0016\u0010x\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bw\u0010g¨\u0006y"}, d2 = {"LT1/L;", "Landroid/view/inputmethod/InputConnection;", "LT1/P;", "initState", "LT1/t;", "eventCallback", "", "autoCorrect", "<init>", "(LT1/P;LT1/t;Z)V", "LT1/i;", "editCommand", "LXH/N;", "b", "(LT1/i;)V", "c", "()Z", "d", "", "code", "e", "(I)V", "state", "LT1/u;", "inputMethodManager", "g", "(LT1/P;LT1/u;)V", "beginBatchEdit", "endBatchEdit", "closeConnection", "()V", "", "text", "newCursorPosition", "commitText", "(Ljava/lang/CharSequence;I)Z", "start", "end", "setComposingRegion", "(II)Z", "setComposingText", "beforeLength", "afterLength", "deleteSurroundingTextInCodePoints", "deleteSurroundingText", "setSelection", "finishComposingText", "Landroid/view/KeyEvent;", "event", "sendKeyEvent", "(Landroid/view/KeyEvent;)Z", "maxChars", "flags", "getTextBeforeCursor", "(II)Ljava/lang/CharSequence;", "getTextAfterCursor", "getSelectedText", "(I)Ljava/lang/CharSequence;", "cursorUpdateMode", "requestCursorUpdates", "(I)Z", "Landroid/view/inputmethod/ExtractedTextRequest;", "request", "Landroid/view/inputmethod/ExtractedText;", "getExtractedText", "(Landroid/view/inputmethod/ExtractedTextRequest;I)Landroid/view/inputmethod/ExtractedText;", "id", "performContextMenuAction", "editorAction", "performEditorAction", "Landroid/view/inputmethod/CompletionInfo;", "commitCompletion", "(Landroid/view/inputmethod/CompletionInfo;)Z", "Landroid/view/inputmethod/CorrectionInfo;", "correctionInfo", "commitCorrection", "(Landroid/view/inputmethod/CorrectionInfo;)Z", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "states", "clearMetaKeyStates", "enabled", "reportFullscreenMode", "(Z)Z", "reqModes", "getCursorCapsMode", "(I)I", "", "action", "Landroid/os/Bundle;", "data", "performPrivateCommand", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "Landroid/view/inputmethod/InputContentInfo;", "inputContentInfo", "opts", "commitContent", "(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z", "a", "LT1/t;", "getEventCallback", "()LT1/t;", "Z", "getAutoCorrect", "I", "batchDepth", "value", "LT1/P;", "getMTextFieldValue$ui_release", "()LT1/P;", "f", "(LT1/P;)V", "mTextFieldValue", "currentExtractedTextRequestToken", "extractedTextMonitorMode", "", "Ljava/util/List;", "editCommands", "h", "isActive", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C16814e
public final class L implements InputConnection {

    /* renamed from: a  reason: collision with root package name */
    private final C4850t f13523a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f13524b;

    /* renamed from: c  reason: collision with root package name */
    private int f13525c;

    /* renamed from: d  reason: collision with root package name */
    private P f13526d;

    /* renamed from: e  reason: collision with root package name */
    private int f13527e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f13528f;

    /* renamed from: g  reason: collision with root package name */
    private final List<C4840i> f13529g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private boolean f13530h = true;

    public L(P p10, C4850t tVar, boolean z10) {
        this.f13523a = tVar;
        this.f13524b = z10;
        this.f13526d = p10;
    }

    private final void b(C4840i iVar) {
        c();
        try {
            this.f13529g.add(iVar);
        } finally {
            d();
        }
    }

    private final boolean c() {
        this.f13525c++;
        return true;
    }

    private final boolean d() {
        int i10 = this.f13525c - 1;
        this.f13525c = i10;
        if (i10 == 0 && !this.f13529g.isEmpty()) {
            this.f13523a.d(C16877v.w1(this.f13529g));
            this.f13529g.clear();
        }
        return this.f13525c > 0;
    }

    private final void e(int i10) {
        sendKeyEvent(new KeyEvent(0, i10));
        sendKeyEvent(new KeyEvent(1, i10));
    }

    public boolean beginBatchEdit() {
        boolean z10 = this.f13530h;
        return z10 ? c() : z10;
    }

    public boolean clearMetaKeyStates(int i10) {
        boolean z10 = this.f13530h;
        if (z10) {
            return false;
        }
        return z10;
    }

    public void closeConnection() {
        this.f13529g.clear();
        this.f13525c = 0;
        this.f13530h = false;
        this.f13523a.e(this);
    }

    public boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z10 = this.f13530h;
        if (z10) {
            return false;
        }
        return z10;
    }

    public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        boolean z10 = this.f13530h;
        if (z10) {
            return false;
        }
        return z10;
    }

    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z10 = this.f13530h;
        return z10 ? this.f13524b : z10;
    }

    public boolean commitText(CharSequence charSequence, int i10) {
        boolean z10 = this.f13530h;
        if (z10) {
            b(new C4832a(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    public boolean deleteSurroundingText(int i10, int i11) {
        boolean z10 = this.f13530h;
        if (!z10) {
            return z10;
        }
        b(new C4838g(i10, i11));
        return true;
    }

    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        boolean z10 = this.f13530h;
        if (!z10) {
            return z10;
        }
        b(new C4839h(i10, i11));
        return true;
    }

    public boolean endBatchEdit() {
        return d();
    }

    public final void f(P p10) {
        this.f13526d = p10;
    }

    public boolean finishComposingText() {
        boolean z10 = this.f13530h;
        if (!z10) {
            return z10;
        }
        b(new C4845n());
        return true;
    }

    public final void g(P p10, C4851u uVar) {
        if (this.f13530h) {
            f(p10);
            if (this.f13528f) {
                uVar.d(this.f13527e, C4853w.a(p10));
            }
            W g10 = p10.g();
            int i10 = -1;
            int l10 = g10 != null ? W.l(g10.r()) : -1;
            W g11 = p10.g();
            if (g11 != null) {
                i10 = W.k(g11.r());
            }
            uVar.e(W.l(p10.h()), W.k(p10.h()), l10, i10);
        }
    }

    public int getCursorCapsMode(int i10) {
        return TextUtils.getCapsMode(this.f13526d.i(), W.l(this.f13526d.h()), i10);
    }

    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        boolean z10 = true;
        int i11 = 0;
        if ((i10 & 1) == 0) {
            z10 = false;
        }
        this.f13528f = z10;
        if (z10) {
            if (extractedTextRequest != null) {
                i11 = extractedTextRequest.token;
            }
            this.f13527e = i11;
        }
        return C4853w.a(this.f13526d);
    }

    public Handler getHandler() {
        return null;
    }

    public CharSequence getSelectedText(int i10) {
        if (W.h(this.f13526d.h())) {
            return null;
        }
        return Q.a(this.f13526d).toString();
    }

    public CharSequence getTextAfterCursor(int i10, int i11) {
        return Q.b(this.f13526d, i10).toString();
    }

    public CharSequence getTextBeforeCursor(int i10, int i11) {
        return Q.c(this.f13526d, i10).toString();
    }

    public boolean performContextMenuAction(int i10) {
        boolean z10 = this.f13530h;
        if (z10) {
            z10 = false;
            switch (i10) {
                case 16908319:
                    b(new O(0, this.f13526d.i().length()));
                    break;
                case 16908320:
                    e(277);
                    break;
                case 16908321:
                    e(278);
                    break;
                case 16908322:
                    e(279);
                    break;
            }
        }
        return z10;
    }

    public boolean performEditorAction(int i10) {
        int i11;
        boolean z10 = this.f13530h;
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
        this.f13523a.c(i11);
        return true;
    }

    public boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z10 = this.f13530h;
        if (z10) {
            return true;
        }
        return z10;
    }

    public boolean reportFullscreenMode(boolean z10) {
        return false;
    }

    public boolean requestCursorUpdates(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14 = this.f13530h;
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
        this.f13523a.b(z16, z17, z13, z12, z11, z10);
        return true;
    }

    public boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z10 = this.f13530h;
        if (!z10) {
            return z10;
        }
        this.f13523a.a(keyEvent);
        return true;
    }

    public boolean setComposingRegion(int i10, int i11) {
        boolean z10 = this.f13530h;
        if (z10) {
            b(new M(i10, i11));
        }
        return z10;
    }

    public boolean setComposingText(CharSequence charSequence, int i10) {
        boolean z10 = this.f13530h;
        if (z10) {
            b(new N(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    public boolean setSelection(int i10, int i11) {
        boolean z10 = this.f13530h;
        if (!z10) {
            return z10;
        }
        b(new O(i10, i11));
        return true;
    }
}
