package v1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.xmlpull.v1.XmlPullParser;
import u1.j;
import w2.C6210d;
import w2.l;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0018\u00010\u000eR\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J/\u0010\"\u001a\u00020!2\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020!¢\u0006\u0004\b\"\u0010#J%\u0010%\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001e¢\u0006\u0004\b%\u0010&J%\u0010'\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u0004¢\u0006\u0004\b)\u0010*J%\u0010,\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u001e¢\u0006\u0004\b,\u0010&J?\u0010.\u001a\u00020-2\u0006\u0010\u0017\u001a\u00020\u00142\f\u0010\u000f\u001a\b\u0018\u00010\u000eR\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u001a\u001a\u00020\u00042\b\b\u0001\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b.\u0010/J7\u00101\u001a\u0004\u0018\u0001002\u0006\u0010\u0017\u001a\u00020\u00142\f\u0010\u000f\u001a\b\u0018\u00010\u000eR\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b5\u00106J\u001a\u00108\u001a\u00020!2\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010:\u001a\u0004\b;\u0010<R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b%\u0010=\u001a\u0004\b>\u00106\"\u0004\b?\u0010\u000bR\u0014\u0010B\u001a\u00020@8\u0000X\u0004¢\u0006\u0006\n\u0004\b'\u0010A¨\u0006C"}, d2 = {"Lv1/a;", "", "Lorg/xmlpull/v1/XmlPullParser;", "xmlParser", "", "config", "<init>", "(Lorg/xmlpull/v1/XmlPullParser;I)V", "resConfig", "LXH/N;", "l", "(I)V", "Landroid/content/res/Resources;", "res", "Landroid/content/res/Resources$Theme;", "theme", "Landroid/util/AttributeSet;", "set", "", "attrs", "Landroid/content/res/TypedArray;", "k", "(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;", "typedArray", "", "attrName", "resId", "defaultValue", "h", "(Landroid/content/res/TypedArray;Ljava/lang/String;II)I", "", "g", "(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F", "", "d", "(Landroid/content/res/TypedArray;Ljava/lang/String;IZ)Z", "index", "b", "(Landroid/content/res/TypedArray;IF)F", "c", "(Landroid/content/res/TypedArray;II)I", "i", "(Landroid/content/res/TypedArray;I)Ljava/lang/String;", "defValue", "a", "Lw2/d;", "f", "(Landroid/content/res/TypedArray;Landroid/content/res/Resources$Theme;Ljava/lang/String;II)Lw2/d;", "Landroid/content/res/ColorStateList;", "e", "(Landroid/content/res/TypedArray;Landroid/content/res/Resources$Theme;Ljava/lang/String;I)Landroid/content/res/ColorStateList;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lorg/xmlpull/v1/XmlPullParser;", "j", "()Lorg/xmlpull/v1/XmlPullParser;", "I", "getConfig", "setConfig", "Lu1/j;", "Lu1/j;", "pathParser", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v1.a  reason: case insensitive filesystem */
public final class C6153a {

    /* renamed from: a  reason: collision with root package name */
    private final XmlPullParser f30961a;

    /* renamed from: b  reason: collision with root package name */
    private int f30962b;

    /* renamed from: c  reason: collision with root package name */
    public final j f30963c;

    public C6153a(XmlPullParser xmlPullParser, int i10) {
        this.f30961a = xmlPullParser;
        this.f30962b = i10;
        this.f30963c = new j();
    }

    private final void l(int i10) {
        this.f30962b = i10 | this.f30962b;
    }

    public final float a(TypedArray typedArray, int i10, float f10) {
        float dimension = typedArray.getDimension(i10, f10);
        l(typedArray.getChangingConfigurations());
        return dimension;
    }

    public final float b(TypedArray typedArray, int i10, float f10) {
        float f11 = typedArray.getFloat(i10, f10);
        l(typedArray.getChangingConfigurations());
        return f11;
    }

    public final int c(TypedArray typedArray, int i10, int i11) {
        int i12 = typedArray.getInt(i10, i11);
        l(typedArray.getChangingConfigurations());
        return i12;
    }

    public final boolean d(TypedArray typedArray, String str, int i10, boolean z10) {
        boolean e10 = l.e(typedArray, this.f30961a, str, i10, z10);
        l(typedArray.getChangingConfigurations());
        return e10;
    }

    public final ColorStateList e(TypedArray typedArray, Resources.Theme theme, String str, int i10) {
        ColorStateList g10 = l.g(typedArray, this.f30961a, theme, str, i10);
        l(typedArray.getChangingConfigurations());
        return g10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6153a)) {
            return false;
        }
        C6153a aVar = (C6153a) obj;
        return C17542s.e(this.f30961a, aVar.f30961a) && this.f30962b == aVar.f30962b;
    }

    public final C6210d f(TypedArray typedArray, Resources.Theme theme, String str, int i10, int i11) {
        C6210d i12 = l.i(typedArray, this.f30961a, theme, str, i10, i11);
        l(typedArray.getChangingConfigurations());
        return i12;
    }

    public final float g(TypedArray typedArray, String str, int i10, float f10) {
        float j10 = l.j(typedArray, this.f30961a, str, i10, f10);
        l(typedArray.getChangingConfigurations());
        return j10;
    }

    public final int h(TypedArray typedArray, String str, int i10, int i11) {
        int k10 = l.k(typedArray, this.f30961a, str, i10, i11);
        l(typedArray.getChangingConfigurations());
        return k10;
    }

    public int hashCode() {
        return (this.f30961a.hashCode() * 31) + Integer.hashCode(this.f30962b);
    }

    public final String i(TypedArray typedArray, int i10) {
        String string = typedArray.getString(i10);
        l(typedArray.getChangingConfigurations());
        return string;
    }

    public final XmlPullParser j() {
        return this.f30961a;
    }

    public final TypedArray k(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        TypedArray q10 = l.q(resources, theme, attributeSet, iArr);
        l(q10.getChangingConfigurations());
        return q10;
    }

    public String toString() {
        return "AndroidVectorParser(xmlParser=" + this.f30961a + ", config=" + this.f30962b + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6153a(XmlPullParser xmlPullParser, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(xmlPullParser, (i11 & 2) != 0 ? 0 : i10);
    }
}
