package za;

import K9.C6620s;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.Image;
import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.vision.C7525p1;
import com.google.android.gms.internal.vision.L2;
import com.google.android.gms.internal.vision.p2;
import java.nio.ByteBuffer;
import ya.c;

public final class b extends ya.b<a> {

    /* renamed from: c  reason: collision with root package name */
    private final p2 f58651c;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private Context f58652a;

        /* renamed from: b  reason: collision with root package name */
        private C7525p1 f58653b = new C7525p1();

        public a(@RecentlyNonNull Context context) {
            this.f58652a = context;
        }

        @RecentlyNonNull
        public b a() {
            return new b(new p2(this.f58652a, this.f58653b));
        }

        @RecentlyNonNull
        public a b(int i10) {
            this.f58653b.f49365a = i10;
            return this;
        }
    }

    private b() {
        throw new IllegalStateException("Default constructor called");
    }

    @RecentlyNonNull
    public final SparseArray<a> a(@RecentlyNonNull c cVar) {
        a[] aVarArr;
        if (cVar != null) {
            L2 x10 = L2.x(cVar);
            if (cVar.a() != null) {
                aVarArr = this.f58651c.f((Bitmap) C6620s.l(cVar.a()), x10);
                if (aVarArr == null) {
                    throw new IllegalArgumentException("Internal barcode detector error; check logcat output.");
                }
            } else if (cVar.d() != null) {
                aVarArr = this.f58651c.g((ByteBuffer) C6620s.l(((Image.Plane[]) C6620s.l(cVar.d()))[0].getBuffer()), new L2(((Image.Plane[]) C6620s.l(cVar.d()))[0].getRowStride(), x10.f49217b, x10.f49218c, x10.f49219d, x10.f49220e));
            } else {
                aVarArr = this.f58651c.g((ByteBuffer) C6620s.l(cVar.b()), x10);
            }
            SparseArray<a> sparseArray = new SparseArray<>(aVarArr.length);
            for (a aVar : aVarArr) {
                sparseArray.append(aVar.f58576b.hashCode(), aVar);
            }
            return sparseArray;
        }
        throw new IllegalArgumentException("No frame supplied.");
    }

    public final boolean b() {
        return this.f58651c.c();
    }

    public final void d() {
        super.d();
        this.f58651c.d();
    }

    private b(p2 p2Var) {
        this.f58651c = p2Var;
    }
}
