package vm;

import HJ.C15854t;
import android.graphics.Bitmap;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import vm.C12190a;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0015\u001a\u00060\u0012j\u0002`\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lvm/e;", "Lvm/a;", "<init>", "()V", "", "value", "Lvm/a$a;", "format", "", "widthInPixel", "heightInPixel", "", "trimBoundaries", "margin", "useHighLevelErrorCorrection", "Landroid/graphics/Bitmap;", "a", "(Ljava/lang/String;Lvm/a$a;IIZIZ)Landroid/graphics/Bitmap;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "Ljava/lang/IllegalStateException;", "usingPreviewImplementationException", "Lvm/f;", "b", "Lvm/f;", "previewBarcode", "barcode_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: vm.e  reason: case insensitive filesystem */
final class C12194e implements C12190a {

    /* renamed from: a  reason: collision with root package name */
    private final IllegalStateException f105214a = new IllegalStateException("You need to provide a real instance of Barcode like:\n  CompositionLocalProvider(LocalBarcode provides barcode) {\n      MyComposableUsingBarcode()\n  }");

    /* renamed from: b  reason: collision with root package name */
    private final C12195f f105215b = new C12195f(0.0f, 1, (DefaultConstructorMarker) null);

    public Bitmap a(String str, C12190a.C2496a aVar, int i10, int i11, boolean z10, int i12, boolean z11) {
        C17542s.j(str, "value");
        C17542s.j(aVar, "format");
        IllegalStateException illegalStateException = this.f105214a;
        e eVar = e.ERROR;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str2 = null;
        String str3 = null;
        for (C11819b bVar : arrayList) {
            if (str2 == null) {
                String a10 = C11818a.a((String) null, illegalStateException);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = C12194e.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str5 = str3;
            bVar.a(eVar, str5, false, illegalStateException, str4);
            str2 = str4;
            str3 = str5;
        }
        return this.f105215b.a(str, aVar, i10, i11, z10, i12, z11);
    }
}
