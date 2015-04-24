package net.servicestack.client;

/**
 * @author VISTALL
 * @since 24.04.2015
 */
public interface Predicate<T>
{
	boolean apply(T value);
}
