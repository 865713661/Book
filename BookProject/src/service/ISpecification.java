package service;

public interface ISpecification<T> {
	public boolean isSatisfiedBy(T t);
}
