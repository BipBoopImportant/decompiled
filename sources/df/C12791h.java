package DF;

import android.net.Uri;
import com.sugarcube.core.network.models.Showroom;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b%\b\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\u0005\u001a\u00020\u00048\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0015\"\u0004\b$\u0010%R\"\u0010\u0007\u001a\u00020\u00068\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(\"\u0004\b)\u0010*R$\u0010\b\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b+\u0010'\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b\u001b\u00100\"\u0004\b1\u00102R\"\u0010\u000b\u001a\u00020\u00048\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b3\u0010\"\u001a\u0004\b4\u0010\u0015\"\u0004\b5\u0010%R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b!\u0010\u0013\"\u0004\b8\u00109R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b4\u0010:\u001a\u0004\b;\u0010<¨\u0006="}, d2 = {"LDF/h;", "LDF/d;", "Lcom/sugarcube/core/network/models/Showroom;", "showroom", "", "id", "Ljava/util/UUID;", "uuid", "compositionUuid", "Landroid/net/Uri;", "imageUri", "compositionCount", "", "name", "Ljava/util/Locale;", "locale", "<init>", "(Lcom/sugarcube/core/network/models/Showroom;ILjava/util/UUID;Ljava/util/UUID;Landroid/net/Uri;ILjava/lang/String;Ljava/util/Locale;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lcom/sugarcube/core/network/models/Showroom;", "l", "()Lcom/sugarcube/core/network/models/Showroom;", "setShowroom", "(Lcom/sugarcube/core/network/models/Showroom;)V", "d", "I", "b", "setId", "(I)V", "e", "Ljava/util/UUID;", "()Ljava/util/UUID;", "setUuid", "(Ljava/util/UUID;)V", "f", "a", "setCompositionUuid", "g", "Landroid/net/Uri;", "()Landroid/net/Uri;", "setImageUri", "(Landroid/net/Uri;)V", "h", "j", "setCompositionCount", "i", "Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "Ljava/util/Locale;", "k", "()Ljava/util/Locale;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: DF.h  reason: case insensitive filesystem */
public final class C12791h extends C12787d {

    /* renamed from: c  reason: collision with root package name */
    private Showroom f109040c;

    /* renamed from: d  reason: collision with root package name */
    private int f109041d;

    /* renamed from: e  reason: collision with root package name */
    private UUID f109042e;

    /* renamed from: f  reason: collision with root package name */
    private UUID f109043f;

    /* renamed from: g  reason: collision with root package name */
    private Uri f109044g;

    /* renamed from: h  reason: collision with root package name */
    private int f109045h;

    /* renamed from: i  reason: collision with root package name */
    private String f109046i;

    /* renamed from: j  reason: collision with root package name */
    private final Locale f109047j;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12791h(Showroom showroom, int i10, UUID uuid, UUID uuid2, Uri uri, int i11, String str, Locale locale, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(showroom, i10, (i12 & 4) != 0 ? showroom.getSceneUuid() : uuid, (i12 & 8) != 0 ? showroom.getCompositionUuid() : uuid2, (i12 & 16) != 0 ? showroom.getImageUri() : uri, (i12 & 32) != 0 ? showroom.getCompositionCount() : i11, (i12 & 64) != 0 ? showroom.getName() : str, locale);
    }

    public UUID a() {
        return this.f109043f;
    }

    public int b() {
        return this.f109041d;
    }

    public Uri c() {
        return this.f109044g;
    }

    public String d() {
        return this.f109046i;
    }

    public UUID e() {
        return this.f109042e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12791h)) {
            return false;
        }
        C12791h hVar = (C12791h) obj;
        return C17542s.e(this.f109040c, hVar.f109040c) && this.f109041d == hVar.f109041d && C17542s.e(this.f109042e, hVar.f109042e) && C17542s.e(this.f109043f, hVar.f109043f) && C17542s.e(this.f109044g, hVar.f109044g) && this.f109045h == hVar.f109045h && C17542s.e(this.f109046i, hVar.f109046i) && C17542s.e(this.f109047j, hVar.f109047j);
    }

    public int hashCode() {
        int hashCode = ((((this.f109040c.hashCode() * 31) + Integer.hashCode(this.f109041d)) * 31) + this.f109042e.hashCode()) * 31;
        UUID uuid = this.f109043f;
        int i10 = 0;
        int hashCode2 = (hashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
        Uri uri = this.f109044g;
        int hashCode3 = (((hashCode2 + (uri == null ? 0 : uri.hashCode())) * 31) + Integer.hashCode(this.f109045h)) * 31;
        String str = this.f109046i;
        if (str != null) {
            i10 = str.hashCode();
        }
        return ((hashCode3 + i10) * 31) + this.f109047j.hashCode();
    }

    public int j() {
        return this.f109045h;
    }

    public final Locale k() {
        return this.f109047j;
    }

    public final Showroom l() {
        return this.f109040c;
    }

    public String toString() {
        Showroom showroom = this.f109040c;
        int i10 = this.f109041d;
        UUID uuid = this.f109042e;
        UUID uuid2 = this.f109043f;
        Uri uri = this.f109044g;
        int i11 = this.f109045h;
        String str = this.f109046i;
        Locale locale = this.f109047j;
        return "GalleryShowroomModel(showroom=" + showroom + ", id=" + i10 + ", uuid=" + uuid + ", compositionUuid=" + uuid2 + ", imageUri=" + uri + ", compositionCount=" + i11 + ", name=" + str + ", locale=" + locale + ")";
    }

    public C12791h(Showroom showroom, int i10, UUID uuid, UUID uuid2, Uri uri, int i11, String str, Locale locale) {
        C17542s.j(showroom, "showroom");
        C17542s.j(uuid, "uuid");
        C17542s.j(locale, "locale");
        this.f109040c = showroom;
        this.f109041d = i10;
        this.f109042e = uuid;
        this.f109043f = uuid2;
        this.f109044g = uri;
        this.f109045h = i11;
        this.f109046i = str;
        this.f109047j = locale;
    }
}
