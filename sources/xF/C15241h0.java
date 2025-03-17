package xF;

import DF.C12754C;
import android.content.Context;
import com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet;
import com.sugarcube.core.network.models.Composition;
import nI.p;

/* renamed from: xF.h0  reason: case insensitive filesystem */
public final /* synthetic */ class C15241h0 implements p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GalleryOverflowSheet f132000a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C12754C f132001b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Composition f132002c;

    public /* synthetic */ C15241h0(GalleryOverflowSheet galleryOverflowSheet, C12754C c10, Composition composition) {
        this.f132000a = galleryOverflowSheet;
        this.f132001b = c10;
        this.f132002c = composition;
    }

    public final Object invoke(Object obj, Object obj2) {
        return GalleryOverflowSheet.P1(this.f132000a, this.f132001b, this.f132002c, (Context) obj, (String) obj2);
    }
}
