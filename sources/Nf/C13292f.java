package NF;

import android.content.Context;
import com.sugarcube.app.base.util.StringProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LNF/f;", "Lcom/sugarcube/app/base/util/StringProvider;", "Landroid/content/Context;", "appContext", "<init>", "(Landroid/content/Context;)V", "", "resId", "", "getString", "(I)Ljava/lang/String;", "a", "Landroid/content/Context;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: NF.f  reason: case insensitive filesystem */
public final class C13292f implements StringProvider {

    /* renamed from: a  reason: collision with root package name */
    private final Context f112482a;

    public C13292f(Context context) {
        C17542s.j(context, "appContext");
        this.f112482a = context;
    }

    public String getString(int i10) {
        String string = this.f112482a.getString(i10);
        C17542s.i(string, "getString(...)");
        return string;
    }
}
