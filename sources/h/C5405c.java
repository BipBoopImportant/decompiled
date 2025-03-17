package h;

import android.content.Context;
import android.content.Intent;
import h.C5403a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import u2.C6012a;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lh/c;", "Lh/a;", "", "", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;", "", "resultCode", "intent", "b", "(ILandroid/content/Intent;)Ljava/lang/Boolean;", "Lh/a$a;", "a", "(Landroid/content/Context;Ljava/lang/String;)Lh/a$a;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: h.c  reason: case insensitive filesystem */
public final class C5405c extends C5403a<String, Boolean> {
    /* renamed from: a */
    public C5403a.C0385a<Boolean> getSynchronousResult(Context context, String str) {
        C17542s.j(context, "context");
        C17542s.j(str, "input");
        if (C6012a.a(context, str) == 0) {
            return new C5403a.C0385a<>(Boolean.TRUE);
        }
        return null;
    }

    /* renamed from: b */
    public Boolean parseResult(int i10, Intent intent) {
        if (intent == null || i10 != -1) {
            return Boolean.FALSE;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        boolean z10 = false;
        if (intArrayExtra != null) {
            int length = intArrayExtra.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                } else if (intArrayExtra[i11] == 0) {
                    z10 = true;
                    break;
                } else {
                    i11++;
                }
            }
        }
        return Boolean.valueOf(z10);
    }

    public Intent createIntent(Context context, String str) {
        C17542s.j(context, "context");
        C17542s.j(str, "input");
        return C5404b.f23767a.a(new String[]{str});
    }
}
