package T1;

import XH.C16807N;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import kotlin.Metadata;
import nI.C17642l;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0012\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\nJ!\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\r\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00020\u001b2\b\u0010\r\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b \u0010\u001dJ\u000f\u0010!\u001a\u00020\u001bH\u0016¢\u0006\u0004\b!\u0010\"J!\u0010#\u001a\u00020\u001b2\b\u0010\r\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b#\u0010\u001fJ\u0019\u0010%\u001a\u00020\u001b2\b\u0010\r\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u00020\u001b2\b\u0010\r\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b*\u0010\u001dJ\u0017\u0010+\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b-\u0010,J\u000f\u0010.\u001a\u00020\u001bH\u0016¢\u0006\u0004\b.\u0010\"J\u000f\u0010/\u001a\u00020\u001bH\u0016¢\u0006\u0004\b/\u0010\"J\u0019\u00101\u001a\u00020\u001b2\b\u0010\r\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b3\u0010,J\u0017\u00104\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u001bH\u0016¢\u0006\u0004\b4\u00105J#\u00108\u001a\u00020\u001b2\b\u0010\r\u001a\u0004\u0018\u0001062\b\u0010\u000e\u001a\u0004\u0018\u000107H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b:\u0010,J\u0017\u0010;\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b;\u0010<R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010=R(\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010>\u001a\u0004\u0018\u00010\u00028\u0004@BX\u000e¢\u0006\f\n\u0004\b;\u0010?\u001a\u0004\b@\u0010A¨\u0006B"}, d2 = {"LT1/A;", "LT1/z;", "Landroid/view/inputmethod/InputConnection;", "delegate", "Lkotlin/Function1;", "LXH/N;", "onConnectionClosed", "<init>", "(Landroid/view/inputmethod/InputConnection;LnI/l;)V", "a", "()V", "closeConnection", "", "p0", "p1", "", "getTextBeforeCursor", "(II)Ljava/lang/CharSequence;", "getTextAfterCursor", "getSelectedText", "(I)Ljava/lang/CharSequence;", "getCursorCapsMode", "(I)I", "Landroid/view/inputmethod/ExtractedTextRequest;", "Landroid/view/inputmethod/ExtractedText;", "getExtractedText", "(Landroid/view/inputmethod/ExtractedTextRequest;I)Landroid/view/inputmethod/ExtractedText;", "", "deleteSurroundingText", "(II)Z", "setComposingText", "(Ljava/lang/CharSequence;I)Z", "setComposingRegion", "finishComposingText", "()Z", "commitText", "Landroid/view/inputmethod/CompletionInfo;", "commitCompletion", "(Landroid/view/inputmethod/CompletionInfo;)Z", "Landroid/view/inputmethod/CorrectionInfo;", "commitCorrection", "(Landroid/view/inputmethod/CorrectionInfo;)Z", "setSelection", "performEditorAction", "(I)Z", "performContextMenuAction", "beginBatchEdit", "endBatchEdit", "Landroid/view/KeyEvent;", "sendKeyEvent", "(Landroid/view/KeyEvent;)Z", "clearMetaKeyStates", "reportFullscreenMode", "(Z)Z", "", "Landroid/os/Bundle;", "performPrivateCommand", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "requestCursorUpdates", "b", "(Landroid/view/inputmethod/InputConnection;)V", "LnI/l;", "<set-?>", "Landroid/view/inputmethod/InputConnection;", "c", "()Landroid/view/inputmethod/InputConnection;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
class A implements C4856z {

    /* renamed from: a  reason: collision with root package name */
    private final C17642l<C4856z, C16807N> f13512a;

    /* renamed from: b  reason: collision with root package name */
    private InputConnection f13513b;

    public A(InputConnection inputConnection, C17642l<? super C4856z, C16807N> lVar) {
        this.f13512a = lVar;
        this.f13513b = inputConnection;
    }

    public final void a() {
        InputConnection inputConnection = this.f13513b;
        if (inputConnection != null) {
            b(inputConnection);
            this.f13513b = null;
        }
    }

    /* access modifiers changed from: protected */
    public void b(InputConnection inputConnection) {
        throw null;
    }

    public boolean beginBatchEdit() {
        InputConnection inputConnection = this.f13513b;
        if (inputConnection != null) {
            return inputConnection.beginBatchEdit();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final InputConnection c() {
        return this.f13513b;
    }

    public boolean clearMetaKeyStates(int i10) {
        InputConnection inputConnection = this.f13513b;
        if (inputConnection != null) {
            return inputConnection.clearMetaKeyStates(i10);
        }
        return false;
    }

    public final void closeConnection() {
        if (this.f13513b != null) {
            a();
            this.f13512a.invoke(this);
        }
    }

    public boolean commitCompletion(CompletionInfo completionInfo) {
        InputConnection inputConnection = this.f13513b;
        if (inputConnection != null) {
            return inputConnection.commitCompletion(completionInfo);
        }
        return false;
    }

    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        InputConnection inputConnection = this.f13513b;
        if (inputConnection != null) {
            return inputConnection.commitCorrection(correctionInfo);
        }
        return false;
    }

    public boolean commitText(CharSequence charSequence, int i10) {
        InputConnection inputConnection = this.f13513b;
        if (inputConnection != null) {
            return inputConnection.commitText(charSequence, i10);
        }
        return false;
    }

    public boolean deleteSurroundingText(int i10, int i11) {
        InputConnection inputConnection = this.f13513b;
        if (inputConnection != null) {
            return inputConnection.deleteSurroundingText(i10, i11);
        }
        return false;
    }

    public boolean endBatchEdit() {
        InputConnection inputConnection = this.f13513b;
        if (inputConnection != null) {
            return inputConnection.endBatchEdit();
        }
        return false;
    }

    public boolean finishComposingText() {
        InputConnection inputConnection = this.f13513b;
        if (inputConnection != null) {
            return inputConnection.finishComposingText();
        }
        return false;
    }

    public int getCursorCapsMode(int i10) {
        InputConnection inputConnection = this.f13513b;
        if (inputConnection != null) {
            return inputConnection.getCursorCapsMode(i10);
        }
        return 0;
    }

    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        InputConnection inputConnection = this.f13513b;
        if (inputConnection != null) {
            return inputConnection.getExtractedText(extractedTextRequest, i10);
        }
        return null;
    }

    public CharSequence getSelectedText(int i10) {
        InputConnection inputConnection = this.f13513b;
        if (inputConnection != null) {
            return inputConnection.getSelectedText(i10);
        }
        return null;
    }

    public CharSequence getTextAfterCursor(int i10, int i11) {
        InputConnection inputConnection = this.f13513b;
        if (inputConnection != null) {
            return inputConnection.getTextAfterCursor(i10, i11);
        }
        return null;
    }

    public CharSequence getTextBeforeCursor(int i10, int i11) {
        InputConnection inputConnection = this.f13513b;
        if (inputConnection != null) {
            return inputConnection.getTextBeforeCursor(i10, i11);
        }
        return null;
    }

    public boolean performContextMenuAction(int i10) {
        InputConnection inputConnection = this.f13513b;
        if (inputConnection != null) {
            return inputConnection.performContextMenuAction(i10);
        }
        return false;
    }

    public boolean performEditorAction(int i10) {
        InputConnection inputConnection = this.f13513b;
        if (inputConnection != null) {
            return inputConnection.performEditorAction(i10);
        }
        return false;
    }

    public boolean performPrivateCommand(String str, Bundle bundle) {
        InputConnection inputConnection = this.f13513b;
        if (inputConnection != null) {
            return inputConnection.performPrivateCommand(str, bundle);
        }
        return false;
    }

    public boolean reportFullscreenMode(boolean z10) {
        InputConnection inputConnection = this.f13513b;
        if (inputConnection != null) {
            return inputConnection.reportFullscreenMode(z10);
        }
        return false;
    }

    public boolean requestCursorUpdates(int i10) {
        InputConnection inputConnection = this.f13513b;
        if (inputConnection != null) {
            return inputConnection.requestCursorUpdates(i10);
        }
        return false;
    }

    public boolean sendKeyEvent(KeyEvent keyEvent) {
        InputConnection inputConnection = this.f13513b;
        if (inputConnection != null) {
            return inputConnection.sendKeyEvent(keyEvent);
        }
        return false;
    }

    public boolean setComposingRegion(int i10, int i11) {
        InputConnection inputConnection = this.f13513b;
        if (inputConnection != null) {
            return inputConnection.setComposingRegion(i10, i11);
        }
        return false;
    }

    public boolean setComposingText(CharSequence charSequence, int i10) {
        InputConnection inputConnection = this.f13513b;
        if (inputConnection != null) {
            return inputConnection.setComposingText(charSequence, i10);
        }
        return false;
    }

    public boolean setSelection(int i10, int i11) {
        InputConnection inputConnection = this.f13513b;
        if (inputConnection != null) {
            return inputConnection.setSelection(i10, i11);
        }
        return false;
    }
}
