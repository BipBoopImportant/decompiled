package vH;

import BH.C15458c;
import CH.C15489a;
import EH.C15635t;
import JH.C15954a;
import XH.C16807N;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.q;
import yH.C18712b;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a@\u0010\u0007\u001a\u00020\u0000*\u00020\u00002(\u0010\u0006\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\"?\u0010\f\u001a*\u0012&\u0012$\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00010\t8\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"?\u0010\u000e\u001a*\u0012&\u0012$\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00010\t8\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\r\u0010\u000b\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"LBH/c;", "Lkotlin/Function3;", "", "LdI/e;", "LXH/N;", "", "listener", "c", "(LBH/c;LnI/q;)LBH/c;", "LJH/a;", "a", "LJH/a;", "UploadProgressListenerAttributeKey", "b", "DownloadProgressListenerAttributeKey", "ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: vH.b  reason: case insensitive filesystem */
public final class C18163b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final C15954a<q<Long, Long, C17164e<? super C16807N>, Object>> f148853a = new C15954a<>("UploadProgressListenerAttributeKey");
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final C15954a<q<Long, Long, C17164e<? super C16807N>, Object>> f148854b = new C15954a<>("DownloadProgressListenerAttributeKey");

    public static final C15458c c(C15458c cVar, q<? super Long, ? super Long, ? super C17164e<? super C16807N>, ? extends Object> qVar) {
        C17542s.j(cVar, "<this>");
        C17542s.j(qVar, "listener");
        return C18712b.a(cVar.h0(), C15489a.a(cVar.b(), cVar.getCoroutineContext(), C15635t.b(cVar), qVar)).f();
    }
}
