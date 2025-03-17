package androidx.compose.ui.platform;

import N1.C4669d;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/platform/j;", "Landroidx/compose/ui/platform/d0;", "Landroid/content/ClipboardManager;", "clipboardManager", "<init>", "(Landroid/content/ClipboardManager;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "LN1/d;", "annotatedString", "LXH/N;", "b", "(LN1/d;)V", "a", "()LN1/d;", "", "c", "()Z", "Landroid/content/ClipboardManager;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.j  reason: case insensitive filesystem */
public final class C5111j implements C5094d0 {

    /* renamed from: a  reason: collision with root package name */
    private final ClipboardManager f19509a;

    public C5111j(ClipboardManager clipboardManager) {
        this.f19509a = clipboardManager;
    }

    public C4669d a() {
        ClipData primaryClip = this.f19509a.getPrimaryClip();
        CharSequence charSequence = null;
        if (primaryClip == null || primaryClip.getItemCount() <= 0) {
            return null;
        }
        ClipData.Item itemAt = primaryClip.getItemAt(0);
        if (itemAt != null) {
            charSequence = itemAt.getText();
        }
        return C5114k.a(charSequence);
    }

    public void b(C4669d dVar) {
        this.f19509a.setPrimaryClip(ClipData.newPlainText("plain text", C5114k.b(dVar)));
    }

    public boolean c() {
        ClipDescription primaryClipDescription = this.f19509a.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5111j(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "clipboard"
            java.lang.Object r2 = r2.getSystemService(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.content.ClipboardManager"
            kotlin.jvm.internal.C17542s.h(r2, r0)
            android.content.ClipboardManager r2 = (android.content.ClipboardManager) r2
            r1.<init>((android.content.ClipboardManager) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C5111j.<init>(android.content.Context):void");
    }
}
