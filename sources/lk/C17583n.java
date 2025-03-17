package lK;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\bJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0011H\u0016¢\u0006\u0004\b*\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R*\u00100\u001a\u00020&2\u0006\u0010)\u001a\u00020&8\u0006@DX\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010-\u001a\u0004\b+\u0010.\"\u0004\b/\u0010(¨\u00061"}, d2 = {"LlK/n;", "", "LlK/v;", "writer", "<init>", "(LlK/v;)V", "LXH/N;", "b", "()V", "q", "c", "d", "p", "", "v", "f", "(C)V", "", "k", "(Ljava/lang/String;)V", "", "h", "(F)V", "", "g", "(D)V", "", "e", "(B)V", "", "l", "(S)V", "", "i", "(I)V", "", "j", "(J)V", "", "m", "(Z)V", "value", "n", "a", "LlK/v;", "Z", "()Z", "o", "writingFirst", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lK.n  reason: case insensitive filesystem */
public class C17583n {

    /* renamed from: a  reason: collision with root package name */
    public final C17590v f144534a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f144535b = true;

    public C17583n(C17590v vVar) {
        C17542s.j(vVar, "writer");
        this.f144534a = vVar;
    }

    public final boolean a() {
        return this.f144535b;
    }

    public void b() {
        this.f144535b = true;
    }

    public void c() {
        this.f144535b = false;
    }

    public void d() {
        this.f144535b = false;
    }

    public void e(byte b10) {
        this.f144534a.c((long) b10);
    }

    public final void f(char c10) {
        this.f144534a.a(c10);
    }

    public void g(double d10) {
        this.f144534a.d(String.valueOf(d10));
    }

    public void h(float f10) {
        this.f144534a.d(String.valueOf(f10));
    }

    public void i(int i10) {
        this.f144534a.c((long) i10);
    }

    public void j(long j10) {
        this.f144534a.c(j10);
    }

    public final void k(String str) {
        C17542s.j(str, "v");
        this.f144534a.d(str);
    }

    public void l(short s10) {
        this.f144534a.c((long) s10);
    }

    public void m(boolean z10) {
        this.f144534a.d(String.valueOf(z10));
    }

    public void n(String str) {
        C17542s.j(str, "value");
        this.f144534a.b(str);
    }

    /* access modifiers changed from: protected */
    public final void o(boolean z10) {
        this.f144535b = z10;
    }

    public void p() {
    }

    public void q() {
    }
}
