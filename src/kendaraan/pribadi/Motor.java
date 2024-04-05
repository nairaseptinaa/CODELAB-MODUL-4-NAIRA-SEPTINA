package kendaraan.pribadi;

import kendaraan.Kendaraan;

public class Motor extends Kendaraan {
    @Override
    public void shoot() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void Start() {

    }


    @Override
    public void Stop() {
        System.out.println("Motor " + this.getName() + " dimatikan");
    }

    @Override
    public void Brake() {
        System.out.println("Motor berhenti");
    }
}
