package D6;

import C6.b;
import C6.m;
import android.graphics.PointF;
import com.airbnb.lottie.o;
import w6.C8927i;
import y6.C8986c;
import y6.n;

public class k implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f34507a;

    /* renamed from: b  reason: collision with root package name */
    private final a f34508b;

    /* renamed from: c  reason: collision with root package name */
    private final b f34509c;

    /* renamed from: d  reason: collision with root package name */
    private final m<PointF, PointF> f34510d;

    /* renamed from: e  reason: collision with root package name */
    private final b f34511e;

    /* renamed from: f  reason: collision with root package name */
    private final b f34512f;

    /* renamed from: g  reason: collision with root package name */
    private final b f34513g;

    /* renamed from: h  reason: collision with root package name */
    private final b f34514h;

    /* renamed from: i  reason: collision with root package name */
    private final b f34515i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f34516j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f34517k;

    public enum a {
        STAR(1),
        POLYGON(2);
        
        private final int value;

        private a(int i10) {
            this.value = i10;
        }

        public static a b(int i10) {
            for (a aVar : values()) {
                if (aVar.value == i10) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public k(String str, a aVar, b bVar, m<PointF, PointF> mVar, b bVar2, b bVar3, b bVar4, b bVar5, b bVar6, boolean z10, boolean z11) {
        this.f34507a = str;
        this.f34508b = aVar;
        this.f34509c = bVar;
        this.f34510d = mVar;
        this.f34511e = bVar2;
        this.f34512f = bVar3;
        this.f34513g = bVar4;
        this.f34514h = bVar5;
        this.f34515i = bVar6;
        this.f34516j = z10;
        this.f34517k = z11;
    }

    public C8986c a(o oVar, C8927i iVar, E6.b bVar) {
        return new n(oVar, bVar, this);
    }

    public b b() {
        return this.f34512f;
    }

    public b c() {
        return this.f34514h;
    }

    public String d() {
        return this.f34507a;
    }

    public b e() {
        return this.f34513g;
    }

    public b f() {
        return this.f34515i;
    }

    public b g() {
        return this.f34509c;
    }

    public m<PointF, PointF> h() {
        return this.f34510d;
    }

    public b i() {
        return this.f34511e;
    }

    public a j() {
        return this.f34508b;
    }

    public boolean k() {
        return this.f34516j;
    }

    public boolean l() {
        return this.f34517k;
    }
}
