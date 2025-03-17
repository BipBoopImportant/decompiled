package AF;

import AF.C12570D;
import DF.C12754C;
import DF.C12785b;
import DF.C12786c;
import DF.H;
import OE.n;
import QE.Y;
import QE.Z;
import QE.a0;
import QE.d0;
import QE.f0;
import XH.v;
import YH.C16877v;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q;
import com.sugarcube.app.base.ui.gallery.adapters.main.GalleryHomeContentAdapter;
import com.sugarcube.app.base.ui.gallery.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import zF.C15342c;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\"\u0010#J\u001d\u0010&\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"LAF/u;", "Landroidx/recyclerview/widget/q;", "LAF/D;", "Landroidx/recyclerview/widget/RecyclerView$G;", "Landroid/content/Context;", "context", "LDF/C;", "viewModel", "Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;", "listener", "<init>", "(Landroid/content/Context;LDF/C;Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;)V", "LDF/c;", "content", "", "d", "(LDF/c;)Ljava/util/List;", "e", "()Ljava/util/List;", "LXH/v;", "", "", "c", "()LXH/v;", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$G;", "holder", "position", "LXH/N;", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$G;I)V", "getItemViewType", "(I)I", "", "isLoggedIn", "f", "(LDF/c;Z)V", "h", "Landroid/content/Context;", "i", "LDF/C;", "j", "Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;", "k", "LDF/c;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: AF.u  reason: case insensitive filesystem */
public final class C12600u extends q<C12570D, RecyclerView.G> {

    /* renamed from: h  reason: collision with root package name */
    private final Context f107719h;

    /* renamed from: i  reason: collision with root package name */
    private final C12754C f107720i;

    /* renamed from: j  reason: collision with root package name */
    private final GalleryHomeContentAdapter.OnInteractionsListener f107721j;

    /* renamed from: k  reason: collision with root package name */
    private C12786c f107722k;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: AF.u$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f107723a;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                AF.x[] r0 = AF.C12603x.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                AF.x r1 = AF.C12603x.HEADER     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                AF.x r1 = AF.C12603x.NEED_HELP     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                AF.x r1 = AF.C12603x.DESIGN_DETAILS     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                AF.x r1 = AF.C12603x.LOGIN     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                AF.x r1 = AF.C12603x.DESIGN_ON_WEB     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f107723a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: AF.C12600u.a.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12600u(Context context, C12754C c10, GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener) {
        super(new C15342c());
        C17542s.j(context, "context");
        C17542s.j(c10, "viewModel");
        this.f107719h = context;
        this.f107720i = c10;
        this.f107721j = onInteractionsListener;
    }

    private final v<String, Integer> c() {
        H f10;
        C12786c cVar = this.f107722k;
        if (cVar == null || (f10 = cVar.f()) == null) {
            return null;
        }
        return new v<>(this.f107719h.getString(f10.c()), Integer.valueOf(f10.a()));
    }

    private final List<C12570D> d(C12786c cVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C12570D.e.f107646h);
        for (Object next : cVar.a()) {
            if (next instanceof C12785b) {
                arrayList.add(new C12570D.b((C12785b) next));
            }
        }
        arrayList.add(C12570D.f.f107647h);
        return arrayList;
    }

    private final List<C12570D> e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C12570D.g(false));
        arrayList.add(C12570D.c.f107644h);
        return arrayList;
    }

    public final void f(C12786c cVar, boolean z10) {
        C17542s.j(cVar, "content");
        this.f107722k = cVar;
        ArrayList arrayList = new ArrayList();
        for (Object next : cVar.a()) {
            if (next instanceof C12785b) {
                arrayList.add(next);
            }
        }
        submitList(C16877v.t1((!z10 || arrayList.isEmpty()) ? !z10 ? e() : C16877v.e(C12570D.c.f107644h) : d(cVar)));
    }

    public int getItemViewType(int i10) {
        C12570D d10 = (C12570D) getItem(i10);
        return (d10 instanceof C12570D.e ? C12603x.HEADER : d10 instanceof C12570D.f ? C12603x.NEED_HELP : d10 instanceof C12570D.b ? C12603x.DESIGN_DETAILS : d10 instanceof C12570D.g ? C12603x.LOGIN : d10 instanceof C12570D.c ? C12603x.DESIGN_ON_WEB : C12603x.UNKNOWN).ordinal();
    }

    public void onBindViewHolder(RecyclerView.G g10, int i10) {
        C17542s.j(g10, "holder");
        if (g10 instanceof C12595o) {
            C12570D d10 = (C12570D) getItem(i10);
            C12785b h10 = d10 instanceof C12570D.b ? ((C12570D.b) d10).h() : null;
            if (h10 != null) {
                ((C12595o) g10).k(h10);
            }
        }
        if (g10 instanceof C12567A) {
            C12570D d11 = (C12570D) getItem(i10);
            if (d11 instanceof C12570D.g) {
                ((C12567A) g10).e().f114489b.setText(this.f107719h.getText(((C12570D.g) d11).h() ? n.f113262P4 : n.f113274R4));
            }
        }
    }

    public RecyclerView.G onCreateViewHolder(ViewGroup viewGroup, int i10) {
        H f10;
        H f11;
        C17542s.j(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        C12603x a10 = C12603x.Companion.a(i10);
        int i11 = a10 == null ? -1 : a.f107723a[a10.ordinal()];
        if (i11 != 1) {
            h hVar = null;
            if (i11 == 2) {
                OE.q M12 = this.f107720i.M1();
                Context context = this.f107719h;
                Z c10 = Z.c(from, viewGroup, false);
                C17542s.i(c10, "inflate(...)");
                GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener = this.f107721j;
                C12786c cVar = this.f107722k;
                if (!(cVar == null || (f10 = cVar.f()) == null)) {
                    hVar = f10.b();
                }
                return new C12602w(M12, context, c10, onInteractionsListener, hVar);
            } else if (i11 == 3) {
                a0 c11 = a0.c(from, viewGroup, false);
                C17542s.i(c11, "inflate(...)");
                return new C12595o(c11, this.f107720i);
            } else if (i11 == 4) {
                Y c12 = Y.c(from, viewGroup, false);
                C17542s.i(c12, "inflate(...)");
                GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener2 = this.f107721j;
                C12786c cVar2 = this.f107722k;
                if (!(cVar2 == null || (f11 = cVar2.f()) == null)) {
                    hVar = f11.b();
                }
                return new C12567A(c12, onInteractionsListener2, hVar);
            } else if (i11 == 5) {
                f0 c13 = f0.c(from, viewGroup, false);
                C17542s.i(c13, "inflate(...)");
                return new C12597q(c13, this.f107721j);
            } else {
                throw new ClassCastException("Unknown viewType " + i10);
            }
        } else {
            d0 c14 = d0.c(from, viewGroup, false);
            C17542s.i(c14, "inflate(...)");
            return new C12581a(c14, c());
        }
    }
}
