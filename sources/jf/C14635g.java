package jF;

import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.o1;
import c2.h;
import com.sugarcube.core.network.models.RoomType;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import rF.C15002a;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b \u0010!R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R+\u0010*\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00048F@BX\u0002¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u001e\"\u0004\b(\u0010)R\u0017\u0010-\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b%\u0010\u0013R\u0017\u0010/\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b'\u0010.\u001a\u0004\b+\u0010\u0011R\u0011\u00102\u001a\u0002008G¢\u0006\u0006\u001a\u0004\b\u0017\u00101R\u0011\u00105\u001a\u0002038F¢\u0006\u0006\u001a\u0004\b\u001b\u00104R\u0011\u00106\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001e¨\u00067"}, d2 = {"LjF/g;", "", "Lcom/sugarcube/core/network/models/RoomType;", "roomType", "", "selected", "Lkotlin/Function1;", "", "titleProvider", "", "thumbnailProvider", "<init>", "(Lcom/sugarcube/core/network/models/RoomType;ZLnI/l;LnI/l;)V", "LXH/N;", "i", "()V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/sugarcube/core/network/models/RoomType;", "c", "()Lcom/sugarcube/core/network/models/RoomType;", "b", "Z", "getSelected", "()Z", "LnI/l;", "getTitleProvider", "()LnI/l;", "d", "getThumbnailProvider", "<set-?>", "e", "LU0/r0;", "g", "h", "(Z)V", "isSelected", "f", "I", "thumbnailResId", "Ljava/lang/String;", "title", "Lp1/v0;", "(LU0/m;I)J", "borderColor", "Lc2/h;", "()F", "borderWidth", "showIcon", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jF.g  reason: case insensitive filesystem */
public final class C14635g {

    /* renamed from: a  reason: collision with root package name */
    private final RoomType f127934a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f127935b;

    /* renamed from: c  reason: collision with root package name */
    private final C17642l<RoomType, String> f127936c;

    /* renamed from: d  reason: collision with root package name */
    private final C17642l<RoomType, Integer> f127937d;

    /* renamed from: e  reason: collision with root package name */
    private final C4899r0 f127938e;

    /* renamed from: f  reason: collision with root package name */
    private final int f127939f;

    /* renamed from: g  reason: collision with root package name */
    private final String f127940g;

    public C14635g(RoomType roomType, boolean z10, C17642l<? super RoomType, String> lVar, C17642l<? super RoomType, Integer> lVar2) {
        C17542s.j(roomType, "roomType");
        C17542s.j(lVar, "titleProvider");
        C17542s.j(lVar2, "thumbnailProvider");
        this.f127934a = roomType;
        this.f127935b = z10;
        this.f127936c = lVar;
        this.f127937d = lVar2;
        this.f127938e = u1.e(Boolean.valueOf(z10), (o1) null, 2, (Object) null);
        this.f127939f = lVar2.invoke(roomType).intValue();
        this.f127940g = lVar.invoke(roomType);
        h(z10);
    }

    private final void h(boolean z10) {
        this.f127938e.setValue(Boolean.valueOf(z10));
    }

    public final long a(C4889m mVar, int i10) {
        long a10;
        mVar.W(2088780334);
        if (C4895p.J()) {
            C4895p.S(2088780334, i10, -1, "com.sugarcube.app.base.ui.compose.capture.chooseroom.RoomTypeCardDisplayModel.<get-borderColor> (RoomTypeCardDisplayModel.kt:43)");
        }
        if (g()) {
            mVar.W(1845140772);
            a10 = C15002a.a(mVar, 0).b();
        } else {
            mVar.W(1845141891);
            a10 = C15002a.a(mVar, 0).a();
        }
        mVar.P();
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return a10;
    }

    public final float b() {
        return h.B((float) (g() ? 2 : 1));
    }

    public final RoomType c() {
        return this.f127934a;
    }

    public final boolean d() {
        return g() && this.f127934a != RoomType.OTHER;
    }

    public final int e() {
        return this.f127939f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14635g)) {
            return false;
        }
        C14635g gVar = (C14635g) obj;
        return this.f127934a == gVar.f127934a && this.f127935b == gVar.f127935b && C17542s.e(this.f127936c, gVar.f127936c) && C17542s.e(this.f127937d, gVar.f127937d);
    }

    public final String f() {
        return this.f127940g;
    }

    public final boolean g() {
        return ((Boolean) this.f127938e.getValue()).booleanValue();
    }

    public int hashCode() {
        return (((((this.f127934a.hashCode() * 31) + Boolean.hashCode(this.f127935b)) * 31) + this.f127936c.hashCode()) * 31) + this.f127937d.hashCode();
    }

    public final void i() {
        h(!g());
    }

    public String toString() {
        RoomType roomType = this.f127934a;
        boolean z10 = this.f127935b;
        C17642l<RoomType, String> lVar = this.f127936c;
        C17642l<RoomType, Integer> lVar2 = this.f127937d;
        return "RoomTypeCardDisplayModel(roomType=" + roomType + ", selected=" + z10 + ", titleProvider=" + lVar + ", thumbnailProvider=" + lVar2 + ")";
    }
}
