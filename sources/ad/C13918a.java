package aD;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import v3.c;
import x3.p;
import x3.r;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LaD/a;", "", "a", "video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: aD.a  reason: case insensitive filesystem */
public interface C13918a {

    /* renamed from: a  reason: collision with root package name */
    public static final C2958a f118735a = C2958a.f118736a;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LaD/a$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lx3/r;", "a", "(Landroid/content/Context;)Lx3/r;", "video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: aD.a$a  reason: collision with other inner class name */
    public static final class C2958a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ C2958a f118736a = new C2958a();

        private C2958a() {
        }

        public final r a(Context context) {
            C17542s.j(context, "context");
            return new r(context.getCacheDir(), new p(104857600), new c(context));
        }
    }
}
