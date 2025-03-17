package Jn;

import Fn.a;
import HJ.C15854t;
import XH.t;
import YH.C16877v;
import com.ingka.ikea.app.caasremote.models.ImageRemoteModel;
import com.ingka.ikea.app.caasremote.models.NullableDisplayUnitRemoteModel;
import com.ingka.ikea.app.caasremote.models.NullableItemInfoResponseRemoteModel;
import com.ingka.ikea.app.caasremote.models.d;
import com.ingka.ikea.app.caasremote.models.m;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pp.C11769c;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0000\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001aB)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001e¨\u0006 "}, d2 = {"LJn/l;", "Lpp/c;", "LFn/a$c;", "Lcom/ingka/ikea/app/caasremote/models/NullableItemInfoResponseRemoteModel;", "LJn/s;", "measurementRemoteModelMapper", "LJn/i;", "displayUnitRemoteModelMapper", "LJn/r;", "materialRemoteModelMapper", "LJn/t;", "productTagsRemoteModelMapper", "<init>", "(LJn/s;LJn/i;LJn/r;LJn/t;)V", "Lcom/ingka/ikea/app/caasremote/models/m;", "LFn/a$c$g;", "b", "(Lcom/ingka/ikea/app/caasremote/models/m;)LFn/a$c$g;", "", "description", "category", "c", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "remote", "d", "(Lcom/ingka/ikea/app/caasremote/models/NullableItemInfoResponseRemoteModel;)LFn/a$c;", "a", "LJn/s;", "LJn/i;", "LJn/r;", "LJn/t;", "e", "caas-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l implements C11769c<a.c, NullableItemInfoResponseRemoteModel> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f82645e = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final s f82646a;

    /* renamed from: b  reason: collision with root package name */
    private final i f82647b;

    /* renamed from: c  reason: collision with root package name */
    private final r f82648c;

    /* renamed from: d  reason: collision with root package name */
    private final t f82649d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LJn/l$a;", "", "<init>", "()V", "", "DESCRIPTION_FORMAT", "Ljava/lang/String;", "IMAGE_QUALITY", "caas-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f82650a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.ingka.ikea.app.caasremote.models.m[] r0 = com.ingka.ikea.app.caasremote.models.m.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ingka.ikea.app.caasremote.models.m r1 = com.ingka.ikea.app.caasremote.models.m.METER     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.ingka.ikea.app.caasremote.models.m r1 = com.ingka.ikea.app.caasremote.models.m.PIECE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f82650a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Jn.l.b.<clinit>():void");
        }
    }

    public l(s sVar, i iVar, r rVar, t tVar) {
        C17542s.j(sVar, "measurementRemoteModelMapper");
        C17542s.j(iVar, "displayUnitRemoteModelMapper");
        C17542s.j(rVar, "materialRemoteModelMapper");
        C17542s.j(tVar, "productTagsRemoteModelMapper");
        this.f82646a = sVar;
        this.f82647b = iVar;
        this.f82648c = rVar;
        this.f82649d = tVar;
    }

    private final a.c.g b(m mVar) {
        int i10 = b.f82650a[mVar.ordinal()];
        if (i10 == 1) {
            return a.c.g.METER;
        }
        if (i10 == 2) {
            return a.c.g.PIECE;
        }
        throw new t();
    }

    private final String c(String str, String str2) {
        if (str == null || C15854t.v0(str)) {
            return str2;
        }
        if (C15854t.v0(str2)) {
            return str;
        }
        String format = String.format("%s, %s", Arrays.copyOf(new Object[]{str2, str}, 2));
        C17542s.i(format, "format(...)");
        return format;
    }

    /* renamed from: d */
    public a.c a(NullableItemInfoResponseRemoteModel nullableItemInfoResponseRemoteModel) {
        Object obj;
        d d10;
        C17542s.j(nullableItemInfoResponseRemoteModel, "remote");
        String i10 = nullableItemInfoResponseRemoteModel.i();
        String c10 = c(nullableItemInfoResponseRemoteModel.c(), nullableItemInfoResponseRemoteModel.b());
        String b10 = this.f82646a.a(nullableItemInfoResponseRemoteModel.h());
        NullableDisplayUnitRemoteModel d11 = nullableItemInfoResponseRemoteModel.d();
        a.c.C1554a c11 = d11 != null ? this.f82647b.a(d11) : null;
        NullableDisplayUnitRemoteModel d12 = nullableItemInfoResponseRemoteModel.d();
        String j10 = (d12 == null || (d10 = d12.d()) == null) ? null : d10.j();
        Iterator it = nullableItemInfoResponseRemoteModel.f().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C17542s.e(((ImageRemoteModel) obj).a(), "S3")) {
                break;
            }
        }
        ImageRemoteModel imageRemoteModel = (ImageRemoteModel) obj;
        return new a.c(i10, c10, b10, c11, j10, imageRemoteModel != null ? imageRemoteModel.b() : null, nullableItemInfoResponseRemoteModel.e(), b(nullableItemInfoResponseRemoteModel.k()), C16877v.A(this.f82648c.c(nullableItemInfoResponseRemoteModel.g())), C16877v.t0(this.f82649d.c(nullableItemInfoResponseRemoteModel.j())));
    }
}
