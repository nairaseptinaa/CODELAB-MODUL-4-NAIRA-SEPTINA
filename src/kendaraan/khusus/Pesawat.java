package kendaraan.khusus;

import kendaraan.Kendaraan;
import kendaraan.util.Flyable;

public class Pesawat extends Kendaraan implements Flyable {
    @Override
    public void shoot() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void Brake() {

    }

    @Override
    public void Start() {
        System.out.println("Mennyalakan pesawat " + this.getName());
    }

    @Override
    public void Stop() {
        System.out.println("Mematikan mesin pesawat " + this.getName());
    }



    @Override
    public void fly() {
        System.out.println("Pesawat " + this.getName() + " lepas landas");
    }
}
