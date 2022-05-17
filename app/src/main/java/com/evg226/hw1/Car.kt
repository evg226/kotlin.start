package com.evg226.hw1

data class Car(val id: Int, val model: String, val power: Int) {
    override fun toString(): String {
        return "Id: " + id.toString() + "\nModel: " + model + "\nPower: " + power.toString()+" HPw"
    }
}
