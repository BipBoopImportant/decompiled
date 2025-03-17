package AF;

import DF.C12754C;
import DF.C12785b;
import NF.C13291e;
import OE.C13320l;
import OE.n;
import QE.a0;
import QE.b0;
import VE.C13760b;
import YH.C16877v;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.t;
import com.sugarcube.app.base.navigation.Kreativ;
import com.sugarcube.core.network.models.PlacedFurniture;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x4.C;
import x4.C8951o;
import x4.H;
import x4.I;
import yF.C15303a;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"LAF/o;", "Landroidx/recyclerview/widget/RecyclerView$G;", "LQE/a0;", "binding", "LDF/C;", "viewModel", "<init>", "(LQE/a0;LDF/C;)V", "LXH/N;", "t", "()V", "LDF/b;", "galleryComposition", "k", "(LDF/b;)V", "e", "LQE/a0;", "f", "LDF/C;", "g", "LDF/b;", "composition", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: AF.o  reason: case insensitive filesystem */
public final class C12595o extends RecyclerView.G {

    /* renamed from: e  reason: collision with root package name */
    private final a0 f107711e;

    /* renamed from: f  reason: collision with root package name */
    private final C12754C f107712f;

    /* renamed from: g  reason: collision with root package name */
    private C12785b f107713g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12595o(a0 a0Var, C12754C c10) {
        super(a0Var.getRoot());
        C17542s.j(a0Var, "binding");
        C17542s.j(c10, "viewModel");
        this.f107711e = a0Var;
        this.f107712f = c10;
    }

    /* access modifiers changed from: private */
    public static final void l(C12595o oVar, View view) {
        oVar.t();
    }

    /* access modifiers changed from: private */
    public static final void m(TextView textView, String str, View view) {
        textView.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    /* access modifiers changed from: private */
    public static final void n(C12595o oVar, View view) {
        oVar.t();
    }

    /* access modifiers changed from: private */
    public static final void o(C12595o oVar, View view) {
        oVar.t();
    }

    /* access modifiers changed from: private */
    public static final void p(C12595o oVar, View view) {
        oVar.t();
    }

    /* access modifiers changed from: private */
    public static final void q(C12595o oVar, View view) {
        oVar.t();
    }

    /* access modifiers changed from: private */
    public static final void r(C12595o oVar, View view) {
        oVar.t();
    }

    /* access modifiers changed from: private */
    public static final void s(C12595o oVar, View view) {
        oVar.t();
    }

    private final void t() {
        C12785b bVar = this.f107713g;
        if (bVar != null) {
            this.f107712f.y0();
            this.f107712f.A2(bVar.a().getSceneUuid());
            this.f107712f.z2(bVar.a().getCompositionUuid());
            LinearLayout b10 = this.f107711e.getRoot();
            C17542s.i(b10, "getRoot(...)");
            C8951o.f0(H.b(b10), new Kreativ.Gallery.OverflowSheet((String) null, false, 3, (DefaultConstructorMarker) null), (C) null, (I.a) null, 6, (Object) null);
        }
    }

    public final void k(C12785b bVar) {
        C17542s.j(bVar, "galleryComposition");
        this.f107713g = bVar;
        View view = this.itemView;
        String displayName = bVar.a().getDisplayName();
        if (displayName != null) {
            this.f107711e.f114505e.setText(displayName);
        } else {
            this.f107711e.f114505e.setText(n.f113453s3);
        }
        Uri thumbnailUrl = bVar.a().getThumbnailUrl();
        if (thumbnailUrl != null) {
            t c10 = this.f107712f.M1().c();
            ImageView imageView = this.f107711e.f114507g;
            C17542s.i(imageView, "imageComposition");
            C13291e.a(c10, thumbnailUrl, imageView, 5);
        }
        List<PlacedFurniture> placedFurnitureSet = bVar.a().getPlacedFurnitureSet();
        if (placedFurnitureSet == null) {
            placedFurnitureSet = C16877v.n();
        }
        this.f107711e.f114504d.setText(view.getContext().getResources().getQuantityString(C13320l.f113163c, placedFurnitureSet.size(), new Object[]{Integer.valueOf(placedFurnitureSet.size())}));
        b0 b0Var = this.f107711e.f114502b;
        C17542s.i(b0Var, "cardDetailFurnitureBoxedView");
        C15303a aVar = new C15303a(b0Var);
        List<PlacedFurniture> placedFurnitureSet2 = bVar.a().getPlacedFurnitureSet();
        Context context = view.getContext();
        C17542s.i(context, "getContext(...)");
        aVar.a(placedFurnitureSet2, context, this.f107712f.M1().c(), new C12587g(this));
        a0 a0Var = this.f107711e;
        if (bVar.a().isLegacy2D() || this.f107712f.T1()) {
            a0Var.f114502b.getRoot().setVisibility(0);
            TextView textView = a0Var.f114506f;
            if (textView != null) {
                textView.setVisibility(8);
            }
            a0Var.getRoot().setOnClickListener(new C12592l(this));
            a0Var.f114507g.setOnClickListener(new C12593m(this));
            a0Var.f114509i.setOnClickListener(new C12594n(this));
            return;
        }
        a0Var.f114502b.getRoot().setVisibility(8);
        TextView textView2 = a0Var.f114506f;
        if (textView2 != null) {
            String d10 = C13760b.f117438d.d(this.f107712f.M1().getCountry(), this.f107712f.M1().getLanguage());
            textView2.setVisibility(0);
            textView2.setText(Html.fromHtml(textView2.getContext().getString(n.f113398k4), 0));
            textView2.setOnClickListener(new C12588h(textView2, d10));
        }
        a0Var.getRoot().setOnClickListener(new C12589i(this));
        a0Var.f114507g.setOnClickListener(new C12590j(this));
        a0Var.f114509i.setOnClickListener(new C12591k(this));
    }
}
