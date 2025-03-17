package E0;

import U1.d;
import U1.e;
import YH.C16877v;
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LE0/t0;", "", "<init>", "()V", "Landroid/view/inputmethod/EditorInfo;", "editorInfo", "LU1/e;", "localeList", "LXH/N;", "a", "(Landroid/view/inputmethod/EditorInfo;LU1/e;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class t0 {

    /* renamed from: a  reason: collision with root package name */
    public static final t0 f5766a = new t0();

    private t0() {
    }

    public final void a(EditorInfo editorInfo, e eVar) {
        if (C17542s.e(eVar, e.f14214c.b())) {
            editorInfo.hintLocales = null;
            return;
        }
        ArrayList arrayList = new ArrayList(C16877v.y(eVar, 10));
        Iterator it = eVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((d) it.next()).a());
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
