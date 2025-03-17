package N5;

import GK.C15802u;
import O5.h;
import O5.i;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b)\u0018\u00002\u00020\u0001B\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ§\u0001\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b/\u00105\u001a\u0004\b6\u00107R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b+\u00108\u001a\u0004\b-\u00109R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b'\u00108\u001a\u0004\b1\u00109R\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b:\u00108\u001a\u0004\b;\u00109R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b:\u0010>R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b?\u0010AR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b;\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b6\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010\u001a\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b3\u0010I\u001a\u0004\b<\u0010KR\u0017\u0010\u001b\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bD\u0010I\u001a\u0004\bB\u0010K¨\u0006L"}, d2 = {"LN5/m;", "", "Landroid/content/Context;", "context", "Landroid/graphics/Bitmap$Config;", "config", "Landroid/graphics/ColorSpace;", "colorSpace", "LO5/i;", "size", "LO5/h;", "scale", "", "allowInexactSize", "allowRgb565", "premultipliedAlpha", "", "diskCacheKey", "LGK/u;", "headers", "LN5/r;", "tags", "LN5/n;", "parameters", "LN5/b;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "<init>", "(Landroid/content/Context;Landroid/graphics/Bitmap$Config;Landroid/graphics/ColorSpace;LO5/i;LO5/h;ZZZLjava/lang/String;LGK/u;LN5/r;LN5/n;LN5/b;LN5/b;LN5/b;)V", "a", "(Landroid/content/Context;Landroid/graphics/Bitmap$Config;Landroid/graphics/ColorSpace;LO5/i;LO5/h;ZZZLjava/lang/String;LGK/u;LN5/r;LN5/n;LN5/b;LN5/b;LN5/b;)LN5/m;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/content/Context;", "g", "()Landroid/content/Context;", "b", "Landroid/graphics/Bitmap$Config;", "f", "()Landroid/graphics/Bitmap$Config;", "c", "Landroid/graphics/ColorSpace;", "e", "()Landroid/graphics/ColorSpace;", "d", "LO5/i;", "n", "()LO5/i;", "LO5/h;", "m", "()LO5/h;", "Z", "()Z", "h", "l", "i", "Ljava/lang/String;", "()Ljava/lang/String;", "j", "LGK/u;", "()LGK/u;", "k", "LN5/r;", "o", "()LN5/r;", "LN5/n;", "getParameters", "()LN5/n;", "LN5/b;", "getMemoryCachePolicy", "()LN5/b;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final Context f39075a;

    /* renamed from: b  reason: collision with root package name */
    private final Bitmap.Config f39076b;

    /* renamed from: c  reason: collision with root package name */
    private final ColorSpace f39077c;

    /* renamed from: d  reason: collision with root package name */
    private final i f39078d;

    /* renamed from: e  reason: collision with root package name */
    private final h f39079e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f39080f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f39081g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f39082h;

    /* renamed from: i  reason: collision with root package name */
    private final String f39083i;

    /* renamed from: j  reason: collision with root package name */
    private final C15802u f39084j;

    /* renamed from: k  reason: collision with root package name */
    private final r f39085k;

    /* renamed from: l  reason: collision with root package name */
    private final n f39086l;

    /* renamed from: m  reason: collision with root package name */
    private final b f39087m;

    /* renamed from: n  reason: collision with root package name */
    private final b f39088n;

    /* renamed from: o  reason: collision with root package name */
    private final b f39089o;

    public m(Context context, Bitmap.Config config, ColorSpace colorSpace, i iVar, h hVar, boolean z10, boolean z11, boolean z12, String str, C15802u uVar, r rVar, n nVar, b bVar, b bVar2, b bVar3) {
        this.f39075a = context;
        this.f39076b = config;
        this.f39077c = colorSpace;
        this.f39078d = iVar;
        this.f39079e = hVar;
        this.f39080f = z10;
        this.f39081g = z11;
        this.f39082h = z12;
        this.f39083i = str;
        this.f39084j = uVar;
        this.f39085k = rVar;
        this.f39086l = nVar;
        this.f39087m = bVar;
        this.f39088n = bVar2;
        this.f39089o = bVar3;
    }

    public static /* synthetic */ m b(m mVar, Context context, Bitmap.Config config, ColorSpace colorSpace, i iVar, h hVar, boolean z10, boolean z11, boolean z12, String str, C15802u uVar, r rVar, n nVar, b bVar, b bVar2, b bVar3, int i10, Object obj) {
        m mVar2 = mVar;
        int i11 = i10;
        return mVar.a((i11 & 1) != 0 ? mVar2.f39075a : context, (i11 & 2) != 0 ? mVar2.f39076b : config, (i11 & 4) != 0 ? mVar2.f39077c : colorSpace, (i11 & 8) != 0 ? mVar2.f39078d : iVar, (i11 & 16) != 0 ? mVar2.f39079e : hVar, (i11 & 32) != 0 ? mVar2.f39080f : z10, (i11 & 64) != 0 ? mVar2.f39081g : z11, (i11 & 128) != 0 ? mVar2.f39082h : z12, (i11 & 256) != 0 ? mVar2.f39083i : str, (i11 & 512) != 0 ? mVar2.f39084j : uVar, (i11 & 1024) != 0 ? mVar2.f39085k : rVar, (i11 & RecyclerView.n.FLAG_MOVED) != 0 ? mVar2.f39086l : nVar, (i11 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? mVar2.f39087m : bVar, (i11 & 8192) != 0 ? mVar2.f39088n : bVar2, (i11 & 16384) != 0 ? mVar2.f39089o : bVar3);
    }

    public final m a(Context context, Bitmap.Config config, ColorSpace colorSpace, i iVar, h hVar, boolean z10, boolean z11, boolean z12, String str, C15802u uVar, r rVar, n nVar, b bVar, b bVar2, b bVar3) {
        return new m(context, config, colorSpace, iVar, hVar, z10, z11, z12, str, uVar, rVar, nVar, bVar, bVar2, bVar3);
    }

    public final boolean c() {
        return this.f39080f;
    }

    public final boolean d() {
        return this.f39081g;
    }

    public final ColorSpace e() {
        return this.f39077c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return C17542s.e(this.f39075a, mVar.f39075a) && this.f39076b == mVar.f39076b && C17542s.e(this.f39077c, mVar.f39077c) && C17542s.e(this.f39078d, mVar.f39078d) && this.f39079e == mVar.f39079e && this.f39080f == mVar.f39080f && this.f39081g == mVar.f39081g && this.f39082h == mVar.f39082h && C17542s.e(this.f39083i, mVar.f39083i) && C17542s.e(this.f39084j, mVar.f39084j) && C17542s.e(this.f39085k, mVar.f39085k) && C17542s.e(this.f39086l, mVar.f39086l) && this.f39087m == mVar.f39087m && this.f39088n == mVar.f39088n && this.f39089o == mVar.f39089o;
        }
    }

    public final Bitmap.Config f() {
        return this.f39076b;
    }

    public final Context g() {
        return this.f39075a;
    }

    public final String h() {
        return this.f39083i;
    }

    public int hashCode() {
        int hashCode = ((this.f39075a.hashCode() * 31) + this.f39076b.hashCode()) * 31;
        ColorSpace colorSpace = this.f39077c;
        int i10 = 0;
        int hashCode2 = (((((((((((hashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31) + this.f39078d.hashCode()) * 31) + this.f39079e.hashCode()) * 31) + Boolean.hashCode(this.f39080f)) * 31) + Boolean.hashCode(this.f39081g)) * 31) + Boolean.hashCode(this.f39082h)) * 31;
        String str = this.f39083i;
        if (str != null) {
            i10 = str.hashCode();
        }
        return ((((((((((((hashCode2 + i10) * 31) + this.f39084j.hashCode()) * 31) + this.f39085k.hashCode()) * 31) + this.f39086l.hashCode()) * 31) + this.f39087m.hashCode()) * 31) + this.f39088n.hashCode()) * 31) + this.f39089o.hashCode();
    }

    public final b i() {
        return this.f39088n;
    }

    public final C15802u j() {
        return this.f39084j;
    }

    public final b k() {
        return this.f39089o;
    }

    public final boolean l() {
        return this.f39082h;
    }

    public final h m() {
        return this.f39079e;
    }

    public final i n() {
        return this.f39078d;
    }

    public final r o() {
        return this.f39085k;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ m(android.content.Context r15, android.graphics.Bitmap.Config r16, android.graphics.ColorSpace r17, O5.i r18, O5.h r19, boolean r20, boolean r21, boolean r22, java.lang.String r23, GK.C15802u r24, N5.r r25, N5.n r26, N5.b r27, N5.b r28, N5.b r29, int r30, kotlin.jvm.internal.DefaultConstructorMarker r31) {
        /*
            r14 = this;
            r0 = r30
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0009
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            goto L_0x000b
        L_0x0009:
            r1 = r16
        L_0x000b:
            r2 = r0 & 4
            if (r2 == 0) goto L_0x0014
            android.graphics.ColorSpace r2 = S5.j.l()
            goto L_0x0016
        L_0x0014:
            r2 = r17
        L_0x0016:
            r3 = r0 & 8
            if (r3 == 0) goto L_0x001d
            O5.i r3 = O5.i.f39254d
            goto L_0x001f
        L_0x001d:
            r3 = r18
        L_0x001f:
            r4 = r0 & 16
            if (r4 == 0) goto L_0x0026
            O5.h r4 = O5.h.FIT
            goto L_0x0028
        L_0x0026:
            r4 = r19
        L_0x0028:
            r5 = r0 & 32
            r6 = 0
            if (r5 == 0) goto L_0x002f
            r5 = r6
            goto L_0x0031
        L_0x002f:
            r5 = r20
        L_0x0031:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r6 = r21
        L_0x0038:
            r7 = r0 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x003e
            r7 = 1
            goto L_0x0040
        L_0x003e:
            r7 = r22
        L_0x0040:
            r8 = r0 & 256(0x100, float:3.59E-43)
            if (r8 == 0) goto L_0x0046
            r8 = 0
            goto L_0x0048
        L_0x0046:
            r8 = r23
        L_0x0048:
            r9 = r0 & 512(0x200, float:7.175E-43)
            if (r9 == 0) goto L_0x0051
            GK.u r9 = S5.j.g()
            goto L_0x0053
        L_0x0051:
            r9 = r24
        L_0x0053:
            r10 = r0 & 1024(0x400, float:1.435E-42)
            if (r10 == 0) goto L_0x005a
            N5.r r10 = N5.r.f39107c
            goto L_0x005c
        L_0x005a:
            r10 = r25
        L_0x005c:
            r11 = r0 & 2048(0x800, float:2.87E-42)
            if (r11 == 0) goto L_0x0063
            N5.n r11 = N5.n.f39091c
            goto L_0x0065
        L_0x0063:
            r11 = r26
        L_0x0065:
            r12 = r0 & 4096(0x1000, float:5.74E-42)
            if (r12 == 0) goto L_0x006c
            N5.b r12 = N5.b.ENABLED
            goto L_0x006e
        L_0x006c:
            r12 = r27
        L_0x006e:
            r13 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r13 == 0) goto L_0x0075
            N5.b r13 = N5.b.ENABLED
            goto L_0x0077
        L_0x0075:
            r13 = r28
        L_0x0077:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x007e
            N5.b r0 = N5.b.ENABLED
            goto L_0x0080
        L_0x007e:
            r0 = r29
        L_0x0080:
            r16 = r14
            r17 = r15
            r18 = r1
            r19 = r2
            r20 = r3
            r21 = r4
            r22 = r5
            r23 = r6
            r24 = r7
            r25 = r8
            r26 = r9
            r27 = r10
            r28 = r11
            r29 = r12
            r30 = r13
            r31 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: N5.m.<init>(android.content.Context, android.graphics.Bitmap$Config, android.graphics.ColorSpace, O5.i, O5.h, boolean, boolean, boolean, java.lang.String, GK.u, N5.r, N5.n, N5.b, N5.b, N5.b, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
