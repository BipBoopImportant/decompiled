package PG;

import OE.n;
import android.content.Context;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0012"}, d2 = {"LPG/a;", "", "", "formattedZoomLevel", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: PG.a  reason: case insensitive filesystem */
public final class C16183a {

    /* renamed from: b  reason: collision with root package name */
    public static final C3366a f137138b = new C3366a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f137139a;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LPG/a$a;", "", "<init>", "()V", "", "zoomLevel", "Landroid/content/Context;", "context", "LPG/a;", "a", "(FLandroid/content/Context;)LPG/a;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: PG.a$a  reason: collision with other inner class name */
    public static final class C3366a {
        public /* synthetic */ C3366a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C16183a a(float f10, Context context) {
            String str;
            C17542s.j(context, "context");
            if (f10 == 2.0f) {
                str = context.getString(n.f113348d3);
            } else if (f10 == 1.0f) {
                str = context.getString(n.f113355e3);
            } else {
                int i10 = n.f113490x5;
                String format = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f10)}, 1));
                C17542s.i(format, "format(...)");
                str = context.getString(i10, new Object[]{format});
            }
            C17542s.g(str);
            return new C16183a(str);
        }

        private C3366a() {
        }
    }

    public C16183a(String str) {
        C17542s.j(str, "formattedZoomLevel");
        this.f137139a = str;
    }

    public final String a() {
        return this.f137139a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16183a) && C17542s.e(this.f137139a, ((C16183a) obj).f137139a);
    }

    public int hashCode() {
        return this.f137139a.hashCode();
    }

    public String toString() {
        String str = this.f137139a;
        return "ZoomDisplayModel(formattedZoomLevel=" + str + ")";
    }
}
