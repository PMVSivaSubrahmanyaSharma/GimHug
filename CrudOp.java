import java.util.ArrayList;
import java.util.List;

public class CrudOp<T> {
    private final List<T> items = new ArrayList<>();

    // Create: Add an item to the list
    public void create(T item) {
        items.add(item);
    }

    // Read: Get all items
    public List<T> readAll() {
        return new ArrayList<>(items);
    }

    // Update: Update an item at a specific index
    public void update(int index, T newItem) {
        if (index >= 0 && index < items.size()) {
            items.set(index, newItem);
        } else {
            throw new IndexOutOfBoundsException("Invalid index");
        }
    }

    // Delete: Remove an item at a specific index
    public void delete(int index) {
        if (index >= 0 && index < items.size()) {
            items.remove(index);
        } else {
            throw new IndexOutOfBoundsException("Invalid index");
        }
    }
}