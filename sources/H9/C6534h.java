package H9;

import K9.C6620s;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.internal.zza;
import com.google.android.gms.common.api.internal.zzd;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: H9.h  reason: case insensitive filesystem */
public class C6534h {

    /* renamed from: a  reason: collision with root package name */
    protected final C6535i f36579a;

    protected C6534h(C6535i iVar) {
        this.f36579a = iVar;
    }

    protected static C6535i c(C6533g gVar) {
        if (gVar.d()) {
            return zzd.q(gVar.b());
        }
        if (gVar.c()) {
            return zza.a(gVar.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    public static C6535i d(Activity activity) {
        return c(new C6533g(activity));
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity b() {
        Activity b02 = this.f36579a.b0();
        C6620s.l(b02);
        return b02;
    }

    public void e(int i10, int i11, Intent intent) {
    }

    public void f(Bundle bundle) {
    }

    public void g() {
    }

    public void h() {
    }

    public void i(Bundle bundle) {
    }

    public void j() {
    }

    public void k() {
    }
}
