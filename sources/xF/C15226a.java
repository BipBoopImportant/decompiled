package xF;

import DF.C12754C;
import com.sugarcube.app.base.data.analytics.Analytics;
import com.sugarcube.app.base.data.analytics.EventType;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.app.base.data.database.Scene;
import com.sugarcube.app.base.ui.feedback.FeedbackSmileRatingBar;
import com.sugarcube.core.network.models.Composition;
import com.sugarcube.core.network.models.PlacedFurniture;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0019\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\fH\u0000¢\u0006\u0004\b\u001a\u0010\u0017J\u000f\u0010\u001b\u001a\u00020\fH\u0000¢\u0006\u0004\b\u001b\u0010\u0017J\u000f\u0010\u001c\u001a\u00020\fH\u0000¢\u0006\u0004\b\u001c\u0010\u0017J\u000f\u0010\u001d\u001a\u00020\fH\u0000¢\u0006\u0004\b\u001d\u0010\u0017J\u000f\u0010\u001e\u001a\u00020\fH\u0000¢\u0006\u0004\b\u001e\u0010\u0017J\u0017\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\fH\u0000¢\u0006\u0004\b#\u0010\u0017J\u000f\u0010$\u001a\u00020\fH\u0000¢\u0006\u0004\b$\u0010\u0017J\u000f\u0010%\u001a\u00020\fH\u0000¢\u0006\u0004\b%\u0010\u0017J\u000f\u0010&\u001a\u00020\fH\u0000¢\u0006\u0004\b&\u0010\u0017J\u0017\u0010)\u001a\u00020\f2\u0006\u0010(\u001a\u00020'H\u0000¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\f2\u0006\u0010(\u001a\u00020'H\u0000¢\u0006\u0004\b+\u0010*J%\u0010/\u001a\u00020\f2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020'0,2\u0006\u0010.\u001a\u00020\bH\u0000¢\u0006\u0004\b/\u00100J\u001d\u00101\u001a\u00020\f2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020'0,H\u0000¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u00103\u001a\u0004\b4\u00105R\u0017\u0010:\u001a\u0002068\u0006¢\u0006\f\n\u0004\b\u0010\u00107\u001a\u0004\b8\u00109¨\u0006;"}, d2 = {"LxF/a;", "", "LDF/C;", "viewModel", "<init>", "(LDF/C;)V", "Lcom/sugarcube/app/base/ui/feedback/FeedbackSmileRatingBar$a;", "smileRating", "", "textFeedback", "captureUuid", "captureType", "LXH/N;", "s", "(Lcom/sugarcube/app/base/ui/feedback/FeedbackSmileRatingBar$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "id", "b", "(Ljava/lang/String;)V", "rating", "feedback", "t", "(Lcom/sugarcube/app/base/ui/feedback/FeedbackSmileRatingBar$a;Ljava/lang/String;)V", "c", "()V", "k", "o", "h", "i", "p", "j", "a", "Lcom/sugarcube/core/network/models/Composition;", "composition", "r", "(Lcom/sugarcube/core/network/models/Composition;)V", "d", "m", "n", "q", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "item", "g", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;)V", "f", "", "items", "message", "l", "(Ljava/util/List;Ljava/lang/String;)V", "e", "(Ljava/util/List;)V", "LDF/C;", "getViewModel", "()LDF/C;", "Lcom/sugarcube/app/base/data/analytics/Analytics;", "Lcom/sugarcube/app/base/data/analytics/Analytics;", "getAnalytics", "()Lcom/sugarcube/app/base/data/analytics/Analytics;", "analytics", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: xF.a  reason: case insensitive filesystem */
public final class C15226a {

    /* renamed from: a  reason: collision with root package name */
    private final C12754C f131981a;

    /* renamed from: b  reason: collision with root package name */
    private final Analytics f131982b;

    public C15226a(C12754C c10) {
        C17542s.j(c10, "viewModel");
        this.f131981a = c10;
        this.f131982b = c10.M1().b();
    }

    public final void a() {
        UUID x12;
        Composition t12 = this.f131981a.t1();
        if (t12 != null && (x12 = this.f131981a.x1()) != null) {
            this.f131982b.discardPendingDesign(EventType.GalleryDesignSheetDiscardDesign, x12, this.f131981a.v1(), t12.getCompositionId(), t12.getCompositionUuid(), this.f131981a.M1().getRegion(), this.f131981a.L1(x12));
        }
    }

    public final void b(String str) {
        C17542s.j(str, "id");
        this.f131982b.dismissCaptureFeedback(str);
    }

    public final void c() {
        this.f131982b.dismissDesignFeedback();
    }

    public final void d() {
        UUID x12 = this.f131981a.x1();
        if (x12 != null) {
            Analytics analytics = this.f131982b;
            String w12 = this.f131981a.w1();
            if (w12 == null) {
                w12 = "";
            }
            String str = w12;
            int v12 = this.f131981a.v1();
            String region = this.f131981a.M1().getRegion();
            Scene u12 = this.f131981a.u1();
            analytics.galleryRoomListViewDesigns(str, x12, v12, region, u12 != null ? u12.getCompositionCount() : -1, x12, this.f131981a.L1(x12));
        }
    }

    public final void e(List<CachedCatalogItem> list) {
        UUID x12;
        C17542s.j(list, "items");
        if (this.f131981a.t1() != null && (x12 = this.f131981a.x1()) != null) {
            Analytics analytics = this.f131982b;
            String w12 = this.f131981a.w1();
            if (w12 == null) {
                w12 = "";
            }
            analytics.galleryDesignSheetAddAllToBag(w12, this.f131981a.v1(), x12, this.f131981a.L1(x12), list);
        }
    }

    public final void f(CachedCatalogItem cachedCatalogItem) {
        UUID x12;
        C17542s.j(cachedCatalogItem, "item");
        if (this.f131981a.t1() != null && (x12 = this.f131981a.x1()) != null) {
            Analytics analytics = this.f131982b;
            String w12 = this.f131981a.w1();
            if (w12 == null) {
                w12 = "";
            }
            analytics.galleryDesignSheetAddToBag$base_release(w12, this.f131981a.v1(), x12, this.f131981a.L1(x12), cachedCatalogItem, cachedCatalogItem.getFurnitureType());
        }
    }

    public final void g(CachedCatalogItem cachedCatalogItem) {
        UUID x12;
        C17542s.j(cachedCatalogItem, "item");
        if (this.f131981a.t1() != null && (x12 = this.f131981a.x1()) != null) {
            Analytics analytics = this.f131982b;
            String w12 = this.f131981a.w1();
            if (w12 == null) {
                w12 = "";
            }
            analytics.galleryDesignSheetAddToFav(w12, this.f131981a.v1(), x12, this.f131981a.L1(x12), cachedCatalogItem, cachedCatalogItem.getFurnitureType());
        }
    }

    public final void h() {
        UUID x12;
        Composition t12 = this.f131981a.t1();
        if (t12 != null && (x12 = this.f131981a.x1()) != null) {
            Analytics analytics = this.f131982b;
            EventType eventType = EventType.GalleryDesignSheetCopyDesign;
            String w12 = this.f131981a.w1();
            if (w12 == null) {
                w12 = "";
            }
            int v12 = this.f131981a.v1();
            int compositionId = t12.getCompositionId();
            UUID compositionUuid = t12.getCompositionUuid();
            String name = t12.getName();
            analytics.galleryCopyDesign(eventType, w12, x12, v12, compositionId, compositionUuid, name == null ? "" : name, this.f131981a.M1().getRegion(), this.f131981a.L1(x12));
        }
    }

    public final void i() {
        UUID x12;
        Composition t12 = this.f131981a.t1();
        if (t12 != null && (x12 = this.f131981a.x1()) != null) {
            Analytics analytics = this.f131982b;
            EventType eventType = EventType.GalleryDesignSheetDeleteDesign;
            String w12 = this.f131981a.w1();
            if (w12 == null) {
                w12 = "";
            }
            int v12 = this.f131981a.v1();
            int compositionId = t12.getCompositionId();
            UUID compositionUuid = t12.getCompositionUuid();
            String name = t12.getName();
            analytics.galleryDeleteDesign(eventType, w12, x12, v12, compositionId, compositionUuid, name == null ? "" : name, this.f131981a.M1().getRegion(), this.f131981a.L1(x12));
        }
    }

    public final void j() {
        UUID x12;
        Composition t12 = this.f131981a.t1();
        if (t12 != null && (x12 = this.f131981a.x1()) != null) {
            Analytics analytics = this.f131982b;
            EventType eventType = EventType.GalleryDesignSheetDesktopLink;
            String w12 = this.f131981a.w1();
            if (w12 == null) {
                w12 = "";
            }
            int v12 = this.f131981a.v1();
            int compositionId = t12.getCompositionId();
            UUID compositionUuid = t12.getCompositionUuid();
            String name = t12.getName();
            analytics.desktopLink(eventType, w12, x12, v12, compositionId, compositionUuid, name == null ? "" : name, this.f131981a.M1().getRegion(), this.f131981a.L1(x12));
        }
    }

    public final void k() {
        UUID x12;
        Composition t12 = this.f131981a.t1();
        if (t12 != null && (x12 = this.f131981a.x1()) != null) {
            Analytics analytics = this.f131982b;
            EventType eventType = EventType.GalleryDesignSheetEditDesign;
            String w12 = this.f131981a.w1();
            if (w12 == null) {
                w12 = "";
            }
            int v12 = this.f131981a.v1();
            int compositionId = t12.getCompositionId();
            UUID compositionUuid = t12.getCompositionUuid();
            String name = t12.getName();
            analytics.galleryEditDesign(eventType, w12, x12, v12, compositionId, compositionUuid, name == null ? "" : name, this.f131981a.M1().getRegion(), this.f131981a.L1(x12));
        }
    }

    public final void l(List<CachedCatalogItem> list, String str) {
        C17542s.j(list, "items");
        C17542s.j(str, "message");
        this.f131982b.addToCartError(list, str);
    }

    public final void m() {
        UUID x12 = this.f131981a.x1();
        if (x12 != null) {
            Analytics analytics = this.f131982b;
            EventType eventType = EventType.GalleryDesignListNewDesign;
            String w12 = this.f131981a.w1();
            if (w12 == null) {
                w12 = "";
            }
            String str = w12;
            int v12 = this.f131981a.v1();
            Scene u12 = this.f131981a.u1();
            analytics.galleryNewDesign(eventType, str, x12, v12, u12 != null ? u12.getUuid() : null, this.f131981a.M1().getRegion(), this.f131981a.L1(x12));
        }
    }

    public final void n() {
        Composition t12 = this.f131981a.t1();
        if (t12 != null) {
            Analytics analytics = this.f131982b;
            EventType eventType = EventType.GalleryDesignListViewDesigns;
            String name = t12.getName();
            if (name == null) {
                name = "";
            }
            UUID sceneUuid = t12.getSceneUuid();
            int sceneId = t12.getSceneId();
            int compositionId = t12.getCompositionId();
            UUID compositionUuid = t12.getCompositionUuid();
            String name2 = t12.getName();
            if (name2 == null) {
                name2 = "";
            }
            List<PlacedFurniture> placedFurnitureSet = t12.getPlacedFurnitureSet();
            analytics.galleryViewDesigns(eventType, name, sceneUuid, sceneId, compositionId, compositionUuid, name2, placedFurnitureSet != null ? placedFurnitureSet.size() : 0, this.f131981a.M1().getRegion(), this.f131981a.L1(t12.getSceneUuid()));
        }
    }

    public final void o() {
        UUID x12;
        Composition t12 = this.f131981a.t1();
        if (t12 != null && (x12 = this.f131981a.x1()) != null) {
            Analytics analytics = this.f131982b;
            EventType eventType = EventType.GalleryDesignSheetRenameDesign;
            String w12 = this.f131981a.w1();
            if (w12 == null) {
                w12 = "";
            }
            int v12 = this.f131981a.v1();
            int compositionId = t12.getCompositionId();
            UUID compositionUuid = t12.getCompositionUuid();
            String name = t12.getName();
            analytics.galleryRenameDesign(eventType, w12, x12, v12, compositionId, compositionUuid, name == null ? "" : name, this.f131981a.M1().getRegion(), this.f131981a.L1(x12));
        }
    }

    public final void p() {
        UUID x12;
        Composition t12 = this.f131981a.t1();
        if (t12 != null && (x12 = this.f131981a.x1()) != null) {
            Analytics analytics = this.f131982b;
            EventType eventType = EventType.GalleryDesignSheetShareDesign;
            String w12 = this.f131981a.w1();
            if (w12 == null) {
                w12 = "";
            }
            int v12 = this.f131981a.v1();
            int compositionId = t12.getCompositionId();
            UUID compositionUuid = t12.getCompositionUuid();
            String name = t12.getName();
            Analytics.shareDesign$default(analytics, eventType, w12, x12, v12, compositionId, name == null ? "" : name, this.f131981a.M1().getRegion(), this.f131981a.L1(x12), compositionUuid, (String) null, 512, (Object) null);
        }
    }

    public final void q() {
        Composition t12 = this.f131981a.t1();
        if (t12 != null) {
            Analytics analytics = this.f131982b;
            String name = t12.getName();
            if (name == null) {
                name = "";
            }
            UUID sceneUuid = t12.getSceneUuid();
            int sceneId = t12.getSceneId();
            int compositionId = t12.getCompositionId();
            UUID compositionUuid = t12.getCompositionUuid();
            String name2 = t12.getName();
            if (name2 == null) {
                name2 = "";
            }
            List<PlacedFurniture> placedFurnitureSet = t12.getPlacedFurnitureSet();
            analytics.showroomsViewDesigns(name, sceneUuid, sceneId, compositionId, compositionUuid, name2, placedFurnitureSet != null ? placedFurnitureSet.size() : 0);
        }
    }

    public final void r(Composition composition) {
        C17542s.j(composition, "composition");
        this.f131982b.savePendingDesign(EventType.GalleryDesignSheetSaveDesign, composition.getSceneUuid(), composition.getSceneId(), composition.getCompositionId(), composition.getCompositionUuid(), this.f131981a.M1().getRegion(), this.f131981a.L1(composition.getSceneUuid()));
    }

    public final void s(FeedbackSmileRatingBar.a aVar, String str, String str2, String str3) {
        C17542s.j(aVar, "smileRating");
        C17542s.j(str, "textFeedback");
        C17542s.j(str2, "captureUuid");
        C17542s.j(str3, "captureType");
        this.f131982b.sendCaptureFeedback(aVar, str, str2, str3);
    }

    public final void t(FeedbackSmileRatingBar.a aVar, String str) {
        C17542s.j(aVar, "rating");
        UUID x12 = this.f131981a.x1();
        Analytics analytics = this.f131982b;
        if (str == null) {
            str = "(no feedback)";
        }
        analytics.sendDesignFeedback(aVar, str, this.f131981a.v1(), x12, x12 != null ? this.f131981a.L1(x12) : null);
    }
}
