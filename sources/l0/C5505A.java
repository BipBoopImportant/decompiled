package l0;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\b\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0018\b\u0002\u0010\r\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\u0019\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b#\u0010(R'\u0010\r\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\u0004\u0012\u00020\u00010\f8\u0006¢\u0006\f\n\u0004\b\u001f\u0010)\u001a\u0004\b\u001d\u0010*¨\u0006+"}, d2 = {"Ll0/A;", "", "Ll0/m;", "fade", "Ll0/w;", "slide", "Ll0/g;", "changeSize", "Ll0/t;", "scale", "", "hold", "", "effectsMap", "<init>", "(Ll0/m;Ll0/w;Ll0/g;Ll0/t;ZLjava/util/Map;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ll0/m;", "c", "()Ll0/m;", "b", "Ll0/w;", "f", "()Ll0/w;", "Ll0/g;", "()Ll0/g;", "d", "Ll0/t;", "e", "()Ll0/t;", "Z", "()Z", "Ljava/util/Map;", "()Ljava/util/Map;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: l0.A  reason: case insensitive filesystem */
public final class C5505A {

    /* renamed from: a  reason: collision with root package name */
    private final m f25301a;

    /* renamed from: b  reason: collision with root package name */
    private final w f25302b;

    /* renamed from: c  reason: collision with root package name */
    private final g f25303c;

    /* renamed from: d  reason: collision with root package name */
    private final t f25304d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f25305e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<Object, Object> f25306f;

    public C5505A() {
        this((m) null, (w) null, (g) null, (t) null, false, (Map) null, 63, (DefaultConstructorMarker) null);
    }

    public final g a() {
        return this.f25303c;
    }

    public final Map<Object, Object> b() {
        return this.f25306f;
    }

    public final m c() {
        return this.f25301a;
    }

    public final boolean d() {
        return this.f25305e;
    }

    public final t e() {
        return this.f25304d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5505A)) {
            return false;
        }
        C5505A a10 = (C5505A) obj;
        return C17542s.e(this.f25301a, a10.f25301a) && C17542s.e(this.f25302b, a10.f25302b) && C17542s.e(this.f25303c, a10.f25303c) && C17542s.e(this.f25304d, a10.f25304d) && this.f25305e == a10.f25305e && C17542s.e(this.f25306f, a10.f25306f);
    }

    public final w f() {
        return this.f25302b;
    }

    public int hashCode() {
        m mVar = this.f25301a;
        int i10 = 0;
        int hashCode = (mVar == null ? 0 : mVar.hashCode()) * 31;
        w wVar = this.f25302b;
        int hashCode2 = (hashCode + (wVar == null ? 0 : wVar.hashCode())) * 31;
        g gVar = this.f25303c;
        int hashCode3 = (hashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        t tVar = this.f25304d;
        if (tVar != null) {
            i10 = tVar.hashCode();
        }
        return ((((hashCode3 + i10) * 31) + Boolean.hashCode(this.f25305e)) * 31) + this.f25306f.hashCode();
    }

    public String toString() {
        return "TransitionData(fade=" + this.f25301a + ", slide=" + this.f25302b + ", changeSize=" + this.f25303c + ", scale=" + this.f25304d + ", hold=" + this.f25305e + ", effectsMap=" + this.f25306f + ')';
    }

    public C5505A(m mVar, w wVar, g gVar, t tVar, boolean z10, Map<Object, Object> map) {
        this.f25301a = mVar;
        this.f25302b = wVar;
        this.f25303c = gVar;
        this.f25304d = tVar;
        this.f25305e = z10;
        this.f25306f = map;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C5505A(l0.m r5, l0.w r6, l0.g r7, l0.t r8, boolean r9, java.util.Map r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            r0 = 0
            if (r12 == 0) goto L_0x0007
            r12 = r0
            goto L_0x0008
        L_0x0007:
            r12 = r5
        L_0x0008:
            r5 = r11 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r11 & 4
            if (r5 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r11 & 8
            if (r5 == 0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r0 = r8
        L_0x001c:
            r5 = r11 & 16
            if (r5 == 0) goto L_0x0021
            r9 = 0
        L_0x0021:
            r3 = r9
            r5 = r11 & 32
            if (r5 == 0) goto L_0x002a
            java.util.Map r10 = YH.X.j()
        L_0x002a:
            r11 = r10
            r5 = r4
            r6 = r12
            r7 = r1
            r8 = r2
            r9 = r0
            r10 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.C5505A.<init>(l0.m, l0.w, l0.g, l0.t, boolean, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
