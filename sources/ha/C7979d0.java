package ha;

/* renamed from: ha.d0  reason: case insensitive filesystem */
final class C7979d0 {
    static int a(Object obj) {
        return (int) (((long) Integer.rotateLeft((int) (((long) (obj == null ? 0 : obj.hashCode())) * -862048943), 15)) * 461845907);
    }
}
