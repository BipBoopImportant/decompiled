package dH;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.C5187o;
import cH.C17062a;
import gH.C17265a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ+\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LdH/b;", "", "<init>", "()V", "T", "Landroid/content/Context;", "context", "Ljava/lang/Class;", "entryPoint", "b", "(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;", "Landroid/app/Activity;", "activity", "a", "(Landroid/app/Activity;Ljava/lang/Class;)Ljava/lang/Object;", "Landroidx/fragment/app/o;", "fragment", "c", "(Landroidx/fragment/app/o;Ljava/lang/Class;)Ljava/lang/Object;", "java_dagger_hilt_android-entry_point_accessors_internal_kt"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* renamed from: dH.b  reason: case insensitive filesystem */
public final class C17158b {

    /* renamed from: a  reason: collision with root package name */
    public static final C17158b f142961a = new C17158b();

    private C17158b() {
    }

    public static final <T> T a(Activity activity, Class<T> cls) {
        C17542s.j(activity, "activity");
        C17542s.j(cls, "entryPoint");
        return C17062a.a(activity, cls);
    }

    public static final <T> T b(Context context, Class<T> cls) {
        C17542s.j(context, "context");
        C17542s.j(cls, "entryPoint");
        return C17062a.a(C17265a.a(context.getApplicationContext()), cls);
    }

    public static final <T> T c(C5187o oVar, Class<T> cls) {
        C17542s.j(oVar, "fragment");
        C17542s.j(cls, "entryPoint");
        return C17062a.a(oVar, cls);
    }
}
