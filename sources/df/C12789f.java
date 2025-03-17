package DF;

import android.net.Uri;
import com.sugarcube.app.base.data.database.Scene;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b%\b\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\u0005\u001a\u00020\u00048\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b#\u0010\"\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&R\"\u0010\b\u001a\u00020\u00078\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0015\"\u0004\b,\u0010-R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b\u001b\u00100\"\u0004\b1\u00102R\"\u0010\u000b\u001a\u00020\u00078\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b3\u0010*\u001a\u0004\b4\u0010\u0015\"\u0004\b5\u0010-R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b!\u0010\u0013\"\u0004\b8\u00109R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b4\u0010:\u001a\u0004\b;\u0010<¨\u0006="}, d2 = {"LDF/f;", "LDF/d;", "Lcom/sugarcube/app/base/data/database/Scene;", "scene", "Ljava/util/UUID;", "uuid", "compositionUuid", "", "id", "Landroid/net/Uri;", "imageUri", "compositionCount", "", "name", "Ljava/util/Locale;", "locale", "<init>", "(Lcom/sugarcube/app/base/data/database/Scene;Ljava/util/UUID;Ljava/util/UUID;ILandroid/net/Uri;ILjava/lang/String;Ljava/util/Locale;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lcom/sugarcube/app/base/data/database/Scene;", "l", "()Lcom/sugarcube/app/base/data/database/Scene;", "setScene", "(Lcom/sugarcube/app/base/data/database/Scene;)V", "d", "Ljava/util/UUID;", "e", "()Ljava/util/UUID;", "setUuid", "(Ljava/util/UUID;)V", "a", "setCompositionUuid", "f", "I", "b", "setId", "(I)V", "g", "Landroid/net/Uri;", "()Landroid/net/Uri;", "m", "(Landroid/net/Uri;)V", "h", "j", "setCompositionCount", "i", "Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "Ljava/util/Locale;", "k", "()Ljava/util/Locale;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: DF.f  reason: case insensitive filesystem */
public final class C12789f extends C12787d {

    /* renamed from: c  reason: collision with root package name */
    private Scene f109029c;

    /* renamed from: d  reason: collision with root package name */
    private UUID f109030d;

    /* renamed from: e  reason: collision with root package name */
    private UUID f109031e;

    /* renamed from: f  reason: collision with root package name */
    private int f109032f;

    /* renamed from: g  reason: collision with root package name */
    private Uri f109033g;

    /* renamed from: h  reason: collision with root package name */
    private int f109034h;

    /* renamed from: i  reason: collision with root package name */
    private String f109035i;

    /* renamed from: j  reason: collision with root package name */
    private final Locale f109036j;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C12789f(com.sugarcube.app.base.data.database.Scene r11, java.util.UUID r12, java.util.UUID r13, int r14, android.net.Uri r15, int r16, java.lang.String r17, java.util.Locale r18, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
        /*
            r10 = this;
            r0 = r19 & 2
            if (r0 == 0) goto L_0x000a
            java.util.UUID r0 = r11.getSceneUuid()
            r3 = r0
            goto L_0x000b
        L_0x000a:
            r3 = r12
        L_0x000b:
            r0 = r19 & 4
            if (r0 == 0) goto L_0x0012
            r0 = 0
            r4 = r0
            goto L_0x0013
        L_0x0012:
            r4 = r13
        L_0x0013:
            r0 = r19 & 8
            if (r0 == 0) goto L_0x001d
            int r0 = r11.getSceneId()
            r5 = r0
            goto L_0x001e
        L_0x001d:
            r5 = r14
        L_0x001e:
            r0 = r19 & 16
            if (r0 == 0) goto L_0x002a
            r0 = 0
            r2 = r11
            android.net.Uri r0 = r11.getImage(r0)
            r6 = r0
            goto L_0x002c
        L_0x002a:
            r2 = r11
            r6 = r15
        L_0x002c:
            r0 = r19 & 32
            if (r0 == 0) goto L_0x0036
            int r0 = r11.getCompositionCount()
            r7 = r0
            goto L_0x0038
        L_0x0036:
            r7 = r16
        L_0x0038:
            r0 = r19 & 64
            if (r0 == 0) goto L_0x0042
            java.lang.String r0 = r11.getName()
            r8 = r0
            goto L_0x0044
        L_0x0042:
            r8 = r17
        L_0x0044:
            r1 = r10
            r2 = r11
            r9 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: DF.C12789f.<init>(com.sugarcube.app.base.data.database.Scene, java.util.UUID, java.util.UUID, int, android.net.Uri, int, java.lang.String, java.util.Locale, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public UUID a() {
        return this.f109031e;
    }

    public int b() {
        return this.f109032f;
    }

    public Uri c() {
        return this.f109033g;
    }

    public String d() {
        return this.f109035i;
    }

    public UUID e() {
        return this.f109030d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12789f)) {
            return false;
        }
        C12789f fVar = (C12789f) obj;
        return C17542s.e(this.f109029c, fVar.f109029c) && C17542s.e(this.f109030d, fVar.f109030d) && C17542s.e(this.f109031e, fVar.f109031e) && this.f109032f == fVar.f109032f && C17542s.e(this.f109033g, fVar.f109033g) && this.f109034h == fVar.f109034h && C17542s.e(this.f109035i, fVar.f109035i) && C17542s.e(this.f109036j, fVar.f109036j);
    }

    public int hashCode() {
        int hashCode = ((this.f109029c.hashCode() * 31) + this.f109030d.hashCode()) * 31;
        UUID uuid = this.f109031e;
        int i10 = 0;
        int hashCode2 = (((hashCode + (uuid == null ? 0 : uuid.hashCode())) * 31) + Integer.hashCode(this.f109032f)) * 31;
        Uri uri = this.f109033g;
        int hashCode3 = (((hashCode2 + (uri == null ? 0 : uri.hashCode())) * 31) + Integer.hashCode(this.f109034h)) * 31;
        String str = this.f109035i;
        if (str != null) {
            i10 = str.hashCode();
        }
        return ((hashCode3 + i10) * 31) + this.f109036j.hashCode();
    }

    public int j() {
        return this.f109034h;
    }

    public final Locale k() {
        return this.f109036j;
    }

    public final Scene l() {
        return this.f109029c;
    }

    public void m(Uri uri) {
        this.f109033g = uri;
    }

    public String toString() {
        Scene scene = this.f109029c;
        UUID uuid = this.f109030d;
        UUID uuid2 = this.f109031e;
        int i10 = this.f109032f;
        Uri uri = this.f109033g;
        int i11 = this.f109034h;
        String str = this.f109035i;
        Locale locale = this.f109036j;
        return "GallerySceneModel(scene=" + scene + ", uuid=" + uuid + ", compositionUuid=" + uuid2 + ", id=" + i10 + ", imageUri=" + uri + ", compositionCount=" + i11 + ", name=" + str + ", locale=" + locale + ")";
    }

    public C12789f(Scene scene, UUID uuid, UUID uuid2, int i10, Uri uri, int i11, String str, Locale locale) {
        C17542s.j(scene, "scene");
        C17542s.j(uuid, "uuid");
        C17542s.j(locale, "locale");
        this.f109029c = scene;
        this.f109030d = uuid;
        this.f109031e = uuid2;
        this.f109032f = i10;
        this.f109033g = uri;
        this.f109034h = i11;
        this.f109035i = str;
        this.f109036j = locale;
    }
}
