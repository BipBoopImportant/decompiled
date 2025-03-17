package D6;

import C6.b;
import C6.c;
import C6.d;
import C6.f;
import android.graphics.Path;
import com.airbnb.lottie.o;
import w6.C8927i;
import y6.C8986c;
import y6.h;

public class e implements c {

    /* renamed from: a  reason: collision with root package name */
    private final g f34476a;

    /* renamed from: b  reason: collision with root package name */
    private final Path.FillType f34477b;

    /* renamed from: c  reason: collision with root package name */
    private final c f34478c;

    /* renamed from: d  reason: collision with root package name */
    private final d f34479d;

    /* renamed from: e  reason: collision with root package name */
    private final f f34480e;

    /* renamed from: f  reason: collision with root package name */
    private final f f34481f;

    /* renamed from: g  reason: collision with root package name */
    private final String f34482g;

    /* renamed from: h  reason: collision with root package name */
    private final b f34483h;

    /* renamed from: i  reason: collision with root package name */
    private final b f34484i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f34485j;

    public e(String str, g gVar, Path.FillType fillType, c cVar, d dVar, f fVar, f fVar2, b bVar, b bVar2, boolean z10) {
        this.f34476a = gVar;
        this.f34477b = fillType;
        this.f34478c = cVar;
        this.f34479d = dVar;
        this.f34480e = fVar;
        this.f34481f = fVar2;
        this.f34482g = str;
        this.f34483h = bVar;
        this.f34484i = bVar2;
        this.f34485j = z10;
    }

    public C8986c a(o oVar, C8927i iVar, E6.b bVar) {
        return new h(oVar, iVar, bVar, this);
    }

    public f b() {
        return this.f34481f;
    }

    public Path.FillType c() {
        return this.f34477b;
    }

    public c d() {
        return this.f34478c;
    }

    public g e() {
        return this.f34476a;
    }

    public String f() {
        return this.f34482g;
    }

    public d g() {
        return this.f34479d;
    }

    public f h() {
        return this.f34480e;
    }

    public boolean i() {
        return this.f34485j;
    }
}
