package NF;

import NF.C13291e;
import android.net.Uri;
import android.widget.ImageView;
import com.squareup.picasso.t;

/* renamed from: NF.d  reason: case insensitive filesystem */
public final /* synthetic */ class C13290d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f112472a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Uri f112473b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ImageView f112474c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f112475d;

    public /* synthetic */ C13290d(t tVar, Uri uri, ImageView imageView, int i10) {
        this.f112472a = tVar;
        this.f112473b = uri;
        this.f112474c = imageView;
        this.f112475d = i10;
    }

    public final void run() {
        C13291e.a.c(this.f112472a, this.f112473b, this.f112474c, this.f112475d);
    }
}
