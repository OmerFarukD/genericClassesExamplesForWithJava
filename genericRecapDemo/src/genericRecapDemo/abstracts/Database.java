package genericRecapDemo.abstracts;

public interface Database<T> {
void add(T data);
void update(T data);
void delete(T data);
}
