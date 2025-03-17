package vg;

import C7.a;
import E7.q;
import I7.k;
import L7.j;
import L7.r;
import L7.z;
import N7.h;
import U7.f;
import V7.i;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.k;
import com.bumptech.glide.l;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import vg.g;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001\u0016B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006("}, d2 = {"Lvg/a;", "Lvg/c;", "Landroid/widget/ImageView;", "imageView", "Lvg/g$b;", "imageSize", "Lvg/g;", "settings", "<init>", "(Landroid/widget/ImageView;Lvg/g$b;Lvg/g;)V", "Lcom/bumptech/glide/k;", "Landroid/graphics/drawable/Drawable;", "request", "LXH/N;", "d", "(Lcom/bumptech/glide/k;)V", "", "url", "b", "(Ljava/lang/String;)V", "", "resource", "a", "(I)V", "Landroid/widget/ImageView;", "Lvg/g$b;", "c", "Lvg/g;", "Lcom/bumptech/glide/l;", "Lcom/bumptech/glide/l;", "glide", "", "e", "Z", "disableAkamaiDensityFeature", "LU7/g;", "f", "LU7/g;", "requestOptions", "g", "imageloader_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: vg.a  reason: case insensitive filesystem */
public final class C10308a implements c {

    /* renamed from: g  reason: collision with root package name */
    public static final C1429a f77156g = new C1429a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final ImageView f77157a;

    /* renamed from: b  reason: collision with root package name */
    private final g.b f77158b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final g f77159c;

    /* renamed from: d  reason: collision with root package name */
    private final l f77160d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f77161e;

    /* renamed from: f  reason: collision with root package name */
    private U7.g f77162f;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lvg/a$a;", "", "<init>", "()V", "Landroid/widget/ImageView;", "imageView", "LXH/N;", "a", "(Landroid/widget/ImageView;)V", "imageloader_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vg.a$a  reason: collision with other inner class name */
    public static final class C1429a {
        public /* synthetic */ C1429a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(ImageView imageView) {
            C17542s.j(imageView, "imageView");
            com.bumptech.glide.b.u(imageView).p(imageView);
        }

        private C1429a() {
        }
    }

    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J;\u0010\u000b\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJA\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"vg/a$b", "LU7/f;", "Landroid/graphics/drawable/Drawable;", "LE7/q;", "e", "", "model", "LV7/i;", "target", "", "isFirstResource", "a", "(LE7/q;Ljava/lang/Object;LV7/i;Z)Z", "resource", "LC7/a;", "dataSource", "c", "(Landroid/graphics/drawable/Drawable;Ljava/lang/Object;LV7/i;LC7/a;Z)Z", "imageloader_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vg.a$b */
    public static final class b implements f<Drawable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C10308a f77163a;

        b(C10308a aVar) {
            this.f77163a = aVar;
        }

        public boolean a(q qVar, Object obj, i<Drawable> iVar, boolean z10) {
            C17542s.j(iVar, "target");
            this.f77163a.f77159c.b().invoke();
            return false;
        }

        /* renamed from: c */
        public boolean b(Drawable drawable, Object obj, i<Drawable> iVar, a aVar, boolean z10) {
            C17542s.j(drawable, "resource");
            C17542s.j(obj, "model");
            C17542s.j(aVar, "dataSource");
            this.f77163a.f77159c.d().invoke(drawable);
            return false;
        }
    }

    public C10308a(ImageView imageView, g.b bVar, g gVar) {
        C17542s.j(imageView, "imageView");
        C17542s.j(bVar, "imageSize");
        C17542s.j(gVar, "settings");
        this.f77157a = imageView;
        this.f77158b = bVar;
        this.f77159c = gVar;
        l t10 = com.bumptech.glide.b.t(imageView.getContext());
        C17542s.i(t10, "with(...)");
        this.f77160d = t10;
        this.f77161e = gVar.h() == g.f.DISABLE;
        this.f77162f = new U7.g();
        ArrayList arrayList = new ArrayList();
        if (gVar.f().contains(g.d.b.f77189a)) {
            arrayList.add(new r());
        }
        for (g.d dVar : gVar.f()) {
            if (dVar instanceof g.d.c) {
                arrayList.add(new z(((g.d.c) dVar).a()));
            } else if (C17542s.e(dVar, g.d.a.f77188a)) {
                arrayList.add(new j());
            } else if (C17542s.e(dVar, g.d.b.f77189a)) {
                arrayList.add(new r());
            } else if (dVar instanceof g.d.C1430d) {
                g.d.C1430d dVar2 = (g.d.C1430d) dVar;
                this.f77162f = (U7.g) this.f77162f.c0(dVar2.b(), dVar2.a());
            }
        }
        if (!arrayList.isEmpty()) {
            this.f77162f = (U7.g) this.f77162f.p0(new C7.g(arrayList));
        }
        if (this.f77159c.e() != g.c.DEFAULT) {
            this.f77162f = (U7.g) this.f77162f.o0(this.f77159c.e().b());
        }
    }

    private final void d(k<Drawable> kVar) {
        g.e g10 = this.f77159c.g();
        if (g10 instanceof g.e.a) {
            kVar = kVar.Q0(h.l());
            C17542s.i(kVar, "transition(...)");
        } else if (g10 instanceof g.e.b) {
            kVar = kVar.Q0(new h().b());
            C17542s.i(kVar, "transition(...)");
        }
        ((k) ((k) kVar.d0(this.f77159c.c())).a(this.f77162f).j(this.f77159c.a())).v0(new b(this)).I0(this.f77157a);
    }

    public void a(int i10) {
        k<Drawable> u10 = this.f77160d.u(Integer.valueOf(i10));
        C17542s.i(u10, "load(...)");
        d(u10);
    }

    public void b(String str) {
        C17542s.j(str, "url");
        String b10 = this.f77158b.b(str);
        k<Drawable> v10 = this.f77160d.v(this.f77161e ? new I7.h(b10, (I7.i) new k.a().b("x-im-pixel", "1").c()) : new I7.h(b10, (I7.i) new k.a().c()));
        C17542s.i(v10, "load(...)");
        d(v10);
    }
}
