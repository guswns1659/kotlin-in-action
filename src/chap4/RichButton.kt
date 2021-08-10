package chap4

/**
 * open이 붙어있어야 다른 클래스에서 상속할 수 있다. 기본은 final이다.
 */
open class RichButton : Clickable {
    fun disable() {}
    open fun animate() {}

    /** 오버라이드하는 메서드의 구현을 하위 클래스에서 오버라이드하지 못하게 금지하려면 오버라이드하는 메소드 앞에 final을 명시해야 한다.
     *  즉, 이 클래스를 상속하는 하위클래스에서 오버라이드를 하지 못하게 하려면 final을 붙인다.
     */
    final override fun click() {
        TODO("Not yet implemented")
    }
}
