public final class Math{
    /**
     * Don't let anyone instantiate this class.
     * 构造函数私有化，禁止用户实例化
     */
    private Math() {}

    /**
     * 这个类仅仅用于 random 方法的实现
     */
    private static final class RandomNumberGeneratorHolder {
        static final Random randomNumberGenerator = new Random();
    }
    /**
     * Returns a {@code double} value with a positive(正数) sign(符号), greater
     * than or equal to {@code 0.0} and less than {@code 1.0}.
     * Returned values are chosen pseudorandomly with (approximately)
     * uniform distribution from that range.
     *
     * pseudo,假的，虚伪的
     * pseudorandomly,伪随机
     * approximately,大约，大概
     * uniform,均匀的
     *
     * 返回一个介于 0.0000000000000000~1.0000000000000000(
     * 可以等于0.0000000000000000,不可以等于1.0000000000000000)之间的伪随机数
     *
     * <p>When this method is first called, it creates a single new
     * pseudorandom-number generator, exactly as if by the expression
     *
     * <blockquote>{@code new java.util.Random()}</blockquote>
     *
     * blockquote,引用
     *
     * This new pseudorandom-number generator is used thereafter for
     * all calls to this method and is used nowhere else.
     *
     * thereafter,从那时以后
     * nowhere,任何地方
     *
     * <p>This method is properly synchronized(同步的) to allow correct use by
     * more than one thread. However, if many threads need to generate
     * pseudorandom numbers at a great rate, it may reduce contention(竞争)
     * for each thread to have its own pseudorandom-number generator.
     *
     * 这段话不理解。。。
     *
     * @return  a pseudorandom {@code double} greater than or equal
     * to {@code 0.0} and less than {@code 1.0}.
     * @see Random#nextDouble()
     */
    public static double random() {
        return RandomNumberGeneratorHolder.randomNumberGenerator.nextDouble();
    }
}