package fl;

import Ma.C9140b;
import android.content.DialogInterface;
import android.widget.NumberPicker;
import nI.C17642l;

/* renamed from: fl.a  reason: case insensitive filesystem */
public final /* synthetic */ class C11271a implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NumberPicker f97427a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f97428b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C9140b f97429c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C17642l f97430d;

    public /* synthetic */ C11271a(NumberPicker numberPicker, int i10, C9140b bVar, C17642l lVar) {
        this.f97427a = numberPicker;
        this.f97428b = i10;
        this.f97429c = bVar;
        this.f97430d = lVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        c.e(this.f97427a, this.f97428b, this.f97429c, this.f97430d, dialogInterface, i10);
    }
}
