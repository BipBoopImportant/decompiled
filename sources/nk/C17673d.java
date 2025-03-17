package nK;

import android.graphics.ColorSpace;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.C5704J;
import p1.K0;
import q1.C5776c;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u000bB+\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u001f\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\nR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000X\u0004¢\u0006\f\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u000f\u0010\u0014\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"LnK/d;", "", "Lp1/K0;", "config", "Lq1/c;", "colorSpace", "Landroid/graphics/ColorSpace;", "androidColorSpace", "<init>", "(ILq1/c;Landroid/graphics/ColorSpace;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(ILq1/c;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "I", "c", "()I", "b", "Lq1/c;", "getColorSpace", "()Lq1/c;", "Landroid/graphics/ColorSpace;", "()Landroid/graphics/ColorSpace;", "d", "sub-sampling-image_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nK.d  reason: case insensitive filesystem */
public final class C17673d {

    /* renamed from: d  reason: collision with root package name */
    public static final a f144890d = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final C17673d f144891e = new C17673d(0, (C5776c) null, 3, (DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f144892a;

    /* renamed from: b  reason: collision with root package name */
    private final C5776c f144893b;

    /* renamed from: c  reason: collision with root package name */
    private final ColorSpace f144894c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LnK/d$a;", "", "<init>", "()V", "LnK/d;", "Default", "LnK/d;", "a", "()LnK/d;", "sub-sampling-image_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nK.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C17673d a() {
            return C17673d.f144891e;
        }

        private a() {
        }
    }

    public /* synthetic */ C17673d(int i10, C5776c cVar, ColorSpace colorSpace, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, cVar, colorSpace);
    }

    public final ColorSpace b() {
        return this.f144894c;
    }

    public final int c() {
        return this.f144892a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17673d)) {
            return false;
        }
        C17673d dVar = (C17673d) obj;
        return K0.i(this.f144892a, dVar.f144892a) && C17542s.e(this.f144893b, dVar.f144893b) && C17542s.e(this.f144894c, dVar.f144894c);
    }

    public int hashCode() {
        int j10 = K0.j(this.f144892a) * 31;
        C5776c cVar = this.f144893b;
        int i10 = 0;
        int hashCode = (j10 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        ColorSpace colorSpace = this.f144894c;
        if (colorSpace != null) {
            i10 = colorSpace.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        String k10 = K0.k(this.f144892a);
        C5776c cVar = this.f144893b;
        ColorSpace colorSpace = this.f144894c;
        return "ImageBitmapOptions(config=" + k10 + ", colorSpace=" + cVar + ", androidColorSpace=" + colorSpace + ")";
    }

    public /* synthetic */ C17673d(int i10, C5776c cVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, cVar);
    }

    private C17673d(int i10, C5776c cVar, ColorSpace colorSpace) {
        this.f144892a = i10;
        this.f144893b = cVar;
        this.f144894c = colorSpace;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17673d(int i10, C5776c cVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? K0.f27217b.b() : i10, (i11 & 2) != 0 ? null : cVar, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private C17673d(int i10, C5776c cVar) {
        this(i10, cVar, cVar != null ? C5704J.a(cVar) : null, (DefaultConstructorMarker) null);
    }
}
