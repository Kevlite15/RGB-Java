package edu.albany.hw4.problem1;
import java.util.Collection;

public abstract class Semigroup<T> {
	
	//Constructor
	abstract T operator(T object);
	
	//Expanding Semigroup Class
	@SuppressWarnings("unchecked")
	static <T> T combine(Collection<T> collection) {
		Semigroup<T> object = null;
		
		for (T ele: collection) {
			if (object == null) {
				object = (Semigroup<T>) ele;
			}
			else {
				object = (Semigroup<T>) object.operator(ele);
			}
		}
		
		return (T) object;
	}
}
