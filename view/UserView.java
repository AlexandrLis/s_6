package view;

// ПРИНЦИП РАЗДЕЛЕНИЯ ИНТЕРФЕЙСОВ -> интерфейс UserView выполняет только 
// метод sendOnConsole
public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}