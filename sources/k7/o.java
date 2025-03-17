package k7;

import XH.C16824o;
import XH.C16825p;
import YH.C16877v;
import kotlin.Metadata;
import l7.C8533b;
import l7.C8535d;
import l7.C8536e;
import m7.c;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\n\u001a\u00020\u00048BX\u0002¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\r\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001b\u0010\u0012\u001a\u00020\u000e8VX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138FX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016¨\u0006\u001e"}, d2 = {"Lk7/o;", "", "<init>", "()V", "", "a", "LXH/o;", "h", "()[B", "getLengthBytes$annotations", "lengthBytes", "b", "j", "tagBytes", "", "c", "getTotalLength", "()I", "totalLength", "Ll7/b;", "d", "f", "()Ll7/b;", "bytes", "Lm7/c;", "i", "()Lm7/c;", "tag", "g", "encoded", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    private final C16824o f54318a = C16825p.b(new k(this));

    /* renamed from: b  reason: collision with root package name */
    private final C16824o f54319b = C16825p.b(new l(this));

    /* renamed from: c  reason: collision with root package name */
    private final C16824o f54320c = C16825p.b(new m(this));

    /* renamed from: d  reason: collision with root package name */
    private final C16824o f54321d = C16825p.b(new n(this));

    /* access modifiers changed from: private */
    public static final C8535d e(o oVar) {
        return new C8535d(C16877v.q(C8536e.b(oVar.j()), C8536e.b(oVar.h()), oVar.g()));
    }

    private final byte[] h() {
        return (byte[]) this.f54318a.getValue();
    }

    private final byte[] j() {
        return (byte[]) this.f54319b.getValue();
    }

    /* access modifiers changed from: private */
    public static final byte[] k(o oVar) {
        if (oVar.g().a() < 128) {
            return new byte[]{(byte) oVar.g().a()};
        } else if (oVar.g().a() <= 255) {
            return new byte[]{-127, (byte) oVar.g().a()};
        } else if (oVar.g().a() <= 65535) {
            return new byte[]{-126, (byte) (oVar.g().a() >> 8), (byte) oVar.g().a()};
        } else if (oVar.g().a() <= 16777215) {
            return new byte[]{-125, (byte) (oVar.g().a() >> 16), (byte) (oVar.g().a() >> 8), (byte) oVar.g().a()};
        } else {
            throw new IllegalArgumentException("Length too long");
        }
    }

    /* access modifiers changed from: private */
    public static final byte[] l(o oVar) {
        return oVar.i().b();
    }

    /* access modifiers changed from: private */
    public static final int m(o oVar) {
        return oVar.g().a() + oVar.h().length + oVar.j().length;
    }

    public final C8533b f() {
        return (C8533b) this.f54321d.getValue();
    }

    public abstract C8533b g();

    public abstract c i();
}
