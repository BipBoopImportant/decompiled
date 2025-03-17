package h;

import XH.C16796C;
import XH.v;
import YH.C16870n;
import YH.C16877v;
import YH.X;
import android.content.Context;
import android.content.Intent;
import h.C5403a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tI.C17978n;
import u2.C6012a;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \f2 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00040\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ9\u0010\u000f\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lh/b;", "Lh/a;", "", "", "", "", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;[Ljava/lang/String;)Landroid/content/Intent;", "Lh/a$a;", "b", "(Landroid/content/Context;[Ljava/lang/String;)Lh/a$a;", "", "resultCode", "intent", "c", "(ILandroid/content/Intent;)Ljava/util/Map;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: h.b  reason: case insensitive filesystem */
public final class C5404b extends C5403a<String[], Map<String, Boolean>> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f23767a = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lh/b$a;", "", "<init>", "()V", "", "", "input", "Landroid/content/Intent;", "a", "([Ljava/lang/String;)Landroid/content/Intent;", "ACTION_REQUEST_PERMISSIONS", "Ljava/lang/String;", "EXTRA_PERMISSIONS", "EXTRA_PERMISSION_GRANT_RESULTS", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: h.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent a(String[] strArr) {
            C17542s.j(strArr, "input");
            Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
            C17542s.i(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return putExtra;
        }

        private a() {
        }
    }

    /* renamed from: a */
    public Intent createIntent(Context context, String[] strArr) {
        C17542s.j(context, "context");
        C17542s.j(strArr, "input");
        return f23767a.a(strArr);
    }

    /* renamed from: b */
    public C5403a.C0385a<Map<String, Boolean>> getSynchronousResult(Context context, String[] strArr) {
        C17542s.j(context, "context");
        C17542s.j(strArr, "input");
        if (strArr.length == 0) {
            return new C5403a.C0385a<>(X.j());
        }
        for (String a10 : strArr) {
            if (C6012a.a(context, a10) != 0) {
                return null;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C17978n.e(X.e(strArr.length), 16));
        for (String a11 : strArr) {
            v a12 = C16796C.a(a11, Boolean.TRUE);
            linkedHashMap.put(a12.c(), a12.d());
        }
        return new C5403a.C0385a<>(linkedHashMap);
    }

    /* renamed from: c */
    public Map<String, Boolean> parseResult(int i10, Intent intent) {
        if (i10 != -1) {
            return X.j();
        }
        if (intent == null) {
            return X.j();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return X.j();
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        int length = intArrayExtra.length;
        for (int i11 = 0; i11 < length; i11++) {
            arrayList.add(Boolean.valueOf(intArrayExtra[i11] == 0));
        }
        return X.v(C16877v.D1(C16870n.d0(stringArrayExtra), arrayList));
    }
}
