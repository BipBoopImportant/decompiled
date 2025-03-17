package me.saket.telephoto.zoomable;

import XH.C16807N;
import dI.C17164e;
import kotlin.Metadata;
import pK.C17769n;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bç\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0001\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lme/saket/telephoto/zoomable/c;", "", "LpK/n;", "state", "Lo1/g;", "centroid", "LXH/N;", "a", "(LpK/n;JLdI/e;)Ljava/lang/Object;", "zoomable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f144590a = a.f144591a;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lme/saket/telephoto/zoomable/c$a;", "", "<init>", "()V", "", "maxZoomFactor", "Lme/saket/telephoto/zoomable/c;", "a", "(Ljava/lang/Float;)Lme/saket/telephoto/zoomable/c;", "zoomable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f144591a = new a();

        private a() {
        }

        public static /* synthetic */ c b(a aVar, Float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = null;
            }
            return aVar.a(f10);
        }

        public final c a(Float f10) {
            return new b(f10);
        }
    }

    Object a(C17769n nVar, long j10, C17164e<? super C16807N> eVar);
}
