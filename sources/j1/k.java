package J1;

import J1.d;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import u1.C6006d;
import v1.C6153a;
import v1.C6155c;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\u000e\b\u0002\u0010\b\u001a\b\u0018\u00010\u0006R\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a7\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\b\u001a\b\u0018\u00010\u0006R\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lu1/d$b;", "", "id", "Lu1/d;", "b", "(Lu1/d$b;ILU0/m;I)Lu1/d;", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "theme", "res", "resId", "c", "(Lu1/d$b;Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;I)Lu1/d;", "Landroid/content/res/XmlResourceParser;", "parser", "changingConfigurations", "LJ1/d$a;", "a", "(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;I)LJ1/d$a;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class k {
    public static final d.a a(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i10) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        C6153a aVar = new C6153a(xmlResourceParser, 0, 2, (DefaultConstructorMarker) null);
        C6006d.a a10 = C6155c.a(aVar, resources, theme, asAttributeSet);
        int i11 = 0;
        while (!C6155c.d(xmlResourceParser)) {
            i11 = C6155c.g(aVar, resources, asAttributeSet, theme, a10, i11);
            xmlResourceParser.next();
        }
        return new d.a(a10.f(), i10);
    }

    public static final C6006d b(C6006d.b bVar, int i10, C4889m mVar, int i11) {
        if (C4895p.J()) {
            C4895p.S(44534090, i11, -1, "androidx.compose.ui.res.vectorResource (VectorResources.android.kt:47)");
        }
        boolean z10 = false;
        Resources a10 = i.a(mVar, 0);
        Resources.Theme theme = ((Context) mVar.Q(AndroidCompositionLocals_androidKt.g())).getTheme();
        Configuration configuration = a10.getConfiguration();
        if ((((i11 & 112) ^ 48) > 32 && mVar.d(i10)) || (i11 & 48) == 32) {
            z10 = true;
        }
        boolean V10 = mVar.V(a10) | z10 | mVar.V(theme) | mVar.V(configuration);
        Object D10 = mVar.D();
        if (V10 || D10 == C4889m.f14007a.a()) {
            D10 = c(bVar, theme, a10, i10);
            mVar.u(D10);
        }
        C6006d dVar = (C6006d) D10;
        if (C4895p.J()) {
            C4895p.R();
        }
        return dVar;
    }

    public static final C6006d c(C6006d.b bVar, Resources.Theme theme, Resources resources, int i10) {
        TypedValue typedValue = new TypedValue();
        resources.getValue(i10, typedValue, true);
        XmlResourceParser xml = resources.getXml(i10);
        C6155c.j(xml);
        C16807N n10 = C16807N.f139792a;
        return a(theme, resources, xml, typedValue.changingConfigurations).b();
    }
}
