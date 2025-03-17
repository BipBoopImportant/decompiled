package l5;

import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.Set;
import s5.C8739u;

public final /* synthetic */ class S implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WorkDatabase f54649a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C8739u f54650b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C8739u f54651c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ List f54652d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f54653e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Set f54654f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ boolean f54655g;

    public /* synthetic */ S(WorkDatabase workDatabase, C8739u uVar, C8739u uVar2, List list, String str, Set set, boolean z10) {
        this.f54649a = workDatabase;
        this.f54650b = uVar;
        this.f54651c = uVar2;
        this.f54652d = list;
        this.f54653e = str;
        this.f54654f = set;
        this.f54655g = z10;
    }

    public final void run() {
        T.e(this.f54649a, this.f54650b, this.f54651c, this.f54652d, this.f54653e, this.f54654f, this.f54655g);
    }
}
