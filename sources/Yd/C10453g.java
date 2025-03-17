package yd;

import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lyd/g;", "Lyd/f;", "<init>", "()V", "Landroid/content/Context;", "context", "", "b", "(Landroid/content/Context;)Z", "a", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: yd.g  reason: case insensitive filesystem */
public final class C10453g implements C10452f {

    /* renamed from: a  reason: collision with root package name */
    private static final a f77926a = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lyd/g$a;", "", "<init>", "()V", "", "OPENGL_VERSION_3", "I", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: yd.g$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final boolean b(Context context) {
        Object systemService = context.getSystemService("activity");
        C17542s.h(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        return ((ActivityManager) systemService).getDeviceConfigurationInfo().reqGlEsVersion >= 196608;
    }

    public boolean a(Context context) {
        C17542s.j(context, "context");
        boolean b10 = b(context);
        if (!b10) {
            Log.i("KompassMapModule", "Device does not support OpenGL 3.0");
        }
        return b10;
    }
}
