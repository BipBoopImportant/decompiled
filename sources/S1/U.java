package S1;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import c2.C5266a;
import c2.d;
import e2.C5294a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\b\u0010\tJ+\u0010\r\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0011¨\u0006\u0013"}, d2 = {"LS1/U;", "", "<init>", "()V", "LS1/B;", "Landroid/content/Context;", "context", "", "b", "(LS1/B;Landroid/content/Context;)Ljava/lang/String;", "Landroid/graphics/Typeface;", "typeface", "variationSettings", "a", "(Landroid/graphics/Typeface;LS1/B;Landroid/content/Context;)Landroid/graphics/Typeface;", "Ljava/lang/ThreadLocal;", "Landroid/graphics/Paint;", "Ljava/lang/ThreadLocal;", "threadLocalPaint", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class U {

    /* renamed from: a  reason: collision with root package name */
    public static final U f13351a = new U();

    /* renamed from: b  reason: collision with root package name */
    private static ThreadLocal<Paint> f13352b = new ThreadLocal<>();

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LS1/A;", "setting", "", "a", "(LS1/A;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<A, CharSequence> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f13353c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar) {
            super(1);
            this.f13353c = dVar;
        }

        /* renamed from: a */
        public final CharSequence invoke(A a10) {
            return '\'' + a10.c() + "' " + a10.b(this.f13353c);
        }
    }

    private U() {
    }

    private final String b(B b10, Context context) {
        return C5294a.e(b10.a(), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new a(C5266a.a(context)), 31, (Object) null);
    }

    public final Typeface a(Typeface typeface, B b10, Context context) {
        if (typeface == null) {
            return null;
        }
        if (b10.a().isEmpty()) {
            return typeface;
        }
        Paint paint = f13352b.get();
        if (paint == null) {
            paint = new Paint();
            f13352b.set(paint);
        }
        paint.setTypeface(typeface);
        paint.setFontVariationSettings(b(b10, context));
        return paint.getTypeface();
    }
}
