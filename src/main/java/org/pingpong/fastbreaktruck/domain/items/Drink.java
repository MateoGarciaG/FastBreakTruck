package org.pingpong.fastbreaktruck.domain.items;

import org.pingpong.fastbreaktruck.domain.packing.Bottle;
import org.pingpong.fastbreaktruck.domain.packing.Packing;

public abstract class Drink implements Item {

    public Drink() {}

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public String toString() {
        return "Drink{}";
    }
}