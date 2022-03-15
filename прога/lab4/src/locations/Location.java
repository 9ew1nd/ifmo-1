package locations;

import humans.Caracter;

public abstract class Location{
    String name;

    public Location(String name){
        this.name = name;
        System.out.printf("Локация %s создана!", name);
        System.out.println();
    }


    // переопределить методы;
    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode(){
        return hashCode() * 10 + 15;
    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof Location)) return false;
        Location p = (Location) obj;
        return this.name.equals(p.name);
    }
}
