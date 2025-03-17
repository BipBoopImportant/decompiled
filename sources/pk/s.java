package pk;

import IC.C13023e;
import KJ.C15987c;
import KJ.C15989e;
import Op.C10828d;
import Op.d1;
import Op.i1;
import androidx.recyclerview.widget.RecyclerView;
import com.google.ar.core.ImageMetadata;
import com.sugarcube.app.base.data.source.CatalogRepository;
import com.sugarcube.app.base.network.models.UploadKt;
import iB.C14549a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lm.C11550a;
import zk.C12529b;

@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b]\b\b\u0018\u00002\u00020\u0001:\u000f^T>hSVYjOXZKaQIBñ\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102\u0012\b\b\u0002\u00105\u001a\u000204\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000106\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u000108\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010:¢\u0006\u0004\b<\u0010=Jú\u0002\u0010>\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.2\n\b\u0002\u00101\u001a\u0004\u0018\u0001002\n\b\u0002\u00103\u001a\u0004\u0018\u0001022\b\b\u0002\u00105\u001a\u0002042\n\b\u0002\u00107\u001a\u0004\u0018\u0001062\n\b\u0002\u00109\u001a\u0004\u0018\u0001082\n\b\u0002\u0010;\u001a\u0004\u0018\u00010:HÆ\u0001¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b@\u0010AJ\u0010\u0010C\u001a\u00020BHÖ\u0001¢\u0006\u0004\bC\u0010DJ\u001a\u0010F\u001a\u00020\u00042\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bF\u0010GR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b>\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bO\u0010L\u001a\u0004\bP\u0010NR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010AR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bT\u0010L\u001a\u0004\bU\u0010NR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bV\u0010L\u001a\u0004\bW\u0010NR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bX\u0010L\u001a\u0004\bY\u0010NR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bZ\u0010L\u001a\u0004\b[\u0010NR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\r8\u0006¢\u0006\f\n\u0004\bY\u0010\\\u001a\u0004\bT\u0010]R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b^\u0010`R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bS\u0010e\u001a\u0004\bf\u0010gR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\bI\u0010l\u001a\u0004\bm\u0010nR\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006¢\u0006\f\n\u0004\bj\u0010o\u001a\u0004\bp\u0010qR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\bP\u0010r\u001a\u0004\bs\u0010tR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\bZ\u0010{R\u0019\u0010#\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\bc\u0010|\u001a\u0004\bO\u0010}R\u001a\u0010%\u001a\u0004\u0018\u00010$8\u0006¢\u0006\r\n\u0004\bm\u0010~\u001a\u0005\b\u0010\u0001R\u001c\u0010'\u001a\u0004\u0018\u00010&8\u0006¢\u0006\u000f\n\u0005\bf\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u001b\u0010)\u001a\u0004\u0018\u00010(8\u0006¢\u0006\u000e\n\u0005\bp\u0010\u0001\u001a\u0005\bu\u0010\u0001R\u001d\u0010+\u001a\u0004\u0018\u00010*8\u0006¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u001c\u0010-\u001a\u0004\u0018\u00010,8\u0006¢\u0006\u000f\n\u0006\b\u0001\u0010\u0001\u001a\u0005\bV\u0010\u0001R\u001b\u0010/\u001a\u0004\u0018\u00010.8\u0006¢\u0006\u000e\n\u0005\bw\u0010\u0001\u001a\u0005\by\u0010\u0001R\u001c\u00101\u001a\u0004\u0018\u0001008\u0006¢\u0006\u000f\n\u0005\bU\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u001d\u00103\u001a\u0004\u0018\u0001028\u0006¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u001a\u00105\u001a\u0002048\u0006¢\u0006\u000f\n\u0006\b\u0001\u0010\u0001\u001a\u0005\bh\u0010\u0001R\u001c\u00107\u001a\u0004\u0018\u0001068\u0006¢\u0006\u000f\n\u0005\b\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u001b\u00109\u001a\u0004\u0018\u0001088\u0006¢\u0006\u000e\n\u0005\bW\u0010\u0001\u001a\u0005\bX\u0010\u0001R\u001c\u0010;\u001a\u0004\u0018\u00010:8\u0006¢\u0006\u000f\n\u0006\b\u0001\u0010\u0001\u001a\u0005\bQ\u0010\u0001R\u0018\u0010\u0001\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b[\u0010L\u001a\u0004\ba\u0010NR\u0019\u0010\u0001\u001a\u00020\u00048\u0006¢\u0006\r\n\u0004\bM\u0010L\u001a\u0005\b\u0001\u0010N¨\u0006\u0001"}, d2 = {"Lpk/s;", "", "Lpk/k;", "listNameHeader", "", "showToggleBetweenProductsAndInspiration", "loading", "", "headerImageUrl", "scanProductsEnabled", "shouldExitFromListDetails", "displayLoading", "showRemoveAllItemsConfirmation", "LKJ/e;", "addToCartInProgressProducts", "Lpk/j;", "fabButton", "Lpk/n;", "onlineOrInStoreToggle", "Lpk/q;", "products", "Lpk/m;", "listTotalPrice", "Lpk/o;", "planStoreVisit", "LKJ/c;", "Lpk/s$o;", "productsWayfindingData", "Lpk/l;", "selectedProduct", "Lpk/s$j;", "renameListResult", "Lpk/s$e;", "deleteListResult", "Lpk/s$a;", "addItemsToCartResult", "Lpk/s$m;", "shareListResult", "Lpk/s$l;", "shareItemResult", "Lpk/s$f;", "moveItemResult", "Lpk/s$i;", "removeItemResult", "Lpk/s$c;", "changeItemQuantityResult", "Lpk/s$g;", "notifyBackInStockResult", "Lpk/s$k;", "selectInitialStoreResult", "Lpk/s$n;", "similarItems", "Lpk/r;", "listMode", "Lpk/s$h;", "recommendedForYouCarousel", "Lpk/s$d;", "complementListCarousel", "Lpk/s$b;", "addRemoveItemResult", "<init>", "(Lpk/k;ZZLjava/lang/String;ZZZZLKJ/e;Lpk/j;Lpk/n;Lpk/q;Lpk/m;Lpk/o;LKJ/c;Lpk/l;Lpk/s$j;Lpk/s$e;Lpk/s$a;Lpk/s$m;Lpk/s$l;Lpk/s$f;Lpk/s$i;Lpk/s$c;Lpk/s$g;Lpk/s$k;Lpk/s$n;Lpk/r;Lpk/s$h;Lpk/s$d;Lpk/s$b;)V", "a", "(Lpk/k;ZZLjava/lang/String;ZZZZLKJ/e;Lpk/j;Lpk/n;Lpk/q;Lpk/m;Lpk/o;LKJ/c;Lpk/l;Lpk/s$j;Lpk/s$e;Lpk/s$a;Lpk/s$m;Lpk/s$l;Lpk/s$f;Lpk/s$i;Lpk/s$c;Lpk/s$g;Lpk/s$k;Lpk/s$n;Lpk/r;Lpk/s$h;Lpk/s$d;Lpk/s$b;)Lpk/s;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lpk/k;", "n", "()Lpk/k;", "b", "Z", "G", "()Z", "c", "p", "d", "Ljava/lang/String;", "l", "e", "z", "f", "D", "g", "i", "h", "F", "LKJ/e;", "()LKJ/e;", "j", "Lpk/j;", "()Lpk/j;", "k", "Lpk/n;", "s", "()Lpk/n;", "Lpk/q;", "u", "()Lpk/q;", "m", "Lpk/m;", "o", "()Lpk/m;", "Lpk/o;", "t", "()Lpk/o;", "LKJ/c;", "v", "()LKJ/c;", "Lpk/l;", "getSelectedProduct", "()Lpk/l;", "q", "Lpk/s$j;", "y", "()Lpk/s$j;", "r", "Lpk/s$e;", "()Lpk/s$e;", "Lpk/s$a;", "()Lpk/s$a;", "Lpk/s$m;", "C", "()Lpk/s$m;", "Lpk/s$l;", "B", "()Lpk/s$l;", "Lpk/s$f;", "()Lpk/s$f;", "w", "Lpk/s$i;", "x", "()Lpk/s$i;", "Lpk/s$c;", "()Lpk/s$c;", "Lpk/s$g;", "()Lpk/s$g;", "Lpk/s$k;", "A", "()Lpk/s$k;", "Lpk/s$n;", "H", "()Lpk/s$n;", "Lpk/r;", "()Lpk/r;", "Lpk/s$h;", "()Lpk/s$h;", "Lpk/s$d;", "()Lpk/s$d;", "E", "Lpk/s$b;", "()Lpk/s$b;", "hasProducts", "showEmptyList", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s {

    /* renamed from: A  reason: collision with root package name */
    private final n f101026A;

    /* renamed from: B  reason: collision with root package name */
    private final r f101027B;

    /* renamed from: C  reason: collision with root package name */
    private final h f101028C;

    /* renamed from: D  reason: collision with root package name */
    private final d f101029D;

    /* renamed from: E  reason: collision with root package name */
    private final b f101030E;

    /* renamed from: F  reason: collision with root package name */
    private final boolean f101031F;

    /* renamed from: G  reason: collision with root package name */
    private final boolean f101032G;

    /* renamed from: a  reason: collision with root package name */
    private final k f101033a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f101034b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f101035c;

    /* renamed from: d  reason: collision with root package name */
    private final String f101036d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f101037e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f101038f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f101039g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f101040h;

    /* renamed from: i  reason: collision with root package name */
    private final C15989e<String> f101041i;

    /* renamed from: j  reason: collision with root package name */
    private final j f101042j;

    /* renamed from: k  reason: collision with root package name */
    private final n f101043k;

    /* renamed from: l  reason: collision with root package name */
    private final q f101044l;

    /* renamed from: m  reason: collision with root package name */
    private final m f101045m;

    /* renamed from: n  reason: collision with root package name */
    private final o f101046n;

    /* renamed from: o  reason: collision with root package name */
    private final C15987c<o> f101047o;

    /* renamed from: p  reason: collision with root package name */
    private final l f101048p;

    /* renamed from: q  reason: collision with root package name */
    private final j f101049q;

    /* renamed from: r  reason: collision with root package name */
    private final e f101050r;

    /* renamed from: s  reason: collision with root package name */
    private final a f101051s;

    /* renamed from: t  reason: collision with root package name */
    private final m f101052t;

    /* renamed from: u  reason: collision with root package name */
    private final l f101053u;

    /* renamed from: v  reason: collision with root package name */
    private final f f101054v;

    /* renamed from: w  reason: collision with root package name */
    private final i f101055w;

    /* renamed from: x  reason: collision with root package name */
    private final c f101056x;

    /* renamed from: y  reason: collision with root package name */
    private final g f101057y;

    /* renamed from: z  reason: collision with root package name */
    private final k f101058z;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lpk/s$a;", "", "b", "a", "Lpk/s$a$a;", "Lpk/s$a$b;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lpk/s$a$a;", "Lpk/s$a;", "", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: pk.s$a$a  reason: collision with other inner class name */
        public static final class C2376a implements a {

            /* renamed from: a  reason: collision with root package name */
            private final Throwable f101059a;

            public C2376a(Throwable th2) {
                C17542s.j(th2, "throwable");
                this.f101059a = th2;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2376a) && C17542s.e(this.f101059a, ((C2376a) obj).f101059a);
            }

            public int hashCode() {
                return this.f101059a.hashCode();
            }

            public String toString() {
                Throwable th2 = this.f101059a;
                return "Failure(throwable=" + th2 + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lpk/s$a$b;", "Lpk/s$a;", "LIC/e;", "text", "<init>", "(LIC/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "()LIC/e;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b implements a {

            /* renamed from: b  reason: collision with root package name */
            public static final int f101060b = C13023e.f110931a;

            /* renamed from: a  reason: collision with root package name */
            private final C13023e f101061a;

            public b(C13023e eVar) {
                C17542s.j(eVar, "text");
                this.f101061a = eVar;
            }

            public final C13023e a() {
                return this.f101061a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && C17542s.e(this.f101061a, ((b) obj).f101061a);
            }

            public int hashCode() {
                return this.f101061a.hashCode();
            }

            public String toString() {
                C13023e eVar = this.f101061a;
                return "Success(text=" + eVar + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lpk/s$b;", "", "a", "b", "Lpk/s$b$a;", "Lpk/s$b$b;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\t¨\u0006\u0016"}, d2 = {"Lpk/s$b$a;", "Lpk/s$b;", "", "productName", "listName", "listId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements b {

            /* renamed from: a  reason: collision with root package name */
            private final String f101062a;

            /* renamed from: b  reason: collision with root package name */
            private final String f101063b;

            /* renamed from: c  reason: collision with root package name */
            private final String f101064c;

            public a(String str, String str2, String str3) {
                C17542s.j(str, "productName");
                C17542s.j(str2, "listName");
                C17542s.j(str3, "listId");
                this.f101062a = str;
                this.f101063b = str2;
                this.f101064c = str3;
            }

            public final String a() {
                return this.f101064c;
            }

            public final String b() {
                return this.f101063b;
            }

            public final String c() {
                return this.f101062a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return C17542s.e(this.f101062a, aVar.f101062a) && C17542s.e(this.f101063b, aVar.f101063b) && C17542s.e(this.f101064c, aVar.f101064c);
            }

            public int hashCode() {
                return (((this.f101062a.hashCode() * 31) + this.f101063b.hashCode()) * 31) + this.f101064c.hashCode();
            }

            public String toString() {
                String str = this.f101062a;
                String str2 = this.f101063b;
                String str3 = this.f101064c;
                return "AddedToList(productName=" + str + ", listName=" + str2 + ", listId=" + str3 + ")";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\t¨\u0006\u0016"}, d2 = {"Lpk/s$b$b;", "Lpk/s$b;", "", "productName", "listName", "listId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: pk.s$b$b  reason: collision with other inner class name */
        public static final class C2377b implements b {

            /* renamed from: a  reason: collision with root package name */
            private final String f101065a;

            /* renamed from: b  reason: collision with root package name */
            private final String f101066b;

            /* renamed from: c  reason: collision with root package name */
            private final String f101067c;

            public C2377b(String str, String str2, String str3) {
                C17542s.j(str, "productName");
                C17542s.j(str2, "listName");
                C17542s.j(str3, "listId");
                this.f101065a = str;
                this.f101066b = str2;
                this.f101067c = str3;
            }

            public final String a() {
                return this.f101067c;
            }

            public final String b() {
                return this.f101066b;
            }

            public final String c() {
                return this.f101065a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2377b)) {
                    return false;
                }
                C2377b bVar = (C2377b) obj;
                return C17542s.e(this.f101065a, bVar.f101065a) && C17542s.e(this.f101066b, bVar.f101066b) && C17542s.e(this.f101067c, bVar.f101067c);
            }

            public int hashCode() {
                return (((this.f101065a.hashCode() * 31) + this.f101066b.hashCode()) * 31) + this.f101067c.hashCode();
            }

            public String toString() {
                String str = this.f101065a;
                String str2 = this.f101066b;
                String str3 = this.f101067c;
                return "RemovedFromList(productName=" + str + ", listName=" + str2 + ", listId=" + str3 + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0014"}, d2 = {"Lpk/s$c;", "", "", "itemNo", "", "currentQuantity", "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final String f101068a;

        /* renamed from: b  reason: collision with root package name */
        private final int f101069b;

        public c(String str, int i10) {
            C17542s.j(str, "itemNo");
            this.f101068a = str;
            this.f101069b = i10;
        }

        public final int a() {
            return this.f101069b;
        }

        public final String b() {
            return this.f101068a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f101068a, cVar.f101068a) && this.f101069b == cVar.f101069b;
        }

        public int hashCode() {
            return (this.f101068a.hashCode() * 31) + Integer.hashCode(this.f101069b);
        }

        public String toString() {
            String str = this.f101068a;
            int i10 = this.f101069b;
            return "ChangeItemQuantityResult(itemNo=" + str + ", currentQuantity=" + i10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lpk/s$d;", "", "c", "b", "a", "Lpk/s$d$a;", "Lpk/s$d$b;", "Lpk/s$d$c;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface d {

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u0016\u0010\u001e¨\u0006\u001f"}, d2 = {"Lpk/s$d$a;", "Lpk/s$d;", "", "listId", "LOp/d1;", "prominentProduct", "LKJ/c;", "products", "LiB/a;", "inspirations", "<init>", "(Ljava/lang/String;LOp/d1;LKJ/c;LKJ/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "LOp/d1;", "d", "()LOp/d1;", "c", "LKJ/c;", "()LKJ/c;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements d {

            /* renamed from: a  reason: collision with root package name */
            private final String f101070a;

            /* renamed from: b  reason: collision with root package name */
            private final d1 f101071b;

            /* renamed from: c  reason: collision with root package name */
            private final C15987c<d1> f101072c;

            /* renamed from: d  reason: collision with root package name */
            private final C15987c<C14549a> f101073d;

            public a(String str, d1 d1Var, C15987c<d1> cVar, C15987c<C14549a> cVar2) {
                C17542s.j(str, "listId");
                C17542s.j(d1Var, "prominentProduct");
                C17542s.j(cVar, "products");
                C17542s.j(cVar2, "inspirations");
                this.f101070a = str;
                this.f101071b = d1Var;
                this.f101072c = cVar;
                this.f101073d = cVar2;
            }

            public final C15987c<C14549a> a() {
                return this.f101073d;
            }

            public final String b() {
                return this.f101070a;
            }

            public final C15987c<d1> c() {
                return this.f101072c;
            }

            public final d1 d() {
                return this.f101071b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return C17542s.e(this.f101070a, aVar.f101070a) && C17542s.e(this.f101071b, aVar.f101071b) && C17542s.e(this.f101072c, aVar.f101072c) && C17542s.e(this.f101073d, aVar.f101073d);
            }

            public int hashCode() {
                return (((((this.f101070a.hashCode() * 31) + this.f101071b.hashCode()) * 31) + this.f101072c.hashCode()) * 31) + this.f101073d.hashCode();
            }

            public String toString() {
                String str = this.f101070a;
                d1 d1Var = this.f101071b;
                C15987c<d1> cVar = this.f101072c;
                C15987c<C14549a> cVar2 = this.f101073d;
                return "Content(listId=" + str + ", prominentProduct=" + d1Var + ", products=" + cVar + ", inspirations=" + cVar2 + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lpk/s$d$b;", "Lpk/s$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b implements d {

            /* renamed from: a  reason: collision with root package name */
            public static final b f101074a = new b();

            private b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -2023618855;
            }

            public String toString() {
                return "Failure";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lpk/s$d$c;", "Lpk/s$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c implements d {

            /* renamed from: a  reason: collision with root package name */
            public static final c f101075a = new c();

            private c() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -600394101;
            }

            public String toString() {
                return "Loading";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lpk/s$e;", "", "b", "a", "c", "Lpk/s$e$a;", "Lpk/s$e$b;", "Lpk/s$e$c;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface e {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lpk/s$e$a;", "Lpk/s$e;", "", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements e {

            /* renamed from: a  reason: collision with root package name */
            private final Throwable f101076a;

            public a(Throwable th2) {
                C17542s.j(th2, "throwable");
                this.f101076a = th2;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && C17542s.e(this.f101076a, ((a) obj).f101076a);
            }

            public int hashCode() {
                return this.f101076a.hashCode();
            }

            public String toString() {
                Throwable th2 = this.f101076a;
                return "Failure(throwable=" + th2 + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lpk/s$e$b;", "Lpk/s$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b implements e {

            /* renamed from: a  reason: collision with root package name */
            public static final b f101077a = new b();

            private b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -1273130015;
            }

            public String toString() {
                return "ShowConfirmation";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lpk/s$e$c;", "Lpk/s$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c implements e {

            /* renamed from: a  reason: collision with root package name */
            public static final c f101078a = new c();

            private c() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -201050348;
            }

            public String toString() {
                return "Success";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lpk/s$f;", "", "b", "a", "c", "Lpk/s$f$a;", "Lpk/s$f$b;", "Lpk/s$f$c;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface f {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lpk/s$f$a;", "Lpk/s$f;", "", "itemName", "listName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements f {

            /* renamed from: a  reason: collision with root package name */
            private final String f101079a;

            /* renamed from: b  reason: collision with root package name */
            private final String f101080b;

            public a(String str, String str2) {
                C17542s.j(str, "itemName");
                C17542s.j(str2, "listName");
                this.f101079a = str;
                this.f101080b = str2;
            }

            public final String a() {
                return this.f101079a;
            }

            public final String b() {
                return this.f101080b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return C17542s.e(this.f101079a, aVar.f101079a) && C17542s.e(this.f101080b, aVar.f101080b);
            }

            public int hashCode() {
                return (this.f101079a.hashCode() * 31) + this.f101080b.hashCode();
            }

            public String toString() {
                String str = this.f101079a;
                String str2 = this.f101080b;
                return "Moved(itemName=" + str + ", listName=" + str2 + ")";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\f¨\u0006\u0017"}, d2 = {"Lpk/s$f$b;", "Lpk/s$f;", "", "itemNo", "name", "", "quantity", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "I", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b implements f {

            /* renamed from: a  reason: collision with root package name */
            private final String f101081a;

            /* renamed from: b  reason: collision with root package name */
            private final String f101082b;

            /* renamed from: c  reason: collision with root package name */
            private final int f101083c;

            public b(String str, String str2, int i10) {
                C17542s.j(str, "itemNo");
                C17542s.j(str2, "name");
                this.f101081a = str;
                this.f101082b = str2;
                this.f101083c = i10;
            }

            public final String a() {
                return this.f101081a;
            }

            public final String b() {
                return this.f101082b;
            }

            public final int c() {
                return this.f101083c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return C17542s.e(this.f101081a, bVar.f101081a) && C17542s.e(this.f101082b, bVar.f101082b) && this.f101083c == bVar.f101083c;
            }

            public int hashCode() {
                return (((this.f101081a.hashCode() * 31) + this.f101082b.hashCode()) * 31) + Integer.hashCode(this.f101083c);
            }

            public String toString() {
                String str = this.f101081a;
                String str2 = this.f101082b;
                int i10 = this.f101083c;
                return "OpenListPicker(itemNo=" + str + ", name=" + str2 + ", quantity=" + i10 + ")";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lpk/s$f$c;", "Lpk/s$f;", "", "itemName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c implements f {

            /* renamed from: a  reason: collision with root package name */
            private final String f101084a;

            public c(String str) {
                C17542s.j(str, "itemName");
                this.f101084a = str;
            }

            public final String a() {
                return this.f101084a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && C17542s.e(this.f101084a, ((c) obj).f101084a);
            }

            public int hashCode() {
                return this.f101084a.hashCode();
            }

            public String toString() {
                String str = this.f101084a;
                return "Removed(itemName=" + str + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lpk/s$g;", "", "c", "d", "e", "a", "b", "Lpk/s$g$a;", "Lpk/s$g$b;", "Lpk/s$g$c;", "Lpk/s$g$d;", "Lpk/s$g$e;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface g {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lpk/s$g$a;", "Lpk/s$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements g {

            /* renamed from: a  reason: collision with root package name */
            public static final a f101085a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 1716720929;
            }

            public String toString() {
                return "Failure";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lpk/s$g$b;", "Lpk/s$g;", "LIC/e;", "message", "<init>", "(LIC/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "()LIC/e;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b implements g {

            /* renamed from: b  reason: collision with root package name */
            public static final int f101086b = C13023e.f110931a;

            /* renamed from: a  reason: collision with root package name */
            private final C13023e f101087a;

            public b(C13023e eVar) {
                C17542s.j(eVar, "message");
                this.f101087a = eVar;
            }

            public final C13023e a() {
                return this.f101087a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && C17542s.e(this.f101087a, ((b) obj).f101087a);
            }

            public int hashCode() {
                return this.f101087a.hashCode();
            }

            public String toString() {
                C13023e eVar = this.f101087a;
                return "FailureWithFeedback(message=" + eVar + ")";
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0018\u0010\n¨\u0006\u0019"}, d2 = {"Lpk/s$g$c;", "Lpk/s$g;", "Llm/a$c;", "fulfilmentOption", "", "itemNo", "itemType", "<init>", "(Llm/a$c;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Llm/a$c;", "()Llm/a$c;", "b", "Ljava/lang/String;", "c", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c implements g {

            /* renamed from: a  reason: collision with root package name */
            private final C11550a.c f101088a;

            /* renamed from: b  reason: collision with root package name */
            private final String f101089b;

            /* renamed from: c  reason: collision with root package name */
            private final String f101090c;

            public c(C11550a.c cVar, String str, String str2) {
                C17542s.j(cVar, "fulfilmentOption");
                C17542s.j(str, "itemNo");
                C17542s.j(str2, "itemType");
                this.f101088a = cVar;
                this.f101089b = str;
                this.f101090c = str2;
            }

            public final C11550a.c a() {
                return this.f101088a;
            }

            public final String b() {
                return this.f101089b;
            }

            public final String c() {
                return this.f101090c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return C17542s.e(this.f101088a, cVar.f101088a) && C17542s.e(this.f101089b, cVar.f101089b) && C17542s.e(this.f101090c, cVar.f101090c);
            }

            public int hashCode() {
                return (((this.f101088a.hashCode() * 31) + this.f101089b.hashCode()) * 31) + this.f101090c.hashCode();
            }

            public String toString() {
                C11550a.c cVar = this.f101088a;
                String str = this.f101089b;
                String str2 = this.f101090c;
                return "ShowExplanation(fulfilmentOption=" + cVar + ", itemNo=" + str + ", itemType=" + str2 + ")";
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u001b"}, d2 = {"Lpk/s$g$d;", "Lpk/s$g;", "Llm/a$c;", "fulfilmentOption", "", "itemNo", "itemType", "itemName", "<init>", "(Llm/a$c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Llm/a$c;", "()Llm/a$c;", "b", "Ljava/lang/String;", "c", "d", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class d implements g {

            /* renamed from: a  reason: collision with root package name */
            private final C11550a.c f101091a;

            /* renamed from: b  reason: collision with root package name */
            private final String f101092b;

            /* renamed from: c  reason: collision with root package name */
            private final String f101093c;

            /* renamed from: d  reason: collision with root package name */
            private final String f101094d;

            public d(C11550a.c cVar, String str, String str2, String str3) {
                C17542s.j(cVar, "fulfilmentOption");
                C17542s.j(str, "itemNo");
                C17542s.j(str2, "itemType");
                C17542s.j(str3, "itemName");
                this.f101091a = cVar;
                this.f101092b = str;
                this.f101093c = str2;
                this.f101094d = str3;
            }

            public final C11550a.c a() {
                return this.f101091a;
            }

            public final String b() {
                return this.f101094d;
            }

            public final String c() {
                return this.f101092b;
            }

            public final String d() {
                return this.f101093c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return C17542s.e(this.f101091a, dVar.f101091a) && C17542s.e(this.f101092b, dVar.f101092b) && C17542s.e(this.f101093c, dVar.f101093c) && C17542s.e(this.f101094d, dVar.f101094d);
            }

            public int hashCode() {
                return (((((this.f101091a.hashCode() * 31) + this.f101092b.hashCode()) * 31) + this.f101093c.hashCode()) * 31) + this.f101094d.hashCode();
            }

            public String toString() {
                C11550a.c cVar = this.f101091a;
                String str = this.f101092b;
                String str2 = this.f101093c;
                String str3 = this.f101094d;
                return "ShowFallback(fulfilmentOption=" + cVar + ", itemNo=" + str + ", itemType=" + str2 + ", itemName=" + str3 + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lpk/s$g$e;", "Lpk/s$g;", "LIC/e;", "message", "<init>", "(LIC/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "()LIC/e;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class e implements g {

            /* renamed from: b  reason: collision with root package name */
            public static final int f101095b = C13023e.f110931a;

            /* renamed from: a  reason: collision with root package name */
            private final C13023e f101096a;

            public e(C13023e eVar) {
                C17542s.j(eVar, "message");
                this.f101096a = eVar;
            }

            public final C13023e a() {
                return this.f101096a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && C17542s.e(this.f101096a, ((e) obj).f101096a);
            }

            public int hashCode() {
                return this.f101096a.hashCode();
            }

            public String toString() {
                C13023e eVar = this.f101096a;
                return "Success(message=" + eVar + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lpk/s$h;", "", "c", "b", "a", "Lpk/s$h$a;", "Lpk/s$h$b;", "Lpk/s$h$c;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface h {

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\u000bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u0019¨\u0006\u001a"}, d2 = {"Lpk/s$h$a;", "Lpk/s$h;", "", "plpNavigationId", "title", "LKJ/c;", "LOp/d1;", "products", "<init>", "(Ljava/lang/String;Ljava/lang/String;LKJ/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "LKJ/c;", "()LKJ/c;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements h {

            /* renamed from: a  reason: collision with root package name */
            private final String f101097a;

            /* renamed from: b  reason: collision with root package name */
            private final String f101098b;

            /* renamed from: c  reason: collision with root package name */
            private final C15987c<d1> f101099c;

            public a(String str, String str2, C15987c<d1> cVar) {
                C17542s.j(str, "plpNavigationId");
                C17542s.j(str2, "title");
                C17542s.j(cVar, "products");
                this.f101097a = str;
                this.f101098b = str2;
                this.f101099c = cVar;
            }

            public final String a() {
                return this.f101097a;
            }

            public final C15987c<d1> b() {
                return this.f101099c;
            }

            public final String c() {
                return this.f101098b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return C17542s.e(this.f101097a, aVar.f101097a) && C17542s.e(this.f101098b, aVar.f101098b) && C17542s.e(this.f101099c, aVar.f101099c);
            }

            public int hashCode() {
                return (((this.f101097a.hashCode() * 31) + this.f101098b.hashCode()) * 31) + this.f101099c.hashCode();
            }

            public String toString() {
                String str = this.f101097a;
                String str2 = this.f101098b;
                C15987c<d1> cVar = this.f101099c;
                return "Content(plpNavigationId=" + str + ", title=" + str2 + ", products=" + cVar + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lpk/s$h$b;", "Lpk/s$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b implements h {

            /* renamed from: a  reason: collision with root package name */
            public static final b f101100a = new b();

            private b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -1350479310;
            }

            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lpk/s$h$c;", "Lpk/s$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c implements h {

            /* renamed from: a  reason: collision with root package name */
            public static final c f101101a = new c();

            private c() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 1085144806;
            }

            public String toString() {
                return "Loading";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lpk/s$i;", "", "a", "Lpk/s$i$a;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface i {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, d2 = {"Lpk/s$i$a;", "Lpk/s$i;", "", "itemNo", "itemName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements i {

            /* renamed from: a  reason: collision with root package name */
            private final String f101102a;

            /* renamed from: b  reason: collision with root package name */
            private final String f101103b;

            public a(String str, String str2) {
                C17542s.j(str, "itemNo");
                C17542s.j(str2, "itemName");
                this.f101102a = str;
                this.f101103b = str2;
            }

            public final String a() {
                return this.f101103b;
            }

            public final String b() {
                return this.f101102a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return C17542s.e(this.f101102a, aVar.f101102a) && C17542s.e(this.f101103b, aVar.f101103b);
            }

            public int hashCode() {
                return (this.f101102a.hashCode() * 31) + this.f101103b.hashCode();
            }

            public String toString() {
                String str = this.f101102a;
                String str2 = this.f101103b;
                return "Removed(itemNo=" + str + ", itemName=" + str2 + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lpk/s$j;", "", "b", "a", "Lpk/s$j$a;", "Lpk/s$j$b;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface j {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lpk/s$j$a;", "Lpk/s$j;", "", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements j {

            /* renamed from: a  reason: collision with root package name */
            private final Throwable f101104a;

            public a(Throwable th2) {
                C17542s.j(th2, "throwable");
                this.f101104a = th2;
            }

            public final Throwable a() {
                return this.f101104a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && C17542s.e(this.f101104a, ((a) obj).f101104a);
            }

            public int hashCode() {
                return this.f101104a.hashCode();
            }

            public String toString() {
                Throwable th2 = this.f101104a;
                return "Failure(throwable=" + th2 + ")";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lpk/s$j$b;", "Lpk/s$j;", "", "listName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b implements j {

            /* renamed from: a  reason: collision with root package name */
            private final String f101105a;

            public b(String str) {
                C17542s.j(str, "listName");
                this.f101105a = str;
            }

            public final String a() {
                return this.f101105a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && C17542s.e(this.f101105a, ((b) obj).f101105a);
            }

            public int hashCode() {
                return this.f101105a.hashCode();
            }

            public String toString() {
                String str = this.f101105a;
                return "ShowPrompt(listName=" + str + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lpk/s$k;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class k {

        /* renamed from: a  reason: collision with root package name */
        public static final k f101106a = new k();

        private k() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public int hashCode() {
            return 1061576527;
        }

        public String toString() {
            return "SelectInitialStoreResult";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lpk/s$l;", "", "b", "a", "Lpk/s$l$a;", "Lpk/s$l$b;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface l {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lpk/s$l$a;", "Lpk/s$l;", "", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements l {

            /* renamed from: a  reason: collision with root package name */
            private final Throwable f101107a;

            public a(Throwable th2) {
                C17542s.j(th2, "throwable");
                this.f101107a = th2;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && C17542s.e(this.f101107a, ((a) obj).f101107a);
            }

            public int hashCode() {
                return this.f101107a.hashCode();
            }

            public String toString() {
                Throwable th2 = this.f101107a;
                return "Failure(throwable=" + th2 + ")";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0014\u0010\t¨\u0006\u0016"}, d2 = {"Lpk/s$l$b;", "Lpk/s$l;", "", "link", "productName", "productDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b implements l {

            /* renamed from: a  reason: collision with root package name */
            private final String f101108a;

            /* renamed from: b  reason: collision with root package name */
            private final String f101109b;

            /* renamed from: c  reason: collision with root package name */
            private final String f101110c;

            public b(String str, String str2, String str3) {
                C17542s.j(str, "link");
                C17542s.j(str2, "productName");
                this.f101108a = str;
                this.f101109b = str2;
                this.f101110c = str3;
            }

            public final String a() {
                return this.f101108a;
            }

            public final String b() {
                return this.f101110c;
            }

            public final String c() {
                return this.f101109b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return C17542s.e(this.f101108a, bVar.f101108a) && C17542s.e(this.f101109b, bVar.f101109b) && C17542s.e(this.f101110c, bVar.f101110c);
            }

            public int hashCode() {
                int hashCode = ((this.f101108a.hashCode() * 31) + this.f101109b.hashCode()) * 31;
                String str = this.f101110c;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                String str = this.f101108a;
                String str2 = this.f101109b;
                String str3 = this.f101110c;
                return "Success(link=" + str + ", productName=" + str2 + ", productDescription=" + str3 + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lpk/s$m;", "", "b", "a", "Lpk/s$m$a;", "Lpk/s$m$b;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface m {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lpk/s$m$a;", "Lpk/s$m;", "", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements m {

            /* renamed from: a  reason: collision with root package name */
            private final Throwable f101111a;

            public a(Throwable th2) {
                C17542s.j(th2, "throwable");
                this.f101111a = th2;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && C17542s.e(this.f101111a, ((a) obj).f101111a);
            }

            public int hashCode() {
                return this.f101111a.hashCode();
            }

            public String toString() {
                Throwable th2 = this.f101111a;
                return "Failure(throwable=" + th2 + ")";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lpk/s$m$b;", "Lpk/s$m;", "", "link", "listName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b implements m {

            /* renamed from: a  reason: collision with root package name */
            private final String f101112a;

            /* renamed from: b  reason: collision with root package name */
            private final String f101113b;

            public b(String str, String str2) {
                C17542s.j(str, "link");
                C17542s.j(str2, "listName");
                this.f101112a = str;
                this.f101113b = str2;
            }

            public final String a() {
                return this.f101112a;
            }

            public final String b() {
                return this.f101113b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return C17542s.e(this.f101112a, bVar.f101112a) && C17542s.e(this.f101113b, bVar.f101113b);
            }

            public int hashCode() {
                return (this.f101112a.hashCode() * 31) + this.f101113b.hashCode();
            }

            public String toString() {
                String str = this.f101112a;
                String str2 = this.f101113b;
                return "Success(link=" + str + ", listName=" + str2 + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lpk/s$n;", "", "d", "b", "c", "a", "e", "Lpk/s$n$b;", "Lpk/s$n$c;", "Lpk/s$n$d;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface n {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lpk/s$n$a;", "", "a", "b", "Lpk/s$n$a$a;", "Lpk/s$n$a$b;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public interface a {

            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lpk/s$n$a$a;", "Lpk/s$n$a;", "", "itemName", "listName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: pk.s$n$a$a  reason: collision with other inner class name */
            public static final class C2378a implements a {

                /* renamed from: a  reason: collision with root package name */
                private final String f101114a;

                /* renamed from: b  reason: collision with root package name */
                private final String f101115b;

                public C2378a(String str, String str2) {
                    C17542s.j(str, "itemName");
                    C17542s.j(str2, "listName");
                    this.f101114a = str;
                    this.f101115b = str2;
                }

                public final String a() {
                    return this.f101114a;
                }

                public final String b() {
                    return this.f101115b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C2378a)) {
                        return false;
                    }
                    C2378a aVar = (C2378a) obj;
                    return C17542s.e(this.f101114a, aVar.f101114a) && C17542s.e(this.f101115b, aVar.f101115b);
                }

                public int hashCode() {
                    return (this.f101114a.hashCode() * 31) + this.f101115b.hashCode();
                }

                public String toString() {
                    String str = this.f101114a;
                    String str2 = this.f101115b;
                    return "Added(itemName=" + str + ", listName=" + str2 + ")";
                }
            }

            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lpk/s$n$a$b;", "Lpk/s$n$a;", "", "itemName", "listName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class b implements a {

                /* renamed from: a  reason: collision with root package name */
                private final String f101116a;

                /* renamed from: b  reason: collision with root package name */
                private final String f101117b;

                public b(String str, String str2) {
                    C17542s.j(str, "itemName");
                    C17542s.j(str2, "listName");
                    this.f101116a = str;
                    this.f101117b = str2;
                }

                public final String a() {
                    return this.f101116a;
                }

                public final String b() {
                    return this.f101117b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return C17542s.e(this.f101116a, bVar.f101116a) && C17542s.e(this.f101117b, bVar.f101117b);
                }

                public int hashCode() {
                    return (this.f101116a.hashCode() * 31) + this.f101117b.hashCode();
                }

                public String toString() {
                    String str = this.f101116a;
                    String str2 = this.f101117b;
                    return "Removed(itemName=" + str + ", listName=" + str2 + ")";
                }
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lpk/s$n$b;", "Lpk/s$n;", "LKJ/c;", "Lpk/s$n$e;", "products", "Lpk/s$n$a;", "addToListResult", "<init>", "(LKJ/c;Lpk/s$n$a;)V", "a", "(LKJ/c;Lpk/s$n$a;)Lpk/s$n$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LKJ/c;", "d", "()LKJ/c;", "b", "Lpk/s$n$a;", "c", "()Lpk/s$n$a;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b implements n {

            /* renamed from: a  reason: collision with root package name */
            private final C15987c<e> f101118a;

            /* renamed from: b  reason: collision with root package name */
            private final a f101119b;

            public b(C15987c<e> cVar, a aVar) {
                C17542s.j(cVar, "products");
                this.f101118a = cVar;
                this.f101119b = aVar;
            }

            public static /* synthetic */ b b(b bVar, C15987c<e> cVar, a aVar, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    cVar = bVar.f101118a;
                }
                if ((i10 & 2) != 0) {
                    aVar = bVar.f101119b;
                }
                return bVar.a(cVar, aVar);
            }

            public final b a(C15987c<e> cVar, a aVar) {
                C17542s.j(cVar, "products");
                return new b(cVar, aVar);
            }

            public final a c() {
                return this.f101119b;
            }

            public final C15987c<e> d() {
                return this.f101118a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return C17542s.e(this.f101118a, bVar.f101118a) && C17542s.e(this.f101119b, bVar.f101119b);
            }

            public int hashCode() {
                int hashCode = this.f101118a.hashCode() * 31;
                a aVar = this.f101119b;
                return hashCode + (aVar == null ? 0 : aVar.hashCode());
            }

            public String toString() {
                C15987c<e> cVar = this.f101118a;
                a aVar = this.f101119b;
                return "Content(products=" + cVar + ", addToListResult=" + aVar + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lpk/s$n$c;", "Lpk/s$n;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c implements n {

            /* renamed from: a  reason: collision with root package name */
            public static final c f101120a = new c();

            private c() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 1690070090;
            }

            public String toString() {
                return "Failure";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lpk/s$n$d;", "Lpk/s$n;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class d implements n {

            /* renamed from: a  reason: collision with root package name */
            public static final d f101121a = new d();

            private d() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return -1181672452;
            }

            public String toString() {
                return "Loading";
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0013\b\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0016\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010!\u001a\u0004\b\u0019\u0010\"R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010!\u001a\u0004\b\u001e\u0010\"¨\u0006#"}, d2 = {"Lpk/s$n$e;", "", "", "itemNo", "imageUrl", "LOp/d$h;", "productInfo", "LOp/i1;", "currency", "", "familyAndRegularPriceSameSize", "inFavourites", "<init>", "(Ljava/lang/String;Ljava/lang/String;LOp/d$h;LOp/i1;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "c", "LOp/d$h;", "f", "()LOp/d$h;", "d", "LOp/i1;", "()LOp/i1;", "Z", "()Z", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class e {

            /* renamed from: a  reason: collision with root package name */
            private final String f101122a;

            /* renamed from: b  reason: collision with root package name */
            private final String f101123b;

            /* renamed from: c  reason: collision with root package name */
            private final C10828d.h f101124c;

            /* renamed from: d  reason: collision with root package name */
            private final i1 f101125d;

            /* renamed from: e  reason: collision with root package name */
            private final boolean f101126e;

            /* renamed from: f  reason: collision with root package name */
            private final boolean f101127f;

            public e(String str, String str2, C10828d.h hVar, i1 i1Var, boolean z10, boolean z11) {
                C17542s.j(str, "itemNo");
                C17542s.j(hVar, "productInfo");
                C17542s.j(i1Var, "currency");
                this.f101122a = str;
                this.f101123b = str2;
                this.f101124c = hVar;
                this.f101125d = i1Var;
                this.f101126e = z10;
                this.f101127f = z11;
            }

            public final i1 a() {
                return this.f101125d;
            }

            public final boolean b() {
                return this.f101126e;
            }

            public final String c() {
                return this.f101123b;
            }

            public final boolean d() {
                return this.f101127f;
            }

            public final String e() {
                return this.f101122a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return C17542s.e(this.f101122a, eVar.f101122a) && C17542s.e(this.f101123b, eVar.f101123b) && C17542s.e(this.f101124c, eVar.f101124c) && C17542s.e(this.f101125d, eVar.f101125d) && this.f101126e == eVar.f101126e && this.f101127f == eVar.f101127f;
            }

            public final C10828d.h f() {
                return this.f101124c;
            }

            public int hashCode() {
                int hashCode = this.f101122a.hashCode() * 31;
                String str = this.f101123b;
                return ((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f101124c.hashCode()) * 31) + this.f101125d.hashCode()) * 31) + Boolean.hashCode(this.f101126e)) * 31) + Boolean.hashCode(this.f101127f);
            }

            public String toString() {
                String str = this.f101122a;
                String str2 = this.f101123b;
                C10828d.h hVar = this.f101124c;
                i1 i1Var = this.f101125d;
                boolean z10 = this.f101126e;
                boolean z11 = this.f101127f;
                return "SimilarProduct(itemNo=" + str + ", imageUrl=" + str2 + ", productInfo=" + hVar + ", currency=" + i1Var + ", familyAndRegularPriceSameSize=" + z10 + ", inFavourites=" + z11 + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001b"}, d2 = {"Lpk/s$o;", "", "", "itemNo", "Lzk/b$a;", "type", "division", "storeId", "<init>", "(Ljava/lang/String;Lzk/b$a;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lzk/b$a;", "getType", "()Lzk/b$a;", "c", "d", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class o {

        /* renamed from: a  reason: collision with root package name */
        private final String f101128a;

        /* renamed from: b  reason: collision with root package name */
        private final C12529b.a f101129b;

        /* renamed from: c  reason: collision with root package name */
        private final String f101130c;

        /* renamed from: d  reason: collision with root package name */
        private final String f101131d;

        public o(String str, C12529b.a aVar, String str2, String str3) {
            C17542s.j(str, "itemNo");
            C17542s.j(aVar, "type");
            C17542s.j(str3, "storeId");
            this.f101128a = str;
            this.f101129b = aVar;
            this.f101130c = str2;
            this.f101131d = str3;
        }

        public final String a() {
            return this.f101130c;
        }

        public final String b() {
            return this.f101128a;
        }

        public final String c() {
            return this.f101131d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return C17542s.e(this.f101128a, oVar.f101128a) && this.f101129b == oVar.f101129b && C17542s.e(this.f101130c, oVar.f101130c) && C17542s.e(this.f101131d, oVar.f101131d);
        }

        public int hashCode() {
            int hashCode = ((this.f101128a.hashCode() * 31) + this.f101129b.hashCode()) * 31;
            String str = this.f101130c;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f101131d.hashCode();
        }

        public String toString() {
            String str = this.f101128a;
            C12529b.a aVar = this.f101129b;
            String str2 = this.f101130c;
            String str3 = this.f101131d;
            return "WayfindingProductData(itemNo=" + str + ", type=" + aVar + ", division=" + str2 + ", storeId=" + str3 + ")";
        }
    }

    public s() {
        this((k) null, false, false, (String) null, false, false, false, false, (C15989e) null, (j) null, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, (j) null, (e) null, (a) null, (m) null, (l) null, (f) null, (i) null, (c) null, (g) null, (k) null, (n) null, (r) null, (h) null, (d) null, (b) null, Integer.MAX_VALUE, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ s b(s sVar, k kVar, boolean z10, boolean z11, String str, boolean z12, boolean z13, boolean z14, boolean z15, C15989e eVar, j jVar, n nVar, q qVar, m mVar, o oVar, C15987c cVar, l lVar, j jVar2, e eVar2, a aVar, m mVar2, l lVar2, f fVar, i iVar, c cVar2, g gVar, k kVar2, n nVar2, r rVar, h hVar, d dVar, b bVar, int i10, Object obj) {
        s sVar2 = sVar;
        int i11 = i10;
        return sVar.a((i11 & 1) != 0 ? sVar2.f101033a : kVar, (i11 & 2) != 0 ? sVar2.f101034b : z10, (i11 & 4) != 0 ? sVar2.f101035c : z11, (i11 & 8) != 0 ? sVar2.f101036d : str, (i11 & 16) != 0 ? sVar2.f101037e : z12, (i11 & 32) != 0 ? sVar2.f101038f : z13, (i11 & 64) != 0 ? sVar2.f101039g : z14, (i11 & 128) != 0 ? sVar2.f101040h : z15, (i11 & 256) != 0 ? sVar2.f101041i : eVar, (i11 & 512) != 0 ? sVar2.f101042j : jVar, (i11 & 1024) != 0 ? sVar2.f101043k : nVar, (i11 & RecyclerView.n.FLAG_MOVED) != 0 ? sVar2.f101044l : qVar, (i11 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? sVar2.f101045m : mVar, (i11 & 8192) != 0 ? sVar2.f101046n : oVar, (i11 & 16384) != 0 ? sVar2.f101047o : cVar, (i11 & 32768) != 0 ? sVar2.f101048p : lVar, (i11 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? sVar2.f101049q : jVar2, (i11 & 131072) != 0 ? sVar2.f101050r : eVar2, (i11 & 262144) != 0 ? sVar2.f101051s : aVar, (i11 & ImageMetadata.LENS_APERTURE) != 0 ? sVar2.f101052t : mVar2, (i11 & ImageMetadata.SHADING_MODE) != 0 ? sVar2.f101053u : lVar2, (i11 & UploadKt.MAX_CHUNK_SIZE) != 0 ? sVar2.f101054v : fVar, (i11 & 4194304) != 0 ? sVar2.f101055w : iVar, (i11 & 8388608) != 0 ? sVar2.f101056x : cVar2, (i11 & 16777216) != 0 ? sVar2.f101057y : gVar, (i11 & 33554432) != 0 ? sVar2.f101058z : kVar2, (i11 & 67108864) != 0 ? sVar2.f101026A : nVar2, (i11 & 134217728) != 0 ? sVar2.f101027B : rVar, (i11 & 268435456) != 0 ? sVar2.f101028C : hVar, (i11 & 536870912) != 0 ? sVar2.f101029D : dVar, (i11 & CatalogRepository.FETCH_FLAG_SDB) != 0 ? sVar2.f101030E : bVar);
    }

    public final k A() {
        return this.f101058z;
    }

    public final l B() {
        return this.f101053u;
    }

    public final m C() {
        return this.f101052t;
    }

    public final boolean D() {
        return this.f101038f;
    }

    public final boolean E() {
        return this.f101032G;
    }

    public final boolean F() {
        return this.f101040h;
    }

    public final boolean G() {
        return this.f101034b;
    }

    public final n H() {
        return this.f101026A;
    }

    public final s a(k kVar, boolean z10, boolean z11, String str, boolean z12, boolean z13, boolean z14, boolean z15, C15989e<String> eVar, j jVar, n nVar, q qVar, m mVar, o oVar, C15987c<o> cVar, l lVar, j jVar2, e eVar2, a aVar, m mVar2, l lVar2, f fVar, i iVar, c cVar2, g gVar, k kVar2, n nVar2, r rVar, h hVar, d dVar, b bVar) {
        k kVar3 = kVar;
        C17542s.j(eVar, "addToCartInProgressProducts");
        C17542s.j(jVar, "fabButton");
        C17542s.j(qVar, "products");
        C17542s.j(cVar, "productsWayfindingData");
        C17542s.j(rVar, "listMode");
        return new s(kVar, z10, z11, str, z12, z13, z14, z15, eVar, jVar, nVar, qVar, mVar, oVar, cVar, lVar, jVar2, eVar2, aVar, mVar2, lVar2, fVar, iVar, cVar2, gVar, kVar2, nVar2, rVar, hVar, dVar, bVar);
    }

    public final a c() {
        return this.f101051s;
    }

    public final b d() {
        return this.f101030E;
    }

    public final C15989e<String> e() {
        return this.f101041i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return C17542s.e(this.f101033a, sVar.f101033a) && this.f101034b == sVar.f101034b && this.f101035c == sVar.f101035c && C17542s.e(this.f101036d, sVar.f101036d) && this.f101037e == sVar.f101037e && this.f101038f == sVar.f101038f && this.f101039g == sVar.f101039g && this.f101040h == sVar.f101040h && C17542s.e(this.f101041i, sVar.f101041i) && C17542s.e(this.f101042j, sVar.f101042j) && C17542s.e(this.f101043k, sVar.f101043k) && C17542s.e(this.f101044l, sVar.f101044l) && C17542s.e(this.f101045m, sVar.f101045m) && C17542s.e(this.f101046n, sVar.f101046n) && C17542s.e(this.f101047o, sVar.f101047o) && C17542s.e(this.f101048p, sVar.f101048p) && C17542s.e(this.f101049q, sVar.f101049q) && C17542s.e(this.f101050r, sVar.f101050r) && C17542s.e(this.f101051s, sVar.f101051s) && C17542s.e(this.f101052t, sVar.f101052t) && C17542s.e(this.f101053u, sVar.f101053u) && C17542s.e(this.f101054v, sVar.f101054v) && C17542s.e(this.f101055w, sVar.f101055w) && C17542s.e(this.f101056x, sVar.f101056x) && C17542s.e(this.f101057y, sVar.f101057y) && C17542s.e(this.f101058z, sVar.f101058z) && C17542s.e(this.f101026A, sVar.f101026A) && C17542s.e(this.f101027B, sVar.f101027B) && C17542s.e(this.f101028C, sVar.f101028C) && C17542s.e(this.f101029D, sVar.f101029D) && C17542s.e(this.f101030E, sVar.f101030E);
    }

    public final c f() {
        return this.f101056x;
    }

    public final d g() {
        return this.f101029D;
    }

    public final e h() {
        return this.f101050r;
    }

    public int hashCode() {
        k kVar = this.f101033a;
        int i10 = 0;
        int hashCode = (((((kVar == null ? 0 : kVar.hashCode()) * 31) + Boolean.hashCode(this.f101034b)) * 31) + Boolean.hashCode(this.f101035c)) * 31;
        String str = this.f101036d;
        int hashCode2 = (((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.f101037e)) * 31) + Boolean.hashCode(this.f101038f)) * 31) + Boolean.hashCode(this.f101039g)) * 31) + Boolean.hashCode(this.f101040h)) * 31) + this.f101041i.hashCode()) * 31) + this.f101042j.hashCode()) * 31;
        n nVar = this.f101043k;
        int hashCode3 = (((hashCode2 + (nVar == null ? 0 : nVar.hashCode())) * 31) + this.f101044l.hashCode()) * 31;
        m mVar = this.f101045m;
        int hashCode4 = (hashCode3 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        o oVar = this.f101046n;
        int hashCode5 = (((hashCode4 + (oVar == null ? 0 : oVar.hashCode())) * 31) + this.f101047o.hashCode()) * 31;
        l lVar = this.f101048p;
        int hashCode6 = (hashCode5 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        j jVar = this.f101049q;
        int hashCode7 = (hashCode6 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        e eVar = this.f101050r;
        int hashCode8 = (hashCode7 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        a aVar = this.f101051s;
        int hashCode9 = (hashCode8 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        m mVar2 = this.f101052t;
        int hashCode10 = (hashCode9 + (mVar2 == null ? 0 : mVar2.hashCode())) * 31;
        l lVar2 = this.f101053u;
        int hashCode11 = (hashCode10 + (lVar2 == null ? 0 : lVar2.hashCode())) * 31;
        f fVar = this.f101054v;
        int hashCode12 = (hashCode11 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        i iVar = this.f101055w;
        int hashCode13 = (hashCode12 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        c cVar = this.f101056x;
        int hashCode14 = (hashCode13 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        g gVar = this.f101057y;
        int hashCode15 = (hashCode14 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        k kVar2 = this.f101058z;
        int hashCode16 = (hashCode15 + (kVar2 == null ? 0 : kVar2.hashCode())) * 31;
        n nVar2 = this.f101026A;
        int hashCode17 = (((hashCode16 + (nVar2 == null ? 0 : nVar2.hashCode())) * 31) + this.f101027B.hashCode()) * 31;
        h hVar = this.f101028C;
        int hashCode18 = (hashCode17 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        d dVar = this.f101029D;
        int hashCode19 = (hashCode18 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        b bVar = this.f101030E;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return hashCode19 + i10;
    }

    public final boolean i() {
        return this.f101039g;
    }

    public final j j() {
        return this.f101042j;
    }

    public final boolean k() {
        return this.f101031F;
    }

    public final String l() {
        return this.f101036d;
    }

    public final r m() {
        return this.f101027B;
    }

    public final k n() {
        return this.f101033a;
    }

    public final m o() {
        return this.f101045m;
    }

    public final boolean p() {
        return this.f101035c;
    }

    public final f q() {
        return this.f101054v;
    }

    public final g r() {
        return this.f101057y;
    }

    public final n s() {
        return this.f101043k;
    }

    public final o t() {
        return this.f101046n;
    }

    public String toString() {
        k kVar = this.f101033a;
        boolean z10 = this.f101034b;
        boolean z11 = this.f101035c;
        String str = this.f101036d;
        boolean z12 = this.f101037e;
        boolean z13 = this.f101038f;
        boolean z14 = this.f101039g;
        boolean z15 = this.f101040h;
        C15989e<String> eVar = this.f101041i;
        j jVar = this.f101042j;
        n nVar = this.f101043k;
        q qVar = this.f101044l;
        m mVar = this.f101045m;
        o oVar = this.f101046n;
        C15987c<o> cVar = this.f101047o;
        l lVar = this.f101048p;
        j jVar2 = this.f101049q;
        e eVar2 = this.f101050r;
        a aVar = this.f101051s;
        m mVar2 = this.f101052t;
        l lVar2 = this.f101053u;
        f fVar = this.f101054v;
        i iVar = this.f101055w;
        c cVar2 = this.f101056x;
        g gVar = this.f101057y;
        k kVar2 = this.f101058z;
        n nVar2 = this.f101026A;
        r rVar = this.f101027B;
        h hVar = this.f101028C;
        d dVar = this.f101029D;
        b bVar = this.f101030E;
        return "State(listNameHeader=" + kVar + ", showToggleBetweenProductsAndInspiration=" + z10 + ", loading=" + z11 + ", headerImageUrl=" + str + ", scanProductsEnabled=" + z12 + ", shouldExitFromListDetails=" + z13 + ", displayLoading=" + z14 + ", showRemoveAllItemsConfirmation=" + z15 + ", addToCartInProgressProducts=" + eVar + ", fabButton=" + jVar + ", onlineOrInStoreToggle=" + nVar + ", products=" + qVar + ", listTotalPrice=" + mVar + ", planStoreVisit=" + oVar + ", productsWayfindingData=" + cVar + ", selectedProduct=" + lVar + ", renameListResult=" + jVar2 + ", deleteListResult=" + eVar2 + ", addItemsToCartResult=" + aVar + ", shareListResult=" + mVar2 + ", shareItemResult=" + lVar2 + ", moveItemResult=" + fVar + ", removeItemResult=" + iVar + ", changeItemQuantityResult=" + cVar2 + ", notifyBackInStockResult=" + gVar + ", selectInitialStoreResult=" + kVar2 + ", similarItems=" + nVar2 + ", listMode=" + rVar + ", recommendedForYouCarousel=" + hVar + ", complementListCarousel=" + dVar + ", addRemoveItemResult=" + bVar + ")";
    }

    public final q u() {
        return this.f101044l;
    }

    public final C15987c<o> v() {
        return this.f101047o;
    }

    public final h w() {
        return this.f101028C;
    }

    public final i x() {
        return this.f101055w;
    }

    public final j y() {
        return this.f101049q;
    }

    public final boolean z() {
        return this.f101037e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x00a3, code lost:
        if (((pk.q.a) r4).a().isEmpty() == false) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x00a7, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x00b8, code lost:
        if (((pk.q.b) r4).a().isEmpty() == false) goto L_0x00a5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public s(pk.k r9, boolean r10, boolean r11, java.lang.String r12, boolean r13, boolean r14, boolean r15, boolean r16, KJ.C15989e<java.lang.String> r17, pk.j r18, pk.n r19, pk.q r20, pk.m r21, pk.o r22, KJ.C15987c<pk.s.o> r23, pk.l r24, pk.s.j r25, pk.s.e r26, pk.s.a r27, pk.s.m r28, pk.s.l r29, pk.s.f r30, pk.s.i r31, pk.s.c r32, pk.s.g r33, pk.s.k r34, pk.s.n r35, pk.r r36, pk.s.h r37, pk.s.d r38, pk.s.b r39) {
        /*
            r8 = this;
            r0 = r8
            r1 = r11
            r2 = r17
            r3 = r18
            r4 = r20
            r5 = r23
            r6 = r36
            java.lang.String r7 = "addToCartInProgressProducts"
            kotlin.jvm.internal.C17542s.j(r2, r7)
            java.lang.String r7 = "fabButton"
            kotlin.jvm.internal.C17542s.j(r3, r7)
            java.lang.String r7 = "products"
            kotlin.jvm.internal.C17542s.j(r4, r7)
            java.lang.String r7 = "productsWayfindingData"
            kotlin.jvm.internal.C17542s.j(r5, r7)
            java.lang.String r7 = "listMode"
            kotlin.jvm.internal.C17542s.j(r6, r7)
            r8.<init>()
            r7 = r9
            r0.f101033a = r7
            r7 = r10
            r0.f101034b = r7
            r0.f101035c = r1
            r7 = r12
            r0.f101036d = r7
            r7 = r13
            r0.f101037e = r7
            r7 = r14
            r0.f101038f = r7
            r7 = r15
            r0.f101039g = r7
            r7 = r16
            r0.f101040h = r7
            r0.f101041i = r2
            r0.f101042j = r3
            r2 = r19
            r0.f101043k = r2
            r0.f101044l = r4
            r2 = r21
            r0.f101045m = r2
            r2 = r22
            r0.f101046n = r2
            r0.f101047o = r5
            r2 = r24
            r0.f101048p = r2
            r2 = r25
            r0.f101049q = r2
            r2 = r26
            r0.f101050r = r2
            r2 = r27
            r0.f101051s = r2
            r2 = r28
            r0.f101052t = r2
            r2 = r29
            r0.f101053u = r2
            r2 = r30
            r0.f101054v = r2
            r2 = r31
            r0.f101055w = r2
            r2 = r32
            r0.f101056x = r2
            r2 = r33
            r0.f101057y = r2
            r2 = r34
            r0.f101058z = r2
            r2 = r35
            r0.f101026A = r2
            r0.f101027B = r6
            r2 = r37
            r0.f101028C = r2
            r2 = r38
            r0.f101029D = r2
            r2 = r39
            r0.f101030E = r2
            boolean r2 = r4 instanceof pk.q.a
            r3 = 0
            r5 = 1
            if (r2 == 0) goto L_0x00a9
            r2 = r4
            pk.q$a r2 = (pk.q.a) r2
            KJ.c r2 = r2.a()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x00a7
        L_0x00a5:
            r2 = r5
            goto L_0x00bb
        L_0x00a7:
            r2 = r3
            goto L_0x00bb
        L_0x00a9:
            boolean r2 = r4 instanceof pk.q.b
            if (r2 == 0) goto L_0x00cd
            r2 = r4
            pk.q$b r2 = (pk.q.b) r2
            KJ.c r2 = r2.a()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x00a7
            goto L_0x00a5
        L_0x00bb:
            r0.f101031F = r2
            pk.r$b r4 = pk.r.b.f101025a
            boolean r4 = kotlin.jvm.internal.C17542s.e(r6, r4)
            if (r4 == 0) goto L_0x00ca
            if (r1 != 0) goto L_0x00ca
            if (r2 != 0) goto L_0x00ca
            r3 = r5
        L_0x00ca:
            r0.f101032G = r3
            return
        L_0x00cd:
            XH.t r1 = new XH.t
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pk.s.<init>(pk.k, boolean, boolean, java.lang.String, boolean, boolean, boolean, boolean, KJ.e, pk.j, pk.n, pk.q, pk.m, pk.o, KJ.c, pk.l, pk.s$j, pk.s$e, pk.s$a, pk.s$m, pk.s$l, pk.s$f, pk.s$i, pk.s$c, pk.s$g, pk.s$k, pk.s$n, pk.r, pk.s$h, pk.s$d, pk.s$b):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ s(pk.k r33, boolean r34, boolean r35, java.lang.String r36, boolean r37, boolean r38, boolean r39, boolean r40, KJ.C15989e r41, pk.j r42, pk.n r43, pk.q r44, pk.m r45, pk.o r46, KJ.C15987c r47, pk.l r48, pk.s.j r49, pk.s.e r50, pk.s.a r51, pk.s.m r52, pk.s.l r53, pk.s.f r54, pk.s.i r55, pk.s.c r56, pk.s.g r57, pk.s.k r58, pk.s.n r59, pk.r r60, pk.s.h r61, pk.s.d r62, pk.s.b r63, int r64, kotlin.jvm.internal.DefaultConstructorMarker r65) {
        /*
            r32 = this;
            r0 = r64
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r33
        L_0x000a:
            r3 = r0 & 2
            r4 = 0
            if (r3 == 0) goto L_0x0011
            r3 = r4
            goto L_0x0013
        L_0x0011:
            r3 = r34
        L_0x0013:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x0019
            r5 = r4
            goto L_0x001b
        L_0x0019:
            r5 = r35
        L_0x001b:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x0021
            r6 = 0
            goto L_0x0023
        L_0x0021:
            r6 = r36
        L_0x0023:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x0029
            r7 = r4
            goto L_0x002b
        L_0x0029:
            r7 = r37
        L_0x002b:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x0031
            r8 = r4
            goto L_0x0033
        L_0x0031:
            r8 = r38
        L_0x0033:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x0039
            r9 = r4
            goto L_0x003b
        L_0x0039:
            r9 = r39
        L_0x003b:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r4 = r40
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x004b
            KJ.h r10 = KJ.C15985a.d()
            goto L_0x004d
        L_0x004b:
            r10 = r41
        L_0x004d:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0054
            pk.j$a r11 = pk.j.a.f100957a
            goto L_0x0056
        L_0x0054:
            r11 = r42
        L_0x0056:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x005c
            r12 = 0
            goto L_0x005e
        L_0x005c:
            r12 = r43
        L_0x005e:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x006c
            pk.q$a r13 = new pk.q$a
            KJ.f r14 = KJ.C15985a.a()
            r13.<init>(r14)
            goto L_0x006e
        L_0x006c:
            r13 = r44
        L_0x006e:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0074
            r14 = 0
            goto L_0x0076
        L_0x0074:
            r14 = r45
        L_0x0076:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x007c
            r15 = 0
            goto L_0x007e
        L_0x007c:
            r15 = r46
        L_0x007e:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0087
            KJ.f r2 = KJ.C15985a.a()
            goto L_0x0089
        L_0x0087:
            r2 = r47
        L_0x0089:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0093
            r16 = 0
            goto L_0x0095
        L_0x0093:
            r16 = r48
        L_0x0095:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x009e
            r17 = 0
            goto L_0x00a0
        L_0x009e:
            r17 = r49
        L_0x00a0:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x00a9
            r18 = 0
            goto L_0x00ab
        L_0x00a9:
            r18 = r50
        L_0x00ab:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00b4
            r19 = 0
            goto L_0x00b6
        L_0x00b4:
            r19 = r51
        L_0x00b6:
            r20 = 524288(0x80000, float:7.34684E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00bf
            r20 = 0
            goto L_0x00c1
        L_0x00bf:
            r20 = r52
        L_0x00c1:
            r21 = 1048576(0x100000, float:1.469368E-39)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00ca
            r21 = 0
            goto L_0x00cc
        L_0x00ca:
            r21 = r53
        L_0x00cc:
            r22 = 2097152(0x200000, float:2.938736E-39)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00d5
            r22 = 0
            goto L_0x00d7
        L_0x00d5:
            r22 = r54
        L_0x00d7:
            r23 = 4194304(0x400000, float:5.877472E-39)
            r23 = r0 & r23
            if (r23 == 0) goto L_0x00e0
            r23 = 0
            goto L_0x00e2
        L_0x00e0:
            r23 = r55
        L_0x00e2:
            r24 = 8388608(0x800000, float:1.17549435E-38)
            r24 = r0 & r24
            if (r24 == 0) goto L_0x00eb
            r24 = 0
            goto L_0x00ed
        L_0x00eb:
            r24 = r56
        L_0x00ed:
            r25 = 16777216(0x1000000, float:2.3509887E-38)
            r25 = r0 & r25
            if (r25 == 0) goto L_0x00f6
            r25 = 0
            goto L_0x00f8
        L_0x00f6:
            r25 = r57
        L_0x00f8:
            r26 = 33554432(0x2000000, float:9.403955E-38)
            r26 = r0 & r26
            if (r26 == 0) goto L_0x0101
            r26 = 0
            goto L_0x0103
        L_0x0101:
            r26 = r58
        L_0x0103:
            r27 = 67108864(0x4000000, float:1.5046328E-36)
            r27 = r0 & r27
            if (r27 == 0) goto L_0x010c
            r27 = 0
            goto L_0x010e
        L_0x010c:
            r27 = r59
        L_0x010e:
            r28 = 134217728(0x8000000, float:3.85186E-34)
            r28 = r0 & r28
            if (r28 == 0) goto L_0x0117
            pk.r$b r28 = pk.r.b.f101025a
            goto L_0x0119
        L_0x0117:
            r28 = r60
        L_0x0119:
            r29 = 268435456(0x10000000, float:2.5243549E-29)
            r29 = r0 & r29
            if (r29 == 0) goto L_0x0122
            r29 = 0
            goto L_0x0124
        L_0x0122:
            r29 = r61
        L_0x0124:
            r30 = 536870912(0x20000000, float:1.0842022E-19)
            r30 = r0 & r30
            if (r30 == 0) goto L_0x012d
            r30 = 0
            goto L_0x012f
        L_0x012d:
            r30 = r62
        L_0x012f:
            r31 = 1073741824(0x40000000, float:2.0)
            r0 = r0 & r31
            if (r0 == 0) goto L_0x0137
            r0 = 0
            goto L_0x0139
        L_0x0137:
            r0 = r63
        L_0x0139:
            r33 = r32
            r34 = r1
            r35 = r3
            r36 = r5
            r37 = r6
            r38 = r7
            r39 = r8
            r40 = r9
            r41 = r4
            r42 = r10
            r43 = r11
            r44 = r12
            r45 = r13
            r46 = r14
            r47 = r15
            r48 = r2
            r49 = r16
            r50 = r17
            r51 = r18
            r52 = r19
            r53 = r20
            r54 = r21
            r55 = r22
            r56 = r23
            r57 = r24
            r58 = r25
            r59 = r26
            r60 = r27
            r61 = r28
            r62 = r29
            r63 = r30
            r64 = r0
            r33.<init>(r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pk.s.<init>(pk.k, boolean, boolean, java.lang.String, boolean, boolean, boolean, boolean, KJ.e, pk.j, pk.n, pk.q, pk.m, pk.o, KJ.c, pk.l, pk.s$j, pk.s$e, pk.s$a, pk.s$m, pk.s$l, pk.s$f, pk.s$i, pk.s$c, pk.s$g, pk.s$k, pk.s$n, pk.r, pk.s$h, pk.s$d, pk.s$b, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
