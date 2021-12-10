package lab;

public class Beef extends Food {

    public boolean equals(Object arg0)  // переопределние метода сравнения
    {
        if (super.equals(arg0))
        {
            if (!(arg0 instanceof Beef)) return false;
            return preparedness.equals(((Beef)arg0).preparedness);
        } else
            return false;
    }

    private String preparedness;
    public String getFilling() {
        return preparedness;
    }

    public void setFilling(String preparedness) {
        this.preparedness = preparedness;
    }

    public Beef(String preparedness) {
        super ("Мясо");
        this.preparedness = preparedness;
    }

    public void consume() {
        System.out.println(this + " съедено");
    }

    @Override
    public String toString() {
        return super.toString() +" " + preparedness;
    }
}

