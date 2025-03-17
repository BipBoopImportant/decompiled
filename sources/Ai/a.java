package ai;

import HJ.C15854t;
import XH.t;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import com.ingka.ikea.core.model.product.WarningImageType;
import com.ingka.ikea.core.model.product.WarningMoreInfoUrl;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import u2.C6012a;
import uK.C18146a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\u001aI\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000f\u001a/\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroid/content/Context;", "context", "LEo/a;", "customTabsApi", "Lcom/ingka/ikea/core/model/product/WarningImageType;", "imageType", "", "text", "boldText", "", "showUnderlined", "Lcom/ingka/ikea/core/model/product/WarningMoreInfoUrl;", "urlText", "Landroid/text/SpannableStringBuilder;", "b", "(Landroid/content/Context;LEo/a;Lcom/ingka/ikea/core/model/product/WarningImageType;Ljava/lang/String;Ljava/lang/String;ZLcom/ingka/ikea/core/model/product/WarningMoreInfoUrl;)Landroid/text/SpannableStringBuilder;", "fullText", "", "a", "(Landroid/content/Context;LEo/a;Ljava/lang/String;Lcom/ingka/ikea/core/model/product/WarningMoreInfoUrl;)Ljava/lang/CharSequence;", "productinformationpage-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ai.a$a  reason: collision with other inner class name */
    public /* synthetic */ class C1147a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f65380a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.ingka.ikea.core.model.product.WarningImageType[] r0 = com.ingka.ikea.core.model.product.WarningImageType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ingka.ikea.core.model.product.WarningImageType r1 = com.ingka.ikea.core.model.product.WarningImageType.TRIANGLE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.ingka.ikea.core.model.product.WarningImageType r1 = com.ingka.ikea.core.model.product.WarningImageType.DOT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f65380a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.a.C1147a.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"ai/a$b", "Landroid/text/style/ClickableSpan;", "Landroid/view/View;", "widget", "LXH/N;", "onClick", "(Landroid/view/View;)V", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Eo.a f65381a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f65382b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ WarningMoreInfoUrl f65383c;

        b(Eo.a aVar, Context context, WarningMoreInfoUrl warningMoreInfoUrl) {
            this.f65381a = aVar;
            this.f65382b = context;
            this.f65383c = warningMoreInfoUrl;
        }

        public void onClick(View view) {
            C17542s.j(view, "widget");
            this.f65381a.a(this.f65382b, this.f65383c.getUrl());
        }
    }

    private static final CharSequence a(Context context, Eo.a aVar, String str, WarningMoreInfoUrl warningMoreInfoUrl) {
        SpannableString spannableString = new SpannableString(str);
        b bVar = new b(aVar, context, warningMoreInfoUrl);
        int s02 = C15854t.s0(str, warningMoreInfoUrl.getTextMatch(), 0, false, 6, (Object) null);
        if (s02 != -1) {
            spannableString.setSpan(bVar, s02, warningMoreInfoUrl.getTextMatch().length() + s02, 33);
            return spannableString;
        }
        throw new IllegalArgumentException(("Can't find substring:'" + warningMoreInfoUrl + ".textMatch' in body:'" + str + "'").toString());
    }

    public static final SpannableStringBuilder b(Context context, Eo.a aVar, WarningImageType warningImageType, String str, String str2, boolean z10, WarningMoreInfoUrl warningMoreInfoUrl) {
        int i10;
        C17542s.j(context, "context");
        C17542s.j(aVar, "customTabsApi");
        C17542s.j(warningImageType, "imageType");
        C17542s.j(str, "text");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i11 = C1147a.f65380a[warningImageType.ordinal()];
        if (i11 == 1) {
            i10 = C18146a.f148718xd;
        } else if (i11 == 2) {
            i10 = C18146a.f148220R5;
        } else {
            throw new t();
        }
        Drawable e10 = C6012a.e(context, i10);
        if (e10 != null) {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(Ph.a.f62804a);
            e10.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            SpannableString spannableString = new SpannableString(" ");
            spannableString.setSpan(new ImageSpan(e10, 1), 0, 1, 17);
            spannableStringBuilder.append(spannableString);
            CharSequence charSequence = str;
            if (warningMoreInfoUrl != null) {
                charSequence = a(context, aVar, str, warningMoreInfoUrl);
            }
            if (z10) {
                if (!(str2 == null || str2.length() == 0)) {
                    SpannableStringBuilder append = spannableStringBuilder.append(" ");
                    C17542s.i(append, "append(...)");
                    StyleSpan styleSpan = new StyleSpan(1);
                    int length = append.length();
                    UnderlineSpan underlineSpan = new UnderlineSpan();
                    int length2 = append.length();
                    append.append(str2);
                    append.setSpan(underlineSpan, length2, append.length(), 17);
                    append.setSpan(styleSpan, length, append.length(), 17);
                }
                UnderlineSpan underlineSpan2 = new UnderlineSpan();
                int length3 = spannableStringBuilder.length();
                spannableStringBuilder.append(" ");
                spannableStringBuilder.setSpan(underlineSpan2, length3, spannableStringBuilder.length(), 17);
                UnderlineSpan underlineSpan3 = new UnderlineSpan();
                int length4 = spannableStringBuilder.length();
                spannableStringBuilder.append(charSequence);
                spannableStringBuilder.setSpan(underlineSpan3, length4, spannableStringBuilder.length(), 17);
            } else {
                if (!(str2 == null || str2.length() == 0)) {
                    SpannableStringBuilder append2 = spannableStringBuilder.append(" ");
                    C17542s.i(append2, "append(...)");
                    StyleSpan styleSpan2 = new StyleSpan(1);
                    int length5 = append2.length();
                    append2.append(str2);
                    append2.setSpan(styleSpan2, length5, append2.length(), 17);
                }
                spannableStringBuilder.append(" ").append(charSequence);
            }
        }
        return spannableStringBuilder;
    }
}
