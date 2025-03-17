package WK;

import YH.C16877v;
import YH.X;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import uI.C18055d;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0015\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010Jw\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0003\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b!\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u001a\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010 R'\u0010\u000e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u00010\f8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"LWK/k;", "", "", "isRegularFile", "isDirectory", "LWK/E;", "symlinkTarget", "", "size", "createdAtMillis", "lastModifiedAtMillis", "lastAccessedAtMillis", "", "LuI/d;", "extras", "<init>", "(ZZLWK/E;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/Map;)V", "a", "(ZZLWK/E;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/Map;)LWK/k;", "", "toString", "()Ljava/lang/String;", "Z", "()Z", "b", "f", "c", "LWK/E;", "e", "()LWK/E;", "d", "Ljava/lang/Long;", "()Ljava/lang/Long;", "getCreatedAtMillis", "g", "getLastAccessedAtMillis", "h", "Ljava/util/Map;", "getExtras", "()Ljava/util/Map;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: WK.k  reason: case insensitive filesystem */
public final class C16776k {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f139682a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f139683b;

    /* renamed from: c  reason: collision with root package name */
    private final C16762E f139684c;

    /* renamed from: d  reason: collision with root package name */
    private final Long f139685d;

    /* renamed from: e  reason: collision with root package name */
    private final Long f139686e;

    /* renamed from: f  reason: collision with root package name */
    private final Long f139687f;

    /* renamed from: g  reason: collision with root package name */
    private final Long f139688g;

    /* renamed from: h  reason: collision with root package name */
    private final Map<C18055d<?>, Object> f139689h;

    public C16776k(boolean z10, boolean z11, C16762E e10, Long l10, Long l11, Long l12, Long l13, Map<C18055d<?>, ? extends Object> map) {
        C17542s.j(map, "extras");
        this.f139682a = z10;
        this.f139683b = z11;
        this.f139684c = e10;
        this.f139685d = l10;
        this.f139686e = l11;
        this.f139687f = l12;
        this.f139688g = l13;
        this.f139689h = X.x(map);
    }

    public static /* synthetic */ C16776k b(C16776k kVar, boolean z10, boolean z11, C16762E e10, Long l10, Long l11, Long l12, Long l13, Map map, int i10, Object obj) {
        C16776k kVar2 = kVar;
        int i11 = i10;
        return kVar.a((i11 & 1) != 0 ? kVar2.f139682a : z10, (i11 & 2) != 0 ? kVar2.f139683b : z11, (i11 & 4) != 0 ? kVar2.f139684c : e10, (i11 & 8) != 0 ? kVar2.f139685d : l10, (i11 & 16) != 0 ? kVar2.f139686e : l11, (i11 & 32) != 0 ? kVar2.f139687f : l12, (i11 & 64) != 0 ? kVar2.f139688g : l13, (i11 & 128) != 0 ? kVar2.f139689h : map);
    }

    public final C16776k a(boolean z10, boolean z11, C16762E e10, Long l10, Long l11, Long l12, Long l13, Map<C18055d<?>, ? extends Object> map) {
        Map<C18055d<?>, ? extends Object> map2 = map;
        C17542s.j(map2, "extras");
        return new C16776k(z10, z11, e10, l10, l11, l12, l13, map2);
    }

    public final Long c() {
        return this.f139687f;
    }

    public final Long d() {
        return this.f139685d;
    }

    public final C16762E e() {
        return this.f139684c;
    }

    public final boolean f() {
        return this.f139683b;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f139682a) {
            arrayList.add("isRegularFile");
        }
        if (this.f139683b) {
            arrayList.add("isDirectory");
        }
        if (this.f139685d != null) {
            arrayList.add("byteCount=" + this.f139685d);
        }
        if (this.f139686e != null) {
            arrayList.add("createdAt=" + this.f139686e);
        }
        if (this.f139687f != null) {
            arrayList.add("lastModifiedAt=" + this.f139687f);
        }
        if (this.f139688g != null) {
            arrayList.add("lastAccessedAt=" + this.f139688g);
        }
        if (!this.f139689h.isEmpty()) {
            arrayList.add("extras=" + this.f139689h);
        }
        return C16877v.G0(arrayList, ", ", "FileMetadata(", ")", 0, (CharSequence) null, (C17642l) null, 56, (Object) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C16776k(boolean r10, boolean r11, WK.C16762E r12, java.lang.Long r13, java.lang.Long r14, java.lang.Long r15, java.lang.Long r16, java.util.Map r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r10
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r2 = r11
        L_0x0010:
            r3 = r0 & 4
            r4 = 0
            if (r3 == 0) goto L_0x0017
            r3 = r4
            goto L_0x0018
        L_0x0017:
            r3 = r12
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r4
            goto L_0x001f
        L_0x001e:
            r5 = r13
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r4
            goto L_0x0026
        L_0x0025:
            r6 = r14
        L_0x0026:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002c
            r7 = r4
            goto L_0x002d
        L_0x002c:
            r7 = r15
        L_0x002d:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r4 = r16
        L_0x0034:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003d
            java.util.Map r0 = YH.X.j()
            goto L_0x003f
        L_0x003d:
            r0 = r17
        L_0x003f:
            r10 = r9
            r11 = r1
            r12 = r2
            r13 = r3
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r4
            r18 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: WK.C16776k.<init>(boolean, boolean, WK.E, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
