package v1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import c2.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p1.C5712d0;
import p1.C5728l0;
import p1.C5730m0;
import p1.C5747v0;
import p1.C5751x0;
import p1.W0;
import p1.j1;
import p1.k1;
import p1.l1;
import u1.C6006d;
import u1.j;
import u1.q;
import w2.C6210d;
import w2.l;

@Metadata(d1 = {"\u0000T\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a$\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aC\u0010\u0016\u001a\u00020\u0000*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0018\u001a\u00020\b*\u00020\bH\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a1\u0010\u001a\u001a\u00020\u0013*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a9\u0010\u001d\u001a\u00020\u001c*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0019\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010#\u001a9\u0010$\u001a\u00020\u001c*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b$\u0010\u001e\u001a9\u0010%\u001a\u00020\u001c*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b%\u0010\u001e\"\u0014\u0010'\u001a\u00020\u00008\u0002XD¢\u0006\u0006\n\u0004\b\u001a\u0010&\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"", "id", "Lp1/k1;", "defValue", "b", "(II)I", "Lp1/l1;", "c", "Lorg/xmlpull/v1/XmlPullParser;", "", "d", "(Lorg/xmlpull/v1/XmlPullParser;)Z", "Lv1/a;", "Landroid/content/res/Resources;", "res", "Landroid/util/AttributeSet;", "attrs", "Landroid/content/res/Resources$Theme;", "theme", "Lu1/d$a;", "builder", "nestedGroups", "g", "(Lv1/a;Landroid/content/res/Resources;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;Lu1/d$a;I)I", "j", "(Lorg/xmlpull/v1/XmlPullParser;)Lorg/xmlpull/v1/XmlPullParser;", "a", "(Lv1/a;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;)Lu1/d$a;", "LXH/N;", "i", "(Lv1/a;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;Lu1/d$a;)V", "Lw2/d;", "complexColor", "Lp1/l0;", "e", "(Lw2/d;)Lp1/l0;", "f", "h", "I", "FILL_TYPE_WINDING", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: v1.c  reason: case insensitive filesystem */
public final class C6155c {

    /* renamed from: a  reason: collision with root package name */
    private static final int f31002a = 0;

    public static final C6006d.a a(C6153a aVar, Resources resources, Resources.Theme theme, AttributeSet attributeSet) {
        long i10;
        int z10;
        C6153a aVar2 = aVar;
        Resources.Theme theme2 = theme;
        C6154b bVar = C6154b.f30976a;
        TypedArray k10 = aVar2.k(resources, theme2, attributeSet, bVar.F());
        boolean d10 = aVar2.d(k10, "autoMirrored", bVar.a(), false);
        float g10 = aVar2.g(k10, "viewportWidth", bVar.H(), 0.0f);
        float g11 = aVar2.g(k10, "viewportHeight", bVar.G(), 0.0f);
        if (g10 <= 0.0f) {
            throw new XmlPullParserException(k10.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
        } else if (g11 > 0.0f) {
            float a10 = aVar2.a(k10, bVar.I(), 0.0f);
            float a11 = aVar2.a(k10, bVar.n(), 0.0f);
            if (k10.hasValue(bVar.D())) {
                TypedValue typedValue = new TypedValue();
                k10.getValue(bVar.D(), typedValue);
                if (typedValue.type == 2) {
                    i10 = C5747v0.f27350b.i();
                } else {
                    ColorStateList e10 = aVar2.e(k10, theme2, "tint", bVar.D());
                    i10 = e10 != null ? C5751x0.b(e10.getDefaultColor()) : C5747v0.f27350b.i();
                }
            } else {
                i10 = C5747v0.f27350b.i();
            }
            long j10 = i10;
            int c10 = aVar2.c(k10, bVar.E(), -1);
            if (c10 == -1) {
                z10 = C5712d0.f27280a.z();
            } else if (c10 == 3) {
                z10 = C5712d0.f27280a.B();
            } else if (c10 == 5) {
                z10 = C5712d0.f27280a.z();
            } else if (c10 != 9) {
                switch (c10) {
                    case 14:
                        z10 = C5712d0.f27280a.q();
                        break;
                    case 15:
                        z10 = C5712d0.f27280a.v();
                        break;
                    case 16:
                        z10 = C5712d0.f27280a.t();
                        break;
                    default:
                        z10 = C5712d0.f27280a.z();
                        break;
                }
            } else {
                z10 = C5712d0.f27280a.y();
            }
            int i11 = z10;
            float B10 = h.B(a10 / resources.getDisplayMetrics().density);
            float B11 = h.B(a11 / resources.getDisplayMetrics().density);
            k10.recycle();
            return new C6006d.a((String) null, B10, B11, g10, g11, j10, i11, d10, 1, (DefaultConstructorMarker) null);
        } else {
            throw new XmlPullParserException(k10.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
        }
    }

    private static final int b(int i10, int i11) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i11 : k1.f27320b.c() : k1.f27320b.b() : k1.f27320b.a();
    }

    private static final int c(int i10, int i11) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i11 : l1.f27327b.a() : l1.f27327b.c() : l1.f27327b.b();
    }

    public static final boolean d(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() != 1) {
            return xmlPullParser.getDepth() < 1 && xmlPullParser.getEventType() == 3;
        }
        return true;
    }

    private static final C5728l0 e(C6210d dVar) {
        if (!dVar.l()) {
            return null;
        }
        Shader f10 = dVar.f();
        return f10 != null ? C5730m0.a(f10) : new j1(C5751x0.b(dVar.e()), (DefaultConstructorMarker) null);
    }

    public static final void f(C6153a aVar, Resources resources, Resources.Theme theme, AttributeSet attributeSet, C6006d.a aVar2) {
        C6153a aVar3 = aVar;
        C6154b bVar = C6154b.f30976a;
        TypedArray k10 = aVar3.k(resources, theme, attributeSet, bVar.b());
        String i10 = aVar3.i(k10, bVar.c());
        if (i10 == null) {
            i10 = "";
        }
        String str = i10;
        String i11 = aVar3.i(k10, bVar.d());
        List d10 = i11 == null ? q.d() : j.b(aVar3.f30963c, i11, (ArrayList) null, 2, (Object) null);
        k10.recycle();
        C6006d.a.b(aVar2, str, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, d10, 254, (Object) null);
    }

    public static final int g(C6153a aVar, Resources resources, AttributeSet attributeSet, Resources.Theme theme, C6006d.a aVar2, int i10) {
        int eventType = aVar.j().getEventType();
        if (eventType == 2) {
            String name = aVar.j().getName();
            if (name == null) {
                return i10;
            }
            int hashCode = name.hashCode();
            if (hashCode != -1649314686) {
                if (hashCode != 3433509) {
                    if (hashCode != 98629247 || !name.equals("group")) {
                        return i10;
                    }
                    h(aVar, resources, theme, attributeSet, aVar2);
                    return i10;
                } else if (!name.equals("path")) {
                    return i10;
                } else {
                    i(aVar, resources, theme, attributeSet, aVar2);
                    return i10;
                }
            } else if (!name.equals("clip-path")) {
                return i10;
            } else {
                f(aVar, resources, theme, attributeSet, aVar2);
                return i10 + 1;
            }
        } else if (eventType != 3 || !C17542s.e("group", aVar.j().getName())) {
            return i10;
        } else {
            int i11 = i10 + 1;
            for (int i12 = 0; i12 < i11; i12++) {
                aVar2.g();
            }
            return 0;
        }
    }

    public static final void h(C6153a aVar, Resources resources, Resources.Theme theme, AttributeSet attributeSet, C6006d.a aVar2) {
        C6153a aVar3 = aVar;
        C6154b bVar = C6154b.f30976a;
        TypedArray k10 = aVar3.k(resources, theme, attributeSet, bVar.e());
        float g10 = aVar3.g(k10, "rotation", bVar.i(), 0.0f);
        float b10 = aVar3.b(k10, bVar.g(), 0.0f);
        float b11 = aVar3.b(k10, bVar.h(), 0.0f);
        float g11 = aVar3.g(k10, "scaleX", bVar.j(), 1.0f);
        float g12 = aVar3.g(k10, "scaleY", bVar.k(), 1.0f);
        float g13 = aVar3.g(k10, "translateX", bVar.l(), 0.0f);
        float g14 = aVar3.g(k10, "translateY", bVar.m(), 0.0f);
        String i10 = aVar3.i(k10, bVar.f());
        if (i10 == null) {
            i10 = "";
        }
        k10.recycle();
        aVar2.a(i10, g10, b10, b11, g11, g12, g13, g14, q.d());
    }

    public static final void i(C6153a aVar, Resources resources, Resources.Theme theme, AttributeSet attributeSet, C6006d.a aVar2) {
        C6153a aVar3 = aVar;
        C6154b bVar = C6154b.f30976a;
        TypedArray k10 = aVar3.k(resources, theme, attributeSet, bVar.o());
        if (l.p(aVar.j(), "pathData")) {
            String i10 = aVar3.i(k10, bVar.r());
            if (i10 == null) {
                i10 = "";
            }
            String str = i10;
            String i11 = aVar3.i(k10, bVar.s());
            List d10 = i11 == null ? q.d() : j.b(aVar3.f30963c, i11, (ArrayList) null, 2, (Object) null);
            C6210d f10 = aVar.f(k10, theme, "fillColor", bVar.q(), 0);
            float g10 = aVar3.g(k10, "fillAlpha", bVar.p(), 1.0f);
            int b10 = b(aVar3.h(k10, "strokeLineCap", bVar.v(), -1), k1.f27320b.a());
            int c10 = c(aVar3.h(k10, "strokeLineJoin", bVar.w(), -1), l1.f27327b.a());
            float g11 = aVar3.g(k10, "strokeMiterLimit", bVar.x(), 1.0f);
            C6210d f11 = aVar.f(k10, theme, "strokeColor", bVar.u(), 0);
            float g12 = aVar3.g(k10, "strokeAlpha", bVar.t(), 1.0f);
            float g13 = aVar3.g(k10, "strokeWidth", bVar.y(), 1.0f);
            float g14 = aVar3.g(k10, "trimPathEnd", bVar.z(), 1.0f);
            float g15 = aVar3.g(k10, "trimPathOffset", bVar.B(), 0.0f);
            float g16 = aVar3.g(k10, "trimPathStart", bVar.C(), 0.0f);
            int h10 = aVar3.h(k10, "fillType", bVar.A(), f31002a);
            k10.recycle();
            C5728l0 e10 = e(f10);
            C5728l0 e11 = e(f11);
            W0.a aVar4 = W0.f27257b;
            aVar2.c(d10, h10 == 0 ? aVar4.b() : aVar4.a(), str, e10, g10, e11, g12, g13, b10, c10, g11, g16, g14, g15);
            return;
        }
        throw new IllegalArgumentException("No path data available");
    }

    public static final XmlPullParser j(XmlPullParser xmlPullParser) {
        int next = xmlPullParser.next();
        while (next != 2 && next != 1) {
            next = xmlPullParser.next();
        }
        if (next == 2) {
            return xmlPullParser;
        }
        throw new XmlPullParserException("No start tag found");
    }
}
