package Vi;

import Fz.t;
import G2.b;
import HJ.C15854t;
import Lg.c;
import Lg.e;
import android.graphics.Bitmap;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import vm.C12190a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LVi/f;", "LLg/a;", "LVi/g;", "Lvm/a;", "barcode", "", "barcodeSize", "<init>", "(Lvm/a;I)V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LLg/c;", "d", "(Landroid/view/ViewGroup;)LLg/c;", "b", "Lvm/a;", "c", "I", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Vi.f  reason: case insensitive filesystem */
public final class C10966f extends Lg.a<C10967g> {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C12190a f88566b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final int f88567c;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LVi/f$a;", "LLg/c;", "LVi/g;", "LFz/t;", "binding", "<init>", "(LVi/f;LFz/t;)V", "viewModel", "LXH/N;", "l", "(LVi/g;)V", "h", "LFz/t;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Vi.f$a */
    public final class a extends c<C10967g> {

        /* renamed from: h  reason: collision with root package name */
        private final t f88568h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C10966f f88569i;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(Vi.C10966f r2, Fz.t r3) {
            /*
                r1 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C17542s.j(r3, r0)
                r1.f88569i = r2
                androidx.constraintlayout.widget.ConstraintLayout r2 = r3.getRoot()
                java.lang.String r0 = "getRoot(...)"
                kotlin.jvm.internal.C17542s.i(r2, r0)
                r0 = 0
                r1.<init>((android.view.View) r2, (boolean) r0)
                r1.f88568h = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Vi.C10966f.a.<init>(Vi.f, Fz.t):void");
        }

        /* renamed from: l */
        public void c(C10967g gVar) {
            C17542s.j(gVar, "viewModel");
            super.c(gVar);
            t tVar = this.f88568h;
            C10966f fVar = this.f88569i;
            tVar.f110198g.setText(gVar.d());
            int i10 = 0;
            Bitmap bitmap = null;
            tVar.f110197f.setText(b.b(gVar.c(), 0, (Html.ImageGetter) null, (Html.TagHandler) null));
            tVar.f110194c.setBackground(e.b(this, gVar.b() ? Ez.b.f109495b : Ez.b.f109494a));
            AppCompatImageView appCompatImageView = tVar.f110195d;
            C17542s.i(appCompatImageView, "barcodeLogo");
            if (!gVar.b()) {
                i10 = 8;
            }
            appCompatImageView.setVisibility(i10);
            if (gVar.a().length() > 0) {
                bitmap = fVar.f88566b.a(gVar.a(), C12190a.C2496a.QR_CODE, fVar.f88567c, fVar.f88567c, true, 0, false);
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Failed to generate qr image from code: " + gVar.a());
                qv.e eVar = qv.e.WARN;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList) {
                    if (str == null) {
                        String a10 = C11818a.a((String) null, illegalArgumentException);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    if (str2 == null) {
                        String name = t.class.getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    bVar.a(eVar, str2, false, illegalArgumentException, str);
                }
            }
            tVar.f110196e.setImageBitmap(bitmap);
        }
    }

    public C10966f(C12190a aVar, int i10) {
        C17542s.j(aVar, "barcode");
        this.f88566b = aVar;
        this.f88567c = i10;
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof C10967g;
    }

    public c<C10967g> d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        t c10 = t.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C17542s.i(c10, "inflate(...)");
        return new a(this, c10);
    }
}
