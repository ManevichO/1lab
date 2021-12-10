package lab;

public class Apple extends  Food {

    public String size;

    @Override // явное переопределение метода
    public boolean equals(Object arg0) { // переопределние метода сравнения
        if (super.equals(arg0)) {
            if (!(arg0 instanceof Apple)) return false;
            return size.equals(((Apple)arg0).size);
        } else
            return false;
    }

    public String getSize() {
        return size;
    }

    public Apple(String size) {
        super ("Яблоко");
        this.size = size;
    }

    public void consume() {
        System.out.println(this + " съедено");
    }

    @Override
    public String toString() {
        return super.toString() + " " + size ;
    }
}

