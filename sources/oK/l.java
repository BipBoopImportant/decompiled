package OK;

import WK.C16772g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\b\u0010\tJ-\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LOK/l;", "", "", "streamId", "", "LOK/c;", "requestHeaders", "", "b", "(ILjava/util/List;)Z", "responseHeaders", "last", "c", "(ILjava/util/List;Z)Z", "LWK/g;", "source", "byteCount", "d", "(ILWK/g;IZ)Z", "LOK/b;", "errorCode", "LXH/N;", "a", "(ILOK/b;)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface l {

    /* renamed from: a  reason: collision with root package name */
    public static final a f137117a = a.f137119a;

    /* renamed from: b  reason: collision with root package name */
    public static final l f137118b = new a.C3365a();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\b"}, d2 = {"LOK/l$a;", "", "<init>", "()V", "LOK/l;", "CANCEL", "LOK/l;", "a", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f137119a = new a();

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LOK/l$a$a;", "LOK/l;", "<init>", "()V", "", "streamId", "", "LOK/c;", "requestHeaders", "", "b", "(ILjava/util/List;)Z", "responseHeaders", "last", "c", "(ILjava/util/List;Z)Z", "LWK/g;", "source", "byteCount", "d", "(ILWK/g;IZ)Z", "LOK/b;", "errorCode", "LXH/N;", "a", "(ILOK/b;)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: OK.l$a$a  reason: collision with other inner class name */
        private static final class C3365a implements l {
            public void a(int i10, C16172b bVar) {
                C17542s.j(bVar, "errorCode");
            }

            public boolean b(int i10, List<C16173c> list) {
                C17542s.j(list, "requestHeaders");
                return true;
            }

            public boolean c(int i10, List<C16173c> list, boolean z10) {
                C17542s.j(list, "responseHeaders");
                return true;
            }

            public boolean d(int i10, C16772g gVar, int i11, boolean z10) {
                C17542s.j(gVar, "source");
                gVar.M((long) i11);
                return true;
            }
        }

        private a() {
        }
    }

    void a(int i10, C16172b bVar);

    boolean b(int i10, List<C16173c> list);

    boolean c(int i10, List<C16173c> list, boolean z10);

    boolean d(int i10, C16772g gVar, int i11, boolean z10);
}
