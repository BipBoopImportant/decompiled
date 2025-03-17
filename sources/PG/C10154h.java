package pg;

import HJ.C15854t;
import android.text.SpannableString;
import android.text.style.ClickableSpan;
import android.view.View;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qg.g;
import sg.m;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lpg/h;", "", "<init>", "()V", "Lsg/m;", "urlHandler", "", "fullText", "", "urlLinks", "Lqg/g;", "dialogLink", "", "a", "(Lsg/m;Ljava/lang/String;Ljava/util/Map;Lqg/g;)Ljava/lang/CharSequence;", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pg.h  reason: case insensitive filesystem */
public final class C10154h {

    /* renamed from: a  reason: collision with root package name */
    public static final C10154h f75903a = new C10154h();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"pg/h$a", "Landroid/text/style/ClickableSpan;", "Landroid/view/View;", "widget", "LXH/N;", "onClick", "(Landroid/view/View;)V", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pg.h$a */
    public static final class a extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f75904a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f75905b;

        a(m mVar, String str) {
            this.f75904a = mVar;
            this.f75905b = str;
        }

        public void onClick(View view) {
            C17542s.j(view, "widget");
            this.f75904a.j(this.f75905b);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"pg/h$b", "Landroid/text/style/ClickableSpan;", "Landroid/view/View;", "widget", "LXH/N;", "onClick", "(Landroid/view/View;)V", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pg.h$b */
    public static final class b extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f75906a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f75907b;

        b(m mVar, g gVar) {
            this.f75906a = mVar;
            this.f75907b = gVar;
        }

        public void onClick(View view) {
            C17542s.j(view, "widget");
            this.f75906a.n(this.f75907b.c(), this.f75907b.a());
        }
    }

    private C10154h() {
    }

    public final CharSequence a(m mVar, String str, Map<String, String> map, g gVar) {
        m mVar2 = mVar;
        String str2 = str;
        g gVar2 = gVar;
        C17542s.j(mVar2, "urlHandler");
        C17542s.j(str2, "fullText");
        C17542s.j(map, "urlLinks");
        if (map.isEmpty() && gVar2 == null) {
            return str2;
        }
        SpannableString spannableString = new SpannableString(str2);
        for (Map.Entry next : map.entrySet()) {
            String str3 = (String) next.getKey();
            a aVar = new a(mVar2, (String) next.getValue());
            String str4 = str3;
            int s02 = C15854t.s0(str, str3, 0, false, 6, (Object) null);
            if (s02 != -1) {
                spannableString.setSpan(aVar, s02, str4.length() + s02, 33);
            } else {
                throw new IllegalArgumentException(("Can't find substring:'" + str4 + "' in body:'" + str2 + "'").toString());
            }
        }
        if (gVar2 != null) {
            String b10 = gVar.b();
            b bVar = new b(mVar2, gVar2);
            int s03 = C15854t.s0(str, b10, 0, false, 6, (Object) null);
            if (s03 != -1) {
                spannableString.setSpan(bVar, s03, b10.length() + s03, 33);
            } else {
                throw new IllegalArgumentException(("Can't find substring:'" + b10 + "' in body:'" + str2 + "'").toString());
            }
        }
        return spannableString;
    }
}
