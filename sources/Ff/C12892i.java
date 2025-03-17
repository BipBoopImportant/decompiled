package FF;

import com.sugarcube.core.network.models.RoomType;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\b\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b#\u0010(\u001a\u0004\b!\u0010)R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b\u000e\u0010$¨\u0006+"}, d2 = {"LFF/i;", "", "LFF/g;", "blankRooms", "furnishedRooms", "", "Lcom/sugarcube/core/network/models/RoomType;", "availableRoomTypeFilters", "", "showLogin", "Ljava/util/Locale;", "locale", "", "lastUpdated", "isUpdating", "<init>", "(LFF/g;LFF/g;Ljava/util/List;ZLjava/util/Locale;JZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LFF/g;", "b", "()LFF/g;", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "Z", "f", "()Z", "e", "Ljava/util/Locale;", "()Ljava/util/Locale;", "J", "()J", "g", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: FF.i  reason: case insensitive filesystem */
public final class C12892i {

    /* renamed from: a  reason: collision with root package name */
    private final C12890g f109895a;

    /* renamed from: b  reason: collision with root package name */
    private final C12890g f109896b;

    /* renamed from: c  reason: collision with root package name */
    private final List<RoomType> f109897c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f109898d;

    /* renamed from: e  reason: collision with root package name */
    private final Locale f109899e;

    /* renamed from: f  reason: collision with root package name */
    private final long f109900f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f109901g;

    public C12892i(C12890g gVar, C12890g gVar2, List<? extends RoomType> list, boolean z10, Locale locale, long j10, boolean z11) {
        C17542s.j(list, "availableRoomTypeFilters");
        C17542s.j(locale, "locale");
        this.f109895a = gVar;
        this.f109896b = gVar2;
        this.f109897c = list;
        this.f109898d = z10;
        this.f109899e = locale;
        this.f109900f = j10;
        this.f109901g = z11;
    }

    public final List<RoomType> a() {
        return this.f109897c;
    }

    public final C12890g b() {
        return this.f109895a;
    }

    public final C12890g c() {
        return this.f109896b;
    }

    public final long d() {
        return this.f109900f;
    }

    public final Locale e() {
        return this.f109899e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12892i)) {
            return false;
        }
        C12892i iVar = (C12892i) obj;
        return C17542s.e(this.f109895a, iVar.f109895a) && C17542s.e(this.f109896b, iVar.f109896b) && C17542s.e(this.f109897c, iVar.f109897c) && this.f109898d == iVar.f109898d && C17542s.e(this.f109899e, iVar.f109899e) && this.f109900f == iVar.f109900f && this.f109901g == iVar.f109901g;
    }

    public final boolean f() {
        return this.f109898d;
    }

    public int hashCode() {
        C12890g gVar = this.f109895a;
        int i10 = 0;
        int hashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
        C12890g gVar2 = this.f109896b;
        if (gVar2 != null) {
            i10 = gVar2.hashCode();
        }
        return ((((((((((hashCode + i10) * 31) + this.f109897c.hashCode()) * 31) + Boolean.hashCode(this.f109898d)) * 31) + this.f109899e.hashCode()) * 31) + Long.hashCode(this.f109900f)) * 31) + Boolean.hashCode(this.f109901g);
    }

    public String toString() {
        C12890g gVar = this.f109895a;
        C12890g gVar2 = this.f109896b;
        List<RoomType> list = this.f109897c;
        boolean z10 = this.f109898d;
        Locale locale = this.f109899e;
        long j10 = this.f109900f;
        boolean z11 = this.f109901g;
        return "ShowroomGalleryScreenContent(blankRooms=" + gVar + ", furnishedRooms=" + gVar2 + ", availableRoomTypeFilters=" + list + ", showLogin=" + z10 + ", locale=" + locale + ", lastUpdated=" + j10 + ", isUpdating=" + z11 + ")";
    }
}
