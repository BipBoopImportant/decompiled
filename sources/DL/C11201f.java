package dl;

import android.content.DialogInterface;
import dl.C11202g;

/* renamed from: dl.f  reason: case insensitive filesystem */
public final /* synthetic */ class C11201f implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String[] f96904a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C11202g.a f96905b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C11202g f96906c;

    public /* synthetic */ C11201f(String[] strArr, C11202g.a aVar, C11202g gVar) {
        this.f96904a = strArr;
        this.f96905b = aVar;
        this.f96906c = gVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        C11202g.a.r(this.f96904a, this.f96905b, this.f96906c, dialogInterface, i10);
    }
}
