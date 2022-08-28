import java.util.Random;
public class MagicBox<T> {
    //private T item;
    public T[] items;
    public int key;
    public boolean result;

    public MagicBox(int key) {
        this.key = key;
        T[] items = (T[]) new Object[key];
        this.items = items;
    }

    public boolean add(T item) {
        int i;
        for (i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                result = true;
                break;
            } else {
                result = false;
            }

        }
        return result;
        //  if (result = false) {
        //   this.item = item;
        // } else {
        //     result = true;
        // }
        // return result;
        }


    public T pick() throws RuntimeException {
        int countNull = 0;
        Random random = new Random();
        int randomInt = random.nextInt(items.length);
        for (T itemBox : items) {
            if (itemBox == null) {
                countNull += 1;
                throw new RuntimeException("Item is empty. You mast add " + countNull);
            }
        }
        return items[randomInt];
    }

    }






