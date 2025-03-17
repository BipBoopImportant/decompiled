package mg;

import android.content.Context;
import android.content.Intent;
import com.ingka.ikea.app.BlockingMessageActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import pw.b;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lmg/w;", "Lpw/b;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "a", "(Landroid/content/Context;)Landroid/content/Intent;", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mg.w  reason: case insensitive filesystem */
public final class C10065w implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final C10065w f75411a = new C10065w();

    private C10065w() {
    }

    public Intent a(Context context) {
        C17542s.j(context, "context");
        return new Intent(context, BlockingMessageActivity.class);
    }
}
