package B0;

import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.compose.ui.focus.d;
import androidx.compose.ui.platform.C5113j1;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import n1.C5626f;
import nI.C17642l;
import y1.C6254b;
import y1.C6255c;
import y1.C6256d;
import y1.C6258f;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001e\u0010\u000b\u001a\u00020\n*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/ui/d;", "LB0/B;", "state", "Ln1/f;", "focusManager", "b", "(Landroidx/compose/ui/d;LB0/B;Ln1/f;)Landroidx/compose/ui/d;", "Ly1/b;", "", "keyCode", "", "c", "(Landroid/view/KeyEvent;I)Z", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class S {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly1/b;", "keyEvent", "", "a", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<C6254b, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5626f f4602c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ B f4603d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C5626f fVar, B b10) {
            super(1);
            this.f4602c = fVar;
            this.f4603d = b10;
        }

        public final Boolean a(KeyEvent keyEvent) {
            InputDevice device = keyEvent.getDevice();
            boolean z10 = false;
            if (device != null && device.supportsSource(513) && !device.isVirtual() && C6255c.e(C6256d.b(keyEvent), C6255c.f32260a.a()) && keyEvent.getSource() != 257) {
                if (S.c(keyEvent, 19)) {
                    z10 = this.f4602c.d(d.f18832b.h());
                } else if (S.c(keyEvent, 20)) {
                    z10 = this.f4602c.d(d.f18832b.a());
                } else if (S.c(keyEvent, 21)) {
                    z10 = this.f4602c.d(d.f18832b.d());
                } else if (S.c(keyEvent, 22)) {
                    z10 = this.f4602c.d(d.f18832b.g());
                } else if (S.c(keyEvent, 23)) {
                    C5113j1 h10 = this.f4603d.h();
                    if (h10 != null) {
                        h10.a();
                    }
                    z10 = true;
                }
            }
            return Boolean.valueOf(z10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((C6254b) obj).f());
        }
    }

    public static final androidx.compose.ui.d b(androidx.compose.ui.d dVar, B b10, C5626f fVar) {
        return androidx.compose.ui.input.key.a.b(dVar, new a(fVar, b10));
    }

    /* access modifiers changed from: private */
    public static final boolean c(KeyEvent keyEvent, int i10) {
        return C6258f.b(C6256d.a(keyEvent)) == i10;
    }
}
