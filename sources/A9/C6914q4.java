package a9;

import XH.C16807N;
import android.graphics.Bitmap;
import android.graphics.Rect;
import com.contentsquare.android.sdk.C7153u;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

/* renamed from: a9.q4  reason: case insensitive filesystem */
public final class C6914q4 extends C17544u implements C17642l<C7153u, C16807N> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f42813c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ G4 f42814d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Bitmap f42815e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6914q4(int i10, G4 g42, Bitmap bitmap) {
        super(1);
        this.f42813c = i10;
        this.f42814d = g42;
        this.f42815e = bitmap;
    }

    public final Object invoke(Object obj) {
        C7153u uVar = (C7153u) obj;
        C17542s.j(uVar, "jsonView");
        int i10 = uVar.f47644f.getInt("y");
        if (i10 > this.f42813c) {
            uVar.f47644f.remove("bmp");
        } else if (uVar.f47644f.getInt("height") + i10 > this.f42813c) {
            int i11 = uVar.f47644f.getInt("x");
            Rect rect = new Rect(i11, i10, uVar.f47644f.getInt("width") + i11, this.f42813c);
            uVar.f47644f.put("height", rect.height());
            uVar.f47644f.put("bmp", G4.a(this.f42814d, rect, this.f42815e));
        }
        return C16807N.f139792a;
    }
}
