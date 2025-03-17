package Xn;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LXn/j;", "LXn/i;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "LXH/N;", "a", "(Landroid/content/Context;Landroid/content/Intent;)V", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j implements i {
    public void a(Context context, Intent intent) {
        C17542s.j(context, "context");
        C17542s.j(intent, "intent");
        context.startActivity(intent);
    }
}
