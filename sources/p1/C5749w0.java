package p1;

import android.graphics.ColorFilter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u0000 \n2\u00020\u0001:\u0001\u0007B\u0015\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0000X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\u000b"}, d2 = {"Lp1/w0;", "", "Landroid/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/NativeColorFilter;", "nativeColorFilter", "<init>", "(Landroid/graphics/ColorFilter;)V", "a", "Landroid/graphics/ColorFilter;", "()Landroid/graphics/ColorFilter;", "b", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: p1.w0  reason: case insensitive filesystem */
public class C5749w0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f27365b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final ColorFilter f27366a;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Lp1/w0$a;", "", "<init>", "()V", "Lp1/v0;", "color", "Lp1/d0;", "blendMode", "Lp1/w0;", "a", "(JI)Lp1/w0;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: p1.w0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ C5749w0 b(a aVar, long j10, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                i10 = C5712d0.f27280a.z();
            }
            return aVar.a(j10, i10);
        }

        public final C5749w0 a(long j10, int i10) {
            return new C5714e0(j10, i10, (DefaultConstructorMarker) null);
        }

        private a() {
        }
    }

    public C5749w0(ColorFilter colorFilter) {
        this.f27366a = colorFilter;
    }

    public final ColorFilter a() {
        return this.f27366a;
    }
}
