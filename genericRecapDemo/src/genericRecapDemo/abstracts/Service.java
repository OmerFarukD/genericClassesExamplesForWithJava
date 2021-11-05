package genericRecapDemo.abstracts;

public interface Service<T> {
boolean checkIt(T data);
void add(T data);
void update(T data);
void delete(T data);
}
