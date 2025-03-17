package b6;

import X5.C6724i;
import a6.g;
import a6.l;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r6.C8698f;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lb6/c;", "Lr6/f;", "<init>", "()V", "LX5/i$a;", "b", "()LX5/i$a;", "coil-gif_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: b6.c  reason: case insensitive filesystem */
public final class C7072c implements C8698f {
    public C6724i.a b() {
        return Build.VERSION.SDK_INT >= 28 ? new g.b(false, 1, (DefaultConstructorMarker) null) : new l.a(false, 1, (DefaultConstructorMarker) null);
    }
}
