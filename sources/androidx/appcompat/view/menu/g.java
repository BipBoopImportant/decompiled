package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.c;
import androidx.appcompat.view.menu.k;
import com.oppwa.mobile.connect.payment.processor.affirm.AffirmProcessorActivity;
import i.C5427g;

class g implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, k.a {

    /* renamed from: a  reason: collision with root package name */
    private f f15849a;

    /* renamed from: b  reason: collision with root package name */
    private c f15850b;

    /* renamed from: c  reason: collision with root package name */
    d f15851c;

    /* renamed from: d  reason: collision with root package name */
    private k.a f15852d;

    public g(f fVar) {
        this.f15849a = fVar;
    }

    public void a() {
        c cVar = this.f15850b;
        if (cVar != null) {
            cVar.dismiss();
        }
    }

    public void b(IBinder iBinder) {
        f fVar = this.f15849a;
        c.a aVar = new c.a(fVar.w());
        d dVar = new d(aVar.getContext(), C5427g.f24016j);
        this.f15851c = dVar;
        dVar.e(this);
        this.f15849a.b(this.f15851c);
        aVar.a(this.f15851c.a(), this);
        View A10 = fVar.A();
        if (A10 != null) {
            aVar.c(A10);
        } else {
            aVar.d(fVar.y()).setTitle(fVar.z());
        }
        aVar.k(this);
        c create = aVar.create();
        this.f15850b = create;
        create.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f15850b.getWindow().getAttributes();
        attributes.type = AffirmProcessorActivity.RESULT_CODE_ERROR;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f15850b.show();
    }

    public void c(f fVar, boolean z10) {
        if (z10 || fVar == this.f15849a) {
            a();
        }
        k.a aVar = this.f15852d;
        if (aVar != null) {
            aVar.c(fVar, z10);
        }
    }

    public boolean d(f fVar) {
        k.a aVar = this.f15852d;
        if (aVar != null) {
            return aVar.d(fVar);
        }
        return false;
    }

    public void onClick(DialogInterface dialogInterface, int i10) {
        this.f15849a.O((h) this.f15851c.a().getItem(i10), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f15851c.c(this.f15849a, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f15850b.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f15850b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f15849a.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f15849a.performShortcut(i10, keyEvent, 0);
    }
}
