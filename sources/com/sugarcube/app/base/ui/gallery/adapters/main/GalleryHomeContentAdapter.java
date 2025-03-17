package com.sugarcube.app.base.ui.gallery.adapters.main;

import AF.C12567A;
import AF.C12569C;
import AF.C12570D;
import AF.C12573G;
import AF.C12576J;
import AF.C12577K;
import AF.C12578L;
import AF.C12581a;
import AF.C12582b;
import AF.C12586f;
import AF.C12599t;
import AF.C12602w;
import AF.C12603x;
import AF.O;
import AF.S;
import AF.T;
import AF.W;
import DF.C12786c;
import DF.C12787d;
import DF.C12789f;
import DF.C12791h;
import DF.H;
import OE.C13316h;
import QE.X;
import QE.Y;
import QE.Z;
import QE.c0;
import QE.d0;
import QE.g0;
import QE.h0;
import XH.v;
import YH.C16877v;
import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q;
import com.squareup.picasso.t;
import com.sugarcube.app.base.DeviceCompatibility;
import com.sugarcube.app.base.data.asset.VideoAsset;
import com.sugarcube.app.base.data.asset.VideoAssetRepository;
import com.sugarcube.app.base.data.database.Scene;
import com.sugarcube.app.base.data.model.Design;
import com.sugarcube.app.base.data.user.UserRepo;
import com.sugarcube.app.base.ui.gallery.h;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import zF.C15341b;
import zF.C15342c;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010!\n\u0002\b\b\b\u0007\u0018\u0000 K2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003LMNBE\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00142\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020 2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u001c\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00020G8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006O"}, d2 = {"Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter;", "Landroidx/recyclerview/widget/q;", "LAF/D;", "Landroidx/recyclerview/widget/RecyclerView$G;", "Landroid/content/Context;", "context", "Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;", "listener", "Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnBottomSheetInteractionsListener;", "bottomSheetListener", "LOE/q;", "sugarcube", "Lcom/sugarcube/app/base/data/user/UserRepo;", "userRepo", "Lcom/sugarcube/app/base/data/asset/VideoAssetRepository;", "assetRepository", "Lcom/sugarcube/app/base/DeviceCompatibility;", "deviceCompatibility", "<init>", "(Landroid/content/Context;Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnBottomSheetInteractionsListener;LOE/q;Lcom/sugarcube/app/base/data/user/UserRepo;Lcom/sugarcube/app/base/data/asset/VideoAssetRepository;Lcom/sugarcube/app/base/DeviceCompatibility;)V", "LXH/v;", "", "", "d", "(Landroid/content/Context;)LXH/v;", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$G;", "holder", "position", "LXH/N;", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$G;I)V", "getItemViewType", "(I)I", "LDF/c;", "content", "f", "(LDF/c;)V", "h", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "i", "Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;", "getListener", "()Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;", "j", "Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnBottomSheetInteractionsListener;", "getBottomSheetListener", "()Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnBottomSheetInteractionsListener;", "k", "LOE/q;", "getSugarcube", "()LOE/q;", "l", "Lcom/sugarcube/app/base/data/user/UserRepo;", "getUserRepo", "()Lcom/sugarcube/app/base/data/user/UserRepo;", "m", "Lcom/sugarcube/app/base/data/asset/VideoAssetRepository;", "getAssetRepository", "()Lcom/sugarcube/app/base/data/asset/VideoAssetRepository;", "n", "Lcom/sugarcube/app/base/DeviceCompatibility;", "getDeviceCompatibility", "()Lcom/sugarcube/app/base/DeviceCompatibility;", "o", "LDF/c;", "", "p", "Ljava/util/List;", "itemList", "q", "OnInteractionsListener", "OnBottomSheetInteractionsListener", "a", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GalleryHomeContentAdapter extends q<C12570D, RecyclerView.G> {

    /* renamed from: q  reason: collision with root package name */
    public static final a f124342q = new a((DefaultConstructorMarker) null);

    /* renamed from: r  reason: collision with root package name */
    public static final int f124343r = 8;

    /* renamed from: h  reason: collision with root package name */
    private final Context f124344h;

    /* renamed from: i  reason: collision with root package name */
    private final OnInteractionsListener f124345i;

    /* renamed from: j  reason: collision with root package name */
    private final OnBottomSheetInteractionsListener f124346j;

    /* renamed from: k  reason: collision with root package name */
    private final OE.q f124347k;

    /* renamed from: l  reason: collision with root package name */
    private final UserRepo f124348l;

    /* renamed from: m  reason: collision with root package name */
    private final VideoAssetRepository f124349m;

    /* renamed from: n  reason: collision with root package name */
    private final DeviceCompatibility f124350n;

    /* renamed from: o  reason: collision with root package name */
    private C12786c f124351o;

    /* renamed from: p  reason: collision with root package name */
    private List<C12570D> f124352p = new ArrayList();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnBottomSheetInteractionsListener;", "", "", "itemViewType", "LDF/d;", "scene", "LXH/N;", "onShowMoreButtonClicked", "(ILDF/d;)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnBottomSheetInteractionsListener {
        void onShowMoreButtonClicked(int i10, C12787d dVar);
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0013\u0010\u0012J\u0019\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H&¢\u0006\u0004\b\u0018\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H&¢\u0006\u0004\b\u0019\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H&¢\u0006\u0004\b\u001a\u0010\u0017J\u000f\u0010\u001b\u001a\u00020\u0002H&¢\u0006\u0004\b\u001b\u0010\u0004J\u0017\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0007H&¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0002H&¢\u0006\u0004\b\u001f\u0010\u0004J\u000f\u0010 \u001a\u00020\u0002H&¢\u0006\u0004\b \u0010\u0004¨\u0006!"}, d2 = {"Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;", "", "LXH/N;", "onNewScanClicked", "()V", "Lcom/sugarcube/app/base/data/model/Design;", "design", "", "furniture", "onNewDesignClicked", "(Lcom/sugarcube/app/base/data/model/Design;Ljava/lang/String;)V", "Lcom/sugarcube/app/base/data/database/Scene;", "scene", "onRetryUploadClicked", "(Lcom/sugarcube/app/base/data/database/Scene;)V", "Ljava/util/UUID;", "uuid", "onSceneDesignExistingClicked", "(Ljava/util/UUID;)V", "onSceneSelected", "Lcom/sugarcube/app/base/ui/gallery/h;", "tab", "onNeedHelpClicked", "(Lcom/sugarcube/app/base/ui/gallery/h;)V", "openHelpCenter", "onSignUpClicked", "onLoginClicked", "onDesignOnWebClicked", "type", "onJumpClicked", "(Ljava/lang/String;)V", "onPrivacyPolicyConsentContinueClicked", "onPullRefresh", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnInteractionsListener {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            public static /* synthetic */ void a(OnInteractionsListener onInteractionsListener, Design design, String str, int i10, Object obj) {
                if (obj == null) {
                    if ((i10 & 2) != 0) {
                        str = null;
                    }
                    onInteractionsListener.onNewDesignClicked(design, str);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onNewDesignClicked");
            }
        }

        void onDesignOnWebClicked();

        void onJumpClicked(String str);

        void onLoginClicked(h hVar);

        void onNeedHelpClicked(h hVar);

        void onNewDesignClicked(Design design, String str);

        void onNewScanClicked();

        void onPrivacyPolicyConsentContinueClicked();

        void onPullRefresh();

        void onRetryUploadClicked(Scene scene);

        void onSceneDesignExistingClicked(UUID uuid);

        void onSceneSelected(UUID uuid);

        void onSignUpClicked(h hVar);

        void openHelpCenter(h hVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$a;", "", "<init>", "()V", "", "ARG_HIGHLIGHTED", "Ljava/lang/String;", "ARG_SELECTED", "ARG_IS_PROCESSING", "ARG_IS_UPLOADING", "ARG_IS_NEW", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f124353a;

        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|(2:29|30)|31|33) */
        /* JADX WARNING: Can't wrap try/catch for region: R(33:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|33) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0082 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x008c */
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
                AF.x r1 = AF.C12603x.LOGIN     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                AF.x r1 = AF.C12603x.SCENE_UPLOADING_PENDING     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                AF.x r1 = AF.C12603x.SCENE_UPLOADING_PENDING_LOGIN     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                AF.x r1 = AF.C12603x.SCENE_UPLOAD_FAILED     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                AF.x r1 = AF.C12603x.SCENE_PROCESSING     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                AF.x r1 = AF.C12603x.SCENE_FAILED     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                AF.x r1 = AF.C12603x.SCENE_READY     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                AF.x r1 = AF.C12603x.SCENE_EXISTING     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                AF.x r1 = AF.C12603x.CAPTURE     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                AF.x r1 = AF.C12603x.CAPTURE_AGAIN     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                AF.x r1 = AF.C12603x.NEED_HELP     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                AF.x r1 = AF.C12603x.SHOWROOM_READY     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                AF.x r1 = AF.C12603x.SHOWROOM_EXISTING     // Catch:{ NoSuchFieldError -> 0x008c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008c }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008c }
            L_0x008c:
                AF.x r1 = AF.C12603x.PRIVACY_POLICY_CONSENT     // Catch:{ NoSuchFieldError -> 0x0096 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0096 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0096 }
            L_0x0096:
                f124353a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.gallery.adapters.main.GalleryHomeContentAdapter.b.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GalleryHomeContentAdapter(Context context, OnInteractionsListener onInteractionsListener, OnBottomSheetInteractionsListener onBottomSheetInteractionsListener, OE.q qVar, UserRepo userRepo, VideoAssetRepository videoAssetRepository, DeviceCompatibility deviceCompatibility) {
        super(new C15342c());
        C17542s.j(qVar, "sugarcube");
        C17542s.j(userRepo, "userRepo");
        C17542s.j(videoAssetRepository, "assetRepository");
        C17542s.j(deviceCompatibility, "deviceCompatibility");
        this.f124344h = context;
        this.f124345i = onInteractionsListener;
        this.f124346j = onBottomSheetInteractionsListener;
        this.f124347k = qVar;
        this.f124348l = userRepo;
        this.f124349m = videoAssetRepository;
        this.f124350n = deviceCompatibility;
    }

    private final v<String, Integer> d(Context context) {
        H f10;
        String str;
        C12786c cVar = this.f124351o;
        if (cVar == null || (f10 = cVar.f()) == null) {
            return null;
        }
        if (context == null || (str = context.getString(f10.c())) == null) {
            str = "";
        }
        return new v<>(str, Integer.valueOf(f10.a()));
    }

    /* access modifiers changed from: private */
    public static final void e(GalleryHomeContentAdapter galleryHomeContentAdapter, int i10, C12787d dVar, View view) {
        OnBottomSheetInteractionsListener onBottomSheetInteractionsListener = galleryHomeContentAdapter.f124346j;
        if (onBottomSheetInteractionsListener != null) {
            onBottomSheetInteractionsListener.onShowMoreButtonClicked(i10, dVar);
        }
    }

    public final void f(C12786c cVar) {
        C17542s.j(cVar, "content");
        this.f124351o = cVar;
        List<C12570D> list = this.f124352p;
        list.clear();
        list.add(C12570D.e.f107646h);
        if (cVar.e()) {
            list.add(C12570D.h.f107650h);
        }
        for (Object next : cVar.a()) {
            if (next instanceof C12789f) {
                list.add(new C12570D.i((C12789f) next));
            } else if (next instanceof C12791h) {
                list.add(new C12570D.j((C12791h) next));
            }
        }
        if (cVar.c()) {
            list.add(C12570D.a.f107641h);
        }
        if (cVar.d()) {
            list.add(C12570D.d.f107645h);
        }
        if (!C17542s.e(cVar.g(), Boolean.TRUE) && !cVar.b()) {
            list.add(new C12570D.g(true));
        }
        list.add(C12570D.f.f107647h);
        submitList(C16877v.t1(this.f124352p));
    }

    public int getItemViewType(int i10) {
        C12603x xVar;
        C12570D d10 = (C12570D) getItem(i10);
        if (d10 instanceof C12570D.e) {
            xVar = C12603x.HEADER;
        } else if (d10 instanceof C12570D.g) {
            xVar = C12603x.LOGIN;
        } else if (d10 instanceof C12570D.a) {
            xVar = C12603x.CAPTURE;
        } else if (d10 instanceof C12570D.d) {
            xVar = C12603x.CAPTURE_AGAIN;
        } else if (d10 instanceof C12570D.f) {
            xVar = C12603x.NEED_HELP;
        } else if (d10 instanceof C12570D.i) {
            Scene l10 = ((C12570D.i) d10).h().l();
            return (l10.isNew() ? this.f124348l.isLoggedIn().getValue().booleanValue() ? C12603x.SCENE_UPLOADING_PENDING_LOGIN : C12603x.SCENE_UPLOADING_PENDING : (l10.isUploading() || l10.isProcessing()) ? C12603x.SCENE_PROCESSING : l10.isFailedUpload() ? C12603x.SCENE_UPLOAD_FAILED : l10.isFailed() ? C12603x.SCENE_FAILED : l10.isSuccessful() ? l10.getCompositionCount() == 0 ? C12603x.SCENE_READY : C12603x.SCENE_EXISTING : C12603x.SCENE_UPLOADING_PENDING).ordinal();
        } else if (d10 instanceof C12570D.j) {
            return (((C12570D.j) d10).h().l().getCompositionCount() > 0 ? C12603x.SHOWROOM_EXISTING : C12603x.SHOWROOM_READY).ordinal();
        } else {
            xVar = d10 instanceof C12570D.h ? C12603x.PRIVACY_POLICY_CONSENT : C12603x.UNKNOWN;
        }
        return xVar.ordinal();
    }

    public void onBindViewHolder(RecyclerView.G g10, int i10) {
        C17542s.j(g10, "holder");
        if (g10 instanceof C12582b) {
            C12570D d10 = (C12570D) getItem(i10);
            int itemViewType = getItemViewType(i10);
            C12603x xVar = null;
            C12787d h10 = d10 instanceof C12570D.i ? ((C12570D.i) d10).h() : d10 instanceof C12570D.j ? ((C12570D.j) d10).h() : null;
            if (h10 != null) {
                C12582b bVar = (C12582b) g10;
                bVar.c(h10);
                ImageButton imageButton = bVar.d().f114547k;
                C12603x[] values = C12603x.values();
                int length = values.length;
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        break;
                    }
                    C12603x xVar2 = values[i12];
                    if (xVar2.ordinal() == getItemViewType(i10)) {
                        xVar = xVar2;
                        break;
                    }
                    i12++;
                }
                switch (xVar == null ? -1 : b.f124353a[xVar.ordinal()]) {
                    case 3:
                    case 4:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        break;
                    default:
                        i11 = 8;
                        break;
                }
                imageButton.setVisibility(i11);
                imageButton.setOnClickListener(new C15341b(this, itemViewType, h10));
            }
        }
    }

    public RecyclerView.G onCreateViewHolder(ViewGroup viewGroup, int i10) {
        H f10;
        H f11;
        H f12;
        ViewGroup viewGroup2 = viewGroup;
        int i11 = i10;
        C17542s.j(viewGroup2, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        c0 c10 = c0.c(from, viewGroup2, false);
        C17542s.i(c10, "inflate(...)");
        Uri uri = this.f124349m.get(VideoAsset.LANDING_ENTRY_POINT);
        int i12 = C13316h.f112821C;
        boolean isDecorateSupported = this.f124350n.isDecorateSupported();
        C12603x a10 = C12603x.Companion.a(i11);
        h hVar = null;
        switch (a10 == null ? -1 : b.f124353a[a10.ordinal()]) {
            case 1:
                d0 c11 = d0.c(from, viewGroup2, false);
                C17542s.i(c11, "inflate(...)");
                return new C12581a(c11, d(this.f124344h));
            case 2:
                Y c12 = Y.c(from, viewGroup2, false);
                C17542s.i(c12, "inflate(...)");
                OnInteractionsListener onInteractionsListener = this.f124345i;
                C12786c cVar = this.f124351o;
                if (!(cVar == null || (f10 = cVar.f()) == null)) {
                    hVar = f10.b();
                }
                return new C12567A(c12, onInteractionsListener, hVar);
            case 3:
                return new T(c10, this.f124347k.c(), isDecorateSupported);
            case 4:
                t c13 = this.f124347k.c();
                OnInteractionsListener onInteractionsListener2 = this.f124345i;
                C12786c cVar2 = this.f124351o;
                return new S(c10, c13, onInteractionsListener2, (cVar2 == null || (f11 = cVar2.f()) == null) ? null : f11.b(), isDecorateSupported);
            case 5:
                return new O(c10, this.f124347k.c(), this.f124345i, isDecorateSupported);
            case 6:
                return new C12578L(c10, this.f124347k.c(), isDecorateSupported);
            case 7:
                OE.q qVar = this.f124347k;
                return new C12577K(qVar, this.f124344h, c10, qVar.c(), isDecorateSupported);
            case 8:
                return new C12576J(c10, this.f124347k.c(), this.f124345i, isDecorateSupported);
            case 9:
                return new C12573G(c10, this.f124347k.c(), this.f124345i, isDecorateSupported);
            case 10:
                X b10 = X.b(from, viewGroup2, false);
                C17542s.i(b10, "inflate(...)");
                return new C12586f(b10, this.f124345i, new v(uri, Integer.valueOf(i12)));
            case 11:
                h0 c14 = h0.c(from, viewGroup2, false);
                C17542s.i(c14, "inflate(...)");
                return new C12599t(c14, this.f124345i);
            case 12:
                OE.q qVar2 = this.f124347k;
                Context context = this.f124344h;
                Z c15 = Z.c(from, viewGroup2, false);
                C17542s.i(c15, "inflate(...)");
                OnInteractionsListener onInteractionsListener3 = this.f124345i;
                C12786c cVar3 = this.f124351o;
                if (!(cVar3 == null || (f12 = cVar3.f()) == null)) {
                    hVar = f12.b();
                }
                return new C12602w(qVar2, context, c15, onInteractionsListener3, hVar);
            case 13:
                return new AF.Z(c10, this.f124347k.c(), this.f124345i, isDecorateSupported);
            case 14:
                return new W(c10, this.f124347k.c(), this.f124345i, isDecorateSupported);
            case 15:
                g0 c16 = g0.c(from, viewGroup2, false);
                C17542s.i(c16, "inflate(...)");
                return new C12569C(c16, this.f124345i);
            default:
                throw new ClassCastException("Unknown viewType " + i11);
        }
    }
}
