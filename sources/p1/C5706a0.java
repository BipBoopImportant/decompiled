package p1;

import android.graphics.Shader;
import android.os.Build;
import kotlin.Metadata;
import p1.m1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0004"}, d2 = {"Lp1/m1;", "Landroid/graphics/Shader$TileMode;", "a", "(I)Landroid/graphics/Shader$TileMode;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: p1.a0  reason: case insensitive filesystem */
public final class C5706a0 {
    public static final Shader.TileMode a(int i10) {
        m1.a aVar = m1.f27333b;
        return m1.h(i10, aVar.a()) ? Shader.TileMode.CLAMP : m1.h(i10, aVar.d()) ? Shader.TileMode.REPEAT : m1.h(i10, aVar.c()) ? Shader.TileMode.MIRROR : m1.h(i10, aVar.b()) ? Build.VERSION.SDK_INT >= 31 ? o1.f27340a.b() : Shader.TileMode.CLAMP : Shader.TileMode.CLAMP;
    }
}
