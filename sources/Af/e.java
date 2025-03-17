package af;

import Lg.c;
import We.b;
import XH.C16807N;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import jp.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00060\u000fR\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Laf/e;", "LLg/a;", "Laf/f;", "Lkotlin/Function1;", "LXH/N;", "toggleSetting", "<init>", "(LnI/l;)V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "Laf/e$a;", "f", "(Landroid/view/ViewGroup;)Laf/e$a;", "b", "LnI/l;", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e extends Lg.a<f> {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C17642l<f, C16807N> f65296b;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u000f\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\u0013\u001a\n \f*\u0004\u0018\u00010\u00100\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Laf/e$a;", "LLg/c;", "Laf/f;", "Landroid/view/View;", "itemView", "<init>", "(Laf/e;Landroid/view/View;)V", "viewModel", "LXH/N;", "m", "(Laf/f;)V", "Landroidx/appcompat/widget/SwitchCompat;", "kotlin.jvm.PlatformType", "h", "Landroidx/appcompat/widget/SwitchCompat;", "toggle", "Landroid/widget/TextView;", "i", "Landroid/widget/TextView;", "body", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends c<f> {

        /* renamed from: h  reason: collision with root package name */
        private final SwitchCompat f65297h;

        /* renamed from: i  reason: collision with root package name */
        private final TextView f65298i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ e f65299j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(e eVar, View view) {
            super(view, false);
            C17542s.j(view, "itemView");
            this.f65299j = eVar;
            this.f65297h = (SwitchCompat) view.findViewById(We.a.f64707w);
            this.f65298i = (TextView) view.findViewById(We.a.f64686b);
        }

        /* access modifiers changed from: private */
        public static final void n(a aVar, e eVar, f fVar, View view) {
            aVar.f65297h.isChecked();
            aVar.f65297h.isChecked();
            eVar.f65296b.invoke(fVar);
        }

        /* renamed from: m */
        public void c(f fVar) {
            C17542s.j(fVar, "viewModel");
            super.c(fVar);
            SwitchCompat switchCompat = this.f65297h;
            switchCompat.setText(fVar.c());
            switchCompat.setEnabled(fVar.e());
            switchCompat.setChecked(fVar.a());
            this.f65297h.setOnClickListener(new d(this, this.f65299j, fVar));
            this.f65298i.setText(fVar.b());
        }
    }

    public e(C17642l<? super f, C16807N> lVar) {
        C17542s.j(lVar, "toggleSetting");
        this.f65296b = lVar;
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof f;
    }

    /* renamed from: f */
    public a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        View c10 = h.c(viewGroup, b.f64715h, false, 2, (Object) null);
        C17542s.i(c10, "inflate$default(...)");
        return new a(this, c10);
    }
}
